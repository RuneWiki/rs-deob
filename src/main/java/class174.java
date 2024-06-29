import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public abstract class class174 {

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public int field2503;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public int field2505;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public int field2506;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public int field2504;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "Lml;")
    public static class325 field2507 = new class325(14, 4);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lqa;Z)V")
    public static final void method1094(class207 arg0, boolean arg1) {
        field2501++;
        if (class425.field6034.method464(false) == 0) {
            return;
        }
        if (class103.field1570 == 0) {
            for (class228 var4 = (class228) class425.field6034.method456((byte) -74); var4 != null; var4 = (class228) class425.field6034.method460((byte) 52)) {
                class181.field2574.method871(arg0, var4.field3259 ? class645.field9372.field2651 : null, var4.field3258, var4.field3255, var4.field3253, var4.field3251, arg0, var4.field3252, -19792, false, class503.field6998, false);
                var4.method1117(0);
            }
            class40.method413(-101);
        } else {
            if (class479.field6759 == null) {
                Canvas var2 = new Canvas();
                var2.setSize(36, 32);
                class479.field6759 = class207.method1358(0, var2, -14968, 0, class142.field2194, class60.field1065);
                class16.field214 = class479.field6759.method1348(class571.method3244(-32635, class491.field6877, 0, class385.field5162), class38.method397(class645.field9371, class491.field6877, 0), true);
            }
            for (class228 var3 = (class228) class425.field6034.method456((byte) -95); var3 != null; var3 = (class228) class425.field6034.method460((byte) -95)) {
                class181.field2574.method871(class479.field6759, var3.field3259 ? class645.field9372.field2651 : null, var3.field3258, var3.field3255, var3.field3253, var3.field3251, arg0, var3.field3252, -19792, false, class16.field214, false);
                var3.method1117(0);
            }
        }
        if (!arg1) {
            method1094(null, true);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lrh;[I)V")
    public abstract void method1095(class223 arg0, int[] arg1);

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "(IILk;)Lk;")
    public abstract class485 method1096(int arg0, int arg1, class485 arg2);

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "(III)V")
    public abstract void method1097(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "()V")
    public abstract void method1098();

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method1099(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method1100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)V")
    public abstract void method1101(int arg0, int arg1);

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "(Lk;IIIIZ)V")
    public abstract void method1102(class485 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V")
    public static final void method1103(boolean arg0) {
        field2500++;
        class479.field6754.method117(91, class107.field1646.method224(115));
        class479.field6754.method117(-100, class212.field2988.method224(-127));
        class479.field6754.method117(-21, class346.field4656.method224(-126));
        class479.field6754.method117(86, class418.field5891.method224(31));
        class479.field6754.method117(102, class603.field8707.method224(-127));
        class479.field6754.method117(88, class23.field346.method224(-127));
        class479.field6754.method117(103, class236.field3305.method224(-126));
        class479.field6754.method117(116, class566.field7830.method224(58));
        class479.field6754.method117(-75, class645.field9371.method224(-14));
        class479.field6754.method117(122, class505.field7049.method224(61));
        class479.field6754.method117(-24, class277.field3831.method224(91));
        class479.field6754.method117(-78, class7.field89.method224(3));
        class479.field6754.method117(-54, class49.field960.method224(-128));
        class479.field6754.method117(111, class385.field5162.method224(-127));
        class479.field6754.method117(-83, class572.field7893.method224(100));
        class479.field6754.method117(-53, class549.field7603.method224(-128));
        class479.field6754.method117(-118, class507.field7092.method224(30));
        class479.field6754.method117(-105, class366.field4973.method224(-126));
        class479.field6754.method117(-102, class336.field4486.method224(-127));
        class479.field6754.method117(79, class152.field2307.method224(-127));
        class479.field6754.method117(-98, class318.field4318.method224(-126));
        class479.field6754.method117(118, class498.field6959.method224(-126));
        class479.field6754.method117(-51, class633.field9253.method224(73));
        class479.field6754.method117(97, class587.field8402.method224(-128));
        class479.field6754.method117(-105, class341.field4603.method224(90));
        class479.field6754.method117(109, class623.field8995.method224(-127));
        class479.field6754.method117(-90, class440.field6280.method224(117));
        class479.field6754.method117(-48, class610.field8772.method224(-126));
        class479.field6754.method117(109, class269.field3759.method224(9));
        class479.field6754.method117(127, class406.field5774.method224(-126));
        if (!arg0) {
            method1110(false);
        }
        class479.field6754.method117(99, class398.field5688.method224(-127));
        class479.field6754.method117(-120, class142.field2194.method224(-128));
    }

    @OriginalMember(owner = "client!sa", name = "ba", descriptor = "(II)I")
    public abstract int method1104(int arg0, int arg1);

    @OriginalMember(owner = "client!sa", name = "aa", descriptor = "(II)I")
    public abstract int method1105(int arg0, int arg1);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lk;IIIIZ)Z")
    public abstract boolean method1106(class485 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!sa", name = "ya", descriptor = "(Lk;IIIIZ)V")
    public abstract void method1107(class485 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(III)V")
    public class174(int arg0, int arg1, int arg2) {
        this.field2503 = arg1;
        this.field2505 = arg0;
        while (arg2 > 1) {
            arg2 >>= 0x1;
            this.field2506++;
        }
        this.field2504 = 0x1 << this.field2506;
    }

    @OriginalMember(owner = "client!sa", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1108(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1109(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(Z)V")
    public static void method1110(boolean arg0) {
        if (arg0) {
            method1094(null, true);
        }
        field2507 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BI)V")
    public static final void method1111(byte arg0, int arg1) {
        class592.field8498 = 3;
        int var2 = 95 / ((-arg0 - 71) / 49);
        class640.field9317 = -1;
        class314.field4237 = 100;
        field2502++;
        class365.field4961 = arg1;
    }
}
