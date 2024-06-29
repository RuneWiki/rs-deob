import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public abstract class class266 {

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "I")
    public static int field3799 = 0;

    @OriginalMember(owner = "client!mda", name = "f", descriptor = "I")
    public static int field3802 = -1;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!mda", name = "d", descriptor = "I")
    public int field3800;

    @OriginalMember(owner = "client!mda", name = "g", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!mda", name = "e", descriptor = "Ljava/lang/String;")
    public String field3801;

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "Z")
    public static boolean field3798;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method1709(int arg0) throws IOException {
        if (arg0 == 41) {
            field3803++;
            return new Socket(this.field3801, this.field3800);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(I)Ljava/net/Socket;")
    public abstract Socket method1710(int arg0) throws IOException;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(ZLjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method1711(boolean arg0, Throwable arg1) throws IOException {
        field3797++;
        if (!arg0) {
            return null;
        }
        String var3;
        if (arg1 instanceof class509) {
            class509 var2 = (class509) arg1;
            arg1 = var2.field7248;
            var3 = var2.field7247 + " | ";
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
}
