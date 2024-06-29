import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class291 {

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field4842 = -1;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "Lna;")
    public static class26 field4849 = class69.method505("Chargement de l(W-Bcran)2titre )2 ", (byte) -122);

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "J")
    public static long field4847 = 0L;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)V", line = 14)
    public static void method2047(boolean arg0) {
        field4849 = null;
        if (arg0) {
            method2048((byte) 25, 28);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BI)I", line = 24)
    public static final int method2048(byte arg0, int arg1) {
        field4845++;
        int var2 = -77 / ((-arg0 - 34) / 52);
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIILbe;Z)V", line = 35)
    public static final void method2049(int arg0, int arg1, int arg2, int arg3, int arg4, class297 arg5, boolean arg6) {
        field4850++;
        int var7 = arg3 * arg3 + arg4 * arg4;
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg5.field4967 / 2, arg5.field4996 / 2);
        if (arg6) {
            field4842 = -79;
        }
        if (var8 * var8 >= var7) {
            class11.method70(arg5, class50.field787[arg0], arg4, arg3, arg1, (byte) 11, arg2);
            return;
        }
        var8 -= 10;
        int var9 = class300.field5156 + class158.field2465 & 0x7FF;
        int var10 = class200.field3115[var9];
        int var11 = class200.field3104[var9];
        int var12 = var11 * 256 / (class51.field797 + 256);
        int var13 = var10 * 256 / (class51.field797 + 256);
        int var14 = arg4 * var12 + (arg3 * var13) >> 16;
        int var15 = arg4 * var13 - (arg3 * var12) >> 16;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) (Math.sin(var16) * (double) var8);
        int var19 = (int) (Math.cos(var16) * (double) var8);
        if (class255.field4184) {
            ((class130) class261.field4260[arg0]).method877(240, 240, (arg5.field4967 / 2 + arg2 + var18) * 16, (arg5.field4996 / 2 + arg1 - var19) * 16, (int) (var16 * 10430.378D), 4096);
        } else {
            ((class256) class261.field4260[arg0]).method1747(arg5.field4967 / 2 + var18 + arg2 - 10, arg5.field4996 / 2 + -var19 + arg1 + -10, 20, 20, 15, 15, var16, 256);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 83)
    public static final String method2050(int arg0, Throwable arg1) throws IOException {
        field4844++;
        String var3;
        if (arg1 instanceof class122) {
            class122 var2 = (class122) arg1;
            arg1 = var2.field1905;
            var3 = var2.field1904 + " | ";
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
            String var9 = var7.readLine();
            if (var9 == null) {
                int var18 = -107 % ((arg0 - 31) / 34);
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

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lwa;I)V", line = 159)
    public static final void method2051(class82 arg0, int arg1) {
        field4846++;
        int var2 = arg0.method617(true);
        class298.field5137 = new class279[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class298.field5137[var3] = new class279();
            class298.field5137[var3].field4657 = arg0.method617(true);
            class298.field5137[var3].field4658 = arg0.method600(105);
        }
        if (arg1 > -10) {
            method2052((class297) null, (byte) -126);
        }
        class84.field1365 = arg0.method617(true);
        class24.field353 = arg0.method617(true);
        class117.field1844 = arg0.method617(true);
        class193.field3005 = new class166[class24.field353 + 1 - class84.field1365];
        for (int var4 = 0; var4 < class117.field1844; var4++) {
            int var5 = arg0.method617(true);
            class166 var6 = class193.field3005[var5] = new class166();
            var6.field3632 = arg0.method642((byte) -112);
            var6.field3637 = arg0.method587(-502942936);
            var6.field2571 = var5 + class84.field1365;
            var6.field2570 = arg0.method600(98);
            var6.field2577 = arg0.method600(79);
        }
        class8.field101 = arg0.method587(-502942936);
        class41.field690 = true;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lbe;B)Lna;", line = 216)
    public static final class26 method2052(class297 arg0, byte arg1) {
        int var2 = 49 % ((arg1 - 22) / 46);
        field4843++;
        if (client.method1730(arg0).method2292(-69) == 0) {
            return null;
        } else if (arg0.field5051 == null || arg0.field5051.method195(1).method171(-45) == 0) {
            return class299.field5146 ? class122.field1903 : null;
        } else {
            return arg0.field5051;
        }
    }
}
