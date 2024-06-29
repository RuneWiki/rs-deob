import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class362 extends class414 {

    @OriginalMember(owner = "client!tk", name = "C", descriptor = "I")
    private int field5249;

    @OriginalMember(owner = "client!tk", name = "K", descriptor = "Lfr;")
    private static class431 field5250;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "()V")
    public static void method2291() {
        field5250 = null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
    public final void method2292(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field5250.method1464(arg0, -1, this.field5249);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "()I")
    public final int method2293() {
        return field5250.method1465((byte) 70, this.field5249);
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "()V")
    public final void method2294() {
        field5250.method1462(this.field5249, super.field5949);
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "()V")
    public final void method2295() {
        field5250.method1461(false, this.field5249);
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "()V")
    public final void method2296() {
        field5250.method1466(false, this.field5249);
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lec;I)V")
    public class362(class248 arg0, int arg1) {
        field5250 = (class431) arg0.method1555((byte) -119);
        this.field5249 = arg1;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method2297(Component arg0) throws Exception {
        field5250.method1463((byte) 88, class624.field8419, class177.field2341, arg0);
    }
}
