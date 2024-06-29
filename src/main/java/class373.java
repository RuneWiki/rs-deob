import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class373 {

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "B")
    public byte field5549;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "I")
    public int field5543;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "I")
    public int field5551;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
    public int field5544;

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "I")
    public int field5552;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
    public int field5545;

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "Lkj;")
    public static class527 field5550 = new class527(9, 4);

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!ns", name = "o", descriptor = "Lhq;")
    public static class144 field5557;

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "Lcl;")
    public class245 field5548;

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "Lnq;")
    public class429 field5553;

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "Lwc;")
    public class60 field5554;

    @OriginalMember(owner = "client!ns", name = "n", descriptor = "Lee;")
    public class630 field5556;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIIIBIIII)V")
    public static final void method2352(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 != 87) {
            method2356(5);
        }
        field5547++;
        if (arg9 >= class704.field9911 && arg9 <= class379.field5612 && class704.field9911 <= arg0 && arg0 <= class379.field5612 && class704.field9911 <= arg1 && arg1 <= class379.field5612 && class704.field9911 <= arg6 && class379.field5612 >= arg6 && arg2 >= class309.field4556 && arg2 <= client.field4115 && arg7 >= class309.field4556 && arg7 <= client.field4115 && arg4 >= class309.field4556 && arg4 <= client.field4115 && class309.field4556 <= arg3 && arg3 <= client.field4115) {
            class72.method791(arg6, arg8, arg7, arg9, arg0, arg4, arg1, arg3, -393, arg2);
        } else {
            class8.method264(arg4, arg1, arg9, arg2, -23749, arg3, arg7, arg6, arg8, arg0);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)V")
    public static void method2353(byte arg0) {
        if (arg0 >= -108) {
            method2355(-73, 0, -87);
        }
        field5550 = null;
        field5557 = null;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)Z")
    public final boolean method2354(boolean arg0) {
        field5555++;
        if (arg0) {
            return true;
        } else {
            return this.field5549 == 2 || this.field5549 == 3;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(III)Lbu;")
    public static final class19 method2355(int arg0, int arg1, int arg2) {
        field5546++;
        class19 var3 = (class19) class114.field2042.method2596((long) arg2 << 32 | (long) arg1, 55);
        if (var3 == null) {
            var3 = new class19(arg2, arg1);
            class114.field2042.method2598(var3, var3.field6132, (byte) 8);
        }
        return arg0 < 70 ? null : var3;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V")
    public static final void method2356(int arg0) {
        if (arg0 == 0) {
            if (class531.field7449 == 2) {
                class438.field6320[0].method2456(class386.field5664[0]);
                class438.field6320[1].method2456(class386.field5664[1]);
            } else if (class531.field7449 == 3) {
                class438.field6320[0].method2456(class386.field5664[0]);
                class438.field6320[1].method2456(class386.field5664[1]);
                class438.field6320[2].method2456(class386.field5664[2]);
            } else {
                class438.field6320[0].method2456(class386.field5664[0]);
                class438.field6320[1].method2456(class386.field5664[1]);
                class438.field6320[2].method2456(class386.field5664[2]);
                class438.field6320[3].method2456(class386.field5664[3]);
            }
        } else if (arg0 == 1) {
            if (class531.field7449 == 2) {
                class438.field6320[0].method2456(class386.field5664[2]);
            } else if (class531.field7449 == 3) {
                class438.field6320[0].method2456(class386.field5664[3]);
                class438.field6320[1].method2456(class386.field5664[4]);
            } else {
                class438.field6320[0].method2456(class386.field5664[4]);
                class438.field6320[1].method2456(class386.field5664[5]);
                class438.field6320[2].method2456(class386.field5664[6]);
            }
        } else if (arg0 == 2) {
            if (class531.field7449 == 2) {
                class438.field6320[0].method2456(class386.field5664[3]);
                return;
            }
            if (class531.field7449 == 3) {
                class438.field6320[0].method2456(class386.field5664[5]);
                return;
            }
            class438.field6320[0].method2456(class386.field5664[7]);
        }
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(BIIIII)V")
    public class373(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5549 = arg0;
        this.field5543 = arg4;
        this.field5551 = arg1;
        this.field5544 = arg5;
        this.field5552 = arg3;
        this.field5545 = arg2;
    }
}
