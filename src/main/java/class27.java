import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class27 extends class304 {

    @OriginalMember(owner = "client!oo", name = "v", descriptor = "B")
    public byte field348 = 5;

    @OriginalMember(owner = "client!oo", name = "E", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!oo", name = "D", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!oo", name = "w", descriptor = "I")
    public int field349;

    @OriginalMember(owner = "client!oo", name = "x", descriptor = "I")
    public int field350;

    @OriginalMember(owner = "client!oo", name = "y", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!oo", name = "z", descriptor = "I")
    public int field352;

    @OriginalMember(owner = "client!oo", name = "A", descriptor = "I")
    public int field353;

    @OriginalMember(owner = "client!oo", name = "B", descriptor = "I")
    public int field354;

    @OriginalMember(owner = "client!oo", name = "C", descriptor = "I")
    public int field355;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
    public static final String method161(Throwable arg0, byte arg1) throws IOException {
        field351++;
        String var3;
        if (arg0 instanceof class113) {
            class113 var2 = (class113) arg0;
            arg0 = var2.field1488;
            var3 = var2.field1496 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        int var7 = 127 / ((arg1 + 54) / 37);
        BufferedReader var8 = new BufferedReader(new StringReader(var6));
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

    static {
        new class151("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
        field357 = 205;
        field356 = 0;
    }
}
