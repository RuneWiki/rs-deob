import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class256 {

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "Lqd;")
    public static class40 field4268 = class147.method1106("gr-Un:", (byte) -46);

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public static int field4266 = 0;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "Lpl;")
    public static class186 field4269 = new class186(30);

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public int field4271;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "Lce;")
    public static class239 field4274;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "Lce;")
    public static class239 field4275;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "Lqd;")
    public class40 field4263;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "[I")
    public static int[] field4265;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "[[[B")
    public static byte[][][] field4267;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V", line = 4)
    public static void method1800(int arg0) {
        field4265 = null;
        field4267 = (byte[][][]) null;
        field4274 = null;
        field4268 = null;
        field4275 = null;
        field4269 = null;
        if (arg0 != -1) {
            field4266 = -31;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIII)Z", line = 21)
    public static final boolean method1801(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class298.field4980 * arg3 + class257.field4276 * arg0 >> 16;
        int var6 = class257.field4276 * arg3 - class298.field4980 * arg0 >> 16;
        int var7 = class52.field1002 * arg1 + class221.field3680 * var6 >> 16;
        int var8 = class221.field3680 * arg1 - class52.field1002 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class52.field1002 * arg2 + class221.field3680 * var6 >> 16;
        int var12 = class221.field3680 * arg2 - class52.field1002 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class186.field3011 && var13 < class186.field3011) {
            return false;
        } else if (var9 > class162.field2695 && var13 > class162.field2695) {
            return false;
        } else if (var10 < class188.field3042 && var14 < class188.field3042) {
            return false;
        } else {
            return var10 <= class218.field3630 || var14 <= class218.field3630;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 76)
    public static final String method1802(Throwable arg0, int arg1) throws IOException {
        field4270++;
        if (arg1 != 32) {
            field4275 = (class239) null;
        }
        String var3;
        if (arg0 instanceof class140) {
            class140 var2 = (class140) arg0;
            arg0 = var2.field2371;
            var3 = var2.field2363 + " | ";
        } else {
            var3 = "";
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
                    return var3 + "| " + var8;
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

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIII)I", line = 164)
    public static final int method1803(int arg0, int arg1, int arg2, int arg3) {
        field4272++;
        int var4 = 107 / ((arg3 + 19) / 47);
        int var5 = arg1 / arg0;
        int var6 = arg2 & arg0 - 1;
        int var7 = arg1 & arg0 - 1;
        int var8 = arg2 / arg0;
        int var9 = class276.method1919(var8, false, var5);
        int var10 = class276.method1919(var8, false, var5 + 1);
        int var11 = class276.method1919(var8 + 1, false, var5);
        int var12 = class276.method1919(var8 + 1, false, var5 + 1);
        int var13 = class244.method1714(arg0, var10, var9, (byte) -85, var7);
        int var14 = class244.method1714(arg0, var12, var11, (byte) -91, var7);
        return class244.method1714(arg0, var14, var13, (byte) 107, var6);
    }
}
