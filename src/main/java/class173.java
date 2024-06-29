import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class173 {

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    private int field2827 = 32;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "J")
    private long field2832 = class7.method31((byte) -88);

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    private int field2847 = 0;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "Z")
    private boolean field2851 = true;

    @OriginalMember(owner = "client!je", name = "A", descriptor = "I")
    private int field2853 = 0;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "J")
    private long field2850 = 0L;

    @OriginalMember(owner = "client!je", name = "D", descriptor = "I")
    private int field2856 = 0;

    @OriginalMember(owner = "client!je", name = "F", descriptor = "J")
    private long field2858 = 0L;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "I")
    private int field2848 = 0;

    @OriginalMember(owner = "client!je", name = "G", descriptor = "[Lth;")
    private class104[] field2859 = new class104[8];

    @OriginalMember(owner = "client!je", name = "C", descriptor = "[Lth;")
    private class104[] field2855 = new class104[8];

    @OriginalMember(owner = "client!je", name = "l", descriptor = "[I")
    public static int[] field2838 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!je", name = "e", descriptor = "Ldf;")
    public static class51 field2831 = class46.method233("Null", 100);

    @OriginalMember(owner = "client!je", name = "z", descriptor = "Ldf;")
    public static class51 field2852 = class46.method233("sch-Utteln:", 100);

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "I")
    public int field2849;

    @OriginalMember(owner = "client!je", name = "B", descriptor = "I")
    public int field2854;

    @OriginalMember(owner = "client!je", name = "E", descriptor = "I")
    private int field2857;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "Lth;")
    private class104 field2843;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "[I")
    public int[] field2841;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "()V")
    public void method942() {
        field2842++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public final synchronized void method1211(int arg0) {
        field2833++;
        if (this.field2841 == null) {
            return;
        }
        if (arg0 != 3) {
            this.method1211(-12);
        }
        long var2 = class7.method31((byte) -88);
        try {
            if (this.field2850 != 0L) {
                if (this.field2850 > var2) {
                    return;
                }
                this.method944(this.field2854);
                this.field2851 = true;
                this.field2850 = 0L;
            }
            int var4 = this.method943();
            if (this.field2847 < (this.field2848 - var4)) {
                this.field2847 = this.field2848 - var4;
            }
            int var5 = this.field2857 + this.field2849;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field2854) {
                var4 = 0;
                this.field2854 += 1024;
                if (this.field2854 > 16384) {
                    this.field2854 = 16384;
                }
                this.method942();
                this.method944(this.field2854);
                this.field2851 = true;
                if (this.field2854 < (var5 + 256)) {
                    var5 = this.field2854 - 256;
                    this.field2857 = var5 - this.field2849;
                }
            }
            while (var4 < var5) {
                var4 += 256;
                this.method1219(this.field2841, 256);
                this.method945();
            }
            if (var2 > this.field2858) {
                if (this.field2851) {
                    this.field2851 = false;
                } else if (this.field2847 == 0 && this.field2856 == 0) {
                    this.method942();
                    this.field2850 = var2 + 2000L;
                    return;
                } else {
                    this.field2857 = Math.min(this.field2856, this.field2847);
                    this.field2856 = this.field2847;
                }
                this.field2847 = 0;
                this.field2858 = var2 + 2000L;
            }
            this.field2848 = var4;
        } catch (Exception var7) {
            this.method942();
            this.field2850 = var2 + 2000L;
        }
        try {
            if (var2 > this.field2832 + 500000L) {
                var2 = this.field2832;
            }
            while (var2 > this.field2832 + 5000L) {
                this.method1218(256, false);
                this.field2832 += (long) (256000 / class156.field2568);
            }
        } catch (Exception var6) {
            this.field2832 = var2;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "()V")
    public void method945() throws Exception {
        field2837++;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
    public final synchronized void method1212(int arg0) {
        field2828++;
        if (class48.field766 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class48.field766.field715[var3] == this) {
                    class48.field766.field715[var3] = null;
                }
                if (class48.field766.field715[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class48.field766.field698 = true;
                while (class48.field766.field702) {
                    class147.method1066(50L, 0);
                }
                class48.field766 = null;
            }
        }
        int var4 = -124 / ((-arg0 - 47) / 37);
        this.method942();
        this.field2841 = null;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "()V")
    public void method941() throws Exception {
        field2840++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lth;IB)V")
    private final void method1213(class104 arg0, int arg1, byte arg2) {
        field2835++;
        if (arg2 != -92) {
            this.method1217(-72);
        }
        int var4 = arg1 >> 5;
        class104 var5 = this.field2859[var4];
        if (var5 == null) {
            this.field2855[var4] = arg0;
        } else {
            var5.field1726 = arg0;
        }
        this.field2859[var4] = arg0;
        arg0.field1724 = arg1;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V")
    public static void method1214(int arg0) {
        field2838 = null;
        if (arg0 >= 90) {
            field2852 = null;
            field2831 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V")
    public void method944(int arg0) throws Exception {
        field2844++;
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(I)V")
    public final void method1215(int arg0) {
        field2829++;
        if (arg0 == 255) {
            this.field2851 = true;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public static final void method1216(byte arg0) {
        if (arg0 <= 18) {
            method1216((byte) -96);
        }
        field2830++;
        class136.field2261++;
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "(I)V")
    public final synchronized void method1217(int arg0) {
        this.field2851 = true;
        try {
            this.method941();
        } catch (Exception var3) {
            this.method942();
            this.field2850 = class7.method31((byte) -88) + 2000L;
        }
        field2836++;
        int var2 = 119 % ((arg0 - 40) / 51);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IZ)V")
    private final void method1218(int arg0, boolean arg1) {
        this.field2853 -= arg0;
        if (this.field2853 < 0) {
            this.field2853 = 0;
        }
        if (!arg1) {
            if (this.field2843 != null) {
                this.field2843.method496(arg0);
            }
            field2834++;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method946(Component arg0) throws Exception {
        field2846++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([II)V")
    private final void method1219(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class34.field498) {
            var3 = arg1 << 1;
        }
        class256.method1745(arg0, 0, var3);
        this.field2853 -= arg1;
        if (this.field2843 != null && this.field2853 <= 0) {
            this.field2853 += class156.field2568 >> 4;
            class182.method1291(50, this.field2843);
            this.method1213(this.field2843, this.field2843.method604(), (byte) -92);
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
                        class104 var10 = null;
                        class104 var11 = this.field2855[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class94 var12 = var11.field1725;
                                if (var12 == null || var12.field1559 <= var8) {
                                    var11.field1723 = true;
                                    int var13 = var11.method491();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1559 += var13;
                                    }
                                    if (var4 >= this.field2827) {
                                        break label107;
                                    }
                                    class104 var14 = var11.method493();
                                    if (var14 != null) {
                                        int var15 = var11.field1724;
                                        while (var14 != null) {
                                            this.method1213(var14, var15 * var14.method604() >> 8, (byte) -92);
                                            var14 = var11.method490();
                                        }
                                    }
                                    class104 var16 = var11.field1726;
                                    var11.field1726 = null;
                                    if (var10 == null) {
                                        this.field2855[var7] = var16;
                                    } else {
                                        var10.field1726 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2859[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1726;
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
                class104 var18 = this.field2855[var17];
                this.field2855[var17] = this.field2859[var17] = null;
                while (var18 != null) {
                    class104 var19 = var18.field1726;
                    var18.field1726 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2853 < 0) {
            this.field2853 = 0;
        }
        if (this.field2843 != null) {
            this.field2843.method498(arg0, 0, arg1);
        }
        this.field2832 = class7.method31((byte) -88);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILth;)V")
    public final synchronized void method1220(int arg0, class104 arg1) {
        this.field2843 = arg1;
        if (arg0 == 3) {
            field2845++;
        }
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "()I")
    public int method943() throws Exception {
        field2839++;
        return this.field2854;
    }
}
