import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class670 extends class405 {

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    private int field9139;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    private int field9142;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    private int field9137;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    private int field9135;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "Z")
    public static boolean field9134 = false;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "Ljp;")
    public static class359 field9145 = null;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "Lkaa;")
    public static class47 field9143 = new class47(47, 2);

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "B")
    public static byte field9146;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field9133;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public static int field9136;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field9138;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field9140;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public static int field9141;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
    public static int field9144;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(III)V")
    public final void method1403(int arg0, int arg1, int arg2) {
        ++field9136;
        int var4 = this.field9137 * arg0 >> 12;
        int var5 = this.field9135 * arg0 >> 12;
        int var6 = this.field9142 * arg2 >> 12;
        if (arg1 != 2) {
            this.method1405(-114, 74, 14);
        }
        int var7 = this.field9139 * arg2 >> 12;
        class382.method2252(super.field5641, var5, var6, var7, super.field5644, var4, super.field5642, 107);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBI)V")
    public final void method1404(int arg0, byte arg1, int arg2) {
        ++field9133;
        int var4 = this.field9137 * arg0 >> 12;
        int var5 = this.field9135 * arg0 >> 12;
        if (arg1 == -72) {
            int var6 = this.field9142 * arg2 >> 12;
            int var7 = this.field9139 * arg2 >> 12;
            class251.method1538(var6, (byte) 102, var4, var5, super.field5642, var7);
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(IIIIIII)V")
    public class670(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field9139 = arg3;
        this.field9142 = arg1;
        this.field9137 = arg0;
        this.field9135 = arg2;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method3695(String arg0, int arg1) {
        ++field9144;
        if (arg1 != -22534) {
            method3697(-58);
        }
        return class18.field241.containsKey(arg0);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)V")
    public final void method1405(int arg0, int arg1, int arg2) {
        int var4 = 123 / ((-71 - arg0) / 53);
        ++field9138;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
    public static final void method3696(int arg0) {
        ++field9140;
        class112.field1850.method2138(arg0 + 28127);
        if (arg0 == -28128) {
            class8.field160.method2138(-1);
        }
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)V")
    public static void method3697(int arg0) {
        field9143 = null;
        if (arg0 != 3) {
            field9143 = null;
        }
    }
}
