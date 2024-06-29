import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class258 extends class665 {

    @OriginalMember(owner = "client!uu", name = "B", descriptor = "I")
    public static int field3691 = -1;

    @OriginalMember(owner = "client!uu", name = "u", descriptor = "I")
    public int field3684;

    @OriginalMember(owner = "client!uu", name = "w", descriptor = "I")
    public int field3686;

    @OriginalMember(owner = "client!uu", name = "y", descriptor = "I")
    public int field3688;

    @OriginalMember(owner = "client!uu", name = "E", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!uu", name = "F", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!uu", name = "H", descriptor = "I")
    public int field3696;

    @OriginalMember(owner = "client!uu", name = "I", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!uu", name = "J", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!uu", name = "t", descriptor = "Lbg;")
    public static class427 field3683;

    @OriginalMember(owner = "client!uu", name = "x", descriptor = "Lmaa;")
    public class433 field3687;

    @OriginalMember(owner = "client!uu", name = "v", descriptor = "Lclient;")
    public static client field3685;

    @OriginalMember(owner = "client!uu", name = "A", descriptor = "Ljava/lang/String;")
    public String field3690;

    @OriginalMember(owner = "client!uu", name = "z", descriptor = "[I")
    public int[] field3689;

    @OriginalMember(owner = "client!uu", name = "D", descriptor = "[I")
    public int[] field3692;

    @OriginalMember(owner = "client!uu", name = "K", descriptor = "[Loj;")
    public class346[] field3699;

    @OriginalMember(owner = "client!uu", name = "G", descriptor = "[Ljava/lang/String;")
    public String[] field3695;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1592(String arg0, int arg1) {
        field3694++;
        if (arg0 == null) {
            return -1;
        } else if (arg1 == -17884) {
            for (int var2 = 0; var2 < class372.field5293; var2++) {
                if (arg0.equalsIgnoreCase(class129.field1779[var2])) {
                    return var2;
                }
            }
            return -1;
        } else {
            return 79;
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(B)V")
    public static void method1593(byte arg0) {
        field3685 = null;
        if (arg0 != -84) {
            field3698 = 72;
        }
        field3683 = null;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZIZLsba;)V")
    public static final void method1594(boolean arg0, int arg1, boolean arg2, class198 arg3) {
        field3697++;
        int var4 = arg3.field2922;
        int var5 = (int) arg3.field7311;
        arg3.method2971(1);
        if (arg2) {
            class78.method611(var4, -18954);
        }
        if (arg1 > -100) {
            return;
        }
        class609.method3369((byte) 126, var4);
        class140 var6 = class266.method1626(var5, 122);
        if (var6 != null) {
            class432.method2481(var6, 115);
        }
        class488.method2745(14811);
        if (!arg0 && class677.field9551 != -1) {
            class589.method3274(class677.field9551, 1, (byte) 90);
        }
        class527 var7 = new class527(class368.field5262);
        for (class198 var8 = (class198) var7.method2928((byte) 104); var8 != null; var8 = (class198) var7.method2927((byte) -89)) {
            if (!var8.method2972(1)) {
                var8 = (class198) var7.method2928((byte) 124);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field2924 == 3) {
                int var9 = (int) var8.field7311;
                if (var9 >>> 16 == var4) {
                    method1594(arg0, -119, true, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Ljr;B)Lni;")
    public static final class479 method1595(class96 arg0, byte arg1) {
        field3693++;
        if (arg1 >= -32) {
            field3691 = 44;
        }
        int var2 = arg0.method743((byte) -18);
        class52 var3 = class495.method2768((byte) -11)[arg0.method718(87)];
        class377 var4 = class428.method2425((byte) -26)[arg0.method718(-64)];
        int var5 = arg0.method722(4);
        int var6 = arg0.method722(4);
        return new class479(var2, var3, var4, var5, var6);
    }
}
