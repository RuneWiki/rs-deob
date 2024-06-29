import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class394 {

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "J")
    public long field5420;

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "Lqfa;")
    private class106 field5421;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "Lne;")
    public static class336 field5419 = new class336("WTQA", "office", "_qa", 2);

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "Lbu;")
    public static class21 field5424 = new class21(58, -2);

    @OriginalMember(owner = "client!mv", name = "h", descriptor = "Lbu;")
    public static class21 field5426 = new class21(111, 2);

    @OriginalMember(owner = "client!mv", name = "k", descriptor = "Z")
    public static boolean field5429 = false;

    @OriginalMember(owner = "client!mv", name = "i", descriptor = "Lbu;")
    public static class21 field5427 = new class21(49, 2);

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!mv", name = "j", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!mv", name = "l", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)V", line = 4)
    public static void method2435(int arg0) {
        field5427 = null;
        if (arg0 != -2) {
            method2435(-110);
        }
        field5426 = null;
        field5419 = null;
        field5424 = null;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIIIZIIII)Z", line = 17)
    public static final boolean method2436(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        field5422++;
        int var9 = class210.field3250.field4670[0];
        int var10 = class210.field3250.field4672[0];
        if (var9 < 0 || class768.field10571 <= var9 || var10 < 0 || var10 >= class350.field4898) {
            return false;
        } else if (arg3 >= arg7 && class768.field10571 > arg3 && arg5 >= 0 && arg5 < class350.field4898) {
            int var11 = class460.method2734(arg1, arg0, arg6, arg3, (byte) 55, class346.field4838[class210.field3250.field5755], arg4, class210.field3250.method2102(true), class347.field4858, var9, arg8, arg2, var10, class777.field10671, arg5);
            if (var11 < 1) {
                return false;
            }
            class779.field10695 = class347.field4858[var11 - 1];
            class530.field7675 = class777.field10671[var11 - 1];
            class416.field5701 = false;
            class22.method225((byte) -113);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lqfa;JI)V", line = 67)
    public class394(class106 arg0, long arg1, int arg2) {
        this.field5420 = arg1;
        this.field5421 = arg0;
    }

    @OriginalMember(owner = "client!mv", name = "finalize", descriptor = "()V", line = 78)
    protected final void finalize() throws Throwable {
        field5425++;
        this.field5421.method773(116, this.field5420);
        super.finalize();
    }
}
