import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class213 {

    @OriginalMember(owner = "client!me", name = "s", descriptor = "[I")
    private int[] field3854;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "[I")
    private int[] field3842;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field3837 = 0;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "Ljd;")
    public static class86 field3839 = class122.method868("Lade Titelbild )2 ", true);

    @OriginalMember(owner = "client!me", name = "i", descriptor = "Ljd;")
    public static class86 field3844 = class122.method868("<col=ffffff>(Y", true);

    @OriginalMember(owner = "client!me", name = "h", descriptor = "Lwj;")
    public static class6 field3843 = null;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "Ljd;")
    public static class86 field3851 = class122.method868("null", true);

    @OriginalMember(owner = "client!me", name = "t", descriptor = "Ljd;")
    public static class86 field3855 = class122.method868("hint_mapmarkers", true);

    @OriginalMember(owner = "client!me", name = "m", descriptor = "[B")
    public static byte[] field3848 = new byte[32896];

    @OriginalMember(owner = "client!me", name = "u", descriptor = "[I")
    public static int[] field3856;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    private int field3841;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    private int field3847;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "I")
    private int field3850;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "I")
    private int field3853;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "[I")
    public static int[] field3840;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "[[B")
    public static byte[][] field3857;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public static final void method1510(int arg0) {
        for (class162 var1 = (class162) class229.field4158.method1737((byte) 74); var1 != null; var1 = (class162) class229.field4158.method1740(-8843)) {
            if (var1.field3036 == -1) {
                var1.field3044 = 0;
                class116.method817((byte) -125, var1);
            } else {
                var1.method1477(arg0 + 1);
            }
        }
        field3836++;
        if (arg0 != 0) {
            method1511(9);
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public static void method1511(int arg0) {
        int var1 = 0 / (-arg0 / 62);
        field3839 = null;
        field3855 = null;
        field3856 = null;
        field3857 = null;
        field3840 = null;
        field3844 = null;
        field3843 = null;
        field3851 = null;
        field3848 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
    private final void method1512(byte arg0) {
        field3838++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        if (arg0 != -107) {
            this.method1512((byte) -28);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var7 + var8;
            int var63 = var6 + var61;
            int var64 = var62 ^ var7 >>> 2;
            int var65 = var7 + var63;
            int var66 = var5 + var64;
            int var67 = var65 ^ var63 << 8;
            int var68 = var63 + var66;
            var6 = var68 ^ var66 >>> 16;
            int var69 = var3 + var6;
            int var70 = var4 + var67;
            int var71 = var66 + var70;
            var5 = var71 ^ var70 << 10;
            int var72 = var69 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var69 >>> 4;
            int var74 = var4 + var61;
            int var75 = var69 + var73;
            var3 = var75 ^ var73 << 8;
            int var76 = var73 + var74;
            var2 = var76 ^ var74 >>> 9;
            var8 = var3 + var64;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field3842[var11 + 3] + var6;
            int var38 = this.field3842[var11 + 2] + var7;
            int var39 = this.field3842[var11 + 7] + var2;
            int var40 = this.field3842[var11 + 1] + var8;
            int var41 = this.field3842[var11 + 4] + var5;
            int var42 = this.field3842[var11] + var9;
            int var43 = var42 ^ var40 << 11;
            int var44 = var37 + var43;
            int var45 = this.field3842[var11 + 5] + var4;
            int var46 = this.field3842[var11 + 6] + var3;
            int var47 = var38 + var40;
            int var48 = var47 ^ var38 >>> 2;
            int var49 = var41 + var48;
            int var50 = var38 + var44;
            int var51 = var50 ^ var44 << 8;
            int var52 = var45 + var51;
            int var53 = var44 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var6 + var46;
            int var55 = var49 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var5 + var39;
            int var57 = var52 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var54 + var56;
            int var59 = var4 + var43;
            var3 = var58 ^ var56 << 8;
            var8 = var3 + var48;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            this.field3854[var11] = var9;
            this.field3854[var11 + 1] = var8;
            var7 = var2 + var51;
            this.field3854[var11 + 2] = var7;
            this.field3854[var11 + 3] = var6;
            this.field3854[var11 + 4] = var5;
            this.field3854[var11 + 5] = var4;
            this.field3854[var11 + 6] = var3;
            this.field3854[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field3854[var12 + 6] + var3;
            int var14 = this.field3854[var12] + var9;
            int var15 = this.field3854[var12 + 1] + var8;
            int var16 = this.field3854[var12 + 5] + var4;
            int var17 = this.field3854[var12 + 4] + var5;
            int var18 = this.field3854[var12 + 2] + var7;
            int var19 = var14 ^ var15 << 11;
            int var20 = this.field3854[var12 + 3] + var6;
            int var21 = this.field3854[var12 + 7] + var2;
            int var22 = var19 + var20;
            int var23 = var15 + var18;
            int var24 = var23 ^ var18 >>> 2;
            int var25 = var17 + var24;
            int var26 = var18 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var16 + var27;
            int var29 = var22 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var6 + var13;
            int var31 = var25 + var28;
            var5 = var31 ^ var28 << 10;
            int var32 = var28 + var30;
            int var33 = var5 + var21;
            var4 = var32 ^ var30 >>> 4;
            int var34 = var4 + var19;
            int var35 = var30 + var33;
            var3 = var35 ^ var33 << 8;
            int var36 = var33 + var34;
            var8 = var3 + var24;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field3854[var12] = var9;
            this.field3854[var12 + 1] = var8;
            this.field3854[var12 + 2] = var7;
            this.field3854[var12 + 3] = var6;
            this.field3854[var12 + 4] = var5;
            this.field3854[var12 + 5] = var4;
            this.field3854[var12 + 6] = var3;
            this.field3854[var12 + 7] = var2;
        }
        this.method1513((byte) -23);
        this.field3853 = 256;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(B)V")
    private final void method1513(byte arg0) {
        field3852++;
        this.field3850 += ++this.field3841;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field3854[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field3847 ^= this.field3847 << 13;
                } else {
                    this.field3847 ^= this.field3847 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field3847 ^= this.field3847 << 2;
            } else {
                this.field3847 ^= this.field3847 >>> 16;
            }
            this.field3847 += this.field3854[var2 + 128 & 0xFF];
            int var4;
            this.field3854[var2] = var4 = this.field3847 + (this.field3854[class1.method5(var3, 1020) >> 2] + this.field3850);
            this.field3842[var2] = this.field3850 = this.field3854[class1.method5(var4 >> 8, 1020) >> 2] + var3;
        }
        if (arg0 != -23) {
            field3848 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(B)I")
    public final int method1514(byte arg0) {
        field3846++;
        if ((this.field3853--) == 0) {
            this.method1513((byte) -23);
            this.field3853 = 255;
        }
        if (arg0 <= 11) {
            this.method1512((byte) 113);
        }
        return this.field3842[this.field3853];
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
    private class213() {
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "([I)V")
    public class213(int[] arg0) {
        this.field3854 = new int[256];
        this.field3842 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3842[var2] = arg0[var2];
        }
        this.method1512((byte) -107);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field3848[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
        field3856 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
        field3858 = 0;
    }
}
