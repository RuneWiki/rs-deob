import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class422 extends class55 {

    @OriginalMember(owner = "client!rq", name = "P", descriptor = "I")
    public static int field6196 = -1;

    @OriginalMember(owner = "client!rq", name = "S", descriptor = "I")
    public static int field6199 = 0;

    @OriginalMember(owner = "client!rq", name = "V", descriptor = "[I")
    public static int[] field6202 = new int[14];

    @OriginalMember(owner = "client!rq", name = "Q", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!rq", name = "R", descriptor = "I")
    public static int field6198;

    @OriginalMember(owner = "client!rq", name = "T", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!rq", name = "W", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!rq", name = "U", descriptor = "[Z")
    public static boolean[] field6201;

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "(I)V")
    public static final void method2552(int arg0) {
        field6198++;
        class152.method1081();
        for (int var1 = 0; var1 < 4; var1++) {
            class629.field9104[var1].method2907((byte) -58);
        }
        if (arg0 == 34836) {
            class185.method1232(-59);
            class245.method1499(arg0 ^ 0xFFFF77B2);
            System.gc();
            class332.field4821.method638();
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILjava/awt/Canvas;Lfa;)Lr;")
    public static final class98 method2553(int arg0, Canvas arg1, class615 arg2) {
        if (arg0 != 6402) {
            method2555(-62);
        }
        field6200++;
        return new class260(arg1, arg2);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZIILjava/lang/String;B)V")
    public static final void method2554(boolean arg0, int arg1, int arg2, String arg3, byte arg4) {
        field6197++;
        int var5 = 28 % ((73 - arg4) / 38);
        class320.method1985(arg0, false, arg3, arg1, null, -1, arg2);
    }

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "(I)V")
    public static void method2555(int arg0) {
        if (arg0 == 6407) {
            field6202 = null;
            field6201 = null;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IB)I")
    public static final int method2556(int arg0, byte arg1) {
        field6203++;
        if (arg1 >= -32) {
            field6202 = null;
        }
        if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
            return 6407;
        } else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
            return 6408;
        } else if (arg0 == 6406 || arg0 == 34844) {
            return 6406;
        } else if (arg0 == 6409 || arg0 == 34846) {
            return 6409;
        } else if (arg0 == 6410 || arg0 == 34847) {
            return 6410;
        } else if (arg0 == 6402) {
            return 6402;
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
