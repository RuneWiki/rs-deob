import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ea")
public class class10 {

    @OriginalMember(owner = "mapview!ea", name = "k", descriptor = "[Lra;")
    private class35[] field107;

    @OriginalMember(owner = "mapview!ea", name = "f", descriptor = "I")
    private int field102;

    @OriginalMember(owner = "mapview!ea", name = "c", descriptor = "Lua;")
    public static class41 field99 = class16.method86("Cookery Shop", true);

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "Lua;")
    public static class41 field97 = class16.method86("Fur Trader", true);

    @OriginalMember(owner = "mapview!ea", name = "e", descriptor = "Lua;")
    public static class41 field101 = class16.method86("Sandpit", true);

    @OriginalMember(owner = "mapview!ea", name = "g", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "mapview!ea", name = "d", descriptor = "J")
    private long field100;

    @OriginalMember(owner = "mapview!ea", name = "j", descriptor = "Lma;")
    public static class25 field106;

    @OriginalMember(owner = "mapview!ea", name = "i", descriptor = "Ln;")
    public static class26 field105;

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "Lra;")
    private class35 field98;

    @OriginalMember(owner = "mapview!ea", name = "h", descriptor = "Z")
    public static boolean field104;

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 6)
    public static final String method54(int arg0, Throwable arg1) throws IOException {
        String var3;
        if (arg1 instanceof class31) {
            class31 var2 = (class31) arg1;
            var3 = var2.field410 + " | ";
            arg1 = var2.field412;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        if (arg0 != 1) {
            field104 = false;
        }
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

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(I)I", line = 82)
    public static final int method55(int arg0) {
        if (arg0 != 255) {
            field103 = -47;
        }
        if (class7.field83 == null) {
            return 0;
        } else if (class7.field83.field419 == null) {
            return class1.field1[class7.field83.field423 & 0xFF];
        } else {
            return class1.field1[class7.field83.field419[class42.field514] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "(I)Lra;", line = 108)
    public final class35 method56(int arg0) {
        if (this.field98 == null) {
            return null;
        }
        class35 var2 = this.field107[(int) ((long) (this.field102 - 1) & this.field100)];
        while (this.field98 != var2) {
            if (this.field98.field441 == this.field100) {
                class35 var3 = this.field98;
                this.field98 = this.field98.field436;
                return var3;
            }
            this.field98 = this.field98.field436;
        }
        if (arg0 != -13055) {
            method57(64);
        }
        this.field98 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!ea", name = "c", descriptor = "(I)V", line = 141)
    public static void method57(int arg0) {
        if (arg0 != 41) {
            return;
        }
        field106 = null;
        field97 = null;
        field99 = null;
        field101 = null;
        field105 = null;
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(BJ)Lra;", line = 165)
    public final class35 method58(byte arg0, long arg1) {
        int var4 = 110 % ((arg0 + 19) / 35);
        this.field100 = arg1;
        class35 var5 = this.field107[(int) ((long) (this.field102 - 1) & arg1)];
        for (this.field98 = var5.field436; this.field98 != var5; this.field98 = this.field98.field436) {
            if (this.field98.field441 == arg1) {
                class35 var6 = this.field98;
                this.field98 = this.field98.field436;
                return var6;
            }
        }
        this.field98 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(Lra;IJ)V", line = 195)
    public final void method59(class35 arg0, int arg1, long arg2) {
        if (arg0.field439 != null) {
            arg0.method200(117);
        }
        if (arg1 != 0) {
            field97 = null;
        }
        class35 var5 = this.field107[(int) ((long) (this.field102 - 1) & arg2)];
        arg0.field439 = var5.field439;
        arg0.field436 = var5;
        arg0.field439.field436 = arg0;
        arg0.field436.field439 = arg0;
        arg0.field441 = arg2;
    }

    @OriginalMember(owner = "mapview!ea", name = "<init>", descriptor = "(I)V", line = 232)
    public class10(int arg0) {
        this.field107 = new class35[arg0];
        this.field102 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class35 var3 = this.field107[var2] = new class35();
            var3.field439 = var3;
            var3.field436 = var3;
        }
    }
}
