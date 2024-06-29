import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class13 {

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "[I")
    private int[] field168;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "[I")
    private int[] field167;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "Ljava/lang/String;")
    public static String field173 = "glow1:";

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    private int field165;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    private int field169;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    private int field170;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    private int field172;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    private final void method68(int arg0) {
        this.field172 += ++this.field170;
        int var2 = 0;
        if (arg0 != 255) {
            this.field168 = null;
        }
        while (var2 < 256) {
            int var3 = this.field168[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field165 ^= this.field165 << 13;
                } else {
                    this.field165 ^= this.field165 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field165 ^= this.field165 << 2;
            } else {
                this.field165 ^= this.field165 >>> 16;
            }
            this.field165 += this.field168[var2 + 128 & 0xFF];
            int var4;
            this.field168[var2] = var4 = this.field168[class173.method1186(255, var3 >> 2)] + this.field165 + this.field172;
            this.field167[var2] = this.field172 = this.field168[class173.method1186(var4 >> 8, 1020) >> 2] + var3;
            var2++;
        }
        field164++;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)I")
    public final int method69(byte arg0) {
        if (arg0 != 122) {
            field173 = null;
        }
        if ((this.field169--) == 0) {
            this.method68(255);
            this.field169 = 255;
        }
        field166++;
        return this.field167[this.field169];
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
    public static void method70(boolean arg0) {
        if (arg0) {
            field173 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
    private class13() {
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V")
    private final void method71(byte arg0) {
        field171++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var62 = var9 ^ var8 << 11;
            int var63 = var7 + var8;
            int var64 = var6 + var62;
            int var65 = var63 ^ var7 >>> 2;
            int var66 = var7 + var64;
            int var67 = var66 ^ var64 << 8;
            int var68 = var5 + var65;
            int var69 = var4 + var67;
            int var70 = var64 + var68;
            var6 = var70 ^ var68 >>> 16;
            int var71 = var68 + var69;
            int var72 = var3 + var6;
            var5 = var71 ^ var69 << 10;
            int var73 = var69 + var72;
            int var74 = var2 + var5;
            var4 = var73 ^ var72 >>> 4;
            int var75 = var72 + var74;
            int var76 = var4 + var62;
            var3 = var75 ^ var74 << 8;
            var8 = var3 + var65;
            int var77 = var74 + var76;
            var2 = var77 ^ var76 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var76;
        }
        int var11 = 41 / ((72 - arg0) / 34);
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var38 = this.field167[var12 + 3] + var6;
            int var39 = this.field167[var12 + 6] + var3;
            int var40 = this.field167[var12 + 2] + var7;
            int var41 = this.field167[var12 + 1] + var8;
            int var42 = this.field167[var12 + 7] + var2;
            int var43 = this.field167[var12] + var9;
            int var44 = this.field167[var12 + 4] + var5;
            int var45 = this.field167[var12 + 5] + var4;
            int var46 = var43 ^ var41 << 11;
            int var47 = var40 + var41;
            int var48 = var38 + var46;
            int var49 = var47 ^ var40 >>> 2;
            int var50 = var40 + var48;
            int var51 = var50 ^ var48 << 8;
            int var52 = var45 + var51;
            int var53 = var44 + var49;
            int var54 = var48 + var53;
            var6 = var54 ^ var53 >>> 16;
            int var55 = var52 + var53;
            int var56 = var6 + var39;
            var5 = var55 ^ var52 << 10;
            int var57 = var52 + var56;
            int var58 = var5 + var42;
            var4 = var57 ^ var56 >>> 4;
            int var59 = var4 + var46;
            int var60 = var56 + var58;
            var3 = var60 ^ var58 << 8;
            int var61 = var58 + var59;
            var8 = var3 + var49;
            var2 = var61 ^ var59 >>> 9;
            var9 = var8 + var59;
            var7 = var2 + var51;
            this.field168[var12] = var9;
            this.field168[var12 + 1] = var8;
            this.field168[var12 + 2] = var7;
            this.field168[var12 + 3] = var6;
            this.field168[var12 + 4] = var5;
            this.field168[var12 + 5] = var4;
            this.field168[var12 + 6] = var3;
            this.field168[var12 + 7] = var2;
        }
        for (int var13 = 0; var13 < 256; var13 += 8) {
            int var14 = this.field168[var13 + 7] + var2;
            int var15 = this.field168[var13 + 1] + var8;
            int var16 = this.field168[var13 + 3] + var6;
            int var17 = this.field168[var13] + var9;
            int var18 = this.field168[var13 + 2] + var7;
            int var19 = this.field168[var13 + 6] + var3;
            int var20 = this.field168[var13 + 5] + var4;
            int var21 = this.field168[var13 + 4] + var5;
            int var22 = var17 ^ var15 << 11;
            int var23 = var16 + var22;
            int var24 = var15 + var18;
            int var25 = var24 ^ var18 >>> 2;
            int var26 = var18 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var21 + var25;
            int var29 = var20 + var27;
            int var30 = var23 + var28;
            var6 = var30 ^ var28 >>> 16;
            int var31 = var6 + var19;
            int var32 = var28 + var29;
            var5 = var32 ^ var29 << 10;
            int var33 = var5 + var14;
            int var34 = var29 + var31;
            var4 = var34 ^ var31 >>> 4;
            int var35 = var4 + var22;
            int var36 = var31 + var33;
            var3 = var36 ^ var33 << 8;
            int var37 = var33 + var35;
            var8 = var3 + var25;
            var2 = var37 ^ var35 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field168[var13] = var9;
            this.field168[var13 + 1] = var8;
            this.field168[var13 + 2] = var7;
            this.field168[var13 + 3] = var6;
            this.field168[var13 + 4] = var5;
            this.field168[var13 + 5] = var4;
            this.field168[var13 + 6] = var3;
            this.field168[var13 + 7] = var2;
        }
        this.method68(255);
        this.field169 = 256;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "([I)V")
    public class13(int[] arg0) {
        this.field168 = new int[256];
        this.field167 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field167[var2] = arg0[var2];
        }
        this.method71((byte) 6);
    }
}
