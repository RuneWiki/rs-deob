import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RYDUASDW")
public class class49 {

    @OriginalMember(owner = "client!RYDUASDW", name = "c", descriptor = "[I")
    private int[] field1262 = new int[256];

    @OriginalMember(owner = "client!RYDUASDW", name = "b", descriptor = "[I")
    private int[] field1261;

    @OriginalMember(owner = "client!RYDUASDW", name = "a", descriptor = "I")
    private int field1260;

    @OriginalMember(owner = "client!RYDUASDW", name = "d", descriptor = "I")
    private int field1263;

    @OriginalMember(owner = "client!RYDUASDW", name = "e", descriptor = "I")
    private int field1264;

    @OriginalMember(owner = "client!RYDUASDW", name = "f", descriptor = "I")
    private int field1265;

    @OriginalMember(owner = "client!RYDUASDW", name = "<init>", descriptor = "(Z[I)V")
    public class49(boolean arg0, int[] arg1) {
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1261 = new int[256];
        for (int var4 = 0; var4 < arg1.length; var4++) {
            this.field1261[var4] = arg1[var4];
        }
        this.method439();
    }

    @OriginalMember(owner = "client!RYDUASDW", name = "a", descriptor = "()I")
    public final int method437() {
        if (this.field1260-- == 0) {
            this.method438();
            this.field1260 = 255;
        }
        return this.field1261[this.field1260];
    }

    @OriginalMember(owner = "client!RYDUASDW", name = "b", descriptor = "()V")
    private final void method438() {
        this.field1264 += ++this.field1265;
        for (int var1 = 0; var1 < 256; var1++) {
            int var2 = this.field1262[var1];
            if ((var1 & 0x3) == 0) {
                this.field1263 ^= this.field1263 << 13;
            } else if ((var1 & 0x3) == 1) {
                this.field1263 ^= this.field1263 >>> 6;
            } else if ((var1 & 0x3) == 2) {
                this.field1263 ^= this.field1263 << 2;
            } else if ((var1 & 0x3) == 3) {
                this.field1263 ^= this.field1263 >>> 16;
            }
            this.field1263 += this.field1262[var1 + 128 & 0xFF];
            int var3;
            this.field1262[var1] = var3 = this.field1262[var2 >> 2 & 0xFF] + this.field1263 + this.field1264;
            this.field1261[var1] = this.field1264 = this.field1262[var3 >> 8 >> 2 & 0xFF] + var2;
        }
    }

    @OriginalMember(owner = "client!RYDUASDW", name = "c", descriptor = "()V")
    private final void method439() {
        int var1 = -1640531527;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        for (int var9 = 0; var9 < 4; var9++) {
            int var60 = var8 ^ var7 << 11;
            int var61 = var5 + var60;
            int var62 = var6 + var7;
            int var63 = var62 ^ var6 >>> 2;
            int var64 = var4 + var63;
            int var65 = var6 + var61;
            int var66 = var65 ^ var61 << 8;
            int var67 = var3 + var66;
            int var68 = var61 + var64;
            var5 = var68 ^ var64 >>> 16;
            int var69 = var2 + var5;
            int var70 = var64 + var67;
            var4 = var70 ^ var67 << 10;
            int var71 = var1 + var4;
            int var72 = var67 + var69;
            var3 = var72 ^ var69 >>> 4;
            int var73 = var3 + var60;
            int var74 = var69 + var71;
            var2 = var74 ^ var71 << 8;
            var7 = var2 + var63;
            int var75 = var71 + var73;
            var1 = var75 ^ var73 >>> 9;
            var6 = var1 + var66;
            var8 = var7 + var73;
        }
        for (int var10 = 0; var10 < 256; var10 += 8) {
            int var36 = this.field1261[var10] + var8;
            int var37 = this.field1261[var10 + 1] + var7;
            int var38 = this.field1261[var10 + 2] + var6;
            int var39 = this.field1261[var10 + 3] + var5;
            int var40 = this.field1261[var10 + 4] + var4;
            int var41 = this.field1261[var10 + 5] + var3;
            int var42 = this.field1261[var10 + 6] + var2;
            int var43 = this.field1261[var10 + 7] + var1;
            int var44 = var36 ^ var37 << 11;
            int var45 = var39 + var44;
            int var46 = var37 + var38;
            int var47 = var46 ^ var38 >>> 2;
            int var48 = var40 + var47;
            int var49 = var38 + var45;
            int var50 = var49 ^ var45 << 8;
            int var51 = var41 + var50;
            int var52 = var45 + var48;
            var5 = var52 ^ var48 >>> 16;
            int var53 = var5 + var42;
            int var54 = var48 + var51;
            var4 = var54 ^ var51 << 10;
            int var55 = var4 + var43;
            int var56 = var51 + var53;
            var3 = var56 ^ var53 >>> 4;
            int var57 = var3 + var44;
            int var58 = var53 + var55;
            var2 = var58 ^ var55 << 8;
            var7 = var2 + var47;
            int var59 = var55 + var57;
            var1 = var59 ^ var57 >>> 9;
            var6 = var1 + var50;
            var8 = var7 + var57;
            this.field1262[var10] = var8;
            this.field1262[var10 + 1] = var7;
            this.field1262[var10 + 2] = var6;
            this.field1262[var10 + 3] = var5;
            this.field1262[var10 + 4] = var4;
            this.field1262[var10 + 5] = var3;
            this.field1262[var10 + 6] = var2;
            this.field1262[var10 + 7] = var1;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var12 = this.field1262[var11] + var8;
            int var13 = this.field1262[var11 + 1] + var7;
            int var14 = this.field1262[var11 + 2] + var6;
            int var15 = this.field1262[var11 + 3] + var5;
            int var16 = this.field1262[var11 + 4] + var4;
            int var17 = this.field1262[var11 + 5] + var3;
            int var18 = this.field1262[var11 + 6] + var2;
            int var19 = this.field1262[var11 + 7] + var1;
            int var20 = var12 ^ var13 << 11;
            int var21 = var15 + var20;
            int var22 = var13 + var14;
            int var23 = var22 ^ var14 >>> 2;
            int var24 = var16 + var23;
            int var25 = var14 + var21;
            int var26 = var25 ^ var21 << 8;
            int var27 = var17 + var26;
            int var28 = var21 + var24;
            var5 = var28 ^ var24 >>> 16;
            int var29 = var5 + var18;
            int var30 = var24 + var27;
            var4 = var30 ^ var27 << 10;
            int var31 = var4 + var19;
            int var32 = var27 + var29;
            var3 = var32 ^ var29 >>> 4;
            int var33 = var3 + var20;
            int var34 = var29 + var31;
            var2 = var34 ^ var31 << 8;
            var7 = var2 + var23;
            int var35 = var31 + var33;
            var1 = var35 ^ var33 >>> 9;
            var6 = var1 + var26;
            var8 = var7 + var33;
            this.field1262[var11] = var8;
            this.field1262[var11 + 1] = var7;
            this.field1262[var11 + 2] = var6;
            this.field1262[var11 + 3] = var5;
            this.field1262[var11 + 4] = var4;
            this.field1262[var11 + 5] = var3;
            this.field1262[var11 + 6] = var2;
            this.field1262[var11 + 7] = var1;
        }
        this.method438();
        this.field1260 = 256;
    }
}
