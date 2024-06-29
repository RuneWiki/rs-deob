import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class68 {

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "[I")
    private int[] field898;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "[I")
    private int[] field907;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static volatile int field902 = 0;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "Luf;")
    public static class168 field899 = class148.method1019(-1720, "Hierhin gehen");

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "Luf;")
    public static class168 field903 = class148.method1019(-1720, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field905 = 0;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "Luf;")
    public static class168 field908 = class148.method1019(-1720, "Mem:");

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    private int field895;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    private int field896;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    private int field900;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    private int field901;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 21)
    public static final void method382(int arg0) {
        class19.field221 = class153.field2371;
        class264.method1836(false, (byte) 16);
        class213.method1480((byte) 82);
        class133.method929(-10917, class19.field221);
        field894++;
        class266.field4489 = new class54();
        class266.field4489.field3027 = 3000;
        class266.field4489.field3021 = 3000;
        if (class289.field4867 == 2) {
            class276.field4641 = class253.field4340 - 48;
            class182.field2916 = class262.field4452 - 48;
            class157.field2483 = class253.field4340 * 128 + 64 - class276.field4641 * 128;
            class253.field4340 = class157.field2483 >> 7;
            class248.field4249 = class262.field4452 * 128 + 64 - (class182.field2916 * 128);
            class262.field4452 = class248.field4249 >> 7;
        } else {
            class19.method90((byte) -126);
        }
        class39.method215(-27197);
        if (arg0 == 15979) {
            class251.method1712(arg0 - 15879);
            class109.method810(28, 8858);
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V", line = 61)
    private final void method383(int arg0) {
        field904++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        int var10 = 0;
        if (arg0 < 51) {
            field903 = (class168) null;
        }
        while (var10 < 4) {
            int var11 = var9 ^ var8 << 11;
            int var12 = var7 + var8;
            int var13 = var6 + var11;
            int var14 = var12 ^ var7 >>> 2;
            int var15 = var7 + var13;
            int var16 = var5 + var14;
            int var17 = var15 ^ var13 << 8;
            int var18 = var13 + var16;
            var6 = var18 ^ var16 >>> 16;
            int var19 = var3 + var6;
            int var20 = var4 + var17;
            int var21 = var16 + var20;
            var5 = var21 ^ var20 << 10;
            int var22 = var19 + var20;
            int var23 = var2 + var5;
            var4 = var22 ^ var19 >>> 4;
            int var24 = var19 + var23;
            var3 = var24 ^ var23 << 8;
            var8 = var3 + var14;
            int var25 = var4 + var11;
            int var26 = var23 + var25;
            var2 = var26 ^ var25 >>> 9;
            var9 = var8 + var25;
            var7 = var2 + var17;
            var10++;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field907[var27 + 4] + var5;
            int var29 = this.field907[var27 + 6] + var3;
            int var30 = this.field907[var27 + 3] + var6;
            int var31 = this.field907[var27 + 1] + var8;
            int var32 = this.field907[var27 + 2] + var7;
            int var33 = this.field907[var27] + var9;
            int var34 = this.field907[var27 + 7] + var2;
            int var35 = var33 ^ var31 << 11;
            int var36 = var30 + var35;
            int var37 = var31 + var32;
            int var38 = var37 ^ var32 >>> 2;
            int var39 = var28 + var38;
            int var40 = var32 + var36;
            int var41 = this.field907[var27 + 5] + var4;
            int var42 = var40 ^ var36 << 8;
            int var43 = var41 + var42;
            int var44 = var36 + var39;
            var6 = var44 ^ var39 >>> 16;
            int var45 = var39 + var43;
            int var46 = var6 + var29;
            var5 = var45 ^ var43 << 10;
            int var47 = var43 + var46;
            var4 = var47 ^ var46 >>> 4;
            int var48 = var5 + var34;
            int var49 = var4 + var35;
            int var50 = var46 + var48;
            var3 = var50 ^ var48 << 8;
            var8 = var3 + var38;
            int var51 = var48 + var49;
            var2 = var51 ^ var49 >>> 9;
            var7 = var2 + var42;
            var9 = var8 + var49;
            this.field898[var27] = var9;
            this.field898[var27 + 1] = var8;
            this.field898[var27 + 2] = var7;
            this.field898[var27 + 3] = var6;
            this.field898[var27 + 4] = var5;
            this.field898[var27 + 5] = var4;
            this.field898[var27 + 6] = var3;
            this.field898[var27 + 7] = var2;
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field898[var52 + 1] + var8;
            int var54 = this.field898[var52 + 3] + var6;
            int var55 = this.field898[var52 + 2] + var7;
            int var56 = this.field898[var52 + 5] + var4;
            int var57 = this.field898[var52 + 7] + var2;
            int var58 = this.field898[var52 + 6] + var3;
            int var59 = this.field898[var52 + 4] + var5;
            int var60 = this.field898[var52] + var9;
            int var61 = var60 ^ var53 << 11;
            int var62 = var53 + var55;
            int var63 = var62 ^ var55 >>> 2;
            int var64 = var54 + var61;
            int var65 = var55 + var64;
            int var66 = var59 + var63;
            int var67 = var65 ^ var64 << 8;
            int var68 = var64 + var66;
            int var69 = var56 + var67;
            var6 = var68 ^ var66 >>> 16;
            int var70 = var66 + var69;
            var5 = var70 ^ var69 << 10;
            int var71 = var5 + var57;
            int var72 = var6 + var58;
            int var73 = var69 + var72;
            var4 = var73 ^ var72 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var72;
            var3 = var75 ^ var71 << 8;
            int var76 = var71 + var74;
            var8 = var3 + var63;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
            this.field898[var52] = var9;
            this.field898[var52 + 1] = var8;
            this.field898[var52 + 2] = var7;
            this.field898[var52 + 3] = var6;
            this.field898[var52 + 4] = var5;
            this.field898[var52 + 5] = var4;
            this.field898[var52 + 6] = var3;
            this.field898[var52 + 7] = var2;
        }
        this.method385((byte) 55);
        this.field895 = 256;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)I", line = 228)
    public final int method384(int arg0) {
        field909++;
        if (arg0 != -11164) {
            this.field896 = -110;
        }
        if ((this.field895--) == 0) {
            this.method385((byte) 89);
            this.field895 = 255;
        }
        return this.field907[this.field895];
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V", line = 247)
    private final void method385(byte arg0) {
        field906++;
        this.field896 += ++this.field901;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field898[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field900 ^= this.field900 << 13;
                } else {
                    this.field900 ^= this.field900 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field900 ^= this.field900 << 2;
            } else {
                this.field900 ^= this.field900 >>> 16;
            }
            this.field900 += this.field898[var2 + 128 & 0xFF];
            int var4;
            this.field898[var2] = var4 = this.field900 + (this.field898[class159.method1119(1020, var3) >> 2] + this.field896);
            this.field907[var2] = this.field896 = this.field898[class159.method1119(255, var4 >> 8 >> 2)] + var3;
        }
        int var5 = 44 % ((arg0 + 9) / 32);
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)V", line = 292)
    public static void method386(int arg0) {
        field903 = null;
        if (arg0 != 0) {
            method382(93);
        }
        field908 = null;
        field899 = null;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V", line = 302)
    private class68() {
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "([I)V", line = 306)
    public class68(int[] arg0) {
        this.field898 = new int[256];
        this.field907 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field907[var2] = arg0[var2];
        }
        this.method383(61);
    }
}
