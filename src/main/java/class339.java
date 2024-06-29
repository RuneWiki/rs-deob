import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class339 {

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "Ld;")
    private class242 field5085 = new class242(64);

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "Lum;")
    private class83 field5083;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "Lum;")
    private class83 field5087;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "Z")
    public static boolean field5081 = true;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 7)
    public static final void method2193(String arg0, byte arg1) {
        field5080++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class35.method215(arg0, -108);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class6.field80; var3++) {
            String var4 = class265.field4229[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class35.method215(var4, -111);
            if (var5 != null && var5.equals(var2)) {
                class6.field80--;
                for (int var6 = var3; var6 < class6.field80; var6++) {
                    class265.field4229[var6] = class265.field4229[var6 + 1];
                    class289.field4483[var6] = class289.field4483[var6 + 1];
                    class23.field269[var6] = class23.field269[var6 + 1];
                    class353.field5237[var6] = class353.field5237[var6 + 1];
                    class477.field7014[var6] = class477.field7014[var6 + 1];
                    class405.field5988[var6] = class405.field5988[var6 + 1];
                }
                class221.field3314 = class348.field5194;
                class106.field1621++;
                class110.method857(4095, class182.field2780);
                class312.field4752.method1381(class447.method2755(arg0, (byte) 59), (byte) 119);
                class312.field4752.method1343(arg0, (byte) -14);
                break;
            }
        }
        if (arg1 != -65) {
            method2193(null, (byte) -99);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IB)Lhu;", line = 76)
    public final class405 method2194(int arg0, byte arg1) {
        field5082++;
        class405 var3 = (class405) this.field5085.method1634((long) arg0, arg1 ^ 0xB);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field5083.method731(0, arg0 & 0x7FFF, 0);
        } else {
            var4 = this.field5087.method731(0, arg0, 0);
        }
        if (arg1 != 75) {
            method2193(null, (byte) 99);
        }
        class405 var5 = new class405();
        if (var4 != null) {
            var5.method2552(-6203, new class194(var4));
        }
        if (arg0 >= 32768) {
            var5.method2546(arg1 + 229);
        }
        this.field5085.method1623((long) arg0, arg1 + 17546, var5);
        return var5;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 109)
    public static final String method2195(int arg0, Throwable arg1) throws IOException {
        field5084++;
        if (arg0 != 0) {
            field5086 = 10;
        }
        String var3;
        if (arg1 instanceof class341) {
            class341 var2 = (class341) arg1;
            var3 = var2.field5091 + " | ";
            arg1 = var2.field5090;
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

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(ILum;Lum;)V", line = 197)
    public class339(int arg0, class83 arg1, class83 arg2) {
        this.field5083 = arg2;
        this.field5087 = arg1;
        if (this.field5087 != null) {
            this.field5087.method748(0, 12408);
        }
        if (this.field5083 != null) {
            this.field5083.method748(0, 12408);
        }
    }
}
