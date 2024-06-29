import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!j")
public class class19 {

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "Lk;")
    public static class21 field237 = class14.method92((byte) 57, "Slayer Master");

    @OriginalMember(owner = "mapview!j", name = "g", descriptor = "Lk;")
    public static class21 field243 = class14.method92((byte) 57, "Makeover Mage");

    @OriginalMember(owner = "mapview!j", name = "h", descriptor = "Lk;")
    public static class21 field244 = class14.method92((byte) 57, "General Store");

    @OriginalMember(owner = "mapview!j", name = "f", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "mapview!j", name = "i", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "mapview!j", name = "d", descriptor = "J")
    public long field240;

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "Lj;")
    public class19 field238;

    @OriginalMember(owner = "mapview!j", name = "e", descriptor = "Lj;")
    public class19 field241;

    @OriginalMember(owner = "mapview!j", name = "c", descriptor = "[I")
    public static int[] field239;

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(B)V", line = 8)
    public static void method112(byte arg0) {
        field239 = null;
        field237 = null;
        field243 = null;
        field244 = null;
        if (arg0 >= -32) {
            method112((byte) -113);
        }
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 32)
    public static final String method113(Throwable arg0, int arg1) throws IOException {
        String var3;
        if (arg0 instanceof class15) {
            class15 var2 = (class15) arg0;
            var3 = var2.field197 + " | ";
            arg0 = var2.field194;
        } else {
            var3 = "";
        }
        int var4 = 65 % ((50 - arg1) / 35);
        StringWriter var5 = new StringWriter();
        PrintWriter var6 = new PrintWriter(var5);
        arg0.printStackTrace(var6);
        var6.close();
        String var7 = var5.toString();
        BufferedReader var8 = new BufferedReader(new StringReader(var7));
        String var9 = var8.readLine();
        while (true) {
            while (true) {
                String var10 = var8.readLine();
                if (var10 == null) {
                    return var3 + "| " + var9;
                }
                int var11 = var10.indexOf(40);
                int var12 = var10.indexOf(41, var11 + 1);
                if (var11 >= 0 && var12 >= 0) {
                    String var13 = var10.substring(var11 + 1, var12);
                    int var14 = var13.indexOf(".java:");
                    if (var14 >= 0) {
                        String var15 = var13.substring(0, var14) + var13.substring(var14 + 5);
                        var3 = var3 + var15 + ' ';
                        continue;
                    }
                    var10 = var10.substring(0, var11);
                }
                String var16 = var10.trim();
                String var17 = var16.substring(var16.lastIndexOf(32) + 1);
                String var18 = var17.substring(var17.lastIndexOf(9) + 1);
                var3 = var3 + var18 + ' ';
            }
        }
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(I)V", line = 117)
    public static final void method114(int arg0) {
        if (arg0 != 32) {
            method112((byte) -115);
        }
        class8.field145 = null;
        class26.field331 = null;
        class28.field338 = null;
        class11.field172 = null;
        class32.field385 = null;
        field239 = null;
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(Z)V", line = 144)
    public final void method115(boolean arg0) {
        if (this.field241 == null) {
            return;
        }
        this.field241.field238 = this.field238;
        this.field238.field241 = this.field241;
        this.field238 = null;
        if (!arg0) {
            this.field238 = null;
        }
        this.field241 = null;
    }
}
