import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class196 {

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "Z")
    public boolean field2758 = false;

    @OriginalMember(owner = "client!tp", name = "k", descriptor = "I")
    public int field2765 = -1;

    @OriginalMember(owner = "client!tp", name = "u", descriptor = "I")
    public int field2775 = 5;

    @OriginalMember(owner = "client!tp", name = "o", descriptor = "I")
    public int field2769 = 2;

    @OriginalMember(owner = "client!tp", name = "l", descriptor = "Z")
    public boolean field2766 = false;

    @OriginalMember(owner = "client!tp", name = "q", descriptor = "I")
    public int field2771 = -1;

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "I")
    public int field2759 = -1;

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
    public int field2761 = -1;

    @OriginalMember(owner = "client!tp", name = "p", descriptor = "I")
    public int field2770 = -1;

    @OriginalMember(owner = "client!tp", name = "j", descriptor = "I")
    public int field2764 = 99;

    @OriginalMember(owner = "client!tp", name = "E", descriptor = "Z")
    public boolean field2785 = false;

    @OriginalMember(owner = "client!tp", name = "y", descriptor = "Z")
    public boolean field2779 = false;

    @OriginalMember(owner = "client!tp", name = "z", descriptor = "I")
    public static int field2780 = 0;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "Ljn;")
    public static class409 field2755 = new class409("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!tp", name = "m", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!tp", name = "n", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!tp", name = "r", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!tp", name = "s", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!tp", name = "w", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!tp", name = "x", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!tp", name = "A", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!tp", name = "B", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!tp", name = "C", descriptor = "I")
    public int field2783;

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "[I")
    private int[] field2760;

    @OriginalMember(owner = "client!tp", name = "i", descriptor = "[I")
    public int[] field2763;

    @OriginalMember(owner = "client!tp", name = "D", descriptor = "[I")
    public int[] field2784;

    @OriginalMember(owner = "client!tp", name = "t", descriptor = "[Z")
    public boolean[] field2774;

    @OriginalMember(owner = "client!tp", name = "v", descriptor = "[[I")
    public int[][] field2776;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIILbi;II)Lbi;", line = 10)
    public final class143 method1360(int arg0, int arg1, int arg2, class143 arg3, int arg4, int arg5) {
        field2757++;
        int var7 = this.field2763[arg4];
        int var8 = this.field2784[arg4];
        class213 var9 = class191.method1335(104, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg3.method966((byte) 1, arg5, true);
        }
        class213 var11 = null;
        if ((this.field2758 || class47.field616) && arg1 != -1 && this.field2784.length > arg1) {
            int var12 = this.field2784[arg1];
            var11 = class191.method1335(20, var12 >> 16);
            arg1 = var12 & 0xFFFF;
        }
        class213 var13 = null;
        class213 var14 = null;
        if (arg2 != 1) {
            this.field2763 = null;
        }
        int var15 = 0;
        int var16 = 0;
        if (this.field2760 != null) {
            if (this.field2760.length > arg4) {
                var15 = this.field2760[arg4];
                if (var15 != 65535) {
                    var13 = class191.method1335(arg2 + 66, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field2758 || class47.field616) && arg1 != -1 && arg1 < this.field2760.length) {
                var16 = this.field2760[arg1];
                if (var16 != 65535) {
                    var14 = class191.method1335(17, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field2779) {
            arg5 |= 0x200;
        }
        if (var9.method1458(var10, 100)) {
            arg5 |= 0x80;
        }
        if (var9.method1461(3, var10)) {
            arg5 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method1458(var15, 116)) {
                arg5 |= 0x80;
            }
            if (var13.method1461(3, var15)) {
                arg5 |= 0x100;
            }
        }
        if (var11 != null) {
            if (var11.method1458(arg1, 118)) {
                arg5 |= 0x80;
            }
            if (var11.method1461(3, arg1)) {
                arg5 |= 0x100;
            }
        }
        if (var14 != null) {
            if (var14.method1458(var16, 101)) {
                arg5 |= 0x80;
            }
            if (var14.method1461(3, var16)) {
                arg5 |= 0x100;
            }
        }
        int var17 = arg5 | 0x20;
        class143 var18 = arg3.method966((byte) 1, var17, true);
        var18.method984(var10, var9, arg1, arg2 + 27866, arg0 + -1, this.field2779, 0, var7, var11);
        if (var13 != null) {
            var18.method984(var15, var13, var16, arg2 + 27866, arg0 + -1, this.field2779, 0, var7, var14);
        }
        return var18;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)V", line = 129)
    public static final void method1361(int arg0, int arg1) {
        field2768++;
        if (arg1 != -1) {
            field2780 = 115;
        }
        class363 var2 = class298.field4339;
        synchronized (class298.field4339) {
            class298.field4339.method2300(arg0, true);
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V", line = 145)
    public final void method1362(int arg0) {
        if (arg0 != 2) {
            method1367((byte[]) null, true, (byte) -16);
        }
        if (this.field2771 == -1) {
            if (this.field2774 == null) {
                this.field2771 = 0;
            } else {
                this.field2771 = 2;
            }
        }
        field2762++;
        if (this.field2770 != -1) {
            return;
        }
        if (this.field2774 == null) {
            this.field2770 = 0;
        } else {
            this.field2770 = 2;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(BLat;)V", line = 182)
    public final void method1363(byte arg0, class256 arg1) {
        if (arg0 < 104) {
            return;
        }
        field2782++;
        while (true) {
            int var3 = arg1.method1738((byte) -29);
            if (var3 == 0) {
                return;
            }
            this.method1368(65535, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIBIBLbi;II)Lbi;", line = 204)
    public final class143 method1364(int arg0, int arg1, byte arg2, int arg3, byte arg4, class143 arg5, int arg6, int arg7) {
        field2777++;
        int var9 = this.field2763[arg6];
        int var10 = this.field2784[arg6];
        class213 var11 = class191.method1335(79, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg5.method966(arg2, arg7, true);
        }
        class213 var13 = null;
        if ((this.field2758 || class47.field616) && arg0 != -1 && arg0 < this.field2784.length) {
            int var14 = this.field2784[arg0];
            var13 = class191.method1335(108, var14 >> 16);
            arg0 = var14 & 0xFFFF;
        }
        if (this.field2779) {
            arg7 |= 0x200;
        }
        if (var11.method1458(var12, 113)) {
            arg7 |= 0x80;
        }
        if (var11.method1461(3, var12)) {
            arg7 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method1458(arg0, 80)) {
                arg7 |= 0x80;
            }
            if (var13.method1461(3, arg0)) {
                arg7 |= 0x100;
            }
        }
        int var15 = arg7 | 0x20;
        class143 var16 = arg5.method966(arg2, var15, true);
        var16.method984(var12, var11, arg0, 27867, arg3 - 1, this.field2779, arg1, var9, var13);
        if (arg4 != 117) {
            this.field2761 = -112;
        }
        return var16;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZIIII)V", line = 277)
    public static final void method1365(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!arg0) {
            method1365(true, 31, 123, 124, 1);
        }
        if (arg4 > arg2) {
            for (int var5 = arg2; var5 < arg4; var5++) {
                class323.field4774[var5][arg3] = arg1;
            }
        } else {
            for (int var6 = arg4; var6 < arg2; var6++) {
                class323.field4774[var6][arg3] = arg1;
            }
        }
        field2778++;
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)V", line = 312)
    public static void method1366(int arg0) {
        field2755 = null;
        if (arg0 >= -68) {
            field2755 = null;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "([BZB)Ljava/lang/Object;", line = 329)
    public static final Object method1367(byte[] arg0, boolean arg1, byte arg2) {
        field2772++;
        if (arg0 == null) {
            return null;
        }
        if (arg2 != 33) {
            field2755 = null;
        }
        if (arg0.length > 136 && !class230.field3451) {
            try {
                class240 var3 = (class240) Class.forName("an").getDeclaredConstructor().newInstance();
                var3.method1620(arg0, (byte) -106);
                return var3;
            } catch (Throwable var4) {
                class230.field3451 = true;
            }
        }
        return arg1 ? class455.method2821(arg0, arg2 + 93) : arg0;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IILat;)V", line = 362)
    private final void method1368(int arg0, int arg1, class256 arg2) {
        if (arg1 == 1) {
            int var13 = arg2.method1767(1930493576);
            this.field2763 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field2763[var14] = arg2.method1767(1930493576);
            }
            this.field2784 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field2784[var15] = arg2.method1767(1930493576);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field2784[var16] += arg2.method1767(1930493576) << 16;
            }
        } else if (arg1 == 2) {
            this.field2761 = arg2.method1767(1930493576);
        } else if (arg1 == 3) {
            this.field2774 = new boolean[256];
            int var11 = arg2.method1738((byte) 54);
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2774[arg2.method1738((byte) 95)] = true;
            }
        } else if (arg1 == 4) {
            this.field2785 = true;
        } else if (arg1 == 5) {
            this.field2775 = arg2.method1738((byte) -91);
        } else if (arg1 == 6) {
            this.field2765 = arg2.method1767(1930493576);
        } else if (arg1 == 7) {
            this.field2759 = arg2.method1767(1930493576);
        } else if (arg1 == 8) {
            this.field2764 = arg2.method1738((byte) 74);
        } else if (arg1 == 9) {
            this.field2771 = arg2.method1738((byte) 111);
        } else if (arg1 == 10) {
            this.field2770 = arg2.method1738((byte) 72);
        } else if (arg1 == 11) {
            this.field2769 = arg2.method1738((byte) -84);
        } else if (arg1 == 12) {
            int var8 = arg2.method1738((byte) 126);
            this.field2760 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2760[var9] = arg2.method1767(1930493576);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field2760[var10] = (arg2.method1767(class134.method895(arg0, 1930428791)) << 16) + this.field2760[var10];
            }
        } else if (arg1 == 13) {
            int var4 = arg2.method1767(arg0 + 1930428041);
            this.field2776 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1738((byte) 124);
                if (var6 > 0) {
                    this.field2776[var5] = new int[var6];
                    this.field2776[var5][0] = arg2.method1725((byte) 0);
                    for (int var7 = 1; var7 < var6; var7++) {
                        this.field2776[var5][var7] = arg2.method1767(1930493576);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field2779 = true;
        } else if (arg1 == 15) {
            this.field2758 = true;
        } else if (arg1 == 16) {
            this.field2766 = true;
        }
        field2767++;
        if (arg0 != 65535) {
            method1370(-100, true, -62);
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(BZII)I", line = 529)
    public final int method1369(byte arg0, boolean arg1, int arg2, int arg3) {
        field2773++;
        int var5 = 0;
        int var6 = 0;
        if (arg0 != -42) {
            this.field2779 = true;
        }
        int var7 = this.field2784[arg2];
        class213 var8 = null;
        class213 var9 = class191.method1335(arg0 + 56, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field2758 || class47.field616) && arg3 != -1 && arg3 < this.field2784.length) {
            int var11 = this.field2784[arg3];
            var8 = class191.method1335(13, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field2779) {
            var5 |= 0x200;
        }
        if (var9.method1458(var10, arg0 ^ 0xFFFFFF90)) {
            var5 |= 0x80;
        }
        if (var9.method1461(arg0 + 45, var10)) {
            var5 |= 0x100;
        }
        if (var8 != null) {
            if (var8.method1458(var6, 119)) {
                var5 |= 0x80;
            }
            if (var8.method1461(3, var6)) {
                var5 |= 0x100;
            }
        }
        if (this.field2760 != null && arg1) {
            if (this.field2760.length > arg2) {
                int var12 = this.field2760[arg2];
                if (var12 != 65535) {
                    class213 var13 = class191.method1335(119, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method1458(var14, 66)) {
                            var5 |= 0x80;
                        }
                        if (var13.method1461(3, var14)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
            if ((this.field2758 || class47.field616) && arg3 != -1 && arg3 < this.field2760.length) {
                int var15 = this.field2760[arg3];
                if (var15 != 65535) {
                    class213 var16 = class191.method1335(19, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method1458(var17, 64)) {
                            var5 |= 0x80;
                        }
                        if (var16.method1461(3, var17)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IZI)I", line = 639)
    public static final int method1370(int arg0, boolean arg1, int arg2) {
        field2756++;
        if (arg1) {
            return 0;
        } else if (arg0 == 9403) {
            class243 var3 = class46.method378(arg2, arg1, false);
            if (var3 == null) {
                return class281.method1897((byte) 101, arg2).field1872;
            }
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field3599.length; var5++) {
                if (var3.field3599[var5] == -1) {
                    var4++;
                }
            }
            return var4 + (class281.method1897((byte) 101, arg2).field1872 - var3.field3599.length);
        } else {
            return -77;
        }
    }

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "(I)Z", line = 685)
    public static final boolean method1371(int arg0) throws IOException {
        field2781++;
        if (class72.field933 == null) {
            return false;
        }
        int var1 = class72.field933.method2705(-105);
        if (arg0 == var1) {
            return false;
        }
        if (class30.field421 == null) {
            if (class346.field5098) {
                class72.field933.method2702(0, 1, class22.field306.field3764, (byte) 107);
                var1--;
                class346.field5098 = false;
            }
            class22.field306.field3762 = 0;
            if (class22.field306.method775(-5846)) {
                if (var1 == 0) {
                    return false;
                }
                class72.field933.method2702(1, 1, class22.field306.field3764, (byte) 95);
                var1--;
            }
            class346.field5098 = true;
            class24[] var2 = class372.method2362(true);
            int var3 = class22.field306.method769(-124);
            if (var3 < 0 || var2.length <= var3) {
                throw new IOException("invo:" + var3);
            }
            class30.field421 = var2[var3];
            class35.field496 = class30.field421.field335;
        }
        if (class35.field496 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class72.field933.method2702(0, 1, class22.field306.field3764, (byte) 126);
            var1--;
            class35.field496 = class22.field306.field3764[0] & 0xFF;
        }
        if (class35.field496 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class72.field933.method2702(0, 2, class22.field306.field3764, (byte) 94);
            class22.field306.field3762 = 0;
            class35.field496 = class22.field306.method1767(1930493576);
            var1 -= 2;
        }
        if (var1 < class35.field496) {
            return false;
        }
        class22.field306.field3762 = 0;
        class72.field933.method2702(0, class35.field496, class22.field306.field3764, (byte) 122);
        class184.field2595 = 0;
        class251.field3687 = class444.field6471;
        class444.field6471 = class53.field661;
        class53.field661 = class30.field421;
        if (class30.field421 == class124.field1649) {
            int var4 = class22.field306.method1729(false);
            String var5 = class22.field306.method1715(true);
            int var6 = class22.field306.method1718((byte) -127);
            if (class202.method1393(var4, false)) {
                class226.method1551(3, var5, var6);
            }
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class139.field1910) {
            int var7 = class22.field306.method1745(-1106334908);
            int var8 = class22.field306.method1745(-1106334908);
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = class22.field306.method1745(-1106334908);
            if (var9 == 65535) {
                var9 = -1;
            }
            int var10 = class22.field306.method1752(-17090);
            int var11 = class22.field306.method1729(false);
            if (class202.method1393(var11, false)) {
                for (int var12 = var9; var12 <= var8; var12++) {
                    long var13 = ((long) var10 << 32) + (long) var12;
                    class332 var15 = (class332) class51.field635.method609(var13, 47);
                    class332 var16;
                    if (var15 != null) {
                        var16 = new class332(var15.field4926, var7);
                        var15.method1820(-25246);
                    } else if (var12 == -1) {
                        var16 = new class332(class432.method2655((byte) -111, var10).field3331.field4926, var7);
                    } else {
                        var16 = new class332(0, var7);
                    }
                    class51.field635.method606(1, var16, var13);
                }
            }
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class125.field1661) {
            int var17 = class22.field306.method1729(false);
            int var18 = class22.field306.method1767(1930493576);
            int var19 = class22.field306.method1749(arg0 ^ 0x64);
            if (class202.method1393(var18, false)) {
                class93.method633(var17, var19, false);
            }
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class120.field1604) {
            if (class318.field4672 != -1) {
                class433.method2657(0, (byte) -76, class318.field4672);
            }
            class30.field421 = null;
            return true;
        } else if (class432.field6297 == class30.field421) {
            int var20 = class22.field306.method1745(-1106334908);
            int var21 = class22.field306.method1752(-17090);
            int var22 = class22.field306.method1736(arg0 + 65280);
            int var23 = class22.field306.method1746(arg0 ^ 0x51EC);
            if (class202.method1393(var22, false)) {
                class283.method1906(5, arg0 ^ 0xFFFFFFD6, var21, var20, var23);
            }
            class30.field421 = null;
            return true;
        } else if (class397.field5768 == class30.field421) {
            class317.field4651 = class22.field306.method1738((byte) 66);
            class189.field2647 = class22.field306.method1762((byte) -33);
            class427.field6216 = class22.field306.method1762((byte) -33);
            for (class447 var24 = (class447) class200.field2828.method608((byte) 125); var24 != null; var24 = (class447) class200.field2828.method604(-115)) {
                int var26 = (int) (var24.field3907 & 0x3FFFL);
                int var27 = (int) (var24.field3907 >> 14 & 0x3FFFL);
                int var28 = (int) (var24.field3907 >> 28 & 0x3L);
                if (class317.field4651 == var28 && var26 >= class427.field6216 && class427.field6216 + 8 > var26 && var27 >= class189.field2647 && class189.field2647 + 8 > var27) {
                    var24.method1820(-25246);
                    class342.method2224(true, var26, var27, class317.field4651);
                }
            }
            for (class265 var25 = (class265) class276.field4087.method2478(1603); var25 != null; var25 = (class265) class276.field4087.method2486((byte) -82)) {
                if (var25.field3937 >= class427.field6216 && var25.field3937 < class427.field6216 + 8 && class189.field2647 <= var25.field3915 && class189.field2647 + 8 > var25.field3915 && class317.field4651 == var25.field3927) {
                    var25.field3934 = 0;
                }
            }
            class30.field421 = null;
            return true;
        } else if (class431.field6279 == class30.field421) {
            int var29 = class22.field306.method1736(65280);
            int var30 = class22.field306.method1749(-41);
            int var31 = class22.field306.method1729(false);
            if (class202.method1393(var31, false)) {
                class329.method2152(arg0 ^ 0x6F79, var29, var30);
            }
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class291.field4261) {
            int var32 = class22.field306.method1767(1930493576);
            if (class202.method1393(var32, false)) {
                class308.method2058((byte) -119);
            }
            class30.field421 = null;
            return true;
        } else if (class440.field6412 == class30.field421) {
            int var33 = class22.field306.method1767(1930493576);
            int var34 = class22.field306.method1738((byte) -87);
            boolean var35 = (var34 & 0x1) == 1;
            while (class35.field496 > class22.field306.field3762) {
                int var36 = class22.field306.method1740(128);
                int var37 = class22.field306.method1767(1930493576);
                int var38 = 0;
                if (var37 != 0) {
                    var38 = class22.field306.method1738((byte) 127);
                    if (var38 == 255) {
                        var38 = class22.field306.method1746(arg0 + 20972);
                    }
                }
                class113.method797(var33, var38, -1, var36, var35, var37 - 1);
            }
            class259.field3837[class386.method2438(class429.field6231++, 31)] = var33;
            class30.field421 = null;
            return true;
        } else if (class363.field5239 == class30.field421) {
            int var39 = class22.field306.method1729(false);
            int var40 = class22.field306.method1745(-1106334908);
            int var41 = class22.field306.method1736(65280);
            int var42 = class22.field306.method1749(122);
            if (class202.method1393(var40, false)) {
                class152.method1044(var42, (var39 << 16) + var41, (byte) 1);
            }
            class30.field421 = null;
            return true;
        } else if (class390.field5685 == class30.field421) {
            for (int var43 = 0; var43 < class455.field6731.length; var43++) {
                if (class455.field6731[var43] != null) {
                    class455.field6731[var43].field751 = -1;
                }
            }
            for (int var44 = 0; var44 < class364.field5260.length; var44++) {
                if (class364.field5260[var44] != null) {
                    class364.field5260[var44].field751 = -1;
                }
            }
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class113.field1549) {
            int var45 = class22.field306.method1749(-68);
            int var46 = class22.field306.method1745(-1106334908);
            if (class202.method1393(var46, false)) {
                class283.method1906(3, -42, -1, -1, var45);
            }
            class30.field421 = null;
            return true;
        } else if (class435.field6335 == class30.field421) {
            class125.method845(class142.field1932, (byte) 104);
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class253.field3717) {
            int var47 = class22.field306.method1746(20972);
            int var48 = class22.field306.method1736(arg0 + 65280);
            int var49 = class22.field306.method1736(arg0 ^ 0xFF00);
            if (class202.method1393(var48, false)) {
                class237.method1597(var47, true, var49);
            }
            class30.field421 = null;
            return true;
        } else if (class395.field5754 == class30.field421) {
            int var50 = class22.field306.method1767(1930493576);
            int var51 = class22.field306.method1767(arg0 ^ 0x7310FE88);
            int var52 = class22.field306.method1767(1930493576);
            int var53 = class22.field306.method1767(1930493576);
            if (class202.method1393(var50, false) && class444.field6470[var51] != null) {
                for (int var54 = var52; var54 < var53; var54++) {
                    int var55 = class22.field306.method1725((byte) 0);
                    if (class444.field6470[var51].length > var54 && class444.field6470[var51][var54] != null) {
                        class444.field6470[var51][var54].field3308 = var55;
                    }
                }
            }
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class104.field1361) {
            String var56 = class22.field306.method1715(true);
            String var57 = class51.method393((byte) -128, class429.method2642((byte) 72, class5.method48(true, class22.field306)));
            class141.method932(6, 0, var56, var57, true, var56);
            class30.field421 = null;
            return true;
        } else if (class328.field4890 == class30.field421) {
            int var58 = class22.field306.method1767(1930493576);
            if (class202.method1393(var58, false)) {
                class137.method912(1);
            }
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class233.field3498) {
            int var59 = class22.field306.method1767(1930493576);
            int var60 = class22.field306.method1738((byte) -74);
            int var61 = class22.field306.method1729(false);
            if (class202.method1393(var59, false)) {
                if (var60 == 2) {
                    class67.method503(false);
                }
                class318.field4672 = var61;
                class458.method2838(var61, -12823);
                class298.method1981(false, (byte) -47);
                class107.method764(class318.field4672);
                for (int var62 = 0; var62 < 100; var62++) {
                    class344.field5053[var62] = true;
                }
            }
            class30.field421 = null;
            return true;
        } else if (class58.field778 == class30.field421) {
            class187.method1280((byte) -119, class22.field306.method1715(true));
            class30.field421 = null;
            return true;
        } else if (class329.field4897 == class30.field421) {
            boolean var63 = class22.field306.method1738((byte) 101) == 1;
            String var64 = class22.field306.method1715(true);
            String var65 = var64;
            if (var63) {
                var65 = class22.field306.method1715(true);
            }
            long var66 = class22.field306.method1754(true);
            long var68 = (long) class22.field306.method1767(1930493576);
            long var70 = (long) class22.field306.method1725((byte) 0);
            int var72 = class22.field306.method1738((byte) 52);
            long var73 = (var68 << 32) + var70;
            boolean var75 = false;
            int var76 = 0;
            while (true) {
                if (var76 >= 100) {
                    if (var72 <= 1) {
                        if (!(!class236.field3523 || class395.field5747) || class74.field943) {
                            var75 = true;
                        } else if (class256.method1722((byte) -110, var65)) {
                            var75 = true;
                        }
                    }
                    break;
                }
                if (class42.field569[var76] == var73) {
                    var75 = true;
                    break;
                }
                var76++;
            }
            if (!var75 && class186.field2608 == 0) {
                class42.field569[class167.field2207] = var73;
                class167.field2207 = (class167.field2207 + 1) % 100;
                String var77 = class51.method393((byte) -110, class429.method2642((byte) 72, class5.method48(true, class22.field306)));
                if (var72 == 2 || var72 == 3) {
                    class339.method2187("<img=1>" + var64, class239.method1606(var66, (byte) -82), arg0 + 31967, var77, "<img=1>" + var65, 9, 0, -1);
                } else if (var72 == 1) {
                    class339.method2187("<img=0>" + var64, class239.method1606(var66, (byte) -91), 31967, var77, "<img=0>" + var65, 9, 0, -1);
                } else {
                    class339.method2187(var64, class239.method1606(var66, (byte) -117), arg0 + 31967, var77, var65, 9, 0, -1);
                }
            }
            class30.field421 = null;
            return true;
        } else if (class383.field5614 == class30.field421) {
            class125.method845(class400.field5777, (byte) 108);
            class30.field421 = null;
            return true;
        } else if (class456.field6748 == class30.field421) {
            int var78 = class22.field306.method1741((byte) 24);
            int var79 = class22.field306.method1736(65280);
            if (var79 == 65535) {
                var79 = -1;
            }
            class310.method2061(var78, var79, arg0);
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class1.field12) {
            int var80 = class22.field306.method1745(-1106334908);
            if (var80 == 65535) {
                var80 = -1;
            }
            int var81 = class22.field306.method1762((byte) -33);
            int var82 = class22.field306.method1725((byte) 0);
            class260.method1788(var80, var81, var82, (byte) -83);
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class213.field2996) {
            class125.method845(class345.field5069, (byte) 118);
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class159.field2131) {
            int var83 = class22.field306.method1741((byte) 24);
            int var84 = class22.field306.method1729(false);
            if (class202.method1393(var84, false)) {
                class308.field4550 = var83;
            }
            class30.field421 = null;
            return true;
        } else if (class86.field1054 == class30.field421) {
            int var85 = class22.field306.method1767(1930493576);
            int var86 = class22.field306.method1738((byte) 81);
            int var87 = class22.field306.method1738((byte) 73);
            int var88 = class22.field306.method1738((byte) -127);
            int var89 = class22.field306.method1738((byte) -74);
            int var90 = class22.field306.method1767(1930493576);
            if (class202.method1393(var85, false)) {
                class260.field3858[var86] = true;
                class2.field25[var86] = var87;
                class14.field229[var86] = var88;
                class265.field3924[var86] = var89;
                class51.field645[var86] = var90;
            }
            class30.field421 = null;
            return true;
        } else if (class420.field6087 == class30.field421) {
            int var91 = class22.field306.method1767(arg0 + 1930493576);
            if (var91 == 65535) {
                var91 = -1;
            }
            int var92 = class22.field306.method1738((byte) -111);
            int var93 = class22.field306.method1767(1930493576);
            int var94 = class22.field306.method1738((byte) -121);
            class7.method57(var93, true, var92, var91, var94);
            class30.field421 = null;
            return true;
        } else if (class35.field502 == class30.field421) {
            boolean var95 = class22.field306.method1738((byte) 108) == 1;
            String var96 = class22.field306.method1715(true);
            String var97 = class22.field306.method1715(true);
            int var98 = class22.field306.method1767(arg0 ^ 0x7310FE88);
            int var99 = class22.field306.method1738((byte) -118);
            String var100 = "";
            boolean var101 = false;
            if (var98 > 0) {
                var100 = class22.field306.method1715(true);
                var101 = class22.field306.method1738((byte) -117) == 1;
            }
            for (int var102 = 0; var102 < class373.field5450; var102++) {
                if (var95) {
                    if (var97.equals(class271.field4015[var102])) {
                        class271.field4015[var102] = var96;
                        var96 = null;
                        class419.field6077[var102] = var97;
                        break;
                    }
                } else if (var96.equals(class271.field4015[var102])) {
                    if (class57.field699[var102] != var98) {
                        class57.field699[var102] = var98;
                        if (var98 > 0) {
                            class141.method932(5, 0, "", var96 + class151.field2048.method2543(false, class153.field2073), true, "");
                        }
                        if (var98 == 0) {
                            class141.method932(5, 0, "", var96 + class88.field1078.method2543(false, class153.field2073), true, "");
                        }
                    }
                    class419.field6077[var102] = var97;
                    class455.field6733[var102] = var100;
                    class454.field6705[var102] = var99;
                    class53.field665[var102] = var101;
                    var96 = null;
                    break;
                }
            }
            if (var96 != null && class373.field5450 < 200) {
                class271.field4015[class373.field5450] = var96;
                class419.field6077[class373.field5450] = var97;
                class57.field699[class373.field5450] = var98;
                class455.field6733[class373.field5450] = var100;
                class454.field6705[class373.field5450] = var99;
                class53.field665[class373.field5450] = var101;
                class373.field5450++;
            }
            class34.field487 = class26.field384;
            boolean var103 = false;
            int var104 = class373.field5450;
            while (var104 > 0) {
                var104--;
                boolean var105 = true;
                for (int var106 = 0; var106 < var104; var106++) {
                    if (class57.field699[var106] != class403.field5825 && class57.field699[var106 + 1] == class403.field5825 || class57.field699[var106] == 0 && class57.field699[var106 + 1] != 0) {
                        int var107 = class57.field699[var106];
                        class57.field699[var106] = class57.field699[var106 + 1];
                        class57.field699[var106 + 1] = var107;
                        String var108 = class455.field6733[var106];
                        class455.field6733[var106] = class455.field6733[var106 + 1];
                        class455.field6733[var106 + 1] = var108;
                        String var109 = class271.field4015[var106];
                        class271.field4015[var106] = class271.field4015[var106 + 1];
                        class271.field4015[var106 + 1] = var109;
                        String var110 = class419.field6077[var106];
                        class419.field6077[var106] = class419.field6077[var106 + 1];
                        class419.field6077[var106 + 1] = var110;
                        int var111 = class454.field6705[var106];
                        class454.field6705[var106] = class454.field6705[var106 + 1];
                        class454.field6705[var106 + 1] = var111;
                        boolean var112 = class53.field665[var106];
                        class53.field665[var106] = class53.field665[var106 + 1];
                        class53.field665[var106 + 1] = var112;
                        var105 = false;
                    }
                }
                if (var105) {
                    break;
                }
            }
            class30.field421 = null;
            return true;
        } else if (class47.field610 == class30.field421) {
            class125.method845(class34.field491, (byte) 103);
            class30.field421 = null;
            return true;
        } else if (class67.field889 == class30.field421) {
            int var113 = class22.field306.method1767(1930493576);
            int var114 = class22.field306.method1746(arg0 + 20972);
            if (class202.method1393(var113, false)) {
                class182 var115 = (class182) class252.field3703.method609((long) var114, arg0 + 127);
                if (var115 != null) {
                    class240.method1615(false, true, (byte) 95, var115);
                }
                if (class378.field5539 != null) {
                    class15.method216((byte) 122, class378.field5539);
                    class378.field5539 = null;
                }
            }
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class180.field2549) {
            int var116 = class22.field306.method1767(1930493576);
            String var117 = class22.field306.method1715(true);
            Object[] var118 = new Object[var117.length() + 1];
            for (int var119 = var117.length() - 1; var119 >= 0; var119--) {
                if (var117.charAt(var119) == 's') {
                    var118[var119 + 1] = class22.field306.method1715(true);
                } else {
                    var118[var119 + 1] = Integer.valueOf(class22.field306.method1746(arg0 + 20972));
                }
            }
            var118[0] = Integer.valueOf(class22.field306.method1746(20972));
            if (class202.method1393(var116, false)) {
                class288 var120 = new class288();
                var120.field4218 = var118;
                class107.method762(var120);
            }
            class30.field421 = null;
            return true;
        } else if (class432.field6299 == class30.field421) {
            int var121 = class22.field306.method1767(1930493576);
            int var122 = class22.field306.method1752(-17090);
            if (class202.method1393(var121, false)) {
                class283.method1906(5, -42, 0, class420.field6085, var122);
            }
            class30.field421 = null;
            return true;
        } else if (class31.field425 == class30.field421) {
            class22.field306.field3762 += 28;
            if (class22.field306.method1766(128)) {
                class120.method818((byte) 4, class22.field306.field3762 - 28, class22.field306);
            }
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class260.field3847) {
            int var123 = class22.field306.method1729(false);
            String var124 = class22.field306.method1715(true);
            int var125 = class22.field306.method1736(65280);
            if (class202.method1393(var123, false)) {
                class189.method1290(var125, (byte) 8, var124);
            }
            class30.field421 = null;
            return true;
        } else if (class32.field446 == class30.field421) {
            class129.method869(-29535, class35.field496, class22.field306, class267.field3963);
            class30.field421 = null;
            return true;
        } else if (class376.field5489 == class30.field421) {
            int var126 = class22.field306.method1734((byte) 85);
            int var127 = class22.field306.method1736(65280);
            int var128 = class22.field306.method1746(arg0 ^ 0x51EC);
            if (class202.method1393(var127, false)) {
                class90.method605(var126, var128, (byte) -29);
            }
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class159.field2130) {
            int var129 = class22.field306.method1746(20972);
            class308.field4551 = class267.field3963.method2204(var129, (byte) 84);
            class30.field421 = null;
            return true;
        } else if (class366.field5300 == class30.field421) {
            if (class359.field5222 != null) {
                class370.method2358(class223.field3361, -1, -1, false, -4);
            }
            byte[] var130 = new byte[class35.field496];
            class22.field306.method774(0, class35.field496, var130, arg0 ^ 0x78);
            String var131 = class169.method1104(class35.field496, var130, 36, 0);
            class69.method510(class267.field3963, true, var131, class118.field1594 == 1, 2);
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class135.field1848) {
            int var132 = class22.field306.method1718((byte) -128);
            int var133 = class22.field306.method1736(65280);
            int var134 = class22.field306.method1745(-1106334908);
            if (var134 == 65535) {
                var134 = -1;
            }
            int var135 = class22.field306.method1752(-17090);
            if (class202.method1393(var133, false)) {
                class349.method2251(var135, var134, 8246, var132);
                class427 var136 = class157.field2119.method176((byte) -81, var134);
                class303.method2016(var136.field6185, 7232, var136.field6162, var136.field6183, var135);
                class327.method2140(var136.field6150, var136.field6207, var136.field6202, var135, false);
            }
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class245.field3624) {
            int var137 = class22.field306.method1729(false);
            String var138 = class22.field306.method1715(true);
            int var139 = class22.field306.method1736(65280);
            if (class202.method1393(var139, false)) {
                class189.method1290(var137, (byte) 40, var138);
            }
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class14.field232) {
            class395.field5753 = class22.field306.method1738((byte) 62);
            class30.field421 = null;
            class34.field487 = class26.field384;
            return true;
        } else if (class30.field421 == class29.field416) {
            class256.method1711((byte) 81);
            class30.field421 = null;
            class109.field1477 += 32;
            return true;
        } else if (class387.field5658 == class30.field421) {
            int var140 = class22.field306.method1749(arg0 + 106);
            int var141 = class22.field306.method1745(-1106334908);
            class15.method210(var140, var141, 26434);
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class29.field417) {
            int var142 = class22.field306.method1719(0);
            int var143 = class22.field306.method1729(false);
            class83.method555(var143, -27690, var142);
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class247.field3643) {
            int var144 = class22.field306.method1729(false);
            int var145 = class22.field306.method1762((byte) -33);
            int var146 = class22.field306.method1746(20972);
            if (class202.method1393(var144, false)) {
                class395.method2480((byte) -32, var145, var146);
            }
            class30.field421 = null;
            return true;
        } else if (class382.field5611 == class30.field421) {
            class110.method778((byte) -85, true);
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class234.field3504) {
            int var147 = class22.field306.method1719(arg0);
            int var148 = class22.field306.method1729(false);
            if (var148 == 65535) {
                var148 = -1;
            }
            int var149 = class22.field306.method1741((byte) 24);
            String var150 = class22.field306.method1715(true);
            if (var147 >= 1 && var147 <= 8) {
                if (var150.equalsIgnoreCase("null")) {
                    var150 = null;
                }
                class141.field1928[var147 - 1] = var150;
                class466.field6859[var147 - 1] = var148;
                class418.field6063[var147 - 1] = var149 == 0;
            }
            class30.field421 = null;
            return true;
        } else if (class386.field5639 == class30.field421) {
            class230.field3444 = class26.field384;
            if (class35.field496 == 0) {
                class142.field1937 = null;
                class253.field3720 = null;
                class418.field6032 = 0;
                class332.field4913 = null;
                class30.field421 = null;
                return true;
            }
            class332.field4913 = class22.field306.method1715(true);
            boolean var151 = class22.field306.method1738((byte) 52) == 1;
            if (var151) {
                class22.field306.method1715(true);
            }
            long var152 = class22.field306.method1754(true);
            class142.field1937 = class104.method722(var152, true);
            class382.field5607 = class22.field306.method1728((byte) 94);
            int var154 = class22.field306.method1738((byte) 95);
            if (var154 == 255) {
                class30.field421 = null;
                return true;
            }
            class418.field6032 = var154;
            class262[] var155 = new class262[100];
            for (int var156 = 0; var156 < class418.field6032; var156++) {
                var155[var156] = new class262();
                var155[var156].field3871 = class22.field306.method1715(true);
                boolean var162 = class22.field306.method1738((byte) -107) == 1;
                if (var162) {
                    var155[var156].field3865 = class22.field306.method1715(true);
                } else {
                    var155[var156].field3865 = var155[var156].field3871;
                }
                var155[var156].field3862 = class17.method223(0, var155[var156].field3865);
                var155[var156].field3863 = class22.field306.method1767(arg0 + 1930493576);
                var155[var156].field3866 = class22.field306.method1728((byte) 96);
                var155[var156].field3868 = class22.field306.method1715(true);
                if (var155[var156].field3865.equals(class187.field2619.field5587)) {
                    class96.field1180 = var155[var156].field3866;
                }
            }
            boolean var157 = false;
            int var158 = class418.field6032;
            while (var158 > 0) {
                boolean var159 = true;
                var158--;
                for (int var160 = 0; var160 < var158; var160++) {
                    if (var155[var160].field3862.compareTo(var155[var160 + 1].field3862) > 0) {
                        class262 var161 = var155[var160];
                        var155[var160] = var155[var160 + 1];
                        var159 = false;
                        var155[var160 + 1] = var161;
                    }
                }
                if (var159) {
                    break;
                }
            }
            class253.field3720 = var155;
            class30.field421 = null;
            return true;
        } else if (class83.field1021 == class30.field421) {
            int var163 = class22.field306.method1738((byte) 92);
            boolean var164 = (var163 & 0x1) == 1;
            String var165 = class22.field306.method1715(true);
            String var166 = class22.field306.method1715(true);
            if (var166.equals("")) {
                var166 = var165;
            }
            String var167 = class22.field306.method1715(true);
            String var168 = class22.field306.method1715(true);
            if (var168.equals("")) {
                var168 = var167;
            }
            if (var164) {
                for (int var169 = 0; var169 < class238.field3533; var169++) {
                    if (class187.field2612[var169].equals(var168)) {
                        class163.field2161[var169] = var165;
                        class187.field2612[var169] = var166;
                        class334.field4937[var169] = var167;
                        class403.field5832[var169] = var168;
                        break;
                    }
                }
            } else {
                class163.field2161[class238.field3533] = var165;
                class187.field2612[class238.field3533] = var166;
                class334.field4937[class238.field3533] = var167;
                class403.field5832[class238.field3533] = var168;
                class79.field996[class238.field3533] = class386.method2438(var163, 2) == 2;
                class238.field3533++;
            }
            class34.field487 = class26.field384;
            class30.field421 = null;
            return true;
        } else if (class322.field4758 == class30.field421) {
            int var170 = class22.field306.method1736(65280);
            int var171 = class22.field306.method1767(1930493576);
            int var172 = class22.field306.method1736(arg0 + 65280);
            int var173 = class22.field306.method1767(1930493576);
            int var174 = class22.field306.method1718((byte) -126);
            if (class202.method1393(var172, false)) {
                class283.method1906(7, arg0 ^ 0xFFFFFFD6, var173, var171 | var170 << 16, var174);
            }
            class30.field421 = null;
            return true;
        } else if (class311.field4587 == class30.field421) {
            class125.method845(class90.field1106, (byte) 112);
            class30.field421 = null;
            return true;
        } else if (class67.field890 == class30.field421) {
            class238.field3533 = class22.field306.method1738((byte) -127);
            for (int var175 = 0; var175 < class238.field3533; var175++) {
                class163.field2161[var175] = class22.field306.method1715(true);
                class187.field2612[var175] = class22.field306.method1715(true);
                if (class187.field2612[var175].equals("")) {
                    class187.field2612[var175] = class163.field2161[var175];
                }
                class334.field4937[var175] = class22.field306.method1715(true);
                class403.field5832[var175] = class22.field306.method1715(true);
                if (class403.field5832[var175].equals("")) {
                    class403.field5832[var175] = class334.field4937[var175];
                }
                class79.field996[var175] = false;
            }
            class30.field421 = null;
            class34.field487 = class26.field384;
            return true;
        } else if (class30.field421 == class202.field2856) {
            class125.method845(class188.field2628, (byte) 101);
            class30.field421 = null;
            return true;
        } else if (class330.field4906 == class30.field421) {
            int var176 = class22.field306.method1767(arg0 ^ 0x7310FE88);
            int var177 = class22.field306.method1738((byte) -31);
            boolean var178 = (var177 & 0x1) == 1;
            class111.method792(0, var176, var178);
            int var179 = class22.field306.method1767(arg0 + 1930493576);
            for (int var180 = 0; var180 < var179; var180++) {
                int var181 = class22.field306.method1738((byte) -111);
                if (var181 == 255) {
                    var181 = class22.field306.method1718((byte) -126);
                }
                int var182 = class22.field306.method1745(-1106334908);
                class113.method797(var176, var181, -1, var180, var178, var182 - 1);
            }
            class259.field3837[class386.method2438(class429.field6231++, 31)] = var176;
            class30.field421 = null;
            return true;
        } else if (class343.field5050 == class30.field421) {
            int var183 = class22.field306.method1752(-17090);
            int var184 = class22.field306.method1729(false);
            if (var184 == 65535) {
                var184 = -1;
            }
            int var185 = class22.field306.method1767(1930493576);
            if (class202.method1393(var185, false)) {
                class283.method1906(2, -42, -1, var184, var183);
            }
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class236.field3522) {
            class125.method845(class452.field6674, (byte) 97);
            class30.field421 = null;
            return true;
        } else if (class55.field671 == class30.field421) {
            class103.method698(arg0 ^ 0xFFFFFFFE, true);
            class30.field421 = null;
            return false;
        } else if (class380.field5585 == class30.field421) {
            int var186 = class22.field306.method1740(128);
            int var187 = class22.field306.method1746(20972);
            int var188 = class22.field306.method1738((byte) -46);
            String var189 = "";
            String var190 = var189;
            if ((var188 & 0x1) != 0) {
                var189 = class22.field306.method1715(true);
                if ((var188 & 0x2) == 0) {
                    var190 = var189;
                } else {
                    var190 = class22.field306.method1715(true);
                }
            }
            String var191 = class22.field306.method1715(true);
            if (var186 == 99) {
                class419.method2593(30444, var191);
            } else if (var190.equals("") || !class256.method1722((byte) -65, var190)) {
                class141.method932(var186, var187, var190, var191, true, var189);
            } else {
                class30.field421 = null;
                return true;
            }
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class271.field4012) {
            int var192 = class22.field306.method1745(-1106334908);
            int var193 = class22.field306.method1736(65280);
            int var194 = class22.field306.method1729(false);
            int var195 = class22.field306.method1752(arg0 - 17090);
            if ((var195 >> 30) != 0) {
                int var196 = var195 >> 28 & 0x3;
                int var197 = (var195 >> 14 & 0x3FFF) - class28.field399;
                int var198 = (var195 & 0x3FFF) - class134.field1846;
                if (var197 >= 0 && var198 >= 0 && var197 < class195.field2745 && class78.field984 > var198) {
                    int var199 = var197 * 128 + 64;
                    int var200 = var198 * 128 + 64;
                    class231 var201 = new class231(var194, 0, class388.field5665, var196, var199, class133.method889(var196, var199, var200, false) - var192, var200, var197, var197, var198, var198);
                    class189.field2650.method2484(0, new class120(var201));
                }
            } else if ((var195 >> 29) != 0) {
                int var214 = var195 & 0xFFFF;
                class26 var215 = class364.field5260[var214];
                if (var215 != null) {
                    if (var194 == 65535) {
                        var194 = -1;
                    }
                    boolean var216 = true;
                    if (var194 != -1 && var215.field781 != -1) {
                        if (var215.field781 == var194) {
                            class302 var217 = class332.method2169(arg0 + 256, var194);
                            if (var217.field4424 && var217.field4422 != -1) {
                                class196 var218 = class83.method556(var217.field4422, arg0 + 78);
                                int var219 = var218.field2769;
                                if (var219 == 0 || var219 == 2) {
                                    var216 = false;
                                } else if (var219 == 1) {
                                    var216 = true;
                                }
                            }
                        } else {
                            class302 var220 = class332.method2169(256, var194);
                            class302 var221 = class332.method2169(256, var215.field781);
                            if (var220.field4422 != -1 && var221.field4422 != -1) {
                                class196 var222 = class83.method556(var220.field4422, 89);
                                class196 var223 = class83.method556(var221.field4422, 67);
                                if (var222.field2775 < var223.field2775) {
                                    var216 = false;
                                }
                            }
                        }
                    }
                    if (var216) {
                        var215.field707 = var192;
                        var215.field781 = var194;
                        var215.field753 = class388.field5665 + var193;
                        var215.field759 = 0;
                        var215.field724 = 0;
                        var215.field764 = 1;
                        if (var215.field753 > class388.field5665) {
                            var215.field759 = -1;
                        }
                        if (var215.field781 != -1 && class388.field5665 == var215.field753) {
                            int var224 = class332.method2169(256, var215.field781).field4422;
                            if (var224 != -1) {
                                class196 var225 = class83.method556(var224, 108);
                                if (var225 != null && var225.field2784 != null) {
                                    class446.method2739(var225, false, var215.field4960, 0, -49, var215.field4954, var215.field4951);
                                }
                            }
                        }
                    }
                }
            } else if (var195 >> 28 != 0) {
                int var202 = var195 & 0xFFFF;
                class380 var203;
                if (class420.field6085 == var202) {
                    var203 = class187.field2619;
                } else {
                    var203 = class455.field6731[var202];
                }
                if (var203 != null) {
                    if (var194 == 65535) {
                        var194 = -1;
                    }
                    boolean var204 = true;
                    if (var194 != -1 && var203.field781 != -1) {
                        if (var203.field781 == var194) {
                            class302 var209 = class332.method2169(256, var194);
                            if (var209.field4424 && var209.field4422 != -1) {
                                class196 var210 = class83.method556(var209.field4422, 81);
                                int var211 = var210.field2769;
                                if (var211 == 0 || var211 == 2) {
                                    var204 = false;
                                } else if (var211 == 1) {
                                    var204 = true;
                                }
                            }
                        } else {
                            class302 var205 = class332.method2169(arg0 + 256, var194);
                            class302 var206 = class332.method2169(256, var203.field781);
                            if (var205.field4422 != -1 && var206.field4422 != -1) {
                                class196 var207 = class83.method556(var205.field4422, 71);
                                class196 var208 = class83.method556(var206.field4422, 72);
                                if (var208.field2775 > var207.field2775) {
                                    var204 = false;
                                }
                            }
                        }
                    }
                    if (var204) {
                        var203.field753 = class388.field5665 + var193;
                        var203.field707 = var192;
                        var203.field781 = var194;
                        var203.field759 = 0;
                        var203.field724 = 0;
                        var203.field764 = 1;
                        if (var203.field781 == 65535) {
                            var203.field781 = -1;
                        }
                        if (var203.field753 > class388.field5665) {
                            var203.field759 = -1;
                        }
                        if (var203.field781 != -1 && class388.field5665 == var203.field753) {
                            int var212 = class332.method2169(256, var203.field781).field4422;
                            if (var212 != -1) {
                                class196 var213 = class83.method556(var212, 96);
                                if (var213 != null && var213.field2784 != null) {
                                    class446.method2739(var213, class187.field2619 == var203, var203.field4960, 0, -49, var203.field4954, var203.field4951);
                                }
                            }
                        }
                    }
                }
            }
            class30.field421 = null;
            return true;
        } else if (class83.field1016 == class30.field421) {
            int var226 = class22.field306.method1720(arg0 + 34);
            int var227 = class22.field306.method1752(arg0 ^ 0xFFFFBD3E);
            int var228 = class22.field306.method1720(48);
            int var229 = class22.field306.method1767(1930493576);
            if (class202.method1393(var229, false)) {
                class400.method2503(var227, -1, var228, var226);
            }
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class244.field3619) {
            int var230 = class22.field306.method1745(-1106334908);
            int var231 = class22.field306.method1752(-17090);
            int var232 = class22.field306.method1746(arg0 + 20972);
            if (class202.method1393(var230, false)) {
                class182 var233 = (class182) class252.field3703.method609((long) var231, 120);
                class182 var234 = (class182) class252.field3703.method609((long) var232, 85);
                if (var234 != null) {
                    class240.method1615(false, var233 == null || var233.field2564 != var234.field2564, (byte) 88, var234);
                }
                if (var233 != null) {
                    var233.method1820(-25246);
                    class252.field3703.method606(1, var233, (long) var232);
                }
                class223 var235 = class432.method2655((byte) -97, var231);
                if (var235 != null) {
                    class15.method216((byte) 123, var235);
                }
                class223 var236 = class432.method2655((byte) -119, var232);
                if (var236 != null) {
                    class15.method216((byte) 125, var236);
                    class86.method581(true, -119, var236);
                }
                if (class318.field4672 != -1) {
                    class433.method2657(1, (byte) -72, class318.field4672);
                }
            }
            class30.field421 = null;
            return true;
        } else if (class354.field5168 == class30.field421) {
            int var237 = class22.field306.method1752(-17090);
            int var238 = class22.field306.method1729(false);
            int var239 = class22.field306.method1745(-1106334908);
            if (var239 == 65535) {
                var239 = -1;
            }
            if (class202.method1393(var238, false)) {
                class86.method587(var237, var239, (byte) 53);
            }
            class30.field421 = null;
            return true;
        } else if (class311.field4582 == class30.field421) {
            String var240 = class22.field306.method1715(true);
            int var241 = class22.field306.method1767(1930493576);
            String var242 = class51.method399((byte) -28, var241).method1028(29465, class22.field306);
            class339.method2187(var240, (String) null, arg0 + 31967, var242, var240, 19, 0, var241);
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class214.field3030) {
            class103.method698(-2, false);
            class30.field421 = null;
            return false;
        } else if (class52.field651 == class30.field421) {
            int var243 = class22.field306.method1736(65280);
            if (var243 == 65535) {
                var243 = -1;
            }
            int var244 = class22.field306.method1767(arg0 ^ 0x7310FE88);
            if (var244 == 65535) {
                var244 = -1;
            }
            int var245 = class22.field306.method1718((byte) -126);
            int var246 = class22.field306.method1752(-17090);
            int var247 = class22.field306.method1767(1930493576);
            if (class202.method1393(var247, false)) {
                for (int var248 = var244; var248 <= var243; var248++) {
                    long var249 = ((long) var245 << 32) + (long) var248;
                    class332 var251 = (class332) class51.field635.method609(var249, arg0 ^ 0x43);
                    class332 var252;
                    if (var251 != null) {
                        var252 = new class332(var246, var251.field4927);
                        var251.method1820(-25246);
                    } else if (var248 == -1) {
                        var252 = new class332(var246, class432.method2655((byte) -63, var245).field3331.field4927);
                    } else {
                        var252 = new class332(var246, -1);
                    }
                    class51.field635.method606(arg0 + 1, var252, var249);
                }
            }
            class30.field421 = null;
            return true;
        } else if (class357.field5182 == class30.field421) {
            class110.method778((byte) -24, false);
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class200.field2825) {
            int var253 = class22.field306.method1729(false);
            int var254 = class22.field306.method1729(false);
            int var255 = class22.field306.method1738((byte) 85);
            class26 var256 = class364.field5260[var253];
            if (var256 != null) {
                class119.method817(-13915, var256, var255, var254);
            }
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class243.field3610) {
            class125.method845(class417.field6028, (byte) 121);
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class249.field3662) {
            int var257 = class22.field306.method1749(-37);
            int var258 = class22.field306.method1741((byte) 24);
            int var259 = class22.field306.method1719(0);
            class47.field614[var258] = var257;
            class143.field1947[var258] = var259;
            class369.field5331[var258] = 1;
            int var260 = class454.field6703[var258] - 1;
            for (int var261 = 0; var261 < var260; var261++) {
                if (var257 >= class111.field1539[var261]) {
                    class369.field5331[var258] = var261 + 2;
                }
            }
            class444.field6469[class386.method2438(class295.field4303++, 31)] = var258;
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class124.field1647) {
            int var262 = class22.field306.method1749(arg0 + 119);
            int var263 = class22.field306.method1767(1930493576);
            class83.method555(var263, -27690, var262);
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class26.field382) {
            int var264 = class22.field306.method1767(1930493576);
            byte var265 = class22.field306.method1760((byte) 118);
            class15.method210(var265, var264, arg0 + 26434);
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class180.field2551) {
            int var266 = class22.field306.method1741((byte) 24);
            int var267 = class22.field306.method1736(arg0 + 65280);
            int var268 = class22.field306.method1736(arg0 ^ 0xFF00);
            int var269 = class22.field306.method1718((byte) -127);
            if (class202.method1393(var268, false)) {
                class182 var270 = (class182) class252.field3703.method609((long) var269, arg0 + 61);
                if (var270 != null) {
                    class240.method1615(false, var270.field2564 != var267, (byte) 109, var270);
                }
                class147.method1016((byte) 115, false, var267, var266, var269);
            }
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class216.field3081) {
            class195.field2749 = class22.field306.method1762((byte) -33);
            class86.field1069 = class22.field306.method1738((byte) -72);
            class266.field3955 = class22.field306.method1738((byte) -85);
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class202.field2844) {
            class125.method845(class37.field527, (byte) 101);
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class129.field1709) {
            boolean var271 = class22.field306.method1738((byte) 84) == 1;
            String var272 = class22.field306.method1715(true);
            String var273 = var272;
            if (var271) {
                var273 = class22.field306.method1715(true);
            }
            long var274 = (long) class22.field306.method1767(arg0 + 1930493576);
            long var276 = (long) class22.field306.method1725((byte) 0);
            int var278 = class22.field306.method1738((byte) 113);
            long var279 = (var274 << 32) + var276;
            boolean var281 = false;
            int var282 = 0;
            while (true) {
                if (var282 >= 100) {
                    if (var278 <= 1) {
                        if (!(!class236.field3523 || class395.field5747) || class74.field943) {
                            var281 = true;
                        } else if (class256.method1722((byte) -88, var273)) {
                            var281 = true;
                        }
                    }
                    break;
                }
                if (class42.field569[var282] == var279) {
                    var281 = true;
                    break;
                }
                var282++;
            }
            if (!var281 && class186.field2608 == 0) {
                class42.field569[class167.field2207] = var279;
                class167.field2207 = (class167.field2207 + 1) % 100;
                String var283 = class51.method393((byte) -127, class429.method2642((byte) 72, class5.method48(true, class22.field306)));
                if (var278 == 2) {
                    class339.method2187("<img=1>" + var272, (String) null, 31967, var283, "<img=1>" + var273, 7, 0, -1);
                } else if (var278 == 1) {
                    class339.method2187("<img=0>" + var272, (String) null, arg0 ^ 0x7CDF, var283, "<img=0>" + var273, 7, 0, -1);
                } else {
                    class339.method2187(var272, (String) null, 31967, var283, var273, 3, 0, -1);
                }
            }
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class296.field4318) {
            class125.method845(class299.field4351, (byte) 126);
            class30.field421 = null;
            return true;
        } else if (class72.field940 == class30.field421) {
            class125.method845(class275.field4063, (byte) 99);
            class30.field421 = null;
            return true;
        } else if (class402.field5805 == class30.field421) {
            class9.method141(class35.field496, class22.field306, 127);
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class236.field3520) {
            boolean var284 = class22.field306.method1738((byte) -108) == 1;
            String var285 = class22.field306.method1715(true);
            String var286 = var285;
            if (var284) {
                var286 = class22.field306.method1715(true);
            }
            long var287 = class22.field306.method1754(true);
            long var289 = (long) class22.field306.method1767(1930493576);
            long var291 = (long) class22.field306.method1725((byte) 0);
            int var293 = class22.field306.method1738((byte) -64);
            int var294 = class22.field306.method1767(1930493576);
            long var295 = (var289 << 32) + var291;
            boolean var297 = false;
            int var298 = 0;
            while (true) {
                if (var298 >= 100) {
                    if (var293 <= 1 && class256.method1722((byte) -91, var286)) {
                        var297 = true;
                    }
                    break;
                }
                if (class42.field569[var298] == var295) {
                    var297 = true;
                    break;
                }
                var298++;
            }
            if (!var297 && class186.field2608 == 0) {
                class42.field569[class167.field2207] = var295;
                class167.field2207 = (class167.field2207 + 1) % 100;
                String var299 = class51.method399((byte) -28, var294).method1028(29465, class22.field306);
                if (var293 == 2) {
                    class339.method2187("<img=1>" + var285, class239.method1606(var287, (byte) -98), 31967, var299, "<img=1>" + var286, 20, 0, var294);
                } else if (var293 == 1) {
                    class339.method2187("<img=0>" + var285, class239.method1606(var287, (byte) -77), 31967, var299, "<img=0>" + var286, 20, 0, var294);
                } else {
                    class339.method2187(var285, class239.method1606(var287, (byte) -112), 31967, var299, var286, 20, 0, var294);
                }
            }
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class226.field3386) {
            class125.method845(class310.field4560, (byte) 122);
            class30.field421 = null;
            return true;
        } else if (class303.field4436 == class30.field421) {
            class154.field2080 = class22.field306.method1738((byte) -22);
            class30.field421 = null;
            class131.field1789 = class26.field384;
            return true;
        } else if (class441.field6417 == class30.field421) {
            boolean var300 = class22.field306.method1738((byte) -98) == 1;
            String var301 = class22.field306.method1715(true);
            String var302 = var301;
            if (var300) {
                var302 = class22.field306.method1715(true);
            }
            long var303 = (long) class22.field306.method1767(arg0 ^ 0x7310FE88);
            long var305 = (long) class22.field306.method1725((byte) 0);
            int var307 = class22.field306.method1738((byte) 60);
            int var308 = class22.field306.method1767(1930493576);
            long var309 = (var303 << 32) + var305;
            boolean var311 = false;
            int var312 = 0;
            while (true) {
                if (var312 >= 100) {
                    if (var307 <= 1 && class256.method1722((byte) -84, var302)) {
                        var311 = true;
                    }
                    break;
                }
                if (class42.field569[var312] == var309) {
                    var311 = true;
                    break;
                }
                var312++;
            }
            if (!var311 && class186.field2608 == 0) {
                class42.field569[class167.field2207] = var309;
                class167.field2207 = (class167.field2207 + 1) % 100;
                String var313 = class51.method399((byte) -28, var308).method1028(29465, class22.field306);
                if (var307 == 2) {
                    class339.method2187("<img=1>" + var301, (String) null, 31967, var313, "<img=1>" + var302, 18, 0, var308);
                } else if (var307 == 1) {
                    class339.method2187("<img=0>" + var301, (String) null, 31967, var313, "<img=0>" + var302, 18, 0, var308);
                } else {
                    class339.method2187(var301, (String) null, 31967, var313, var302, 18, 0, var308);
                }
            }
            class30.field421 = null;
            return true;
        } else if (class56.field689 == class30.field421) {
            int var314 = class22.field306.method1738((byte) -121);
            if (class22.field306.method1738((byte) -56) == 0) {
                class14.field228[var314] = new class404();
            } else {
                class22.field306.field3762--;
                class14.field228[var314] = new class404(class22.field306);
            }
            class200.field2831 = class26.field384;
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class191.field2670) {
            int var315 = class22.field306.method1738((byte) -44);
            int var316 = var315 >> 5;
            int var317 = var315 & 0x1F;
            if (var317 == 0) {
                class331.field4910[var316] = null;
                class30.field421 = null;
                return true;
            }
            class99 var318 = new class99();
            var318.field1223 = var317;
            var318.field1231 = class22.field306.method1738((byte) -19);
            if (var318.field1231 >= 0 && var318.field1231 < class369.field5353.length) {
                if (var318.field1223 == 1 || var318.field1223 == 10) {
                    var318.field1230 = class22.field306.method1767(1930493576);
                    class22.field306.field3762 += 6;
                } else if (var318.field1223 >= 2 && var318.field1223 <= 6) {
                    if (var318.field1223 == 2) {
                        var318.field1219 = 64;
                        var318.field1226 = 64;
                    }
                    if (var318.field1223 == 3) {
                        var318.field1226 = 0;
                        var318.field1219 = 64;
                    }
                    if (var318.field1223 == 4) {
                        var318.field1219 = 64;
                        var318.field1226 = 128;
                    }
                    if (var318.field1223 == 5) {
                        var318.field1219 = 0;
                        var318.field1226 = 64;
                    }
                    if (var318.field1223 == 6) {
                        var318.field1219 = 128;
                        var318.field1226 = 64;
                    }
                    var318.field1223 = 2;
                    var318.field1234 = class22.field306.method1738((byte) 98);
                    var318.field1225 = class22.field306.method1767(1930493576);
                    var318.field1221 = class22.field306.method1767(1930493576);
                    var318.field1228 = class22.field306.method1738((byte) 112);
                    var318.field1235 = class22.field306.method1767(1930493576);
                }
                var318.field1222 = class22.field306.method1767(arg0 ^ 0x7310FE88);
                if (var318.field1222 == 65535) {
                    var318.field1222 = -1;
                }
                class331.field4910[var316] = var318;
            }
            class30.field421 = null;
            return true;
        } else if (class93.field1156 == class30.field421) {
            int var319 = class22.field306.method1736(arg0 + 65280);
            int var320 = class22.field306.method1736(65280);
            int var321 = class22.field306.method1752(arg0 ^ 0xFFFFBD3E);
            int var322 = class22.field306.method1729(false);
            int var323 = class22.field306.method1745(-1106334908);
            if (class202.method1393(var320, false)) {
                class303.method2016(var323, 7232, var319, var322, var321);
            }
            class30.field421 = null;
            return true;
        } else if (class72.field936 == class30.field421) {
            class317.field4651 = class22.field306.method1738((byte) -99);
            class189.field2647 = class22.field306.method1738((byte) 127);
            class427.field6216 = class22.field306.method1738((byte) 94);
            while (class35.field496 > class22.field306.field3762) {
                class274 var324 = class296.method1972(0)[class22.field306.method1738((byte) -93)];
                class125.method845(var324, (byte) 112);
            }
            class30.field421 = null;
            return true;
        } else if (class323.field4769 == class30.field421) {
            class189.field2647 = class22.field306.method1719(0);
            class427.field6216 = class22.field306.method1741((byte) 24);
            class317.field4651 = class22.field306.method1762((byte) -33);
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class17.field261) {
            int var325 = class22.field306.method1767(1930493576);
            int var326 = class22.field306.method1738((byte) -99);
            int var327 = class22.field306.method1738((byte) -47);
            int var328 = class22.field306.method1767(1930493576);
            int var329 = class22.field306.method1738((byte) -122);
            int var330 = class22.field306.method1738((byte) -86);
            if (class202.method1393(var325, false)) {
                class369.method2345(var326, var329, true, false, var327, var328, var330);
            }
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class152.field2058) {
            int var331 = class22.field306.method1719(0);
            int var332 = class22.field306.method1767(1930493576);
            boolean var333 = (var331 & 0x1) == 1;
            class450.method2769(var332, arg0 + 118, var333);
            class259.field3837[class386.method2438(class429.field6231++, 31)] = var332;
            class30.field421 = null;
            return true;
        } else if (class337.field4976 == class30.field421) {
            class242.field3595 = class22.field306.method1747((byte) 12);
            class30.field421 = null;
            class131.field1789 = class26.field384;
            return true;
        } else if (class366.field5294 == class30.field421) {
            int var334 = class22.field306.method1767(1930493576);
            int var335 = class22.field306.method1738((byte) 83);
            int var336 = class22.field306.method1738((byte) -101);
            int var337 = class22.field306.method1767(1930493576);
            int var338 = class22.field306.method1738((byte) 52);
            int var339 = class22.field306.method1738((byte) -67);
            if (class202.method1393(var334, false)) {
                class326.method2131(var337, var335, var339, 16383, var336, var338);
            }
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class125.field1662) {
            int var340 = class22.field306.method1738((byte) -118);
            int var341 = var340 >> 2;
            int var342 = var340 & 0x3;
            int var343 = class4.field69[var341];
            int var344 = class22.field306.method1736(65280);
            if (var344 == 65535) {
                var344 = -1;
            }
            int var345 = class22.field306.method1749(-92);
            int var346 = (var345 & 0x303927AC) >> 28;
            int var347 = (var345 & 0xFFFC483) >> 14;
            int var348 = var347 - class28.field399;
            int var349 = var345 & 0x3FFF;
            int var350 = var349 - class134.field1846;
            class294.method1956(var346, var343, var350, -1475, var341, var342, var344, var348);
            class30.field421 = null;
            return true;
        } else if (class466.field6855 == class30.field421) {
            String var351 = class22.field306.method1715(true);
            boolean var352 = class22.field306.method1738((byte) 120) == 1;
            String var353;
            if (var352) {
                var353 = class22.field306.method1715(true);
            } else {
                var353 = var351;
            }
            int var354 = class22.field306.method1767(arg0 ^ 0x7310FE88);
            byte var355 = class22.field306.method1728((byte) 85);
            boolean var356 = false;
            if (var355 == -128) {
                var356 = true;
            }
            if (var356) {
                if (class418.field6032 == 0) {
                    class30.field421 = null;
                    return true;
                }
                boolean var362 = false;
                int var363;
                for (var363 = 0; class418.field6032 > var363 && (!class253.field3720[var363].field3865.equals(var353) || class253.field3720[var363].field3863 != var354); var363++) {
                }
                if (var363 < class418.field6032) {
                    while (var363 < (class418.field6032 - 1)) {
                        class253.field3720[var363] = class253.field3720[var363 + 1];
                        var363++;
                    }
                    class418.field6032--;
                    class253.field3720[class418.field6032] = null;
                }
            } else {
                String var357 = class22.field306.method1715(true);
                class262 var358 = new class262();
                var358.field3865 = var353;
                var358.field3871 = var351;
                var358.field3862 = class17.method223(arg0, var358.field3865);
                var358.field3863 = var354;
                var358.field3868 = var357;
                var358.field3866 = var355;
                int var359;
                for (var359 = class418.field6032 - 1; var359 >= 0; var359--) {
                    int var360 = class253.field3720[var359].field3862.compareTo(var358.field3862);
                    if (var360 == 0) {
                        class253.field3720[var359].field3863 = var354;
                        class253.field3720[var359].field3866 = var355;
                        class253.field3720[var359].field3868 = var357;
                        if (var353.equals(class187.field2619.field5587)) {
                            class96.field1180 = var355;
                        }
                        class230.field3444 = class26.field384;
                        class30.field421 = null;
                        return true;
                    }
                    if (var360 < 0) {
                        break;
                    }
                }
                if (class253.field3720.length <= class418.field6032) {
                    class30.field421 = null;
                    return true;
                }
                for (int var361 = class418.field6032 - 1; var361 > var359; var361--) {
                    class253.field3720[var361 + 1] = class253.field3720[var361];
                }
                if (class418.field6032 == 0) {
                    class253.field3720 = new class262[100];
                }
                class253.field3720[var359 + 1] = var358;
                class418.field6032++;
                if (var353.equals(class187.field2619.field5587)) {
                    class96.field1180 = var355;
                }
            }
            class30.field421 = null;
            class230.field3444 = class26.field384;
            return true;
        } else if (class37.field521 == class30.field421) {
            int var364 = class22.field306.method1729(false);
            if (var364 == 65535) {
                var364 = -1;
            }
            int var365 = class22.field306.method1729(false);
            int var366 = class22.field306.method1752(-17090);
            if (class202.method1393(var365, false)) {
                class283.method1906(1, -42, -1, var364, var366);
            }
            class30.field421 = null;
            return true;
        } else if (class309.field4556 == class30.field421) {
            byte var367 = class22.field306.method1723(-128);
            int var368 = class22.field306.method1736(65280);
            int var369 = class22.field306.method1745(-1106334908);
            if (class202.method1393(var368, false)) {
                class329.method2152(arg0 ^ 0x6F79, var369, var367);
            }
            class30.field421 = null;
            return true;
        } else if (class435.field6355 == class30.field421) {
            class164.method1086((byte) 48);
            class30.field421 = null;
            return false;
        } else if (class30.field421 == class189.field2642) {
            class125.method845(class383.field5619, (byte) 106);
            class30.field421 = null;
            return true;
        } else if (class31.field434 == class30.field421) {
            class15.field246 = class22.field306.method1767(1930493576) * 30;
            class30.field421 = null;
            class131.field1789 = class26.field384;
            return true;
        } else if (class4.field58 == class30.field421) {
            class125.method845(class143.field1940, (byte) 109);
            class30.field421 = null;
            return true;
        } else if (class328.field4889 == class30.field421) {
            int var370 = class22.field306.method1745(-1106334908);
            int var371 = class22.field306.method1767(1930493576);
            int var372 = class22.field306.method1729(false);
            if (class202.method1393(var371, false)) {
                class430.method2647(var370, 0, var372, -1);
            }
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class167.field2199) {
            class125.method845(class304.field4456, (byte) 125);
            class30.field421 = null;
            return true;
        } else if (class30.field421 == class202.field2858) {
            int var373 = class22.field306.method1718((byte) -127);
            int var374 = class22.field306.method1729(false);
            int var375 = class22.field306.method1767(1930493576);
            if (class202.method1393(var374, false)) {
                class32.method309(var373, 9104, var375);
            }
            class30.field421 = null;
            return true;
        } else if (class463.field6830 == class30.field421) {
            int var376 = class22.field306.method1738((byte) -34);
            int var377 = class22.field306.method1741((byte) 24);
            if (var376 == 255) {
                var377 = -1;
                var376 = -1;
            }
            class206.method1416(0, var377, var376);
            class30.field421 = null;
            return true;
        } else if (class75.field957 == class30.field421) {
            if (class35.field496 == 0) {
                class155.field2087 = class243.field3598.method2543(false, class153.field2073);
            } else {
                class155.field2087 = class22.field306.method1715(true);
            }
            class30.field421 = null;
            return true;
        } else if (class440.field6406 == class30.field421) {
            class164.field2169 = class22.field306.method1738((byte) -45);
            class30.field421 = null;
            return true;
        } else {
            class365.method2331("T1 - " + (class30.field421 == null ? -1 : class30.field421.method249((byte) -116)) + "," + (class444.field6471 == null ? -1 : class444.field6471.method249((byte) -82)) + "," + (class251.field3687 == null ? -1 : class251.field3687.method249((byte) -71)) + " - " + class35.field496, (Throwable) null, 28692);
            class164.method1086((byte) 122);
            return true;
        }
    }
}
