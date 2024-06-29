import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jja")
public class class120 {

    @OriginalMember(owner = "client!jja", name = "c", descriptor = "Z")
    public static boolean field2186 = false;

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!jja", name = "e", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!jja", name = "d", descriptor = "Lgj;")
    public static class662 field2187;

    @OriginalMember(owner = "client!jja", name = "b", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2185;

    @OriginalMember(owner = "client!jja", name = "f", descriptor = "[I")
    public static int[] field2189;

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(Lfca;B[B)V")
    public final void method1053(class93 arg0, byte arg1, byte[] arg2) {
        field2188++;
        if (arg0.field1413[arg0.field1442] != 31 || arg0.field1413[arg0.field1442 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2185 == null) {
            this.field2185 = new Inflater(true);
        }
        try {
            if (arg1 >= -62) {
                field2186 = false;
            }
            this.field2185.setInput(arg0.field1413, arg0.field1442 + 10, -arg0.field1442 + -18 + arg0.field1413.length);
            this.field2185.inflate(arg2);
        } catch (Exception var4) {
            this.field2185.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field2185.reset();
    }

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(I)V")
    public static void method1054(int arg0) {
        field2189 = null;
        field2187 = null;
        if (arg0 < 71) {
            method1054(121);
        }
    }

    @OriginalMember(owner = "client!jja", name = "<init>", descriptor = "()V")
    public class120() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "([BI)[B")
    public final byte[] method1055(byte[] arg0, int arg1) {
        field2184++;
        class93 var3 = new class93(arg0);
        var3.field1442 = arg0.length - 4;
        int var4 = var3.method757(-88);
        byte[] var5 = new byte[var4];
        if (arg1 != -21900) {
            field2186 = true;
        }
        var3.field1442 = 0;
        this.method1053(var3, (byte) -115, var5);
        return var5;
    }

    @OriginalMember(owner = "client!jja", name = "<init>", descriptor = "(III)V")
    private class120(int arg0, int arg1, int arg2) {
    }
}
