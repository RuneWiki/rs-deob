import java.awt.Component;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public abstract class class35 {

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field542 = 0;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "Z")
    public static boolean field546;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 3)
    public static final String method226(int arg0, Throwable arg1) throws IOException {
        field547++;
        String var2;
        if ((arg1 instanceof class512)) {
            class512 var3 = (class512) arg1;
            var2 = var3.field7539 + " | ";
            arg1 = var3.field7537;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        if (arg0 != 40) {
            field545 = -70;
        }
        arg1.printStackTrace(var5);
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

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZB)V", line = 89)
    public static final void method229(boolean arg0, byte arg1) {
        class100.method679(16384);
        field544++;
        if (class65.field821 != 30 && class65.field821 != 25) {
            return;
        }
        class30.field501++;
        if (class30.field501 < 50 && !arg0) {
            return;
        }
        if (arg1 != 99) {
            method229(true, (byte) 126);
        }
        class30.field501 = 0;
        if (!class360.field4665 && class286.field3643 != null) {
            class321.field4130++;
            class420.method2472((byte) -101, class54.field744);
            try {
                class286.field3643.method1001(0, (byte) 19, class319.field4112.field1223, class319.field4112.field1176);
                class319.field4112.field1176 = 0;
            } catch (IOException var2) {
                class360.field4665 = true;
            }
        }
        class100.method679(16384);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public abstract void method227(Component arg0, boolean arg1);

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)I")
    public abstract int method228(int arg0);

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method230(byte arg0, Component arg1);
}
