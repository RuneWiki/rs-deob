import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class222 {

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    public int field3101;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "Llj;")
    private class565 field3100;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field3098 = 0;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "Lem;")
    public static class206 field3094 = new class206(68, 0);

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "F")
    public static float field3095;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!nj", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        field3093++;
        this.field3100.method3190(-20520, this.field3101);
        super.finalize();
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIII)V", line = 14)
    public static final void method1404(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -1) {
            method1407((byte) 53);
        }
        field3097++;
        if (arg0 >= class469.field6466 && arg0 <= class533.field7200) {
            int var5 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg1);
            int var6 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg3);
            class313.method1891(var6, var5, arg0, 4, arg4);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V", line = 36)
    public static final void method1405(int arg0, int arg1) {
        field3103++;
        class51 var2 = class703.method3938(arg0 - 1989279598, arg1, arg0);
        var2.method404(90);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lcr;IIZILda;)V", line = 46)
    public static final void method1406(class533 arg0, int arg1, int arg2, boolean arg3, int arg4, class55 arg5) {
        if (arg3) {
            method1407((byte) -92);
        }
        field3102++;
        if (arg5 != null) {
            arg0.method3025(arg2, arg4, (byte) -15, arg5.method424(), arg5.method420(), arg5.method464(), arg5.method466(), arg5.method415(), arg5.method450(), arg1, arg5.method463());
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V", line = 71)
    public static void method1407(byte arg0) {
        if (arg0 != -51) {
            field3095 = -1.0335193F;
        }
        field3094 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IBI)Z", line = 81)
    public static final boolean method1408(int arg0, byte arg1, int arg2) {
        field3099++;
        if (arg1 >= -35) {
            method1405(-2, -40);
        }
        return (arg0 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Llj;II)V", line = 94)
    public class222(class565 arg0, int arg1, int arg2) {
        this.field3101 = arg2;
        this.field3100 = arg0;
    }
}
