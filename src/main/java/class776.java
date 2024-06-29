import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class776 extends class154 {

    @OriginalMember(owner = "client!pn", name = "q", descriptor = "Z")
    public boolean field10717;

    @OriginalMember(owner = "client!pn", name = "m", descriptor = "I")
    public int field10713;

    @OriginalMember(owner = "client!pn", name = "o", descriptor = "I")
    public int field10715;

    @OriginalMember(owner = "client!pn", name = "r", descriptor = "I")
    public int field10718;

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "I")
    public int field10714;

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
    public int field10709;

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "Z")
    public static boolean field10710 = false;

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
    public static int field10711;

    @OriginalMember(owner = "client!pn", name = "l", descriptor = "I")
    public static int field10712;

    @OriginalMember(owner = "client!pn", name = "p", descriptor = "Ljava/lang/String;")
    public static String field10716;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)Z")
    public static final boolean method4259(int arg0, int arg1, int arg2) {
        int var3 = 30 % ((arg2 + 94) / 32);
        field10711++;
        return class154.method1209(arg1, (byte) 101, arg0) & class727.method4035(1865, arg0, arg1);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)V")
    public static void method4260(boolean arg0) {
        if (arg0) {
            method4259(59, 79, -89);
        }
        field10716 = null;
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(IIIIIZ)V")
    public class776(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field10717 = arg5;
        this.field10713 = arg4;
        this.field10715 = arg2;
        this.field10718 = arg1;
        this.field10714 = arg0;
        this.field10709 = arg3;
    }
}
