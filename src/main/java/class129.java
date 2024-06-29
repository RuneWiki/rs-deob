import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class129 {

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public int field2150 = 0;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "[Laq;")
    public static class149[] field2154 = new class149[8];

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Lq;")
    public static class397 field2152;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZILeh;)V", line = 5)
    private final void method985(boolean arg0, int arg1, class335 arg2) {
        field2153++;
        if (arg1 == 5) {
            this.field2150 = arg2.method2001((byte) -83);
        }
        if (!arg0) {
            field2154 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Leh;Z)V", line = 24)
    public final void method986(class335 arg0, boolean arg1) {
        field2151++;
        while (true) {
            int var3 = arg0.method2034(255);
            if (var3 == 0) {
                if (arg1) {
                    method988(-48, 3, -109);
                    return;
                } else {
                    return;
                }
            }
            this.method985(true, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V", line = 46)
    public static void method987(byte arg0) {
        if (arg0 != 84) {
            method988(-52, 62, -106);
        }
        field2154 = null;
        field2152 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V", line = 57)
    public static final void method988(int arg0, int arg1, int arg2) {
        field2149++;
        class363.field4908++;
        class402 var3 = class390.method2252(class586.field7772, -95, class262.field3644);
        if (arg1 > -26) {
            method988(-121, -15, 110);
        }
        var3.field5354.method2002((byte) 127, arg2);
        var3.field5354.method2031((byte) 54, arg0);
        class36.method278(0, var3);
    }
}
