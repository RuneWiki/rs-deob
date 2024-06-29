import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class90 {

    @OriginalMember(owner = "client!na", name = "v", descriptor = "[I")
    private int[] field2158 = new int[256];

    @OriginalMember(owner = "client!na", name = "c", descriptor = "[I")
    private int[] field2139 = new int[256];

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field2142 = 2;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "Lja;")
    private static class62 field2150 = class30.method243(43, "shake:");

    @OriginalMember(owner = "client!na", name = "i", descriptor = "Z")
    public static boolean field2145 = false;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "Lja;")
    public static class62 field2140 = field2150;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "Lja;")
    public static class62 field2147 = class30.method243(43, "");

    @OriginalMember(owner = "client!na", name = "s", descriptor = "Lja;")
    public static class62 field2155 = field2150;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "Lja;")
    public static class62 field2157 = class30.method243(43, "<col=40ff00>");

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    private int field2137;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    private int field2144;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    private int field2151;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "I")
    private int field2156;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "Ljf;")
    public static class68 field2153;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "[Lq;")
    public static class114[] field2154;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
    private final void method701(byte arg0) {
        field2148++;
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
            int var68 = var4 + var67;
            int var69 = var64 + var65;
            var6 = var69 ^ var64 >>> 16;
            int var70 = var64 + var68;
            int var71 = var3 + var6;
            var5 = var70 ^ var68 << 10;
            int var72 = var68 + var71;
            var4 = var72 ^ var71 >>> 4;
            int var73 = var2 + var5;
            int var74 = var4 + var61;
            int var75 = var71 + var73;
            var3 = var75 ^ var73 << 8;
            var8 = var3 + var63;
            int var76 = var73 + var74;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
        }
        int var11 = 0;
        if (arg0 >= -88) {
            method702((byte) -59);
        }
        while (var11 < 256) {
            int var37 = this.field2158[var11] + var9;
            int var38 = this.field2158[var11 + 2] + var7;
            int var39 = this.field2158[var11 + 3] + var6;
            int var40 = this.field2158[var11 + 6] + var3;
            int var41 = this.field2158[var11 + 5] + var4;
            int var42 = this.field2158[var11 + 1] + var8;
            int var43 = this.field2158[var11 + 7] + var2;
            int var44 = var37 ^ var42 << 11;
            int var45 = this.field2158[var11 + 4] + var5;
            int var46 = var39 + var44;
            int var47 = var38 + var42;
            int var48 = var47 ^ var38 >>> 2;
            int var49 = var45 + var48;
            int var50 = var38 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var41 + var51;
            int var53 = var46 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var6 + var40;
            int var55 = var49 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var5 + var43;
            int var57 = var52 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var4 + var44;
            int var59 = var54 + var56;
            var3 = var59 ^ var56 << 8;
            int var60 = var56 + var58;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var8 = var3 + var48;
            var9 = var8 + var58;
            this.field2139[var11] = var9;
            this.field2139[var11 + 1] = var8;
            this.field2139[var11 + 2] = var7;
            this.field2139[var11 + 3] = var6;
            this.field2139[var11 + 4] = var5;
            this.field2139[var11 + 5] = var4;
            this.field2139[var11 + 6] = var3;
            this.field2139[var11 + 7] = var2;
            var11 += 8;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2139[var12 + 1] + var8;
            int var14 = this.field2139[var12] + var9;
            int var15 = this.field2139[var12 + 4] + var5;
            int var16 = this.field2139[var12 + 5] + var4;
            int var17 = this.field2139[var12 + 2] + var7;
            int var18 = this.field2139[var12 + 6] + var3;
            int var19 = this.field2139[var12 + 3] + var6;
            int var20 = var14 ^ var13 << 11;
            int var21 = this.field2139[var12 + 7] + var2;
            int var22 = var13 + var17;
            int var23 = var22 ^ var17 >>> 2;
            int var24 = var15 + var23;
            int var25 = var19 + var20;
            int var26 = var17 + var25;
            int var27 = var26 ^ var25 << 8;
            int var28 = var24 + var25;
            var6 = var28 ^ var24 >>> 16;
            int var29 = var16 + var27;
            int var30 = var24 + var29;
            int var31 = var6 + var18;
            var5 = var30 ^ var29 << 10;
            int var32 = var29 + var31;
            var4 = var32 ^ var31 >>> 4;
            int var33 = var5 + var21;
            int var34 = var31 + var33;
            var3 = var34 ^ var33 << 8;
            var8 = var3 + var23;
            int var35 = var4 + var20;
            int var36 = var33 + var35;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field2139[var12] = var9;
            this.field2139[var12 + 1] = var8;
            this.field2139[var12 + 2] = var7;
            this.field2139[var12 + 3] = var6;
            this.field2139[var12 + 4] = var5;
            this.field2139[var12 + 5] = var4;
            this.field2139[var12 + 6] = var3;
            this.field2139[var12 + 7] = var2;
        }
        this.method708(723443088);
        this.field2144 = 256;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
    public static void method702(byte arg0) {
        field2154 = null;
        field2157 = null;
        field2147 = null;
        field2153 = null;
        field2150 = null;
        field2140 = null;
        if (arg0 != -50) {
            method703((byte) 9, null);
        }
        field2155 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLhe;)Lhe;")
    public static final class54 method703(byte arg0, class54 arg1) {
        int var2 = class102.method818(class22.method171(arg1, (byte) -124), (byte) 28);
        field2149++;
        if (var2 == 0) {
            return null;
        } else if (arg0 == -37) {
            for (int var3 = 0; var3 < var2; var3++) {
                arg1 = class62.method456(arg1.field1234, (byte) 72);
                if (arg1 == null) {
                    return null;
                }
            }
            return arg1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)Lt;")
    public static final class135 method704(int arg0, int arg1) {
        field2152++;
        int var2 = 58 % ((-arg0 - 27) / 63);
        class135 var3 = (class135) class16.field378.method129((long) arg1, 24838);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class126.field2855.method867(3, 15, arg1);
        class135 var5 = new class135();
        if (var4 != null) {
            var5.method1087(0, new class128(var4));
        }
        class16.field378.method128((byte) -109, var5, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(B)I")
    public static final int method705(byte arg0) {
        field2146++;
        return arg0 == 115 ? class47.field1093++ : 68;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
    public static final int method706(int arg0, KeyEvent arg1) {
        if (arg0 != 256) {
            method705((byte) -83);
        }
        int var2 = arg1.getKeyChar();
        field2159++;
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(B)I")
    public final int method707(byte arg0) {
        if (arg0 != -1) {
            field2154 = null;
        }
        if (this.field2144-- == 0) {
            this.method708(arg0 ^ 0xD4E1226F);
            this.field2144 = 255;
        }
        field2138++;
        return this.field2158[this.field2144];
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    private final void method708(int arg0) {
        this.field2137 += ++this.field2156;
        field2141++;
        int var2 = 0;
        if (arg0 != 723443088) {
            field2150 = null;
        }
        while (var2 < 256) {
            int var3 = this.field2139[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2151 ^= this.field2151 << 13;
                } else {
                    this.field2151 ^= this.field2151 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2151 ^= this.field2151 << 2;
            } else {
                this.field2151 ^= this.field2151 >>> 16;
            }
            this.field2151 += this.field2139[var2 + 128 & 0xFF];
            int var4;
            this.field2139[var2] = var4 = this.field2151 + this.field2139[class24.method192(255, var3 >> 2)] + this.field2137;
            this.field2158[var2] = this.field2137 = this.field2139[class24.method192(255, var4 >> 8 >> 2)] + var3;
            var2++;
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "([I)V")
    public class90(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2158[var2] = arg0[var2];
        }
        this.method701((byte) -89);
    }
}
