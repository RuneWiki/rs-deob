import java.awt.Component;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public abstract class class20 {

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 5)
    public static final String method193(Throwable arg0, int arg1) throws IOException {
        String var2;
        if ((arg0 instanceof class229)) {
            class229 var3 = (class229) arg0;
            var2 = var3.field3888 + " | ";
            arg0 = var3.field3886;
        } else {
            var2 = "";
        }
        field365++;
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        if (arg1 != -1) {
            return (String) null;
        }
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

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V", line = 77)
    public static final void method194(int arg0) {
        class195.field3332.method1198(false);
        if (arg0 != 0) {
            field364 = 118;
        }
        field366++;
        class96.field1759.method1198(false);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)Ltc;", line = 90)
    public static final class37 method195(int arg0, int arg1, int arg2) {
        class295 var3 = class304.field5203[arg0][arg1][arg2];
        return var3 == null || var3.field5095 == null ? null : var3.field5095;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V", line = 105)
    public static final void method197(byte arg0) {
        field363++;
        if (arg0 != 13) {
            method194(118);
        }
        if (class163.field2873 != null) {
            class292 var1 = class163.field2873;
            synchronized (class163.field2873) {
                class163.field2873 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method196(byte arg0, Component arg1);

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method198(Component arg0, int arg1);

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)I")
    public abstract int method199(boolean arg0);
}
