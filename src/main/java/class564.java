import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class564 {

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "Laca;")
    public static class758 field7991 = new class758(9, 2);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field7988;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field7990;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "Lgj;")
    public static class662 field7989;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V", line = 3)
    public static final void method3260(int arg0) {
        field7988++;
        if (class551.field7632 != null) {
            try {
                class551.field7632.close();
            } catch (IOException var1) {
            }
        }
        if (arg0 == -1) {
            class551.field7632 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)Ljava/lang/String;", line = 25)
    public static final String method3261(int arg0) {
        field7990++;
        if (class611.field8532 || class603.field8440 == null) {
            return "";
        } else if ((class603.field8440.field7233 == null || class603.field8440.field7233.length() == 0) && class603.field8440.field7227 != null && class603.field8440.field7227.length() > 0) {
            return class603.field8440.field7227;
        } else if (arg0 == -1) {
            return class603.field8440.field7233;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V", line = 61)
    public static void method3262(int arg0) {
        field7991 = null;
        if (arg0 != 16402) {
            method3260(79);
        }
        field7989 = null;
    }
}
