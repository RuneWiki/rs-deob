import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class633 extends class513 {

    @OriginalMember(owner = "client!ar", name = "n", descriptor = "Lkfa;")
    public class557 field9097;

    @OriginalMember(owner = "client!ar", name = "j", descriptor = "I")
    public static int field9093;

    @OriginalMember(owner = "client!ar", name = "k", descriptor = "I")
    public static int field9094;

    @OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
    public static int field9095;

    @OriginalMember(owner = "client!ar", name = "m", descriptor = "I")
    public static int field9096;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)I")
    public static final int method3618(byte arg0) {
        field9095++;
        if (arg0 >= -83) {
            method3618((byte) 58);
        }
        return class184.field2260;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
    public static final void method3619(int arg0) {
        class636.field9115 = false;
        if (arg0 != 24825) {
            method3618((byte) 31);
        }
        field9093++;
        class100.method747(false);
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lkfa;)V")
    public class633(class557 arg0) {
        this.field9097 = arg0;
    }
}
