import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class38 {

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "Lva;")
    private static class121 field886 = class107.method797("Add friend", -10983);

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "Lva;")
    public static class121 field881 = field886;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "Z")
    public static boolean field879 = false;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "Lva;")
    public static class121 field893 = class107.method797("q8_full", -10983);

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public int field877;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public int field878;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public int field885;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public int field887;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
    public int field890;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "Lw;")
    public static class125 field884;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "Loa;")
    public class85 field883;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "Loa;")
    public class85 field888;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "Loa;")
    public class85 field892;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "[Lm;")
    public static class72[] field891;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V", line = 4)
    public static void method259(int arg0) {
        field881 = null;
        if (arg0 != 19) {
            field879 = true;
        }
        field884 = null;
        field893 = null;
        field886 = null;
        field891 = null;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)I", line = 20)
    public static final int method260(int arg0) {
        if (arg0 != 19) {
            field891 = null;
        }
        field889++;
        return 19;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)I", line = 41)
    public static int method261(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZLjava/lang/Throwable;)Ljava/lang/String;", line = 65)
    public static final String method262(boolean arg0, Throwable arg1) throws IOException {
        String var3;
        if (arg1 instanceof class67) {
            class67 var2 = (class67) arg1;
            var3 = var2.field1605 + " | ";
            arg1 = var2.field1600;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        field880++;
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        if (arg0) {
            method259(1);
        }
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
}
