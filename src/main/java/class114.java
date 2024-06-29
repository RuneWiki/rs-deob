import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class114 {

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field1957 = 0;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1956;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z[BLhi;)V")
    public final void method818(boolean arg0, byte[] arg1, class264 arg2) {
        field1958++;
        if (!arg0) {
            return;
        }
        if (arg2.field4198[arg2.field4195] != 31 || arg2.field4198[arg2.field4195 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1956 == null) {
            this.field1956 = new Inflater(true);
        }
        try {
            this.field1956.setInput(arg2.field4198, arg2.field4195 + 10, -10 - (arg2.field4195 - -8) + arg2.field4198.length);
            this.field1956.inflate(arg1);
        } catch (Exception var4) {
            this.field1956.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field1956.reset();
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    public class114() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(III)V")
    private class114(int arg0, int arg1, int arg2) {
    }
}
