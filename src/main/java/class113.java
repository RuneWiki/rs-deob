import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class113 extends class71 {

    @OriginalMember(owner = "client!tc", name = "N", descriptor = "Lqd;")
    private static class99 field2425;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "()I")
    public final int method560() {
        return field2425.method706((byte) -117);
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "()V")
    public final void method561() {
        field2425.method709(class71.field1582);
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "()V")
    public final void method558() {
        field2425.method708(-30398);
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lnd;Ljava/awt/Component;)V")
    public class113(class82 arg0, Component arg1) throws Exception {
        super(22050);
        field2425 = arg0.method620(-2321);
        field2425.method705(arg1, -7252);
        this.method554(arg0, 16384);
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
    public final void method553(int arg0) throws Exception {
        field2425.method707(-28228, arg0);
    }

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "()V")
    public static void method822() {
        field2425 = null;
    }
}
