import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class337 extends class270 {

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public int field4415;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "[[Lwm;")
    public static class515[][] field4413;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V", line = 4)
    public static void method1898(byte arg0) {
        int var1 = -124 % ((-arg0 - 33) / 62);
        field4413 = null;
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(B)V", line = 15)
    public static final void method1899(byte arg0) {
        if (arg0 != -15) {
            method1898((byte) -31);
        }
        field4414++;
        class645.field9139.method3687((byte) -10);
        class522.field7475.method3687((byte) -10);
        class461.field6407.method3687((byte) -10);
        class149.field1701.method3687((byte) -10);
        class591.field8401.method3687((byte) -10);
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V", line = 34)
    public class337() {
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(I)V", line = 36)
    public class337(int arg0) {
        this.field4415 = arg0;
    }
}
