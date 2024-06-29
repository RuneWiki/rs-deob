import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class41 extends class165 {

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
    public int field691 = 0;

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "Z")
    private boolean field697 = false;

    @OriginalMember(owner = "client!ib", name = "Z", descriptor = "B")
    public byte field711 = 0;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
    public int field680 = 0;

    @OriginalMember(owner = "client!ib", name = "db", descriptor = "[I")
    public int[] field715;

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "[I")
    public int[] field704;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "[I")
    public int[] field683;

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "[I")
    private int[] field690;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "[I")
    public int[] field675;

    @OriginalMember(owner = "client!ib", name = "Y", descriptor = "[I")
    public int[] field710;

    @OriginalMember(owner = "client!ib", name = "ab", descriptor = "[I")
    public int[] field712;

    @OriginalMember(owner = "client!ib", name = "V", descriptor = "[B")
    public byte[] field707;

    @OriginalMember(owner = "client!ib", name = "cb", descriptor = "[B")
    public byte[] field714;

    @OriginalMember(owner = "client!ib", name = "T", descriptor = "[B")
    public byte[] field705;

    @OriginalMember(owner = "client!ib", name = "O", descriptor = "[S")
    public short[] field700;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "[S")
    public short[] field676;

    @OriginalMember(owner = "client!ib", name = "ib", descriptor = "[B")
    public byte[] field720;

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "[I")
    private int[] field694;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "[B")
    public byte[] field678;

    @OriginalMember(owner = "client!ib", name = "W", descriptor = "[S")
    public short[] field708;

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "[S")
    public short[] field698;

    @OriginalMember(owner = "client!ib", name = "X", descriptor = "[S")
    public short[] field709;

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "[S")
    private short[] field692;

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "[S")
    private short[] field688;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "[S")
    private short[] field677;

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "[B")
    private byte[] field703;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "[B")
    private byte[] field684;

    @OriginalMember(owner = "client!ib", name = "bb", descriptor = "[B")
    private byte[] field713;

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "[B")
    private byte[] field689;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "[B")
    private byte[] field673;

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
    public int field686;

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "[[I")
    public int[][] field695;

    @OriginalMember(owner = "client!ib", name = "eb", descriptor = "[[I")
    public int[][] field716;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "[Lp;")
    public class57[] field685;

    @OriginalMember(owner = "client!ib", name = "jb", descriptor = "[Lu;")
    public class196[] field721;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "[Lp;")
    public class57[] field681;

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "S")
    public short field696;

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "S")
    public short field702;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "[I")
    private static int[] field682 = new int[10000];

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "[I")
    private static int[] field674 = new int[10000];

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "[I")
    private static int[] field687 = class98.field1843;

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "I")
    private static int field701 = 0;

    @OriginalMember(owner = "client!ib", name = "gb", descriptor = "[I")
    private static int[] field718 = class98.field1839;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "S")
    private short field679;

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "S")
    private short field693;

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "S")
    private short field699;

    @OriginalMember(owner = "client!ib", name = "U", descriptor = "S")
    private short field706;

    @OriginalMember(owner = "client!ib", name = "fb", descriptor = "S")
    private short field717;

    @OriginalMember(owner = "client!ib", name = "hb", descriptor = "S")
    private short field719;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
    public final void method282(int arg0) {
        int var2 = field718[arg0];
        int var3 = field687[arg0];
        for (int var4 = 0; var4 < this.field691; var4++) {
            int var5 = this.field715[var4] * var3 + this.field683[var4] * var2 >> 16;
            this.field683[var4] = this.field683[var4] * var3 - this.field715[var4] * var2 >> 16;
            this.field715[var4] = var5;
        }
        this.method290();
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIBSB)I")
    public final int method283(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field675[this.field680] = arg0;
        this.field710[this.field680] = arg1;
        this.field712[this.field680] = arg2;
        this.field707[this.field680] = arg3;
        this.field720[this.field680] = -1;
        this.field700[this.field680] = arg4;
        this.field676[this.field680] = -1;
        this.field705[this.field680] = arg5;
        return this.field680++;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)Lta;")
    public final class165 method284(int arg0, int arg1, int arg2) {
        return this.method289(this.field696, this.field702, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(SS)V")
    public final void method285(short arg0, short arg1) {
        if (this.field676 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field680; var3++) {
            if (this.field676[var3] == arg0) {
                this.field676[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lpa;II)Lib;")
    public static final class41 method286(class123 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method973(arg1, true, arg2);
        return var3 == null ? null : new class41(var3);
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(IIIII)Lkd;")
    public final class207 method287(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class207(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([B)V")
    private final void method288(byte[] arg0) {
        class81 var2 = new class81(arg0);
        class81 var3 = new class81(arg0);
        class81 var4 = new class81(arg0);
        class81 var5 = new class81(arg0);
        class81 var6 = new class81(arg0);
        class81 var7 = new class81(arg0);
        class81 var8 = new class81(arg0);
        var2.field1541 = arg0.length - 23;
        int var9 = var2.method658(117);
        int var10 = var2.method658(-123);
        int var11 = var2.method622(true);
        int var12 = var2.method622(true);
        int var13 = var2.method622(true);
        int var14 = var2.method622(true);
        int var15 = var2.method622(true);
        int var16 = var2.method622(true);
        int var17 = var2.method622(true);
        int var18 = var2.method658(-100);
        int var19 = var2.method658(85);
        int var20 = var2.method658(-73);
        int var21 = var2.method658(-110);
        int var22 = var2.method658(93);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field678 = new byte[var11];
            var2.field1541 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field678[var26] = var2.method635(-87);
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
        this.field691 = var9;
        this.field680 = var10;
        this.field686 = var11;
        this.field715 = new int[var9];
        this.field704 = new int[var9];
        this.field683 = new int[var9];
        this.field675 = new int[var10];
        this.field710 = new int[var10];
        this.field712 = new int[var10];
        if (var17 == 1) {
            this.field690 = new int[var9];
        }
        if (var12 == 1) {
            this.field707 = new byte[var10];
        }
        if (var13 == 255) {
            this.field714 = new byte[var10];
        } else {
            this.field711 = (byte) var13;
        }
        if (var14 == 1) {
            this.field705 = new byte[var10];
        }
        if (var15 == 1) {
            this.field694 = new int[var10];
        }
        if (var16 == 1) {
            this.field676 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field720 = new byte[var10];
        }
        this.field700 = new short[var10];
        if (var11 > 0) {
            this.field708 = new short[var11];
            this.field698 = new short[var11];
            this.field709 = new short[var11];
            if (var24 > 0) {
                this.field692 = new short[var24];
                this.field688 = new short[var24];
                this.field677 = new short[var24];
                this.field703 = new byte[var24];
                this.field684 = new byte[var24];
                this.field713 = new byte[var24];
            }
            if (var25 > 0) {
                this.field689 = new byte[var25];
                this.field673 = new byte[var25];
            }
        }
        var2.field1541 = var11;
        var3.field1541 = var44;
        var4.field1541 = var46;
        var5.field1541 = var48;
        var6.field1541 = var36;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        for (int var66 = 0; var66 < var9; var66++) {
            int var79 = var2.method622(true);
            int var80 = 0;
            if ((var79 & 0x1) != 0) {
                var80 = var3.method657((byte) -69);
            }
            int var81 = 0;
            if ((var79 & 0x2) != 0) {
                var81 = var4.method657((byte) -49);
            }
            int var82 = 0;
            if ((var79 & 0x4) != 0) {
                var82 = var5.method657((byte) 110);
            }
            this.field715[var66] = var63 + var80;
            this.field704[var66] = var64 + var81;
            this.field683[var66] = var65 + var82;
            var63 = this.field715[var66];
            var64 = this.field704[var66];
            var65 = this.field683[var66];
            if (var17 == 1) {
                this.field690[var66] = var6.method622(true);
            }
        }
        var2.field1541 = var42;
        var3.field1541 = var31;
        var4.field1541 = var34;
        var5.field1541 = var37;
        var6.field1541 = var35;
        var7.field1541 = var40;
        var8.field1541 = var39;
        for (int var67 = 0; var67 < var10; var67++) {
            this.field700[var67] = (short) var2.method658(66);
            if (var12 == 1) {
                this.field707[var67] = var3.method635(-55);
            }
            if (var13 == 255) {
                this.field714[var67] = var4.method635(105);
            }
            if (var14 == 1) {
                this.field705[var67] = var5.method635(106);
            }
            if (var15 == 1) {
                this.field694[var67] = var6.method622(true);
            }
            if (var16 == 1) {
                this.field676[var67] = (short) (var7.method658(-83) - 1);
            }
            if (this.field720 != null) {
                if (this.field676[var67] == -1) {
                    this.field720[var67] = -1;
                } else {
                    this.field720[var67] = (byte) (var8.method622(true) - 1);
                }
            }
        }
        var2.field1541 = var33;
        var3.field1541 = var30;
        int var68 = 0;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        for (int var72 = 0; var72 < var10; var72++) {
            int var75 = var3.method622(true);
            if (var75 == 1) {
                var68 = var2.method657((byte) -22) + var71;
                var69 = var2.method657((byte) -127) + var68;
                var70 = var2.method657((byte) 112) + var69;
                var71 = var70;
                this.field675[var72] = var68;
                this.field710[var72] = var69;
                this.field712[var72] = var70;
            }
            if (var75 == 2) {
                var69 = var70;
                var70 = var2.method657((byte) 108) + var71;
                var71 = var70;
                this.field675[var72] = var68;
                this.field710[var72] = var69;
                this.field712[var72] = var70;
            }
            if (var75 == 3) {
                var68 = var70;
                var70 = var2.method657((byte) -41) + var71;
                var71 = var70;
                this.field675[var72] = var68;
                this.field710[var72] = var69;
                this.field712[var72] = var70;
            }
            if (var75 == 4) {
                int var78 = var68;
                var68 = var69;
                var69 = var78;
                var70 = var2.method657((byte) -108) + var71;
                var71 = var70;
                this.field675[var72] = var68;
                this.field710[var72] = var78;
                this.field712[var72] = var70;
            }
        }
        var2.field1541 = var50;
        var3.field1541 = var52;
        var4.field1541 = var54;
        var5.field1541 = var56;
        var6.field1541 = var58;
        var7.field1541 = var60;
        for (int var73 = 0; var73 < var11; var73++) {
            int var74 = this.field678[var73] & 0xFF;
            if (var74 == 0) {
                this.field708[var73] = (short) var2.method658(-126);
                this.field698[var73] = (short) var2.method658(82);
                this.field709[var73] = (short) var2.method658(-71);
            }
            if (var74 == 1) {
                this.field708[var73] = (short) var3.method658(105);
                this.field698[var73] = (short) var3.method658(-77);
                this.field709[var73] = (short) var3.method658(-58);
                this.field692[var73] = (short) var4.method658(125);
                this.field688[var73] = (short) var4.method658(69);
                this.field677[var73] = (short) var4.method658(89);
                this.field703[var73] = var5.method635(-27);
                this.field684[var73] = var6.method635(-39);
                this.field713[var73] = var7.method635(121);
            }
            if (var74 == 2) {
                this.field708[var73] = (short) var3.method658(64);
                this.field698[var73] = (short) var3.method658(104);
                this.field709[var73] = (short) var3.method658(-81);
                this.field692[var73] = (short) var4.method658(-110);
                this.field688[var73] = (short) var4.method658(-102);
                this.field677[var73] = (short) var4.method658(-72);
                this.field703[var73] = var5.method635(113);
                this.field684[var73] = var6.method635(92);
                this.field713[var73] = var7.method635(-67);
                this.field689[var73] = var7.method635(94);
                this.field673[var73] = var7.method635(-85);
            }
            if (var74 == 3) {
                this.field708[var73] = (short) var3.method658(70);
                this.field698[var73] = (short) var3.method658(64);
                this.field709[var73] = (short) var3.method658(-90);
                this.field692[var73] = (short) var4.method658(111);
                this.field688[var73] = (short) var4.method658(-106);
                this.field677[var73] = (short) var4.method658(-61);
                this.field703[var73] = var5.method635(85);
                this.field684[var73] = var6.method635(-82);
                this.field713[var73] = var7.method635(121);
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(IIIII)Lra;")
    public final class70 method289(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class207(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "()V")
    private final void method290() {
        this.field685 = null;
        this.field681 = null;
        this.field721 = null;
        this.field697 = false;
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "()V")
    public final void method291() {
        for (int var1 = 0; var1 < this.field691; var1++) {
            this.field715[var1] = -this.field715[var1];
            this.field683[var1] = -this.field683[var1];
        }
        this.method290();
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "()V")
    public final void method292() {
        for (int var1 = 0; var1 < this.field691; var1++) {
            int var2 = this.field715[var1];
            this.field715[var1] = this.field683[var1];
            this.field683[var1] = -var2;
        }
        this.method290();
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "()I")
    public final int method21() {
        if (!this.field697) {
            this.method308();
        }
        return this.field706;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(SS)V")
    public final void method293(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field680; var3++) {
            if (this.field700[var3] == arg0) {
                this.field700[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "([B)V")
    private final void method294(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class81 var4 = new class81(arg0);
        class81 var5 = new class81(arg0);
        class81 var6 = new class81(arg0);
        class81 var7 = new class81(arg0);
        class81 var8 = new class81(arg0);
        var4.field1541 = arg0.length - 18;
        int var9 = var4.method658(-121);
        int var10 = var4.method658(114);
        int var11 = var4.method622(true);
        int var12 = var4.method622(true);
        int var13 = var4.method622(true);
        int var14 = var4.method622(true);
        int var15 = var4.method622(true);
        int var16 = var4.method622(true);
        int var17 = var4.method658(-77);
        int var18 = var4.method658(93);
        int var19 = var4.method658(-94);
        int var20 = var4.method658(-121);
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
        this.field691 = var9;
        this.field680 = var10;
        this.field686 = var11;
        this.field715 = new int[var9];
        this.field704 = new int[var9];
        this.field683 = new int[var9];
        this.field675 = new int[var10];
        this.field710 = new int[var10];
        this.field712 = new int[var10];
        if (var11 > 0) {
            this.field678 = new byte[var11];
            this.field708 = new short[var11];
            this.field698 = new short[var11];
            this.field709 = new short[var11];
        }
        if (var16 == 1) {
            this.field690 = new int[var9];
        }
        if (var12 == 1) {
            this.field707 = new byte[var10];
            this.field720 = new byte[var10];
            this.field676 = new short[var10];
        }
        if (var13 == 255) {
            this.field714 = new byte[var10];
        } else {
            this.field711 = (byte) var13;
        }
        if (var14 == 1) {
            this.field705 = new byte[var10];
        }
        if (var15 == 1) {
            this.field694 = new int[var10];
        }
        this.field700 = new short[var10];
        var4.field1541 = var21;
        var5.field1541 = var36;
        var6.field1541 = var38;
        var7.field1541 = var40;
        var8.field1541 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method622(true);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method657((byte) -97);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method657((byte) -64);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method657((byte) 117);
            }
            this.field715[var46] = var43 + var63;
            this.field704[var46] = var44 + var64;
            this.field683[var46] = var45 + var65;
            var43 = this.field715[var46];
            var44 = this.field704[var46];
            var45 = this.field683[var46];
            if (var16 == 1) {
                this.field690[var46] = var8.method622(true);
            }
        }
        var4.field1541 = var32;
        var5.field1541 = var28;
        var6.field1541 = var26;
        var7.field1541 = var30;
        var8.field1541 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field700[var47] = (short) var4.method658(125);
            if (var12 == 1) {
                int var61 = var5.method622(true);
                if ((var61 & 0x1) == 1) {
                    this.field707[var47] = 1;
                    var2 = true;
                } else {
                    this.field707[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field720[var47] = (byte) (var61 >> 2);
                    this.field676[var47] = this.field700[var47];
                    this.field700[var47] = 127;
                    if (this.field676[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field720[var47] = -1;
                    this.field676[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field714[var47] = var6.method635(-66);
            }
            if (var14 == 1) {
                this.field705[var47] = var7.method635(-33);
            }
            if (var15 == 1) {
                this.field694[var47] = var8.method622(true);
            }
        }
        var4.field1541 = var25;
        var5.field1541 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method622(true);
            if (var57 == 1) {
                var48 = var4.method657((byte) -91) + var51;
                var49 = var4.method657((byte) -40) + var48;
                var50 = var4.method657((byte) 126) + var49;
                var51 = var50;
                this.field675[var52] = var48;
                this.field710[var52] = var49;
                this.field712[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method657((byte) -41) + var51;
                var51 = var50;
                this.field675[var52] = var48;
                this.field710[var52] = var49;
                this.field712[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method657((byte) 15) + var51;
                var51 = var50;
                this.field675[var52] = var48;
                this.field710[var52] = var49;
                this.field712[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method657((byte) 125) + var51;
                var51 = var50;
                this.field675[var52] = var48;
                this.field710[var52] = var60;
                this.field712[var52] = var50;
            }
        }
        var4.field1541 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field678[var53] = 0;
            this.field708[var53] = (short) var4.method658(-89);
            this.field698[var53] = (short) var4.method658(-84);
            this.field709[var53] = (short) var4.method658(-62);
        }
        if (this.field720 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field720[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field708[var56] & 0xFFFF) == this.field675[var55] && (this.field698[var56] & 0xFFFF) == this.field710[var55] && (this.field709[var56] & 0xFFFF) == this.field712[var55]) {
                        this.field720[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field720 = null;
            }
        }
        if (!var3) {
            this.field676 = null;
        }
        if (!var2) {
            this.field707 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "()Z")
    public final boolean method295() {
        return true;
    }

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "()V")
    public final void method296() {
        if (this.field685 != null) {
            return;
        }
        this.field685 = new class57[this.field691];
        for (int var1 = 0; var1 < this.field691; var1++) {
            this.field685[var1] = new class57();
        }
        for (int var2 = 0; var2 < this.field680; var2++) {
            int var3 = this.field675[var2];
            int var4 = this.field710[var2];
            int var5 = this.field712[var2];
            int var6 = this.field715[var4] - this.field715[var3];
            int var7 = this.field704[var4] - this.field704[var3];
            int var8 = this.field683[var4] - this.field683[var3];
            int var9 = this.field715[var5] - this.field715[var3];
            int var10 = this.field704[var5] - this.field704[var3];
            int var11 = this.field683[var5] - this.field683[var3];
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
            if (this.field707 == null) {
                var19 = 0;
            } else {
                var19 = this.field707[var2];
            }
            if (var19 == 0) {
                class57 var20 = this.field685[var3];
                var20.field936 += var16;
                var20.field941 += var17;
                var20.field934 += var18;
                var20.field942++;
                class57 var21 = this.field685[var4];
                var21.field936 += var16;
                var21.field941 += var17;
                var21.field934 += var18;
                var21.field942++;
                class57 var22 = this.field685[var5];
                var22.field936 += var16;
                var22.field941 += var17;
                var22.field934 += var18;
                var22.field942++;
            } else if (var19 == 1) {
                if (this.field721 == null) {
                    this.field721 = new class196[this.field680];
                }
                class196 var23 = this.field721[var2] = new class196();
                var23.field3538 = var16;
                var23.field3541 = var17;
                var23.field3536 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
    private final void method297(int arg0) {
        int var2 = field718[arg0];
        int var3 = field687[arg0];
        for (int var4 = 0; var4 < this.field691; var4++) {
            int var5 = this.field715[var4] * var3 + this.field704[var4] * var2 >> 16;
            this.field704[var4] = this.field704[var4] * var3 - this.field715[var4] * var2 >> 16;
            this.field715[var4] = var5;
        }
        this.method290();
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([[IIIIII)V")
    private final void method298(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method312(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method312(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method312(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method312(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
        if (var26 != 0) {
            this.method307(var26);
        }
        int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
        if (var27 != 0) {
            this.method297(var27);
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method314(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "()V")
    public final void method299() {
        this.field690 = null;
        this.field694 = null;
        this.field695 = null;
        this.field716 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lib;I)I")
    private final int method300(class41 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field715[arg1];
        int var5 = arg0.field704[arg1];
        int var6 = arg0.field683[arg1];
        for (int var7 = 0; var7 < this.field691; var7++) {
            if (this.field715[var7] == var4 && this.field704[var7] == var5 && this.field683[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field715[this.field691] = var4;
            this.field704[this.field691] = var5;
            this.field683[this.field691] = var6;
            if (arg0.field690 != null) {
                this.field690[this.field691] = arg0.field690[arg1];
            }
            var3 = this.field691++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "()V")
    public final void method301() {
        for (int var1 = 0; var1 < this.field691; var1++) {
            int var2 = this.field683[var1];
            this.field683[var1] = this.field715[var1];
            this.field715[var1] = -var2;
        }
        this.method290();
    }

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "()Lib;")
    public final class41 method302() {
        class41 var1 = new class41();
        if (this.field707 != null) {
            var1.field707 = new byte[this.field680];
            for (int var2 = 0; var2 < this.field680; var2++) {
                var1.field707[var2] = this.field707[var2];
            }
        }
        var1.field691 = this.field691;
        var1.field680 = this.field680;
        var1.field686 = this.field686;
        var1.field715 = this.field715;
        var1.field704 = this.field704;
        var1.field683 = this.field683;
        var1.field675 = this.field675;
        var1.field710 = this.field710;
        var1.field712 = this.field712;
        var1.field714 = this.field714;
        var1.field705 = this.field705;
        var1.field720 = this.field720;
        var1.field700 = this.field700;
        var1.field676 = this.field676;
        var1.field711 = this.field711;
        var1.field678 = this.field678;
        var1.field708 = this.field708;
        var1.field698 = this.field698;
        var1.field709 = this.field709;
        var1.field692 = this.field692;
        var1.field688 = this.field688;
        var1.field677 = this.field677;
        var1.field703 = this.field703;
        var1.field684 = this.field684;
        var1.field713 = this.field713;
        var1.field689 = this.field689;
        var1.field673 = this.field673;
        var1.field690 = this.field690;
        var1.field694 = this.field694;
        var1.field695 = this.field695;
        var1.field716 = this.field716;
        var1.field685 = this.field685;
        var1.field721 = this.field721;
        var1.field696 = this.field696;
        var1.field702 = this.field702;
        return var1;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(III)I")
    public final int method303(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field691; var4++) {
            if (this.field715[var4] == arg0 && this.field704[var4] == arg1 && this.field683[var4] == arg2) {
                return var4;
            }
        }
        this.field715[this.field691] = arg0;
        this.field704[this.field691] = arg1;
        this.field683[this.field691] = arg2;
        return this.field691++;
    }

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "()V")
    public final void method304() {
        for (int var1 = 0; var1 < this.field691; var1++) {
            this.field683[var1] = -this.field683[var1];
        }
        for (int var2 = 0; var2 < this.field680; var2++) {
            int var3 = this.field675[var2];
            this.field675[var2] = this.field712[var2];
            this.field712[var2] = var3;
        }
        this.method290();
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(III)V")
    public final void method305(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field691; var4++) {
            this.field715[var4] = this.field715[var4] * arg0 / 128;
            this.field704[var4] = this.field704[var4] * arg1 / 128;
            this.field683[var4] = this.field683[var4] * arg2 / 128;
        }
        this.method290();
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lta;IIIZ)V")
    public final void method306(class165 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class41 var6 = (class41) arg0;
        var6.method308();
        var6.method296();
        field701++;
        int var7 = 0;
        int[] var8 = var6.field715;
        int var9 = var6.field691;
        for (int var10 = 0; var10 < this.field691; var10++) {
            class57 var13 = this.field685[var10];
            if (var13.field942 != 0) {
                int var14 = this.field704[var10] - arg2;
                if (var14 >= var6.field706 && var14 <= var6.field693) {
                    int var15 = this.field715[var10] - arg1;
                    if (var15 >= var6.field719 && var15 <= var6.field717) {
                        int var16 = this.field683[var10] - arg3;
                        if (var16 >= var6.field679 && var16 <= var6.field699) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class57 var18 = var6.field685[var17];
                                if (var8[var17] == var15 && var6.field683[var17] == var16 && var6.field704[var17] == var14 && var18.field942 != 0) {
                                    if (this.field681 == null) {
                                        this.field681 = new class57[this.field691];
                                    }
                                    if (var6.field681 == null) {
                                        var6.field681 = new class57[var9];
                                    }
                                    class57 var19 = this.field681[var10];
                                    if (var19 == null) {
                                        var19 = this.field681[var10] = new class57(var13);
                                    }
                                    class57 var20 = var6.field681[var17];
                                    if (var20 == null) {
                                        var20 = var6.field681[var17] = new class57(var18);
                                    }
                                    var19.field936 += var18.field936;
                                    var19.field941 += var18.field941;
                                    var19.field934 += var18.field934;
                                    var19.field942 += var18.field942;
                                    var20.field936 += var13.field936;
                                    var20.field941 += var13.field941;
                                    var20.field934 += var13.field934;
                                    var20.field942 += var13.field942;
                                    var7++;
                                    field682[var10] = field701;
                                    field674[var17] = field701;
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
        for (int var11 = 0; var11 < this.field680; var11++) {
            if (field682[this.field675[var11]] == field701 && field682[this.field710[var11]] == field701 && field682[this.field712[var11]] == field701) {
                if (this.field707 == null) {
                    this.field707 = new byte[this.field680];
                }
                this.field707[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field680; var12++) {
            if (field674[var6.field675[var12]] == field701 && field674[var6.field710[var12]] == field701 && field674[var6.field712[var12]] == field701) {
                if (var6.field707 == null) {
                    var6.field707 = new byte[var6.field680];
                }
                var6.field707[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V")
    private final void method307(int arg0) {
        int var2 = field718[arg0];
        int var3 = field687[arg0];
        for (int var4 = 0; var4 < this.field691; var4++) {
            int var5 = this.field704[var4] * var3 - this.field683[var4] * var2 >> 16;
            this.field683[var4] = this.field704[var4] * var2 + this.field683[var4] * var3 >> 16;
            this.field704[var4] = var5;
        }
        this.method290();
    }

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "()V")
    private final void method308() {
        if (this.field697) {
            return;
        }
        this.field697 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field691; var7++) {
            int var8 = this.field715[var7];
            int var9 = this.field704[var7];
            int var10 = this.field683[var7];
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
        this.field719 = (short) var1;
        this.field717 = (short) var4;
        this.field706 = (short) var2;
        this.field693 = (short) var5;
        this.field679 = (short) var3;
        this.field699 = (short) var6;
    }

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "()V")
    public final void method309() {
        int var10002;
        if (this.field690 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field691; var3++) {
                int var7 = this.field690[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field695 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field695[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field691) {
                int var6 = this.field690[var5];
                this.field695[var6][var1[var6]++] = var5++;
            }
            this.field690 = null;
        }
        if (this.field694 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field680; var10++) {
            int var14 = this.field694[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field716 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field716[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field680) {
            int var13 = this.field694[var12];
            this.field716[var13][var8[var13]++] = var12++;
        }
        this.field694 = null;
    }

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "()V")
    public static void method310() {
        field682 = null;
        field674 = null;
        field718 = null;
        field687 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II[[I[[IIIIZZ)Lib;")
    public final class41 method311(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method308();
        int var10 = this.field719 + arg4;
        int var11 = this.field717 + arg4;
        int var12 = this.field679 + arg6;
        int var13 = this.field699 + arg6;
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
        class41 var18;
        if (arg7) {
            var18 = new class41();
            var18.field691 = this.field691;
            var18.field680 = this.field680;
            var18.field686 = this.field686;
            var18.field675 = this.field675;
            var18.field710 = this.field710;
            var18.field712 = this.field712;
            var18.field707 = this.field707;
            var18.field714 = this.field714;
            var18.field705 = this.field705;
            var18.field720 = this.field720;
            var18.field700 = this.field700;
            var18.field676 = this.field676;
            var18.field711 = this.field711;
            var18.field678 = this.field678;
            var18.field708 = this.field708;
            var18.field698 = this.field698;
            var18.field709 = this.field709;
            var18.field692 = this.field692;
            var18.field688 = this.field688;
            var18.field677 = this.field677;
            var18.field703 = this.field703;
            var18.field684 = this.field684;
            var18.field713 = this.field713;
            var18.field689 = this.field689;
            var18.field673 = this.field673;
            var18.field690 = this.field690;
            var18.field694 = this.field694;
            var18.field695 = this.field695;
            var18.field716 = this.field716;
            var18.field696 = this.field696;
            var18.field702 = this.field702;
            var18.field685 = this.field685;
            var18.field721 = this.field721;
            var18.field681 = this.field681;
            if (arg0 == 3) {
                var18.field715 = class55.method388((byte) -55, this.field715);
                var18.field704 = class55.method388((byte) 126, this.field704);
                var18.field683 = class55.method388((byte) -118, this.field683);
            } else {
                var18.field715 = this.field715;
                var18.field704 = new int[var18.field691];
                var18.field683 = this.field683;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field691; var19++) {
                int var20 = this.field715[var19] + arg4;
                int var21 = this.field683[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field704[var19] = this.field704[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field691; var29++) {
                int var30 = (this.field704[var29] << 16) / this.field706;
                if (var30 < arg1) {
                    int var31 = this.field715[var29] + arg4;
                    int var32 = this.field683[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field704[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field704[var29];
                } else {
                    var18.field704[var29] = this.field704[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method298(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field693 - this.field706;
            for (int var43 = 0; var43 < this.field691; var43++) {
                int var44 = this.field715[var43] + arg4;
                int var45 = this.field683[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field704[var43] = var52 + this.field704[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field693 - this.field706;
            for (int var54 = 0; var54 < this.field691; var54++) {
                int var55 = this.field715[var54] + arg4;
                int var56 = this.field683[var54] + arg6;
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
                var18.field704[var54] = ((this.field704[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method290();
        } else {
            this.field697 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([[III)I")
    private static final int method312(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(III)V")
    public final void method313(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field718[arg2];
            int var5 = field687[arg2];
            for (int var6 = 0; var6 < this.field691; var6++) {
                int var7 = this.field715[var6] * var5 + this.field704[var6] * var4 >> 16;
                this.field704[var6] = this.field704[var6] * var5 - this.field715[var6] * var4 >> 16;
                this.field715[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field718[arg0];
            int var9 = field687[arg0];
            for (int var10 = 0; var10 < this.field691; var10++) {
                int var11 = this.field704[var10] * var9 - this.field683[var10] * var8 >> 16;
                this.field683[var10] = this.field704[var10] * var8 + this.field683[var10] * var9 >> 16;
                this.field704[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field718[arg1];
        int var13 = field687[arg1];
        for (int var14 = 0; var14 < this.field691; var14++) {
            int var15 = this.field715[var14] * var13 + this.field683[var14] * var12 >> 16;
            this.field683[var14] = this.field683[var14] * var13 - this.field715[var14] * var12 >> 16;
            this.field715[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(III)V")
    public final void method314(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field691; var4++) {
            this.field715[var4] += arg0;
            this.field704[var4] += arg1;
            this.field683[var4] += arg2;
        }
        this.method290();
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
    private class41() {
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "([B)V")
    private class41(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method288(arg0);
        } else {
            this.method294(arg0);
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(III)V")
    public class41(int arg0, int arg1, int arg2) {
        this.field715 = new int[arg0];
        this.field704 = new int[arg0];
        this.field683 = new int[arg0];
        this.field690 = new int[arg0];
        this.field675 = new int[arg1];
        this.field710 = new int[arg1];
        this.field712 = new int[arg1];
        this.field707 = new byte[arg1];
        this.field714 = new byte[arg1];
        this.field705 = new byte[arg1];
        this.field700 = new short[arg1];
        this.field676 = new short[arg1];
        this.field720 = new byte[arg1];
        this.field694 = new int[arg1];
        if (arg2 > 0) {
            this.field678 = new byte[arg2];
            this.field708 = new short[arg2];
            this.field698 = new short[arg2];
            this.field709 = new short[arg2];
            this.field692 = new short[arg2];
            this.field688 = new short[arg2];
            this.field677 = new short[arg2];
            this.field703 = new byte[arg2];
            this.field684 = new byte[arg2];
            this.field713 = new byte[arg2];
            this.field689 = new byte[arg2];
            this.field673 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "([Lib;I)V")
    public class41(class41[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field691 = 0;
        this.field680 = 0;
        this.field686 = 0;
        this.field711 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class41 var15 = arg0[var9];
            if (var15 != null) {
                this.field691 += var15.field691;
                this.field680 += var15.field680;
                this.field686 += var15.field686;
                if (var15.field714 == null) {
                    if (this.field711 == -1) {
                        this.field711 = var15.field711;
                    }
                    if (this.field711 != var15.field711) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var15.field707 != null;
                var5 |= var15.field705 != null;
                var6 |= var15.field694 != null;
                var7 |= var15.field676 != null;
                var8 |= var15.field720 != null;
            }
        }
        this.field715 = new int[this.field691];
        this.field704 = new int[this.field691];
        this.field683 = new int[this.field691];
        this.field690 = new int[this.field691];
        this.field675 = new int[this.field680];
        this.field710 = new int[this.field680];
        this.field712 = new int[this.field680];
        if (var3) {
            this.field707 = new byte[this.field680];
        }
        if (var4) {
            this.field714 = new byte[this.field680];
        }
        if (var5) {
            this.field705 = new byte[this.field680];
        }
        if (var6) {
            this.field694 = new int[this.field680];
        }
        if (var7) {
            this.field676 = new short[this.field680];
        }
        if (var8) {
            this.field720 = new byte[this.field680];
        }
        this.field700 = new short[this.field680];
        if (this.field686 > 0) {
            this.field678 = new byte[this.field686];
            this.field708 = new short[this.field686];
            this.field698 = new short[this.field686];
            this.field709 = new short[this.field686];
            this.field692 = new short[this.field686];
            this.field688 = new short[this.field686];
            this.field677 = new short[this.field686];
            this.field703 = new byte[this.field686];
            this.field684 = new byte[this.field686];
            this.field713 = new byte[this.field686];
            this.field689 = new byte[this.field686];
            this.field673 = new byte[this.field686];
        }
        this.field691 = 0;
        this.field680 = 0;
        this.field686 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            class41 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field680; var12++) {
                    if (var3 && var11.field707 != null) {
                        this.field707[this.field680] = var11.field707[var12];
                    }
                    if (var4) {
                        if (var11.field714 == null) {
                            this.field714[this.field680] = var11.field711;
                        } else {
                            this.field714[this.field680] = var11.field714[var12];
                        }
                    }
                    if (var5 && var11.field705 != null) {
                        this.field705[this.field680] = var11.field705[var12];
                    }
                    if (var6 && var11.field694 != null) {
                        this.field694[this.field680] = var11.field694[var12];
                    }
                    if (var7) {
                        if (var11.field676 == null) {
                            this.field676[this.field680] = -1;
                        } else {
                            this.field676[this.field680] = var11.field676[var12];
                        }
                    }
                    if (var8) {
                        if (var11.field720 == null || var11.field720[var12] == -1) {
                            this.field720[this.field680] = -1;
                        } else {
                            this.field720[this.field680] = (byte) (var11.field720[var12] + this.field686);
                        }
                    }
                    this.field700[this.field680] = var11.field700[var12];
                    this.field675[this.field680] = this.method300(var11, var11.field675[var12]);
                    this.field710[this.field680] = this.method300(var11, var11.field710[var12]);
                    this.field712[this.field680] = this.method300(var11, var11.field712[var12]);
                    this.field680++;
                }
                for (int var13 = 0; var13 < var11.field686; var13++) {
                    byte var14 = this.field678[this.field686] = var11.field678[var13];
                    if (var14 == 0) {
                        this.field708[this.field686] = (short) this.method300(var11, var11.field708[var13]);
                        this.field698[this.field686] = (short) this.method300(var11, var11.field698[var13]);
                        this.field709[this.field686] = (short) this.method300(var11, var11.field709[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field708[this.field686] = var11.field708[var13];
                        this.field698[this.field686] = var11.field698[var13];
                        this.field709[this.field686] = var11.field709[var13];
                        this.field692[this.field686] = var11.field692[var13];
                        this.field688[this.field686] = var11.field688[var13];
                        this.field677[this.field686] = var11.field677[var13];
                        this.field703[this.field686] = var11.field703[var13];
                        this.field684[this.field686] = var11.field684[var13];
                        this.field713[this.field686] = var11.field713[var13];
                    }
                    if (var14 == 2) {
                        this.field689[this.field686] = var11.field689[var13];
                        this.field673[this.field686] = var11.field673[var13];
                    }
                    this.field686++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lib;ZZZZ)V")
    public class41(class41 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field691 = arg0.field691;
        this.field680 = arg0.field680;
        this.field686 = arg0.field686;
        if (arg1) {
            this.field715 = arg0.field715;
            this.field704 = arg0.field704;
            this.field683 = arg0.field683;
        } else {
            this.field715 = new int[this.field691];
            this.field704 = new int[this.field691];
            this.field683 = new int[this.field691];
            for (int var6 = 0; var6 < this.field691; var6++) {
                this.field715[var6] = arg0.field715[var6];
                this.field704[var6] = arg0.field704[var6];
                this.field683[var6] = arg0.field683[var6];
            }
        }
        if (arg2) {
            this.field700 = arg0.field700;
        } else {
            this.field700 = new short[this.field680];
            for (int var7 = 0; var7 < this.field680; var7++) {
                this.field700[var7] = arg0.field700[var7];
            }
        }
        if (arg3 || arg0.field676 == null) {
            this.field676 = arg0.field676;
        } else {
            this.field676 = new short[this.field680];
            for (int var8 = 0; var8 < this.field680; var8++) {
                this.field676[var8] = arg0.field676[var8];
            }
        }
        if (arg4) {
            this.field705 = arg0.field705;
        } else {
            this.field705 = new byte[this.field680];
            if (arg0.field705 == null) {
                for (int var9 = 0; var9 < this.field680; var9++) {
                    this.field705[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field680; var10++) {
                    this.field705[var10] = arg0.field705[var10];
                }
            }
        }
        this.field675 = arg0.field675;
        this.field710 = arg0.field710;
        this.field712 = arg0.field712;
        this.field707 = arg0.field707;
        this.field714 = arg0.field714;
        this.field720 = arg0.field720;
        this.field711 = arg0.field711;
        this.field678 = arg0.field678;
        this.field708 = arg0.field708;
        this.field698 = arg0.field698;
        this.field709 = arg0.field709;
        this.field692 = arg0.field692;
        this.field688 = arg0.field688;
        this.field677 = arg0.field677;
        this.field703 = arg0.field703;
        this.field684 = arg0.field684;
        this.field713 = arg0.field713;
        this.field689 = arg0.field689;
        this.field673 = arg0.field673;
        this.field690 = arg0.field690;
        this.field694 = arg0.field694;
        this.field695 = arg0.field695;
        this.field716 = arg0.field716;
        this.field685 = arg0.field685;
        this.field721 = arg0.field721;
        this.field681 = arg0.field681;
        this.field696 = arg0.field696;
        this.field702 = arg0.field702;
    }
}
