import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class328 {

    @OriginalMember(owner = "client!of", name = "p", descriptor = "Lem;")
    private class434 field5150 = new class434();

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    private int field5145;

    @OriginalMember(owner = "client!of", name = "y", descriptor = "I")
    private int field5159;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "Lru;")
    private class177 field5152;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "Z")
    public static boolean field5147 = false;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "Lru;")
    public static class177 field5157 = new class177(64);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!of", name = "v", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!of", name = "x", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "Z")
    public static boolean field5138;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)I")
    public final int method2186(int arg0) {
        field5140++;
        int var2 = arg0;
        for (class122 var3 = (class122) this.field5150.method2732(arg0 + 34); var3 != null; var3 = (class122) this.field5150.method2729(92)) {
            if (!var3.method769(99)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
    public final void method2187(int arg0) {
        field5154++;
        if (arg0 != -1) {
            field5147 = true;
        }
        for (class122 var2 = (class122) this.field5150.method2732(arg0 ^ 0xFFFFFFDD); var2 != null; var2 = (class122) this.field5150.method2729(arg0 ^ 0xFFFFFF84)) {
            if (var2.method769(125)) {
                var2.method3149(86);
                var2.method2219(0);
                this.field5145 += var2.field1658;
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IJLjava/lang/Object;)V")
    public final void method2188(int arg0, long arg1, Object arg2) {
        if (arg0 > -121) {
            method2193(112, 42);
        }
        field5135++;
        this.method2199((byte) 121, 1, arg2, arg1);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
    public final void method2189(boolean arg0) {
        this.field5150.method2730(0);
        field5155++;
        if (arg0) {
            this.method2189(false);
        }
        this.field5152.method1128(123);
        this.field5145 = this.field5159;
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public final Object method2190(int arg0) {
        if (arg0 != -15680) {
            this.method2187(-18);
        }
        field5137++;
        class122 var2 = (class122) this.field5152.method1119(false);
        while (var2 != null) {
            Object var3 = var2.method768((byte) -96);
            if (var3 != null) {
                return var3;
            }
            class122 var4 = var2;
            var2 = (class122) this.field5152.method1121((byte) 126);
            var4.method3149(64);
            var4.method2219(0);
            this.field5145 += var2.field1658;
        }
        return null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
    public final Object method2191(byte arg0, long arg1) {
        if (arg0 != -73) {
            return null;
        }
        field5151++;
        class122 var4 = (class122) this.field5152.method1122((byte) 59, arg1);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method768((byte) -125);
        if (var5 == null) {
            var4.method3149(arg0 ^ 0xFFFFFFE0);
            var4.method2219(0);
            this.field5145 += var4.field1658;
            return null;
        }
        if (var4.method769(87)) {
            class523 var6 = new class523(var5, var4.field1658);
            this.field5152.method1127(var6, (byte) 37, var4.field7780);
            this.field5150.method2731(var6, (byte) 49);
            var6.field5226 = 0L;
            var4.method3149(55);
            var4.method2219(0);
        } else {
            this.field5150.method2731(var4, (byte) 49);
            var4.field5226 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILcr;)V")
    private final void method2192(int arg0, class122 arg1) {
        field5141++;
        if (arg1 != null) {
            arg1.method3149(48);
            arg1.method2219(0);
            this.field5145 += arg1.field1658;
        }
        if (arg0 <= 126) {
            this.method2189(true);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)I")
    public static final int method2193(int arg0, int arg1) {
        field5143++;
        double var2 = (double) ((arg0 & 0xFF1675) >> 16) / 256.0D;
        double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 & arg1) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return ((var20 & 0xFF) >> 2 << 10) + (var21 >> 5 << 7) + (var22 >> 1);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BLkj;)V")
    public static final void method2194(byte arg0, class55 arg1) {
        arg1.field851 = 0;
        if (arg0 != -68) {
            return;
        }
        field5153++;
        if (arg1.field837 != -1) {
            class363 var2 = class388.field5915.method1703(arg1.field837, -12536);
            if (var2 == null || var2.field5623 == null) {
                arg1.field822 = false;
                arg1.field837 = -1;
            } else {
                label401: {
                    arg1.field815++;
                    if (var2.field5623.length > arg1.field883 && arg1.field815 > var2.field5599[arg1.field883]) {
                        arg1.field883++;
                        arg1.field831++;
                        arg1.field815 = 1;
                        class35.method217((byte) -44, class358.field5565 == arg1, arg1.field883, var2, arg1.field6417, arg1.field6410, arg1.field6419);
                    }
                    if (arg1.field883 >= var2.field5623.length) {
                        arg1.field815 = 0;
                        arg1.field883 = 0;
                        if (arg1.field822) {
                            arg1.field837 = arg1.method418((byte) -41).method1950((byte) 106);
                            if (arg1.field837 == -1) {
                                arg1.field822 = false;
                                break label401;
                            }
                            var2 = class388.field5915.method1703(arg1.field837, -12536);
                        }
                        class35.method217((byte) -44, class358.field5565 == arg1, arg1.field883, var2, arg1.field6417, arg1.field6410, arg1.field6419);
                    }
                    arg1.field831 = arg1.field883 + 1;
                    if (arg1.field831 >= var2.field5623.length) {
                        arg1.field831 = 0;
                    }
                }
            }
        }
        if (arg1.field844 != -1 && arg1.field813 <= class88.field1278) {
            class279 var3 = class85.field1242.method1972((byte) -58, arg1.field844);
            int var4 = var3.field4398;
            if (var4 == -1) {
                arg1.field844 = -1;
            } else {
                label403: {
                    class363 var5 = class388.field5915.method1703(var4, arg0 - 12468);
                    if (var3.field4419) {
                        if (var5.field5622 == 3) {
                            if (arg1.field893 > 0 && class88.field1278 >= arg1.field796 && arg1.field846 < class88.field1278) {
                                arg1.field844 = -1;
                                break label403;
                            }
                        } else if (var5.field5622 == 1 && arg1.field893 > 0 && class88.field1278 >= arg1.field796 && arg1.field846 < class88.field1278) {
                            arg1.field813 = class88.field1278 + 1;
                            break label403;
                        }
                    }
                    if (var5 == null || var5.field5623 == null) {
                        arg1.field844 = -1;
                    } else {
                        if (arg1.field876 < 0) {
                            arg1.field876 = 0;
                            class35.method217((byte) -44, class358.field5565 == arg1, 0, var5, arg1.field6417, arg1.field6410, arg1.field6419);
                        }
                        arg1.field863++;
                        if (arg1.field876 < var5.field5623.length && var5.field5599[arg1.field876] < arg1.field863) {
                            arg1.field863 = 1;
                            arg1.field876++;
                            class35.method217((byte) -44, class358.field5565 == arg1, arg1.field876, var5, arg1.field6417, arg1.field6410, arg1.field6419);
                        }
                        if (arg1.field876 >= var5.field5623.length) {
                            if (var3.field4419) {
                                arg1.field876 -= var5.field5617;
                                arg1.field884++;
                                if (arg1.field884 >= var5.field5602) {
                                    arg1.field844 = -1;
                                } else if (arg1.field876 >= 0 && var5.field5623.length > arg1.field876) {
                                    class35.method217((byte) -44, class358.field5565 == arg1, arg1.field876, var5, arg1.field6417, arg1.field6410, arg1.field6419);
                                } else {
                                    arg1.field844 = -1;
                                }
                            } else {
                                arg1.field844 = -1;
                            }
                        }
                        arg1.field885 = arg1.field876 + 1;
                        if (arg1.field885 >= var5.field5623.length) {
                            if (var3.field4419) {
                                arg1.field885 -= var5.field5617;
                                if (var5.field5602 <= (arg1.field884 + 1)) {
                                    arg1.field885 = -1;
                                } else if (arg1.field885 < 0 || arg1.field885 >= var5.field5623.length) {
                                    arg1.field885 = -1;
                                }
                            } else {
                                arg1.field885 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field800 != -1 && class88.field1278 >= arg1.field832) {
            class279 var6 = class85.field1242.method1972((byte) -58, arg1.field800);
            int var7 = var6.field4398;
            if (var7 == -1) {
                arg1.field800 = -1;
            } else {
                label406: {
                    class363 var8 = class388.field5915.method1703(var7, -12536);
                    if (var6.field4419) {
                        if (var8.field5622 == 3) {
                            if (arg1.field893 > 0 && class88.field1278 >= arg1.field796 && class88.field1278 > arg1.field846) {
                                arg1.field800 = -1;
                                break label406;
                            }
                        } else if (var8.field5622 == 1 && arg1.field893 > 0 && arg1.field796 <= class88.field1278 && class88.field1278 > arg1.field846) {
                            arg1.field832 = class88.field1278 + 1;
                            break label406;
                        }
                    }
                    if (var8 == null || var8.field5623 == null) {
                        arg1.field800 = -1;
                    } else {
                        if (arg1.field858 < 0) {
                            arg1.field858 = 0;
                            class35.method217((byte) -44, class358.field5565 == arg1, 0, var8, arg1.field6417, arg1.field6410, arg1.field6419);
                        }
                        arg1.field828++;
                        if (var8.field5623.length > arg1.field858 && arg1.field828 > var8.field5599[arg1.field858]) {
                            arg1.field828 = 1;
                            arg1.field858++;
                            class35.method217((byte) -44, class358.field5565 == arg1, arg1.field858, var8, arg1.field6417, arg1.field6410, arg1.field6419);
                        }
                        if (var8.field5623.length <= arg1.field858) {
                            if (var6.field4419) {
                                arg1.field825++;
                                arg1.field858 -= var8.field5617;
                                if (var8.field5602 <= arg1.field825) {
                                    arg1.field800 = -1;
                                } else if (arg1.field858 >= 0 && var8.field5623.length > arg1.field858) {
                                    class35.method217((byte) -44, class358.field5565 == arg1, arg1.field858, var8, arg1.field6417, arg1.field6410, arg1.field6419);
                                } else {
                                    arg1.field800 = -1;
                                }
                            } else {
                                arg1.field800 = -1;
                            }
                        }
                        arg1.field841 = arg1.field858 + 1;
                        if (arg1.field841 >= var8.field5623.length) {
                            if (var6.field4419) {
                                arg1.field841 -= var8.field5617;
                                if (arg1.field825 + 1 >= var8.field5602) {
                                    arg1.field841 = -1;
                                } else if (arg1.field841 < 0 || var8.field5623.length <= arg1.field841) {
                                    arg1.field841 = -1;
                                }
                            } else {
                                arg1.field841 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field840 != -1 && arg1.field836 <= 1) {
            class363 var9 = class388.field5915.method1703(arg1.field840, -12536);
            if (var9.field5622 == 3) {
                if (arg1.field893 > 0 && arg1.field796 <= class88.field1278 && class88.field1278 > arg1.field846) {
                    arg1.field840 = -1;
                }
            } else if (var9.field5622 == 1 && arg1.field893 > 0 && arg1.field796 <= class88.field1278 && class88.field1278 > arg1.field846) {
                arg1.field836 = 2;
            }
        }
        if (arg1.field840 != -1 && arg1.field836 == 0) {
            class363 var10 = class388.field5915.method1703(arg1.field840, -12536);
            if (var10 == null || var10.field5623 == null) {
                arg1.field840 = -1;
            } else {
                arg1.field826++;
                if (var10.field5623.length > arg1.field875 && arg1.field826 > var10.field5599[arg1.field875]) {
                    arg1.field875++;
                    arg1.field826 = 1;
                    class35.method217((byte) -44, class358.field5565 == arg1, arg1.field875, var10, arg1.field6417, arg1.field6410, arg1.field6419);
                }
                if (var10.field5623.length <= arg1.field875) {
                    arg1.field875 -= var10.field5617;
                    arg1.field804++;
                    if (var10.field5602 <= arg1.field804) {
                        arg1.field840 = -1;
                    } else if (arg1.field875 >= 0 && arg1.field875 < var10.field5623.length) {
                        class35.method217((byte) -44, class358.field5565 == arg1, arg1.field875, var10, arg1.field6417, arg1.field6410, arg1.field6419);
                    } else {
                        arg1.field840 = -1;
                    }
                }
                arg1.field886 = arg1.field875 + 1;
                if (var10.field5623.length <= arg1.field886) {
                    arg1.field886 -= var10.field5617;
                    if (var10.field5602 <= (arg1.field804 + 1)) {
                        arg1.field886 = -1;
                    } else if (arg1.field886 < 0 || arg1.field886 >= var10.field5623.length) {
                        arg1.field886 = -1;
                    }
                }
                arg1.field851 = var10.field5601;
            }
        }
        if (arg1.field836 > 0) {
            arg1.field836--;
        }
        for (int var11 = 0; var11 < arg1.field818.length; var11++) {
            class75 var12 = arg1.field818[var11];
            if (var12 != null) {
                if (var12.field1119 > 0) {
                    var12.field1119--;
                } else {
                    class363 var13 = class388.field5915.method1703(var12.field1120, -12536);
                    if (var13 == null || var13.field5623 == null) {
                        arg1.field818[var11] = null;
                    } else {
                        var12.field1114++;
                        if (var13.field5623.length > var12.field1122 && var12.field1114 > var13.field5599[var12.field1122]) {
                            var12.field1114 = 1;
                            var12.field1122++;
                            class35.method217((byte) -44, class358.field5565 == arg1, var12.field1122, var13, arg1.field6417, arg1.field6410, arg1.field6419);
                        }
                        if (var13.field5623.length <= var12.field1122) {
                            var12.field1121++;
                            var12.field1122 -= var13.field5617;
                            if (var13.field5602 <= var12.field1121) {
                                arg1.field818[var11] = null;
                            } else if (var12.field1122 >= 0 && var12.field1122 < var13.field5623.length) {
                                class35.method217((byte) -44, class358.field5565 == arg1, var12.field1122, var13, arg1.field6417, arg1.field6410, arg1.field6419);
                            } else {
                                arg1.field818[var11] = null;
                            }
                        }
                        var12.field1118 = var12.field1122 + 1;
                        if (var12.field1118 >= var13.field5623.length) {
                            var12.field1118 -= var13.field5617;
                            if ((var12.field1121 + 1) >= var13.field5602) {
                                var12.field1118 = -1;
                            } else if (var12.field1118 < 0 || var12.field1118 >= var13.field5623.length) {
                                var12.field1118 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IJ)V")
    private final void method2195(int arg0, long arg1) {
        field5148++;
        if (arg0 != 9696) {
            this.field5145 = -108;
        }
        class122 var4 = (class122) this.field5152.method1122((byte) 59, arg1);
        this.method2192(arg0 - 9569, var4);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)I")
    public final int method2196(byte arg0) {
        field5149++;
        return arg0 == -17 ? this.field5145 : -103;
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(I)V")
    public static final void method2197(int arg0) {
        class442.field6874.method2189(false);
        field5136++;
        if (arg0 >= -21) {
            method2193(-76, 36);
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V")
    public static void method2198(byte arg0) {
        field5157 = null;
        int var1 = 117 / ((-arg0 - 14) / 58);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BILjava/lang/Object;J)V")
    private final void method2199(byte arg0, int arg1, Object arg2, long arg3) {
        field5146++;
        if (arg1 > this.field5159) {
            throw new IllegalStateException("s>cs");
        }
        this.method2195(9696, arg3);
        this.field5145 -= arg1;
        while (this.field5145 < 0) {
            class122 var7 = (class122) this.field5150.method2735((byte) -114);
            this.method2192(127, var7);
        }
        class523 var6 = new class523(arg2, arg1);
        if (arg0 < 99) {
            this.method2202(93, -40);
        }
        this.field5152.method1127(var6, (byte) 88, arg3);
        this.field5150.method2731(var6, (byte) 49);
        var6.field5226 = 0L;
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(B)I")
    public final int method2200(byte arg0) {
        field5144++;
        return arg0 == 75 ? this.field5159 : 62;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method2201(boolean arg0) {
        field5142++;
        class122 var2 = (class122) this.field5152.method1121((byte) -7);
        while (var2 != null) {
            Object var3 = var2.method768((byte) -93);
            if (var3 != null) {
                return var3;
            }
            class122 var4 = var2;
            var2 = (class122) this.field5152.method1121((byte) 87);
            var4.method3149(84);
            var4.method2219(0);
            this.field5145 += var2.field1658;
        }
        return arg0 ? null : null;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(II)V")
    public final void method2202(int arg0, int arg1) {
        field5156++;
        if (arg0 != 0) {
            this.method2188(-26, -33L, null);
        }
        if (class540.field7897 == null) {
            return;
        }
        for (class122 var3 = (class122) this.field5150.method2732(34); var3 != null; var3 = (class122) this.field5150.method2729(arg0 ^ 0x67)) {
            if (var3.method769(arg0 + 125)) {
                if (var3.method768((byte) -78) == null) {
                    var3.method3149(arg0 ^ 0x35);
                    var3.method2219(0);
                    this.field5145++;
                }
            } else if (((long) arg1) < (++var3.field5226)) {
                class122 var4 = class540.field7897.method517((byte) 84, var3);
                this.field5152.method1127(var4, (byte) 25, var3.field7780);
                class382.method2468(var3, var4, false);
                var3.method3149(102);
                var3.method2219(0);
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(I)V")
    public class328(int arg0) {
        this.field5145 = arg0;
        this.field5159 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field5152 = new class177(var2);
    }
}
