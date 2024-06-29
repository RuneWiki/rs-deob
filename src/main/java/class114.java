import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class114 extends class152 {

    @OriginalMember(owner = "client!a", name = "S", descriptor = "I")
    public static int field2143 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!a", name = "D", descriptor = "Loj;")
    public static class17 field2129 = new class17(30);

    @OriginalMember(owner = "client!a", name = "X", descriptor = "[I")
    public static int[] field2148 = new int[5];

    @OriginalMember(owner = "client!a", name = "V", descriptor = "I")
    public static int field2146 = 0;

    @OriginalMember(owner = "client!a", name = "U", descriptor = "I")
    public static int field2145 = 0;

    @OriginalMember(owner = "client!a", name = "Y", descriptor = "Z")
    public static boolean field2149 = true;

    @OriginalMember(owner = "client!a", name = "E", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!a", name = "F", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!a", name = "G", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!a", name = "H", descriptor = "I")
    public int field2133;

    @OriginalMember(owner = "client!a", name = "I", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!a", name = "J", descriptor = "I")
    public int field2135;

    @OriginalMember(owner = "client!a", name = "L", descriptor = "I")
    public int field2137;

    @OriginalMember(owner = "client!a", name = "N", descriptor = "I")
    public int field2139;

    @OriginalMember(owner = "client!a", name = "P", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!a", name = "W", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!a", name = "O", descriptor = "Lhh;")
    public class163 field2140;

    @OriginalMember(owner = "client!a", name = "R", descriptor = "[I")
    public int[] field2142;

    @OriginalMember(owner = "client!a", name = "T", descriptor = "[I")
    public int[] field2144;

    @OriginalMember(owner = "client!a", name = "M", descriptor = "[Lhh;")
    public class163[] field2138;

    @OriginalMember(owner = "client!a", name = "K", descriptor = "[Lqc;")
    public class258[] field2136;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIIBI)V")
    public static final void method904(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        if (arg7 != -61) {
            method910(0, -115, 30, 56);
        }
        int var9 = arg5 - arg8;
        int var10 = (arg6 - arg4 << 16) / var9;
        int var11 = arg2 - arg0;
        field2131++;
        int var12 = (arg3 - arg1 << 16) / var11;
        class191.method1404(var12, arg8, arg0, arg5, 0, 0, (byte) -125, arg2, var10, arg1, arg4);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lpa;I)V")
    public static final void method905(class123 arg0, int arg1) {
        field2130++;
        class16.field223 = class115.method922(arg0, class132.field2566, false);
        class186.field3416 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var5 = (float) (class234.field4186[var2] >> 16 & 0xFF);
            int var6 = class234.field4186[var2 + 1] >> 16 & 0xFF;
            float var7 = ((float) var6 - var5) / 64.0F;
            float var8 = (float) (class234.field4186[var2] >> 8 & 0xFF);
            int var9 = (class234.field4186[var2 + 1] & 0xFF00) >> 8;
            float var10 = ((float) var9 - var8) / 64.0F;
            float var11 = (float) (class234.field4186[var2] & 0xFF);
            int var12 = class234.field4186[var2 + 1] & 0xFF;
            float var13 = ((float) var12 - var11) / 64.0F;
            for (int var14 = 0; var14 < 64; var14++) {
                class186.field3416[var2 * 64 + var14] = class3.method27((int) var11, class3.method27((int) var5 << 16, (int) var8 << 8));
                var5 += var7;
                var8 += var10;
                var11 += var13;
            }
        }
        int var3 = -15 % ((-arg1 - 44) / 36);
        for (int var4 = 192; var4 < 255; var4++) {
            class186.field3416[var4] = class234.field4186[3];
        }
        class94.field1782 = new int[32768];
        class62.field1025 = new int[32768];
        class57.method400((class242) null, -83);
        class75.field1406 = new int[32768];
        class192.field3518 = new int[32768];
        class221.field4037 = new class105(128, 254);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)Z")
    public static final boolean method906(int arg0, int arg1) {
        field2132++;
        if (class29.field458[arg1]) {
            return true;
        } else if (class8.field140.method963(arg1, (byte) 17)) {
            int var2 = class8.field140.method971(arg1, arg0);
            if (var2 == 0) {
                class29.field458[arg1] = true;
                return true;
            }
            if (class109.field2060[arg1] == null) {
                class109.field2060[arg1] = new class69[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class109.field2060[arg1][var3] == null) {
                    byte[] var4 = class8.field140.method973(arg1, true, var3);
                    if (var4 != null) {
                        class109.field2060[arg1][var3] = new class69();
                        class109.field2060[arg1][var3].field1188 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            class109.field2060[arg1][var3].method490(-125, new class81(var4));
                        } else {
                            class109.field2060[arg1][var3].method491(0, new class81(var4));
                        }
                    }
                }
            }
            class29.field458[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method907(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2134++;
        if (arg6 >= class127.field2465 && class252.field4407 >= arg4 && arg5 >= class182.field3344 && arg3 <= class201.field3593) {
            class265.method1789(arg0, arg4, arg2, arg7, arg5, arg6, arg3, (byte) -74);
        } else {
            class126.method998(arg6, -115, arg7, arg2, arg3, arg5, arg4, arg0);
        }
        int var8 = -81 / ((arg1 + 4) / 47);
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V")
    public static void method908(int arg0) {
        if (arg0 > -24) {
            field2145 = 122;
        }
        field2148 = null;
        field2129 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lqh;I)V")
    public static final void method909(class69 arg0, int arg1) {
        field2141++;
        int var2 = -20 / ((arg1 + 24) / 52);
        int var3 = arg0.field1217;
        if (var3 == 324) {
            if (class27.field418 == -1) {
                class132.field2561 = arg0.field1184;
                class27.field418 = arg0.field1329;
            }
            if (class120.field2260.field3337) {
                arg0.field1329 = class27.field418;
            } else {
                arg0.field1329 = class132.field2561;
            }
        } else if (var3 == 325) {
            if (class27.field418 == -1) {
                class132.field2561 = arg0.field1184;
                class27.field418 = arg0.field1329;
            }
            if (class120.field2260.field3337) {
                arg0.field1329 = class132.field2561;
            } else {
                arg0.field1329 = class27.field418;
            }
        } else if (var3 == 327) {
            arg0.field1193 = 150;
            arg0.field1227 = (int) (Math.sin((double) class227.field4092 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field1245 = -1;
            arg0.field1208 = 5;
        } else if (var3 == 328) {
            if (class235.field4203.field2424 == null) {
                arg0.field1245 = 0;
            } else {
                arg0.field1193 = 150;
                arg0.field1227 = (int) (Math.sin((double) class227.field4092 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field1208 = 5;
                arg0.field1245 = ((int) class235.field4203.field2424.method1193((byte) 70) << 11) + 2047;
                arg0.field1192 = class235.field4203.field3664;
                arg0.field1252 = class235.field4203.field3650;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIII)V")
    public static final void method910(int arg0, int arg1, int arg2, int arg3) {
        class157.field2909 = new class144[arg0][arg1][arg2];
        class161.field2958 = new int[arg0][arg1 + 1][arg2 + 1];
        class238.method1649(false);
        class58.field948 = arg1;
        class106.field2033 = arg2;
        class45.field763 = new int[arg0][arg1 + 1][arg2 + 1];
        class191.method1400();
        class236.field4208 = arg3;
        class120.field2267 = new boolean[class236.field4208 + class236.field4208 + 1][class236.field4208 + class236.field4208 + 1];
        class48.field808 = new boolean[class236.field4208 + class236.field4208 + 2][class236.field4208 + class236.field4208 + 2];
    }
}
