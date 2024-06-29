import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class83 {

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "[C")
    public static char[] field1241 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1243 = "";

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIILjb;)V", line = 4)
    public static final void method633(int arg0, int arg1, int arg2, class457 arg3) {
        class390 var4 = class568.method3255(arg0, arg1, arg2);
        if (var4 == null) {
            return;
        }
        var4.field5524 = arg3;
        int var5 = class52.field606 == class409.field5812 ? 1 : 0;
        if (arg3.method216(true)) {
            if (arg3.method209((byte) 117)) {
                class216.field3061[var5][class582.field8197[var5]++] = arg3;
                return;
            }
            class383.field5425[var5][class89.field1287[var5]++] = arg3;
            return;
        }
        class420.field5921[var5][class466.field6417[var5]++] = arg3;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Z)V", line = 28)
    public static void method634(boolean arg0) {
        field1243 = null;
        field1241 = null;
        if (arg0) {
            field1243 = null;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IB)V", line = 39)
    public static final void method635(int arg0, byte arg1) {
        if (arg1 != -10) {
            method634(true);
        }
        field1242++;
        class51 var2 = class703.method3938(-1989279584, arg0, 11);
        var2.method404(arg1 ^ 0xFFFFFF9A);
    }
}
