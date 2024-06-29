import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class113 {

    @OriginalMember(owner = "client!su", name = "g", descriptor = "I")
    public static int field1823 = 0;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!su", name = "b", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!su", name = "c", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!su", name = "e", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!su", name = "f", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!su", name = "d", descriptor = "Lqk;")
    public static class8 field1820;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V")
    public static void method851(byte arg0) {
        field1820 = null;
        int var1 = -59 % ((63 - arg0) / 52);
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIZIII)I")
    public static final int method852(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg2) {
            return -74;
        }
        field1822++;
        if (class492.field7122 == null) {
            return 0;
        }
        if (arg5 < 3) {
            int var6 = arg1 >> 7;
            int var7 = arg3 >> 7;
            if (arg4 < 0 || arg0 < 0 || class9.field111 - 1 < arg4 || arg0 > class192.field2809 - 1) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || (class9.field111 - 1) < var6 || var7 > class192.field2809 - 1) {
                return 0;
            }
            boolean var8 = (class27.field379[1][arg1 >> 7][arg3 >> 7] & 0x2) != 0;
            if ((arg1 & 0x7F) == 0) {
                boolean var9 = (class27.field379[1][var6 - 1][arg3 >> 7] & 0x2) != 0;
                boolean var10 = (class27.field379[1][var6][arg3 >> 7] & 0x2) != 0;
                if (var9 != var10) {
                    var8 = (class27.field379[1][arg4][arg0] & 0x2) != 0;
                }
            }
            if ((arg3 & 0x7F) == 0) {
                boolean var11 = (class27.field379[1][arg1 >> 7][var7 - 1] & 0x2) != 0;
                boolean var12 = (class27.field379[1][arg1 >> 7][var7] & 0x2) != 0;
                if (var11 != var12) {
                    var8 = (class27.field379[1][arg4][arg0] & 0x2) != 0;
                }
            }
            if (var8) {
                arg5++;
            }
        }
        return class492.field7122[arg5].method79(arg1, arg3);
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(II)V")
    public static final void method853(int arg0, int arg1) {
        if (arg0 > 5) {
            class45.field643 = arg1;
            field1819++;
            class445.field6549.method2764(-769);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(ILpf;IB)V")
    public static final void method854(int arg0, class487 arg1, int arg2, byte arg3) {
        int var4 = -66 % ((-arg3 - 8) / 54);
        field1818++;
        if (arg1.field166 == arg2 && arg2 != -1) {
            class55 var5 = class50.field716.method831(arg2, (byte) 54);
            int var6 = var5.field792;
            if (var6 == 1) {
                arg1.field194 = 0;
                arg1.field226 = arg0;
                arg1.field212 = 1;
                arg1.field191 = 0;
                arg1.field206 = 0;
                class196.method1286(var5, arg1.field6287, class81.field1158 == arg1, (byte) 1, arg1.field6279, arg1.field6284, arg1.field194);
            }
            if (var6 == 2) {
                arg1.field206 = 0;
                return;
            }
        } else if (arg2 == -1 || arg1.field166 == -1 || class50.field716.method831(arg2, (byte) 54).field784 >= class50.field716.method831(arg1.field166, (byte) 54).field784) {
            arg1.field226 = arg0;
            arg1.field206 = 0;
            arg1.field212 = 1;
            arg1.field194 = 0;
            arg1.field191 = 0;
            arg1.field166 = arg2;
            arg1.field264 = arg1.field265;
            if (arg1.field166 == -1) {
                return;
            }
            class196.method1286(class50.field716.method831(arg1.field166, (byte) 54), arg1.field6287, class81.field1158 == arg1, (byte) 1, arg1.field6279, arg1.field6284, arg1.field194);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IB)Z")
    public static final boolean method855(int arg0, byte arg1) {
        field1817++;
        if (arg1 == -103) {
            return (-arg0 & arg0) == arg0;
        } else {
            return true;
        }
    }
}
