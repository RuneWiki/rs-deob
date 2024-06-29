import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public class class544 extends class571 {

    @OriginalMember(owner = "client!hha", name = "j", descriptor = "I")
    public static int field7812;

    @OriginalMember(owner = "client!hha", name = "k", descriptor = "I")
    public static int field7813;

    @OriginalMember(owner = "client!hha", name = "m", descriptor = "I")
    public int field7815;

    @OriginalMember(owner = "client!hha", name = "n", descriptor = "I")
    public int field7816;

    @OriginalMember(owner = "client!hha", name = "o", descriptor = "I")
    public static int field7817;

    @OriginalMember(owner = "client!hha", name = "p", descriptor = "I")
    public int field7818;

    @OriginalMember(owner = "client!hha", name = "q", descriptor = "I")
    public int field7819;

    @OriginalMember(owner = "client!hha", name = "r", descriptor = "I")
    public int field7820;

    @OriginalMember(owner = "client!hha", name = "s", descriptor = "I")
    public int field7821;

    @OriginalMember(owner = "client!hha", name = "l", descriptor = "Ljava/lang/String;")
    public static String field7814;

    @OriginalMember(owner = "client!hha", name = "t", descriptor = "Ljava/lang/String;")
    public String field7822;

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(I)V", line = 12)
    public static void method3250(int arg0) {
        field7814 = null;
        if (arg0 != 25216) {
            method3250(109);
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(B)V", line = 23)
    public static final void method3251(byte arg0) {
        if (arg0 != -126) {
            return;
        }
        field7817++;
        if (class590.field8323 != null) {
            class590.field8323.method3136(14801);
        }
        if (class643.field8993 == null) {
            return;
        }
        while (true) {
            try {
                class643.field8993.join();
                return;
            } catch (InterruptedException var1) {
            }
        }
    }
}
