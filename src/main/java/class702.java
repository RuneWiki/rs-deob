import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class702 {

    @OriginalMember(owner = "client!am", name = "a", descriptor = "[J")
    public static long[] field9873 = new long[256];

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public static int field9874;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field9875;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field9873[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZ)V", line = 3)
    public static final void method3942(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15) {
        class237.field3133 = class377.field4985.method1133() > 0;
        class505.field6963 = arg15;
        class501.field6888 = arg1 >> class62.field762;
        class377.field4997 = arg3 >> class62.field762;
        class614.field8512 = arg1;
        class505.field6960 = arg3;
        class457.field6008 = arg2;
        class153.field2165 = class501.field6888 - class312.field4204;
        if (class153.field2165 < 0) {
            class542.field7424 = -class153.field2165;
            class153.field2165 = 0;
        } else {
            class542.field7424 = 0;
        }
        class151.field2067 = class377.field4997 - class312.field4204;
        if (class151.field2067 < 0) {
            class208.field2784 = -class151.field2067;
            class151.field2067 = 0;
        } else {
            class208.field2784 = 0;
        }
        class78.field923 = class501.field6888 + class312.field4204;
        if (class78.field923 > class329.field4421) {
            class78.field923 = class329.field4421;
        }
        class156.field2191 = class377.field4997 + class312.field4204;
        if (class156.field2191 > class641.field8846) {
            class156.field2191 = class641.field8846;
        }
        boolean[][] var16 = class165.field2371;
        boolean[][] var17 = class595.field8207;
        if (class505.field6963) {
            for (int var18 = 0; var18 < class312.field4204 + class312.field4204 + 2; var18++) {
                for (int var21 = 0; var21 < class312.field4204 + class312.field4204 + 2; var21++) {
                    int var22 = class501.field6888 + var18 - class312.field4204;
                    int var23 = class377.field4997 + var21 - class312.field4204;
                    if (var22 >= 0 && var23 >= 0 && var22 < class329.field4421 && var23 < class641.field8846) {
                        int var24 = var22 << class62.field762;
                        int var25 = var23 << class62.field762;
                        int var26 = class454.field5981[class454.field5981.length - 1].method1611(var22, true, var23) - (0x3E8 << class62.field762 - 7);
                        int var27 = class446.field5914 == null ? class454.field5981[0].method1611(var22, true, var23) + class458.field6012 : class446.field5914[0].method1611(var22, true, var23) + class458.field6012;
                        class595.field8207[var18][var21] = class377.field4985.method1083(var24, var26, var25, var24, var27, var25);
                    } else {
                        class595.field8207[var18][var21] = false;
                    }
                }
            }
            for (int var19 = 0; var19 < class312.field4204 + class312.field4204 + 1; var19++) {
                for (int var20 = 0; var20 < class312.field4204 + class312.field4204 + 1; var20++) {
                    class165.field2371[var19][var20] = class595.field8207[var19][var20] || class595.field8207[var19 + 1][var20] || class595.field8207[var19][var20 + 1] || class595.field8207[var19 + 1][var20 + 1];
                }
            }
            class423.field5553 = arg5;
            class252.field3305 = arg6;
            class428.field5765 = arg7;
            class480.field6685 = arg8;
            class626.field8673 = arg9;
            class47.method246(class377.field4985, arg10, false);
        } else {
            if (class427.field5756 == null) {
                class427.field5756 = new boolean[class329.field4421 + class329.field4421 + 1][class641.field8846 + class329.field4421 + 1];
                for (int var28 = 0; var28 < class427.field5756.length; var28++) {
                    for (int var29 = 0; var29 < class427.field5756[0].length; var29++) {
                        class427.field5756[var28][var29] = true;
                    }
                }
            }
            class595.field8207 = class427.field5756;
            class165.field2371 = class427.field5756;
            class153.field2165 = 0;
            class151.field2067 = 0;
            class78.field923 = class329.field4421;
            class156.field2191 = class641.field8846;
            class91.field1111 = 0;
        }
        class250.method1527(class377.field4985, 4);
        for (class329 var30 = (class329) class694.field9791.method1298((byte) 40); var30 != null; var30 = (class329) class694.field9791.method1305((byte) -112)) {
            var30.method3499(12151);
            class641.method3548(1, var30);
        }
        if (class237.field3133) {
            for (int var31 = 0; var31 < class645.field8927; var31++) {
                class141.field1915[var31].method3482((byte) -86, arg14, arg0);
            }
        }
        if (class115.field1477) {
            class287.field3780 = class377.field4985.method1110();
            class377.field4985.method1057(class560.field7663);
            int var32 = (class560.field7663[2] - class560.field7663[0]) / class105.field1252;
            for (int var33 = 0; var33 < class105.field1252 - 1; var33++) {
                class493.field6795[var33] = (var33 + 1) * var32 + class190.field2629[var33];
            }
            for (int var34 = 0; var34 < class595.field8212.length; var34++) {
                class595.field8212[var34].method3536();
            }
        }
        if (class631.field8736 != null) {
            if (class115.field1477) {
                class448.method2526(0);
            }
            class385.method2208(true);
            class377.field4985.method1072(-1, 1583160, 40, 127);
            class378.method2163(true, arg4, arg10, arg11);
            if (class115.field1477) {
                class10.method53();
            }
            class377.field4985.method1148();
            class385.method2208(false);
        }
        class378.method2163(false, arg4, arg10, arg11);
        if (class115.field1477) {
            for (int var35 = 0; var35 < class171.field2428; var35++) {
                class420.field5518[var35] = class591.field8150[var35];
            }
            class448.method2526(0);
            for (int var36 = 0; var36 < class595.field8212.length; var36++) {
                class595.field8212[var36].method3536();
            }
        }
        if (class115.field1477) {
            class10.method53();
            for (int var37 = 0; var37 < class171.field2428; var37++) {
                class591.field8150[var37] = class420.field5518[var37];
            }
            if (class143.field1940 == 2) {
                int var10002;
                if (class221.field2887[0] < class221.field2887[1]) {
                    if (class493.field6795[0] + class190.field2629[0] > class560.field7663[0]) {
                        var10002 = class190.field2629[0]++;
                    }
                } else if (class221.field2887[0] > class221.field2887[1] && class493.field6795[0] + class190.field2629[0] < class560.field7663[2]) {
                    var10002 = class190.field2629[0]--;
                }
            }
        }
        if (!class505.field6963) {
            class165.field2371 = var16;
            class595.field8207 = var17;
        }
        class322.method1867();
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ZC)Z", line = 267)
    public static final boolean method3943(boolean arg0, char arg1) {
        field9874++;
        if (arg0) {
            return false;
        } else {
            return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V", line = 278)
    public static void method3944(byte arg0) {
        if (arg0 == -57) {
            field9873 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(B)I", line = 294)
    public static final int method3945(byte arg0) {
        field9875++;
        if (arg0 >= -102) {
            field9873 = null;
        }
        if (class529.field7314 == null) {
            return class6.field59 ? 2 : 1;
        } else {
            return 3;
        }
    }
}
