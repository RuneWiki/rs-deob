import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class25 extends class147 {

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "I")
    private int field323 = 0;

    @OriginalMember(owner = "client!kb", name = "T", descriptor = "I")
    private int field327 = -1;

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "I")
    public static int field320 = 0;

    @OriginalMember(owner = "client!kb", name = "S", descriptor = "Lqj;")
    private static class196 field326 = class80.method502("Loaded sprites", -48);

    @OriginalMember(owner = "client!kb", name = "H", descriptor = "Lqj;")
    public static class196 field316 = field326;

    @OriginalMember(owner = "client!kb", name = "F", descriptor = "D")
    public static double field315;

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "I")
    public int field314;

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
    public int field318;

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "I")
    public int field322;

    @OriginalMember(owner = "client!kb", name = "Q", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!kb", name = "U", descriptor = "I")
    public int field328;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V")
    public static void method143(int arg0) {
        int var1 = 0 % ((-arg0 - 60) / 55);
        field316 = null;
        field326 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)Z")
    public static final boolean method144(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class93.field1362; var3++) {
            class175 var4 = class197.field3497[var3];
            if (var4.field2945 == 1) {
                int var5 = var4.field2942 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field2939 * var5 >> 8) + var4.field2950;
                    int var7 = (var4.field2962 * var5 >> 8) + var4.field2960;
                    int var8 = (var4.field2959 * var5 >> 8) + var4.field2954;
                    int var9 = (var4.field2940 * var5 >> 8) + var4.field2952;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field2945 == 2) {
                int var10 = arg0 - var4.field2942;
                if (var10 > 0) {
                    int var11 = (var4.field2939 * var10 >> 8) + var4.field2950;
                    int var12 = (var4.field2962 * var10 >> 8) + var4.field2960;
                    int var13 = (var4.field2959 * var10 >> 8) + var4.field2954;
                    int var14 = (var4.field2940 * var10 >> 8) + var4.field2952;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field2945 == 3) {
                int var15 = var4.field2950 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field2956 * var15 >> 8) + var4.field2942;
                    int var17 = (var4.field2957 * var15 >> 8) + var4.field2948;
                    int var18 = (var4.field2959 * var15 >> 8) + var4.field2954;
                    int var19 = (var4.field2940 * var15 >> 8) + var4.field2952;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field2945 == 4) {
                int var20 = arg2 - var4.field2950;
                if (var20 > 0) {
                    int var21 = (var4.field2956 * var20 >> 8) + var4.field2942;
                    int var22 = (var4.field2957 * var20 >> 8) + var4.field2948;
                    int var23 = (var4.field2959 * var20 >> 8) + var4.field2954;
                    int var24 = (var4.field2940 * var20 >> 8) + var4.field2952;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field2945 == 5) {
                int var25 = arg1 - var4.field2954;
                if (var25 > 0) {
                    int var26 = (var4.field2956 * var25 >> 8) + var4.field2942;
                    int var27 = (var4.field2957 * var25 >> 8) + var4.field2948;
                    int var28 = (var4.field2939 * var25 >> 8) + var4.field2950;
                    int var29 = (var4.field2962 * var25 >> 8) + var4.field2960;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)V")
    private final void method145(byte arg0, int arg1) {
        field325++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = 0.0D;
        double var13 = var3;
        double var15 = 0.0D;
        if (var5 > var3) {
            var13 = var5;
        }
        if (arg0 > -88) {
            method143(-12);
        }
        if (var7 > var13) {
            var13 = var7;
        }
        double var17 = (var9 + var13) / 2.0D;
        if (var9 != var13) {
            if (var17 < 0.5D) {
                var15 = (var13 - var9) / (var9 + var13);
            }
            if (var17 >= 0.5D) {
                var15 = (var13 - var9) / (2.0D - var13 - var9);
            }
            if (var3 == var13) {
                var11 = (var5 - var7) / (var13 - var9);
            } else if (var5 == var13) {
                var11 = (var7 - var3) / (var13 - var9) + 2.0D;
            } else if (var7 == var13) {
                var11 = (var3 - var5) / (var13 - var9) + 4.0D;
            }
        }
        this.field328 = (int) (var17 * 256.0D);
        if (this.field328 < 0) {
            this.field328 = 0;
        } else if (this.field328 > 255) {
            this.field328 = 255;
        }
        if (var17 > 0.5D) {
            this.field318 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field318 = (int) (var15 * var17 * 512.0D);
        }
        this.field322 = (int) (var15 * 256.0D);
        double var19 = var11 / 6.0D;
        if (this.field322 < 0) {
            this.field322 = 0;
        } else if (this.field322 > 255) {
            this.field322 = 255;
        }
        if (this.field318 < 1) {
            this.field318 = 1;
        }
        this.field314 = (int) ((double) this.field318 * var19);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILp;II)V")
    private final void method146(int arg0, class56 arg1, int arg2, int arg3) {
        if (arg2 == 1) {
            this.field323 = arg1.method328(-1974);
            this.method145((byte) -96, this.field323);
        } else if (arg2 == 2) {
            this.field327 = arg1.method318(true);
            if (this.field327 == 65535) {
                this.field327 = -1;
            }
        } else if (arg2 == 3) {
            arg1.method318(true);
        }
        field317++;
        if (arg3 != -25733) {
            this.field327 = 50;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III[II)V")
    public static final void method147(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        arg2--;
        field324++;
        int var11 = arg4 - 1;
        int var5 = var11 - arg1;
        while (arg2 < var5) {
            int var6 = arg2 + 1;
            arg3[var6] = arg0;
            int var7 = var6 + 1;
            arg3[var7] = arg0;
            int var8 = var7 + 1;
            arg3[var8] = arg0;
            int var9 = var8 + 1;
            arg3[var9] = arg0;
            int var10 = var9 + 1;
            arg3[var10] = arg0;
            int var12 = var10 + 1;
            arg3[var12] = arg0;
            int var13 = var12 + 1;
            arg3[var13] = arg0;
            arg2 = var13 + 1;
            arg3[arg2] = arg0;
        }
        while (arg2 < var11) {
            arg2++;
            arg3[arg2] = arg0;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lp;IB)V")
    public final void method148(class56 arg0, int arg1, byte arg2) {
        while (true) {
            int var4 = arg0.method367(1);
            if (var4 == 0) {
                field319++;
                if (arg2 >= -13) {
                    this.method146(-44, null, -57, -96);
                    return;
                }
                return;
            }
            this.method146(arg1, arg0, var4, -25733);
        }
    }
}
