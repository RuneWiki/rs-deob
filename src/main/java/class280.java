import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class280 extends class70 {

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    public int field4566 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public int field4567 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    public int field4565 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "I")
    public int field4572 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    public int field4569 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "I")
    public int field4573 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "I")
    public int field4576 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "I")
    public int field4571 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "Lsb;")
    public class127 field4563;

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "Lsf;")
    public static class124 field4575 = new class124(64);

    @OriginalMember(owner = "client!qj", name = "y", descriptor = "[I")
    public static int[] field4577 = new int[2];

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lsb;)V", line = 200)
    public class280(class127 arg0) {
        this.field4563 = arg0;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)Z", line = 13)
    public final boolean method1979(int arg0, int arg1, int arg2) {
        field4568++;
        if (arg1 >= this.field4566 && this.field4576 >= arg1 && arg2 >= this.field4567 && this.field4572 >= arg2) {
            return true;
        } else if (this.field4571 <= arg1 && arg1 <= this.field4565 && this.field4569 <= arg2 && arg2 <= this.field4573) {
            return true;
        } else {
            return arg0 != Integer.MAX_VALUE;
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)V", line = 38)
    public static final void method1980(byte arg0) {
        class328.field5273.method895(128);
        field4574++;
        if (arg0 != -45) {
            field4575 = (class124) null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([IIII[I)V", line = 49)
    public static final void method1981(int[] arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field4564++;
        if (arg1 < arg3) {
            int var5 = (arg1 + arg3) / 2;
            int var6 = arg4[var5];
            int var7 = arg1;
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var6;
            int var8 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var8;
            for (int var9 = arg1; var9 < arg3; var9++) {
                if ((var6 + (var9 & 0x1)) < arg4[var9]) {
                    int var10 = arg4[var9];
                    arg4[var9] = arg4[var7];
                    arg4[var7] = var10;
                    int var11 = arg0[var9];
                    arg0[var9] = arg0[var7];
                    arg0[var7++] = var11;
                }
            }
            arg4[arg3] = arg4[var7];
            arg4[var7] = var6;
            arg0[arg3] = arg0[var7];
            arg0[var7] = var8;
            method1981(arg0, arg1, 12233, var7 - 1, arg4);
            method1981(arg0, var7 + 1, 12233, arg3, arg4);
        }
        if (arg2 != 12233) {
            field4575 = (class124) null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;", line = 124)
    public static final String method1982(Throwable arg0, byte arg1) throws IOException {
        field4570++;
        String var3;
        if (arg0 instanceof class132) {
            class132 var2 = (class132) arg0;
            var3 = var2.field2270 + " | ";
            arg0 = var2.field2271;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        if (arg1 != 41) {
            field4577 = (int[]) null;
        }
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var11 = var9.indexOf(40);
            int var12 = var9.indexOf(41, var11 + 1);
            String var13;
            if (var11 == -1) {
                var13 = var9;
            } else {
                var13 = var9.substring(0, var11);
            }
            String var14 = var13.trim();
            String var15 = var14.substring(var14.lastIndexOf(32) + 1);
            String var16 = var15.substring(var15.lastIndexOf(9) + 1);
            String var17 = var3 + var16;
            if (var11 != -1 && var12 != -1) {
                int var18 = var9.indexOf(".java:", var11);
                if (var18 >= 0) {
                    var17 = var17 + var9.substring(var18 + 5, var12);
                }
            }
            var3 = var17 + ' ';
        }
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)V", line = 215)
    public static void method1983(int arg0) {
        field4575 = null;
        field4577 = null;
        if (arg0 != 1) {
            method1983(-104);
        }
    }
}
