import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public abstract class class172 extends class69 {

    @OriginalMember(owner = "client!pga", name = "n", descriptor = "[I")
    public static int[] field2189 = new int[2048];

    @OriginalMember(owner = "client!pga", name = "m", descriptor = "I")
    public static int field2188 = 999999;

    @OriginalMember(owner = "client!pga", name = "j", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!pga", name = "k", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!pga", name = "l", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(BI)I", line = 4)
    public static final int method1101(byte arg0, int arg1) {
        if (arg0 > -29) {
            field2186 = 117;
        }
        field2187++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)V", line = 15)
    public static void method1102(int arg0) {
        if (arg0 >= 104) {
            field2189 = null;
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIIIIIII)V", line = 36)
    public static final void method1103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2185++;
        if (arg6 >= class177.field2236 && arg6 <= class627.field8783 && class177.field2236 <= arg0 && arg0 <= class627.field8783 && class177.field2236 <= arg4 && arg4 <= class627.field8783 && class177.field2236 <= arg8 && arg8 <= class627.field8783 && arg7 >= class727.field10060 && class474.field6576 >= arg7 && class727.field10060 <= arg2 && class474.field6576 >= arg2 && class727.field10060 <= arg5 && class474.field6576 >= arg5 && class727.field10060 <= arg9 && class474.field6576 >= arg9) {
            class294.method1936(arg8, arg4, 15938, arg7, arg6, arg1, arg9, arg2, arg0, arg5);
        } else {
            class723.method4022(arg2, arg1, arg7, arg5, arg0, arg4, arg6, arg9, arg3 ^ 0x44EE, arg8);
        }
        if (arg3 != 2048) {
            method1101((byte) 47, -88);
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(ILgga;)V")
    public abstract void method102(int arg0, class511 arg1);

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(BLhia;)V")
    public abstract void method100(byte arg0, class48 arg1);
}
