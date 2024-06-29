import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gha")
public class class500 {

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "I")
    public static int field6978 = 0;

    @OriginalMember(owner = "client!gha", name = "b", descriptor = "I")
    public static int field6979;

    @OriginalMember(owner = "client!gha", name = "c", descriptor = "I")
    public static int field6980;

    @OriginalMember(owner = "client!gha", name = "d", descriptor = "I")
    public static int field6981;

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(IIILkaa;B)V", line = 5)
    public static final void method3017(int arg0, int arg1, int arg2, class583 arg3, byte arg4) {
        arg3.field7963.method473(-31, arg0);
        if (arg4 <= -86) {
            field6980++;
            arg3.field7963.method453(arg2, (byte) 70);
            arg3.field7963.method467(2714, arg1);
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(IIIII)V", line = 22)
    public static final void method3018(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 - arg1 >= class607.field8185 && class726.field10064 >= (arg0 + arg1) && (arg3 - arg1) >= class291.field4181 && arg1 + arg3 <= class262.field3848) {
            class647.method3625(arg0, arg1, arg3, 2, arg4);
        } else {
            class158.method991(arg1, arg0, arg3, -1, arg4);
        }
        int var5 = -81 / ((-arg2 - 20) / 51);
        field6981++;
    }
}
