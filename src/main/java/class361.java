import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class361 extends class314 {

    @OriginalMember(owner = "client!br", name = "L", descriptor = "I")
    public static int field5715;

    @OriginalMember(owner = "client!br", name = "N", descriptor = "I")
    public static int field5717;

    @OriginalMember(owner = "client!br", name = "O", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!br", name = "P", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!br", name = "Q", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!br", name = "M", descriptor = "[I")
    public static int[] field5716;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(II)[I", line = 3)
    public final int[] method6(int arg0, int arg1) {
        if (arg1 < 109) {
            return null;
        } else {
            field5715++;
            return class328.field5091;
        }
    }

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(III)I", line = 17)
    public static final int method2410(int arg0, int arg1, int arg2) {
        int var3 = 90 % ((arg1 - 76) / 37);
        field5719++;
        int var4 = arg2 - 1 & arg0 >> 31;
        return ((arg0 >>> 31) + arg0) % arg2 + var4;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Ljava/io/File;ILjava/lang/String;)V", line = 30)
    public static final void method2411(File arg0, int arg1, String arg2) {
        field5718++;
        class191.field3162.put(arg2, arg0);
        if (arg1 != -29093) {
            field5716 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "h", descriptor = "(I)V", line = 46)
    public static void method2412(int arg0) {
        field5716 = null;
        if (arg0 > -54) {
            method2411(null, -99, null);
        }
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V", line = 57)
    public class361() {
        super(0, true);
    }
}
