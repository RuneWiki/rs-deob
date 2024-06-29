import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class166 extends class128 {

    @OriginalMember(owner = "client!di", name = "N", descriptor = "Ljava/lang/String;")
    public static String field2907 = "Loaded defaults";

    @OriginalMember(owner = "client!di", name = "A", descriptor = "[I")
    public static int[] field2897 = new int[32];

    @OriginalMember(owner = "client!di", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field2909 = new String[500];

    @OriginalMember(owner = "client!di", name = "L", descriptor = "F")
    public static float field2905;

    @OriginalMember(owner = "client!di", name = "z", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!di", name = "C", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!di", name = "G", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!di", name = "J", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!di", name = "K", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!di", name = "M", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!di", name = "O", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!di", name = "Q", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!di", name = "R", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!di", name = "S", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!di", name = "H", descriptor = "Llg;")
    public static class137 field2902;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "Lcg;")
    public static class49 field2895;

    @OriginalMember(owner = "client!di", name = "B", descriptor = "Ltm;")
    private class79 field2898;

    @OriginalMember(owner = "client!di", name = "E", descriptor = "[I")
    public static int[] field2900;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lpi;II)V", line = 4)
    private final void method1302(class336 arg0, int arg1, int arg2) {
        if (arg2 != -2) {
            method1310(118, (class49) null);
        }
        field2912++;
        if (arg1 != 249) {
            return;
        }
        int var4 = arg0.method2364(-9069);
        if (this.field2898 == null) {
            int var5 = class168.method1318(var4, false);
            this.field2898 = new class79(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg0.method2364(-9069) == 1;
            int var8 = arg0.method2317(21803);
            class320 var9;
            if (var7) {
                var9 = new class190(arg0.method2365(121));
            } else {
                var9 = new class142(arg0.method2338((byte) 46));
            }
            this.field2898.method725((long) var8, var9, arg2 + 3);
        }
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(II)Lre;", line = 51)
    public static final class303 method1303(int arg0, int arg1) {
        class303 var2 = (class303) class292.field4672.method467(true, (long) arg1);
        field2899++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class212.field3577.method441(false, arg0, arg1);
        class303 var4 = new class303();
        var4.field4787 = arg1;
        if (var3 != null) {
            var4.method2092(new class336(var3), false);
        }
        var4.method2091(26889);
        if (var4.field4786 == 2 && class131.field2248.method732((long) arg1, true) == null) {
            class131.field2248.method725((long) arg1, new class142(class68.field1105), arg0);
            class194.field3252[class68.field1105++] = var4;
        }
        class292.field4672.method465(var4, (long) arg1, (byte) 92);
        return var4;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lql;Lql;ZII)I", line = 84)
    public static final int method1304(class20 arg0, class20 arg1, boolean arg2, int arg3, int arg4) {
        field2896++;
        if (arg4 == 1) {
            int var5 = arg1.field5234;
            int var6 = arg0.field5234;
            if (!arg2) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg4 == 2) {
            return class139.method1135(class5.field67, arg1.method198((byte) -34).field538, arg0.method198((byte) -34).field538, 21179);
        } else if (arg4 == 3) {
            if (arg1.field308.equals("-")) {
                if (arg0.field308.equals("-")) {
                    return 0;
                } else if (arg2) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg0.field308.equals("-")) {
                return arg2 ? 1 : -1;
            } else {
                return class139.method1135(class5.field67, arg1.field308, arg0.field308, 21179);
            }
        } else if (arg4 == 4) {
            return arg1.method2285(0) ? (arg0.method2285(0) ? 0 : 1) : (arg0.method2285(0) ? -1 : 0);
        } else if (arg4 == 5) {
            return arg1.method2284(-1) ? (arg0.method2284(-1) ? 0 : 1) : (arg0.method2284(arg3 - 8) ? -1 : 0);
        } else if (arg4 == 6) {
            return arg1.method2287(82) ? (arg0.method2287(-123) ? 0 : 1) : (arg0.method2287(68) ? -1 : 0);
        } else if (arg3 == arg4) {
            return arg1.method2280(0) ? (arg0.method2280(arg3 ^ 0x7) ? 0 : 1) : (arg0.method2280(0) ? -1 : 0);
        } else {
            return arg1.field306 - arg0.field306;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BLjava/lang/String;I)Ljava/lang/String;", line = 152)
    public final String method1305(byte arg0, String arg1, int arg2) {
        if (arg0 <= 124) {
            return (String) null;
        }
        field2908++;
        if (this.field2898 == null) {
            return arg1;
        } else {
            class190 var4 = (class190) this.field2898.method732((long) arg2, true);
            return var4 == null ? arg1 : var4.field3186;
        }
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(I)V", line = 176)
    public static void method1306(int arg0) {
        field2900 = null;
        field2907 = null;
        field2895 = null;
        if (arg0 != 104) {
            field2900 = (int[]) null;
        }
        field2909 = null;
        field2897 = null;
        field2902 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)I", line = 196)
    public final int method1307(int arg0, int arg1, int arg2) {
        field2910++;
        if (this.field2898 == null) {
            return arg1;
        }
        if (arg2 != -1) {
            method1303(50, 118);
        }
        class142 var4 = (class142) this.field2898.method732((long) arg0, true);
        return var4 == null ? arg1 : var4.field2601;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lpi;Z)V", line = 222)
    public final void method1308(class336 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method2364(-9069);
            if (var3 == 0) {
                field2906++;
                if (!arg1) {
                    field2909 = (String[]) null;
                }
                return;
            }
            this.method1302(arg0, var3, -2);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILie;IIIIIBI)V", line = 240)
    public static final void method1309(int arg0, class97 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        int var9 = arg2 & 0x3;
        field2903++;
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var10 = arg1.field1549;
            var11 = arg1.field1559;
        } else {
            var10 = arg1.field1559;
            var11 = arg1.field1549;
        }
        int var12;
        int var13;
        if (arg0 + var10 <= 104) {
            var12 = (var10 >> 1) + arg0;
            var13 = (var10 + 1 >> 1) + arg0;
        } else {
            var13 = arg0 + 1;
            var12 = arg0;
        }
        int var14;
        int var15;
        if (arg3 + var11 <= 104) {
            var14 = arg3 + (var11 + 1 >> 1);
            var15 = arg3 + (var11 >> 1);
        } else {
            var15 = arg3;
            var14 = arg3 + 1;
        }
        int var16 = (arg0 << 7) + (var10 << 6);
        int var17 = 103 / ((arg7 - 43) / 50);
        int var18 = (arg3 << 7) + (var11 << 6);
        int[][] var19 = class137.field2487[arg5];
        int var20 = var19[var12][var14] + var19[var13][var14] + var19[var12][var15] + var19[var13][var15] >> 2;
        int var21 = 0;
        if (arg5 != 0) {
            int[][] var22 = class137.field2487[0];
            var21 = var20 - (var22[var12][var14] + var22[var12][var15] + var22[var13][var15] + var22[var13][var14] >> 2);
        }
        int[][] var23 = (int[][]) null;
        if (arg5 < 3) {
            var23 = class137.field2487[arg5 + 1];
        }
        class102 var24 = arg1.method823(arg4, (class217) null, true, var23, var19, arg2, var18, false, 124, var20, var16);
        class14.method144(var24.field1643, var16 - arg8, var21, var18 - arg6);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILcg;)V", line = 326)
    public static final void method1310(int arg0, class49 arg1) {
        field2904++;
        int var2 = 4 % ((68 - arg0) / 33);
        class91.field1442 = arg1.method437((byte) -33, "p11_full");
        class159.field2815 = arg1.method437((byte) -33, "p12_full");
        class303.field4802 = arg1.method437((byte) -33, "b12_full");
        class161.field2864 = arg1.method437((byte) -33, "mapfunction");
        class33.field476 = arg1.method437((byte) -33, "hitmarks");
        class298.field4754 = arg1.method437((byte) -33, "hitbar_default");
        class83.field1336 = arg1.method437((byte) -33, "headicons_pk");
        class143.field2615 = arg1.method437((byte) -33, "headicons_prayer");
        class126.field2167 = arg1.method437((byte) -33, "hint_headicons");
        class317.field5035 = arg1.method437((byte) -33, "hint_mapmarkers");
        class353.field5578 = arg1.method437((byte) -33, "mapflag");
        class38.field556 = arg1.method437((byte) -33, "cross");
        class21.field332 = arg1.method437((byte) -33, "mapdots");
        class221.field3692 = arg1.method437((byte) -33, "scrollbar");
        class60.field937 = arg1.method437((byte) -33, "name_icons");
        class35.field495 = arg1.method437((byte) -33, "floorshadows");
        class349.field5550 = arg1.method437((byte) -33, "compass");
        class102.field1646 = arg1.method437((byte) -33, "hint_mapedge");
    }
}
