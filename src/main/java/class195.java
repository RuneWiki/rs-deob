import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class195 {

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "[I")
    private int[] field3501;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "[I")
    private int[] field3496;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    private int field3493;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    private int field3498;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
    private int field3503;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
    private int field3504;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "[I")
    public static int[] field3494;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "[Lch;")
    public static class282[] field3491;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "[[S")
    public static short[][] field3500;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
    public static void method1326(byte arg0) {
        field3500 = null;
        field3491 = null;
        field3494 = null;
        int var1 = 13 % ((arg0 + 32) / 34);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    private final void method1327(int arg0) {
        field3499++;
        if (arg0 != 1) {
            method1326((byte) -42);
        }
        this.field3504 += ++this.field3498;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field3496[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field3503 ^= this.field3503 << 13;
                } else {
                    this.field3503 ^= this.field3503 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field3503 ^= this.field3503 << 2;
            } else {
                this.field3503 ^= this.field3503 >>> 16;
            }
            this.field3503 += this.field3496[var2 + 128 & 0xFF];
            int var4;
            this.field3496[var2] = var4 = this.field3503 + this.field3496[class136.method953(var3, 1020) >> 2] + this.field3504;
            this.field3501[var2] = this.field3504 = this.field3496[class136.method953(var4 >> 8 >> 2, 255)] + var3;
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V")
    private final void method1328(int arg0) {
        field3497++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        int var10 = 0;
        if (arg0 != -22820) {
            method1326((byte) -116);
        }
        while (var10 < 4) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var7 + var8;
            int var63 = var6 + var61;
            int var64 = var62 ^ var7 >>> 2;
            int var65 = var5 + var64;
            int var66 = var7 + var63;
            int var67 = var66 ^ var63 << 8;
            int var68 = var4 + var67;
            int var69 = var63 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var65 + var68;
            var5 = var70 ^ var68 << 10;
            int var71 = var2 + var5;
            int var72 = var3 + var6;
            int var73 = var68 + var72;
            var4 = var73 ^ var72 >>> 4;
            int var74 = var71 + var72;
            var3 = var74 ^ var71 << 8;
            int var75 = var4 + var61;
            int var76 = var71 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var8 = var3 + var64;
            var9 = var8 + var75;
            var10++;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field3501[var11 + 1] + var8;
            int var38 = this.field3501[var11 + 5] + var4;
            int var39 = this.field3501[var11 + 2] + var7;
            int var40 = this.field3501[var11] + var9;
            int var41 = this.field3501[var11 + 3] + var6;
            int var42 = this.field3501[var11 + 7] + var2;
            int var43 = this.field3501[var11 + 6] + var3;
            int var44 = var40 ^ var37 << 11;
            int var45 = var37 + var39;
            int var46 = this.field3501[var11 + 4] + var5;
            int var47 = var41 + var44;
            int var48 = var45 ^ var39 >>> 2;
            int var49 = var39 + var47;
            int var50 = var49 ^ var47 << 8;
            int var51 = var46 + var48;
            int var52 = var38 + var50;
            int var53 = var47 + var51;
            var6 = var53 ^ var51 >>> 16;
            int var54 = var51 + var52;
            var5 = var54 ^ var52 << 10;
            int var55 = var5 + var42;
            int var56 = var6 + var43;
            int var57 = var52 + var56;
            var4 = var57 ^ var56 >>> 4;
            int var58 = var4 + var44;
            int var59 = var55 + var56;
            var3 = var59 ^ var55 << 8;
            var8 = var3 + var48;
            int var60 = var55 + var58;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var50;
            var9 = var8 + var58;
            this.field3496[var11] = var9;
            this.field3496[var11 + 1] = var8;
            this.field3496[var11 + 2] = var7;
            this.field3496[var11 + 3] = var6;
            this.field3496[var11 + 4] = var5;
            this.field3496[var11 + 5] = var4;
            this.field3496[var11 + 6] = var3;
            this.field3496[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field3496[var12 + 2] + var7;
            int var14 = this.field3496[var12 + 1] + var8;
            int var15 = this.field3496[var12 + 7] + var2;
            int var16 = this.field3496[var12 + 6] + var3;
            int var17 = this.field3496[var12 + 5] + var4;
            int var18 = this.field3496[var12 + 3] + var6;
            int var19 = this.field3496[var12] + var9;
            int var20 = this.field3496[var12 + 4] + var5;
            int var21 = var19 ^ var14 << 11;
            int var22 = var18 + var21;
            int var23 = var13 + var14;
            int var24 = var23 ^ var13 >>> 2;
            int var25 = var20 + var24;
            int var26 = var13 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var22 + var25;
            int var29 = var17 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var25 + var29;
            int var31 = var6 + var16;
            var5 = var30 ^ var29 << 10;
            int var32 = var5 + var15;
            int var33 = var29 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var4 + var21;
            int var35 = var31 + var32;
            var3 = var35 ^ var32 << 8;
            var8 = var3 + var24;
            int var36 = var32 + var34;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            this.field3496[var12] = var9;
            this.field3496[var12 + 1] = var8;
            var7 = var2 + var27;
            this.field3496[var12 + 2] = var7;
            this.field3496[var12 + 3] = var6;
            this.field3496[var12 + 4] = var5;
            this.field3496[var12 + 5] = var4;
            this.field3496[var12 + 6] = var3;
            this.field3496[var12 + 7] = var2;
        }
        this.method1327(1);
        this.field3493 = 256;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BI)Lrj;")
    public static final class8 method1329(byte arg0, int arg1) {
        field3495++;
        class8 var2 = (class8) class115.field1957.method1293((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class47.field802.method1562(arg0 ^ 0xCFBE4AA0, arg1, 1);
        if (arg0 != 39) {
            method1326((byte) -65);
        }
        class8 var4 = new class8();
        if (var3 != null) {
            var4.method44((byte) 116, new class74(var3), arg1);
        }
        class115.field1957.method1295((long) arg1, var4, (byte) -71);
        return var4;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)I")
    public final int method1330(byte arg0) {
        if (arg0 < 106) {
            return 57;
        }
        field3492++;
        if ((this.field3493--) == 0) {
            this.method1327(1);
            this.field3493 = 255;
        }
        return this.field3501[this.field3493];
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
    private class195() {
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "([I)V")
    public class195(int[] arg0) {
        this.field3501 = new int[256];
        this.field3496 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3501[var2] = arg0[var2];
        }
        this.method1328(-22820);
    }
}
