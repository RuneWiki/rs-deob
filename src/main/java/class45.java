import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class45 {

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    private int field814 = 32;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "J")
    private long field817 = class153.method1032(104);

    @OriginalMember(owner = "client!fk", name = "F", descriptor = "I")
    private int field841 = 0;

    @OriginalMember(owner = "client!fk", name = "I", descriptor = "[Lvg;")
    private class266[] field844 = new class266[8];

    @OriginalMember(owner = "client!fk", name = "K", descriptor = "I")
    private int field846 = 0;

    @OriginalMember(owner = "client!fk", name = "L", descriptor = "Z")
    private boolean field847 = true;

    @OriginalMember(owner = "client!fk", name = "M", descriptor = "[Lvg;")
    private class266[] field848 = new class266[8];

    @OriginalMember(owner = "client!fk", name = "C", descriptor = "J")
    private long field838 = 0L;

    @OriginalMember(owner = "client!fk", name = "N", descriptor = "I")
    private int field849 = 0;

    @OriginalMember(owner = "client!fk", name = "G", descriptor = "I")
    private int field842 = 0;

    @OriginalMember(owner = "client!fk", name = "O", descriptor = "J")
    private long field850 = 0L;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "Z")
    public static boolean field825 = true;

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "[J")
    public static long[] field832 = new long[1000];

    @OriginalMember(owner = "client!fk", name = "E", descriptor = "Ljf;")
    private static class229 field840 = class212.method1457((byte) 62, "Attack");

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "Ljf;")
    public static class229 field815 = field840;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!fk", name = "x", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!fk", name = "B", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!fk", name = "D", descriptor = "I")
    public int field839;

    @OriginalMember(owner = "client!fk", name = "H", descriptor = "I")
    public int field843;

    @OriginalMember(owner = "client!fk", name = "J", descriptor = "I")
    private int field845;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "Lvg;")
    private class266 field829;

    @OriginalMember(owner = "client!fk", name = "A", descriptor = "[I")
    public int[] field836;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V", line = 6)
    public final synchronized void method388(int arg0) {
        field834++;
        if (class10.field125 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class10.field125.field2451[var3] == this) {
                    class10.field125.field2451[var3] = null;
                }
                if (class10.field125.field2451[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class10.field125.field2446 = true;
                while (class10.field125.field2457) {
                    class235.method1675((byte) -22, 50L);
                }
                class10.field125 = null;
            }
        }
        this.method78();
        if (arg0 != -4213) {
            this.method78();
        }
        this.field836 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "()V", line = 52)
    public void method80() throws Exception {
        field827++;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II[[I[[FZI[[FI[[IIZ[[FILkc;IIFI)I", line = 60)
    public static final int method389(int arg0, int arg1, int[][] arg2, float[][] arg3, boolean arg4, int arg5, float[][] arg6, int arg7, int[][] arg8, int arg9, boolean arg10, float[][] arg11, int arg12, class37 arg13, int arg14, int arg15, float arg16, int arg17) {
        if (arg12 == 1) {
            int var18 = arg14;
            arg14 = arg7;
            arg7 = 128 - var18;
        } else if (arg12 == 2) {
            arg7 = 128 - arg7;
            arg14 = 128 - arg14;
        } else if (arg12 == 3) {
            int var19 = arg14;
            arg14 = 128 - arg7;
            arg7 = var19;
        }
        if (!arg4) {
            method397(-84, 9);
        }
        field819++;
        float var20;
        float var21;
        int var22;
        float var23;
        if (arg14 == 0 && arg7 == 0) {
            var20 = arg6[arg5][arg9];
            var21 = arg11[arg5][arg9];
            var22 = arg15;
            var23 = arg3[arg5][arg9];
        } else if (arg14 == 128 && arg7 == 0) {
            var21 = arg11[arg5 + 1][arg9];
            var22 = arg1;
            var23 = arg3[arg5 + 1][arg9];
            var20 = arg6[arg5 + 1][arg9];
        } else if (arg14 == 128 && arg7 == 128) {
            var21 = arg11[arg5 + 1][arg9 + 1];
            var22 = arg0;
            var23 = arg3[arg5 + 1][arg9 + 1];
            var20 = arg6[arg5 + 1][arg9 + 1];
        } else if (arg14 == 0 && arg7 == 128) {
            var20 = arg6[arg5][arg9 + 1];
            var23 = arg3[arg5][arg9 + 1];
            var22 = arg17;
            var21 = arg11[arg5][arg9 + 1];
        } else {
            float var24 = arg3[arg5][arg9];
            float var25 = arg6[arg5][arg9];
            float var26 = (float) arg14 / 128.0F;
            float var27 = (arg6[arg5 + 1][arg9] - var25) * var26 + var25;
            float var28 = arg11[arg5][arg9 + 1];
            float var29 = arg11[arg5][arg9];
            float var30 = (arg11[arg5 + 1][arg9 + 1] - var28) * var26 + var28;
            float var31 = (float) arg7 / 128.0F;
            float var32 = (arg11[arg5 + 1][arg9] - var29) * var26 + var29;
            var21 = (var30 - var32) * var31 + var32;
            float var33 = arg3[arg5][arg9 + 1];
            float var34 = (arg3[arg5 + 1][arg9] - var24) * var26 + var24;
            float var35 = arg6[arg5][arg9 + 1];
            float var36 = (arg6[arg5 + 1][arg9 + 1] - var35) * var26 + var35;
            var20 = (var36 - var27) * var31 + var27;
            float var37 = (arg3[arg5 + 1][arg9 + 1] - var33) * var26 + var33;
            var23 = (var37 - var34) * var31 + var34;
            int var38 = class289.method2014(arg1, arg14, arg15, 464919239);
            int var39 = class289.method2014(arg0, arg14, arg17, 464919239);
            var22 = class289.method2014(var39, arg7, var38, 464919239);
        }
        int var40 = (arg5 << 7) + arg14;
        int var41 = (arg9 << 7) + arg7;
        int var42 = class107.method732(arg9, arg8, false, arg7, arg14, arg5);
        return arg13.method329(var40, var42, var41, var21, var20, var23, arg10 ? var22 & 0xFFFFFF00 : var22, arg2 == null ? 0.0F : (float) (var42 - class107.method732(arg9, arg2, false, arg7, arg14, arg5)) / arg16);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IBI)V", line = 173)
    public static final void method390(int arg0, byte arg1, int arg2) {
        field813++;
        class10 var3 = class205.method1427(5000, arg2);
        int var4 = var3.field123;
        if (arg1 != 86) {
            field825 = false;
        }
        int var5 = var3.field127;
        int var6 = var3.field114;
        int var7 = client.field4464[var5 - var6];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var6;
        class16.method160(var8 & arg0 << var6 | ~var8 & class28.field497[var4], (byte) -20, var4);
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "()V", line = 205)
    public void method81() throws Exception {
        field824++;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)V", line = 214)
    private final void method391(int arg0, int arg1) {
        field812++;
        this.field846 -= arg0;
        int var3 = -9 % ((arg1 - 17) / 42);
        if (this.field846 < 0) {
            this.field846 = 0;
        }
        if (this.field829 != null) {
            this.field829.method618(arg0);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lvg;I)V", line = 230)
    public final synchronized void method392(class266 arg0, int arg1) {
        this.field829 = arg0;
        if (arg1 == 0) {
            field831++;
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V", line = 241)
    public void method82(int arg0) throws Exception {
        field821++;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "([II)V", line = 249)
    private final void method393(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class128.field2292) {
            var3 = arg1 << 1;
        }
        class36.method324(arg0, 0, var3);
        this.field846 -= arg1;
        if (this.field829 != null && this.field846 <= 0) {
            this.field846 += class22.field363 >> 4;
            class102.method685(this.field829, (byte) -123);
            this.method395(this.field829, (byte) -59, this.field829.method1219());
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
                        class266 var10 = null;
                        class266 var11 = this.field848[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class190 var12 = var11.field4570;
                                if (var12 == null || var12.field3305 <= var8) {
                                    var11.field4569 = true;
                                    int var13 = var11.method612();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3305 += var13;
                                    }
                                    if (var4 >= this.field814) {
                                        break label105;
                                    }
                                    class266 var14 = var11.method611();
                                    if (var14 != null) {
                                        int var15 = var11.field4568;
                                        while (var14 != null) {
                                            this.method395(var14, (byte) 73, var15 * var14.method1219() >> 8);
                                            var14 = var11.method620();
                                        }
                                    }
                                    class266 var16 = var11.field4567;
                                    var11.field4567 = null;
                                    if (var10 == null) {
                                        this.field848[var7] = var16;
                                    } else {
                                        var10.field4567 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field844[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field4567;
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
                class266 var18 = this.field848[var17];
                this.field848[var17] = this.field844[var17] = null;
                while (var18 != null) {
                    class266 var19 = var18.field4567;
                    var18.field4567 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field846 < 0) {
            this.field846 = 0;
        }
        if (this.field829 != null) {
            this.field829.method622(arg0, 0, arg1);
        }
        this.field817 = class153.method1032(118);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 408)
    public void method79(Component arg0) throws Exception {
        field837++;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V", line = 415)
    public final synchronized void method394(byte arg0) {
        this.field847 = true;
        field818++;
        try {
            if (arg0 != 59) {
                method397(55, -8);
            }
            this.method80();
        } catch (Exception var3) {
            this.method78();
            this.field838 = class153.method1032(108) + 2000L;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lvg;BI)V", line = 436)
    private final void method395(class266 arg0, byte arg1, int arg2) {
        int var4 = arg2 >> 5;
        int var5 = -28 % ((5 - arg1) / 63);
        field816++;
        class266 var6 = this.field844[var4];
        if (var6 == null) {
            this.field848[var4] = arg0;
        } else {
            var6.field4567 = arg0;
        }
        this.field844[var4] = arg0;
        arg0.field4568 = arg2;
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "()V", line = 455)
    public void method78() {
        field810++;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V", line = 469)
    public static void method396(boolean arg0) {
        field832 = null;
        if (!arg0) {
            field840 = null;
            field815 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)I", line = 491)
    public static final int method397(int arg0, int arg1) {
        field826++;
        return arg1 == 2000 ? arg0 >>> 8 : 61;
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "()I", line = 511)
    public int method83() throws Exception {
        field822++;
        return this.field839;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIIIIII)V", line = 519)
    public static final void method398(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field820++;
        int var10 = 49 % ((arg2 + 30) / 39);
        if (arg5 == arg6 && arg3 == arg8 && arg7 == arg9 && arg0 == arg4) {
            class3.method17(-14023, arg9, arg4, arg6, arg1, arg3);
            return;
        }
        int var11 = arg6;
        int var12 = arg6 * 3;
        int var13 = arg3 * 3;
        int var14 = arg3;
        int var15 = arg8 * 3;
        int var16 = arg5 * 3;
        int var17 = arg0 * 3;
        int var18 = arg7 * 3;
        int var19 = var12 + var18 - var16 - var16;
        int var20 = arg9 + var16 - var18 - arg6;
        int var21 = arg4 + var15 - arg3 - var17;
        int var22 = var15 - var13;
        int var23 = var16 - var12;
        int var24 = var13 + var17 - (var15 - -var15);
        for (int var25 = 128; var25 <= 4096; var25 += 128) {
            int var26 = var25 * var25 >> 12;
            int var27 = var25 * var26 >> 12;
            int var28 = var21 * var27;
            int var29 = var20 * var27;
            int var30 = var23 * var25;
            int var31 = var19 * var26;
            int var32 = var24 * var26;
            int var33 = var22 * var25;
            int var34 = (var30 + var31 + var29 >> 12) + arg6;
            int var35 = arg3 + (var32 + var33 + var28 >> 12);
            class3.method17(-14023, var34, var35, var11, arg1, var14);
            var14 = var35;
            var11 = var34;
        }
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(II)I", line = 593)
    public static final int method399(int arg0, int arg1) {
        field833++;
        int var2 = (arg0 & 0x55555555) + (arg0 >>> 1 & arg1);
        int var3 = (var2 & 0x33333333) + (var2 >>> 2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(II)I", line = 616)
    public static final int method400(int arg0, int arg1) {
        if (arg1 >= -49) {
            field825 = true;
        }
        field811++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)V", line = 636)
    public final void method401(byte arg0) {
        this.field847 = true;
        if (arg0 != -83) {
            this.method393((int[]) null, -82);
        }
        field830++;
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V", line = 652)
    public final synchronized void method402(int arg0) {
        field835++;
        if (this.field836 == null) {
            return;
        }
        long var2 = class153.method1032(arg0 ^ 0x65);
        try {
            if ((long) arg0 != this.field838) {
                if (this.field838 > var2) {
                    return;
                }
                this.method82(this.field839);
                this.field847 = true;
                this.field838 = 0L;
            }
            int var4 = this.method83();
            if (this.field842 < (this.field841 - var4)) {
                this.field842 = this.field841 - var4;
            }
            int var5 = this.field845 + this.field843;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (this.field839 < var5 + 256) {
                var4 = 0;
                this.field839 += 1024;
                if (this.field839 > 16384) {
                    this.field839 = 16384;
                }
                this.method78();
                this.method82(this.field839);
                if ((var5 + 256) > this.field839) {
                    var5 = this.field839 - 256;
                    this.field845 = var5 - this.field843;
                }
                this.field847 = true;
            }
            while (var4 < var5) {
                var4 += 256;
                this.method393(this.field836, 256);
                this.method81();
            }
            if (var2 > this.field850) {
                if (this.field847) {
                    this.field847 = false;
                } else if (this.field842 == 0 && this.field849 == 0) {
                    this.method78();
                    this.field838 = var2 + 2000L;
                    return;
                } else {
                    this.field845 = Math.min(this.field849, this.field842);
                    this.field849 = this.field842;
                }
                this.field842 = 0;
                this.field850 = var2 + 2000L;
            }
            this.field841 = var4;
        } catch (Exception var9) {
            this.method78();
            this.field838 = var2 + 2000L;
        }
        try {
            if (var2 > (this.field817 + 500000L)) {
                var2 = this.field817;
            }
            while (var2 > this.field817 + 5000L) {
                this.method391(256, 127);
                this.field817 += (long) (256000 / class22.field363);
            }
        } catch (Exception var8) {
            this.field817 = var2;
        }
    }
}
