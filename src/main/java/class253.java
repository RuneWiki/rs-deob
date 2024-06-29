import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class253 {

    @OriginalMember(owner = "client!io", name = "e", descriptor = "Lqe;")
    public static class122 field3491 = new class122(5000);

    @OriginalMember(owner = "client!io", name = "a", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!io", name = "c", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!io", name = "f", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!io", name = "g", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!io", name = "h", descriptor = "Lcb;")
    public static class318 field3494;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V")
    public static void method1582(byte arg0) {
        field3491 = null;
        if (arg0 < 45) {
            method1585(-86);
        }
        field3494 = null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method1583(int arg0, Throwable arg1) throws IOException {
        field3489++;
        String var2;
        if ((arg1 instanceof class421)) {
            class421 var3 = (class421) arg1;
            var2 = var3.field5867 + " | ";
            arg1 = var3.field5865;
        } else {
            var2 = "";
        }
        if (arg0 != 0) {
            field3493 = -18;
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
                return var2 + "| " + var8;
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
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIBIIIIII)V")
    public static final void method1584(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3487++;
        class192 var10 = null;
        for (class192 var11 = (class192) class234.field3049.method374((byte) 100); var11 != null; var11 = (class192) class234.field3049.method372(-20740)) {
            if (var11.field2496 == arg9 && var11.field2493 == arg0 && var11.field2487 == arg8 && var11.field2494 == arg2) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class192();
            var10.field2487 = arg8;
            var10.field2494 = arg2;
            var10.field2493 = arg0;
            var10.field2496 = arg9;
            if (arg0 >= 0 && arg8 >= 0 && arg0 < class588.field8082 && class12.field113 > arg8) {
                class210.method1314(var10, (byte) -120);
            }
            class234.field3049.method378(var10, 31316);
        }
        var10.field2502 = arg6;
        var10.field2497 = arg1;
        var10.field2500 = arg4;
        var10.field2504 = arg5;
        if (arg3 <= -45) {
            var10.field2501 = arg7;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
    public static final void method1585(int arg0) {
        field3492++;
        int[] var1 = new int[class237.field3088.field2832];
        int var2 = 0;
        for (int var3 = 0; var3 < class237.field3088.field2832; var3++) {
            class660 var5 = class237.field3088.method1349(-1, var3);
            if (var5.field9299 >= 0 || var5.field9362 >= 0) {
                var1[var2++] = var3;
            }
        }
        class204.field2679 = new int[var2];
        if (arg0 != 15717) {
            method1585(-34);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class204.field2679[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(II)Z")
    public static final boolean method1586(int arg0, int arg1) {
        field3488++;
        if (arg1 != -11) {
            method1582((byte) -11);
        }
        return arg0 == 3 || arg0 == 7 || arg0 == 10;
    }
}
