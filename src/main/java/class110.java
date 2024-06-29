import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class110 extends class307 {

    @OriginalMember(owner = "client!eb", name = "D", descriptor = "I")
    public int field1925;

    @OriginalMember(owner = "client!eb", name = "M", descriptor = "I")
    private int field1933;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "[[I")
    public int[][] field1919;

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "[I")
    public int[] field1932;

    @OriginalMember(owner = "client!eb", name = "F", descriptor = "[Z")
    public boolean[] field1927;

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "Lqd;")
    public static class40 field1920 = class147.method1106("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", (byte) -86);

    @OriginalMember(owner = "client!eb", name = "C", descriptor = "I")
    public static int field1924 = 0;

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "I")
    public static int field1921 = 0;

    @OriginalMember(owner = "client!eb", name = "A", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!eb", name = "E", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!eb", name = "H", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "Lce;")
    public static class239 field1922;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BIII)I", line = 4)
    public static final int method827(byte arg0, int arg1, int arg2, int arg3) {
        field1930++;
        int var4 = -1 % ((arg0 + 2) / 52);
        return arg3 > arg1 ? arg3 : (arg2 < arg1 ? arg2 : arg1);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I[[[Lue;IIIZ)Z", line = 17)
    public static final boolean method828(int arg0, class14[][][] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1923++;
        byte var6 = arg5 ? 1 : (byte) (class55.field1069 & 0xFF);
        if (class255.field4241[class160.field2671][arg4][arg0] == var6) {
            return false;
        } else if ((class274.field4564[class160.field2671][arg4][arg0] & arg2) == 0) {
            return false;
        } else {
            int var7 = 0;
            byte var8 = 0;
            class71.field1266[var8] = arg4;
            int var31 = var8 + 1;
            class308.field5169[var8] = arg0;
            class255.field4241[class160.field2671][arg4][arg0] = var6;
            while (var7 != var31) {
                int var9 = class71.field1266[var7] >> 24 & 0xFF;
                int var10 = class71.field1266[var7] & 0xFFFF;
                int var11 = (class71.field1266[var7] & 0xFFC5AC) >> 16;
                int var12 = class308.field5169[var7] >> 16 & 0xFF;
                boolean var13 = false;
                int var14 = class308.field5169[var7] & 0xFFFF;
                if ((class274.field4564[class160.field2671][var10][var14] & 0x4) == 0) {
                    var13 = true;
                }
                boolean var15 = false;
                var7 = var7 + 1 & 0xFFF;
                label240: for (int var16 = class160.field2671 + 1; var16 <= 3; var16++) {
                    if ((class274.field4564[var16][var10][var14] & 0x8) == 0) {
                        if (var13 && arg1[var16][var10][var14] != null) {
                            if (arg1[var16][var10][var14].field235 != null) {
                                int var17 = class265.method1854(var11, -78);
                                if (arg1[var16][var10][var14].field235.field5067 == var17 || arg1[var16][var10][var14].field235.field5064 == var17) {
                                    continue;
                                }
                                if (var9 != 0) {
                                    int var18 = class265.method1854(var9, -127);
                                    if (arg1[var16][var10][var14].field235.field5067 == var18 || arg1[var16][var10][var14].field235.field5064 == var18) {
                                        continue;
                                    }
                                }
                                if (var12 != 0) {
                                    int var19 = class265.method1854(var12, -77);
                                    if (arg1[var16][var10][var14].field235.field5067 == var19 || arg1[var16][var10][var14].field235.field5064 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg1[var16][var10][var14].field230 != null) {
                                for (int var20 = 0; var20 < arg1[var16][var10][var14].field216; var20++) {
                                    int var21 = (int) (arg1[var16][var10][var14].field230[var20].field3101 >> 14 & 0x3FL);
                                    if (var21 == 21) {
                                        var21 = 19;
                                    }
                                    int var22 = (int) (arg1[var16][var10][var14].field230[var20].field3101 >> 20 & 0x3L);
                                    int var23 = var21 | var22 << 6;
                                    if (var11 == var23 || var9 != 0 && var9 == var23 || var12 != 0 && var12 == var23) {
                                        continue label240;
                                    }
                                }
                            }
                        }
                        class14 var24 = arg1[var16][var10][var14];
                        var15 = true;
                        if (var24 != null && var24.field216 > 0) {
                            for (int var25 = 0; var25 < var24.field216; var25++) {
                                class193 var26 = var24.field230[var25];
                                if (var26.field3112 != var26.field3107 || var26.field3115 != var26.field3108) {
                                    for (int var27 = var26.field3107; var27 <= var26.field3112; var27++) {
                                        for (int var28 = var26.field3108; var28 <= var26.field3115; var28++) {
                                            class255.field4241[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class255.field4241[var16][var10][var14] = var6;
                    }
                }
                if (var15) {
                    int var29 = var10 << 7;
                    if (class130.field2226[arg3] < class78.field1316[class160.field2671 + 1][var10][var14]) {
                        class130.field2226[arg3] = class78.field1316[class160.field2671 + 1][var10][var14];
                    }
                    int var30 = var14 << 7;
                    if (class54.field1053[arg3] > var29) {
                        class54.field1053[arg3] = var29;
                    } else if (class102.field1791[arg3] < var29) {
                        class102.field1791[arg3] = var29;
                    }
                    if (class298.field4984[arg3] > var30) {
                        class298.field4984[arg3] = var30;
                    } else if (class19.field321[arg3] < var30) {
                        class19.field321[arg3] = var30;
                    }
                }
                if (!var13) {
                    if (var10 >= 1 && class255.field4241[class160.field2671][var10 - 1][var14] != var6) {
                        class71.field1266[var31] = class11.method71(class11.method71(var10 - 1, 1179648), -754974720);
                        class308.field5169[var31] = class11.method71(var14, 1245184);
                        var31 = var31 + 1 & 0xFFF;
                        class255.field4241[class160.field2671][var10 - 1][var14] = var6;
                    }
                    var14++;
                    if (var14 < 104) {
                        if (var10 - 1 >= 0 && class255.field4241[class160.field2671][var10 - 1][var14] != var6 && (class274.field4564[class160.field2671][var10][var14] & 0x4) == 0 && (class274.field4564[class160.field2671][var10 - 1][var14 - 1] & 0x4) == 0) {
                            class71.field1266[var31] = class11.method71(class11.method71(var10 - 1, 1179648), 1375731712);
                            class308.field5169[var31] = class11.method71(1245184, var14);
                            var31 = var31 + 1 & 0xFFF;
                            class255.field4241[class160.field2671][var10 - 1][var14] = var6;
                        }
                        if (class255.field4241[class160.field2671][var10][var14] != var6) {
                            class71.field1266[var31] = class11.method71(318767104, class11.method71(var10, 5373952));
                            class308.field5169[var31] = class11.method71(5439488, var14);
                            class255.field4241[class160.field2671][var10][var14] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var10 + 1) < 104 && class255.field4241[class160.field2671][var10 + 1][var14] != var6 && (class274.field4564[class160.field2671][var10][var14] & 0x4) == 0 && (class274.field4564[class160.field2671][var10 + 1][var14 - 1] & 0x4) == 0) {
                            class71.field1266[var31] = class11.method71(class11.method71(5373952, var10 + 1), -1845493760);
                            class308.field5169[var31] = class11.method71(5439488, var14);
                            class255.field4241[class160.field2671][var10 + 1][var14] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                    var14--;
                    if ((var10 + 1) < 104 && class255.field4241[class160.field2671][var10 + 1][var14] != var6) {
                        class71.field1266[var31] = class11.method71(1392508928, class11.method71(9568256, var10 + 1));
                        class308.field5169[var31] = class11.method71(var14, 9633792);
                        class255.field4241[class160.field2671][var10 + 1][var14] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var14--;
                    if (var14 >= 0) {
                        if ((var10 - 1) >= 0 && class255.field4241[class160.field2671][var10 - 1][var14] != var6 && (class274.field4564[class160.field2671][var10][var14] & 0x4) == 0 && (class274.field4564[class160.field2671][var10 - 1][var14 + 1] & 0x4) == 0) {
                            class71.field1266[var31] = class11.method71(301989888, class11.method71(13762560, var10 - 1));
                            class308.field5169[var31] = class11.method71(var14, 13828096);
                            class255.field4241[class160.field2671][var10 - 1][var14] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class255.field4241[class160.field2671][var10][var14] != var6) {
                            class71.field1266[var31] = class11.method71(-1828716544, class11.method71(var10, 13762560));
                            class308.field5169[var31] = class11.method71(var14, 13828096);
                            class255.field4241[class160.field2671][var10][var14] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (var10 + 1 < 104 && class255.field4241[class160.field2671][var10 + 1][var14] != var6 && (class274.field4564[class160.field2671][var10][var14] & 0x4) == 0 && (class274.field4564[class160.field2671][var10 + 1][var14 + 1] & 0x4) == 0) {
                            class71.field1266[var31] = class11.method71(-771751936, class11.method71(var10 + 1, 9568256));
                            class308.field5169[var31] = class11.method71(9633792, var14);
                            var31 = var31 + 1 & 0xFFF;
                            class255.field4241[class160.field2671][var10 + 1][var14] = var6;
                        }
                    }
                }
            }
            if (class130.field2226[arg3] != -1000000) {
                class130.field2226[arg3] += 10;
                class54.field1053[arg3] -= 50;
                class102.field1791[arg3] += 50;
                class19.field321[arg3] += 50;
                class298.field4984[arg3] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V", line = 326)
    public static void method829(int arg0) {
        field1920 = null;
        field1922 = null;
        if (arg0 != 13828096) {
            method827((byte) -102, 30, -26, -78);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLjava/util/Random;I)I", line = 369)
    public static final int method830(byte arg0, Random arg1, int arg2) {
        field1929++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class163.method1238((byte) 107, arg2)) {
            return (int) ((long) arg2 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg2);
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var3 <= var4);
            if (arg0 >= -19) {
                field1920 = (class40) null;
            }
            return class298.method2036(var4, arg2, 20858);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)V", line = 401)
    public static final void method831(int arg0, byte arg1) {
        if (arg1 == -124) {
            field1926++;
            class177 var2 = class177.method1310(arg1 ^ 0xFFFFFFF3, 9, arg0);
            var2.method1303((byte) 94);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IBIIIII)V", line = 417)
    public static final void method832(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1928++;
        if (arg1 > -111) {
            method832(37, (byte) -100, 36, 6, 82, -126, -86);
        }
        int var7 = method827((byte) 72, arg3, class72.field1275, class220.field3664);
        int var8 = method827((byte) 84, arg2, class72.field1275, class220.field3664);
        int var9 = method827((byte) 98, arg5, class48.field941, class125.field2164);
        int var10 = method827((byte) 114, arg0, class48.field941, class125.field2164);
        int var11 = method827((byte) -60, arg3 + arg4, class72.field1275, class220.field3664);
        int var12 = method827((byte) -91, arg2 - arg4, class72.field1275, class220.field3664);
        for (int var13 = var7; var13 < var11; var13++) {
            class150.method1124(var10, var9, arg6, true, class37.field694[var13]);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class150.method1124(var10, var9, arg6, true, class37.field694[var14]);
        }
        int var15 = method827((byte) -101, arg5 + arg4, class48.field941, class125.field2164);
        int var16 = method827((byte) -124, arg0 - arg4, class48.field941, class125.field2164);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class37.field694[var17];
            class150.method1124(var15, var9, arg6, true, var18);
            class150.method1124(var10, var16, arg6, true, var18);
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(I[B)V", line = 470)
    public class110(int arg0, byte[] arg1) {
        this.field1925 = arg0;
        class26 var3 = new class26(arg1);
        this.field1933 = var3.method226(255);
        this.field1919 = new int[this.field1933][];
        this.field1932 = new int[this.field1933];
        this.field1927 = new boolean[this.field1933];
        for (int var4 = 0; var4 < this.field1933; var4++) {
            this.field1932[var4] = var3.method226(255);
        }
        for (int var5 = 0; var5 < this.field1933; var5++) {
            this.field1927[var5] = var3.method226(255) == 1;
        }
        for (int var6 = 0; var6 < this.field1933; var6++) {
            this.field1919[var6] = new int[var3.method226(255)];
        }
        for (int var7 = 0; var7 < this.field1933; var7++) {
            for (int var8 = 0; var8 < this.field1919[var7].length; var8++) {
                this.field1919[var7][var8] = var3.method226(255);
            }
        }
    }
}
