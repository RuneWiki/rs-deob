import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class192 extends class102 {

    @OriginalMember(owner = "client!rh", name = "T", descriptor = "I")
    public static int field3581 = 0;

    @OriginalMember(owner = "client!rh", name = "V", descriptor = "Lqe;")
    private static class179 field3583 = class206.method1380("Your ignore list is full)3 Max of 100 users)3", (byte) -128);

    @OriginalMember(owner = "client!rh", name = "U", descriptor = "Lqe;")
    public static class179 field3582 = field3583;

    @OriginalMember(owner = "client!rh", name = "S", descriptor = "Lqe;")
    private static class179 field3580 = class206.method1380("flash1:", (byte) 88);

    @OriginalMember(owner = "client!rh", name = "Q", descriptor = "Lqe;")
    public static class179 field3578 = field3580;

    @OriginalMember(owner = "client!rh", name = "P", descriptor = "Lqe;")
    public static class179 field3577 = field3580;

    @OriginalMember(owner = "client!rh", name = "N", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!rh", name = "R", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!rh", name = "W", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!rh", name = "Y", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!rh", name = "Z", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!rh", name = "X", descriptor = "Lbb;")
    public static class14 field3585;

    @OriginalMember(owner = "client!rh", name = "O", descriptor = "Lra;")
    public static class185 field3576;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZI)[I")
    public final int[] method11(boolean arg0, int arg1) {
        if (!arg0) {
            field3580 = null;
        }
        int[] var3 = super.field1960.method699((byte) -74, arg1);
        ++field3575;
        if (super.field1960.field2007) {
            for (int var4 = 0; var4 < class155.field2796; ++var4) {
                this.method1292(var4, arg1, true);
                int[] var5 = this.method679(class109.field2031, 0, (byte) -109);
                var3[var4] = var5[class236.field4348];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        if (arg1 != 64) {
            field3583 = null;
        }
        ++field3587;
        int[][] var3 = super.field1950.method598((byte) -103, arg0);
        if (super.field1950.field1724) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class155.field2796; ++var7) {
                this.method1292(var7, arg0, true);
                int[][] var8 = this.method677(66, class109.field2031, 0);
                var4[var7] = var8[0][class236.field4348];
                var5[var7] = var8[1][class236.field4348];
                var6[var7] = var8[2][class236.field4348];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
    public class192() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lqe;B)I")
    public static final int method1290(class179 arg0, byte arg1) {
        int var2 = 121 % ((-10 - arg1) / 37);
        ++field3579;
        return arg0.method1168(true) + 1;
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)V")
    public static void method1291(int arg0) {
        field3585 = null;
        field3577 = null;
        field3576 = null;
        field3580 = null;
        field3583 = null;
        field3578 = null;
        if (arg0 == 0) {
            field3582 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        if (~arg1 == -1) {
            super.field1957 = arg0.method1243(3) == 1;
        }
        ++field3586;
        if (arg2) {
            this.method14(-8, 31);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIZ)V")
    private final void method1292(int arg0, int arg1, boolean arg2) {
        ++field3584;
        int var4 = class124.field2292[arg0];
        int var5 = class94.field1769[arg1];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class109.field2031 = arg1;
            class236.field4348 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class109.field2031 = arg0;
            class236.field4348 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class109.field2031 = arg0;
            class236.field4348 = -arg1 + class155.field2796;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class236.field4348 = arg0;
            class109.field2031 = -arg1 + class117.field2216;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class109.field2031 = -arg1 + class117.field2216;
            class236.field4348 = class155.field2796 - arg0;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class236.field4348 = -arg1 + class155.field2796;
            class109.field2031 = -arg0 + class117.field2216;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class236.field4348 = arg1;
            class109.field2031 = class117.field2216 - arg0;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class109.field2031 = arg1;
            class236.field4348 = class155.field2796 - arg0;
        }
        if (arg2) {
            class236.field4348 &= class227.field4193;
            class109.field2031 &= class233.field4296;
        }
    }
}
