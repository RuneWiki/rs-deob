import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class114 extends class195 {

    @OriginalMember(owner = "client!gf", name = "V", descriptor = "Z")
    public static boolean field1725 = false;

    @OriginalMember(owner = "client!gf", name = "Y", descriptor = "J")
    public static volatile long field1728 = 0L;

    @OriginalMember(owner = "client!gf", name = "X", descriptor = "Lck;")
    public static class119 field1727 = class298.method1987((byte) 36, "hint_mapedge");

    @OriginalMember(owner = "client!gf", name = "U", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!gf", name = "W", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!gf", name = "Z", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!gf", name = "ab", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!gf", name = "bb", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V", line = 6)
    public class114() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "(I)V", line = 10)
    public static void method725(int arg0) {
        if (arg0 != 2) {
            method727(-102, 52, 22);
        }
        field1727 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IBI)V", line = 23)
    private final void method726(int arg0, byte arg1, int arg2) {
        field1730++;
        int var4 = class157.field2505[arg2];
        int var5 = class215.field3424[arg0];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - 2048));
        if ((double) var6 >= -3.141592653589793D && -2.356194490192345D >= (double) var6) {
            class268.field4420 = arg2;
            class37.field556 = arg0;
        } else if (-1.5707963267948966D >= (double) var6 && (double) var6 >= -2.356194490192345D) {
            class268.field4420 = arg0;
            class37.field556 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && -1.5707963267948966D <= (double) var6) {
            class268.field4420 = class157.field2504 - arg0;
            class37.field556 = arg2;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class268.field4420 = arg2;
            class37.field556 = class227.field3621 - arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class37.field556 = class227.field3621 - arg0;
            class268.field4420 = class157.field2504 - arg2;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class268.field4420 = class157.field2504 - arg0;
            class37.field556 = class227.field3621 - arg2;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class268.field4420 = arg0;
            class37.field556 = class227.field3621 - arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class268.field4420 = class157.field2504 - arg2;
            class37.field556 = arg0;
        }
        class268.field4420 &= class254.field4088;
        class37.field556 &= class59.field945;
        if (arg1 > -108) {
            field1727 = (class119) null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZ)[I", line = 98)
    public final int[] method11(int arg0, boolean arg1) {
        field1731++;
        int[] var3 = this.field3106.method924(100, arg0);
        if (this.field3106.field2260) {
            for (int var4 = 0; var4 < class157.field2504; var4++) {
                this.method726(arg0, (byte) -125, var4);
                int[] var5 = this.method1253(0, 71, class37.field556);
                var3[var4] = var5[class268.field4420];
            }
        }
        if (arg1) {
            field1727 = (class119) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(III)Z", line = 133)
    public static final boolean method727(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class19.field257; var3++) {
            class169 var4 = class289.field4759[var3];
            if (var4.field2654 == 1) {
                int var5 = var4.field2675 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field2656 * var5 >> 8) + var4.field2659;
                    int var7 = (var4.field2657 * var5 >> 8) + var4.field2664;
                    int var8 = (var4.field2661 * var5 >> 8) + var4.field2665;
                    int var9 = (var4.field2674 * var5 >> 8) + var4.field2668;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field2654 == 2) {
                int var10 = arg0 - var4.field2675;
                if (var10 > 0) {
                    int var11 = (var4.field2656 * var10 >> 8) + var4.field2659;
                    int var12 = (var4.field2657 * var10 >> 8) + var4.field2664;
                    int var13 = (var4.field2661 * var10 >> 8) + var4.field2665;
                    int var14 = (var4.field2674 * var10 >> 8) + var4.field2668;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field2654 == 3) {
                int var15 = var4.field2659 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field2660 * var15 >> 8) + var4.field2675;
                    int var17 = (var4.field2679 * var15 >> 8) + var4.field2671;
                    int var18 = (var4.field2661 * var15 >> 8) + var4.field2665;
                    int var19 = (var4.field2674 * var15 >> 8) + var4.field2668;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field2654 == 4) {
                int var20 = arg2 - var4.field2659;
                if (var20 > 0) {
                    int var21 = (var4.field2660 * var20 >> 8) + var4.field2675;
                    int var22 = (var4.field2679 * var20 >> 8) + var4.field2671;
                    int var23 = (var4.field2661 * var20 >> 8) + var4.field2665;
                    int var24 = (var4.field2674 * var20 >> 8) + var4.field2668;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field2654 == 5) {
                int var25 = arg1 - var4.field2665;
                if (var25 > 0) {
                    int var26 = (var4.field2660 * var25 >> 8) + var4.field2675;
                    int var27 = (var4.field2679 * var25 >> 8) + var4.field2671;
                    int var28 = (var4.field2656 * var25 >> 8) + var4.field2659;
                    int var29 = (var4.field2657 * var25 >> 8) + var4.field2664;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lfj;II)V", line = 261)
    public final void method13(class3 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field3127 = arg0.method64((byte) -121) == 1;
        }
        field1726++;
        if (arg1 > -117) {
            field1727 = (class119) null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)[[I", line = 278)
    public final int[][] method9(byte arg0, int arg1) {
        field1729++;
        int[][] var3 = this.field3126.method603(arg1, -123);
        if (arg0 != 3) {
            method725(86);
        }
        if (this.field3126.field1372) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class157.field2504; var7++) {
                this.method726(arg1, (byte) -113, var7);
                int[][] var8 = this.method1256(class37.field556, 0, -10072);
                var4[var7] = var8[0][class268.field4420];
                var5[var7] = var8[1][class268.field4420];
                var6[var7] = var8[2][class268.field4420];
            }
        }
        return var3;
    }
}
