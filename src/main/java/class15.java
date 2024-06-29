import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class15 extends class38 {

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "I")
    public int field443 = 0;

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "B")
    public byte field454 = 0;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "Z")
    private boolean field447 = false;

    @OriginalMember(owner = "client!bc", name = "hb", descriptor = "I")
    public int field480 = 0;

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "I")
    public int field462;

    @OriginalMember(owner = "client!bc", name = "nb", descriptor = "[I")
    public int[] field486;

    @OriginalMember(owner = "client!bc", name = "X", descriptor = "[I")
    public int[] field470;

    @OriginalMember(owner = "client!bc", name = "W", descriptor = "[I")
    public int[] field469;

    @OriginalMember(owner = "client!bc", name = "ab", descriptor = "[I")
    private int[] field473;

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "[I")
    public int[] field455;

    @OriginalMember(owner = "client!bc", name = "ob", descriptor = "[I")
    public int[] field487;

    @OriginalMember(owner = "client!bc", name = "Q", descriptor = "[I")
    public int[] field463;

    @OriginalMember(owner = "client!bc", name = "db", descriptor = "[B")
    public byte[] field476;

    @OriginalMember(owner = "client!bc", name = "ib", descriptor = "[B")
    public byte[] field481;

    @OriginalMember(owner = "client!bc", name = "L", descriptor = "[B")
    public byte[] field458;

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "[I")
    private int[] field452;

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "[S")
    public short[] field451;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "[B")
    public byte[] field445;

    @OriginalMember(owner = "client!bc", name = "qb", descriptor = "[S")
    public short[] field489;

    @OriginalMember(owner = "client!bc", name = "O", descriptor = "[B")
    public byte[] field461;

    @OriginalMember(owner = "client!bc", name = "R", descriptor = "[S")
    public short[] field464;

    @OriginalMember(owner = "client!bc", name = "S", descriptor = "[S")
    public short[] field465;

    @OriginalMember(owner = "client!bc", name = "pb", descriptor = "[S")
    public short[] field488;

    @OriginalMember(owner = "client!bc", name = "kb", descriptor = "[S")
    private short[] field483;

    @OriginalMember(owner = "client!bc", name = "N", descriptor = "[S")
    private short[] field460;

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "[S")
    private short[] field446;

    @OriginalMember(owner = "client!bc", name = "gb", descriptor = "[B")
    private byte[] field479;

    @OriginalMember(owner = "client!bc", name = "lb", descriptor = "[B")
    private byte[] field484;

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "[B")
    private byte[] field453;

    @OriginalMember(owner = "client!bc", name = "cb", descriptor = "[B")
    private byte[] field475;

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "[B")
    private byte[] field456;

    @OriginalMember(owner = "client!bc", name = "mb", descriptor = "[[I")
    public int[][] field485;

    @OriginalMember(owner = "client!bc", name = "jb", descriptor = "[[I")
    public int[][] field482;

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "[Lrh;")
    public class194[] field449;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "[Lkc;")
    public class112[] field444;

    @OriginalMember(owner = "client!bc", name = "T", descriptor = "[Lrh;")
    public class194[] field466;

    @OriginalMember(owner = "client!bc", name = "U", descriptor = "S")
    public short field467;

    @OriginalMember(owner = "client!bc", name = "Z", descriptor = "S")
    public short field472;

    @OriginalMember(owner = "client!bc", name = "V", descriptor = "I")
    private static int field468 = 0;

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "[I")
    private static int[] field459 = class89.field1646;

    @OriginalMember(owner = "client!bc", name = "eb", descriptor = "[I")
    private static int[] field477 = new int[10000];

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "[I")
    private static int[] field442 = new int[10000];

    @OriginalMember(owner = "client!bc", name = "rb", descriptor = "[I")
    private static int[] field490 = class89.field1650;

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "S")
    private short field448;

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "S")
    private short field450;

    @OriginalMember(owner = "client!bc", name = "K", descriptor = "S")
    private short field457;

    @OriginalMember(owner = "client!bc", name = "Y", descriptor = "S")
    private short field471;

    @OriginalMember(owner = "client!bc", name = "bb", descriptor = "S")
    private short field474;

    @OriginalMember(owner = "client!bc", name = "fb", descriptor = "S")
    private short field478;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(III)V")
    public final void method132(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field443; var4++) {
            this.field486[var4] = this.field486[var4] * arg0 / 128;
            this.field470[var4] = this.field470[var4] * arg1 / 128;
            this.field469[var4] = this.field469[var4] * arg2 / 128;
        }
        this.method163();
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(III)V")
    public final void method133(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field490[arg2];
            int var5 = field459[arg2];
            for (int var6 = 0; var6 < this.field443; var6++) {
                int var7 = this.field486[var6] * var5 + this.field470[var6] * var4 >> 16;
                this.field470[var6] = this.field470[var6] * var5 - this.field486[var6] * var4 >> 16;
                this.field486[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field490[arg0];
            int var9 = field459[arg0];
            for (int var10 = 0; var10 < this.field443; var10++) {
                int var11 = this.field470[var10] * var9 - this.field469[var10] * var8 >> 16;
                this.field469[var10] = this.field470[var10] * var8 + this.field469[var10] * var9 >> 16;
                this.field470[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field490[arg1];
        int var13 = field459[arg1];
        for (int var14 = 0; var14 < this.field443; var14++) {
            int var15 = this.field486[var14] * var13 + this.field469[var14] * var12 >> 16;
            this.field469[var14] = this.field469[var14] * var13 - this.field486[var14] * var12 >> 16;
            this.field486[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "()I")
    public final int method134() {
        if (!this.field447) {
            this.method141();
        }
        return this.field457;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "()V")
    public final void method135() {
        if (this.field449 != null) {
            return;
        }
        this.field449 = new class194[this.field443];
        for (int var1 = 0; var1 < this.field443; var1++) {
            this.field449[var1] = new class194();
        }
        for (int var2 = 0; var2 < this.field480; var2++) {
            int var3 = this.field455[var2];
            int var4 = this.field487[var2];
            int var5 = this.field463[var2];
            int var6 = this.field486[var4] - this.field486[var3];
            int var7 = this.field470[var4] - this.field470[var3];
            int var8 = this.field469[var4] - this.field469[var3];
            int var9 = this.field486[var5] - this.field486[var3];
            int var10 = this.field470[var5] - this.field470[var3];
            int var11 = this.field469[var5] - this.field469[var3];
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
            if (this.field476 == null) {
                var19 = 0;
            } else {
                var19 = this.field476[var2];
            }
            if (var19 == 0) {
                class194 var20 = this.field449[var3];
                var20.field3464 += var16;
                var20.field3461 += var17;
                var20.field3466 += var18;
                var20.field3471++;
                class194 var21 = this.field449[var4];
                var21.field3464 += var16;
                var21.field3461 += var17;
                var21.field3466 += var18;
                var21.field3471++;
                class194 var22 = this.field449[var5];
                var22.field3464 += var16;
                var22.field3461 += var17;
                var22.field3466 += var18;
                var22.field3471++;
            } else if (var19 == 1) {
                if (this.field444 == null) {
                    this.field444 = new class112[this.field480];
                }
                class112 var23 = this.field444[var2] = new class112();
                var23.field2101 = var16;
                var23.field2105 = var17;
                var23.field2100 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)Ldd;")
    public final class38 method136(int arg0, int arg1, int arg2) {
        return this.method159(this.field467, this.field472, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "()Lbc;")
    public final class15 method137() {
        class15 var1 = new class15();
        if (this.field476 != null) {
            var1.field476 = new byte[this.field480];
            for (int var2 = 0; var2 < this.field480; var2++) {
                var1.field476[var2] = this.field476[var2];
            }
        }
        var1.field443 = this.field443;
        var1.field480 = this.field480;
        var1.field462 = this.field462;
        var1.field486 = this.field486;
        var1.field470 = this.field470;
        var1.field469 = this.field469;
        var1.field455 = this.field455;
        var1.field487 = this.field487;
        var1.field463 = this.field463;
        var1.field481 = this.field481;
        var1.field458 = this.field458;
        var1.field445 = this.field445;
        var1.field489 = this.field489;
        var1.field451 = this.field451;
        var1.field454 = this.field454;
        var1.field461 = this.field461;
        var1.field464 = this.field464;
        var1.field465 = this.field465;
        var1.field488 = this.field488;
        var1.field483 = this.field483;
        var1.field460 = this.field460;
        var1.field446 = this.field446;
        var1.field479 = this.field479;
        var1.field484 = this.field484;
        var1.field453 = this.field453;
        var1.field475 = this.field475;
        var1.field456 = this.field456;
        var1.field473 = this.field473;
        var1.field452 = this.field452;
        var1.field485 = this.field485;
        var1.field482 = this.field482;
        var1.field449 = this.field449;
        var1.field444 = this.field444;
        var1.field467 = this.field467;
        var1.field472 = this.field472;
        return var1;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "([B)V")
    private final void method138(byte[] arg0) {
        class145 var2 = new class145(arg0);
        class145 var3 = new class145(arg0);
        class145 var4 = new class145(arg0);
        class145 var5 = new class145(arg0);
        class145 var6 = new class145(arg0);
        class145 var7 = new class145(arg0);
        class145 var8 = new class145(arg0);
        var2.field2643 = arg0.length - 23;
        int var9 = var2.method1049((byte) 108);
        int var10 = var2.method1049((byte) 121);
        int var11 = var2.method998(93);
        int var12 = var2.method998(79);
        int var13 = var2.method998(112);
        int var14 = var2.method998(90);
        int var15 = var2.method998(93);
        int var16 = var2.method998(99);
        int var17 = var2.method998(101);
        int var18 = var2.method1049((byte) 90);
        int var19 = var2.method1049((byte) 89);
        int var20 = var2.method1049((byte) 90);
        int var21 = var2.method1049((byte) 112);
        int var22 = var2.method1049((byte) 93);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field461 = new byte[var11];
            var2.field2643 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field461[var26] = var2.method994((byte) 105);
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
        this.field443 = var9;
        this.field480 = var10;
        this.field462 = var11;
        this.field486 = new int[var9];
        this.field470 = new int[var9];
        this.field469 = new int[var9];
        this.field455 = new int[var10];
        this.field487 = new int[var10];
        this.field463 = new int[var10];
        if (var17 == 1) {
            this.field473 = new int[var9];
        }
        if (var12 == 1) {
            this.field476 = new byte[var10];
        }
        if (var13 == 255) {
            this.field481 = new byte[var10];
        } else {
            this.field454 = (byte) var13;
        }
        if (var14 == 1) {
            this.field458 = new byte[var10];
        }
        if (var15 == 1) {
            this.field452 = new int[var10];
        }
        if (var16 == 1) {
            this.field451 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field445 = new byte[var10];
        }
        this.field489 = new short[var10];
        if (var11 > 0) {
            this.field464 = new short[var11];
            this.field465 = new short[var11];
            this.field488 = new short[var11];
            if (var24 > 0) {
                this.field483 = new short[var24];
                this.field460 = new short[var24];
                this.field446 = new short[var24];
                this.field479 = new byte[var24];
                this.field484 = new byte[var24];
                this.field453 = new byte[var24];
            }
            if (var25 > 0) {
                this.field475 = new byte[var25];
                this.field456 = new byte[var25];
            }
        }
        var2.field2643 = var11;
        var3.field2643 = var44;
        var4.field2643 = var46;
        var5.field2643 = var48;
        var6.field2643 = var36;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        for (int var66 = 0; var66 < var9; var66++) {
            int var79 = var2.method998(105);
            int var80 = 0;
            if ((var79 & 0x1) != 0) {
                var80 = var3.method1029((byte) 82);
            }
            int var81 = 0;
            if ((var79 & 0x2) != 0) {
                var81 = var4.method1029((byte) 114);
            }
            int var82 = 0;
            if ((var79 & 0x4) != 0) {
                var82 = var5.method1029((byte) -96);
            }
            this.field486[var66] = var63 + var80;
            this.field470[var66] = var64 + var81;
            this.field469[var66] = var65 + var82;
            var63 = this.field486[var66];
            var64 = this.field470[var66];
            var65 = this.field469[var66];
            if (var17 == 1) {
                this.field473[var66] = var6.method998(71);
            }
        }
        var2.field2643 = var42;
        var3.field2643 = var31;
        var4.field2643 = var34;
        var5.field2643 = var37;
        var6.field2643 = var35;
        var7.field2643 = var40;
        var8.field2643 = var39;
        for (int var67 = 0; var67 < var10; var67++) {
            this.field489[var67] = (short) var2.method1049((byte) 114);
            if (var12 == 1) {
                this.field476[var67] = var3.method994((byte) 118);
            }
            if (var13 == 255) {
                this.field481[var67] = var4.method994((byte) 50);
            }
            if (var14 == 1) {
                this.field458[var67] = var5.method994((byte) 97);
            }
            if (var15 == 1) {
                this.field452[var67] = var6.method998(78);
            }
            if (var16 == 1) {
                this.field451[var67] = (short) (var7.method1049((byte) 106) - 1);
            }
            if (this.field445 != null) {
                if (this.field451[var67] == -1) {
                    this.field445[var67] = -1;
                } else {
                    this.field445[var67] = (byte) (var8.method998(64) - 1);
                }
            }
        }
        var2.field2643 = var33;
        var3.field2643 = var30;
        int var68 = 0;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        for (int var72 = 0; var72 < var10; var72++) {
            int var75 = var3.method998(112);
            if (var75 == 1) {
                var68 = var2.method1029((byte) 126) + var71;
                var69 = var2.method1029((byte) 104) + var68;
                var70 = var2.method1029((byte) 88) + var69;
                var71 = var70;
                this.field455[var72] = var68;
                this.field487[var72] = var69;
                this.field463[var72] = var70;
            }
            if (var75 == 2) {
                var69 = var70;
                var70 = var2.method1029((byte) 71) + var71;
                var71 = var70;
                this.field455[var72] = var68;
                this.field487[var72] = var69;
                this.field463[var72] = var70;
            }
            if (var75 == 3) {
                var68 = var70;
                var70 = var2.method1029((byte) 117) + var71;
                var71 = var70;
                this.field455[var72] = var68;
                this.field487[var72] = var69;
                this.field463[var72] = var70;
            }
            if (var75 == 4) {
                int var78 = var68;
                var68 = var69;
                var69 = var78;
                var70 = var2.method1029((byte) 101) + var71;
                var71 = var70;
                this.field455[var72] = var68;
                this.field487[var72] = var78;
                this.field463[var72] = var70;
            }
        }
        var2.field2643 = var50;
        var3.field2643 = var52;
        var4.field2643 = var54;
        var5.field2643 = var56;
        var6.field2643 = var58;
        var7.field2643 = var60;
        for (int var73 = 0; var73 < var11; var73++) {
            int var74 = this.field461[var73] & 0xFF;
            if (var74 == 0) {
                this.field464[var73] = (short) var2.method1049((byte) 99);
                this.field465[var73] = (short) var2.method1049((byte) 106);
                this.field488[var73] = (short) var2.method1049((byte) 127);
            }
            if (var74 == 1) {
                this.field464[var73] = (short) var3.method1049((byte) 126);
                this.field465[var73] = (short) var3.method1049((byte) 106);
                this.field488[var73] = (short) var3.method1049((byte) 122);
                this.field483[var73] = (short) var4.method1049((byte) 92);
                this.field460[var73] = (short) var4.method1049((byte) 123);
                this.field446[var73] = (short) var4.method1049((byte) 113);
                this.field479[var73] = var5.method994((byte) 52);
                this.field484[var73] = var6.method994((byte) 37);
                this.field453[var73] = var7.method994((byte) 111);
            }
            if (var74 == 2) {
                this.field464[var73] = (short) var3.method1049((byte) 97);
                this.field465[var73] = (short) var3.method1049((byte) 126);
                this.field488[var73] = (short) var3.method1049((byte) 116);
                this.field483[var73] = (short) var4.method1049((byte) 88);
                this.field460[var73] = (short) var4.method1049((byte) 126);
                this.field446[var73] = (short) var4.method1049((byte) 119);
                this.field479[var73] = var5.method994((byte) 119);
                this.field484[var73] = var6.method994((byte) 116);
                this.field453[var73] = var7.method994((byte) 27);
                this.field475[var73] = var7.method994((byte) 61);
                this.field456[var73] = var7.method994((byte) 76);
            }
            if (var74 == 3) {
                this.field464[var73] = (short) var3.method1049((byte) 119);
                this.field465[var73] = (short) var3.method1049((byte) 122);
                this.field488[var73] = (short) var3.method1049((byte) 117);
                this.field483[var73] = (short) var4.method1049((byte) 125);
                this.field460[var73] = (short) var4.method1049((byte) 107);
                this.field446[var73] = (short) var4.method1049((byte) 105);
                this.field479[var73] = var5.method994((byte) 99);
                this.field484[var73] = var6.method994((byte) 81);
                this.field453[var73] = var7.method994((byte) 114);
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
    private final void method139(int arg0) {
        int var2 = field490[arg0];
        int var3 = field459[arg0];
        for (int var4 = 0; var4 < this.field443; var4++) {
            int var5 = this.field486[var4] * var3 + this.field470[var4] * var2 >> 16;
            this.field470[var4] = this.field470[var4] * var3 - this.field486[var4] * var2 >> 16;
            this.field486[var4] = var5;
        }
        this.method163();
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II[[I[[IIIIZZ)Lbc;")
    public final class15 method140(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method141();
        int var10 = this.field474 + arg4;
        int var11 = this.field471 + arg4;
        int var12 = this.field450 + arg6;
        int var13 = this.field448 + arg6;
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
        class15 var18;
        if (arg7) {
            var18 = new class15();
            var18.field443 = this.field443;
            var18.field480 = this.field480;
            var18.field462 = this.field462;
            var18.field455 = this.field455;
            var18.field487 = this.field487;
            var18.field463 = this.field463;
            var18.field476 = this.field476;
            var18.field481 = this.field481;
            var18.field458 = this.field458;
            var18.field445 = this.field445;
            var18.field489 = this.field489;
            var18.field451 = this.field451;
            var18.field454 = this.field454;
            var18.field461 = this.field461;
            var18.field464 = this.field464;
            var18.field465 = this.field465;
            var18.field488 = this.field488;
            var18.field483 = this.field483;
            var18.field460 = this.field460;
            var18.field446 = this.field446;
            var18.field479 = this.field479;
            var18.field484 = this.field484;
            var18.field453 = this.field453;
            var18.field475 = this.field475;
            var18.field456 = this.field456;
            var18.field473 = this.field473;
            var18.field452 = this.field452;
            var18.field485 = this.field485;
            var18.field482 = this.field482;
            var18.field467 = this.field467;
            var18.field472 = this.field472;
            var18.field449 = this.field449;
            var18.field444 = this.field444;
            var18.field466 = this.field466;
            if (arg0 == 3) {
                var18.field486 = class73.method512(0, this.field486);
                var18.field470 = class73.method512(0, this.field470);
                var18.field469 = class73.method512(0, this.field469);
            } else {
                var18.field486 = this.field486;
                var18.field470 = new int[var18.field443];
                var18.field469 = this.field469;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field443; var19++) {
                int var20 = this.field486[var19] + arg4;
                int var21 = this.field469[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field470[var19] = this.field470[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field443; var29++) {
                int var30 = (this.field470[var29] << 16) / this.field457;
                if (var30 < arg1) {
                    int var31 = this.field486[var29] + arg4;
                    int var32 = this.field469[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field470[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field470[var29];
                } else {
                    var18.field470[var29] = this.field470[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method162(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field478 - this.field457;
            for (int var43 = 0; var43 < this.field443; var43++) {
                int var44 = this.field486[var43] + arg4;
                int var45 = this.field469[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field470[var43] = var52 + this.field470[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field478 - this.field457;
            for (int var54 = 0; var54 < this.field443; var54++) {
                int var55 = this.field486[var54] + arg4;
                int var56 = this.field469[var54] + arg6;
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
                var18.field470[var54] = ((this.field470[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method163();
        } else {
            this.field447 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "()V")
    private final void method141() {
        if (this.field447) {
            return;
        }
        this.field447 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field443; var7++) {
            int var8 = this.field486[var7];
            int var9 = this.field470[var7];
            int var10 = this.field469[var7];
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
        this.field474 = (short) var1;
        this.field471 = (short) var4;
        this.field457 = (short) var2;
        this.field478 = (short) var5;
        this.field450 = (short) var3;
        this.field448 = (short) var6;
    }

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "()V")
    public final void method142() {
        for (int var1 = 0; var1 < this.field443; var1++) {
            int var2 = this.field486[var1];
            this.field486[var1] = this.field469[var1];
            this.field469[var1] = -var2;
        }
        this.method163();
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lai;II)Lbc;")
    public static final class15 method143(class10 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method104(-54, arg1, arg2);
        return var3 == null ? null : new class15(var3);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(SS)V")
    public final void method144(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field480; var3++) {
            if (this.field489[var3] == arg0) {
                this.field489[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V")
    public final void method145(int arg0) {
        int var2 = field490[arg0];
        int var3 = field459[arg0];
        for (int var4 = 0; var4 < this.field443; var4++) {
            int var5 = this.field486[var4] * var3 + this.field469[var4] * var2 >> 16;
            this.field469[var4] = this.field469[var4] * var3 - this.field486[var4] * var2 >> 16;
            this.field486[var4] = var5;
        }
        this.method163();
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "()Z")
    public final boolean method146() {
        return true;
    }

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "()V")
    public final void method147() {
        for (int var1 = 0; var1 < this.field443; var1++) {
            this.field486[var1] = -this.field486[var1];
            this.field469[var1] = -this.field469[var1];
        }
        this.method163();
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)V")
    private final void method148(int arg0) {
        int var2 = field490[arg0];
        int var3 = field459[arg0];
        for (int var4 = 0; var4 < this.field443; var4++) {
            int var5 = this.field470[var4] * var3 - this.field469[var4] * var2 >> 16;
            this.field469[var4] = this.field470[var4] * var2 + this.field469[var4] * var3 >> 16;
            this.field470[var4] = var5;
        }
        this.method163();
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIII)Lji;")
    public final class107 method149(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class107(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "([B)V")
    private final void method150(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class145 var4 = new class145(arg0);
        class145 var5 = new class145(arg0);
        class145 var6 = new class145(arg0);
        class145 var7 = new class145(arg0);
        class145 var8 = new class145(arg0);
        var4.field2643 = arg0.length - 18;
        int var9 = var4.method1049((byte) 112);
        int var10 = var4.method1049((byte) 98);
        int var11 = var4.method998(100);
        int var12 = var4.method998(65);
        int var13 = var4.method998(100);
        int var14 = var4.method998(109);
        int var15 = var4.method998(95);
        int var16 = var4.method998(90);
        int var17 = var4.method1049((byte) 111);
        int var18 = var4.method1049((byte) 103);
        int var19 = var4.method1049((byte) 115);
        int var20 = var4.method1049((byte) 97);
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
        this.field443 = var9;
        this.field480 = var10;
        this.field462 = var11;
        this.field486 = new int[var9];
        this.field470 = new int[var9];
        this.field469 = new int[var9];
        this.field455 = new int[var10];
        this.field487 = new int[var10];
        this.field463 = new int[var10];
        if (var11 > 0) {
            this.field461 = new byte[var11];
            this.field464 = new short[var11];
            this.field465 = new short[var11];
            this.field488 = new short[var11];
        }
        if (var16 == 1) {
            this.field473 = new int[var9];
        }
        if (var12 == 1) {
            this.field476 = new byte[var10];
            this.field445 = new byte[var10];
            this.field451 = new short[var10];
        }
        if (var13 == 255) {
            this.field481 = new byte[var10];
        } else {
            this.field454 = (byte) var13;
        }
        if (var14 == 1) {
            this.field458 = new byte[var10];
        }
        if (var15 == 1) {
            this.field452 = new int[var10];
        }
        this.field489 = new short[var10];
        var4.field2643 = var21;
        var5.field2643 = var36;
        var6.field2643 = var38;
        var7.field2643 = var40;
        var8.field2643 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method998(99);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method1029((byte) -76);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method1029((byte) -75);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method1029((byte) -75);
            }
            this.field486[var46] = var43 + var63;
            this.field470[var46] = var44 + var64;
            this.field469[var46] = var45 + var65;
            var43 = this.field486[var46];
            var44 = this.field470[var46];
            var45 = this.field469[var46];
            if (var16 == 1) {
                this.field473[var46] = var8.method998(66);
            }
        }
        var4.field2643 = var32;
        var5.field2643 = var28;
        var6.field2643 = var26;
        var7.field2643 = var30;
        var8.field2643 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field489[var47] = (short) var4.method1049((byte) 115);
            if (var12 == 1) {
                int var61 = var5.method998(63);
                if ((var61 & 0x1) == 1) {
                    this.field476[var47] = 1;
                    var2 = true;
                } else {
                    this.field476[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field445[var47] = (byte) (var61 >> 2);
                    this.field451[var47] = this.field489[var47];
                    this.field489[var47] = 127;
                    if (this.field451[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field445[var47] = -1;
                    this.field451[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field481[var47] = var6.method994((byte) 74);
            }
            if (var14 == 1) {
                this.field458[var47] = var7.method994((byte) 90);
            }
            if (var15 == 1) {
                this.field452[var47] = var8.method998(63);
            }
        }
        var4.field2643 = var25;
        var5.field2643 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method998(120);
            if (var57 == 1) {
                var48 = var4.method1029((byte) -104) + var51;
                var49 = var4.method1029((byte) -81) + var48;
                var50 = var4.method1029((byte) 97) + var49;
                var51 = var50;
                this.field455[var52] = var48;
                this.field487[var52] = var49;
                this.field463[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method1029((byte) 121) + var51;
                var51 = var50;
                this.field455[var52] = var48;
                this.field487[var52] = var49;
                this.field463[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method1029((byte) 82) + var51;
                var51 = var50;
                this.field455[var52] = var48;
                this.field487[var52] = var49;
                this.field463[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method1029((byte) 95) + var51;
                var51 = var50;
                this.field455[var52] = var48;
                this.field487[var52] = var60;
                this.field463[var52] = var50;
            }
        }
        var4.field2643 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field461[var53] = 0;
            this.field464[var53] = (short) var4.method1049((byte) 99);
            this.field465[var53] = (short) var4.method1049((byte) 110);
            this.field488[var53] = (short) var4.method1049((byte) 116);
        }
        if (this.field445 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field445[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field464[var56] & 0xFFFF) == this.field455[var55] && (this.field465[var56] & 0xFFFF) == this.field487[var55] && (this.field488[var56] & 0xFFFF) == this.field463[var55]) {
                        this.field445[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field445 = null;
            }
        }
        if (!var3) {
            this.field451 = null;
        }
        if (!var2) {
            this.field476 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(SS)V")
    public final void method151(short arg0, short arg1) {
        if (this.field451 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field480; var3++) {
            if (this.field451[var3] == arg0) {
                this.field451[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ldd;IIIZ)V")
    public final void method152(class38 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class15 var6 = (class15) arg0;
        var6.method141();
        var6.method135();
        field468++;
        int var7 = 0;
        int[] var8 = var6.field486;
        int var9 = var6.field443;
        for (int var10 = 0; var10 < this.field443; var10++) {
            class194 var13 = this.field449[var10];
            if (var13.field3471 != 0) {
                int var14 = this.field470[var10] - arg2;
                if (var14 >= var6.field457 && var14 <= var6.field478) {
                    int var15 = this.field486[var10] - arg1;
                    if (var15 >= var6.field474 && var15 <= var6.field471) {
                        int var16 = this.field469[var10] - arg3;
                        if (var16 >= var6.field450 && var16 <= var6.field448) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class194 var18 = var6.field449[var17];
                                if (var8[var17] == var15 && var6.field469[var17] == var16 && var6.field470[var17] == var14 && var18.field3471 != 0) {
                                    if (this.field466 == null) {
                                        this.field466 = new class194[this.field443];
                                    }
                                    if (var6.field466 == null) {
                                        var6.field466 = new class194[var9];
                                    }
                                    class194 var19 = this.field466[var10];
                                    if (var19 == null) {
                                        var19 = this.field466[var10] = new class194(var13);
                                    }
                                    class194 var20 = var6.field466[var17];
                                    if (var20 == null) {
                                        var20 = var6.field466[var17] = new class194(var18);
                                    }
                                    var19.field3464 += var18.field3464;
                                    var19.field3461 += var18.field3461;
                                    var19.field3466 += var18.field3466;
                                    var19.field3471 += var18.field3471;
                                    var20.field3464 += var13.field3464;
                                    var20.field3461 += var13.field3461;
                                    var20.field3466 += var13.field3466;
                                    var20.field3471 += var13.field3471;
                                    var7++;
                                    field477[var10] = field468;
                                    field442[var17] = field468;
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
        for (int var11 = 0; var11 < this.field480; var11++) {
            if (field477[this.field455[var11]] == field468 && field477[this.field487[var11]] == field468 && field477[this.field463[var11]] == field468) {
                if (this.field476 == null) {
                    this.field476 = new byte[this.field480];
                }
                this.field476[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field480; var12++) {
            if (field442[var6.field455[var12]] == field468 && field442[var6.field487[var12]] == field468 && field442[var6.field463[var12]] == field468) {
                if (var6.field476 == null) {
                    var6.field476 = new byte[var6.field480];
                }
                var6.field476[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "()V")
    public final void method153() {
        for (int var1 = 0; var1 < this.field443; var1++) {
            this.field469[var1] = -this.field469[var1];
        }
        for (int var2 = 0; var2 < this.field480; var2++) {
            int var3 = this.field455[var2];
            this.field455[var2] = this.field463[var2];
            this.field463[var2] = var3;
        }
        this.method163();
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(III)V")
    public final void method154(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field443; var4++) {
            this.field486[var4] += arg0;
            this.field470[var4] += arg1;
            this.field469[var4] += arg2;
        }
        this.method163();
    }

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "()V")
    public final void method155() {
        for (int var1 = 0; var1 < this.field443; var1++) {
            int var2 = this.field469[var1];
            this.field469[var1] = this.field486[var1];
            this.field486[var1] = -var2;
        }
        this.method163();
    }

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "()V")
    public final void method156() {
        this.field473 = null;
        this.field452 = null;
        this.field485 = null;
        this.field482 = null;
    }

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "()V")
    public static void method157() {
        field477 = null;
        field442 = null;
        field490 = null;
        field459 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(IIIII)Lcf;")
    public final class29 method159(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class107(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lbc;I)I")
    private final int method160(class15 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field486[arg1];
        int var5 = arg0.field470[arg1];
        int var6 = arg0.field469[arg1];
        for (int var7 = 0; var7 < this.field443; var7++) {
            if (this.field486[var7] == var4 && this.field470[var7] == var5 && this.field469[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field486[this.field443] = var4;
            this.field470[this.field443] = var5;
            this.field469[this.field443] = var6;
            if (arg0.field473 != null) {
                this.field473[this.field443] = arg0.field473[arg1];
            }
            var3 = this.field443++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "([[III)I")
    private static final int method161(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "([[IIIIII)V")
    private final void method162(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method161(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method161(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method161(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method161(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
        if (var26 != 0) {
            this.method148(var26);
        }
        int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
        if (var27 != 0) {
            this.method139(var27);
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method154(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "()V")
    private final void method163() {
        this.field449 = null;
        this.field466 = null;
        this.field444 = null;
        this.field447 = false;
    }

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "()V")
    public final void method164() {
        int var10002;
        if (this.field473 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field443; var3++) {
                int var7 = this.field473[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field485 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field485[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field443) {
                int var6 = this.field473[var5];
                this.field485[var6][var1[var6]++] = var5++;
            }
            this.field473 = null;
        }
        if (this.field452 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field480; var10++) {
            int var14 = this.field452[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field482 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field482[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field480) {
            int var13 = this.field452[var12];
            this.field482[var13][var8[var13]++] = var12++;
        }
        this.field452 = null;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
    private class15() {
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "([B)V")
    private class15(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method138(arg0);
        } else {
            this.method150(arg0);
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "([Lbc;I)V")
    public class15(class15[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field443 = 0;
        this.field480 = 0;
        this.field462 = 0;
        this.field454 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class15 var15 = arg0[var9];
            if (var15 != null) {
                this.field443 += var15.field443;
                this.field480 += var15.field480;
                this.field462 += var15.field462;
                if (var15.field481 == null) {
                    if (this.field454 == -1) {
                        this.field454 = var15.field454;
                    }
                    if (this.field454 != var15.field454) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var15.field476 != null;
                var5 |= var15.field458 != null;
                var6 |= var15.field452 != null;
                var7 |= var15.field451 != null;
                var8 |= var15.field445 != null;
            }
        }
        this.field486 = new int[this.field443];
        this.field470 = new int[this.field443];
        this.field469 = new int[this.field443];
        this.field473 = new int[this.field443];
        this.field455 = new int[this.field480];
        this.field487 = new int[this.field480];
        this.field463 = new int[this.field480];
        if (var3) {
            this.field476 = new byte[this.field480];
        }
        if (var4) {
            this.field481 = new byte[this.field480];
        }
        if (var5) {
            this.field458 = new byte[this.field480];
        }
        if (var6) {
            this.field452 = new int[this.field480];
        }
        if (var7) {
            this.field451 = new short[this.field480];
        }
        if (var8) {
            this.field445 = new byte[this.field480];
        }
        this.field489 = new short[this.field480];
        if (this.field462 > 0) {
            this.field461 = new byte[this.field462];
            this.field464 = new short[this.field462];
            this.field465 = new short[this.field462];
            this.field488 = new short[this.field462];
            this.field483 = new short[this.field462];
            this.field460 = new short[this.field462];
            this.field446 = new short[this.field462];
            this.field479 = new byte[this.field462];
            this.field484 = new byte[this.field462];
            this.field453 = new byte[this.field462];
            this.field475 = new byte[this.field462];
            this.field456 = new byte[this.field462];
        }
        this.field443 = 0;
        this.field480 = 0;
        this.field462 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            class15 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field480; var12++) {
                    if (var3 && var11.field476 != null) {
                        this.field476[this.field480] = var11.field476[var12];
                    }
                    if (var4) {
                        if (var11.field481 == null) {
                            this.field481[this.field480] = var11.field454;
                        } else {
                            this.field481[this.field480] = var11.field481[var12];
                        }
                    }
                    if (var5 && var11.field458 != null) {
                        this.field458[this.field480] = var11.field458[var12];
                    }
                    if (var6 && var11.field452 != null) {
                        this.field452[this.field480] = var11.field452[var12];
                    }
                    if (var7) {
                        if (var11.field451 == null) {
                            this.field451[this.field480] = -1;
                        } else {
                            this.field451[this.field480] = var11.field451[var12];
                        }
                    }
                    if (var8) {
                        if (var11.field445 == null || var11.field445[var12] == -1) {
                            this.field445[this.field480] = -1;
                        } else {
                            this.field445[this.field480] = (byte) (var11.field445[var12] + this.field462);
                        }
                    }
                    this.field489[this.field480] = var11.field489[var12];
                    this.field455[this.field480] = this.method160(var11, var11.field455[var12]);
                    this.field487[this.field480] = this.method160(var11, var11.field487[var12]);
                    this.field463[this.field480] = this.method160(var11, var11.field463[var12]);
                    this.field480++;
                }
                for (int var13 = 0; var13 < var11.field462; var13++) {
                    byte var14 = this.field461[this.field462] = var11.field461[var13];
                    if (var14 == 0) {
                        this.field464[this.field462] = (short) this.method160(var11, var11.field464[var13]);
                        this.field465[this.field462] = (short) this.method160(var11, var11.field465[var13]);
                        this.field488[this.field462] = (short) this.method160(var11, var11.field488[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field464[this.field462] = var11.field464[var13];
                        this.field465[this.field462] = var11.field465[var13];
                        this.field488[this.field462] = var11.field488[var13];
                        this.field483[this.field462] = var11.field483[var13];
                        this.field460[this.field462] = var11.field460[var13];
                        this.field446[this.field462] = var11.field446[var13];
                        this.field479[this.field462] = var11.field479[var13];
                        this.field484[this.field462] = var11.field484[var13];
                        this.field453[this.field462] = var11.field453[var13];
                    }
                    if (var14 == 2) {
                        this.field475[this.field462] = var11.field475[var13];
                        this.field456[this.field462] = var11.field456[var13];
                    }
                    this.field462++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lbc;ZZZZ)V")
    public class15(class15 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field443 = arg0.field443;
        this.field480 = arg0.field480;
        this.field462 = arg0.field462;
        if (arg1) {
            this.field486 = arg0.field486;
            this.field470 = arg0.field470;
            this.field469 = arg0.field469;
        } else {
            this.field486 = new int[this.field443];
            this.field470 = new int[this.field443];
            this.field469 = new int[this.field443];
            for (int var6 = 0; var6 < this.field443; var6++) {
                this.field486[var6] = arg0.field486[var6];
                this.field470[var6] = arg0.field470[var6];
                this.field469[var6] = arg0.field469[var6];
            }
        }
        if (arg2) {
            this.field489 = arg0.field489;
        } else {
            this.field489 = new short[this.field480];
            for (int var7 = 0; var7 < this.field480; var7++) {
                this.field489[var7] = arg0.field489[var7];
            }
        }
        if (arg3 || arg0.field451 == null) {
            this.field451 = arg0.field451;
        } else {
            this.field451 = new short[this.field480];
            for (int var8 = 0; var8 < this.field480; var8++) {
                this.field451[var8] = arg0.field451[var8];
            }
        }
        if (arg4) {
            this.field458 = arg0.field458;
        } else {
            this.field458 = new byte[this.field480];
            if (arg0.field458 == null) {
                for (int var9 = 0; var9 < this.field480; var9++) {
                    this.field458[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field480; var10++) {
                    this.field458[var10] = arg0.field458[var10];
                }
            }
        }
        this.field455 = arg0.field455;
        this.field487 = arg0.field487;
        this.field463 = arg0.field463;
        this.field476 = arg0.field476;
        this.field481 = arg0.field481;
        this.field445 = arg0.field445;
        this.field454 = arg0.field454;
        this.field461 = arg0.field461;
        this.field464 = arg0.field464;
        this.field465 = arg0.field465;
        this.field488 = arg0.field488;
        this.field483 = arg0.field483;
        this.field460 = arg0.field460;
        this.field446 = arg0.field446;
        this.field479 = arg0.field479;
        this.field484 = arg0.field484;
        this.field453 = arg0.field453;
        this.field475 = arg0.field475;
        this.field456 = arg0.field456;
        this.field473 = arg0.field473;
        this.field452 = arg0.field452;
        this.field485 = arg0.field485;
        this.field482 = arg0.field482;
        this.field449 = arg0.field449;
        this.field444 = arg0.field444;
        this.field466 = arg0.field466;
        this.field467 = arg0.field467;
        this.field472 = arg0.field472;
    }
}
