import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 {

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "Loa;")
    private static class98 field72 = class38.method349(255, "This world is full)3");

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field71 = 0;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "[[I")
    public static int[][] field76 = new int[104][104];

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "Loa;")
    public static class98 field82 = class38.method349(255, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "Loa;")
    public static class98 field73 = field72;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "Loa;")
    public static class98 field80 = class38.method349(255, "Sie haben gerade eine andere Welt verlassen)3");

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public static int field84 = 0;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public static int field86 = 0;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field74 = 1;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "Loa;")
    public static class98 field85 = class38.method349(255, "auf einer freien Welt zu spielen)3");

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "Lmd;")
    public static class87 field75;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "[Lid;")
    public static class60[] field77;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static void method23(int arg0) {
        field72 = null;
        field77 = null;
        if (arg0 != -12449) {
            return;
        }
        field73 = null;
        field76 = null;
        field85 = null;
        field82 = null;
        field75 = null;
        field80 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([BII)I")
    public static final int method24(byte[] arg0, int arg1, int arg2) {
        field78++;
        if (arg2 >= -12) {
            field77 = null;
        }
        return class32.method312(arg0, arg1, -5979, 0);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public static final void method25(byte arg0) {
        if (arg0 != 0) {
            field72 = null;
        }
        for (class37 var1 = (class37) class81.field1802.method512(-99); var1 != null; var1 = (class37) class81.field1802.method513(arg0 ^ 0xFFFFFFAD)) {
            if (var1.field912 == -1) {
                var1.field914 = 0;
                class63.method510(0, var1);
            } else {
                var1.method975(39);
            }
        }
        field79++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method26(Throwable arg0, int arg1) throws IOException {
        field81++;
        String var2;
        if (arg0 instanceof class51) {
            class51 var3 = (class51) arg0;
            var2 = var3.field1124 + " | ";
            arg0 = var3.field1133;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    if (arg1 != 32) {
                        return null;
                    }
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
}
