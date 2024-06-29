import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class746 {

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "Lke;")
    public static class622 field10375 = null;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public static int field10376 = 0;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "Lke;")
    public static class622 field10377 = new class622(127, 4);

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "Lke;")
    public static class622 field10378 = new class622(62, -2);

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "J")
    public static long field10379 = 0L;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V", line = 6)
    public static void method4162(byte arg0) {
        field10377 = null;
        field10375 = null;
        field10378 = null;
        int var1 = -100 % ((-arg0 - 32) / 52);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIILbq;)V", line = 25)
    public static final void method4163(int arg0, int arg1, int arg2, int arg3, class303 arg4) {
        class379 var5 = class386.method2357(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        arg4.field7718 = (arg1 << class310.field4616) + class503.field7200;
        arg4.field7723 = arg3;
        arg4.field7719 = (arg2 << class310.field4616) + class503.field7200;
        var5.field5441 = arg4;
        int var6 = class622.field8777 == class311.field4628 ? 1 : 0;
        if (arg4.method254((byte) 104)) {
            if (arg4.method248((byte) -55)) {
                arg4.field7714 = class110.field1365[var6];
                class110.field1365[var6] = arg4;
                return;
            }
            arg4.field7714 = class472.field6734[var6];
            class472.field6734[var6] = arg4;
            class432.field6151 = true;
            return;
        }
        arg4.field7714 = class511.field7305[var6];
        class511.field7305[var6] = arg4;
    }
}
