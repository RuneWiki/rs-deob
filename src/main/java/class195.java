import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class195 extends class234 {

    @OriginalMember(owner = "client!se", name = "P", descriptor = "I")
    public int field3446 = 0;

    @OriginalMember(owner = "client!se", name = "T", descriptor = "Z")
    private boolean field3450 = false;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "B")
    public byte field3421 = 0;

    @OriginalMember(owner = "client!se", name = "M", descriptor = "I")
    public int field3443 = 0;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public int field3416;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "[I")
    public int[] field3428;

    @OriginalMember(owner = "client!se", name = "hb", descriptor = "[I")
    public int[] field3464;

    @OriginalMember(owner = "client!se", name = "R", descriptor = "[I")
    public int[] field3448;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "[I")
    private int[] field3432;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "[I")
    public int[] field3418;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "[I")
    public int[] field3425;

    @OriginalMember(owner = "client!se", name = "A", descriptor = "[I")
    public int[] field3431;

    @OriginalMember(owner = "client!se", name = "cb", descriptor = "[B")
    public byte[] field3459;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "[B")
    public byte[] field3420;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "[B")
    public byte[] field3427;

    @OriginalMember(owner = "client!se", name = "gb", descriptor = "[I")
    private int[] field3463;

    @OriginalMember(owner = "client!se", name = "Y", descriptor = "[S")
    public short[] field3455;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "[B")
    public byte[] field3435;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "[S")
    public short[] field3423;

    @OriginalMember(owner = "client!se", name = "db", descriptor = "[B")
    public byte[] field3460;

    @OriginalMember(owner = "client!se", name = "S", descriptor = "[S")
    public short[] field3449;

    @OriginalMember(owner = "client!se", name = "W", descriptor = "[S")
    public short[] field3453;

    @OriginalMember(owner = "client!se", name = "V", descriptor = "[S")
    public short[] field3452;

    @OriginalMember(owner = "client!se", name = "O", descriptor = "[S")
    private short[] field3445;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "[S")
    private short[] field3422;

    @OriginalMember(owner = "client!se", name = "bb", descriptor = "[S")
    private short[] field3458;

    @OriginalMember(owner = "client!se", name = "J", descriptor = "[B")
    private byte[] field3440;

    @OriginalMember(owner = "client!se", name = "eb", descriptor = "[B")
    private byte[] field3461;

    @OriginalMember(owner = "client!se", name = "L", descriptor = "[B")
    private byte[] field3442;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "[B")
    private byte[] field3430;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "[B")
    private byte[] field3424;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "[[I")
    public int[][] field3434;

    @OriginalMember(owner = "client!se", name = "F", descriptor = "[[I")
    public int[][] field3436;

    @OriginalMember(owner = "client!se", name = "ab", descriptor = "[Lgj;")
    public class76[] field3457;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "[Lgg;")
    public class73[] field3417;

    @OriginalMember(owner = "client!se", name = "G", descriptor = "[Lgj;")
    public class76[] field3437;

    @OriginalMember(owner = "client!se", name = "X", descriptor = "S")
    public short field3454;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "S")
    public short field3433;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "[I")
    private static int[] field3426 = new int[10000];

    @OriginalMember(owner = "client!se", name = "I", descriptor = "[I")
    private static int[] field3439 = class206.field3684;

    @OriginalMember(owner = "client!se", name = "U", descriptor = "[I")
    private static int[] field3451 = class206.field3700;

    @OriginalMember(owner = "client!se", name = "N", descriptor = "[I")
    private static int[] field3444 = new int[10000];

    @OriginalMember(owner = "client!se", name = "Z", descriptor = "I")
    private static int field3456 = 0;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "S")
    private short field3419;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "S")
    private short field3429;

    @OriginalMember(owner = "client!se", name = "H", descriptor = "S")
    private short field3438;

    @OriginalMember(owner = "client!se", name = "K", descriptor = "S")
    private short field3441;

    @OriginalMember(owner = "client!se", name = "Q", descriptor = "S")
    private short field3447;

    @OriginalMember(owner = "client!se", name = "fb", descriptor = "S")
    private short field3462;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "()V")
    public final void method1246() {
        for (int var1 = 0; var1 < this.field3443; var1++) {
            int var2 = this.field3448[var1];
            this.field3448[var1] = this.field3428[var1];
            this.field3428[var1] = -var2;
        }
        this.method1260();
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(SS)V")
    public final void method1247(short arg0, short arg1) {
        if (this.field3455 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field3446; var3++) {
            if (this.field3455[var3] == arg0) {
                this.field3455[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lse;I)I")
    private final int method1248(class195 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field3428[arg1];
        int var5 = arg0.field3464[arg1];
        int var6 = arg0.field3448[arg1];
        for (int var7 = 0; var7 < this.field3443; var7++) {
            if (this.field3428[var7] == var4 && this.field3464[var7] == var5 && this.field3448[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field3428[this.field3443] = var4;
            this.field3464[this.field3443] = var5;
            this.field3448[this.field3443] = var6;
            if (arg0.field3432 != null) {
                this.field3432[this.field3443] = arg0.field3432[arg1];
            }
            var3 = this.field3443++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(SS)V")
    public final void method1249(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3446; var3++) {
            if (this.field3423[var3] == arg0) {
                this.field3423[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([B)V")
    private final void method1250(byte[] arg0) {
        class66 var2 = new class66(arg0);
        class66 var3 = new class66(arg0);
        class66 var4 = new class66(arg0);
        class66 var5 = new class66(arg0);
        class66 var6 = new class66(arg0);
        class66 var7 = new class66(arg0);
        class66 var8 = new class66(arg0);
        var2.field1195 = arg0.length - 23;
        int var9 = var2.method500(55);
        int var10 = var2.method500(114);
        int var11 = var2.method506(255);
        int var12 = var2.method506(255);
        int var13 = var2.method506(255);
        int var14 = var2.method506(255);
        int var15 = var2.method506(255);
        int var16 = var2.method506(255);
        int var17 = var2.method506(255);
        int var18 = var2.method500(38);
        int var19 = var2.method500(103);
        int var20 = var2.method500(42);
        int var21 = var2.method500(107);
        int var22 = var2.method500(79);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field3460 = new byte[var11];
            var2.field1195 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field3460[var26] = var2.method505(false);
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
        this.field3443 = var9;
        this.field3446 = var10;
        this.field3416 = var11;
        this.field3428 = new int[var9];
        this.field3464 = new int[var9];
        this.field3448 = new int[var9];
        this.field3418 = new int[var10];
        this.field3425 = new int[var10];
        this.field3431 = new int[var10];
        if (var17 == 1) {
            this.field3432 = new int[var9];
        }
        if (var12 == 1) {
            this.field3459 = new byte[var10];
        }
        if (var13 == 255) {
            this.field3420 = new byte[var10];
        } else {
            this.field3421 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3427 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3463 = new int[var10];
        }
        if (var16 == 1) {
            this.field3455 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field3435 = new byte[var10];
        }
        this.field3423 = new short[var10];
        if (var11 > 0) {
            this.field3449 = new short[var11];
            this.field3453 = new short[var11];
            this.field3452 = new short[var11];
            if (var24 > 0) {
                this.field3445 = new short[var24];
                this.field3422 = new short[var24];
                this.field3458 = new short[var24];
                this.field3440 = new byte[var24];
                this.field3461 = new byte[var24];
                this.field3442 = new byte[var24];
            }
            if (var25 > 0) {
                this.field3430 = new byte[var25];
                this.field3424 = new byte[var25];
            }
        }
        var2.field1195 = var11;
        var3.field1195 = var44;
        var4.field1195 = var46;
        var5.field1195 = var48;
        var6.field1195 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var81 = var2.method506(255);
            int var82 = 0;
            if ((var81 & 0x1) != 0) {
                var82 = var3.method494((byte) 119);
            }
            int var83 = 0;
            if ((var81 & 0x2) != 0) {
                var83 = var4.method494((byte) 61);
            }
            int var84 = 0;
            if ((var81 & 0x4) != 0) {
                var84 = var5.method494((byte) 57);
            }
            this.field3428[var67] = var64 + var82;
            this.field3464[var67] = var65 + var83;
            this.field3448[var67] = var66 + var84;
            var64 = this.field3428[var67];
            var65 = this.field3464[var67];
            var66 = this.field3448[var67];
            if (var17 == 1) {
                this.field3432[var67] = var6.method506(255);
            }
        }
        var2.field1195 = var42;
        var3.field1195 = var31;
        var4.field1195 = var34;
        var5.field1195 = var37;
        var6.field1195 = var35;
        var7.field1195 = var40;
        var8.field1195 = var39;
        for (int var68 = 0; var68 < var10; var68++) {
            this.field3423[var68] = (short) var2.method500(110);
            if (var12 == 1) {
                this.field3459[var68] = var3.method505(false);
            }
            if (var13 == 255) {
                this.field3420[var68] = var4.method505(false);
            }
            if (var14 == 1) {
                this.field3427[var68] = var5.method505(false);
            }
            if (var15 == 1) {
                this.field3463[var68] = var6.method506(255);
            }
            if (var16 == 1) {
                this.field3455[var68] = (short) (var7.method500(114) - 1);
            }
            if (this.field3435 != null) {
                if (this.field3455[var68] == -1) {
                    this.field3435[var68] = -1;
                } else {
                    this.field3435[var68] = (byte) (var8.method506(255) - 1);
                }
            }
        }
        var2.field1195 = var33;
        var3.field1195 = var30;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        int var72 = 0;
        for (int var73 = 0; var73 < var10; var73++) {
            int var77 = var3.method506(255);
            if (var77 == 1) {
                var69 = var2.method494((byte) 58) + var72;
                var70 = var2.method494((byte) 13) + var69;
                var71 = var2.method494((byte) 120) + var70;
                var72 = var71;
                this.field3418[var73] = var69;
                this.field3425[var73] = var70;
                this.field3431[var73] = var71;
            }
            if (var77 == 2) {
                var70 = var71;
                var71 = var2.method494((byte) 47) + var72;
                var72 = var71;
                this.field3418[var73] = var69;
                this.field3425[var73] = var70;
                this.field3431[var73] = var71;
            }
            if (var77 == 3) {
                var69 = var71;
                var71 = var2.method494((byte) 57) + var72;
                var72 = var71;
                this.field3418[var73] = var69;
                this.field3425[var73] = var70;
                this.field3431[var73] = var71;
            }
            if (var77 == 4) {
                int var80 = var69;
                var69 = var70;
                var70 = var80;
                var71 = var2.method494((byte) 101) + var72;
                var72 = var71;
                this.field3418[var73] = var69;
                this.field3425[var73] = var80;
                this.field3431[var73] = var71;
            }
        }
        var2.field1195 = var50;
        var3.field1195 = var52;
        var4.field1195 = var54;
        var5.field1195 = var56;
        var6.field1195 = var58;
        var7.field1195 = var60;
        for (int var74 = 0; var74 < var11; var74++) {
            int var76 = this.field3460[var74] & 0xFF;
            if (var76 == 0) {
                this.field3449[var74] = (short) var2.method500(55);
                this.field3453[var74] = (short) var2.method500(100);
                this.field3452[var74] = (short) var2.method500(120);
            }
            if (var76 == 1) {
                this.field3449[var74] = (short) var3.method500(42);
                this.field3453[var74] = (short) var3.method500(113);
                this.field3452[var74] = (short) var3.method500(49);
                this.field3445[var74] = (short) var4.method500(110);
                this.field3422[var74] = (short) var4.method500(47);
                this.field3458[var74] = (short) var4.method500(60);
                this.field3440[var74] = var5.method505(false);
                this.field3461[var74] = var6.method505(false);
                this.field3442[var74] = var7.method505(false);
            }
            if (var76 == 2) {
                this.field3449[var74] = (short) var3.method500(115);
                this.field3453[var74] = (short) var3.method500(74);
                this.field3452[var74] = (short) var3.method500(45);
                this.field3445[var74] = (short) var4.method500(126);
                this.field3422[var74] = (short) var4.method500(101);
                this.field3458[var74] = (short) var4.method500(96);
                this.field3440[var74] = var5.method505(false);
                this.field3461[var74] = var6.method505(false);
                this.field3442[var74] = var7.method505(false);
                this.field3430[var74] = var7.method505(false);
                this.field3424[var74] = var7.method505(false);
            }
            if (var76 == 3) {
                this.field3449[var74] = (short) var3.method500(50);
                this.field3453[var74] = (short) var3.method500(100);
                this.field3452[var74] = (short) var3.method500(64);
                this.field3445[var74] = (short) var4.method500(62);
                this.field3422[var74] = (short) var4.method500(55);
                this.field3458[var74] = (short) var4.method500(85);
                this.field3440[var74] = var5.method505(false);
                this.field3461[var74] = var6.method505(false);
                this.field3442[var74] = var7.method505(false);
            }
        }
        var2.field1195 = var62;
        int var75 = var2.method506(255);
        if (var75 != 0) {
            var2.method500(50);
            var2.method500(92);
            var2.method500(47);
            var2.method528(true);
        }
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "()V")
    public final void method1251() {
        this.field3432 = null;
        this.field3463 = null;
        this.field3434 = null;
        this.field3436 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method42(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)Lwd;")
    public final class234 method1252(int arg0, int arg1, int arg2) {
        return this.method1257(this.field3454, this.field3433, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "()V")
    public final void method1253() {
        for (int var1 = 0; var1 < this.field3443; var1++) {
            int var2 = this.field3428[var1];
            this.field3428[var1] = this.field3448[var1];
            this.field3448[var1] = -var2;
        }
        this.method1260();
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lwd;IIIZ)V")
    public final void method1254(class234 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class195 var6 = (class195) arg0;
        var6.method1255();
        var6.method1259();
        field3456++;
        int var7 = 0;
        int[] var8 = var6.field3428;
        int var9 = var6.field3443;
        for (int var10 = 0; var10 < this.field3443; var10++) {
            class76 var13 = this.field3457[var10];
            if (var13.field1485 != 0) {
                int var14 = this.field3464[var10] - arg2;
                if (var14 >= var6.field3441 && var14 <= var6.field3438) {
                    int var15 = this.field3428[var10] - arg1;
                    if (var15 >= var6.field3419 && var15 <= var6.field3462) {
                        int var16 = this.field3448[var10] - arg3;
                        if (var16 >= var6.field3429 && var16 <= var6.field3447) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class76 var18 = var6.field3457[var17];
                                if (var8[var17] == var15 && var6.field3448[var17] == var16 && var6.field3464[var17] == var14 && var18.field1485 != 0) {
                                    if (this.field3437 == null) {
                                        this.field3437 = new class76[this.field3443];
                                    }
                                    if (var6.field3437 == null) {
                                        var6.field3437 = new class76[var9];
                                    }
                                    class76 var19 = this.field3437[var10];
                                    if (var19 == null) {
                                        var19 = this.field3437[var10] = new class76(var13);
                                    }
                                    class76 var20 = var6.field3437[var17];
                                    if (var20 == null) {
                                        var20 = var6.field3437[var17] = new class76(var18);
                                    }
                                    var19.field1462 += var18.field1462;
                                    var19.field1470 += var18.field1470;
                                    var19.field1483 += var18.field1483;
                                    var19.field1485 += var18.field1485;
                                    var20.field1462 += var13.field1462;
                                    var20.field1470 += var13.field1470;
                                    var20.field1483 += var13.field1483;
                                    var20.field1485 += var13.field1485;
                                    var7++;
                                    field3426[var10] = field3456;
                                    field3444[var17] = field3456;
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
        for (int var11 = 0; var11 < this.field3446; var11++) {
            if (field3426[this.field3418[var11]] == field3456 && field3426[this.field3425[var11]] == field3456 && field3426[this.field3431[var11]] == field3456) {
                if (this.field3459 == null) {
                    this.field3459 = new byte[this.field3446];
                }
                this.field3459[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field3446; var12++) {
            if (field3444[var6.field3418[var12]] == field3456 && field3444[var6.field3425[var12]] == field3456 && field3444[var6.field3431[var12]] == field3456) {
                if (var6.field3459 == null) {
                    var6.field3459 = new byte[var6.field3446];
                }
                var6.field3459[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "f", descriptor = "()V")
    private final void method1255() {
        if (this.field3450) {
            return;
        }
        this.field3450 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field3443; var7++) {
            int var8 = this.field3428[var7];
            int var9 = this.field3464[var7];
            int var10 = this.field3448[var7];
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
        this.field3419 = (short) var1;
        this.field3462 = (short) var4;
        this.field3441 = (short) var2;
        this.field3438 = (short) var5;
        this.field3429 = (short) var3;
        this.field3447 = (short) var6;
    }

    @OriginalMember(owner = "client!se", name = "g", descriptor = "()Lse;")
    public final class195 method1256() {
        class195 var1 = new class195();
        if (this.field3459 != null) {
            var1.field3459 = new byte[this.field3446];
            for (int var2 = 0; var2 < this.field3446; var2++) {
                var1.field3459[var2] = this.field3459[var2];
            }
        }
        var1.field3443 = this.field3443;
        var1.field3446 = this.field3446;
        var1.field3416 = this.field3416;
        var1.field3428 = this.field3428;
        var1.field3464 = this.field3464;
        var1.field3448 = this.field3448;
        var1.field3418 = this.field3418;
        var1.field3425 = this.field3425;
        var1.field3431 = this.field3431;
        var1.field3420 = this.field3420;
        var1.field3427 = this.field3427;
        var1.field3435 = this.field3435;
        var1.field3423 = this.field3423;
        var1.field3455 = this.field3455;
        var1.field3421 = this.field3421;
        var1.field3460 = this.field3460;
        var1.field3449 = this.field3449;
        var1.field3453 = this.field3453;
        var1.field3452 = this.field3452;
        var1.field3445 = this.field3445;
        var1.field3422 = this.field3422;
        var1.field3458 = this.field3458;
        var1.field3440 = this.field3440;
        var1.field3461 = this.field3461;
        var1.field3442 = this.field3442;
        var1.field3430 = this.field3430;
        var1.field3424 = this.field3424;
        var1.field3432 = this.field3432;
        var1.field3463 = this.field3463;
        var1.field3434 = this.field3434;
        var1.field3436 = this.field3436;
        var1.field3457 = this.field3457;
        var1.field3417 = this.field3417;
        var1.field3454 = this.field3454;
        var1.field3433 = this.field3433;
        return var1;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIII)Llg;")
    public final class127 method1257(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class6(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
    public final void method1258(int arg0) {
        int var2 = field3439[arg0];
        int var3 = field3451[arg0];
        for (int var4 = 0; var4 < this.field3443; var4++) {
            int var5 = this.field3448[var4] * var2 + this.field3428[var4] * var3 >> 16;
            this.field3448[var4] = this.field3448[var4] * var3 - this.field3428[var4] * var2 >> 16;
            this.field3428[var4] = var5;
        }
        this.method1260();
    }

    @OriginalMember(owner = "client!se", name = "h", descriptor = "()V")
    public final void method1259() {
        if (this.field3457 != null) {
            return;
        }
        this.field3457 = new class76[this.field3443];
        for (int var1 = 0; var1 < this.field3443; var1++) {
            this.field3457[var1] = new class76();
        }
        for (int var2 = 0; var2 < this.field3446; var2++) {
            int var3 = this.field3418[var2];
            int var4 = this.field3425[var2];
            int var5 = this.field3431[var2];
            int var6 = this.field3428[var4] - this.field3428[var3];
            int var7 = this.field3464[var4] - this.field3464[var3];
            int var8 = this.field3448[var4] - this.field3448[var3];
            int var9 = this.field3428[var5] - this.field3428[var3];
            int var10 = this.field3464[var5] - this.field3464[var3];
            int var11 = this.field3448[var5] - this.field3448[var3];
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
            if (this.field3459 == null) {
                var19 = 0;
            } else {
                var19 = this.field3459[var2];
            }
            if (var19 == 0) {
                class76 var20 = this.field3457[var3];
                var20.field1462 += var16;
                var20.field1470 += var17;
                var20.field1483 += var18;
                var20.field1485++;
                class76 var21 = this.field3457[var4];
                var21.field1462 += var16;
                var21.field1470 += var17;
                var21.field1483 += var18;
                var21.field1485++;
                class76 var22 = this.field3457[var5];
                var22.field1462 += var16;
                var22.field1470 += var17;
                var22.field1483 += var18;
                var22.field1485++;
            } else if (var19 == 1) {
                if (this.field3417 == null) {
                    this.field3417 = new class73[this.field3446];
                }
                class73 var23 = this.field3417[var2] = new class73();
                var23.field1389 = var16;
                var23.field1388 = var17;
                var23.field1381 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "i", descriptor = "()V")
    private final void method1260() {
        this.field3457 = null;
        this.field3437 = null;
        this.field3417 = null;
        this.field3450 = false;
    }

    @OriginalMember(owner = "client!se", name = "j", descriptor = "()V")
    public final void method1261() {
        for (int var1 = 0; var1 < this.field3443; var1++) {
            this.field3428[var1] = -this.field3428[var1];
            this.field3448[var1] = -this.field3448[var1];
        }
        this.method1260();
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(III)V")
    public final void method1262(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3443; var4++) {
            this.field3428[var4] = this.field3428[var4] * arg0 / 128;
            this.field3464[var4] = this.field3464[var4] * arg1 / 128;
            this.field3448[var4] = this.field3448[var4] * arg2 / 128;
        }
        this.method1260();
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(IIIII)Lae;")
    public final class6 method1263(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class6(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!se", name = "k", descriptor = "()V")
    public static void method1264() {
        field3426 = null;
        field3444 = null;
        field3439 = null;
        field3451 = null;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(III)V")
    public final void method1265(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3443; var4++) {
            this.field3428[var4] += arg0;
            this.field3464[var4] += arg1;
            this.field3448[var4] += arg2;
        }
        this.method1260();
    }

    @OriginalMember(owner = "client!se", name = "l", descriptor = "()V")
    public final void method1266() {
        for (int var1 = 0; var1 < this.field3443; var1++) {
            this.field3448[var1] = -this.field3448[var1];
        }
        for (int var2 = 0; var2 < this.field3446; var2++) {
            int var3 = this.field3418[var2];
            this.field3418[var2] = this.field3431[var2];
            this.field3431[var2] = var3;
        }
        this.method1260();
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "([B)V")
    private final void method1267(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class66 var4 = new class66(arg0);
        class66 var5 = new class66(arg0);
        class66 var6 = new class66(arg0);
        class66 var7 = new class66(arg0);
        class66 var8 = new class66(arg0);
        var4.field1195 = arg0.length - 18;
        int var9 = var4.method500(124);
        int var10 = var4.method500(88);
        int var11 = var4.method506(255);
        int var12 = var4.method506(255);
        int var13 = var4.method506(255);
        int var14 = var4.method506(255);
        int var15 = var4.method506(255);
        int var16 = var4.method506(255);
        int var17 = var4.method500(121);
        int var18 = var4.method500(82);
        int var19 = var4.method500(70);
        int var20 = var4.method500(123);
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
        this.field3443 = var9;
        this.field3446 = var10;
        this.field3416 = var11;
        this.field3428 = new int[var9];
        this.field3464 = new int[var9];
        this.field3448 = new int[var9];
        this.field3418 = new int[var10];
        this.field3425 = new int[var10];
        this.field3431 = new int[var10];
        if (var11 > 0) {
            this.field3460 = new byte[var11];
            this.field3449 = new short[var11];
            this.field3453 = new short[var11];
            this.field3452 = new short[var11];
        }
        if (var16 == 1) {
            this.field3432 = new int[var9];
        }
        if (var12 == 1) {
            this.field3459 = new byte[var10];
            this.field3435 = new byte[var10];
            this.field3455 = new short[var10];
        }
        if (var13 == 255) {
            this.field3420 = new byte[var10];
        } else {
            this.field3421 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3427 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3463 = new int[var10];
        }
        this.field3423 = new short[var10];
        var4.field1195 = var21;
        var5.field1195 = var36;
        var6.field1195 = var38;
        var7.field1195 = var40;
        var8.field1195 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method506(255);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method494((byte) 14);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method494((byte) 95);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method494((byte) 34);
            }
            this.field3428[var46] = var43 + var63;
            this.field3464[var46] = var44 + var64;
            this.field3448[var46] = var45 + var65;
            var43 = this.field3428[var46];
            var44 = this.field3464[var46];
            var45 = this.field3448[var46];
            if (var16 == 1) {
                this.field3432[var46] = var8.method506(255);
            }
        }
        var4.field1195 = var32;
        var5.field1195 = var28;
        var6.field1195 = var26;
        var7.field1195 = var30;
        var8.field1195 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field3423[var47] = (short) var4.method500(47);
            if (var12 == 1) {
                int var61 = var5.method506(255);
                if ((var61 & 0x1) == 1) {
                    this.field3459[var47] = 1;
                    var2 = true;
                } else {
                    this.field3459[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field3435[var47] = (byte) (var61 >> 2);
                    this.field3455[var47] = this.field3423[var47];
                    this.field3423[var47] = 127;
                    if (this.field3455[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field3435[var47] = -1;
                    this.field3455[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field3420[var47] = var6.method505(false);
            }
            if (var14 == 1) {
                this.field3427[var47] = var7.method505(false);
            }
            if (var15 == 1) {
                this.field3463[var47] = var8.method506(255);
            }
        }
        var4.field1195 = var25;
        var5.field1195 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method506(255);
            if (var57 == 1) {
                var48 = var4.method494((byte) 10) + var51;
                var49 = var4.method494((byte) 71) + var48;
                var50 = var4.method494((byte) 67) + var49;
                var51 = var50;
                this.field3418[var52] = var48;
                this.field3425[var52] = var49;
                this.field3431[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method494((byte) 79) + var51;
                var51 = var50;
                this.field3418[var52] = var48;
                this.field3425[var52] = var49;
                this.field3431[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method494((byte) 60) + var51;
                var51 = var50;
                this.field3418[var52] = var48;
                this.field3425[var52] = var49;
                this.field3431[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method494((byte) 90) + var51;
                var51 = var50;
                this.field3418[var52] = var48;
                this.field3425[var52] = var60;
                this.field3431[var52] = var50;
            }
        }
        var4.field1195 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field3460[var53] = 0;
            this.field3449[var53] = (short) var4.method500(89);
            this.field3453[var53] = (short) var4.method500(49);
            this.field3452[var53] = (short) var4.method500(68);
        }
        if (this.field3435 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field3435[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field3449[var56] & 0xFFFF) == this.field3418[var55] && (this.field3453[var56] & 0xFFFF) == this.field3425[var55] && (this.field3452[var56] & 0xFFFF) == this.field3431[var55]) {
                        this.field3435[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field3435 = null;
            }
        }
        if (!var3) {
            this.field3455 = null;
        }
        if (!var2) {
            this.field3459 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "m", descriptor = "()V")
    public final void method1268() {
        int var10002;
        if (this.field3432 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3443; var3++) {
                int var7 = this.field3432[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field3434 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field3434[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field3443) {
                int var6 = this.field3432[var5];
                this.field3434[var6][var1[var6]++] = var5++;
            }
            this.field3432 = null;
        }
        if (this.field3463 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3446; var10++) {
            int var14 = this.field3463[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field3436 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field3436[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field3446) {
            int var13 = this.field3463[var12];
            this.field3436[var13][var8[var13]++] = var12++;
        }
        this.field3463 = null;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "()Z")
    public final boolean method1269() {
        return true;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([[IIIIZIZ)Lse;")
    public final class195 method1270(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        this.method1255();
        int var8 = this.field3419 + arg1;
        int var9 = this.field3462 + arg1;
        int var10 = this.field3429 + arg3;
        int var11 = this.field3447 + arg3;
        if (var8 < 0 || var9 + 128 >> 7 >= arg0.length || var10 < 0 || var11 + 128 >> 7 >= arg0[0].length) {
            return this;
        }
        int var12 = var8 >> 7;
        int var13 = var9 + 127 >> 7;
        int var14 = var10 >> 7;
        int var15 = var11 + 127 >> 7;
        if (arg0[var12][var14] == arg2 && arg0[var13][var14] == arg2 && arg0[var12][var15] == arg2 && arg0[var13][var15] == arg2) {
            return this;
        }
        class195 var16;
        if (arg4) {
            var16 = new class195();
            var16.field3443 = this.field3443;
            var16.field3446 = this.field3446;
            var16.field3416 = this.field3416;
            var16.field3428 = this.field3428;
            var16.field3448 = this.field3448;
            var16.field3418 = this.field3418;
            var16.field3425 = this.field3425;
            var16.field3431 = this.field3431;
            var16.field3459 = this.field3459;
            var16.field3420 = this.field3420;
            var16.field3427 = this.field3427;
            var16.field3435 = this.field3435;
            var16.field3423 = this.field3423;
            var16.field3455 = this.field3455;
            var16.field3421 = this.field3421;
            var16.field3460 = this.field3460;
            var16.field3449 = this.field3449;
            var16.field3453 = this.field3453;
            var16.field3452 = this.field3452;
            var16.field3445 = this.field3445;
            var16.field3422 = this.field3422;
            var16.field3458 = this.field3458;
            var16.field3440 = this.field3440;
            var16.field3461 = this.field3461;
            var16.field3442 = this.field3442;
            var16.field3430 = this.field3430;
            var16.field3424 = this.field3424;
            var16.field3432 = this.field3432;
            var16.field3463 = this.field3463;
            var16.field3434 = this.field3434;
            var16.field3436 = this.field3436;
            var16.field3454 = this.field3454;
            var16.field3433 = this.field3433;
            var16.field3457 = this.field3457;
            var16.field3417 = this.field3417;
            var16.field3437 = this.field3437;
            var16.field3464 = new int[var16.field3443];
        } else {
            var16 = this;
        }
        if (arg5 == 0) {
            for (int var17 = 0; var17 < var16.field3443; var17++) {
                int var18 = this.field3428[var17] + arg1;
                int var19 = this.field3448[var17] + arg3;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg0[var22][var23] + arg0[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg0[var22][var23 + 1] + arg0[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                var16.field3464[var17] = this.field3464[var17] + var26 - arg2;
            }
        } else {
            for (int var27 = 0; var27 < var16.field3443; var27++) {
                int var28 = (this.field3464[var27] << 16) / this.field3441;
                if (var28 < arg5) {
                    int var29 = this.field3428[var27] + arg1;
                    int var30 = this.field3448[var27] + arg3;
                    int var31 = var29 & 0x7F;
                    int var32 = var30 & 0x7F;
                    int var33 = var29 >> 7;
                    int var34 = var30 >> 7;
                    int var35 = (128 - var31) * arg0[var33][var34] + arg0[var33 + 1][var34] * var31 >> 7;
                    int var36 = (128 - var31) * arg0[var33][var34 + 1] + arg0[var33 + 1][var34 + 1] * var31 >> 7;
                    int var37 = (128 - var32) * var35 + var32 * var36 >> 7;
                    var16.field3464[var27] = (var37 - arg2) * (arg5 - var28) / arg5 + this.field3464[var27];
                } else {
                    var16.field3464[var27] = this.field3464[var27];
                }
            }
        }
        if (arg6) {
            var16.method1260();
        } else {
            this.field3450 = false;
        }
        return var16;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "()I")
    public final int method67() {
        if (!this.field3450) {
            this.method1255();
        }
        return this.field3441;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
    private class195() {
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "([B)V")
    private class195(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1250(arg0);
        } else {
            this.method1267(arg0);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lve;II)Lse;")
    public static final class195 method1271(class225 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1466(arg1, arg2, (byte) -119);
        return var3 == null ? null : new class195(var3);
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "([Lse;I)V")
    public class195(class195[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field3443 = 0;
        this.field3446 = 0;
        this.field3416 = 0;
        this.field3421 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class195 var15 = arg0[var9];
            if (var15 != null) {
                this.field3443 += var15.field3443;
                this.field3446 += var15.field3446;
                this.field3416 += var15.field3416;
                if (var15.field3420 == null) {
                    if (this.field3421 == -1) {
                        this.field3421 = var15.field3421;
                    }
                    if (this.field3421 != var15.field3421) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var15.field3459 != null;
                var5 |= var15.field3427 != null;
                var6 |= var15.field3463 != null;
                var7 |= var15.field3455 != null;
                var8 |= var15.field3435 != null;
            }
        }
        this.field3428 = new int[this.field3443];
        this.field3464 = new int[this.field3443];
        this.field3448 = new int[this.field3443];
        this.field3432 = new int[this.field3443];
        this.field3418 = new int[this.field3446];
        this.field3425 = new int[this.field3446];
        this.field3431 = new int[this.field3446];
        if (var3) {
            this.field3459 = new byte[this.field3446];
        }
        if (var4) {
            this.field3420 = new byte[this.field3446];
        }
        if (var5) {
            this.field3427 = new byte[this.field3446];
        }
        if (var6) {
            this.field3463 = new int[this.field3446];
        }
        if (var7) {
            this.field3455 = new short[this.field3446];
        }
        if (var8) {
            this.field3435 = new byte[this.field3446];
        }
        this.field3423 = new short[this.field3446];
        if (this.field3416 > 0) {
            this.field3460 = new byte[this.field3416];
            this.field3449 = new short[this.field3416];
            this.field3453 = new short[this.field3416];
            this.field3452 = new short[this.field3416];
            this.field3445 = new short[this.field3416];
            this.field3422 = new short[this.field3416];
            this.field3458 = new short[this.field3416];
            this.field3440 = new byte[this.field3416];
            this.field3461 = new byte[this.field3416];
            this.field3442 = new byte[this.field3416];
            this.field3430 = new byte[this.field3416];
            this.field3424 = new byte[this.field3416];
        }
        this.field3443 = 0;
        this.field3446 = 0;
        this.field3416 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            class195 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field3446; var12++) {
                    if (var3 && var11.field3459 != null) {
                        this.field3459[this.field3446] = var11.field3459[var12];
                    }
                    if (var4) {
                        if (var11.field3420 == null) {
                            this.field3420[this.field3446] = var11.field3421;
                        } else {
                            this.field3420[this.field3446] = var11.field3420[var12];
                        }
                    }
                    if (var5 && var11.field3427 != null) {
                        this.field3427[this.field3446] = var11.field3427[var12];
                    }
                    if (var6 && var11.field3463 != null) {
                        this.field3463[this.field3446] = var11.field3463[var12];
                    }
                    if (var7) {
                        if (var11.field3455 == null) {
                            this.field3455[this.field3446] = -1;
                        } else {
                            this.field3455[this.field3446] = var11.field3455[var12];
                        }
                    }
                    if (var8) {
                        if (var11.field3435 == null || var11.field3435[var12] == -1) {
                            this.field3435[this.field3446] = -1;
                        } else {
                            this.field3435[this.field3446] = (byte) (var11.field3435[var12] + this.field3416);
                        }
                    }
                    this.field3423[this.field3446] = var11.field3423[var12];
                    this.field3418[this.field3446] = this.method1248(var11, var11.field3418[var12]);
                    this.field3425[this.field3446] = this.method1248(var11, var11.field3425[var12]);
                    this.field3431[this.field3446] = this.method1248(var11, var11.field3431[var12]);
                    this.field3446++;
                }
                for (int var13 = 0; var13 < var11.field3416; var13++) {
                    byte var14 = this.field3460[this.field3416] = var11.field3460[var13];
                    if (var14 == 0) {
                        this.field3449[this.field3416] = (short) this.method1248(var11, var11.field3449[var13]);
                        this.field3453[this.field3416] = (short) this.method1248(var11, var11.field3453[var13]);
                        this.field3452[this.field3416] = (short) this.method1248(var11, var11.field3452[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field3449[this.field3416] = var11.field3449[var13];
                        this.field3453[this.field3416] = var11.field3453[var13];
                        this.field3452[this.field3416] = var11.field3452[var13];
                        this.field3445[this.field3416] = var11.field3445[var13];
                        this.field3422[this.field3416] = var11.field3422[var13];
                        this.field3458[this.field3416] = var11.field3458[var13];
                        this.field3440[this.field3416] = var11.field3440[var13];
                        this.field3461[this.field3416] = var11.field3461[var13];
                        this.field3442[this.field3416] = var11.field3442[var13];
                    }
                    if (var14 == 2) {
                        this.field3430[this.field3416] = var11.field3430[var13];
                        this.field3424[this.field3416] = var11.field3424[var13];
                    }
                    this.field3416++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lse;ZZZZ)V")
    public class195(class195 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field3443 = arg0.field3443;
        this.field3446 = arg0.field3446;
        this.field3416 = arg0.field3416;
        if (arg1) {
            this.field3428 = arg0.field3428;
            this.field3464 = arg0.field3464;
            this.field3448 = arg0.field3448;
        } else {
            this.field3428 = new int[this.field3443];
            this.field3464 = new int[this.field3443];
            this.field3448 = new int[this.field3443];
            for (int var6 = 0; var6 < this.field3443; var6++) {
                this.field3428[var6] = arg0.field3428[var6];
                this.field3464[var6] = arg0.field3464[var6];
                this.field3448[var6] = arg0.field3448[var6];
            }
        }
        if (arg2) {
            this.field3423 = arg0.field3423;
        } else {
            this.field3423 = new short[this.field3446];
            for (int var7 = 0; var7 < this.field3446; var7++) {
                this.field3423[var7] = arg0.field3423[var7];
            }
        }
        if (arg3 || arg0.field3455 == null) {
            this.field3455 = arg0.field3455;
        } else {
            this.field3455 = new short[this.field3446];
            for (int var8 = 0; var8 < this.field3446; var8++) {
                this.field3455[var8] = arg0.field3455[var8];
            }
        }
        if (arg4) {
            this.field3427 = arg0.field3427;
        } else {
            this.field3427 = new byte[this.field3446];
            if (arg0.field3427 == null) {
                for (int var9 = 0; var9 < this.field3446; var9++) {
                    this.field3427[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field3446; var10++) {
                    this.field3427[var10] = arg0.field3427[var10];
                }
            }
        }
        this.field3418 = arg0.field3418;
        this.field3425 = arg0.field3425;
        this.field3431 = arg0.field3431;
        this.field3459 = arg0.field3459;
        this.field3420 = arg0.field3420;
        this.field3435 = arg0.field3435;
        this.field3421 = arg0.field3421;
        this.field3460 = arg0.field3460;
        this.field3449 = arg0.field3449;
        this.field3453 = arg0.field3453;
        this.field3452 = arg0.field3452;
        this.field3445 = arg0.field3445;
        this.field3422 = arg0.field3422;
        this.field3458 = arg0.field3458;
        this.field3440 = arg0.field3440;
        this.field3461 = arg0.field3461;
        this.field3442 = arg0.field3442;
        this.field3430 = arg0.field3430;
        this.field3424 = arg0.field3424;
        this.field3432 = arg0.field3432;
        this.field3463 = arg0.field3463;
        this.field3434 = arg0.field3434;
        this.field3436 = arg0.field3436;
        this.field3457 = arg0.field3457;
        this.field3417 = arg0.field3417;
        this.field3437 = arg0.field3437;
        this.field3454 = arg0.field3454;
        this.field3433 = arg0.field3433;
    }
}
