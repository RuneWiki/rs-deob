import java.awt.Component;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class213 {

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "[I")
    public static int[] field3588;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/awt/Component;IIB)Lmf;")
    public static final class28 method1421(Component arg0, int arg1, int arg2, byte arg3) {
        if (arg3 > -42) {
            method1421((Component) null, 81, -46, (byte) -3);
        }
        field3587++;
        try {
            Class var4 = Class.forName("pk");
            class28 var5 = (class28) var4.getDeclaredConstructor().newInstance();
            var5.method190(arg2, arg0, arg1, true);
            return var5;
        } catch (Throwable var7) {
            class50 var6 = new class50();
            var6.method190(arg2, arg0, arg1, true);
            return var6;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static void method1422(int arg0) {
        if (arg0 != 1597) {
            method1422(1);
        }
        field3588 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method1423(Throwable arg0, int arg1) throws IOException {
        String var2;
        if ((arg0 instanceof class99)) {
            class99 var3 = (class99) arg0;
            var2 = var3.field1698 + " | ";
            arg0 = var3.field1696;
        } else {
            var2 = "";
        }
        field3585++;
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
                if (arg1 != -1) {
                    method1421((Component) null, 126, 124, (byte) -125);
                }
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

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)V")
    public static final void method1424(int arg0, int arg1) {
        class144 var2 = (class144) class53.field923.method779(-99, (long) arg0);
        field3584++;
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < var2.field2461.length; var3++) {
            var2.field2461[var3] = -1;
            var2.field2464[var3] = 0;
        }
        if (arg1 <= 32) {
            field3588 = null;
        }
    }
}
