import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class177 {

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "Lmb;")
    public static class96 field3071 = class243.method1708("<col=80ff00>", (byte) 115);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "Lff;")
    public static class3 field3073;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Z")
    public static boolean field3072;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lwk;I)V")
    public static final void method1263(class47 arg0, int arg1) {
        class38 var2 = (class38) class260.field4525.method1081(arg1, arg0.field828.method685((byte) 126));
        if (var2 == null) {
            class236.method1609(arg0, (class197) null, arg0.field4566[0], class216.field3712, (byte) -107, arg0.field4528[0], (class196) null, 0);
        } else {
            var2.method300(13611);
        }
        field3070++;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method1264(Throwable arg0, int arg1) throws IOException {
        field3069++;
        String var2;
        if ((arg0 instanceof class99)) {
            class99 var3 = (class99) arg0;
            arg0 = var3.field1679;
            var2 = var3.field1677 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        if (arg1 != -7402) {
            method1265(-74, 2, 56, 96, 32, 30, 109, 13);
        }
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var2 + "| " + var8;
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

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static void method1266(int arg0) {
        field3073 = null;
        field3071 = null;
        if (arg0 != -1815) {
            field3071 = null;
        }
    }
}
