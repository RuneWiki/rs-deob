import java.awt.Canvas;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class163 {

    @OriginalMember(owner = "client!p", name = "k", descriptor = "Z")
    public static boolean field2940 = false;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Lqe;")
    public static class179 field2941 = class206.method1380("Anmelde)2Zeitlimit -Uberschritten)3", (byte) -32);

    @OriginalMember(owner = "client!p", name = "j", descriptor = "Lsg;")
    public static class201 field2939 = new class201(50);

    @OriginalMember(owner = "client!p", name = "r", descriptor = "[I")
    public static int[] field2947 = new int[1000];

    @OriginalMember(owner = "client!p", name = "u", descriptor = "I")
    public static int field2950 = 0;

    @OriginalMember(owner = "client!p", name = "w", descriptor = "Lqe;")
    public static class179 field2952 = class206.method1380("Speicher wird zugewiesen)3", (byte) 104);

    @OriginalMember(owner = "client!p", name = "x", descriptor = "Lqe;")
    public static class179 field2953 = class206.method1380("<col=80ff00>", (byte) -35);

    @OriginalMember(owner = "client!p", name = "t", descriptor = "Lqe;")
    public static class179 field2949 = class206.method1380("Bitte versuchen Sie)1", (byte) -127);

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public int field2932;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public int field2936;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public int field2937;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public int field2942;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "Lbb;")
    public static class14 field2951;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "Lqe;")
    public class179 field2930;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "Lra;")
    public static class185 field2946;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "Lee;")
    public static class49 field2944;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "Z")
    public boolean field2943;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "[Lgg;")
    public static class72[] field2945;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    public static void method1043(byte arg0) {
        field2944 = null;
        field2939 = null;
        field2949 = null;
        field2951 = null;
        field2947 = null;
        field2946 = null;
        field2953 = null;
        field2945 = null;
        if (arg0 != -125) {
            field2947 = null;
        }
        field2941 = null;
        field2952 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)I")
    public static final int method1044(int arg0, int arg1) {
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        field2933++;
        double var4 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 > var2) {
            var8 = var4;
        }
        if (var6 > var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 > var4) {
            var10 = var4;
        }
        if (var6 < var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (arg0 != 4686) {
            return 59;
        }
        if (var8 != var10) {
            if (var2 == var8) {
                var12 = (var4 - var6) / (-var10 + var8);
            } else if (var4 == var8) {
                var12 = (var6 - var2) / (-var10 + var8) + 2.0D;
            } else if (var6 == var8) {
                var12 = (var2 - var4) / (var8 - var10) + 4.0D;
            }
            if (var16 < 0.5D) {
                var14 = (var8 - var10) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var8 - var10) / (2.0D - var8 - var10);
            }
        }
        int var18 = (int) (var16 * 256.0D);
        double var19 = var12 / 6.0D;
        int var21 = (int) (var14 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var19 * 256.0D);
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        if (var18 > 243) {
            var21 >>= 0x4;
        } else if (var18 > 217) {
            var21 >>= 0x3;
        } else if (var18 > 192) {
            var21 >>= 0x2;
        } else if (var18 > 179) {
            var21 >>= 0x1;
        }
        return (var22 >> 2 << 10) + (var18 >> 1) + (var21 >> 5 << 7);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IZLqe;)V")
    public static final void method1045(int arg0, boolean arg1, class179 arg2) {
        field2935++;
        int var4 = arg0 + 6;
        int var5 = arg0 + 6;
        int var6 = class191.field3546.method1010(arg2, 250);
        int var7 = class191.field3546.method997(arg2, 250) * 13;
        class145.method937(var4 - arg0, var5 - arg0, arg0 + arg0 + var6, arg0 + var7 + arg0, 0);
        class145.method919(var4 - arg0, -arg0 + var5, arg0 + var6 + arg0, arg0 + var7 + arg0, 16777215);
        class191.field3546.method1014(arg2, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class143.method900(arg0 + arg0 + var6, var7 - -arg0 + arg0, (byte) 41, var5 - arg0, -arg0 + var4);
        if (!arg1) {
            class125.method787(var6, 3496, var4, var7, var5);
            return;
        }
        Canvas var8 = class81.field1571;
        try {
            Graphics var9 = var8.getGraphics();
            class217.field4010.method466(0, 0, var9, (byte) -92);
        } catch (Exception var10) {
            var8.repaint();
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IJII)Z")
    public static final boolean method1046(int arg0, long arg1, int arg2, int arg3) {
        field2934++;
        if (arg2 <= 108) {
            return false;
        }
        int var5 = (int) arg1 >> 20 & 0x3;
        int var6 = (int) arg1 >> 14 & 0x1F;
        int var7 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class134 var8 = class114.method735((byte) -77, var7);
            int var9;
            int var10;
            if (var5 == 0 || var5 == 2) {
                var9 = var8.field2442;
                var10 = var8.field2430;
            } else {
                var9 = var8.field2430;
                var10 = var8.field2442;
            }
            int var11 = var8.field2424;
            if (var5 != 0) {
                var11 = (var11 << var5 & 0xF) + (var11 >> 4 - var5);
            }
            class190.method1278(2, arg0, 0, arg3, 54, true, var11, class61.field1298.field3160[0], var9, 0, class61.field1298.field3200[0], var10);
        } else {
            class190.method1278(2, arg0, var5, arg3, 41, true, 0, class61.field1298.field3160[0], 0, var6 + 1, class61.field1298.field3200[0], 0);
        }
        class36.field799 = class175.field3141;
        class98.field1838 = class68.field1361;
        class42.field909 = 2;
        class52.field1095 = 0;
        return true;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII[II[BIII)V")
    public static final void method1047(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, byte[] arg6, int arg7, int arg8, int arg9) {
        int var10 = -(arg5 >> 2);
        field2931++;
        int var11 = -(arg5 & arg0);
        for (int var12 = -arg8; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg6[arg7++] == 0) {
                    arg9++;
                } else {
                    arg4[arg9++] = arg3;
                }
                if (arg6[arg7++] == 0) {
                    arg9++;
                } else {
                    arg4[arg9++] = arg3;
                }
                if (arg6[arg7++] == 0) {
                    arg9++;
                } else {
                    arg4[arg9++] = arg3;
                }
                if (arg6[arg7++] == 0) {
                    arg9++;
                } else {
                    arg4[arg9++] = arg3;
                }
            }
            for (int var14 = var11; var14 < 0; var14++) {
                if (arg6[arg7++] == 0) {
                    arg9++;
                } else {
                    arg4[arg9++] = arg3;
                }
            }
            arg9 += arg1;
            arg7 += arg2;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lqe;ZLae;)Lqe;")
    public static final class179 method1048(class179 arg0, boolean arg1, class6 arg2) {
        field2938++;
        if (arg0.method1128(0, class240.field4420) != -1) {
            label62: while (true) {
                int var3 = arg0.method1128(0, class29.field628);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg0.method1128(0, class187.field3492);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg0.method1128(0, class241.field4427);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg0.method1128(0, class227.field4212);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg0.method1128(0, class216.field4002);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg0.method1128(0, class151.field2725);
                                                        if (var8 == -1) {
                                                            break label62;
                                                        }
                                                        class179 var9 = class207.field3868;
                                                        if (class147.field2661 != null) {
                                                            var9 = class46.method306(24994, class147.field2661.field593);
                                                            try {
                                                                if (class147.field2661.field591 != null) {
                                                                    byte[] var10 = ((String) class147.field2661.field591).getBytes("ISO-8859-1");
                                                                    var9 = class16.method127(var10.length, var10, 2, 0);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg0 = class78.method502((byte) -102, new class179[] { arg0.method1156(-5684, var8, 0), var9, arg0.method1162((byte) 106, var8 + 4) });
                                                    }
                                                }
                                                arg0 = class78.method502((byte) -82, new class179[] { arg0.method1156(-5684, var7, 0), class220.method1435(64, class226.method1480(121, arg2, 4)), arg0.method1162((byte) 95, var7 + 2) });
                                            }
                                        }
                                        arg0 = class78.method502((byte) -108, new class179[] { arg0.method1156(-5684, var6, 0), class220.method1435(64, class226.method1480(122, arg2, 3)), arg0.method1162((byte) 125, var6 + 2) });
                                    }
                                }
                                arg0 = class78.method502((byte) -116, new class179[] { arg0.method1156(-5684, var5, 0), class220.method1435(64, class226.method1480(-59, arg2, 2)), arg0.method1162((byte) 110, var5 + 2) });
                            }
                        }
                        arg0 = class78.method502((byte) -82, new class179[] { arg0.method1156(-5684, var4, 0), class220.method1435(64, class226.method1480(-83, arg2, 1)), arg0.method1162((byte) 125, var4 + 2) });
                    }
                }
                arg0 = class78.method502((byte) -101, new class179[] { arg0.method1156(-5684, var3, 0), class220.method1435(64, class226.method1480(123, arg2, 0)), arg0.method1162((byte) 106, var3 + 2) });
            }
        }
        if (arg1) {
            method1043((byte) -106);
        }
        return arg0;
    }
}
