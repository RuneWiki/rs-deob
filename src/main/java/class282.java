import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class282 {

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "Z")
    public boolean field3816 = false;

    @OriginalMember(owner = "client!wt", name = "k", descriptor = "I")
    public int field3825 = -1;

    @OriginalMember(owner = "client!wt", name = "o", descriptor = "I")
    public int field3829 = 99;

    @OriginalMember(owner = "client!wt", name = "n", descriptor = "I")
    public int field3828 = 2;

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "Z")
    public boolean field3818 = false;

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "I")
    public int field3821 = -1;

    @OriginalMember(owner = "client!wt", name = "i", descriptor = "I")
    public int field3823 = 5;

    @OriginalMember(owner = "client!wt", name = "p", descriptor = "Z")
    public boolean field3830 = false;

    @OriginalMember(owner = "client!wt", name = "s", descriptor = "Z")
    public boolean field3833 = false;

    @OriginalMember(owner = "client!wt", name = "w", descriptor = "I")
    public int field3837 = -1;

    @OriginalMember(owner = "client!wt", name = "t", descriptor = "I")
    public int field3834 = -1;

    @OriginalMember(owner = "client!wt", name = "v", descriptor = "I")
    public int field3836 = -1;

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "I")
    public static int field3819 = -1;

    @OriginalMember(owner = "client!wt", name = "G", descriptor = "F")
    public static float field3846;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "I")
    public int field3817;

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!wt", name = "l", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!wt", name = "q", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!wt", name = "u", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!wt", name = "y", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!wt", name = "C", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!wt", name = "D", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!wt", name = "h", descriptor = "Lcf;")
    public class559 field3822;

    @OriginalMember(owner = "client!wt", name = "j", descriptor = "[I")
    private int[] field3824;

    @OriginalMember(owner = "client!wt", name = "m", descriptor = "[I")
    public int[] field3827;

    @OriginalMember(owner = "client!wt", name = "z", descriptor = "[I")
    public int[] field3840;

    @OriginalMember(owner = "client!wt", name = "A", descriptor = "[I")
    public int[] field3841;

    @OriginalMember(owner = "client!wt", name = "B", descriptor = "[I")
    public int[] field3842;

    @OriginalMember(owner = "client!wt", name = "F", descriptor = "[I")
    public int[] field3845;

    @OriginalMember(owner = "client!wt", name = "x", descriptor = "[Z")
    public boolean[] field3838;

    @OriginalMember(owner = "client!wt", name = "r", descriptor = "[[I")
    public int[][] field3832;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILda;IZII)Lda;")
    public final class55 method1692(int arg0, class55 arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg3) {
            method1696(-126);
        }
        field3839++;
        int var7 = this.field3840[arg4];
        int var8 = this.field3827[arg4];
        class612 var9 = this.field3822.method3270(13161, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg1.method97((byte) 1, arg0, true);
        }
        class612 var11 = null;
        if ((this.field3816 || class331.field4406) && arg5 != -1 && this.field3827.length > arg5) {
            int var12 = this.field3827[arg5];
            var11 = this.field3822.method3270(13161, var12 >> 16);
            arg5 = var12 & 0xFFFF;
        }
        class612 var13 = null;
        class612 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field3824 != null) {
            if (arg4 < this.field3824.length) {
                var15 = this.field3824[arg4];
                if (var15 != 65535) {
                    var13 = this.field3822.method3270(13161, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field3816 || class331.field4406) && arg5 != -1 && this.field3824.length > arg5) {
                var16 = this.field3824[arg5];
                if (var16 != 65535) {
                    var14 = this.field3822.method3270(13161, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field3830) {
            arg0 |= 0x200;
        }
        if (var9.method3510(1, var10)) {
            arg0 |= 0x80;
        }
        if (var9.method3509((byte) -64, var10)) {
            arg0 |= 0x100;
        }
        if (var9.method3506((byte) 111, var10)) {
            arg0 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method3510(1, var15)) {
                arg0 |= 0x80;
            }
            if (var13.method3509((byte) -85, var15)) {
                arg0 |= 0x100;
            }
            if (var13.method3506((byte) -29, var15)) {
                arg0 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method3510(1, arg5)) {
                arg0 |= 0x80;
            }
            if (var11.method3509((byte) 124, arg5)) {
                arg0 |= 0x100;
            }
            if (var11.method3506((byte) 97, arg5)) {
                arg0 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method3510(1, var16)) {
                arg0 |= 0x80;
            }
            if (var14.method3509((byte) 62, var16)) {
                arg0 |= 0x100;
            }
            if (var14.method3506((byte) -44, var16)) {
                arg0 |= 0x400;
            }
        }
        int var17 = arg0 | 0x20;
        class55 var18 = arg1.method97((byte) 1, var17, true);
        var18.method580(this.field3830, arg5, 0, var10, var9, var7, arg2 - 1, -3651, var11);
        if (var13 != null) {
            var18.method580(this.field3830, var16, 0, var15, var13, var7, arg2 - 1, -3651, var14);
        }
        return var18;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZIII)I")
    public final int method1693(boolean arg0, int arg1, int arg2, int arg3) {
        field3826++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field3827[arg2];
        class612 var8 = null;
        class612 var9 = this.field3822.method3270(13161, var7 >> 16);
        int var10 = 11 % ((-arg1 - 33) / 47);
        int var11 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field3816 || class331.field4406) && arg3 != -1 && this.field3827.length > arg3) {
            int var12 = this.field3827[arg3];
            var8 = this.field3822.method3270(13161, var12 >> 16);
            var6 = var12 & 0xFFFF;
        }
        if (this.field3830) {
            var5 |= 0x200;
        }
        if (var9.method3510(1, var11)) {
            var5 |= 0x80;
        }
        if (var9.method3509((byte) 53, var11)) {
            var5 |= 0x100;
        }
        if (var9.method3506((byte) -122, var11)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method3510(1, var6)) {
                var5 |= 0x80;
            }
            if (var8.method3509((byte) 90, var6)) {
                var5 |= 0x100;
            }
            if (var8.method3506((byte) 116, var6)) {
                var5 |= 0x400;
            }
        }
        if (this.field3824 != null && arg0) {
            if (this.field3824.length > arg2) {
                int var13 = this.field3824[arg2];
                if (var13 != 65535) {
                    class612 var14 = this.field3822.method3270(13161, var13 >> 16);
                    int var15 = var13 & 0xFFFF;
                    if (var14 != null) {
                        if (var14.method3510(1, var15)) {
                            var5 |= 0x80;
                        }
                        if (var14.method3509((byte) -44, var15)) {
                            var5 |= 0x100;
                        }
                        if (var14.method3506((byte) 119, var15)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field3816 || class331.field4406) && arg3 != -1 && this.field3824.length > arg3) {
                int var16 = this.field3824[arg3];
                if (var16 != 65535) {
                    class612 var17 = this.field3822.method3270(13161, var16 >> 16);
                    int var18 = var16 & 0xFFFF;
                    if (var17 != null) {
                        if (var17.method3510(1, var18)) {
                            var5 |= 0x80;
                        }
                        if (var17.method3509((byte) 66, var18)) {
                            var5 |= 0x100;
                        }
                        if (var17.method3506((byte) 3, var18)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lun;I)V")
    public final void method1694(class389 arg0, int arg1) {
        field3844++;
        while (true) {
            int var3 = arg0.method2229(255);
            if (var3 == 0) {
                if (arg1 == 512) {
                    return;
                } else {
                    method1697((byte) -72);
                    return;
                }
            }
            this.method1695(var3, (byte) -39, arg0);
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IBLun;)V")
    private final void method1695(int arg0, byte arg1, class389 arg2) {
        field3843++;
        if (arg0 == 1) {
            int var4 = arg2.method2260(-36);
            this.field3840 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3840[var5] = arg2.method2260(-89);
            }
            this.field3827 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field3827[var6] = arg2.method2260(-106);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field3827[var7] = (arg2.method2260(-66) << 16) + this.field3827[var7];
            }
        } else if (arg0 == 2) {
            this.field3821 = arg2.method2260(-46);
        } else if (arg0 == 3) {
            this.field3838 = new boolean[256];
            int var18 = arg2.method2229(255);
            for (int var19 = 0; var19 < var18; var19++) {
                this.field3838[arg2.method2229(255)] = true;
            }
        } else if (arg0 == 5) {
            this.field3823 = arg2.method2229(255);
        } else if (arg0 == 6) {
            this.field3837 = arg2.method2260(-99);
        } else if (arg0 == 7) {
            this.field3834 = arg2.method2260(-120);
        } else if (arg0 == 8) {
            this.field3829 = arg2.method2229(255);
        } else if (arg0 == 9) {
            this.field3825 = arg2.method2229(255);
        } else if (arg0 == 10) {
            this.field3836 = arg2.method2229(255);
        } else if (arg0 == 11) {
            this.field3828 = arg2.method2229(255);
        } else if (arg0 == 12) {
            int var15 = arg2.method2229(255);
            this.field3824 = new int[var15];
            for (int var16 = 0; var16 < var15; var16++) {
                this.field3824[var16] = arg2.method2260(-29);
            }
            for (int var17 = 0; var17 < var15; var17++) {
                this.field3824[var17] = (arg2.method2260(-30) << 16) + this.field3824[var17];
            }
        } else if (arg0 == 13) {
            int var11 = arg2.method2260(-68);
            this.field3832 = new int[var11][];
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = arg2.method2229(255);
                if (var13 > 0) {
                    this.field3832[var12] = new int[var13];
                    this.field3832[var12][0] = arg2.method2258(-3);
                    for (int var14 = 1; var14 < var13; var14++) {
                        this.field3832[var12][var14] = arg2.method2260(-96);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field3830 = true;
        } else if (arg0 == 15) {
            this.field3816 = true;
        } else if (arg0 == 16) {
            this.field3833 = true;
        } else if (arg0 == 18) {
            this.field3818 = true;
        } else if (arg0 == 19) {
            if (this.field3845 == null) {
                this.field3845 = new int[this.field3832.length];
                for (int var8 = 0; var8 < this.field3832.length; var8++) {
                    this.field3845[var8] = 255;
                }
            }
            this.field3845[arg2.method2229(255)] = arg2.method2229(255);
        } else if (arg0 == 20) {
            if (this.field3842 == null || this.field3841 == null) {
                this.field3842 = new int[this.field3832.length];
                this.field3841 = new int[this.field3832.length];
                for (int var9 = 0; var9 < this.field3832.length; var9++) {
                    this.field3842[var9] = 256;
                    this.field3841[var9] = 256;
                }
            }
            int var10 = arg2.method2229(255);
            this.field3842[var10] = arg2.method2260(-86);
            this.field3841[var10] = arg2.method2260(-80);
        }
        int var20 = -44 % ((arg1 - 13) / 43);
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
    public static final void method1696(int arg0) {
        field3820++;
        int var1 = -25 / ((arg0 - 36) / 61);
        if (class91.field1282 != null) {
            class91.field1282.method3283(-1826593640);
        }
        if (class611.field8756 == null) {
            return;
        }
        while (true) {
            try {
                class611.field8756.join();
                return;
            } catch (InterruptedException var2) {
            }
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)V")
    public static final void method1697(byte arg0) {
        field3835++;
        int var1 = 0;
        int var2 = 0;
        if (arg0 > -15) {
            field3819 = -125;
        }
        while (class473.field6604 > var2) {
            for (int var3 = 0; var3 < class205.field2465; var3++) {
                if (class114.method821(var3, class281.field3808, true, var2, var1, 26)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)V")
    public final void method1698(int arg0) {
        if (this.field3836 == -1) {
            if (this.field3838 == null) {
                this.field3836 = 0;
            } else {
                this.field3836 = 2;
            }
        }
        field3831++;
        if (arg0 >= -40 || this.field3825 != -1) {
            return;
        }
        if (this.field3838 == null) {
            this.field3825 = 0;
        } else {
            this.field3825 = 2;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIIZLda;IBI)Lda;")
    public final class55 method1699(int arg0, int arg1, int arg2, boolean arg3, class55 arg4, int arg5, byte arg6, int arg7) {
        field3815++;
        int var9 = this.field3840[arg7];
        int var10 = this.field3827[arg7];
        class612 var11 = this.field3822.method3270(13161, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg4.method97(arg6, arg2, true);
        }
        class612 var13 = null;
        if ((this.field3816 || class331.field4406) && arg1 != -1 && arg1 < this.field3827.length) {
            int var14 = this.field3827[arg1];
            var13 = this.field3822.method3270(13161, var14 >> 16);
            arg1 = var14 & 0xFFFF;
        }
        if (this.field3830) {
            arg2 |= 0x200;
        }
        if (var11.method3510(1, var12)) {
            arg2 |= 0x80;
        }
        if (arg3) {
            this.method1694(null, -42);
        }
        if (var11.method3509((byte) 95, var12)) {
            arg2 |= 0x100;
        }
        if (var11.method3506((byte) 113, var12)) {
            arg2 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method3510(1, arg1)) {
                arg2 |= 0x80;
            }
            if (var13.method3509((byte) 55, arg1)) {
                arg2 |= 0x100;
            }
            if (var13.method3506((byte) -22, arg1)) {
                arg2 |= 0x400;
            }
        }
        int var15 = arg2 | 0x20;
        class55 var16 = arg4.method97(arg6, var15, true);
        var16.method580(this.field3830, arg1, arg0, var12, var11, var9, arg5 - 1, -3651, var13);
        return var16;
    }
}
