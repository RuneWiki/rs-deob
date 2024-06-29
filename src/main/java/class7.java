import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class7 {

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "Lvr;")
    public static class306 field110 = new class306();

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field111;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V", line = 9)
    public static void method68(int arg0) {
        field110 = null;
        if (arg0 != 4) {
            method70((byte) -106, -1);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([BILtl;)V", line = 27)
    public final void method69(byte[] arg0, int arg1, class91 arg2) {
        field109++;
        if (arg2.field1277[arg2.field1292] != 31 || arg2.field1277[arg2.field1292 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field111 == null) {
            this.field111 = new Inflater(true);
        }
        try {
            this.field111.setInput(arg2.field1277, arg2.field1292 + arg1, -18 - (arg2.field1292 - arg2.field1277.length));
            this.field111.inflate(arg0);
        } catch (Exception var4) {
            this.field111.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field111.reset();
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V", line = 56)
    public class7() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(III)V", line = 60)
    private class7(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)V", line = 75)
    public static final void method70(byte arg0, int arg1) {
        field108++;
        class254.field3513 = arg1;
        class339.field5359.method1015((byte) 109);
        if (arg0 < 103) {
            field110 = null;
        }
    }
}
