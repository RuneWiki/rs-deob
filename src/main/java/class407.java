import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class407 {

    @OriginalMember(owner = "client!en", name = "e", descriptor = "D")
    public static double field5731;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "I")
    public static int field5732;

    @OriginalMember(owner = "client!en", name = "h", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "Lvt;")
    public static class768 field5733;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)[Lo;")
    public static final class208[] method2488(int arg0) {
        if (arg0 != 2) {
            method2489(67);
        }
        field5730++;
        return new class208[] { class760.field10440, class269.field3897, class77.field862, class556.field7786, class570.field8018, class289.field4264, class230.field3462, class668.field9362, class626.field8765, class574.field8077, class290.field4269, class176.field2225, class688.field9595, class75.field834 };
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V")
    public static final void method2489(int arg0) {
        class641.field9014 = class350.method2209(4, 8, 0.4F, 2048, true, -8289, arg0, 8);
        field5732++;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II)I")
    public static int method2490(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZIZLvt;Ljava/lang/String;)V")
    public static final void method2491(boolean arg0, int arg1, boolean arg2, class768 arg3, String arg4) {
        if (arg1 != 35) {
            field5727 = 5;
        }
        field5729++;
        if (!arg2) {
            class457.method2751(arg3, arg4, 3, arg1 - 136);
            return;
        }
        if (class768.field10562.startsWith("win") && arg3.field10576) {
            String var5 = null;
            if (class511.field7007 != null) {
                var5 = class511.field7007.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class344 var6 = class457.method2751(arg3, arg4, 0, -123);
                class175.field2216 = var6;
                class140.field1790 = arg4;
                class323.field4567 = arg3;
                return;
            }
        }
        if (class768.field10562.startsWith("mac")) {
            String var7 = null;
            if (class511.field7007 != null) {
                var7 = class511.field7007.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg0) {
                class457.method2751(arg3, arg4, 1, -116);
                return;
            }
        }
        class457.method2751(arg3, arg4, 2, arg1 - 122);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILtja;IIIII)Z")
    public static final boolean method2492(int arg0, class491 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5734++;
        if (!class623.field8736 || !class19.field125) {
            return false;
        }
        if (arg0 != 13416) {
            method2488(77);
        }
        if (class380.field5448 < 100) {
            return false;
        } else if (arg5 != arg6 || arg2 != arg4) {
            for (int var7 = arg5; var7 <= arg6; var7++) {
                for (int var8 = arg4; var8 <= arg2; var8++) {
                    if (class665.field9352[arg3][var7][var8] == -class433.field6016) {
                        return false;
                    }
                }
            }
            if (class692.method3921((byte) -93, arg1)) {
                class329.field4619++;
                return true;
            } else {
                return false;
            }
        } else if (!class322.method2044(arg5, arg4, arg3, 1)) {
            return false;
        } else if (class692.method3921((byte) -93, arg1)) {
            class329.field4619++;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V")
    public static void method2493(byte arg0) {
        int var1 = -86 % ((arg0 + 38) / 55);
        field5733 = null;
    }
}
