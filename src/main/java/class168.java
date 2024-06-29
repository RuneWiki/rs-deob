import java.awt.Component;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class168 {

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "I")
    private int field2820 = 32;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "J")
    private long field2813 = class183.method1195((byte) 125);

    @OriginalMember(owner = "client!gh", name = "J", descriptor = "I")
    private int field2838 = 0;

    @OriginalMember(owner = "client!gh", name = "I", descriptor = "J")
    private long field2837 = 0L;

    @OriginalMember(owner = "client!gh", name = "E", descriptor = "I")
    private int field2833 = 0;

    @OriginalMember(owner = "client!gh", name = "G", descriptor = "I")
    private int field2835 = 0;

    @OriginalMember(owner = "client!gh", name = "N", descriptor = "I")
    private int field2842 = 0;

    @OriginalMember(owner = "client!gh", name = "Q", descriptor = "[Lbe;")
    private class117[] field2845 = new class117[8];

    @OriginalMember(owner = "client!gh", name = "M", descriptor = "J")
    private long field2841 = 0L;

    @OriginalMember(owner = "client!gh", name = "S", descriptor = "Z")
    private boolean field2847 = true;

    @OriginalMember(owner = "client!gh", name = "F", descriptor = "[Lbe;")
    private class117[] field2834 = new class117[8];

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field2805 = 0;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "[[[I")
    public static int[][][] field2816 = new int[2][][];

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field2812 = 1;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "Lqj;")
    private static class196 field2819 = class80.method502("Loaded config", -48);

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    public static int field2818 = -1;

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "[I")
    public static int[] field2828 = new int[100];

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "Lqj;")
    public static class196 field2804 = field2819;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!gh", name = "A", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!gh", name = "B", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!gh", name = "C", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!gh", name = "H", descriptor = "I")
    public int field2836;

    @OriginalMember(owner = "client!gh", name = "K", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!gh", name = "L", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!gh", name = "O", descriptor = "I")
    public int field2843;

    @OriginalMember(owner = "client!gh", name = "R", descriptor = "I")
    private int field2846;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "Lbe;")
    private class117 field2822;

    @OriginalMember(owner = "client!gh", name = "P", descriptor = "Llj;")
    public static class205 field2844;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "Z")
    public static boolean field2815;

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "[I")
    public int[] field2826;

    @OriginalMember(owner = "client!gh", name = "D", descriptor = "[I")
    public static int[] field2832;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method680(Component arg0) throws Exception {
        field2814++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public void method678(int arg0) throws Exception {
        field2806++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BII)I")
    public static final int method1089(byte arg0, int arg1, int arg2) {
        field2810++;
        if (arg1 == -1) {
            return 12345678;
        }
        if (arg0 != -88) {
            field2832 = null;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
    public static final void method1090(byte arg0) {
        field2824++;
        if (field2805 == 0 || arg0 != 102) {
            return;
        }
        try {
            if (field2805 == 1) {
                if (class197.field3500.field2140 == 2) {
                    throw new IOException();
                }
                if (class197.field3500.field2140 != 1) {
                    return;
                }
                class194.field3408 = new class77((Socket) class197.field3500.field2135, field2844);
                class197.field3500 = null;
                class194.field3408.method484(class44.field520.field693, class44.field520.field699, 0, 3);
                field2805 = 2;
                class229.field4077.field699 = 0;
            }
            if (field2805 == 2) {
                if (class5.field35 != null) {
                    class5.field35.method1091(2);
                }
                if (class142.field2180 != null) {
                    class142.field2180.method1091(arg0 ^ 0x64);
                }
                int var1 = class194.field3408.method480(-88);
                if (class5.field35 != null) {
                    class5.field35.method1091(2);
                }
                if (class142.field2180 != null) {
                    class142.field2180.method1091(2);
                }
                if (var1 < 0) {
                    return;
                }
                if (class22.field289 == 1) {
                    if (var1 == 0) {
                        class41.field464 = 3;
                    } else {
                        class41.field464 = var1;
                    }
                }
                if (class22.field289 == 2) {
                    if (var1 == 0) {
                        class31.field389 = 3;
                    } else if (var1 == 21) {
                        field2805 = 3;
                        return;
                    } else {
                        class31.field389 = var1;
                    }
                }
                field2805 = 0;
                if (class22.field289 == 3) {
                    if (var1 == 0) {
                        class16.field179 = 3;
                    } else {
                        class16.field179 = var1;
                    }
                }
                class22.field289 = 0;
                if (class194.field3408 != null) {
                    class194.field3408.method481(true);
                }
                class194.field3408 = null;
            }
            if (field2805 == 3) {
                int var2 = class194.field3408.method479(30000);
                if (var2 > 0) {
                    class12.field141 = new class196[class194.field3408.method480(-108)];
                    field2805 = 4;
                }
            }
            if (field2805 == 4) {
                int var3 = class194.field3408.method479(30000);
                if (var3 >= class12.field141.length * 8) {
                    class229.field4077.field699 = 0;
                    class194.field3408.method482((byte) 89, 0, class12.field141.length * 8, class229.field4077.field693);
                    for (int var4 = 0; var4 < class12.field141.length; var4++) {
                        class12.field141[var4] = client.method627(class229.field4077.method319(18533), (byte) -125);
                    }
                    field2805 = 0;
                    class22.field289 = 0;
                    class31.field389 = 21;
                    if (class194.field3408 != null) {
                        class194.field3408.method481(true);
                    }
                    class194.field3408 = null;
                    return;
                }
            }
        } catch (IOException var5) {
            class22.field289 = 0;
            class41.field464 = 3;
            field2805 = 0;
            class31.field389 = 3;
            class16.field179 = 3;
            if (class194.field3408 != null) {
                class194.field3408.method481(true);
            }
            class194.field3408 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
    public final void method1091(int arg0) {
        this.field2847 = true;
        field2829++;
        if (arg0 != 2) {
            this.method677();
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lbe;I)V")
    public final synchronized void method1092(class117 arg0, int arg1) {
        this.field2822 = arg0;
        field2825++;
        if (arg1 != -3763) {
            this.field2833 = 17;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "()V")
    public void method679() throws Exception {
        field2803++;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "()V")
    public void method682() throws Exception {
        field2811++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([II)V")
    private final void method1093(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class165.field2715) {
            var3 = arg1 << 1;
        }
        class37.method187(arg0, 0, var3);
        this.field2833 -= arg1;
        if (this.field2822 != null && this.field2833 <= 0) {
            this.field2833 += class216.field3884 >> 4;
            class197.method1338(-99, this.field2822);
            this.method1096(this.field2822, this.field2822.method707(), (byte) -126);
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
                        class117 var10 = null;
                        class117 var11 = this.field2834[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class255 var12 = var11.field1684;
                                if (var12 == null || var12.field4486 <= var8) {
                                    var11.field1687 = true;
                                    int var13 = var11.method689();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field4486 += var13;
                                    }
                                    if (var4 >= this.field2820) {
                                        break label107;
                                    }
                                    class117 var14 = var11.method695();
                                    if (var14 != null) {
                                        int var15 = var11.field1686;
                                        while (var14 != null) {
                                            this.method1096(var14, var15 * var14.method707() >> 8, (byte) -104);
                                            var14 = var11.method699();
                                        }
                                    }
                                    class117 var16 = var11.field1685;
                                    var11.field1685 = null;
                                    if (var10 == null) {
                                        this.field2834[var7] = var16;
                                    } else {
                                        var10.field1685 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2845[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1685;
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
                class117 var18 = this.field2834[var17];
                this.field2834[var17] = this.field2845[var17] = null;
                while (var18 != null) {
                    class117 var19 = var18.field1685;
                    var18.field1685 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2833 < 0) {
            this.field2833 = 0;
        }
        if (this.field2822 != null) {
            this.field2822.method688(arg0, 0, arg1);
        }
        this.field2813 = class183.method1195((byte) 125);
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)V")
    public final synchronized void method1094(byte arg0) {
        field2809++;
        this.field2847 = true;
        try {
            if (arg0 <= 88) {
                method1101(-103);
            }
            this.method679();
        } catch (Exception var2) {
            this.method677();
            this.field2841 = class183.method1195((byte) 119) + 2000L;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)V")
    private final void method1095(int arg0, int arg1) {
        this.field2833 -= arg1;
        if (arg0 > this.field2833) {
            this.field2833 = 0;
        }
        field2807++;
        if (this.field2822 != null) {
            this.field2822.method696(arg1);
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "()V")
    public void method677() {
        field2821++;
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "()I")
    public int method681() throws Exception {
        field2839++;
        return this.field2836;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lbe;IB)V")
    private final void method1096(class117 arg0, int arg1, byte arg2) {
        field2808++;
        int var4 = arg1 >> 5;
        int var5 = 51 % ((arg2 + 57) / 46);
        class117 var6 = this.field2845[var4];
        if (var6 == null) {
            this.field2834[var4] = arg0;
        } else {
            var6.field1685 = arg0;
        }
        this.field2845[var4] = arg0;
        arg0.field1686 = arg1;
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V")
    public final synchronized void method1097(int arg0) {
        if (class1.field13 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class1.field13.field304[var3] == this) {
                    class1.field13.field304[var3] = null;
                }
                if (class1.field13.field304[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class1.field13.field311 = true;
                while (class1.field13.field305) {
                    class73.method464((byte) 62, 50L);
                }
                class1.field13 = null;
            }
        }
        this.method677();
        this.field2826 = null;
        field2831++;
        if (arg0 != -15693) {
            method1101(-15);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V")
    public final synchronized void method1098(boolean arg0) {
        field2817++;
        if (this.field2826 == null) {
            return;
        }
        long var2 = class183.method1195((byte) 125);
        try {
            if (this.field2841 != 0L) {
                if (this.field2841 > var2) {
                    return;
                }
                this.method678(this.field2836);
                this.field2841 = 0L;
                this.field2847 = true;
            }
            int var4 = this.method681();
            if (this.field2835 < this.field2842 - var4) {
                this.field2835 = this.field2842 - var4;
            }
            int var5 = this.field2846 + this.field2843;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field2836) {
                this.field2836 += 1024;
                if (this.field2836 > 16384) {
                    this.field2836 = 16384;
                }
                this.method677();
                this.method678(this.field2836);
                if (this.field2836 < var5 + 256) {
                    var5 = this.field2836 - 256;
                    this.field2846 = var5 - this.field2843;
                }
                var4 = 0;
                this.field2847 = true;
            }
            while (var4 < var5) {
                var4 += 256;
                this.method1093(this.field2826, 256);
                this.method682();
            }
            if (var2 > this.field2837) {
                if (this.field2847) {
                    this.field2847 = false;
                } else if (this.field2835 == 0 && this.field2838 == 0) {
                    this.method677();
                    this.field2841 = var2 + 2000L;
                    return;
                } else {
                    this.field2846 = Math.min(this.field2838, this.field2835);
                    this.field2838 = this.field2835;
                }
                this.field2837 = var2 + 2000L;
                this.field2835 = 0;
            }
            this.field2842 = var4;
        } catch (Exception var7) {
            this.method677();
            this.field2841 = var2 + 2000L;
        }
        try {
            if (var2 > this.field2813 + 500000L) {
                var2 = this.field2813;
            }
            while (this.field2813 + 5000L < var2) {
                this.method1095(0, 256);
                this.field2813 += 256000 / class216.field3884;
            }
        } catch (Exception var6) {
            this.field2813 = var2;
        }
        if (arg0) {
            field2818 = 14;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(Z)V")
    public static final void method1099(boolean arg0) {
        class84.field1237 = null;
        if (arg0) {
            method1090((byte) -28);
        }
        class77.field1126 = null;
        class31.field392 = null;
        field2823++;
        class240.field4261 = null;
        class203.field3645 = null;
        class234.field4169 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIZLdj;III)V")
    public static final void method1100(int arg0, int arg1, boolean arg2, class137 arg3, int arg4, int arg5, int arg6) {
        class137.method853(arg0, arg5, arg6, arg4, arg3.field2085, (byte) -121, arg1, arg3.field2081);
        if (!arg2) {
            field2830++;
        }
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)V")
    public static void method1101(int arg0) {
        field2804 = null;
        if (arg0 != 0) {
            method1101(80);
        }
        field2828 = null;
        field2816 = null;
        field2819 = null;
        field2844 = null;
        field2832 = null;
    }
}
