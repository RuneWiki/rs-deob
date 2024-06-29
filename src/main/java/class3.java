import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class3 {

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "[I")
    private int[] field35;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "[I")
    private int[] field30;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "Lvk;")
    public static class56 field38 = new class56(16);

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    private int field29;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    private int field31;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    private int field33;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    private int field34;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V")
    private final void method20(byte arg0) {
        if (arg0 != -89) {
            this.field35 = null;
        }
        field39++;
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
            int var65 = var5 + var64;
            int var66 = var7 + var62;
            int var67 = var66 ^ var62 << 8;
            int var68 = var4 + var67;
            int var69 = var62 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var3 + var6;
            int var71 = var65 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var2 + var5;
            int var73 = var68 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var72;
            var3 = var75 ^ var72 << 8;
            var8 = var3 + var64;
            int var76 = var72 + var74;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field35[var11 + 7] + var2;
            int var38 = this.field35[var11 + 6] + var3;
            int var39 = this.field35[var11 + 4] + var5;
            int var40 = this.field35[var11] + var9;
            int var41 = this.field35[var11 + 5] + var4;
            int var42 = this.field35[var11 + 1] + var8;
            int var43 = this.field35[var11 + 3] + var6;
            int var44 = this.field35[var11 + 2] + var7;
            int var45 = var40 ^ var42 << 11;
            int var46 = var43 + var45;
            int var47 = var42 + var44;
            int var48 = var47 ^ var44 >>> 2;
            int var49 = var39 + var48;
            int var50 = var44 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var46 + var49;
            int var53 = var41 + var51;
            var6 = var52 ^ var49 >>> 16;
            int var54 = var6 + var38;
            int var55 = var49 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var53 + var54;
            int var57 = var5 + var37;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var54 + var57;
            int var59 = var4 + var45;
            var3 = var58 ^ var57 << 8;
            var8 = var3 + var48;
            int var60 = var57 + var59;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            var7 = var2 + var51;
            this.field30[var11] = var9;
            this.field30[var11 + 1] = var8;
            this.field30[var11 + 2] = var7;
            this.field30[var11 + 3] = var6;
            this.field30[var11 + 4] = var5;
            this.field30[var11 + 5] = var4;
            this.field30[var11 + 6] = var3;
            this.field30[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field30[var12 + 6] + var3;
            int var14 = this.field30[var12 + 3] + var6;
            int var15 = this.field30[var12 + 4] + var5;
            int var16 = this.field30[var12 + 5] + var4;
            int var17 = this.field30[var12 + 7] + var2;
            int var18 = this.field30[var12] + var9;
            int var19 = this.field30[var12 + 1] + var8;
            int var20 = this.field30[var12 + 2] + var7;
            int var21 = var18 ^ var19 << 11;
            int var22 = var19 + var20;
            int var23 = var14 + var21;
            int var24 = var22 ^ var20 >>> 2;
            int var25 = var15 + var24;
            int var26 = var20 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var16 + var27;
            int var29 = var23 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var6 + var13;
            int var31 = var25 + var28;
            var5 = var31 ^ var28 << 10;
            int var32 = var5 + var17;
            int var33 = var28 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var30 + var32;
            int var35 = var4 + var21;
            var3 = var34 ^ var32 << 8;
            int var36 = var32 + var35;
            var8 = var3 + var24;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field30[var12] = var9;
            this.field30[var12 + 1] = var8;
            this.field30[var12 + 2] = var7;
            this.field30[var12 + 3] = var6;
            this.field30[var12 + 4] = var5;
            this.field30[var12 + 5] = var4;
            this.field30[var12 + 6] = var3;
            this.field30[var12 + 7] = var2;
        }
        this.method24(8);
        this.field33 = 256;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static void method21(int arg0) {
        if (arg0 == 24941) {
            field38 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V")
    public static final void method22(int arg0, int arg1) {
        class244.field3248.method1142((byte) -70, arg1);
        field32++;
        if (arg0 == -5) {
            class397.field5905.method1142((byte) -83, arg1);
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)I")
    public final int method23(int arg0) {
        field36++;
        if (this.field33-- == arg0) {
            this.method24(8);
            this.field33 = 255;
        }
        return this.field35[this.field33];
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
    private class3() {
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "([I)V")
    public class3(int[] arg0) {
        this.field35 = new int[256];
        this.field30 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field35[var2] = arg0[var2];
        }
        this.method20((byte) -89);
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
    private final void method24(int arg0) {
        if (arg0 != 8) {
            return;
        }
        field37++;
        this.field29 += ++this.field34;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field30[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field31 ^= this.field31 << 13;
                } else {
                    this.field31 ^= this.field31 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field31 ^= this.field31 << 2;
            } else {
                this.field31 ^= this.field31 >>> 16;
            }
            this.field31 += this.field30[var2 + 128 & 0xFF];
            int var4;
            this.field30[var2] = var4 = this.field31 + (this.field30[class183.method1117(1020, var3) >> 2] + this.field29);
            this.field35[var2] = this.field29 = this.field30[class183.method1117(var4 >> 8, 1020) >> 2] + var3;
        }
    }
}
