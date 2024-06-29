import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class430 {

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field6288 = -1;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field6292 = 0;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "Ltm;")
    public static class334 field6293 = new class334(97, 1);

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field6289;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field6291;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "Lwc;")
    public static class724 field6290;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V", line = 4)
    public static final void method2675(byte arg0) {
        class643.field9183 = new class671(8);
        field6289++;
        class692.field9814 = 0;
        for (class627 var1 = (class627) class494.field7152.method3272(-126); var1 != null; var1 = (class627) class494.field7152.method3274(false)) {
            var1.method3547();
        }
        if (arg0 != 29) {
            method2675((byte) 52);
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)V", line = 26)
    public static void method2676(byte arg0) {
        field6290 = null;
        field6293 = null;
        int var1 = 24 % ((-arg0 - 22) / 50);
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(II)V", line = 48)
    public class430(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!wk", name = "toString", descriptor = "()Ljava/lang/String;", line = 60)
    public final String toString() {
        field6291++;
        throw new IllegalStateException();
    }
}
