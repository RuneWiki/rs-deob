import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eja")
public class class764 {

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "Lhj;")
    public static class596 field10534 = new class596(62, -2);

    @OriginalMember(owner = "client!eja", name = "b", descriptor = "I")
    public static int field10535;

    @OriginalMember(owner = "client!eja", name = "c", descriptor = "I")
    public static int field10536;

    @OriginalMember(owner = "client!eja", name = "d", descriptor = "I")
    public static int field10537;

    @OriginalMember(owner = "client!eja", name = "e", descriptor = "I")
    public static int field10538;

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(IBIIIIZI)V")
    public static final void method4233(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        if ((arg6 ? class118.field1503.field10637.method1581(0) : class118.field1503.field10666.method1581(0)) != 0 && arg0 != 0 && class707.field9936 < 50 && arg3 != -1) {
            class415.field5422[class707.field9936++] = new class228((byte) (arg6 ? 3 : 2), arg3, arg0, arg7, arg5, arg4, arg2, null);
        }
        if (arg1 != -42) {
            method4237((byte) 101);
        }
        field10536++;
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(IIILjava/lang/Class;)Lar;")
    public static final class712 method4234(int arg0, int arg1, int arg2, Class arg3) {
        class727 var4 = class107.field1351[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class10 var5 = var4.field10174; var5 != null; var5 = var5.field186) {
            class712 var6 = var5.field187;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field9994 == arg1 && var6.field9997 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(III)I")
    public static final int method4235(int arg0, int arg1, int arg2) {
        field10538++;
        if (arg1 >= -25) {
            return -54;
        } else {
            int var3 = arg0 >> 31 & arg2 - 1;
            return ((arg0 >>> 31) + arg0) % arg2 + var3;
        }
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method4236(String arg0, int arg1) {
        field10535++;
        if (arg0 == null) {
            return false;
        }
        if (arg1 != -1) {
            method4235(105, -52, 31);
        }
        for (int var2 = 0; var2 < class60.field803; var2++) {
            if (arg0.equalsIgnoreCase(class645.field8786[var2])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(class641.field8755[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(B)V")
    public static void method4237(byte arg0) {
        if (arg0 != 3) {
            field10534 = null;
        }
        field10534 = null;
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method4238(byte arg0, Throwable arg1) throws IOException {
        field10537++;
        String var3;
        if (arg1 instanceof class602) {
            class602 var2 = (class602) arg1;
            var3 = var2.field8137 + " | ";
            arg1 = var2.field8138;
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
                if (arg0 >= -26) {
                    field10534 = null;
                }
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
}
