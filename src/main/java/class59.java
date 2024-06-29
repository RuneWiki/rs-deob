import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class59 {

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field709 = 0;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "[Lpi;")
    public static class289[] field713 = new class289[29];

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "Len;")
    public static class174 field711;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "Lra;")
    public static class57 field710;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "Lra;")
    public static class57 field712;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZB)V", line = 11)
    public static final void method367(boolean arg0, byte arg1) {
        field714++;
        class58.method365(-26586);
        if (class105.field1191 != 30 && class105.field1191 != 25) {
            return;
        }
        class269.field3790++;
        if (class269.field3790 < 50 && !arg0) {
            return;
        }
        class269.field3790 = 0;
        if (!class369.field5415 && class330.field4719 != null) {
            class108.field1245++;
            class169.field2360.method809(111, -28022);
            try {
                class330.field4719.method1511(class169.field2360.field2888, 28067, 0, class169.field2360.field2867);
                class169.field2360.field2888 = 0;
            } catch (IOException var2) {
                class369.field5415 = true;
            }
        }
        if (arg1 >= -120) {
            field713 = null;
        }
        class58.method365(-26586);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V", line = 60)
    public static void method368(int arg0) {
        field711 = null;
        field713 = null;
        field712 = null;
        if (arg0 != -31) {
            field711 = null;
        }
        field710 = null;
    }
}
