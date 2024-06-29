import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class406 {

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIILet;)V")
    public static final void method2314(int arg0, int arg1, int arg2, class509 arg3) {
        field5333++;
        if (arg3 == null) {
            return;
        }
        if (arg3.field7081 != null) {
            class503 var4 = new class503();
            var4.field6975 = arg3.field7081;
            var4.field6973 = arg3;
            class630.method3608(var4);
        }
        class592.field8606 = arg3.field7086;
        class71.field684 = arg3.field7124;
        class588.field8538 = arg3.field7045;
        int var5 = -78 / ((arg1 + 2) / 54);
        class110.field1361 = arg3.field7082;
        class391.field5183 = arg2;
        class117.field1477 = arg0;
        class468.field6542 = arg3.field7157;
        class449.field6225 = true;
        class87.method508(124, arg3);
    }
}
