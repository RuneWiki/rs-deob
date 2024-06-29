import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class194 extends class242 {

    @OriginalMember(owner = "client!ij", name = "X", descriptor = "[J")
    public static long[] field3421 = new long[32];

    @OriginalMember(owner = "client!ij", name = "V", descriptor = "[I")
    public static int[] field3419 = new int[2];

    @OriginalMember(owner = "client!ij", name = "ab", descriptor = "Z")
    public static boolean field3424 = true;

    @OriginalMember(owner = "client!ij", name = "R", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!ij", name = "S", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!ij", name = "T", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!ij", name = "W", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!ij", name = "Y", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!ij", name = "Z", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!ij", name = "U", descriptor = "Lclient;")
    public static client field3418;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        if (arg1 == 0) {
            super.field4248 = ~arg2.method189((byte) -103) == -2;
        }
        ++field3423;
        if (arg0 > -119) {
            field3421 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "(I)V")
    public static void method1339(int arg0) {
        field3419 = null;
        field3418 = null;
        field3421 = null;
        if (arg0 != -27158) {
            field3421 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method71(boolean arg0, int arg1) {
        ++field3420;
        int[][] var3 = super.field4257.method917(arg1, 1);
        if (!arg0) {
            field3424 = true;
        }
        if (super.field4257.field2357) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class264.field4654; ++var7) {
                this.method1341(var7, arg1, (byte) 44);
                int[][] var8 = this.method1648(26484, class36.field658, 0);
                var4[var7] = var8[0][class224.field3882];
                var5[var7] = var8[1][class224.field3882];
                var6[var7] = var8[2][class224.field3882];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)[I")
    public final int[] method54(int arg0, int arg1) {
        ++field3415;
        int[] var3 = super.field4251.method1417((byte) 97, arg0);
        int var4 = -70 / ((73 - arg1) / 41);
        if (super.field4251.field3655) {
            for (int var5 = 0; ~class264.field4654 < ~var5; ++var5) {
                this.method1341(var5, arg0, (byte) 44);
                int[] var6 = this.method1647(0, class36.field658, 48);
                var3[var5] = var6[class224.field3882];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
    public class194() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIII)V")
    public static final void method1340(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class36.field654 = arg1;
        int var5 = 22 % ((arg0 - -9) / 52);
        class12.field249 = arg2;
        ++field3417;
        class89.field1440 = arg4;
        class249.field4360 = arg3;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIB)V")
    private final void method1341(int arg0, int arg1, byte arg2) {
        int var4 = class102.field1701[arg0];
        ++field3416;
        if (arg2 != 44) {
            field3419 = null;
        }
        int var5 = class117.field2106[arg1];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class36.field658 = arg1;
            class224.field3882 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class36.field658 = arg0;
            class224.field3882 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class36.field658 = arg0;
            class224.field3882 = -arg1 + class264.field4654;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class36.field658 = class25.field486 - arg1;
            class224.field3882 = arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class224.field3882 = class264.field4654 - arg0;
            class36.field658 = -arg1 + class25.field486;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class224.field3882 = -arg1 + class264.field4654;
            class36.field658 = class25.field486 - arg0;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class36.field658 = -arg0 + class25.field486;
            class224.field3882 = arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class224.field3882 = -arg0 + class264.field4654;
            class36.field658 = arg1;
        }
        class224.field3882 &= class230.field3968;
        class36.field658 &= class29.field540;
    }
}
