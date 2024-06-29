import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class189 extends class134 {

    @OriginalMember(owner = "client!ss", name = "m", descriptor = "I")
    private int field2819 = 0;

    @OriginalMember(owner = "client!ss", name = "k", descriptor = "Lwk;")
    private class155 field2817 = new class155(16);

    @OriginalMember(owner = "client!ss", name = "G", descriptor = "I")
    private int field2838 = 0;

    @OriginalMember(owner = "client!ss", name = "K", descriptor = "Lcf;")
    private class92 field2842 = new class92();

    @OriginalMember(owner = "client!ss", name = "M", descriptor = "J")
    private long field2844 = 0L;

    @OriginalMember(owner = "client!ss", name = "j", descriptor = "I")
    private int field2816;

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "Lq;")
    private class102 field2812;

    @OriginalMember(owner = "client!ss", name = "D", descriptor = "Z")
    private boolean field2835;

    @OriginalMember(owner = "client!ss", name = "E", descriptor = "Lcf;")
    private class92 field2836;

    @OriginalMember(owner = "client!ss", name = "o", descriptor = "I")
    private int field2821;

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "Lq;")
    private class102 field2813;

    @OriginalMember(owner = "client!ss", name = "L", descriptor = "Z")
    private boolean field2843;

    @OriginalMember(owner = "client!ss", name = "y", descriptor = "I")
    private int field2831;

    @OriginalMember(owner = "client!ss", name = "v", descriptor = "Lii;")
    private class412 field2828;

    @OriginalMember(owner = "client!ss", name = "i", descriptor = "Lls;")
    private class99 field2815;

    @OriginalMember(owner = "client!ss", name = "s", descriptor = "Lod;")
    private class464 field2825;

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "I")
    public static int field2811 = 0;

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!ss", name = "l", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!ss", name = "n", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!ss", name = "q", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!ss", name = "r", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!ss", name = "t", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!ss", name = "w", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!ss", name = "z", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!ss", name = "B", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!ss", name = "C", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!ss", name = "F", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!ss", name = "H", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!ss", name = "J", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!ss", name = "x", descriptor = "Lam;")
    public static class199 field2830;

    @OriginalMember(owner = "client!ss", name = "p", descriptor = "Lba;")
    private class71 field2822;

    @OriginalMember(owner = "client!ss", name = "I", descriptor = "Z")
    private boolean field2840;

    @OriginalMember(owner = "client!ss", name = "u", descriptor = "[B")
    private byte[] field2827;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V")
    public static void method1325(byte arg0) {
        int var1 = 35 % ((arg0 + 55) / 43);
        field2830 = null;
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(B)V")
    public final void method1326(byte arg0) {
        field2833++;
        if (this.field2836 != null) {
            if (this.method995(255) == null) {
                return;
            }
            if (this.field2835) {
                boolean var2 = true;
                for (class449 var3 = this.field2836.method775(1); var3 != null; var3 = this.field2836.method763(0)) {
                    int var5 = (int) var3.field6382;
                    if (this.field2827[var5] == 0) {
                        this.method1335(124, var5, 1);
                    }
                    if (this.field2827[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method2714(-126);
                    }
                }
                while (this.field2822.field1027.length > this.field2838) {
                    if (this.field2822.field1027[this.field2838] == 0) {
                        this.field2838++;
                    } else {
                        if (this.field2815.field1407 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field2827[this.field2838] == 0) {
                            this.method1335(115, this.field2838, 1);
                        }
                        if (this.field2827[this.field2838] == 0) {
                            class449 var4 = new class449();
                            var4.field6382 = (long) this.field2838;
                            this.field2836.method766(var4, -1);
                            var2 = false;
                        }
                        this.field2838++;
                    }
                }
                if (var2) {
                    this.field2835 = false;
                    this.field2838 = 0;
                }
            } else if (this.field2840) {
                boolean var6 = true;
                for (class449 var7 = this.field2836.method775(1); var7 != null; var7 = this.field2836.method763(0)) {
                    int var9 = (int) var7.field6382;
                    if (this.field2827[var9] != 1) {
                        this.method1335(96, var9, 2);
                    }
                    if (this.field2827[var9] == 1) {
                        var7.method2714(118);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field2822.field1027.length > this.field2838) {
                    if (this.field2822.field1027[this.field2838] == 0) {
                        this.field2838++;
                    } else {
                        if (this.field2828.method2478(-127)) {
                            var6 = false;
                            break;
                        }
                        if (this.field2827[this.field2838] != 1) {
                            this.method1335(105, this.field2838, 2);
                        }
                        if (this.field2827[this.field2838] != 1) {
                            class449 var8 = new class449();
                            var8.field6382 = (long) this.field2838;
                            var6 = false;
                            this.field2836.method766(var8, -1);
                        }
                        this.field2838++;
                    }
                }
                if (var6) {
                    this.field2838 = 0;
                    this.field2840 = false;
                }
            } else {
                this.field2836 = null;
            }
        }
        if (this.field2843 && this.field2844 <= class10.method51(-3183)) {
            for (class464 var10 = (class464) this.field2817.method1097(64); var10 != null; var10 = (class464) this.field2817.method1105(false)) {
                if (!var10.field6539) {
                    if (var10.field6541) {
                        if (!var10.field6546) {
                            throw new RuntimeException();
                        }
                        var10.method2714(-63);
                    } else {
                        var10.field6541 = true;
                    }
                }
            }
            this.field2844 = class10.method51(-3183) + 1000L;
        }
        int var11 = 10 / ((44 - arg0) / 63);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IZ)V")
    public static final void method1327(int arg0, boolean arg1) {
        field2824++;
        if (class369.method2261(0, arg0)) {
            if (!arg1) {
                method1327(-3, true);
            }
            class353.method2179(class263.field3787[arg0], -1, -109);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Z)I")
    public final int method1328(boolean arg0) {
        field2826++;
        if (this.field2822 == null) {
            return 0;
        } else if (arg0) {
            return this.field2822.field1022;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(Z)V")
    public final void method1329(boolean arg0) {
        field2832++;
        if (this.field2836 == null || this.method995(255) == null) {
            return;
        }
        if (!arg0) {
            this.field2844 = -60L;
        }
        for (class449 var2 = this.field2842.method775(1); var2 != null; var2 = this.field2842.method763(0)) {
            int var3 = (int) var2.field6382;
            if (var3 < 0 || this.field2822.field1015 <= var3 || this.field2822.field1027[var3] == 0) {
                var2.method2714(107);
            } else {
                if (this.field2827[var3] == 0) {
                    this.method1335(106, var3, 1);
                }
                if (this.field2827[var3] == -1) {
                    this.method1335(100, var3, 2);
                }
                if (this.field2827[var3] == 1) {
                    var2.method2714(-83);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "(II)I")
    public final int method996(int arg0, int arg1) {
        field2814++;
        if (arg0 != 0) {
            field2811 = -44;
        }
        class464 var3 = (class464) this.field2817.method1104(-127, (long) arg1);
        return var3 == null ? 0 : var3.method1320(0);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(BI)[B")
    public final byte[] method994(byte arg0, int arg1) {
        field2820++;
        class464 var3 = this.method1335(arg0 ^ 0x13, arg1, 0);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.method1319(100);
        if (arg0 == 105) {
            var3.method2714(arg0 - 171);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "(B)I")
    public final int method1330(byte arg0) {
        field2809++;
        if (arg0 != -84) {
            method1334(-88, -74);
        }
        if (this.method995(255) == null) {
            return this.field2825 == null ? 0 : this.field2825.method1320(0);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "(B)I")
    public final int method1331(byte arg0) {
        field2818++;
        if (this.field2822 == null) {
            return 0;
        } else if (this.field2835) {
            class449 var2 = this.field2836.method775(1);
            if (arg0 != 108) {
                this.field2819 = -38;
            }
            return var2 == null ? 0 : (int) var2.field6382;
        } else {
            return this.field2822.field1022;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)V")
    public final void method992(int arg0, int arg1) {
        field2839++;
        if (this.field2812 == null) {
            return;
        }
        for (class449 var3 = this.field2842.method775(1); var3 != null; var3 = this.field2842.method763(0)) {
            if ((long) arg1 == var3.field6382) {
                return;
            }
        }
        class449 var4 = new class449();
        var4.field6382 = (long) arg1;
        int var5 = 35 / ((6 - arg0) / 57);
        this.field2842.method766(var4, -1);
    }

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "(B)I")
    public final int method1332(byte arg0) {
        field2834++;
        if (arg0 != -86) {
            field2830 = null;
        }
        return this.field2819;
    }

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "(Z)V")
    public final void method1333(boolean arg0) {
        field2841++;
        if (!arg0 && this.field2812 != null) {
            this.field2840 = true;
            if (this.field2836 == null) {
                this.field2836 = new class92();
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "(II)I")
    public static final int method1334(int arg0, int arg1) {
        field2823++;
        int var2 = -105 / ((arg1 - 29) / 60);
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(III)Lod;")
    private final class464 method1335(int arg0, int arg1, int arg2) {
        if (arg0 < 92) {
            return null;
        }
        field2829++;
        class464 var4 = (class464) this.field2817.method1104(-125, (long) arg1);
        if (var4 != null && arg2 == 0 && !var4.field6546 && var4.field6539) {
            var4.method2714(-114);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field2812 == null || this.field2827[arg1] == -1) {
                    if (this.field2828.method2467(-21)) {
                        return null;
                    }
                    var4 = this.field2828.method2468(-21, true, this.field2816, arg1, (byte) 2);
                } else {
                    var4 = this.field2815.method813(this.field2812, arg1, (byte) 120);
                }
            } else if (arg2 == 1) {
                if (this.field2812 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field2815.method814(arg1, this.field2812, 11748);
            } else if (arg2 == 2) {
                if (this.field2812 == null) {
                    throw new RuntimeException();
                }
                if (this.field2827[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field2828.method2478(-100)) {
                    return null;
                }
                var4 = this.field2828.method2468(-21, false, this.field2816, arg1, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field2817.method1100(var4, -5, (long) arg1);
        }
        if (var4.field6539) {
            return null;
        }
        byte[] var5 = var4.method1319(100);
        if (!var4 instanceof class186) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class131.field1794.reset();
                class131.field1794.update(var5, 0, var5.length - 2);
                int var9 = (int) class131.field1794.getValue();
                if (this.field2822.field1029[arg1] != var9) {
                    throw new RuntimeException();
                }
                this.field2828.field5663 = 0;
                this.field2828.field5662 = 0;
            } catch (RuntimeException var12) {
                this.field2828.method2464(-8296);
                var4.method2714(122);
                if (var4.field6546 && !this.field2828.method2467(-21)) {
                    class491 var10 = this.field2828.method2468(-21, true, this.field2816, arg1, (byte) 2);
                    this.field2817.method1100(var10, -111, (long) arg1);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field2822.field1021[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field2822.field1021[arg1];
            if (this.field2812 != null) {
                this.field2815.method819(-127, var5, arg1, this.field2812);
                if (this.field2827[arg1] != 1) {
                    this.field2819++;
                    this.field2827[arg1] = 1;
                }
            }
            if (!var4.field6546) {
                var4.method2714(-118);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class131.field1794.reset();
            class131.field1794.update(var5, 0, var5.length - 2);
            int var6 = (int) class131.field1794.getValue();
            if (this.field2822.field1029[arg1] != var6) {
                throw new RuntimeException();
            }
            int var7 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field2822.field1021[arg1] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field2827[arg1] != 1) {
                this.field2819++;
                this.field2827[arg1] = 1;
            }
            if (!var4.field6546) {
                var4.method2714(-50);
            }
            return var4;
        } catch (Exception var11) {
            this.field2827[arg1] = -1;
            var4.method2714(-88);
            if (var4.field6546 && !this.field2828.method2467(-21)) {
                class491 var8 = this.field2828.method2468(-21, true, this.field2816, arg1, (byte) 2);
                this.field2817.method1100(var8, -120, (long) arg1);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)Lba;")
    public final class71 method995(int arg0) {
        field2837++;
        if (this.field2822 != null) {
            return this.field2822;
        }
        if (this.field2825 == null) {
            if (this.field2828.method2467(-21)) {
                return null;
            }
            this.field2825 = this.field2828.method2468(-21, true, 255, this.field2816, (byte) 0);
        }
        if (this.field2825.field6539) {
            return null;
        }
        byte[] var2 = this.field2825.method1319(100);
        if (this.field2825 instanceof class186) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2822 = new class71(var2, this.field2821);
                if (this.field2822.field1026 != this.field2831) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field2822 = null;
                if (this.field2828.method2467(-21)) {
                    this.field2825 = null;
                } else {
                    this.field2825 = this.field2828.method2468(-21, true, 255, this.field2816, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2822 = new class71(var2, this.field2821);
            } catch (RuntimeException var4) {
                this.field2828.method2464(-8296);
                this.field2822 = null;
                if (this.field2828.method2467(arg0 ^ 0xFFFFFF14)) {
                    this.field2825 = null;
                } else {
                    this.field2825 = this.field2828.method2468(-21, true, 255, this.field2816, (byte) 0);
                }
                return null;
            }
            if (this.field2813 != null) {
                this.field2815.method819(arg0 ^ 0xFFFFFF7D, var2, this.field2816, this.field2813);
            }
        }
        if (arg0 != 255) {
            this.method995(-112);
        }
        this.field2825 = null;
        if (this.field2812 != null) {
            this.field2827 = new byte[this.field2822.field1015];
            this.field2819 = 0;
        }
        return this.field2822;
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(ILq;Lq;Lii;Lls;IIZ)V")
    public class189(int arg0, class102 arg1, class102 arg2, class412 arg3, class99 arg4, int arg5, int arg6, boolean arg7) {
        this.field2816 = arg0;
        this.field2812 = arg1;
        if (this.field2812 == null) {
            this.field2835 = false;
        } else {
            this.field2835 = true;
            this.field2836 = new class92();
        }
        this.field2821 = arg5;
        this.field2813 = arg2;
        this.field2843 = arg7;
        this.field2831 = arg6;
        this.field2828 = arg3;
        this.field2815 = arg4;
        if (this.field2813 != null) {
            this.field2825 = this.field2815.method813(this.field2813, this.field2816, (byte) 94);
        }
    }
}
