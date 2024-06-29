import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public abstract class class61 {

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field1192 = 10;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1194 = "Loading config - ";

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "Lg;")
    public static class181 field1193;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)V", line = 21)
    public static void method499(byte arg0) {
        if (arg0 < 7) {
            field1192 = -99;
        }
        field1193 = null;
        field1194 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([BI)V")
    public abstract void method497(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)[B")
    public abstract byte[] method498(byte arg0);
}
