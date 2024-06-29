import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class141 {

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Lkb;")
    private static class93 field2737 = class76.method390("Free world", 0);

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "Lkb;")
    private static class93 field2742 = class76.method390("Loaded config", 0);

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "Lkb;")
    public static class93 field2745 = field2737;

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "I")
    public static int field2760 = 0;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public static int field2749 = 0;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "Lkb;")
    public static class93 field2759 = class76.method390("Anmelde)2Zeitlimit -Uberschritten)3", 0);

    @OriginalMember(owner = "client!pe", name = "G", descriptor = "Lkb;")
    private static class93 field2768 = class76.method390("glow3:", 0);

    @OriginalMember(owner = "client!pe", name = "E", descriptor = "Lkb;")
    public static class93 field2766 = field2768;

    @OriginalMember(owner = "client!pe", name = "D", descriptor = "Lkb;")
    public static class93 field2765 = field2742;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "Lkb;")
    public static class93 field2752 = field2768;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
    private int field2755;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!pe", name = "H", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "J")
    private long field2736;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "J")
    private long field2746;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "Lna;")
    public static class119 field2758;

    @OriginalMember(owner = "client!pe", name = "F", descriptor = "Z")
    public boolean field2767;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "[I")
    private int[] field2739;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "[I")
    private int[] field2747;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lrd;IILqd;)V")
    public static final void method876(class158 arg0, int arg1, int arg2, class149 arg3) {
        field2743++;
        class29 var4 = new class29();
        var4.field477 = arg0.method1054(128);
        var4.field469 = arg0.method1076(24277);
        var4.field473 = new int[var4.field477];
        if (arg1 != -1) {
            method876(null, -20, -4, null);
        }
        var4.field471 = new class22[var4.field477];
        var4.field476 = new int[var4.field477];
        var4.field480 = new byte[var4.field477][][];
        var4.field478 = new int[var4.field477];
        var4.field481 = new class22[var4.field477];
        for (int var5 = 0; var5 < var4.field477; var5++) {
            try {
                int var6 = arg0.method1054(128);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg0.method1035(arg1 ^ 0xFFFFFF00).method483(0));
                    String var18 = new String(arg0.method1035(arg1 + 256).method483(0));
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg0.method1076(24277);
                    }
                    var4.field473[var5] = var6;
                    var4.field478[var5] = var19;
                    var4.field481[var5] = arg3.method912(var18, class29.method159(arg1, 105), class133.method796(118, var17));
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg0.method1035(255).method483(0));
                    String var8 = new String(arg0.method1035(255).method483(~arg1));
                    int var9 = arg0.method1054(128);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg0.method1035(255).method483(0));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg0.method1076(24277);
                            var12[var13] = new byte[var14];
                            arg0.method1041(0, var14, var12[var13], 118);
                        }
                    }
                    var4.field473[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class133.method796(67, var10[var16]);
                    }
                    var4.field471[var5] = arg3.method914(var15, (byte) -5, var8, class133.method796(80, var7));
                    var4.field480[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field476[var5] = -1;
            } catch (SecurityException var21) {
                var4.field476[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field476[var5] = -3;
            } catch (Exception var23) {
                var4.field476[var5] = -4;
            } catch (Throwable var24) {
                var4.field476[var5] = -5;
            }
        }
        class165.field3262.method691(var4, (byte) 51);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    private final void method877(int arg0) {
        field2762++;
        long var2 = this.field2746;
        this.field2746 = 0L;
        int var4 = this.field2739[5];
        int var5 = this.field2739[9];
        this.field2739[5] = var5;
        this.field2739[9] = var4;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field2746 <<= 0x4;
            if (this.field2739[var6] >= 256) {
                this.field2746 += this.field2739[var6] - 256;
            }
        }
        if (this.field2739[0] >= 256) {
            this.field2746 += this.field2739[0] - 256 >> 4;
        }
        if (this.field2739[arg0] >= 256) {
            this.field2746 += this.field2739[1] - 256 >> 8;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field2746 <<= 0x3;
            this.field2746 += this.field2747[var7];
        }
        this.field2746 <<= 0x1;
        this.field2739[5] = var4;
        this.field2739[9] = var5;
        this.field2746 += this.field2767 ? 1 : 0;
        if (var2 != 0L && this.field2746 != var2) {
            class176.field3473.method682((byte) -80, var2);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILdg;B)Lfd;")
    public final class52 method878(int arg0, class37 arg1, byte arg2) {
        field2738++;
        if (this.field2755 != -1) {
            return class200.method1313(this.field2755, 9).method1253(false, arg1, arg0);
        }
        class52 var4 = (class52) class180.field3573.method680(this.field2746, (byte) 101);
        if (arg2 != -7) {
            this.method883((byte) -60);
        }
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field2739[var6];
                if (var15 >= 256 && var15 < 512 && !class75.method387(var15 - 256, (byte) -91).method1023(true)) {
                    var5 = true;
                }
                if (var15 >= 512 && !class166.method1126(arg2 ^ 0xFFFFFF82, var15 - 512).method1122(this.field2767, -1)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class132[] var7 = new class132[12];
            int var8 = 0;
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field2739[var9];
                if (var12 >= 256 && var12 < 512) {
                    class132 var13 = class75.method387(var12 - 256, (byte) -111).method1027((byte) -124);
                    if (var13 != null) {
                        var7[var8++] = var13;
                    }
                }
                if (var12 >= 512) {
                    class132 var14 = class166.method1126(-97, var12 - 512).method1116(this.field2767, 127);
                    if (var14 != null) {
                        var7[var8++] = var14;
                    }
                }
            }
            class132 var10 = new class132(var7, var8);
            for (int var11 = 0; var11 < 5; var11++) {
                if (this.field2747[var11] < class24.field367[var11].length) {
                    var10.method790(class122.field2269[var11], class24.field367[var11][this.field2747[var11]]);
                }
                if (this.field2747[var11] < class188.field3682[var11].length) {
                    var10.method790(class130.field2463[var11], class188.field3682[var11][this.field2747[var11]]);
                }
            }
            var4 = var10.method774(64, 768, -50, -10, -50, true, true);
            class180.field3573.method678(true, var4, this.field2746);
        }
        if (arg1 != null) {
            var4 = arg1.method208(arg0, var4, (byte) -102);
        }
        return var4;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)V")
    public final void method879(int arg0, boolean arg1) {
        field2750++;
        if (this.field2767 != arg1) {
            this.method886(this.field2747, arg0, true, null, arg1);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZII)V")
    public final void method880(boolean arg0, int arg1, int arg2) {
        field2769++;
        int var4 = this.field2747[arg1];
        if (arg2 != 0) {
            return;
        }
        if (arg0) {
            var4++;
            if (var4 >= class24.field367[arg1].length) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class24.field367[arg1].length - 1;
            }
        }
        this.field2747[arg1] = var4;
        this.method877(1);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIILdg;Ldg;)Lfd;")
    public final class52 method881(int arg0, int arg1, int arg2, class37 arg3, class37 arg4) {
        field2741++;
        if (this.field2755 != -1) {
            return class200.method1313(this.field2755, arg1 ^ 0xFFFFFEF6).method1250(arg0, arg4, arg3, arg2, (byte) 11);
        }
        int[] var6 = this.field2739;
        long var7 = this.field2746;
        if (arg4 != null && (arg4.field614 >= 0 || arg4.field599 >= 0)) {
            var6 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var6[var9] = this.field2739[var9];
            }
            if (arg4.field614 >= 0) {
                var7 += arg4.field614 - this.field2739[5] << 8;
                var6[5] = arg4.field614;
            }
            if (arg4.field599 >= 0) {
                var7 += arg4.field599 - this.field2739[3] << 16;
                var6[3] = arg4.field599;
            }
        }
        class52 var10 = (class52) class176.field3473.method680(var7, (byte) -36);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var6[var12];
                if (var21 >= 256 && var21 < 512 && !class75.method387(var21 - 256, (byte) -97).method1025((byte) 57)) {
                    var11 = true;
                }
                if (var21 >= 512 && !class166.method1126(-41, var21 - 512).method1120(true, this.field2767)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field2736 != -1L) {
                    var10 = (class52) class176.field3473.method680(this.field2736, (byte) -60);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class132[] var13 = new class132[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var6[var15];
                    if (var18 >= 256 && var18 < 512) {
                        class132 var19 = class75.method387(var18 - 256, (byte) -107).method1022(-128);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                    if (var18 >= 512) {
                        class132 var20 = class166.method1126(90, var18 - 512).method1123(this.field2767, arg1 ^ 0xFFFFFEBB);
                        if (var20 != null) {
                            var13[var14++] = var20;
                        }
                    }
                }
                class132 var16 = new class132(var13, var14);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (this.field2747[var17] < class24.field367[var17].length) {
                        var16.method790(class122.field2269[var17], class24.field367[var17][this.field2747[var17]]);
                    }
                    if (class188.field3682[var17].length > this.field2747[var17]) {
                        var16.method790(class130.field2463[var17], class188.field3682[var17][this.field2747[var17]]);
                    }
                }
                var10 = var16.method774(64, 850, -30, -50, -30, true, true);
                class176.field3473.method678(true, var10, var7);
                this.field2736 = var7;
            }
        }
        if (arg1 != -257) {
            field2765 = null;
        }
        if (arg4 == null && arg3 == null) {
            return var10;
        }
        class52 var22;
        if (arg4 != null && arg3 != null) {
            var22 = arg4.method200(var10, arg2, arg3, (byte) -2, arg0);
        } else if (arg4 == null) {
            var22 = arg3.method209(var10, arg2, (byte) 75);
        } else {
            var22 = arg4.method209(var10, arg0, (byte) 75);
        }
        return var22;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/Throwable;)V")
    public static final void method882(boolean arg0, String arg1, Throwable arg2) {
        field2757++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class67.method356((byte) -116, arg2);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class28.field457.field2873 != null) {
                class22 var8 = class28.field457.method911(0, new URL(class28.field457.field2873.getCodeBase(), "clienterror.ws?c=" + class154.field3041 + "&u=" + class46.field735 + "&v1=" + class149.field2878 + "&v2=" + class149.field2883 + "&e=" + var7));
                if (!arg0) {
                    field2737 = null;
                }
                while (var8.field344 == 0) {
                    class39.method212(-108, 1L);
                }
                if (var8.field344 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field342;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)I")
    public final int method883(byte arg0) {
        if (arg0 != -95) {
            this.field2739 = null;
        }
        field2761++;
        return this.field2755 == -1 ? (this.field2747[0] << 25) + (this.field2739[0] << 15) + (this.field2747[4] << 20) + (this.field2739[11] << 5) + (this.field2739[8] << 10) + this.field2739[1] : class200.method1313(this.field2755, 9).field3808 + 305419896;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II[B)I")
    public static final int method884(int arg0, int arg1, byte[] arg2) {
        field2751++;
        if (arg1 != -1506) {
            field2749 = -52;
        }
        return class29.method161(arg2, arg0, (byte) -64, 0);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIZ)V")
    public final void method885(int arg0, int arg1, boolean arg2) {
        if (arg0 != -1) {
            field2749 = -21;
        }
        field2764++;
        if (arg1 == 1 && this.field2767) {
            return;
        }
        int var4 = this.field2739[class157.field3110[arg1]];
        if (var4 == 0) {
            return;
        }
        var4 -= 256;
        class157 var5;
        do {
            if (arg2) {
                var4++;
                if (class204.field3950 <= var4) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class204.field3950 - 1;
                }
            }
            var5 = class75.method387(var4, (byte) -119);
        } while (var5 == null || var5.field3111 || var5.field3106 != (this.field2767 ? 7 : 0) + arg1);
        this.field2739[class157.field3110[arg1]] = var4 + 256;
        this.method877(1);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([IIZ[IZ)V")
    public final void method886(int[] arg0, int arg1, boolean arg2, int[] arg3, boolean arg4) {
        if (arg3 == null) {
            arg3 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class204.field3950; var7++) {
                    class157 var8 = class75.method387(var7, (byte) -118);
                    if (var8 != null && !var8.field3111 && (arg4 ? 7 : 0) + var6 == var8.field3106) {
                        arg3[class157.field3110[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        this.field2755 = arg1;
        if (!arg2) {
            return;
        }
        this.field2747 = arg0;
        field2744++;
        this.field2767 = arg4;
        this.field2739 = arg3;
        this.method877(1);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZLrd;)V")
    public final void method887(boolean arg0, class158 arg1) {
        field2748++;
        arg1.method1069(this.field2767 ? 1 : 0, (byte) -26);
        int var3 = 0;
        if (!arg0) {
            field2737 = null;
        }
        while (var3 < 7) {
            int var5 = this.field2739[class157.field3110[var3]];
            if (var5 == 0) {
                arg1.method1069(-1, (byte) -26);
            } else {
                arg1.method1069(var5 - 256, (byte) -26);
            }
            var3++;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg1.method1069(this.field2747[var4], (byte) -26);
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
    public static void method888(int arg0) {
        field2768 = null;
        field2758 = null;
        field2742 = null;
        field2752 = null;
        field2745 = null;
        field2766 = null;
        if (arg0 == -1918) {
            field2765 = null;
            field2737 = null;
            field2759 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)V")
    public static final void method889(int arg0, int arg1) {
        field2756++;
        if (arg1 != 26676) {
            method882(true, null, null);
        }
        class95.method534((byte) -60);
        class142.method892(false);
        int var2 = class131.method767(arg0, (byte) 75).field3949;
        if (var2 == 0) {
            return;
        }
        int var3 = class47.field758[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class150.method923(0.9F);
            }
            if (var3 == 2) {
                class150.method923(0.8F);
            }
            if (var3 == 3) {
                class150.method923(0.7F);
            }
            if (var3 == 4) {
                class150.method923(0.6F);
            }
            class23.method132(true);
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class79.field1408 != var4) {
                if (class79.field1408 == 0 && class191.field3735 != -1) {
                    class46.method246(var4, 0, class191.field3735, class63.field1000, (byte) 127, false);
                    class171.field3393 = false;
                } else if (var4 == 0) {
                    class4.method22(true);
                    class171.field3393 = false;
                } else {
                    class197.method1261(var4, 26138);
                }
                class79.field1408 = var4;
            }
        }
        if (var2 == 6) {
            class179.field3552 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class167.field3334 = 127;
            }
            if (var3 == 1) {
                class167.field3334 = 96;
            }
            if (var3 == 2) {
                class167.field3334 = 64;
            }
            if (var3 == 3) {
                class167.field3334 = 32;
            }
            if (var3 == 4) {
                class167.field3334 = 0;
            }
        }
        if (var2 == 9) {
            class144.field2809 = var3;
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class69.field1277 = 127;
            }
            if (var3 == 1) {
                class69.field1277 = 96;
            }
            if (var3 == 2) {
                class69.field1277 = 64;
            }
            if (var3 == 3) {
                class69.field1277 = 32;
            }
            if (var3 == 4) {
                class69.field1277 = 0;
            }
        }
        if (var2 == 5) {
            class188.field3680 = var3;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljg;BLjg;)I")
    public static final int method890(class89 arg0, byte arg1, class89 arg2) {
        field2754++;
        if (arg1 != 14) {
            method889(-43, 28);
        }
        int var3 = 0;
        if (arg0.method450(class147.field2838, 0, class148.field2863)) {
            var3++;
        }
        if (arg2.method450(class14.field245, 0, class148.field2863)) {
            var3++;
        }
        if (arg2.method450(class201.field3903, arg1 ^ 0xE, class148.field2863)) {
            var3++;
        }
        if (arg2.method450(class83.field1523, arg1 - 14, class148.field2863)) {
            var3++;
        }
        if (arg2.method450(class85.field1548, arg1 ^ 0xE, class148.field2863)) {
            var3++;
        }
        if (arg2.method450(class111.field2004, 0, class148.field2863)) {
            var3++;
        }
        arg2.method450(class66.field1188, arg1 ^ 0xE, class148.field2863);
        arg2.method450(class30.field506, 0, class148.field2863);
        arg2.method450(class133.field2543, 0, class148.field2863);
        arg2.method450(class205.field3970, 0, class148.field2863);
        arg2.method450(class197.field3835, 0, class148.field2863);
        return var3;
    }
}
