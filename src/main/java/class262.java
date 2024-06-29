import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class262 {

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "[I")
    private int[] field4487;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "[I")
    private int[] field4483;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "Lhi;")
    public static class82 field4484 = class95.method664((byte) -33, "");

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "Lhi;")
    public static class82 field4473 = class95.method664((byte) -94, "mapscene");

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "[I")
    public static int[] field4486 = new int[500];

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "Lac;")
    public static class231 field4479 = new class231(0, 0);

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
    public static int field4488 = -1;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "Lhi;")
    public static class82 field4489 = class95.method664((byte) -48, ")4p=");

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    private int field4472;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    private int field4475;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    private int field4478;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
    private int field4490;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "[[[S")
    public static short[][][] field4474;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V", line = 24)
    private final void method1864(byte arg0) {
        this.field4478 += ++this.field4475;
        int var2 = -62 / ((arg0 + 10) / 36);
        field4477++;
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = this.field4487[var3];
            if ((var3 & 0x2) == 0) {
                if ((var3 & 0x1) == 0) {
                    this.field4490 ^= this.field4490 << 13;
                } else {
                    this.field4490 ^= this.field4490 >>> 6;
                }
            } else if ((var3 & 0x1) == 0) {
                this.field4490 ^= this.field4490 << 2;
            } else {
                this.field4490 ^= this.field4490 >>> 16;
            }
            this.field4490 += this.field4487[var3 + 128 & 0xFF];
            int var5;
            this.field4487[var3] = var5 = this.field4478 + (this.field4487[class277.method1935(var4 >> 2, 255)] + this.field4490);
            this.field4483[var3] = this.field4478 = this.field4487[class277.method1935(255, var5 >> 8 >> 2)] + var4;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)I", line = 66)
    public final int method1865(int arg0) {
        if ((this.field4472--) == 0) {
            this.method1864((byte) -92);
            this.field4472 = 255;
        }
        field4482++;
        if (arg0 != 7) {
            method1866((class81) null, (byte) 104);
        }
        return this.field4483[this.field4472];
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lsa;B)V", line = 87)
    public static final void method1866(class81 arg0, byte arg1) {
        field4481++;
        if (arg1 != 103) {
            field4474 = (short[][][]) ((short[][][]) null);
        }
        class241 var2 = (class241) class38.field642.method507(arg0.field1409.method568(22476), 602425312);
        if (var2 == null) {
            return;
        }
        if (var2.field4181 != null) {
            class219.field3803.method882(var2.field4181);
            var2.field4181 = null;
        }
        var2.method961((byte) 104);
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V", line = 116)
    public static void method1867(int arg0) {
        field4484 = null;
        field4479 = null;
        field4474 = (short[][][]) null;
        field4486 = null;
        if (arg0 >= -112) {
            method1866((class81) null, (byte) -59);
        }
        field4473 = null;
        field4489 = null;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)V", line = 136)
    private final void method1868(int arg0) {
        field4476++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var11 = var9 ^ var8 << 11;
            int var12 = var7 + var8;
            int var13 = var6 + var11;
            int var14 = var12 ^ var7 >>> 2;
            int var15 = var7 + var13;
            int var16 = var5 + var14;
            int var17 = var15 ^ var13 << 8;
            int var18 = var4 + var17;
            int var19 = var13 + var16;
            var6 = var19 ^ var16 >>> 16;
            int var20 = var16 + var18;
            int var21 = var3 + var6;
            var5 = var20 ^ var18 << 10;
            int var22 = var2 + var5;
            int var23 = var18 + var21;
            var4 = var23 ^ var21 >>> 4;
            int var24 = var21 + var22;
            var3 = var24 ^ var22 << 8;
            int var25 = var4 + var11;
            int var26 = var22 + var25;
            var2 = var26 ^ var25 >>> 9;
            var8 = var3 + var14;
            var7 = var2 + var17;
            var9 = var8 + var25;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field4483[var27 + 3] + var6;
            int var29 = this.field4483[var27] + var9;
            int var30 = this.field4483[var27 + 7] + var2;
            int var31 = this.field4483[var27 + 1] + var8;
            int var32 = this.field4483[var27 + 5] + var4;
            int var33 = this.field4483[var27 + 2] + var7;
            int var34 = var29 ^ var31 << 11;
            int var35 = this.field4483[var27 + 6] + var3;
            int var36 = this.field4483[var27 + 4] + var5;
            int var37 = var31 + var33;
            int var38 = var37 ^ var33 >>> 2;
            int var39 = var36 + var38;
            int var40 = var28 + var34;
            int var41 = var33 + var40;
            int var42 = var41 ^ var40 << 8;
            int var43 = var32 + var42;
            int var44 = var39 + var40;
            var6 = var44 ^ var39 >>> 16;
            int var45 = var39 + var43;
            int var46 = var6 + var35;
            var5 = var45 ^ var43 << 10;
            int var47 = var5 + var30;
            int var48 = var43 + var46;
            var4 = var48 ^ var46 >>> 4;
            int var49 = var46 + var47;
            int var50 = var4 + var34;
            var3 = var49 ^ var47 << 8;
            int var51 = var47 + var50;
            var8 = var3 + var38;
            var2 = var51 ^ var50 >>> 9;
            var7 = var2 + var42;
            var9 = var8 + var50;
            this.field4487[var27] = var9;
            this.field4487[var27 + 1] = var8;
            this.field4487[var27 + 2] = var7;
            this.field4487[var27 + 3] = var6;
            this.field4487[var27 + 4] = var5;
            this.field4487[var27 + 5] = var4;
            this.field4487[var27 + 6] = var3;
            this.field4487[var27 + 7] = var2;
        }
        if (arg0 != 7393) {
            field4473 = (class82) null;
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field4487[var52] + var9;
            int var54 = this.field4487[var52 + 3] + var6;
            int var55 = this.field4487[var52 + 1] + var8;
            int var56 = this.field4487[var52 + 2] + var7;
            int var57 = var53 ^ var55 << 11;
            int var58 = this.field4487[var52 + 5] + var4;
            int var59 = var55 + var56;
            int var60 = this.field4487[var52 + 6] + var3;
            int var61 = var54 + var57;
            int var62 = this.field4487[var52 + 4] + var5;
            int var63 = var59 ^ var56 >>> 2;
            int var64 = var56 + var61;
            int var65 = var62 + var63;
            int var66 = var64 ^ var61 << 8;
            int var67 = var58 + var66;
            int var68 = var61 + var65;
            int var69 = this.field4487[var52 + 7] + var2;
            var6 = var68 ^ var65 >>> 16;
            int var70 = var6 + var60;
            int var71 = var65 + var67;
            var5 = var71 ^ var67 << 10;
            int var72 = var5 + var69;
            int var73 = var67 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var4 + var57;
            int var75 = var70 + var72;
            var3 = var75 ^ var72 << 8;
            var8 = var3 + var63;
            int var76 = var72 + var74;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var66;
            var9 = var8 + var74;
            this.field4487[var52] = var9;
            this.field4487[var52 + 1] = var8;
            this.field4487[var52 + 2] = var7;
            this.field4487[var52 + 3] = var6;
            this.field4487[var52 + 4] = var5;
            this.field4487[var52 + 5] = var4;
            this.field4487[var52 + 6] = var3;
            this.field4487[var52 + 7] = var2;
        }
        this.method1864((byte) 93);
        this.field4472 = 256;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lsa;I)V", line = 283)
    public static final void method1869(class81 arg0, int arg1) {
        field4485++;
        if (arg1 != 17021) {
            field4474 = (short[][][]) ((short[][][]) null);
        }
        class241 var2 = (class241) class38.field642.method507(arg0.field1409.method568(22476), 602425312);
        if (var2 == null) {
            class81.method519(class297.field5058, arg0.field1723[0], 0, arg0.field1720[0], (byte) -83, arg0, (class275) null, (class157) null);
        } else {
            var2.method1732((byte) 41);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)J", line = 302)
    public static final long method1870(int arg0, int arg1, int arg2) {
        class16 var3 = class15.field120[arg0][arg1][arg2];
        return var3 == null || var3.field161 == null ? 0L : var3.field161.field2153;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V", line = 322)
    private class262() {
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "([I)V", line = 327)
    public class262(int[] arg0) {
        this.field4487 = new int[256];
        this.field4483 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field4483[var2] = arg0[var2];
        }
        this.method1868(7393);
    }
}
