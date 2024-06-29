import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class138 {

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field2311 = 0;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2314 = "Close";

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "[Lel;")
    public static class77[] field2316 = new class77[14];

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "Z")
    public static boolean field2315 = false;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2312;

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V")
    public class138() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
    public static void method1036(byte arg0) {
        field2314 = null;
        if (arg0 > -86) {
            method1036((byte) 107);
        }
        field2316 = null;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(III)V")
    private class138(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I[BLig;)V")
    public final void method1037(int arg0, byte[] arg1, class136 arg2) {
        field2313++;
        if (arg0 != 18484) {
            return;
        }
        if (arg2.field2263[arg2.field2231] != 31 || arg2.field2263[arg2.field2231 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2312 == null) {
            this.field2312 = new Inflater(true);
        }
        try {
            this.field2312.setInput(arg2.field2263, arg2.field2231 + 10, arg2.field2263.length - (arg2.field2231 + 10 + 8));
            this.field2312.inflate(arg1);
        } catch (Exception var4) {
            this.field2312.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field2312.reset();
    }
}
