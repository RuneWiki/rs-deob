import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class109 extends class236 {

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "[I")
    public int[] field2195 = new int[] { -1 };

    @OriginalMember(owner = "client!cl", name = "C", descriptor = "[I")
    public int[] field2199 = new int[1];

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "I")
    public static int field2191 = 0;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "[Lsg;")
    public static class30[] field2189 = new class30[100];

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "Lsg;")
    private static class30 field2196 = class167.method1221((byte) 33, "level: ");

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "Lsg;")
    public static class30 field2194 = field2196;

    @OriginalMember(owner = "client!cl", name = "A", descriptor = "I")
    public static int field2197 = 0;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "Lsg;")
    public static class30 field2190 = class167.method1221((byte) 33, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!cl", name = "B", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!cl", name = "D", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
    public static void method863(byte arg0) {
        field2189 = null;
        int var1 = -113 % ((-arg0 - 86) / 32);
        field2190 = null;
        field2196 = null;
        field2194 = null;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(II)Lsg;")
    public static final class30 method864(int arg0, int arg1) {
        if (arg0 == 0) {
            field2200++;
            return class48.field1088[arg1].method249(-114) <= 0 ? class167.field3078[arg1] : class160.method1188(new class30[] { class167.field3078[arg1], class205.field3672, class48.field1088[arg1] }, 0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BZIIIZI)V")
    public static final void method865(byte arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg0 != -110) {
            return;
        }
        if (arg6 > arg3) {
            int var7 = arg3;
            int var8 = (arg3 + arg6) / 2;
            class205 var9 = class260.field4600[var8];
            class260.field4600[var8] = class260.field4600[arg6];
            class260.field4600[arg6] = var9;
            for (int var10 = arg3; var10 < arg6; var10++) {
                if (class4.method26(arg5, var9, class260.field4600[var10], arg1, arg4, arg2, (byte) 34) <= 0) {
                    class205 var11 = class260.field4600[var10];
                    class260.field4600[var10] = class260.field4600[var7];
                    class260.field4600[var7++] = var11;
                }
            }
            class260.field4600[arg6] = class260.field4600[var7];
            class260.field4600[var7] = var9;
            method865((byte) -110, arg1, arg2, arg3, arg4, arg5, var7 - 1);
            method865((byte) -110, arg1, arg2, var7 + 1, arg4, arg5, arg6);
        }
        field2193++;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method866(Throwable arg0, int arg1) throws IOException {
        field2192++;
        String var3;
        if (arg0 instanceof class148) {
            class148 var2 = (class148) arg0;
            var3 = var2.field2830 + " | ";
            arg0 = var2.field2826;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        if (arg1 != 0) {
            method865((byte) -106, false, 124, -6, 114, false, -128);
        }
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
}
