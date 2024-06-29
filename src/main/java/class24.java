import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class24 extends class176 {

    @OriginalMember(owner = "client!cc", name = "O", descriptor = "I")
    public int field460 = 0;

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "[I")
    public static int[] field450 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!cc", name = "H", descriptor = "Z")
    public static boolean field453 = false;

    @OriginalMember(owner = "client!cc", name = "I", descriptor = "Lob;")
    public static class141 field454 = class175.method1195(40, "(U4");

    @OriginalMember(owner = "client!cc", name = "K", descriptor = "I")
    public static int field456 = 0;

    @OriginalMember(owner = "client!cc", name = "P", descriptor = "Lob;")
    public static class141 field461 = class175.method1195(40, "; Max)2Age=");

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!cc", name = "L", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!cc", name = "M", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!cc", name = "N", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!cc", name = "Q", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!cc", name = "S", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!cc", name = "J", descriptor = "Lpe;")
    public static class154 field455;

    @OriginalMember(owner = "client!cc", name = "G", descriptor = "Lca;")
    public static class22 field452;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Log;II)V")
    private final void method167(class146 arg0, int arg1, int arg2) {
        field457++;
        if (arg1 == arg2) {
            this.field460 = arg0.method1007(106);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)[Lfa;")
    public static final class52[] method168(boolean arg0) {
        field459++;
        class52[] var1 = new class52[class197.field3766];
        int var2 = 0;
        if (arg0) {
            field453 = true;
        }
        while (var2 < class197.field3766) {
            class52 var3 = new class52();
            var3.field999 = class196.field3743;
            var3.field997 = class103.field1989;
            var3.field1002 = class30.field581[var2];
            var3.field998 = class30.field578[var2];
            var3.field1003 = class201.field3801[var2];
            var3.field1000 = class114.field2186[var2];
            var3.field1001 = class16.field291;
            var3.field1004 = class224.field4225[var2];
            var1[var2] = var3;
            var2++;
        }
        class88.method601(-61);
        return var1;
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)V")
    public static final void method169(int arg0) {
        field458++;
        for (class165 var1 = (class165) class210.field3994.method1103((byte) -9); var1 != null; var1 = (class165) class210.field3994.method1106((byte) -120)) {
            if (var1.field3185 != null) {
                class201.field3798.method1327(var1.field3185);
                var1.field3185 = null;
            }
            if (var1.field3192 != null) {
                class201.field3798.method1327(var1.field3192);
                var1.field3192 = null;
            }
        }
        class210.field3994.method1102(100);
        if (arg0 != 2) {
            field454 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "(I)V")
    public static void method170(int arg0) {
        field454 = null;
        if (arg0 != 11520) {
            method169(-98);
        }
        field461 = null;
        field455 = null;
        field452 = null;
        field450 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method171(byte arg0, Throwable arg1) throws IOException {
        field464++;
        String var2;
        if (arg1 instanceof class184) {
            class184 var3 = (class184) arg1;
            arg1 = var3.field3593;
            var2 = var3.field3599 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    String var18 = var2 + "| " + var8;
                    int var19 = 97 % ((arg0 - 30) / 56);
                    return var18;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Log;I)V")
    public final void method172(class146 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method991(255);
            if (var3 == 0) {
                int var4 = 73 % ((-arg1 - 54) / 62);
                field451++;
                return;
            }
            this.method167(arg0, var3, 2);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lob;ILob;Lpe;)Lkc;")
    public static final class102 method173(class141 arg0, int arg1, class141 arg2, class154 arg3) {
        field462++;
        int var4 = arg3.method1071((byte) -120, arg0);
        if (arg1 != 0) {
            method173(null, 16, null, null);
        }
        int var5 = arg3.method1059(var4, true, arg2);
        return class144.method949(arg3, var4, -111, var5);
    }
}
