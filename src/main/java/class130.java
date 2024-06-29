import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class130 extends class205 {

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "[I")
    public static int[] field2525 = new int[500];

    @OriginalMember(owner = "client!mb", name = "eb", descriptor = "I")
    public static int field2528 = 0;

    @OriginalMember(owner = "client!mb", name = "fb", descriptor = "Z")
    public static boolean field2529 = false;

    @OriginalMember(owner = "client!mb", name = "jb", descriptor = "Lvd;")
    public static class222 field2533 = class212.method1357("W-=hlen Sie eine Welt", 10731);

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!mb", name = "cb", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!mb", name = "db", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!mb", name = "gb", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!mb", name = "kb", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "Lve;")
    public static class223 field2520;

    @OriginalMember(owner = "client!mb", name = "hb", descriptor = "Lve;")
    public static class223 field2531;

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2523;

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "[I")
    public static int[] field2522;

    @OriginalMember(owner = "client!mb", name = "ib", descriptor = "[[[B")
    public static byte[][][] field2532;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)Lte;")
    public static final class203 method816(int arg0) {
        if (class131.field2539 == null) {
            class131.field2539 = new class203();
        }
        if (arg0 >= -102) {
            field2532 = null;
        }
        ++field2526;
        return class131.field2539;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(IIIIIIII)V")
    public static final void method817(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2521;
        int var8 = arg4 - arg3;
        int var9 = arg7 - arg3;
        int var10 = arg1 + arg3;
        int var11 = arg2 + arg3;
        if (arg6 == -10359) {
            for (int var12 = arg2; ~var12 > ~var11; ++var12) {
                class81.method532(arg1, arg0, class156.field2981[var12], arg7, -7);
            }
            for (int var13 = arg4; var8 < var13; --var13) {
                class81.method532(arg1, arg0, class156.field2981[var13], arg7, -7);
            }
            for (int var14 = var11; ~var14 >= ~var8; ++var14) {
                int[] var15 = class156.field2981[var14];
                class81.method532(arg1, arg0, var15, var10, -7);
                class81.method532(var10, arg5, var15, var9, -7);
                class81.method532(var9, arg0, var15, arg7, -7);
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "(I)V")
    public static void method818(int arg0) {
        field2523 = null;
        int var1 = 71 / ((arg0 - -5) / 36);
        field2533 = null;
        field2525 = null;
        field2522 = null;
        field2532 = null;
        field2520 = null;
        field2531 = null;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(III)V")
    private final void method819(int arg0, int arg1, int arg2) {
        int var4 = class230.field4319[arg1];
        if (arg2 < 38) {
            this.method819(125, 64, -31);
        }
        int var5 = class218.field4051[arg0];
        ++field2534;
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class205.field3804 = arg1;
            class121.field2304 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class205.field3804 = arg0;
            class121.field2304 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class121.field2304 = arg1;
            class205.field3804 = -arg0 + class118.field2245;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class121.field2304 = -arg0 + class134.field2598;
            class205.field3804 = arg1;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class205.field3804 = -arg1 + class118.field2245;
            class121.field2304 = -arg0 + class134.field2598;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class205.field3804 = -arg0 + class118.field2245;
            class121.field2304 = -arg1 + class134.field2598;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class121.field2304 = -arg1 + class134.field2598;
            class205.field3804 = arg0;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class121.field2304 = arg0;
            class205.field3804 = -arg1 + class118.field2245;
        }
        class121.field2304 &= class17.field433;
        class205.field3804 &= class159.field3039;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class130() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        ++field2524;
        if (arg0 != 0) {
            return null;
        } else {
            int[] var3 = super.field3810.method557(arg0 + 6978, arg1);
            if (super.field3810.field1635) {
                for (int var4 = 0; ~var4 > ~class118.field2245; ++var4) {
                    this.method819(arg1, var4, 123);
                    int[] var5 = this.method1322(class121.field2304, (byte) 79, 0);
                    var3[var4] = var5[class205.field3804];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        ++field2519;
        int var4 = -10 / ((-47 - arg1) / 34);
        if (~arg2 == -1) {
            super.field3812 = arg0.method662((byte) -88) == 1;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)[[I")
    public final int[][] method96(int arg0, byte arg1) {
        ++field2527;
        if (arg1 < 98) {
            field2533 = null;
        }
        int[][] var3 = super.field3815.method1003(-8357, arg0);
        if (super.field3815.field3015) {
            int[] var4 = var3[1];
            int[] var5 = var3[2];
            int[] var6 = var3[0];
            for (int var7 = 0; ~class118.field2245 < ~var7; ++var7) {
                this.method819(arg0, var7, 116);
                int[][] var8 = this.method1323(0, class121.field2304, -5920);
                var6[var7] = var8[0][class205.field3804];
                var4[var7] = var8[1][class205.field3804];
                var5[var7] = var8[2][class205.field3804];
            }
        }
        return var3;
    }
}
