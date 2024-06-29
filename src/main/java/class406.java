import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class406 {

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "B")
    public byte field5685 = 0;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
    public int field5702 = 0;

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "I")
    public int field5719 = 0;

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "I")
    public int field5731 = 0;

    @OriginalMember(owner = "client!qf", name = "V", descriptor = "I")
    public int field5732 = 0;

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "[S")
    public short[] field5723;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "[I")
    public int[] field5686;

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "[S")
    public short[] field5730;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "[B")
    public byte[] field5696;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "[S")
    public short[] field5701;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "[I")
    public int[] field5706;

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "[S")
    public short[] field5715;

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "[B")
    public byte[] field5727;

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "[I")
    public int[] field5722;

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "[I")
    public int[] field5711;

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "[S")
    public short[] field5709;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "[B")
    public byte[] field5694;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "[S")
    public short[] field5721;

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "[B")
    public byte[] field5710;

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "[S")
    public short[] field5725;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "[B")
    public byte[] field5691;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "[S")
    public short[] field5703;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "[S")
    public short[] field5688;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "[S")
    public short[] field5693;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "[B")
    public byte[] field5698;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "[B")
    public byte[] field5687;

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "[B")
    public byte[] field5717;

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "[B")
    public byte[] field5726;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "[B")
    public byte[] field5707;

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "[S")
    public short[] field5724;

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "[I")
    public int[] field5716;

    @OriginalMember(owner = "client!qf", name = "X", descriptor = "[S")
    public short[] field5734;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "[Lhq;")
    public class88[] field5700;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "[Lrl;")
    public class430[] field5692;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "[S")
    public short[] field5704;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "I")
    public static int field5714;

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!qf", name = "W", descriptor = "I")
    public static int field5733;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)[[I", line = 8)
    public final int[][] method2540(int arg0) {
        field5714++;
        int[] var2 = new int[256];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field5702; var4++) {
            int var9 = this.field5686[var4];
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
        if (arg0 != -22186) {
            this.field5734 = null;
        }
        for (int var7 = 0; var7 < this.field5702; var7++) {
            int var8 = this.field5686[var7];
            if (var8 >= 0) {
                var5[var8][var2[var8]++] = var7;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([BI)V", line = 72)
    private final void method2541(byte[] arg0, int arg1) {
        field5708++;
        class130 var3 = new class130(arg0);
        class130 var4 = new class130(arg0);
        class130 var5 = new class130(arg0);
        class130 var6 = new class130(arg0);
        class130 var7 = new class130(arg0);
        class130 var8 = new class130(arg0);
        class130 var9 = new class130(arg0);
        var3.field1880 = arg0.length - 23;
        this.field5719 = var3.method798(false);
        this.field5732 = var3.method798(false);
        this.field5731 = var3.method837(true);
        int var10 = var3.method837(true);
        boolean var11 = (var10 & 0x1) == 1;
        boolean var12 = (var10 & 0x2) == 2;
        int var13 = var3.method837(true);
        int var14 = var3.method837(true);
        int var15 = var3.method837(true);
        int var16 = var3.method837(true);
        int var17 = var3.method837(true);
        int var18 = var3.method798(false);
        int var19 = var3.method798(false);
        int var20 = var3.method798(false);
        int var21 = var3.method798(false);
        int var22 = var3.method798(false);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (this.field5731 > 0) {
            this.field5710 = new byte[this.field5731];
            var3.field1880 = 0;
            for (int var26 = 0; var26 < this.field5731; var26++) {
                byte var27 = this.field5710[var26] = var3.method823((byte) 108);
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
        int var28 = this.field5731;
        int var30 = this.field5719 + var28;
        int var31 = var30;
        if (var11) {
            var30 += this.field5732;
        }
        int var33 = this.field5732 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += this.field5732;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += this.field5732;
        }
        int var36 = var33;
        if (~var17 == arg1) {
            var33 += this.field5719;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += this.field5732;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += this.field5732 * 2;
        }
        int var42 = var22 + var39;
        int var44 = this.field5732 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 + var56;
        int var60 = var24 + var58;
        int var62 = var25 * 2 + var24 + var60;
        if (var14 == 1) {
            this.field5727 = new byte[this.field5732];
        }
        if (var15 == 1) {
            this.field5722 = new int[this.field5732];
        }
        this.field5715 = new short[this.field5732];
        this.field5706 = new int[this.field5719];
        if (var17 == 1) {
            this.field5686 = new int[this.field5719];
        }
        this.field5711 = new int[this.field5719];
        if (this.field5731 > 0) {
            this.field5688 = new short[this.field5731];
            if (var25 > 0) {
                this.field5698 = new byte[var25];
                this.field5694 = new byte[var25];
            }
            this.field5693 = new short[this.field5731];
            this.field5721 = new short[this.field5731];
            if (var24 > 0) {
                this.field5709 = new short[var24];
                this.field5687 = new byte[var24];
                this.field5691 = new byte[var24];
                this.field5703 = new short[var24];
                this.field5717 = new byte[var24];
                this.field5725 = new short[var24];
            }
        }
        this.field5716 = new int[this.field5719];
        if (var13 == 255) {
            this.field5707 = new byte[this.field5732];
        } else {
            this.field5685 = (byte) var13;
        }
        if (var16 == 1 && this.field5731 > 0) {
            this.field5696 = new byte[this.field5732];
        }
        this.field5724 = new short[this.field5732];
        var3.field1880 = var28;
        this.field5730 = new short[this.field5732];
        if (var11) {
            this.field5726 = new byte[this.field5732];
        }
        this.field5701 = new short[this.field5732];
        if (var16 == 1) {
            this.field5723 = new short[this.field5732];
        }
        var4.field1880 = var44;
        var5.field1880 = var46;
        var6.field1880 = var48;
        var7.field1880 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < this.field5719; var67++) {
            int var87 = var3.method837(true);
            int var88 = 0;
            if ((var87 & 0x1) != 0) {
                var88 = var4.method803(89);
            }
            int var89 = 0;
            if ((var87 & 0x2) != 0) {
                var89 = var5.method803(94);
            }
            int var90 = 0;
            if ((var87 & 0x4) != 0) {
                var90 = var6.method803(83);
            }
            this.field5711[var67] = var64 + var88;
            this.field5716[var67] = var65 + var89;
            this.field5706[var67] = var66 + var90;
            var66 = this.field5706[var67];
            var65 = this.field5716[var67];
            var64 = this.field5711[var67];
            if (var17 == 1) {
                this.field5686[var67] = var7.method837(true);
            }
        }
        var3.field1880 = var42;
        var4.field1880 = var31;
        var5.field1880 = var34;
        var6.field1880 = var37;
        var7.field1880 = var35;
        var8.field1880 = var40;
        var9.field1880 = var39;
        for (int var68 = 0; var68 < this.field5732; var68++) {
            this.field5701[var68] = (short) var3.method798(false);
            if (var11) {
                this.field5726[var68] = var4.method823((byte) 104);
            }
            if (var13 == 255) {
                this.field5707[var68] = var5.method823((byte) -108);
            }
            if (var14 == 1) {
                this.field5727[var68] = var6.method823((byte) -103);
            }
            if (var15 == 1) {
                this.field5722[var68] = var7.method837(true);
            }
            if (var16 == 1) {
                this.field5723[var68] = (short) (var8.method798(false) - 1);
            }
            if (this.field5696 != null) {
                if (this.field5723[var68] == -1) {
                    this.field5696[var68] = -1;
                } else {
                    this.field5696[var68] = (byte) (var9.method837(true) - 1);
                }
            }
        }
        this.field5702 = -1;
        var3.field1880 = var33;
        var4.field1880 = var30;
        short var69 = 0;
        short var70 = 0;
        short var71 = 0;
        short var72 = 0;
        for (int var73 = 0; var73 < this.field5732; var73++) {
            int var83 = var4.method837(true);
            if (var83 == 1) {
                var69 = (short) (var72 + var3.method803(97));
                var70 = (short) (var3.method803(89) + var69);
                var71 = (short) (var3.method803(115) + var70);
                var72 = var71;
                this.field5730[var73] = var69;
                this.field5715[var73] = var70;
                this.field5724[var73] = var71;
                if (this.field5702 < var69) {
                    this.field5702 = var69;
                }
                if (this.field5702 < var70) {
                    this.field5702 = var70;
                }
                if (this.field5702 < var71) {
                    this.field5702 = var71;
                }
            }
            if (var83 == 2) {
                var70 = var71;
                var71 = (short) (var3.method803(98) + var72);
                this.field5730[var73] = var69;
                var72 = var71;
                this.field5715[var73] = var70;
                this.field5724[var73] = var71;
                if (this.field5702 < var71) {
                    this.field5702 = var71;
                }
            }
            if (var83 == 3) {
                var69 = var71;
                var71 = (short) (var3.method803(81) + var72);
                var72 = var71;
                this.field5730[var73] = var69;
                this.field5715[var73] = var70;
                this.field5724[var73] = var71;
                if (var71 > this.field5702) {
                    this.field5702 = var71;
                }
            }
            if (var83 == 4) {
                short var86 = var69;
                var69 = var70;
                var70 = var86;
                var71 = (short) (var3.method803(121) + var72);
                var72 = var71;
                this.field5730[var73] = var69;
                this.field5715[var73] = var86;
                this.field5724[var73] = var71;
                if (var71 > this.field5702) {
                    this.field5702 = var71;
                }
            }
        }
        this.field5702++;
        var3.field1880 = var50;
        var4.field1880 = var52;
        var5.field1880 = var54;
        var6.field1880 = var56;
        var7.field1880 = var58;
        var8.field1880 = var60;
        for (int var74 = 0; var74 < this.field5731; var74++) {
            int var82 = this.field5710[var74] & 0xFF;
            if (var82 == 0) {
                this.field5721[var74] = (short) var3.method798(false);
                this.field5688[var74] = (short) var3.method798(false);
                this.field5693[var74] = (short) var3.method798(false);
            }
            if (var82 == 1) {
                this.field5721[var74] = (short) var4.method798(false);
                this.field5688[var74] = (short) var4.method798(false);
                this.field5693[var74] = (short) var4.method798(false);
                this.field5703[var74] = (short) var5.method798(false);
                this.field5709[var74] = (short) var5.method798(false);
                this.field5725[var74] = (short) var5.method798(false);
                this.field5687[var74] = var6.method823((byte) 125);
                this.field5691[var74] = var7.method823((byte) -17);
                this.field5717[var74] = var8.method823((byte) 104);
            }
            if (var82 == 2) {
                this.field5721[var74] = (short) var4.method798(false);
                this.field5688[var74] = (short) var4.method798(false);
                this.field5693[var74] = (short) var4.method798(false);
                this.field5703[var74] = (short) var5.method798(false);
                this.field5709[var74] = (short) var5.method798(false);
                this.field5725[var74] = (short) var5.method798(false);
                this.field5687[var74] = var6.method823((byte) -26);
                this.field5691[var74] = var7.method823((byte) -83);
                this.field5717[var74] = var8.method823((byte) 121);
                this.field5694[var74] = var8.method823((byte) 126);
                this.field5698[var74] = var8.method823((byte) -78);
            }
            if (var82 == 3) {
                this.field5721[var74] = (short) var4.method798(false);
                this.field5688[var74] = (short) var4.method798(false);
                this.field5693[var74] = (short) var4.method798(false);
                this.field5703[var74] = (short) var5.method798(false);
                this.field5709[var74] = (short) var5.method798(false);
                this.field5725[var74] = (short) var5.method798(false);
                this.field5687[var74] = var6.method823((byte) -111);
                this.field5691[var74] = var7.method823((byte) 112);
                this.field5717[var74] = var8.method823((byte) -35);
            }
        }
        if (!var12) {
            return;
        }
        var3.field1880 = var62;
        int var75 = var3.method837(true);
        if (var75 > 0) {
            this.field5700 = new class88[var75];
            for (int var76 = 0; var76 < var75; var76++) {
                int var77 = var3.method798(false);
                int var78 = var3.method798(false);
                byte var79;
                if (var13 == 255) {
                    var79 = this.field5707[var78];
                } else {
                    var79 = (byte) var13;
                }
                this.field5700[var76] = new class88(var77, this.field5730[var78], this.field5715[var78], this.field5724[var78], var79);
            }
        }
        int var80 = var3.method837(true);
        if (var80 <= 0) {
            return;
        }
        this.field5692 = new class430[var80];
        for (int var81 = 0; var81 < var80; var81++) {
            this.field5692[var81] = new class430(var3.method798(false), var3.method798(false));
        }
        return;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(SSI)V", line = 591)
    public final void method2542(short arg0, short arg1, int arg2) {
        field5720++;
        if (this.field5723 == null) {
            return;
        }
        for (int var4 = arg2; var4 < this.field5732; var4++) {
            if (this.field5723[var4] == arg0) {
                this.field5723[var4] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V", line = 613)
    public static final void method2543(int arg0) {
        int var1 = 34 % ((arg0 - 59) / 56);
        field5695++;
        if (class59.field786.method960()) {
            class19.method108(1);
            class59.field786.method1017(class117.field1588);
            class158.method1152(-116);
        } else {
            class358.method2335((byte) 81, class110.field1418);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I[B)V", line = 637)
    private final void method2544(int arg0, byte[] arg1) {
        field5713++;
        boolean var3 = false;
        boolean var4 = false;
        class130 var5 = new class130(arg1);
        class130 var6 = new class130(arg1);
        class130 var7 = new class130(arg1);
        class130 var8 = new class130(arg1);
        class130 var9 = new class130(arg1);
        var5.field1880 = arg1.length - 18;
        this.field5719 = var5.method798(false);
        this.field5732 = var5.method798(false);
        this.field5731 = var5.method837(true);
        int var10 = var5.method837(true);
        int var11 = var5.method837(true);
        int var12 = var5.method837(true);
        int var13 = var5.method837(true);
        int var14 = var5.method837(true);
        int var15 = var5.method798(false);
        if (arg0 != 23894) {
            return;
        }
        int var16 = var5.method798(false);
        int var17 = var5.method798(false);
        int var18 = var5.method798(false);
        byte var19 = 0;
        int var21 = this.field5719 + var19;
        int var23 = this.field5732 + var21;
        int var24 = var23;
        if (var11 == 255) {
            var23 += this.field5732;
        }
        int var25 = var23;
        if (var13 == 1) {
            var23 += this.field5732;
        }
        int var26 = var23;
        if (var10 == 1) {
            var23 += this.field5732;
        }
        int var27 = var23;
        if (var14 == 1) {
            var23 += this.field5719;
        }
        int var28 = var23;
        if (var12 == 1) {
            var23 += this.field5732;
        }
        int var30 = var18 + var23;
        int var32 = this.field5732 * 2 + var30;
        int var34 = this.field5731 * 6 + var32;
        int var36 = var15 + var34;
        int var38 = var16 + var36;
        this.field5730 = new short[this.field5732];
        this.field5724 = new short[this.field5732];
        int var10000 = var17 + var38;
        if (this.field5731 > 0) {
            this.field5710 = new byte[this.field5731];
            this.field5721 = new short[this.field5731];
            this.field5688 = new short[this.field5731];
            this.field5693 = new short[this.field5731];
        }
        this.field5701 = new short[this.field5732];
        if (var14 == 1) {
            this.field5686 = new int[this.field5719];
        }
        if (var13 == 1) {
            this.field5722 = new int[this.field5732];
        }
        if (var10 == 1) {
            this.field5726 = new byte[this.field5732];
            this.field5723 = new short[this.field5732];
            this.field5696 = new byte[this.field5732];
        }
        var5.field1880 = var19;
        if (var12 == 1) {
            this.field5727 = new byte[this.field5732];
        }
        if (var11 == 255) {
            this.field5707 = new byte[this.field5732];
        } else {
            this.field5685 = (byte) var11;
        }
        this.field5715 = new short[this.field5732];
        this.field5716 = new int[this.field5719];
        this.field5706 = new int[this.field5719];
        this.field5711 = new int[this.field5719];
        var6.field1880 = var34;
        var7.field1880 = var36;
        var8.field1880 = var38;
        var9.field1880 = var27;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        for (int var44 = 0; var44 < this.field5719; var44++) {
            int var60 = var5.method837(true);
            int var61 = 0;
            if ((var60 & 0x1) != 0) {
                var61 = var6.method803(57);
            }
            int var62 = 0;
            if ((var60 & 0x2) != 0) {
                var62 = var7.method803(arg0 ^ 0x5D64);
            }
            int var63 = 0;
            if ((var60 & 0x4) != 0) {
                var63 = var8.method803(58);
            }
            this.field5711[var44] = var41 + var61;
            this.field5716[var44] = var42 + var62;
            this.field5706[var44] = var43 + var63;
            var43 = this.field5706[var44];
            var41 = this.field5711[var44];
            var42 = this.field5716[var44];
            if (var14 == 1) {
                this.field5686[var44] = var9.method837(true);
            }
        }
        var5.field1880 = var30;
        var6.field1880 = var26;
        var7.field1880 = var24;
        var8.field1880 = var28;
        var9.field1880 = var25;
        for (int var45 = 0; var45 < this.field5732; var45++) {
            this.field5701[var45] = (short) var5.method798(false);
            if (var10 == 1) {
                int var59 = var6.method837(true);
                if ((var59 & 0x1) == 1) {
                    var3 = true;
                    this.field5726[var45] = 1;
                } else {
                    this.field5726[var45] = 0;
                }
                if ((var59 & 0x2) == 2) {
                    this.field5696[var45] = (byte) (var59 >> 2);
                    this.field5723[var45] = this.field5701[var45];
                    this.field5701[var45] = 127;
                    if (this.field5723[var45] != -1) {
                        var4 = true;
                    }
                } else {
                    this.field5696[var45] = -1;
                    this.field5723[var45] = -1;
                }
            }
            if (var11 == 255) {
                this.field5707[var45] = var7.method823((byte) -119);
            }
            if (var12 == 1) {
                this.field5727[var45] = var8.method823((byte) -79);
            }
            if (var13 == 1) {
                this.field5722[var45] = var9.method837(true);
            }
        }
        this.field5702 = -1;
        var5.field1880 = var23;
        var6.field1880 = var21;
        short var46 = 0;
        short var47 = 0;
        short var48 = 0;
        short var49 = 0;
        for (int var50 = 0; var50 < this.field5732; var50++) {
            int var55 = var6.method837(true);
            if (var55 == 1) {
                var46 = (short) (var49 + var5.method803(79));
                var47 = (short) (var5.method803(116) + var46);
                var48 = (short) (var47 + var5.method803(arg0 - 23838));
                this.field5730[var50] = var46;
                var49 = var48;
                this.field5715[var50] = var47;
                this.field5724[var50] = var48;
                if (var46 > this.field5702) {
                    this.field5702 = var46;
                }
                if (var47 > this.field5702) {
                    this.field5702 = var47;
                }
                if (var48 > this.field5702) {
                    this.field5702 = var48;
                }
            }
            if (var55 == 2) {
                var47 = var48;
                var48 = (short) (var49 + var5.method803(arg0 ^ 0x5D33));
                var49 = var48;
                this.field5730[var50] = var46;
                this.field5715[var50] = var47;
                this.field5724[var50] = var48;
                if (var48 > this.field5702) {
                    this.field5702 = var48;
                }
            }
            if (var55 == 3) {
                var46 = var48;
                var48 = (short) (var49 + var5.method803(108));
                var49 = var48;
                this.field5730[var50] = var46;
                this.field5715[var50] = var47;
                this.field5724[var50] = var48;
                if (this.field5702 < var48) {
                    this.field5702 = var48;
                }
            }
            if (var55 == 4) {
                short var58 = var46;
                var46 = var47;
                var48 = (short) (var49 + var5.method803(118));
                var47 = var58;
                this.field5730[var50] = var46;
                var49 = var48;
                this.field5715[var50] = var58;
                this.field5724[var50] = var48;
                if (var48 > this.field5702) {
                    this.field5702 = var48;
                }
            }
        }
        this.field5702++;
        var5.field1880 = var32;
        for (int var51 = 0; var51 < this.field5731; var51++) {
            this.field5710[var51] = 0;
            this.field5721[var51] = (short) var5.method798(false);
            this.field5688[var51] = (short) var5.method798(false);
            this.field5693[var51] = (short) var5.method798(false);
        }
        if (this.field5696 != null) {
            boolean var52 = false;
            for (int var53 = 0; var53 < this.field5732; var53++) {
                int var54 = this.field5696[var53] & 0xFF;
                if (var54 != 255) {
                    if ((this.field5721[var54] & 0xFFFF) == this.field5730[var53] && (this.field5688[var54] & 0xFFFF) == this.field5715[var53] && (this.field5693[var54] & 0xFFFF) == this.field5724[var53]) {
                        this.field5696[var53] = -1;
                    } else {
                        var52 = true;
                    }
                }
            }
            if (!var52) {
                this.field5696 = null;
            }
        }
        if (!var3) {
            this.field5726 = null;
        }
        if (!var4) {
            this.field5723 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "([B)V", line = 1400)
    public class406(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2541(arg0, -2);
        } else {
            this.method2544(23894, arg0);
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(III)V", line = 1411)
    public class406(int arg0, int arg1, int arg2) {
        this.field5723 = new short[arg1];
        this.field5686 = new int[arg0];
        this.field5730 = new short[arg1];
        this.field5696 = new byte[arg1];
        this.field5701 = new short[arg1];
        this.field5706 = new int[arg0];
        this.field5715 = new short[arg1];
        this.field5727 = new byte[arg1];
        this.field5722 = new int[arg1];
        this.field5711 = new int[arg0];
        if (arg2 > 0) {
            this.field5709 = new short[arg2];
            this.field5694 = new byte[arg2];
            this.field5721 = new short[arg2];
            this.field5710 = new byte[arg2];
            this.field5725 = new short[arg2];
            this.field5691 = new byte[arg2];
            this.field5703 = new short[arg2];
            this.field5688 = new short[arg2];
            this.field5693 = new short[arg2];
            this.field5698 = new byte[arg2];
            this.field5687 = new byte[arg2];
            this.field5717 = new byte[arg2];
        }
        this.field5726 = new byte[arg1];
        this.field5707 = new byte[arg1];
        this.field5724 = new short[arg1];
        this.field5716 = new int[arg0];
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "([Lqf;I)V", line = 1447)
    public class406(class406[] arg0, int arg1) {
        this.field5719 = 0;
        this.field5732 = 0;
        this.field5731 = 0;
        int var3 = 0;
        int var4 = 0;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        this.field5685 = -1;
        boolean var10 = false;
        for (int var11 = 0; var11 < arg1; var11++) {
            class406 var31 = arg0[var11];
            if (var31 != null) {
                this.field5732 += var31.field5732;
                this.field5719 += var31.field5719;
                this.field5731 += var31.field5731;
                var5 |= var31.field5726 != null;
                if (var31.field5692 != null) {
                    var4 += var31.field5692.length;
                }
                if (var31.field5700 != null) {
                    var3 += var31.field5700.length;
                }
                if (var31.field5707 == null) {
                    if (this.field5685 == -1) {
                        this.field5685 = var31.field5685;
                    }
                    if (this.field5685 != var31.field5685) {
                        var6 = true;
                    }
                } else {
                    var6 = true;
                }
                var10 |= var31.field5722 != null;
                var9 |= var31.field5723 != null;
                var7 |= var31.field5727 != null;
                var8 |= var31.field5696 != null;
            }
        }
        this.field5701 = new short[this.field5732];
        if (var6) {
            this.field5707 = new byte[this.field5732];
        }
        this.field5734 = new short[this.field5719];
        if (var7) {
            this.field5727 = new byte[this.field5732];
        }
        this.field5730 = new short[this.field5732];
        this.field5716 = new int[this.field5719];
        if (this.field5731 > 0) {
            this.field5725 = new short[this.field5731];
            this.field5691 = new byte[this.field5731];
            this.field5709 = new short[this.field5731];
            this.field5710 = new byte[this.field5731];
            this.field5693 = new short[this.field5731];
            this.field5694 = new byte[this.field5731];
            this.field5698 = new byte[this.field5731];
            this.field5703 = new short[this.field5731];
            this.field5717 = new byte[this.field5731];
            this.field5721 = new short[this.field5731];
            this.field5688 = new short[this.field5731];
            this.field5687 = new byte[this.field5731];
        }
        if (var8) {
            this.field5696 = new byte[this.field5732];
        }
        if (var3 > 0) {
            this.field5700 = new class88[var3];
        }
        if (var4 > 0) {
            this.field5692 = new class430[var4];
        }
        this.field5715 = new short[this.field5732];
        if (var10) {
            this.field5722 = new int[this.field5732];
        }
        this.field5711 = new int[this.field5719];
        this.field5724 = new short[this.field5732];
        this.field5704 = new short[this.field5732];
        this.field5686 = new int[this.field5719];
        if (var9) {
            this.field5723 = new short[this.field5732];
        }
        if (var5) {
            this.field5726 = new byte[this.field5732];
        }
        this.field5706 = new int[this.field5719];
        this.field5732 = 0;
        int var12 = 0;
        this.field5719 = 0;
        this.field5731 = 0;
        int var13 = 0;
        for (int var14 = 0; var14 < arg1; var14++) {
            short var22 = (short) (0x1 << var14);
            class406 var23 = arg0[var14];
            if (var23 != null) {
                for (int var24 = 0; var24 < var23.field5732; var24++) {
                    if (var5 && var23.field5726 != null) {
                        this.field5726[this.field5732] = var23.field5726[var24];
                    }
                    if (var6) {
                        if (var23.field5707 == null) {
                            this.field5707[this.field5732] = var23.field5685;
                        } else {
                            this.field5707[this.field5732] = var23.field5707[var24];
                        }
                    }
                    if (var7 && var23.field5727 != null) {
                        this.field5727[this.field5732] = var23.field5727[var24];
                    }
                    if (var9) {
                        if (var23.field5723 == null) {
                            this.field5723[this.field5732] = -1;
                        } else {
                            this.field5723[this.field5732] = var23.field5723[var24];
                        }
                    }
                    if (var10) {
                        if (var23.field5722 == null) {
                            this.field5722[this.field5732] = -1;
                        } else {
                            this.field5722[this.field5732] = var23.field5722[var24];
                        }
                    }
                    this.field5730[this.field5732] = (short) this.method2550(var23.field5730[var24], var23, 9344, var22);
                    this.field5715[this.field5732] = (short) this.method2550(var23.field5715[var24], var23, 9344, var22);
                    this.field5724[this.field5732] = (short) this.method2550(var23.field5724[var24], var23, 9344, var22);
                    this.field5704[this.field5732] = var22;
                    this.field5701[this.field5732] = var23.field5701[var24];
                    this.field5732++;
                }
                if (var23.field5700 != null) {
                    for (int var25 = 0; var25 < var23.field5700.length; var25++) {
                        int var26 = this.method2550(var23.field5700[var25].field1151, var23, 9344, var22);
                        int var27 = this.method2550(var23.field5700[var25].field1143, var23, 9344, var22);
                        int var28 = this.method2550(var23.field5700[var25].field1144, var23, 9344, var22);
                        this.field5700[var13] = new class88(var23.field5700[var25].field1149, var26, var27, var28, var23.field5700[var25].field1152);
                        var13++;
                    }
                }
                if (var23.field5692 != null) {
                    for (int var29 = 0; var29 < var23.field5692.length; var29++) {
                        int var30 = this.method2550(var23.field5692[var29].field6113, var23, 9344, var22);
                        this.field5692[var12] = new class430(var23.field5692[var29].field6121, var30);
                        var12++;
                    }
                }
            }
        }
        this.field5702 = this.field5719;
        int var15 = 0;
        for (int var16 = 0; var16 < arg1; var16++) {
            short var17 = (short) (0x1 << var16);
            class406 var18 = arg0[var16];
            if (var18 != null) {
                for (int var19 = 0; var19 < var18.field5732; var19++) {
                    if (var8) {
                        this.field5696[var15++] = (byte) (var18.field5696 == null || var18.field5696[var19] == -1 ? -1 : var18.field5696[var19] + this.field5731);
                    }
                }
                for (int var20 = 0; var20 < var18.field5731; var20++) {
                    byte var21 = this.field5710[this.field5731] = var18.field5710[var20];
                    if (var21 == 0) {
                        this.field5721[this.field5731] = (short) this.method2550(var18.field5721[var20], var18, 9344, var17);
                        this.field5688[this.field5731] = (short) this.method2550(var18.field5688[var20], var18, 9344, var17);
                        this.field5693[this.field5731] = (short) this.method2550(var18.field5693[var20], var18, 9344, var17);
                    }
                    if (var21 >= 1 && var21 <= 3) {
                        this.field5721[this.field5731] = var18.field5721[var20];
                        this.field5688[this.field5731] = var18.field5688[var20];
                        this.field5693[this.field5731] = var18.field5693[var20];
                        this.field5703[this.field5731] = var18.field5703[var20];
                        this.field5709[this.field5731] = var18.field5709[var20];
                        this.field5725[this.field5731] = var18.field5725[var20];
                        this.field5687[this.field5731] = var18.field5687[var20];
                        this.field5691[this.field5731] = var18.field5691[var20];
                        this.field5717[this.field5731] = var18.field5717[var20];
                    }
                    if (var21 == 2) {
                        this.field5694[this.field5731] = var18.field5694[var20];
                        this.field5698[this.field5731] = var18.field5698[var20];
                    }
                    this.field5731++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIII)V", line = 1032)
    public final void method2545(int arg0, int arg1, int arg2, int arg3) {
        field5705++;
        if (arg2 != 4) {
            method2548((String) null, (byte) 89);
        }
        for (int var5 = 0; var5 < this.field5719; var5++) {
            this.field5711[var5] += arg3;
            this.field5716[var5] += arg0;
            this.field5706[var5] += arg1;
        }
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)[[I", line = 1057)
    public final int[][] method2546(int arg0) {
        field5728++;
        int[] var2 = new int[256];
        int var3 = 0;
        for (int var4 = arg0; var4 < this.field5732; var4++) {
            int var9 = this.field5722[var4];
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
        for (int var7 = 0; var7 < this.field5732; var7++) {
            int var8 = this.field5722[var7];
            if (var8 >= 0) {
                var5[var8][var2[var8]++] = var7;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(SIS)V", line = 1119)
    public final void method2547(short arg0, int arg1, short arg2) {
        if (arg1 >= -79) {
            this.method2542((short) -106, (short) -107, -27);
        }
        field5690++;
        for (int var4 = 0; var4 < this.field5732; var4++) {
            if (this.field5701[var4] == arg0) {
                this.field5701[var4] = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 1141)
    public static final boolean method2548(String arg0, byte arg1) {
        field5699++;
        if (arg0 == null) {
            return false;
        }
        if (arg1 >= -56) {
            method2548((String) null, (byte) 21);
        }
        for (int var2 = 0; var2 < class206.field2897; var2++) {
            if (arg0.equalsIgnoreCase(class56.field743[var2])) {
                return true;
            }
        }
        return arg0.equalsIgnoreCase(class181.field2555.field1790);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(IIII)V", line = 1172)
    public final void method2549(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            int var5 = class447.field6381[arg1];
            int var6 = class447.field6390[arg1];
            for (int var7 = 0; var7 < this.field5719; var7++) {
                int var8 = this.field5716[var7] * var5 + this.field5711[var7] * var6 >> 15;
                this.field5716[var7] = this.field5716[var7] * var6 - (this.field5711[var7] * var5) >> 15;
                this.field5711[var7] = var8;
            }
        }
        if (arg3 < 2) {
            this.method2551((byte) -7, (byte) -68, (short) 19, -75, (byte) -127, (byte) -75, 113, (short) -109, 124);
        }
        field5733++;
        if (arg0 != 0) {
            int var9 = class447.field6381[arg0];
            int var10 = class447.field6390[arg0];
            for (int var11 = 0; var11 < this.field5719; var11++) {
                int var12 = this.field5716[var11] * var10 - (this.field5706[var11] * var9) >> 15;
                this.field5706[var11] = this.field5716[var11] * var9 + (this.field5706[var11] * var10) >> 15;
                this.field5716[var11] = var12;
            }
        }
        if (arg2 == 0) {
            return;
        }
        int var13 = class447.field6381[arg2];
        int var14 = class447.field6390[arg2];
        for (int var15 = 0; var15 < this.field5719; var15++) {
            int var16 = this.field5711[var15] * var14 + this.field5706[var15] * var13 >> 15;
            this.field5706[var15] = this.field5706[var15] * var14 - this.field5711[var15] * var13 >> 15;
            this.field5711[var15] = var16;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILqf;IS)I", line = 1244)
    private final int method2550(int arg0, class406 arg1, int arg2, short arg3) {
        field5729++;
        int var5 = arg1.field5711[arg0];
        int var6 = arg1.field5716[arg0];
        int var7 = arg1.field5706[arg0];
        for (int var8 = 0; var8 < this.field5719; var8++) {
            if (this.field5711[var8] == var5 && this.field5716[var8] == var6 && this.field5706[var8] == var7) {
                this.field5734[var8] = (short) class332.method2176(this.field5734[var8], arg3);
                return var8;
            }
        }
        if (arg2 != 9344) {
            this.field5685 = -113;
        }
        this.field5711[this.field5719] = var5;
        this.field5716[this.field5719] = var6;
        this.field5706[this.field5719] = var7;
        this.field5734[this.field5719] = arg3;
        this.field5686[this.field5719] = arg1.field5686 == null ? -1 : arg1.field5686[arg0];
        return this.field5719++;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BBSIBBISI)I", line = 1283)
    public final int method2551(byte arg0, byte arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, short arg7, int arg8) {
        field5697++;
        this.field5730[this.field5732] = (short) arg3;
        this.field5715[this.field5732] = (short) arg6;
        this.field5724[this.field5732] = (short) arg8;
        if (arg0 != 66) {
            this.field5691 = null;
        }
        this.field5726[this.field5732] = arg5;
        this.field5696[this.field5732] = arg4;
        this.field5701[this.field5732] = arg7;
        this.field5727[this.field5732] = arg1;
        this.field5723[this.field5732] = arg2;
        return this.field5732++;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(SBSSSSBSBB)B", line = 1304)
    public final byte method2552(short arg0, byte arg1, short arg2, short arg3, short arg4, short arg5, byte arg6, short arg7, byte arg8, byte arg9) {
        field5718++;
        if (this.field5731 >= 255) {
            throw new IllegalStateException();
        }
        this.field5710[this.field5731] = 3;
        this.field5721[this.field5731] = arg5;
        this.field5688[this.field5731] = arg2;
        this.field5693[this.field5731] = arg0;
        this.field5703[this.field5731] = arg3;
        int var11 = -118 % ((-arg6 - 32) / 46);
        this.field5709[this.field5731] = arg7;
        this.field5725[this.field5731] = arg4;
        this.field5687[this.field5731] = arg1;
        this.field5691[this.field5731] = arg9;
        this.field5717[this.field5731] = arg8;
        return (byte) (this.field5731++);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ltj;B)V", line = 1334)
    public static final void method2553(class108 arg0, byte arg1) {
        class135.field2090 = arg0;
        if (arg1 > -107) {
            method2543(20);
        }
        field5689++;
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(IIII)I", line = 1362)
    public final int method2554(int arg0, int arg1, int arg2, int arg3) {
        field5712++;
        if (arg1 > -46) {
            return 52;
        }
        for (int var5 = 0; var5 < this.field5719; var5++) {
            if (this.field5711[var5] == arg0 && this.field5716[var5] == arg3 && this.field5706[var5] == arg2) {
                return var5;
            }
        }
        this.field5711[this.field5719] = arg0;
        this.field5716[this.field5719] = arg3;
        this.field5706[this.field5719] = arg2;
        this.field5702 = this.field5719 + 1;
        return this.field5719++;
    }
}
