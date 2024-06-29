import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fha")
public abstract class class378 extends class353 {

    @OriginalMember(owner = "client!fha", name = "j", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!fha", name = "k", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!fha", name = "h", descriptor = "Loh;")
    public static class404 field5181;

    @OriginalMember(owner = "client!fha", name = "i", descriptor = "[I")
    public static int[] field5182;

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(B)V")
    public static void method2326(byte arg0) {
        field5182 = null;
        field5181 = null;
        if (arg0 != -70) {
            method2327(false, -124);
        }
    }

    @OriginalMember(owner = "client!fha", name = "b", descriptor = "(B)Lvq;")
    public abstract class460 method751(byte arg0);

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(ZI)V")
    public static final void method2327(boolean arg0, int arg1) {
        field5184++;
        class620 var2 = class326.field4231;
        synchronized (class326.field4231) {
            class326.field4231.method3539((byte) 125, arg1);
        }
        if (!arg0) {
            field5181 = null;
        }
    }
}
