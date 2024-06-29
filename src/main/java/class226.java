import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class226 extends class25 {

    @OriginalMember(owner = "client!gca", name = "m", descriptor = "[I")
    public static int[] field3252 = new int[13];

    @OriginalMember(owner = "client!gca", name = "n", descriptor = "Lmaa;")
    public static class433 field3253 = new class433("", 15);

    @OriginalMember(owner = "client!gca", name = "r", descriptor = "I")
    public static int field3257 = -1;

    @OriginalMember(owner = "client!gca", name = "p", descriptor = "F")
    public static float field3255;

    @OriginalMember(owner = "client!gca", name = "h", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!gca", name = "i", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!gca", name = "j", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!gca", name = "l", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!gca", name = "k", descriptor = "Lgca;")
    public class226 field3250;

    @OriginalMember(owner = "client!gca", name = "o", descriptor = "Lgca;")
    public class226 field3254;

    @OriginalMember(owner = "client!gca", name = "q", descriptor = "Lmj;")
    public static class599 field3256;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method1445(String arg0, byte arg1) {
        field3251++;
        return arg1 == 106 ? class14.method64(10, arg0, true, -123) : true;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IC)C")
    public static final char method1446(int arg0, char arg1) {
        field3247++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else if (arg1 == 'œ') {
            return 'e';
        } else {
            if (arg0 != 10006) {
                method1445(null, (byte) -11);
            }
            return '\u0000';
        }
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(I)V")
    public final void method1447(int arg0) {
        field3248++;
        if (this.field3250 == null) {
            return;
        }
        this.field3250.field3254 = this.field3254;
        this.field3254.field3250 = this.field3250;
        this.field3250 = null;
        this.field3254 = null;
        if (arg0 >= -56) {
            field3253 = null;
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Ljava/lang/Throwable;Z)Ljava/lang/String;")
    public static final String method1448(Throwable arg0, boolean arg1) throws IOException {
        field3249++;
        if (!arg1) {
            method1445(null, (byte) -76);
        }
        String var2;
        if ((arg0 instanceof class531)) {
            class531 var3 = (class531) arg0;
            var2 = var3.field7238 + " | ";
            arg0 = var3.field7240;
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
            String var9 = var7.readLine();
            if (var9 == null) {
                return var2 + "| " + var8;
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
            String var16 = var2 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(B)V")
    public static void method1449(byte arg0) {
        field3256 = null;
        field3253 = null;
        field3252 = null;
        if (arg0 != -89) {
            field3256 = null;
        }
    }
}
