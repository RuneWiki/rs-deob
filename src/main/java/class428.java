import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class428 extends class223 {

    @OriginalMember(owner = "client!ou", name = "o", descriptor = "Ljava/lang/String;")
    public String field6308;

    @OriginalMember(owner = "client!ou", name = "n", descriptor = "I")
    public static int field6307 = -2;

    @OriginalMember(owner = "client!ou", name = "l", descriptor = "Lgk;")
    public static class331 field6305 = new class331("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!ou", name = "q", descriptor = "I")
    public static int field6310 = 0;

    @OriginalMember(owner = "client!ou", name = "p", descriptor = "Lbg;")
    public static class324 field6309 = new class324(34, 16);

    @OriginalMember(owner = "client!ou", name = "m", descriptor = "I")
    public static int field6306;

    @OriginalMember(owner = "client!ou", name = "r", descriptor = "Lsn;")
    public static class443 field6311;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIB)Z", line = 5)
    public static final boolean method2608(int arg0, int arg1, byte arg2) {
        if (arg2 <= 22) {
            field6309 = null;
        }
        field6306++;
        return class209.method1449(arg1, arg0, (byte) -108) || class66.method645(-20147, arg1, arg0);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V", line = 17)
    public static void method2609(int arg0) {
        field6305 = null;
        field6309 = null;
        if (arg0 <= 125) {
            field6309 = null;
        }
        field6311 = null;
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "()V", line = 35)
    public class428() {
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 37)
    public class428(String arg0, int arg1) {
        this.field6308 = arg0;
    }
}
