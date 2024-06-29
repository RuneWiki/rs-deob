import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class128 {

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "[I")
    private int[] field3031 = new int[256];

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "[I")
    private int[] field3041 = new int[256];

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field3029 = 0;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Lqf;")
    private static class117 field3027 = class72.method514(122, "OFF");

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "Lqf;")
    public static class117 field3038 = field3027;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field3035 = 0;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    private int field3030;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    private int field3033;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    private int field3036;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    private int field3039;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "Lr;")
    public static class118 field3040;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "[I")
    public static int[] field3025;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "[Lma;")
    public static class84[] field3028;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)I")
    public final int method1000(boolean arg0) {
        if (!arg0) {
            this.method1004(73);
        }
        if (this.field3036-- == 0) {
            this.method1002(2);
            this.field3036 = 255;
        }
        field3026++;
        return this.field3041[this.field3036];
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static final void method1001(int arg0) {
        field3032++;
        if (class137.field3263.toLowerCase().indexOf("microsoft") == -1) {
            class25.field493[93] = 43;
            class25.field493[61] = 27;
            class25.field493[92] = 74;
            class25.field493[59] = 57;
            class25.field493[45] = 26;
            if (class137.field3260 == null) {
                class25.field493[222] = 59;
                class25.field493[192] = 58;
            } else {
                class25.field493[222] = 58;
                class25.field493[192] = 28;
                class25.field493[520] = 59;
            }
            class25.field493[47] = 73;
            class25.field493[44] = 71;
            class25.field493[46] = 72;
            class25.field493[91] = 42;
        } else {
            class25.field493[192] = 58;
            class25.field493[191] = 73;
            class25.field493[220] = 74;
            class25.field493[189] = 26;
            class25.field493[190] = 72;
            class25.field493[222] = 59;
            class25.field493[186] = 57;
            class25.field493[223] = 28;
            class25.field493[221] = 43;
            class25.field493[188] = 71;
            class25.field493[187] = 27;
            class25.field493[219] = 42;
        }
        if (arg0 != -106957112) {
            method1001(-75);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
    private final void method1002(int arg0) {
        field3037++;
        if (arg0 != 2) {
            field3040 = null;
        }
        this.field3030 += ++this.field3039;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field3031[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field3033 ^= this.field3033 << 13;
                } else {
                    this.field3033 ^= this.field3033 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field3033 ^= this.field3033 << 2;
            } else {
                this.field3033 ^= this.field3033 >>> 16;
            }
            this.field3033 += this.field3031[var2 + 128 & 0xFF];
            int var4;
            this.field3031[var2] = var4 = this.field3030 + this.field3031[class16.method135(var3, 1020) >> 2] + this.field3033;
            this.field3041[var2] = this.field3030 = var3 + this.field3031[class16.method135(var4 >> 8 >> 2, 255)];
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V")
    public static void method1003(int arg0) {
        field3027 = null;
        field3038 = null;
        field3025 = null;
        field3028 = null;
        if (arg0 != -5) {
            method1001(46);
        }
        field3040 = null;
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)V")
    private final void method1004(int arg0) {
        field3034++;
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
            int var63 = var62 ^ var7 >>> 2;
            int var64 = var5 + var63;
            int var65 = var6 + var61;
            int var66 = var7 + var65;
            int var67 = var66 ^ var65 << 8;
            int var68 = var64 + var65;
            var6 = var68 ^ var64 >>> 16;
            int var69 = var3 + var6;
            int var70 = var4 + var67;
            int var71 = var64 + var70;
            var5 = var71 ^ var70 << 10;
            int var72 = var2 + var5;
            int var73 = var69 + var70;
            var4 = var73 ^ var69 >>> 4;
            int var74 = var4 + var61;
            int var75 = var69 + var72;
            var3 = var75 ^ var72 << 8;
            int var76 = var72 + var74;
            var2 = var76 ^ var74 >>> 9;
            var8 = var3 + var63;
            var7 = var2 + var67;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field3041[var11 + 1] + var8;
            int var38 = this.field3041[var11 + 7] + var2;
            int var39 = this.field3041[var11 + 3] + var6;
            int var40 = this.field3041[var11 + 5] + var4;
            int var41 = this.field3041[var11 + 4] + var5;
            int var42 = this.field3041[var11 + 6] + var3;
            int var43 = this.field3041[var11] + var9;
            int var44 = var43 ^ var37 << 11;
            int var45 = var39 + var44;
            int var46 = this.field3041[var11 + 2] + var7;
            int var47 = var37 + var46;
            int var48 = var47 ^ var46 >>> 2;
            int var49 = var41 + var48;
            int var50 = var45 + var46;
            int var51 = var50 ^ var45 << 8;
            int var52 = var40 + var51;
            int var53 = var45 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var49 + var52;
            int var55 = var6 + var42;
            var5 = var54 ^ var52 << 10;
            int var56 = var5 + var38;
            int var57 = var52 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var4 + var44;
            int var59 = var55 + var56;
            var3 = var59 ^ var56 << 8;
            int var60 = var56 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            var7 = var2 + var51;
            this.field3031[var11] = var9;
            this.field3031[var11 + 1] = var8;
            this.field3031[var11 + 2] = var7;
            this.field3031[var11 + 3] = var6;
            this.field3031[var11 + 4] = var5;
            this.field3031[var11 + 5] = var4;
            this.field3031[var11 + 6] = var3;
            this.field3031[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field3031[var12 + 1] + var8;
            int var14 = this.field3031[var12 + 2] + var7;
            int var15 = this.field3031[var12 + 3] + var6;
            int var16 = this.field3031[var12 + 6] + var3;
            int var17 = this.field3031[var12] + var9;
            int var18 = var17 ^ var13 << 11;
            int var19 = var15 + var18;
            int var20 = var13 + var14;
            int var21 = this.field3031[var12 + 7] + var2;
            int var22 = this.field3031[var12 + 4] + var5;
            int var23 = var20 ^ var14 >>> 2;
            int var24 = this.field3031[var12 + 5] + var4;
            int var25 = var14 + var19;
            int var26 = var25 ^ var19 << 8;
            int var27 = var22 + var23;
            int var28 = var24 + var26;
            int var29 = var19 + var27;
            var6 = var29 ^ var27 >>> 16;
            int var30 = var27 + var28;
            var5 = var30 ^ var28 << 10;
            int var31 = var6 + var16;
            int var32 = var5 + var21;
            int var33 = var28 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var31 + var32;
            int var35 = var4 + var18;
            var3 = var34 ^ var32 << 8;
            int var36 = var32 + var35;
            var8 = var3 + var23;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var26;
            this.field3031[var12] = var9;
            this.field3031[var12 + 1] = var8;
            this.field3031[var12 + 2] = var7;
            this.field3031[var12 + 3] = var6;
            this.field3031[var12 + 4] = var5;
            this.field3031[var12 + 5] = var4;
            this.field3031[var12 + 6] = var3;
            this.field3031[var12 + 7] = var2;
        }
        if (arg0 == -1701312056) {
            this.method1002(2);
            this.field3036 = 256;
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "([I)V")
    public class128(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3041[var2] = arg0[var2];
        }
        this.method1004(-1701312056);
    }
}
