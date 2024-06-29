import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public abstract class class312 extends class216 {

    @OriginalMember(owner = "client!so", name = "p", descriptor = "Lhc;")
    public static class368 field4234 = new class368("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!so", name = "u", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!so", name = "k", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!so", name = "l", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!so", name = "m", descriptor = "I")
    public int field4231;

    @OriginalMember(owner = "client!so", name = "o", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!so", name = "q", descriptor = "I")
    public int field4235;

    @OriginalMember(owner = "client!so", name = "r", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!so", name = "s", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!so", name = "t", descriptor = "I")
    public int field4238;

    @OriginalMember(owner = "client!so", name = "n", descriptor = "Z")
    public boolean field4232;

    static {
        new class368("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
        field4239 = 0;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IBIII)V", line = 4)
    public static final void method1889(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= 90) {
            field4239 = 103;
        }
        class430.field6003 = arg3;
        class143.field2090 = arg4;
        class42.field543 = arg2;
        field4229++;
        class80.field1119 = arg0;
    }

    @OriginalMember(owner = "client!so", name = "d", descriptor = "(I)Z", line = 20)
    public final boolean method697(int arg0) {
        if (arg0 <= 115) {
            return true;
        } else {
            field4230++;
            return false;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V", line = 34)
    public static void method1890(int arg0) {
        field4234 = null;
        if (arg0 >= -77) {
            method1891(-81);
        }
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(I)V", line = 48)
    public static final void method1891(int arg0) {
        class174.field2483 = new class429(class124.field1865.method2313((byte) -118, class445.field6241), "", class156.field2225, 1004, (long) arg0, 0, 0);
        field4233++;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(B)V", line = 56)
    public final void method702(byte arg0) {
        if (arg0 != 46) {
            this.method699(79, 2, (class58) null, (class216) null, true, 82, -98);
        }
        field4237++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IILea;Lac;ZII)V", line = 71)
    public final void method699(int arg0, int arg1, class58 arg2, class216 arg3, boolean arg4, int arg5, int arg6) {
        field4236++;
        if (arg0 == 22546) {
            throw new IllegalStateException();
        }
    }
}
