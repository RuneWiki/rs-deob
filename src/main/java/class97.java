import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class97 extends class189 {

    @OriginalMember(owner = "client!kg", name = "mb", descriptor = "I")
    public static int field2304 = 0;

    @OriginalMember(owner = "client!kg", name = "pb", descriptor = "[I")
    public static int[] field2307 = new int[100];

    @OriginalMember(owner = "client!kg", name = "lb", descriptor = "Lle;")
    public static class104 field2303 = new class104(5000);

    @OriginalMember(owner = "client!kg", name = "rb", descriptor = "Lgg;")
    private static class63 field2309 = class116.method911(43, "Hidden");

    @OriginalMember(owner = "client!kg", name = "vb", descriptor = "Lgg;")
    public static class63 field2313 = field2309;

    @OriginalMember(owner = "client!kg", name = "gb", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!kg", name = "hb", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!kg", name = "ib", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!kg", name = "jb", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!kg", name = "kb", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!kg", name = "nb", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!kg", name = "ob", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!kg", name = "qb", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!kg", name = "ub", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!kg", name = "tb", descriptor = "Lmd;")
    public static class112 field2311;

    @OriginalMember(owner = "client!kg", name = "wb", descriptor = "[I")
    public static int[] field2314;

    @OriginalMember(owner = "client!kg", name = "sb", descriptor = "[[[I")
    public static int[][][] field2310;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(III)Lma;")
    public static final class109 method832(int arg0, int arg1, int arg2) {
        class96 var3 = class148.field3117[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2271;
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)V")
    public static void method833(int arg0) {
        int var1 = 51 % ((-17 - arg0) / 58);
        field2311 = null;
        field2303 = null;
        field2314 = null;
        field2313 = null;
        field2309 = null;
        field2310 = null;
        field2307 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IBLab;)V")
    public final void method77(int arg0, byte arg1, class3 arg2) {
        if (arg1 < 32) {
            this.method77(96, (byte) 35, (class3) null);
        }
        if (~arg0 == -1) {
            super.field3811 = arg2.method64(31790) == 1;
        }
        ++field2299;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILjava/util/Random;I)I")
    public static final int method834(int arg0, Random arg1, int arg2) {
        ++field2302;
        if (arg2 <= arg0) {
            throw new IllegalArgumentException();
        } else if (class131.method964(arg2, true)) {
            return (int) ((long) arg2 * (4294967295L & (long) arg1.nextInt()) >> 32);
        } else {
            int var3 = -((int) (4294967296L % (long) arg2)) + Integer.MIN_VALUE;
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var4 >= var3);
            return class68.method629(var4, 16950, arg2);
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
    public class97() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        int[] var3 = super.field3825.method681(arg1, (byte) -59);
        if (arg0 != 0) {
            field2303 = null;
        }
        if (super.field3825.field1840) {
            for (int var4 = 0; ~var4 > ~class54.field1430; ++var4) {
                this.method835(19928, var4, arg1);
                int[] var5 = this.method1245(0, class182.field3690, 11433);
                var3[var4] = var5[class203.field4035];
            }
        }
        ++field2305;
        return var3;
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(III)V")
    private final void method835(int arg0, int arg1, int arg2) {
        int var4 = class35.field825[arg1];
        ++field2306;
        int var5 = class21.field496[arg2];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class203.field4035 = arg1;
            class182.field3690 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class203.field4035 = arg2;
            class182.field3690 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class203.field4035 = -arg2 + class54.field1430;
            class182.field3690 = arg1;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class182.field3690 = class12.field287 - arg2;
            class203.field4035 = arg1;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class203.field4035 = -arg1 + class54.field1430;
            class182.field3690 = -arg2 + class12.field287;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class182.field3690 = -arg1 + class12.field287;
            class203.field4035 = class54.field1430 - arg2;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class182.field3690 = -arg1 + class12.field287;
            class203.field4035 = arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class203.field4035 = -arg1 + class54.field1430;
            class182.field3690 = arg2;
        }
        if (arg0 != 19928) {
            field2312 = 19;
        }
        class203.field4035 &= class75.field1867;
        class182.field3690 &= class1.field4;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)[[I")
    public final int[][] method83(int arg0, int arg1) {
        int[][] var3 = super.field3808.method237(-1, arg0);
        ++field2300;
        if (arg1 <= 34) {
            return null;
        } else {
            int[] var4 = var3[2];
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            if (super.field3808.field561) {
                for (int var7 = 0; var7 < class54.field1430; ++var7) {
                    this.method835(19928, var7, arg0);
                    int[][] var8 = this.method1244((byte) 20, class182.field3690, 0);
                    var5[var7] = var8[0][class203.field4035];
                    var6[var7] = var8[1][class203.field4035];
                    var4[var7] = var8[2][class203.field4035];
                }
            }
            return var3;
        }
    }
}
