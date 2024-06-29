import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class206 {

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "Lnf;")
    public static class67 field3594 = null;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "Ljf;")
    private static class229 field3595 = class212.method1457((byte) 80, "Loaded sprites");

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "Ljf;")
    public static class229 field3597 = field3595;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "Lni;")
    public static class24 field3596 = new class24(500);

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "[I")
    public static int[] field3603 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "[I")
    public static int[] field3602;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "[Lrm;")
    public static class248[] field3601;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)I", line = 6)
    public static final int method1437(int arg0, int arg1) {
        int var2 = -92 / ((arg1 + 28) / 47);
        field3600++;
        if (arg0 >= 97 && arg0 <= 122 || arg0 >= 224 && arg0 <= 254 && arg0 != 247) {
            return arg0 - 32;
        } else if (arg0 == 255) {
            return 159;
        } else if (arg0 == 156) {
            return 140;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V", line = 27)
    public static void method1438(int arg0) {
        field3596 = null;
        field3602 = null;
        field3601 = null;
        field3603 = null;
        field3597 = null;
        field3594 = null;
        field3595 = null;
        if (arg0 != -1) {
            field3602 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZILnf;II)V", line = 46)
    public static final void method1439(boolean arg0, int arg1, class67 arg2, int arg3, int arg4) {
        field3598++;
        int var5 = arg2.field1258;
        if (~arg2.field1183 == arg3) {
            arg2.field1258 = arg2.field1176;
        } else if (arg2.field1183 == 1) {
            arg2.field1258 = arg4 - arg2.field1176;
        } else if (arg2.field1183 == 2) {
            arg2.field1258 = arg2.field1176 * arg4 >> 14;
        } else if (arg2.field1183 == 3) {
            if (arg2.field1267 == 2) {
                arg2.field1258 = arg2.field1176 * 32 + ((arg2.field1176 - 1) * arg2.field1182);
            } else if (arg2.field1267 == 7) {
                arg2.field1258 = (arg2.field1176 - 1) * arg2.field1182 + arg2.field1176 * 115;
            }
        }
        int var6 = arg2.field1295;
        if (arg2.field1214 == 0) {
            arg2.field1295 = arg2.field1241;
        } else if (arg2.field1214 == 1) {
            arg2.field1295 = arg1 - arg2.field1241;
        } else if (arg2.field1214 == 2) {
            arg2.field1295 = arg2.field1241 * arg1 >> 14;
        } else if (arg2.field1214 == 3) {
            if (arg2.field1267 == 2) {
                arg2.field1295 = (arg2.field1241 - 1) * arg2.field1186 + arg2.field1241 * 32;
            } else if (arg2.field1267 == 7) {
                arg2.field1295 = (arg2.field1241 - 1) * arg2.field1186 + arg2.field1241 * 12;
            }
        }
        if (arg2.field1183 == 4) {
            arg2.field1258 = arg2.field1295 * arg2.field1156 / arg2.field1159;
        }
        if (arg2.field1214 == 4) {
            arg2.field1295 = arg2.field1258 * arg2.field1159 / arg2.field1156;
        }
        if (class131.field2317 && (client.method1820(arg2) != 0 || arg2.field1267 == 0)) {
            if (arg2.field1295 < 5 && arg2.field1258 < 5) {
                arg2.field1295 = 5;
                arg2.field1258 = 5;
            } else {
                if (arg2.field1295 <= 0) {
                    arg2.field1295 = 5;
                }
                if (arg2.field1258 <= 0) {
                    arg2.field1258 = 5;
                }
            }
        }
        if (arg2.field1296 == 1337) {
            class10.field128 = arg2;
        }
        if (arg0 && arg2.field1138 != null && (arg2.field1258 != var5 || arg2.field1295 != var6)) {
            class192 var7 = new class192();
            var7.field3327 = arg2;
            var7.field3324 = arg2.field1138;
            class224.field3831.method2079(var7, arg3 ^ 0xFFFFFFCA);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;", line = 169)
    public static final String method1440(byte arg0, Throwable arg1) throws IOException {
        field3599++;
        String var3;
        if (arg1 instanceof class287) {
            class287 var2 = (class287) arg1;
            var3 = var2.field4910 + " | ";
            arg1 = var2.field4913;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        if (arg0 != 64) {
            field3602 = (int[]) null;
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
                    return var3 + "| " + var8;
                }
                int var11 = var9.indexOf(40);
                int var12 = var9.indexOf(41, var11 + 1);
                if (var11 >= 0 && var12 >= 0) {
                    String var13 = var9.substring(var11 + 1, var12);
                    int var14 = var13.indexOf(".java:");
                    if (var14 >= 0) {
                        String var15 = var13.substring(0, var14) + var13.substring(var14 + 5);
                        var3 = var3 + var15 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var11);
                }
                String var16 = var9.trim();
                String var17 = var16.substring(var16.lastIndexOf(32) + 1);
                String var18 = var17.substring(var17.lastIndexOf(9) + 1);
                var3 = var3 + var18 + ' ';
            }
        }
    }
}
