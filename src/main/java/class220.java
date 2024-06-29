import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class220 {

    @OriginalMember(owner = "client!oba", name = "d", descriptor = "Lag;")
    private class587 field3203;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "I")
    public int field3200;

    @OriginalMember(owner = "client!oba", name = "g", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!oba", name = "e", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!oba", name = "f", descriptor = "I")
    public static int field3205;

    static {
        new class572("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
        field3206 = -1;
    }

    @OriginalMember(owner = "client!oba", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() throws Throwable {
        field3201++;
        this.field3203.method3489(this.field3200, false);
        super.finalize();
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(JB)V", line = 17)
    public static final void method1424(long arg0, byte arg1) {
        if (class420.field5697 != null) {
            if (class531.field7929 == 1 || class531.field7929 == 5) {
                class242.method1539(0, arg0);
            } else if (class531.field7929 == 4) {
                class461.method2789(0, arg0);
            }
        }
        field3202++;
        class367.method2204(118, class99.field1445, (long) class617.field9123);
        if (class340.field4708 != -1) {
            class564.method3385(-64, class340.field4708);
        }
        int var3 = 0;
        if (arg1 <= 125) {
            method1425(false, (byte) -114, -96, true, -119);
        }
        while (class533.field7942 > var3) {
            if (class104.field1511[var3]) {
                class243.field3474[var3] = true;
            }
            class625.field9204[var3] = class104.field1511[var3];
            class104.field1511[var3] = false;
            var3++;
        }
        class291.field4028 = class617.field9123;
        if (class99.field1445.method499()) {
            class431.field5778 = true;
        }
        if (class340.field4708 != -1) {
            class533.field7942 = 0;
            class97.method744(-1);
        }
        class99.field1445.method479();
        class571.method3406((byte) 62, class99.field1445);
        int var4 = class611.method3589(1777498892);
        if (var4 == -1) {
            var4 = class574.field8454;
        }
        if (var4 == -1) {
            var4 = class396.field5454;
        }
        class512.method3041(0, var4);
        class240.method1532(class541.field8119.field8496, (byte) 11, class647.field9402, class541.field8119.field8500, class541.field8119.field8501);
        class647.field9402 = 0;
    }

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(Lag;II)V", line = 85)
    public class220(class587 arg0, int arg1, int arg2) {
        this.field3203 = arg0;
        this.field3200 = arg2;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(ZBIZI)Lkda;", line = 96)
    public static final class328 method1425(boolean arg0, byte arg1, int arg2, boolean arg3, int arg4) {
        field3204++;
        class157 var5 = null;
        if (class228.field3339 != null) {
            var5 = new class157(arg4, class228.field3339, class232.field3380[arg4], 1000000);
        }
        class341.field4709[arg4] = class13.field121.method1526(class168.field2629, -123, var5, arg4);
        if (arg0) {
            class341.field4709[arg4].method2933(false);
        }
        int var6 = 54 / ((arg1 - 57) / 60);
        return new class328(class341.field4709[arg4], arg3, arg2);
    }
}
