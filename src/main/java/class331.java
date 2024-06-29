import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class331 {

    @OriginalMember(owner = "client!go", name = "g", descriptor = "Ljava/lang/String;")
    public String field5125;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "I")
    public int field5120;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field5123;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!go", name = "j", descriptor = "[I")
    public static int[] field5128;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "[Lf;")
    public static class191[] field5127;

    static {
        new class375("clan_chat", "clanchat", "conversation_clan", "clan_chat");
        field5123 = new String[8];
        field5126 = 0;
        field5128 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V", line = 10)
    public static final void method2136(byte arg0) {
        int var1 = -63 % ((-arg0 - 16) / 35);
        field5124++;
        if (class96.field1399.method1734(120, class441.field6563) || class430.field6399 == class195.field2770) {
            class174.method1217(class337.field5242, (byte) -49);
            if (class8.field123 != class195.field2770) {
                class151.method988(0);
            }
        } else {
            class190.method1327((byte) -95, class77.field1036, false, false, class10.field163);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V", line = 39)
    public static void method2137(int arg0) {
        field5127 = null;
        field5123 = null;
        if (arg0 < 15) {
            method2137(9);
        }
        field5128 = null;
    }

    @OriginalMember(owner = "client!go", name = "toString", descriptor = "()Ljava/lang/String;", line = 51)
    public final String toString() {
        field5122++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 65)
    public class331(String arg0, int arg1) {
        this.field5125 = arg0;
        this.field5120 = arg1;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(II)Z", line = 75)
    public static final boolean method2138(int arg0, int arg1) {
        field5119++;
        class349 var2 = class19.method147(arg0 ^ 0xFFFFB948, arg1);
        if (var2 == null) {
            return false;
        } else if (class469.field6854 == 3) {
            String var3 = "";
            if (class74.field999 != class140.field2031) {
                var3 = ":" + (var2.field5438 + 7000);
            }
            String var4 = "";
            if (arg0 != 7000) {
                return false;
            }
            if (class165.field2407 != null) {
                var4 = "/p=" + class165.field2407;
            }
            String var5 = "http://" + var2.field5437 + var3 + "/l=" + class288.field4292 + "/a=" + class97.field1409 + var4 + "/j" + (class197.field2784 ? "1" : "0") + ",o" + (class242.field3405 ? "1" : "0") + ",a2";
            try {
                class498.field7279.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        } else {
            class12.field195 = var2.field5438;
            class244.field3414 = var2.field5437;
            if (class74.field999 != class140.field2031) {
                class391.field5947 = class12.field195 + 40000;
                class116.field1635 = class12.field195 + 50000;
                class529.field7815 = class391.field5947;
            }
            return true;
        }
    }
}
