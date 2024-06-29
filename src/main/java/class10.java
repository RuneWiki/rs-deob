import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class10 extends InputStream {

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field126 = 0;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field128 = 0;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "[I")
    public static int[] field125 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "Lgf;")
    public static class140 field129;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZIILak;II)V", line = 5)
    public static final void method54(boolean arg0, int arg1, int arg2, class172 arg3, int arg4, int arg5) {
        class291.field4652 = arg5;
        class274.field4416 = arg1;
        field130++;
        class67.field962 = arg4;
        class281.field4529 = arg2;
        class286.field4586 = 1;
        class100.field1466 = arg0;
        class325.field5040 = arg3;
    }

    @OriginalMember(owner = "client!mj", name = "read", descriptor = "()I", line = 22)
    public final int read() {
        class121.method867((byte) 48, 30000L);
        field131++;
        return -1;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BI)V", line = 34)
    public static final void method55(byte arg0, int arg1) {
        if (arg0 < 65) {
            field125 = (int[]) null;
        }
        field132++;
        class344 var2 = class110.method759(1, arg1, false);
        var2.method2384(-27354);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lak;III)Lrg;", line = 57)
    public static final class326 method56(class172 arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 9) {
            field127++;
            return class55.method353(arg0, arg2, (byte) -5, arg1) ? class172.method1302((byte) 62) : null;
        } else {
            return (class326) null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)V", line = 76)
    public static void method57(boolean arg0) {
        if (!arg0) {
            field125 = null;
            field129 = null;
        }
    }
}
