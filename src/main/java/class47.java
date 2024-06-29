import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class47 extends class67 {

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "I")
    private int field755 = -32768;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "Leg;")
    private static class37 field736 = class174.method1167("Examine", 104);

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "Leg;")
    public static class37 field743 = class174.method1167("Prendre", 86);

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "Leg;")
    public static class37 field744 = class174.method1167(":allyreq:", -122);

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "Leg;")
    public static class37 field735 = class174.method1167("Schrifts-=tze geladen)3", 88);

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "[I")
    public static int[] field749 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!wf", name = "H", descriptor = "Leg;")
    public static class37 field753 = field736;

    @OriginalMember(owner = "client!wf", name = "I", descriptor = "Leg;")
    private static class37 field754 = class174.method1167("Please wait)3)3)3", 73);

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "Leg;")
    public static class37 field742 = class174.method1167("Lade Texturen )2 ", -54);

    @OriginalMember(owner = "client!wf", name = "E", descriptor = "Leg;")
    public static class37 field750 = field754;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
    public int field739;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!wf", name = "F", descriptor = "I")
    public int field751;

    @OriginalMember(owner = "client!wf", name = "G", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "Lja;")
    public static class105 field734;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "Lbj;")
    public static class87 field741;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "[[B")
    public static byte[][] field740;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "()I")
    public final int method308() {
        field752++;
        return this.field755;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(III)Lpe;")
    public static final class237 method309(int arg0, int arg1, int arg2) {
        field746++;
        class237 var3 = class156.method1066(-74, arg1);
        if (arg0 != 128) {
            return null;
        } else if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field4194 == null || var3.field4194.length <= arg2) {
            return null;
        } else {
            return var3.field4194[arg2];
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public static void method310(int arg0) {
        field753 = null;
        field735 = null;
        field736 = null;
        field754 = null;
        if (arg0 != 0) {
            field754 = null;
        }
        field749 = null;
        field743 = null;
        field734 = null;
        field750 = null;
        field742 = null;
        field744 = null;
        field740 = null;
        field741 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljl;BLjl;)V")
    public static final void method311(class101 arg0, byte arg1, class101 arg2) {
        class177.field2959 = arg0;
        field732++;
        class8.field142 = arg2;
        int var3 = 40 % ((arg1 + 69) / 47);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIII)V")
    public final void method312(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field745++;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIIIIJILdk;)V")
    public final void method313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class193 arg10) {
        field747++;
        class253 var13 = class9.method52(true, this.field739).method1661(0, this.field751, 0, (class2) null);
        if (var13 != null) {
            var13.method313(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field755 = var13.method308();
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILtc;IIILq;ZLpi;)V")
    public static final void method314(int arg0, class133 arg1, int arg2, int arg3, int arg4, class163 arg5, boolean arg6, class188 arg7) {
        if (!arg6) {
            method314(-66, (class133) null, 61, 48, -75, (class163) null, true, (class188) null);
        }
        class89 var8 = new class89();
        var8.field1402 = arg4 * 128;
        field733++;
        var8.field1411 = arg3;
        var8.field1403 = arg2 * 128;
        if (arg1 != null) {
            var8.field1412 = arg1.field2296 * 128;
            var8.field1416 = arg1.field2247;
            var8.field1401 = arg1;
            var8.field1400 = arg1.field2287;
            var8.field1404 = arg1.field2234;
            var8.field1417 = arg1.field2236;
            int var10 = arg1.field2306;
            int var11 = arg1.field2272;
            if (arg0 == 1 || arg0 == 3) {
                var11 = arg1.field2306;
                var10 = arg1.field2272;
            }
            var8.field1414 = (arg4 + var11) * 128;
            var8.field1408 = (arg2 + var10) * 128;
            if (arg1.field2303 != null) {
                var8.field1406 = true;
                var8.method588((byte) -122);
            }
            if (var8.field1416 != null) {
                var8.field1420 = var8.field1400 + (int) ((double) (var8.field1404 - var8.field1400) * Math.random());
            }
            class127.field2130.method1574(var8, 0);
        } else if (arg5 != null) {
            class275 var9 = arg5.field2691;
            var8.field1418 = arg5;
            if (var9.field4888 != null) {
                var8.field1406 = true;
                var9 = var9.method1854((byte) 68);
            }
            if (var9 != null) {
                var8.field1408 = (var9.field4839 + arg2) * 128;
                var8.field1414 = (arg4 + var9.field4839) * 128;
                var8.field1417 = class247.method1708(26421, arg5);
                var8.field1412 = var9.field4880 * 128;
            }
            class175.field2928.method1574(var8, 0);
        } else if (arg7 != null) {
            var8.field1415 = arg7;
            var8.field1414 = (arg7.method763(-1) + arg4) * 128;
            var8.field1408 = (arg2 + arg7.method763(-1)) * 128;
            var8.field1417 = class285.method1911(-50, arg7);
            var8.field1412 = arg7.field3215 * 128;
            class154.field2584.method986(var8, arg7.field3235.method217((byte) -102), -1);
            return;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljl;I)I")
    public static final int method315(class101 arg0, int arg1) {
        if (arg1 != -1) {
            return 27;
        }
        field748++;
        int var2 = 0;
        if (arg0.method658(class159.field2659, (byte) 54)) {
            var2++;
        }
        if (arg0.method658(class172.field2894, (byte) 27)) {
            var2++;
        }
        return var2;
    }
}
