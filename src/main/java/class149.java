import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class149 {

    @OriginalMember(owner = "client!js", name = "b", descriptor = "I")
    public static int field2288 = -1;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2287 = "shake:";

    @OriginalMember(owner = "client!js", name = "e", descriptor = "I")
    public static int field2291 = 0;

    @OriginalMember(owner = "client!js", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2290 = "Attack";

    @OriginalMember(owner = "client!js", name = "c", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
    public static void method1143(int arg0) {
        if (arg0 != 0) {
            field2288 = 3;
        }
        field2287 = null;
        field2290 = null;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(B)V")
    public static final void method1144(byte arg0) {
        field2289++;
        if (class322.field4370) {
            return;
        }
        class5.method32(-120, class95.field1380);
        if (class73.field1097 != null) {
            class5.method32(-126, class73.field1097);
        }
        class322.field4370 = true;
        if (arg0 < 6) {
            field2290 = null;
        }
    }
}
