import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class219 {

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
    public int field3090 = -1;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "[I")
    public static int[] field3091 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field3080 = 100;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public int field3079;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public int field3081;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public int field3082;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
    public int field3085;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
    public int field3086;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
    public int field3087;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
    public int field3088;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
    public int field3092;

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
    public int field3094;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
    public static void method1466(int arg0) {
        int var1 = -1 % ((16 - arg0) / 59);
        field3091 = null;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)I")
    public static final int method1467(int arg0, int arg1, int arg2) {
        field3083++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg0 != 21589) {
            method1468((class134) null, (class29) null, 113, 60, 58);
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lae;Lna;III)V")
    public static final void method1468(class134 arg0, class29 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class415.field5953) {
            class193 var5 = class250.field3570[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field2790 != null && var5.field2790.method54(true)) {
                arg1.method60(true, (byte) -96, 0, 128, var5.field2790, 0, arg0);
            }
        }
        if (arg4 < class415.field5953) {
            class193 var6 = class250.field3570[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field2790 != null && var6.field2790.method54(true)) {
                arg1.method60(true, (byte) 96, 0, 0, var6.field2790, 128, arg0);
            }
        }
        if (arg3 < class415.field5953 && arg4 < class299.field4190) {
            class193 var7 = class250.field3570[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field2790 != null && var7.field2790.method54(true)) {
                arg1.method60(true, (byte) 67, 0, 128, var7.field2790, 128, arg0);
            }
        }
        if (arg3 < class415.field5953 && arg4 > 0) {
            class193 var8 = class250.field3570[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field2790 != null && var8.field2790.method54(true)) {
                arg1.method60(true, (byte) 120, 0, 128, var8.field2790, -128, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)Z")
    public static final boolean method1469(int arg0, int arg1) {
        class336.field4771 = arg0 + 1 & 0xFFFF;
        class348.field4943 = true;
        field3084++;
        if (arg1 != -10993) {
            field3080 = -101;
        }
        return true;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method1470(Throwable arg0, int arg1) throws IOException {
        field3089++;
        String var3;
        if (arg0 instanceof class215) {
            class215 var2 = (class215) arg0;
            var3 = var2.field3037 + " | ";
            arg0 = var2.field3038;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        if (arg1 != 0) {
            field3080 = -35;
        }
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

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILdg;)Lnf;")
    public static final class346 method1471(int arg0, class236 arg1) {
        if (arg0 != 40) {
            field3091 = null;
        }
        field3093++;
        return new class346(arg1.method1613(75), arg1.method1613(62), arg1.method1613(95), arg1.method1613(arg0 + 54), arg1.method1616(false), arg1.method1616(false), arg1.method1574(arg0 - 45));
    }
}
