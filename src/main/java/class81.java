import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class81 extends class145 {

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    private int field1460 = -32768;

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "I")
    private int field1472;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
    private int field1458;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "I")
    private int field1466;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    private int field1454;

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
    private int field1469;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    private int field1457;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "Lk;")
    private class109 field1459;

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "I")
    private int field1474;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
    private int field1463;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "[I")
    public static int[] field1455 = new int[100];

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
    public static int field1467 = 0;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "Li;")
    public static class88 field1468 = class208.method1425(105, "");

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "J")
    public static long field1456;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "()I")
    public final int method88() {
        field1471++;
        return this.field1460;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)Lnc;")
    private final class145 method536(int arg0) {
        boolean var2 = class62.field1137 != class145.field2723;
        field1470++;
        class148 var3 = class190.method1323(this.field1472, -12450);
        if (var3.field2772 != null) {
            var3 = var3.method1000((byte) -59);
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field1458 == 1 || this.field1458 == 3) {
            var5 = var3.field2776;
            var4 = var3.field2796;
        } else {
            var4 = var3.field2776;
            var5 = var3.field2796;
        }
        int var6 = (var4 + 1 >> 1) + this.field1457;
        int var7 = (var4 >> 1) + this.field1457;
        int var8 = this.field1454 + (var5 >> 1);
        int var9 = (var5 + 1 >> 1) + this.field1454;
        this.method537(50, var7 * 128, var8 * 128);
        int[][] var10 = class62.field1137[this.field1466];
        int var11 = var10[var6][var9] + var10[var7][var9] + var10[var7][var8] + var10[var6][var8] >> 2;
        int var12 = (this.field1457 << 7) + (var4 << 6);
        int var13 = -96 % ((arg0 - 66) / 52);
        int[][] var14 = null;
        int var15 = (this.field1454 << 7) + (var5 << 6);
        if (var2) {
            var14 = class145.field2723[0];
        } else if (this.field1466 < 3) {
            var14 = class62.field1137[this.field1466 + 1];
        }
        class210 var16;
        if (this.field1459 == null) {
            var16 = var3.method999(this.field1469, var14, var10, var12, false, var15, this.field1458, var11, -21737);
        } else {
            var16 = var3.method1006((byte) 127, var11, var12, this.field1469, var15, this.field1474, this.field1459, var10, var14, this.field1458);
        }
        return var16 == null ? null : var16.field3986;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1465++;
        class145 var11 = this.method536(122);
        if (var11 != null) {
            var11.method87(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1460 = var11.method88();
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(III)V")
    public final void method537(int arg0, int arg1, int arg2) {
        field1462++;
        if (this.field1459 != null) {
            int var4 = class117.field2115 - this.field1463;
            if (var4 > 100 && this.field1459.field1974 > 0) {
                int var5 = this.field1459.field1967.length - this.field1459.field1974;
                while (this.field1474 < var5 && var4 > this.field1459.field1992[this.field1474]) {
                    var4 -= this.field1459.field1992[this.field1474];
                    this.field1474++;
                }
                if (var5 <= this.field1474) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field1459.field1967.length; var7++) {
                        var6 += this.field1459.field1992[var7];
                    }
                    var4 %= var6;
                }
            }
            label62: {
                do {
                    do {
                        if (var4 <= this.field1459.field1992[this.field1474]) {
                            break label62;
                        }
                        class60.method433(-118, false, arg2, this.field1474, arg1, this.field1459);
                        var4 -= this.field1459.field1992[this.field1474];
                        this.field1474++;
                    } while (this.field1459.field1967.length > this.field1474);
                    this.field1474 -= this.field1459.field1974;
                } while (this.field1474 >= 0 && this.field1459.field1967.length > this.field1474);
                this.field1459 = null;
            }
            this.field1463 = class117.field2115 - var4;
        }
        if (arg0 != 50) {
            this.field1458 = -56;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lea;I)Lsg;")
    public static final class203 method538(class46 arg0, int arg1) {
        if (arg1 >= -14) {
            field1455 = null;
        }
        field1461++;
        return new class203(arg0.method334((byte) -73), arg0.method334((byte) -73), arg0.method334((byte) -73), arg0.method334((byte) -73), arg0.method304(-29629), arg0.method347(26119));
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
    public static void method539(boolean arg0) {
        field1468 = null;
        if (!arg0) {
            method540(null, -29, -79, null);
        }
        field1455 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lbj;IILud;)V")
    public static final void method540(class22 arg0, int arg1, int arg2, class222 arg3) {
        field1464++;
        byte[] var4 = null;
        class248 var5 = class227.field4254;
        synchronized (class227.field4254) {
            for (class90 var6 = (class90) class227.field4254.method1612(false); var6 != null; var6 = (class90) class227.field4254.method1621(82)) {
                if ((long) arg1 == var6.field1219 && var6.field1714 == arg3 && var6.field1702 == 0) {
                    var4 = var6.field1706;
                    break;
                }
            }
        }
        if (var4 != null) {
            arg0.method111(var4, arg1, arg3, (byte) -95, true);
        } else if (arg2 == 0) {
            byte[] var7 = arg3.method1499(arg1, (byte) -116);
            arg0.method111(var7, arg1, arg3, (byte) -127, true);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([BBI)I")
    public static final int method541(byte[] arg0, byte arg1, int arg2) {
        field1473++;
        int var3 = 84 % ((-arg1 - 4) / 61);
        return class231.method1544((byte) 1, 0, arg0, arg2);
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IIIIIIIZLnc;)V")
    public class81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class145 arg8) {
        this.field1472 = arg0;
        this.field1458 = arg2;
        this.field1466 = arg3;
        this.field1454 = arg5;
        this.field1469 = arg1;
        this.field1457 = arg4;
        if (arg6 != -1) {
            this.field1459 = class15.method75(arg6, (byte) 49);
            this.field1474 = 0;
            this.field1463 = class117.field2115 - 1;
            if (this.field1459.field1968 == 0 && arg8 != null && arg8 instanceof class81) {
                class81 var10 = (class81) arg8;
                if (this.field1459 == var10.field1459) {
                    this.field1474 = var10.field1474;
                    this.field1463 = var10.field1463;
                    return;
                }
            }
            if (arg7 && this.field1459.field1974 != -1) {
                this.field1474 = (int) ((double) this.field1459.field1967.length * Math.random());
                this.field1463 -= (int) (Math.random() * (double) this.field1459.field1992[this.field1474]);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Leg;Z)V")
    public static final void method542(class52 arg0, boolean arg1) {
        class105.field1902.method1624(arg0, 109);
        while (true) {
            class52 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class52[][] var7;
            class52 var65;
            do {
                class52 var64;
                do {
                    class52 var63;
                    do {
                        class52 var62;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class52) class105.field1902.method1615(-102);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field965);
                                            var3 = var2.field961;
                                            var4 = var2.field945;
                                            var5 = var2.field966;
                                            var6 = var2.field960;
                                            var7 = class29.field489[var5];
                                            if (!var2.field944) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class52 var8 = class29.field489[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field965) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class79.field1435 && var3 > class156.field3009) {
                                                    class52 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field965 && (var9.field944 || (var2.field954 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class79.field1435 && var3 < class6.field84 - 1) {
                                                    class52 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field965 && (var10.field944 || (var2.field954 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class88.field1636 && var4 > class102.field1851) {
                                                    class52 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field965 && (var11.field944 || (var2.field954 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class88.field1636 && var4 < class230.field4316 - 1) {
                                                    class52 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field965 && (var12.field944 || (var2.field954 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field944 = false;
                                            if (var2.field951 != null) {
                                                class52 var13 = var2.field951;
                                                if (var13.field947 == null) {
                                                    if (var13.field964 != null) {
                                                        if (class239.method1583(0, var3, var4)) {
                                                            class156.method1062(var13.field964, class99.field1805, class201.field3840, class168.field3244, class159.field3068, var3, var4, true);
                                                        } else {
                                                            class156.method1062(var13.field964, class99.field1805, class201.field3840, class168.field3244, class159.field3068, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class239.method1583(0, var3, var4)) {
                                                    class55.method411(var13.field947, 0, class99.field1805, class201.field3840, class168.field3244, class159.field3068, var3, var4, true);
                                                } else {
                                                    class55.method411(var13.field947, 0, class99.field1805, class201.field3840, class168.field3244, class159.field3068, var3, var4, false);
                                                }
                                                class157 var14 = var13.field959;
                                                if (var14 != null) {
                                                    var14.field3023.method87(0, class99.field1805, class201.field3840, class168.field3244, class159.field3068, var14.field3031 - class74.field1353, var14.field3033 - class241.field4463, var14.field3025 - class216.field4050, var14.field3030);
                                                }
                                                for (int var15 = 0; var15 < var13.field962; var15++) {
                                                    class108 var16 = var13.field963[var15];
                                                    if (var16 != null) {
                                                        var16.field1945.method87(var16.field1941, class99.field1805, class201.field3840, class168.field3244, class159.field3068, var16.field1947 - class74.field1353, var16.field1940 - class241.field4463, var16.field1951 - class216.field4050, var16.field1950);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field947 == null) {
                                                if (var2.field964 != null) {
                                                    if (class239.method1583(var6, var3, var4)) {
                                                        class156.method1062(var2.field964, class99.field1805, class201.field3840, class168.field3244, class159.field3068, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class156.method1062(var2.field964, class99.field1805, class201.field3840, class168.field3244, class159.field3068, var3, var4, false);
                                                    }
                                                }
                                            } else if (class239.method1583(var6, var3, var4)) {
                                                class55.method411(var2.field947, var6, class99.field1805, class201.field3840, class168.field3244, class159.field3068, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field947.field1767 != 12345678 || class118.field2147 && var5 <= class133.field2486) {
                                                    class55.method411(var2.field947, var6, class99.field1805, class201.field3840, class168.field3244, class159.field3068, var3, var4, false);
                                                }
                                            }
                                            int var18 = 0;
                                            int var19 = 0;
                                            class157 var20 = var2.field959;
                                            class64 var21 = var2.field956;
                                            if (var20 != null || var21 != null) {
                                                if (class79.field1435 == var3) {
                                                    var18++;
                                                } else if (class79.field1435 < var3) {
                                                    var18 += 2;
                                                }
                                                if (class88.field1636 == var4) {
                                                    var18 += 3;
                                                } else if (class88.field1636 > var4) {
                                                    var18 += 6;
                                                }
                                                var19 = class110.field2007[var18];
                                                var2.field952 = class229.field4287[var18];
                                            }
                                            if (var20 != null) {
                                                if ((var20.field3029 & class97.field1791[var18]) == 0) {
                                                    var2.field953 = 0;
                                                } else if (var20.field3029 == 16) {
                                                    var2.field953 = 3;
                                                    var2.field946 = class53.field1001[var18];
                                                    var2.field955 = 3 - var2.field946;
                                                } else if (var20.field3029 == 32) {
                                                    var2.field953 = 6;
                                                    var2.field946 = class220.field4152[var18];
                                                    var2.field955 = 6 - var2.field946;
                                                } else if (var20.field3029 == 64) {
                                                    var2.field953 = 12;
                                                    var2.field946 = class103.field1871[var18];
                                                    var2.field955 = 12 - var2.field946;
                                                } else {
                                                    var2.field953 = 9;
                                                    var2.field946 = class48.field904[var18];
                                                    var2.field955 = 9 - var2.field946;
                                                }
                                                if ((var20.field3029 & var19) != 0 && !class144.method947(var6, var3, var4, var20.field3029)) {
                                                    var20.field3023.method87(0, class99.field1805, class201.field3840, class168.field3244, class159.field3068, var20.field3031 - class74.field1353, var20.field3033 - class241.field4463, var20.field3025 - class216.field4050, var20.field3030);
                                                }
                                                if ((var20.field3026 & var19) != 0 && !class144.method947(var6, var3, var4, var20.field3026)) {
                                                    var20.field3034.method87(0, class99.field1805, class201.field3840, class168.field3244, class159.field3068, var20.field3031 - class74.field1353, var20.field3033 - class241.field4463, var20.field3025 - class216.field4050, var20.field3030);
                                                }
                                            }
                                            if (var21 != null && !class189.method1322(var6, var3, var4, var21.field1159.method88())) {
                                                if ((var21.field1164 & var19) != 0) {
                                                    var21.field1159.method87(0, class99.field1805, class201.field3840, class168.field3244, class159.field3068, var21.field1157 + var21.field1169 - class74.field1353, var21.field1168 - class241.field4463, var21.field1161 + var21.field1167 - class216.field4050, var21.field1158);
                                                } else if (var21.field1164 == 256) {
                                                    int var22 = var21.field1157 - class74.field1353;
                                                    int var23 = var21.field1168 - class241.field4463;
                                                    int var24 = var21.field1161 - class216.field4050;
                                                    int var25 = var21.field1172;
                                                    int var26;
                                                    if (var25 == 1 || var25 == 2) {
                                                        var26 = -var22;
                                                    } else {
                                                        var26 = var22;
                                                    }
                                                    int var27;
                                                    if (var25 == 2 || var25 == 3) {
                                                        var27 = -var24;
                                                    } else {
                                                        var27 = var24;
                                                    }
                                                    if (var27 < var26) {
                                                        var21.field1159.method87(0, class99.field1805, class201.field3840, class168.field3244, class159.field3068, var21.field1169 + var22, var23, var21.field1167 + var24, var21.field1158);
                                                    } else if (var21.field1160 != null) {
                                                        var21.field1160.method87(0, class99.field1805, class201.field3840, class168.field3244, class159.field3068, var22, var23, var24, var21.field1158);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class166 var28 = var2.field949;
                                                if (var28 != null) {
                                                    var28.field3196.method87(0, class99.field1805, class201.field3840, class168.field3244, class159.field3068, var28.field3199 - class74.field1353, var28.field3195 - class241.field4463, var28.field3192 - class216.field4050, var28.field3204);
                                                }
                                                class239 var29 = var2.field948;
                                                if (var29 != null && var29.field4437 == 0) {
                                                    if (var29.field4448 != null) {
                                                        var29.field4448.method87(0, class99.field1805, class201.field3840, class168.field3244, class159.field3068, var29.field4453 - class74.field1353, var29.field4446 - class241.field4463, var29.field4441 - class216.field4050, var29.field4442);
                                                    }
                                                    if (var29.field4450 != null) {
                                                        var29.field4450.method87(0, class99.field1805, class201.field3840, class168.field3244, class159.field3068, var29.field4453 - class74.field1353, var29.field4446 - class241.field4463, var29.field4441 - class216.field4050, var29.field4442);
                                                    }
                                                    if (var29.field4445 != null) {
                                                        var29.field4445.method87(0, class99.field1805, class201.field3840, class168.field3244, class159.field3068, var29.field4453 - class74.field1353, var29.field4446 - class241.field4463, var29.field4441 - class216.field4050, var29.field4442);
                                                    }
                                                }
                                            }
                                            int var30 = var2.field954;
                                            if (var30 != 0) {
                                                if (var3 < class79.field1435 && (var30 & 0x4) != 0) {
                                                    class52 var31 = var7[var3 + 1][var4];
                                                    if (var31 != null && var31.field965) {
                                                        class105.field1902.method1624(var31, 61);
                                                    }
                                                }
                                                if (var4 < class88.field1636 && (var30 & 0x2) != 0) {
                                                    class52 var32 = var7[var3][var4 + 1];
                                                    if (var32 != null && var32.field965) {
                                                        class105.field1902.method1624(var32, 61);
                                                    }
                                                }
                                                if (var3 > class79.field1435 && (var30 & 0x1) != 0) {
                                                    class52 var33 = var7[var3 - 1][var4];
                                                    if (var33 != null && var33.field965) {
                                                        class105.field1902.method1624(var33, 40);
                                                    }
                                                }
                                                if (var4 > class88.field1636 && (var30 & 0x8) != 0) {
                                                    class52 var34 = var7[var3][var4 - 1];
                                                    if (var34 != null && var34.field965) {
                                                        class105.field1902.method1624(var34, 72);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field953 != 0) {
                                            boolean var35 = true;
                                            for (int var36 = 0; var36 < var2.field962; var36++) {
                                                if (class143.field2629 != var2.field963[var36].field1936 && (var2.field957[var36] & var2.field953) == var2.field946) {
                                                    var35 = false;
                                                    break;
                                                }
                                            }
                                            if (var35) {
                                                class157 var37 = var2.field959;
                                                if (!class144.method947(var6, var3, var4, var37.field3029)) {
                                                    var37.field3023.method87(0, class99.field1805, class201.field3840, class168.field3244, class159.field3068, var37.field3031 - class74.field1353, var37.field3033 - class241.field4463, var37.field3025 - class216.field4050, var37.field3030);
                                                }
                                                var2.field953 = 0;
                                            }
                                        }
                                        if (!var2.field958) {
                                            break;
                                        }
                                        try {
                                            int var38 = var2.field962;
                                            var2.field958 = false;
                                            int var39 = 0;
                                            label562: for (int var40 = 0; var40 < var38; var40++) {
                                                class108 var41 = var2.field963[var40];
                                                if (class143.field2629 != var41.field1936) {
                                                    for (int var42 = var41.field1935; var42 <= var41.field1942; var42++) {
                                                        for (int var43 = var41.field1938; var43 <= var41.field1937; var43++) {
                                                            class52 var44 = var7[var42][var43];
                                                            if (var44.field944) {
                                                                var2.field958 = true;
                                                                continue label562;
                                                            }
                                                            if (var44.field953 != 0) {
                                                                int var45 = 0;
                                                                if (var42 > var41.field1935) {
                                                                    var45++;
                                                                }
                                                                if (var42 < var41.field1942) {
                                                                    var45 += 4;
                                                                }
                                                                if (var43 > var41.field1938) {
                                                                    var45 += 8;
                                                                }
                                                                if (var43 < var41.field1937) {
                                                                    var45 += 2;
                                                                }
                                                                if ((var45 & var44.field953) == var2.field955) {
                                                                    var2.field958 = true;
                                                                    continue label562;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class239.field4449[var39++] = var41;
                                                    int var46 = class79.field1435 - var41.field1935;
                                                    int var47 = var41.field1942 - class79.field1435;
                                                    if (var47 > var46) {
                                                        var46 = var47;
                                                    }
                                                    int var48 = class88.field1636 - var41.field1938;
                                                    int var49 = var41.field1937 - class88.field1636;
                                                    if (var49 > var48) {
                                                        var41.field1952 = var46 + var49;
                                                    } else {
                                                        var41.field1952 = var46 + var48;
                                                    }
                                                }
                                            }
                                            while (var39 > 0) {
                                                int var50 = -50;
                                                int var51 = -1;
                                                for (int var52 = 0; var52 < var39; var52++) {
                                                    class108 var53 = class239.field4449[var52];
                                                    if (class143.field2629 != var53.field1936) {
                                                        if (var53.field1952 > var50) {
                                                            var50 = var53.field1952;
                                                            var51 = var52;
                                                        } else if (var53.field1952 == var50) {
                                                            int var54 = var53.field1947 - class74.field1353;
                                                            int var55 = var53.field1951 - class216.field4050;
                                                            int var56 = class239.field4449[var51].field1947 - class74.field1353;
                                                            int var57 = class239.field4449[var51].field1951 - class216.field4050;
                                                            if (var54 * var54 + var55 * var55 > var56 * var56 + var57 * var57) {
                                                                var51 = var52;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var51 == -1) {
                                                    break;
                                                }
                                                class108 var58 = class239.field4449[var51];
                                                var58.field1936 = class143.field2629;
                                                if (!client.method224(var6, var58.field1935, var58.field1942, var58.field1938, var58.field1937, var58.field1945.method88())) {
                                                    var58.field1945.method87(var58.field1941, class99.field1805, class201.field3840, class168.field3244, class159.field3068, var58.field1947 - class74.field1353, var58.field1940 - class241.field4463, var58.field1951 - class216.field4050, var58.field1950);
                                                }
                                                for (int var59 = var58.field1935; var59 <= var58.field1942; var59++) {
                                                    for (int var60 = var58.field1938; var60 <= var58.field1937; var60++) {
                                                        class52 var61 = var7[var59][var60];
                                                        if (var61.field953 != 0) {
                                                            class105.field1902.method1624(var61, 95);
                                                        } else if ((var3 != var59 || var4 != var60) && var61.field965) {
                                                            class105.field1902.method1624(var61, 117);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field958) {
                                                break;
                                            }
                                        } catch (Exception var80) {
                                            var2.field958 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field965);
                            } while (var2.field953 != 0);
                            if (var3 > class79.field1435 || var3 <= class156.field3009) {
                                break;
                            }
                            var62 = var7[var3 - 1][var4];
                        } while (var62 != null && var62.field965);
                        if (var3 < class79.field1435 || var3 >= class6.field84 - 1) {
                            break;
                        }
                        var63 = var7[var3 + 1][var4];
                    } while (var63 != null && var63.field965);
                    if (var4 > class88.field1636 || var4 <= class102.field1851) {
                        break;
                    }
                    var64 = var7[var3][var4 - 1];
                } while (var64 != null && var64.field965);
                if (var4 < class88.field1636 || var4 >= class230.field4316 - 1) {
                    break;
                }
                var65 = var7[var3][var4 + 1];
            } while (var65 != null && var65.field965);
            var2.field965 = false;
            class176.field3547--;
            class239 var66 = var2.field948;
            if (var66 != null && var66.field4437 != 0) {
                if (var66.field4448 != null) {
                    var66.field4448.method87(0, class99.field1805, class201.field3840, class168.field3244, class159.field3068, var66.field4453 - class74.field1353, var66.field4446 - class241.field4463 - var66.field4437, var66.field4441 - class216.field4050, var66.field4442);
                }
                if (var66.field4450 != null) {
                    var66.field4450.method87(0, class99.field1805, class201.field3840, class168.field3244, class159.field3068, var66.field4453 - class74.field1353, var66.field4446 - class241.field4463 - var66.field4437, var66.field4441 - class216.field4050, var66.field4442);
                }
                if (var66.field4445 != null) {
                    var66.field4445.method87(0, class99.field1805, class201.field3840, class168.field3244, class159.field3068, var66.field4453 - class74.field1353, var66.field4446 - class241.field4463 - var66.field4437, var66.field4441 - class216.field4050, var66.field4442);
                }
            }
            if (var2.field952 != 0) {
                class64 var67 = var2.field956;
                if (var67 != null && !class189.method1322(var6, var3, var4, var67.field1159.method88())) {
                    if ((var67.field1164 & var2.field952) != 0) {
                        var67.field1159.method87(0, class99.field1805, class201.field3840, class168.field3244, class159.field3068, var67.field1157 + var67.field1169 - class74.field1353, var67.field1168 - class241.field4463, var67.field1161 + var67.field1167 - class216.field4050, var67.field1158);
                    } else if (var67.field1164 == 256) {
                        int var68 = var67.field1157 - class74.field1353;
                        int var69 = var67.field1168 - class241.field4463;
                        int var70 = var67.field1161 - class216.field4050;
                        int var71 = var67.field1172;
                        int var72;
                        if (var71 == 1 || var71 == 2) {
                            var72 = -var68;
                        } else {
                            var72 = var68;
                        }
                        int var73;
                        if (var71 == 2 || var71 == 3) {
                            var73 = -var70;
                        } else {
                            var73 = var70;
                        }
                        if (var73 >= var72) {
                            var67.field1159.method87(0, class99.field1805, class201.field3840, class168.field3244, class159.field3068, var67.field1169 + var68, var69, var67.field1167 + var70, var67.field1158);
                        } else if (var67.field1160 != null) {
                            var67.field1160.method87(0, class99.field1805, class201.field3840, class168.field3244, class159.field3068, var68, var69, var70, var67.field1158);
                        }
                    }
                }
                class157 var74 = var2.field959;
                if (var74 != null) {
                    if ((var74.field3026 & var2.field952) != 0 && !class144.method947(var6, var3, var4, var74.field3026)) {
                        var74.field3034.method87(0, class99.field1805, class201.field3840, class168.field3244, class159.field3068, var74.field3031 - class74.field1353, var74.field3033 - class241.field4463, var74.field3025 - class216.field4050, var74.field3030);
                    }
                    if ((var74.field3029 & var2.field952) != 0 && !class144.method947(var6, var3, var4, var74.field3029)) {
                        var74.field3023.method87(0, class99.field1805, class201.field3840, class168.field3244, class159.field3068, var74.field3031 - class74.field1353, var74.field3033 - class241.field4463, var74.field3025 - class216.field4050, var74.field3030);
                    }
                }
            }
            if (var5 < class11.field152 - 1) {
                class52 var75 = class29.field489[var5 + 1][var3][var4];
                if (var75 != null && var75.field965) {
                    class105.field1902.method1624(var75, 88);
                }
            }
            if (var3 < class79.field1435) {
                class52 var76 = var7[var3 + 1][var4];
                if (var76 != null && var76.field965) {
                    class105.field1902.method1624(var76, 55);
                }
            }
            if (var4 < class88.field1636) {
                class52 var77 = var7[var3][var4 + 1];
                if (var77 != null && var77.field965) {
                    class105.field1902.method1624(var77, 65);
                }
            }
            if (var3 > class79.field1435) {
                class52 var78 = var7[var3 - 1][var4];
                if (var78 != null && var78.field965) {
                    class105.field1902.method1624(var78, 66);
                }
            }
            if (var4 > class88.field1636) {
                class52 var79 = var7[var3][var4 - 1];
                if (var79 != null && var79.field965) {
                    class105.field1902.method1624(var79, 74);
                }
            }
        }
    }
}
