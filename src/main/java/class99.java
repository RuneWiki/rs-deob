import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class99 {

    @OriginalMember(owner = "client!r", name = "c", descriptor = "[I")
    public static int[] field1113 = new int[1000];

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field1111 = 0;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field1117 = 0;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "[[B")
    public static byte[][] field1114;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 7)
    public static final int method531(String arg0, byte arg1) {
        field1112++;
        int var2 = 29 / ((46 - arg1) / 61);
        return class30.method173(true, false, arg0, 10);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(III)V", line = 18)
    public static final void method532(int arg0, int arg1, int arg2) {
        if (arg1 != -31358) {
            field1114 = null;
        }
        field1116++;
        class348 var3 = class385.method2464(5, 1302, arg0);
        var3.method2216((byte) 23);
        var3.field5093 = arg2;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)I", line = 32)
    public static final int method533(int arg0, byte arg1) {
        if (class330.field4719 != null) {
            class330.field4719.method1503(false);
            class330.field4719 = null;
        }
        field1115++;
        class19.field198++;
        if (class19.field198 > 4) {
            class207.field2814 = 0;
            class19.field198 = 0;
            return arg0;
        }
        class207.field2814 = 0;
        if (class422.field6065 == class341.field5020) {
            class422.field6065 = class300.field4275;
        } else {
            class422.field6065 = class341.field5020;
        }
        return arg1 > -79 ? 21 : -1;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V", line = 67)
    public static void method534(byte arg0) {
        if (arg0 <= -33) {
            field1114 = null;
            field1113 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIZZ)V", line = 88)
    public static final void method535(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        class158.field2245 = arg1;
        class52.field598 = arg2;
        class118.field1410 = arg3;
        class384.field5629 = new class302[arg0][class158.field2245][class52.field598];
        class78.field887 = new class319[4];
        if (arg4) {
            class379.field5582 = new class302[1][class158.field2245][class52.field598];
            class41.field481 = new int[class158.field2245][class52.field598];
            class111.field1285 = new class319[1];
        } else {
            class379.field5582 = null;
            class41.field481 = null;
            class111.field1285 = null;
        }
        if (arg5) {
            class124.field1648 = new int[arg0][arg1][arg2];
            class256.field3438 = new class66[255];
            class278.field3925 = new boolean[255];
            class242.field3280 = 0;
        } else {
            class124.field1648 = null;
            class256.field3438 = null;
            class278.field3925 = null;
            class242.field3280 = 0;
        }
        class103.method559(false);
        class45.field547 = new class306[500];
        class135.field1899 = 0;
        class140.field1985 = new class306[500];
        class134.field1874 = 0;
        class30.field275 = new int[arg0][class158.field2245 + 1][class52.field598 + 1];
        class300.field4276 = new class113[5000];
        class116.field1368 = 0;
        class289.field4111 = new boolean[class118.field1410 + class118.field1410 + 1][class118.field1410 + class118.field1410 + 1];
        class240.field3264 = new boolean[class118.field1410 + class118.field1410 + 2][class118.field1410 + class118.field1410 + 2];
        class341.field5015 = null;
    }
}
