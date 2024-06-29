import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class155 {

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    private int field2751 = 32;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "J")
    private long field2750 = class223.method1537(-26619);

    @OriginalMember(owner = "client!e", name = "I", descriptor = "I")
    private int field2771 = 0;

    @OriginalMember(owner = "client!e", name = "K", descriptor = "I")
    private int field2773 = 0;

    @OriginalMember(owner = "client!e", name = "J", descriptor = "I")
    private int field2772 = 0;

    @OriginalMember(owner = "client!e", name = "H", descriptor = "I")
    private int field2770 = 0;

    @OriginalMember(owner = "client!e", name = "M", descriptor = "[Lwj;")
    private class121[] field2775 = new class121[8];

    @OriginalMember(owner = "client!e", name = "O", descriptor = "Z")
    private boolean field2777 = true;

    @OriginalMember(owner = "client!e", name = "N", descriptor = "[Lwj;")
    private class121[] field2776 = new class121[8];

    @OriginalMember(owner = "client!e", name = "P", descriptor = "J")
    private long field2778 = 0L;

    @OriginalMember(owner = "client!e", name = "R", descriptor = "J")
    private long field2780 = 0L;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "Lha;")
    public static class46 field2747 = class271.method1828("Loading world list data", -46);

    @OriginalMember(owner = "client!e", name = "p", descriptor = "Lha;")
    public static class46 field2752 = class271.method1828("Schlie-8en", -46);

    @OriginalMember(owner = "client!e", name = "q", descriptor = "I")
    public static int field2753 = 0;

    @OriginalMember(owner = "client!e", name = "C", descriptor = "Lha;")
    public static class46 field2765 = class271.method1828("Weiter", -46);

    @OriginalMember(owner = "client!e", name = "w", descriptor = "Lha;")
    public static class46 field2759 = class271.method1828("Verbindung zum Update)2Server hergestellt)3", -46);

    @OriginalMember(owner = "client!e", name = "i", descriptor = "[I")
    public static int[] field2745 = new int[100];

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!e", name = "B", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!e", name = "D", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!e", name = "F", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!e", name = "G", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!e", name = "L", descriptor = "I")
    public int field2774;

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "I")
    public int field2779;

    @OriginalMember(owner = "client!e", name = "S", descriptor = "I")
    private int field2781;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "Lwj;")
    private class121 field2738;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "Lpi;")
    public static class181 field2743;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "[I")
    public int[] field2754;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "()V")
    public void method99() {
        field2740++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
    public final synchronized void method1133(byte arg0) {
        field2762++;
        this.field2777 = true;
        try {
            this.method96();
        } catch (Exception var2) {
            this.method99();
            this.field2780 = class223.method1537(-26619) + 2000L;
        }
        if (arg0 < 87) {
            field2755 = -103;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg0 - arg4) >= class135.field2445 && class73.field1309 >= arg0 + arg4 && arg5 - arg4 >= class4.field70 && (arg5 + arg4) <= class70.field1205) {
            class73.method530(arg3, arg6, arg2, arg4, arg5, arg0, (byte) 125);
        } else {
            class86.method671(arg6, arg0, arg5, arg2, -109, arg3, arg4);
        }
        if (arg1 != 2000) {
            field2745 = null;
        }
        field2769++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
    public void method101(int arg0) throws Exception {
        field2763++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([II)V")
    private final void method1135(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class60.field997) {
            var3 = arg1 << 1;
        }
        class104.method783(arg0, 0, var3);
        this.field2772 -= arg1;
        if (this.field2738 != null && this.field2772 <= 0) {
            this.field2772 += class265.field4606 >> 4;
            class241.method1654(0, this.field2738);
            this.method1140(this.field2738.method865(), this.field2738, (byte) -36);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class121 var10 = null;
                        class121 var11 = this.field2776[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class195 var12 = var11.field2264;
                                if (var12 == null || var12.field3494 <= var8) {
                                    var11.field2262 = true;
                                    int var13 = var11.method655();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3494 += var13;
                                    }
                                    if (var4 >= this.field2751) {
                                        break label107;
                                    }
                                    class121 var14 = var11.method651();
                                    if (var14 != null) {
                                        int var15 = var11.field2263;
                                        while (var14 != null) {
                                            this.method1140(var15 * var14.method865() >> 8, var14, (byte) -36);
                                            var14 = var11.method656();
                                        }
                                    }
                                    class121 var16 = var11.field2261;
                                    var11.field2261 = null;
                                    if (var10 == null) {
                                        this.field2776[var7] = var16;
                                    } else {
                                        var10.field2261 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2775[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2261;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class121 var18 = this.field2776[var17];
                this.field2776[var17] = this.field2775[var17] = null;
                while (var18 != null) {
                    class121 var19 = var18.field2261;
                    var18.field2261 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2772 < 0) {
            this.field2772 = 0;
        }
        if (this.field2738 != null) {
            this.field2738.method649(arg0, 0, arg1);
        }
        this.field2750 = class223.method1537(-26619);
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "()V")
    public void method100() throws Exception {
        field2746++;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "()V")
    public void method96() throws Exception {
        field2766++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILha;ILha;)V")
    public static final void method1136(int arg0, class46 arg1, int arg2, class46 arg3) {
        if (arg0 > 66) {
            field2760++;
            class92.method720((byte) 79, arg1, (class46) null, arg2, -1, arg3);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)V")
    public static void method1137(boolean arg0) {
        field2743 = null;
        field2765 = null;
        field2747 = null;
        field2752 = null;
        field2759 = null;
        field2745 = null;
        if (!arg0) {
            method1138((byte) -77, (class75) null);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BLwe;)Loi;")
    public static final class89 method1138(byte arg0, class75 arg1) {
        field2757++;
        if (arg0 >= 0) {
            return null;
        }
        arg1.method558(1);
        int var2 = arg1.method558(1);
        class89 var3 = class205.method1453(var2, false);
        var3.field1681 = arg1.method558(1);
        int var4 = arg1.method558(1);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method558(1);
            var3.method14(arg1, -641641492, var6);
        }
        var3.method8(true);
        return var3;
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "()I")
    public int method97() throws Exception {
        field2737++;
        return this.field2774;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
    public final synchronized void method1139(int arg0) {
        if (arg0 != 50) {
            return;
        }
        if (client.field4696 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (client.field4696.field4433[var3] == this) {
                    client.field4696.field4433[var3] = null;
                }
                if (client.field4696.field4433[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                client.field4696.field4422 = true;
                while (client.field4696.field4425) {
                    class187.method1360((byte) -102, 50L);
                }
                client.field4696 = null;
            }
        }
        field2761++;
        this.method99();
        this.field2754 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method98(Component arg0) throws Exception {
        field2749++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILwj;B)V")
    private final void method1140(int arg0, class121 arg1, byte arg2) {
        int var4 = arg0 >> 5;
        class121 var5 = this.field2775[var4];
        field2764++;
        if (var5 == null) {
            this.field2776[var4] = arg1;
        } else {
            var5.field2261 = arg1;
        }
        this.field2775[var4] = arg1;
        arg1.field2263 = arg0;
        if (arg2 != -36) {
            this.field2775 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V")
    public final void method1141(byte arg0) {
        if (arg0 > 85) {
            this.field2777 = true;
            field2767++;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILwj;)V")
    public final synchronized void method1142(int arg0, class121 arg1) {
        field2748++;
        int var3 = -42 % ((arg0 - 56) / 61);
        this.field2738 = arg1;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)Lqf;")
    public static final class77 method1143(int arg0, int arg1) {
        if (arg0 != 8) {
            field2747 = null;
        }
        class77 var2 = (class77) class28.field560.method86(arg0 + 7953, (long) arg1);
        field2768++;
        if (var2 != null) {
            return var2;
        }
        class77 var3 = class183.method1330(24082, class229.field4001, arg1, class216.field3824, false);
        if (var3 != null) {
            class28.field560.method80(var3, (long) arg1, (byte) 67);
        }
        return var3;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IZ)V")
    public static final void method1144(int arg0, boolean arg1) {
        field2741++;
        class146 var2 = class6.method22((byte) 16, 2, arg0);
        var2.method1082((byte) -103);
        if (!arg1) {
            field2747 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
    public final synchronized void method1145(int arg0) {
        field2758++;
        if (arg0 != 11001 || this.field2754 == null) {
            return;
        }
        long var2 = class223.method1537(-26619);
        try {
            if (this.field2780 != 0L) {
                if (var2 < this.field2780) {
                    return;
                }
                this.method101(this.field2774);
                this.field2777 = true;
                this.field2780 = 0L;
            }
            int var4 = this.method97();
            if (this.field2770 - var4 > this.field2773) {
                this.field2773 = this.field2770 - var4;
            }
            int var5 = this.field2781 + this.field2779;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field2774) {
                var4 = 0;
                this.field2774 += 1024;
                if (this.field2774 > 16384) {
                    this.field2774 = 16384;
                }
                this.method99();
                this.method101(this.field2774);
                this.field2777 = true;
                if (var5 + 256 > this.field2774) {
                    var5 = this.field2774 - 256;
                    this.field2781 = var5 - this.field2779;
                }
            }
            while (var4 < var5) {
                this.method1135(this.field2754, 256);
                var4 += 256;
                this.method100();
            }
            if (this.field2778 < var2) {
                if (this.field2777) {
                    this.field2777 = false;
                } else if (this.field2773 == 0 && this.field2771 == 0) {
                    this.method99();
                    this.field2780 = var2 + 2000L;
                    return;
                } else {
                    this.field2781 = Math.min(this.field2771, this.field2773);
                    this.field2771 = this.field2773;
                }
                this.field2773 = 0;
                this.field2778 = var2 + 2000L;
            }
            this.field2770 = var4;
        } catch (Exception var7) {
            this.method99();
            this.field2780 = var2 + 2000L;
        }
        try {
            if (var2 > (this.field2750 + 500000L)) {
                var2 = this.field2750;
            }
            while (var2 > (this.field2750 + 5000L)) {
                this.method1148((byte) 112, 256);
                this.field2750 += (long) (256000 / class265.field4606);
            }
        } catch (Exception var6) {
            this.field2750 = var2;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILmi;)I")
    public static final int method1146(int arg0, class81 arg1) {
        int var2 = arg1.field1553;
        if (arg1.field2553 == arg1.field2537) {
            var2 = arg1.field1546;
        } else if (arg1.field2540 == arg1.field2537) {
            var2 = arg1.field1551;
        }
        field2756++;
        if (arg0 != 1) {
            method1137(true);
        }
        return var2;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BI)Lha;")
    public static final class46 method1147(byte arg0, int arg1) {
        int var2 = 12 % ((arg0 - 57) / 42);
        field2739++;
        return class162.field2855[arg1].method314(19) <= 0 ? class275.field4795[arg1] : class109.method855(0, new class46[] { class275.field4795[arg1], class56.field945, class162.field2855[arg1] });
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(BI)V")
    private final void method1148(byte arg0, int arg1) {
        field2742++;
        this.field2772 -= arg1;
        if (this.field2772 < 0) {
            this.field2772 = 0;
        }
        if (arg0 <= 106) {
            method1146(-118, (class81) null);
        }
        if (this.field2738 != null) {
            this.field2738.method652(arg1);
        }
    }
}
