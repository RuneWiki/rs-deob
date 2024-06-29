import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fha")
public class class399 extends class455 {

    @OriginalMember(owner = "client!fha", name = "u", descriptor = "I")
    public int field5714 = (int) (class401.method2440(false) / 1000L);

    @OriginalMember(owner = "client!fha", name = "s", descriptor = "S")
    public short field5712;

    @OriginalMember(owner = "client!fha", name = "q", descriptor = "Ljava/lang/String;")
    public String field5710;

    @OriginalMember(owner = "client!fha", name = "p", descriptor = "Lmw;")
    public static class517 field5709 = new class517(82, 6);

    @OriginalMember(owner = "client!fha", name = "r", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!fha", name = "t", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!fha", name = "v", descriptor = "I")
    public static int field5715;

    @OriginalMember(owner = "client!fha", name = "w", descriptor = "I")
    public static int field5716;

    @OriginalMember(owner = "client!fha", name = "x", descriptor = "Ljava/lang/String;")
    public static String field5717;

    @OriginalMember(owner = "client!fha", name = "b", descriptor = "(I)V", line = 6)
    public static final void method2433(int arg0) {
        field5713++;
        if (class741.field10035 != -1) {
            class16.method94(27861, -1, class741.field10035, false, -1);
            class741.field10035 = -1;
        }
        if (arg0 != 14265) {
            field5709 = null;
        }
    }

    @OriginalMember(owner = "client!fha", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 25)
    public class399(String arg0, int arg1) {
        this.field5712 = (short) arg1;
        this.field5710 = arg0;
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(ZBI)V", line = 36)
    public static final void method2434(boolean arg0, byte arg1, int arg2) {
        class546.method3144(class58.field709.method365(class55.field647, (byte) 89), -2, arg0, arg2);
        field5716++;
        int var3 = 85 % ((arg1 - 21) / 60);
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(Ldt;B)Lefa;", line = 46)
    public static final class196 method2435(class254 arg0, byte arg1) {
        if (arg1 < 123) {
            return null;
        } else {
            field5711++;
            int var2 = arg0.method1728((byte) 90);
            return new class196(var2);
        }
    }

    @OriginalMember(owner = "client!fha", name = "c", descriptor = "(I)V", line = 60)
    public static void method2436(int arg0) {
        field5709 = null;
        field5717 = null;
        if (arg0 != -222) {
            field5717 = null;
        }
    }
}
