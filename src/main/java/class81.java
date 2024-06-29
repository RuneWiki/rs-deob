import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class81 {

    @OriginalMember(owner = "client!le", name = "n", descriptor = "[I")
    private int[] field2017 = new int[256];

    @OriginalMember(owner = "client!le", name = "d", descriptor = "[I")
    private int[] field2007 = new int[256];

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field2005 = 0;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field2004 = -1;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "Lic;")
    public static class59 field2016 = class59.method433(0, "Nehmen");

    @OriginalMember(owner = "client!le", name = "p", descriptor = "[I")
    public static int[] field2019 = new int[4000];

    @OriginalMember(owner = "client!le", name = "h", descriptor = "[I")
    public static int[] field2011 = new int[5];

    @OriginalMember(owner = "client!le", name = "q", descriptor = "Lic;")
    public static class59 field2020 = class59.method433(0, "runes");

    @OriginalMember(owner = "client!le", name = "x", descriptor = "Lic;")
    private static class59 field2027 = class59.method433(0, "World");

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field2012 = 0;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "Lic;")
    public static class59 field2021 = field2027;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "Lic;")
    public static class59 field2014 = field2027;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    private int field2006;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    private int field2009;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    private int field2018;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "I")
    private int field2026;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    private final void method660(byte arg0) {
        field2023++;
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
            int var65 = var7 + var62;
            int var66 = var5 + var64;
            int var67 = var65 ^ var62 << 8;
            int var68 = var4 + var67;
            int var69 = var62 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var3 + var6;
            int var71 = var66 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var2 + var5;
            int var73 = var68 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var72;
            var3 = var75 ^ var72 << 8;
            var8 = var3 + var64;
            int var76 = var72 + var74;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
        }
        if (arg0 != 80) {
            field2014 = null;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2017[var11] + var9;
            int var38 = this.field2017[var11 + 2] + var7;
            int var39 = this.field2017[var11 + 1] + var8;
            int var40 = this.field2017[var11 + 7] + var2;
            int var41 = this.field2017[var11 + 3] + var6;
            int var42 = this.field2017[var11 + 6] + var3;
            int var43 = this.field2017[var11 + 5] + var4;
            int var44 = var37 ^ var39 << 11;
            int var45 = this.field2017[var11 + 4] + var5;
            int var46 = var41 + var44;
            int var47 = var38 + var39;
            int var48 = var47 ^ var38 >>> 2;
            int var49 = var45 + var48;
            int var50 = var38 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var46 + var49;
            int var53 = var43 + var51;
            var6 = var52 ^ var49 >>> 16;
            int var54 = var49 + var53;
            var5 = var54 ^ var53 << 10;
            int var55 = var6 + var42;
            int var56 = var53 + var55;
            int var57 = var5 + var40;
            var4 = var56 ^ var55 >>> 4;
            int var58 = var55 + var57;
            var3 = var58 ^ var57 << 8;
            var8 = var3 + var48;
            int var59 = var4 + var44;
            int var60 = var57 + var59;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            var7 = var2 + var51;
            this.field2007[var11] = var9;
            this.field2007[var11 + 1] = var8;
            this.field2007[var11 + 2] = var7;
            this.field2007[var11 + 3] = var6;
            this.field2007[var11 + 4] = var5;
            this.field2007[var11 + 5] = var4;
            this.field2007[var11 + 6] = var3;
            this.field2007[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2007[var12 + 2] + var7;
            int var14 = this.field2007[var12 + 3] + var6;
            int var15 = this.field2007[var12 + 6] + var3;
            int var16 = this.field2007[var12] + var9;
            int var17 = this.field2007[var12 + 1] + var8;
            int var18 = this.field2007[var12 + 7] + var2;
            int var19 = this.field2007[var12 + 5] + var4;
            int var20 = this.field2007[var12 + 4] + var5;
            int var21 = var16 ^ var17 << 11;
            int var22 = var13 + var17;
            int var23 = var14 + var21;
            int var24 = var22 ^ var13 >>> 2;
            int var25 = var20 + var24;
            int var26 = var13 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var19 + var27;
            int var29 = var23 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var25 + var28;
            int var31 = var6 + var15;
            var5 = var30 ^ var28 << 10;
            int var32 = var28 + var31;
            int var33 = var5 + var18;
            var4 = var32 ^ var31 >>> 4;
            int var34 = var4 + var21;
            int var35 = var31 + var33;
            var3 = var35 ^ var33 << 8;
            var8 = var3 + var24;
            int var36 = var33 + var34;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field2007[var12] = var9;
            this.field2007[var12 + 1] = var8;
            this.field2007[var12 + 2] = var7;
            this.field2007[var12 + 3] = var6;
            this.field2007[var12 + 4] = var5;
            this.field2007[var12 + 5] = var4;
            this.field2007[var12 + 6] = var3;
            this.field2007[var12 + 7] = var2;
        }
        this.method661(true);
        this.field2018 = 256;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
    private final void method661(boolean arg0) {
        this.field2006 += ++this.field2009;
        field2013++;
        if (!arg0) {
            this.method662(97);
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2007[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2026 ^= this.field2026 << 13;
                } else {
                    this.field2026 ^= this.field2026 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2026 ^= this.field2026 << 2;
            } else {
                this.field2026 ^= this.field2026 >>> 16;
            }
            this.field2026 += this.field2007[var2 + 128 & 0xFF];
            int var4;
            this.field2007[var2] = var4 = this.field2006 + this.field2007[class24.method156(var3 >> 2, 255)] + this.field2026;
            this.field2017[var2] = this.field2006 = this.field2007[class24.method156(261250, var4) >> 8 >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)I")
    public final int method662(int arg0) {
        field2008++;
        int var2 = 17 % ((59 - arg0) / 53);
        if (this.field2018-- == 0) {
            this.method661(true);
            this.field2018 = 255;
        }
        return this.field2017[this.field2018];
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILwd;)V")
    public static final void method663(int arg0, class157 arg1) {
        if (class157.field3446 != null) {
            try {
                class157.field3446.method511(-24756, 0L);
                class157.field3446.method509(24, arg1.field3457, -51, arg1.field3473);
            } catch (Exception var2) {
            }
        }
        arg1.field3457 += arg0;
        field2010++;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/awt/Color;Lic;ZI)V")
    public static final void method664(Color arg0, class59 arg1, boolean arg2, int arg3) {
        field2025++;
        try {
            Graphics var4 = class142.field3115.getGraphics();
            if (class142.field3120 == null) {
                class142.field3120 = new Font("Helvetica", 1, 13);
                class41.field1063 = class142.field3115.getFontMetrics(class142.field3120);
            }
            if (class41.field1049) {
                class41.field1049 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class10.field216, class34.field917);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (class99.field2461 == null) {
                    class99.field2461 = class142.field3115.createImage(304, 34);
                }
                Graphics var5 = class99.field2461.getGraphics();
                var5.setColor(arg0);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
                var5.setFont(class142.field3120);
                if (arg2) {
                    field2027 = null;
                }
                var5.setColor(Color.white);
                arg1.method445(22, 63, var5, (304 - arg1.method458(class41.field1063, 1430)) / 2);
                var4.drawImage(class99.field2461, class10.field216 / 2 - 152, class34.field917 / 2 - 18, null);
            } catch (Exception var8) {
                int var6 = class34.field917 / 2 - 18;
                int var7 = class10.field216 / 2 - 152;
                var4.setColor(arg0);
                var4.drawRect(var7, var6, 303, 33);
                var4.fillRect(var7 + 2, var6 + 2, arg3 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var6 + 1, 301, 31);
                var4.fillRect(var7 + arg3 * 3 + 2, var6 + 2, 300 - arg3 * 3, 30);
                var4.setFont(class142.field3120);
                var4.setColor(Color.white);
                arg1.method445(var6 + 22, 63, var4, (304 - arg1.method458(class41.field1063, 1430)) / 2 + var7);
            }
        } catch (Exception var9) {
            class142.field3115.repaint();
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(B)V")
    public static void method665(byte arg0) {
        field2027 = null;
        field2019 = null;
        field2016 = null;
        field2021 = null;
        field2011 = null;
        field2020 = null;
        if (arg0 == 114) {
            field2014 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lic;Lic;ILic;)V")
    public static final void method666(class59 arg0, class59 arg1, int arg2, class59 arg3) {
        if (arg2 <= -81) {
            class90.field2297 = arg1;
            class90.field2296 = arg0;
            class90.field2286 = arg3;
            field2022++;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIII)V")
    public static final void method667(int arg0, int arg1, int arg2, int arg3) {
        field2024++;
        if (arg1 < 128 || arg0 < 128 || arg1 > 13056 || arg0 > 13056) {
            class95.field2416 = -1;
            class149.field3258 = -1;
            return;
        }
        int var4 = class147.method1095((byte) 30, arg0, class44.field1127, arg1) - arg3;
        int var5 = var4 - class134.field2989;
        int var6 = arg1 - class51.field1271;
        if (arg2 <= 34) {
            return;
        }
        int var7 = arg0 - class15.field295;
        int var8 = class11.field244[class26.field672];
        int var9 = class11.field249[class26.field672];
        int var10 = class11.field249[client.field495];
        int var11 = class11.field244[client.field495];
        int var12 = var6 * var10 + var7 * var11 >> 16;
        int var13 = var7 * var10 - var6 * var11 >> 16;
        int var15 = var5 * var9 - var8 * var13 >> 16;
        int var16 = var5 * var8 + var9 * var13 >> 16;
        if (var16 >= 50) {
            class149.field3258 = (var15 << 9) / var16 + 167;
            class95.field2416 = (var12 << 9) / var16 + 256;
        } else {
            class149.field3258 = -1;
            class95.field2416 = -1;
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "([I)V")
    public class81(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2017[var2] = arg0[var2];
        }
        this.method660((byte) 80);
    }
}
