import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class49 {

    @OriginalMember(owner = "client!jp", name = "z", descriptor = "I")
    public int field610 = 0;

    @OriginalMember(owner = "client!jp", name = "y", descriptor = "B")
    public byte field609 = 0;

    @OriginalMember(owner = "client!jp", name = "G", descriptor = "I")
    public int field617 = 0;

    @OriginalMember(owner = "client!jp", name = "I", descriptor = "I")
    public int field619 = 0;

    @OriginalMember(owner = "client!jp", name = "A", descriptor = "I")
    public int field611 = 0;

    @OriginalMember(owner = "client!jp", name = "n", descriptor = "[I")
    public int[] field598;

    @OriginalMember(owner = "client!jp", name = "X", descriptor = "[I")
    public int[] field634;

    @OriginalMember(owner = "client!jp", name = "o", descriptor = "[S")
    public short[] field599;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "[B")
    public byte[] field588;

    @OriginalMember(owner = "client!jp", name = "E", descriptor = "[S")
    public short[] field615;

    @OriginalMember(owner = "client!jp", name = "u", descriptor = "[S")
    public short[] field605;

    @OriginalMember(owner = "client!jp", name = "S", descriptor = "[B")
    public byte[] field629;

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "[S")
    public short[] field594;

    @OriginalMember(owner = "client!jp", name = "R", descriptor = "[S")
    public short[] field628;

    @OriginalMember(owner = "client!jp", name = "K", descriptor = "[S")
    public short[] field621;

    @OriginalMember(owner = "client!jp", name = "T", descriptor = "[B")
    public byte[] field630;

    @OriginalMember(owner = "client!jp", name = "m", descriptor = "[S")
    public short[] field597;

    @OriginalMember(owner = "client!jp", name = "x", descriptor = "[B")
    public byte[] field608;

    @OriginalMember(owner = "client!jp", name = "t", descriptor = "[B")
    public byte[] field604;

    @OriginalMember(owner = "client!jp", name = "H", descriptor = "[B")
    public byte[] field618;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "[S")
    public short[] field591;

    @OriginalMember(owner = "client!jp", name = "N", descriptor = "[I")
    public int[] field624;

    @OriginalMember(owner = "client!jp", name = "w", descriptor = "[B")
    public byte[] field607;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "[B")
    public byte[] field586;

    @OriginalMember(owner = "client!jp", name = "F", descriptor = "[I")
    public int[] field616;

    @OriginalMember(owner = "client!jp", name = "v", descriptor = "[S")
    public short[] field606;

    @OriginalMember(owner = "client!jp", name = "p", descriptor = "[I")
    public int[] field600;

    @OriginalMember(owner = "client!jp", name = "s", descriptor = "[S")
    public short[] field603;

    @OriginalMember(owner = "client!jp", name = "C", descriptor = "[B")
    public byte[] field613;

    @OriginalMember(owner = "client!jp", name = "L", descriptor = "[B")
    public byte[] field622;

    @OriginalMember(owner = "client!jp", name = "V", descriptor = "[S")
    public short[] field632;

    @OriginalMember(owner = "client!jp", name = "U", descriptor = "[S")
    public short[] field631;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "[Ltr;")
    public class219[] field592;

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "[Lmp;")
    public class95[] field587;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "[S")
    public short[] field589;

    @OriginalMember(owner = "client!jp", name = "D", descriptor = "[I")
    public static int[] field614 = new int[64];

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!jp", name = "l", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!jp", name = "q", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!jp", name = "r", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!jp", name = "B", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!jp", name = "J", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!jp", name = "M", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!jp", name = "O", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!jp", name = "P", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!jp", name = "Q", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!jp", name = "W", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)[[I")
    public final int[][] method269(int arg0) {
        field626++;
        int[] var2 = new int[256];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field619; var4++) {
            int var10 = this.field634[var4];
            if (var10 >= 0) {
                int var10002 = var2[var10]++;
                if (var10 > var3) {
                    var3 = var10;
                }
            }
        }
        int[][] var5 = new int[var3 + 1][];
        for (int var6 = 0; var6 <= var3; var6++) {
            var5[var6] = new int[var2[var6]];
            var2[var6] = 0;
        }
        int var7 = 101 / ((-arg0 - 18) / 56);
        for (int var8 = 0; var8 < this.field619; var8++) {
            int var9 = this.field634[var8];
            if (var9 >= 0) {
                var5[var9][var2[var9]++] = var8;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IZI)I")
    public static final int method270(int arg0, boolean arg1, int arg2) {
        field593++;
        if (!arg1) {
            field614 = null;
        }
        int var3 = arg0 >> 31 & arg2 - 1;
        return (arg0 + (arg0 >>> 31)) % arg2 + var3;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(SSSSBBSBSI)B")
    public final byte method271(short arg0, short arg1, short arg2, short arg3, byte arg4, byte arg5, short arg6, byte arg7, short arg8, int arg9) {
        field623++;
        if (this.field617 >= 255) {
            throw new IllegalStateException();
        }
        if (arg9 != 29028) {
            this.method277(-32, -26, -120, -98);
        }
        this.field630[this.field617] = 3;
        this.field597[this.field617] = arg8;
        this.field605[this.field617] = arg6;
        this.field594[this.field617] = arg2;
        this.field628[this.field617] = arg1;
        this.field615[this.field617] = arg0;
        this.field621[this.field617] = arg3;
        this.field618[this.field617] = arg4;
        this.field588[this.field617] = arg5;
        this.field604[this.field617] = arg7;
        return (byte) (this.field617++);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "([BZ)V")
    private final void method272(byte[] arg0, boolean arg1) {
        field625++;
        class385 var3 = new class385(arg0);
        class385 var4 = new class385(arg0);
        class385 var5 = new class385(arg0);
        class385 var6 = new class385(arg0);
        class385 var7 = new class385(arg0);
        class385 var8 = new class385(arg0);
        class385 var9 = new class385(arg0);
        var3.field5666 = arg0.length - 23;
        this.field611 = var3.method2323(-105);
        this.field619 = var3.method2323(-73);
        this.field617 = var3.method2343(255);
        int var10 = var3.method2343(255);
        boolean var11 = (var10 & 0x1) == 1;
        boolean var12 = (var10 & 0x2) == 2;
        int var13 = var3.method2343(255);
        int var14 = var3.method2343(255);
        int var15 = var3.method2343(255);
        int var16 = var3.method2343(255);
        int var17 = var3.method2343(255);
        int var18 = var3.method2323(-18);
        int var19 = var3.method2323(-67);
        int var20 = var3.method2323(-39);
        int var21 = var3.method2323(-51);
        int var22 = var3.method2323(-51);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (this.field617 > 0) {
            this.field630 = new byte[this.field617];
            var3.field5666 = 0;
            for (int var26 = 0; var26 < this.field617; var26++) {
                byte var27 = this.field630[var26] = var3.method2341((byte) 54);
                if (var27 == 2) {
                    var25++;
                }
                if (var27 == 0) {
                    var23++;
                }
                if (var27 >= 1 && var27 <= 3) {
                    var24++;
                }
            }
        }
        int var28 = this.field617;
        int var30 = this.field611 + var28;
        int var31 = var30;
        if (var11) {
            var30 += this.field619;
        }
        int var33 = this.field619 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += this.field619;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += this.field619;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += this.field611;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += this.field619;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += this.field619 * 2;
        }
        int var42 = var22 + var39;
        int var44 = this.field619 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 + var56;
        int var60 = var24 + var58;
        int var62 = var25 * 2 + var24 + var60;
        if (var15 == 1) {
            this.field634 = new int[this.field619];
        }
        if (var17 == 1) {
            this.field624 = new int[this.field611];
        }
        this.field599 = new short[this.field619];
        this.field606 = new short[this.field619];
        if (var14 == 1) {
            this.field622 = new byte[this.field619];
        }
        if (var16 == 1 && this.field617 > 0) {
            this.field586 = new byte[this.field619];
        }
        this.field591 = new short[this.field619];
        if (var11) {
            this.field613 = new byte[this.field619];
        }
        var3.field5666 = var28;
        if (this.field617 > 0) {
            this.field597 = new short[this.field617];
            this.field605 = new short[this.field617];
            if (var24 > 0) {
                this.field628 = new short[var24];
                this.field615 = new short[var24];
                this.field588 = new byte[var24];
                this.field604 = new byte[var24];
                this.field621 = new short[var24];
                this.field618 = new byte[var24];
            }
            if (var25 > 0) {
                this.field608 = new byte[var25];
                this.field629 = new byte[var25];
            }
            this.field594 = new short[this.field617];
        }
        this.field598 = new int[this.field611];
        if (var16 == 1) {
            this.field603 = new short[this.field619];
        }
        this.field616 = new int[this.field611];
        this.field632 = new short[this.field619];
        if (var13 == 255) {
            this.field607 = new byte[this.field619];
        } else {
            this.field609 = (byte) var13;
        }
        this.field600 = new int[this.field611];
        var4.field5666 = var44;
        var5.field5666 = var46;
        var6.field5666 = var48;
        if (!arg1) {
            this.method278(-21);
        }
        var7.field5666 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < this.field611; var67++) {
            int var87 = var3.method2343(255);
            int var88 = 0;
            if ((var87 & 0x1) != 0) {
                var88 = var4.method2342((byte) -46);
            }
            int var89 = 0;
            if ((var87 & 0x2) != 0) {
                var89 = var5.method2342((byte) -46);
            }
            int var90 = 0;
            if ((var87 & 0x4) != 0) {
                var90 = var6.method2342((byte) -46);
            }
            this.field600[var67] = var64 + var88;
            this.field598[var67] = var65 + var89;
            this.field616[var67] = var66 + var90;
            var66 = this.field616[var67];
            var64 = this.field600[var67];
            var65 = this.field598[var67];
            if (var17 == 1) {
                this.field624[var67] = var7.method2343(255);
            }
        }
        var3.field5666 = var42;
        var4.field5666 = var31;
        var5.field5666 = var34;
        var6.field5666 = var37;
        var7.field5666 = var35;
        var8.field5666 = var40;
        var9.field5666 = var39;
        for (int var68 = 0; var68 < this.field619; var68++) {
            this.field606[var68] = (short) var3.method2323(-2);
            if (var11) {
                this.field613[var68] = var4.method2341((byte) 54);
            }
            if (var13 == 255) {
                this.field607[var68] = var5.method2341((byte) 54);
            }
            if (var14 == 1) {
                this.field622[var68] = var6.method2341((byte) 54);
            }
            if (var15 == 1) {
                this.field634[var68] = var7.method2343(255);
            }
            if (var16 == 1) {
                this.field603[var68] = (short) (var8.method2323(-49) - 1);
            }
            if (this.field586 != null) {
                if (this.field603[var68] == -1) {
                    this.field586[var68] = -1;
                } else {
                    this.field586[var68] = (byte) (var9.method2343(255) - 1);
                }
            }
        }
        this.field610 = -1;
        var3.field5666 = var33;
        var4.field5666 = var30;
        short var69 = 0;
        short var70 = 0;
        short var71 = 0;
        short var72 = 0;
        for (int var73 = 0; var73 < this.field619; var73++) {
            int var83 = var4.method2343(255);
            if (var83 == 1) {
                var69 = (short) (var72 + var3.method2342((byte) -46));
                var70 = (short) (var69 + var3.method2342((byte) -46));
                var71 = (short) (var70 + var3.method2342((byte) -46));
                var72 = var71;
                this.field599[var73] = var69;
                this.field632[var73] = var70;
                this.field591[var73] = var71;
                if (var69 > this.field610) {
                    this.field610 = var69;
                }
                if (var70 > this.field610) {
                    this.field610 = var70;
                }
                if (this.field610 < var71) {
                    this.field610 = var71;
                }
            }
            if (var83 == 2) {
                var70 = var71;
                var71 = (short) (var72 + var3.method2342((byte) -46));
                this.field599[var73] = var69;
                var72 = var71;
                this.field632[var73] = var70;
                this.field591[var73] = var71;
                if (this.field610 < var71) {
                    this.field610 = var71;
                }
            }
            if (var83 == 3) {
                var69 = var71;
                var71 = (short) (var3.method2342((byte) -46) + var72);
                this.field599[var73] = var69;
                var72 = var71;
                this.field632[var73] = var70;
                this.field591[var73] = var71;
                if (this.field610 < var71) {
                    this.field610 = var71;
                }
            }
            if (var83 == 4) {
                short var86 = var69;
                var69 = var70;
                var70 = var86;
                var71 = (short) (var72 + var3.method2342((byte) -46));
                this.field599[var73] = var69;
                var72 = var71;
                this.field632[var73] = var86;
                this.field591[var73] = var71;
                if (this.field610 < var71) {
                    this.field610 = var71;
                }
            }
        }
        this.field610++;
        var3.field5666 = var50;
        var4.field5666 = var52;
        var5.field5666 = var54;
        var6.field5666 = var56;
        var7.field5666 = var58;
        var8.field5666 = var60;
        for (int var74 = 0; var74 < this.field617; var74++) {
            int var82 = this.field630[var74] & 0xFF;
            if (var82 == 0) {
                this.field597[var74] = (short) var3.method2323(-55);
                this.field605[var74] = (short) var3.method2323(-4);
                this.field594[var74] = (short) var3.method2323(-32);
            }
            if (var82 == 1) {
                this.field597[var74] = (short) var4.method2323(-74);
                this.field605[var74] = (short) var4.method2323(-109);
                this.field594[var74] = (short) var4.method2323(-40);
                this.field628[var74] = (short) var5.method2323(-43);
                this.field615[var74] = (short) var5.method2323(-11);
                this.field621[var74] = (short) var5.method2323(-128);
                this.field618[var74] = var6.method2341((byte) 54);
                this.field588[var74] = var7.method2341((byte) 54);
                this.field604[var74] = var8.method2341((byte) 54);
            }
            if (var82 == 2) {
                this.field597[var74] = (short) var4.method2323(-112);
                this.field605[var74] = (short) var4.method2323(-25);
                this.field594[var74] = (short) var4.method2323(-42);
                this.field628[var74] = (short) var5.method2323(-37);
                this.field615[var74] = (short) var5.method2323(-71);
                this.field621[var74] = (short) var5.method2323(-88);
                this.field618[var74] = var6.method2341((byte) 54);
                this.field588[var74] = var7.method2341((byte) 54);
                this.field604[var74] = var8.method2341((byte) 54);
                this.field608[var74] = var8.method2341((byte) 54);
                this.field629[var74] = var8.method2341((byte) 54);
            }
            if (var82 == 3) {
                this.field597[var74] = (short) var4.method2323(-127);
                this.field605[var74] = (short) var4.method2323(-73);
                this.field594[var74] = (short) var4.method2323(-82);
                this.field628[var74] = (short) var5.method2323(-36);
                this.field615[var74] = (short) var5.method2323(-68);
                this.field621[var74] = (short) var5.method2323(-9);
                this.field618[var74] = var6.method2341((byte) 54);
                this.field588[var74] = var7.method2341((byte) 54);
                this.field604[var74] = var8.method2341((byte) 54);
            }
        }
        if (!var12) {
            return;
        }
        var3.field5666 = var62;
        int var75 = var3.method2343(255);
        if (var75 > 0) {
            this.field592 = new class219[var75];
            for (int var76 = 0; var76 < var75; var76++) {
                int var77 = var3.method2323(-83);
                int var78 = var3.method2323(-23);
                byte var79;
                if (var13 == 255) {
                    var79 = this.field607[var78];
                } else {
                    var79 = (byte) var13;
                }
                this.field592[var76] = new class219(var77, this.field599[var78], this.field632[var78], this.field591[var78], var79);
            }
        }
        int var80 = var3.method2343(255);
        if (var80 <= 0) {
            return;
        }
        this.field587 = new class95[var80];
        for (int var81 = 0; var81 < var80; var81++) {
            this.field587[var81] = new class95(var3.method2323(-28), var3.method2323(-103));
        }
        return;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIII)V")
    public final void method273(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            int var5 = class110.field1450[arg1];
            int var6 = class110.field1452[arg1];
            for (int var7 = 0; var7 < this.field611; var7++) {
                int var8 = this.field600[var7] * var6 + this.field598[var7] * var5 >> 15;
                this.field598[var7] = this.field598[var7] * var6 - (this.field600[var7] * var5) >> 15;
                this.field600[var7] = var8;
            }
        }
        field595++;
        if (arg2 != 0) {
            int var9 = class110.field1450[arg2];
            int var10 = class110.field1452[arg2];
            for (int var11 = 0; var11 < this.field611; var11++) {
                int var12 = this.field598[var11] * var10 - (this.field616[var11] * var9) >> 15;
                this.field616[var11] = this.field616[var11] * var10 + this.field598[var11] * var9 >> 15;
                this.field598[var11] = var12;
            }
        }
        if (arg0 != 0) {
            int var13 = class110.field1450[arg0];
            int var14 = class110.field1452[arg0];
            for (int var15 = 0; var15 < this.field611; var15++) {
                int var16 = this.field616[var15] * var13 + this.field600[var15] * var14 >> 15;
                this.field616[var15] = this.field616[var15] * var14 - (this.field600[var15] * var13) >> 15;
                this.field600[var15] = var16;
            }
        }
        int var17 = -16 % ((arg3 + 24) / 57);
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "([BZ)V")
    private final void method274(byte[] arg0, boolean arg1) {
        field596++;
        boolean var3 = arg1;
        boolean var4 = false;
        class385 var5 = new class385(arg0);
        class385 var6 = new class385(arg0);
        class385 var7 = new class385(arg0);
        class385 var8 = new class385(arg0);
        class385 var9 = new class385(arg0);
        var5.field5666 = arg0.length - 18;
        this.field611 = var5.method2323(-78);
        this.field619 = var5.method2323(-6);
        this.field617 = var5.method2343(255);
        int var10 = var5.method2343(255);
        int var11 = var5.method2343(255);
        int var12 = var5.method2343(255);
        int var13 = var5.method2343(255);
        int var14 = var5.method2343(255);
        int var15 = var5.method2323(-86);
        int var16 = var5.method2323(-57);
        int var17 = var5.method2323(-110);
        int var18 = var5.method2323(-10);
        byte var19 = 0;
        int var21 = this.field611 + var19;
        int var23 = this.field619 + var21;
        int var24 = var23;
        if (var11 == 255) {
            var23 += this.field619;
        }
        int var25 = var23;
        if (var13 == 1) {
            var23 += this.field619;
        }
        int var26 = var23;
        if (var10 == 1) {
            var23 += this.field619;
        }
        int var27 = var23;
        if (var14 == 1) {
            var23 += this.field611;
        }
        int var28 = var23;
        if (var12 == 1) {
            var23 += this.field619;
        }
        int var30 = var18 + var23;
        int var32 = this.field619 * 2 + var30;
        int var34 = this.field617 * 6 + var32;
        int var36 = var15 + var34;
        int var38 = var16 + var36;
        if (var12 == 1) {
            this.field622 = new byte[this.field619];
        }
        this.field606 = new short[this.field619];
        this.field591 = new short[this.field619];
        this.field616 = new int[this.field611];
        this.field600 = new int[this.field611];
        this.field599 = new short[this.field619];
        if (var11 == 255) {
            this.field607 = new byte[this.field619];
        } else {
            this.field609 = (byte) var11;
        }
        if (var10 == 1) {
            this.field613 = new byte[this.field619];
            this.field603 = new short[this.field619];
            this.field586 = new byte[this.field619];
        }
        if (var14 == 1) {
            this.field624 = new int[this.field611];
        }
        if (var13 == 1) {
            this.field634 = new int[this.field619];
        }
        if (this.field617 > 0) {
            this.field630 = new byte[this.field617];
            this.field594 = new short[this.field617];
            this.field605 = new short[this.field617];
            this.field597 = new short[this.field617];
        }
        this.field632 = new short[this.field619];
        var5.field5666 = var19;
        int var10000 = var17 + var38;
        this.field598 = new int[this.field611];
        var6.field5666 = var34;
        var7.field5666 = var36;
        var8.field5666 = var38;
        var9.field5666 = var27;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        for (int var44 = 0; var44 < this.field611; var44++) {
            int var60 = var5.method2343(255);
            int var61 = 0;
            if ((var60 & 0x1) != 0) {
                var61 = var6.method2342((byte) -46);
            }
            int var62 = 0;
            if ((var60 & 0x2) != 0) {
                var62 = var7.method2342((byte) -46);
            }
            int var63 = 0;
            if ((var60 & 0x4) != 0) {
                var63 = var8.method2342((byte) -46);
            }
            this.field600[var44] = var41 + var61;
            this.field598[var44] = var42 + var62;
            this.field616[var44] = var43 + var63;
            var42 = this.field598[var44];
            var41 = this.field600[var44];
            var43 = this.field616[var44];
            if (var14 == 1) {
                this.field624[var44] = var9.method2343(255);
            }
        }
        var5.field5666 = var30;
        var6.field5666 = var26;
        var7.field5666 = var24;
        var8.field5666 = var28;
        var9.field5666 = var25;
        for (int var45 = 0; var45 < this.field619; var45++) {
            this.field606[var45] = (short) var5.method2323(-114);
            if (var10 == 1) {
                int var59 = var6.method2343(255);
                if ((var59 & 0x1) == 1) {
                    var3 = true;
                    this.field613[var45] = 1;
                } else {
                    this.field613[var45] = 0;
                }
                if ((var59 & 0x2) == 2) {
                    this.field586[var45] = (byte) (var59 >> 2);
                    this.field603[var45] = this.field606[var45];
                    this.field606[var45] = 127;
                    if (this.field603[var45] != -1) {
                        var4 = true;
                    }
                } else {
                    this.field586[var45] = -1;
                    this.field603[var45] = -1;
                }
            }
            if (var11 == 255) {
                this.field607[var45] = var7.method2341((byte) 54);
            }
            if (var12 == 1) {
                this.field622[var45] = var8.method2341((byte) 54);
            }
            if (var13 == 1) {
                this.field634[var45] = var9.method2343(255);
            }
        }
        this.field610 = -1;
        var5.field5666 = var23;
        var6.field5666 = var21;
        short var46 = 0;
        short var47 = 0;
        short var48 = 0;
        short var49 = 0;
        for (int var50 = 0; var50 < this.field619; var50++) {
            int var55 = var6.method2343(255);
            if (var55 == 1) {
                var46 = (short) (var5.method2342((byte) -46) + var49);
                var47 = (short) (var46 + var5.method2342((byte) -46));
                var48 = (short) (var47 + var5.method2342((byte) -46));
                this.field599[var50] = var46;
                var49 = var48;
                this.field632[var50] = var47;
                this.field591[var50] = var48;
                if (this.field610 < var46) {
                    this.field610 = var46;
                }
                if (this.field610 < var47) {
                    this.field610 = var47;
                }
                if (var48 > this.field610) {
                    this.field610 = var48;
                }
            }
            if (var55 == 2) {
                var47 = var48;
                var48 = (short) (var5.method2342((byte) -46) + var49);
                var49 = var48;
                this.field599[var50] = var46;
                this.field632[var50] = var47;
                this.field591[var50] = var48;
                if (var48 > this.field610) {
                    this.field610 = var48;
                }
            }
            if (var55 == 3) {
                var46 = var48;
                var48 = (short) (var5.method2342((byte) -46) + var49);
                var49 = var48;
                this.field599[var50] = var46;
                this.field632[var50] = var47;
                this.field591[var50] = var48;
                if (this.field610 < var48) {
                    this.field610 = var48;
                }
            }
            if (var55 == 4) {
                short var58 = var46;
                var46 = var47;
                var48 = (short) (var49 + var5.method2342((byte) -46));
                var47 = var58;
                var49 = var48;
                this.field599[var50] = var46;
                this.field632[var50] = var58;
                this.field591[var50] = var48;
                if (this.field610 < var48) {
                    this.field610 = var48;
                }
            }
        }
        var5.field5666 = var32;
        this.field610++;
        for (int var51 = 0; var51 < this.field617; var51++) {
            this.field630[var51] = 0;
            this.field597[var51] = (short) var5.method2323(-100);
            this.field605[var51] = (short) var5.method2323(-40);
            this.field594[var51] = (short) var5.method2323(-91);
        }
        if (this.field586 != null) {
            boolean var52 = false;
            for (int var53 = 0; var53 < this.field619; var53++) {
                int var54 = this.field586[var53] & 0xFF;
                if (var54 != 255) {
                    if ((this.field597[var54] & 0xFFFF) == this.field599[var53] && (this.field605[var54] & 0xFFFF) == this.field632[var53] && (this.field594[var54] & 0xFFFF) == this.field591[var53]) {
                        this.field586[var53] = -1;
                    } else {
                        var52 = true;
                    }
                }
            }
            if (!var52) {
                this.field586 = null;
            }
        }
        if (!var4) {
            this.field603 = null;
        }
        if (!var3) {
            this.field613 = null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BIII)V")
    public final void method275(byte arg0, int arg1, int arg2, int arg3) {
        field627++;
        if (arg0 <= 88) {
            this.field594 = null;
        }
        for (int var5 = 0; var5 < this.field611; var5++) {
            this.field600[var5] += arg1;
            this.field598[var5] += arg2;
            this.field616[var5] += arg3;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(SSB)V")
    public final void method276(short arg0, short arg1, byte arg2) {
        field601++;
        if (this.field603 == null) {
            return;
        }
        if (arg2 != 86) {
            this.method272((byte[]) null, false);
        }
        for (int var4 = 0; var4 < this.field619; var4++) {
            if (this.field603[var4] == arg1) {
                this.field603[var4] = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(IIII)I")
    public final int method277(int arg0, int arg1, int arg2, int arg3) {
        field585++;
        if (arg1 > -126) {
            return 33;
        }
        for (int var5 = 0; var5 < this.field611; var5++) {
            if (this.field600[var5] == arg3 && this.field598[var5] == arg2 && this.field616[var5] == arg0) {
                return var5;
            }
        }
        this.field600[this.field611] = arg3;
        this.field598[this.field611] = arg2;
        this.field616[this.field611] = arg0;
        this.field610 = this.field611 + 1;
        return this.field611++;
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)[[I")
    public final int[][] method278(int arg0) {
        field590++;
        int[] var2 = new int[256];
        int var3 = 0;
        if (arg0 != -3954) {
            this.method269(87);
        }
        for (int var4 = 0; var4 < this.field610; var4++) {
            int var9 = this.field624[var4];
            if (var9 >= 0) {
                if (var3 < var9) {
                    var3 = var9;
                }
                int var10002 = var2[var9]++;
            }
        }
        int[][] var5 = new int[var3 + 1][];
        for (int var6 = 0; var6 <= var3; var6++) {
            var5[var6] = new int[var2[var6]];
            var2[var6] = 0;
        }
        for (int var7 = 0; var7 < this.field610; var7++) {
            int var8 = this.field624[var7];
            if (var8 >= 0) {
                var5[var8][var2[var8]++] = var7;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(SIISBBBIB)I")
    public final int method279(short arg0, int arg1, int arg2, short arg3, byte arg4, byte arg5, byte arg6, int arg7, byte arg8) {
        field602++;
        this.field599[this.field619] = (short) arg2;
        this.field632[this.field619] = (short) arg1;
        this.field591[this.field619] = (short) arg7;
        if (arg8 != -74) {
            this.method275((byte) 27, -77, -35, 89);
        }
        this.field613[this.field619] = arg5;
        this.field586[this.field619] = arg6;
        this.field606[this.field619] = arg0;
        this.field622[this.field619] = arg4;
        this.field603[this.field619] = arg3;
        return this.field619++;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(SZS)V")
    public final void method280(short arg0, boolean arg1, short arg2) {
        if (!arg1) {
            return;
        }
        for (int var4 = 0; var4 < this.field619; var4++) {
            if (this.field606[var4] == arg2) {
                this.field606[var4] = arg0;
            }
        }
        field633++;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Ljp;IBS)I")
    private final int method281(class49 arg0, int arg1, byte arg2, short arg3) {
        field612++;
        int var5 = arg0.field600[arg1];
        int var6 = arg0.field598[arg1];
        int var7 = arg0.field616[arg1];
        int var8 = 102 % ((68 - arg2) / 35);
        for (int var9 = 0; var9 < this.field611; var9++) {
            if (this.field600[var9] == var5 && this.field598[var9] == var6 && this.field616[var9] == var7) {
                this.field631[var9] = (short) class276.method1712(this.field631[var9], arg3);
                return var9;
            }
        }
        this.field600[this.field611] = var5;
        this.field598[this.field611] = var6;
        this.field616[this.field611] = var7;
        this.field631[this.field611] = arg3;
        this.field624[this.field611] = arg0.field624 == null ? -1 : arg0.field624[arg1];
        return this.field611++;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V")
    public static void method282(byte arg0) {
        field614 = null;
        if (arg0 < 112) {
            field614 = null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "([B)V")
    public class49(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method272(arg0, true);
        } else {
            this.method274(arg0, false);
        }
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(III)V")
    public class49(int arg0, int arg1, int arg2) {
        this.field598 = new int[arg0];
        this.field634 = new int[arg1];
        this.field599 = new short[arg1];
        if (arg2 > 0) {
            this.field588 = new byte[arg2];
            this.field615 = new short[arg2];
            this.field605 = new short[arg2];
            this.field629 = new byte[arg2];
            this.field594 = new short[arg2];
            this.field628 = new short[arg2];
            this.field621 = new short[arg2];
            this.field630 = new byte[arg2];
            this.field597 = new short[arg2];
            this.field608 = new byte[arg2];
            this.field604 = new byte[arg2];
            this.field618 = new byte[arg2];
        }
        this.field591 = new short[arg1];
        this.field624 = new int[arg0];
        this.field607 = new byte[arg1];
        this.field586 = new byte[arg1];
        this.field616 = new int[arg0];
        this.field606 = new short[arg1];
        this.field600 = new int[arg0];
        this.field603 = new short[arg1];
        this.field613 = new byte[arg1];
        this.field622 = new byte[arg1];
        this.field632 = new short[arg1];
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "([Ljp;I)V")
    public class49(class49[] arg0, int arg1) {
        this.field611 = 0;
        this.field619 = 0;
        this.field617 = 0;
        int var3 = 0;
        int var4 = 0;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        this.field609 = -1;
        boolean var10 = false;
        for (int var11 = 0; var11 < arg1; var11++) {
            class49 var31 = arg0[var11];
            if (var31 != null) {
                this.field619 += var31.field619;
                this.field617 += var31.field617;
                this.field611 += var31.field611;
                var5 |= var31.field613 != null;
                if (var31.field587 != null) {
                    var4 += var31.field587.length;
                }
                if (var31.field592 != null) {
                    var3 += var31.field592.length;
                }
                if (var31.field607 == null) {
                    if (this.field609 == -1) {
                        this.field609 = var31.field609;
                    }
                    if (this.field609 != var31.field609) {
                        var6 = true;
                    }
                } else {
                    var6 = true;
                }
                var9 |= var31.field603 != null;
                var8 |= var31.field586 != null;
                var10 |= var31.field634 != null;
                var7 |= var31.field622 != null;
            }
        }
        this.field606 = new short[this.field619];
        this.field631 = new short[this.field611];
        if (var10) {
            this.field634 = new int[this.field619];
        }
        if (var7) {
            this.field622 = new byte[this.field619];
        }
        if (var3 > 0) {
            this.field592 = new class219[var3];
        }
        if (var9) {
            this.field603 = new short[this.field619];
        }
        this.field598 = new int[this.field611];
        this.field632 = new short[this.field619];
        if (var4 > 0) {
            this.field587 = new class95[var4];
        }
        this.field600 = new int[this.field611];
        if (var8) {
            this.field586 = new byte[this.field619];
        }
        if (var5) {
            this.field613 = new byte[this.field619];
        }
        this.field591 = new short[this.field619];
        this.field624 = new int[this.field611];
        if (this.field617 > 0) {
            this.field621 = new short[this.field617];
            this.field597 = new short[this.field617];
            this.field604 = new byte[this.field617];
            this.field588 = new byte[this.field617];
            this.field629 = new byte[this.field617];
            this.field605 = new short[this.field617];
            this.field630 = new byte[this.field617];
            this.field615 = new short[this.field617];
            this.field618 = new byte[this.field617];
            this.field608 = new byte[this.field617];
            this.field628 = new short[this.field617];
            this.field594 = new short[this.field617];
        }
        if (var6) {
            this.field607 = new byte[this.field619];
        }
        this.field616 = new int[this.field611];
        this.field589 = new short[this.field619];
        this.field599 = new short[this.field619];
        int var12 = 0;
        this.field619 = 0;
        int var13 = 0;
        this.field611 = 0;
        this.field617 = 0;
        for (int var14 = 0; var14 < arg1; var14++) {
            short var22 = (short) (0x1 << var14);
            class49 var23 = arg0[var14];
            if (var23 != null) {
                for (int var24 = 0; var24 < var23.field619; var24++) {
                    if (var5 && var23.field613 != null) {
                        this.field613[this.field619] = var23.field613[var24];
                    }
                    if (var6) {
                        if (var23.field607 == null) {
                            this.field607[this.field619] = var23.field609;
                        } else {
                            this.field607[this.field619] = var23.field607[var24];
                        }
                    }
                    if (var7 && var23.field622 != null) {
                        this.field622[this.field619] = var23.field622[var24];
                    }
                    if (var9) {
                        if (var23.field603 == null) {
                            this.field603[this.field619] = -1;
                        } else {
                            this.field603[this.field619] = var23.field603[var24];
                        }
                    }
                    if (var10) {
                        if (var23.field634 == null) {
                            this.field634[this.field619] = -1;
                        } else {
                            this.field634[this.field619] = var23.field634[var24];
                        }
                    }
                    this.field599[this.field619] = (short) this.method281(var23, var23.field599[var24], (byte) 123, var22);
                    this.field632[this.field619] = (short) this.method281(var23, var23.field632[var24], (byte) 11, var22);
                    this.field591[this.field619] = (short) this.method281(var23, var23.field591[var24], (byte) 122, var22);
                    this.field589[this.field619] = var22;
                    this.field606[this.field619] = var23.field606[var24];
                    this.field619++;
                }
                if (var23.field592 != null) {
                    for (int var25 = 0; var25 < var23.field592.length; var25++) {
                        int var26 = this.method281(var23, var23.field592[var25].field3322, (byte) 18, var22);
                        int var27 = this.method281(var23, var23.field592[var25].field3314, (byte) -56, var22);
                        int var28 = this.method281(var23, var23.field592[var25].field3320, (byte) 124, var22);
                        this.field592[var12] = new class219(var23.field592[var25].field3335, var26, var27, var28, var23.field592[var25].field3315);
                        var12++;
                    }
                }
                if (var23.field587 != null) {
                    for (int var29 = 0; var29 < var23.field587.length; var29++) {
                        int var30 = this.method281(var23, var23.field587[var29].field1320, (byte) 106, var22);
                        this.field587[var13] = new class95(var23.field587[var29].field1322, var30);
                        var13++;
                    }
                }
            }
        }
        this.field610 = this.field611;
        int var15 = 0;
        for (int var16 = 0; var16 < arg1; var16++) {
            short var17 = (short) (0x1 << var16);
            class49 var18 = arg0[var16];
            if (var18 != null) {
                for (int var19 = 0; var19 < var18.field619; var19++) {
                    if (var8) {
                        this.field586[var15++] = (byte) (var18.field586 == null || var18.field586[var19] == -1 ? -1 : var18.field586[var19] + this.field617);
                    }
                }
                for (int var20 = 0; var20 < var18.field617; var20++) {
                    byte var21 = this.field630[this.field617] = var18.field630[var20];
                    if (var21 == 0) {
                        this.field597[this.field617] = (short) this.method281(var18, var18.field597[var20], (byte) -85, var17);
                        this.field605[this.field617] = (short) this.method281(var18, var18.field605[var20], (byte) -31, var17);
                        this.field594[this.field617] = (short) this.method281(var18, var18.field594[var20], (byte) 124, var17);
                    }
                    if (var21 >= 1 && var21 <= 3) {
                        this.field597[this.field617] = var18.field597[var20];
                        this.field605[this.field617] = var18.field605[var20];
                        this.field594[this.field617] = var18.field594[var20];
                        this.field628[this.field617] = var18.field628[var20];
                        this.field615[this.field617] = var18.field615[var20];
                        this.field621[this.field617] = var18.field621[var20];
                        this.field618[this.field617] = var18.field618[var20];
                        this.field588[this.field617] = var18.field588[var20];
                        this.field604[this.field617] = var18.field604[var20];
                    }
                    if (var21 == 2) {
                        this.field608[this.field617] = var18.field608[var20];
                        this.field629[this.field617] = var18.field629[var20];
                    }
                    this.field617++;
                }
            }
        }
    }

    static {
        new class151("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
    }
}
