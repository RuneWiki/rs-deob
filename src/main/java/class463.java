import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class463 {

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "[I")
    public static int[] field6526 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field6524;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "Ldu;")
    public static class324 field6523;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Ljava/lang/String;")
    public static String field6522;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field6525;

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
    public class463() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljr;[BI)V")
    public final void method2662(class96 arg0, byte[] arg1, int arg2) {
        field6524++;
        if (arg0.field1316[arg0.field1301] != 31 || arg0.field1316[arg0.field1301 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field6525 == null) {
            this.field6525 = new Inflater(true);
        }
        if (arg2 != -2290) {
            return;
        }
        try {
            this.field6525.setInput(arg0.field1316, arg0.field1301 + 10, -8 - (arg0.field1301 + 10) + arg0.field1316.length);
            this.field6525.inflate(arg1);
        } catch (Exception var4) {
            this.field6525.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field6525.reset();
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static void method2663(int arg0) {
        field6523 = null;
        if (arg0 != 1000000) {
            field6522 = null;
        }
        field6526 = null;
        field6522 = null;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(III)V")
    private class463(int arg0, int arg1, int arg2) {
    }
}
