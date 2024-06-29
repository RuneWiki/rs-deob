import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class189 extends class261 {

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "Ldg;")
    public static class286 field3039 = null;

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "Lwm;")
    public static class399 field3038 = new class399(4);

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "F")
    public static float field3031;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "J")
    public long field3034;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "Lol;")
    public class189 field3032;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "Lol;")
    public class189 field3035;

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "[[B")
    public static byte[][] field3040;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)Z", line = 3)
    public final boolean method1286(byte arg0) {
        field3033++;
        if (arg0 != -84) {
            this.method1286((byte) -48);
        }
        return this.field3035 != null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BIII)V", line = 17)
    public static final void method1287(byte arg0, int arg1, int arg2, int arg3) {
        field3036++;
        class18 var4 = class140.method1047(9, arg1, false);
        int var5 = 47 % ((56 - arg0) / 62);
        var4.method122(true);
        var4.field291 = arg3;
        var4.field283 = arg2;
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(B)V", line = 44)
    public static void method1288(byte arg0) {
        field3040 = null;
        int var1 = 68 % ((-arg0 - 34) / 59);
        field3038 = null;
    }

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "(B)V", line = 55)
    public final void method1289(byte arg0) {
        field3037++;
        if (this.field3035 == null) {
            return;
        }
        this.field3035.field3032 = this.field3032;
        int var2 = 60 / ((28 - arg0) / 48);
        this.field3032.field3035 = this.field3035;
        this.field3035 = null;
        this.field3032 = null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 73)
    public static final String method1290(Throwable arg0, int arg1) throws IOException {
        field3030++;
        String var3;
        if (arg0 instanceof class508) {
            class508 var2 = (class508) arg0;
            arg0 = var2.field7403;
            var3 = var2.field7399 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        if (arg1 != 25499) {
            field3031 = -0.40445906F;
        }
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
