import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class288 {

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "Lvp;")
    public static class123 field4145 = new class123(81, -1);

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "Ltn;")
    public static class58 field4146 = null;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "Lvp;")
    public static class123 field4147 = new class123(63, 4);

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "I")
    public static int field4149 = 0;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "Lgf;")
    public static class180 field4148 = new class180("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 4)
    public static final String method1795(int arg0, Throwable arg1) throws IOException {
        field4143++;
        String var2;
        if ((arg1 instanceof class508)) {
            class508 var3 = (class508) arg1;
            arg1 = var3.field7427;
            var2 = var3.field7430 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        int var6 = 70 / ((arg0 + 72) / 47);
        String var7 = var4.toString();
        BufferedReader var8 = new BufferedReader(new StringReader(var7));
        String var9 = var8.readLine();
        while (true) {
            String var10 = var8.readLine();
            if (var10 == null) {
                return var2 + "| " + var9;
            }
            int var11 = var10.indexOf(40);
            int var12 = var10.indexOf(41, var11 + 1);
            String var13;
            if (var11 == -1) {
                var13 = var10;
            } else {
                var13 = var10.substring(0, var11);
            }
            String var14 = var13.trim();
            String var15 = var14.substring(var14.lastIndexOf(32) + 1);
            String var16 = var15.substring(var15.lastIndexOf(9) + 1);
            String var17 = var2 + var16;
            if (var11 != -1 && var12 != -1) {
                int var18 = var10.indexOf(".java:", var11);
                if (var18 >= 0) {
                    var17 = var17 + var10.substring(var18 + 5, var12);
                }
            }
            var2 = var17 + ' ';
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V", line = 83)
    public static void method1796(int arg0) {
        field4148 = null;
        field4145 = null;
        field4146 = null;
        field4147 = null;
        if (arg0 != 0) {
            method1796(-94);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lvm;)V", line = 99)
    public static final void method1797(class480 arg0) {
        if (class224.field3245 >= 65535) {
            return;
        }
        class131 var1 = arg0.field7047;
        class242.field3512[class224.field3245] = arg0;
        class145.field2144[class224.field3245] = false;
        class224.field3245++;
        int var2 = arg0.field7033;
        if (arg0.field7049) {
            var2 = 0;
        }
        int var3 = arg0.field7033;
        if (arg0.field7048) {
            var3 = class334.field5130 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method965(false) + class495.field7211 - var1.method964((byte) -106) >> class225.field3278;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method965(false) + var1.method964((byte) -76) - class495.field7211 >> class225.field3278;
            if (var7 >= class254.field3675) {
                var7 = class254.field3675 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field7032[var5++];
                int var10 = (var1.method966(109) + class495.field7211 - var1.method964((byte) -85) >> class225.field3278) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class246.field3560) {
                    var11 = class246.field3560 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class371.field5544[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class371.field5544[var4][var12][var8] = var13 | (long) class224.field3245;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class371.field5544[var4][var12][var8] = var13 | (long) class224.field3245 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class371.field5544[var4][var12][var8] = var13 | (long) class224.field3245 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class371.field5544[var4][var12][var8] = var13 | (long) class224.field3245 << 48;
                    }
                }
            }
        }
    }
}
