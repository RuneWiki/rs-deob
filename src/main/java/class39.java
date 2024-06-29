import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class39 {

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "Lnj;")
    public static class415 field556 = new class415(40, 2);

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!gv", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field557++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V")
    public static void method307(int arg0) {
        if (arg0 < 75) {
            method308(98, 78);
        }
        field556 = null;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)V")
    public static final void method308(int arg0, int arg1) {
        field554++;
        class367 var2 = class573.method3057(4, arg1, 2);
        if (arg0 < 1) {
            field556 = null;
        }
        var2.method2113(-126);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Ljava/lang/String;II)Z")
    public static final boolean method309(String arg0, int arg1, int arg2) {
        field555++;
        if (class688.field9413.field1823) {
            class423.field5473 = new class265();
            class423.field5473.field3543 = arg0;
            class423.field5473.field3554 = arg2;
            if (class555.field7261 != class119.field1536) {
                class423.field5473.field3541 = class423.field5473.field3554 + 50000;
                class423.field5473.field3538 = class423.field5473.field3554 + 40000;
            }
            if (class202.field2638.length > arg2 && class202.field2638[arg2] != null) {
                class470.field6144 = class202.field2638[arg2].field161;
            }
            return true;
        }
        String var3 = "";
        if (class555.field7261 != class119.field1536) {
            var3 = ":" + (arg2 + 7000);
        }
        String var4 = "";
        if (class384.field4915 != null) {
            var4 = "/p=" + class384.field4915;
        }
        String var5 = "http://" + arg0 + var3 + "/l=" + class144.field1890 + "/a=" + class31.field467 + var4 + "/j" + (class508.field6667 ? "1" : "0") + ",o" + (class584.field7922 ? "1" : "0") + ",a2";
        try {
            class381.field4890.getAppletContext().showDocument(new URL(var5), "_self");
            if (arg1 != 6693) {
                method307(-16);
            }
            return true;
        } catch (Exception var6) {
            return false;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(BLfd;)V")
    public static final void method310(byte arg0, class418 arg1) {
        field553++;
        if (arg0 < 36) {
            field552 = 111;
        }
        for (int var2 = 0; var2 < class501.field6617; var2++) {
            int var3 = arg1.method2400((byte) 36);
            int var4 = arg1.method2393(-30727);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class26.field324[var3] != null) {
                class26.field324[var3].field154 = var4;
            }
        }
    }
}
