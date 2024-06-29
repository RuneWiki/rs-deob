import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class353 {

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field5636 = 0;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "Ljava/lang/String;")
    public static String field5638 = "wave:";

    @OriginalMember(owner = "client!si", name = "d", descriptor = "Ljava/lang/String;")
    public static String field5635 = "Loaded input handler";

    @OriginalMember(owner = "client!si", name = "h", descriptor = "Ll;")
    public static class66 field5639 = new class66(64);

    @OriginalMember(owner = "client!si", name = "i", descriptor = "[I")
    public static int[] field5640 = new int[32];

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field5642 = 0;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "[[Z")
    public static boolean[][] field5632;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILud;I)V", line = 4)
    public static final void method2488(int arg0, class91 arg1, int arg2) {
        if (arg2 != 11776) {
            field5636 = 92;
        }
        field5633++;
        if (arg1.field1384 > class360.field5718) {
            class278.method2037(arg2 - 21656, arg1);
        } else if (class360.field5718 > arg1.field1377) {
            class356.method2503(arg1, (byte) 123);
        } else {
            class105.method915((byte) 98, arg1);
        }
        if (arg1.field1359 < 128 || arg1.field1286 < 128 || arg1.field1359 >= 13184 || arg1.field1286 >= 13184) {
            arg1.field1384 = 0;
            arg1.field1377 = 0;
            arg1.field1297 = -1;
            arg1.field1343 = -1;
            arg1.field1359 = arg1.field1300[0] * 128 + arg1.method808(115) * 64;
            arg1.field1286 = arg1.field1290[0] * 128 + arg1.method808(-101) * 64;
            arg1.method816(579748592);
        }
        if (class173.field2746 == arg1 && (arg1.field1359 < 1536 || arg1.field1286 < 1536 || arg1.field1359 >= 11776 || arg1.field1286 >= 11776)) {
            arg1.field1297 = -1;
            arg1.field1384 = 0;
            arg1.field1377 = 0;
            arg1.field1343 = -1;
            arg1.field1359 = arg1.field1300[0] * 128 + (arg1.method808(arg2 ^ 0xFFFFD1F3) * 64);
            arg1.field1286 = arg1.field1290[0] * 128 + arg1.method808(arg2 ^ 0xFFFFD1D5) * 64;
            arg1.method816(579748592);
        }
        class85.method768(0, arg1);
        class262.method1924(arg1, (byte) 71);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/awt/Frame;Lua;I)V", line = 57)
    public static final void method2489(Frame arg0, class323 arg1, int arg2) {
        while (true) {
            class95 var3 = arg1.method2281(arg0, (byte) -80);
            while (var3.field1447 == 0) {
                class188.method1443(arg2 + 19992, 10L);
            }
            if (var3.field1447 == 1) {
                if (arg2 != -19982) {
                    method2488(-78, (class91) null, -3);
                }
                field5637++;
                arg0.setVisible(false);
                arg0.dispose();
                return;
            }
            class188.method1443(10, 100L);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V", line = 88)
    public static void method2490(byte arg0) {
        field5632 = (boolean[][]) null;
        field5635 = null;
        field5638 = null;
        field5640 = null;
        if (arg0 > -46) {
            method2491(92, (class18) null);
        }
        field5639 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILrn;)V", line = 105)
    public static final void method2491(int arg0, class18 arg1) {
        if (arg0 != -1) {
            field5632 = (boolean[][]) ((boolean[][]) null);
        }
        class133.field2229 = arg1.method186(false, "runes");
        field5634++;
    }
}
