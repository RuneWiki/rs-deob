import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class340 extends class35 {

    @OriginalMember(owner = "client!jq", name = "r", descriptor = "I")
    public volatile int field5096 = -1;

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "Ljava/lang/String;")
    public volatile String field5092;

    @OriginalMember(owner = "client!jq", name = "q", descriptor = "I")
    public static int field5095 = 0;

    @OriginalMember(owner = "client!jq", name = "u", descriptor = "Lsh;")
    public static class472 field5099;

    @OriginalMember(owner = "client!jq", name = "w", descriptor = "Lsh;")
    public static class472 field5101;

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!jq", name = "o", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!jq", name = "p", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!jq", name = "s", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!jq", name = "v", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!jq", name = "x", descriptor = "Lse;")
    public static class146 field5102;

    @OriginalMember(owner = "client!jq", name = "t", descriptor = "[I")
    public static int[] field5098;

    static {
        new class332("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
        field5099 = new class472(62, 17);
        field5101 = new class472(98, 3);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(BILui;I)Lvn;", line = 6)
    public static final class246 method2085(byte arg0, int arg1, class451 arg2, int arg3) {
        field5091++;
        byte[] var4 = arg2.method2691(arg3, arg1, 0);
        if (arg0 == 77) {
            return var4 == null ? null : new class246(var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V", line = 26)
    public static final void method2086(byte arg0) {
        field5097++;
        if (class182.field2702 == class103.field1445) {
            return;
        }
        int var1 = -106 % ((arg0 - 12) / 40);
        try {
            class399.method2383(class312.field4712, -10423, "tbrefresh");
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZLse;)Ljava/lang/String;", line = 46)
    public static final String method2087(boolean arg0, class146 arg1) {
        field5093++;
        if (arg0) {
            field5102 = null;
        }
        return arg1.field2064 == null || arg1.field2064.length() <= 0 ? arg1.field2062 : arg1.field2062 + class45.field633.method2036(class4.field85, (byte) -21) + arg1.field2064;
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 67)
    public class340(String arg0) {
        this.field5092 = arg0;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IBI)Z", line = 75)
    public static final boolean method2088(int arg0, byte arg1, int arg2) {
        if (arg1 != -4) {
            field5101 = null;
        }
        field5094++;
        return (class246.field3532[1][arg2][arg0] & 0x2) != 0;
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(B)V", line = 89)
    public static void method2089(byte arg0) {
        field5102 = null;
        int var1 = 1 / ((arg0 - 55) / 62);
        field5099 = null;
        field5098 = null;
        field5101 = null;
    }
}
