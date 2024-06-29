import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class582 implements class134 {

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "Lvo;")
    private class39 field8476;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "Lvg;")
    public static class49 field8475 = new class49();

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "Lop;")
    public static class172 field8477 = new class172();

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "I")
    public static int field8482 = class565.method3314((byte) 17, 1600);

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public static int field8473;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field8474;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public static int field8478;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field8479;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "I")
    public static int field8480;

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "Ltd;")
    public static class420 field8483;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "Lsk;")
    public static class575 field8481;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)Z")
    public final boolean method753(int arg0) {
        field8479++;
        if (arg0 != -29791) {
            this.field8476 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
    public final void method749(int arg0) {
        field8474++;
        if (arg0 != 27471) {
            field8482 = 109;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(BZ)V")
    public final void method893(byte arg0, boolean arg1) {
        if (arg0 != -61) {
            field8482 = 34;
        }
        field8473++;
        if (arg1) {
            class68.field1045.method248(0, 0, class467.field6533, class300.field4038, this.field8476.field724, 0);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
    public static void method3388(byte arg0) {
        field8481 = null;
        field8475 = null;
        field8477 = null;
        field8483 = null;
        if (arg0 != 29) {
            field8477 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lvo;)V")
    public class582(class39 arg0) {
        this.field8476 = arg0;
    }

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(I)V")
    public static final void method3389(int arg0) {
        if (class418.field5921 < 0) {
            class418.field5921 = 0;
            class113.field1458 = -1;
            class440.field6291 = -1;
        }
        field8478++;
        if (class550.field8003 < class418.field5921) {
            class440.field6291 = -1;
            class113.field1458 = -1;
            class418.field5921 = class550.field8003;
        }
        if (class426.field6111 < 0) {
            class113.field1458 = -1;
            class440.field6291 = -1;
            class426.field6111 = 0;
        }
        int var1 = 3 % ((52 - arg0) / 37);
        if (class426.field6111 > class550.field7995) {
            class440.field6291 = -1;
            class113.field1458 = -1;
            class426.field6111 = class550.field7995;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZII)Ljava/lang/String;")
    public static final String method3390(boolean arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method3390(false, 66, -46);
        }
        field8480++;
        return arg0 && arg1 >= 0 ? class618.method3536(arg1, arg0, 10, 87) : Integer.toString(arg1);
    }
}
