import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class228 extends class331 {

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "[[[Z")
    public static boolean[][][] field2986;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "()V")
    public static final void method1459() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class573.field7997.length; ++var1) {
                if (!class573.field7997[var1].method2447()) {
                    synchronized (class573.field7997[var1]) {
                        class573.field7997[var1].notify();
                    }
                    var0 = false;
                } else {
                    class288.field3664[var1] = class573.field7997[var1].method2448();
                }
            }
            if (var0) {
                class573.field7997[class573.field7997.length - 1].method2449();
                class745.method4166(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class573.field7997.length - 1; ++var4) {
                        if (!class573.field7997[var4].method2447()) {
                            synchronized (class573.field7997[var4]) {
                                class573.field7997[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class573.field7997.length - 2; ++var6) {
                            class573.field7997[var6].method2449();
                        }
                        class745.method4166(2);
                        while (!class573.field7997[0].method2447()) {
                            synchronized (class573.field7997[0]) {
                                class573.field7997[0].notify();
                            }
                            try {
                                class517.method2965(1L, -79);
                            } catch (Exception var9) {
                            }
                        }
                        class573.field7997[0].method2449();
                        return;
                    }
                    try {
                        class517.method2965(1L, -99);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class517.method2965(1L, -85);
            } catch (Exception var8) {
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(II)I")
    public final int method222(int arg0, int arg1) {
        ++field2988;
        if (!class441.method2601(4, super.field4203.field633.method4191((byte) -126))) {
            return 3;
        } else {
            if (arg1 != 1) {
                field2986 = null;
            }
            return 1;
        }
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(II)V")
    public final void method227(int arg0, int arg1) {
        ++field2985;
        super.field4202 = arg1;
        if (arg0 < 113) {
            this.method227(-30, -57);
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)V")
    public static void method1460(int arg0) {
        field2986 = null;
        if (arg0 >= -35) {
            method1462(4);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
    public final void method224(int arg0) {
        if (super.field4203.field633.method4193((byte) 88) && !class441.method2601(4, super.field4203.field633.method4191((byte) -124))) {
            super.field4202 = 0;
        }
        ++field2989;
        if (~super.field4202 > -1 || super.field4202 > 2) {
            super.field4202 = this.method226((byte) 13);
        }
        if (arg0 != -1959) {
            field2986 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(B)Z")
    public final boolean method1461(byte arg0) {
        ++field2984;
        if (arg0 <= 103) {
            field2986 = null;
        }
        return class441.method2601(4, super.field4203.field633.method4191((byte) -120));
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lts;)V")
    public class228(class41 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)[Lmq;")
    public static final class78[] method1462(int arg0) {
        if (arg0 != 2) {
            return null;
        } else {
            ++field2987;
            return new class78[] { class49.field727, class449.field6308, class569.field7937, class669.field9157, class268.field3392, class83.field1081, class181.field2377, class722.field10160, class423.field6012, class270.field3414, class537.field7547, class463.field6709, class497.field7031, class332.field4282, class148.field1795, class668.field9145, class200.field2564, class476.field6802, class659.field9047, class569.field7942, class288.field3663, class200.field2554, class741.field10356, class552.field7755, class189.field2475, class62.field841, class264.field3347, class753.field10512, class184.field2410, class519.field7304, class386.field5382, class715.field10070, class622.field8696, class109.field1340, class416.field5914, class449.field6305, class650.field8931, class21.field262, class390.field5433, class29.field470, class670.field9159, class386.field5380, class313.field3997, class237.field3066, class588.field8212, class162.field2080, class654.field9001, class382.field5328, class93.field1184, class437.field6138, class604.field8397, class420.field5971, class383.field5334, class403.field5589, class739.field10346, class98.field1223, class301.field3878, class340.field4387, class494.field6996, class479.field6844, class266.field3360, class438.field6158, class206.field2648, class743.field10377, class367.field5191, class152.field1849, class353.field4725, class179.field2366, class165.field2115, class288.field3665, class415.field5871, class499.field7051, class11.field128, class233.field3013, class379.field5298, class419.field5961, class488.field6942, class233.field3016, class572.field7996, class715.field10074, class557.field7807, class276.field3492, class175.field2275, class426.field6052, class82.field1069, class487.field6930, class434.field6116, class528.field7448, class95.field1201, class28.field464, class551.field7747, class345.field4467, class610.field8446, class464.field6714, class280.field3548, class603.field8368, class184.field2419, class233.field3017, class540.field7608, class499.field7060, class411.field5797, class739.field10341, class33.field514, class105.field1288, class456.field6386, class89.field1126, class17.field227, class547.field7714, class613.field8509, class632.field8775, class406.field5729, class700.field9878, class116.field1423, class170.field2242, class130.field1559, class293.field3803, class88.field1113, class645.field8895, class273.field3453, class56.field810, class510.field7199 };
        }
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(B)I")
    public final int method1463(byte arg0) {
        ++field2983;
        return arg0 >= -119 ? 51 : super.field4202;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)I")
    public final int method226(byte arg0) {
        if (arg0 != 13) {
            return -103;
        } else {
            ++field2982;
            return 0;
        }
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(ILts;)V")
    public class228(int arg0, class41 arg1) {
        super(arg0, arg1);
    }
}
