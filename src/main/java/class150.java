import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class150 {

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "Z")
    public static boolean field2331 = false;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "Lok;")
    public static class41 field2335 = class137.method956("compass", 45);

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "Lok;")
    public static class41 field2338 = class137.method956("null", 45);

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "Lok;")
    public static class41 field2339 = class137.method956("www", 45);

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2336;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "[Lii;")
    public static class234[] field2337;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)Z", line = 6)
    public static final boolean method1036(int arg0, int arg1) {
        if (arg0 != -8) {
            method1037(-21, 107);
        }
        field2332++;
        return (arg1 & -arg1) == arg1;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)V", line = 27)
    public static final void method1037(int arg0, int arg1) {
        int var2 = 123 % ((71 - arg0) / 36);
        class46 var3 = class195.method1396(12, arg1, false);
        field2334++;
        var3.method336(true);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Llb;I[B)V", line = 39)
    public final void method1038(class112 arg0, int arg1, byte[] arg2) {
        field2340++;
        if (arg0.field1607[arg0.field1640] != 31 || arg0.field1607[arg0.field1640 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2336 == null) {
            this.field2336 = new Inflater(true);
        }
        try {
            this.field2336.setInput(arg0.field1607, arg0.field1640 + 10, arg0.field1607.length + -8 + -arg0.field1640 + arg1);
            this.field2336.inflate(arg2);
        } catch (Exception var5) {
            this.field2336.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field2336.reset();
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V", line = 65)
    public static void method1039(byte arg0) {
        field2338 = null;
        field2335 = null;
        field2337 = null;
        if (arg0 <= -32) {
            field2339 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V", line = 82)
    public class150() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lmh;B)V", line = 88)
    public static final void method1040(class65 arg0, byte arg1) {
        field2330++;
        class260.field4146 = arg0;
        int var2 = -38 / ((-arg1 - 32) / 48);
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(III)V", line = 119)
    private class150(int arg0, int arg1, int arg2) {
    }
}
