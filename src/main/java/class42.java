import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class42 {

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "[I")
    private int[] field861;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "[I")
    private int[] field854;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "Lrd;")
    public static class173 field856 = class133.method843("Lade Titelbild )2 ", 82);

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field864 = -1;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field863 = 0;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "Lrd;")
    public static class173 field866 = class133.method843("Geben Sie Ihren Benutzernamen", -91);

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "J")
    public static long field865 = 0L;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Laf;")
    public static class7 field855 = new class7(50);

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "Lrd;")
    public static class173 field869 = class133.method843("document)3cookie=(R", 111);

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "Lrd;")
    public static class173 field868 = null;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field871 = 0;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    private int field853;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    private int field858;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    private int field867;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    private int field870;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)I")
    public final int method304(int arg0) {
        field857++;
        if (this.field858-- == 0) {
            this.method306(false);
            this.field858 = 255;
        }
        if (arg0 >= -118) {
            field863 = 78;
        }
        return this.field854[this.field858];
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
    public static void method305(byte arg0) {
        field866 = null;
        field856 = null;
        int var1 = -71 % ((-arg0 - 24) / 46);
        field869 = null;
        field855 = null;
        field868 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V")
    private final void method306(boolean arg0) {
        this.field870 += ++this.field853;
        field860++;
        int var2 = 0;
        if (arg0) {
            field865 = -109L;
        }
        while (var2 < 256) {
            int var3 = this.field861[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field867 ^= this.field867 << 13;
                } else {
                    this.field867 ^= this.field867 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field867 ^= this.field867 << 2;
            } else {
                this.field867 ^= this.field867 >>> 16;
            }
            this.field867 += this.field861[var2 + 128 & 0xFF];
            int var4;
            this.field861[var2] = var4 = this.field870 + this.field861[class209.method1383(var3, 1020) >> 2] + this.field867;
            this.field854[var2] = this.field870 = var3 + this.field861[class209.method1383(255, var4 >> 8 >> 2)];
            var2++;
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
    private final void method307(int arg0) {
        field862++;
        if (arg0 < 39) {
            this.method304(-113);
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
            int var63 = var62 ^ var7 >>> 2;
            int var64 = var6 + var61;
            int var65 = var5 + var63;
            int var66 = var7 + var64;
            int var67 = var66 ^ var64 << 8;
            int var68 = var64 + var65;
            var6 = var68 ^ var65 >>> 16;
            int var69 = var3 + var6;
            int var70 = var4 + var67;
            int var71 = var65 + var70;
            var5 = var71 ^ var70 << 10;
            int var72 = var69 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var69 >>> 4;
            int var74 = var69 + var73;
            int var75 = var4 + var61;
            var3 = var74 ^ var73 << 8;
            var8 = var3 + var63;
            int var76 = var73 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field854[var11 + 4] + var5;
            int var38 = this.field854[var11 + 7] + var2;
            int var39 = this.field854[var11 + 5] + var4;
            int var40 = this.field854[var11 + 1] + var8;
            int var41 = this.field854[var11 + 3] + var6;
            int var42 = this.field854[var11] + var9;
            int var43 = this.field854[var11 + 6] + var3;
            int var44 = this.field854[var11 + 2] + var7;
            int var45 = var42 ^ var40 << 11;
            int var46 = var41 + var45;
            int var47 = var40 + var44;
            int var48 = var47 ^ var44 >>> 2;
            int var49 = var37 + var48;
            int var50 = var44 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var39 + var51;
            int var53 = var46 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var6 + var43;
            int var55 = var49 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var52 + var54;
            var4 = var56 ^ var54 >>> 4;
            int var57 = var4 + var45;
            int var58 = var5 + var38;
            int var59 = var54 + var58;
            var3 = var59 ^ var58 << 8;
            var8 = var3 + var48;
            int var60 = var57 + var58;
            var2 = var60 ^ var57 >>> 9;
            var9 = var8 + var57;
            this.field861[var11] = var9;
            var7 = var2 + var51;
            this.field861[var11 + 1] = var8;
            this.field861[var11 + 2] = var7;
            this.field861[var11 + 3] = var6;
            this.field861[var11 + 4] = var5;
            this.field861[var11 + 5] = var4;
            this.field861[var11 + 6] = var3;
            this.field861[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field861[var12 + 3] + var6;
            int var14 = this.field861[var12 + 2] + var7;
            int var15 = this.field861[var12 + 5] + var4;
            int var16 = this.field861[var12 + 6] + var3;
            int var17 = this.field861[var12 + 1] + var8;
            int var18 = this.field861[var12 + 4] + var5;
            int var19 = this.field861[var12] + var9;
            int var20 = this.field861[var12 + 7] + var2;
            int var21 = var19 ^ var17 << 11;
            int var22 = var13 + var21;
            int var23 = var14 + var17;
            int var24 = var23 ^ var14 >>> 2;
            int var25 = var18 + var24;
            int var26 = var14 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var15 + var27;
            int var29 = var22 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var25 + var28;
            int var31 = var6 + var16;
            var5 = var30 ^ var28 << 10;
            int var32 = var28 + var31;
            int var33 = var5 + var20;
            var4 = var32 ^ var31 >>> 4;
            int var34 = var4 + var21;
            int var35 = var31 + var33;
            var3 = var35 ^ var33 << 8;
            var8 = var3 + var24;
            int var36 = var33 + var34;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field861[var12] = var9;
            this.field861[var12 + 1] = var8;
            this.field861[var12 + 2] = var7;
            this.field861[var12 + 3] = var6;
            this.field861[var12 + 4] = var5;
            this.field861[var12 + 5] = var4;
            this.field861[var12 + 6] = var3;
            this.field861[var12 + 7] = var2;
        }
        this.method306(false);
        this.field858 = 256;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
    private class42() {
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "([I)V")
    public class42(int[] arg0) {
        this.field861 = new int[256];
        this.field854 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field854[var2] = arg0[var2];
        }
        this.method307(126);
    }
}
