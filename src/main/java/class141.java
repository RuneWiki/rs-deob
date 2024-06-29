import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class141 {

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "Lsb;")
    public static class110 field2239 = new class110(16);

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field2244 = 0;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2240;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZC)C")
    public static final char method971(boolean arg0, char arg1) {
        field2241++;
        if (arg1 == 'µ' || arg1 == 'ƒ') {
            return arg1;
        } else {
            if (arg0) {
                field2239 = null;
            }
            return Character.toTitleCase(arg1);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([BBLpd;)V")
    public final void method972(byte[] arg0, byte arg1, class96 arg2) {
        field2242++;
        if (arg2.field1218[arg2.field1228] != 31 || arg2.field1218[arg2.field1228 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2240 == null) {
            this.field2240 = new Inflater(true);
        }
        try {
            this.field2240.setInput(arg2.field1218, arg2.field1228 + 10, arg2.field1218.length - 8 - arg2.field1228 + -10);
            this.field2240.inflate(arg0);
        } catch (Exception var4) {
            this.field2240.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        if (arg1 == 95) {
            this.field2240.reset();
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
    public class141() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static void method973(int arg0) {
        field2239 = null;
        if (arg0 != 402) {
            field2243 = 25;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method974(int arg0, String arg1) {
        field2238++;
        String var2 = class124.method815(class185.method1296((byte) -103, arg1), (byte) -34);
        int var3 = -11 / ((-arg0 - 2) / 44);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(III)V")
    private class141(int arg0, int arg1, int arg2) {
    }
}
