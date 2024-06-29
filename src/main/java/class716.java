import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class716 {

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "Lqo;")
    private class22 field9747;

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "J")
    public long field9752;

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "[[F")
    public static float[][] field9748 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!dw", name = "g", descriptor = "I")
    public static int field9753 = -1;

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "I")
    public static int field9749;

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "I")
    public static int field9750;

    @OriginalMember(owner = "client!dw", name = "h", descriptor = "I")
    public static int field9754;

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "Ljava/lang/Object;")
    public static Object field9751;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Z)V", line = 9)
    public static void method3986(boolean arg0) {
        field9748 = null;
        field9751 = null;
        if (!arg0) {
            field9748 = null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "finalize", descriptor = "()V", line = 20)
    protected final void finalize() throws Throwable {
        this.field9747.method254(this.field9752, false);
        field9749++;
        super.finalize();
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Lqo;J[Ltba;)V", line = 34)
    public class716(class22 arg0, long arg1, class164[] arg2) {
        this.field9747 = arg0;
        this.field9752 = arg1;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(BII)Z", line = 46)
    public static final boolean method3987(byte arg0, int arg1, int arg2) {
        int var3 = 24 % ((arg0 - 76) / 42);
        field9750++;
        return (arg1 & 0x70000) != 0 | class362.method2308(arg2, arg1, -1) || class138.method1119(arg1, -84, arg2);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(BLcea;)Lwg;", line = 57)
    public static final class427 method3988(byte arg0, class215 arg1) {
        field9754++;
        if (arg0 == 26) {
            class138 var2 = class427.method2609(arg1, arg0 + 59);
            int var3 = arg1.method1517((byte) 125);
            return new class427(var2.field2307, var2.field2304, var2.field2301, var2.field2299, var2.field2300, var3);
        } else {
            return null;
        }
    }
}
