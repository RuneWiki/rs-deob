import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class582 extends class263 {

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public volatile int field7829 = -1;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "Ljava/lang/String;")
    public volatile String field7827;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "Lra;")
    public static class98 field7831 = new class98();

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public static int field7828;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public static int field7830;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3232(int arg0, int arg1, byte arg2) {
        if (arg2 != 70) {
            field7831 = null;
        }
        field7830++;
        return (arg0 & 0x70000) != 0 | class39.method252(arg0, (byte) -11, arg1) || class20.method124(arg0, arg2 + 22938, arg1);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V")
    public static final void method3233(boolean arg0) {
        if (class309.field3898.method424()) {
            class309.field3898.method439(class472.field5828);
            class384.method2205((byte) 92);
            class309.field3898.method417(class472.field5828);
            class309.field3898.method411(class472.field5828);
        } else {
            class364.method2114(class628.field8526, 126);
        }
        field7828++;
        if (!arg0) {
            field7831 = null;
        }
        class377.method2172(100);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V")
    public static void method3234(int arg0) {
        if (arg0 == -1) {
            field7831 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class582(String arg0) {
        this.field7827 = arg0;
    }
}
