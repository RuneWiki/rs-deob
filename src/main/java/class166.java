import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class166 extends class417 {

    @OriginalMember(owner = "client!ru", name = "i", descriptor = "Ljava/lang/String;")
    public String field2612;

    @OriginalMember(owner = "client!ru", name = "j", descriptor = "Lbn;")
    public static class378 field2613 = new class378(8, 19);

    @OriginalMember(owner = "client!ru", name = "k", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!ru", name = "l", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!ru", name = "m", descriptor = "Lqa;")
    public static class208 field2616;

    static {
        new class572("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)V", line = 3)
    public static void method1192(byte arg0) {
        if (arg0 != -61) {
            field2613 = null;
        }
        field2616 = null;
        field2613 = null;
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "()V", line = 15)
    public class166() {
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 18)
    public class166(String arg0, int arg1) {
        this.field2612 = arg0;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IZ)Z", line = 30)
    public static final boolean method1193(int arg0, boolean arg1) {
        field2614++;
        if (!arg1) {
            method1192((byte) -121);
        }
        return arg0 == 2 || arg0 == 6 || arg0 == 9;
    }
}
