import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class380 {

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field5388 = 0;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "[J")
    public static long[] field5389 = new long[32];

    @OriginalMember(owner = "client!s", name = "g", descriptor = "Ljava/lang/String;")
    public static String field5391 = "Loading config - ";

    @OriginalMember(owner = "client!s", name = "f", descriptor = "J")
    public static long field5390 = 0L;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "Ljava/lang/String;")
    public static String field5394 = "white:";

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field5387;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "[S")
    public static short[] field5385;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V", line = 16)
    public static void method2407(byte arg0) {
        if (arg0 < 11) {
            field5389 = null;
        }
        field5385 = null;
        field5394 = null;
        field5391 = null;
        field5389 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)I", line = 42)
    public static final int method2408(int arg0, int arg1) {
        field5393++;
        if (arg0 != -1) {
            method2408(5, 11);
        }
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I[BLec;)V", line = 56)
    public final void method2409(int arg0, byte[] arg1, class37 arg2) {
        if (arg0 != -5736) {
            return;
        }
        field5392++;
        if (arg2.field578[arg2.field565] != 31 || arg2.field578[arg2.field565 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field5387 == null) {
            this.field5387 = new Inflater(true);
        }
        try {
            this.field5387.setInput(arg2.field578, arg2.field565 + 10, -18 - (arg2.field565 - arg2.field578.length));
            this.field5387.inflate(arg1);
        } catch (Exception var4) {
            this.field5387.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field5387.reset();
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V", line = 93)
    public class380() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III)V", line = 96)
    private class380(int arg0, int arg1, int arg2) {
    }
}
