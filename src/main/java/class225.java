import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public abstract class class225 extends class318 {

    @OriginalMember(owner = "client!ki", name = "J", descriptor = "S")
    public short field3029;

    @OriginalMember(owner = "client!ki", name = "C", descriptor = "S")
    public short field3022;

    @OriginalMember(owner = "client!ki", name = "I", descriptor = "Lwt;")
    public static class451 field3028 = new class451();

    @OriginalMember(owner = "client!ki", name = "L", descriptor = "I")
    public static int field3031 = -1;

    @OriginalMember(owner = "client!ki", name = "D", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!ki", name = "E", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!ki", name = "F", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!ki", name = "G", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!ki", name = "H", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!ki", name = "K", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)Z", line = 7)
    public final boolean method642(byte arg0) {
        if (arg0 != 2) {
            return false;
        } else {
            ++field3027;
            return false;
        }
    }

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "(I)Z", line = 18)
    public final boolean method628(int arg0) {
        if (arg0 < 95) {
            return true;
        } else {
            ++field3023;
            return class417.field5900[(super.field4410 >> class371.field5241) + -class103.field1410 + class218.field2854][(super.field4418 >> class371.field5241) + -class307.field4314 + class218.field2854];
        }
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(B)V", line = 30)
    public static void method1333(byte arg0) {
        if (arg0 >= 91) {
            field3028 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLha;ZILuq;II)V", line = 41)
    public final void method648(byte arg0, class548 arg1, boolean arg2, int arg3, class318 arg4, int arg5, int arg6) {
        ++field3024;
        if (arg0 >= -8) {
            field3028 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "(I)V", line = 53)
    public final void method641(int arg0) {
        ++field3025;
        if (arg0 < 91) {
            field3031 = -114;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([Ltj;B)I", line = 65)
    public final int method626(class687[] arg0, byte arg1) {
        ++field3026;
        if (arg1 != -80) {
            this.method626((class687[]) null, (byte) 18);
        }
        return this.method2059((byte) -111, super.field4410 >> class371.field5241, super.field4418 >> class371.field5241, arg0);
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(Lha;B)Z", line = 80)
    public final boolean method627(class548 arg0, byte arg1) {
        ++field3030;
        if (arg1 < 80) {
            this.method642((byte) 111);
        }
        return class685.method3858(this.method790(-11692), super.field4418 >> class371.field5241, super.field4410 >> class371.field5241, super.field4419, 1);
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(IIIIIII)V", line = 90)
    public class225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super.field4418 = arg2;
        super.field4410 = arg0;
        super.field4408 = (byte) arg3;
        this.field3029 = (short) arg5;
        this.field3022 = (short) arg6;
        super.field4419 = (byte) arg4;
        super.field4413 = arg1;
    }
}
