import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class781 {

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "[I")
    private int[] field10700;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "[I")
    private int[] field10706;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field10702 = 0;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "Low;")
    public static class665 field10710 = new class665();

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "Z")
    public static boolean field10717 = false;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field10699;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field10701;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    private int field10704;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field10705;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field10707;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field10708;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field10709;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public static int field10711;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    private int field10712;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    private int field10713;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
    public static int field10714;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    private int field10716;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "Lgga;")
    public static class513 field10715;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "[S")
    public static short[] field10703;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V", line = 3)
    public static void method4286(int arg0) {
        field10715 = null;
        field10703 = null;
        if (arg0 != -12631) {
            field10702 = 88;
        }
        field10710 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)Z", line = 15)
    public static final boolean method4287(int arg0, int arg1, int arg2) {
        int var3 = -116 / ((arg2 - 67) / 45);
        field10701++;
        return class236.method1598(arg0, -96, arg1) || class484.method2854(arg0, -72, arg1);
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)I", line = 28)
    public final int method4288(int arg0) {
        if (this.field10713 == 0) {
            this.method4294(-23153);
            this.field10713 = 256;
        }
        if (arg0 <= 61) {
            this.field10706 = null;
        }
        field10707++;
        return this.field10706[this.field10713 - 1];
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V", line = 48)
    private final void method4289(int arg0) {
        field10699++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var7 + var8;
            int var63 = var6 + var61;
            int var64 = var62 ^ var7 >>> 2;
            int var65 = var7 + var63;
            int var66 = var5 + var64;
            int var67 = var65 ^ var63 << 8;
            int var68 = var4 + var67;
            int var69 = var63 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var3 + var6;
            int var71 = var66 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var2 + var5;
            int var73 = var68 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var72;
            var3 = var75 ^ var72 << 8;
            int var76 = var72 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        int var11 = 0;
        if (arg0 < 81) {
            field10703 = null;
        }
        while (var11 < 256) {
            int var37 = this.field10706[var11 + 3] + var6;
            int var38 = this.field10706[var11 + 7] + var2;
            int var39 = this.field10706[var11] + var9;
            int var40 = this.field10706[var11 + 2] + var7;
            int var41 = this.field10706[var11 + 1] + var8;
            int var42 = this.field10706[var11 + 6] + var3;
            int var43 = this.field10706[var11 + 5] + var4;
            int var44 = this.field10706[var11 + 4] + var5;
            int var45 = var39 ^ var41 << 11;
            int var46 = var40 + var41;
            int var47 = var37 + var45;
            int var48 = var46 ^ var40 >>> 2;
            int var49 = var44 + var48;
            int var50 = var40 + var47;
            int var51 = var50 ^ var47 << 8;
            int var52 = var43 + var51;
            int var53 = var47 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var49 + var52;
            int var55 = var6 + var42;
            var5 = var54 ^ var52 << 10;
            int var56 = var52 + var55;
            int var57 = var5 + var38;
            var4 = var56 ^ var55 >>> 4;
            int var58 = var55 + var57;
            int var59 = var4 + var45;
            var3 = var58 ^ var57 << 8;
            var8 = var3 + var48;
            int var60 = var57 + var59;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            var7 = var2 + var51;
            this.field10700[var11] = var9;
            this.field10700[var11 + 1] = var8;
            this.field10700[var11 + 2] = var7;
            this.field10700[var11 + 3] = var6;
            this.field10700[var11 + 4] = var5;
            this.field10700[var11 + 5] = var4;
            this.field10700[var11 + 6] = var3;
            this.field10700[var11 + 7] = var2;
            var11 += 8;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field10700[var12 + 6] + var3;
            int var14 = this.field10700[var12 + 4] + var5;
            int var15 = this.field10700[var12 + 3] + var6;
            int var16 = this.field10700[var12] + var9;
            int var17 = this.field10700[var12 + 5] + var4;
            int var18 = this.field10700[var12 + 1] + var8;
            int var19 = this.field10700[var12 + 7] + var2;
            int var20 = this.field10700[var12 + 2] + var7;
            int var21 = var16 ^ var18 << 11;
            int var22 = var18 + var20;
            int var23 = var15 + var21;
            int var24 = var22 ^ var20 >>> 2;
            int var25 = var20 + var23;
            int var26 = var14 + var24;
            int var27 = var25 ^ var23 << 8;
            int var28 = var17 + var27;
            int var29 = var23 + var26;
            var6 = var29 ^ var26 >>> 16;
            int var30 = var26 + var28;
            int var31 = var6 + var13;
            var5 = var30 ^ var28 << 10;
            int var32 = var28 + var31;
            int var33 = var5 + var19;
            var4 = var32 ^ var31 >>> 4;
            int var34 = var31 + var33;
            int var35 = var4 + var21;
            var3 = var34 ^ var33 << 8;
            int var36 = var33 + var35;
            var8 = var3 + var24;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field10700[var12] = var9;
            this.field10700[var12 + 1] = var8;
            this.field10700[var12 + 2] = var7;
            this.field10700[var12 + 3] = var6;
            this.field10700[var12 + 4] = var5;
            this.field10700[var12 + 5] = var4;
            this.field10700[var12 + 6] = var3;
            this.field10700[var12 + 7] = var2;
        }
        this.method4294(-23153);
        this.field10713 = 256;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)I", line = 198)
    public final int method4290(byte arg0) {
        if (this.field10713 == 0) {
            this.method4294(-23153);
            this.field10713 = 256;
        }
        if (arg0 == 1) {
            field10705++;
            return this.field10706[--this.field10713];
        } else {
            return 86;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIILfm;BI)V", line = 225)
    public static final void method4291(int arg0, int arg1, int arg2, int arg3, class281 arg4, byte arg5, int arg6) {
        field10709++;
        if (arg5 != -82) {
            field10715 = null;
        }
        class591.method3466(arg6, arg2, 0, arg1, arg4.field10350, arg3, arg4.field10361, 0, arg0, arg4.field10347);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BII)I", line = 238)
    public static final int method4292(byte arg0, int arg1, int arg2) {
        if (arg0 <= 67) {
            method4292((byte) 55, -99, -105);
        }
        field10714++;
        return arg2 == 1 || arg2 == 3 ? class507.field6978[arg1 & 0x3] : class438.field6085[arg1 & 0x3];
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLvt;)I", line = 256)
    public static final int method4293(byte arg0, class768 arg1) {
        field10708++;
        if (class552.field7657 == arg1) {
            return 7681;
        } else if (class317.field4523 == arg1) {
            return 8448;
        } else if (class407.field5606 == arg1) {
            return 34165;
        } else if (class228.field3319 == arg1) {
            return 260;
        } else if (class785.field10755 == arg1) {
            return 34023;
        } else {
            int var2 = 127 % ((-arg0 - 28) / 46);
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)V", line = 290)
    private final void method4294(int arg0) {
        field10711++;
        if (arg0 != -23153) {
            method4292((byte) -60, -23, 103);
        }
        this.field10712 += ++this.field10716;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field10700[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field10704 ^= this.field10704 << 13;
                } else {
                    this.field10704 ^= this.field10704 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field10704 ^= this.field10704 << 2;
            } else {
                this.field10704 ^= this.field10704 >>> 16;
            }
            this.field10704 += this.field10700[var2 + 128 & 0xFF];
            int var4;
            this.field10700[var2] = var4 = this.field10704 + this.field10700[class194.method1380(255, var3 >> 2)] + this.field10712;
            this.field10706[var2] = this.field10712 = this.field10700[class194.method1380(var4 >> 8 >> 2, 255)] + var3;
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V", line = 331)
    private class781() {
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "([I)V", line = 337)
    public class781(int[] arg0) {
        this.field10700 = new int[256];
        this.field10706 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field10706[var2] = arg0[var2];
        }
        this.method4289(126);
    }
}
