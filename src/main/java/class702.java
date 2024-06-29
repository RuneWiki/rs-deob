import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class702 {

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "Llea;")
    private class573 field9846;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "I")
    public int field9841;

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "I")
    public static int field9842;

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "I")
    public static int field9843;

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "I")
    public static int field9844;

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "I")
    public static int field9845;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(III)I", line = 3)
    public static final int method3932(int arg0, int arg1, int arg2) {
        field9845++;
        double var3 = Math.log((double) arg1) / Math.log(2.0D);
        double var5 = Math.log((double) arg2) / Math.log(2.0D);
        double var7 = (var3 - var5) * Math.random() + var5;
        if (arg0 != 0) {
            field9843 = -45;
        }
        return (int) (Math.pow(2.0D, var7) + 0.5D);
    }

    @OriginalMember(owner = "client!hu", name = "finalize", descriptor = "()V", line = 20)
    protected final void finalize() throws Throwable {
        this.field9846.method3376(-2137, this.field9841);
        field9844++;
        super.finalize();
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)V", line = 31)
    public static final void method3933(int arg0) {
        class163.field2502.method3735(-4676);
        if (arg0 != 1712) {
            method3933(-34);
        }
        field9842++;
        class289.field4225 = 0;
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Llea;II)V", line = 51)
    public class702(class573 arg0, int arg1, int arg2) {
        this.field9846 = arg0;
        this.field9841 = arg2;
    }
}
