import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class279 {

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field3977 = 7759444;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3981 = "shake:";

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "Loj;")
    public static class209 field3976;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "[B")
    public static byte[] field3980;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "[Lco;")
    public static class294[] field3978;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 6)
    public static void method1883(int arg0) {
        field3981 = null;
        field3978 = null;
        if (arg0 != -66) {
            method1883(7);
        }
        field3976 = null;
        field3980 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lpm;Ljava/lang/Object;Z)V", line = 42)
    public static final void method1884(class69 arg0, Object arg1, boolean arg2) {
        field3979++;
        if (arg0.field892 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field892.peekEvent() != null; var3++) {
            class177.method1299((byte) 64, 1L);
        }
        if (arg1 != null) {
            arg0.field892.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
        if (arg2) {
            field3980 = (byte[]) null;
        }
    }
}
