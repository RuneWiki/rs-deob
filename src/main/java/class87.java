import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class87 {

    @OriginalMember(owner = "client!md", name = "b", descriptor = "Lhe;")
    public static class54 field2142 = class6.method58("Weiter", false);

    @OriginalMember(owner = "client!md", name = "d", descriptor = "Lhe;")
    public static class54 field2144 = class6.method58("au", false);

    @OriginalMember(owner = "client!md", name = "h", descriptor = "[I")
    public static int[] field2148 = new int[256];

    @OriginalMember(owner = "client!md", name = "l", descriptor = "[[[B")
    public static byte[][][] field2152;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "[I")
    public static int[] field2153;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "Lhe;")
    public static class54 field2158;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "[I")
    public static int[] field2159;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "Lhe;")
    private static class54 field2155;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "Lhe;")
    public static class54 field2156;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "Lnc;")
    public static class93 field2154;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "[I")
    public static int[] field2151;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZII)V")
    public static final void method695(boolean arg0, int arg1, int arg2) {
        if (class67.field1682 != 0 && arg1 != -1) {
            class137.method1068(class67.field1682, -2, class49.field1186, 0, arg1, false);
            class52.field1236 = true;
        }
        if (arg0) {
            method697(-56);
        }
        field2149++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method696(byte arg0, Throwable arg1) throws IOException {
        field2141++;
        String var2;
        if (arg1 instanceof class21) {
            class21 var3 = (class21) arg1;
            arg1 = var3.field578;
            var2 = var3.field583 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        if (arg0 != -24) {
            field2150 = 111;
        }
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
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static void method697(int arg0) {
        field2148 = null;
        field2152 = null;
        field2151 = null;
        field2154 = null;
        field2144 = null;
        field2142 = null;
        field2155 = null;
        field2156 = null;
        field2159 = null;
        field2158 = null;
        int var1 = 54 / ((4 - arg0) / 52);
        field2153 = null;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2148[var0] = var1;
        }
        field2152 = new byte[4][104][104];
        field2150 = 0;
        field2153 = new int[5];
        field2158 = class6.method58("gleiten:", false);
        field2157 = -1;
        field2159 = new int[25];
        field2155 = class6.method58(" ", false);
        field2156 = field2155;
    }
}
