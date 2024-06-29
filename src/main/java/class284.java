import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class284 extends class179 {

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "Llj;")
    public class38 field3713;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "La;")
    public static class229 field3716;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "[[Lpo;")
    public static class342[][] field3715;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "[[[B")
    public static byte[][][] field3710;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V", line = 6)
    public static final void method1786(int arg0) {
        if (arg0 != 1) {
            method1788(-49);
        }
        class276.field3581.method688(((float) class2.field18 * 0.1F + 0.7F) * class156.field1826);
        field3712++;
        class276.field3581.method737(class437.field5977, class139.field1594, class444.field6133, (float) class66.field798, (float) class20.field218, (float) class163.field1899);
        class276.field3581.method717(class138.field1577);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/lang/Throwable;Z)Ljava/lang/String;", line = 19)
    public static final String method1787(Throwable arg0, boolean arg1) throws IOException {
        field3711++;
        String var3;
        if (arg0 instanceof class46) {
            class46 var2 = (class46) arg0;
            var3 = var2.field527 + " | ";
            arg0 = var2.field529;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                if (arg1) {
                    field3715 = null;
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

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)V", line = 94)
    public static final void method1788(int arg0) {
        field3714++;
        if (arg0 <= 3) {
            method1789(100);
        }
        class219.field2708.method2298(0);
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)V", line = 105)
    public static void method1789(int arg0) {
        field3715 = null;
        field3716 = null;
        field3710 = null;
        if (arg0 != -20222) {
            field3710 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Llj;)V", line = 116)
    public class284(class38 arg0) {
        this.field3713 = arg0;
    }
}
