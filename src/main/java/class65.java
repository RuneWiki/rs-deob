import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class65 extends class179 {

    @OriginalMember(owner = "client!er", name = "p", descriptor = "Ljava/lang/String;")
    public String field1073;

    @OriginalMember(owner = "client!er", name = "j", descriptor = "I")
    public static int field1067 = 0;

    @OriginalMember(owner = "client!er", name = "q", descriptor = "I")
    public static int field1074 = 0;

    @OriginalMember(owner = "client!er", name = "l", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!er", name = "m", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!er", name = "n", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!er", name = "o", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!er", name = "k", descriptor = "Ltq;")
    public static class427 field1068;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(III)Z")
    public static final boolean method448(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field1074 = -122;
        }
        field1071++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "(I)V")
    public static void method449(int arg0) {
        if (arg0 != -30710) {
            method450(-98, true, 6, -31, -82);
        }
        field1068 = null;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IZIII)V")
    public static final void method450(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (class30.field395 == 0) {
            class434.method2536(-20860, false);
        } else {
            class383.field5581 = class30.field395;
            class421.method2461((byte) -28, 0);
        }
        field1069++;
        class23.field292 = arg4;
        if (arg3 > 9) {
            class165.field2570 = arg2;
            class247.field3774 = arg1;
            class492.method2957(arg0);
        }
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V")
    public class65() {
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class65(String arg0) {
        this.field1073 = arg0;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(FZ)F")
    public static final float method451(float arg0, boolean arg1) {
        if (arg1) {
            field1067 = 19;
        }
        field1072++;
        return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
    }
}
