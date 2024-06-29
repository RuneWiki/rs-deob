import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class211 extends class67 {

    @OriginalMember(owner = "client!el", name = "v", descriptor = "B")
    public byte field3632 = 0;

    @OriginalMember(owner = "client!el", name = "D", descriptor = "I")
    public int field3640 = 0;

    @OriginalMember(owner = "client!el", name = "B", descriptor = "I")
    public int field3638 = 0;

    @OriginalMember(owner = "client!el", name = "jb", descriptor = "Z")
    private boolean field3672 = false;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "[I")
    public int[] field3631;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "[I")
    public int[] field3623;

    @OriginalMember(owner = "client!el", name = "Y", descriptor = "[I")
    public int[] field3661;

    @OriginalMember(owner = "client!el", name = "W", descriptor = "[I")
    private int[] field3659;

    @OriginalMember(owner = "client!el", name = "ab", descriptor = "[I")
    public int[] field3663;

    @OriginalMember(owner = "client!el", name = "R", descriptor = "[I")
    public int[] field3654;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "[I")
    public int[] field3625;

    @OriginalMember(owner = "client!el", name = "I", descriptor = "[B")
    public byte[] field3645;

    @OriginalMember(owner = "client!el", name = "U", descriptor = "[B")
    public byte[] field3657;

    @OriginalMember(owner = "client!el", name = "y", descriptor = "[B")
    public byte[] field3635;

    @OriginalMember(owner = "client!el", name = "cb", descriptor = "[S")
    public short[] field3665;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "[S")
    public short[] field3624;

    @OriginalMember(owner = "client!el", name = "z", descriptor = "[B")
    public byte[] field3636;

    @OriginalMember(owner = "client!el", name = "H", descriptor = "[I")
    private int[] field3644;

    @OriginalMember(owner = "client!el", name = "T", descriptor = "[B")
    public byte[] field3656;

    @OriginalMember(owner = "client!el", name = "P", descriptor = "[S")
    public short[] field3652;

    @OriginalMember(owner = "client!el", name = "J", descriptor = "[S")
    public short[] field3646;

    @OriginalMember(owner = "client!el", name = "Q", descriptor = "[S")
    public short[] field3653;

    @OriginalMember(owner = "client!el", name = "gb", descriptor = "[S")
    private short[] field3669;

    @OriginalMember(owner = "client!el", name = "S", descriptor = "[S")
    private short[] field3655;

    @OriginalMember(owner = "client!el", name = "L", descriptor = "[S")
    private short[] field3648;

    @OriginalMember(owner = "client!el", name = "w", descriptor = "[B")
    private byte[] field3633;

    @OriginalMember(owner = "client!el", name = "fb", descriptor = "[B")
    private byte[] field3668;

    @OriginalMember(owner = "client!el", name = "x", descriptor = "[B")
    private byte[] field3634;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "[B")
    private byte[] field3626;

    @OriginalMember(owner = "client!el", name = "E", descriptor = "[B")
    private byte[] field3641;

    @OriginalMember(owner = "client!el", name = "M", descriptor = "I")
    public int field3649;

    @OriginalMember(owner = "client!el", name = "ib", descriptor = "[Loe;")
    public class71[] field3671;

    @OriginalMember(owner = "client!el", name = "O", descriptor = "[Lqh;")
    public class28[] field3651;

    @OriginalMember(owner = "client!el", name = "G", descriptor = "[[I")
    public int[][] field3643;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "[[I")
    public int[][] field3627;

    @OriginalMember(owner = "client!el", name = "K", descriptor = "[Lwj;")
    public class148[] field3647;

    @OriginalMember(owner = "client!el", name = "Z", descriptor = "[Lh;")
    public class260[] field3662;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "[Lwj;")
    public class148[] field3629;

    @OriginalMember(owner = "client!el", name = "bb", descriptor = "S")
    public short field3664;

    @OriginalMember(owner = "client!el", name = "C", descriptor = "S")
    public short field3639;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    private static int field3628 = 0;

    @OriginalMember(owner = "client!el", name = "F", descriptor = "[I")
    private static int[] field3642 = new int[10000];

    @OriginalMember(owner = "client!el", name = "X", descriptor = "[I")
    private static int[] field3660 = class76.field1189;

    @OriginalMember(owner = "client!el", name = "db", descriptor = "[I")
    private static int[] field3666 = new int[10000];

    @OriginalMember(owner = "client!el", name = "V", descriptor = "[I")
    private static int[] field3658 = class76.field1192;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "S")
    private short field3622;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "S")
    private short field3630;

    @OriginalMember(owner = "client!el", name = "A", descriptor = "S")
    private short field3637;

    @OriginalMember(owner = "client!el", name = "N", descriptor = "S")
    private short field3650;

    @OriginalMember(owner = "client!el", name = "eb", descriptor = "S")
    private short field3667;

    @OriginalMember(owner = "client!el", name = "hb", descriptor = "S")
    private short field3670;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lel;IS)I")
    private final int method1478(class211 arg0, int arg1, short arg2) {
        int var4 = arg0.field3631[arg1];
        int var5 = arg0.field3623[arg1];
        int var6 = arg0.field3661[arg1];
        for (int var7 = 0; var7 < this.field3640; var7++) {
            if (this.field3631[var7] == var4 && this.field3623[var7] == var5 && this.field3661[var7] == var6) {
                return var7;
            }
        }
        this.field3631[this.field3640] = var4;
        this.field3623[this.field3640] = var5;
        this.field3661[this.field3640] = var6;
        if (arg0.field3659 != null) {
            this.field3659[this.field3640] = arg0.field3659[arg1];
        }
        return this.field3640++;
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "()V")
    public static void method1479() {
        field3642 = null;
        field3666 = null;
        field3658 = null;
        field3660 = null;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(IIIII)Lbl;")
    public final class253 method1480(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class209(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "()V")
    public final void method1481() {
        for (int var1 = 0; var1 < this.field3640; var1++) {
            this.field3631[var1] = -this.field3631[var1];
            this.field3661[var1] = -this.field3661[var1];
        }
        this.method1484();
    }

    @OriginalMember(owner = "client!el", name = "e", descriptor = "()V")
    public final void method1482() {
        this.field3659 = null;
        this.field3644 = null;
        this.field3643 = null;
        this.field3627 = null;
    }

    @OriginalMember(owner = "client!el", name = "f", descriptor = "()V")
    public final void method1483() {
        if (this.field3647 != null) {
            return;
        }
        this.field3647 = new class148[this.field3640];
        for (int var1 = 0; var1 < this.field3640; var1++) {
            this.field3647[var1] = new class148();
        }
        for (int var2 = 0; var2 < this.field3638; var2++) {
            int var3 = this.field3663[var2];
            int var4 = this.field3654[var2];
            int var5 = this.field3625[var2];
            int var6 = this.field3631[var4] - this.field3631[var3];
            int var7 = this.field3623[var4] - this.field3623[var3];
            int var8 = this.field3661[var4] - this.field3661[var3];
            int var9 = this.field3631[var5] - this.field3631[var3];
            int var10 = this.field3623[var5] - this.field3623[var3];
            int var11 = this.field3661[var5] - this.field3661[var3];
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
            if (this.field3645 == null) {
                var19 = 0;
            } else {
                var19 = this.field3645[var2];
            }
            if (var19 == 0) {
                class148 var20 = this.field3647[var3];
                var20.field2515 += var16;
                var20.field2510 += var17;
                var20.field2506 += var18;
                var20.field2509++;
                class148 var21 = this.field3647[var4];
                var21.field2515 += var16;
                var21.field2510 += var17;
                var21.field2506 += var18;
                var21.field2509++;
                class148 var22 = this.field3647[var5];
                var22.field2515 += var16;
                var22.field2510 += var17;
                var22.field2506 += var18;
                var22.field2509++;
            } else if (var19 == 1) {
                if (this.field3662 == null) {
                    this.field3662 = new class260[this.field3638];
                }
                class260 var23 = this.field3662[var2] = new class260();
                var23.field4600 = var16;
                var23.field4602 = var17;
                var23.field4596 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "g", descriptor = "()V")
    private final void method1484() {
        this.field3647 = null;
        this.field3629 = null;
        this.field3662 = null;
        this.field3672 = false;
    }

    @OriginalMember(owner = "client!el", name = "h", descriptor = "()V")
    public final void method1485() {
        for (int var1 = 0; var1 < this.field3640; var1++) {
            int var2 = this.field3631[var1];
            this.field3631[var1] = this.field3661[var1];
            this.field3661[var1] = -var2;
        }
        this.method1484();
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(III)V")
    public final void method1486(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3640; var4++) {
            this.field3631[var4] += arg0;
            this.field3623[var4] += arg1;
            this.field3661[var4] += arg2;
        }
        this.method1484();
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([B)V")
    private final void method1487(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class187 var4 = new class187(arg0);
        class187 var5 = new class187(arg0);
        class187 var6 = new class187(arg0);
        class187 var7 = new class187(arg0);
        class187 var8 = new class187(arg0);
        var4.field3169 = arg0.length - 18;
        int var9 = var4.method1244(false);
        int var10 = var4.method1244(false);
        int var11 = var4.method1268(255);
        int var12 = var4.method1268(255);
        int var13 = var4.method1268(255);
        int var14 = var4.method1268(255);
        int var15 = var4.method1268(255);
        int var16 = var4.method1268(255);
        int var17 = var4.method1244(false);
        int var18 = var4.method1244(false);
        int var19 = var4.method1244(false);
        int var20 = var4.method1244(false);
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
        this.field3640 = var9;
        this.field3638 = var10;
        this.field3649 = var11;
        this.field3631 = new int[var9];
        this.field3623 = new int[var9];
        this.field3661 = new int[var9];
        this.field3663 = new int[var10];
        this.field3654 = new int[var10];
        this.field3625 = new int[var10];
        if (var11 > 0) {
            this.field3656 = new byte[var11];
            this.field3652 = new short[var11];
            this.field3646 = new short[var11];
            this.field3653 = new short[var11];
        }
        if (var16 == 1) {
            this.field3659 = new int[var9];
        }
        if (var12 == 1) {
            this.field3645 = new byte[var10];
            this.field3636 = new byte[var10];
            this.field3624 = new short[var10];
        }
        if (var13 == 255) {
            this.field3657 = new byte[var10];
        } else {
            this.field3632 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3635 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3644 = new int[var10];
        }
        this.field3665 = new short[var10];
        var4.field3169 = var21;
        var5.field3169 = var36;
        var6.field3169 = var38;
        var7.field3169 = var40;
        var8.field3169 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method1268(255);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method1249((byte) -100);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method1249((byte) -100);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method1249((byte) -100);
            }
            this.field3631[var46] = var43 + var63;
            this.field3623[var46] = var44 + var64;
            this.field3661[var46] = var45 + var65;
            var43 = this.field3631[var46];
            var44 = this.field3623[var46];
            var45 = this.field3661[var46];
            if (var16 == 1) {
                this.field3659[var46] = var8.method1268(255);
            }
        }
        var4.field3169 = var32;
        var5.field3169 = var28;
        var6.field3169 = var26;
        var7.field3169 = var30;
        var8.field3169 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field3665[var47] = (short) var4.method1244(false);
            if (var12 == 1) {
                int var61 = var5.method1268(255);
                if ((var61 & 0x1) == 1) {
                    this.field3645[var47] = 1;
                    var2 = true;
                } else {
                    this.field3645[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field3636[var47] = (byte) (var61 >> 2);
                    this.field3624[var47] = this.field3665[var47];
                    this.field3665[var47] = 127;
                    if (this.field3624[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field3636[var47] = -1;
                    this.field3624[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field3657[var47] = var6.method1269(255);
            }
            if (var14 == 1) {
                this.field3635[var47] = var7.method1269(255);
            }
            if (var15 == 1) {
                this.field3644[var47] = var8.method1268(255);
            }
        }
        var4.field3169 = var25;
        var5.field3169 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method1268(255);
            if (var57 == 1) {
                var48 = var4.method1249((byte) -100) + var51;
                var49 = var4.method1249((byte) -100) + var48;
                var50 = var4.method1249((byte) -100) + var49;
                var51 = var50;
                this.field3663[var52] = var48;
                this.field3654[var52] = var49;
                this.field3625[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method1249((byte) -100) + var51;
                var51 = var50;
                this.field3663[var52] = var48;
                this.field3654[var52] = var49;
                this.field3625[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method1249((byte) -100) + var51;
                var51 = var50;
                this.field3663[var52] = var48;
                this.field3654[var52] = var49;
                this.field3625[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method1249((byte) -100) + var51;
                var51 = var50;
                this.field3663[var52] = var48;
                this.field3654[var52] = var60;
                this.field3625[var52] = var50;
            }
        }
        var4.field3169 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field3656[var53] = 0;
            this.field3652[var53] = (short) var4.method1244(false);
            this.field3646[var53] = (short) var4.method1244(false);
            this.field3653[var53] = (short) var4.method1244(false);
        }
        if (this.field3636 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field3636[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field3652[var56] & 0xFFFF) == this.field3663[var55] && (this.field3646[var56] & 0xFFFF) == this.field3654[var55] && (this.field3653[var56] & 0xFFFF) == this.field3625[var55]) {
                        this.field3636[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field3636 = null;
            }
        }
        if (!var3) {
            this.field3624 = null;
        }
        if (!var2) {
            this.field3645 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
    public final void method1488(int arg0) {
        int var2 = field3658[arg0];
        int var3 = field3660[arg0];
        for (int var4 = 0; var4 < this.field3640; var4++) {
            int var5 = this.field3661[var4] * var2 + this.field3631[var4] * var3 >> 16;
            this.field3661[var4] = this.field3661[var4] * var3 - this.field3631[var4] * var2 >> 16;
            this.field3631[var4] = var5;
        }
        this.method1484();
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(SS)V")
    public final void method1489(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3638; var3++) {
            if (this.field3665[var3] == arg0) {
                this.field3665[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "([B)V")
    private final void method1490(byte[] arg0) {
        class187 var2 = new class187(arg0);
        class187 var3 = new class187(arg0);
        class187 var4 = new class187(arg0);
        class187 var5 = new class187(arg0);
        class187 var6 = new class187(arg0);
        class187 var7 = new class187(arg0);
        class187 var8 = new class187(arg0);
        var2.field3169 = arg0.length - 23;
        int var9 = var2.method1244(false);
        int var10 = var2.method1244(false);
        int var11 = var2.method1268(255);
        int var12 = var2.method1268(255);
        boolean var13 = (var12 & 0x1) == 1;
        boolean var14 = (var12 & 0x2) == 2;
        int var15 = var2.method1268(255);
        int var16 = var2.method1268(255);
        int var17 = var2.method1268(255);
        int var18 = var2.method1268(255);
        int var19 = var2.method1268(255);
        int var20 = var2.method1244(false);
        int var21 = var2.method1244(false);
        int var22 = var2.method1244(false);
        int var23 = var2.method1244(false);
        int var24 = var2.method1244(false);
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field3656 = new byte[var11];
            var2.field3169 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field3656[var28] = var2.method1269(255);
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
        this.field3640 = var9;
        this.field3638 = var10;
        this.field3649 = var11;
        this.field3631 = new int[var9];
        this.field3623 = new int[var9];
        this.field3661 = new int[var9];
        this.field3663 = new int[var10];
        this.field3654 = new int[var10];
        this.field3625 = new int[var10];
        if (var19 == 1) {
            this.field3659 = new int[var9];
        }
        if (var13) {
            this.field3645 = new byte[var10];
        }
        if (var15 == 255) {
            this.field3657 = new byte[var10];
        } else {
            this.field3632 = (byte) var15;
        }
        if (var16 == 1) {
            this.field3635 = new byte[var10];
        }
        if (var17 == 1) {
            this.field3644 = new int[var10];
        }
        if (var18 == 1) {
            this.field3624 = new short[var10];
        }
        if (var18 == 1 && var11 > 0) {
            this.field3636 = new byte[var10];
        }
        this.field3665 = new short[var10];
        if (var11 > 0) {
            this.field3652 = new short[var11];
            this.field3646 = new short[var11];
            this.field3653 = new short[var11];
            if (var26 > 0) {
                this.field3669 = new short[var26];
                this.field3655 = new short[var26];
                this.field3648 = new short[var26];
                this.field3633 = new byte[var26];
                this.field3668 = new byte[var26];
                this.field3634 = new byte[var26];
            }
            if (var27 > 0) {
                this.field3626 = new byte[var27];
                this.field3641 = new byte[var27];
            }
        }
        var2.field3169 = var11;
        var3.field3169 = var46;
        var4.field3169 = var48;
        var5.field3169 = var50;
        var6.field3169 = var38;
        int var66 = 0;
        int var67 = 0;
        int var68 = 0;
        for (int var69 = 0; var69 < var9; var69++) {
            int var88 = var2.method1268(255);
            int var89 = 0;
            if ((var88 & 0x1) != 0) {
                var89 = var3.method1249((byte) -100);
            }
            int var90 = 0;
            if ((var88 & 0x2) != 0) {
                var90 = var4.method1249((byte) -100);
            }
            int var91 = 0;
            if ((var88 & 0x4) != 0) {
                var91 = var5.method1249((byte) -100);
            }
            this.field3631[var69] = var66 + var89;
            this.field3623[var69] = var67 + var90;
            this.field3661[var69] = var68 + var91;
            var66 = this.field3631[var69];
            var67 = this.field3623[var69];
            var68 = this.field3661[var69];
            if (var19 == 1) {
                this.field3659[var69] = var6.method1268(255);
            }
        }
        var2.field3169 = var44;
        var3.field3169 = var33;
        var4.field3169 = var36;
        var5.field3169 = var39;
        var6.field3169 = var37;
        var7.field3169 = var42;
        var8.field3169 = var41;
        for (int var70 = 0; var70 < var10; var70++) {
            this.field3665[var70] = (short) var2.method1244(false);
            if (var13) {
                this.field3645[var70] = var3.method1269(255);
            }
            if (var15 == 255) {
                this.field3657[var70] = var4.method1269(255);
            }
            if (var16 == 1) {
                this.field3635[var70] = var5.method1269(255);
            }
            if (var17 == 1) {
                this.field3644[var70] = var6.method1268(255);
            }
            if (var18 == 1) {
                this.field3624[var70] = (short) (var7.method1244(false) - 1);
            }
            if (this.field3636 != null) {
                if (this.field3624[var70] == -1) {
                    this.field3636[var70] = -1;
                } else {
                    this.field3636[var70] = (byte) (var8.method1268(255) - 1);
                }
            }
        }
        var2.field3169 = var35;
        var3.field3169 = var32;
        int var71 = 0;
        int var72 = 0;
        int var73 = 0;
        int var74 = 0;
        for (int var75 = 0; var75 < var10; var75++) {
            int var84 = var3.method1268(255);
            if (var84 == 1) {
                var71 = var2.method1249((byte) -100) + var74;
                var72 = var2.method1249((byte) -100) + var71;
                var73 = var2.method1249((byte) -100) + var72;
                var74 = var73;
                this.field3663[var75] = var71;
                this.field3654[var75] = var72;
                this.field3625[var75] = var73;
            }
            if (var84 == 2) {
                var72 = var73;
                var73 = var2.method1249((byte) -100) + var74;
                var74 = var73;
                this.field3663[var75] = var71;
                this.field3654[var75] = var72;
                this.field3625[var75] = var73;
            }
            if (var84 == 3) {
                var71 = var73;
                var73 = var2.method1249((byte) -100) + var74;
                var74 = var73;
                this.field3663[var75] = var71;
                this.field3654[var75] = var72;
                this.field3625[var75] = var73;
            }
            if (var84 == 4) {
                int var87 = var71;
                var71 = var72;
                var72 = var87;
                var73 = var2.method1249((byte) -100) + var74;
                var74 = var73;
                this.field3663[var75] = var71;
                this.field3654[var75] = var87;
                this.field3625[var75] = var73;
            }
        }
        var2.field3169 = var52;
        var3.field3169 = var54;
        var4.field3169 = var56;
        var5.field3169 = var58;
        var6.field3169 = var60;
        var7.field3169 = var62;
        for (int var76 = 0; var76 < var11; var76++) {
            int var83 = this.field3656[var76] & 0xFF;
            if (var83 == 0) {
                this.field3652[var76] = (short) var2.method1244(false);
                this.field3646[var76] = (short) var2.method1244(false);
                this.field3653[var76] = (short) var2.method1244(false);
            }
            if (var83 == 1) {
                this.field3652[var76] = (short) var3.method1244(false);
                this.field3646[var76] = (short) var3.method1244(false);
                this.field3653[var76] = (short) var3.method1244(false);
                this.field3669[var76] = (short) var4.method1244(false);
                this.field3655[var76] = (short) var4.method1244(false);
                this.field3648[var76] = (short) var4.method1244(false);
                this.field3633[var76] = var5.method1269(255);
                this.field3668[var76] = var6.method1269(255);
                this.field3634[var76] = var7.method1269(255);
            }
            if (var83 == 2) {
                this.field3652[var76] = (short) var3.method1244(false);
                this.field3646[var76] = (short) var3.method1244(false);
                this.field3653[var76] = (short) var3.method1244(false);
                this.field3669[var76] = (short) var4.method1244(false);
                this.field3655[var76] = (short) var4.method1244(false);
                this.field3648[var76] = (short) var4.method1244(false);
                this.field3633[var76] = var5.method1269(255);
                this.field3668[var76] = var6.method1269(255);
                this.field3634[var76] = var7.method1269(255);
                this.field3626[var76] = var7.method1269(255);
                this.field3641[var76] = var7.method1269(255);
            }
            if (var83 == 3) {
                this.field3652[var76] = (short) var3.method1244(false);
                this.field3646[var76] = (short) var3.method1244(false);
                this.field3653[var76] = (short) var3.method1244(false);
                this.field3669[var76] = (short) var4.method1244(false);
                this.field3655[var76] = (short) var4.method1244(false);
                this.field3648[var76] = (short) var4.method1244(false);
                this.field3633[var76] = var5.method1269(255);
                this.field3668[var76] = var6.method1269(255);
                this.field3634[var76] = var7.method1269(255);
            }
        }
        if (!var14) {
            return;
        }
        var2.field3169 = var64;
        int var77 = var2.method1268(255);
        if (var77 > 0) {
            this.field3671 = new class71[var77];
            for (int var78 = 0; var78 < var77; var78++) {
                int var79 = var2.method1244(false);
                int var80 = var2.method1244(false);
                this.field3671[var78] = new class71(var79, this.field3663[var80], this.field3654[var80], this.field3625[var80]);
            }
        }
        int var81 = var2.method1268(255);
        if (var81 > 0) {
            this.field3651 = new class28[var81];
            for (int var82 = 0; var82 < var81; var82++) {
                this.field3651[var82] = new class28(var2.method1244(false), var2.method1244(false));
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(IIIII)Lnd;")
    public final class209 method1491(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class209(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
    private final void method1492(int arg0) {
        int var2 = field3658[arg0];
        int var3 = field3660[arg0];
        for (int var4 = 0; var4 < this.field3640; var4++) {
            int var5 = this.field3631[var4] * var3 + this.field3623[var4] * var2 >> 16;
            this.field3623[var4] = this.field3623[var4] * var3 - this.field3631[var4] * var2 >> 16;
            this.field3631[var4] = var5;
        }
        this.method1484();
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIIIIIJILdk;)V")
    public final void method313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class193 arg10) {
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIII)V")
    public final void method312(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III)Lme;")
    public final class67 method467(int arg0, int arg1, int arg2) {
        return this.method1480(this.field3664, this.field3639, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(III)V")
    public final void method1493(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3640; var4++) {
            this.field3631[var4] = this.field3631[var4] * arg0 / 128;
            this.field3623[var4] = this.field3623[var4] * arg1 / 128;
            this.field3661[var4] = this.field3661[var4] * arg2 / 128;
        }
        this.method1484();
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "()Z")
    public final boolean method464() {
        return true;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Ljl;II)Lel;")
    public static final class211 method1494(class101 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method666(arg2, arg1, (byte) -51);
        return var3 == null ? null : new class211(var3);
    }

    @OriginalMember(owner = "client!el", name = "i", descriptor = "()V")
    public final void method1495() {
        for (int var1 = 0; var1 < this.field3640; var1++) {
            this.field3661[var1] = -this.field3661[var1];
        }
        for (int var2 = 0; var2 < this.field3638; var2++) {
            int var3 = this.field3663[var2];
            this.field3663[var2] = this.field3625[var2];
            this.field3625[var2] = var3;
        }
        this.method1484();
    }

    @OriginalMember(owner = "client!el", name = "j", descriptor = "()V")
    public final void method1496() {
        for (int var1 = 0; var1 < this.field3640; var1++) {
            int var2 = this.field3661[var1];
            this.field3661[var1] = this.field3631[var1];
            this.field3631[var1] = -var2;
        }
        this.method1484();
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(SS)V")
    public final void method1497(short arg0, short arg1) {
        if (this.field3624 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field3638; var3++) {
            if (this.field3624[var3] == arg0) {
                this.field3624[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(I)V")
    private final void method1498(int arg0) {
        int var2 = field3658[arg0];
        int var3 = field3660[arg0];
        for (int var4 = 0; var4 < this.field3640; var4++) {
            int var5 = this.field3623[var4] * var3 - this.field3661[var4] * var2 >> 16;
            this.field3661[var4] = this.field3661[var4] * var3 + this.field3623[var4] * var2 >> 16;
            this.field3623[var4] = var5;
        }
        this.method1484();
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(III)I")
    public final int method1499(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3640; var4++) {
            if (this.field3631[var4] == arg0 && this.field3623[var4] == arg1 && this.field3661[var4] == arg2) {
                return var4;
            }
        }
        this.field3631[this.field3640] = arg0;
        this.field3623[this.field3640] = arg1;
        this.field3661[this.field3640] = arg2;
        return this.field3640++;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([[IIIIII)V")
    private final void method1500(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1505(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1505(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1505(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1505(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method1498(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method1492(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method1486(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIBSB)I")
    public final int method1501(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field3663[this.field3638] = arg0;
        this.field3654[this.field3638] = arg1;
        this.field3625[this.field3638] = arg2;
        this.field3645[this.field3638] = arg3;
        this.field3636[this.field3638] = -1;
        this.field3665[this.field3638] = arg4;
        this.field3624[this.field3638] = -1;
        this.field3635[this.field3638] = arg5;
        return this.field3638++;
    }

    @OriginalMember(owner = "client!el", name = "k", descriptor = "()V")
    public final void method1502() {
        int var10002;
        if (this.field3659 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3640; var3++) {
                int var7 = this.field3659[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field3643 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field3643[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field3640) {
                int var6 = this.field3659[var5];
                this.field3643[var6][var1[var6]++] = var5++;
            }
            this.field3659 = null;
        }
        if (this.field3644 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3638; var10++) {
            int var14 = this.field3644[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field3627 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field3627[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field3638) {
            int var13 = this.field3644[var12];
            this.field3627[var13][var8[var13]++] = var12++;
        }
        this.field3644 = null;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "()I")
    public final int method308() {
        if (!this.field3672) {
            this.method1504();
        }
        return this.field3670;
    }

    @OriginalMember(owner = "client!el", name = "l", descriptor = "()Lel;")
    public final class211 method1503() {
        class211 var1 = new class211();
        if (this.field3645 != null) {
            var1.field3645 = new byte[this.field3638];
            for (int var2 = 0; var2 < this.field3638; var2++) {
                var1.field3645[var2] = this.field3645[var2];
            }
        }
        var1.field3640 = this.field3640;
        var1.field3638 = this.field3638;
        var1.field3649 = this.field3649;
        var1.field3631 = this.field3631;
        var1.field3623 = this.field3623;
        var1.field3661 = this.field3661;
        var1.field3663 = this.field3663;
        var1.field3654 = this.field3654;
        var1.field3625 = this.field3625;
        var1.field3657 = this.field3657;
        var1.field3635 = this.field3635;
        var1.field3636 = this.field3636;
        var1.field3665 = this.field3665;
        var1.field3624 = this.field3624;
        var1.field3632 = this.field3632;
        var1.field3656 = this.field3656;
        var1.field3652 = this.field3652;
        var1.field3646 = this.field3646;
        var1.field3653 = this.field3653;
        var1.field3669 = this.field3669;
        var1.field3655 = this.field3655;
        var1.field3648 = this.field3648;
        var1.field3633 = this.field3633;
        var1.field3668 = this.field3668;
        var1.field3634 = this.field3634;
        var1.field3626 = this.field3626;
        var1.field3641 = this.field3641;
        var1.field3659 = this.field3659;
        var1.field3644 = this.field3644;
        var1.field3643 = this.field3643;
        var1.field3627 = this.field3627;
        var1.field3647 = this.field3647;
        var1.field3662 = this.field3662;
        var1.field3664 = this.field3664;
        var1.field3639 = this.field3639;
        var1.field3671 = this.field3671;
        var1.field3651 = this.field3651;
        return var1;
    }

    @OriginalMember(owner = "client!el", name = "m", descriptor = "()V")
    private final void method1504() {
        if (this.field3672) {
            return;
        }
        this.field3672 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field3640; var7++) {
            int var8 = this.field3631[var7];
            int var9 = this.field3623[var7];
            int var10 = this.field3661[var7];
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
        this.field3650 = (short) var1;
        this.field3637 = (short) var4;
        this.field3670 = (short) var2;
        this.field3667 = (short) var5;
        this.field3630 = (short) var3;
        this.field3622 = (short) var6;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([[III)I")
    private static final int method1505(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II[[I[[IIIIZZ)Lel;")
    public final class211 method1506(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method1504();
        int var10 = this.field3650 + arg4;
        int var11 = this.field3637 + arg4;
        int var12 = this.field3630 + arg6;
        int var13 = this.field3622 + arg6;
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
        class211 var18;
        if (arg7) {
            var18 = new class211();
            var18.field3640 = this.field3640;
            var18.field3638 = this.field3638;
            var18.field3649 = this.field3649;
            var18.field3663 = this.field3663;
            var18.field3654 = this.field3654;
            var18.field3625 = this.field3625;
            var18.field3645 = this.field3645;
            var18.field3657 = this.field3657;
            var18.field3635 = this.field3635;
            var18.field3636 = this.field3636;
            var18.field3665 = this.field3665;
            var18.field3624 = this.field3624;
            var18.field3632 = this.field3632;
            var18.field3656 = this.field3656;
            var18.field3652 = this.field3652;
            var18.field3646 = this.field3646;
            var18.field3653 = this.field3653;
            var18.field3669 = this.field3669;
            var18.field3655 = this.field3655;
            var18.field3648 = this.field3648;
            var18.field3633 = this.field3633;
            var18.field3668 = this.field3668;
            var18.field3634 = this.field3634;
            var18.field3626 = this.field3626;
            var18.field3641 = this.field3641;
            var18.field3659 = this.field3659;
            var18.field3644 = this.field3644;
            var18.field3643 = this.field3643;
            var18.field3627 = this.field3627;
            var18.field3664 = this.field3664;
            var18.field3639 = this.field3639;
            var18.field3647 = this.field3647;
            var18.field3662 = this.field3662;
            var18.field3629 = this.field3629;
            var18.field3671 = this.field3671;
            var18.field3651 = this.field3651;
            if (arg0 == 3) {
                var18.field3631 = class178.method1184(this.field3631, -14221);
                var18.field3623 = class178.method1184(this.field3623, -14221);
                var18.field3661 = class178.method1184(this.field3661, -14221);
            } else {
                var18.field3631 = this.field3631;
                var18.field3623 = new int[var18.field3640];
                var18.field3661 = this.field3661;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field3640; var19++) {
                int var20 = this.field3631[var19] + arg4;
                int var21 = this.field3661[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field3623[var19] = this.field3623[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field3640; var29++) {
                int var30 = (this.field3623[var29] << 16) / this.field3670;
                if (var30 < arg1) {
                    int var31 = this.field3631[var29] + arg4;
                    int var32 = this.field3661[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field3623[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field3623[var29];
                } else {
                    var18.field3623[var29] = this.field3623[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method1500(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field3667 - this.field3670;
            for (int var43 = 0; var43 < this.field3640; var43++) {
                int var44 = this.field3631[var43] + arg4;
                int var45 = this.field3661[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field3623[var43] = var52 + this.field3623[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field3667 - this.field3670;
            for (int var54 = 0; var54 < this.field3640; var54++) {
                int var55 = this.field3631[var54] + arg4;
                int var56 = this.field3661[var54] + arg6;
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
                var18.field3623[var54] = ((this.field3623[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method1484();
        } else {
            this.field3672 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!el", name = "e", descriptor = "(III)V")
    public final void method1507(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field3658[arg2];
            int var5 = field3660[arg2];
            for (int var6 = 0; var6 < this.field3640; var6++) {
                int var7 = this.field3631[var6] * var5 + this.field3623[var6] * var4 >> 16;
                this.field3623[var6] = this.field3623[var6] * var5 - this.field3631[var6] * var4 >> 16;
                this.field3631[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field3658[arg0];
            int var9 = field3660[arg0];
            for (int var10 = 0; var10 < this.field3640; var10++) {
                int var11 = this.field3623[var10] * var9 - this.field3661[var10] * var8 >> 16;
                this.field3661[var10] = this.field3661[var10] * var9 + this.field3623[var10] * var8 >> 16;
                this.field3623[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field3658[arg1];
        int var13 = field3660[arg1];
        for (int var14 = 0; var14 < this.field3640; var14++) {
            int var15 = this.field3661[var14] * var12 + this.field3631[var14] * var13 >> 16;
            this.field3661[var14] = this.field3661[var14] * var13 - this.field3631[var14] * var12 >> 16;
            this.field3631[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lme;IIIZ)V")
    public final void method468(class67 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class211 var6 = (class211) arg0;
        var6.method1504();
        var6.method1483();
        field3628++;
        int var7 = 0;
        int[] var8 = var6.field3631;
        int var9 = var6.field3640;
        for (int var10 = 0; var10 < this.field3640; var10++) {
            class148 var13 = this.field3647[var10];
            if (var13.field2509 != 0) {
                int var14 = this.field3623[var10] - arg2;
                if (var14 >= var6.field3670 && var14 <= var6.field3667) {
                    int var15 = this.field3631[var10] - arg1;
                    if (var15 >= var6.field3650 && var15 <= var6.field3637) {
                        int var16 = this.field3661[var10] - arg3;
                        if (var16 >= var6.field3630 && var16 <= var6.field3622) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class148 var18 = var6.field3647[var17];
                                if (var8[var17] == var15 && var6.field3661[var17] == var16 && var6.field3623[var17] == var14 && var18.field2509 != 0) {
                                    if (this.field3629 == null) {
                                        this.field3629 = new class148[this.field3640];
                                    }
                                    if (var6.field3629 == null) {
                                        var6.field3629 = new class148[var9];
                                    }
                                    class148 var19 = this.field3629[var10];
                                    if (var19 == null) {
                                        var19 = this.field3629[var10] = new class148(var13);
                                    }
                                    class148 var20 = var6.field3629[var17];
                                    if (var20 == null) {
                                        var20 = var6.field3629[var17] = new class148(var18);
                                    }
                                    var19.field2515 += var18.field2515;
                                    var19.field2510 += var18.field2510;
                                    var19.field2506 += var18.field2506;
                                    var19.field2509 += var18.field2509;
                                    var20.field2515 += var13.field2515;
                                    var20.field2510 += var13.field2510;
                                    var20.field2506 += var13.field2506;
                                    var20.field2509 += var13.field2509;
                                    var7++;
                                    field3642[var10] = field3628;
                                    field3666[var17] = field3628;
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
        for (int var11 = 0; var11 < this.field3638; var11++) {
            if (field3642[this.field3663[var11]] == field3628 && field3642[this.field3654[var11]] == field3628 && field3642[this.field3625[var11]] == field3628) {
                if (this.field3645 == null) {
                    this.field3645 = new byte[this.field3638];
                }
                this.field3645[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field3638; var12++) {
            if (field3666[var6.field3663[var12]] == field3628 && field3666[var6.field3654[var12]] == field3628 && field3666[var6.field3625[var12]] == field3628) {
                if (var6.field3645 == null) {
                    var6.field3645 = new byte[var6.field3638];
                }
                var6.field3645[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V")
    private class211() {
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "([B)V")
    private class211(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1490(arg0);
        } else {
            this.method1487(arg0);
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(III)V")
    public class211(int arg0, int arg1, int arg2) {
        this.field3631 = new int[arg0];
        this.field3623 = new int[arg0];
        this.field3661 = new int[arg0];
        this.field3659 = new int[arg0];
        this.field3663 = new int[arg1];
        this.field3654 = new int[arg1];
        this.field3625 = new int[arg1];
        this.field3645 = new byte[arg1];
        this.field3657 = new byte[arg1];
        this.field3635 = new byte[arg1];
        this.field3665 = new short[arg1];
        this.field3624 = new short[arg1];
        this.field3636 = new byte[arg1];
        this.field3644 = new int[arg1];
        if (arg2 > 0) {
            this.field3656 = new byte[arg2];
            this.field3652 = new short[arg2];
            this.field3646 = new short[arg2];
            this.field3653 = new short[arg2];
            this.field3669 = new short[arg2];
            this.field3655 = new short[arg2];
            this.field3648 = new short[arg2];
            this.field3633 = new byte[arg2];
            this.field3668 = new byte[arg2];
            this.field3634 = new byte[arg2];
            this.field3626 = new byte[arg2];
            this.field3641 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "([Lel;I)V")
    public class211(class211[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field3640 = 0;
        this.field3638 = 0;
        this.field3649 = 0;
        int var9 = 0;
        int var10 = 0;
        this.field3632 = -1;
        for (int var11 = 0; var11 < arg1; var11++) {
            class211 var26 = arg0[var11];
            if (var26 != null) {
                this.field3640 += var26.field3640;
                this.field3638 += var26.field3638;
                this.field3649 += var26.field3649;
                if (var26.field3657 == null) {
                    if (this.field3632 == -1) {
                        this.field3632 = var26.field3632;
                    }
                    if (this.field3632 != var26.field3632) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var26.field3645 != null;
                var5 |= var26.field3635 != null;
                var6 |= var26.field3644 != null;
                var7 |= var26.field3624 != null;
                var8 |= var26.field3636 != null;
                if (var26.field3671 != null) {
                    var9 += var26.field3671.length;
                }
                if (var26.field3651 != null) {
                    var10 += var26.field3651.length;
                }
            }
        }
        this.field3631 = new int[this.field3640];
        this.field3623 = new int[this.field3640];
        this.field3661 = new int[this.field3640];
        this.field3659 = new int[this.field3640];
        this.field3663 = new int[this.field3638];
        this.field3654 = new int[this.field3638];
        this.field3625 = new int[this.field3638];
        if (var3) {
            this.field3645 = new byte[this.field3638];
        }
        if (var4) {
            this.field3657 = new byte[this.field3638];
        }
        if (var5) {
            this.field3635 = new byte[this.field3638];
        }
        if (var6) {
            this.field3644 = new int[this.field3638];
        }
        if (var7) {
            this.field3624 = new short[this.field3638];
        }
        if (var8) {
            this.field3636 = new byte[this.field3638];
        }
        if (var9 > 0) {
            this.field3671 = new class71[var9];
        }
        if (var10 > 0) {
            this.field3651 = new class28[var10];
        }
        this.field3665 = new short[this.field3638];
        if (this.field3649 > 0) {
            this.field3656 = new byte[this.field3649];
            this.field3652 = new short[this.field3649];
            this.field3646 = new short[this.field3649];
            this.field3653 = new short[this.field3649];
            this.field3669 = new short[this.field3649];
            this.field3655 = new short[this.field3649];
            this.field3648 = new short[this.field3649];
            this.field3633 = new byte[this.field3649];
            this.field3668 = new byte[this.field3649];
            this.field3634 = new byte[this.field3649];
            this.field3626 = new byte[this.field3649];
            this.field3641 = new byte[this.field3649];
        }
        this.field3640 = 0;
        this.field3638 = 0;
        this.field3649 = 0;
        int var12 = 0;
        int var13 = 0;
        for (int var14 = 0; var14 < arg1; var14++) {
            short var15 = (short) (0x1 << var14);
            class211 var16 = arg0[var14];
            if (var16 != null) {
                for (int var17 = 0; var17 < var16.field3638; var17++) {
                    if (var3 && var16.field3645 != null) {
                        this.field3645[this.field3638] = var16.field3645[var17];
                    }
                    if (var4) {
                        if (var16.field3657 == null) {
                            this.field3657[this.field3638] = var16.field3632;
                        } else {
                            this.field3657[this.field3638] = var16.field3657[var17];
                        }
                    }
                    if (var5 && var16.field3635 != null) {
                        this.field3635[this.field3638] = var16.field3635[var17];
                    }
                    if (var6 && var16.field3644 != null) {
                        this.field3644[this.field3638] = var16.field3644[var17];
                    }
                    if (var7) {
                        if (var16.field3624 == null) {
                            this.field3624[this.field3638] = -1;
                        } else {
                            this.field3624[this.field3638] = var16.field3624[var17];
                        }
                    }
                    if (var8) {
                        if (var16.field3636 == null || var16.field3636[var17] == -1) {
                            this.field3636[this.field3638] = -1;
                        } else {
                            this.field3636[this.field3638] = (byte) (var16.field3636[var17] + this.field3649);
                        }
                    }
                    this.field3665[this.field3638] = var16.field3665[var17];
                    this.field3663[this.field3638] = this.method1478(var16, var16.field3663[var17], var15);
                    this.field3654[this.field3638] = this.method1478(var16, var16.field3654[var17], var15);
                    this.field3625[this.field3638] = this.method1478(var16, var16.field3625[var17], var15);
                    this.field3638++;
                }
                for (int var18 = 0; var18 < var16.field3649; var18++) {
                    byte var25 = this.field3656[this.field3649] = var16.field3656[var18];
                    if (var25 == 0) {
                        this.field3652[this.field3649] = (short) this.method1478(var16, var16.field3652[var18], var15);
                        this.field3646[this.field3649] = (short) this.method1478(var16, var16.field3646[var18], var15);
                        this.field3653[this.field3649] = (short) this.method1478(var16, var16.field3653[var18], var15);
                    }
                    if (var25 >= 1 && var25 <= 3) {
                        this.field3652[this.field3649] = var16.field3652[var18];
                        this.field3646[this.field3649] = var16.field3646[var18];
                        this.field3653[this.field3649] = var16.field3653[var18];
                        this.field3669[this.field3649] = var16.field3669[var18];
                        this.field3655[this.field3649] = var16.field3655[var18];
                        this.field3648[this.field3649] = var16.field3648[var18];
                        this.field3633[this.field3649] = var16.field3633[var18];
                        this.field3668[this.field3649] = var16.field3668[var18];
                        this.field3634[this.field3649] = var16.field3634[var18];
                    }
                    if (var25 == 2) {
                        this.field3626[this.field3649] = var16.field3626[var18];
                        this.field3641[this.field3649] = var16.field3641[var18];
                    }
                    this.field3649++;
                }
                if (var16.field3671 != null) {
                    for (int var19 = 0; var19 < var16.field3671.length; var19++) {
                        int var20 = this.method1478(var16, var16.field3671[var19].field1123, var15);
                        int var21 = this.method1478(var16, var16.field3671[var19].field1116, var15);
                        int var22 = this.method1478(var16, var16.field3671[var19].field1121, var15);
                        this.field3671[var12] = new class71(var16.field3671[var19].field1119, var20, var21, var22);
                        var12++;
                    }
                }
                if (var16.field3651 != null) {
                    for (int var23 = 0; var23 < var16.field3651.length; var23++) {
                        int var24 = this.method1478(var16, var16.field3651[var23].field408, var15);
                        this.field3651[var13] = new class28(var16.field3651[var23].field413, var24);
                        var13++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lel;ZZZZ)V")
    public class211(class211 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field3640 = arg0.field3640;
        this.field3638 = arg0.field3638;
        this.field3649 = arg0.field3649;
        if (arg1) {
            this.field3631 = arg0.field3631;
            this.field3623 = arg0.field3623;
            this.field3661 = arg0.field3661;
        } else {
            this.field3631 = new int[this.field3640];
            this.field3623 = new int[this.field3640];
            this.field3661 = new int[this.field3640];
            for (int var6 = 0; var6 < this.field3640; var6++) {
                this.field3631[var6] = arg0.field3631[var6];
                this.field3623[var6] = arg0.field3623[var6];
                this.field3661[var6] = arg0.field3661[var6];
            }
        }
        if (arg2) {
            this.field3665 = arg0.field3665;
        } else {
            this.field3665 = new short[this.field3638];
            for (int var7 = 0; var7 < this.field3638; var7++) {
                this.field3665[var7] = arg0.field3665[var7];
            }
        }
        if (arg3 || arg0.field3624 == null) {
            this.field3624 = arg0.field3624;
        } else {
            this.field3624 = new short[this.field3638];
            for (int var8 = 0; var8 < this.field3638; var8++) {
                this.field3624[var8] = arg0.field3624[var8];
            }
        }
        if (arg4) {
            this.field3635 = arg0.field3635;
        } else {
            this.field3635 = new byte[this.field3638];
            if (arg0.field3635 == null) {
                for (int var9 = 0; var9 < this.field3638; var9++) {
                    this.field3635[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field3638; var10++) {
                    this.field3635[var10] = arg0.field3635[var10];
                }
            }
        }
        this.field3663 = arg0.field3663;
        this.field3654 = arg0.field3654;
        this.field3625 = arg0.field3625;
        this.field3645 = arg0.field3645;
        this.field3657 = arg0.field3657;
        this.field3636 = arg0.field3636;
        this.field3632 = arg0.field3632;
        this.field3656 = arg0.field3656;
        this.field3652 = arg0.field3652;
        this.field3646 = arg0.field3646;
        this.field3653 = arg0.field3653;
        this.field3669 = arg0.field3669;
        this.field3655 = arg0.field3655;
        this.field3648 = arg0.field3648;
        this.field3633 = arg0.field3633;
        this.field3668 = arg0.field3668;
        this.field3634 = arg0.field3634;
        this.field3626 = arg0.field3626;
        this.field3641 = arg0.field3641;
        this.field3659 = arg0.field3659;
        this.field3644 = arg0.field3644;
        this.field3643 = arg0.field3643;
        this.field3627 = arg0.field3627;
        this.field3647 = arg0.field3647;
        this.field3662 = arg0.field3662;
        this.field3629 = arg0.field3629;
        this.field3664 = arg0.field3664;
        this.field3639 = arg0.field3639;
        this.field3671 = arg0.field3671;
        this.field3651 = arg0.field3651;
    }
}
