import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class198 extends class134 {

    @OriginalMember(owner = "client!da", name = "z", descriptor = "[Lda;")
    public class198[] field3146;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "Z")
    public boolean field3139;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field3138 = 0;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field3133 = -2;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "I")
    public static int field3144 = -1;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public int field3142;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!da", name = "y", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!da", name = "A", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!da", name = "B", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!da", name = "C", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!da", name = "E", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!da", name = "G", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!da", name = "H", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "Lpm;")
    public class7 field3134;

    @OriginalMember(owner = "client!da", name = "D", descriptor = "Lsf;")
    public class99 field3150;

    @OriginalMember(owner = "client!da", name = "F", descriptor = "[[[I")
    public static int[][][] field3152;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZI)[I")
    public int[] method32(boolean arg0, int arg1) {
        field3148++;
        if (arg0) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return null;
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
    public static void method1366(int arg0) {
        field3152 = null;
        if (arg0 > -90) {
            method1374((String) null, 80);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BII)[I")
    public final int[] method1367(byte arg0, int arg1, int arg2) {
        field3136++;
        if (arg0 == -79) {
            return this.field3146[arg1].field3139 ? this.field3146[arg1].method32(true, arg2) : this.field3146[arg1].method200(arg2, -2)[0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(I)I")
    public int method1368(int arg0) {
        if (arg0 != -1) {
            this.field3150 = null;
        }
        field3137++;
        return -1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
    public static final void method1369(byte arg0) {
        field3149++;
        if (class156.field2470 != null || class138.field2135 != null || class242.field3837 > 0) {
            return;
        }
        int var1 = class102.field1548;
        if (arg0 < 35) {
            method1366(58);
        }
        if (!class220.field3525) {
            if (var1 == 1 && class18.field251 > 0) {
                short var13 = class70.field1016[class18.field251 - 1];
                if (var13 == 14 || var13 == 31 || var13 == 37 || var13 == 59 || var13 == 5 || var13 == 38 || var13 == 3 || var13 == 50 || var13 == 10 || var13 == 12 || var13 == 43 || var13 == 1004) {
                    int var14 = class283.field4737[class18.field251 - 1];
                    int var15 = class175.field2739[class18.field251 - 1];
                    class254 var16 = class80.method534(107, var15);
                    class237 var17 = client.method1085(var16);
                    if (var17.method1654(22672) || var17.method1653(-104)) {
                        class162.field2546 = 0;
                        class275.field4547 = false;
                        if (class156.field2470 != null) {
                            class58.method354(true, class156.field2470);
                        }
                        class156.field2470 = class80.method534(-97, var15);
                        class135.field2112 = var14;
                        class36.field471 = class199.field3158;
                        class146.field2305 = class218.field3483;
                        class58.method354(true, class156.field2470);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class258.field4246 == 1 && class18.field251 > 2 || class144.method969(class18.field251 - 1, -1))) {
                var1 = 2;
            }
            if (var1 == 2 && class18.field251 > 0 || class145.field2280 == 1) {
                class90.method581(1);
            }
            if ((var1 != 1 || class18.field251 <= 0) && class145.field2280 != 2) {
                return;
            }
            class121.method791((byte) 87);
            return;
        }
        if (var1 != 1) {
            int var2 = class60.field924;
            int var3 = class1.field1;
            if (var3 < class120.field1847 - 10 || (class307.field4997 + class120.field1847 + 10) < var3 || class248.field3950 - 10 > var2 || class248.field3950 + class307.field4990 + 10 < var2) {
                class220.field3525 = false;
                class208.method1473(class120.field1847, (byte) 48, class307.field4990, class248.field3950, class307.field4997);
            }
        }
        if (var1 != 1) {
            return;
        }
        int var4 = class120.field1847;
        int var5 = class248.field3950;
        int var6 = class307.field4997;
        int var7 = class218.field3483;
        int var8 = class199.field3158;
        int var9 = -1;
        for (int var10 = 0; var10 < class18.field251; var10++) {
            if (class163.field2563) {
                int var11 = (class18.field251 - var10 - 1) * 15 + var5 + 33;
                if (var8 > var4 && var8 < (var4 + var6) && (var11 - 13) < var7 && var11 + 3 > var7) {
                    var9 = var10;
                }
            } else {
                int var12 = (class18.field251 - var10 - 1) * 15 + var5 + 31;
                if (var8 > var4 && var8 < (var4 + var6) && var12 - 13 < var7 && var12 + 3 > var7) {
                    var9 = var10;
                }
            }
        }
        if (var9 != -1) {
            class47.method295(var9, 0);
        }
        class220.field3525 = false;
        class208.method1473(class120.field1847, (byte) 42, class307.field4990, class248.field3950, class307.field4997);
        return;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1370(int arg0, int arg1, int arg2, int arg3) {
        if (!class147.method978(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class242.field3842[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class160.field2527) {
                    if (!class73.method469(var4, var6, var5)) {
                        return false;
                    }
                    if (!class73.method469(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class73.method469(var4, var7, var5)) {
                        return false;
                    }
                    if (!class73.method469(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class73.method469(var4, var8, var5)) {
                    return false;
                }
                if (!class73.method469(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class60.field927) {
                    if (!class73.method469(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class73.method469(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class73.method469(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class73.method469(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class73.method469(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class73.method469(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class160.field2527) {
                    if (!class73.method469(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class73.method469(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class73.method469(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class73.method469(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class73.method469(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class73.method469(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class60.field927) {
                    if (!class73.method469(var4, var6, var5)) {
                        return false;
                    }
                    if (!class73.method469(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class73.method469(var4, var7, var5)) {
                        return false;
                    }
                    if (!class73.method469(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class73.method469(var4, var8, var5)) {
                    return false;
                }
                if (!class73.method469(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class73.method469(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class73.method469(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class73.method469(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class73.method469(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class73.method469(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILma;I)V")
    public void method52(int arg0, class202 arg1, int arg2) {
        int var4 = 52 % ((arg0 - 60) / 61);
        field3153++;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BIIIII)V")
    public static final void method1371(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3147++;
        if (arg0 < 80) {
            method1374((String) null, -35);
        }
        int var6 = 0;
        class71.method451(arg1, true, arg3 + arg5, -arg3 + arg5, class130.field2005[arg2]);
        int var7 = arg3 * arg3;
        int var8 = arg4;
        int var9 = arg4 * arg4;
        int var10 = arg4 << 1;
        int var11 = var7 << 1;
        int var12 = var9 << 1;
        int var13 = (1 - var10) * var7 + var12;
        int var14 = var9 - ((var10 - 1) * var11);
        int var15 = var9 << 2;
        int var16 = var7 << 2;
        int var17 = ((var6 << 1) + 3) * var12;
        int var18 = ((arg4 << 1) - 3) * var11;
        int var19 = (arg4 - 1) * var16;
        int var20 = (var6 + 1) * var15;
        while (var8 > 0) {
            var8--;
            int var21 = arg2 - var8;
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var17 += var15;
                    var14 += var20;
                    var20 += var15;
                    var6++;
                }
            }
            if (var14 < 0) {
                var14 += var20;
                var20 += var15;
                var13 += var17;
                var17 += var15;
                var6++;
            }
            int var22 = arg2 + var8;
            var14 += -var18;
            var13 += -var19;
            int var23 = arg5 + var6;
            var19 -= var16;
            int var24 = arg5 - var6;
            var18 -= var16;
            class71.method451(arg1, true, var23, var24, class130.field2005[var21]);
            class71.method451(arg1, true, var23, var24, class130.field2005[var22]);
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(B)I")
    public int method700(byte arg0) {
        field3135++;
        int var2 = 10 / ((69 - arg0) / 47);
        return -1;
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I)V")
    public void method696(int arg0) {
        if (arg0 != 128) {
            return;
        }
        if (this.field3139) {
            this.field3134.method37(49);
            this.field3134 = null;
        } else {
            this.field3150.method645((byte) -69);
            this.field3150 = null;
        }
        field3143++;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(B)V")
    public void method142(byte arg0) {
        int var2 = 112 % ((arg0 + 46) / 47);
        field3154++;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(IZ)V")
    public class198(int arg0, boolean arg1) {
        this.field3146 = new class198[arg0];
        this.field3139 = arg1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIB)[[I")
    public final int[][] method1372(int arg0, int arg1, byte arg2) {
        field3145++;
        int var4 = -87 % ((arg2 - 36) / 35);
        if (this.field3146[arg0].field3139) {
            int[] var5 = this.field3146[arg0].method32(true, arg1);
            return new int[][] { var5, var5, var5 };
        } else {
            return this.field3146[arg0].method200(arg1, -2);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V")
    public final void method1373(int arg0, int arg1, int arg2) {
        if (arg2 != -2) {
            this.method1367((byte) -57, -15, -43);
        }
        field3141++;
        int var4 = this.field3142 == 255 ? arg1 : this.field3142;
        if (this.field3139) {
            this.field3134 = new class7(var4, arg1, arg0);
        } else {
            this.field3150 = new class99(var4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)[[I")
    public int[][] method200(int arg0, int arg1) {
        if (arg1 != -2) {
            this.field3134 = null;
        }
        field3151++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method1374(String arg0, int arg1) {
        if (arg1 != -16928) {
            field3144 = 127;
        }
        field3140++;
        return class64.method415(10, true, arg0, 0);
    }
}
