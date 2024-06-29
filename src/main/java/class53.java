import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class53 {

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "[I")
    private int[] field939 = new int[256];

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "[I")
    private int[] field962 = new int[256];

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "Lai;")
    private static class10 field942 = class44.method278("flash2:", -106);

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "[[S")
    public static short[][] field943 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    public static int field950 = 0;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "Lai;")
    private static class10 field941 = class44.method278("Please wait )2 attempting to reestablish)3", 119);

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "Lai;")
    public static class10 field954 = field941;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field946 = 0;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "Lai;")
    private static class10 field952 = class44.method278("and choose the (Wcreate account(W", 115);

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "Lai;")
    private static class10 field945 = class44.method278("This computers address has been blocked", 113);

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Lai;")
    public static class10 field937 = field952;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "Lai;")
    public static class10 field958 = field942;

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "Lai;")
    public static class10 field960 = field942;

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "Lai;")
    private static class10 field961 = class44.method278("Create a free account", -104);

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "[[I")
    public static int[][] field949 = new int[104][104];

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "[Lme;")
    public static class114[] field944 = new class114[2048];

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "Lai;")
    public static class10 field947 = field945;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "Lai;")
    public static class10 field940 = field961;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "Lai;")
    public static class10 field957 = class44.method278("Weiter", 115);

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    private int field938;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    private int field951;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
    private int field953;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
    private int field955;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    private final void method370(byte arg0) {
        this.field951 += ++this.field938;
        field963++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var4 = this.field962[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field955 ^= this.field955 << 13;
                } else {
                    this.field955 ^= this.field955 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field955 ^= this.field955 << 2;
            } else {
                this.field955 ^= this.field955 >>> 16;
            }
            this.field955 += this.field962[var2 + 128 & 0xFF];
            int var5;
            this.field962[var2] = var5 = this.field955 + this.field951 + this.field962[class123.method861(var4, 1020) >> 2];
            this.field939[var2] = this.field951 = this.field962[class123.method861(255, var5 >> 8 >> 2)] + var4;
        }
        int var3 = 30 % ((arg0 - 48) / 40);
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)V")
    public static void method371(byte arg0) {
        field937 = null;
        if (arg0 != 23) {
            return;
        }
        field940 = null;
        field947 = null;
        field949 = null;
        field961 = null;
        field943 = null;
        field952 = null;
        field942 = null;
        field957 = null;
        field958 = null;
        field941 = null;
        field945 = null;
        field960 = null;
        field954 = null;
        field944 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)I")
    public final int method372(int arg0) {
        field936++;
        if (this.field953-- == 0) {
            this.method370((byte) 109);
            this.field953 = 255;
        }
        if (arg0 != -6) {
            field937 = null;
        }
        return this.field939[this.field953];
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)I")
    public static final int method373(int arg0, int arg1) {
        int var2 = 10 % ((-arg0 - 24) / 48);
        int var3 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var3 += 16;
        }
        if (arg1 >= 256) {
            var3 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var3 += 4;
        }
        if (arg1 >= 4) {
            var3 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var3++;
        }
        field956++;
        return arg1 + var3;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
    private final void method374(int arg0) {
        field959++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        if (arg0 >= -52) {
            this.field955 = 21;
        }
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var7 + var8;
            int var63 = var62 ^ var7 >>> 2;
            int var64 = var6 + var61;
            int var65 = var7 + var64;
            int var66 = var65 ^ var64 << 8;
            int var67 = var5 + var63;
            int var68 = var4 + var66;
            int var69 = var64 + var67;
            var6 = var69 ^ var67 >>> 16;
            int var70 = var67 + var68;
            var5 = var70 ^ var68 << 10;
            int var71 = var3 + var6;
            int var72 = var68 + var71;
            int var73 = var2 + var5;
            var4 = var72 ^ var71 >>> 4;
            int var74 = var71 + var73;
            int var75 = var4 + var61;
            var3 = var74 ^ var73 << 8;
            int var76 = var73 + var75;
            var8 = var3 + var63;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var66;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field939[var11 + 7] + var2;
            int var38 = this.field939[var11 + 4] + var5;
            int var39 = this.field939[var11 + 2] + var7;
            int var40 = this.field939[var11 + 3] + var6;
            int var41 = this.field939[var11] + var9;
            int var42 = this.field939[var11 + 5] + var4;
            int var43 = this.field939[var11 + 6] + var3;
            int var44 = this.field939[var11 + 1] + var8;
            int var45 = var41 ^ var44 << 11;
            int var46 = var39 + var44;
            int var47 = var46 ^ var39 >>> 2;
            int var48 = var40 + var45;
            int var49 = var39 + var48;
            int var50 = var49 ^ var48 << 8;
            int var51 = var42 + var50;
            int var52 = var38 + var47;
            int var53 = var48 + var52;
            var6 = var53 ^ var52 >>> 16;
            int var54 = var6 + var43;
            int var55 = var51 + var52;
            var5 = var55 ^ var51 << 10;
            int var56 = var5 + var37;
            int var57 = var51 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var4 + var45;
            int var59 = var54 + var56;
            var3 = var59 ^ var56 << 8;
            var8 = var3 + var47;
            int var60 = var56 + var58;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            var7 = var2 + var50;
            this.field962[var11] = var9;
            this.field962[var11 + 1] = var8;
            this.field962[var11 + 2] = var7;
            this.field962[var11 + 3] = var6;
            this.field962[var11 + 4] = var5;
            this.field962[var11 + 5] = var4;
            this.field962[var11 + 6] = var3;
            this.field962[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field962[var12 + 3] + var6;
            int var14 = this.field962[var12 + 4] + var5;
            int var15 = this.field962[var12 + 7] + var2;
            int var16 = this.field962[var12 + 5] + var4;
            int var17 = this.field962[var12 + 6] + var3;
            int var18 = this.field962[var12 + 1] + var8;
            int var19 = this.field962[var12] + var9;
            int var20 = var19 ^ var18 << 11;
            int var21 = var13 + var20;
            int var22 = this.field962[var12 + 2] + var7;
            int var23 = var18 + var22;
            int var24 = var23 ^ var22 >>> 2;
            int var25 = var21 + var22;
            int var26 = var14 + var24;
            int var27 = var25 ^ var21 << 8;
            int var28 = var21 + var26;
            int var29 = var16 + var27;
            var6 = var28 ^ var26 >>> 16;
            int var30 = var26 + var29;
            var5 = var30 ^ var29 << 10;
            int var31 = var6 + var17;
            int var32 = var29 + var31;
            var4 = var32 ^ var31 >>> 4;
            int var33 = var4 + var20;
            int var34 = var5 + var15;
            int var35 = var31 + var34;
            var3 = var35 ^ var34 << 8;
            int var36 = var33 + var34;
            var2 = var36 ^ var33 >>> 9;
            var7 = var2 + var27;
            var8 = var3 + var24;
            var9 = var8 + var33;
            this.field962[var12] = var9;
            this.field962[var12 + 1] = var8;
            this.field962[var12 + 2] = var7;
            this.field962[var12 + 3] = var6;
            this.field962[var12 + 4] = var5;
            this.field962[var12 + 5] = var4;
            this.field962[var12 + 6] = var3;
            this.field962[var12 + 7] = var2;
        }
        this.method370((byte) 121);
        this.field953 = 256;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "([I)V")
    public class53(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field939[var2] = arg0[var2];
        }
        this.method374(-86);
    }
}
