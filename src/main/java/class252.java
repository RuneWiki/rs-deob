import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class252 {

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "Z")
    public static boolean field4356 = false;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "Lmh;")
    public static class128 field4353 = class22.method156(125, " <col=00ff80>");

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "Z")
    public static boolean field4360 = false;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "Z")
    public static volatile boolean field4352 = true;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "Lmh;")
    public static class128 field4361 = class22.method156(125, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "Lmh;")
    public static class128 field4363 = class22.method156(125, "rot:");

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public static int field4362 = 0;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "[[[B")
    public static byte[][][] field4355;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIILjm;IJZ)Z", line = 7)
    public static final boolean method1791(int arg0, int arg1, int arg2, int arg3, int arg4, class226 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class287.method1980(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILdj;Ldj;)V", line = 46)
    public static final void method1792(int arg0, class314 arg1, class314 arg2) {
        class129.field2241 = arg2;
        field4354++;
        class297.field5064 = arg1;
        class314.field5305 = class297.field5064.method2146((byte) -126, 3);
        if (arg0 != 19216) {
            field4360 = false;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V", line = 69)
    public static void method1793(byte arg0) {
        field4361 = null;
        if (arg0 == -120) {
            field4363 = null;
            field4353 = null;
            field4355 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;", line = 112)
    public static final String method1794(byte arg0, Throwable arg1) throws IOException {
        field4358++;
        String var3;
        if (arg1 instanceof class104) {
            class104 var2 = (class104) arg1;
            var3 = var2.field1792 + " | ";
            arg1 = var2.field1777;
        } else {
            var3 = "";
        }
        int var4 = -82 % ((arg0 - 88) / 34);
        StringWriter var5 = new StringWriter();
        PrintWriter var6 = new PrintWriter(var5);
        arg1.printStackTrace(var6);
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
                int var12 = var10.indexOf(40);
                int var13 = var10.indexOf(41, var12 + 1);
                if (var12 >= 0 && var13 >= 0) {
                    String var14 = var10.substring(var12 + 1, var13);
                    int var15 = var14.indexOf(".java:");
                    if (var15 >= 0) {
                        String var16 = var14.substring(0, var15) + var14.substring(var15 + 5);
                        var3 = var3 + var16 + ' ';
                        continue;
                    }
                    var10 = var10.substring(0, var12);
                }
                String var17 = var10.trim();
                String var18 = var17.substring(var17.lastIndexOf(32) + 1);
                String var19 = var18.substring(var18.lastIndexOf(9) + 1);
                var3 = var3 + var19 + ' ';
            }
        }
    }
}
