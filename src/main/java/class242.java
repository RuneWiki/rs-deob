import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class242 {

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "Le;")
    public static class191 field4307 = class54.method368("mapscene", 2047);

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "Le;")
    public static class191 field4315 = class54.method368("leuchten3:", 2047);

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "Le;")
    public static class191 field4312 = class54.method368("Benutzen", 2047);

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "Le;")
    public static class191 field4316 = class54.method368("Lade Wordpack )2 ", 2047);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field4303 = -1;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "Le;")
    private static class191 field4318 = class54.method368(" more options", 2047);

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field4308 = 0;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field4314 = 0;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "Le;")
    private static class191 field4322 = class54.method368("yellow:", 2047);

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "Le;")
    public static class191 field4317 = field4322;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "Le;")
    public static class191 field4311 = field4322;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "Le;")
    public static class191 field4310 = field4318;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "Le;")
    public static class191 field4319 = class54.method368("AUS", 2047);

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "Le;")
    public static class191 field4326 = class54.method368("(U4", 2047);

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "I")
    public static int field4327 = 0;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "[Lc;")
    public static class60[] field4320;

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "[[Leg;")
    public static class33[][] field4325;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZLjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method1696(boolean arg0, Throwable arg1) throws IOException {
        field4304++;
        String var3;
        if (arg1 instanceof class194) {
            class194 var2 = (class194) arg1;
            arg1 = var2.field3497;
            var3 = var2.field3493 + " | ";
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
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    String var18 = var3 + "| " + var8;
                    if (arg0) {
                        return null;
                    }
                    return var18;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var3 = var3 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var3 = var3 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILe;)I")
    public static final int method1697(int arg0, class191 arg1) {
        field4313++;
        if (arg0 <= 22) {
            return -94;
        }
        for (int var2 = 0; var2 < class111.field1866.length; var2++) {
            if (class111.field1866[var2].method1351(-23098, arg1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
    public static void method1698(byte arg0) {
        field4311 = null;
        field4320 = null;
        field4317 = null;
        field4326 = null;
        field4315 = null;
        if (arg0 != -36) {
            method1700(15, 87, -36, (int[]) null, 108);
        }
        field4312 = null;
        field4319 = null;
        field4322 = null;
        field4325 = null;
        field4307 = null;
        field4316 = null;
        field4310 = null;
        field4318 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Laf;I)I")
    public static final int method1699(class156 arg0, int arg1) {
        field4306++;
        class184 var2 = arg0.field2663;
        if (var2.field3225 != null) {
            var2 = var2.method1245((byte) -44);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field3177;
        if (arg0.field2977 == arg0.field2974) {
            var3 = var2.field3164;
        } else if (arg0.field2977 == arg0.field2947) {
            var3 = var2.field3166;
        }
        return arg1 == -1 ? var3 : -112;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III[II)V")
    public static final void method1700(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        arg4--;
        field4323++;
        int var6 = arg2 - 1;
        int var5 = var6 - arg0;
        while (arg4 < var5) {
            int var7 = arg4 + 1;
            arg3[var7] = arg1;
            int var8 = var7 + 1;
            arg3[var8] = arg1;
            int var9 = var8 + 1;
            arg3[var9] = arg1;
            int var10 = var9 + 1;
            arg3[var10] = arg1;
            int var11 = var10 + 1;
            arg3[var11] = arg1;
            int var12 = var11 + 1;
            arg3[var12] = arg1;
            int var13 = var12 + 1;
            arg3[var13] = arg1;
            arg4 = var13 + 1;
            arg3[arg4] = arg1;
        }
        while (var6 > arg4) {
            arg4++;
            arg3[arg4] = arg1;
        }
    }
}
