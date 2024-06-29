import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class404 implements class396 {

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "Lefa;")
    private class196 field5739;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "Luq;")
    private class172 field5738;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field5737;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "Lhh;")
    private class140 field5742;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method2444(int arg0, long arg1) {
        field5741++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        }
        int var3 = 56 % ((arg0 + 74) / 48);
        if ((arg1 % 37L) == 0L) {
            return null;
        }
        int var4 = 0;
        long var5 = arg1;
        while (var5 != 0L) {
            var5 /= 37L;
            var4++;
        }
        StringBuffer var7 = new StringBuffer(var4);
        while (arg1 != 0L) {
            long var8 = arg1;
            arg1 /= 37L;
            var7.append(class255.field3795[(int) (var8 - arg1 * 37L)]);
        }
        return var7.reverse().toString();
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
    public final void method211(byte arg0) {
        if (arg0 <= -107) {
            field5743++;
            this.field5742 = class570.method3243(this.field5738, this.field5739.field2541, true);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method2445(Throwable arg0, int arg1) throws IOException {
        field5737++;
        String var3;
        if (arg0 instanceof class777) {
            class777 var2 = (class777) arg0;
            var3 = var2.field10678 + " | ";
            arg0 = var2.field10680;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        if (arg1 != 31660) {
            return null;
        }
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

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)Z")
    public final boolean method210(int arg0) {
        field5736++;
        if (arg0 != 16125) {
            this.field5742 = null;
        }
        return this.field5738.method1185(this.field5739.field2541, arg0 ^ 0x1A8F);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZI)V")
    public final void method209(boolean arg0, int arg1) {
        field5740++;
        if (arg0) {
            int var3 = class460.field6558 > class67.field933 ? class460.field6558 : class67.field933;
            int var4 = class187.field2450 < class693.field9222 ? class693.field9222 : class187.field2450;
            int var5 = this.field5742.method343();
            int var6 = this.field5742.method340();
            int var7 = 0;
            int var8 = var3;
            int var9 = var3 * var6 / var5;
            int var10 = (var4 - var9) / 2;
            if (var9 > var4) {
                var9 = var4;
                var10 = 0;
                var8 = var4 * var5 / var6;
                var7 = (var3 - var8) / 2;
            }
            this.field5742.method971(var7, var10, var8, var9);
        }
        if (arg1 != 7582) {
            this.field5738 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Luq;Lefa;)V")
    public class404(class172 arg0, class196 arg1) {
        this.field5739 = arg1;
        this.field5738 = arg0;
    }
}
