import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public abstract class class586 extends class255 {

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "I")
    public static int field8275 = 0;

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "[S")
    public static short[] field8273 = new short[256];

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "I")
    public static int field8274;

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "I")
    public static int field8276;

    @OriginalMember(owner = "client!ar", name = "i", descriptor = "I")
    public static int field8277;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IB)V")
    public static final void method3437(int arg0, byte arg1) {
        field8274++;
        if (arg1 != 88) {
            field8275 = 125;
        }
        class17 var2 = class245.method1634(arg1 ^ 0x59, (long) arg0, 7);
        var2.method69(13);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Z)V")
    public static void method3438(boolean arg0) {
        field8273 = null;
        if (!arg0) {
            method3437(124, (byte) -58);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
    public static final void method3439(int arg0) {
        field8277++;
        if (arg0 != 7) {
            field8275 = 111;
        }
        if (class32.field307 != null) {
            class32.field307.method1909((byte) 93);
        }
        if (class607.field8497 != null) {
            class607.field8497.method1909((byte) 93);
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)Lfp;")
    public abstract class596 method3440(int arg0);
}
