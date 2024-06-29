import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class151 {

    @OriginalMember(owner = "client!af", name = "l", descriptor = "[I")
    private int[] field2863;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "[I")
    private int[] field2855;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "Lli;")
    public static class185 field2853 = class245.method1649(":allyreq:", -34);

    @OriginalMember(owner = "client!af", name = "f", descriptor = "Lli;")
    public static class185 field2857 = class245.method1649("Jeter", 123);

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field2854 = 10;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "I")
    public static int field2870 = 0;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "Lli;")
    public static class185 field2867 = class245.method1649("Fps:", -72);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    private int field2856;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    private int field2859;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    private int field2860;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    private int field2865;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "[Lse;")
    public static class10[] field2858;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)I")
    public final int method1070(int arg0) {
        if ((this.field2860--) == 0) {
            this.method1073(0);
            this.field2860 = 255;
        }
        field2869++;
        return arg0 == -1562076725 ? this.field2863[this.field2860] : -75;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IZI)V")
    public static final void method1071(int arg0, boolean arg1, int arg2) {
        field2868++;
        if (class127.method912(arg2, (byte) -110)) {
            class32.method200(class136.field2557[arg2], (byte) 79, arg0);
            if (!arg1) {
                method1071(18, false, -14);
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
    private final void method1072(byte arg0) {
        field2861++;
        if (arg0 != -107) {
            this.method1070(75);
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
            int var69 = var4 + var67;
            int var70 = var3 + var6;
            int var71 = var65 + var69;
            var5 = var71 ^ var69 << 10;
            int var72 = var2 + var5;
            int var73 = var69 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var70 + var72;
            var3 = var74 ^ var72 << 8;
            int var75 = var4 + var61;
            int var76 = var72 + var75;
            var8 = var3 + var64;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2863[var11] + var9;
            int var38 = this.field2863[var11 + 5] + var4;
            int var39 = this.field2863[var11 + 1] + var8;
            int var40 = var37 ^ var39 << 11;
            int var41 = this.field2863[var11 + 4] + var5;
            int var42 = this.field2863[var11 + 3] + var6;
            int var43 = this.field2863[var11 + 6] + var3;
            int var44 = this.field2863[var11 + 2] + var7;
            int var45 = var40 + var42;
            int var46 = this.field2863[var11 + 7] + var2;
            int var47 = var39 + var44;
            int var48 = var47 ^ var44 >>> 2;
            int var49 = var44 + var45;
            int var50 = var41 + var48;
            int var51 = var49 ^ var45 << 8;
            int var52 = var38 + var51;
            int var53 = var45 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var50 + var52;
            int var55 = var6 + var43;
            var5 = var54 ^ var52 << 10;
            int var56 = var5 + var46;
            int var57 = var52 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var55 + var56;
            int var59 = var4 + var40;
            var3 = var58 ^ var56 << 8;
            var8 = var3 + var48;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field2855[var11] = var9;
            this.field2855[var11 + 1] = var8;
            this.field2855[var11 + 2] = var7;
            this.field2855[var11 + 3] = var6;
            this.field2855[var11 + 4] = var5;
            this.field2855[var11 + 5] = var4;
            this.field2855[var11 + 6] = var3;
            this.field2855[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2855[var12 + 3] + var6;
            int var14 = this.field2855[var12 + 4] + var5;
            int var15 = this.field2855[var12 + 6] + var3;
            int var16 = this.field2855[var12 + 2] + var7;
            int var17 = this.field2855[var12 + 7] + var2;
            int var18 = this.field2855[var12] + var9;
            int var19 = this.field2855[var12 + 5] + var4;
            int var20 = this.field2855[var12 + 1] + var8;
            int var21 = var18 ^ var20 << 11;
            int var22 = var13 + var21;
            int var23 = var16 + var20;
            int var24 = var23 ^ var16 >>> 2;
            int var25 = var14 + var24;
            int var26 = var16 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var22 + var25;
            int var29 = var19 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var25 + var29;
            int var31 = var6 + var15;
            var5 = var30 ^ var29 << 10;
            int var32 = var5 + var17;
            int var33 = var29 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var31 + var32;
            int var35 = var4 + var21;
            var3 = var34 ^ var32 << 8;
            int var36 = var32 + var35;
            var2 = var36 ^ var35 >>> 9;
            var8 = var3 + var24;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field2855[var12] = var9;
            this.field2855[var12 + 1] = var8;
            this.field2855[var12 + 2] = var7;
            this.field2855[var12 + 3] = var6;
            this.field2855[var12 + 4] = var5;
            this.field2855[var12 + 5] = var4;
            this.field2855[var12 + 6] = var3;
            this.field2855[var12 + 7] = var2;
        }
        this.method1073(0);
        this.field2860 = 256;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
    private final void method1073(int arg0) {
        this.field2865 += ++this.field2856;
        field2852++;
        for (int var2 = arg0; var2 < 256; var2++) {
            int var3 = this.field2855[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2859 ^= this.field2859 << 13;
                } else {
                    this.field2859 ^= this.field2859 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2859 ^= this.field2859 << 2;
            } else {
                this.field2859 ^= this.field2859 >>> 16;
            }
            this.field2859 += this.field2855[var2 + 128 & 0xFF];
            int var4;
            this.field2855[var2] = var4 = this.field2865 + (this.field2855[class220.method1526(var3, 1020) >> 2] + this.field2859);
            this.field2863[var2] = this.field2865 = this.field2855[class220.method1526(var4 >> 8 >> 2, 255)] + var3;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)V")
    public static void method1074(boolean arg0) {
        field2857 = null;
        if (arg0) {
            field2870 = -111;
        }
        field2867 = null;
        field2858 = null;
        field2853 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BLie;)V")
    public static final void method1075(byte arg0, class71 arg1) {
        if (arg0 != -108) {
            field2858 = null;
        }
        field2862++;
        for (class58 var2 = (class58) class157.field2979.method1375(arg0 ^ 0xFFFFC017); var2 != null; var2 = (class58) class157.field2979.method1377(arg0 - 19438)) {
            if (var2.field1012 == arg1) {
                if (var2.field1007 != null) {
                    class90.field1744.method802(var2.field1007);
                    var2.field1007 = null;
                }
                var2.method476(arg0 + 213);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)Luh;")
    public static final class235 method1076(int arg0) {
        field2864++;
        try {
            int var1 = 115 % ((45 - arg0) / 63);
            return (class235) Class.forName("ea").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class21();
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BLtg;Z)V")
    public static final void method1077(byte arg0, class270 arg1, boolean arg2) {
        field2866++;
        if (arg2) {
            int var3 = class148.field2796;
            int var4 = var3 * 956 / 503;
            class97.field1812.method705((class204.field3738 - var4) / 2, 0, var4, var3);
            class18.field290.method96(class204.field3738 / 2 - (class18.field290.field200 / 2), 18);
        }
        arg1.method1833(class223.field4087, class204.field3738 / 2, class148.field2796 / 2 - 26, 16777215, -1);
        int var5 = class148.field2796 / 2 - 18;
        if (arg0 > -104) {
            method1071(1, true, 120);
        }
        class159.method1126(class204.field3738 / 2 - 152, var5, 304, 34, 9179409);
        class159.method1126(class204.field3738 / 2 - 151, var5 - -1, 302, 32, 0);
        class159.method1130(class204.field3738 / 2 - 150, var5 + 2, field2854 * 3, 30, 9179409);
        class159.method1130(class204.field3738 / 2 + field2854 * 3 - 150, var5 + 2, 300 - (field2854 * 3), 30, 0);
        arg1.method1833(class80.field1391, class204.field3738 / 2, class148.field2796 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
    private class151() {
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "([I)V")
    public class151(int[] arg0) {
        this.field2863 = new int[256];
        this.field2855 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2863[var2] = arg0[var2];
        }
        this.method1072((byte) -107);
    }
}
