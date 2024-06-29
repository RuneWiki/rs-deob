import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class644 extends class168 {

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "Z")
    public static boolean field8922 = false;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public static int field8923;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public static int field8925;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public static int field8927;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    public static int field8928;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "J")
    public long field8924;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "Lrg;")
    public class644 field8921;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "Lrg;")
    public class644 field8926;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)Z", line = 3)
    public final boolean method3614(byte arg0) {
        field8925++;
        if (this.field8926 == null) {
            return false;
        } else {
            if (arg0 != -88) {
                this.field8926 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V", line = 18)
    public final void method3615(int arg0) {
        if (arg0 < 0) {
            return;
        }
        field8928++;
        if (this.field8926 != null) {
            this.field8926.field8921 = this.field8921;
            this.field8921.field8926 = this.field8926;
            this.field8921 = null;
            this.field8926 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/lang/Throwable;Z)Ljava/lang/String;", line = 36)
    public static final String method3616(Throwable arg0, boolean arg1) throws IOException {
        field8923++;
        String var3;
        if (arg0 instanceof class759) {
            class759 var2 = (class759) arg0;
            arg0 = var2.field10598;
            var3 = var2.field10595 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        if (arg1) {
            return null;
        }
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

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;", line = 118)
    public static final String method3617(boolean arg0, String arg1) {
        field8927++;
        if (class540.field7475.startsWith("win")) {
            return arg1 + ".dll";
        } else if (class540.field7475.startsWith("linux")) {
            return "lib" + arg1 + ".so";
        } else if (class540.field7475.startsWith("mac")) {
            return "lib" + arg1 + ".dylib";
        } else {
            if (arg0) {
                method3617(true, null);
            }
            return null;
        }
    }
}
