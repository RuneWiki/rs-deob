import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class395 {

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "[I")
    private int[] field5496;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "[I")
    private int[] field5497;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "I")
    public static int field5495;

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "I")
    private int field5501;

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "I")
    private int field5504;

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "I")
    private int field5506;

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!rr", name = "o", descriptor = "I")
    private int field5509;

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "Lkha;")
    public static class687 field5502;

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "Ljava/lang/String;")
    public static String field5507;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)I", line = 3)
    public final int method2350(int arg0) {
        field5508++;
        if (arg0 != 256) {
            field5507 = null;
        }
        if (this.field5509 == 0) {
            this.method2351(false);
            this.field5509 = 256;
        }
        return this.field5496[this.field5509 - 1];
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Z)V", line = 23)
    private final void method2351(boolean arg0) {
        field5503++;
        this.field5504 += ++this.field5501;
        if (arg0) {
            this.field5501 = 91;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field5497[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field5506 ^= this.field5506 << 13;
                } else {
                    this.field5506 ^= this.field5506 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field5506 ^= this.field5506 << 2;
            } else {
                this.field5506 ^= this.field5506 >>> 16;
            }
            this.field5506 += this.field5497[var2 + 128 & 0xFF];
            int var4;
            this.field5497[var2] = var4 = this.field5504 + this.field5506 + this.field5497[class272.method1629(1020, var3) >> 2];
            this.field5496[var2] = this.field5504 = var3 + this.field5497[class272.method1629(var4 >> 8 >> 2, 255)];
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 65)
    public static final void method2352(String arg0, int arg1, int arg2) {
        class673.method3627((byte) -124, "", "", arg1, "", 0, arg0);
        field5499++;
        if (arg2 > -127) {
            field5507 = null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)I", line = 78)
    public final int method2353(int arg0) {
        field5498++;
        if (arg0 < 114) {
            this.field5509 = 119;
        }
        if (this.field5509 == 0) {
            this.method2351(false);
            this.field5509 = 256;
        }
        return this.field5496[--this.field5509];
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIII)V", line = 97)
    public static final void method2354(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            field5507 = null;
        }
        int var4 = arg1 * class223.field2944.field593.method3601((byte) -124) >> 8;
        field5505++;
        if (var4 == 0 || arg0 == -1) {
            return;
        }
        if (!class537.field7549 && class601.field8357 != -1 && class141.method874(arg2 - 16768) && !class444.method2617(0)) {
            class374.field5250 = class751.method4196(8);
            class681 var5 = class497.method2887(9, class374.field5250);
            class547.method3113(6, var5, true);
        }
        class454.method2665(class487.field6937, false, var4, false, 0, arg0);
        class540.method3074(true, -1, 255);
        class537.field7549 = true;
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)V", line = 136)
    public static void method2355(int arg0) {
        field5507 = null;
        if (arg0 != -29422) {
            method2352(null, 23, -39);
        }
        field5502 = null;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(Z)V", line = 149)
    private final void method2356(boolean arg0) {
        field5500++;
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
            int var70 = var66 + var68;
            int var71 = var3 + var6;
            var5 = var70 ^ var68 << 10;
            int var72 = var68 + var71;
            int var73 = var2 + var5;
            var4 = var72 ^ var71 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var73;
            var3 = var75 ^ var73 << 8;
            int var76 = var73 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field5496[var11 + 7] + var2;
            int var38 = this.field5496[var11 + 3] + var6;
            int var39 = this.field5496[var11 + 1] + var8;
            int var40 = this.field5496[var11] + var9;
            int var41 = this.field5496[var11 + 6] + var3;
            int var42 = this.field5496[var11 + 4] + var5;
            int var43 = this.field5496[var11 + 2] + var7;
            int var44 = this.field5496[var11 + 5] + var4;
            int var45 = var40 ^ var39 << 11;
            int var46 = var39 + var43;
            int var47 = var38 + var45;
            int var48 = var46 ^ var43 >>> 2;
            int var49 = var42 + var48;
            int var50 = var43 + var47;
            int var51 = var50 ^ var47 << 8;
            int var52 = var44 + var51;
            int var53 = var47 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var49 + var52;
            int var55 = var6 + var41;
            var5 = var54 ^ var52 << 10;
            int var56 = var5 + var37;
            int var57 = var52 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var4 + var45;
            int var59 = var55 + var56;
            var3 = var59 ^ var56 << 8;
            var8 = var3 + var48;
            int var60 = var56 + var58;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            var7 = var2 + var51;
            this.field5497[var11] = var9;
            this.field5497[var11 + 1] = var8;
            this.field5497[var11 + 2] = var7;
            this.field5497[var11 + 3] = var6;
            this.field5497[var11 + 4] = var5;
            this.field5497[var11 + 5] = var4;
            this.field5497[var11 + 6] = var3;
            this.field5497[var11 + 7] = var2;
        }
        if (!arg0) {
            method2355(98);
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field5497[var12] + var9;
            int var14 = this.field5497[var12 + 6] + var3;
            int var15 = this.field5497[var12 + 3] + var6;
            int var16 = this.field5497[var12 + 5] + var4;
            int var17 = this.field5497[var12 + 7] + var2;
            int var18 = this.field5497[var12 + 4] + var5;
            int var19 = this.field5497[var12 + 1] + var8;
            int var20 = this.field5497[var12 + 2] + var7;
            int var21 = var13 ^ var19 << 11;
            int var22 = var19 + var20;
            int var23 = var15 + var21;
            int var24 = var22 ^ var20 >>> 2;
            int var25 = var20 + var23;
            int var26 = var18 + var24;
            int var27 = var25 ^ var23 << 8;
            int var28 = var23 + var26;
            int var29 = var16 + var27;
            var6 = var28 ^ var26 >>> 16;
            int var30 = var26 + var29;
            int var31 = var6 + var14;
            var5 = var30 ^ var29 << 10;
            int var32 = var5 + var17;
            int var33 = var29 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var31 + var32;
            int var35 = var4 + var21;
            var3 = var34 ^ var32 << 8;
            var8 = var3 + var24;
            int var36 = var32 + var35;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field5497[var12] = var9;
            this.field5497[var12 + 1] = var8;
            this.field5497[var12 + 2] = var7;
            this.field5497[var12 + 3] = var6;
            this.field5497[var12 + 4] = var5;
            this.field5497[var12 + 5] = var4;
            this.field5497[var12 + 6] = var3;
            this.field5497[var12 + 7] = var2;
        }
        this.method2351(false);
        this.field5509 = 256;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "()V", line = 299)
    public static final void method2357() {
        for (int var0 = 0; var0 < class573.field7997.length; var0++) {
            class573.field7997[var0].method2450();
        }
        class573.field7997 = null;
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "()V", line = 309)
    private class395() {
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "([I)V", line = 312)
    public class395(int[] arg0) {
        this.field5496 = new int[256];
        this.field5497 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field5496[var2] = arg0[var2];
        }
        this.method2356(true);
    }
}
