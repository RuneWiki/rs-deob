import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public abstract class class229 {

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field3739 = 5063219;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field3737 = 0;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public int field3736;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public int field3740;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public int field3741;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public int field3743;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public int field3745;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
    public int field3746;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BZ)V", line = 21)
    public static final void method1574(byte arg0, boolean arg1) {
        if (arg0 > -118) {
            field3737 = 22;
        }
        for (class172 var2 = (class172) class94.field1334.method1221((byte) 70); var2 != null; var2 = (class172) class94.field1334.method1223(94)) {
            if (var2.field2746 != null) {
                class290.field4916.method1495(var2.field2746);
                var2.field2746 = null;
            }
            if (var2.field2750 != null) {
                class290.field4916.method1495(var2.field2750);
                var2.field2750 = null;
            }
            var2.method1880(-25368);
        }
        field3742++;
        if (!arg1) {
            return;
        }
        for (class172 var3 = (class172) class17.field240.method1221((byte) 88); var3 != null; var3 = (class172) class17.field240.method1223(86)) {
            if (var3.field2746 != null) {
                class290.field4916.method1495(var3.field2746);
                var3.field2746 = null;
            }
            var3.method1880(-25368);
        }
        for (class172 var4 = (class172) class57.field877.method1585(-1506054736); var4 != null; var4 = (class172) class57.field877.method1581((byte) 105)) {
            if (var4.field2746 != null) {
                class290.field4916.method1495(var4.field2746);
                var4.field2746 = null;
            }
            var4.method1880(-25368);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIZI)V", line = 88)
    public static final void method1575(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field3738++;
        if (class121.field1713 == arg6 && class110.field1555 == arg4 && class267.field4501 == arg0 || class296.method2044(68)) {
            return;
        }
        class110.field1555 = arg4;
        class121.field1713 = arg6;
        class267.field4501 = arg0;
        if (class296.method2044(arg3 - 24102)) {
            class267.field4501 = 0;
        }
        if (arg5) {
            class232.method1597((byte) 127, 28);
        } else {
            class232.method1597((byte) 127, 25);
        }
        class6.method32(class154.field2457, true, 66);
        int var7 = class272.field4670;
        class272.field4670 = (arg6 - 6) * 8;
        int var8 = class199.field3226;
        class199.field3226 = (arg4 - 6) * 8;
        class322.field5615 = class303.method2119(class121.field1713 * 8, class110.field1555 * 8, false);
        class201.field3247 = null;
        int var9 = class199.field3226 - var8;
        if (arg3 != 24015) {
            method1575(36, -54, -95, 32, 19, false, 118);
        }
        int var10 = class272.field4670 - var7;
        int var11 = class199.field3226;
        int var12 = class272.field4670;
        if (arg5) {
            class233.field3826 = 0;
            for (int var13 = 0; var13 < 32768; var13++) {
                class4 var14 = class40.field649[var13];
                if (var14 != null) {
                    var14.field4162 -= var10 * 128;
                    var14.field4231 -= var9 * 128;
                    if (var14.field4162 >= 0 && var14.field4162 <= 13184 && var14.field4231 >= 0 && var14.field4231 <= 13184) {
                        for (int var15 = 0; var15 < 10; var15++) {
                            var14.field4188[var15] -= var10;
                            var14.field4245[var15] -= var9;
                        }
                        class97.field1403[class233.field3826++] = var13;
                    } else {
                        class40.field649[var13].method15((class242) null, 0);
                        class40.field649[var13] = null;
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < 32768; var16++) {
                class4 var17 = class40.field649[var16];
                if (var17 != null) {
                    for (int var18 = 0; var18 < 10; var18++) {
                        var17.field4188[var18] -= var10;
                        var17.field4245[var18] -= var9;
                    }
                    var17.field4162 -= var10 * 128;
                    var17.field4231 -= var9 * 128;
                }
            }
        }
        for (int var19 = 0; var19 < 2048; var19++) {
            class12 var20 = class22.field380[var19];
            if (var20 != null) {
                for (int var21 = 0; var21 < 10; var21++) {
                    var20.field4188[var21] -= var10;
                    var20.field4245[var21] -= var9;
                }
                var20.field4231 -= var9 * 128;
                var20.field4162 -= var10 * 128;
            }
        }
        class23.field400 = arg0;
        byte var22 = 0;
        byte var23 = 104;
        class85.field1176.method60(3, arg2, arg1, false);
        byte var24 = 1;
        if (var10 < 0) {
            var22 = 103;
            var23 = -1;
            var24 = -1;
        }
        byte var25 = 0;
        byte var26 = 104;
        byte var27 = 1;
        if (var9 < 0) {
            var26 = -1;
            var27 = -1;
            var25 = 103;
        }
        for (int var28 = var22; var28 != var23; var28 += var24) {
            for (int var29 = var25; var29 != var26; var29 += var27) {
                int var30 = var10 + var28;
                int var31 = var29 + var9;
                for (int var32 = 0; var32 < 4; var32++) {
                    if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
                        class205.field3353[var32][var28][var29] = class205.field3353[var32][var30][var31];
                    } else {
                        class205.field3353[var32][var28][var29] = null;
                    }
                }
            }
        }
        for (class85 var33 = (class85) class134.field2063.method1221((byte) 58); var33 != null; var33 = (class85) class134.field2063.method1223(83)) {
            var33.field1189 -= var9;
            var33.field1181 -= var10;
            if (var33.field1181 < 0 || var33.field1189 < 0 || var33.field1181 >= 104 || var33.field1189 >= 104) {
                var33.method1880(arg3 ^ 0xFFFFC127);
            }
        }
        if (class84.field1166 != 0) {
            class84.field1166 -= var10;
            class278.field4762 -= var9;
        }
        class150.field2329 = 0;
        if (arg5) {
            class224.field3639 -= var10 * 128;
            class80.field1129 -= var9 * 128;
            class48.field756 -= var10;
            class239.field3918 -= var9;
            class310.field5307 -= var10;
            class17.field241 -= var9;
        } else {
            class28.field485 = 1;
        }
        if (class217.field3516 && arg5 && (Math.abs(var10) > 104 || Math.abs(var9) > 104)) {
            class121.method783(159);
        }
        class185.field2947 = -1;
        class146.field2234.method1224((byte) 56);
        class185.field2944.method1224((byte) 56);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)V")
    public abstract void method1572(int arg0, int arg1);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V")
    public abstract void method1573(int arg0, int arg1, int arg2);
}
