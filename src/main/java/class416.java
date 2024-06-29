import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class416 {

    @OriginalMember(owner = "client!mt", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6136 = new String[] { method3235(method3234(">3p\u000bL")), method3235(method3234(">3p\tL")), method3235(method3234("s;~")), method3235(method3234("/g")), method3235(method3234("}-?<\u0005i")) };

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "Z")
    public static boolean field6131 = false;

    @OriginalMember(owner = "client!mt", name = "f", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "J")
    public static long field6130;

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "[I")
    public static int[] field6135;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method3231(int arg0, Throwable arg1) throws IOException {
        if (arg0 != 9) {
            return null;
        }
        field6134++;
        String var2;
        if ((arg1 instanceof class166)) {
            class166 var3 = (class166) arg1;
            var2 = var3.field2286 + field6136[2];
            arg1 = var3.field2284;
        } else {
            var2 = "";
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
                return var2 + field6136[3] + var8;
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
                int var17 = var9.indexOf(field6136[4], var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)V")
    public static void method3232(byte arg0) {
        try {
            if (arg0 != 126) {
                method3232((byte) 35);
            }
            field6135 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6136[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(JJ)J")
    public static long method3233(long arg0, long arg1) {
        try {
            return arg0 ^ arg1;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field6136[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3234(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x64);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3235(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 83;
                    break;
                case 1:
                    var10005 = 71;
                    break;
                case 2:
                    var10005 = 94;
                    break;
                case 3:
                    var10005 = 74;
                    break;
                default:
                    var10005 = 100;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
