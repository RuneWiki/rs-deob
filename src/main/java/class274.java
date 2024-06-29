import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class274 {

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "[I")
    private int[] field4662;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "[I")
    private int[] field4676;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "Lel;")
    public static class218 field4660 = new class218();

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "Lma;")
    public static class5 field4673 = class12.method119(")4", (byte) 83);

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "Lma;")
    private static class5 field4667 = class12.method119("Use", (byte) 59);

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "Lma;")
    public static class5 field4669 = field4667;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "Lma;")
    private static class5 field4677 = class12.method119("Loading textures )2 ", (byte) 75);

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "Lma;")
    public static class5 field4675 = field4677;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "Ljava/lang/Object;")
    public static Object field4672 = new Object();

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "Lbf;")
    public static class209 field4679 = new class209(32);

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "Lma;")
    public static class5 field4681 = class12.method119("Spieler kann nicht gefunden werden: ", (byte) 60);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    private int field4659;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    private int field4664;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    private int field4666;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    private int field4674;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "Lni;")
    public static class202 field4682;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "Lpg;")
    public static class295 field4678;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V", line = 4)
    public static final void method1864(byte arg0) {
        field4670++;
        if (arg0 == -109 && class61.field954 != null) {
            class194 var1 = class61.field954;
            synchronized (class61.field954) {
                class61.field954 = null;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V", line = 25)
    private final void method1865(int arg0) {
        this.field4666 += ++this.field4659;
        field4671++;
        for (int var2 = arg0; var2 < 256; var2++) {
            int var3 = this.field4676[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field4664 ^= this.field4664 << 13;
                } else {
                    this.field4664 ^= this.field4664 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field4664 ^= this.field4664 << 2;
            } else {
                this.field4664 ^= this.field4664 >>> 16;
            }
            this.field4664 += this.field4676[var2 + 128 & 0xFF];
            int var4;
            this.field4676[var2] = var4 = this.field4676[class204.method1354(255, var3 >> 2)] + this.field4664 + this.field4666;
            this.field4662[var2] = this.field4666 = this.field4676[class204.method1354(var4 >> 8, 1020) >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V", line = 65)
    private final void method1866(byte arg0) {
        field4668++;
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
            int var12 = var6 + var11;
            int var13 = var7 + var8;
            int var14 = var13 ^ var7 >>> 2;
            int var15 = var7 + var12;
            int var16 = var5 + var14;
            int var17 = var15 ^ var12 << 8;
            int var18 = var4 + var17;
            int var19 = var12 + var16;
            var6 = var19 ^ var16 >>> 16;
            int var20 = var3 + var6;
            int var21 = var16 + var18;
            var5 = var21 ^ var18 << 10;
            int var22 = var2 + var5;
            int var23 = var18 + var20;
            var4 = var23 ^ var20 >>> 4;
            int var24 = var20 + var22;
            int var25 = var4 + var11;
            var3 = var24 ^ var22 << 8;
            int var26 = var22 + var25;
            var8 = var3 + var14;
            var2 = var26 ^ var25 >>> 9;
            var9 = var8 + var25;
            var7 = var2 + var17;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field4662[var27 + 2] + var7;
            int var29 = this.field4662[var27 + 4] + var5;
            int var30 = this.field4662[var27] + var9;
            int var31 = this.field4662[var27 + 7] + var2;
            int var32 = this.field4662[var27 + 5] + var4;
            int var33 = this.field4662[var27 + 3] + var6;
            int var34 = this.field4662[var27 + 6] + var3;
            int var35 = this.field4662[var27 + 1] + var8;
            int var36 = var30 ^ var35 << 11;
            int var37 = var33 + var36;
            int var38 = var28 + var35;
            int var39 = var38 ^ var28 >>> 2;
            int var40 = var29 + var39;
            int var41 = var28 + var37;
            int var42 = var41 ^ var37 << 8;
            int var43 = var32 + var42;
            int var44 = var37 + var40;
            var6 = var44 ^ var40 >>> 16;
            int var45 = var6 + var34;
            int var46 = var40 + var43;
            var5 = var46 ^ var43 << 10;
            int var47 = var5 + var31;
            int var48 = var43 + var45;
            var4 = var48 ^ var45 >>> 4;
            int var49 = var4 + var36;
            int var50 = var45 + var47;
            var3 = var50 ^ var47 << 8;
            var8 = var3 + var39;
            int var51 = var47 + var49;
            var2 = var51 ^ var49 >>> 9;
            var7 = var2 + var42;
            var9 = var8 + var49;
            this.field4676[var27] = var9;
            this.field4676[var27 + 1] = var8;
            this.field4676[var27 + 2] = var7;
            this.field4676[var27 + 3] = var6;
            this.field4676[var27 + 4] = var5;
            this.field4676[var27 + 5] = var4;
            this.field4676[var27 + 6] = var3;
            this.field4676[var27 + 7] = var2;
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field4676[var52 + 7] + var2;
            int var54 = this.field4676[var52 + 5] + var4;
            int var55 = this.field4676[var52] + var9;
            int var56 = this.field4676[var52 + 1] + var8;
            int var57 = this.field4676[var52 + 3] + var6;
            int var58 = this.field4676[var52 + 2] + var7;
            int var59 = var55 ^ var56 << 11;
            int var60 = this.field4676[var52 + 4] + var5;
            int var61 = this.field4676[var52 + 6] + var3;
            int var62 = var56 + var58;
            int var63 = var57 + var59;
            int var64 = var62 ^ var58 >>> 2;
            int var65 = var60 + var64;
            int var66 = var58 + var63;
            int var67 = var66 ^ var63 << 8;
            int var68 = var63 + var65;
            var6 = var68 ^ var65 >>> 16;
            int var69 = var54 + var67;
            int var70 = var6 + var61;
            int var71 = var65 + var69;
            var5 = var71 ^ var69 << 10;
            int var72 = var69 + var70;
            int var73 = var5 + var53;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var70 + var73;
            int var75 = var4 + var59;
            var3 = var74 ^ var73 << 8;
            int var76 = var73 + var75;
            var8 = var3 + var64;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
            this.field4676[var52] = var9;
            this.field4676[var52 + 1] = var8;
            this.field4676[var52 + 2] = var7;
            this.field4676[var52 + 3] = var6;
            this.field4676[var52 + 4] = var5;
            this.field4676[var52 + 5] = var4;
            this.field4676[var52 + 6] = var3;
            this.field4676[var52 + 7] = var2;
        }
        this.method1865(0);
        int var77 = -45 / ((arg0 + 36) / 55);
        this.field4674 = 256;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V", line = 215)
    public static void method1867(int arg0) {
        field4672 = null;
        field4681 = null;
        field4675 = null;
        field4682 = null;
        field4660 = null;
        field4679 = null;
        if (arg0 != 256) {
            field4660 = (class218) null;
        }
        field4677 = null;
        field4669 = null;
        field4673 = null;
        field4678 = null;
        field4667 = null;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V", line = 242)
    public static final void method1868(int arg0) {
        class135.method885(true);
        System.gc();
        class112.method741(arg0, 5);
        field4661++;
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)I", line = 264)
    public final int method1869(int arg0) {
        field4665++;
        if (arg0 != 256) {
            this.method1866((byte) -66);
        }
        if ((this.field4674--) == 0) {
            this.method1865(0);
            this.field4674 = 255;
        }
        return this.field4662[this.field4674];
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)V", line = 282)
    public static final void method1870(int arg0) {
        int var1 = -15 % ((-arg0 - 40) / 56);
        field4663++;
        try {
            if (class106.field1579 == 1) {
                int var2 = class72.field1133.method1431(29015);
                if (var2 > 0 && class72.field1133.method1426((byte) 126)) {
                    int var3 = var2 - class15.field274;
                    if (var3 < 0) {
                        var3 = 0;
                    }
                    class72.field1133.method1436(1745567687, var3);
                    return;
                }
                class72.field1133.method1454(false);
                class72.field1133.method1447(15);
                class208.field3296 = null;
                if (class171.field2629 == null) {
                    class106.field1579 = 0;
                } else {
                    class106.field1579 = 2;
                }
                class137.field2027 = null;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class72.field1133.method1454(false);
            class208.field3296 = null;
            class106.field1579 = 0;
            class171.field2629 = null;
            class137.field2027 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V", line = 331)
    private class274() {
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "([I)V", line = 343)
    public class274(int[] arg0) {
        this.field4662 = new int[256];
        this.field4676 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field4662[var2] = arg0[var2];
        }
        this.method1866((byte) -110);
    }
}
