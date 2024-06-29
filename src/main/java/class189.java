import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class189 extends class192 {

    @OriginalMember(owner = "client!m", name = "H", descriptor = "F")
    public float field2719;

    @OriginalMember(owner = "client!m", name = "J", descriptor = "I")
    public int field2720;

    @OriginalMember(owner = "client!m", name = "L", descriptor = "F")
    public float field2722;

    @OriginalMember(owner = "client!m", name = "T", descriptor = "Z")
    public boolean field2730;

    @OriginalMember(owner = "client!m", name = "O", descriptor = "I")
    public int field2725;

    @OriginalMember(owner = "client!m", name = "A", descriptor = "[[I")
    public static int[][] field2718 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!m", name = "P", descriptor = "Lqe;")
    public static class465 field2726 = new class465(35, 6);

    @OriginalMember(owner = "client!m", name = "K", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!m", name = "M", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!m", name = "R", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!m", name = "S", descriptor = "[I")
    public static int[] field2729;

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Loea;IIIIIIZ)V")
    public class189(class594 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field2719 = (float) arg4 / (float) arg6;
        this.field2720 = arg3;
        this.field2722 = (float) arg3 / (float) arg5;
        this.field2730 = false;
        this.field2725 = arg4;
        this.method1346((byte) -81, false, false);
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Loea;IIIZ[III)V")
    public class189(class594 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field2720 = arg2;
        this.field2725 = arg3;
        if (super.field1567 != 34037) {
            this.field2722 = this.field2719 = 1.0F;
            this.field2730 = true;
        } else {
            this.field2730 = false;
            this.field2722 = (float) arg2;
            this.field2719 = (float) arg3;
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Loea;IIIIZ[BI)V")
    public class189(class594 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (super.field1567 == 34037) {
            this.field2719 = (float) arg4;
            this.field2722 = (float) arg3;
            this.field2730 = false;
        } else {
            this.field2722 = this.field2719 = 1.0F;
            this.field2730 = true;
        }
        this.field2725 = arg4;
        this.field2720 = arg3;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Loea;IIIII)V")
    public class189(class594 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field2719 = (float) arg3 / (float) arg5;
        this.field2730 = false;
        this.field2720 = arg2;
        this.field2725 = arg3;
        this.field2722 = (float) arg2 / (float) arg4;
        this.method1346((byte) -62, false, false);
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(III)Z")
    public static final boolean method1330(int arg0, int arg1, int arg2) {
        ++field2721;
        if (!class135.method1070(0, arg0, arg2)) {
            return false;
        } else if (class152.method1167(arg2, arg0, (byte) 84) | (36864 & arg0) != 0 | class716.method3988(arg0, arg2, true)) {
            return true;
        } else {
            return arg1 != 21721 ? true : (class452.method2693(arg1 ^ -22266, arg0, arg2) | (arg0 & 8192) != 0 | class247.method1648((byte) -23, arg2, arg0)) & ~(arg2 & 55) == -1;
        }
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(I)V")
    public static void method1331(int arg0) {
        field2729 = null;
        field2726 = null;
        if (arg0 > 100) {
            field2718 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Loea;IIII)V")
    public class189(class594 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        if (super.field1567 == 34037) {
            this.field2719 = (float) arg4;
            this.field2722 = (float) arg3;
            this.field2730 = false;
        } else {
            this.field2722 = this.field2719 = 1.0F;
            this.field2730 = true;
        }
        this.field2720 = arg3;
        this.field2725 = arg4;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(Z)V")
    public static final void method1332(boolean arg0) {
        ++field2723;
        if (class611.field8842 != 0) {
            try {
                if (++class120.field1873 > 2000) {
                    if (class555.field7776 != null) {
                        class555.field7776.method67(-1);
                        class555.field7776 = null;
                    }
                    if (~class229.field3272 <= -3) {
                        class582.field8223 = -5;
                        class611.field8842 = 0;
                        return;
                    }
                    class232.field3298.method3401(-99);
                    class120.field1873 = 0;
                    ++class229.field3272;
                    class611.field8842 = 1;
                }
                if (class611.field8842 == 1) {
                    class175.field2546 = class232.field3298.method3402((byte) -125, class341.field4796);
                    class611.field8842 = 2;
                }
                if (class611.field8842 == 2) {
                    if (class175.field2546.field9091 == 2) {
                        throw new IOException();
                    }
                    if (~class175.field2546.field9091 != -2) {
                        return;
                    }
                    class555.field7776 = class151.method1165(7500, (Socket) class175.field2546.field9093, 0);
                    class175.field2546 = null;
                    class464.method2823((byte) 114);
                    class611.field8842 = 4;
                }
                if (~class611.field8842 == -5) {
                    if (class555.field7776.method66(1, -113)) {
                        class555.field7776.method68(0, 1, class644.field9146.field483, -1);
                        int var1 = class644.field9146.field483[0] & 255;
                        class611.field8842 = 0;
                        class582.field8223 = var1;
                        class555.field7776.method67(-1);
                        class555.field7776 = null;
                    }
                } else if (!arg0) {
                    field2726 = null;
                }
            } catch (IOException var2) {
                if (class555.field7776 != null) {
                    class555.field7776.method67(-1);
                    class555.field7776 = null;
                }
                if (~class229.field3272 > -3) {
                    class232.field3298.method3401(-124);
                    class120.field1873 = 0;
                    ++class229.field3272;
                    class611.field8842 = 1;
                } else {
                    class582.field8223 = -4;
                    class611.field8842 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Loea;IIIIIZ)V")
    public class189(class594 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field2725 = arg5;
        if (~super.field1567 != -34038) {
            this.field2730 = true;
            this.field2722 = this.field2719 = 1.0F;
        } else {
            this.field2719 = (float) arg5;
            this.field2730 = false;
            this.field2722 = (float) arg4;
        }
        this.field2720 = arg4;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Loea;IIII[I)V")
    public class189(class594 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field2720 = arg1;
        this.field2725 = arg2;
        this.method1347(0, (byte) -70, 0, arg1, true, arg2, 0, 0, arg5);
        this.field2722 = (float) arg1 / (float) arg3;
        this.field2719 = (float) arg2 / (float) arg4;
        this.field2730 = false;
        this.method1346((byte) -96, false, false);
    }

    @OriginalMember(owner = "client!m", name = "f", descriptor = "(I)[Lqe;")
    public static final class465[] method1333(int arg0) {
        ++field2727;
        int var1 = -33 / ((arg0 - 29) / 44);
        return new class465[] { class562.field7971, class285.field4052, class674.field9470, class52.field946, class603.field8760, class709.field9911, class49.field700, class402.field5611, class643.field9139, class392.field5504, class423.field5925, class284.field4040, class150.field2271, class186.field2632, class564.field7976, class647.field9165, class339.field4775, class590.field8287, class93.field1620, class132.field1999, class211.field3042, class46.field682, class174.field2524, class681.field9585, class604.field8781, class146.field2241, class327.field4629, class444.field6175, class162.field2407, class242.field3392, class497.field7087, class199.field2861, class735.field10345, class752.field10478, class392.field5502, field2726, class60.field1113, class405.field5642, class662.field9309, class586.field8249, class90.field1605, class115.field1840, class102.field1714, class598.field8715, class361.field5059, class496.field7072, class309.field4372, class130.field1944, class301.field4222, class349.field4908, class249.field3491, class213.field3053, class527.field7485, class681.field9587, class231.field3292, class229.field3266, class171.field2494, class653.field9199, class592.field8312, class99.field1682, class435.field6084, class1.field13, class656.field9231, class633.field9069, class278.field3919, class186.field2679, class188.field2713, class82.field1518, class455.field6585, class195.field2794, class396.field5539, class311.field4391, class363.field5087, class497.field7086, class158.field2367, class26.field375, class125.field1913, class314.field4433, class202.field2886, class586.field8247, class646.field9157, class376.field5260, class521.field7388, class125.field1914, class584.field8239, class65.field1179, class453.field6371, class397.field5557, class710.field9928, class71.field1279, class274.field3904, class342.field4814, class474.field6797, class517.field7350, class667.field9358, class543.field7661, class82.field1516, class342.field4802, class489.field6981, class89.field1590, class76.field1449, class545.field7691, class540.field7596, class24.field308, class199.field2854, class187.field2687, class260.field3809, class515.field7335, class6.field105, class385.field5379, class281.field4006, class229.field3275, class640.field9108, class591.field8297, class182.field2598, class631.field9050, class541.field7603, class539.field7581, class66.field1185, class361.field5062, class3.field34 };
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Loea;IIIII[BI)V")
    public class189(class594 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field2725 = arg3;
        this.field2720 = arg2;
        this.method1345(0, 0, 0, true, arg2, 0, arg7, 0, arg6, arg3);
        this.field2722 = (float) arg2 / (float) arg4;
        this.field2730 = false;
        this.field2719 = (float) arg3 / (float) arg5;
        this.method1346((byte) -105, false, false);
    }
}
