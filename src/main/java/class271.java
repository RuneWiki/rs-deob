import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class271 {

    @OriginalMember(owner = "client!h", name = "a", descriptor = "[I")
    private int[] field4802;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "[I")
    private int[] field4804;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field4807 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "Lcc;")
    public static class209 field4805 = class95.method669(110, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

    @OriginalMember(owner = "client!h", name = "h", descriptor = "Lcc;")
    public static class209 field4809 = class95.method669(108, "k");

    @OriginalMember(owner = "client!h", name = "p", descriptor = "Lcc;")
    public static class209 field4817 = class95.method669(104, "Versteckt");

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    private int field4810;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    private int field4811;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "I")
    private int field4814;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "I")
    private int field4818;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "Z")
    public static boolean field4806;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "[I")
    public static int[] field4815;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "[[[I")
    public static int[][][] field4803;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IILmb;ZLmb;IZ)I")
    public static final int method1848(int arg0, int arg1, class159 arg2, boolean arg3, class159 arg4, int arg5, boolean arg6) {
        field4808++;
        int var7 = class172.method1189(arg0, -99, arg3, arg2, arg4);
        if (var7 != 0) {
            return arg3 ? -var7 : var7;
        } else if (arg1 == -1) {
            return 0;
        } else {
            if (arg5 != -25989) {
                field4803 = null;
            }
            int var8 = class172.method1189(arg1, 82, arg6, arg2, arg4);
            return arg6 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)I")
    public final int method1849(int arg0) {
        field4813++;
        int var2 = 46 % ((arg0 + 30) / 46);
        if (this.field4814-- == 0) {
            this.method1851(-9453);
            this.field4814 = 255;
        }
        return this.field4802[this.field4814];
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
    public static void method1850(byte arg0) {
        field4803 = null;
        if (arg0 != 125) {
            field4803 = null;
        }
        field4815 = null;
        field4817 = null;
        field4809 = null;
        field4805 = null;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V")
    private final void method1851(int arg0) {
        this.field4811 += ++this.field4810;
        if (arg0 != -9453) {
            method1848(-54, -61, (class159) null, false, (class159) null, -8, true);
        }
        field4816++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field4804[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field4818 ^= this.field4818 << 13;
                } else {
                    this.field4818 ^= this.field4818 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field4818 ^= this.field4818 << 2;
            } else {
                this.field4818 ^= this.field4818 >>> 16;
            }
            this.field4818 += this.field4804[var2 + 128 & 0xFF];
            int var4;
            this.field4804[var2] = var4 = this.field4804[class27.method220(255, var3 >> 2)] + this.field4818 + this.field4811;
            this.field4802[var2] = this.field4811 = this.field4804[class27.method220(255, var4 >> 8 >> 2)] + var3;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1852(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4812++;
        int var7 = arg0 + arg1;
        for (int var8 = arg0; var8 < var7; var8++) {
            class176.method1215(arg6, arg3, class252.field4543[var8], arg4, (byte) -90);
        }
        int var9 = arg1 + arg6;
        int var10 = arg5 - arg1;
        for (int var11 = arg5; var11 > var10; var11--) {
            class176.method1215(arg6, arg3, class252.field4543[var11], arg4, (byte) 118);
        }
        int var12 = arg4 - arg1;
        for (int var13 = var7; var13 <= var10; var13++) {
            int[] var14 = class252.field4543[var13];
            class176.method1215(arg6, arg3, var14, var9, (byte) -17);
            class176.method1215(var12, arg3, var14, arg4, (byte) 118);
        }
        if (arg2 < 109) {
            field4803 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V")
    private final void method1853(byte arg0) {
        field4819++;
        if (arg0 <= 4) {
            method1848(-82, -96, (class159) null, false, (class159) null, -25, true);
        }
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
            int var68 = var63 + var66;
            int var69 = var4 + var67;
            var6 = var68 ^ var66 >>> 16;
            int var70 = var66 + var69;
            int var71 = var3 + var6;
            var5 = var70 ^ var69 << 10;
            int var72 = var69 + var71;
            var4 = var72 ^ var71 >>> 4;
            int var73 = var2 + var5;
            int var74 = var71 + var73;
            var3 = var74 ^ var73 << 8;
            var8 = var3 + var64;
            int var75 = var4 + var61;
            int var76 = var73 + var75;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field4802[var11 + 1] + var8;
            int var38 = this.field4802[var11 + 6] + var3;
            int var39 = this.field4802[var11 + 3] + var6;
            int var40 = this.field4802[var11 + 5] + var4;
            int var41 = this.field4802[var11 + 4] + var5;
            int var42 = this.field4802[var11 + 2] + var7;
            int var43 = this.field4802[var11] + var9;
            int var44 = var43 ^ var37 << 11;
            int var45 = this.field4802[var11 + 7] + var2;
            int var46 = var39 + var44;
            int var47 = var37 + var42;
            int var48 = var47 ^ var42 >>> 2;
            int var49 = var42 + var46;
            int var50 = var49 ^ var46 << 8;
            int var51 = var41 + var48;
            int var52 = var46 + var51;
            var6 = var52 ^ var51 >>> 16;
            int var53 = var6 + var38;
            int var54 = var40 + var50;
            int var55 = var51 + var54;
            var5 = var55 ^ var54 << 10;
            int var56 = var53 + var54;
            int var57 = var5 + var45;
            var4 = var56 ^ var53 >>> 4;
            int var58 = var4 + var44;
            int var59 = var53 + var57;
            var3 = var59 ^ var57 << 8;
            var8 = var3 + var48;
            int var60 = var57 + var58;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var50;
            var9 = var8 + var58;
            this.field4804[var11] = var9;
            this.field4804[var11 + 1] = var8;
            this.field4804[var11 + 2] = var7;
            this.field4804[var11 + 3] = var6;
            this.field4804[var11 + 4] = var5;
            this.field4804[var11 + 5] = var4;
            this.field4804[var11 + 6] = var3;
            this.field4804[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field4804[var12 + 3] + var6;
            int var14 = this.field4804[var12 + 5] + var4;
            int var15 = this.field4804[var12 + 1] + var8;
            int var16 = this.field4804[var12] + var9;
            int var17 = var16 ^ var15 << 11;
            int var18 = this.field4804[var12 + 4] + var5;
            int var19 = this.field4804[var12 + 6] + var3;
            int var20 = var13 + var17;
            int var21 = this.field4804[var12 + 7] + var2;
            int var22 = this.field4804[var12 + 2] + var7;
            int var23 = var15 + var22;
            int var24 = var23 ^ var22 >>> 2;
            int var25 = var18 + var24;
            int var26 = var20 + var22;
            int var27 = var26 ^ var20 << 8;
            int var28 = var20 + var25;
            var6 = var28 ^ var25 >>> 16;
            int var29 = var6 + var19;
            int var30 = var14 + var27;
            int var31 = var25 + var30;
            var5 = var31 ^ var30 << 10;
            int var32 = var5 + var21;
            int var33 = var29 + var30;
            var4 = var33 ^ var29 >>> 4;
            int var34 = var4 + var17;
            int var35 = var29 + var32;
            var3 = var35 ^ var32 << 8;
            int var36 = var32 + var34;
            var2 = var36 ^ var34 >>> 9;
            var8 = var3 + var24;
            var9 = var8 + var34;
            var7 = var2 + var27;
            this.field4804[var12] = var9;
            this.field4804[var12 + 1] = var8;
            this.field4804[var12 + 2] = var7;
            this.field4804[var12 + 3] = var6;
            this.field4804[var12 + 4] = var5;
            this.field4804[var12 + 5] = var4;
            this.field4804[var12 + 6] = var3;
            this.field4804[var12 + 7] = var2;
        }
        this.method1851(-9453);
        this.field4814 = 256;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
    private class271() {
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "([I)V")
    public class271(int[] arg0) {
        this.field4802 = new int[256];
        this.field4804 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field4802[var2] = arg0[var2];
        }
        this.method1853((byte) 20);
    }
}
