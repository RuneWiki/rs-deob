import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class706 implements class685 {

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "Lwu;")
    private class376 field9784;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Lro;")
    public static class2 field9783 = new class2();

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field9780;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field9781;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field9782;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)Lsaa;")
    public final class331 method77(byte arg0) {
        if (arg0 > -120) {
            field9783 = null;
        }
        field9782++;
        return class331.field4717;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V")
    public static void method3970(byte arg0) {
        field9783 = null;
        if (arg0 > -56) {
            field9783 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)I")
    public final int method78(int arg0) {
        field9780++;
        if (arg0 != -20701) {
            this.method77((byte) 20);
        }
        return this.field9784.method2210(23094821) ? 100 : this.field9784.method2229((byte) -122);
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lwu;)V")
    public class706(class376 arg0) {
        this.field9784 = arg0;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method3971(boolean arg0, String arg1) {
        field9781++;
        if (arg1.equals("")) {
            return;
        }
        class682.field9521++;
        if (!arg0) {
            class583 var2 = class381.method2246(1, class128.field2105, class34.field507);
            var2.field7637.method3823(-97, class419.method2429(true, arg1));
            var2.field7637.method3795(arg1, (byte) -77);
            class42.method309(var2, 0);
        }
    }
}
