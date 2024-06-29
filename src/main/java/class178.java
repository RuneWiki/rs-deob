import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class178 {

    @OriginalMember(owner = "client!k", name = "b", descriptor = "Lji;")
    public static class42 field3242 = null;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "Lcc;")
    private static class209 field3245 = class95.method669(98, "Discard");

    @OriginalMember(owner = "client!k", name = "j", descriptor = "Lcc;")
    public static class209 field3250 = field3245;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "Lcc;")
    public static class209 field3246 = class95.method669(93, "Benutzen");

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IB)V")
    public static final void method1226(int arg0, byte arg1) {
        field3241++;
        if (arg1 != -125) {
            field3245 = null;
        }
        class62.field1230.method662(32768, arg0);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public static final void method1227(int arg0) {
        field3247++;
        if (class132.field2532 || class100.field1945 == 2) {
            return;
        }
        try {
            class5.field62.method1463(class257.field4637, (byte) 110);
            if (arg0 != -24327) {
                field3242 = null;
            }
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V")
    public static void method1228(int arg0) {
        if (arg0 == 28358) {
            field3245 = null;
            field3246 = null;
            field3250 = null;
            field3242 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(III)Lmc;")
    public static final class195 method1229(int arg0, int arg1, int arg2) {
        int var3 = 28 % ((-arg2 - 45) / 49);
        class195 var4 = (class195) class262.field4708.method1755((long) arg0 | (long) arg1 << 32, (byte) -77);
        field3248++;
        if (var4 == null) {
            var4 = new class195(arg1, arg0);
            class262.field4708.method1762(var4, var4.field596, (byte) 73);
        }
        return var4;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method1230(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3243++;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5 - arg1;
        int var11 = arg3;
        int var12 = arg5 * arg5;
        int var13 = arg3 * arg3;
        int var14 = var10 * var10;
        int var15 = arg3 - arg1;
        int var16 = var13 << 1;
        int var17 = var15 * var15;
        int var18 = var12 << 1;
        int var19 = var17 << 1;
        int var20 = var14 << 1;
        int var21 = arg3 << 1;
        int var22 = var15 << 1;
        int var23 = var13 - ((var21 - 1) * var18);
        int var24 = (1 - var22) * var14 + var19;
        int var25 = (1 - var21) * var12 + var16;
        int var26 = var17 - ((var22 - 1) * var20);
        int var27 = var12 << 2;
        int var28 = var13 << 2;
        int var29 = var14 << 2;
        int var30 = var17 << 2;
        int var31 = var16 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = (arg3 - 1) * var27;
        int var36 = var28;
        if (arg0 <= 98) {
            return;
        }
        if (arg7 >= class102.field1957 && arg7 <= class155.field2847) {
            int[] var37 = class252.field4543[arg7];
            int var38 = class257.method1787(class262.field4723, arg6 - arg5, 28, class230.field4184);
            int var39 = class257.method1787(class262.field4723, arg5 + arg6, 28, class230.field4184);
            int var40 = class257.method1787(class262.field4723, arg6 - var10, 28, class230.field4184);
            int var41 = class257.method1787(class262.field4723, arg6 + var10, 28, class230.field4184);
            class176.method1215(var38, arg2, var37, var40, (byte) 121);
            class176.method1215(var40, arg4, var37, var41, (byte) -37);
            class176.method1215(var41, arg2, var37, var39, (byte) -112);
        }
        int var42 = (var15 - 1) * var29;
        int var43 = var30;
        while (var11 > 0) {
            if (var25 < 0) {
                while (var25 < 0) {
                    var25 += var31;
                    var23 += var36;
                    var8++;
                    var31 += var28;
                    var36 += var28;
                }
            }
            if (var23 < 0) {
                var25 += var31;
                var23 += var36;
                var8++;
                var31 += var28;
                var36 += var28;
            }
            var23 += -var32;
            var25 += -var35;
            var35 -= var27;
            var32 -= var27;
            boolean var44 = var11 <= var15;
            if (var44) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var26 += var43;
                        var43 += var30;
                        var9++;
                        var24 += var33;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var24 += var33;
                    var9++;
                    var26 += var43;
                    var43 += var30;
                    var33 += var30;
                }
                var26 += -var34;
                var34 -= var29;
                var24 += -var42;
                var42 -= var29;
            }
            var11--;
            int var45 = arg7 - var11;
            int var46 = arg7 + var11;
            if (class102.field1957 <= var46 && class155.field2847 >= var45) {
                int var47 = class257.method1787(class262.field4723, arg6 + var8, 28, class230.field4184);
                int var48 = class257.method1787(class262.field4723, arg6 - var8, 28, class230.field4184);
                if (var44) {
                    int var49 = class257.method1787(class262.field4723, arg6 + var9, 28, class230.field4184);
                    int var50 = class257.method1787(class262.field4723, arg6 - var9, 28, class230.field4184);
                    if (var45 >= class102.field1957) {
                        int[] var51 = class252.field4543[var45];
                        class176.method1215(var48, arg2, var51, var50, (byte) 119);
                        class176.method1215(var50, arg4, var51, var49, (byte) 118);
                        class176.method1215(var49, arg2, var51, var47, (byte) 112);
                    }
                    if (class155.field2847 >= var46) {
                        int[] var52 = class252.field4543[var46];
                        class176.method1215(var48, arg2, var52, var50, (byte) -24);
                        class176.method1215(var50, arg4, var52, var49, (byte) 120);
                        class176.method1215(var49, arg2, var52, var47, (byte) -113);
                    }
                } else {
                    if (class102.field1957 <= var45) {
                        class176.method1215(var48, arg2, class252.field4543[var45], var47, (byte) -91);
                    }
                    if (var46 <= class155.field2847) {
                        class176.method1215(var48, arg2, class252.field4543[var46], var47, (byte) 16);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(I)Lal;")
    public static final class231 method1231(int arg0) {
        if (arg0 >= -44) {
            method1229(79, 97, -91);
        }
        field3244++;
        int var1 = class185.field3332[0] * class110.field2226[0];
        byte[] var2 = class202.field3638[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class117.field2341[class27.method220(var2[var4], 255)];
        }
        class269 var5 = new class269(class241.field4360, class50.field996, class182.field3289[0], class271.field4815[0], class110.field2226[0], class185.field3332[0], var3);
        class63.method468(119);
        return var5;
    }
}
