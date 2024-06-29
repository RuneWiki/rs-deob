import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class78 {

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "[I")
    private int[] field1980 = new int[256];

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "[I")
    private int[] field1986 = new int[256];

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Ljb;")
    public static class64 field1979 = new class64(30);

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "Ljb;")
    public static class64 field1991 = new class64(100);

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "Lkd;")
    private static class73 field1992 = class126.method1070((byte) -66, "Loading)3)3)3");

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    public static int field1996 = 0;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "Lkd;")
    public static class73 field1993 = class126.method1070((byte) -66, "Ihr Spielkonto wurde deaktiviert)3");

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    public static int field1997 = -1;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field1994 = 0;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    public static int field1995 = 0;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "Lkd;")
    public static class73 field1998 = field1992;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    private int field1982;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    private int field1985;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    private int field1988;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    private int field1989;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V")
    public static final void method672(int arg0, int arg1) {
        field1981++;
        if (arg0 != 0) {
            field1991 = null;
        }
        class23.field647 = arg1;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
    private final void method673(boolean arg0) {
        if (!arg0) {
            method676(-101, 9);
        }
        field1990++;
        this.field1989 += ++this.field1988;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1980[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1985 ^= this.field1985 << 13;
                } else {
                    this.field1985 ^= this.field1985 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1985 ^= this.field1985 << 2;
            } else {
                this.field1985 ^= this.field1985 >>> 16;
            }
            this.field1985 += this.field1980[var2 + 128 & 0xFF];
            int var4;
            this.field1980[var2] = var4 = this.field1989 + this.field1980[class149.method1189(1020, var3) >> 2] + this.field1985;
            this.field1986[var2] = this.field1989 = this.field1980[class149.method1189(var4 >> 8, 1020) >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)I")
    public final int method674(byte arg0) {
        int var2 = -99 / ((-arg0 - 4) / 61);
        if (this.field1982-- == 0) {
            this.method673(true);
            this.field1982 = 255;
        }
        field1984++;
        return this.field1986[this.field1982];
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    private final void method675(int arg0) {
        field1987++;
        if (arg0 <= 18) {
            field1992 = null;
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
            int var64 = var5 + var63;
            int var65 = var6 + var61;
            int var66 = var7 + var65;
            int var67 = var66 ^ var65 << 8;
            int var68 = var64 + var65;
            var6 = var68 ^ var64 >>> 16;
            int var69 = var4 + var67;
            int var70 = var3 + var6;
            int var71 = var64 + var69;
            var5 = var71 ^ var69 << 10;
            int var72 = var2 + var5;
            int var73 = var69 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var70 + var72;
            var3 = var74 ^ var72 << 8;
            int var75 = var4 + var61;
            var8 = var3 + var63;
            int var76 = var72 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1986[var11 + 3] + var6;
            int var38 = this.field1986[var11 + 4] + var5;
            int var39 = this.field1986[var11 + 5] + var4;
            int var40 = this.field1986[var11 + 7] + var2;
            int var41 = this.field1986[var11 + 2] + var7;
            int var42 = this.field1986[var11 + 6] + var3;
            int var43 = this.field1986[var11] + var9;
            int var44 = this.field1986[var11 + 1] + var8;
            int var45 = var43 ^ var44 << 11;
            int var46 = var37 + var45;
            int var47 = var41 + var44;
            int var48 = var47 ^ var41 >>> 2;
            int var49 = var41 + var46;
            int var50 = var49 ^ var46 << 8;
            int var51 = var38 + var48;
            int var52 = var39 + var50;
            int var53 = var46 + var51;
            var6 = var53 ^ var51 >>> 16;
            int var54 = var6 + var42;
            int var55 = var51 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var52 + var54;
            var4 = var56 ^ var54 >>> 4;
            int var57 = var5 + var40;
            int var58 = var54 + var57;
            int var59 = var4 + var45;
            var3 = var58 ^ var57 << 8;
            var8 = var3 + var48;
            int var60 = var57 + var59;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            this.field1980[var11] = var9;
            var7 = var2 + var50;
            this.field1980[var11 + 1] = var8;
            this.field1980[var11 + 2] = var7;
            this.field1980[var11 + 3] = var6;
            this.field1980[var11 + 4] = var5;
            this.field1980[var11 + 5] = var4;
            this.field1980[var11 + 6] = var3;
            this.field1980[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1980[var12] + var9;
            int var14 = this.field1980[var12 + 7] + var2;
            int var15 = this.field1980[var12 + 5] + var4;
            int var16 = this.field1980[var12 + 4] + var5;
            int var17 = this.field1980[var12 + 2] + var7;
            int var18 = this.field1980[var12 + 6] + var3;
            int var19 = this.field1980[var12 + 3] + var6;
            int var20 = this.field1980[var12 + 1] + var8;
            int var21 = var13 ^ var20 << 11;
            int var22 = var17 + var20;
            int var23 = var19 + var21;
            int var24 = var22 ^ var17 >>> 2;
            int var25 = var16 + var24;
            int var26 = var17 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var15 + var27;
            int var29 = var23 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var25 + var28;
            int var31 = var6 + var18;
            var5 = var30 ^ var28 << 10;
            int var32 = var28 + var31;
            var4 = var32 ^ var31 >>> 4;
            int var33 = var5 + var14;
            int var34 = var4 + var21;
            int var35 = var31 + var33;
            var3 = var35 ^ var33 << 8;
            var8 = var3 + var24;
            int var36 = var33 + var34;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            this.field1980[var12] = var9;
            var7 = var2 + var27;
            this.field1980[var12 + 1] = var8;
            this.field1980[var12 + 2] = var7;
            this.field1980[var12 + 3] = var6;
            this.field1980[var12 + 4] = var5;
            this.field1980[var12 + 5] = var4;
            this.field1980[var12 + 6] = var3;
            this.field1980[var12 + 7] = var2;
        }
        this.method673(true);
        this.field1982 = 256;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)Lkd;")
    public static final class73 method676(int arg0, int arg1) {
        if (arg1 > -2) {
            return null;
        } else {
            field1983++;
            return class87.method723(10, arg0, 10, false);
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)V")
    public static void method677(boolean arg0) {
        if (!arg0) {
            field1994 = -71;
        }
        field1979 = null;
        field1998 = null;
        field1992 = null;
        field1993 = null;
        field1991 = null;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "([I)V")
    public class78(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1986[var2] = arg0[var2];
        }
        this.method675(37);
    }
}
