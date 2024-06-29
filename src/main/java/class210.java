import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class210 extends class204 {

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lfs;)V", line = 4)
    public class210(class607 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V", line = 7)
    public final void method486(int arg0) {
        if (arg0 != -4591) {
            this.method1330((byte) 2);
        }
        ++field2923;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)I", line = 19)
    public final int method487(int arg0, int arg1) {
        ++field2922;
        int var3 = -60 / ((-57 - arg1) / 60);
        return 1;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZIIIII)V", line = 30)
    public static final void method1328(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2916;
        if (!arg1) {
            if (~class688.field9602.field8548.method1981((byte) -98) != -1 && arg6 != 0 && ~class70.field770 > -51 && arg0 != -1) {
                class7.field40[class70.field770++] = new class22((byte) 1, arg0, arg6, arg5, arg4, arg3, arg2, (class230) null);
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)I", line = 47)
    public final int method490(byte arg0) {
        ++field2920;
        return arg0 <= 83 ? 121 : 0;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V", line = 58)
    public static final void method1329(byte arg0) {
        ++field2917;
        class546.field7590 = true;
        if (arg0 != -58) {
            method1328(-74, true, 66, 55, 49, 89, -93);
        }
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(II)V", line = 70)
    public final void method488(int arg0, int arg1) {
        ++field2921;
        super.field2852 = arg0;
        if (arg1 <= -105) {
            ;
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(B)I", line = 81)
    public final int method1330(byte arg0) {
        ++field2918;
        if (arg0 != -98) {
            this.method488(58, -121);
        }
        return super.field2852;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(ILfs;)V", line = 95)
    public class210(int arg0, class607 arg1) {
        super(arg0, arg1);
    }
}
