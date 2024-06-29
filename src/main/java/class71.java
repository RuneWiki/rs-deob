import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class71 {

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "[I")
    private int[] field995;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "[I")
    private int[] field991;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public static int field997 = 0;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    public static int field999 = -1;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    private int field987;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    private int field992;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    private int field994;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    private int field998;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)Lla;", line = 3)
    public static final class455 method636(boolean arg0) {
        field996++;
        try {
            return arg0 ? (class455) Class.forName("dha").getDeclaredConstructor().newInstance() : null;
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V", line = 28)
    private final void method637(int arg0) {
        field989++;
        if (arg0 != -1618262741) {
            this.method638((byte) 20);
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
            int var65 = var5 + var64;
            int var66 = var7 + var63;
            int var67 = var66 ^ var63 << 8;
            int var68 = var4 + var67;
            int var69 = var63 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var3 + var6;
            int var71 = var65 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var68 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var73;
            var3 = var75 ^ var73 << 8;
            var8 = var3 + var64;
            int var76 = var73 + var74;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field991[var11 + 1] + var8;
            int var38 = this.field991[var11 + 5] + var4;
            int var39 = this.field991[var11 + 7] + var2;
            int var40 = this.field991[var11 + 6] + var3;
            int var41 = this.field991[var11 + 3] + var6;
            int var42 = this.field991[var11 + 4] + var5;
            int var43 = this.field991[var11 + 2] + var7;
            int var44 = this.field991[var11] + var9;
            int var45 = var44 ^ var37 << 11;
            int var46 = var37 + var43;
            int var47 = var41 + var45;
            int var48 = var46 ^ var43 >>> 2;
            int var49 = var43 + var47;
            int var50 = var42 + var48;
            int var51 = var49 ^ var47 << 8;
            int var52 = var47 + var50;
            int var53 = var38 + var51;
            var6 = var52 ^ var50 >>> 16;
            int var54 = var6 + var40;
            int var55 = var50 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var53 + var54;
            int var57 = var5 + var39;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var54 + var57;
            int var59 = var4 + var45;
            var3 = var58 ^ var57 << 8;
            int var60 = var57 + var59;
            var8 = var3 + var48;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field995[var11] = var9;
            this.field995[var11 + 1] = var8;
            this.field995[var11 + 2] = var7;
            this.field995[var11 + 3] = var6;
            this.field995[var11 + 4] = var5;
            this.field995[var11 + 5] = var4;
            this.field995[var11 + 6] = var3;
            this.field995[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field995[var12 + 6] + var3;
            int var14 = this.field995[var12 + 3] + var6;
            int var15 = this.field995[var12 + 5] + var4;
            int var16 = this.field995[var12 + 4] + var5;
            int var17 = this.field995[var12 + 1] + var8;
            int var18 = this.field995[var12 + 2] + var7;
            int var19 = this.field995[var12 + 7] + var2;
            int var20 = this.field995[var12] + var9;
            int var21 = var20 ^ var17 << 11;
            int var22 = var17 + var18;
            int var23 = var14 + var21;
            int var24 = var22 ^ var18 >>> 2;
            int var25 = var16 + var24;
            int var26 = var18 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var15 + var27;
            int var29 = var23 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var25 + var28;
            int var31 = var6 + var13;
            var5 = var30 ^ var28 << 10;
            int var32 = var28 + var31;
            int var33 = var5 + var19;
            var4 = var32 ^ var31 >>> 4;
            int var34 = var31 + var33;
            int var35 = var4 + var21;
            var3 = var34 ^ var33 << 8;
            int var36 = var33 + var35;
            var8 = var3 + var24;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field995[var12] = var9;
            this.field995[var12 + 1] = var8;
            this.field995[var12 + 2] = var7;
            this.field995[var12 + 3] = var6;
            this.field995[var12 + 4] = var5;
            this.field995[var12 + 5] = var4;
            this.field995[var12 + 6] = var3;
            this.field995[var12 + 7] = var2;
        }
        this.method638((byte) -86);
        this.field992 = 256;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V", line = 175)
    private final void method638(byte arg0) {
        if (arg0 >= -62) {
            method636(false);
        }
        field990++;
        this.field987 += ++this.field998;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field995[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field994 ^= this.field994 << 13;
                } else {
                    this.field994 ^= this.field994 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field994 ^= this.field994 << 2;
            } else {
                this.field994 ^= this.field994 >>> 16;
            }
            this.field994 += this.field995[var2 + 128 & 0xFF];
            int var4;
            this.field995[var2] = var4 = this.field995[class702.method3949(var3 >> 2, 255)] + this.field994 + this.field987;
            this.field991[var2] = this.field987 = this.field995[class702.method3949(var4 >> 8, 1020) >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)I", line = 219)
    public final int method639(byte arg0) {
        if (this.field992 == 0) {
            this.method638((byte) -117);
            this.field992 = 256;
        }
        field993++;
        if (arg0 >= -68) {
            this.field994 = 83;
        }
        return this.field991[this.field992 - 1];
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V", line = 243)
    private class71() {
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "([I)V", line = 246)
    public class71(int[] arg0) {
        this.field995 = new int[256];
        this.field991 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field991[var2] = arg0[var2];
        }
        this.method637(-1618262741);
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)I", line = 266)
    public final int method640(int arg0) {
        if (this.field992 == 0) {
            this.method638((byte) -103);
            this.field992 = 256;
        }
        if (arg0 != 11314) {
            this.method639((byte) 125);
        }
        field988++;
        return this.field991[--this.field992];
    }
}
