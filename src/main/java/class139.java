import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class139 extends class187 {

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "Ljava/lang/String;")
    public String field2151;

    @OriginalMember(owner = "client!qn", name = "o", descriptor = "J")
    public static long field2149 = 0L;

    @OriginalMember(owner = "client!qn", name = "v", descriptor = "[I")
    public static int[] field2156 = new int[25];

    @OriginalMember(owner = "client!qn", name = "s", descriptor = "[I")
    public static int[] field2153 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!qn", name = "w", descriptor = "B")
    public static byte field2157;

    @OriginalMember(owner = "client!qn", name = "n", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!qn", name = "r", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!qn", name = "t", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!qn", name = "u", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZIII)Ljava/lang/String;", line = 4)
    public static final String method943(boolean arg0, int arg1, int arg2, int arg3) {
        field2154++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        } else if (arg0 && arg1 >= 0) {
            int var4 = 2;
            for (int var5 = arg1 / arg2; var5 != 0; var5 /= arg2) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = (char) arg3;
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg1;
                arg1 /= arg2;
                int var9 = var8 - (arg1 * arg2);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 51)
    public static final boolean method944(String arg0, int arg1) {
        if (arg1 <= 81) {
            return false;
        } else {
            field2152++;
            return class227.method1555(arg0, -101, 10, true);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIIBII)V", line = 63)
    public static final void method945(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field2155++;
        int var7 = arg0 - arg2;
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = 0;
        int var9 = arg0;
        class75.method526(true, arg0);
        int var10 = -arg0;
        int var11 = var7;
        if (arg4 <= 109) {
            method948(-95);
        }
        int var12 = -var7;
        int var13 = -1;
        int var14 = -1;
        if (class323.field5030 <= arg1 && arg1 <= class88.field1324) {
            int[] var15 = class175.field2675[arg1];
            int var16 = class3.method20(class256.field3995, arg3 - arg0, class118.field1834, -27521);
            int var17 = class3.method20(class256.field3995, arg0 + arg3, class118.field1834, -27521);
            int var18 = class3.method20(class256.field3995, arg3 - var7, class118.field1834, -27521);
            int var19 = class3.method20(class256.field3995, arg3 + var7, class118.field1834, -27521);
            class253.method1704(var16, var18, arg5, var15, 7);
            class253.method1704(var18, var19, arg6, var15, 7);
            class253.method1704(var19, var17, arg5, var15, 7);
        }
        while (var8 < var9) {
            var14 += 2;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class231.field3724[var11] = var8;
                var12 -= var11 << 1;
            }
            var13 += 2;
            var10 += var13;
            var8++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg1 - var9;
                int var21 = arg1 + var9;
                if (class323.field5030 <= var21 && class88.field1324 >= var20) {
                    if (var9 >= var7) {
                        int var22 = class3.method20(class256.field3995, arg3 + var8, class118.field1834, -27521);
                        int var23 = class3.method20(class256.field3995, arg3 - var8, class118.field1834, -27521);
                        if (class88.field1324 >= var21) {
                            class253.method1704(var23, var22, arg5, class175.field2675[var21], 7);
                        }
                        if (class323.field5030 <= var20) {
                            class253.method1704(var23, var22, arg5, class175.field2675[var20], 7);
                        }
                    } else {
                        int var24 = class231.field3724[var9];
                        int var25 = class3.method20(class256.field3995, arg3 + var8, class118.field1834, -27521);
                        int var26 = class3.method20(class256.field3995, arg3 - var8, class118.field1834, -27521);
                        int var27 = class3.method20(class256.field3995, arg3 + var24, class118.field1834, -27521);
                        int var28 = class3.method20(class256.field3995, arg3 - var24, class118.field1834, -27521);
                        if (var21 <= class88.field1324) {
                            int[] var29 = class175.field2675[var21];
                            class253.method1704(var26, var28, arg5, var29, 7);
                            class253.method1704(var28, var27, arg6, var29, 7);
                            class253.method1704(var27, var25, arg5, var29, 7);
                        }
                        if (var20 >= class323.field5030) {
                            int[] var30 = class175.field2675[var20];
                            class253.method1704(var26, var28, arg5, var30, 7);
                            class253.method1704(var28, var27, arg6, var30, 7);
                            class253.method1704(var27, var25, arg5, var30, 7);
                        }
                    }
                }
            }
            int var31 = arg1 - var8;
            int var32 = arg1 + var8;
            if (class323.field5030 <= var32 && class88.field1324 >= var31) {
                int var33 = arg3 + var9;
                int var34 = arg3 - var9;
                if (var33 >= class256.field3995 && class118.field1834 >= var34) {
                    int var35 = class3.method20(class256.field3995, var33, class118.field1834, -27521);
                    int var36 = class3.method20(class256.field3995, var34, class118.field1834, -27521);
                    if (var8 < var7) {
                        int var37 = var8 > var11 ? class231.field3724[var8] : var11;
                        int var38 = class3.method20(class256.field3995, arg3 + var37, class118.field1834, -27521);
                        int var39 = class3.method20(class256.field3995, arg3 - var37, class118.field1834, -27521);
                        if (var32 <= class88.field1324) {
                            int[] var40 = class175.field2675[var32];
                            class253.method1704(var36, var39, arg5, var40, 7);
                            class253.method1704(var39, var38, arg6, var40, 7);
                            class253.method1704(var38, var35, arg5, var40, 7);
                        }
                        if (var31 >= class323.field5030) {
                            int[] var41 = class175.field2675[var31];
                            class253.method1704(var36, var39, arg5, var41, 7);
                            class253.method1704(var39, var38, arg6, var41, 7);
                            class253.method1704(var38, var35, arg5, var41, 7);
                        }
                    } else {
                        if (class88.field1324 >= var32) {
                            class253.method1704(var36, var35, arg5, class175.field2675[var32], 7);
                        }
                        if (var31 >= class323.field5030) {
                            class253.method1704(var36, var35, arg5, class175.field2675[var31], 7);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(Z)V", line = 256)
    public static void method946(boolean arg0) {
        field2153 = null;
        if (arg0) {
            field2156 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "()V", line = 265)
    public class139() {
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 268)
    public class139(String arg0) {
        this.field2151 = arg0;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(III)Lqm;", line = 282)
    public static final class152 method947(int arg0, int arg1, int arg2) {
        class174 var3 = class90.field1375[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class152 var4 = var3.field2650;
            var3.field2650 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)V", line = 298)
    public static final void method948(int arg0) {
        field2148++;
        class179 var1 = class158.field2464;
        synchronized (class158.field2464) {
            class206.field3112++;
            class33.field417 = class18.field255;
            if (class18.field254 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class294.field4534[var2] = false;
                }
                class18.field254 = class159.field2475;
            } else {
                while (class18.field254 != class159.field2475) {
                    int var3 = class181.field2777[class159.field2475];
                    class159.field2475 = class159.field2475 + 1 & 0x7F;
                    if (var3 < 0) {
                        class294.field4534[~var3] = false;
                    } else {
                        class294.field4534[var3] = true;
                    }
                }
            }
            class18.field255 = class59.field831;
            if (arg0 != 21211) {
                field2149 = -115L;
            }
        }
    }
}
