import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public class class399 {

    @OriginalMember(owner = "client!aia", name = "j", descriptor = "[I")
    private int[] field5642;

    @OriginalMember(owner = "client!aia", name = "e", descriptor = "[I")
    private int[] field5637;

    @OriginalMember(owner = "client!aia", name = "l", descriptor = "Ljn;")
    public static class134 field5644 = new class134(91, -2);

    @OriginalMember(owner = "client!aia", name = "m", descriptor = "[I")
    public static int[] field5645 = new int[1];

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!aia", name = "b", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!aia", name = "c", descriptor = "I")
    private int field5635;

    @OriginalMember(owner = "client!aia", name = "d", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!aia", name = "f", descriptor = "I")
    public static int field5638;

    @OriginalMember(owner = "client!aia", name = "g", descriptor = "I")
    private int field5639;

    @OriginalMember(owner = "client!aia", name = "h", descriptor = "I")
    public static int field5640;

    @OriginalMember(owner = "client!aia", name = "i", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!aia", name = "k", descriptor = "I")
    private int field5643;

    @OriginalMember(owner = "client!aia", name = "n", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!aia", name = "o", descriptor = "I")
    private int field5647;

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(B)V")
    private final void method2451(byte arg0) {
        field5634++;
        if (arg0 < 85) {
            return;
        }
        this.field5647 += ++this.field5643;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field5637[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field5639 ^= this.field5639 << 13;
                } else {
                    this.field5639 ^= this.field5639 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field5639 ^= this.field5639 << 2;
            } else {
                this.field5639 ^= this.field5639 >>> 16;
            }
            this.field5639 += this.field5637[var2 + 128 & 0xFF];
            int var4;
            this.field5637[var2] = var4 = this.field5637[class407.method2490(var3, 1020) >> 2] + (this.field5639 + this.field5647);
            this.field5642[var2] = this.field5647 = this.field5637[class407.method2490(var4 >> 8 >> 2, 255)] + var3;
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(IB[[B[I[B[[B[II)I")
    public static final int method2452(int arg0, byte arg1, byte[][] arg2, int[] arg3, byte[] arg4, byte[][] arg5, int[] arg6, int arg7) {
        field5641++;
        int var8 = arg3[arg7];
        int var9 = arg6[arg7] + var8;
        if (arg1 != -80) {
            return -17;
        }
        int var10 = arg3[arg0];
        int var11 = var10 + arg6[arg0];
        int var12 = var8;
        if (var8 < var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg4[arg7] & 0xFF;
        if ((arg4[arg0] & 0xFF) < var14) {
            var14 = arg4[arg0] & 0xFF;
        }
        byte[] var15 = arg2[arg7];
        byte[] var16 = arg5[arg0];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var16[var18++] + var15[var17++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!aia", name = "b", descriptor = "(B)V")
    private final void method2453(byte arg0) {
        field5638++;
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
            int var62 = var6 + var61;
            int var63 = var7 + var8;
            int var64 = var63 ^ var7 >>> 2;
            int var65 = var7 + var62;
            int var66 = var5 + var64;
            int var67 = var65 ^ var62 << 8;
            int var68 = var4 + var67;
            int var69 = var62 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var66 + var68;
            int var71 = var3 + var6;
            var5 = var70 ^ var68 << 10;
            int var72 = var68 + var71;
            int var73 = var2 + var5;
            var4 = var72 ^ var71 >>> 4;
            int var74 = var71 + var73;
            int var75 = var4 + var61;
            var3 = var74 ^ var73 << 8;
            var8 = var3 + var64;
            int var76 = var73 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field5642[var11 + 5] + var4;
            int var38 = this.field5642[var11 + 7] + var2;
            int var39 = this.field5642[var11 + 2] + var7;
            int var40 = this.field5642[var11 + 3] + var6;
            int var41 = this.field5642[var11 + 4] + var5;
            int var42 = this.field5642[var11 + 1] + var8;
            int var43 = this.field5642[var11] + var9;
            int var44 = this.field5642[var11 + 6] + var3;
            int var45 = var43 ^ var42 << 11;
            int var46 = var39 + var42;
            int var47 = var40 + var45;
            int var48 = var46 ^ var39 >>> 2;
            int var49 = var41 + var48;
            int var50 = var39 + var47;
            int var51 = var50 ^ var47 << 8;
            int var52 = var47 + var49;
            int var53 = var37 + var51;
            var6 = var52 ^ var49 >>> 16;
            int var54 = var49 + var53;
            int var55 = var6 + var44;
            var5 = var54 ^ var53 << 10;
            int var56 = var5 + var38;
            int var57 = var53 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var55 + var56;
            int var59 = var4 + var45;
            var3 = var58 ^ var56 << 8;
            var8 = var3 + var48;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            var7 = var2 + var51;
            this.field5637[var11] = var9;
            this.field5637[var11 + 1] = var8;
            this.field5637[var11 + 2] = var7;
            this.field5637[var11 + 3] = var6;
            this.field5637[var11 + 4] = var5;
            this.field5637[var11 + 5] = var4;
            this.field5637[var11 + 6] = var3;
            this.field5637[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field5637[var12 + 5] + var4;
            int var14 = this.field5637[var12] + var9;
            int var15 = this.field5637[var12 + 4] + var5;
            int var16 = this.field5637[var12 + 1] + var8;
            int var17 = this.field5637[var12 + 6] + var3;
            int var18 = this.field5637[var12 + 7] + var2;
            int var19 = this.field5637[var12 + 2] + var7;
            int var20 = this.field5637[var12 + 3] + var6;
            int var21 = var14 ^ var16 << 11;
            int var22 = var20 + var21;
            int var23 = var16 + var19;
            int var24 = var23 ^ var19 >>> 2;
            int var25 = var19 + var22;
            int var26 = var15 + var24;
            int var27 = var25 ^ var22 << 8;
            int var28 = var22 + var26;
            int var29 = var13 + var27;
            var6 = var28 ^ var26 >>> 16;
            int var30 = var6 + var17;
            int var31 = var26 + var29;
            var5 = var31 ^ var29 << 10;
            int var32 = var5 + var18;
            int var33 = var29 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var4 + var21;
            int var35 = var30 + var32;
            var3 = var35 ^ var32 << 8;
            var8 = var3 + var24;
            int var36 = var32 + var34;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            var7 = var2 + var27;
            this.field5637[var12] = var9;
            this.field5637[var12 + 1] = var8;
            this.field5637[var12 + 2] = var7;
            this.field5637[var12 + 3] = var6;
            this.field5637[var12 + 4] = var5;
            this.field5637[var12 + 5] = var4;
            this.field5637[var12 + 6] = var3;
            this.field5637[var12 + 7] = var2;
        }
        this.method2451((byte) 118);
        this.field5635 = 256;
        if (arg0 < 29) {
            this.method2454(-107);
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(I)I")
    public final int method2454(int arg0) {
        if (arg0 != -20089) {
            this.method2454(83);
        }
        if (this.field5635 == 0) {
            this.method2451((byte) 110);
            this.field5635 = 256;
        }
        field5633++;
        return this.field5642[--this.field5635];
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(Z)V")
    public static final void method2455(boolean arg0) {
        field5636++;
        if (class256.field3782) {
            return;
        }
        class195.field2770 += (-24.0F - class195.field2770) / 2.0F;
        class109.field1314 = true;
        if (!arg0) {
            class256.field3782 = true;
        }
    }

    @OriginalMember(owner = "client!aia", name = "b", descriptor = "(I)I")
    public final int method2456(int arg0) {
        int var2 = 51 % ((arg0 - 5) / 37);
        if (this.field5635 == 0) {
            this.method2451((byte) 125);
            this.field5635 = 256;
        }
        field5640++;
        return this.field5642[this.field5635 - 1];
    }

    @OriginalMember(owner = "client!aia", name = "c", descriptor = "(I)V")
    public static void method2457(int arg0) {
        if (arg0 == 555978786) {
            field5645 = null;
            field5644 = null;
        }
    }

    @OriginalMember(owner = "client!aia", name = "<init>", descriptor = "()V")
    private class399() {
    }

    @OriginalMember(owner = "client!aia", name = "<init>", descriptor = "([I)V")
    public class399(int[] arg0) {
        this.field5642 = new int[256];
        this.field5637 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field5642[var2] = arg0[var2];
        }
        this.method2453((byte) 127);
    }
}
