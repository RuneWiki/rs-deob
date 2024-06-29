import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class493 {

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    public int field6943;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public int field6942;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "Lam;")
    public class493 field6946;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "Lmu;")
    public class315 field6945;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "[[I")
    public static int[][] field6940 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!am", name = "e", descriptor = "[I")
    public static int[] field6937 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!am", name = "c", descriptor = "Lj;")
    public static class240 field6935 = new class240(5, 14);

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public int field6933;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public int field6934;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field6936;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public int field6939;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public static int field6941;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "I")
    public static int field6944;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "I")
    public static int field6947;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "Lui;")
    public static class451 field6938;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II)Lje;", line = 3)
    public static final class178 method2885(int arg0, int arg1) {
        field6936++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & arg1;
        if (class467.field6572[var2] == null || class467.field6572[var2][var3] == null) {
            boolean var4 = class161.method1094(arg1 ^ 0x77A4ED2F, var2);
            if (!var4) {
                return null;
            }
        }
        return class467.field6572[var2][var3];
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 40)
    public static final String method2886(Throwable arg0, int arg1) throws IOException {
        field6941++;
        String var3;
        if (arg0 instanceof class329) {
            class329 var2 = (class329) arg0;
            arg0 = var2.field4928;
            var3 = var2.field4927 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        if (arg1 != 19528) {
            return null;
        }
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

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V", line = 118)
    public static void method2887(int arg0) {
        field6940 = null;
        if (arg0 == -9193) {
            field6937 = null;
            field6938 = null;
            field6935 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ltq;Lhm;III)V", line = 131)
    public static final void method2888(class63 arg0, class352 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class412.field5957) {
            class337 var5 = class170.field2427[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field5063 != null && var5.field5063.method253(-18)) {
                arg1.method245((byte) -43, true, arg0, var5.field5063, 0, 0, class75.field1055);
            }
        }
        if (arg4 < class412.field5957) {
            class337 var6 = class170.field2427[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field5063 != null && var6.field5063.method253(-53)) {
                arg1.method245((byte) -116, true, arg0, var6.field5063, 0, class75.field1055, 0);
            }
        }
        if (arg3 < class412.field5957 && arg4 < class315.field4743) {
            class337 var7 = class170.field2427[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field5063 != null && var7.field5063.method253(-126)) {
                arg1.method245((byte) -75, true, arg0, var7.field5063, 0, class75.field1055, class75.field1055);
            }
        }
        if (arg3 < class412.field5957 && arg4 > 0) {
            class337 var8 = class170.field2427[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field5063 != null && var8.field5063.method253(-89)) {
                arg1.method245((byte) -97, true, arg0, var8.field5063, 0, -class75.field1055, class75.field1055);
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(II)V", line = 178)
    public class493(int arg0, int arg1) {
        this.field6943 = arg0;
        this.field6942 = arg1;
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lam;I)V", line = 186)
    public class493(class493 arg0, int arg1) {
        this.field6946 = arg0;
        this.field6945 = this.field6946.field6945;
        this.field6942 = this.field6946.field6942 + arg1;
        this.field6943 = this.field6946.field6943;
    }
}
