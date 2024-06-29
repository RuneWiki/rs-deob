import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class214 extends class74 {

    @OriginalMember(owner = "client!ol", name = "T", descriptor = "I")
    private int field3301 = 32768;

    @OriginalMember(owner = "client!ol", name = "S", descriptor = "[I")
    public static int[] field3300 = new int[99];

    @OriginalMember(owner = "client!ol", name = "P", descriptor = "I")
    public static int field3297 = 0;

    @OriginalMember(owner = "client!ol", name = "X", descriptor = "I")
    public static int field3305 = 0;

    @OriginalMember(owner = "client!ol", name = "Q", descriptor = "I")
    public static int field3298 = 0;

    @OriginalMember(owner = "client!ol", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field3308 = "wave2:";

    @OriginalMember(owner = "client!ol", name = "O", descriptor = "Z")
    public static boolean field3296 = false;

    @OriginalMember(owner = "client!ol", name = "M", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!ol", name = "N", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!ol", name = "R", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!ol", name = "U", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!ol", name = "V", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!ol", name = "Y", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!ol", name = "W", descriptor = "Luf;")
    public static class176 field3304;

    @OriginalMember(owner = "client!ol", name = "bb", descriptor = "[Z")
    public static boolean[] field3309;

    @OriginalMember(owner = "client!ol", name = "Z", descriptor = "[[[I")
    public static int[][][] field3307;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(II)V")
    public static final void method1428(int arg0, int arg1) {
        if (arg0 != 255) {
            method1428(-99, 46);
        }
        class32.field516 = -1;
        ++field3302;
        class13.field223 = -1;
        class72.field1140 = false;
        class174.field2583 = 0;
        class295.field4641 = 1;
        class297.field4700 = arg1;
        class219.field3420 = null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)[I")
    public final int[] method448(int arg0, int arg1) {
        ++field3299;
        int[] var3 = super.field1254.method1328((byte) -108, arg1);
        if (arg0 != 4) {
            this.method82(49, (byte) -94);
        }
        if (super.field1254.field3118) {
            int[] var4 = this.method590(arg0 ^ 4, 1, arg1);
            int[] var5 = this.method590(0, 2, arg1);
            for (int var6 = 0; class178.field2662 > var6; ++var6) {
                int var7 = var5[var6] * this.field3301 >> 12;
                int var8 = (var4[var6] & 4094) >> 4;
                int var9 = class221.field3456[var8] * var7 >> 12;
                int var10 = class11.field214[var8] * var7 >> 12;
                int var11 = (var9 >> 12) + var6 & class129.field2012;
                int var12 = (var10 >> 12) + arg1 & class218.field3419;
                int[] var13 = this.method590(arg0 ^ 4, 0, var12);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        ++field3294;
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field1245 = ~arg1.method333((byte) -59) == -2;
            }
        } else {
            this.field3301 = arg1.method293(-38) << 4;
        }
        if (arg0 != -79) {
            field3300 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IB)[[I")
    public final int[][] method82(int arg0, byte arg1) {
        int[][] var3 = super.field1248.method269(false, arg0);
        if (super.field1248.field550) {
            int[] var4 = this.method590(0, 1, arg0);
            int[] var5 = this.method590(0, 2, arg0);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            for (int var9 = 0; ~class178.field2662 < ~var9; ++var9) {
                int var10 = (1046157 & var4[var9] * 255) >> 12;
                int var11 = var5[var9] * this.field3301 >> 12;
                int var12 = class11.field214[var10] * var11 >> 12;
                int var13 = class221.field3456[var10] * var11 >> 12;
                int var14 = (var13 >> 12) + var9 & class129.field2012;
                int var15 = class218.field3419 & (var12 >> 12) + arg0;
                int[][] var16 = this.method592(var15, 0, 106);
                var7[var9] = var16[0][var14];
                var6[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        ++field3303;
        return arg1 > -112 ? null : var3;
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(Z)V")
    public final void method493(boolean arg0) {
        class87.method698(arg0);
        ++field3306;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
    public class214() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IJ)V")
    public static final void method1429(int arg0, long arg1) {
        ++field3295;
        if (~arg1 != -1L) {
            if (arg0 != -20460) {
                field3297 = -63;
            }
            for (int var3 = 0; var3 < class132.field2037; ++var3) {
                if (class295.field4629[var3] == arg1) {
                    --class132.field2037;
                    ++class203.field3174;
                    for (int var4 = var3; ~class132.field2037 < ~var4; ++var4) {
                        class295.field4629[var4] = class295.field4629[var4 + 1];
                        class107.field1711[var4] = class107.field1711[var4 + 1];
                        class130.field2025[var4] = class130.field2025[var4 + 1];
                    }
                    class65.field1027 = class141.field2178;
                    class292.field4607.method1251(247, (byte) -90);
                    class292.field4607.method337(arg0 + 2103240188, arg1);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "(I)V")
    public static void method1430(int arg0) {
        field3300 = null;
        field3309 = null;
        field3308 = null;
        field3307 = null;
        field3304 = null;
        if (arg0 < 94) {
            method1430(126);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; ~var1 > -100; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
            var0 += var3;
            field3300[var1] = var0 / 4;
        }
    }
}
