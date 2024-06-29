import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class90 {

    @OriginalMember(owner = "client!p", name = "h", descriptor = "Z")
    public static boolean field2064 = false;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    public static int field2075 = 0;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "Lrc;")
    private static class105 field2069 = class43.method374("Walk here", 0);

    @OriginalMember(owner = "client!p", name = "j", descriptor = "Lrc;")
    private static class105 field2066 = class43.method374("Loading )2 please wait)3", 0);

    @OriginalMember(owner = "client!p", name = "r", descriptor = "I")
    public static int field2074 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "Lrc;")
    public static class105 field2060 = class43.method374("@whi@", 0);

    @OriginalMember(owner = "client!p", name = "u", descriptor = "[[I")
    public static int[][] field2077 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Lrc;")
    public static class105 field2068 = field2069;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "Lrc;")
    public static class105 field2057 = field2066;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public int field2062;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public int field2063;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public int field2065;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "I")
    public int field2078;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "Lmd;")
    public static class76 field2073;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "[I")
    public static int[] field2059;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)I", line = 3)
    public static final int method741(int arg0) {
        field2067++;
        if (arg0 <= 17) {
            field2073 = null;
        }
        return 5;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lrc;Z)V", line = 16)
    public static final void method742(class105 arg0, boolean arg1) {
        field2076++;
        if (arg0 == null || arg0.method863(-127) == 0) {
            class104.field2354 = 0;
            return;
        }
        class105[] var2 = new class105[100];
        if (arg1) {
            return;
        }
        class105 var3 = arg0;
        int var4 = 0;
        while (true) {
            int var5 = var3.method846(-1582, 32);
            if (var5 == -1) {
                class105 var7 = var3.method843(32);
                if (var7.method863(-124) > 0) {
                    var2[var4++] = var7.method858((byte) -27);
                }
                class104.field2354 = 0;
                label51: for (int var8 = 0; var8 < class92.field2149; var8++) {
                    class31 var9 = class75.method636(var8, 0);
                    if (var9.field736 == -1 && var9.field706 != null) {
                        class105 var10 = var9.field706.method858((byte) -27);
                        for (int var11 = 0; var11 < var4; var11++) {
                            if (var10.method834((byte) 126, var2[var11]) == -1) {
                                continue label51;
                            }
                        }
                        class45.field1013[class104.field2354] = var10;
                        class85.field1906[class104.field2354] = var8;
                        class104.field2354++;
                        if (class104.field2354 >= class45.field1013.length) {
                            return;
                        }
                    }
                }
                return;
            }
            class105 var6 = var3.method860(0, arg1, var5).method843(32);
            if (var6.method863(-126) > 0) {
                var2[var4++] = var6.method858((byte) -27);
            }
            var3 = var3.method862(var5 + 1, (byte) -90);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V", line = 101)
    public static void method743(byte arg0) {
        field2060 = null;
        field2059 = null;
        field2077 = null;
        field2068 = null;
        field2069 = null;
        field2057 = null;
        if (arg0 != -92) {
            method741(-71);
        }
        field2066 = null;
        field2073 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V", line = 145)
    public static final void method744(int arg0, int arg1) {
        if (arg1 == -1 && class60.field1336 == 0) {
            class96.method798((byte) -46);
        } else if (arg1 != -1 && class9.field174 != arg1 && class116.field2700 != 0 && class60.field1336 == 0) {
            class96.method792(0, false, 0, class57.field1203, -1, arg1, 10, class116.field2700);
        }
        class9.field174 = arg1;
        if (arg0 != 20428) {
            field2068 = null;
        }
        field2072++;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V", line = 180)
    public static final void method745(int arg0) {
        if (arg0 == 14834) {
            class42.field960.method602((byte) -70);
            field2071++;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 209)
    public static final String method746(Throwable arg0, int arg1) throws IOException {
        field2070++;
        String var2;
        if (arg0 instanceof class50) {
            class50 var3 = (class50) arg0;
            var2 = var3.field1065 + " | ";
            arg0 = var3.field1056;
        } else {
            var2 = "";
        }
        if (arg1 != 41) {
            return null;
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
}
