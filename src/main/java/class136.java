import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class136 extends class219 {

    @OriginalMember(owner = "client!pa", name = "W", descriptor = "Z")
    private boolean field2433 = true;

    @OriginalMember(owner = "client!pa", name = "V", descriptor = "I")
    private int field2432 = 4096;

    @OriginalMember(owner = "client!pa", name = "T", descriptor = "[I")
    public static int[] field2430 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!pa", name = "K", descriptor = "Lbd;")
    public static class162 field2421 = class17.method142(0, "huffman");

    @OriginalMember(owner = "client!pa", name = "ab", descriptor = "Lbd;")
    public static class162 field2437 = class17.method142(0, "Liste der Welten geladen");

    @OriginalMember(owner = "client!pa", name = "Q", descriptor = "Lqb;")
    public static class209 field2427 = new class209(4);

    @OriginalMember(owner = "client!pa", name = "J", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!pa", name = "M", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!pa", name = "N", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!pa", name = "O", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!pa", name = "P", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!pa", name = "R", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!pa", name = "S", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!pa", name = "U", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!pa", name = "Y", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!pa", name = "Z", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!pa", name = "L", descriptor = "Lkb;")
    public static class187 field2422;

    @OriginalMember(owner = "client!pa", name = "X", descriptor = "[I")
    public static int[] field2434;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(III)Z", line = 4)
    public static final boolean method1066(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            method1070(-52);
        }
        field2429++;
        return (arg0 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BZ)V", line = 16)
    public static final void method1067(byte arg0, boolean arg1) {
        field2425++;
        if (class122.field2215.field5013 >> 7 == class170.field2959 && class122.field2215.field5047 >> 7 == class46.field727) {
            class170.field2959 = 0;
        }
        int var2 = class171.field2966;
        if (arg1) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            long var4;
            class39 var6;
            if (arg1) {
                var4 = 8791798054912L;
                var6 = class122.field2215;
            } else {
                var6 = class270.field4520[class123.field2233[var3]];
                var4 = (long) class123.field2233[var3] << 32;
            }
            if (var6 != null && var6.method289(-10662)) {
                var6.field621 = false;
                int var7 = var6.field5013 >> 7;
                if ((class261.field4362 && class171.field2966 > 200 || class171.field2966 > 50) && !arg1 && var6.field5068 == var6.field5064) {
                    var6.field621 = true;
                }
                int var8 = var6.field5047 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var6.field625 == null || var6.field628 > class90.field1598 || var6.field635 <= class90.field1598) {
                        if (var6.method293((byte) 25) == 1 && (var6.field5013 & 0x7F) == 64 && (var6.field5047 & 0x7F) == 64) {
                            if (class218.field3640[var7][var8] == class279.field4702) {
                                continue;
                            }
                            class218.field3640[var7][var8] = class279.field4702;
                        }
                        var6.field5058 = class3.method15(var6.field5013, class157.field2765, var6.field5047, false);
                        class238.method1684(class157.field2765, var6.field5013, var6.field5047, var6.field5058, (var6.method293((byte) 25) - 1) * 64 + 60, var6, var6.field5018, var4, var6.field5069);
                    } else {
                        var6.field621 = false;
                        var6.field5058 = class3.method15(var6.field5013, class157.field2765, var6.field5047, false);
                        class297.method2035(class157.field2765, var6.field5013, var6.field5047, var6.field5058, var6, var6.field5018, var4, var6.field608, var6.field603, var6.field605, var6.field641);
                    }
                }
            }
        }
        if (arg0 <= 114) {
            method1070(-8);
        }
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(B)V", line = 111)
    public static final void method1068(byte arg0) {
        field2436++;
        int var1 = -95 / ((-arg0 - 7) / 59);
        class62.field955.method1533(true);
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V", line = 124)
    public class136() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IILb;)V", line = 129)
    public final void method42(int arg0, int arg1, class94 arg2) {
        field2435++;
        if (arg1 != 0) {
            field2434 = (int[]) null;
        }
        if (arg0 == 0) {
            this.field2432 = arg2.method761((byte) 108);
        } else if (arg0 == 1) {
            this.field2433 = arg2.method756(915905888) == 1;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)[[I", line = 165)
    public final int[][] method219(int arg0, byte arg1) {
        field2424++;
        if (arg1 != 83) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field3651.method406(false, arg0);
        if (this.field3651.field917) {
            int[] var4 = this.method1585(0, arg0 - 1 & class60.field927, -6606);
            int[] var5 = this.method1585(0, arg0, -6606);
            int[] var6 = this.method1585(0, arg0 + 1 & class60.field927, -6606);
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            for (int var10 = 0; var10 < class128.field2326; var10++) {
                int var11 = (var6[var10] - var4[var10]) * this.field2432;
                int var12 = (var5[var10 + 1 & class252.field4208] - var5[class252.field4208 & var10 - 1]) * this.field2432;
                int var13 = var11 >> 12;
                int var14 = var12 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var20 = var12 / var17;
                    var18 = var11 / var17;
                    var19 = 16777216 / var17;
                }
                if (this.field2433) {
                    var19 = (var19 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var7[var10] = var20;
                var9[var10] = var18;
                var8[var10] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(ZI)I", line = 257)
    public static final int method1069(boolean arg0, int arg1) {
        long var2 = class300.method2048((byte) 18);
        field2431++;
        for (class156 var4 = arg0 ? (class156) class235.field3925.method1666((byte) 62) : (class156) class235.field3925.method1673((byte) 37); var4 != null; var4 = (class156) class235.field3925.method1673((byte) -125)) {
            if (var2 > (var4.field2747 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field2747 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field2701;
                    class129.field2329[var5] = class263.field4389[var5];
                    var4.method1183(false);
                    return var5;
                }
                var4.method1183(false);
            }
        }
        if (arg1 <= 39) {
            return 103;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V", line = 306)
    public static void method1070(int arg0) {
        field2434 = null;
        field2437 = null;
        if (arg0 == 8) {
            field2422 = null;
            field2430 = null;
            field2427 = null;
            field2421 = null;
        }
    }
}
