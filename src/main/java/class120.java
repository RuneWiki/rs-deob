import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public abstract class class120 {

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public int field2085;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public int field2086;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public int field2084;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "[S")
    public static short[] field2088 = new short[500];

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "F")
    public static float field2090 = 128.0F;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2082 = "";

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field2083 = 0;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "Loj;")
    public static class283 field2087;

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(III)V", line = 21)
    public class120(int arg0, int arg1, int arg2) {
        this.field2085 = arg2;
        this.field2086 = arg0;
        this.field2084 = arg1;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V", line = 44)
    public static void method781(int arg0) {
        field2082 = null;
        field2087 = null;
        if (arg0 != 128) {
            field2083 = -113;
        }
        field2088 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIZ)V")
    public abstract void method293(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(IIZ)V")
    public abstract void method292(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)V")
    public abstract void method290(int arg0, int arg1, int arg2);
}
