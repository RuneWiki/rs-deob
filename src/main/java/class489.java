import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class489 {

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "[[I")
    public static int[][] field6702 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "Lem;")
    public static class206 field6704 = new class206(48, 8);

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field6703;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field6705;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "J")
    public static long field6706;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
    public static void method2774(int arg0) {
        field6704 = null;
        field6702 = null;
        if (arg0 != 4332) {
            method2776(-74, -64, 25, -22);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)V")
    public static final void method2775(int arg0, int arg1, int arg2) {
        if (arg1 != 2) {
            field6702 = null;
        }
        if (class510.field6991 > class510.field6990) {
            class510.field6990 = (float) ((double) class510.field6990 / 30.0D + (double) class510.field6990);
            if (class510.field6991 < class510.field6990) {
                class510.field6990 = class510.field6991;
            }
            class560.method3127((byte) 81);
            class510.field6986 = (int) class510.field6990 >> 1;
            class510.field6983 = class437.method2501((byte) -1, class510.field6986);
        } else if (class510.field6990 > class510.field6991) {
            class510.field6990 = (float) ((double) class510.field6990 - (double) class510.field6990 / 30.0D);
            if (class510.field6991 > class510.field6990) {
                class510.field6990 = class510.field6991;
            }
            class560.method3127((byte) 85);
            class510.field6986 = (int) class510.field6990 >> 1;
            class510.field6983 = class437.method2501((byte) -1, class510.field6986);
        }
        field6703++;
        if (class255.field3490 != -1 && class14.field152 != -1) {
            int var3 = class255.field3490 - class266.field3598;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class14.field152 - class670.field9403;
            class266.field3598 += var3;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            if (var3 == 0 && var4 == 0) {
                class255.field3490 = -1;
                class14.field152 = -1;
            }
            class670.field9403 += var4;
            class560.method3127((byte) 115);
        }
        if (class657.field9137 > 0) {
            class593.field8304--;
            if (class593.field8304 == 0) {
                class593.field8304 = 100;
                class657.field9137--;
            }
        } else {
            class496.field6752 = -1;
            class675.field9530 = -1;
        }
        if (!class5.field35 || class40.field470 == null) {
            return;
        }
        for (class69 var5 = (class69) class40.field470.method1436(28964); var5 != null; var5 = (class69) class40.field470.method1443((byte) 6)) {
            class165 var6 = class510.field6981.method3709((byte) 78, var5.field938.field2338);
            if (var5.method574(arg0, arg1 ^ 0x7B, arg2)) {
                if (var6.field2381 != null) {
                    if (var6.field2381[4] != null) {
                        class547.method3077(1002, 0, var6.field2381[4], -1, false, true, var6.field2375, (long) var5.field938.field2338, -71, var6.field2409, -1);
                    }
                    if (var6.field2381[3] != null) {
                        class547.method3077(1008, 0, var6.field2381[3], -1, false, true, var6.field2375, (long) var5.field938.field2338, arg1 - 111, var6.field2409, -1);
                    }
                    if (var6.field2381[2] != null) {
                        class547.method3077(1001, 0, var6.field2381[2], -1, false, true, var6.field2375, (long) var5.field938.field2338, -113, var6.field2409, -1);
                    }
                    if (var6.field2381[1] != null) {
                        class547.method3077(1009, 0, var6.field2381[1], -1, false, true, var6.field2375, (long) var5.field938.field2338, -111, var6.field2409, -1);
                    }
                    if (var6.field2381[0] != null) {
                        class547.method3077(1004, 0, var6.field2381[0], -1, false, true, var6.field2375, (long) var5.field938.field2338, -117, var6.field2409, -1);
                    }
                }
                if (!var5.field938.field2340) {
                    var5.field938.field2340 = true;
                    class97.method701(class266.field3609, var5.field938.field2338, var6.field2409);
                }
                if (var5.field938.field2340) {
                    class97.method701(class426.field5966, var5.field938.field2338, var6.field2409);
                }
            } else if (var5.field938.field2340) {
                var5.field938.field2340 = false;
                class97.method701(class16.field163, var5.field938.field2338, var6.field2409);
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIII)V")
    public static final void method2776(int arg0, int arg1, int arg2, int arg3) {
        field6705++;
        if (arg2 != 0) {
            field6702 = null;
        }
        int var4 = class366.field4875.field9352 * arg0 >> 8;
        if (var4 == 0 || arg3 == -1) {
            return;
        }
        if (!class636.field8795 && class507.field6950 != -1 && class338.method1979(true)) {
            class80.field1211 = class116.method827((byte) -96);
            class364 var5 = class400.method2335(class80.field1211, -9);
            class84.method636(true, -115, var5);
        }
        class56.method471(arg3, var4, 0, false, arg2 - 1, class700.field9930);
        class321.method1928(-1, 255, (byte) 126);
        class636.field8795 = true;
    }
}
