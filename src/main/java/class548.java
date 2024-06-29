import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class548 extends class626 {

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "[I")
    public static int[] field7724 = new int[2];

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
    public static int field7719;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
    public static int field7720;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
    public static int field7721;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
    public static int field7722;

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "I")
    public int field7723;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
    public int field7725;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)V", line = 4)
    public static void method3228(boolean arg0) {
        field7724 = null;
        if (arg0) {
            method3228(true);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILjava/lang/String;Lvk;ZZ)V", line = 14)
    public static final void method3229(int arg0, String arg1, class367 arg2, boolean arg3, boolean arg4) {
        if (arg0 != 23060) {
            method3229(-108, null, null, true, false);
        }
        field7720++;
        if (!arg4) {
            class311.method2017(arg2, 3, arg1, 2);
            return;
        }
        if (class367.field5136.startsWith("win") && arg2.field5141) {
            String var5 = null;
            if (class476.field6812 != null) {
                var5 = class476.field6812.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class637 var6 = class311.method2017(arg2, 0, arg1, arg0 - 23058);
                class390.field5455 = arg2;
                class208.field2993 = arg1;
                class34.field456 = var6;
                return;
            }
        }
        if (class367.field5136.startsWith("mac")) {
            String var7 = null;
            if (class476.field6812 != null) {
                var7 = class476.field6812.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg3) {
                class311.method2017(arg2, 1, arg1, 2);
                return;
            }
        }
        class311.method2017(arg2, 2, arg1, 2);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIB)Z", line = 89)
    public static final boolean method3230(int arg0, int arg1, byte arg2) {
        if (arg2 > -18) {
            field7724 = null;
        }
        field7722++;
        return class32.method208(arg1, arg0, (byte) -19) | (arg1 & 0x70000) != 0 || class260.method1772(83, arg0, arg1);
    }
}
