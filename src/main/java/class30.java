import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class30 extends class154 {

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "Ljava/lang/String;")
    public String field458;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "[Z")
    public static boolean[] field459 = new boolean[100];

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
    public static final void method188(byte arg0) {
        if (class257.field4154 != null) {
            class179 var1 = class257.field4154;
            synchronized (class257.field4154) {
                class257.field4154 = null;
            }
        }
        if (arg0 <= 110) {
            method188((byte) 41);
        }
        field457++;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(II)I")
    public static final int method189(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(II)V")
    public static final void method190(int arg0, int arg1) {
        if (arg0 != 126) {
            field459 = null;
        }
        class81.field1114.method943(arg1, true);
        field456++;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)V")
    public static void method191(byte arg0) {
        if (arg0 != -2) {
            method188((byte) -67);
        }
        field459 = null;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V")
    public class30() {
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class30(String arg0, int arg1) {
        this.field458 = arg0;
    }
}
