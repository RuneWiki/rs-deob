import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class104 {

    @OriginalMember(owner = "client!le", name = "o", descriptor = "[I")
    private int[] field1917 = new int[256];

    @OriginalMember(owner = "client!le", name = "q", descriptor = "[I")
    private int[] field1919 = new int[256];

    @OriginalMember(owner = "client!le", name = "h", descriptor = "Lsg;")
    private static class169 field1910 = class165.method1060("Press (Wrecover a locked account(W on front page)3", 1536);

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Lsg;")
    public static class169 field1904 = field1910;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "Lsg;")
    private static class169 field1911 = class165.method1060("This world is running a closed Beta)3", 1536);

    @OriginalMember(owner = "client!le", name = "d", descriptor = "Lsg;")
    public static class169 field1906 = field1911;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "Lsg;")
    public static class169 field1918 = class165.method1060("scape main", 1536);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    private int field1903;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    private int field1908;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    private int field1913;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    private int field1915;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "Lqd;")
    public static class148 field1907;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "Lwh;")
    public static class206 field1916;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILsg;Z)V")
    public static final void method612(int arg0, class169 arg1, boolean arg2) {
        field1909++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = class96.field1823.method725(arg1, 250);
        int var6 = var3 + 6;
        int var7 = class96.field1823.method738(arg1, 250) * 13;
        if (arg0 > -82) {
            field1906 = null;
        }
        class130.method850(var6 - var3, -var3 + var4, var3 + var5 + var3, var3 - -var3 + var7, 0);
        class130.method857(var6 - var3, var4 - var3, var3 + var5 + var3, var3 + var7 + var3, 16777215);
        class96.field1823.method732(arg1, var6, var4, var5, var7, 16777215, -1, 1, 1, 0);
        class5.method35(var3 + var7 + var3, var3 + var5 + var3, true, var6 - var3, -var3 + var4);
        if (!arg2) {
            class172.method1148(var5, var4, var6, var7, -15062);
            return;
        }
        try {
            Graphics var8 = class1.field4.getGraphics();
            class174.field3354.method763(18307, 0, var8, 0);
        } catch (Exception var9) {
            class1.field4.repaint();
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IZIB)V")
    public static final void method613(int arg0, boolean arg1, int arg2, byte arg3) {
        field1905++;
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class64.field1199 = arg0;
        class70.field1313 = arg2;
        class51.field931 = arg1;
        if (arg3 > -17) {
            method613(-46, true, 26, (byte) -71);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    private final void method614(byte arg0) {
        field1912++;
        int var2 = 56 / ((arg0 + 81) / 33);
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        int var10 = -1640531527;
        for (int var11 = 0; var11 < 4; var11++) {
            int var62 = var10 ^ var9 << 11;
            int var63 = var8 + var9;
            int var64 = var7 + var62;
            int var65 = var63 ^ var8 >>> 2;
            int var66 = var6 + var65;
            int var67 = var8 + var64;
            int var68 = var67 ^ var64 << 8;
            int var69 = var5 + var68;
            int var70 = var64 + var66;
            var7 = var70 ^ var66 >>> 16;
            int var71 = var66 + var69;
            var6 = var71 ^ var69 << 10;
            int var72 = var4 + var7;
            int var73 = var69 + var72;
            var5 = var73 ^ var72 >>> 4;
            int var74 = var3 + var6;
            int var75 = var72 + var74;
            int var76 = var5 + var62;
            var4 = var75 ^ var74 << 8;
            int var77 = var74 + var76;
            var3 = var77 ^ var76 >>> 9;
            var8 = var3 + var68;
            var9 = var4 + var65;
            var10 = var9 + var76;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var38 = this.field1919[var12 + 4] + var6;
            int var39 = this.field1919[var12] + var10;
            int var40 = this.field1919[var12 + 3] + var7;
            int var41 = this.field1919[var12 + 5] + var5;
            int var42 = this.field1919[var12 + 2] + var8;
            int var43 = this.field1919[var12 + 6] + var4;
            int var44 = this.field1919[var12 + 1] + var9;
            int var45 = var39 ^ var44 << 11;
            int var46 = var42 + var44;
            int var47 = this.field1919[var12 + 7] + var3;
            int var48 = var40 + var45;
            int var49 = var46 ^ var42 >>> 2;
            int var50 = var38 + var49;
            int var51 = var42 + var48;
            int var52 = var51 ^ var48 << 8;
            int var53 = var48 + var50;
            var7 = var53 ^ var50 >>> 16;
            int var54 = var7 + var43;
            int var55 = var41 + var52;
            int var56 = var50 + var55;
            var6 = var56 ^ var55 << 10;
            int var57 = var6 + var47;
            int var58 = var54 + var55;
            var5 = var58 ^ var54 >>> 4;
            int var59 = var54 + var57;
            var4 = var59 ^ var57 << 8;
            var9 = var4 + var49;
            int var60 = var5 + var45;
            int var61 = var57 + var60;
            var3 = var61 ^ var60 >>> 9;
            var10 = var9 + var60;
            this.field1917[var12] = var10;
            this.field1917[var12 + 1] = var9;
            var8 = var3 + var52;
            this.field1917[var12 + 2] = var8;
            this.field1917[var12 + 3] = var7;
            this.field1917[var12 + 4] = var6;
            this.field1917[var12 + 5] = var5;
            this.field1917[var12 + 6] = var4;
            this.field1917[var12 + 7] = var3;
        }
        for (int var13 = 0; var13 < 256; var13 += 8) {
            int var14 = this.field1917[var13 + 7] + var3;
            int var15 = this.field1917[var13] + var10;
            int var16 = this.field1917[var13 + 2] + var8;
            int var17 = this.field1917[var13 + 1] + var9;
            int var18 = var15 ^ var17 << 11;
            int var19 = this.field1917[var13 + 6] + var4;
            int var20 = this.field1917[var13 + 4] + var6;
            int var21 = this.field1917[var13 + 5] + var5;
            int var22 = this.field1917[var13 + 3] + var7;
            int var23 = var16 + var17;
            int var24 = var18 + var22;
            int var25 = var23 ^ var16 >>> 2;
            int var26 = var16 + var24;
            int var27 = var20 + var25;
            int var28 = var26 ^ var24 << 8;
            int var29 = var21 + var28;
            int var30 = var24 + var27;
            var7 = var30 ^ var27 >>> 16;
            int var31 = var7 + var19;
            int var32 = var27 + var29;
            var6 = var32 ^ var29 << 10;
            int var33 = var29 + var31;
            int var34 = var6 + var14;
            var5 = var33 ^ var31 >>> 4;
            int var35 = var31 + var34;
            int var36 = var5 + var18;
            var4 = var35 ^ var34 << 8;
            var9 = var4 + var25;
            int var37 = var34 + var36;
            var3 = var37 ^ var36 >>> 9;
            var8 = var3 + var28;
            var10 = var9 + var36;
            this.field1917[var13] = var10;
            this.field1917[var13 + 1] = var9;
            this.field1917[var13 + 2] = var8;
            this.field1917[var13 + 3] = var7;
            this.field1917[var13 + 4] = var6;
            this.field1917[var13 + 5] = var5;
            this.field1917[var13 + 6] = var4;
            this.field1917[var13 + 7] = var3;
        }
        this.method615(26768);
        this.field1913 = 256;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    private final void method615(int arg0) {
        this.field1908 += ++this.field1903;
        field1920++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1917[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1915 ^= this.field1915 << 13;
                } else {
                    this.field1915 ^= this.field1915 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1915 ^= this.field1915 << 2;
            } else {
                this.field1915 ^= this.field1915 >>> 16;
            }
            this.field1915 += this.field1917[var2 + 128 & 0xFF];
            int var4;
            this.field1917[var2] = var4 = this.field1915 + this.field1917[class150.method984(255, var3 >> 2)] + this.field1908;
            this.field1919[var2] = this.field1908 = var3 + this.field1917[class150.method984(1020, var4 >> 8) >> 2];
        }
        if (arg0 != 26768) {
            field1911 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)I")
    public final int method616(int arg0) {
        if (this.field1913-- == 0) {
            this.method615(26768);
            this.field1913 = 255;
        }
        field1914++;
        int var2 = -11 % ((-arg0 - 68) / 52);
        return this.field1919[this.field1913];
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "([I)V")
    public class104(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1919[var2] = arg0[var2];
        }
        this.method614((byte) -120);
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V")
    public static void method617(int arg0) {
        field1904 = null;
        field1916 = null;
        field1910 = null;
        field1911 = null;
        field1918 = null;
        field1906 = null;
        field1907 = null;
        if (arg0 > -62) {
            method613(85, false, 18, (byte) 4);
        }
    }
}
