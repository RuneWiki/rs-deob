import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class281 {

    @OriginalMember(owner = "client!pfa", name = "c", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field3524 = new Hashtable();

    @OriginalMember(owner = "client!pfa", name = "e", descriptor = "I")
    public static int field3526 = 0;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!pfa", name = "f", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!pfa", name = "d", descriptor = "Lida;")
    public static class138 field3525;

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "Lfa;")
    public static class526 field3523;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
    public static final String method1592(Throwable arg0, byte arg1) throws IOException {
        int var2 = 68 / ((-arg1 - 36) / 52);
        field3527++;
        String var3;
        if ((arg0 instanceof class215)) {
            class215 var4 = (class215) arg0;
            arg0 = var4.field2670;
            var3 = var4.field2672 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var5 = new StringWriter();
        PrintWriter var6 = new PrintWriter(var5);
        arg0.printStackTrace(var6);
        var6.close();
        String var7 = var5.toString();
        BufferedReader var8 = new BufferedReader(new StringReader(var7));
        String var9 = var8.readLine();
        while (true) {
            String var10 = var8.readLine();
            if (var10 == null) {
                return var3 + "| " + var9;
            }
            int var11 = var10.indexOf(40);
            int var12 = var10.indexOf(41, var11 + 1);
            String var13;
            if (var11 == -1) {
                var13 = var10;
            } else {
                var13 = var10.substring(0, var11);
            }
            String var14 = var13.trim();
            String var15 = var14.substring(var14.lastIndexOf(32) + 1);
            String var16 = var15.substring(var15.lastIndexOf(9) + 1);
            String var17 = var3 + var16;
            if (var11 != -1 && var12 != -1) {
                int var18 = var10.indexOf(".java:", var11);
                if (var18 >= 0) {
                    var17 = var17 + var10.substring(var18 + 5, var12);
                }
            }
            var3 = var17 + ' ';
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1593(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3522++;
        if (arg9 < 512 || arg1 < 512 || (class431.field5395 * 512 - 1024) < arg9 || (class452.field5802 - 2) * 512 < arg1) {
            class273.field3450[0] = class273.field3450[1] = -1;
        } else if (arg3 <= -100) {
            int var10 = class467.method2469(arg9, arg6, -20214, arg1) - arg0;
            class678.field9511.method903(arg2, 0, 0);
            class32.field452.method1058(class678.field9511);
            class32.field452.method1046(arg9, var10, arg1, class273.field3450);
            class678.field9511.method903(-arg2, 0, 0);
            class32.field452.method1058(class678.field9511);
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(B)V")
    public static void method1594(byte arg0) {
        field3524 = null;
        field3523 = null;
        if (arg0 != 113) {
            field3525 = null;
        }
        field3525 = null;
    }
}
