import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class227 {

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field3315;

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "F")
    public static float field3314;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "Lbu;")
    public static class19 field3313;

    static {
        new class572("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field3315 = new String[100];
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)V", line = 6)
    public static void method1455(int arg0) {
        field3315 = null;
        field3313 = null;
        if (arg0 > -47) {
            method1455(-34);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(III)Z", line = 18)
    public static final boolean method1456(int arg0, int arg1, int arg2) {
        field3311++;
        if (arg0 > 0) {
            return false;
        } else {
            return (arg2 & 0x800) != 0 | class187.method1291(arg1, 32768, arg2) || class444.method2666(-13624, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!kv", name = "toString", descriptor = "()Ljava/lang/String;", line = 29)
    public final String toString() {
        field3312++;
        throw new IllegalStateException();
    }
}
