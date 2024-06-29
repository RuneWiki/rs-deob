import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public abstract class class306 extends class538 {

    @OriginalMember(owner = "client!kn", name = "C", descriptor = "I")
    public static int field4534 = 0;

    @OriginalMember(owner = "client!kn", name = "u", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!kn", name = "v", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!kn", name = "w", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!kn", name = "x", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!kn", name = "y", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!kn", name = "A", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!kn", name = "B", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!kn", name = "D", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!kn", name = "z", descriptor = "[Lf;")
    public static class256[] field4531;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILr;ILcaa;ZII)V")
    public final void method311(int arg0, class98 arg1, int arg2, class538 arg3, boolean arg4, int arg5, int arg6) {
        if (arg5 < 24) {
            this.method309(true);
        }
        ++field4527;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I[Ltg;)I")
    public final int method1808(int arg0, class334[] arg1) {
        if (arg0 != 16) {
            this.method1808(-3, (class334[]) null);
        }
        ++field4535;
        return this.method3104(super.field7895 >> class125.field1831, super.field7896 >> class125.field1831, (byte) -54, arg1);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
    public static void method1919(int arg0) {
        field4531 = null;
        if (arg0 != 0) {
            field4531 = null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(Z)Z")
    public final boolean method309(boolean arg0) {
        ++field4532;
        if (!arg0) {
            field4531 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(B)V")
    public final void method315(byte arg0) {
        ++field4533;
        if (arg0 > 101) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(Z)Z")
    public final boolean method1807(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            ++field4530;
            class361 var2 = class545.method3192(super.field7905, super.field7895 >> class125.field1831, super.field7896 >> class125.field1831);
            return var2 != null && var2.field5301.field4295 ? class476.method2735(super.field7896 >> class125.field1831, super.field7895 >> class125.field1831, var2.field5301.method271(false) + this.method271(false), -1, super.field7905) : class636.method3638(-20628, super.field7896 >> class125.field1831, super.field7905, super.field7895 >> class125.field1831);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)Z")
    public static final boolean method1920(int arg0, int arg1, int arg2) {
        ++field4528;
        if (arg1 < 3) {
            method1919(-125);
        }
        return class301.method1895(arg0, arg2, (byte) -53) | ~(arg2 & 2048) != -1 || class115.method855(arg0, arg2, -1148);
    }

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(I)Z")
    public final boolean method1809(int arg0) {
        if (arg0 != 0) {
            return false;
        } else {
            ++field4526;
            return class406.field6066[(super.field7895 >> class125.field1831) + (-class361.field5293 - -class176.field2466)][(super.field7896 >> class125.field1831) + -class545.field8045 + class176.field2466];
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(IIIII)V")
    public class306(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super.field7905 = (byte) arg3;
        super.field7896 = arg2;
        super.field7900 = (byte) arg4;
        super.field7895 = arg0;
        super.field7894 = arg1;
    }
}
