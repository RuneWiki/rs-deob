import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class226 extends class151 {

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public int field4083 = -1;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
    public int field4093 = 0;

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "Lmb;")
    public static class132 field4096 = class166.method1092("<col=ffb000>", 111);

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "Lmb;")
    public static class132 field4092 = class166.method1092("-5berpr-Ufen Sie Ihr Mitteilungsfach)3", 125);

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "[I")
    public static int[] field4098 = new int[32768];

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "Lbg;")
    public static class19 field4090 = new class19();

    @OriginalMember(owner = "client!vb", name = "G", descriptor = "I")
    public static int field4100 = 0;

    @OriginalMember(owner = "client!vb", name = "L", descriptor = "Lmb;")
    public static class132 field4103 = class166.method1092("Ablegen", 125);

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public int field4084;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
    public int field4087;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public int field4088;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public int field4089;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "I")
    public int field4091;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "I")
    public int field4094;

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "I")
    public int field4095;

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "I")
    public int field4097;

    @OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
    public int field4099;

    @OriginalMember(owner = "client!vb", name = "J", descriptor = "I")
    public int field4102;

    @OriginalMember(owner = "client!vb", name = "I", descriptor = "[[[B")
    public static byte[][][] field4101;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
    public static void method1441(int arg0) {
        field4098 = null;
        field4103 = null;
        if (arg0 != 1) {
            field4092 = null;
        }
        field4092 = null;
        field4096 = null;
        field4101 = null;
        field4090 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method1442(Throwable arg0, int arg1) throws IOException {
        field4082++;
        String var3;
        if (arg0 instanceof class62) {
            class62 var2 = (class62) arg0;
            var3 = var2.field1039 + " | ";
            arg0 = var2.field1036;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        if (arg1 != 28737) {
            field4090 = null;
        }
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

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)Lrd;")
    public static final class188 method1443(int arg0) {
        field4086++;
        class188 var1 = new class188(class153.field2792, class140.field2619, class23.field321[0], class30.field462[0], class94.field1657[0], class153.field2793[arg0], class10.field109[0], class118.field2244);
        class187.method1193(arg0 + 1);
        return var1;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lpb;I)V")
    public static final void method1444(class165 arg0, int arg1) {
        field4085++;
        if (arg1 != -9052) {
            method1441(-28);
        }
        class149.field2737 = arg0;
    }
}
