import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class214 extends class196 {

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "Ldf;")
    public static class51 field3713 = class46.method233("; Expires=", 100);

    @OriginalMember(owner = "client!ra", name = "V", descriptor = "[I")
    public static int[] field3714 = new int[32];

    @OriginalMember(owner = "client!ra", name = "bb", descriptor = "Ldf;")
    public static class51 field3720 = class46.method233("mapflag", 100);

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!ra", name = "W", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!ra", name = "X", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!ra", name = "Z", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!ra", name = "ab", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "[[[B")
    public static byte[][][] field3709;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(BI)[[I")
    public final int[][] method46(byte arg0, int arg1) {
        int[][] var3 = super.field3285.method1548(arg1, (byte) -104);
        if (arg0 != 11) {
            field3714 = null;
        }
        if (super.field3285.field3963) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class49.field767; ++var7) {
                this.method1471(arg1, var7, (byte) -34);
                int[][] var8 = this.method1387(29, 0, class106.field1743);
                var5[var7] = var8[0][class252.field4429];
                var4[var7] = var8[1][class252.field4429];
                var6[var7] = var8[2][class252.field4429];
            }
        }
        ++field3719;
        return var3;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class214() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(II)I")
    public static final int method1470(int arg0, int arg1) {
        ++field3712;
        if (arg1 != 16) {
            field3713 = null;
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIB)V")
    private final void method1471(int arg0, int arg1, byte arg2) {
        if (arg2 == -34) {
            ++field3710;
            int var4 = class211.field3510[arg1];
            int var5 = class161.field2639[arg0];
            float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class252.field4429 = arg1;
                class106.field1743 = arg0;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class252.field4429 = arg0;
                class106.field1743 = arg1;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class252.field4429 = -arg0 + class49.field767;
                class106.field1743 = arg1;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class106.field1743 = class234.field4079 - arg0;
                class252.field4429 = arg1;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class252.field4429 = class49.field767 - arg1;
                class106.field1743 = -arg0 + class234.field4079;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class106.field1743 = -arg1 + class234.field4079;
                class252.field4429 = -arg0 + class49.field767;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class252.field4429 = arg0;
                class106.field1743 = class234.field4079 - arg1;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class252.field4429 = -arg1 + class49.field767;
                class106.field1743 = arg0;
            }
            class106.field1743 &= field3717;
            class252.field4429 &= class135.field2245;
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        ++field3711;
        if (arg1 != 10565) {
            return null;
        } else {
            int[] var3 = super.field3274.method1476(true, arg0);
            if (super.field3274.field3741) {
                for (int var4 = 0; class49.field767 > var4; ++var4) {
                    this.method1471(arg0, var4, (byte) -34);
                    int[] var5 = this.method1390(class106.field1743, 0, -83);
                    var3[var4] = var5[class252.field4429];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lu;I)V")
    public static final void method1472(class111 arg0, int arg1) {
        ++field3715;
        if (arg1 < 81) {
            field3709 = null;
        }
        class24.field361 = arg0;
        class22.field312 = class24.field361.method821(false, 16);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        if (arg2 != 82) {
            field3717 = 121;
        }
        ++field3718;
        if (~arg0 == -1) {
            super.field3291 = ~arg1.method897(-76) == -2;
        }
    }

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)V")
    public static void method1473(int arg0) {
        field3714 = null;
        field3709 = null;
        if (arg0 == 2047) {
            field3720 = null;
            field3713 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "(I)V")
    public static final void method1474(int arg0) {
        ++field3716;
        int var1 = class242.field4202 * 128 + 64;
        int var2 = class141.field2368 * 128 + 64;
        int var3 = class207.method1424(class257.field4496, var2, (byte) 8, var1) + -class92.field1525;
        if (class114.field1944 >= 100) {
            class144.field2408 = class242.field4202 * 128 + 64;
            class209.field3488 = class141.field2368 * 128 + 64;
            class120.field2001 = class207.method1424(class257.field4496, class209.field3488, (byte) 82, class144.field2408) + -class92.field1525;
        } else {
            if (~class209.field3488 > ~var2) {
                class209.field3488 += (-class209.field3488 + var2) * class114.field1944 / 1000 + class124.field2104;
                if (class209.field3488 > var2) {
                    class209.field3488 = var2;
                }
            }
            if (~class120.field2001 > ~var3) {
                class120.field2001 += (-class120.field2001 + var3) * class114.field1944 / 1000 + class124.field2104;
                if (var3 < class120.field2001) {
                    class120.field2001 = var3;
                }
            }
            if (~var1 < ~class144.field2408) {
                class144.field2408 += class124.field2104 - -((var1 - class144.field2408) * class114.field1944 / 1000);
                if (var1 < class144.field2408) {
                    class144.field2408 = var1;
                }
            }
            if (class120.field2001 > var3) {
                class120.field2001 -= (-var3 + class120.field2001) * class114.field1944 / 1000 + class124.field2104;
                if (~class120.field2001 > ~var3) {
                    class120.field2001 = var3;
                }
            }
            if (~class209.field3488 < ~var2) {
                class209.field3488 -= (-var2 + class209.field3488) * class114.field1944 / 1000 + class124.field2104;
                if (class209.field3488 < var2) {
                    class209.field3488 = var2;
                }
            }
            if (var1 < class144.field2408) {
                class144.field2408 -= (-var1 + class144.field2408) * class114.field1944 / 1000 + class124.field2104;
                if (var1 > class144.field2408) {
                    class144.field2408 = var1;
                }
            }
        }
        int var4 = class247.field4316 * 128 + 64;
        int var5 = class66.field1073 * 128 + 64;
        int var6 = class207.method1424(class257.field4496, var4, (byte) 114, var5) + -class101.field1684;
        if (arg0 <= 57) {
            field3714 = null;
        }
        int var7 = var6 - class120.field2001;
        int var8 = -class209.field3488 + var4;
        int var9 = -class144.field2408 + var5;
        int var10 = (int) Math.sqrt((double) (var8 * var8 - -(var9 * var9)));
        int var11 = 2047 & (int) (Math.atan2((double) var7, (double) var10) * 325.949D);
        if (~var11 > -129) {
            var11 = 128;
        }
        int var12 = 2047 & (int) (-325.949D * Math.atan2((double) var8, (double) var9));
        if (~var11 < -384) {
            var11 = 383;
        }
        if (~class107.field1763 > ~var11) {
            class107.field1763 += (-class107.field1763 + var11) * class248.field4362 / 1000 + class116.field1969;
            if (~var11 > ~class107.field1763) {
                class107.field1763 = var11;
            }
        }
        int var13 = -class128.field2143 + var12;
        if (var11 < class107.field1763) {
            class107.field1763 -= (-var11 + class107.field1763) * class248.field4362 / 1000 + class116.field1969;
            if (~class107.field1763 > ~var11) {
                class107.field1763 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class128.field2143 += class248.field4362 * var13 / 1000 + class116.field1969;
            class128.field2143 &= 2047;
        }
        if (var13 < 0) {
            class128.field2143 -= -var13 * class248.field4362 / 1000 + class116.field1969;
            class128.field2143 &= 2047;
        }
        int var14 = -class128.field2143 + var12;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || ~var14 < -1 && ~var13 > -1) {
            class128.field2143 = var12;
        }
    }
}
