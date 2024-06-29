import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class191 extends class117 {

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
    public int field2787;

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
    public int field2788;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "[Z")
    public boolean[] field2786;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "[I")
    public int[] field2779;

    @OriginalMember(owner = "client!ki", name = "x", descriptor = "[I")
    public int[] field2790;

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "[[I")
    public int[][] field2792;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2781 = "K";

    @OriginalMember(owner = "client!ki", name = "A", descriptor = "I")
    public static int field2793 = -1;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!ki", name = "y", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!ki", name = "B", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!ki", name = "C", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "Lln;")
    public static class118 field2784;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "[I")
    public static int[] field2780;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)Lkm;", line = 6)
    public static final class94 method1376(int arg0, int arg1, int arg2) {
        class167 var3 = class302.field4502[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2412;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 22)
    public static final void method1377(int arg0, String arg1, int arg2) {
        boolean var3 = false;
        for (int var4 = arg2; var4 < class265.field4053; var4++) {
            class228 var5 = class343.field5312[class227.field3426[var4]];
            if (var5 != null && var5.field3453 != null && var5.field3453.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    class107.field1533.method1915(true, 177);
                    field2782++;
                    class107.field1533.method1330((byte) -81, class227.field3426[var4]);
                    class107.field1533.method1348(0, true);
                } else if (arg0 == 4) {
                    class344.field5323++;
                    class107.field1533.method1915(true, 169);
                    class107.field1533.method1366(class227.field3426[var4], (byte) -94);
                    class107.field1533.method1363((byte) 22, 0);
                } else if (arg0 == 5) {
                    class107.field1533.method1915(true, 186);
                    class158.field2275++;
                    class107.field1533.method1363((byte) 22, 0);
                    class107.field1533.method1366(class227.field3426[var4], (byte) -79);
                } else if (arg0 == 6) {
                    class107.field1533.method1915(true, 157);
                    class107.field1533.method1366(class227.field3426[var4], (byte) -68);
                    class177.field2546++;
                    class107.field1533.method1348(0, true);
                } else if (arg0 == 7) {
                    class148.field2123++;
                    class107.field1533.method1915(true, 59);
                    class107.field1533.method1361(class227.field3426[var4], (byte) 127);
                    class107.field1533.method1355((byte) -123, 0);
                }
                var3 = true;
                break;
            }
        }
        field2785++;
        if (!var3) {
            class28.method177(class67.field987 + arg1, -19420);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILsb;)V", line = 103)
    public static final void method1378(int arg0, int arg1, class190 arg2) {
        if (class36.field534 != null) {
            try {
                class36.field534.method1167(0L, 8);
                class36.field534.method1171(arg1, arg0 ^ 0xFFFFFFE7, 24, arg2.field2718);
            } catch (Exception var4) {
            }
        }
        field2789++;
        if (arg0 != 24) {
            method1380(-5, -112, false, 0, true, 35);
        }
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)V", line = 132)
    public static void method1379(int arg0) {
        field2781 = null;
        field2780 = null;
        field2784 = null;
        if (arg0 != 2047) {
            method1380(-15, -58, true, 100, true, -69);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIZIZI)V", line = 144)
    public static final void method1380(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5) {
        field2794++;
        class117.field1662++;
        if (class1.field55 != null && (class1.field55.field5137 - ((class1.field55.method1700(-125) - 1) * 64) >> 7) == class3.field101 && class1.field55.field5165 - (class1.field55.method1700(-116) - 1) * 64 >> 7 == class358.field5478) {
            class50.field757 = false;
            class3.field101 = 0;
        }
        class48.method411(64);
        if (!arg2) {
            class240.method1768(-1);
        }
        class284.method2059(14112);
        if (class141.field2031) {
            class286.method2069(arg0, arg3, true, 64, arg1, arg5);
            arg3 = class40.field580;
            arg5 = class109.field1584;
            arg0 = class322.field4849;
            arg1 = class14.field205;
        }
        class155.field2217 = arg0;
        class155.field2214 = arg1;
        if (class86.field1208 == 1) {
            int var8 = (int) class36.field535 + class321.field4832 & 0x7FF;
            int var9 = (int) class103.field1476;
            if (var9 < class291.field4409 / 256) {
                var9 = class291.field4409 / 256;
            }
            if (class71.field1021[4] && var9 < (class97.field1371[4] + 128)) {
                var9 = class97.field1371[4] + 128;
            }
            class19.method118(class150.field2184, arg3, class112.field1623, var8, var9, 0, class71.method584(class321.field4835, class1.field55.field5137, -45, class1.field55.field5165) - 50, var9 * 3 + 600);
        } else if (class86.field1208 == 4) {
            int var6 = (int) class36.field535 & 0x7FF;
            int var7 = (int) class103.field1476;
            if (class291.field4409 / 256 > var7) {
                var7 = class291.field4409 / 256;
            }
            if (class71.field1021[4] && var7 < (class97.field1371[4] + 128)) {
                var7 = class97.field1371[4] + 128;
            }
            class19.method118(class150.field2184, arg3, class112.field1623, var6, var7, 0, class71.method584(class321.field4835, class259.field3864, 102, class194.field2823) - 50, var7 * 3 + 600);
        } else if (class86.field1208 == 5) {
            class92.method720(arg3, (byte) 76);
        }
        int var10 = class137.field1991;
        int var11 = class129.field1871;
        int var12 = class166.field2385;
        int var13 = class335.field5216;
        int var14 = class362.field5746;
        for (int var15 = 0; var15 < 5; var15++) {
            if (class71.field1021[var15]) {
                int var16 = (int) (Math.random() * (double) (class109.field1581[var15] * 2 + 1) + Math.sin((double) class8.field150[var15] / 100.0D * (double) class122.field1770[var15]) * (double) class97.field1371[var15] - (double) class109.field1581[var15]);
                if (var15 == 4) {
                    class362.field5746 += var16;
                    if (class362.field5746 < 128) {
                        class362.field5746 = 128;
                    }
                    if (class362.field5746 > 383) {
                        class362.field5746 = 383;
                    }
                }
                if (var15 == 0) {
                    class137.field1991 += var16;
                }
                if (var15 == 1) {
                    class129.field1871 += var16;
                }
                if (var15 == 3) {
                    class335.field5216 = class335.field5216 + var16 & 0x7FF;
                }
                if (var15 == 2) {
                    class166.field2385 += var16;
                }
            }
        }
        class331.method2328(4);
        if (class141.field2031) {
            class205.method1503(arg1, arg0, arg1 + arg5, arg0 + arg3);
            boolean var18 = false;
            float var19 = (float) class335.field5216 * 0.17578125F;
            float var20 = (float) class362.field5746 * 0.17578125F;
            if (class86.field1208 == 3) {
                var19 = class340.field5258 * 360.0F / 6.2831855F;
                var20 = class240.field3576 * 360.0F / 6.2831855F;
            }
            int var21;
            if (class194.field2819 == 10) {
                var21 = class150.method1061(class166.field2385 >> 10, class137.field1991 >> 10, class257.field3849, class94.field1310, -1);
            } else {
                var21 = class150.method1061(class1.field55.field5162[0] >> 3, class1.field55.field5186[0] >> 3, class257.field3849, class94.field1310, -1);
            }
            if (class284.field4291 >= 0) {
                class141.method1005();
                class82 var22 = class277.method2022(class284.field4291, class303.field4535, class110.field1595, (byte) 69, class99.field1412);
                var22.method675(class214.field3082, arg1, arg0, arg5, arg3, class362.field5746, class335.field5216, var21);
            } else {
                class141.method1006(var21);
            }
            class141.method997(arg1, arg0, arg5, arg3, arg5 / 2 + arg1, arg3 / 2 + arg0, var20, var19, class167.field2417, class167.field2417);
            class206.method1504(false, 16555);
            class141.method983();
            class141.method982(true);
            class141.method1011(true);
        } else {
            class44.method326(arg1, arg0, arg1 + arg5, arg0 + arg3);
            class345.method2423();
            if (class284.field4291 < 0) {
                class44.method317(arg1, arg0, arg5, arg3, 0);
            } else {
                class82 var17 = class277.method2022(class284.field4291, class303.field4535, class110.field1595, (byte) 69, class99.field1412);
                var17.method672(class214.field3082, arg1, arg0, arg5, arg3, class362.field5746, class335.field5216, 0);
            }
        }
        if (class15.field246 || class193.field2807 < arg1 || class193.field2807 >= arg1 + arg5 || class255.field3814 < arg0 || class255.field3814 >= arg0 + arg3) {
            class76.field1118 = false;
            class9.field158 = true;
            class192.field2799 = 0;
        } else {
            class9.field158 = true;
            class76.field1118 = true;
            class192.field2799 = 0;
            int var23 = class16.field277;
            int var24 = class320.field4815;
            class108.field1557 = (class193.field2807 - arg1) * (var24 - var23) / arg5 + var23;
            int var25 = class279.field4240;
            int var26 = class92.field1289;
            class56.field825 = (class255.field3814 - arg0) * (var25 - var26) / arg3 + var26;
        }
        class32.method228(0);
        byte var27 = class362.method2546(1) == 2 ? (byte) class117.field1662 : 1;
        if (class141.field2031) {
            class268.method1988(class304.field4560, !class324.field4888);
            class50.method419(class137.field1991, class166.field2385, class362.field5746, class335.field5216, (byte) -103, class129.field1871);
            class141.field2045 = class304.field4560;
            class126.method938(class137.field1991, class129.field1871, class166.field2385, class362.field5746, class335.field5216, class170.field2456, class86.field1223, class348.field5382, class107.field1549, class150.field2181, class356.field5465, class321.field4835 + 1, var27, class1.field55.field5137 >> 7, class1.field55.field5165 >> 7);
            class174.field2513 = true;
            class268.method1989();
            class50.method419(0, 0, 0, 0, (byte) -80, 0);
            class32.method228(0);
            class31.method224(arg1, arg0, arg5, class167.field2417, class167.field2417, (byte) 91, arg3);
            class127.method939(class167.field2417, (byte) -116, arg5, class167.field2417, arg3, arg1, arg0);
            class361.method2534();
        } else {
            class126.method938(class137.field1991, class129.field1871, class166.field2385, class362.field5746, class335.field5216, class170.field2456, class86.field1223, class348.field5382, class107.field1549, class150.field2181, class356.field5465, class321.field4835 + 1, var27, class1.field55.field5137 >> 7, class1.field55.field5165 >> 7);
            class32.method228(0);
            class361.method2534();
            class31.method224(arg1, arg0, arg5, 256, 256, (byte) 91, arg3);
            class127.method939(256, (byte) -116, arg5, 256, arg3, arg1, arg0);
        }
        ((class71) class345.field5336).method590(class94.field1310, 0);
        class169.method1192(arg5, (byte) -68, arg3, arg0, arg1);
        class129.field1871 = var11;
        class335.field5216 = var13;
        if (!arg4) {
            return;
        }
        class166.field2385 = var12;
        class137.field1991 = var10;
        class362.field5746 = var14;
        if (class185.field2661 && class57.field841.method245((byte) -106) == 0) {
            class185.field2661 = false;
        }
        if (class185.field2661) {
            if (class141.field2031) {
                class205.method1499(arg1, arg0, arg5, arg3, 0);
            } else {
                class44.method317(arg1, arg0, arg5, arg3, 0);
            }
            class355.method2470((byte) -97, class127.field1851, false);
        }
        if (!arg2 && !class185.field2661 && !class15.field246 && class193.field2807 >= arg1 && class193.field2807 < (arg1 + arg5) && arg0 <= class255.field3814 && (arg0 + arg3) > class255.field3814) {
            class333.method2340(1615548903, class255.field3814, arg0, arg1, arg5, arg3, class193.field2807);
        }
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(I[B)V", line = 397)
    public class191(int arg0, byte[] arg1) {
        this.field2787 = arg0;
        class190 var3 = new class190(arg1);
        this.field2788 = var3.method1319(255);
        this.field2786 = new boolean[this.field2788];
        this.field2779 = new int[this.field2788];
        this.field2790 = new int[this.field2788];
        this.field2792 = new int[this.field2788][];
        for (int var4 = 0; var4 < this.field2788; var4++) {
            this.field2790[var4] = var3.method1319(255);
        }
        for (int var5 = 0; var5 < this.field2788; var5++) {
            this.field2786[var5] = var3.method1319(255) == 1;
        }
        for (int var6 = 0; var6 < this.field2788; var6++) {
            this.field2779[var6] = var3.method1317((byte) 79);
        }
        for (int var7 = 0; var7 < this.field2788; var7++) {
            this.field2792[var7] = new int[var3.method1319(255)];
        }
        for (int var8 = 0; var8 < this.field2788; var8++) {
            for (int var9 = 0; var9 < this.field2792[var8].length; var9++) {
                this.field2792[var8][var9] = var3.method1319(255);
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZB)V", line = 456)
    public static final void method1381(boolean arg0, byte arg1) {
        field2795++;
        byte var2;
        byte[][] var3;
        if (class141.field2031 && arg0) {
            var2 = 1;
            var3 = class208.field3041;
        } else {
            var2 = 4;
            var3 = class178.field2560;
        }
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var6 = var3[var5];
            int var7 = class85.field1201[var5] >> 8;
            int[] var8 = null;
            int var9 = class85.field1201[var5] & 0xFF;
            int var10 = var7 * 64 - class272.field4123;
            int var11 = var9 * 64 - class202.field2968;
            if (var6 != null) {
                class32.method228(0);
                var8 = class258.method1896(99, var11, class272.field4123, class202.field2968, var10, var6, arg0, class92.field1269);
            }
            if (!arg0 && class169.field2446 / 8 == var7 && (class324.field4884 / 8) == var9) {
                if (var8 == null) {
                    class284.field4291 = -1;
                } else {
                    class284.field4291 = var8[0];
                    class214.field3082 = var8[4];
                    class110.field1595 = var8[2];
                    class303.field4535 = var8[1];
                    class99.field1412 = var8[3];
                }
            }
        }
        if (arg1 != -102) {
            field2781 = (String) null;
        }
        for (int var12 = 0; var12 < var4; var12++) {
            int var13 = (class85.field1201[var12] >> 8) * 64 - class272.field4123;
            int var14 = (class85.field1201[var12] & 0xFF) * 64 - class202.field2968;
            byte[] var15 = var3[var12];
            if (var15 == null && class324.field4884 < 800) {
                class32.method228(0);
                for (int var16 = 0; var16 < var2; var16++) {
                    class330.method2310(var16, 91, var14, 64, var13, 64);
                }
            }
        }
    }
}
