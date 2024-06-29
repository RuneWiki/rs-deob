import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class186 {

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public int field2971;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public int field2966;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public int field2970;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field2972 = 0;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "[I")
    public static int[] field2967;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "[I")
    public static int[] field2973;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)Lje;")
    public static final class154 method1298(int arg0, byte arg1) {
        field2969++;
        class154 var2 = (class154) class28.field396.method1693((long) arg0, 108);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class265.field4271.method928(32, (byte) 117, arg0);
        class154 var4 = new class154();
        if (var3 != null) {
            var4.method1057((byte) -84, new class96(var3));
        }
        var4.method1055(-6802);
        class28.field396.method1694(true, (long) arg0, var4);
        int var5 = -72 % ((-arg1 - 32) / 44);
        return var4;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)Z")
    public static final boolean method1299(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class162.field2576; var3++) {
            class61 var4 = class32.field425[var3];
            if (var4.field804 == 1) {
                int var5 = var4.field775 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field788 * var5 >> 8) + var4.field789;
                    int var7 = (var4.field776 * var5 >> 8) + var4.field808;
                    int var8 = (var4.field778 * var5 >> 8) + var4.field801;
                    int var9 = (var4.field774 * var5 >> 8) + var4.field799;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field804 == 2) {
                int var10 = arg0 - var4.field775;
                if (var10 > 0) {
                    int var11 = (var4.field788 * var10 >> 8) + var4.field789;
                    int var12 = (var4.field776 * var10 >> 8) + var4.field808;
                    int var13 = (var4.field778 * var10 >> 8) + var4.field801;
                    int var14 = (var4.field774 * var10 >> 8) + var4.field799;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field804 == 3) {
                int var15 = var4.field789 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field792 * var15 >> 8) + var4.field775;
                    int var17 = (var4.field798 * var15 >> 8) + var4.field807;
                    int var18 = (var4.field778 * var15 >> 8) + var4.field801;
                    int var19 = (var4.field774 * var15 >> 8) + var4.field799;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field804 == 4) {
                int var20 = arg2 - var4.field789;
                if (var20 > 0) {
                    int var21 = (var4.field792 * var20 >> 8) + var4.field775;
                    int var22 = (var4.field798 * var20 >> 8) + var4.field807;
                    int var23 = (var4.field778 * var20 >> 8) + var4.field801;
                    int var24 = (var4.field774 * var20 >> 8) + var4.field799;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field804 == 5) {
                int var25 = arg1 - var4.field801;
                if (var25 > 0) {
                    int var26 = (var4.field792 * var25 >> 8) + var4.field775;
                    int var27 = (var4.field798 * var25 >> 8) + var4.field807;
                    int var28 = (var4.field788 * var25 >> 8) + var4.field789;
                    int var29 = (var4.field776 * var25 >> 8) + var4.field808;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(III)V")
    public abstract void method292(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZZ)V")
    public static final void method1300(boolean arg0, boolean arg1) {
        class102.field1376 = arg1;
        if (!arg0) {
            field2967 = null;
        }
        field2968++;
        if (!class102.field1376) {
            int var26 = class96.field1283.method562((byte) -18);
            int var27 = class96.field1283.method584(255);
            int var28 = (class219.field3508 - class96.field1283.field1228) / 16;
            class39.field487 = new int[var28][4];
            for (int var29 = 0; var29 < var28; var29++) {
                for (int var39 = 0; var39 < 4; var39++) {
                    class39.field487[var29][var39] = class96.field1283.method597(-1197332568);
                }
            }
            int var30 = class96.field1283.method548(127);
            boolean var31 = false;
            if ((var30 / 8 == 48 || var30 / 8 == 49) && var26 / 8 == 48) {
                var31 = true;
            }
            int var32 = class96.field1283.method562((byte) -18);
            if ((var30 / 8) == 48 && var26 / 8 == 148) {
                var31 = true;
            }
            boolean var33 = class190.method1322(class96.field1283.method584(255), 22389);
            int var34 = class96.field1283.method549(255);
            class250.field4083 = null;
            class274.field4374 = new int[var28];
            class281.field4451 = new byte[var28][];
            class121.field1713 = new byte[var28][];
            class86.field1056 = new int[var28];
            class156.field2520 = new int[var28];
            class209.field3343 = null;
            class131.field2091 = new int[var28];
            class117.field1662 = new int[var28];
            int var35 = 0;
            for (int var36 = (var30 - 6) / 8; var36 <= ((var30 + 6) / 8); var36++) {
                for (int var37 = (var26 - 6) / 8; var37 <= (var26 + 6) / 8; var37++) {
                    int var38 = (var36 << 8) + var37;
                    if (var31 && var37 == 49 || var37 == 149 || var37 == 147 || var36 == 50 || !(var36 != 49 || var37 != 47)) {
                        class86.field1056[var35] = var38;
                        class156.field2520[var35] = -1;
                        class117.field1662[var35] = -1;
                        class274.field4374[var35] = -1;
                        class131.field2091[var35] = -1;
                    } else {
                        class86.field1056[var35] = var38;
                        class156.field2520[var35] = class137.field2191.method929((byte) 35, "m" + var36 + "_" + var37);
                        class117.field1662[var35] = class137.field2191.method929((byte) -125, "l" + var36 + "_" + var37);
                        class274.field4374[var35] = class137.field2191.method929((byte) 24, "um" + var36 + "_" + var37);
                        class131.field2091[var35] = class137.field2191.method929((byte) 120, "ul" + var36 + "_" + var37);
                    }
                    var35++;
                }
            }
            class117.method757(false, var32, var34, var30, -35, var26, var27, var33);
            return;
        }
        int var2 = class96.field1283.method548(116);
        int var3 = class96.field1283.method548(119);
        int var4 = class96.field1283.method563(255);
        int var5 = class96.field1283.method562((byte) -18);
        class96.field1283.method1927(-27511);
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = class96.field1283.method1919(1, 5);
                    if (var25 == 1) {
                        class67.field843[var6][var23][var24] = class96.field1283.method1919(26, 5);
                    } else {
                        class67.field843[var6][var23][var24] = -1;
                    }
                }
            }
        }
        class96.field1283.method1931(-24551);
        int var7 = (class219.field3508 - class96.field1283.field1228) / 16;
        class39.field487 = new int[var7][4];
        for (int var8 = 0; var8 < var7; var8++) {
            for (int var22 = 0; var22 < 4; var22++) {
                class39.field487[var8][var22] = class96.field1283.method576(-112);
            }
        }
        int var9 = class96.field1283.method586((byte) -81);
        boolean var10 = class190.method1322(class96.field1283.method584(255), 22389);
        class121.field1713 = new byte[var7][];
        class156.field2520 = new int[var7];
        class86.field1056 = new int[var7];
        class209.field3343 = null;
        class250.field4083 = null;
        class281.field4451 = new byte[var7][];
        class131.field2091 = new int[var7];
        class274.field4374 = new int[var7];
        class117.field1662 = new int[var7];
        int var11 = 0;
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 13; var13++) {
                for (int var14 = 0; var14 < 13; var14++) {
                    int var15 = class67.field843[var12][var13][var14];
                    if (var15 != -1) {
                        int var16 = var15 >> 14 & 0x3FF;
                        int var17 = (var15 & 0x3FF8) >> 3;
                        int var18 = (var16 / 8 << 8) + (var17 / 8);
                        for (int var19 = 0; var19 < var11; var19++) {
                            if (class86.field1056[var19] == var18) {
                                var18 = -1;
                                break;
                            }
                        }
                        if (var18 != -1) {
                            class86.field1056[var11] = var18;
                            int var20 = var18 >> 8 & 0xFF;
                            int var21 = var18 & 0xFF;
                            class156.field2520[var11] = class137.field2191.method929((byte) 121, "m" + var20 + "_" + var21);
                            class117.field1662[var11] = class137.field2191.method929((byte) 122, "l" + var20 + "_" + var21);
                            class274.field4374[var11] = class137.field2191.method929((byte) -91, "um" + var20 + "_" + var21);
                            class131.field2091[var11] = class137.field2191.method929((byte) 119, "ul" + var20 + "_" + var21);
                            var11++;
                        }
                    }
                }
            }
        }
        class117.method757(false, var5, var3, var9, -60, var2, var4, var10);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIB)V")
    public abstract void method293(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BII)V")
    public abstract void method291(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(III)V")
    public class186(int arg0, int arg1, int arg2) {
        this.field2971 = arg2;
        this.field2966 = arg0;
        this.field2970 = arg1;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public static void method1301(byte arg0) {
        field2967 = null;
        field2973 = null;
        if (arg0 != -60) {
            field2973 = null;
        }
    }
}
