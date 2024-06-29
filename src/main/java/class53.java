import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class53 {

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    private int field826 = 32;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "J")
    private long field831 = class128.method869((byte) -55);

    @OriginalMember(owner = "client!vh", name = "w", descriptor = "[Lqb;")
    private class102[] field848 = new class102[8];

    @OriginalMember(owner = "client!vh", name = "x", descriptor = "I")
    private int field849 = 0;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "J")
    private long field847 = 0L;

    @OriginalMember(owner = "client!vh", name = "E", descriptor = "I")
    private int field856 = 0;

    @OriginalMember(owner = "client!vh", name = "A", descriptor = "Z")
    private boolean field852 = true;

    @OriginalMember(owner = "client!vh", name = "z", descriptor = "[Lqb;")
    private class102[] field851 = new class102[8];

    @OriginalMember(owner = "client!vh", name = "y", descriptor = "J")
    private long field850 = 0L;

    @OriginalMember(owner = "client!vh", name = "G", descriptor = "I")
    private int field858 = 0;

    @OriginalMember(owner = "client!vh", name = "C", descriptor = "I")
    private int field854 = 0;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "Lna;")
    public static class26 field828 = class69.method505(":", (byte) -119);

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "Lna;")
    public static class26 field834 = class69.method505("Verbindung mit Update)2Server)3)3)3", (byte) -123);

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "[I")
    public static int[] field827 = new int[100];

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "[I")
    public static int[] field841 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    public static int field844 = 0;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "[I")
    public static int[] field846 = new int[128];

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!vh", name = "B", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!vh", name = "D", descriptor = "I")
    private int field855;

    @OriginalMember(owner = "client!vh", name = "F", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!vh", name = "H", descriptor = "I")
    public int field859;

    @OriginalMember(owner = "client!vh", name = "I", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!vh", name = "J", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!vh", name = "K", descriptor = "I")
    public int field862;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "Lqb;")
    private class102 field833;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "[I")
    public int[] field839;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "()V", line = 12)
    public void method383() throws Exception {
        field836++;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V", line = 21)
    public void method384(int arg0) throws Exception {
        field842++;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "()V", line = 28)
    public void method385() throws Exception {
        field845++;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([II)V", line = 35)
    private final void method386(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class26.field395) {
            var3 = arg1 << 1;
        }
        class75.method542(arg0, 0, var3);
        this.field856 -= arg1;
        if (this.field833 != null && this.field856 <= 0) {
            this.field856 += class168.field2603 >> 4;
            class314.method2179(true, this.field833);
            this.method389(this.field833, this.field833.method432(), (byte) -24);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
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
                        class102 var10 = null;
                        class102 var11 = this.field848[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class257 var12 = var11.field1642;
                                if (var12 == null || var12.field4200 <= var8) {
                                    var11.field1643 = true;
                                    int var13 = var11.method435();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field4200 += var13;
                                    }
                                    if (var4 >= this.field826) {
                                        break label105;
                                    }
                                    class102 var14 = var11.method448();
                                    if (var14 != null) {
                                        int var15 = var11.field1641;
                                        while (var14 != null) {
                                            this.method389(var14, var15 * var14.method432() >> 8, (byte) -24);
                                            var14 = var11.method470();
                                        }
                                    }
                                    class102 var16 = var11.field1644;
                                    var11.field1644 = null;
                                    if (var10 == null) {
                                        this.field848[var7] = var16;
                                    } else {
                                        var10.field1644 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field851[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1644;
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
                class102 var18 = this.field848[var17];
                this.field848[var17] = this.field851[var17] = null;
                while (var18 != null) {
                    class102 var19 = var18.field1644;
                    var18.field1644 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field856 < 0) {
            this.field856 = 0;
        }
        if (this.field833 != null) {
            this.field833.method427(arg0, 0, arg1);
        }
        this.field831 = class128.method869((byte) -55);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V", line = 194)
    public final synchronized void method387(byte arg0) {
        field857++;
        if (this.field839 == null) {
            return;
        }
        long var2 = class128.method869((byte) -55);
        try {
            if (this.field850 != 0L) {
                if (var2 < this.field850) {
                    return;
                }
                this.method384(this.field862);
                this.field852 = true;
                this.field850 = 0L;
            }
            int var4 = this.method391();
            if (this.field849 < (this.field854 - var4)) {
                this.field849 = this.field854 - var4;
            }
            int var5 = this.field859 + this.field855;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (this.field862 < var5 + 256) {
                this.field862 += 1024;
                if (this.field862 > 16384) {
                    this.field862 = 16384;
                }
                this.method394();
                var4 = 0;
                this.method384(this.field862);
                if (this.field862 < var5 + 256) {
                    var5 = this.field862 - 256;
                    this.field855 = var5 - this.field859;
                }
                this.field852 = true;
            }
            while (var5 > var4) {
                var4 += 256;
                this.method386(this.field839, 256);
                this.method383();
            }
            if (var2 > this.field847) {
                if (this.field852) {
                    this.field852 = false;
                } else if (this.field849 == 0 && this.field858 == 0) {
                    this.method394();
                    this.field850 = var2 + 2000L;
                    return;
                } else {
                    this.field855 = Math.min(this.field858, this.field849);
                    this.field858 = this.field849;
                }
                this.field847 = var2 + 2000L;
                this.field849 = 0;
            }
            this.field854 = var4;
        } catch (Exception var9) {
            this.method394();
            this.field850 = var2 + 2000L;
        }
        try {
            if (var2 > this.field831 + 500000L) {
                var2 = this.field831;
            }
            if (arg0 != -34) {
                return;
            }
            while (var2 > this.field831 + 5000L) {
                this.method395(256, 1);
                this.field831 += (long) (256000 / class168.field2603);
            }
        } catch (Exception var8) {
            this.field831 = var2;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILqb;)V", line = 309)
    public final synchronized void method388(int arg0, class102 arg1) {
        field861++;
        int var3 = -128 / ((arg0 + 58) / 54);
        this.field833 = arg1;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lqb;IB)V", line = 321)
    private final void method389(class102 arg0, int arg1, byte arg2) {
        if (arg2 != -24) {
            this.method389((class102) null, -105, (byte) 87);
        }
        field832++;
        int var4 = arg1 >> 5;
        class102 var5 = this.field851[var4];
        if (var5 == null) {
            this.field848[var4] = arg0;
        } else {
            var5.field1644 = arg0;
        }
        this.field851[var4] = arg0;
        arg0.field1641 = arg1;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILwa;)Lbd;", line = 352)
    public static final class306 method390(int arg0, class82 arg1) {
        class306 var2 = new class306();
        var2.field5274 = arg1.method576(arg0 - 1023);
        if (arg0 != 1024) {
            method396((class86) null, 34, 103, -93);
        }
        field837++;
        var2.field5277 = class56.method410(12345678, var2.field5274);
        return var2;
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "()I", line = 373)
    public int method391() throws Exception {
        field853++;
        return this.field862;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)V", line = 384)
    public final synchronized void method392(byte arg0) {
        field835++;
        this.field852 = true;
        try {
            this.method385();
        } catch (Exception var4) {
            this.method394();
            this.field850 = class128.method869((byte) -55) + 2000L;
        }
        int var3 = 91 % ((arg0 - 47) / 60);
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V", line = 411)
    public final void method393(int arg0) {
        this.field852 = true;
        field829++;
        if (arg0 <= 54) {
            this.field852 = true;
        }
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "()V", line = 422)
    public void method394() {
        field843++;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)V", line = 435)
    private final void method395(int arg0, int arg1) {
        field840++;
        this.field856 -= arg0;
        if (this.field856 < 0) {
            this.field856 = 0;
        }
        if (arg1 != 1) {
            this.field831 = -60L;
        }
        if (this.field833 != null) {
            this.field833.method443(arg0);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lth;III)V", line = 457)
    public static final void method396(class86 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class285.field4778) {
            class55 var4 = class36.field585[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field886 != null && var4.field886.field2095.method673()) {
                arg0.method674(var4.field886.field2095, 128, 0, 0, true);
            }
        }
        if (arg3 < class285.field4778) {
            class55 var5 = class36.field585[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field886 != null && var5.field886.field2095.method673()) {
                arg0.method674(var5.field886.field2095, 0, 0, 128, true);
            }
        }
        if (arg2 < class285.field4778 && arg3 < class303.field5221) {
            class55 var6 = class36.field585[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field886 != null && var6.field886.field2095.method673()) {
                arg0.method674(var6.field886.field2095, 128, 0, 128, true);
            }
        }
        if (arg2 < class285.field4778 && arg3 > 0) {
            class55 var7 = class36.field585[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field886 != null && var7.field886.field2095.method673()) {
                arg0.method674(var7.field886.field2095, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)V", line = 505)
    public final synchronized void method397(boolean arg0) {
        if (class11.field151 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class11.field151.field5419[var3] == this) {
                    class11.field151.field5419[var3] = null;
                }
                if (class11.field151.field5419[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class11.field151.field5410 = true;
                while (class11.field151.field5423) {
                    class126.method862(50L, 64);
                }
                class11.field151 = null;
            }
        }
        this.method394();
        this.field839 = null;
        if (!arg0) {
            field860++;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 548)
    public void method398(Component arg0) throws Exception {
        field838++;
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)V", line = 602)
    public static void method399(int arg0) {
        field828 = null;
        field834 = null;
        field841 = null;
        if (arg0 != 0) {
            method399(-20);
        }
        field827 = null;
        field846 = null;
    }
}
