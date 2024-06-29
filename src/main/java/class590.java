import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class590 {

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "Ldr;")
    public static class675 field7922 = new class675(22, 0);

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "F")
    public static float field7925;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field7920;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field7921;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "Lpfa;")
    public static class275 field7924;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "Lxa;")
    public static class468 field7923;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BII)V")
    public static final void method3273(byte arg0, int arg1, int arg2) {
        field7920++;
        class243 var3 = class546.method2926(arg2, 16, true);
        var3.method1457(41);
        int var4 = -81 / ((arg0 + 7) / 52);
        var3.field3132 = arg1;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
    public static void method3274(int arg0) {
        if (arg0 != 22) {
            method3273((byte) 4, 56, -83);
        }
        field7924 = null;
        field7922 = null;
        field7923 = null;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)Lmc;")
    public static final class124 method3275(int arg0) {
        field7921++;
        int var1 = -62 / ((arg0 + 23) / 47);
        class124 var2 = class566.method3007((byte) -117);
        var2.field1509 = 0;
        var2.field1513 = null;
        var2.field1516 = new class638(5000);
        return var2;
    }
}
