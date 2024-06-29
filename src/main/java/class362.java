import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class362 extends class414 {

    @OriginalMember(owner = "client!tk", name = "C", descriptor = "I")
    private int field5249;

    @OriginalMember(owner = "client!tk", name = "K", descriptor = "Lfr;")
    private static class431 field5250;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "()V", line = 3)
    public static void method2291() {
        field5250 = null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V", line = 6)
    public final void method2292(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field5250.method1464(arg0, -1, this.field5249);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "()I", line = 12)
    public final int method2293() {
        return field5250.method1465((byte) 70, this.field5249);
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "()V", line = 15)
    public final void method2294() {
        field5250.method1462(this.field5249, super.field5949);
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "()V", line = 19)
    public final void method2295() {
        field5250.method1461(false, this.field5249);
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "()V", line = 22)
    public final void method2296() {
        field5250.method1466(false, this.field5249);
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lec;I)V", line = 24)
    public class362(class248 arg0, int arg1) {
        field5250 = (class431) arg0.method1555((byte) -119);
        this.field5249 = arg1;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 29)
    public final void method2297(Component arg0) throws Exception {
        field5250.method1463((byte) 88, class624.field8419, class177.field2341, arg0);
    }
}
