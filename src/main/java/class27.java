import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class27 {

    @OriginalMember(owner = "client!de", name = "j", descriptor = "[I")
    private int[] field650 = new int[256];

    @OriginalMember(owner = "client!de", name = "g", descriptor = "[I")
    private int[] field647 = new int[256];

    @OriginalMember(owner = "client!de", name = "h", descriptor = "Lr;")
    public static class118 field648 = class153.method1136(88, "b12_full");

    @OriginalMember(owner = "client!de", name = "b", descriptor = "[I")
    public static int[] field642 = new int[2000];

    @OriginalMember(owner = "client!de", name = "v", descriptor = "Lr;")
    public static class118 field662 = class153.method1136(111, "oder benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!de", name = "x", descriptor = "[[B")
    public static byte[][] field664 = new byte[1000][];

    @OriginalMember(owner = "client!de", name = "p", descriptor = "I")
    public static int field656 = 0;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "Lr;")
    private static class118 field660 = class153.method1136(125, "Loaded interfaces");

    @OriginalMember(owner = "client!de", name = "k", descriptor = "Lr;")
    public static class118 field651 = field660;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field652 = 0;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "Lr;")
    public static class118 field663 = class153.method1136(95, "(U0a )2 via: ");

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    private int field643;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    private int field654;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    private int field659;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "I")
    private int field665;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Lvd;")
    public static class150 field644;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "Lff;")
    public static class42 field653;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "[I")
    public static int[] field641;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IZIBILjf;I)V")
    public static final void method234(int arg0, boolean arg1, int arg2, byte arg3, int arg4, class68 arg5, int arg6) {
        if (arg6 <= 69) {
            field653 = null;
        }
        field658++;
        long var7 = (long) ((arg0 << 16) + arg4);
        class31 var9 = (class31) class115.field2672.method297(var7, -1);
        if (var9 != null) {
            return;
        }
        class31 var10 = (class31) class72.field1675.method297(var7, -1);
        if (var10 != null) {
            return;
        }
        class31 var11 = (class31) class25.field614.method297(var7, -1);
        if (var11 == null) {
            if (!arg1) {
                class31 var12 = (class31) class32.field808.method297(var7, -1);
                if (var12 != null) {
                    return;
                }
            }
            class31 var13 = new class31();
            var13.field785 = arg5;
            var13.field788 = arg3;
            var13.field786 = arg2;
            if (arg1) {
                class115.field2672.method288(var13, var7, (byte) -91);
                class56.field1316++;
            } else {
                class74.field1799.method1236(var13, true);
                class25.field614.method288(var13, var7, (byte) -91);
                class133.field3041++;
            }
        } else if (arg1) {
            var11.method962(123);
            class115.field2672.method288(var11, var7, (byte) -91);
            class133.field3041--;
            class56.field1316++;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    private final void method235(int arg0) {
        this.field654 += ++this.field659;
        field661++;
        for (int var2 = arg0; var2 < 256; var2++) {
            int var3 = this.field647[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field665 ^= this.field665 << 13;
                } else {
                    this.field665 ^= this.field665 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field665 ^= this.field665 << 2;
            } else {
                this.field665 ^= this.field665 >>> 16;
            }
            this.field665 += this.field647[var2 + 128 & 0xFF];
            int var4;
            this.field647[var2] = var4 = this.field665 + this.field647[class79.method669(1020, var3) >> 2] + this.field654;
            this.field650[var2] = this.field654 = var3 + this.field647[class79.method669(1020, var4 >> 8) >> 2];
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
    public static void method236(int arg0) {
        field653 = null;
        field662 = null;
        field663 = null;
        field660 = null;
        if (arg0 != 2) {
            method239(null, 36, -46, 12);
        }
        field648 = null;
        field641 = null;
        field642 = null;
        field651 = null;
        field644 = null;
        field664 = null;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V")
    private final void method237(int arg0) {
        field657++;
        if (arg0 != 1) {
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
            int var62 = var7 + var8;
            int var63 = var62 ^ var7 >>> 2;
            int var64 = var5 + var63;
            int var65 = var6 + var61;
            int var66 = var7 + var65;
            int var67 = var66 ^ var65 << 8;
            int var68 = var64 + var65;
            var6 = var68 ^ var64 >>> 16;
            int var69 = var3 + var6;
            int var70 = var4 + var67;
            int var71 = var64 + var70;
            var5 = var71 ^ var70 << 10;
            int var72 = var2 + var5;
            int var73 = var69 + var70;
            var4 = var73 ^ var69 >>> 4;
            int var74 = var69 + var72;
            var3 = var74 ^ var72 << 8;
            var8 = var3 + var63;
            int var75 = var4 + var61;
            int var76 = var72 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field650[var11] + var9;
            int var38 = this.field650[var11 + 5] + var4;
            int var39 = this.field650[var11 + 4] + var5;
            int var40 = this.field650[var11 + 1] + var8;
            int var41 = this.field650[var11 + 3] + var6;
            int var42 = this.field650[var11 + 2] + var7;
            int var43 = this.field650[var11 + 7] + var2;
            int var44 = this.field650[var11 + 6] + var3;
            int var45 = var37 ^ var40 << 11;
            int var46 = var41 + var45;
            int var47 = var40 + var42;
            int var48 = var47 ^ var42 >>> 2;
            int var49 = var42 + var46;
            int var50 = var39 + var48;
            int var51 = var49 ^ var46 << 8;
            int var52 = var38 + var51;
            int var53 = var46 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var6 + var44;
            int var55 = var50 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var5 + var43;
            int var57 = var52 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var54 + var56;
            int var59 = var4 + var45;
            var3 = var58 ^ var56 << 8;
            int var60 = var56 + var59;
            var8 = var3 + var48;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            this.field647[var11] = var9;
            var7 = var2 + var51;
            this.field647[var11 + 1] = var8;
            this.field647[var11 + 2] = var7;
            this.field647[var11 + 3] = var6;
            this.field647[var11 + 4] = var5;
            this.field647[var11 + 5] = var4;
            this.field647[var11 + 6] = var3;
            this.field647[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field647[var12 + 3] + var6;
            int var14 = this.field647[var12 + 1] + var8;
            int var15 = this.field647[var12 + 7] + var2;
            int var16 = this.field647[var12] + var9;
            int var17 = this.field647[var12 + 2] + var7;
            int var18 = var16 ^ var14 << 11;
            int var19 = this.field647[var12 + 5] + var4;
            int var20 = this.field647[var12 + 6] + var3;
            int var21 = var13 + var18;
            int var22 = this.field647[var12 + 4] + var5;
            int var23 = var14 + var17;
            int var24 = var23 ^ var17 >>> 2;
            int var25 = var22 + var24;
            int var26 = var17 + var21;
            int var27 = var26 ^ var21 << 8;
            int var28 = var19 + var27;
            int var29 = var21 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var6 + var20;
            int var31 = var25 + var28;
            var5 = var31 ^ var28 << 10;
            int var32 = var5 + var15;
            int var33 = var28 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var30 + var32;
            int var35 = var4 + var18;
            var3 = var34 ^ var32 << 8;
            int var36 = var32 + var35;
            var8 = var3 + var24;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field647[var12] = var9;
            this.field647[var12 + 1] = var8;
            this.field647[var12 + 2] = var7;
            this.field647[var12 + 3] = var6;
            this.field647[var12 + 4] = var5;
            this.field647[var12 + 5] = var4;
            this.field647[var12 + 6] = var3;
            this.field647[var12 + 7] = var2;
        }
        this.method235(0);
        this.field643 = 256;
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)I")
    public final int method238(int arg0) {
        if (arg0 > -19) {
            method239(null, 15, -36, -15);
        }
        if (this.field643-- == 0) {
            this.method235(0);
            this.field643 = 255;
        }
        field645++;
        return this.field650[this.field643];
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/awt/Component;III)Lkb;")
    public static final class71 method239(Component arg0, int arg1, int arg2, int arg3) {
        field655++;
        try {
            Class var4 = Class.forName("re");
            int var5 = -81 / ((arg2 + 43) / 53);
            class71 var6 = (class71) var4.getDeclaredConstructor().newInstance();
            var6.method526(arg3, (byte) -128, arg1, arg0);
            return var6;
        } catch (Throwable var8) {
            class59 var7 = new class59();
            var7.method526(arg3, (byte) -124, arg1, arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "([I)V")
    public class27(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field650[var2] = arg0[var2];
        }
        this.method237(1);
    }
}
