import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class208 extends class258 {

    @OriginalMember(owner = "client!fk", name = "M", descriptor = "I")
    public int field3726 = 0;

    @OriginalMember(owner = "client!fk", name = "X", descriptor = "B")
    public byte field3737 = 0;

    @OriginalMember(owner = "client!fk", name = "cb", descriptor = "Z")
    private boolean field3742 = false;

    @OriginalMember(owner = "client!fk", name = "D", descriptor = "I")
    public int field3717 = 0;

    @OriginalMember(owner = "client!fk", name = "E", descriptor = "[I")
    public int[] field3718;

    @OriginalMember(owner = "client!fk", name = "eb", descriptor = "[I")
    public int[] field3744;

    @OriginalMember(owner = "client!fk", name = "N", descriptor = "[I")
    public int[] field3727;

    @OriginalMember(owner = "client!fk", name = "Q", descriptor = "[I")
    private int[] field3730;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "[I")
    public int[] field3707;

    @OriginalMember(owner = "client!fk", name = "V", descriptor = "[I")
    public int[] field3735;

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "[I")
    public int[] field3714;

    @OriginalMember(owner = "client!fk", name = "ib", descriptor = "[B")
    public byte[] field3748;

    @OriginalMember(owner = "client!fk", name = "J", descriptor = "[B")
    public byte[] field3723;

    @OriginalMember(owner = "client!fk", name = "mb", descriptor = "[B")
    public byte[] field3752;

    @OriginalMember(owner = "client!fk", name = "lb", descriptor = "[S")
    public short[] field3751;

    @OriginalMember(owner = "client!fk", name = "U", descriptor = "[S")
    public short[] field3734;

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "[B")
    public byte[] field3713;

    @OriginalMember(owner = "client!fk", name = "R", descriptor = "[I")
    private int[] field3731;

    @OriginalMember(owner = "client!fk", name = "Y", descriptor = "[B")
    public byte[] field3738;

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "[S")
    public short[] field3711;

    @OriginalMember(owner = "client!fk", name = "jb", descriptor = "[S")
    public short[] field3749;

    @OriginalMember(owner = "client!fk", name = "O", descriptor = "[S")
    public short[] field3728;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "[S")
    private short[] field3708;

    @OriginalMember(owner = "client!fk", name = "Z", descriptor = "[S")
    private short[] field3739;

    @OriginalMember(owner = "client!fk", name = "hb", descriptor = "[S")
    private short[] field3747;

    @OriginalMember(owner = "client!fk", name = "T", descriptor = "[B")
    private byte[] field3733;

    @OriginalMember(owner = "client!fk", name = "H", descriptor = "[B")
    private byte[] field3721;

    @OriginalMember(owner = "client!fk", name = "ob", descriptor = "[B")
    private byte[] field3754;

    @OriginalMember(owner = "client!fk", name = "C", descriptor = "[B")
    private byte[] field3716;

    @OriginalMember(owner = "client!fk", name = "L", descriptor = "[B")
    private byte[] field3725;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "I")
    public int field3710;

    @OriginalMember(owner = "client!fk", name = "K", descriptor = "[[I")
    public int[][] field3724;

    @OriginalMember(owner = "client!fk", name = "F", descriptor = "[[I")
    public int[][] field3719;

    @OriginalMember(owner = "client!fk", name = "db", descriptor = "[Lr;")
    public class150[] field3743;

    @OriginalMember(owner = "client!fk", name = "ab", descriptor = "[Lsb;")
    public class211[] field3740;

    @OriginalMember(owner = "client!fk", name = "I", descriptor = "[Lr;")
    public class150[] field3722;

    @OriginalMember(owner = "client!fk", name = "kb", descriptor = "S")
    public short field3750;

    @OriginalMember(owner = "client!fk", name = "pb", descriptor = "S")
    public short field3755;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "[I")
    private static int[] field3709 = class15.field172;

    @OriginalMember(owner = "client!fk", name = "G", descriptor = "[I")
    private static int[] field3720 = new int[10000];

    @OriginalMember(owner = "client!fk", name = "S", descriptor = "[I")
    private static int[] field3732 = class15.field170;

    @OriginalMember(owner = "client!fk", name = "x", descriptor = "[I")
    private static int[] field3712 = new int[10000];

    @OriginalMember(owner = "client!fk", name = "fb", descriptor = "I")
    private static int field3745 = 0;

    @OriginalMember(owner = "client!fk", name = "A", descriptor = "S")
    private short field3715;

    @OriginalMember(owner = "client!fk", name = "P", descriptor = "S")
    private short field3729;

    @OriginalMember(owner = "client!fk", name = "W", descriptor = "S")
    private short field3736;

    @OriginalMember(owner = "client!fk", name = "bb", descriptor = "S")
    private short field3741;

    @OriginalMember(owner = "client!fk", name = "gb", descriptor = "S")
    private short field3746;

    @OriginalMember(owner = "client!fk", name = "nb", descriptor = "S")
    private short field3753;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(SS)V")
    public final void method1413(short arg0, short arg1) {
        if (this.field3734 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field3726; var3++) {
            if (this.field3734[var3] == arg0) {
                this.field3734[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(SS)V")
    public final void method1414(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3726; var3++) {
            if (this.field3751[var3] == arg0) {
                this.field3751[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "()V")
    public final void method1415() {
        this.field3730 = null;
        this.field3731 = null;
        this.field3724 = null;
        this.field3719 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "([B)V")
    private final void method1416(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class56 var4 = new class56(arg0);
        class56 var5 = new class56(arg0);
        class56 var6 = new class56(arg0);
        class56 var7 = new class56(arg0);
        class56 var8 = new class56(arg0);
        var4.field699 = arg0.length - 18;
        int var9 = var4.method318(true);
        int var10 = var4.method318(true);
        int var11 = var4.method367(1);
        int var12 = var4.method367(1);
        int var13 = var4.method367(1);
        int var14 = var4.method367(1);
        int var15 = var4.method367(1);
        int var16 = var4.method367(1);
        int var17 = var4.method318(true);
        int var18 = var4.method318(true);
        int var19 = var4.method318(true);
        int var20 = var4.method318(true);
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
        this.field3726 = var10;
        this.field3710 = var11;
        this.field3718 = new int[var9];
        this.field3744 = new int[var9];
        this.field3727 = new int[var9];
        this.field3707 = new int[var10];
        this.field3735 = new int[var10];
        this.field3714 = new int[var10];
        if (var11 > 0) {
            this.field3738 = new byte[var11];
            this.field3711 = new short[var11];
            this.field3749 = new short[var11];
            this.field3728 = new short[var11];
        }
        if (var16 == 1) {
            this.field3730 = new int[var9];
        }
        if (var12 == 1) {
            this.field3748 = new byte[var10];
            this.field3713 = new byte[var10];
            this.field3734 = new short[var10];
        }
        if (var13 == 255) {
            this.field3723 = new byte[var10];
        } else {
            this.field3737 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3752 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3731 = new int[var10];
        }
        this.field3751 = new short[var10];
        var4.field699 = var21;
        var5.field699 = var36;
        var6.field699 = var38;
        var7.field699 = var40;
        var8.field699 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method367(1);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method325(-6419);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method325(-6419);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method325(-6419);
            }
            this.field3718[var46] = var43 + var63;
            this.field3744[var46] = var44 + var64;
            this.field3727[var46] = var45 + var65;
            var43 = this.field3718[var46];
            var44 = this.field3744[var46];
            var45 = this.field3727[var46];
            if (var16 == 1) {
                this.field3730[var46] = var8.method367(1);
            }
        }
        var4.field699 = var32;
        var5.field699 = var28;
        var6.field699 = var26;
        var7.field699 = var30;
        var8.field699 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field3751[var47] = (short) var4.method318(true);
            if (var12 == 1) {
                int var61 = var5.method367(1);
                if ((var61 & 0x1) == 1) {
                    this.field3748[var47] = 1;
                    var2 = true;
                } else {
                    this.field3748[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field3713[var47] = (byte) (var61 >> 2);
                    this.field3734[var47] = this.field3751[var47];
                    this.field3751[var47] = 127;
                    if (this.field3734[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field3713[var47] = -1;
                    this.field3734[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field3723[var47] = var6.method350(16);
            }
            if (var14 == 1) {
                this.field3752[var47] = var7.method350(16);
            }
            if (var15 == 1) {
                this.field3731[var47] = var8.method367(1);
            }
        }
        var4.field699 = var25;
        var5.field699 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method367(1);
            if (var57 == 1) {
                var48 = var4.method325(-6419) + var51;
                var49 = var4.method325(-6419) + var48;
                var50 = var4.method325(-6419) + var49;
                var51 = var50;
                this.field3707[var52] = var48;
                this.field3735[var52] = var49;
                this.field3714[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method325(-6419) + var51;
                var51 = var50;
                this.field3707[var52] = var48;
                this.field3735[var52] = var49;
                this.field3714[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method325(-6419) + var51;
                var51 = var50;
                this.field3707[var52] = var48;
                this.field3735[var52] = var49;
                this.field3714[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method325(-6419) + var51;
                var51 = var50;
                this.field3707[var52] = var48;
                this.field3735[var52] = var60;
                this.field3714[var52] = var50;
            }
        }
        var4.field699 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field3738[var53] = 0;
            this.field3711[var53] = (short) var4.method318(true);
            this.field3749[var53] = (short) var4.method318(true);
            this.field3728[var53] = (short) var4.method318(true);
        }
        if (this.field3713 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field3713[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field3711[var56] & 0xFFFF) == this.field3707[var55] && (this.field3749[var56] & 0xFFFF) == this.field3735[var55] && (this.field3728[var56] & 0xFFFF) == this.field3714[var55]) {
                        this.field3713[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field3713 = null;
            }
        }
        if (!var3) {
            this.field3734 = null;
        }
        if (!var2) {
            this.field3748 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "()V")
    public final void method1417() {
        for (int var1 = 0; var1 < this.field3717; var1++) {
            this.field3727[var1] = -this.field3727[var1];
        }
        for (int var2 = 0; var2 < this.field3726; var2++) {
            int var3 = this.field3707[var2];
            this.field3707[var2] = this.field3714[var2];
            this.field3714[var2] = var3;
        }
        this.method1440();
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIBSB)I")
    public final int method1418(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field3707[this.field3726] = arg0;
        this.field3735[this.field3726] = arg1;
        this.field3714[this.field3726] = arg2;
        this.field3748[this.field3726] = arg3;
        this.field3713[this.field3726] = -1;
        this.field3751[this.field3726] = arg4;
        this.field3734[this.field3726] = -1;
        this.field3752[this.field3726] = arg5;
        return this.field3726++;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(III)Lpe;")
    public final class258 method1419(int arg0, int arg1, int arg2) {
        return this.method1432(this.field3750, this.field3755, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "([B)V")
    private final void method1420(byte[] arg0) {
        class56 var2 = new class56(arg0);
        class56 var3 = new class56(arg0);
        class56 var4 = new class56(arg0);
        class56 var5 = new class56(arg0);
        class56 var6 = new class56(arg0);
        class56 var7 = new class56(arg0);
        class56 var8 = new class56(arg0);
        var2.field699 = arg0.length - 23;
        int var9 = var2.method318(true);
        int var10 = var2.method318(true);
        int var11 = var2.method367(1);
        int var12 = var2.method367(1);
        int var13 = var2.method367(1);
        int var14 = var2.method367(1);
        int var15 = var2.method367(1);
        int var16 = var2.method367(1);
        int var17 = var2.method367(1);
        int var18 = var2.method318(true);
        int var19 = var2.method318(true);
        int var20 = var2.method318(true);
        int var21 = var2.method318(true);
        int var22 = var2.method318(true);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field3738 = new byte[var11];
            var2.field699 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field3738[var26] = var2.method350(16);
                if (var27 == 0) {
                    var23++;
                }
                if (var27 >= 1 && var27 <= 3) {
                    var24++;
                }
                if (var27 == 2) {
                    var25++;
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
        this.field3717 = var9;
        this.field3726 = var10;
        this.field3710 = var11;
        this.field3718 = new int[var9];
        this.field3744 = new int[var9];
        this.field3727 = new int[var9];
        this.field3707 = new int[var10];
        this.field3735 = new int[var10];
        this.field3714 = new int[var10];
        if (var17 == 1) {
            this.field3730 = new int[var9];
        }
        if (var12 == 1) {
            this.field3748 = new byte[var10];
        }
        if (var13 == 255) {
            this.field3723 = new byte[var10];
        } else {
            this.field3737 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3752 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3731 = new int[var10];
        }
        if (var16 == 1) {
            this.field3734 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field3713 = new byte[var10];
        }
        this.field3751 = new short[var10];
        if (var11 > 0) {
            this.field3711 = new short[var11];
            this.field3749 = new short[var11];
            this.field3728 = new short[var11];
            if (var24 > 0) {
                this.field3708 = new short[var24];
                this.field3739 = new short[var24];
                this.field3747 = new short[var24];
                this.field3733 = new byte[var24];
                this.field3721 = new byte[var24];
                this.field3754 = new byte[var24];
            }
            if (var25 > 0) {
                this.field3716 = new byte[var25];
                this.field3725 = new byte[var25];
            }
        }
        var2.field699 = var11;
        var3.field699 = var44;
        var4.field699 = var46;
        var5.field699 = var48;
        var6.field699 = var36;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        for (int var66 = 0; var66 < var9; var66++) {
            int var79 = var2.method367(1);
            int var80 = 0;
            if ((var79 & 0x1) != 0) {
                var80 = var3.method325(-6419);
            }
            int var81 = 0;
            if ((var79 & 0x2) != 0) {
                var81 = var4.method325(-6419);
            }
            int var82 = 0;
            if ((var79 & 0x4) != 0) {
                var82 = var5.method325(-6419);
            }
            this.field3718[var66] = var63 + var80;
            this.field3744[var66] = var64 + var81;
            this.field3727[var66] = var65 + var82;
            var63 = this.field3718[var66];
            var64 = this.field3744[var66];
            var65 = this.field3727[var66];
            if (var17 == 1) {
                this.field3730[var66] = var6.method367(1);
            }
        }
        var2.field699 = var42;
        var3.field699 = var31;
        var4.field699 = var34;
        var5.field699 = var37;
        var6.field699 = var35;
        var7.field699 = var40;
        var8.field699 = var39;
        for (int var67 = 0; var67 < var10; var67++) {
            this.field3751[var67] = (short) var2.method318(true);
            if (var12 == 1) {
                this.field3748[var67] = var3.method350(16);
            }
            if (var13 == 255) {
                this.field3723[var67] = var4.method350(16);
            }
            if (var14 == 1) {
                this.field3752[var67] = var5.method350(16);
            }
            if (var15 == 1) {
                this.field3731[var67] = var6.method367(1);
            }
            if (var16 == 1) {
                this.field3734[var67] = (short) (var7.method318(true) - 1);
            }
            if (this.field3713 != null) {
                if (this.field3734[var67] == -1) {
                    this.field3713[var67] = -1;
                } else {
                    this.field3713[var67] = (byte) (var8.method367(1) - 1);
                }
            }
        }
        var2.field699 = var33;
        var3.field699 = var30;
        int var68 = 0;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        for (int var72 = 0; var72 < var10; var72++) {
            int var75 = var3.method367(1);
            if (var75 == 1) {
                var68 = var2.method325(-6419) + var71;
                var69 = var2.method325(-6419) + var68;
                var70 = var2.method325(-6419) + var69;
                var71 = var70;
                this.field3707[var72] = var68;
                this.field3735[var72] = var69;
                this.field3714[var72] = var70;
            }
            if (var75 == 2) {
                var69 = var70;
                var70 = var2.method325(-6419) + var71;
                var71 = var70;
                this.field3707[var72] = var68;
                this.field3735[var72] = var69;
                this.field3714[var72] = var70;
            }
            if (var75 == 3) {
                var68 = var70;
                var70 = var2.method325(-6419) + var71;
                var71 = var70;
                this.field3707[var72] = var68;
                this.field3735[var72] = var69;
                this.field3714[var72] = var70;
            }
            if (var75 == 4) {
                int var78 = var68;
                var68 = var69;
                var69 = var78;
                var70 = var2.method325(-6419) + var71;
                var71 = var70;
                this.field3707[var72] = var68;
                this.field3735[var72] = var78;
                this.field3714[var72] = var70;
            }
        }
        var2.field699 = var50;
        var3.field699 = var52;
        var4.field699 = var54;
        var5.field699 = var56;
        var6.field699 = var58;
        var7.field699 = var60;
        for (int var73 = 0; var73 < var11; var73++) {
            int var74 = this.field3738[var73] & 0xFF;
            if (var74 == 0) {
                this.field3711[var73] = (short) var2.method318(true);
                this.field3749[var73] = (short) var2.method318(true);
                this.field3728[var73] = (short) var2.method318(true);
            }
            if (var74 == 1) {
                this.field3711[var73] = (short) var3.method318(true);
                this.field3749[var73] = (short) var3.method318(true);
                this.field3728[var73] = (short) var3.method318(true);
                this.field3708[var73] = (short) var4.method318(true);
                this.field3739[var73] = (short) var4.method318(true);
                this.field3747[var73] = (short) var4.method318(true);
                this.field3733[var73] = var5.method350(16);
                this.field3721[var73] = var6.method350(16);
                this.field3754[var73] = var7.method350(16);
            }
            if (var74 == 2) {
                this.field3711[var73] = (short) var3.method318(true);
                this.field3749[var73] = (short) var3.method318(true);
                this.field3728[var73] = (short) var3.method318(true);
                this.field3708[var73] = (short) var4.method318(true);
                this.field3739[var73] = (short) var4.method318(true);
                this.field3747[var73] = (short) var4.method318(true);
                this.field3733[var73] = var5.method350(16);
                this.field3721[var73] = var6.method350(16);
                this.field3754[var73] = var7.method350(16);
                this.field3716[var73] = var7.method350(16);
                this.field3725[var73] = var7.method350(16);
            }
            if (var74 == 3) {
                this.field3711[var73] = (short) var3.method318(true);
                this.field3749[var73] = (short) var3.method318(true);
                this.field3728[var73] = (short) var3.method318(true);
                this.field3708[var73] = (short) var4.method318(true);
                this.field3739[var73] = (short) var4.method318(true);
                this.field3747[var73] = (short) var4.method318(true);
                this.field3733[var73] = var5.method350(16);
                this.field3721[var73] = var6.method350(16);
                this.field3754[var73] = var7.method350(16);
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
    public final void method1421(int arg0) {
        int var2 = field3732[arg0];
        int var3 = field3709[arg0];
        for (int var4 = 0; var4 < this.field3717; var4++) {
            int var5 = this.field3727[var4] * var2 + this.field3718[var4] * var3 >> 16;
            this.field3727[var4] = this.field3727[var4] * var3 - this.field3718[var4] * var2 >> 16;
            this.field3718[var4] = var5;
        }
        this.method1440();
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(IIIII)Lgf;")
    public final class167 method1422(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class167(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "()V")
    public final void method1423() {
        for (int var1 = 0; var1 < this.field3717; var1++) {
            int var2 = this.field3727[var1];
            this.field3727[var1] = this.field3718[var1];
            this.field3718[var1] = -var2;
        }
        this.method1440();
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(III)V")
    public final void method1424(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field3732[arg2];
            int var5 = field3709[arg2];
            for (int var6 = 0; var6 < this.field3717; var6++) {
                int var7 = this.field3744[var6] * var4 + this.field3718[var6] * var5 >> 16;
                this.field3744[var6] = this.field3744[var6] * var5 - this.field3718[var6] * var4 >> 16;
                this.field3718[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field3732[arg0];
            int var9 = field3709[arg0];
            for (int var10 = 0; var10 < this.field3717; var10++) {
                int var11 = this.field3744[var10] * var9 - this.field3727[var10] * var8 >> 16;
                this.field3727[var10] = this.field3744[var10] * var8 + this.field3727[var10] * var9 >> 16;
                this.field3744[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field3732[arg1];
        int var13 = field3709[arg1];
        for (int var14 = 0; var14 < this.field3717; var14++) {
            int var15 = this.field3727[var14] * var12 + this.field3718[var14] * var13 >> 16;
            this.field3727[var14] = this.field3727[var14] * var13 - this.field3718[var14] * var12 >> 16;
            this.field3718[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "()V")
    public final void method1425() {
        int var10002;
        if (this.field3730 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3717; var3++) {
                int var7 = this.field3730[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field3724 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field3724[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field3717) {
                int var6 = this.field3730[var5];
                this.field3724[var6][var1[var6]++] = var5++;
            }
            this.field3730 = null;
        }
        if (this.field3731 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3726; var10++) {
            int var14 = this.field3731[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field3719 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field3719[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field3726) {
            int var13 = this.field3731[var12];
            this.field3719[var13][var8[var13]++] = var12++;
        }
        this.field3731 = null;
    }

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "()V")
    public static void method1426() {
        field3720 = null;
        field3712 = null;
        field3732 = null;
        field3709 = null;
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(III)V")
    public final void method1427(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3717; var4++) {
            this.field3718[var4] += arg0;
            this.field3744[var4] += arg1;
            this.field3727[var4] += arg2;
        }
        this.method1440();
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "()I")
    public final int method266() {
        if (!this.field3742) {
            this.method1428();
        }
        return this.field3729;
    }

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "()V")
    private final void method1428() {
        if (this.field3742) {
            return;
        }
        this.field3742 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field3717; var7++) {
            int var8 = this.field3718[var7];
            int var9 = this.field3744[var7];
            int var10 = this.field3727[var7];
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
        this.field3753 = (short) var1;
        this.field3715 = (short) var4;
        this.field3729 = (short) var2;
        this.field3746 = (short) var5;
        this.field3736 = (short) var3;
        this.field3741 = (short) var6;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
    private final void method1429(int arg0) {
        int var2 = field3732[arg0];
        int var3 = field3709[arg0];
        for (int var4 = 0; var4 < this.field3717; var4++) {
            int var5 = this.field3744[var4] * var2 + this.field3718[var4] * var3 >> 16;
            this.field3744[var4] = this.field3744[var4] * var3 - this.field3718[var4] * var2 >> 16;
            this.field3718[var4] = var5;
        }
        this.method1440();
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "([[IIIIII)V")
    private final void method1430(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1438(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1438(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1438(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1438(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
        if (var26 != 0) {
            this.method1437(var26);
        }
        int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
        if (var27 != 0) {
            this.method1429(var27);
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method1427(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "()Lfk;")
    public final class208 method1431() {
        class208 var1 = new class208();
        if (this.field3748 != null) {
            var1.field3748 = new byte[this.field3726];
            for (int var2 = 0; var2 < this.field3726; var2++) {
                var1.field3748[var2] = this.field3748[var2];
            }
        }
        var1.field3717 = this.field3717;
        var1.field3726 = this.field3726;
        var1.field3710 = this.field3710;
        var1.field3718 = this.field3718;
        var1.field3744 = this.field3744;
        var1.field3727 = this.field3727;
        var1.field3707 = this.field3707;
        var1.field3735 = this.field3735;
        var1.field3714 = this.field3714;
        var1.field3723 = this.field3723;
        var1.field3752 = this.field3752;
        var1.field3713 = this.field3713;
        var1.field3751 = this.field3751;
        var1.field3734 = this.field3734;
        var1.field3737 = this.field3737;
        var1.field3738 = this.field3738;
        var1.field3711 = this.field3711;
        var1.field3749 = this.field3749;
        var1.field3728 = this.field3728;
        var1.field3708 = this.field3708;
        var1.field3739 = this.field3739;
        var1.field3747 = this.field3747;
        var1.field3733 = this.field3733;
        var1.field3721 = this.field3721;
        var1.field3754 = this.field3754;
        var1.field3716 = this.field3716;
        var1.field3725 = this.field3725;
        var1.field3730 = this.field3730;
        var1.field3731 = this.field3731;
        var1.field3724 = this.field3724;
        var1.field3719 = this.field3719;
        var1.field3743 = this.field3743;
        var1.field3740 = this.field3740;
        var1.field3750 = this.field3750;
        var1.field3755 = this.field3755;
        return var1;
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(IIIII)Loc;")
    public final class119 method1432(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class167(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "(III)I")
    public final int method1433(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3717; var4++) {
            if (this.field3718[var4] == arg0 && this.field3744[var4] == arg1 && this.field3727[var4] == arg2) {
                return var4;
            }
        }
        this.field3718[this.field3717] = arg0;
        this.field3744[this.field3717] = arg1;
        this.field3727[this.field3717] = arg2;
        return this.field3717++;
    }

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "()V")
    public final void method1434() {
        for (int var1 = 0; var1 < this.field3717; var1++) {
            this.field3718[var1] = -this.field3718[var1];
            this.field3727[var1] = -this.field3727[var1];
        }
        this.method1440();
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "()Z")
    public final boolean method1435() {
        return true;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lbk;II)Lfk;")
    public static final class208 method1436(class136 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method842(arg1, (byte) -103, arg2);
        return var3 == null ? null : new class208(var3);
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V")
    private final void method1437(int arg0) {
        int var2 = field3732[arg0];
        int var3 = field3709[arg0];
        for (int var4 = 0; var4 < this.field3717; var4++) {
            int var5 = this.field3744[var4] * var3 - this.field3727[var4] * var2 >> 16;
            this.field3727[var4] = this.field3744[var4] * var2 + this.field3727[var4] * var3 >> 16;
            this.field3744[var4] = var5;
        }
        this.method1440();
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "([[III)I")
    private static final int method1438(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "(III)V")
    public final void method1439(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3717; var4++) {
            this.field3718[var4] = this.field3718[var4] * arg0 / 128;
            this.field3744[var4] = this.field3744[var4] * arg1 / 128;
            this.field3727[var4] = this.field3727[var4] * arg2 / 128;
        }
        this.method1440();
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "()V")
    private final void method1440() {
        this.field3743 = null;
        this.field3722 = null;
        this.field3740 = null;
        this.field3742 = false;
    }

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "()V")
    public final void method1441() {
        for (int var1 = 0; var1 < this.field3717; var1++) {
            int var2 = this.field3718[var1];
            this.field3718[var1] = this.field3727[var1];
            this.field3727[var1] = -var2;
        }
        this.method1440();
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II[[I[[IIIIZZ)Lfk;")
    public final class208 method1442(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method1428();
        int var10 = this.field3753 + arg4;
        int var11 = this.field3715 + arg4;
        int var12 = this.field3736 + arg6;
        int var13 = this.field3741 + arg6;
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
        class208 var18;
        if (arg7) {
            var18 = new class208();
            var18.field3717 = this.field3717;
            var18.field3726 = this.field3726;
            var18.field3710 = this.field3710;
            var18.field3707 = this.field3707;
            var18.field3735 = this.field3735;
            var18.field3714 = this.field3714;
            var18.field3748 = this.field3748;
            var18.field3723 = this.field3723;
            var18.field3752 = this.field3752;
            var18.field3713 = this.field3713;
            var18.field3751 = this.field3751;
            var18.field3734 = this.field3734;
            var18.field3737 = this.field3737;
            var18.field3738 = this.field3738;
            var18.field3711 = this.field3711;
            var18.field3749 = this.field3749;
            var18.field3728 = this.field3728;
            var18.field3708 = this.field3708;
            var18.field3739 = this.field3739;
            var18.field3747 = this.field3747;
            var18.field3733 = this.field3733;
            var18.field3721 = this.field3721;
            var18.field3754 = this.field3754;
            var18.field3716 = this.field3716;
            var18.field3725 = this.field3725;
            var18.field3730 = this.field3730;
            var18.field3731 = this.field3731;
            var18.field3724 = this.field3724;
            var18.field3719 = this.field3719;
            var18.field3750 = this.field3750;
            var18.field3755 = this.field3755;
            var18.field3743 = this.field3743;
            var18.field3740 = this.field3740;
            var18.field3722 = this.field3722;
            if (arg0 == 3) {
                var18.field3718 = class31.method170(this.field3718, 0);
                var18.field3744 = class31.method170(this.field3744, 0);
                var18.field3727 = class31.method170(this.field3727, 0);
            } else {
                var18.field3718 = this.field3718;
                var18.field3744 = new int[var18.field3717];
                var18.field3727 = this.field3727;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field3717; var19++) {
                int var20 = this.field3718[var19] + arg4;
                int var21 = this.field3727[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field3744[var19] = this.field3744[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field3717; var29++) {
                int var30 = (this.field3744[var29] << 16) / this.field3729;
                if (var30 < arg1) {
                    int var31 = this.field3718[var29] + arg4;
                    int var32 = this.field3727[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field3744[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field3744[var29];
                } else {
                    var18.field3744[var29] = this.field3744[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method1430(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field3746 - this.field3729;
            for (int var43 = 0; var43 < this.field3717; var43++) {
                int var44 = this.field3718[var43] + arg4;
                int var45 = this.field3727[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field3744[var43] = var52 + this.field3744[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field3746 - this.field3729;
            for (int var54 = 0; var54 < this.field3717; var54++) {
                int var55 = this.field3718[var54] + arg4;
                int var56 = this.field3727[var54] + arg6;
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
                var18.field3744[var54] = ((this.field3744[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method1440();
        } else {
            this.field3742 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lpe;IIIZ)V")
    public final void method1443(class258 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class208 var6 = (class208) arg0;
        var6.method1428();
        var6.method1444();
        field3745++;
        int var7 = 0;
        int[] var8 = var6.field3718;
        int var9 = var6.field3717;
        for (int var10 = 0; var10 < this.field3717; var10++) {
            class150 var13 = this.field3743[var10];
            if (var13.field2409 != 0) {
                int var14 = this.field3744[var10] - arg2;
                if (var14 >= var6.field3729 && var14 <= var6.field3746) {
                    int var15 = this.field3718[var10] - arg1;
                    if (var15 >= var6.field3753 && var15 <= var6.field3715) {
                        int var16 = this.field3727[var10] - arg3;
                        if (var16 >= var6.field3736 && var16 <= var6.field3741) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class150 var18 = var6.field3743[var17];
                                if (var8[var17] == var15 && var6.field3727[var17] == var16 && var6.field3744[var17] == var14 && var18.field2409 != 0) {
                                    if (this.field3722 == null) {
                                        this.field3722 = new class150[this.field3717];
                                    }
                                    if (var6.field3722 == null) {
                                        var6.field3722 = new class150[var9];
                                    }
                                    class150 var19 = this.field3722[var10];
                                    if (var19 == null) {
                                        var19 = this.field3722[var10] = new class150(var13);
                                    }
                                    class150 var20 = var6.field3722[var17];
                                    if (var20 == null) {
                                        var20 = var6.field3722[var17] = new class150(var18);
                                    }
                                    var19.field2411 += var18.field2411;
                                    var19.field2412 += var18.field2412;
                                    var19.field2401 += var18.field2401;
                                    var19.field2409 += var18.field2409;
                                    var20.field2411 += var13.field2411;
                                    var20.field2412 += var13.field2412;
                                    var20.field2401 += var13.field2401;
                                    var20.field2409 += var13.field2409;
                                    var7++;
                                    field3720[var10] = field3745;
                                    field3712[var17] = field3745;
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
        for (int var11 = 0; var11 < this.field3726; var11++) {
            if (field3720[this.field3707[var11]] == field3745 && field3720[this.field3735[var11]] == field3745 && field3720[this.field3714[var11]] == field3745) {
                if (this.field3748 == null) {
                    this.field3748 = new byte[this.field3726];
                }
                this.field3748[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field3726; var12++) {
            if (field3712[var6.field3707[var12]] == field3745 && field3712[var6.field3735[var12]] == field3745 && field3712[var6.field3714[var12]] == field3745) {
                if (var6.field3748 == null) {
                    var6.field3748 = new byte[var6.field3726];
                }
                var6.field3748[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "()V")
    public final void method1444() {
        if (this.field3743 != null) {
            return;
        }
        this.field3743 = new class150[this.field3717];
        for (int var1 = 0; var1 < this.field3717; var1++) {
            this.field3743[var1] = new class150();
        }
        for (int var2 = 0; var2 < this.field3726; var2++) {
            int var3 = this.field3707[var2];
            int var4 = this.field3735[var2];
            int var5 = this.field3714[var2];
            int var6 = this.field3718[var4] - this.field3718[var3];
            int var7 = this.field3744[var4] - this.field3744[var3];
            int var8 = this.field3727[var4] - this.field3727[var3];
            int var9 = this.field3718[var5] - this.field3718[var3];
            int var10 = this.field3744[var5] - this.field3744[var3];
            int var11 = this.field3727[var5] - this.field3727[var3];
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
            if (this.field3748 == null) {
                var19 = 0;
            } else {
                var19 = this.field3748[var2];
            }
            if (var19 == 0) {
                class150 var20 = this.field3743[var3];
                var20.field2411 += var16;
                var20.field2412 += var17;
                var20.field2401 += var18;
                var20.field2409++;
                class150 var21 = this.field3743[var4];
                var21.field2411 += var16;
                var21.field2412 += var17;
                var21.field2401 += var18;
                var21.field2409++;
                class150 var22 = this.field3743[var5];
                var22.field2411 += var16;
                var22.field2412 += var17;
                var22.field2401 += var18;
                var22.field2409++;
            } else if (var19 == 1) {
                if (this.field3740 == null) {
                    this.field3740 = new class211[this.field3726];
                }
                class211 var23 = this.field3740[var2] = new class211();
                var23.field3800 = var16;
                var23.field3791 = var17;
                var23.field3802 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lfk;I)I")
    private final int method1445(class208 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field3718[arg1];
        int var5 = arg0.field3744[arg1];
        int var6 = arg0.field3727[arg1];
        for (int var7 = 0; var7 < this.field3717; var7++) {
            if (this.field3718[var7] == var4 && this.field3744[var7] == var5 && this.field3727[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field3718[this.field3717] = var4;
            this.field3744[this.field3717] = var5;
            this.field3727[this.field3717] = var6;
            if (arg0.field3730 != null) {
                this.field3730[this.field3717] = arg0.field3730[arg1];
            }
            var3 = this.field3717++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
    private class208() {
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "([B)V")
    private class208(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1420(arg0);
        } else {
            this.method1416(arg0);
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(III)V")
    public class208(int arg0, int arg1, int arg2) {
        this.field3718 = new int[arg0];
        this.field3744 = new int[arg0];
        this.field3727 = new int[arg0];
        this.field3730 = new int[arg0];
        this.field3707 = new int[arg1];
        this.field3735 = new int[arg1];
        this.field3714 = new int[arg1];
        this.field3748 = new byte[arg1];
        this.field3723 = new byte[arg1];
        this.field3752 = new byte[arg1];
        this.field3751 = new short[arg1];
        this.field3734 = new short[arg1];
        this.field3713 = new byte[arg1];
        this.field3731 = new int[arg1];
        if (arg2 > 0) {
            this.field3738 = new byte[arg2];
            this.field3711 = new short[arg2];
            this.field3749 = new short[arg2];
            this.field3728 = new short[arg2];
            this.field3708 = new short[arg2];
            this.field3739 = new short[arg2];
            this.field3747 = new short[arg2];
            this.field3733 = new byte[arg2];
            this.field3721 = new byte[arg2];
            this.field3754 = new byte[arg2];
            this.field3716 = new byte[arg2];
            this.field3725 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "([Lfk;I)V")
    public class208(class208[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field3717 = 0;
        this.field3726 = 0;
        this.field3710 = 0;
        this.field3737 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class208 var15 = arg0[var9];
            if (var15 != null) {
                this.field3717 += var15.field3717;
                this.field3726 += var15.field3726;
                this.field3710 += var15.field3710;
                if (var15.field3723 == null) {
                    if (this.field3737 == -1) {
                        this.field3737 = var15.field3737;
                    }
                    if (this.field3737 != var15.field3737) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var15.field3748 != null;
                var5 |= var15.field3752 != null;
                var6 |= var15.field3731 != null;
                var7 |= var15.field3734 != null;
                var8 |= var15.field3713 != null;
            }
        }
        this.field3718 = new int[this.field3717];
        this.field3744 = new int[this.field3717];
        this.field3727 = new int[this.field3717];
        this.field3730 = new int[this.field3717];
        this.field3707 = new int[this.field3726];
        this.field3735 = new int[this.field3726];
        this.field3714 = new int[this.field3726];
        if (var3) {
            this.field3748 = new byte[this.field3726];
        }
        if (var4) {
            this.field3723 = new byte[this.field3726];
        }
        if (var5) {
            this.field3752 = new byte[this.field3726];
        }
        if (var6) {
            this.field3731 = new int[this.field3726];
        }
        if (var7) {
            this.field3734 = new short[this.field3726];
        }
        if (var8) {
            this.field3713 = new byte[this.field3726];
        }
        this.field3751 = new short[this.field3726];
        if (this.field3710 > 0) {
            this.field3738 = new byte[this.field3710];
            this.field3711 = new short[this.field3710];
            this.field3749 = new short[this.field3710];
            this.field3728 = new short[this.field3710];
            this.field3708 = new short[this.field3710];
            this.field3739 = new short[this.field3710];
            this.field3747 = new short[this.field3710];
            this.field3733 = new byte[this.field3710];
            this.field3721 = new byte[this.field3710];
            this.field3754 = new byte[this.field3710];
            this.field3716 = new byte[this.field3710];
            this.field3725 = new byte[this.field3710];
        }
        this.field3717 = 0;
        this.field3726 = 0;
        this.field3710 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            class208 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field3726; var12++) {
                    if (var3 && var11.field3748 != null) {
                        this.field3748[this.field3726] = var11.field3748[var12];
                    }
                    if (var4) {
                        if (var11.field3723 == null) {
                            this.field3723[this.field3726] = var11.field3737;
                        } else {
                            this.field3723[this.field3726] = var11.field3723[var12];
                        }
                    }
                    if (var5 && var11.field3752 != null) {
                        this.field3752[this.field3726] = var11.field3752[var12];
                    }
                    if (var6 && var11.field3731 != null) {
                        this.field3731[this.field3726] = var11.field3731[var12];
                    }
                    if (var7) {
                        if (var11.field3734 == null) {
                            this.field3734[this.field3726] = -1;
                        } else {
                            this.field3734[this.field3726] = var11.field3734[var12];
                        }
                    }
                    if (var8) {
                        if (var11.field3713 == null || var11.field3713[var12] == -1) {
                            this.field3713[this.field3726] = -1;
                        } else {
                            this.field3713[this.field3726] = (byte) (var11.field3713[var12] + this.field3710);
                        }
                    }
                    this.field3751[this.field3726] = var11.field3751[var12];
                    this.field3707[this.field3726] = this.method1445(var11, var11.field3707[var12]);
                    this.field3735[this.field3726] = this.method1445(var11, var11.field3735[var12]);
                    this.field3714[this.field3726] = this.method1445(var11, var11.field3714[var12]);
                    this.field3726++;
                }
                for (int var13 = 0; var13 < var11.field3710; var13++) {
                    byte var14 = this.field3738[this.field3710] = var11.field3738[var13];
                    if (var14 == 0) {
                        this.field3711[this.field3710] = (short) this.method1445(var11, var11.field3711[var13]);
                        this.field3749[this.field3710] = (short) this.method1445(var11, var11.field3749[var13]);
                        this.field3728[this.field3710] = (short) this.method1445(var11, var11.field3728[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field3711[this.field3710] = var11.field3711[var13];
                        this.field3749[this.field3710] = var11.field3749[var13];
                        this.field3728[this.field3710] = var11.field3728[var13];
                        this.field3708[this.field3710] = var11.field3708[var13];
                        this.field3739[this.field3710] = var11.field3739[var13];
                        this.field3747[this.field3710] = var11.field3747[var13];
                        this.field3733[this.field3710] = var11.field3733[var13];
                        this.field3721[this.field3710] = var11.field3721[var13];
                        this.field3754[this.field3710] = var11.field3754[var13];
                    }
                    if (var14 == 2) {
                        this.field3716[this.field3710] = var11.field3716[var13];
                        this.field3725[this.field3710] = var11.field3725[var13];
                    }
                    this.field3710++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lfk;ZZZZ)V")
    public class208(class208 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field3717 = arg0.field3717;
        this.field3726 = arg0.field3726;
        this.field3710 = arg0.field3710;
        if (arg1) {
            this.field3718 = arg0.field3718;
            this.field3744 = arg0.field3744;
            this.field3727 = arg0.field3727;
        } else {
            this.field3718 = new int[this.field3717];
            this.field3744 = new int[this.field3717];
            this.field3727 = new int[this.field3717];
            for (int var6 = 0; var6 < this.field3717; var6++) {
                this.field3718[var6] = arg0.field3718[var6];
                this.field3744[var6] = arg0.field3744[var6];
                this.field3727[var6] = arg0.field3727[var6];
            }
        }
        if (arg2) {
            this.field3751 = arg0.field3751;
        } else {
            this.field3751 = new short[this.field3726];
            for (int var7 = 0; var7 < this.field3726; var7++) {
                this.field3751[var7] = arg0.field3751[var7];
            }
        }
        if (arg3 || arg0.field3734 == null) {
            this.field3734 = arg0.field3734;
        } else {
            this.field3734 = new short[this.field3726];
            for (int var8 = 0; var8 < this.field3726; var8++) {
                this.field3734[var8] = arg0.field3734[var8];
            }
        }
        if (arg4) {
            this.field3752 = arg0.field3752;
        } else {
            this.field3752 = new byte[this.field3726];
            if (arg0.field3752 == null) {
                for (int var9 = 0; var9 < this.field3726; var9++) {
                    this.field3752[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field3726; var10++) {
                    this.field3752[var10] = arg0.field3752[var10];
                }
            }
        }
        this.field3707 = arg0.field3707;
        this.field3735 = arg0.field3735;
        this.field3714 = arg0.field3714;
        this.field3748 = arg0.field3748;
        this.field3723 = arg0.field3723;
        this.field3713 = arg0.field3713;
        this.field3737 = arg0.field3737;
        this.field3738 = arg0.field3738;
        this.field3711 = arg0.field3711;
        this.field3749 = arg0.field3749;
        this.field3728 = arg0.field3728;
        this.field3708 = arg0.field3708;
        this.field3739 = arg0.field3739;
        this.field3747 = arg0.field3747;
        this.field3733 = arg0.field3733;
        this.field3721 = arg0.field3721;
        this.field3754 = arg0.field3754;
        this.field3716 = arg0.field3716;
        this.field3725 = arg0.field3725;
        this.field3730 = arg0.field3730;
        this.field3731 = arg0.field3731;
        this.field3724 = arg0.field3724;
        this.field3719 = arg0.field3719;
        this.field3743 = arg0.field3743;
        this.field3740 = arg0.field3740;
        this.field3722 = arg0.field3722;
        this.field3750 = arg0.field3750;
        this.field3755 = arg0.field3755;
    }
}
