import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class361 {

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "J")
    public static long field4596 = 0L;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "F")
    public static float field4595;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)J")
    public static final long method1985(int arg0) {
        if (arg0 != -27622) {
            field4596 = -75L;
        }
        field4594++;
        return class39.field524.method643(26262);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lac;B)V")
    public static final void method1986(class307 arg0, byte arg1) {
        field4592++;
        if (arg1 > -107) {
            method1986(null, (byte) 32);
        }
        for (class164 var2 = (class164) class702.field9921.method237(118); var2 != null; var2 = (class164) class702.field9921.method245((byte) 92)) {
            if (var2.field2167 == arg0) {
                if (var2.field2170 != null) {
                    class480.field6387.method1295(var2.field2170);
                    var2.field2170 = null;
                }
                var2.method1871(-105);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V")
    public static final void method1987(int arg0, int arg1) {
        field4597++;
        if (class504.field6675 == arg0) {
            return;
        }
        if (arg0 == 13) {
            if (class180.field2319 == null) {
                class642.method3586(class507.field6866, class402.field5035, -104, class304.field3746);
            } else {
                class137.method788(class304.field3746, 0);
            }
        }
        if (arg0 != 13 && class313.field4031 != null) {
            class313.field4031.method1235(0);
            class313.field4031 = null;
        }
        if (arg0 == 3) {
            class611.method3336(117, class680.field9563 != class316.field4063);
        }
        if (arg0 == 7) {
            class152.method866(class42.field555 != class316.field4063, false);
        }
        if (arg0 == 5) {
            if (class180.field2319 == null) {
                class47.method299(22, class507.field6866, class402.field5035);
            } else {
                class704.method3949((byte) -99);
            }
        } else if (arg0 == 6) {
            if (class180.field2319 == null) {
                class642.method3586(class507.field6866, class402.field5035, 75, class304.field3746);
            } else {
                class137.method788(class304.field3746, 0);
            }
        } else if (arg0 == 9) {
            if (class180.field2319 == null) {
                class642.method3586(class507.field6866, class402.field5035, -104, class304.field3746);
            } else {
                class137.method788(class304.field3746, 0);
            }
        } else if (arg0 == 12) {
            if (class180.field2319 == null) {
                class47.method299(70, class507.field6866, class402.field5035);
            } else {
                class704.method3949((byte) -82);
            }
        }
        if (class36.method225((byte) 22, class504.field6675)) {
            class493.field6500.field8600 = 2;
            class622.field8709.field8600 = 2;
            class242.field3020.field8600 = 2;
            class415.field5188.field8600 = 2;
            class673.field9472.field8600 = 2;
            class105.field1411.field8600 = 2;
            class475.field6030.field8600 = 2;
        }
        if (class36.method225((byte) 22, arg0)) {
            class517.field7069 = 1;
            class508.field6879 = 0;
            class445.field5621 = 0;
            class655.field9233 = 0;
            class588.field8272 = 1;
            class253.method1483(96, true);
            class493.field6500.field8600 = 1;
            class622.field8709.field8600 = 1;
            class242.field3020.field8600 = 1;
            class415.field5188.field8600 = 1;
            class673.field9472.field8600 = 1;
            class105.field1411.field8600 = 1;
            class475.field6030.field8600 = 1;
        }
        if (arg0 == 11 || arg0 == 3) {
            class474.method2505(false);
        }
        int var2 = -113 % ((arg1 + 65) / 37);
        boolean var3 = arg0 == 2 || class580.method3202(arg0, 0) || class581.method3205(-66, arg0);
        boolean var4 = class504.field6675 == 2 || class580.method3202(class504.field6675, 0) || class581.method3205(-66, class504.field6675);
        if (var4 != var3) {
            if (var3) {
                class582.field8137 = class86.field1219;
                if (class301.field3698.field6641 == 0) {
                    class697.method3922(-124, 2);
                } else {
                    class638.method3574(class81.field1086, class86.field1219, 15, 0, 2, false, class301.field3698.field6641);
                }
                class323.field4157.method2293(127, false);
            } else {
                class697.method3922(-93, 2);
                class323.field4157.method2293(127, true);
            }
        }
        if (class36.method225((byte) 22, arg0) || arg0 == 13) {
            class32.field452.method1052();
        }
        class504.field6675 = arg0;
    }
}
