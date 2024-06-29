import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class40 {

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public int field445;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "Lqu;")
    public static class364 field444 = new class364(14, -1);

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
    public static void method207(byte arg0) {
        int var1 = 35 / ((arg0 + 13) / 34);
        field444 = null;
    }

    @OriginalMember(owner = "client!ae", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field443++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(I)V")
    public class40(int arg0) {
        this.field445 = arg0;
    }

    static {
        new class487(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
        field446 = 0;
    }
}
