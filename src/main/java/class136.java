import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class136 {

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "Lmh;")
    private static class62 field2211 = class201.method1405(true, " is already on your friend list)3");

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "Lmh;")
    public static class62 field2216 = field2211;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field2215 = 7759444;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2210;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLmi;[B)V", line = 7)
    public final void method1030(byte arg0, class92 arg1, byte[] arg2) {
        field2214++;
        if (arg1.field1495[arg1.field1476] != 31 || arg1.field1495[arg1.field1476 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2210 == null) {
            this.field2210 = new Inflater(true);
        }
        if (arg0 >= -77) {
            return;
        }
        try {
            this.field2210.setInput(arg1.field1495, arg1.field1476 + 10, -arg1.field1476 - 18 + arg1.field1495.length);
            this.field2210.inflate(arg2);
        } catch (Exception var5) {
            this.field2210.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field2210.reset();
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)I", line = 43)
    public static final int method1031(boolean arg0) {
        field2212++;
        if (arg0) {
            field2216 = (class62) null;
        }
        return 2;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)V", line = 70)
    public static final void method1032(int arg0, int arg1) {
        field2213++;
        int var2 = 98 / ((-arg1) / 42);
        class151 var3 = class165.method1194((byte) 1, 2, arg0);
        var3.method1081(128);
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V", line = 83)
    public class136() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V", line = 90)
    public static void method1033(byte arg0) {
        if (arg0 != -28) {
            method1033((byte) -115);
        }
        field2211 = null;
        field2216 = null;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(III)V", line = 103)
    private class136(int arg0, int arg1, int arg2) {
    }
}
