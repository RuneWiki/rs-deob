import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class149 extends IOException {

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "Lkba;")
    public static class108 field1905 = new class108();

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "F")
    public static float field1906;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
    public static void method914(int arg0) {
        if (arg0 == 65535) {
            field1905 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class149(String arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)I")
    public static final int method915(int arg0, int arg1) {
        return class622.field8711 == null ? 0 : class622.field8711[arg0][arg1] & 0xFFFF;
    }
}
