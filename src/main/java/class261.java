import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class261 extends class202 {

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "Ljava/lang/String;")
    public String field4146;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(II)I")
    public static final int method1781(int arg0, int arg1) {
        field4145++;
        if (arg1 < 108) {
            method1782(-51, (String) null, (byte) 82);
        }
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILjava/lang/String;B)V")
    public static final void method1782(int arg0, String arg1, byte arg2) {
        if (arg2 == 85) {
            field4144++;
            class259 var3 = class213.method1464((byte) -98, arg0, 3);
            var3.method1766(0);
            var3.field4116 = arg1;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZIIIIII)V")
    public static final void method1783(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4147++;
        if (class73.field1196 == arg2 && class155.field2507 == arg3 && class223.field3694 == arg6 || class257.method1757(arg1 + 24314)) {
            return;
        }
        class155.field2507 = arg3;
        class223.field3694 = arg6;
        class73.field1196 = arg2;
        if (class257.method1757(-5)) {
            class223.field3694 = 0;
        }
        if (arg0) {
            class1.method5(28, -80);
        } else {
            class1.method5(25, arg1 + 24266);
        }
        class148.method1016(-31620, class1.field30, true);
        int var7 = class214.field3501;
        int var8 = class50.field884;
        class50.field884 = (arg2 - 6) * 8;
        class214.field3501 = (arg3 - 6) * 8;
        class185.field2906 = class43.method359(arg1 ^ 0xFFFFA100, class155.field2507 * 8, class73.field1196 * 8);
        class111.field1834 = null;
        int var9 = class214.field3501 - var7;
        int var10 = class214.field3501;
        int var11 = class50.field884 - var8;
        int var12 = class50.field884;
        if (arg0) {
            class141.field2287 = 0;
            for (int var13 = 0; var13 < 32768; var13++) {
                class15 var14 = class137.field2260[var13];
                if (var14 != null) {
                    var14.field3341 -= var9 * 128;
                    var14.field3389 -= var11 * 128;
                    if (var14.field3389 >= 0 && var14.field3389 <= 13184 && var14.field3341 >= 0 && var14.field3341 <= 13184) {
                        for (int var15 = 0; var15 < 10; var15++) {
                            var14.field3340[var15] -= var11;
                            var14.field3321[var15] -= var9;
                        }
                        class221.field3648[class141.field2287++] = var13;
                    } else {
                        class137.field2260[var13].method114((class107) null, (byte) 121);
                        class137.field2260[var13] = null;
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < 32768; var16++) {
                class15 var32 = class137.field2260[var16];
                if (var32 != null) {
                    for (int var33 = 0; var33 < 10; var33++) {
                        var32.field3340[var33] -= var11;
                        var32.field3321[var33] -= var9;
                    }
                    var32.field3389 -= var11 * 128;
                    var32.field3341 -= var9 * 128;
                }
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class33 var30 = class35.field548[var17];
            if (var30 != null) {
                for (int var31 = 0; var31 < 10; var31++) {
                    var30.field3340[var31] -= var11;
                    var30.field3321[var31] -= var9;
                }
                var30.field3341 -= var9 * 128;
                var30.field3389 -= var11 * 128;
            }
        }
        class250.field3980 = arg6;
        byte var18 = 0;
        class167.field2655.method279(arg5, arg4, false, false);
        byte var19 = 104;
        if (arg1 != -24319) {
            method1782(-128, (String) null, (byte) 65);
        }
        byte var20 = 1;
        if (var11 < 0) {
            var19 = -1;
            var18 = 103;
            var20 = -1;
        }
        byte var21 = 0;
        byte var22 = 104;
        byte var23 = 1;
        if (var9 < 0) {
            var23 = -1;
            var21 = 103;
            var22 = -1;
        }
        for (int var24 = var18; var24 != var19; var24 += var20) {
            for (int var26 = var21; var26 != var22; var26 += var23) {
                int var27 = var9 + var26;
                int var28 = var11 + var24;
                for (int var29 = 0; var29 < 4; var29++) {
                    if (var28 >= 0 && var27 >= 0 && var28 < 104 && var27 < 104) {
                        class67.field1104[var29][var24][var26] = class67.field1104[var29][var28][var27];
                    } else {
                        class67.field1104[var29][var24][var26] = null;
                    }
                }
            }
        }
        for (class285 var25 = (class285) class206.field3310.method843(arg1 + 24263); var25 != null; var25 = (class285) class206.field3310.method852((byte) 123)) {
            var25.field4509 -= var9;
            var25.field4501 -= var11;
            if (var25.field4501 < 0 || var25.field4509 < 0 || var25.field4501 >= 104 || var25.field4509 >= 104) {
                var25.method1388(arg1 + 24196);
            }
        }
        class221.field3623 = 0;
        class149.field2399 = -1;
        if (arg0) {
            class97.field1590 -= var9;
            class54.field925 -= var11 * 128;
            class73.field1192 -= var9;
            class99.field1625 -= var9 * 128;
            class19.field327 -= var11;
            class1.field29 -= var11;
        } else {
            class229.field3786 = 1;
        }
        if (class76.field1228 != 0) {
            class235.field3837 -= var9;
            class76.field1228 -= var11;
        }
        class162.field2586.method854(true);
        class240.field3887.method854(true);
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class261() {
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class261(String arg0) {
        this.field4146 = arg0;
    }
}
