import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class173 extends class176 {

    @OriginalMember(owner = "client!rd", name = "H", descriptor = "I")
    public int field3435 = 0;

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "Lmd;")
    public static class123 field3437 = new class123(8);

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "Lob;")
    private static class141 field3440 = class175.method1195(40, "Ok");

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "Lob;")
    public static class141 field3439 = field3440;

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "Lvc;")
    public static class212 field3438 = new class212(64);

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "Lvc;")
    public static class212 field3441 = new class212(50);

    @OriginalMember(owner = "client!rd", name = "O", descriptor = "I")
    public static int field3442 = 0;

    @OriginalMember(owner = "client!rd", name = "P", descriptor = "I")
    public static int field3443 = 1;

    @OriginalMember(owner = "client!rd", name = "Q", descriptor = "Lob;")
    public static class141 field3444 = class175.method1195(40, "Zu viele Verbindungen von Ihrer Adresse)3");

    @OriginalMember(owner = "client!rd", name = "R", descriptor = "Lob;")
    public static class141 field3445 = class175.method1195(40, "runes");

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!rd", name = "F", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!rd", name = "G", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lca;ILqe;I)V")
    public static final void method1186(class22 arg0, int arg1, class164 arg2, int arg3) {
        class162 var4 = new class162();
        var4.field4067 = arg1;
        var4.field3138 = 1;
        field3436++;
        var4.field3142 = arg0;
        if (arg3 != 26523) {
            return;
        }
        var4.field3133 = arg2;
        class158 var5 = class109.field2097;
        synchronized (class109.field2097) {
            class109.field2097.method1098(0, var4);
        }
        class176.method1199(-9748);
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)V")
    public static void method1187(int arg0) {
        field3437 = null;
        field3440 = null;
        if (arg0 != 0) {
            field3437 = null;
        }
        field3444 = null;
        field3441 = null;
        field3445 = null;
        field3439 = null;
        field3438 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IILog;)V")
    private final void method1188(int arg0, int arg1, class146 arg2) {
        if (arg1 != 8) {
            field3444 = null;
        }
        if (arg0 == 5) {
            this.field3435 = arg2.method1007(39);
        }
        field3434++;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(IB)I")
    public static final int method1189(int arg0, byte arg1) {
        if (arg1 == 104) {
            field3431++;
            return arg0 >>> 7;
        } else {
            return 32;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZLog;)V")
    public final void method1190(boolean arg0, class146 arg1) {
        if (!arg0) {
            this.method1188(10, -111, null);
        }
        field3432++;
        while (true) {
            int var3 = arg1.method991(255);
            if (var3 == 0) {
                return;
            }
            this.method1188(var3, 8, arg1);
        }
    }
}
