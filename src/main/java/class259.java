import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class259 extends class145 {

    @OriginalMember(owner = "client!bv", name = "L", descriptor = "[I")
    public static int[] field3689 = new int[1000];

    @OriginalMember(owner = "client!bv", name = "P", descriptor = "I")
    public static int field3693 = 0;

    @OriginalMember(owner = "client!bv", name = "E", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!bv", name = "F", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!bv", name = "G", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!bv", name = "I", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!bv", name = "J", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!bv", name = "N", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!bv", name = "O", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!bv", name = "M", descriptor = "Lxa;")
    public static class433 field3690;

    @OriginalMember(owner = "client!bv", name = "H", descriptor = "Lqi;")
    public static class494 field3686;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Leba;BZILeba;IZ)I")
    public static final int method1725(class511 arg0, byte arg1, boolean arg2, int arg3, class511 arg4, int arg5, boolean arg6) {
        field3687++;
        int var7 = class620.method3567(arg4, arg3, 0, arg0, arg2);
        if (var7 != 0) {
            return arg2 ? -var7 : var7;
        } else if (arg5 == -1) {
            return 0;
        } else if (arg1 == 93) {
            int var8 = class620.method3567(arg4, arg5, arg1 - 93, arg0, arg6);
            return arg6 ? -var8 : var8;
        } else {
            return -68;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1726(int arg0, boolean arg1) {
        class67.field739 = arg0 + 1 & 0xFFFF;
        class228.field3195 = arg1;
        field3683++;
        return true;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIB)V")
    public static final void method1727(int arg0, int arg1, int arg2, byte arg3) {
        field3684++;
        if (arg3 != -95) {
            method1728(91, -31);
        }
        class636 var4 = class316.field4605[arg1][arg2];
        class575.method3341(arg0, var4 == null ? class158.field1958 : var4, -1);
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "()V")
    public class259() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(II)Lqf;")
    public static final class593 method1728(int arg0, int arg1) {
        field3691++;
        if (arg0 != 40) {
            method1726(-26, true);
        }
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class297.field4403[var2] == null || class297.field4403[var2][var3] == null) {
            boolean var4 = class227.method1477(var2, -1);
            if (!var4) {
                return null;
            }
        }
        return class297.field4403[var2][var3];
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
    public static final String method1729(Throwable arg0, byte arg1) throws IOException {
        field3685++;
        String var3;
        if (arg0 instanceof class74) {
            class74 var2 = (class74) arg0;
            var3 = var2.field788 + " | ";
            arg0 = var2.field791;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        if (arg1 != -31) {
            return null;
        }
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var3 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZI)[I")
    public final int[] method27(boolean arg0, int arg1) {
        field3688++;
        return arg0 ? null : class601.field8779;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)V")
    public static void method1730(byte arg0) {
        field3689 = null;
        field3686 = null;
        field3690 = null;
        if (arg0 != 106) {
            field3686 = null;
        }
    }
}
