import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class234 extends class43 {

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "I")
    public int field3717 = 0;

    @OriginalMember(owner = "client!ui", name = "H", descriptor = "Z")
    private boolean field3725 = false;

    @OriginalMember(owner = "client!ui", name = "ib", descriptor = "I")
    public int field3752 = 0;

    @OriginalMember(owner = "client!ui", name = "mb", descriptor = "B")
    public byte field3756 = 0;

    @OriginalMember(owner = "client!ui", name = "gb", descriptor = "I")
    public int field3750 = 0;

    @OriginalMember(owner = "client!ui", name = "I", descriptor = "[I")
    public int[] field3726;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "[I")
    public int[] field3706;

    @OriginalMember(owner = "client!ui", name = "U", descriptor = "[I")
    public int[] field3738;

    @OriginalMember(owner = "client!ui", name = "cb", descriptor = "[I")
    public int[] field3746;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "[I")
    public int[] field3713;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "[I")
    public int[] field3711;

    @OriginalMember(owner = "client!ui", name = "O", descriptor = "[I")
    public int[] field3732;

    @OriginalMember(owner = "client!ui", name = "K", descriptor = "[B")
    public byte[] field3728;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "[B")
    public byte[] field3712;

    @OriginalMember(owner = "client!ui", name = "Q", descriptor = "[B")
    public byte[] field3734;

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "[S")
    public short[] field3714;

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "[S")
    public short[] field3718;

    @OriginalMember(owner = "client!ui", name = "M", descriptor = "[B")
    public byte[] field3730;

    @OriginalMember(owner = "client!ui", name = "lb", descriptor = "[I")
    public int[] field3755;

    @OriginalMember(owner = "client!ui", name = "E", descriptor = "[B")
    public byte[] field3722;

    @OriginalMember(owner = "client!ui", name = "P", descriptor = "[S")
    public short[] field3733;

    @OriginalMember(owner = "client!ui", name = "bb", descriptor = "[S")
    public short[] field3745;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "[S")
    public short[] field3707;

    @OriginalMember(owner = "client!ui", name = "hb", descriptor = "[S")
    private short[] field3751;

    @OriginalMember(owner = "client!ui", name = "fb", descriptor = "[S")
    private short[] field3749;

    @OriginalMember(owner = "client!ui", name = "X", descriptor = "[S")
    private short[] field3741;

    @OriginalMember(owner = "client!ui", name = "V", descriptor = "[B")
    private byte[] field3739;

    @OriginalMember(owner = "client!ui", name = "Y", descriptor = "[B")
    private byte[] field3742;

    @OriginalMember(owner = "client!ui", name = "nb", descriptor = "[B")
    private byte[] field3757;

    @OriginalMember(owner = "client!ui", name = "db", descriptor = "[B")
    private byte[] field3747;

    @OriginalMember(owner = "client!ui", name = "T", descriptor = "[B")
    private byte[] field3737;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
    public int field3709;

    @OriginalMember(owner = "client!ui", name = "J", descriptor = "[S")
    public short[] field3727;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "[S")
    public short[] field3708;

    @OriginalMember(owner = "client!ui", name = "W", descriptor = "[[I")
    public int[][] field3740;

    @OriginalMember(owner = "client!ui", name = "kb", descriptor = "[[I")
    public int[][] field3754;

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "[Lfa;")
    public class257[] field3720;

    @OriginalMember(owner = "client!ui", name = "ab", descriptor = "[Lbi;")
    public class94[] field3744;

    @OriginalMember(owner = "client!ui", name = "L", descriptor = "[Lfa;")
    public class257[] field3729;

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "S")
    public short field3715;

    @OriginalMember(owner = "client!ui", name = "R", descriptor = "S")
    public short field3735;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "[I")
    private static int[] field3710 = new int[10000];

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "I")
    private static int field3716 = 0;

    @OriginalMember(owner = "client!ui", name = "G", descriptor = "[I")
    private static int[] field3724 = new int[10000];

    @OriginalMember(owner = "client!ui", name = "jb", descriptor = "[I")
    private static int[] field3753 = class195.field3091;

    @OriginalMember(owner = "client!ui", name = "Z", descriptor = "[I")
    private static int[] field3743 = class195.field3089;

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "S")
    private short field3719;

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "S")
    private short field3721;

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "S")
    private short field3723;

    @OriginalMember(owner = "client!ui", name = "N", descriptor = "S")
    private short field3731;

    @OriginalMember(owner = "client!ui", name = "S", descriptor = "S")
    private short field3736;

    @OriginalMember(owner = "client!ui", name = "eb", descriptor = "S")
    private short field3748;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "()V")
    public final void method1558() {
        for (int var1 = 0; var1 < this.field3717; var1++) {
            int var2 = this.field3738[var1];
            this.field3738[var1] = this.field3726[var1];
            this.field3726[var1] = -var2;
        }
        this.method1577();
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "([B)V")
    private final void method1559(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class88 var4 = new class88(arg0);
        class88 var5 = new class88(arg0);
        class88 var6 = new class88(arg0);
        class88 var7 = new class88(arg0);
        class88 var8 = new class88(arg0);
        var4.field1535 = arg0.length - 18;
        int var9 = var4.method645(11596);
        int var10 = var4.method645(11596);
        int var11 = var4.method633(83);
        int var12 = var4.method633(75);
        int var13 = var4.method633(73);
        int var14 = var4.method633(109);
        int var15 = var4.method633(78);
        int var16 = var4.method633(96);
        int var17 = var4.method645(11596);
        int var18 = var4.method645(11596);
        int var19 = var4.method645(11596);
        int var20 = var4.method645(11596);
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
        this.field3717 = var9;
        this.field3752 = var10;
        this.field3709 = var11;
        this.field3726 = new int[var9];
        this.field3706 = new int[var9];
        this.field3738 = new int[var9];
        this.field3713 = new int[var10];
        this.field3711 = new int[var10];
        this.field3732 = new int[var10];
        if (var11 > 0) {
            this.field3722 = new byte[var11];
            this.field3733 = new short[var11];
            this.field3745 = new short[var11];
            this.field3707 = new short[var11];
        }
        if (var16 == 1) {
            this.field3746 = new int[var9];
        }
        if (var12 == 1) {
            this.field3728 = new byte[var10];
            this.field3730 = new byte[var10];
            this.field3718 = new short[var10];
        }
        if (var13 == 255) {
            this.field3712 = new byte[var10];
        } else {
            this.field3756 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3734 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3755 = new int[var10];
        }
        this.field3714 = new short[var10];
        var4.field1535 = var21;
        var5.field1535 = var36;
        var6.field1535 = var38;
        var7.field1535 = var40;
        var8.field1535 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method633(84);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method667(1210551352);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method667(1210551352);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method667(1210551352);
            }
            this.field3726[var46] = var43 + var63;
            this.field3706[var46] = var44 + var64;
            this.field3738[var46] = var45 + var65;
            var43 = this.field3726[var46];
            var44 = this.field3706[var46];
            var45 = this.field3738[var46];
            if (var16 == 1) {
                this.field3746[var46] = var8.method633(65);
            }
        }
        var4.field1535 = var32;
        var5.field1535 = var28;
        var6.field1535 = var26;
        var7.field1535 = var30;
        var8.field1535 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field3714[var47] = (short) var4.method645(11596);
            if (var12 == 1) {
                int var61 = var5.method633(73);
                if ((var61 & 0x1) == 1) {
                    this.field3728[var47] = 1;
                    var2 = true;
                } else {
                    this.field3728[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field3730[var47] = (byte) (var61 >> 2);
                    this.field3718[var47] = this.field3714[var47];
                    this.field3714[var47] = 127;
                    if (this.field3718[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field3730[var47] = -1;
                    this.field3718[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field3712[var47] = var6.method656(-252);
            }
            if (var14 == 1) {
                this.field3734[var47] = var7.method656(-252);
            }
            if (var15 == 1) {
                this.field3755[var47] = var8.method633(70);
            }
        }
        this.field3750 = -1;
        var4.field1535 = var25;
        var5.field1535 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method633(52);
            if (var57 == 1) {
                var48 = var4.method667(1210551352) + var51;
                var49 = var4.method667(1210551352) + var48;
                var50 = var4.method667(1210551352) + var49;
                var51 = var50;
                this.field3713[var52] = var48;
                this.field3711[var52] = var49;
                this.field3732[var52] = var50;
                if (var48 > this.field3750) {
                    this.field3750 = var48;
                }
                if (var49 > this.field3750) {
                    this.field3750 = var49;
                }
                if (var50 > this.field3750) {
                    this.field3750 = var50;
                }
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method667(1210551352) + var51;
                var51 = var50;
                this.field3713[var52] = var48;
                this.field3711[var52] = var49;
                this.field3732[var52] = var50;
                if (var50 > this.field3750) {
                    this.field3750 = var50;
                }
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method667(1210551352) + var51;
                var51 = var50;
                this.field3713[var52] = var48;
                this.field3711[var52] = var49;
                this.field3732[var52] = var50;
                if (var50 > this.field3750) {
                    this.field3750 = var50;
                }
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method667(1210551352) + var51;
                var51 = var50;
                this.field3713[var52] = var48;
                this.field3711[var52] = var60;
                this.field3732[var52] = var50;
                if (var50 > this.field3750) {
                    this.field3750 = var50;
                }
            }
        }
        this.field3750++;
        var4.field1535 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field3722[var53] = 0;
            this.field3733[var53] = (short) var4.method645(11596);
            this.field3745[var53] = (short) var4.method645(11596);
            this.field3707[var53] = (short) var4.method645(11596);
        }
        if (this.field3730 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field3730[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field3733[var56] & 0xFFFF) == this.field3713[var55] && (this.field3745[var56] & 0xFFFF) == this.field3711[var55] && (this.field3707[var56] & 0xFFFF) == this.field3732[var55]) {
                        this.field3730[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field3730 = null;
            }
        }
        if (!var3) {
            this.field3718 = null;
        }
        if (!var2) {
            this.field3728 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(IIIII)Lig;")
    public final class9 method1560(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class54(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II[[I[[IIIIZZ)Lui;")
    public final class234 method1561(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method1583();
        int var10 = this.field3748 + arg4;
        int var11 = this.field3731 + arg4;
        int var12 = this.field3736 + arg6;
        int var13 = this.field3721 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var10 < 0 || var11 + 128 >> 7 >= arg2.length || var12 < 0 || var13 + 128 >> 7 >= arg2[0].length) {
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
        class234 var18;
        if (arg7) {
            var18 = new class234();
            var18.field3717 = this.field3717;
            var18.field3750 = this.field3750;
            var18.field3752 = this.field3752;
            var18.field3709 = this.field3709;
            var18.field3713 = this.field3713;
            var18.field3711 = this.field3711;
            var18.field3732 = this.field3732;
            var18.field3728 = this.field3728;
            var18.field3712 = this.field3712;
            var18.field3734 = this.field3734;
            var18.field3730 = this.field3730;
            var18.field3714 = this.field3714;
            var18.field3718 = this.field3718;
            var18.field3756 = this.field3756;
            var18.field3722 = this.field3722;
            var18.field3733 = this.field3733;
            var18.field3745 = this.field3745;
            var18.field3707 = this.field3707;
            var18.field3751 = this.field3751;
            var18.field3749 = this.field3749;
            var18.field3741 = this.field3741;
            var18.field3739 = this.field3739;
            var18.field3742 = this.field3742;
            var18.field3757 = this.field3757;
            var18.field3747 = this.field3747;
            var18.field3737 = this.field3737;
            var18.field3746 = this.field3746;
            var18.field3755 = this.field3755;
            var18.field3740 = this.field3740;
            var18.field3754 = this.field3754;
            var18.field3715 = this.field3715;
            var18.field3735 = this.field3735;
            var18.field3720 = this.field3720;
            var18.field3744 = this.field3744;
            var18.field3729 = this.field3729;
            if (arg0 == 3) {
                var18.field3726 = class160.method1089(this.field3726, 0);
                var18.field3706 = class160.method1089(this.field3706, 0);
                var18.field3738 = class160.method1089(this.field3738, 0);
            } else {
                var18.field3726 = this.field3726;
                var18.field3706 = new int[var18.field3717];
                var18.field3738 = this.field3738;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field3750; var19++) {
                int var30 = this.field3726[var19] + arg4;
                int var31 = this.field3738[var19] + arg6;
                int var32 = var30 & 0x7F;
                int var33 = var31 & 0x7F;
                int var34 = var30 >> 7;
                int var35 = var31 >> 7;
                int var36 = (128 - var32) * arg2[var34][var35] + arg2[var34 + 1][var35] * var32 >> 7;
                int var37 = (128 - var32) * arg2[var34][var35 + 1] + arg2[var34 + 1][var35 + 1] * var32 >> 7;
                int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                var18.field3706[var19] = this.field3706[var19] + var38 - arg5;
            }
            for (int var20 = var18.field3750; var20 < var18.field3717; var20++) {
                int var21 = this.field3726[var20] + arg4;
                int var22 = this.field3738[var20] + arg6;
                int var23 = var21 & 0x7F;
                int var24 = var22 & 0x7F;
                int var25 = var21 >> 7;
                int var26 = var22 >> 7;
                if (var25 >= 0 && var25 < arg2.length - 1 && var26 >= 0 && var26 < arg2[0].length - 1) {
                    int var27 = (128 - var23) * arg2[var25][var26] + arg2[var25 + 1][var26] * var23 >> 7;
                    int var28 = (128 - var23) * arg2[var25][var26 + 1] + arg2[var25 + 1][var26 + 1] * var23 >> 7;
                    int var29 = (128 - var24) * var27 + var24 * var28 >> 7;
                    var18.field3706[var20] = this.field3706[var20] + var29 - arg5;
                }
            }
        } else if (arg0 == 2) {
            for (int var39 = 0; var39 < var18.field3750; var39++) {
                int var51 = (this.field3706[var39] << 16) / this.field3719;
                if (var51 < arg1) {
                    int var52 = this.field3726[var39] + arg4;
                    int var53 = this.field3738[var39] + arg6;
                    int var54 = var52 & 0x7F;
                    int var55 = var53 & 0x7F;
                    int var56 = var52 >> 7;
                    int var57 = var53 >> 7;
                    int var58 = (128 - var54) * arg2[var56][var57] + arg2[var56 + 1][var57] * var54 >> 7;
                    int var59 = (128 - var54) * arg2[var56][var57 + 1] + arg2[var56 + 1][var57 + 1] * var54 >> 7;
                    int var60 = (128 - var55) * var58 + var55 * var59 >> 7;
                    var18.field3706[var39] = (arg1 - var51) * (var60 - arg5) / arg1 + this.field3706[var39];
                } else {
                    var18.field3706[var39] = this.field3706[var39];
                }
            }
            for (int var40 = var18.field3750; var40 < var18.field3717; var40++) {
                int var41 = (this.field3706[var40] << 16) / this.field3719;
                if (var41 < arg1) {
                    int var42 = this.field3726[var40] + arg4;
                    int var43 = this.field3738[var40] + arg6;
                    int var44 = var42 & 0x7F;
                    int var45 = var43 & 0x7F;
                    int var46 = var42 >> 7;
                    int var47 = var43 >> 7;
                    if (var46 >= 0 && var46 < arg2.length - 1 && var47 >= 0 && var47 < arg2[0].length - 1) {
                        int var48 = (128 - var44) * arg2[var46][var47] + arg2[var46 + 1][var47] * var44 >> 7;
                        int var49 = (128 - var44) * arg2[var46][var47 + 1] + arg2[var46 + 1][var47 + 1] * var44 >> 7;
                        int var50 = (128 - var45) * var48 + var45 * var49 >> 7;
                        var18.field3706[var40] = (arg1 - var41) * (var50 - arg5) / arg1 + this.field3706[var40];
                    }
                } else {
                    var18.field3706[var40] = this.field3706[var40];
                }
            }
        } else if (arg0 == 3) {
            int var61 = (arg1 & 0xFF) * 4;
            int var62 = (arg1 >> 8 & 0xFF) * 4;
            var18.method1579(arg2, arg4, arg5, arg6, var61, var62);
        } else if (arg0 == 4) {
            int var63 = this.field3723 - this.field3719;
            for (int var64 = 0; var64 < this.field3750; var64++) {
                int var75 = this.field3726[var64] + arg4;
                int var76 = this.field3738[var64] + arg6;
                int var77 = var75 & 0x7F;
                int var78 = var76 & 0x7F;
                int var79 = var75 >> 7;
                int var80 = var76 >> 7;
                int var81 = (128 - var77) * arg3[var79][var80] + arg3[var79 + 1][var80] * var77 >> 7;
                int var82 = (128 - var77) * arg3[var79][var80 + 1] + arg3[var79 + 1][var80 + 1] * var77 >> 7;
                int var83 = (128 - var78) * var81 + var78 * var82 >> 7;
                var18.field3706[var64] = var83 + this.field3706[var64] + var63 - arg5;
            }
            for (int var65 = var18.field3750; var65 < var18.field3717; var65++) {
                int var66 = this.field3726[var65] + arg4;
                int var67 = this.field3738[var65] + arg6;
                int var68 = var66 & 0x7F;
                int var69 = var67 & 0x7F;
                int var70 = var66 >> 7;
                int var71 = var67 >> 7;
                if (var70 >= 0 && var70 < arg3.length - 1 && var71 >= 0 && var71 < arg3[0].length - 1) {
                    int var72 = (128 - var68) * arg3[var70][var71] + arg3[var70 + 1][var71] * var68 >> 7;
                    int var73 = (128 - var68) * arg3[var70][var71 + 1] + arg3[var70 + 1][var71 + 1] * var68 >> 7;
                    int var74 = (128 - var69) * var72 + var69 * var73 >> 7;
                    var18.field3706[var65] = var74 + this.field3706[var65] + var63 - arg5;
                }
            }
        } else if (arg0 == 5) {
            int var84 = this.field3723 - this.field3719;
            for (int var85 = 0; var85 < this.field3750; var85++) {
                int var100 = this.field3726[var85] + arg4;
                int var101 = this.field3738[var85] + arg6;
                int var102 = var100 & 0x7F;
                int var103 = var101 & 0x7F;
                int var104 = var100 >> 7;
                int var105 = var101 >> 7;
                int var106 = (128 - var102) * arg2[var104][var105] + arg2[var104 + 1][var105] * var102 >> 7;
                int var107 = (128 - var102) * arg2[var104][var105 + 1] + arg2[var104 + 1][var105 + 1] * var102 >> 7;
                int var108 = (128 - var103) * var106 + var103 * var107 >> 7;
                int var109 = (128 - var102) * arg3[var104][var105] + arg3[var104 + 1][var105] * var102 >> 7;
                int var110 = (128 - var102) * arg3[var104][var105 + 1] + arg3[var104 + 1][var105 + 1] * var102 >> 7;
                int var111 = (128 - var103) * var109 + var103 * var110 >> 7;
                int var112 = var108 - var111;
                var18.field3706[var85] = ((this.field3706[var85] << 8) / var84 * var112 >> 8) - (arg5 - var108);
            }
            for (int var86 = var18.field3750; var86 < var18.field3717; var86++) {
                int var87 = this.field3726[var86] + arg4;
                int var88 = this.field3738[var86] + arg6;
                int var89 = var87 & 0x7F;
                int var90 = var88 & 0x7F;
                int var91 = var87 >> 7;
                int var92 = var88 >> 7;
                if (var91 >= 0 && var91 < arg2.length - 1 && var91 < arg3.length - 1 && var92 >= 0 && var92 < arg2[0].length - 1 && var92 < arg3[0].length - 1) {
                    int var93 = (128 - var89) * arg2[var91][var92] + arg2[var91 + 1][var92] * var89 >> 7;
                    int var94 = (128 - var89) * arg2[var91][var92 + 1] + arg2[var91 + 1][var92 + 1] * var89 >> 7;
                    int var95 = (128 - var90) * var93 + var90 * var94 >> 7;
                    int var96 = (128 - var89) * arg3[var91][var92] + arg3[var91 + 1][var92] * var89 >> 7;
                    int var97 = (128 - var89) * arg3[var91][var92 + 1] + arg3[var91 + 1][var92 + 1] * var89 >> 7;
                    int var98 = (128 - var90) * var96 + var90 * var97 >> 7;
                    int var99 = var95 - var98;
                    var18.field3706[var86] = ((this.field3706[var86] << 8) / var84 * var99 >> 8) - (arg5 - var95);
                }
            }
        }
        if (arg8) {
            var18.method1577();
        } else {
            this.field3725 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "()I")
    public final int method102() {
        if (!this.field3725) {
            this.method1583();
        }
        return this.field3719;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)Lji;")
    public final class43 method320(int arg0, int arg1, int arg2) {
        return this.method1560(this.field3715, this.field3735, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "()V")
    public final void method1562() {
        this.field3746 = null;
        this.field3755 = null;
        this.field3740 = null;
        this.field3754 = null;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(III)I")
    public final int method1563(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3717; var4++) {
            if (this.field3726[var4] == arg0 && this.field3706[var4] == arg1 && this.field3738[var4] == arg2) {
                return var4;
            }
        }
        this.field3726[this.field3717] = arg0;
        this.field3706[this.field3717] = arg1;
        this.field3738[this.field3717] = arg2;
        this.field3750 = ++this.field3717;
        return this.field3717 - 1;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public final void method1564(int arg0) {
        int var2 = field3753[arg0];
        int var3 = field3743[arg0];
        for (int var4 = 0; var4 < this.field3717; var4++) {
            int var5 = this.field3738[var4] * var2 + this.field3726[var4] * var3 >> 16;
            this.field3738[var4] = this.field3738[var4] * var3 - this.field3726[var4] * var2 >> 16;
            this.field3726[var4] = var5;
        }
        this.method1577();
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(SS)V")
    public final void method1565(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3752; var3++) {
            if (this.field3714[var3] == arg0) {
                this.field3714[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V")
    private final void method1566(int arg0) {
        int var2 = field3753[arg0];
        int var3 = field3743[arg0];
        for (int var4 = 0; var4 < this.field3717; var4++) {
            int var5 = this.field3706[var4] * var3 - this.field3738[var4] * var2 >> 16;
            this.field3738[var4] = this.field3738[var4] * var3 + this.field3706[var4] * var2 >> 16;
            this.field3706[var4] = var5;
        }
        this.method1577();
    }

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "()Lui;")
    public final class234 method1567() {
        class234 var1 = new class234();
        if (this.field3728 != null) {
            var1.field3728 = new byte[this.field3752];
            for (int var2 = 0; var2 < this.field3752; var2++) {
                var1.field3728[var2] = this.field3728[var2];
            }
        }
        var1.field3717 = this.field3717;
        var1.field3750 = this.field3750;
        var1.field3752 = this.field3752;
        var1.field3709 = this.field3709;
        var1.field3726 = this.field3726;
        var1.field3706 = this.field3706;
        var1.field3738 = this.field3738;
        var1.field3713 = this.field3713;
        var1.field3711 = this.field3711;
        var1.field3732 = this.field3732;
        var1.field3712 = this.field3712;
        var1.field3734 = this.field3734;
        var1.field3730 = this.field3730;
        var1.field3714 = this.field3714;
        var1.field3718 = this.field3718;
        var1.field3756 = this.field3756;
        var1.field3722 = this.field3722;
        var1.field3733 = this.field3733;
        var1.field3745 = this.field3745;
        var1.field3707 = this.field3707;
        var1.field3751 = this.field3751;
        var1.field3749 = this.field3749;
        var1.field3741 = this.field3741;
        var1.field3739 = this.field3739;
        var1.field3742 = this.field3742;
        var1.field3757 = this.field3757;
        var1.field3747 = this.field3747;
        var1.field3737 = this.field3737;
        var1.field3746 = this.field3746;
        var1.field3755 = this.field3755;
        var1.field3740 = this.field3740;
        var1.field3754 = this.field3754;
        var1.field3720 = this.field3720;
        var1.field3744 = this.field3744;
        var1.field3715 = this.field3715;
        var1.field3735 = this.field3735;
        return var1;
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
    private final void method1568(int arg0) {
        int var2 = field3753[arg0];
        int var3 = field3743[arg0];
        for (int var4 = 0; var4 < this.field3717; var4++) {
            int var5 = this.field3726[var4] * var3 + this.field3706[var4] * var2 >> 16;
            this.field3706[var4] = this.field3706[var4] * var3 - this.field3726[var4] * var2 >> 16;
            this.field3726[var4] = var5;
        }
        this.method1577();
    }

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "()V")
    public static void method1569() {
        field3710 = null;
        field3724 = null;
        field3753 = null;
        field3743 = null;
    }

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "()V")
    public final void method1570() {
        for (int var1 = 0; var1 < this.field3717; var1++) {
            this.field3726[var1] = -this.field3726[var1];
            this.field3738[var1] = -this.field3738[var1];
        }
        this.method1577();
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(SS)V")
    public final void method1571(short arg0, short arg1) {
        if (this.field3718 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field3752; var3++) {
            if (this.field3718[var3] == arg0) {
                this.field3718[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIBSB)I")
    public final int method1572(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field3713[this.field3752] = arg0;
        this.field3711[this.field3752] = arg1;
        this.field3732[this.field3752] = arg2;
        this.field3728[this.field3752] = arg3;
        this.field3730[this.field3752] = -1;
        this.field3714[this.field3752] = arg4;
        this.field3718[this.field3752] = -1;
        this.field3734[this.field3752] = arg5;
        return this.field3752++;
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(III)V")
    public final void method1573(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field3753[arg2];
            int var5 = field3743[arg2];
            for (int var6 = 0; var6 < this.field3717; var6++) {
                int var7 = this.field3726[var6] * var5 + this.field3706[var6] * var4 >> 16;
                this.field3706[var6] = this.field3706[var6] * var5 - this.field3726[var6] * var4 >> 16;
                this.field3726[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field3753[arg0];
            int var9 = field3743[arg0];
            for (int var10 = 0; var10 < this.field3717; var10++) {
                int var11 = this.field3706[var10] * var9 - this.field3738[var10] * var8 >> 16;
                this.field3738[var10] = this.field3738[var10] * var9 + this.field3706[var10] * var8 >> 16;
                this.field3706[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field3753[arg1];
        int var13 = field3743[arg1];
        for (int var14 = 0; var14 < this.field3717; var14++) {
            int var15 = this.field3738[var14] * var12 + this.field3726[var14] * var13 >> 16;
            this.field3738[var14] = this.field3738[var14] * var13 - this.field3726[var14] * var12 >> 16;
            this.field3726[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "([B)V")
    private final void method1574(byte[] arg0) {
        class88 var2 = new class88(arg0);
        class88 var3 = new class88(arg0);
        class88 var4 = new class88(arg0);
        class88 var5 = new class88(arg0);
        class88 var6 = new class88(arg0);
        class88 var7 = new class88(arg0);
        class88 var8 = new class88(arg0);
        var2.field1535 = arg0.length - 23;
        int var9 = var2.method645(11596);
        int var10 = var2.method645(11596);
        int var11 = var2.method633(108);
        int var12 = var2.method633(58);
        boolean var13 = (var12 & 0x1) == 1;
        boolean var14 = (var12 & 0x2) == 2;
        int var15 = var2.method633(52);
        int var16 = var2.method633(125);
        int var17 = var2.method633(116);
        int var18 = var2.method633(115);
        int var19 = var2.method633(56);
        int var20 = var2.method645(11596);
        int var21 = var2.method645(11596);
        int var22 = var2.method645(11596);
        int var23 = var2.method645(11596);
        int var24 = var2.method645(11596);
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field3722 = new byte[var11];
            var2.field1535 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field3722[var28] = var2.method656(-252);
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
        this.field3717 = var9;
        this.field3752 = var10;
        this.field3709 = var11;
        this.field3726 = new int[var9];
        this.field3706 = new int[var9];
        this.field3738 = new int[var9];
        this.field3713 = new int[var10];
        this.field3711 = new int[var10];
        this.field3732 = new int[var10];
        if (var19 == 1) {
            this.field3746 = new int[var9];
        }
        if (var13) {
            this.field3728 = new byte[var10];
        }
        if (var15 == 255) {
            this.field3712 = new byte[var10];
        } else {
            this.field3756 = (byte) var15;
        }
        if (var16 == 1) {
            this.field3734 = new byte[var10];
        }
        if (var17 == 1) {
            this.field3755 = new int[var10];
        }
        if (var18 == 1) {
            this.field3718 = new short[var10];
        }
        if (var18 == 1 && var11 > 0) {
            this.field3730 = new byte[var10];
        }
        this.field3714 = new short[var10];
        if (var11 > 0) {
            this.field3733 = new short[var11];
            this.field3745 = new short[var11];
            this.field3707 = new short[var11];
            if (var26 > 0) {
                this.field3751 = new short[var26];
                this.field3749 = new short[var26];
                this.field3741 = new short[var26];
                this.field3739 = new byte[var26];
                this.field3742 = new byte[var26];
                this.field3757 = new byte[var26];
            }
            if (var27 > 0) {
                this.field3747 = new byte[var27];
                this.field3737 = new byte[var27];
            }
        }
        var2.field1535 = var11;
        var3.field1535 = var46;
        var4.field1535 = var48;
        var5.field1535 = var50;
        var6.field1535 = var38;
        int var66 = 0;
        int var67 = 0;
        int var68 = 0;
        for (int var69 = 0; var69 < var9; var69++) {
            int var84 = var2.method633(100);
            int var85 = 0;
            if ((var84 & 0x1) != 0) {
                var85 = var3.method667(1210551352);
            }
            int var86 = 0;
            if ((var84 & 0x2) != 0) {
                var86 = var4.method667(1210551352);
            }
            int var87 = 0;
            if ((var84 & 0x4) != 0) {
                var87 = var5.method667(1210551352);
            }
            this.field3726[var69] = var66 + var85;
            this.field3706[var69] = var67 + var86;
            this.field3738[var69] = var68 + var87;
            var66 = this.field3726[var69];
            var67 = this.field3706[var69];
            var68 = this.field3738[var69];
            if (var19 == 1) {
                this.field3746[var69] = var6.method633(58);
            }
        }
        var2.field1535 = var44;
        var3.field1535 = var33;
        var4.field1535 = var36;
        var5.field1535 = var39;
        var6.field1535 = var37;
        var7.field1535 = var42;
        var8.field1535 = var41;
        for (int var70 = 0; var70 < var10; var70++) {
            this.field3714[var70] = (short) var2.method645(11596);
            if (var13) {
                this.field3728[var70] = var3.method656(-252);
            }
            if (var15 == 255) {
                this.field3712[var70] = var4.method656(-252);
            }
            if (var16 == 1) {
                this.field3734[var70] = var5.method656(-252);
            }
            if (var17 == 1) {
                this.field3755[var70] = var6.method633(86);
            }
            if (var18 == 1) {
                this.field3718[var70] = (short) (var7.method645(11596) - 1);
            }
            if (this.field3730 != null) {
                if (this.field3718[var70] == -1) {
                    this.field3730[var70] = -1;
                } else {
                    this.field3730[var70] = (byte) (var8.method633(77) - 1);
                }
            }
        }
        this.field3750 = -1;
        var2.field1535 = var35;
        var3.field1535 = var32;
        int var71 = 0;
        int var72 = 0;
        int var73 = 0;
        int var74 = 0;
        for (int var75 = 0; var75 < var10; var75++) {
            int var80 = var3.method633(72);
            if (var80 == 1) {
                var71 = var2.method667(1210551352) + var74;
                var72 = var2.method667(1210551352) + var71;
                var73 = var2.method667(1210551352) + var72;
                var74 = var73;
                this.field3713[var75] = var71;
                this.field3711[var75] = var72;
                this.field3732[var75] = var73;
                if (var71 > this.field3750) {
                    this.field3750 = var71;
                }
                if (var72 > this.field3750) {
                    this.field3750 = var72;
                }
                if (var73 > this.field3750) {
                    this.field3750 = var73;
                }
            }
            if (var80 == 2) {
                var72 = var73;
                var73 = var2.method667(1210551352) + var74;
                var74 = var73;
                this.field3713[var75] = var71;
                this.field3711[var75] = var72;
                this.field3732[var75] = var73;
                if (var73 > this.field3750) {
                    this.field3750 = var73;
                }
            }
            if (var80 == 3) {
                var71 = var73;
                var73 = var2.method667(1210551352) + var74;
                var74 = var73;
                this.field3713[var75] = var71;
                this.field3711[var75] = var72;
                this.field3732[var75] = var73;
                if (var73 > this.field3750) {
                    this.field3750 = var73;
                }
            }
            if (var80 == 4) {
                int var83 = var71;
                var71 = var72;
                var72 = var83;
                var73 = var2.method667(1210551352) + var74;
                var74 = var73;
                this.field3713[var75] = var71;
                this.field3711[var75] = var83;
                this.field3732[var75] = var73;
                if (var73 > this.field3750) {
                    this.field3750 = var73;
                }
            }
        }
        this.field3750++;
        var2.field1535 = var52;
        var3.field1535 = var54;
        var4.field1535 = var56;
        var5.field1535 = var58;
        var6.field1535 = var60;
        var7.field1535 = var62;
        for (int var76 = 0; var76 < var11; var76++) {
            int var79 = this.field3722[var76] & 0xFF;
            if (var79 == 0) {
                this.field3733[var76] = (short) var2.method645(11596);
                this.field3745[var76] = (short) var2.method645(11596);
                this.field3707[var76] = (short) var2.method645(11596);
            }
            if (var79 == 1) {
                this.field3733[var76] = (short) var3.method645(11596);
                this.field3745[var76] = (short) var3.method645(11596);
                this.field3707[var76] = (short) var3.method645(11596);
                this.field3751[var76] = (short) var4.method645(11596);
                this.field3749[var76] = (short) var4.method645(11596);
                this.field3741[var76] = (short) var4.method645(11596);
                this.field3739[var76] = var5.method656(-252);
                this.field3742[var76] = var6.method656(-252);
                this.field3757[var76] = var7.method656(-252);
            }
            if (var79 == 2) {
                this.field3733[var76] = (short) var3.method645(11596);
                this.field3745[var76] = (short) var3.method645(11596);
                this.field3707[var76] = (short) var3.method645(11596);
                this.field3751[var76] = (short) var4.method645(11596);
                this.field3749[var76] = (short) var4.method645(11596);
                this.field3741[var76] = (short) var4.method645(11596);
                this.field3739[var76] = var5.method656(-252);
                this.field3742[var76] = var6.method656(-252);
                this.field3757[var76] = var7.method656(-252);
                this.field3747[var76] = var7.method656(-252);
                this.field3737[var76] = var7.method656(-252);
            }
            if (var79 == 3) {
                this.field3733[var76] = (short) var3.method645(11596);
                this.field3745[var76] = (short) var3.method645(11596);
                this.field3707[var76] = (short) var3.method645(11596);
                this.field3751[var76] = (short) var4.method645(11596);
                this.field3749[var76] = (short) var4.method645(11596);
                this.field3741[var76] = (short) var4.method645(11596);
                this.field3739[var76] = var5.method656(-252);
                this.field3742[var76] = var6.method656(-252);
                this.field3757[var76] = var7.method656(-252);
            }
        }
        if (!var14) {
            return;
        }
        var2.field1535 = var64;
        int var77 = var2.method633(109);
        if (var77 > 0) {
            var2.field1535 += var77 * 4;
        }
        int var78 = var2.method633(90);
        if (var78 > 0) {
            var2.field1535 += var78 * 4;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lhc;II)Lui;")
    public static final class234 method1575(class235 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1590(arg2, (byte) -25, arg1);
        return var3 == null ? null : new class234(var3);
    }

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "()V")
    public final void method1576() {
        if (this.field3720 != null) {
            return;
        }
        this.field3720 = new class257[this.field3750];
        for (int var1 = 0; var1 < this.field3750; var1++) {
            this.field3720[var1] = new class257();
        }
        for (int var2 = 0; var2 < this.field3752; var2++) {
            int var3 = this.field3713[var2];
            int var4 = this.field3711[var2];
            int var5 = this.field3732[var2];
            int var6 = this.field3726[var4] - this.field3726[var3];
            int var7 = this.field3706[var4] - this.field3706[var3];
            int var8 = this.field3738[var4] - this.field3738[var3];
            int var9 = this.field3726[var5] - this.field3726[var3];
            int var10 = this.field3706[var5] - this.field3706[var3];
            int var11 = this.field3738[var5] - this.field3738[var3];
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
            if (this.field3728 == null) {
                var19 = 0;
            } else {
                var19 = this.field3728[var2];
            }
            if (var19 == 0) {
                class257 var20 = this.field3720[var3];
                var20.field4107 += var16;
                var20.field4113 += var17;
                var20.field4110 += var18;
                var20.field4111++;
                class257 var21 = this.field3720[var4];
                var21.field4107 += var16;
                var21.field4113 += var17;
                var21.field4110 += var18;
                var21.field4111++;
                class257 var22 = this.field3720[var5];
                var22.field4107 += var16;
                var22.field4113 += var17;
                var22.field4110 += var18;
                var22.field4111++;
            } else if (var19 == 1) {
                if (this.field3744 == null) {
                    this.field3744 = new class94[this.field3752];
                }
                class94 var23 = this.field3744[var2] = new class94();
                var23.field1603 = var16;
                var23.field1606 = var17;
                var23.field1599 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "()V")
    private final void method1577() {
        this.field3720 = null;
        this.field3729 = null;
        this.field3744 = null;
        this.field3725 = false;
    }

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "()V")
    public final void method1578() {
        for (int var1 = 0; var1 < this.field3717; var1++) {
            this.field3738[var1] = -this.field3738[var1];
        }
        for (int var2 = 0; var2 < this.field3752; var2++) {
            int var3 = this.field3713[var2];
            this.field3713[var2] = this.field3732[var2];
            this.field3732[var2] = var3;
        }
        this.method1577();
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lji;IIIZ)V")
    public final void method319(class43 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class234 var6 = (class234) arg0;
        var6.method1583();
        var6.method1576();
        field3716++;
        int var7 = 0;
        int[] var8 = var6.field3726;
        int var9 = var6.field3750;
        for (int var10 = 0; var10 < this.field3750; var10++) {
            class257 var13 = this.field3720[var10];
            if (var13.field4111 != 0) {
                int var14 = this.field3706[var10] - arg2;
                if (var14 >= var6.field3719 && var14 <= var6.field3723) {
                    int var15 = this.field3726[var10] - arg1;
                    if (var15 >= var6.field3748 && var15 <= var6.field3731) {
                        int var16 = this.field3738[var10] - arg3;
                        if (var16 >= var6.field3736 && var16 <= var6.field3721) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class257 var18 = var6.field3720[var17];
                                if (var8[var17] == var15 && var6.field3738[var17] == var16 && var6.field3706[var17] == var14 && var18.field4111 != 0) {
                                    if (this.field3729 == null) {
                                        this.field3729 = new class257[this.field3750];
                                    }
                                    if (var6.field3729 == null) {
                                        var6.field3729 = new class257[var9];
                                    }
                                    class257 var19 = this.field3729[var10];
                                    if (var19 == null) {
                                        var19 = this.field3729[var10] = new class257(var13);
                                    }
                                    class257 var20 = var6.field3729[var17];
                                    if (var20 == null) {
                                        var20 = var6.field3729[var17] = new class257(var18);
                                    }
                                    var19.field4107 += var18.field4107;
                                    var19.field4113 += var18.field4113;
                                    var19.field4110 += var18.field4110;
                                    var19.field4111 += var18.field4111;
                                    var20.field4107 += var13.field4107;
                                    var20.field4113 += var13.field4113;
                                    var20.field4110 += var13.field4110;
                                    var20.field4111 += var13.field4111;
                                    var7++;
                                    field3710[var10] = field3716;
                                    field3724[var17] = field3716;
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
        for (int var11 = 0; var11 < this.field3752; var11++) {
            if (field3710[this.field3713[var11]] == field3716 && field3710[this.field3711[var11]] == field3716 && field3710[this.field3732[var11]] == field3716) {
                if (this.field3728 == null) {
                    this.field3728 = new byte[this.field3752];
                }
                this.field3728[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field3752; var12++) {
            if (field3724[var6.field3713[var12]] == field3716 && field3724[var6.field3711[var12]] == field3716 && field3724[var6.field3732[var12]] == field3716) {
                if (var6.field3728 == null) {
                    var6.field3728 = new byte[var6.field3752];
                }
                var6.field3728[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIII)V")
    public final void method82(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "([[IIIIII)V")
    private final void method1579(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1584(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1584(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1584(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1584(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method1566(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method1568(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method1586(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(III)V")
    public final void method1580(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3717; var4++) {
            this.field3726[var4] = this.field3726[var4] * arg0 / 128;
            this.field3706[var4] = this.field3706[var4] * arg1 / 128;
            this.field3738[var4] = this.field3738[var4] * arg2 / 128;
        }
        this.method1577();
    }

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "()V")
    public final void method1581() {
        int var10002;
        if (this.field3746 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3717; var3++) {
                int var7 = this.field3746[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field3740 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field3740[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field3717) {
                int var6 = this.field3746[var5];
                this.field3740[var6][var1[var6]++] = var5++;
            }
            this.field3746 = null;
        }
        if (this.field3755 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3752; var10++) {
            int var14 = this.field3755[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field3754 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field3754[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field3752) {
            int var13 = this.field3755[var12];
            this.field3754[var13][var8[var13]++] = var12++;
        }
        this.field3755 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lui;IS)I")
    private final int method1582(class234 arg0, int arg1, short arg2) {
        int var4 = arg0.field3726[arg1];
        int var5 = arg0.field3706[arg1];
        int var6 = arg0.field3738[arg1];
        for (int var7 = 0; var7 < this.field3717; var7++) {
            if (this.field3726[var7] == var4 && this.field3706[var7] == var5 && this.field3738[var7] == var6) {
                this.field3727[var7] |= arg2;
                return var7;
            }
        }
        this.field3726[this.field3717] = var4;
        this.field3706[this.field3717] = var5;
        this.field3738[this.field3717] = var6;
        this.field3727[this.field3717] = arg2;
        if (arg0.field3746 != null) {
            this.field3746[this.field3717] = arg0.field3746[arg1];
        }
        return this.field3717++;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "()Z")
    public final boolean method315() {
        return true;
    }

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "()V")
    private final void method1583() {
        if (this.field3725) {
            return;
        }
        this.field3725 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field3750; var7++) {
            int var8 = this.field3726[var7];
            int var9 = this.field3706[var7];
            int var10 = this.field3738[var7];
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
        this.field3748 = (short) var1;
        this.field3731 = (short) var4;
        this.field3719 = (short) var2;
        this.field3723 = (short) var5;
        this.field3736 = (short) var3;
        this.field3721 = (short) var6;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIIIIJILri;)V")
    public final void method100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class67 arg10) {
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "([[III)I")
    private static final int method1584(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(IIIII)Lkb;")
    public final class54 method1585(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class54(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "(III)V")
    public final void method1586(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3717; var4++) {
            this.field3726[var4] += arg0;
            this.field3706[var4] += arg1;
            this.field3738[var4] += arg2;
        }
        this.method1577();
    }

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "()V")
    public final void method1587() {
        for (int var1 = 0; var1 < this.field3717; var1++) {
            int var2 = this.field3726[var1];
            this.field3726[var1] = this.field3738[var1];
            this.field3738[var1] = -var2;
        }
        this.method1577();
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
    private class234() {
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "([B)V")
    private class234(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1574(arg0);
        } else {
            this.method1559(arg0);
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(III)V")
    public class234(int arg0, int arg1, int arg2) {
        this.field3726 = new int[arg0];
        this.field3706 = new int[arg0];
        this.field3738 = new int[arg0];
        this.field3746 = new int[arg0];
        this.field3713 = new int[arg1];
        this.field3711 = new int[arg1];
        this.field3732 = new int[arg1];
        this.field3728 = new byte[arg1];
        this.field3712 = new byte[arg1];
        this.field3734 = new byte[arg1];
        this.field3714 = new short[arg1];
        this.field3718 = new short[arg1];
        this.field3730 = new byte[arg1];
        this.field3755 = new int[arg1];
        if (arg2 > 0) {
            this.field3722 = new byte[arg2];
            this.field3733 = new short[arg2];
            this.field3745 = new short[arg2];
            this.field3707 = new short[arg2];
            this.field3751 = new short[arg2];
            this.field3749 = new short[arg2];
            this.field3741 = new short[arg2];
            this.field3739 = new byte[arg2];
            this.field3742 = new byte[arg2];
            this.field3757 = new byte[arg2];
            this.field3747 = new byte[arg2];
            this.field3737 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "([Lui;I)V")
    public class234(class234[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field3717 = 0;
        this.field3752 = 0;
        this.field3709 = 0;
        boolean var9 = false;
        boolean var10 = false;
        this.field3756 = -1;
        for (int var11 = 0; var11 < arg1; var11++) {
            class234 var25 = arg0[var11];
            if (var25 != null) {
                this.field3717 += var25.field3717;
                this.field3752 += var25.field3752;
                this.field3709 += var25.field3709;
                if (var25.field3712 == null) {
                    if (this.field3756 == -1) {
                        this.field3756 = var25.field3756;
                    }
                    if (this.field3756 != var25.field3756) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var25.field3728 != null;
                var5 |= var25.field3734 != null;
                var6 |= var25.field3755 != null;
                var7 |= var25.field3718 != null;
                var8 |= var25.field3730 != null;
            }
        }
        this.field3726 = new int[this.field3717];
        this.field3706 = new int[this.field3717];
        this.field3738 = new int[this.field3717];
        this.field3746 = new int[this.field3717];
        this.field3727 = new short[this.field3717];
        this.field3713 = new int[this.field3752];
        this.field3711 = new int[this.field3752];
        this.field3732 = new int[this.field3752];
        if (var3) {
            this.field3728 = new byte[this.field3752];
        }
        if (var4) {
            this.field3712 = new byte[this.field3752];
        }
        if (var5) {
            this.field3734 = new byte[this.field3752];
        }
        if (var6) {
            this.field3755 = new int[this.field3752];
        }
        if (var7) {
            this.field3718 = new short[this.field3752];
        }
        if (var8) {
            this.field3730 = new byte[this.field3752];
        }
        this.field3714 = new short[this.field3752];
        this.field3708 = new short[this.field3752];
        if (this.field3709 > 0) {
            this.field3722 = new byte[this.field3709];
            this.field3733 = new short[this.field3709];
            this.field3745 = new short[this.field3709];
            this.field3707 = new short[this.field3709];
            this.field3751 = new short[this.field3709];
            this.field3749 = new short[this.field3709];
            this.field3741 = new short[this.field3709];
            this.field3739 = new byte[this.field3709];
            this.field3742 = new byte[this.field3709];
            this.field3757 = new byte[this.field3709];
            this.field3747 = new byte[this.field3709];
            this.field3737 = new byte[this.field3709];
        }
        this.field3717 = 0;
        this.field3752 = 0;
        this.field3709 = 0;
        boolean var12 = false;
        boolean var13 = false;
        for (int var14 = 0; var14 < arg1; var14++) {
            short var22 = (short) (0x1 << var14);
            class234 var23 = arg0[var14];
            if (var23 != null) {
                for (int var24 = 0; var24 < var23.field3752; var24++) {
                    if (var3 && var23.field3728 != null) {
                        this.field3728[this.field3752] = var23.field3728[var24];
                    }
                    if (var4) {
                        if (var23.field3712 == null) {
                            this.field3712[this.field3752] = var23.field3756;
                        } else {
                            this.field3712[this.field3752] = var23.field3712[var24];
                        }
                    }
                    if (var5 && var23.field3734 != null) {
                        this.field3734[this.field3752] = var23.field3734[var24];
                    }
                    if (var6 && var23.field3755 != null) {
                        this.field3755[this.field3752] = var23.field3755[var24];
                    }
                    if (var7) {
                        if (var23.field3718 == null) {
                            this.field3718[this.field3752] = -1;
                        } else {
                            this.field3718[this.field3752] = var23.field3718[var24];
                        }
                    }
                    this.field3714[this.field3752] = var23.field3714[var24];
                    this.field3708[this.field3752] = var22;
                    this.field3713[this.field3752] = this.method1582(var23, var23.field3713[var24], var22);
                    this.field3711[this.field3752] = this.method1582(var23, var23.field3711[var24], var22);
                    this.field3732[this.field3752] = this.method1582(var23, var23.field3732[var24], var22);
                    this.field3752++;
                }
            }
        }
        int var15 = 0;
        this.field3750 = this.field3717;
        for (int var16 = 0; var16 < arg1; var16++) {
            class234 var17 = arg0[var16];
            short var18 = (short) (0x1 << var16);
            if (var17 != null) {
                for (int var19 = 0; var19 < var17.field3752; var19++) {
                    if (var8) {
                        this.field3730[var15++] = (byte) (var17.field3730 == null || var17.field3730[var19] == -1 ? -1 : var17.field3730[var19] + this.field3709);
                    }
                }
                for (int var20 = 0; var20 < var17.field3709; var20++) {
                    byte var21 = this.field3722[this.field3709] = var17.field3722[var20];
                    if (var21 == 0) {
                        this.field3733[this.field3709] = (short) this.method1582(var17, var17.field3733[var20], var18);
                        this.field3745[this.field3709] = (short) this.method1582(var17, var17.field3745[var20], var18);
                        this.field3707[this.field3709] = (short) this.method1582(var17, var17.field3707[var20], var18);
                    }
                    if (var21 >= 1 && var21 <= 3) {
                        this.field3733[this.field3709] = var17.field3733[var20];
                        this.field3745[this.field3709] = var17.field3745[var20];
                        this.field3707[this.field3709] = var17.field3707[var20];
                        this.field3751[this.field3709] = var17.field3751[var20];
                        this.field3749[this.field3709] = var17.field3749[var20];
                        this.field3741[this.field3709] = var17.field3741[var20];
                        this.field3739[this.field3709] = var17.field3739[var20];
                        this.field3742[this.field3709] = var17.field3742[var20];
                        this.field3757[this.field3709] = var17.field3757[var20];
                    }
                    if (var21 == 2) {
                        this.field3747[this.field3709] = var17.field3747[var20];
                        this.field3737[this.field3709] = var17.field3737[var20];
                    }
                    this.field3709++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lui;ZZZZ)V")
    public class234(class234 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field3717 = arg0.field3717;
        this.field3750 = arg0.field3750;
        this.field3752 = arg0.field3752;
        this.field3709 = arg0.field3709;
        if (arg1) {
            this.field3726 = arg0.field3726;
            this.field3706 = arg0.field3706;
            this.field3738 = arg0.field3738;
        } else {
            this.field3726 = new int[this.field3717];
            this.field3706 = new int[this.field3717];
            this.field3738 = new int[this.field3717];
            for (int var6 = 0; var6 < this.field3717; var6++) {
                this.field3726[var6] = arg0.field3726[var6];
                this.field3706[var6] = arg0.field3706[var6];
                this.field3738[var6] = arg0.field3738[var6];
            }
        }
        if (arg2) {
            this.field3714 = arg0.field3714;
        } else {
            this.field3714 = new short[this.field3752];
            for (int var7 = 0; var7 < this.field3752; var7++) {
                this.field3714[var7] = arg0.field3714[var7];
            }
        }
        if (arg3 || arg0.field3718 == null) {
            this.field3718 = arg0.field3718;
        } else {
            this.field3718 = new short[this.field3752];
            for (int var8 = 0; var8 < this.field3752; var8++) {
                this.field3718[var8] = arg0.field3718[var8];
            }
        }
        if (arg4) {
            this.field3734 = arg0.field3734;
        } else {
            this.field3734 = new byte[this.field3752];
            if (arg0.field3734 == null) {
                for (int var9 = 0; var9 < this.field3752; var9++) {
                    this.field3734[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field3752; var10++) {
                    this.field3734[var10] = arg0.field3734[var10];
                }
            }
        }
        this.field3713 = arg0.field3713;
        this.field3711 = arg0.field3711;
        this.field3732 = arg0.field3732;
        this.field3728 = arg0.field3728;
        this.field3712 = arg0.field3712;
        this.field3730 = arg0.field3730;
        this.field3756 = arg0.field3756;
        this.field3722 = arg0.field3722;
        this.field3733 = arg0.field3733;
        this.field3745 = arg0.field3745;
        this.field3707 = arg0.field3707;
        this.field3751 = arg0.field3751;
        this.field3749 = arg0.field3749;
        this.field3741 = arg0.field3741;
        this.field3739 = arg0.field3739;
        this.field3742 = arg0.field3742;
        this.field3757 = arg0.field3757;
        this.field3747 = arg0.field3747;
        this.field3737 = arg0.field3737;
        this.field3746 = arg0.field3746;
        this.field3755 = arg0.field3755;
        this.field3740 = arg0.field3740;
        this.field3754 = arg0.field3754;
        this.field3720 = arg0.field3720;
        this.field3744 = arg0.field3744;
        this.field3729 = arg0.field3729;
        this.field3715 = arg0.field3715;
        this.field3735 = arg0.field3735;
    }
}
