import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class449 extends class667 {

    @OriginalMember(owner = "client!uda", name = "H", descriptor = "I")
    public static int field6222 = 0;

    @OriginalMember(owner = "client!uda", name = "K", descriptor = "D")
    public static double field6224;

    @OriginalMember(owner = "client!uda", name = "B", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!uda", name = "C", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!uda", name = "D", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!uda", name = "E", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!uda", name = "F", descriptor = "I")
    public static int field6220;

    @OriginalMember(owner = "client!uda", name = "G", descriptor = "I")
    public static int field6221;

    @OriginalMember(owner = "client!uda", name = "I", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!uda", name = "L", descriptor = "I")
    public static int field6225;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(ZI)[[I", line = 3)
    public final int[][] method777(boolean arg0, int arg1) {
        if (arg0) {
            field6224 = 0.1711035702815851D;
        }
        ++field6220;
        int[][] var3 = super.field9357.method2314((byte) 41, arg1);
        if (super.field9357.field5178) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class77.field1455 > var7; ++var7) {
                this.method2677((byte) -85, arg1, var7);
                int[][] var8 = this.method3748(class236.field3345, 0, 0);
                var4[var7] = var8[0][class317.field4503];
                var5[var7] = var8[1][class317.field4503];
                var6[var7] = var8[2][class317.field4503];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IB)V", line = 45)
    public static final void method2674(int arg0, byte arg1) {
        class548.field7724 = new int[arg0];
        class182.field2601 = new int[arg0];
        if (arg1 > -117) {
            method2676(54, 55);
        }
        class57.field1058 = new int[arg0];
        class135.field2113 = new int[arg0];
        class361.field5063 = new int[arg0];
        ++field6219;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IZ)V", line = 64)
    public static final void method2675(int arg0, boolean arg1) {
        class583.field8235.method3049(arg0, (byte) 126);
        ++field6225;
        if (!arg1) {
            method2674(-83, (byte) 51);
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(II)Z", line = 76)
    public static final boolean method2676(int arg0, int arg1) {
        ++field6218;
        if (arg1 < 22) {
            method2675(-103, false);
        }
        if (arg0 != 45 && arg0 != 48 && ~arg0 != -10 && ~arg0 != -59 && ~arg0 != -4) {
            return arg0 == 50 || ~arg0 == -1003;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uda", name = "<init>", descriptor = "()V", line = 97)
    public class449() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lud;II)V", line = 106)
    public final void method116(class35 arg0, int arg1, int arg2) {
        ++field6221;
        if (~arg2 == -1) {
            super.field9344 = ~arg0.method273(255) == -2;
        }
        if (arg1 != 3) {
            field6224 = -0.6447053658907221D;
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(BI)[I", line = 121)
    public final int[] method117(byte arg0, int arg1) {
        ++field6223;
        int[] var3 = super.field9355.method1744(arg1, -2);
        if (arg0 >= -87) {
            field6222 = -43;
        }
        if (super.field9355.field3728) {
            for (int var4 = 0; class77.field1455 > var4; ++var4) {
                this.method2677((byte) -85, arg1, var4);
                int[] var5 = this.method3744(class236.field3345, (byte) 120, 0);
                var3[var4] = var5[class317.field4503];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(BII)V", line = 155)
    private final void method2677(byte arg0, int arg1, int arg2) {
        ++field6216;
        int var4 = class20.field261[arg2];
        if (arg0 == -85) {
            int var5 = class385.field5384[arg1];
            float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class317.field4503 = arg2;
                class236.field3345 = arg1;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class236.field3345 = arg2;
                class317.field4503 = arg1;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class236.field3345 = arg2;
                class317.field4503 = -arg1 + class77.field1455;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class317.field4503 = arg2;
                class236.field3345 = -arg1 + class694.field9758;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class236.field3345 = -arg1 + class694.field9758;
                class317.field4503 = class77.field1455 - arg2;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class236.field3345 = class694.field9758 - arg2;
                class317.field4503 = -arg1 + class77.field1455;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class317.field4503 = arg1;
                class236.field3345 = -arg2 + class694.field9758;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class317.field4503 = -arg2 + class77.field1455;
                class236.field3345 = arg1;
            }
            class317.field4503 &= class439.field6131;
            class236.field3345 &= class77.field1453;
        }
    }
}
