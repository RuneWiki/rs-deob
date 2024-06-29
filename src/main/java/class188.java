import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class188 extends class169 {

    @OriginalMember(owner = "client!v", name = "pb", descriptor = "B")
    public byte field3673 = 0;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "I")
    public int field3646 = 0;

    @OriginalMember(owner = "client!v", name = "kb", descriptor = "Z")
    private boolean field3668 = false;

    @OriginalMember(owner = "client!v", name = "bb", descriptor = "I")
    public int field3659 = 0;

    @OriginalMember(owner = "client!v", name = "Eb", descriptor = "I")
    public int field3688;

    @OriginalMember(owner = "client!v", name = "Gb", descriptor = "[I")
    public int[] field3690;

    @OriginalMember(owner = "client!v", name = "Z", descriptor = "[I")
    public int[] field3657;

    @OriginalMember(owner = "client!v", name = "wb", descriptor = "[I")
    public int[] field3680;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "[I")
    private int[] field3649;

    @OriginalMember(owner = "client!v", name = "Jb", descriptor = "[I")
    public int[] field3693;

    @OriginalMember(owner = "client!v", name = "zb", descriptor = "[I")
    public int[] field3683;

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "[I")
    public int[] field3656;

    @OriginalMember(owner = "client!v", name = "Fb", descriptor = "[B")
    public byte[] field3689;

    @OriginalMember(owner = "client!v", name = "ob", descriptor = "[B")
    public byte[] field3672;

    @OriginalMember(owner = "client!v", name = "gb", descriptor = "[B")
    public byte[] field3664;

    @OriginalMember(owner = "client!v", name = "hb", descriptor = "[I")
    private int[] field3665;

    @OriginalMember(owner = "client!v", name = "db", descriptor = "[S")
    public short[] field3661;

    @OriginalMember(owner = "client!v", name = "jb", descriptor = "[B")
    public byte[] field3667;

    @OriginalMember(owner = "client!v", name = "Cb", descriptor = "[S")
    public short[] field3686;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "[B")
    public byte[] field3650;

    @OriginalMember(owner = "client!v", name = "vb", descriptor = "[S")
    public short[] field3679;

    @OriginalMember(owner = "client!v", name = "Ib", descriptor = "[S")
    public short[] field3692;

    @OriginalMember(owner = "client!v", name = "ub", descriptor = "[S")
    public short[] field3678;

    @OriginalMember(owner = "client!v", name = "U", descriptor = "[S")
    private short[] field3652;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "[S")
    private short[] field3648;

    @OriginalMember(owner = "client!v", name = "nb", descriptor = "[S")
    private short[] field3671;

    @OriginalMember(owner = "client!v", name = "eb", descriptor = "[B")
    private byte[] field3662;

    @OriginalMember(owner = "client!v", name = "ib", descriptor = "[B")
    private byte[] field3666;

    @OriginalMember(owner = "client!v", name = "rb", descriptor = "[B")
    private byte[] field3675;

    @OriginalMember(owner = "client!v", name = "Bb", descriptor = "[B")
    private byte[] field3685;

    @OriginalMember(owner = "client!v", name = "lb", descriptor = "[B")
    private byte[] field3669;

    @OriginalMember(owner = "client!v", name = "V", descriptor = "[[I")
    public int[][] field3653;

    @OriginalMember(owner = "client!v", name = "tb", descriptor = "[[I")
    public int[][] field3677;

    @OriginalMember(owner = "client!v", name = "mb", descriptor = "[Lk;")
    public class89[] field3670;

    @OriginalMember(owner = "client!v", name = "W", descriptor = "[Lnh;")
    public class124[] field3654;

    @OriginalMember(owner = "client!v", name = "qb", descriptor = "[Lk;")
    public class89[] field3674;

    @OriginalMember(owner = "client!v", name = "ab", descriptor = "S")
    public short field3658;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "S")
    public short field3647;

    @OriginalMember(owner = "client!v", name = "X", descriptor = "[I")
    private static int[] field3655 = class140.field2891;

    @OriginalMember(owner = "client!v", name = "sb", descriptor = "[I")
    private static int[] field3676 = new int[10000];

    @OriginalMember(owner = "client!v", name = "yb", descriptor = "I")
    private static int field3682 = 0;

    @OriginalMember(owner = "client!v", name = "cb", descriptor = "[I")
    private static int[] field3660 = new int[10000];

    @OriginalMember(owner = "client!v", name = "Ab", descriptor = "[I")
    private static int[] field3684 = class140.field2878;

    @OriginalMember(owner = "client!v", name = "T", descriptor = "I")
    private int field3651;

    @OriginalMember(owner = "client!v", name = "fb", descriptor = "I")
    private int field3663;

    @OriginalMember(owner = "client!v", name = "xb", descriptor = "I")
    private int field3681;

    @OriginalMember(owner = "client!v", name = "Db", descriptor = "I")
    private int field3687;

    @OriginalMember(owner = "client!v", name = "Hb", descriptor = "I")
    private int field3691;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III)V")
    public final void method1154(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3659; ++var4) {
            this.field3690[var4] = this.field3690[var4] * arg0 / 128;
            this.field3657[var4] = this.field3657[var4] * arg1 / 128;
            this.field3680[var4] = this.field3680[var4] * arg2 / 128;
        }
        this.method1167();
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()V")
    public static void method1155() {
        field3660 = null;
        field3676 = null;
        field3684 = null;
        field3655 = null;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()V")
    public final void method1156() {
        if (this.field3670 == null) {
            this.field3670 = new class89[this.field3659];
            for (int var1 = 0; var1 < this.field3659; ++var1) {
                this.field3670[var1] = new class89();
            }
            for (int var2 = 0; var2 < this.field3646; ++var2) {
                int var3 = this.field3693[var2];
                int var4 = this.field3683[var2];
                int var5 = this.field3656[var2];
                int var6 = this.field3690[var4] - this.field3690[var3];
                int var7 = this.field3657[var4] - this.field3657[var3];
                int var8 = this.field3680[var4] - this.field3680[var3];
                int var9 = this.field3690[var5] - this.field3690[var3];
                int var10 = this.field3657[var5] - this.field3657[var3];
                int var11 = this.field3680[var5] - this.field3680[var3];
                int var12 = var7 * var11 - var8 * var10;
                int var13 = var8 * var9 - var6 * var11;
                int var14;
                for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 1) {
                    var12 >>= 1;
                    var13 >>= 1;
                }
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
                if (var15 <= 0) {
                    var15 = 1;
                }
                int var16 = var12 * 256 / var15;
                int var17 = var13 * 256 / var15;
                int var18 = var14 * 256 / var15;
                byte var19;
                if (this.field3689 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field3689[var2];
                }
                if (var19 == 0) {
                    class89 var20 = this.field3670[var3];
                    var20.field1907 += var16;
                    var20.field1908 += var17;
                    var20.field1922 += var18;
                    ++var20.field1898;
                    class89 var21 = this.field3670[var4];
                    var21.field1907 += var16;
                    var21.field1908 += var17;
                    var21.field1922 += var18;
                    ++var21.field1898;
                    class89 var22 = this.field3670[var5];
                    var22.field1907 += var16;
                    var22.field1908 += var17;
                    var22.field1922 += var18;
                    ++var22.field1898;
                } else if (var19 == 1) {
                    if (this.field3654 == null) {
                        this.field3654 = new class124[this.field3646];
                    }
                    class124 var23 = this.field3654[var2] = new class124();
                    var23.field2542 = var16;
                    var23.field2541 = var17;
                    var23.field2536 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "()V")
    public final void method1157() {
        for (int var1 = 0; var1 < this.field3659; ++var1) {
            this.field3690[var1] = -this.field3690[var1];
            this.field3680[var1] = -this.field3680[var1];
        }
        this.method1167();
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lkh;II)Lv;")
    public static final class188 method1158(class97 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method651(4, arg2, arg1);
        return var3 == null ? null : new class188(var3);
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "()V")
    public final void method1159() {
        int var10002;
        if (this.field3649 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3659; ++var3) {
                int var7 = this.field3649[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field3653 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field3653[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field3659) {
                int var6 = this.field3649[var5];
                this.field3653[var6][var1[var6]++] = var5++;
            }
            this.field3649 = null;
        }
        if (this.field3665 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field3646; ++var10) {
                int var14 = this.field3665[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field3677 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field3677[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field3646) {
                int var13 = this.field3665[var12];
                this.field3677[var13][var8[var13]++] = var12++;
            }
            this.field3665 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "()V")
    public final void method1160() {
        for (int var1 = 0; var1 < this.field3659; ++var1) {
            int var2 = this.field3680[var1];
            this.field3680[var1] = this.field3690[var1];
            this.field3690[var1] = -var2;
        }
        this.method1167();
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([B)V")
    private final void method1161(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class189 var4 = new class189(arg0);
        class189 var5 = new class189(arg0);
        class189 var6 = new class189(arg0);
        class189 var7 = new class189(arg0);
        class189 var8 = new class189(arg0);
        var4.field3752 = arg0.length - 18;
        int var9 = var4.method1197(-1);
        int var10 = var4.method1197(-1);
        int var11 = var4.method1202(-13);
        int var12 = var4.method1202(122);
        int var13 = var4.method1202(114);
        int var14 = var4.method1202(104);
        int var15 = var4.method1202(-33);
        int var16 = var4.method1202(110);
        int var17 = var4.method1197(-1);
        int var18 = var4.method1197(-1);
        int var19 = var4.method1197(-1);
        int var20 = var4.method1197(-1);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field3659 = var9;
        this.field3646 = var10;
        this.field3688 = var11;
        this.field3690 = new int[var9];
        this.field3657 = new int[var9];
        this.field3680 = new int[var9];
        this.field3693 = new int[var10];
        this.field3683 = new int[var10];
        this.field3656 = new int[var10];
        if (var11 > 0) {
            this.field3650 = new byte[var11];
            this.field3679 = new short[var11];
            this.field3692 = new short[var11];
            this.field3678 = new short[var11];
        }
        if (var16 == 1) {
            this.field3649 = new int[var9];
        }
        if (var12 == 1) {
            this.field3689 = new byte[var10];
            this.field3667 = new byte[var10];
            this.field3661 = new short[var10];
        }
        if (var13 == 255) {
            this.field3672 = new byte[var10];
        } else {
            this.field3673 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3664 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3665 = new int[var10];
        }
        this.field3686 = new short[var10];
        var4.field3752 = var21;
        var5.field3752 = var36;
        var6.field3752 = var38;
        var7.field3752 = var40;
        var8.field3752 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var62 = var4.method1202(-101);
            int var63 = 0;
            if ((var62 & 1) != 0) {
                var63 = var5.method1205(7470);
            }
            int var64 = 0;
            if ((var62 & 2) != 0) {
                var64 = var6.method1205(7470);
            }
            int var65 = 0;
            if ((var62 & 4) != 0) {
                var65 = var7.method1205(7470);
            }
            this.field3690[var46] = var43 + var63;
            this.field3657[var46] = var44 + var64;
            this.field3680[var46] = var45 + var65;
            var43 = this.field3690[var46];
            var44 = this.field3657[var46];
            var45 = this.field3680[var46];
            if (var16 == 1) {
                this.field3649[var46] = var8.method1202(-108);
            }
        }
        var4.field3752 = var32;
        var5.field3752 = var28;
        var6.field3752 = var26;
        var7.field3752 = var30;
        var8.field3752 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field3686[var47] = (short) var4.method1197(-1);
            if (var12 == 1) {
                int var61 = var5.method1202(-122);
                if ((var61 & 1) == 1) {
                    this.field3689[var47] = 1;
                    var2 = true;
                } else {
                    this.field3689[var47] = 0;
                }
                if ((var61 & 2) == 2) {
                    this.field3667[var47] = (byte) (var61 >> 2);
                    this.field3661[var47] = this.field3686[var47];
                    this.field3686[var47] = 127;
                    if (this.field3661[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field3667[var47] = -1;
                    this.field3661[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field3672[var47] = var6.method1204(true);
            }
            if (var14 == 1) {
                this.field3664[var47] = var7.method1204(true);
            }
            if (var15 == 1) {
                this.field3665[var47] = var8.method1202(101);
            }
        }
        var4.field3752 = var25;
        var5.field3752 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var57 = var5.method1202(122);
            if (var57 == 1) {
                var48 = var4.method1205(7470) + var51;
                var49 = var4.method1205(7470) + var48;
                var50 = var4.method1205(7470) + var49;
                var51 = var50;
                this.field3693[var52] = var48;
                this.field3683[var52] = var49;
                this.field3656[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method1205(7470) + var51;
                var51 = var50;
                this.field3693[var52] = var48;
                this.field3683[var52] = var49;
                this.field3656[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method1205(7470) + var51;
                var51 = var50;
                this.field3693[var52] = var48;
                this.field3683[var52] = var49;
                this.field3656[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method1205(7470) + var51;
                var51 = var50;
                this.field3693[var52] = var48;
                this.field3683[var52] = var60;
                this.field3656[var52] = var50;
            }
        }
        var4.field3752 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field3650[var53] = 0;
            this.field3679[var53] = (short) var4.method1197(-1);
            this.field3692[var53] = (short) var4.method1197(-1);
            this.field3678[var53] = (short) var4.method1197(-1);
        }
        if (this.field3667 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; ++var55) {
                int var56 = this.field3667[var55] & 255;
                if (var56 != 255) {
                    if ((this.field3679[var56] & 65535) == this.field3693[var55] && (this.field3692[var56] & 65535) == this.field3683[var55] && (this.field3678[var56] & 65535) == this.field3656[var55]) {
                        this.field3667[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field3667 = null;
            }
        }
        if (!var3) {
            this.field3661 = null;
        }
        if (!var2) {
            this.field3689 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(III)V")
    public final void method1162(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3659; ++var4) {
            this.field3690[var4] += arg0;
            this.field3657[var4] += arg1;
            this.field3680[var4] += arg2;
        }
        this.method1167();
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(I)V")
    public final void method1163(int arg0) {
        int var2 = field3684[arg0];
        int var3 = field3655[arg0];
        for (int var4 = 0; var4 < this.field3659; ++var4) {
            int var5 = this.field3690[var4] * var3 + this.field3680[var4] * var2 >> 16;
            this.field3680[var4] = this.field3680[var4] * var3 - this.field3690[var4] * var2 >> 16;
            this.field3690[var4] = var5;
        }
        this.method1167();
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "()V")
    private final void method1164() {
        if (!this.field3668) {
            super.field3376 = 0;
            this.field3663 = 0;
            this.field3687 = 999999;
            this.field3651 = -999999;
            this.field3691 = -99999;
            this.field3681 = 99999;
            for (int var1 = 0; var1 < this.field3659; ++var1) {
                int var2 = this.field3690[var1];
                int var3 = this.field3657[var1];
                int var4 = this.field3680[var1];
                if (var2 < this.field3687) {
                    this.field3687 = var2;
                }
                if (var2 > this.field3651) {
                    this.field3651 = var2;
                }
                if (var4 < this.field3681) {
                    this.field3681 = var4;
                }
                if (var4 > this.field3691) {
                    this.field3691 = var4;
                }
                if (-var3 > super.field3376) {
                    super.field3376 = -var3;
                }
                if (var3 > this.field3663) {
                    this.field3663 = var3;
                }
            }
            this.field3668 = true;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lv;Lv;IIIZ)V")
    public static final void method1165(class188 arg0, class188 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method1164();
        arg0.method1156();
        arg1.method1164();
        arg1.method1156();
        ++field3682;
        int var6 = 0;
        int[] var7 = arg1.field3690;
        int var8 = arg1.field3659;
        for (int var9 = 0; var9 < arg0.field3659; ++var9) {
            class89 var12 = arg0.field3670[var9];
            if (var12.field1898 != 0) {
                int var13 = arg0.field3657[var9] - arg3;
                if (var13 <= arg1.field3663) {
                    int var14 = arg0.field3690[var9] - arg2;
                    if (var14 >= arg1.field3687 && var14 <= arg1.field3651) {
                        int var15 = arg0.field3680[var9] - arg4;
                        if (var15 >= arg1.field3681 && var15 <= arg1.field3691) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class89 var17 = arg1.field3670[var16];
                                if (var7[var16] == var14 && arg1.field3680[var16] == var15 && arg1.field3657[var16] == var13 && var17.field1898 != 0) {
                                    if (arg0.field3674 == null) {
                                        arg0.field3674 = new class89[arg0.field3659];
                                    }
                                    if (arg1.field3674 == null) {
                                        arg1.field3674 = new class89[var8];
                                    }
                                    class89 var18 = arg0.field3674[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field3674[var9] = new class89(var12);
                                    }
                                    class89 var19 = arg1.field3674[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field3674[var16] = new class89(var17);
                                    }
                                    var18.field1907 += var17.field1907;
                                    var18.field1908 += var17.field1908;
                                    var18.field1922 += var17.field1922;
                                    var18.field1898 += var17.field1898;
                                    var19.field1907 += var12.field1907;
                                    var19.field1908 += var12.field1908;
                                    var19.field1922 += var12.field1922;
                                    var19.field1898 += var12.field1898;
                                    ++var6;
                                    field3660[var9] = field3682;
                                    field3676[var16] = field3682;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field3646; ++var10) {
                if (field3660[arg0.field3693[var10]] == field3682 && field3660[arg0.field3683[var10]] == field3682 && field3660[arg0.field3656[var10]] == field3682) {
                    if (arg0.field3689 == null) {
                        arg0.field3689 = new byte[arg0.field3646];
                    }
                    arg0.field3689[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field3646; ++var11) {
                if (field3676[arg1.field3693[var11]] == field3682 && field3676[arg1.field3683[var11]] == field3682 && field3676[arg1.field3656[var11]] == field3682) {
                    if (arg1.field3689 == null) {
                        arg1.field3689 = new byte[arg1.field3646];
                    }
                    arg1.field3689[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "([B)V")
    private final void method1166(byte[] arg0) {
        class189 var2 = new class189(arg0);
        class189 var3 = new class189(arg0);
        class189 var4 = new class189(arg0);
        class189 var5 = new class189(arg0);
        class189 var6 = new class189(arg0);
        class189 var7 = new class189(arg0);
        class189 var8 = new class189(arg0);
        var2.field3752 = arg0.length - 23;
        int var9 = var2.method1197(-1);
        int var10 = var2.method1197(-1);
        int var11 = var2.method1202(-65);
        int var12 = var2.method1202(114);
        int var13 = var2.method1202(-118);
        int var14 = var2.method1202(-79);
        int var15 = var2.method1202(-109);
        int var16 = var2.method1202(-22);
        int var17 = var2.method1202(112);
        int var18 = var2.method1197(-1);
        int var19 = var2.method1197(-1);
        int var20 = var2.method1197(-1);
        int var21 = var2.method1197(-1);
        int var22 = var2.method1197(-1);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field3650 = new byte[var11];
            var2.field3752 = 0;
            for (int var26 = 0; var26 < var11; ++var26) {
                byte var27 = this.field3650[var26] = var2.method1204(true);
                if (var27 == 0) {
                    ++var23;
                }
                if (var27 >= 1 && var27 <= 3) {
                    ++var24;
                }
                if (var27 == 2) {
                    ++var25;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 + var56;
        int var60 = var24 + var58;
        int var62 = var25 * 2 + var24 + var60;
        this.field3659 = var9;
        this.field3646 = var10;
        this.field3688 = var11;
        this.field3690 = new int[var9];
        this.field3657 = new int[var9];
        this.field3680 = new int[var9];
        this.field3693 = new int[var10];
        this.field3683 = new int[var10];
        this.field3656 = new int[var10];
        if (var17 == 1) {
            this.field3649 = new int[var9];
        }
        if (var12 == 1) {
            this.field3689 = new byte[var10];
        }
        if (var13 == 255) {
            this.field3672 = new byte[var10];
        } else {
            this.field3673 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3664 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3665 = new int[var10];
        }
        if (var16 == 1) {
            this.field3661 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field3667 = new byte[var10];
        }
        this.field3686 = new short[var10];
        if (var11 > 0) {
            this.field3679 = new short[var11];
            this.field3692 = new short[var11];
            this.field3678 = new short[var11];
            if (var24 > 0) {
                this.field3652 = new short[var24];
                this.field3648 = new short[var24];
                this.field3671 = new short[var24];
                this.field3662 = new byte[var24];
                this.field3666 = new byte[var24];
                this.field3675 = new byte[var24];
            }
            if (var25 > 0) {
                this.field3685 = new byte[var25];
                this.field3669 = new byte[var25];
            }
        }
        var2.field3752 = var11;
        var3.field3752 = var44;
        var4.field3752 = var46;
        var5.field3752 = var48;
        var6.field3752 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; ++var67) {
            int var81 = var2.method1202(-87);
            int var82 = 0;
            if ((var81 & 1) != 0) {
                var82 = var3.method1205(7470);
            }
            int var83 = 0;
            if ((var81 & 2) != 0) {
                var83 = var4.method1205(7470);
            }
            int var84 = 0;
            if ((var81 & 4) != 0) {
                var84 = var5.method1205(7470);
            }
            this.field3690[var67] = var64 + var82;
            this.field3657[var67] = var65 + var83;
            this.field3680[var67] = var66 + var84;
            var64 = this.field3690[var67];
            var65 = this.field3657[var67];
            var66 = this.field3680[var67];
            if (var17 == 1) {
                this.field3649[var67] = var6.method1202(108);
            }
        }
        var2.field3752 = var42;
        var3.field3752 = var31;
        var4.field3752 = var34;
        var5.field3752 = var37;
        var6.field3752 = var35;
        var7.field3752 = var40;
        var8.field3752 = var39;
        for (int var68 = 0; var68 < var10; ++var68) {
            this.field3686[var68] = (short) var2.method1197(-1);
            if (var12 == 1) {
                this.field3689[var68] = var3.method1204(true);
            }
            if (var13 == 255) {
                this.field3672[var68] = var4.method1204(true);
            }
            if (var14 == 1) {
                this.field3664[var68] = var5.method1204(true);
            }
            if (var15 == 1) {
                this.field3665[var68] = var6.method1202(105);
            }
            if (var16 == 1) {
                this.field3661[var68] = (short) (var7.method1197(-1) - 1);
            }
            if (this.field3667 != null) {
                if (this.field3661[var68] != -1) {
                    this.field3667[var68] = (byte) (var8.method1202(120) - 1);
                } else {
                    this.field3667[var68] = -1;
                }
            }
        }
        var2.field3752 = var33;
        var3.field3752 = var30;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        int var72 = 0;
        for (int var73 = 0; var73 < var10; ++var73) {
            int var77 = var3.method1202(-122);
            if (var77 == 1) {
                var69 = var2.method1205(7470) + var72;
                var70 = var2.method1205(7470) + var69;
                var71 = var2.method1205(7470) + var70;
                var72 = var71;
                this.field3693[var73] = var69;
                this.field3683[var73] = var70;
                this.field3656[var73] = var71;
            }
            if (var77 == 2) {
                var70 = var71;
                var71 = var2.method1205(7470) + var72;
                var72 = var71;
                this.field3693[var73] = var69;
                this.field3683[var73] = var70;
                this.field3656[var73] = var71;
            }
            if (var77 == 3) {
                var69 = var71;
                var71 = var2.method1205(7470) + var72;
                var72 = var71;
                this.field3693[var73] = var69;
                this.field3683[var73] = var70;
                this.field3656[var73] = var71;
            }
            if (var77 == 4) {
                int var80 = var69;
                var69 = var70;
                var70 = var80;
                var71 = var2.method1205(7470) + var72;
                var72 = var71;
                this.field3693[var73] = var69;
                this.field3683[var73] = var80;
                this.field3656[var73] = var71;
            }
        }
        var2.field3752 = var50;
        var3.field3752 = var52;
        var4.field3752 = var54;
        var5.field3752 = var56;
        var6.field3752 = var58;
        var7.field3752 = var60;
        for (int var74 = 0; var74 < var11; ++var74) {
            int var76 = this.field3650[var74] & 255;
            if (var76 == 0) {
                this.field3679[var74] = (short) var2.method1197(-1);
                this.field3692[var74] = (short) var2.method1197(-1);
                this.field3678[var74] = (short) var2.method1197(-1);
            }
            if (var76 == 1) {
                this.field3679[var74] = (short) var3.method1197(-1);
                this.field3692[var74] = (short) var3.method1197(-1);
                this.field3678[var74] = (short) var3.method1197(-1);
                this.field3652[var74] = (short) var4.method1197(-1);
                this.field3648[var74] = (short) var4.method1197(-1);
                this.field3671[var74] = (short) var4.method1197(-1);
                this.field3662[var74] = var5.method1204(true);
                this.field3666[var74] = var6.method1204(true);
                this.field3675[var74] = var7.method1204(true);
            }
            if (var76 == 2) {
                this.field3679[var74] = (short) var3.method1197(-1);
                this.field3692[var74] = (short) var3.method1197(-1);
                this.field3678[var74] = (short) var3.method1197(-1);
                this.field3652[var74] = (short) var4.method1197(-1);
                this.field3648[var74] = (short) var4.method1197(-1);
                this.field3671[var74] = (short) var4.method1197(-1);
                this.field3662[var74] = var5.method1204(true);
                this.field3666[var74] = var6.method1204(true);
                this.field3675[var74] = var7.method1204(true);
                this.field3685[var74] = var7.method1204(true);
                this.field3669[var74] = var7.method1204(true);
            }
            if (var76 == 3) {
                this.field3679[var74] = (short) var3.method1197(-1);
                this.field3692[var74] = (short) var3.method1197(-1);
                this.field3678[var74] = (short) var3.method1197(-1);
                this.field3652[var74] = (short) var4.method1197(-1);
                this.field3648[var74] = (short) var4.method1197(-1);
                this.field3671[var74] = (short) var4.method1197(-1);
                this.field3662[var74] = var5.method1204(true);
                this.field3666[var74] = var6.method1204(true);
                this.field3675[var74] = var7.method1204(true);
            }
        }
        var2.field3752 = var62;
        int var75 = var2.method1202(-18);
        if (var75 != 0) {
            new class15();
            var2.method1197(-1);
            var2.method1197(-1);
            var2.method1197(-1);
            var2.method1190(-4);
        }
    }

    @OriginalMember(owner = "client!v", name = "g", descriptor = "()V")
    private final void method1167() {
        this.field3670 = null;
        this.field3674 = null;
        this.field3654 = null;
        this.field3668 = false;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lv;I)I")
    private final int method1168(class188 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field3690[arg1];
        int var5 = arg0.field3657[arg1];
        int var6 = arg0.field3680[arg1];
        for (int var7 = 0; var7 < this.field3659; ++var7) {
            if (this.field3690[var7] == var4 && this.field3657[var7] == var5 && this.field3680[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field3690[this.field3659] = var4;
            this.field3657[this.field3659] = var5;
            this.field3680[this.field3659] = var6;
            if (arg0.field3649 != null) {
                this.field3649[this.field3659] = arg0.field3649[arg1];
            }
            var3 = this.field3659++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "h", descriptor = "()Lv;")
    public final class188 method1169() {
        class188 var1 = new class188();
        if (this.field3689 != null) {
            var1.field3689 = new byte[this.field3646];
            for (int var2 = 0; var2 < this.field3646; ++var2) {
                var1.field3689[var2] = this.field3689[var2];
            }
        }
        var1.field3659 = this.field3659;
        var1.field3646 = this.field3646;
        var1.field3688 = this.field3688;
        var1.field3690 = this.field3690;
        var1.field3657 = this.field3657;
        var1.field3680 = this.field3680;
        var1.field3693 = this.field3693;
        var1.field3683 = this.field3683;
        var1.field3656 = this.field3656;
        var1.field3672 = this.field3672;
        var1.field3664 = this.field3664;
        var1.field3667 = this.field3667;
        var1.field3686 = this.field3686;
        var1.field3661 = this.field3661;
        var1.field3673 = this.field3673;
        var1.field3650 = this.field3650;
        var1.field3679 = this.field3679;
        var1.field3692 = this.field3692;
        var1.field3678 = this.field3678;
        var1.field3652 = this.field3652;
        var1.field3648 = this.field3648;
        var1.field3671 = this.field3671;
        var1.field3662 = this.field3662;
        var1.field3666 = this.field3666;
        var1.field3675 = this.field3675;
        var1.field3685 = this.field3685;
        var1.field3669 = this.field3669;
        var1.field3649 = this.field3649;
        var1.field3665 = this.field3665;
        var1.field3653 = this.field3653;
        var1.field3677 = this.field3677;
        var1.field3670 = this.field3670;
        var1.field3654 = this.field3654;
        var1.field3658 = this.field3658;
        var1.field3647 = this.field3647;
        return var1;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([[IIIIZI)Lv;")
    public final class188 method1170(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1164();
        int var7 = this.field3687 + arg1;
        int var8 = this.field3651 + arg1;
        int var9 = this.field3681 + arg3;
        int var10 = this.field3691 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class188 var15;
                if (arg4) {
                    var15 = new class188();
                    var15.field3659 = this.field3659;
                    var15.field3646 = this.field3646;
                    var15.field3688 = this.field3688;
                    var15.field3690 = this.field3690;
                    var15.field3680 = this.field3680;
                    var15.field3693 = this.field3693;
                    var15.field3683 = this.field3683;
                    var15.field3656 = this.field3656;
                    var15.field3689 = this.field3689;
                    var15.field3672 = this.field3672;
                    var15.field3664 = this.field3664;
                    var15.field3667 = this.field3667;
                    var15.field3686 = this.field3686;
                    var15.field3661 = this.field3661;
                    var15.field3673 = this.field3673;
                    var15.field3650 = this.field3650;
                    var15.field3679 = this.field3679;
                    var15.field3692 = this.field3692;
                    var15.field3678 = this.field3678;
                    var15.field3652 = this.field3652;
                    var15.field3648 = this.field3648;
                    var15.field3671 = this.field3671;
                    var15.field3662 = this.field3662;
                    var15.field3666 = this.field3666;
                    var15.field3675 = this.field3675;
                    var15.field3685 = this.field3685;
                    var15.field3669 = this.field3669;
                    var15.field3649 = this.field3649;
                    var15.field3665 = this.field3665;
                    var15.field3653 = this.field3653;
                    var15.field3677 = this.field3677;
                    var15.field3658 = this.field3658;
                    var15.field3647 = this.field3647;
                    var15.field3657 = new int[var15.field3659];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field3659; ++var16) {
                        int var17 = this.field3690[var16] + arg1;
                        int var18 = this.field3680[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field3657[var16] = this.field3657[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field3659; ++var26) {
                        int var27 = (-this.field3657[var26] << 16) / super.field3376;
                        if (var27 < arg5) {
                            int var28 = this.field3690[var26] + arg1;
                            int var29 = this.field3680[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field3657[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field3657[var26];
                        }
                    }
                }
                var15.method1167();
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!v", name = "i", descriptor = "()V")
    public final void method1171() {
        for (int var1 = 0; var1 < this.field3659; ++var1) {
            this.field3680[var1] = -this.field3680[var1];
        }
        for (int var2 = 0; var2 < this.field3646; ++var2) {
            int var3 = this.field3693[var2];
            this.field3693[var2] = this.field3656[var2];
            this.field3656[var2] = var3;
        }
        this.method1167();
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIZZ)Lbh;")
    public final class18 method1172(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        return new class45(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(SS)V")
    public final void method1173(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3646; ++var3) {
            if (this.field3686[var3] == arg0) {
                this.field3686[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(SS)V")
    public final void method1174(short arg0, short arg1) {
        if (this.field3661 != null) {
            for (int var3 = 0; var3 < this.field3646; ++var3) {
                if (this.field3661[var3] == arg0) {
                    this.field3661[var3] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "j", descriptor = "()V")
    public final void method1175() {
        for (int var1 = 0; var1 < this.field3659; ++var1) {
            int var2 = this.field3690[var1];
            this.field3690[var1] = this.field3680[var1];
            this.field3680[var1] = -var2;
        }
        this.method1167();
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
    private class188() {
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "([B)V")
    private class188(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1166(arg0);
        } else {
            this.method1161(arg0);
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "([Lv;I)V")
    public class188(class188[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field3659 = 0;
        this.field3646 = 0;
        this.field3688 = 0;
        this.field3673 = -1;
        for (int var9 = 0; var9 < arg1; ++var9) {
            class188 var15 = arg0[var9];
            if (var15 != null) {
                this.field3659 += var15.field3659;
                this.field3646 += var15.field3646;
                this.field3688 += var15.field3688;
                if (var15.field3672 != null) {
                    var4 = true;
                } else {
                    if (this.field3673 == -1) {
                        this.field3673 = var15.field3673;
                    }
                    if (this.field3673 != var15.field3673) {
                        var4 = true;
                    }
                }
                var3 |= var15.field3689 != null;
                var5 |= var15.field3664 != null;
                var6 |= var15.field3665 != null;
                var7 |= var15.field3661 != null;
                var8 |= var15.field3667 != null;
            }
        }
        this.field3690 = new int[this.field3659];
        this.field3657 = new int[this.field3659];
        this.field3680 = new int[this.field3659];
        this.field3649 = new int[this.field3659];
        this.field3693 = new int[this.field3646];
        this.field3683 = new int[this.field3646];
        this.field3656 = new int[this.field3646];
        if (var3) {
            this.field3689 = new byte[this.field3646];
        }
        if (var4) {
            this.field3672 = new byte[this.field3646];
        }
        if (var5) {
            this.field3664 = new byte[this.field3646];
        }
        if (var6) {
            this.field3665 = new int[this.field3646];
        }
        if (var7) {
            this.field3661 = new short[this.field3646];
        }
        if (var8) {
            this.field3667 = new byte[this.field3646];
        }
        this.field3686 = new short[this.field3646];
        if (this.field3688 > 0) {
            this.field3650 = new byte[this.field3688];
            this.field3679 = new short[this.field3688];
            this.field3692 = new short[this.field3688];
            this.field3678 = new short[this.field3688];
            this.field3652 = new short[this.field3688];
            this.field3648 = new short[this.field3688];
            this.field3671 = new short[this.field3688];
            this.field3662 = new byte[this.field3688];
            this.field3666 = new byte[this.field3688];
            this.field3675 = new byte[this.field3688];
            this.field3685 = new byte[this.field3688];
            this.field3669 = new byte[this.field3688];
        }
        this.field3659 = 0;
        this.field3646 = 0;
        this.field3688 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class188 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field3646; ++var12) {
                    if (var3 && var11.field3689 != null) {
                        this.field3689[this.field3646] = var11.field3689[var12];
                    }
                    if (var4) {
                        if (var11.field3672 != null) {
                            this.field3672[this.field3646] = var11.field3672[var12];
                        } else {
                            this.field3672[this.field3646] = var11.field3673;
                        }
                    }
                    if (var5 && var11.field3664 != null) {
                        this.field3664[this.field3646] = var11.field3664[var12];
                    }
                    if (var6 && var11.field3665 != null) {
                        this.field3665[this.field3646] = var11.field3665[var12];
                    }
                    if (var7) {
                        if (var11.field3661 != null) {
                            this.field3661[this.field3646] = var11.field3661[var12];
                        } else {
                            this.field3661[this.field3646] = -1;
                        }
                    }
                    if (var8) {
                        if (var11.field3667 != null && var11.field3667[var12] != -1) {
                            this.field3667[this.field3646] = (byte) (var11.field3667[var12] + this.field3688);
                        } else {
                            this.field3667[this.field3646] = -1;
                        }
                    }
                    this.field3686[this.field3646] = var11.field3686[var12];
                    this.field3693[this.field3646] = this.method1168(var11, var11.field3693[var12]);
                    this.field3683[this.field3646] = this.method1168(var11, var11.field3683[var12]);
                    this.field3656[this.field3646] = this.method1168(var11, var11.field3656[var12]);
                    ++this.field3646;
                }
                for (int var13 = 0; var13 < var11.field3688; ++var13) {
                    byte var14 = this.field3650[this.field3688] = var11.field3650[var13];
                    if (var14 == 0) {
                        this.field3679[this.field3688] = (short) this.method1168(var11, var11.field3679[var13]);
                        this.field3692[this.field3688] = (short) this.method1168(var11, var11.field3692[var13]);
                        this.field3678[this.field3688] = (short) this.method1168(var11, var11.field3678[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field3679[this.field3688] = var11.field3679[var13];
                        this.field3692[this.field3688] = var11.field3692[var13];
                        this.field3678[this.field3688] = var11.field3678[var13];
                        this.field3652[this.field3688] = var11.field3652[var13];
                        this.field3648[this.field3688] = var11.field3648[var13];
                        this.field3671[this.field3688] = var11.field3671[var13];
                        this.field3662[this.field3688] = var11.field3662[var13];
                        this.field3666[this.field3688] = var11.field3666[var13];
                        this.field3675[this.field3688] = var11.field3675[var13];
                    }
                    if (var14 == 2) {
                        this.field3685[this.field3688] = var11.field3685[var13];
                        this.field3669[this.field3688] = var11.field3669[var13];
                    }
                    ++this.field3688;
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lv;ZZZZ)V")
    public class188(class188 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field3659 = arg0.field3659;
        this.field3646 = arg0.field3646;
        this.field3688 = arg0.field3688;
        if (arg1) {
            this.field3690 = arg0.field3690;
            this.field3657 = arg0.field3657;
            this.field3680 = arg0.field3680;
        } else {
            this.field3690 = new int[this.field3659];
            this.field3657 = new int[this.field3659];
            this.field3680 = new int[this.field3659];
            for (int var6 = 0; var6 < this.field3659; ++var6) {
                this.field3690[var6] = arg0.field3690[var6];
                this.field3657[var6] = arg0.field3657[var6];
                this.field3680[var6] = arg0.field3680[var6];
            }
        }
        if (arg2) {
            this.field3686 = arg0.field3686;
        } else {
            this.field3686 = new short[this.field3646];
            for (int var7 = 0; var7 < this.field3646; ++var7) {
                this.field3686[var7] = arg0.field3686[var7];
            }
        }
        if (!arg3 && arg0.field3661 != null) {
            this.field3661 = new short[this.field3646];
            for (int var8 = 0; var8 < this.field3646; ++var8) {
                this.field3661[var8] = arg0.field3661[var8];
            }
        } else {
            this.field3661 = arg0.field3661;
        }
        if (arg4) {
            this.field3664 = arg0.field3664;
        } else {
            this.field3664 = new byte[this.field3646];
            if (arg0.field3664 == null) {
                for (int var9 = 0; var9 < this.field3646; ++var9) {
                    this.field3664[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field3646; ++var10) {
                    this.field3664[var10] = arg0.field3664[var10];
                }
            }
        }
        this.field3693 = arg0.field3693;
        this.field3683 = arg0.field3683;
        this.field3656 = arg0.field3656;
        this.field3689 = arg0.field3689;
        this.field3672 = arg0.field3672;
        this.field3667 = arg0.field3667;
        this.field3673 = arg0.field3673;
        this.field3650 = arg0.field3650;
        this.field3679 = arg0.field3679;
        this.field3692 = arg0.field3692;
        this.field3678 = arg0.field3678;
        this.field3652 = arg0.field3652;
        this.field3648 = arg0.field3648;
        this.field3671 = arg0.field3671;
        this.field3662 = arg0.field3662;
        this.field3666 = arg0.field3666;
        this.field3675 = arg0.field3675;
        this.field3685 = arg0.field3685;
        this.field3669 = arg0.field3669;
        this.field3649 = arg0.field3649;
        this.field3665 = arg0.field3665;
        this.field3653 = arg0.field3653;
        this.field3677 = arg0.field3677;
        this.field3670 = arg0.field3670;
        this.field3654 = arg0.field3654;
        this.field3674 = arg0.field3674;
        this.field3658 = arg0.field3658;
        this.field3647 = arg0.field3647;
    }
}
