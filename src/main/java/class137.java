import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class137 {

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public static int field2573 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    public static int field2576 = 0;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "Lcc;")
    private static class209 field2575 = class95.method669(97, " from your ignore list first)3");

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "I")
    public static int field2585 = 1;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "J")
    public static long field2579 = 0L;

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "Lcc;")
    public static class209 field2582 = field2575;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    public int field2577;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "J")
    private long field2574;

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "J")
    private long field2590;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "Z")
    public boolean field2588;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "[I")
    private int[] field2568;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "[I")
    private int[] field2570;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lfl;IIII)Lvc;")
    public final class189 method947(class241 arg0, int arg1, int arg2, int arg3, int arg4) {
        field2580++;
        long var6 = (long) arg4 | (long) arg4 << 32 | (long) (arg1 << 16);
        class189 var8 = (class189) class261.field4699.method670((byte) -49, var6);
        if (var8 == null) {
            int var9 = 0;
            class208[] var10 = new class208[2];
            if (!class148.method1032(arg4, 3).method81(-30978) || !class148.method1032(arg1, 3).method81(-30978)) {
                return null;
            }
            class208 var11 = class148.method1032(arg4, 3).method82((byte) 118);
            if (var11 != null) {
                var10[var9++] = var11;
            }
            class208 var12 = class148.method1032(arg1, 3).method82((byte) 113);
            if (var12 != null) {
                var10[var9++] = var12;
            }
            class208 var13 = new class208(var10, var9);
            for (int var14 = 0; var14 < 5; var14++) {
                if (class100.field1943[var14].length > this.field2568[var14]) {
                    var13.method1440(class185.field3328[var14], class100.field1943[var14][this.field2568[var14]]);
                }
                if (this.field2568[var14] < class150.field2744[var14].length) {
                    var13.method1440(class33.field590[var14], class150.field2744[var14][this.field2568[var14]]);
                }
            }
            var8 = var13.method1413(64, 768, -50, -10, -50);
            class261.field4699.method673(var6, -5087, var8);
        }
        int var15 = 52 / ((-arg2 - 39) / 56);
        if (arg0 != null) {
            var8 = arg0.method1669(-87, var8, arg3);
        }
        return var8;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public static final void method948(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class131.field2509[var1] = false;
        }
        field2587++;
        class181.field3263 = -1;
        class14.field262 = -1;
        if (arg0 != 25676) {
            method953((byte[]) null, true);
        }
        class16.field334 = 1;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)V")
    public final void method949(int arg0, int arg1, int arg2) {
        if (arg2 != 9730) {
            return;
        }
        field2589++;
        int var4 = class249.field4497[arg0];
        if (this.field2570[var4] != 0 && class148.method1032(arg1, 3) != null) {
            this.field2570[var4] = class6.method63(Integer.MIN_VALUE, arg1);
            this.method954(1073741824);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZZ[II[I)V")
    public final void method950(boolean arg0, boolean arg1, int[] arg2, int arg3, int[] arg4) {
        if (arg4 == null) {
            arg4 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class238.field4314; var7++) {
                    class9 var8 = class148.method1032(var7, 3);
                    if (var8 != null && !var8.field187 && ((arg0 ? 7 : 0) + var6) == var8.field179) {
                        arg4[class249.field4497[var6]] = class6.method63(Integer.MIN_VALUE, var7);
                        break;
                    }
                }
            }
        }
        this.field2577 = arg3;
        this.field2570 = arg4;
        this.field2588 = arg0;
        if (arg1) {
            this.method960(-104);
        }
        field2581++;
        this.field2568 = arg2;
        this.method954(1073741824);
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
    public static void method951(int arg0) {
        if (arg0 >= -43) {
            method951(10);
        }
        field2582 = null;
        field2575 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZB)V")
    public final void method952(boolean arg0, byte arg1) {
        int var3 = -86 % ((arg1 - 59) / 52);
        field2567++;
        this.field2588 = arg0;
        this.method954(1073741824);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "([BZ)Z")
    public static final boolean method953(byte[] arg0, boolean arg1) {
        field2564++;
        class106 var2 = new class106(arg0);
        int var3 = var2.method774((byte) 103);
        if (var3 != 1) {
            return false;
        } else if (arg1) {
            return true;
        } else {
            boolean var4 = var2.method774((byte) 102) == 1;
            if (var4) {
                class209.method1470(var2, true);
            }
            class227.method1591(-7, var2);
            return true;
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)V")
    private final void method954(int arg0) {
        long var2 = this.field2574;
        if (arg0 != 1073741824) {
            field2585 = -81;
        }
        long[] var4 = class181.field3271;
        field2571++;
        this.field2574 = -1L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2574 = var4[(int) (((long) (this.field2570[var5] >> 24) ^ this.field2574) & 0xFFL)] ^ this.field2574 >>> 8;
            this.field2574 = var4[(int) (((long) (this.field2570[var5] >> 16) ^ this.field2574) & 0xFFL)] ^ this.field2574 >>> 8;
            this.field2574 = this.field2574 >>> 8 ^ var4[(int) ((this.field2574 ^ (long) (this.field2570[var5] >> 8)) & 0xFFL)];
            this.field2574 = this.field2574 >>> 8 ^ var4[(int) (((long) this.field2570[var5] ^ this.field2574) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2574 = var4[(int) (((long) this.field2568[var6] ^ this.field2574) & 0xFFL)] ^ this.field2574 >>> 8;
        }
        this.field2574 = var4[(int) (((long) (this.field2588 ? 1 : 0) ^ this.field2574) & 0xFFL)] ^ this.field2574 >>> 8;
        if (var2 != 0L && this.field2574 != var2) {
            class154.field2805.method674(false, var2);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZIIIII)V")
    public static final void method955(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2578++;
        int var6 = arg5 - arg2;
        int var7 = arg4 - arg1;
        if (var6 == 0) {
            if (var7 != 0) {
                class201.method1387(arg4, -121, arg2, arg1, arg3);
            }
        } else if (var7 == 0) {
            class94.method659(arg1, arg3, 10434, arg2, arg5);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 < var7;
            if (var8) {
                int var9 = arg5;
                int var10 = arg2;
                arg5 = arg4;
                arg4 = var9;
                arg2 = arg1;
                arg1 = var10;
            }
            if (arg5 < arg2) {
                int var11 = arg1;
                int var12 = arg2;
                arg1 = arg4;
                arg2 = arg5;
                arg4 = var11;
                arg5 = var12;
            }
            int var13 = arg1;
            int var14 = arg5 - arg2;
            if (arg0) {
                int var15 = -(var14 >> 1);
                int var16 = arg1 < arg4 ? 1 : -1;
                int var17 = arg4 - arg1;
                if (var17 < 0) {
                    var17 = -var17;
                }
                if (var8) {
                    for (int var19 = arg2; var19 <= arg5; var19++) {
                        class252.field4543[var19][var13] = arg3;
                        var15 += var17;
                        if (var15 > 0) {
                            var15 -= var14;
                            var13 += var16;
                        }
                    }
                } else {
                    for (int var18 = arg2; var18 <= arg5; var18++) {
                        var15 += var17;
                        class252.field4543[var13][var18] = arg3;
                        if (var15 > 0) {
                            var13 += var16;
                            var15 -= var14;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V")
    public static final void method956(boolean arg0) {
        field2572++;
        int var1 = class274.field4857 * 128 + 64;
        int var2 = class76.field1424 * 128 + 64;
        int var3 = class94.method661(var2, 19452, class99.field1937, var1) - class44.field887;
        if (class279.field4922 >= 100) {
            class60.field1213 = class274.field4857 * 128 + 64;
            class103.field1990 = class76.field1424 * 128 + 64;
            class183.field3312 = class94.method661(class103.field1990, 19452, class99.field1937, class60.field1213) - class44.field887;
        } else {
            if (var3 > class183.field3312) {
                class183.field3312 += (var3 - class183.field3312) * class279.field4922 / 1000 + class132.field2519;
                if (var3 < class183.field3312) {
                    class183.field3312 = var3;
                }
            }
            if (var2 > class103.field1990) {
                class103.field1990 += (var2 - class103.field1990) * class279.field4922 / 1000 + class132.field2519;
                if (class103.field1990 > var2) {
                    class103.field1990 = var2;
                }
            }
            if (var1 > class60.field1213) {
                class60.field1213 += (var1 - class60.field1213) * class279.field4922 / 1000 + class132.field2519;
                if (var1 < class60.field1213) {
                    class60.field1213 = var1;
                }
            }
            if (class60.field1213 > var1) {
                class60.field1213 -= (class60.field1213 - var1) * class279.field4922 / 1000 + class132.field2519;
                if (var1 > class60.field1213) {
                    class60.field1213 = var1;
                }
            }
            if (var3 < class183.field3312) {
                class183.field3312 -= class132.field2519 + ((class183.field3312 - var3) * class279.field4922 / 1000);
                if (var3 > class183.field3312) {
                    class183.field3312 = var3;
                }
            }
            if (class103.field1990 > var2) {
                class103.field1990 -= class132.field2519 + ((class103.field1990 - var2) * class279.field4922 / 1000);
                if (class103.field1990 < var2) {
                    class103.field1990 = var2;
                }
            }
        }
        int var4 = class106.field2053 * 128 + 64;
        int var5 = class49.field976 * 128 + 64;
        int var6 = class94.method661(var4, 19452, class99.field1937, var5) - class190.field3444;
        int var7 = var6 - class183.field3312;
        int var8 = var4 - class103.field1990;
        int var9 = var5 - class60.field1213;
        int var10 = (int) Math.sqrt((double) (var9 * var9 + (var8 * var8)));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = (int) (Math.atan2((double) var9, (double) var8) * -325.949D) & 0x7FF;
        if (var11 > 383) {
            var11 = 383;
        }
        int var13 = var12 - class179.field3256;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var11 > class182.field3304) {
            class182.field3304 += (var11 - class182.field3304) * class192.field3483 / 1000 + class178.field3249;
            if (var11 < class182.field3304) {
                class182.field3304 = var11;
            }
        }
        if (var13 > 0) {
            class179.field3256 += class192.field3483 * var13 / 1000 + class178.field3249;
            class179.field3256 &= 0x7FF;
        }
        if (class182.field3304 > var11) {
            class182.field3304 -= (class182.field3304 - var11) * class192.field3483 / 1000 + class178.field3249;
            if (var11 > class182.field3304) {
                class182.field3304 = var11;
            }
        }
        if (var13 < 0) {
            class179.field3256 -= class178.field3249 + (-var13 * class192.field3483 / 1000);
            class179.field3256 &= 0x7FF;
        }
        int var14 = var12 - class179.field3256;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (arg0) {
            method953((byte[]) null, true);
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class179.field3256 = var12;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
    public static final void method957(byte arg0) {
        if (arg0 == -101) {
            field2586++;
            class37.field639.method665(1);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILfl;B)Lvc;")
    public final class189 method958(int arg0, class241 arg1, byte arg2) {
        field2569++;
        if (this.field2577 != -1) {
            return class78.method549(81, this.field2577).method1648(arg0, arg1, -30);
        }
        class189 var4 = (class189) class261.field4699.method670((byte) -53, this.field2574);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field2570[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var15) != 0 && !class148.method1032(var15 & 0x3FFFFFFF, arg2 + 106).method81(arg2 ^ 0x7967)) {
                        var5 = true;
                    }
                } else if (!class249.method1728(var15 & 0x3FFFFFFF, true).method597(this.field2588, (byte) -44)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class208[] var7 = new class208[12];
            int var8 = 0;
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field2570[var9];
                if ((var12 & 0x40000000) != 0) {
                    class208 var13 = class249.method1728(var12 & 0x3FFFFFFF, true).method585((byte) -126, this.field2588);
                    if (var13 != null) {
                        var7[var8++] = var13;
                    }
                } else if ((var12 & Integer.MIN_VALUE) != 0) {
                    class208 var14 = class148.method1032(var12 & 0x3FFFFFFF, 3).method82((byte) 122);
                    if (var14 != null) {
                        var7[var8++] = var14;
                    }
                }
            }
            class208 var10 = new class208(var7, var8);
            for (int var11 = 0; var11 < 5; var11++) {
                if (this.field2568[var11] < class100.field1943[var11].length) {
                    var10.method1440(class185.field3328[var11], class100.field1943[var11][this.field2568[var11]]);
                }
                if (this.field2568[var11] < class150.field2744[var11].length) {
                    var10.method1440(class33.field590[var11], class150.field2744[var11][this.field2568[var11]]);
                }
            }
            var4 = var10.method1413(64, 768, -50, -10, -50);
            class261.field4699.method673(this.field2574, -5087, var4);
        }
        if (arg2 != -103) {
            this.method959(46, 60, 41);
        }
        if (arg1 != null) {
            var4 = arg1.method1669(-95, var4, arg0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(III)V")
    public final void method959(int arg0, int arg1, int arg2) {
        this.field2568[arg2] = arg1;
        field2566++;
        if (arg0 >= -26) {
            field2573 = -66;
        }
        this.method954(1073741824);
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)I")
    public final int method960(int arg0) {
        if (arg0 != 14486) {
            this.method959(-48, 61, -16);
        }
        field2584++;
        return this.field2577 == -1 ? (this.field2570[8] << 10) + this.field2570[1] + (this.field2570[0] << 15) + (this.field2568[4] << 20) + (this.field2570[11] << 5) + (this.field2568[0] << 25) : class78.method549(arg0 ^ 0x38F9, this.field2577).field4255 + 305419896;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILfl;Lfl;II)Lvc;")
    public final class189 method961(int arg0, class241 arg1, class241 arg2, int arg3, int arg4) {
        field2583++;
        if (~this.field2577 != arg4) {
            return class78.method549(115, this.field2577).method1638(arg3, arg2, arg1, -50, arg0);
        }
        long var6 = this.field2574;
        int[] var8 = this.field2570;
        if (arg2 != null && (arg2.field4368 >= 0 || arg2.field4359 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field2570[var9];
            }
            if (arg2.field4368 >= 0) {
                if (arg2.field4368 == 65535) {
                    var6 ^= 0xFFFFFFFF00000000L;
                    var8[5] = 0;
                } else {
                    var8[5] = class6.method63(arg2.field4368, 1073741824);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg2.field4359 >= 0) {
                if (arg2.field4359 == 65535) {
                    var6 ^= 0xFFFFFFFFL;
                    var8[3] = 0;
                } else {
                    var8[3] = class6.method63(1073741824, arg2.field4359);
                    var6 ^= (long) var8[3];
                }
            }
        }
        class189 var10 = (class189) class154.field2805.method670((byte) -112, var6);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var30 = var8[var12];
                if ((var30 & 0x40000000) == 0) {
                    if ((var30 & Integer.MIN_VALUE) != 0 && !class148.method1032(var30 & 0x3FFFFFFF, 3).method85((byte) 109)) {
                        var11 = true;
                    }
                } else if (!class249.method1728(var30 & 0x3FFFFFFF, true).method581((byte) -118, this.field2588)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field2590 != -1L) {
                    var10 = (class189) class154.field2805.method670((byte) -45, this.field2590);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                int var13 = 0;
                class208[] var14 = new class208[12];
                for (int var15 = 0; var15 < 12; var15++) {
                    int var27 = var8[var15];
                    if ((var27 & 0x40000000) != 0) {
                        class208 var28 = class249.method1728(var27 & 0x3FFFFFFF, true).method596((byte) 121, this.field2588);
                        if (var28 != null) {
                            var14[var13++] = var28;
                        }
                    } else if ((Integer.MIN_VALUE & var27) != 0) {
                        class208 var29 = class148.method1032(var27 & 0x3FFFFFFF, 3).method86(0);
                        if (var29 != null) {
                            var14[var13++] = var29;
                        }
                    }
                }
                int var16 = var8[0];
                if ((var16 & 0x40000000) != 0) {
                    class82 var17 = class249.method1728(var16 & 0x3FFFFFFF, true);
                    if (var17.field1648 != null) {
                        for (int var18 = 0; var18 < var17.field1648.length; var18++) {
                            if (var17.field1648[var18] != null && var14[var18 + 1] != null) {
                                int var19 = var17.field1648[var18][0];
                                int var20 = var17.field1648[var18][1];
                                int var21 = var17.field1648[var18][3];
                                int var22 = var17.field1648[var18][4];
                                int var23 = var17.field1648[var18][2];
                                int var24 = var17.field1648[var18][5];
                                var14[var18 + 1].method1430(var19, var20, var23);
                                var14[var18 + 1].method1426(var21, var22, var24);
                            }
                        }
                    }
                }
                class208 var25 = new class208(var14, var13);
                for (int var26 = 0; var26 < 5; var26++) {
                    if (this.field2568[var26] < class100.field1943[var26].length) {
                        var25.method1440(class185.field3328[var26], class100.field1943[var26][this.field2568[var26]]);
                    }
                    if (class150.field2744[var26].length > this.field2568[var26]) {
                        var25.method1440(class33.field590[var26], class150.field2744[var26][this.field2568[var26]]);
                    }
                }
                var10 = var25.method1413(64, 850, -30, -50, -30);
                class154.field2805.method673(var6, -5087, var10);
                this.field2590 = var6;
            }
        }
        if (arg2 == null && arg1 == null) {
            return var10;
        }
        class189 var31;
        if (arg2 != null && arg1 != null) {
            var31 = arg2.method1664((byte) -93, arg1, var10, arg3, arg0);
        } else if (arg2 == null) {
            var31 = arg1.method1661(arg0, 31042, var10);
        } else {
            var31 = arg2.method1661(arg3, 31042, var10);
        }
        return var31;
    }
}
