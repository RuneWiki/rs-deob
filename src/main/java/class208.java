import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class208 {

    @OriginalMember(owner = "client!le", name = "a", descriptor = "[I")
    private int[] field3743;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "[I")
    private int[] field3744;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field3747 = 0;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static volatile int field3748 = 0;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    private int field3745;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    private int field3746;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    private int field3753;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    private int field3756;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "Lfl;")
    public static class192 field3750;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "Lfl;")
    public static class192 field3754;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "Lsb;")
    public static class92 field3755;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)I")
    public final int method1426(int arg0) {
        if (arg0 != 255) {
            field3747 = 39;
        }
        if ((this.field3745--) == 0) {
            this.method1427(arg0 ^ 0xFF);
            this.field3745 = 255;
        }
        field3758++;
        return this.field3743[this.field3745];
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
    private final void method1427(int arg0) {
        this.field3746 += ++this.field3753;
        field3749++;
        for (int var2 = arg0; var2 < 256; var2++) {
            int var3 = this.field3744[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field3756 ^= this.field3756 << 13;
                } else {
                    this.field3756 ^= this.field3756 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field3756 ^= this.field3756 << 2;
            } else {
                this.field3756 ^= this.field3756 >>> 16;
            }
            this.field3756 += this.field3744[var2 + 128 & 0xFF];
            int var4;
            this.field3744[var2] = var4 = this.field3746 + this.field3744[class203.method1395(var3 >> 2, 255)] + this.field3756;
            this.field3743[var2] = this.field3746 = var3 + this.field3744[class203.method1395(261199, var4) >> 8 >> 2];
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V")
    public static final void method1428(int arg0) {
        field3757++;
        int var1 = class147.field2755;
        int var2 = class78.field1489 - var1 - class26.field706;
        if (arg0 != -1) {
            method1428(-64);
        }
        int var3 = class193.field3468;
        int var4 = class145.field2700 - class50.field1053 - var3;
        if (var1 <= 0 && var2 <= 0 && var3 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class141.field2621 != null) {
                var5 = class141.field2621;
            } else if (class49.field1044 == null) {
                var5 = class281.field4957.field4024;
            } else {
                var5 = class49.field1044;
            }
            int var6 = 0;
            int var7 = 0;
            if (class49.field1044 == var5) {
                Insets var8 = class49.field1044.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class145.field2700);
            }
            if (var3 > 0) {
                var9.fillRect(var6, var7, class78.field1489, var3);
            }
            if (var2 > 0) {
                var9.fillRect(class78.field1489 + var6 - var2, var7, var2, class145.field2700);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class145.field2700 - var4, class78.field1489, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIII)V")
    public static final void method1429(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3759++;
        if (arg0 <= 82) {
            field3755 = null;
        }
        if (arg1 < arg4) {
            for (int var5 = arg1; var5 < arg4; var5++) {
                class44.field973[var5][arg3] = arg2;
            }
        } else {
            for (int var6 = arg4; var6 < arg1; var6++) {
                class44.field973[var6][arg3] = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    public static final void method1430(byte arg0) {
        if (arg0 != 43) {
            return;
        }
        field3752++;
        for (class260 var1 = (class260) class6.field99.method789((byte) -90); var1 != null; var1 = (class260) class6.field99.method787((byte) -76)) {
            class198 var2 = var1.field4484;
            if (class216.field3902 != var2.field3528 || var2.field3538) {
                var1.method97(158);
            } else if (var2.field3531 <= class93.field1655) {
                var2.method1369(-12029, class84.field1572);
                if (var2.field3538) {
                    var1.method97(158);
                } else {
                    class78.method543(var2.field3528, var2.field3523, var2.field3535, var2.field3543, 60, var2, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V")
    public static void method1431(int arg0) {
        if (arg0 == -1554809046) {
            field3755 = null;
            field3750 = null;
            field3754 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "e", descriptor = "(I)V")
    private final void method1432(int arg0) {
        field3751++;
        if (arg0 >= -30) {
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
            int var65 = var7 + var62;
            int var66 = var5 + var64;
            int var67 = var65 ^ var62 << 8;
            int var68 = var4 + var67;
            int var69 = var62 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var3 + var6;
            int var71 = var66 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var68 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var70 + var73;
            var3 = var74 ^ var73 << 8;
            var8 = var3 + var64;
            int var75 = var4 + var61;
            int var76 = var73 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field3743[var11 + 6] + var3;
            int var38 = this.field3743[var11 + 2] + var7;
            int var39 = this.field3743[var11 + 4] + var5;
            int var40 = this.field3743[var11 + 5] + var4;
            int var41 = this.field3743[var11 + 1] + var8;
            int var42 = this.field3743[var11 + 3] + var6;
            int var43 = this.field3743[var11 + 7] + var2;
            int var44 = this.field3743[var11] + var9;
            int var45 = var44 ^ var41 << 11;
            int var46 = var38 + var41;
            int var47 = var42 + var45;
            int var48 = var46 ^ var38 >>> 2;
            int var49 = var38 + var47;
            int var50 = var39 + var48;
            int var51 = var49 ^ var47 << 8;
            int var52 = var47 + var50;
            var6 = var52 ^ var50 >>> 16;
            int var53 = var40 + var51;
            int var54 = var50 + var53;
            int var55 = var6 + var37;
            var5 = var54 ^ var53 << 10;
            int var56 = var53 + var55;
            int var57 = var5 + var43;
            var4 = var56 ^ var55 >>> 4;
            int var58 = var4 + var45;
            int var59 = var55 + var57;
            var3 = var59 ^ var57 << 8;
            int var60 = var57 + var58;
            var2 = var60 ^ var58 >>> 9;
            var8 = var3 + var48;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field3744[var11] = var9;
            this.field3744[var11 + 1] = var8;
            this.field3744[var11 + 2] = var7;
            this.field3744[var11 + 3] = var6;
            this.field3744[var11 + 4] = var5;
            this.field3744[var11 + 5] = var4;
            this.field3744[var11 + 6] = var3;
            this.field3744[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field3744[var12 + 6] + var3;
            int var14 = this.field3744[var12 + 2] + var7;
            int var15 = this.field3744[var12 + 5] + var4;
            int var16 = this.field3744[var12 + 1] + var8;
            int var17 = this.field3744[var12 + 7] + var2;
            int var18 = this.field3744[var12 + 4] + var5;
            int var19 = this.field3744[var12 + 3] + var6;
            int var20 = this.field3744[var12] + var9;
            int var21 = var20 ^ var16 << 11;
            int var22 = var19 + var21;
            int var23 = var14 + var16;
            int var24 = var23 ^ var14 >>> 2;
            int var25 = var14 + var22;
            int var26 = var18 + var24;
            int var27 = var25 ^ var22 << 8;
            int var28 = var15 + var27;
            int var29 = var22 + var26;
            var6 = var29 ^ var26 >>> 16;
            int var30 = var6 + var13;
            int var31 = var26 + var28;
            var5 = var31 ^ var28 << 10;
            int var32 = var5 + var17;
            int var33 = var28 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var30 + var32;
            var3 = var34 ^ var32 << 8;
            var8 = var3 + var24;
            int var35 = var4 + var21;
            int var36 = var32 + var35;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            this.field3744[var12] = var9;
            var7 = var2 + var27;
            this.field3744[var12 + 1] = var8;
            this.field3744[var12 + 2] = var7;
            this.field3744[var12 + 3] = var6;
            this.field3744[var12 + 4] = var5;
            this.field3744[var12 + 5] = var4;
            this.field3744[var12 + 6] = var3;
            this.field3744[var12 + 7] = var2;
        }
        this.method1427(0);
        this.field3745 = 256;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
    private class208() {
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "([I)V")
    public class208(int[] arg0) {
        this.field3743 = new int[256];
        this.field3744 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3743[var2] = arg0[var2];
        }
        this.method1432(-92);
    }
}
