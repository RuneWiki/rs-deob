import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class210 extends class235 {

    @OriginalMember(owner = "client!gl", name = "W", descriptor = "I")
    public int field3747 = 0;

    @OriginalMember(owner = "client!gl", name = "A", descriptor = "I")
    public int field3725 = 0;

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "B")
    public byte field3718 = 0;

    @OriginalMember(owner = "client!gl", name = "ib", descriptor = "Z")
    private boolean field3759 = false;

    @OriginalMember(owner = "client!gl", name = "db", descriptor = "[I")
    public int[] field3754;

    @OriginalMember(owner = "client!gl", name = "Q", descriptor = "[I")
    public int[] field3741;

    @OriginalMember(owner = "client!gl", name = "fb", descriptor = "[I")
    public int[] field3756;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "[I")
    private int[] field3714;

    @OriginalMember(owner = "client!gl", name = "J", descriptor = "[I")
    public int[] field3734;

    @OriginalMember(owner = "client!gl", name = "F", descriptor = "[I")
    public int[] field3730;

    @OriginalMember(owner = "client!gl", name = "S", descriptor = "[I")
    public int[] field3743;

    @OriginalMember(owner = "client!gl", name = "v", descriptor = "[B")
    public byte[] field3720;

    @OriginalMember(owner = "client!gl", name = "B", descriptor = "[B")
    public byte[] field3726;

    @OriginalMember(owner = "client!gl", name = "hb", descriptor = "[B")
    public byte[] field3758;

    @OriginalMember(owner = "client!gl", name = "I", descriptor = "[S")
    public short[] field3733;

    @OriginalMember(owner = "client!gl", name = "Z", descriptor = "[S")
    public short[] field3750;

    @OriginalMember(owner = "client!gl", name = "y", descriptor = "[B")
    public byte[] field3723;

    @OriginalMember(owner = "client!gl", name = "D", descriptor = "[I")
    private int[] field3728;

    @OriginalMember(owner = "client!gl", name = "kb", descriptor = "[B")
    public byte[] field3761;

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "[S")
    public short[] field3717;

    @OriginalMember(owner = "client!gl", name = "eb", descriptor = "[S")
    public short[] field3755;

    @OriginalMember(owner = "client!gl", name = "R", descriptor = "[S")
    public short[] field3742;

    @OriginalMember(owner = "client!gl", name = "cb", descriptor = "[S")
    private short[] field3753;

    @OriginalMember(owner = "client!gl", name = "Y", descriptor = "[S")
    private short[] field3749;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "[S")
    private short[] field3716;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "[B")
    private byte[] field3713;

    @OriginalMember(owner = "client!gl", name = "E", descriptor = "[B")
    private byte[] field3729;

    @OriginalMember(owner = "client!gl", name = "L", descriptor = "[B")
    private byte[] field3736;

    @OriginalMember(owner = "client!gl", name = "w", descriptor = "[B")
    private byte[] field3721;

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "[B")
    private byte[] field3724;

    @OriginalMember(owner = "client!gl", name = "mb", descriptor = "I")
    public int field3763;

    @OriginalMember(owner = "client!gl", name = "jb", descriptor = "[S")
    public short[] field3760;

    @OriginalMember(owner = "client!gl", name = "O", descriptor = "[S")
    public short[] field3739;

    @OriginalMember(owner = "client!gl", name = "x", descriptor = "[[I")
    public int[][] field3722;

    @OriginalMember(owner = "client!gl", name = "M", descriptor = "[[I")
    public int[][] field3737;

    @OriginalMember(owner = "client!gl", name = "H", descriptor = "[Lqi;")
    public class128[] field3732;

    @OriginalMember(owner = "client!gl", name = "U", descriptor = "[Lia;")
    public class224[] field3745;

    @OriginalMember(owner = "client!gl", name = "N", descriptor = "[Lqi;")
    public class128[] field3738;

    @OriginalMember(owner = "client!gl", name = "u", descriptor = "S")
    public short field3719;

    @OriginalMember(owner = "client!gl", name = "P", descriptor = "S")
    public short field3740;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
    private static int field3715 = 0;

    @OriginalMember(owner = "client!gl", name = "G", descriptor = "[I")
    private static int[] field3731 = class257.field4597;

    @OriginalMember(owner = "client!gl", name = "ab", descriptor = "[I")
    private static int[] field3751 = new int[10000];

    @OriginalMember(owner = "client!gl", name = "gb", descriptor = "[I")
    private static int[] field3757 = class257.field4598;

    @OriginalMember(owner = "client!gl", name = "lb", descriptor = "[I")
    private static int[] field3762 = new int[10000];

    @OriginalMember(owner = "client!gl", name = "C", descriptor = "S")
    private short field3727;

    @OriginalMember(owner = "client!gl", name = "K", descriptor = "S")
    private short field3735;

    @OriginalMember(owner = "client!gl", name = "T", descriptor = "S")
    private short field3744;

    @OriginalMember(owner = "client!gl", name = "V", descriptor = "S")
    private short field3746;

    @OriginalMember(owner = "client!gl", name = "X", descriptor = "S")
    private short field3748;

    @OriginalMember(owner = "client!gl", name = "bb", descriptor = "S")
    private short field3752;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "()V")
    public final void method1479() {
        for (int var1 = 0; var1 < this.field3747; var1++) {
            this.field3756[var1] = -this.field3756[var1];
        }
        for (int var2 = 0; var2 < this.field3725; var2++) {
            int var3 = this.field3734[var2];
            this.field3734[var2] = this.field3743[var2];
            this.field3743[var2] = var3;
        }
        this.method1504();
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "()V")
    public final void method1480() {
        for (int var1 = 0; var1 < this.field3747; var1++) {
            int var2 = this.field3756[var1];
            this.field3756[var1] = this.field3754[var1];
            this.field3754[var1] = -var2;
        }
        this.method1504();
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIBSB)I")
    public final int method1481(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field3734[this.field3725] = arg0;
        this.field3730[this.field3725] = arg1;
        this.field3743[this.field3725] = arg2;
        this.field3720[this.field3725] = arg3;
        this.field3723[this.field3725] = -1;
        this.field3733[this.field3725] = arg4;
        this.field3750[this.field3725] = -1;
        this.field3758[this.field3725] = arg5;
        return this.field3725++;
    }

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "()V")
    public static void method1482() {
        field3762 = null;
        field3751 = null;
        field3757 = null;
        field3731 = null;
    }

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "()V")
    public final void method1483() {
        if (this.field3732 != null) {
            return;
        }
        this.field3732 = new class128[this.field3747];
        for (int var1 = 0; var1 < this.field3747; var1++) {
            this.field3732[var1] = new class128();
        }
        for (int var2 = 0; var2 < this.field3725; var2++) {
            int var3 = this.field3734[var2];
            int var4 = this.field3730[var2];
            int var5 = this.field3743[var2];
            int var6 = this.field3754[var4] - this.field3754[var3];
            int var7 = this.field3741[var4] - this.field3741[var3];
            int var8 = this.field3756[var4] - this.field3756[var3];
            int var9 = this.field3754[var5] - this.field3754[var3];
            int var10 = this.field3741[var5] - this.field3741[var3];
            int var11 = this.field3756[var5] - this.field3756[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field3720 == null) {
                var19 = 0;
            } else {
                var19 = this.field3720[var2];
            }
            if (var19 == 0) {
                class128 var20 = this.field3732[var3];
                var20.field2226 += var16;
                var20.field2235 += var17;
                var20.field2224 += var18;
                var20.field2233++;
                class128 var21 = this.field3732[var4];
                var21.field2226 += var16;
                var21.field2235 += var17;
                var21.field2224 += var18;
                var21.field2233++;
                class128 var22 = this.field3732[var5];
                var22.field2226 += var16;
                var22.field2235 += var17;
                var22.field2224 += var18;
                var22.field2233++;
            } else if (var19 == 1) {
                if (this.field3745 == null) {
                    this.field3745 = new class224[this.field3725];
                }
                class224 var23 = this.field3745[var2] = new class224();
                var23.field4092 = var16;
                var23.field4091 = var17;
                var23.field4090 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(III)V")
    public final void method1484(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3747; var4++) {
            this.field3754[var4] += arg0;
            this.field3741[var4] += arg1;
            this.field3756[var4] += arg2;
        }
        this.method1504();
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIIIIIJILe;)V")
    public final void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class64 arg10) {
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(SS)V")
    public final void method1485(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3725; var3++) {
            if (this.field3733[var3] == arg0) {
                this.field3733[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(III)I")
    public final int method1486(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3747; var4++) {
            if (this.field3754[var4] == arg0 && this.field3741[var4] == arg1 && this.field3756[var4] == arg2) {
                return var4;
            }
        }
        this.field3754[this.field3747] = arg0;
        this.field3741[this.field3747] = arg1;
        this.field3756[this.field3747] = arg2;
        return this.field3747++;
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(III)V")
    public final void method1487(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field3757[arg2];
            int var5 = field3731[arg2];
            for (int var6 = 0; var6 < this.field3747; var6++) {
                int var7 = this.field3754[var6] * var5 + this.field3741[var6] * var4 >> 16;
                this.field3741[var6] = this.field3741[var6] * var5 - this.field3754[var6] * var4 >> 16;
                this.field3754[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field3757[arg0];
            int var9 = field3731[arg0];
            for (int var10 = 0; var10 < this.field3747; var10++) {
                int var11 = this.field3741[var10] * var9 - this.field3756[var10] * var8 >> 16;
                this.field3756[var10] = this.field3756[var10] * var9 + this.field3741[var10] * var8 >> 16;
                this.field3741[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field3757[arg1];
        int var13 = field3731[arg1];
        for (int var14 = 0; var14 < this.field3747; var14++) {
            int var15 = this.field3756[var14] * var12 + this.field3754[var14] * var13 >> 16;
            this.field3756[var14] = this.field3756[var14] * var13 - this.field3754[var14] * var12 >> 16;
            this.field3754[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lpk;II)Lgl;")
    public static final class210 method1488(class99 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method705(arg1, arg2, -1);
        return var3 == null ? null : new class210(var3);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ldc;IIIZ)V")
    public final void method1489(class235 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class210 var6 = (class210) arg0;
        var6.method1493();
        var6.method1483();
        field3715++;
        int var7 = 0;
        int[] var8 = var6.field3754;
        int var9 = var6.field3747;
        for (int var10 = 0; var10 < this.field3747; var10++) {
            class128 var13 = this.field3732[var10];
            if (var13.field2233 != 0) {
                int var14 = this.field3741[var10] - arg2;
                if (var14 >= var6.field3752 && var14 <= var6.field3746) {
                    int var15 = this.field3754[var10] - arg1;
                    if (var15 >= var6.field3744 && var15 <= var6.field3727) {
                        int var16 = this.field3756[var10] - arg3;
                        if (var16 >= var6.field3748 && var16 <= var6.field3735) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class128 var18 = var6.field3732[var17];
                                if (var8[var17] == var15 && var6.field3756[var17] == var16 && var6.field3741[var17] == var14 && var18.field2233 != 0) {
                                    if (this.field3738 == null) {
                                        this.field3738 = new class128[this.field3747];
                                    }
                                    if (var6.field3738 == null) {
                                        var6.field3738 = new class128[var9];
                                    }
                                    class128 var19 = this.field3738[var10];
                                    if (var19 == null) {
                                        var19 = this.field3738[var10] = new class128(var13);
                                    }
                                    class128 var20 = var6.field3738[var17];
                                    if (var20 == null) {
                                        var20 = var6.field3738[var17] = new class128(var18);
                                    }
                                    var19.field2226 += var18.field2226;
                                    var19.field2235 += var18.field2235;
                                    var19.field2224 += var18.field2224;
                                    var19.field2233 += var18.field2233;
                                    var20.field2226 += var13.field2226;
                                    var20.field2235 += var13.field2235;
                                    var20.field2224 += var13.field2224;
                                    var20.field2233 += var13.field2233;
                                    var7++;
                                    field3762[var10] = field3715;
                                    field3751[var17] = field3715;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var7 < 3 || !arg4) {
            return;
        }
        for (int var11 = 0; var11 < this.field3725; var11++) {
            if (field3762[this.field3734[var11]] == field3715 && field3762[this.field3730[var11]] == field3715 && field3762[this.field3743[var11]] == field3715) {
                if (this.field3720 == null) {
                    this.field3720 = new byte[this.field3725];
                }
                this.field3720[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field3725; var12++) {
            if (field3751[var6.field3734[var12]] == field3715 && field3751[var6.field3730[var12]] == field3715 && field3751[var6.field3743[var12]] == field3715) {
                if (var6.field3720 == null) {
                    var6.field3720 = new byte[var6.field3725];
                }
                var6.field3720[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "()V")
    public final void method1490() {
        int var10002;
        if (this.field3714 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3747; var3++) {
                int var7 = this.field3714[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field3722 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field3722[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field3747) {
                int var6 = this.field3714[var5];
                this.field3722[var6][var1[var6]++] = var5++;
            }
            this.field3714 = null;
        }
        if (this.field3728 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3725; var10++) {
            int var14 = this.field3728[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field3737 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field3737[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field3725) {
            int var13 = this.field3728[var12];
            this.field3737[var13][var8[var13]++] = var12++;
        }
        this.field3728 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II[[I[[IIIIZZ)Lgl;")
    public final class210 method1491(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method1493();
        int var10 = this.field3744 + arg4;
        int var11 = this.field3727 + arg4;
        int var12 = this.field3748 + arg6;
        int var13 = this.field3735 + arg6;
        if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var10 < 0 || var11 + 128 >> 7 >= arg2.length || var12 < 0 || var13 + 128 >> 7 >= arg2[0].length)) {
            return this;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return this;
            }
            if (var10 < 0 || var11 + 128 >> 7 >= arg3.length || var12 < 0 || var13 + 128 >> 7 >= arg3[0].length) {
                return this;
            }
        } else {
            int var14 = var10 >> 7;
            int var15 = var11 + 127 >> 7;
            int var16 = var12 >> 7;
            int var17 = var13 + 127 >> 7;
            if (arg2[var14][var16] == arg5 && arg2[var15][var16] == arg5 && arg2[var14][var17] == arg5 && arg2[var15][var17] == arg5) {
                return this;
            }
        }
        class210 var18;
        if (arg7) {
            var18 = new class210();
            var18.field3747 = this.field3747;
            var18.field3725 = this.field3725;
            var18.field3763 = this.field3763;
            var18.field3734 = this.field3734;
            var18.field3730 = this.field3730;
            var18.field3743 = this.field3743;
            var18.field3720 = this.field3720;
            var18.field3726 = this.field3726;
            var18.field3758 = this.field3758;
            var18.field3723 = this.field3723;
            var18.field3733 = this.field3733;
            var18.field3750 = this.field3750;
            var18.field3718 = this.field3718;
            var18.field3761 = this.field3761;
            var18.field3717 = this.field3717;
            var18.field3755 = this.field3755;
            var18.field3742 = this.field3742;
            var18.field3753 = this.field3753;
            var18.field3749 = this.field3749;
            var18.field3716 = this.field3716;
            var18.field3713 = this.field3713;
            var18.field3729 = this.field3729;
            var18.field3736 = this.field3736;
            var18.field3721 = this.field3721;
            var18.field3724 = this.field3724;
            var18.field3714 = this.field3714;
            var18.field3728 = this.field3728;
            var18.field3722 = this.field3722;
            var18.field3737 = this.field3737;
            var18.field3719 = this.field3719;
            var18.field3740 = this.field3740;
            var18.field3732 = this.field3732;
            var18.field3745 = this.field3745;
            var18.field3738 = this.field3738;
            if (arg0 == 3) {
                var18.field3754 = class78.method593(-121, this.field3754);
                var18.field3741 = class78.method593(-111, this.field3741);
                var18.field3756 = class78.method593(-88, this.field3756);
            } else {
                var18.field3754 = this.field3754;
                var18.field3741 = new int[var18.field3747];
                var18.field3756 = this.field3756;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field3747; var19++) {
                int var20 = this.field3754[var19] + arg4;
                int var21 = this.field3756[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field3741[var19] = this.field3741[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field3747; var29++) {
                int var30 = (this.field3741[var29] << 16) / this.field3752;
                if (var30 < arg1) {
                    int var31 = this.field3754[var29] + arg4;
                    int var32 = this.field3756[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field3741[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field3741[var29];
                } else {
                    var18.field3741[var29] = this.field3741[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method1507(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field3746 - this.field3752;
            for (int var43 = 0; var43 < this.field3747; var43++) {
                int var44 = this.field3754[var43] + arg4;
                int var45 = this.field3756[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field3741[var43] = var52 + this.field3741[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field3746 - this.field3752;
            for (int var54 = 0; var54 < this.field3747; var54++) {
                int var55 = this.field3754[var54] + arg4;
                int var56 = this.field3756[var54] + arg6;
                int var57 = var55 & 0x7F;
                int var58 = var56 & 0x7F;
                int var59 = var55 >> 7;
                int var60 = var56 >> 7;
                int var61 = (128 - var57) * arg2[var59][var60] + arg2[var59 + 1][var60] * var57 >> 7;
                int var62 = (128 - var57) * arg2[var59][var60 + 1] + arg2[var59 + 1][var60 + 1] * var57 >> 7;
                int var63 = (128 - var58) * var61 + var58 * var62 >> 7;
                int var64 = (128 - var57) * arg3[var59][var60] + arg3[var59 + 1][var60] * var57 >> 7;
                int var65 = (128 - var57) * arg3[var59][var60 + 1] + arg3[var59 + 1][var60 + 1] * var57 >> 7;
                int var66 = (128 - var58) * var64 + var58 * var65 >> 7;
                int var67 = var63 - var66;
                var18.field3741[var54] = ((this.field3741[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method1504();
        } else {
            this.field3759 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lgl;IS)I")
    private final int method1492(class210 arg0, int arg1, short arg2) {
        int var4 = arg0.field3754[arg1];
        int var5 = arg0.field3741[arg1];
        int var6 = arg0.field3756[arg1];
        for (int var7 = 0; var7 < this.field3747; var7++) {
            if (this.field3754[var7] == var4 && this.field3741[var7] == var5 && this.field3756[var7] == var6) {
                this.field3760[var7] |= arg2;
                return var7;
            }
        }
        this.field3754[this.field3747] = var4;
        this.field3741[this.field3747] = var5;
        this.field3756[this.field3747] = var6;
        this.field3760[this.field3747] = arg2;
        if (arg0.field3714 != null) {
            this.field3714[this.field3747] = arg0.field3714[arg1];
        }
        return this.field3747++;
    }

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "()V")
    private final void method1493() {
        if (this.field3759) {
            return;
        }
        this.field3759 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field3747; var7++) {
            int var8 = this.field3754[var7];
            int var9 = this.field3741[var7];
            int var10 = this.field3756[var7];
            if (var8 < var1) {
                var1 = var8;
            }
            if (var8 > var4) {
                var4 = var8;
            }
            if (var9 < var2) {
                var2 = var9;
            }
            if (var9 > var5) {
                var5 = var9;
            }
            if (var10 < var3) {
                var3 = var10;
            }
            if (var10 > var6) {
                var6 = var10;
            }
        }
        this.field3744 = (short) var1;
        this.field3727 = (short) var4;
        this.field3752 = (short) var2;
        this.field3746 = (short) var5;
        this.field3748 = (short) var3;
        this.field3735 = (short) var6;
    }

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "()Lgl;")
    public final class210 method1494() {
        class210 var1 = new class210();
        if (this.field3720 != null) {
            var1.field3720 = new byte[this.field3725];
            for (int var2 = 0; var2 < this.field3725; var2++) {
                var1.field3720[var2] = this.field3720[var2];
            }
        }
        var1.field3747 = this.field3747;
        var1.field3725 = this.field3725;
        var1.field3763 = this.field3763;
        var1.field3754 = this.field3754;
        var1.field3741 = this.field3741;
        var1.field3756 = this.field3756;
        var1.field3734 = this.field3734;
        var1.field3730 = this.field3730;
        var1.field3743 = this.field3743;
        var1.field3726 = this.field3726;
        var1.field3758 = this.field3758;
        var1.field3723 = this.field3723;
        var1.field3733 = this.field3733;
        var1.field3750 = this.field3750;
        var1.field3718 = this.field3718;
        var1.field3761 = this.field3761;
        var1.field3717 = this.field3717;
        var1.field3755 = this.field3755;
        var1.field3742 = this.field3742;
        var1.field3753 = this.field3753;
        var1.field3749 = this.field3749;
        var1.field3716 = this.field3716;
        var1.field3713 = this.field3713;
        var1.field3729 = this.field3729;
        var1.field3736 = this.field3736;
        var1.field3721 = this.field3721;
        var1.field3724 = this.field3724;
        var1.field3714 = this.field3714;
        var1.field3728 = this.field3728;
        var1.field3722 = this.field3722;
        var1.field3737 = this.field3737;
        var1.field3732 = this.field3732;
        var1.field3745 = this.field3745;
        var1.field3719 = this.field3719;
        var1.field3740 = this.field3740;
        return var1;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(IIIII)Lea;")
    public final class37 method1495(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class37(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "()V")
    public final void method1496() {
        this.field3714 = null;
        this.field3728 = null;
        this.field3722 = null;
        this.field3737 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "()I")
    public final int method80() {
        if (!this.field3759) {
            this.method1493();
        }
        return this.field3752;
    }

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "()V")
    public final void method1497() {
        for (int var1 = 0; var1 < this.field3747; var1++) {
            this.field3754[var1] = -this.field3754[var1];
            this.field3756[var1] = -this.field3756[var1];
        }
        this.method1504();
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(IIIII)Lba;")
    public final class166 method1498(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class37(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(I)V")
    private final void method1499(int arg0) {
        int var2 = field3757[arg0];
        int var3 = field3731[arg0];
        for (int var4 = 0; var4 < this.field3747; var4++) {
            int var5 = this.field3754[var4] * var3 + this.field3741[var4] * var2 >> 16;
            this.field3741[var4] = this.field3741[var4] * var3 - this.field3754[var4] * var2 >> 16;
            this.field3754[var4] = var5;
        }
        this.method1504();
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "([B)V")
    private final void method1500(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class149 var4 = new class149(arg0);
        class149 var5 = new class149(arg0);
        class149 var6 = new class149(arg0);
        class149 var7 = new class149(arg0);
        class149 var8 = new class149(arg0);
        var4.field2593 = arg0.length - 18;
        int var9 = var4.method1050(1272006568);
        int var10 = var4.method1050(1272006568);
        int var11 = var4.method1045((byte) 115);
        int var12 = var4.method1045((byte) -75);
        int var13 = var4.method1045((byte) 99);
        int var14 = var4.method1045((byte) -52);
        int var15 = var4.method1045((byte) -90);
        int var16 = var4.method1045((byte) 127);
        int var17 = var4.method1050(1272006568);
        int var18 = var4.method1050(1272006568);
        int var19 = var4.method1050(1272006568);
        int var20 = var4.method1050(1272006568);
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
        this.field3747 = var9;
        this.field3725 = var10;
        this.field3763 = var11;
        this.field3754 = new int[var9];
        this.field3741 = new int[var9];
        this.field3756 = new int[var9];
        this.field3734 = new int[var10];
        this.field3730 = new int[var10];
        this.field3743 = new int[var10];
        if (var11 > 0) {
            this.field3761 = new byte[var11];
            this.field3717 = new short[var11];
            this.field3755 = new short[var11];
            this.field3742 = new short[var11];
        }
        if (var16 == 1) {
            this.field3714 = new int[var9];
        }
        if (var12 == 1) {
            this.field3720 = new byte[var10];
            this.field3723 = new byte[var10];
            this.field3750 = new short[var10];
        }
        if (var13 == 255) {
            this.field3726 = new byte[var10];
        } else {
            this.field3718 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3758 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3728 = new int[var10];
        }
        this.field3733 = new short[var10];
        var4.field2593 = var21;
        var5.field2593 = var36;
        var6.field2593 = var38;
        var7.field2593 = var40;
        var8.field2593 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method1045((byte) -91);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method1057((byte) 56);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method1057((byte) 56);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method1057((byte) 56);
            }
            this.field3754[var46] = var43 + var63;
            this.field3741[var46] = var44 + var64;
            this.field3756[var46] = var45 + var65;
            var43 = this.field3754[var46];
            var44 = this.field3741[var46];
            var45 = this.field3756[var46];
            if (var16 == 1) {
                this.field3714[var46] = var8.method1045((byte) -40);
            }
        }
        var4.field2593 = var32;
        var5.field2593 = var28;
        var6.field2593 = var26;
        var7.field2593 = var30;
        var8.field2593 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field3733[var47] = (short) var4.method1050(1272006568);
            if (var12 == 1) {
                int var61 = var5.method1045((byte) -61);
                if ((var61 & 0x1) == 1) {
                    this.field3720[var47] = 1;
                    var2 = true;
                } else {
                    this.field3720[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field3723[var47] = (byte) (var61 >> 2);
                    this.field3750[var47] = this.field3733[var47];
                    this.field3733[var47] = 127;
                    if (this.field3750[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field3723[var47] = -1;
                    this.field3750[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field3726[var47] = var6.method1084((byte) 49);
            }
            if (var14 == 1) {
                this.field3758[var47] = var7.method1084((byte) 49);
            }
            if (var15 == 1) {
                this.field3728[var47] = var8.method1045((byte) -98);
            }
        }
        var4.field2593 = var25;
        var5.field2593 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method1045((byte) -27);
            if (var57 == 1) {
                var48 = var4.method1057((byte) 56) + var51;
                var49 = var4.method1057((byte) 56) + var48;
                var50 = var4.method1057((byte) 56) + var49;
                var51 = var50;
                this.field3734[var52] = var48;
                this.field3730[var52] = var49;
                this.field3743[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method1057((byte) 56) + var51;
                var51 = var50;
                this.field3734[var52] = var48;
                this.field3730[var52] = var49;
                this.field3743[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method1057((byte) 56) + var51;
                var51 = var50;
                this.field3734[var52] = var48;
                this.field3730[var52] = var49;
                this.field3743[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method1057((byte) 56) + var51;
                var51 = var50;
                this.field3734[var52] = var48;
                this.field3730[var52] = var60;
                this.field3743[var52] = var50;
            }
        }
        var4.field2593 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field3761[var53] = 0;
            this.field3717[var53] = (short) var4.method1050(1272006568);
            this.field3755[var53] = (short) var4.method1050(1272006568);
            this.field3742[var53] = (short) var4.method1050(1272006568);
        }
        if (this.field3723 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field3723[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field3717[var56] & 0xFFFF) == this.field3734[var55] && (this.field3755[var56] & 0xFFFF) == this.field3730[var55] && (this.field3742[var56] & 0xFFFF) == this.field3743[var55]) {
                        this.field3723[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field3723 = null;
            }
        }
        if (!var3) {
            this.field3750 = null;
        }
        if (!var2) {
            this.field3720 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "(III)V")
    public final void method1501(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3747; var4++) {
            this.field3754[var4] = this.field3754[var4] * arg0 / 128;
            this.field3741[var4] = this.field3741[var4] * arg1 / 128;
            this.field3756[var4] = this.field3756[var4] * arg2 / 128;
        }
        this.method1504();
    }

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "(I)V")
    public final void method1502(int arg0) {
        int var2 = field3757[arg0];
        int var3 = field3731[arg0];
        for (int var4 = 0; var4 < this.field3747; var4++) {
            int var5 = this.field3756[var4] * var2 + this.field3754[var4] * var3 >> 16;
            this.field3756[var4] = this.field3756[var4] * var3 - this.field3754[var4] * var2 >> 16;
            this.field3754[var4] = var5;
        }
        this.method1504();
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(SS)V")
    public final void method1503(short arg0, short arg1) {
        if (this.field3750 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field3725; var3++) {
            if (this.field3750[var3] == arg0) {
                this.field3750[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "()V")
    private final void method1504() {
        this.field3732 = null;
        this.field3738 = null;
        this.field3745 = null;
        this.field3759 = false;
    }

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "(I)V")
    private final void method1505(int arg0) {
        int var2 = field3757[arg0];
        int var3 = field3731[arg0];
        for (int var4 = 0; var4 < this.field3747; var4++) {
            int var5 = this.field3741[var4] * var3 - this.field3756[var4] * var2 >> 16;
            this.field3756[var4] = this.field3756[var4] * var3 + this.field3741[var4] * var2 >> 16;
            this.field3741[var4] = var5;
        }
        this.method1504();
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "()Z")
    public final boolean method1506() {
        return true;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIII)V")
    public final void method81(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "([[IIIIII)V")
    private final void method1507(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1508(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1508(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1508(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1508(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method1505(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method1499(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method1484(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "([[III)I")
    private static final int method1508(int[][] arg0, int arg1, int arg2) {
        int var3 = arg1 >> 7;
        int var4 = arg2 >> 7;
        if (var3 < 0 || var4 < 0 || var3 >= arg0.length || var4 >= arg0[0].length) {
            return 0;
        }
        int var5 = arg1 & 0x7F;
        int var6 = arg2 & 0x7F;
        int var7 = (128 - var5) * arg0[var3][var4] + arg0[var3 + 1][var4] * var5 >> 7;
        int var8 = (128 - var5) * arg0[var3][var4 + 1] + arg0[var3 + 1][var4 + 1] * var5 >> 7;
        return (128 - var6) * var7 + var6 * var8 >> 7;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)Ldc;")
    public final class235 method1509(int arg0, int arg1, int arg2) {
        return this.method1498(this.field3719, this.field3740, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "()V")
    public final void method1510() {
        for (int var1 = 0; var1 < this.field3747; var1++) {
            int var2 = this.field3754[var1];
            this.field3754[var1] = this.field3756[var1];
            this.field3756[var1] = -var2;
        }
        this.method1504();
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "([B)V")
    private final void method1511(byte[] arg0) {
        class149 var2 = new class149(arg0);
        class149 var3 = new class149(arg0);
        class149 var4 = new class149(arg0);
        class149 var5 = new class149(arg0);
        class149 var6 = new class149(arg0);
        class149 var7 = new class149(arg0);
        class149 var8 = new class149(arg0);
        var2.field2593 = arg0.length - 23;
        int var9 = var2.method1050(1272006568);
        int var10 = var2.method1050(1272006568);
        int var11 = var2.method1045((byte) 77);
        int var12 = var2.method1045((byte) -103);
        boolean var13 = (var12 & 0x1) == 1;
        boolean var14 = (var12 & 0x2) == 2;
        int var15 = var2.method1045((byte) 115);
        int var16 = var2.method1045((byte) 108);
        int var17 = var2.method1045((byte) 104);
        int var18 = var2.method1045((byte) 120);
        int var19 = var2.method1045((byte) -94);
        int var20 = var2.method1050(1272006568);
        int var21 = var2.method1050(1272006568);
        int var22 = var2.method1050(1272006568);
        int var23 = var2.method1050(1272006568);
        int var24 = var2.method1050(1272006568);
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field3761 = new byte[var11];
            var2.field2593 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field3761[var28] = var2.method1084((byte) 49);
                if (var29 == 0) {
                    var25++;
                }
                if (var29 >= 1 && var29 <= 3) {
                    var26++;
                }
                if (var29 == 2) {
                    var27++;
                }
            }
        }
        int var32 = var9 + var11;
        int var33 = var32;
        if (var13) {
            var32 += var10;
        }
        int var35 = var10 + var32;
        int var36 = var35;
        if (var15 == 255) {
            var35 += var10;
        }
        int var37 = var35;
        if (var17 == 1) {
            var35 += var10;
        }
        int var38 = var35;
        if (var19 == 1) {
            var35 += var9;
        }
        int var39 = var35;
        if (var16 == 1) {
            var35 += var10;
        }
        int var41 = var23 + var35;
        int var42 = var41;
        if (var18 == 1) {
            var41 += var10 * 2;
        }
        int var44 = var24 + var41;
        int var46 = var10 * 2 + var44;
        int var48 = var20 + var46;
        int var50 = var21 + var48;
        int var52 = var22 + var50;
        int var54 = var25 * 6 + var52;
        int var56 = var26 * 6 + var54;
        int var58 = var26 * 6 + var56;
        int var60 = var26 + var58;
        int var62 = var26 + var60;
        int var64 = var27 * 2 + var26 + var62;
        this.field3747 = var9;
        this.field3725 = var10;
        this.field3763 = var11;
        this.field3754 = new int[var9];
        this.field3741 = new int[var9];
        this.field3756 = new int[var9];
        this.field3734 = new int[var10];
        this.field3730 = new int[var10];
        this.field3743 = new int[var10];
        if (var19 == 1) {
            this.field3714 = new int[var9];
        }
        if (var13) {
            this.field3720 = new byte[var10];
        }
        if (var15 == 255) {
            this.field3726 = new byte[var10];
        } else {
            this.field3718 = (byte) var15;
        }
        if (var16 == 1) {
            this.field3758 = new byte[var10];
        }
        if (var17 == 1) {
            this.field3728 = new int[var10];
        }
        if (var18 == 1) {
            this.field3750 = new short[var10];
        }
        if (var18 == 1 && var11 > 0) {
            this.field3723 = new byte[var10];
        }
        this.field3733 = new short[var10];
        if (var11 > 0) {
            this.field3717 = new short[var11];
            this.field3755 = new short[var11];
            this.field3742 = new short[var11];
            if (var26 > 0) {
                this.field3753 = new short[var26];
                this.field3749 = new short[var26];
                this.field3716 = new short[var26];
                this.field3713 = new byte[var26];
                this.field3729 = new byte[var26];
                this.field3736 = new byte[var26];
            }
            if (var27 > 0) {
                this.field3721 = new byte[var27];
                this.field3724 = new byte[var27];
            }
        }
        var2.field2593 = var11;
        var3.field2593 = var46;
        var4.field2593 = var48;
        var5.field2593 = var50;
        var6.field2593 = var38;
        int var66 = 0;
        int var67 = 0;
        int var68 = 0;
        for (int var69 = 0; var69 < var9; var69++) {
            int var84 = var2.method1045((byte) -91);
            int var85 = 0;
            if ((var84 & 0x1) != 0) {
                var85 = var3.method1057((byte) 56);
            }
            int var86 = 0;
            if ((var84 & 0x2) != 0) {
                var86 = var4.method1057((byte) 56);
            }
            int var87 = 0;
            if ((var84 & 0x4) != 0) {
                var87 = var5.method1057((byte) 56);
            }
            this.field3754[var69] = var66 + var85;
            this.field3741[var69] = var67 + var86;
            this.field3756[var69] = var68 + var87;
            var66 = this.field3754[var69];
            var67 = this.field3741[var69];
            var68 = this.field3756[var69];
            if (var19 == 1) {
                this.field3714[var69] = var6.method1045((byte) -82);
            }
        }
        var2.field2593 = var44;
        var3.field2593 = var33;
        var4.field2593 = var36;
        var5.field2593 = var39;
        var6.field2593 = var37;
        var7.field2593 = var42;
        var8.field2593 = var41;
        for (int var70 = 0; var70 < var10; var70++) {
            this.field3733[var70] = (short) var2.method1050(1272006568);
            if (var13) {
                this.field3720[var70] = var3.method1084((byte) 49);
            }
            if (var15 == 255) {
                this.field3726[var70] = var4.method1084((byte) 49);
            }
            if (var16 == 1) {
                this.field3758[var70] = var5.method1084((byte) 49);
            }
            if (var17 == 1) {
                this.field3728[var70] = var6.method1045((byte) 127);
            }
            if (var18 == 1) {
                this.field3750[var70] = (short) (var7.method1050(1272006568) - 1);
            }
            if (this.field3723 != null) {
                if (this.field3750[var70] == -1) {
                    this.field3723[var70] = -1;
                } else {
                    this.field3723[var70] = (byte) (var8.method1045((byte) -63) - 1);
                }
            }
        }
        var2.field2593 = var35;
        var3.field2593 = var32;
        int var71 = 0;
        int var72 = 0;
        int var73 = 0;
        int var74 = 0;
        for (int var75 = 0; var75 < var10; var75++) {
            int var80 = var3.method1045((byte) 115);
            if (var80 == 1) {
                var71 = var2.method1057((byte) 56) + var74;
                var72 = var2.method1057((byte) 56) + var71;
                var73 = var2.method1057((byte) 56) + var72;
                var74 = var73;
                this.field3734[var75] = var71;
                this.field3730[var75] = var72;
                this.field3743[var75] = var73;
            }
            if (var80 == 2) {
                var72 = var73;
                var73 = var2.method1057((byte) 56) + var74;
                var74 = var73;
                this.field3734[var75] = var71;
                this.field3730[var75] = var72;
                this.field3743[var75] = var73;
            }
            if (var80 == 3) {
                var71 = var73;
                var73 = var2.method1057((byte) 56) + var74;
                var74 = var73;
                this.field3734[var75] = var71;
                this.field3730[var75] = var72;
                this.field3743[var75] = var73;
            }
            if (var80 == 4) {
                int var83 = var71;
                var71 = var72;
                var72 = var83;
                var73 = var2.method1057((byte) 56) + var74;
                var74 = var73;
                this.field3734[var75] = var71;
                this.field3730[var75] = var83;
                this.field3743[var75] = var73;
            }
        }
        var2.field2593 = var52;
        var3.field2593 = var54;
        var4.field2593 = var56;
        var5.field2593 = var58;
        var6.field2593 = var60;
        var7.field2593 = var62;
        for (int var76 = 0; var76 < var11; var76++) {
            int var79 = this.field3761[var76] & 0xFF;
            if (var79 == 0) {
                this.field3717[var76] = (short) var2.method1050(1272006568);
                this.field3755[var76] = (short) var2.method1050(1272006568);
                this.field3742[var76] = (short) var2.method1050(1272006568);
            }
            if (var79 == 1) {
                this.field3717[var76] = (short) var3.method1050(1272006568);
                this.field3755[var76] = (short) var3.method1050(1272006568);
                this.field3742[var76] = (short) var3.method1050(1272006568);
                this.field3753[var76] = (short) var4.method1050(1272006568);
                this.field3749[var76] = (short) var4.method1050(1272006568);
                this.field3716[var76] = (short) var4.method1050(1272006568);
                this.field3713[var76] = var5.method1084((byte) 49);
                this.field3729[var76] = var6.method1084((byte) 49);
                this.field3736[var76] = var7.method1084((byte) 49);
            }
            if (var79 == 2) {
                this.field3717[var76] = (short) var3.method1050(1272006568);
                this.field3755[var76] = (short) var3.method1050(1272006568);
                this.field3742[var76] = (short) var3.method1050(1272006568);
                this.field3753[var76] = (short) var4.method1050(1272006568);
                this.field3749[var76] = (short) var4.method1050(1272006568);
                this.field3716[var76] = (short) var4.method1050(1272006568);
                this.field3713[var76] = var5.method1084((byte) 49);
                this.field3729[var76] = var6.method1084((byte) 49);
                this.field3736[var76] = var7.method1084((byte) 49);
                this.field3721[var76] = var7.method1084((byte) 49);
                this.field3724[var76] = var7.method1084((byte) 49);
            }
            if (var79 == 3) {
                this.field3717[var76] = (short) var3.method1050(1272006568);
                this.field3755[var76] = (short) var3.method1050(1272006568);
                this.field3742[var76] = (short) var3.method1050(1272006568);
                this.field3753[var76] = (short) var4.method1050(1272006568);
                this.field3749[var76] = (short) var4.method1050(1272006568);
                this.field3716[var76] = (short) var4.method1050(1272006568);
                this.field3713[var76] = var5.method1084((byte) 49);
                this.field3729[var76] = var6.method1084((byte) 49);
                this.field3736[var76] = var7.method1084((byte) 49);
            }
        }
        if (!var14) {
            return;
        }
        var2.field2593 = var64;
        int var77 = var2.method1045((byte) 94);
        if (var77 > 0) {
            var2.field2593 += var77 * 4;
        }
        int var78 = var2.method1045((byte) -17);
        if (var78 > 0) {
            var2.field2593 += var78 * 4;
        }
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
    private class210() {
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "([B)V")
    private class210(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1511(arg0);
        } else {
            this.method1500(arg0);
        }
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(III)V")
    public class210(int arg0, int arg1, int arg2) {
        this.field3754 = new int[arg0];
        this.field3741 = new int[arg0];
        this.field3756 = new int[arg0];
        this.field3714 = new int[arg0];
        this.field3734 = new int[arg1];
        this.field3730 = new int[arg1];
        this.field3743 = new int[arg1];
        this.field3720 = new byte[arg1];
        this.field3726 = new byte[arg1];
        this.field3758 = new byte[arg1];
        this.field3733 = new short[arg1];
        this.field3750 = new short[arg1];
        this.field3723 = new byte[arg1];
        this.field3728 = new int[arg1];
        if (arg2 > 0) {
            this.field3761 = new byte[arg2];
            this.field3717 = new short[arg2];
            this.field3755 = new short[arg2];
            this.field3742 = new short[arg2];
            this.field3753 = new short[arg2];
            this.field3749 = new short[arg2];
            this.field3716 = new short[arg2];
            this.field3713 = new byte[arg2];
            this.field3729 = new byte[arg2];
            this.field3736 = new byte[arg2];
            this.field3721 = new byte[arg2];
            this.field3724 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "([Lgl;I)V")
    public class210(class210[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field3747 = 0;
        this.field3725 = 0;
        this.field3763 = 0;
        boolean var9 = false;
        boolean var10 = false;
        this.field3718 = -1;
        for (int var11 = 0; var11 < arg1; var11++) {
            class210 var20 = arg0[var11];
            if (var20 != null) {
                this.field3747 += var20.field3747;
                this.field3725 += var20.field3725;
                this.field3763 += var20.field3763;
                if (var20.field3726 == null) {
                    if (this.field3718 == -1) {
                        this.field3718 = var20.field3718;
                    }
                    if (this.field3718 != var20.field3718) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var20.field3720 != null;
                var5 |= var20.field3758 != null;
                var6 |= var20.field3728 != null;
                var7 |= var20.field3750 != null;
                var8 |= var20.field3723 != null;
            }
        }
        this.field3754 = new int[this.field3747];
        this.field3741 = new int[this.field3747];
        this.field3756 = new int[this.field3747];
        this.field3714 = new int[this.field3747];
        this.field3760 = new short[this.field3747];
        this.field3734 = new int[this.field3725];
        this.field3730 = new int[this.field3725];
        this.field3743 = new int[this.field3725];
        if (var3) {
            this.field3720 = new byte[this.field3725];
        }
        if (var4) {
            this.field3726 = new byte[this.field3725];
        }
        if (var5) {
            this.field3758 = new byte[this.field3725];
        }
        if (var6) {
            this.field3728 = new int[this.field3725];
        }
        if (var7) {
            this.field3750 = new short[this.field3725];
        }
        if (var8) {
            this.field3723 = new byte[this.field3725];
        }
        this.field3733 = new short[this.field3725];
        this.field3739 = new short[this.field3725];
        if (this.field3763 > 0) {
            this.field3761 = new byte[this.field3763];
            this.field3717 = new short[this.field3763];
            this.field3755 = new short[this.field3763];
            this.field3742 = new short[this.field3763];
            this.field3753 = new short[this.field3763];
            this.field3749 = new short[this.field3763];
            this.field3716 = new short[this.field3763];
            this.field3713 = new byte[this.field3763];
            this.field3729 = new byte[this.field3763];
            this.field3736 = new byte[this.field3763];
            this.field3721 = new byte[this.field3763];
            this.field3724 = new byte[this.field3763];
        }
        this.field3747 = 0;
        this.field3725 = 0;
        this.field3763 = 0;
        boolean var12 = false;
        boolean var13 = false;
        for (int var14 = 0; var14 < arg1; var14++) {
            short var15 = (short) (0x1 << var14);
            class210 var16 = arg0[var14];
            if (var16 != null) {
                for (int var17 = 0; var17 < var16.field3725; var17++) {
                    if (var3 && var16.field3720 != null) {
                        this.field3720[this.field3725] = var16.field3720[var17];
                    }
                    if (var4) {
                        if (var16.field3726 == null) {
                            this.field3726[this.field3725] = var16.field3718;
                        } else {
                            this.field3726[this.field3725] = var16.field3726[var17];
                        }
                    }
                    if (var5 && var16.field3758 != null) {
                        this.field3758[this.field3725] = var16.field3758[var17];
                    }
                    if (var6 && var16.field3728 != null) {
                        this.field3728[this.field3725] = var16.field3728[var17];
                    }
                    if (var7) {
                        if (var16.field3750 == null) {
                            this.field3750[this.field3725] = -1;
                        } else {
                            this.field3750[this.field3725] = var16.field3750[var17];
                        }
                    }
                    if (var8) {
                        if (var16.field3723 == null || var16.field3723[var17] == -1) {
                            this.field3723[this.field3725] = -1;
                        } else {
                            this.field3723[this.field3725] = (byte) (var16.field3723[var17] + this.field3763);
                        }
                    }
                    this.field3733[this.field3725] = var16.field3733[var17];
                    this.field3739[this.field3725] = var15;
                    this.field3734[this.field3725] = this.method1492(var16, var16.field3734[var17], var15);
                    this.field3730[this.field3725] = this.method1492(var16, var16.field3730[var17], var15);
                    this.field3743[this.field3725] = this.method1492(var16, var16.field3743[var17], var15);
                    this.field3725++;
                }
                for (int var18 = 0; var18 < var16.field3763; var18++) {
                    byte var19 = this.field3761[this.field3763] = var16.field3761[var18];
                    if (var19 == 0) {
                        this.field3717[this.field3763] = (short) this.method1492(var16, var16.field3717[var18], var15);
                        this.field3755[this.field3763] = (short) this.method1492(var16, var16.field3755[var18], var15);
                        this.field3742[this.field3763] = (short) this.method1492(var16, var16.field3742[var18], var15);
                    }
                    if (var19 >= 1 && var19 <= 3) {
                        this.field3717[this.field3763] = var16.field3717[var18];
                        this.field3755[this.field3763] = var16.field3755[var18];
                        this.field3742[this.field3763] = var16.field3742[var18];
                        this.field3753[this.field3763] = var16.field3753[var18];
                        this.field3749[this.field3763] = var16.field3749[var18];
                        this.field3716[this.field3763] = var16.field3716[var18];
                        this.field3713[this.field3763] = var16.field3713[var18];
                        this.field3729[this.field3763] = var16.field3729[var18];
                        this.field3736[this.field3763] = var16.field3736[var18];
                    }
                    if (var19 == 2) {
                        this.field3721[this.field3763] = var16.field3721[var18];
                        this.field3724[this.field3763] = var16.field3724[var18];
                    }
                    this.field3763++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lgl;ZZZZ)V")
    public class210(class210 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field3747 = arg0.field3747;
        this.field3725 = arg0.field3725;
        this.field3763 = arg0.field3763;
        if (arg1) {
            this.field3754 = arg0.field3754;
            this.field3741 = arg0.field3741;
            this.field3756 = arg0.field3756;
        } else {
            this.field3754 = new int[this.field3747];
            this.field3741 = new int[this.field3747];
            this.field3756 = new int[this.field3747];
            for (int var6 = 0; var6 < this.field3747; var6++) {
                this.field3754[var6] = arg0.field3754[var6];
                this.field3741[var6] = arg0.field3741[var6];
                this.field3756[var6] = arg0.field3756[var6];
            }
        }
        if (arg2) {
            this.field3733 = arg0.field3733;
        } else {
            this.field3733 = new short[this.field3725];
            for (int var7 = 0; var7 < this.field3725; var7++) {
                this.field3733[var7] = arg0.field3733[var7];
            }
        }
        if (arg3 || arg0.field3750 == null) {
            this.field3750 = arg0.field3750;
        } else {
            this.field3750 = new short[this.field3725];
            for (int var8 = 0; var8 < this.field3725; var8++) {
                this.field3750[var8] = arg0.field3750[var8];
            }
        }
        if (arg4) {
            this.field3758 = arg0.field3758;
        } else {
            this.field3758 = new byte[this.field3725];
            if (arg0.field3758 == null) {
                for (int var9 = 0; var9 < this.field3725; var9++) {
                    this.field3758[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field3725; var10++) {
                    this.field3758[var10] = arg0.field3758[var10];
                }
            }
        }
        this.field3734 = arg0.field3734;
        this.field3730 = arg0.field3730;
        this.field3743 = arg0.field3743;
        this.field3720 = arg0.field3720;
        this.field3726 = arg0.field3726;
        this.field3723 = arg0.field3723;
        this.field3718 = arg0.field3718;
        this.field3761 = arg0.field3761;
        this.field3717 = arg0.field3717;
        this.field3755 = arg0.field3755;
        this.field3742 = arg0.field3742;
        this.field3753 = arg0.field3753;
        this.field3749 = arg0.field3749;
        this.field3716 = arg0.field3716;
        this.field3713 = arg0.field3713;
        this.field3729 = arg0.field3729;
        this.field3736 = arg0.field3736;
        this.field3721 = arg0.field3721;
        this.field3724 = arg0.field3724;
        this.field3714 = arg0.field3714;
        this.field3728 = arg0.field3728;
        this.field3722 = arg0.field3722;
        this.field3737 = arg0.field3737;
        this.field3732 = arg0.field3732;
        this.field3745 = arg0.field3745;
        this.field3738 = arg0.field3738;
        this.field3719 = arg0.field3719;
        this.field3740 = arg0.field3740;
    }
}
