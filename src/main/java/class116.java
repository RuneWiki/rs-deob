import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class116 {

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
    private int field1925 = -1;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    private int field1911 = 0;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "Lug;")
    private class392 field1920 = new class392();

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "Z")
    public boolean field1928 = false;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    private int field1921;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    private int field1918;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "[Lnr;")
    private class40[] field1919;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "[[I")
    private int[][] field1914;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "Lpi;")
    public static class342 field1923 = new class342(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "[I")
    public static int[] field1926 = new int[3];

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "Luu;")
    public static class187 field1927;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lbr;IIIIIIBIII)Z")
    public static final boolean method854(class268 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int arg10) {
        field1910++;
        int var11 = arg4;
        int var12 = arg3;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg4 - var13;
        class129.field2058[var13][var14] = 99;
        int var16 = arg3 - var14;
        class357.field5436[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class353.field5403[var17] = arg4;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class49.field897[var10001] = arg3;
        int[][] var19 = arg0.field3853;
        while (var26 != var18) {
            var11 = class353.field5403[var18];
            var12 = class49.field897[var18];
            int var20 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            int var21 = var11 - var15;
            int var22 = var11 - arg0.field3862;
            int var23 = var12 - arg0.field3869;
            if (arg6 == -4) {
                if (arg1 == var11 && arg8 == var12) {
                    class400.field6022 = var11;
                    class11.field165 = var12;
                    return true;
                }
            } else if (arg6 == -3) {
                if (class283.method1806(2, 1, 2, var11, arg5, arg2, arg8, arg1, var12)) {
                    class11.field165 = var12;
                    class400.field6022 = var11;
                    return true;
                }
            } else if (arg6 == -2) {
                if (arg0.method1719(arg1, arg9, (byte) 126, arg5, 2, var11, 2, var12, arg8, arg2)) {
                    class400.field6022 = var11;
                    class11.field165 = var12;
                    return true;
                }
            } else if (arg6 == -1) {
                if (arg0.method1732(var11, 68, 2, arg9, arg8, var12, arg2, arg5, arg1)) {
                    class11.field165 = var12;
                    class400.field6022 = var11;
                    return true;
                }
            } else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
                if (arg0.method1723(arg6, arg1, var12, 2, var11, 0, arg10, arg8)) {
                    class11.field165 = var12;
                    class400.field6022 = var11;
                    return true;
                }
            } else if (arg0.method1722(true, arg10, 2, arg8, var12, arg6, var11, arg1)) {
                class11.field165 = var12;
                class400.field6022 = var11;
                return true;
            }
            int var25 = class357.field5436[var21][var20] + 1;
            if (var21 > 0 && class129.field2058[var21 - 1][var20] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class353.field5403[var26] = var11 - 1;
                class49.field897[var26] = var12;
                class129.field2058[var21 - 1][var20] = 2;
                var26 = var26 + 1 & 0xFFF;
                class357.field5436[var21 - 1][var20] = var25;
            }
            if (var21 < 126 && class129.field2058[var21 + 1][var20] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class353.field5403[var26] = var11 + 1;
                class49.field897[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class129.field2058[var21 + 1][var20] = 8;
                class357.field5436[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class129.field2058[var21][var20 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class353.field5403[var26] = var11;
                class49.field897[var26] = var12 - 1;
                class129.field2058[var21][var20 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class357.field5436[var21][var20 - 1] = var25;
            }
            if (var20 < 126 && class129.field2058[var21][var20 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class353.field5403[var26] = var11;
                class49.field897[var26] = var12 + 1;
                class129.field2058[var21][var20 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class357.field5436[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class129.field2058[var21 - 1][var20 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class353.field5403[var26] = var11 - 1;
                class49.field897[var26] = var12 - 1;
                class129.field2058[var21 - 1][var20 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class357.field5436[var21 - 1][var20 - 1] = var25;
            }
            if (var21 < 126 && var20 > 0 && class129.field2058[var21 + 1][var20 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class353.field5403[var26] = var11 + 1;
                class49.field897[var26] = var12 - 1;
                class129.field2058[var21 + 1][var20 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class357.field5436[var21 + 1][var20 - 1] = var25;
            }
            if (var21 > 0 && var20 < 126 && class129.field2058[var21 - 1][var20 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class353.field5403[var26] = var11 - 1;
                class49.field897[var26] = var12 + 1;
                class129.field2058[var21 - 1][var20 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class357.field5436[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 126 && var20 < 126 && class129.field2058[var21 + 1][var20 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class353.field5403[var26] = var11 + 1;
                class49.field897[var26] = var12 + 1;
                class129.field2058[var21 + 1][var20 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class357.field5436[var21 + 1][var20 + 1] = var25;
            }
        }
        class400.field6022 = var11;
        class11.field165 = var12;
        if (arg7 != 46) {
            method854(null, 7, 66, 76, -106, -124, -116, (byte) 97, 62, -41, -106);
        }
        return false;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/awt/Canvas;ILm;IILli;)Lqa;")
    public static final class162 method855(Canvas arg0, int arg1, class126 arg2, int arg3, int arg4, class293 arg5) {
        field1912++;
        if (arg3 <= 104) {
            method859(-10, 63, (byte) 67, -23, true);
        }
        return new class303(arg1, arg0, arg2, arg4, arg5);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)B")
    public static final byte method856(int arg0, int arg1, int arg2) {
        if (arg0 != -28211) {
            method858(54, -81, 18, 98, -93, -6, 45);
        }
        field1917++;
        if (arg2 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
    public static void method857(byte arg0) {
        field1926 = null;
        if (arg0 <= -123) {
            field1923 = null;
            field1927 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIII)V")
    public static final void method858(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1913++;
        if (class315.field4754 <= arg2 - arg1 && arg1 + arg2 <= class156.field2455 && (arg4 - arg1) >= class70.field1213 && class389.field5859 >= arg1 + arg4) {
            class138.method1036(arg6, arg0, arg4, arg2, 0, arg3, arg1);
        } else {
            class497.method2984(arg6, arg3, arg0, arg2, 0, arg4, arg1);
        }
        if (arg5 < 113) {
            method856(115, -118, 54);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIBIZ)V")
    public static final void method859(int arg0, int arg1, byte arg2, int arg3, boolean arg4) {
        field1924++;
        if (class355.method2252(arg1, -92)) {
            class21.method177(arg4, arg3, arg0, -1, class22.field438[arg1], -16207);
            int var5 = -74 % ((62 - arg2) / 62);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public final void method860(int arg0) {
        for (int var2 = 0; var2 < this.field1918; var2++) {
            this.field1914[var2] = null;
        }
        field1915++;
        if (arg0 != 1) {
            method861(-12, -18, 122);
        }
        this.field1919 = null;
        this.field1914 = null;
        this.field1920.method2419((byte) 114);
        this.field1920 = null;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(III)V")
    public static final void method861(int arg0, int arg1, int arg2) {
        field1916++;
        if (class355.method2252(arg2, -32)) {
            if (arg0 != -1) {
                field1926 = null;
            }
            class227.method1487(class22.field438[arg2], (byte) -8, arg1);
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)[[I")
    public final int[][] method862(byte arg0) {
        field1929++;
        if (this.field1921 != this.field1918) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 56 / ((-arg0 - 67) / 44);
        for (int var3 = 0; var3 < this.field1918; var3++) {
            this.field1919[var3] = class185.field2772;
        }
        return this.field1914;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BI)[I")
    public final int[] method863(byte arg0, int arg1) {
        if (arg0 != 12) {
            this.field1928 = false;
        }
        field1922++;
        if (this.field1921 == this.field1918) {
            this.field1928 = this.field1919[arg1] == null;
            this.field1919[arg1] = class185.field2772;
            return this.field1914[arg1];
        } else if (this.field1918 == 1) {
            this.field1928 = this.field1925 != arg1;
            this.field1925 = arg1;
            return this.field1914[0];
        } else {
            class40 var3 = this.field1919[arg1];
            if (var3 == null) {
                this.field1928 = true;
                if (this.field1911 >= this.field1918) {
                    class40 var4 = (class40) this.field1920.method2426(true);
                    var3 = new class40(arg1, var4.field725);
                    this.field1919[var4.field729] = null;
                    var4.method2090(-1);
                } else {
                    var3 = new class40(arg1, this.field1911);
                    this.field1911++;
                }
                this.field1919[arg1] = var3;
            } else {
                this.field1928 = false;
            }
            this.field1920.method2428((byte) 122, var3);
            return this.field1914[var3.field725];
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(III)V")
    public class116(int arg0, int arg1, int arg2) {
        this.field1921 = arg1;
        this.field1918 = arg0;
        this.field1919 = new class40[this.field1921];
        this.field1914 = new int[this.field1918][arg2];
    }
}
