import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class530 extends class751 {

    @OriginalMember(owner = "client!od", name = "D", descriptor = "[I")
    public static int[] field7511 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!od", name = "L", descriptor = "J")
    public static long field7517 = 0L;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "I")
    public static int field7509;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "I")
    public static int field7510;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "I")
    public static int field7512;

    @OriginalMember(owner = "client!od", name = "F", descriptor = "I")
    public static int field7513;

    @OriginalMember(owner = "client!od", name = "G", descriptor = "I")
    public static int field7514;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "I")
    public static int field7515;

    @OriginalMember(owner = "client!od", name = "K", descriptor = "I")
    public static int field7516;

    @OriginalMember(owner = "client!od", name = "M", descriptor = "I")
    public static int field7518;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILrv;I)V", line = 3)
    public final void method309(int arg0, class120 arg1, int arg2) {
        if (arg2 == 0) {
            super.field10415 = arg1.method842(2384) == 1;
        }
        ++field7518;
        int var4 = 74 % ((25 - arg0) / 63);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lwq;BLwq;)V", line = 15)
    public static final void method3076(class176 arg0, byte arg1, class176 arg2) {
        ++field7510;
        ++class124.field1624;
        if (arg1 != 5) {
            field7517 = -127L;
        }
        class731 var3 = class155.method1222(260, class176.field2675, class237.field3417);
        var3.field10211.method879((byte) 108, arg2.field2588);
        var3.field10211.method896(arg0.field2540, (byte) 89);
        var3.field10211.method879((byte) -113, arg0.field2588);
        var3.field10211.method856(-127, arg2.field2612);
        var3.field10211.method856(-117, arg2.field2540);
        var3.field10211.method832(84, arg0.field2612);
        class533.method3088(var3, arg1 ^ 5);
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(III)V", line = 35)
    public static final void method3077(int arg0, int arg1, int arg2) {
        ++field7512;
        if (arg0 <= 50) {
            method3079(-93, 100, 44);
        }
        if (class420.method2512((byte) 43, arg1)) {
            class418.method2498(arg2, (byte) 92, class110.field1382[arg1]);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V", line = 51)
    public static void method3078(boolean arg0) {
        field7511 = null;
        if (!arg0) {
            method3078(true);
        }
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(III)Z", line = 68)
    public static final boolean method3079(int arg0, int arg1, int arg2) {
        ++field7514;
        if (arg0 != 0) {
            method3077(-93, -16, 38);
        }
        return ~(arg1 & 2048) != -1;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)[[I", line = 79)
    public final int[][] method147(int arg0, byte arg1) {
        ++field7509;
        int[][] var3 = super.field10409.method3474(2132, arg0);
        if (arg1 != 57) {
            field7517 = -127L;
        }
        if (super.field10409.field8481) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class673.field9452 > var7; ++var7) {
                this.method3080((byte) 70, arg0, var7);
                int[][] var8 = this.method4172(0, class585.field8279, arg1 ^ 56);
                var4[var7] = var8[0][class291.field4415];
                var5[var7] = var8[1][class291.field4415];
                var6[var7] = var8[2][class291.field4415];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V", line = 121)
    public class530() {
        super(1, false);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BII)V", line = 124)
    private final void method3080(byte arg0, int arg1, int arg2) {
        ++field7513;
        if (arg0 == 70) {
            int var4 = class179.field2708[arg2];
            int var5 = class619.field8728[arg1];
            float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class585.field8279 = arg1;
                class291.field4415 = arg2;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class291.field4415 = arg1;
                class585.field8279 = arg2;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class291.field4415 = -arg1 + class673.field9452;
                class585.field8279 = arg2;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class291.field4415 = arg2;
                class585.field8279 = class152.field2253 - arg1;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class291.field4415 = -arg2 + class673.field9452;
                class585.field8279 = -arg1 + class152.field2253;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class291.field4415 = -arg1 + class673.field9452;
                class585.field8279 = -arg2 + class152.field2253;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class291.field4415 = arg1;
                class585.field8279 = class152.field2253 - arg2;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class585.field8279 = arg1;
                class291.field4415 = -arg2 + class673.field9452;
            }
            class585.field8279 &= class348.field5094;
            class291.field4415 &= class407.field5754;
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(IBI)Z", line = 199)
    public static final boolean method3081(int arg0, byte arg1, int arg2) {
        ++field7516;
        int var3 = -65 / ((-56 - arg1) / 48);
        return ~(arg0 & 1048832) != -1;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)[I", line = 214)
    public final int[] method365(int arg0, int arg1) {
        ++field7515;
        if (arg1 != 4095) {
            field7517 = 64L;
        }
        int[] var3 = super.field10405.method3601(true, arg0);
        if (super.field10405.field8923) {
            for (int var4 = 0; var4 < class673.field9452; ++var4) {
                this.method3080((byte) 70, arg0, var4);
                int[] var5 = this.method4173(class585.field8279, (byte) -113, 0);
                var3[var4] = var5[class291.field4415];
            }
        }
        return var3;
    }
}
