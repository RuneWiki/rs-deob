import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class191 {

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "[I")
    private int[] field3013;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "[I")
    private int[] field3019;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "[I")
    public static int[] field3008 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "Lwm;")
    private static class152 field3012 = class157.method1048("level: ", 100);

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "Lwm;")
    public static class152 field3017 = class157.method1048("Hierhin gehen", 120);

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "Lwm;")
    public static class152 field3010 = field3012;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "Lne;")
    public static class235 field3015 = new class235(30);

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    private int field3005;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
    private int field3014;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
    private int field3016;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
    private int field3020;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "Lah;")
    public static class205 field3004;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V", line = 11)
    private final void method1263(int arg0) {
        this.field3014 += ++this.field3016;
        if (arg0 != 2) {
            this.field3013 = (int[]) null;
        }
        field3007++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field3019[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field3020 ^= this.field3020 << 13;
                } else {
                    this.field3020 ^= this.field3020 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field3020 ^= this.field3020 << 2;
            } else {
                this.field3020 ^= this.field3020 >>> 16;
            }
            this.field3020 += this.field3019[var2 + 128 & 0xFF];
            int var4;
            this.field3019[var2] = var4 = this.field3014 + this.field3020 + this.field3019[class34.method251(var3 >> 2, 255)];
            this.field3013[var2] = this.field3014 = this.field3019[class34.method251(255, var4 >> 8 >> 2)] + var3;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BI)I", line = 61)
    public static final int method1264(byte arg0, int arg1) {
        field3006++;
        if (arg0 != 91) {
            method1265(-14);
        }
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V", line = 108)
    public static void method1265(int arg0) {
        field3015 = null;
        if (arg0 != -7) {
            return;
        }
        field3010 = null;
        field3012 = null;
        field3008 = null;
        field3017 = null;
        field3004 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)Lk;", line = 126)
    public static final class234 method1266(int arg0, int arg1) {
        field3009++;
        class234 var2 = (class234) class167.field2618.method1620(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class275.field4702.method1381(31, arg0, 0);
        class234 var4 = new class234();
        if (var3 != null) {
            var4.method1607(new class291(var3), arg0, (byte) 3);
        }
        if (arg1 != 2) {
            field3015 = (class235) null;
        }
        class167.field2618.method1614(var4, (long) arg0, (byte) 78);
        return var4;
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)V", line = 161)
    private final void method1267(int arg0) {
        field3018++;
        if (arg0 != 5) {
            return;
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
            int var11 = var9 ^ var8 << 11;
            int var12 = var7 + var8;
            int var13 = var6 + var11;
            int var14 = var12 ^ var7 >>> 2;
            int var15 = var5 + var14;
            int var16 = var7 + var13;
            int var17 = var16 ^ var13 << 8;
            int var18 = var4 + var17;
            int var19 = var13 + var15;
            var6 = var19 ^ var15 >>> 16;
            int var20 = var15 + var18;
            int var21 = var3 + var6;
            var5 = var20 ^ var18 << 10;
            int var22 = var2 + var5;
            int var23 = var18 + var21;
            var4 = var23 ^ var21 >>> 4;
            int var24 = var4 + var11;
            int var25 = var21 + var22;
            var3 = var25 ^ var22 << 8;
            var8 = var3 + var14;
            int var26 = var22 + var24;
            var2 = var26 ^ var24 >>> 9;
            var9 = var8 + var24;
            var7 = var2 + var17;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field3013[var27 + 3] + var6;
            int var29 = this.field3013[var27 + 6] + var3;
            int var30 = this.field3013[var27 + 2] + var7;
            int var31 = this.field3013[var27 + 1] + var8;
            int var32 = this.field3013[var27 + 5] + var4;
            int var33 = this.field3013[var27 + 7] + var2;
            int var34 = this.field3013[var27] + var9;
            int var35 = var34 ^ var31 << 11;
            int var36 = var28 + var35;
            int var37 = this.field3013[var27 + 4] + var5;
            int var38 = var30 + var31;
            int var39 = var38 ^ var30 >>> 2;
            int var40 = var30 + var36;
            int var41 = var37 + var39;
            int var42 = var40 ^ var36 << 8;
            int var43 = var32 + var42;
            int var44 = var36 + var41;
            var6 = var44 ^ var41 >>> 16;
            int var45 = var6 + var29;
            int var46 = var41 + var43;
            var5 = var46 ^ var43 << 10;
            int var47 = var5 + var33;
            int var48 = var43 + var45;
            var4 = var48 ^ var45 >>> 4;
            int var49 = var4 + var35;
            int var50 = var45 + var47;
            var3 = var50 ^ var47 << 8;
            var8 = var3 + var39;
            int var51 = var47 + var49;
            var2 = var51 ^ var49 >>> 9;
            var9 = var8 + var49;
            var7 = var2 + var42;
            this.field3019[var27] = var9;
            this.field3019[var27 + 1] = var8;
            this.field3019[var27 + 2] = var7;
            this.field3019[var27 + 3] = var6;
            this.field3019[var27 + 4] = var5;
            this.field3019[var27 + 5] = var4;
            this.field3019[var27 + 6] = var3;
            this.field3019[var27 + 7] = var2;
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field3019[var52 + 4] + var5;
            int var54 = this.field3019[var52 + 1] + var8;
            int var55 = this.field3019[var52 + 6] + var3;
            int var56 = this.field3019[var52 + 7] + var2;
            int var57 = this.field3019[var52 + 5] + var4;
            int var58 = this.field3019[var52 + 2] + var7;
            int var59 = this.field3019[var52 + 3] + var6;
            int var60 = this.field3019[var52] + var9;
            int var61 = var60 ^ var54 << 11;
            int var62 = var59 + var61;
            int var63 = var54 + var58;
            int var64 = var63 ^ var58 >>> 2;
            int var65 = var53 + var64;
            int var66 = var58 + var62;
            int var67 = var66 ^ var62 << 8;
            int var68 = var57 + var67;
            int var69 = var62 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var6 + var55;
            int var71 = var65 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var5 + var56;
            int var73 = var68 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var70 + var72;
            var3 = var74 ^ var72 << 8;
            var8 = var3 + var64;
            int var75 = var4 + var61;
            int var76 = var72 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
            this.field3019[var52] = var9;
            this.field3019[var52 + 1] = var8;
            this.field3019[var52 + 2] = var7;
            this.field3019[var52 + 3] = var6;
            this.field3019[var52 + 4] = var5;
            this.field3019[var52 + 5] = var4;
            this.field3019[var52 + 6] = var3;
            this.field3019[var52 + 7] = var2;
        }
        this.method1263(arg0 ^ 0x7);
        this.field3005 = 256;
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(I)I", line = 341)
    public final int method1268(int arg0) {
        if (this.field3005-- == 0) {
            this.method1263(2);
            this.field3005 = 255;
        }
        field3011++;
        if (arg0 != 3534) {
            this.method1268(-117);
        }
        return this.field3013[this.field3005];
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V", line = 357)
    private class191() {
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "([I)V", line = 359)
    public class191(int[] arg0) {
        this.field3013 = new int[256];
        this.field3019 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3013[var2] = arg0[var2];
        }
        this.method1267(5);
    }
}
