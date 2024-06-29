import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class38 {

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field562 = 0;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "Z")
    public static boolean field563 = false;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "[I")
    public static int[] field561 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public static int field569 = 0;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "Lid;")
    public static class149 field567 = class60.method382("<col=ffffff>", (byte) 77);

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "[Lbk;")
    public static class20[] field572 = new class20[32768];

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "Z")
    public static boolean field571 = true;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "Lid;")
    public static class149 field574 = class60.method382("Eingabeprozedur geladen)3", (byte) 99);

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
    public static void method221(boolean arg0) {
        field572 = null;
        field574 = null;
        field561 = null;
        if (!arg0) {
            method222(94, true);
        }
        field567 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)Z")
    public static final boolean method222(int arg0, boolean arg1) {
        if (arg1) {
            field570++;
            return arg0 == 198 || arg0 == 230 || arg0 == 156 || arg0 == 140 || arg0 == 223;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method223(byte arg0, Throwable arg1) throws IOException {
        field566++;
        String var2;
        if ((arg1 instanceof class276)) {
            class276 var3 = (class276) arg1;
            var2 = var3.field4940 + " | ";
            arg1 = var3.field4924;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        if (arg0 != 7) {
            method224(92, (byte) 23);
        }
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

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)Z")
    public static final boolean method224(int arg0, byte arg1) {
        field565++;
        if (arg1 == -105) {
            return arg0 >= 48 && arg0 <= 57;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILgd;)Ld;")
    public static final class236 method225(int arg0, class74 arg1) {
        field573++;
        if (arg0 != 1) {
            field569 = -41;
        }
        class236 var2 = new class236();
        var2.field4136 = arg1.method485(arg0 - 2387);
        var2.field4144 = class90.method662(var2.field4136, -32769);
        return var2;
    }
}
