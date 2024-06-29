import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class129 {

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field2773 = 0;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "[I")
    public static int[] field2781 = new int[25];

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field2780 = 0;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "Ldd;")
    public static class35 field2779 = class180.method1196((byte) 127, "null");

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field2782 = 0;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "Ldd;")
    public static class35 field2785 = class180.method1196((byte) -103, "cookieprefix");

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2784;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "[[B")
    public static byte[][] field2783;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLce;[B)V")
    public final void method895(byte arg0, class26 arg1, byte[] arg2) {
        field2778++;
        if (arg1.field529[arg1.field527] != 31 || arg1.field529[arg1.field527 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2784 == null) {
            this.field2784 = new Inflater(true);
        }
        if (arg0 != -99) {
            field2785 = null;
        }
        try {
            this.field2784.setInput(arg1.field529, arg1.field527 + 10, arg1.field529.length - 10 - arg1.field527 + -8);
            this.field2784.inflate(arg2);
        } catch (Exception var4) {
            this.field2784.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field2784.reset();
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
    public static void method896(boolean arg0) {
        field2785 = null;
        field2779 = null;
        if (arg0) {
            field2782 = -51;
        }
        field2781 = null;
        field2783 = null;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
    public class129() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILag;IZ)[Lbg;")
    public static final class18[] method897(int arg0, class8 arg1, int arg2, boolean arg3) {
        if (arg3) {
            field2777++;
            return class19.method166(arg2, 61, arg1, arg0) ? class68.method555((byte) -117) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(III)V")
    private class129(int arg0, int arg1, int arg2) {
    }
}
