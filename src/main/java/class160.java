import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class160 {

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "Z")
    private boolean field2825 = false;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    private int field2828 = 32;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "J")
    private long field2835 = class306.method2102(-289);

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "[Lmj;")
    private class252[] field2843 = new class252[8];

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
    private int field2842 = 0;

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "J")
    private long field2845 = 0L;

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
    private int field2848 = 0;

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "Z")
    private boolean field2850 = true;

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "[Lmj;")
    private class252[] field2847 = new class252[8];

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "I")
    private int field2852 = 0;

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "I")
    private int field2849 = 0;

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "J")
    private long field2853 = 0L;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field2826 = 0;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "Lul;")
    public static class51 field2823 = new class51(64);

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "I")
    public static int field2841 = 0;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "F")
    public static float field2832;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "I")
    private int field2844;

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "I")
    public int field2846;

    @OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
    public int field2851;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "Lmj;")
    private class252 field2836;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "[I")
    public int[] field2818;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 7)
    public void method1180(Component arg0) throws Exception {
        field2824++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "()I", line = 15)
    public int method1179() throws Exception {
        field2820++;
        return this.field2846;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "()V", line = 26)
    public void method1185() throws Exception {
        field2822++;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "()V", line = 39)
    public void method1184() throws Exception {
        field2829++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V", line = 46)
    public final synchronized void method1271(boolean arg0) {
        field2819++;
        this.field2850 = true;
        if (arg0) {
            method1275((byte) 22);
        }
        try {
            this.method1184();
        } catch (Exception var3) {
            this.method1182();
            this.field2845 = class306.method2102(-289) + 2000L;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V", line = 66)
    public static final void method1272(byte arg0) {
        class57.field882.method466(-1);
        if (arg0 != -4) {
            method1272((byte) -128);
        }
        class250.field4053.method466(-1);
        field2830++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([II)V", line = 78)
    private final void method1273(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class26.field360) {
            var3 = arg1 << 1;
        }
        class345.method2418(arg0, 0, var3);
        this.field2848 -= arg1;
        if (this.field2836 != null && this.field2848 <= 0) {
            this.field2848 += class266.field4291 >> 4;
            class212.method1574(this.field2836, (byte) 90);
            this.method1277(this.field2836.method1757(), -96, this.field2836);
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
                        class252 var10 = null;
                        class252 var11 = this.field2847[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class333 var12 = var11.field4061;
                                if (var12 == null || var12.field5293 <= var8) {
                                    var11.field4059 = true;
                                    int var13 = var11.method50();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field5293 += var13;
                                    }
                                    if (var4 >= this.field2828) {
                                        break label105;
                                    }
                                    class252 var14 = var11.method54();
                                    if (var14 != null) {
                                        int var15 = var11.field4060;
                                        while (var14 != null) {
                                            this.method1277(var15 * var14.method1757() >> 8, -83, var14);
                                            var14 = var11.method52();
                                        }
                                    }
                                    class252 var16 = var11.field4058;
                                    var11.field4058 = null;
                                    if (var10 == null) {
                                        this.field2847[var7] = var16;
                                    } else {
                                        var10.field4058 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2843[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field4058;
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
                class252 var18 = this.field2847[var17];
                this.field2847[var17] = this.field2843[var17] = null;
                while (var18 != null) {
                    class252 var19 = var18.field4058;
                    var18.field4058 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2848 < 0) {
            this.field2848 = 0;
        }
        if (this.field2836 != null) {
            this.field2836.method49(arg0, 0, arg1);
        }
        this.field2835 = class306.method2102(-289);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lmj;I)V", line = 241)
    public final synchronized void method1274(class252 arg0, int arg1) {
        field2833++;
        this.field2836 = arg0;
        if (arg1 >= -13) {
            this.field2847 = (class252[]) null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)V", line = 252)
    public static void method1275(byte arg0) {
        if (arg0 >= -2) {
            field2826 = -83;
        }
        field2823 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 265)
    public void method1183(int arg0) throws Exception {
        field2831++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BILcg;)Z", line = 272)
    public static final boolean method1276(byte arg0, int arg1, class49 arg2) {
        field2827++;
        byte[] var3 = arg2.method459(arg1, arg0 ^ 0x1B);
        if (var3 == null) {
            return false;
        } else {
            class285.method1948(127, var3);
            return arg0 == -28;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILmj;)V", line = 291)
    private final void method1277(int arg0, int arg1, class252 arg2) {
        if (arg1 >= -69) {
            return;
        }
        int var4 = arg0 >> 5;
        class252 var5 = this.field2843[var4];
        field2839++;
        if (var5 == null) {
            this.field2847[var4] = arg2;
        } else {
            var5.field4058 = arg2;
        }
        this.field2843[var4] = arg2;
        arg2.field4060 = arg0;
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "()V", line = 314)
    public void method1182() {
        field2837++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)V", line = 321)
    private final void method1278(int arg0, byte arg1) {
        if (arg1 <= 102) {
            field2841 = -9;
        }
        field2817++;
        this.field2848 -= arg0;
        if (this.field2848 < 0) {
            this.field2848 = 0;
        }
        if (this.field2836 != null) {
            this.field2836.method53(arg0);
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(Z)V", line = 343)
    public final synchronized void method1279(boolean arg0) {
        field2821++;
        if (this.field2825) {
            return;
        }
        long var2 = class306.method2102(-289);
        try {
            if ((this.field2835 + 500000L) < var2) {
                this.field2835 = var2 - 500000L;
            }
            while (var2 > this.field2835 + 5000L) {
                this.method1278(256, (byte) 105);
                this.field2835 += (long) (256000 / class266.field4291);
            }
        } catch (Exception var9) {
            this.field2835 = var2;
        }
        if (this.field2818 == null) {
            return;
        }
        try {
            if (this.field2845 != 0L) {
                if (var2 < this.field2845) {
                    return;
                }
                this.method1183(this.field2846);
                this.field2845 = 0L;
                this.field2850 = true;
            }
            if (!arg0) {
                this.field2853 = 50L;
            }
            int var5 = this.method1179();
            if (this.field2849 < this.field2852 - var5) {
                this.field2849 = this.field2852 - var5;
            }
            int var6 = this.field2851 + this.field2844;
            if ((var6 + 256) > 16384) {
                var6 = 16128;
            }
            if (this.field2846 < (var6 + 256)) {
                var5 = 0;
                this.field2846 += 1024;
                if (this.field2846 > 16384) {
                    this.field2846 = 16384;
                }
                this.method1182();
                this.method1183(this.field2846);
                this.field2850 = true;
                if ((var6 + 256) > this.field2846) {
                    var6 = this.field2846 - 256;
                    this.field2844 = var6 - this.field2851;
                }
            }
            while (var5 < var6) {
                var5 += 256;
                this.method1273(this.field2818, 256);
                this.method1185();
            }
            if (var2 > this.field2853) {
                if (this.field2850) {
                    this.field2850 = false;
                } else if (this.field2849 == 0 && this.field2842 == 0) {
                    this.method1182();
                    this.field2845 = var2 + 2000L;
                    return;
                } else {
                    this.field2844 = Math.min(this.field2842, this.field2849);
                    this.field2842 = this.field2849;
                }
                this.field2849 = 0;
                this.field2853 = var2 + 2000L;
            }
            this.field2852 = var5;
        } catch (Exception var8) {
            this.method1182();
            this.field2845 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(B)V", line = 466)
    public final synchronized void method1280(byte arg0) {
        field2840++;
        if (class31.field450 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class31.field450.field3896[var3] == this) {
                    class31.field450.field3896[var3] = null;
                }
                if (class31.field450.field3896[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class31.field450.field3909 = true;
                while (class31.field450.field3895) {
                    class142.method1149(50L, (byte) 125);
                }
                class31.field450 = null;
            }
        }
        this.method1182();
        this.field2825 = true;
        this.field2818 = null;
        if (arg0 != 76) {
            this.field2825 = false;
        }
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(B)V", line = 515)
    public final void method1281(byte arg0) {
        if (arg0 <= 96) {
            this.method1280((byte) 49);
        }
        this.field2850 = true;
        field2834++;
    }
}
