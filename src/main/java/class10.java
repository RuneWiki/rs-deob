import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class10 {

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "[I")
    private int[] field191 = new int[256];

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "[I")
    private int[] field188 = new int[256];

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "[I")
    public static int[] field187 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "Lrc;")
    public static class105 field201 = class43.method374("(U", 0);

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "Lrc;")
    private static class105 field198 = class43.method374("Hidden", 0);

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "Lrc;")
    public static class105 field200 = field198;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
    public static int field207 = 0;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "Lrc;")
    private static class105 field192 = class43.method374("From", 0);

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "Lrc;")
    private static class105 field205 = class43.method374("You have only just left another world)3", 0);

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
    public static int field209 = 0;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "Lrc;")
    public static class105 field190 = field205;

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
    public static int field215 = -1;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "Lrc;")
    public static class105 field203 = field192;

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "Lrc;")
    public static class105 field216 = class43.method374("Ihr Charakter)2Profil wird in:", 0);

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "Z")
    public static boolean field217 = true;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    private int field194;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    private int field197;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
    private int field204;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
    private int field210;

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "Lfc;")
    public static class34 field208;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "Lgd;")
    public static class40 field189;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "Z")
    public static boolean field193;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "([BIII)Lrc;", line = 3)
    public static final class105 method125(byte[] arg0, int arg1, int arg2, int arg3) {
        field195++;
        class105 var4 = new class105();
        var4.field2417 = new byte[arg3];
        if (arg1 >= -17) {
            return null;
        }
        var4.field2383 = 0;
        for (int var5 = arg2; var5 < arg2 + arg3; var5++) {
            if (arg0[var5] != 0) {
                var4.field2417[var4.field2383++] = arg0[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)I", line = 33)
    public final int method126(byte arg0) {
        field211++;
        if (this.field210-- == 0) {
            this.method127((byte) 118);
            this.field210 = 255;
        }
        if (arg0 != -87) {
            field215 = 76;
        }
        return this.field191[this.field210];
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V", line = 55)
    private final void method127(byte arg0) {
        this.field204 += ++this.field197;
        if (arg0 < 85) {
            return;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field188[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field194 ^= this.field194 << 13;
                } else {
                    this.field194 ^= this.field194 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field194 ^= this.field194 << 2;
            } else {
                this.field194 ^= this.field194 >>> 16;
            }
            this.field194 += this.field188[var2 + 128 & 0xFF];
            int var4;
            this.field188[var2] = var4 = this.field204 + this.field194 + this.field188[class100.method807(var3 >> 2, 255)];
            this.field191[var2] = this.field204 = var3 + this.field188[class100.method807(var4 >> 8 >> 2, 255)];
        }
        field212++;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(B)V", line = 97)
    private final void method128(byte arg0) {
        field206++;
        if (arg0 >= -11) {
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
            int var61 = var9 ^ var8 << 11;
            int var62 = var6 + var61;
            int var63 = var7 + var8;
            int var64 = var63 ^ var7 >>> 2;
            int var65 = var5 + var64;
            int var66 = var7 + var62;
            int var67 = var66 ^ var62 << 8;
            int var68 = var62 + var65;
            var6 = var68 ^ var65 >>> 16;
            int var69 = var3 + var6;
            int var70 = var4 + var67;
            int var71 = var65 + var70;
            var5 = var71 ^ var70 << 10;
            int var72 = var2 + var5;
            int var73 = var69 + var70;
            var4 = var73 ^ var69 >>> 4;
            int var74 = var69 + var72;
            int var75 = var4 + var61;
            var3 = var74 ^ var72 << 8;
            var8 = var3 + var64;
            int var76 = var72 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field191[var11 + 7] + var2;
            int var38 = this.field191[var11 + 2] + var7;
            int var39 = this.field191[var11 + 6] + var3;
            int var40 = this.field191[var11 + 3] + var6;
            int var41 = this.field191[var11 + 5] + var4;
            int var42 = this.field191[var11] + var9;
            int var43 = this.field191[var11 + 4] + var5;
            int var44 = this.field191[var11 + 1] + var8;
            int var45 = var42 ^ var44 << 11;
            int var46 = var40 + var45;
            int var47 = var38 + var44;
            int var48 = var47 ^ var38 >>> 2;
            int var49 = var38 + var46;
            int var50 = var43 + var48;
            int var51 = var49 ^ var46 << 8;
            int var52 = var41 + var51;
            int var53 = var46 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var50 + var52;
            int var55 = var6 + var39;
            var5 = var54 ^ var52 << 10;
            int var56 = var52 + var55;
            int var57 = var5 + var37;
            var4 = var56 ^ var55 >>> 4;
            int var58 = var55 + var57;
            int var59 = var4 + var45;
            var3 = var58 ^ var57 << 8;
            int var60 = var57 + var59;
            var8 = var3 + var48;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field188[var11] = var9;
            this.field188[var11 + 1] = var8;
            this.field188[var11 + 2] = var7;
            this.field188[var11 + 3] = var6;
            this.field188[var11 + 4] = var5;
            this.field188[var11 + 5] = var4;
            this.field188[var11 + 6] = var3;
            this.field188[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field188[var12 + 6] + var3;
            int var14 = this.field188[var12 + 5] + var4;
            int var15 = this.field188[var12 + 7] + var2;
            int var16 = this.field188[var12] + var9;
            int var17 = this.field188[var12 + 1] + var8;
            int var18 = this.field188[var12 + 2] + var7;
            int var19 = this.field188[var12 + 4] + var5;
            int var20 = this.field188[var12 + 3] + var6;
            int var21 = var16 ^ var17 << 11;
            int var22 = var20 + var21;
            int var23 = var17 + var18;
            int var24 = var23 ^ var18 >>> 2;
            int var25 = var18 + var22;
            int var26 = var25 ^ var22 << 8;
            int var27 = var19 + var24;
            int var28 = var22 + var27;
            int var29 = var14 + var26;
            var6 = var28 ^ var27 >>> 16;
            int var30 = var27 + var29;
            var5 = var30 ^ var29 << 10;
            int var31 = var5 + var15;
            int var32 = var6 + var13;
            int var33 = var29 + var32;
            var4 = var33 ^ var32 >>> 4;
            int var34 = var31 + var32;
            int var35 = var4 + var21;
            var3 = var34 ^ var31 << 8;
            int var36 = var31 + var35;
            var8 = var3 + var24;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            this.field188[var12] = var9;
            var7 = var2 + var26;
            this.field188[var12 + 1] = var8;
            this.field188[var12 + 2] = var7;
            this.field188[var12 + 3] = var6;
            this.field188[var12 + 4] = var5;
            this.field188[var12 + 5] = var4;
            this.field188[var12 + 6] = var3;
            this.field188[var12 + 7] = var2;
        }
        this.method127((byte) 95);
        this.field210 = 256;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V", line = 267)
    public static void method129(int arg0) {
        field203 = null;
        field198 = null;
        field189 = null;
        field200 = null;
        field192 = null;
        field208 = null;
        field187 = null;
        field190 = null;
        field205 = null;
        if (arg0 >= 62) {
            field216 = null;
            field201 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Z", line = 298)
    public static final boolean method130(int arg0, int arg1) {
        field213++;
        if (arg0 != 19193) {
            return true;
        } else if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "([I)V", line = 321)
    public class10(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field191[var2] = arg0[var2];
        }
        this.method128((byte) -123);
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)Leb;", line = 340)
    public static final class27 method131(int arg0) {
        field202++;
        class27 var1 = new class27();
        var1.field611 = class107.field2460;
        var1.field612 = class113.field2648;
        var1.field609 = class43.field981[0];
        var1.field615 = class113.field2646[0];
        var1.field614 = class90.field2059[0];
        var1.field610 = class50.field1057[0];
        if (arg0 != 27043) {
            field208 = null;
        }
        byte[] var2 = class85.field1908[0];
        int var3 = var1.field614 * var1.field610;
        var1.field613 = new int[var3];
        for (int var4 = 0; var4 < var3; var4++) {
            var1.field613[var4] = class58.field1295[class100.method807(var2[var4], 255)];
        }
        class9.method118(-1);
        return var1;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "([BZILjc;)V", line = 404)
    public static final void method132(byte[] arg0, boolean arg1, int arg2, class57 arg3) {
        field196++;
        if (!arg1) {
            method129(-74);
        }
        class64 var4 = new class64();
        var4.field1427 = arg0;
        var4.field1425 = 0;
        var4.field1448 = arg2;
        var4.field1426 = arg3;
        class3 var5 = class109.field2507;
        synchronized (class109.field2507) {
            class109.field2507.method23(1024, var4);
        }
        class15.method165((byte) 127);
    }
}
