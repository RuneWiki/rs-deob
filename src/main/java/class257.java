import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class257 {

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "[I")
    public static int[] field4277 = new int[5];

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field4279 = 0;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "Lqd;")
    public static class40 field4281 = class147.method1106("Verbindung abgebrochen)3", (byte) -45);

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field4280 = 0;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILce;IILce;)Ljh;", line = 10)
    public static final class259 method1804(int arg0, class239 arg1, int arg2, int arg3, class239 arg4) {
        field4278++;
        if (class272.method1881(arg4, arg2, arg0, 929)) {
            if (arg3 != 0) {
                field4282 = -8;
            }
            return class279.method1951((byte) 127, arg1.method1651(arg0, arg2, -1));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZI)V", line = 27)
    public static final void method1805(boolean arg0, int arg1) {
        class87.field1579 = (int[][][]) null;
        class62.field1169 = (byte[][][]) null;
        class256.field4267 = (byte[][][]) null;
        if (arg0 && class254.field4205 != null) {
            class223.field3698 = class254.field4205.field3319;
        } else {
            class223.field3698 = null;
        }
        class86.field1495 = (int[][][]) null;
        field4286++;
        class240.field3980 = null;
        class119.field2018 = null;
        class254.field4205 = null;
        class214.field3591 = (byte[][][]) null;
        class296.field4950 = arg1;
        class225.field3734 = (byte[][][]) null;
        class235.field3847 = (byte[][][]) null;
        class108.field1892 = (short[][][]) null;
        class166.field2745.method1966((byte) 92);
        class299.field4996 = null;
        class160.field2670 = null;
        class306.field5132 = null;
        class209.field3347 = null;
        class309.field5186 = null;
        class23.field419 = null;
        class29.field626 = null;
        class158.field2639 = null;
        class304.field5087 = null;
        class296.field4949 = null;
        class50.field953 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)V", line = 79)
    public static void method1806(boolean arg0) {
        if (!arg0) {
            field4281 = null;
            field4277 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIILvg;)V", line = 95)
    public static final void method1807(int arg0, int arg1, int arg2, int arg3, int arg4, class255 arg5) {
        field4285++;
        if (arg5.field4255 == -1 && arg5.field4253 == null) {
            return;
        }
        int var6 = 0;
        if (arg2 > arg5.field4261) {
            var6 += arg2 - arg5.field4261;
        } else if (arg5.field4239 > arg2) {
            var6 += arg5.field4239 - arg2;
        }
        if (arg5.field4259 < arg3) {
            var6 += arg3 - arg5.field4259;
        } else if (arg5.field4254 > arg3) {
            var6 += arg5.field4254 - arg3;
        }
        if (arg5.field4245 == 0 || (var6 - 64) > arg5.field4245 || class105.field1854 == 0 || arg5.field4237 != arg0) {
            if (arg5.field4234 != null) {
                class89.field1610.method1336(arg5.field4234);
                arg5.field4234 = null;
            }
            if (arg5.field4243 != null) {
                class89.field1610.method1336(arg5.field4243);
                arg5.field4243 = null;
            }
            return;
        }
        if (arg4 <= 87) {
            method1807(113, 69, -122, -54, -17, (class255) null);
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg5.field4245 - var6) * class105.field1854 / arg5.field4245;
        if (arg5.field4234 != null) {
            arg5.field4234.method1092(var7);
        } else if (arg5.field4255 >= 0) {
            class137 var8 = class137.method1012(class156.field2612, arg5.field4255, 0);
            if (var8 != null) {
                class64 var9 = var8.method1011().method519(class252.field4181);
                class145 var10 = class145.method1069(var9, 100, var7);
                var10.method1090(-1);
                class89.field1610.method1331(var10);
                arg5.field4234 = var10;
            }
        }
        if (arg5.field4243 != null) {
            arg5.field4243.method1092(var7);
            if (!arg5.field4243.method2099(0)) {
                arg5.field4243 = null;
            }
        } else if (arg5.field4253 != null && (arg5.field4249 -= arg1) <= 0) {
            int var11 = (int) ((double) arg5.field4253.length * Math.random());
            class137 var12 = class137.method1012(class156.field2612, arg5.field4253[var11], 0);
            if (var12 != null) {
                class64 var13 = var12.method1011().method519(class252.field4181);
                class145 var14 = class145.method1069(var13, 100, var7);
                var14.method1090(0);
                class89.field1610.method1331(var14);
                arg5.field4243 = var14;
                arg5.field4249 = (int) ((double) (arg5.field4238 - arg5.field4235) * Math.random()) + arg5.field4235;
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIZ)V", line = 238)
    public static final void method1808(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg4 < 1) {
            arg4 = 1;
        }
        field4283++;
        if (arg3 < 1) {
            arg3 = 1;
        }
        if (class21.field350) {
            int var6 = arg4 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = class15.field253 + ((class98.field1758 - class15.field253) * var6 / 100);
            if (var7 < class34.field673) {
                var7 = class34.field673;
            } else if (class177.field2916 < var7) {
                var7 = class177.field2916;
            }
            int var8 = arg4 * var7 * 512 / (arg3 * 334);
            if (class60.field1156 > var8) {
                short var9 = class60.field1156;
                var7 = arg3 * var9 * 334 / (arg4 * 512);
                if (var7 > class177.field2916) {
                    var7 = class177.field2916;
                    int var10 = arg4 * 512 * var7 / (var9 * 334);
                    int var11 = (arg3 - var10) / 2;
                    if (arg5) {
                        class111.method834();
                        class111.method846(arg0, arg1, var11, arg4, 0);
                        class111.method846(arg0 + arg3 - var11, arg1, var11, arg4, 0);
                    }
                    arg0 += var11;
                    arg3 -= var11 * 2;
                }
            } else if (var8 > class134.field2269) {
                short var12 = class134.field2269;
                var7 = arg3 * var12 * 334 / (arg4 * 512);
                if (class34.field673 > var7) {
                    var7 = class34.field673;
                    int var13 = var12 * 334 * arg3 / (var7 * 512);
                    int var14 = (arg4 - var13) / 2;
                    if (arg5) {
                        class111.method834();
                        class111.method846(arg0, arg1, arg3, var14, 0);
                        class111.method846(arg0, arg1 + arg4 - var14, arg3, var14, 0);
                    }
                    arg1 += var14;
                    arg4 -= var14 * 2;
                }
            }
            class59.field1136 = arg4 * var7 / 334;
        }
        int var15 = -96 / ((-arg2 - 36) / 43);
        class87.field1567 = arg1;
        class130.field2225 = (short) arg3;
        class265.field4448 = (short) arg4;
        class125.field2156 = arg0;
    }
}
