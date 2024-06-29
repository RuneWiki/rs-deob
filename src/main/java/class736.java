import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public abstract class class736 extends class547 {

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "S")
    public short field10280;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "I")
    public static int field10279 = 0;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "I")
    public static int field10281;

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
    public static int field10282;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
    public static int field10283;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "I")
    public static int field10284;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
    public static int field10285;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "(I)Z", line = 6)
    public final boolean method1637(int arg0) {
        if (arg0 != -1) {
            return false;
        } else {
            ++field10281;
            return class457.field6551[(super.field7718 >> class310.field4616) + class76.field1016 + -class282.field4335][(super.field7719 >> class310.field4616) + class76.field1016 + -class301.field4521];
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z[Ljw;)I", line = 18)
    public final int method1634(boolean arg0, class578[] arg1) {
        if (!arg0) {
            return 95;
        } else {
            ++field10283;
            return this.method3182(arg1, (byte) 32, super.field7719 >> class310.field4616, super.field7718 >> class310.field4616);
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(IIIIII)V", line = 33)
    public class736(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field7711 = (byte) arg4;
        super.field7719 = arg2;
        super.field7710 = (byte) arg3;
        this.field10280 = (short) arg5;
        super.field7718 = arg0;
        super.field7723 = arg1;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([Ljava/lang/String;[SI)V", line = 48)
    public static final void method4124(String[] arg0, short[] arg1, int arg2) {
        class228.method1574(arg0.length + -1, arg0, arg2, arg1, 8);
        ++field10285;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(ILha;)Z", line = 57)
    public final boolean method1638(int arg0, class66 arg1) {
        ++field10284;
        if (arg0 >= -101) {
            field10279 = -22;
        }
        return class136.method966(0, super.field7711, super.field7719 >> class310.field4616, super.field7718 >> class310.field4616);
    }
}
