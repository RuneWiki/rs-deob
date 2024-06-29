import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class137 {

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "[I")
    private int[] field2074;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "[I")
    private int[] field2065;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2063 = null;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2072 = "glow2:";

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    private int field2062;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    private int field2064;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    private int field2066;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    private int field2070;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "[[B")
    public static byte[][] field2069;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)I", line = 5)
    public final int method1038(byte arg0) {
        if (arg0 < 122) {
            this.method1041(-103);
        }
        if (this.field2064-- == 0) {
            this.method1041(5);
            this.field2064 = 255;
        }
        field2067++;
        return this.field2074[this.field2064];
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V", line = 26)
    public static void method1039(int arg0) {
        field2072 = null;
        field2069 = (byte[][]) null;
        field2063 = null;
        if (arg0 != -777972670) {
            method1039(-127);
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V", line = 39)
    private final void method1040(int arg0) {
        field2073++;
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
            int var15 = var5 + var14;
            int var16 = var7 + var12;
            int var17 = var16 ^ var12 << 8;
            int var18 = var4 + var17;
            int var19 = var12 + var15;
            var6 = var19 ^ var15 >>> 16;
            int var20 = var15 + var18;
            int var21 = var3 + var6;
            var5 = var20 ^ var18 << 10;
            int var22 = var18 + var21;
            var4 = var22 ^ var21 >>> 4;
            int var23 = var4 + var11;
            int var24 = var2 + var5;
            int var25 = var21 + var24;
            var3 = var25 ^ var24 << 8;
            var8 = var3 + var14;
            int var26 = var23 + var24;
            var2 = var26 ^ var23 >>> 9;
            var7 = var2 + var17;
            var9 = var8 + var23;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field2074[var27 + 3] + var6;
            int var29 = this.field2074[var27 + 4] + var5;
            int var30 = this.field2074[var27 + 1] + var8;
            int var31 = this.field2074[var27] + var9;
            int var32 = this.field2074[var27 + 2] + var7;
            int var33 = var31 ^ var30 << 11;
            int var34 = this.field2074[var27 + 7] + var2;
            int var35 = var28 + var33;
            int var36 = var30 + var32;
            int var37 = this.field2074[var27 + 6] + var3;
            int var38 = this.field2074[var27 + 5] + var4;
            int var39 = var36 ^ var32 >>> 2;
            int var40 = var29 + var39;
            int var41 = var32 + var35;
            int var42 = var41 ^ var35 << 8;
            int var43 = var35 + var40;
            var6 = var43 ^ var40 >>> 16;
            int var44 = var6 + var37;
            int var45 = var38 + var42;
            int var46 = var40 + var45;
            var5 = var46 ^ var45 << 10;
            int var47 = var44 + var45;
            int var48 = var5 + var34;
            var4 = var47 ^ var44 >>> 4;
            int var49 = var4 + var33;
            int var50 = var44 + var48;
            var3 = var50 ^ var48 << 8;
            int var51 = var48 + var49;
            var2 = var51 ^ var49 >>> 9;
            var7 = var2 + var42;
            var8 = var3 + var39;
            var9 = var8 + var49;
            this.field2065[var27] = var9;
            this.field2065[var27 + 1] = var8;
            this.field2065[var27 + 2] = var7;
            this.field2065[var27 + 3] = var6;
            this.field2065[var27 + 4] = var5;
            this.field2065[var27 + 5] = var4;
            this.field2065[var27 + 6] = var3;
            this.field2065[var27 + 7] = var2;
        }
        if (arg0 < 68) {
            this.method1040(-15);
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field2065[var52] + var9;
            int var54 = this.field2065[var52 + 2] + var7;
            int var55 = this.field2065[var52 + 7] + var2;
            int var56 = this.field2065[var52 + 3] + var6;
            int var57 = this.field2065[var52 + 5] + var4;
            int var58 = this.field2065[var52 + 4] + var5;
            int var59 = this.field2065[var52 + 6] + var3;
            int var60 = this.field2065[var52 + 1] + var8;
            int var61 = var53 ^ var60 << 11;
            int var62 = var54 + var60;
            int var63 = var56 + var61;
            int var64 = var62 ^ var54 >>> 2;
            int var65 = var54 + var63;
            int var66 = var65 ^ var63 << 8;
            int var67 = var57 + var66;
            int var68 = var58 + var64;
            int var69 = var63 + var68;
            var6 = var69 ^ var68 >>> 16;
            int var70 = var6 + var59;
            int var71 = var67 + var68;
            var5 = var71 ^ var67 << 10;
            int var72 = var67 + var70;
            var4 = var72 ^ var70 >>> 4;
            int var73 = var4 + var61;
            int var74 = var5 + var55;
            int var75 = var70 + var74;
            var3 = var75 ^ var74 << 8;
            int var76 = var73 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var73 >>> 9;
            var7 = var2 + var66;
            var9 = var8 + var73;
            this.field2065[var52] = var9;
            this.field2065[var52 + 1] = var8;
            this.field2065[var52 + 2] = var7;
            this.field2065[var52 + 3] = var6;
            this.field2065[var52 + 4] = var5;
            this.field2065[var52 + 5] = var4;
            this.field2065[var52 + 6] = var3;
            this.field2065[var52 + 7] = var2;
        }
        this.method1041(5);
        this.field2064 = 256;
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V", line = 188)
    private final void method1041(int arg0) {
        this.field2070 += ++this.field2062;
        field2068++;
        int var2 = 0;
        if (arg0 != 5) {
            this.field2065 = (int[]) null;
        }
        while (var2 < 256) {
            int var3 = this.field2065[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2066 ^= this.field2066 << 13;
                } else {
                    this.field2066 ^= this.field2066 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2066 ^= this.field2066 << 2;
            } else {
                this.field2066 ^= this.field2066 >>> 16;
            }
            this.field2066 += this.field2065[var2 + 128 & 0xFF];
            int var4;
            this.field2065[var2] = var4 = this.field2065[class149.method1117(var3, 1020) >> 2] + this.field2066 + this.field2070;
            this.field2074[var2] = this.field2070 = this.field2065[class149.method1117(261237, var4) >> 8 >> 2] + var3;
            var2++;
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V", line = 241)
    private class137() {
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "([I)V", line = 243)
    public class137(int[] arg0) {
        this.field2074 = new int[256];
        this.field2065 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2074[var2] = arg0[var2];
        }
        this.method1040(94);
    }
}
