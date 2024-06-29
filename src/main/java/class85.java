import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public class class85 extends class611 {

    @OriginalMember(owner = "client!dha", name = "C", descriptor = "Ljava/lang/Object;")
    private Object field1134;

    @OriginalMember(owner = "client!dha", name = "D", descriptor = "Lhj;")
    public static class596 field1135 = new class596(42, 10);

    @OriginalMember(owner = "client!dha", name = "I", descriptor = "Lbja;")
    public static class34 field1140 = new class34(9, 0, 4, 1);

    @OriginalMember(owner = "client!dha", name = "J", descriptor = "Lfj;")
    public static class684 field1141 = new class684(5, 19);

    @OriginalMember(owner = "client!dha", name = "z", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!dha", name = "A", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!dha", name = "B", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!dha", name = "E", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!dha", name = "G", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!dha", name = "H", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!dha", name = "F", descriptor = "Lbt;")
    public static class48 field1137;

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(Ljava/io/File;Ljava/lang/String;I)V", line = 4)
    public static final void method784(File arg0, String arg1, int arg2) {
        if (arg2 != 1) {
            field1137 = null;
        }
        class664.field9124.put(arg1, arg0);
        field1138++;
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(BILkq;)Ljava/lang/String;", line = 18)
    public static final String method785(byte arg0, int arg1, class620 arg2) {
        if (arg0 != -85) {
            method784(null, null, 126);
        }
        field1131++;
        if (!client.method1882(arg2).method2320(arg1, (byte) -75) && arg2.field8434 == null) {
            return null;
        } else if (arg2.field8381 == null || arg2.field8381.length <= arg1 || arg2.field8381[arg1] == null || arg2.field8381[arg1].trim().length() == 0) {
            return class687.field9373 ? "Hidden-" + arg1 : null;
        } else {
            return arg2.field8381[arg1];
        }
    }

    @OriginalMember(owner = "client!dha", name = "h", descriptor = "(I)V", line = 42)
    public static void method786(int arg0) {
        if (arg0 == 1) {
            field1137 = null;
            field1141 = null;
            field1140 = null;
            field1135 = null;
        }
    }

    @OriginalMember(owner = "client!dha", name = "i", descriptor = "(I)V", line = 57)
    public static final void method787(int arg0) {
        field1133++;
        if (class346.field4335) {
            return;
        }
        class624.method3547(class172.field2057, arg0 + 123);
        if (class50.field707 != null) {
            class624.method3547(class50.field707, arg0 ^ 0x7B);
        }
        if (arg0 != 1) {
            field1137 = null;
        }
        class346.field4335 = true;
    }

    @OriginalMember(owner = "client!dha", name = "d", descriptor = "(I)Ljava/lang/Object;", line = 81)
    public final Object method788(int arg0) {
        field1136++;
        if (arg0 != 14) {
            method785((byte) -14, 20, null);
        }
        return this.field1134;
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(B[B)[B", line = 94)
    public static final byte[] method789(byte arg0, byte[] arg1) {
        field1132++;
        if (arg1 == null) {
            return null;
        } else {
            int var2 = 64 / ((arg0 + 11) / 45);
            byte[] var3 = new byte[arg1.length];
            class211.method1330(arg1, 0, var3, 0, arg1.length);
            return var3;
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(I)Z", line = 111)
    public final boolean method790(int arg0) {
        if (arg0 != 14) {
            method789((byte) -95, null);
        }
        field1139++;
        return false;
    }

    @OriginalMember(owner = "client!dha", name = "<init>", descriptor = "(Lwe;Ljava/lang/Object;I)V", line = 130)
    public class85(class428 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field1134 = arg1;
    }
}
