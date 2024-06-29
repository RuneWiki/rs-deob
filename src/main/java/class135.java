import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class135 extends class504 {

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    public int field2202 = 0;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
    public int field2205 = -1;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    public static int field2199 = 0;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "[Z")
    public static boolean[] field2196 = new boolean[100];

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public int field2194;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public int field2195;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public int field2198;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public int field2201;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
    public int field2203;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
    public int field2204;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
    public int field2206;

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "I")
    public int field2207;

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
    public int field2208;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "I")
    public int field2209;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
    public static void method1009(byte arg0) {
        field2196 = null;
        if (arg0 != 111) {
            field2199 = -69;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIB)V")
    public static final void method1010(int arg0, int arg1, byte arg2) {
        field2197++;
        if (class567.field7506 < class567.field7502) {
            class567.field7506 = (float) ((double) class567.field7506 / 30.0D + (double) class567.field7506);
            if (class567.field7506 > class567.field7502) {
                class567.field7506 = class567.field7502;
            }
            class659.method3693(arg2 + 1278);
            class567.field7504 = (int) class567.field7506 >> 1;
            class567.field7501 = class204.method1328((byte) 127, class567.field7504);
        } else if (class567.field7502 < class567.field7506) {
            class567.field7506 = (float) ((double) class567.field7506 - (double) class567.field7506 / 30.0D);
            if (class567.field7502 > class567.field7506) {
                class567.field7506 = class567.field7502;
            }
            class659.method3693(1290);
            class567.field7504 = (int) class567.field7506 >> 1;
            class567.field7501 = class204.method1328((byte) 112, class567.field7504);
        }
        if (class615.field8140 != -1 && class683.field9616 != -1) {
            int var3 = class615.field8140 - class613.field8098;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class683.field9616 - class180.field2749;
            class613.field8098 -= -var3;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class180.field2749 += var4;
            if (var3 == 0 && var4 == 0) {
                class683.field9616 = -1;
                class615.field8140 = -1;
            }
            class659.method3693(arg2 + 1278);
        }
        if (class665.field9428 > 0) {
            class412.field5653--;
            if (class412.field5653 == 0) {
                class412.field5653 = 100;
                class665.field9428--;
            }
        } else {
            class96.field1461 = -1;
            class345.field4753 = -1;
        }
        if (class414.field5671 && class187.field2784 != null) {
            for (class459 var5 = (class459) class187.field2784.method3257(-50); var5 != null; var5 = (class459) class187.field2784.method3263((byte) -126)) {
                class634 var6 = class567.field7498.method1487(var5.field6224.field317, (byte) 115);
                if (var5.method2613(arg0, (byte) -119, arg1)) {
                    if (var6.field8528 != null) {
                        if (var6.field8528[4] != null) {
                            class483.method2701(0, false, true, var6.field8534, (long) var5.field6224.field317, 1011, var6.field8516, -1, -1, var6.field8528[4], 6967);
                        }
                        if (var6.field8528[3] != null) {
                            class483.method2701(0, false, true, var6.field8534, (long) var5.field6224.field317, 1007, var6.field8516, -1, -1, var6.field8528[3], 6967);
                        }
                        if (var6.field8528[2] != null) {
                            class483.method2701(0, false, true, var6.field8534, (long) var5.field6224.field317, 1009, var6.field8516, -1, -1, var6.field8528[2], 6967);
                        }
                        if (var6.field8528[1] != null) {
                            class483.method2701(0, false, true, var6.field8534, (long) var5.field6224.field317, 1008, var6.field8516, -1, -1, var6.field8528[1], 6967);
                        }
                        if (var6.field8528[0] != null) {
                            class483.method2701(0, false, true, var6.field8534, (long) var5.field6224.field317, 1002, var6.field8516, -1, -1, var6.field8528[0], 6967);
                        }
                    }
                    if (!var5.field6224.field318) {
                        var5.field6224.field318 = true;
                        class544.method3007(class250.field3452, var5.field6224.field317, var6.field8516);
                    }
                    if (var5.field6224.field318) {
                        class544.method3007(class538.field7103, var5.field6224.field317, var6.field8516);
                    }
                } else if (var5.field6224.field318) {
                    var5.field6224.field318 = false;
                    class544.method3007(class409.field5527, var5.field6224.field317, var6.field8516);
                }
            }
        }
        if (arg2 != 12) {
            method1010(-116, 26, (byte) 77);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;II)V")
    public static final void method1011(String arg0, String arg1, String arg2, int arg3, String arg4, int arg5, int arg6) {
        field2200++;
        class173.method1171(arg1, arg3, arg0, arg5, arg2, null, -1, arg4, (byte) -18);
        int var7 = -65 % ((arg6 - 36) / 58);
    }
}
