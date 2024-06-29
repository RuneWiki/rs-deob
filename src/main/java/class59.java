import java.awt.Frame;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class59 {

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field922 = -1;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public int field924;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "Lbd;")
    public class162 field920;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)Z", line = 10)
    public static final boolean method408(int arg0, int arg1) {
        if (arg1 <= 79) {
            return true;
        } else {
            field923++;
            return (arg0 & 0x5C7359C5) >> 30 != 0;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 21)
    public static final String method409(int arg0, Throwable arg1) throws IOException {
        field919++;
        if (arg0 != -1) {
            field922 = 70;
        }
        String var3;
        if (arg1 instanceof class158) {
            class158 var2 = (class158) arg1;
            arg1 = var2.field2779;
            var3 = var2.field2788 + " | ";
        } else {
            var3 = "";
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
                    return var3 + "| " + var8;
                }
                int var11 = var9.indexOf(40);
                int var12 = var9.indexOf(41, var11 + 1);
                if (var11 >= 0 && var12 >= 0) {
                    String var13 = var9.substring(var11 + 1, var12);
                    int var14 = var13.indexOf(".java:");
                    if (var14 >= 0) {
                        String var15 = var13.substring(0, var14) + var13.substring(var14 + 5);
                        var3 = var3 + var15 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var11);
                }
                String var16 = var9.trim();
                String var17 = var16.substring(var16.lastIndexOf(32) + 1);
                String var18 = var17.substring(var17.lastIndexOf(9) + 1);
                var3 = var3 + var18 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)Lab;", line = 91)
    public static final class273 method410(int arg0, int arg1, int arg2) {
        class225 var3 = class288.field4856[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class273 var4 = var3.field3753;
            var3.field3753 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lib;Ljava/awt/Frame;B)V", line = 113)
    public static final void method411(class28 arg0, Frame arg1, byte arg2) {
        while (true) {
            class166 var3 = arg0.method225(-95, arg1);
            while (var3.field2934 == 0) {
                class177.method1342(10L, 1);
            }
            if (var3.field2934 == 1) {
                int var4 = -37 % ((arg2 + 3) / 43);
                arg1.setVisible(false);
                arg1.dispose();
                field921++;
                return;
            }
            class177.method1342(100L, 1);
        }
    }
}
