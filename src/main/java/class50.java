import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class50 extends RuntimeException {

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "Ljava/lang/String;")
    public String field1065;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1056;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field1062 = 0;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "Lrc;")
    private static class105 field1060 = class43.method374("yellow:", 0);

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "Lrc;")
    public static class105 field1059 = field1060;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1064 = new CRC32();

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "Lpb;")
    public static class92 field1055;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "[I")
    public static int[] field1057;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "[Leb;")
    public static class27[] field1058;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 30)
    public static void method397(int arg0) {
        field1059 = null;
        field1060 = null;
        field1057 = null;
        if (arg0 != 0) {
            field1058 = null;
        }
        field1055 = null;
        field1064 = null;
        field1058 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILpb;Lpb;)V", line = 59)
    public static final void method398(int arg0, class92 arg1, class92 arg2) {
        field1063++;
        class117.field2746 = arg1;
        class19.field456 = arg2;
        if (arg0 == -24380) {
            class42.field964 = class117.field2746.method749(0, 3);
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 76)
    public class50(Throwable arg0, String arg1) {
        this.field1065 = arg1;
        this.field1056 = arg0;
    }
}
