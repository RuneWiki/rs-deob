import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class92 extends class280 {

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
    private int field1393 = 0;

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "Z")
    public boolean field1400 = false;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    private int field1390 = -32768;

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
    private int field1408 = 0;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    public int field1409;

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "I")
    public int field1397;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    public int field1389;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    private int field1410;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
    public int field1407;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
    public int field1391;

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "Lu;")
    private class33 field1401;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
    public static int field1392 = -1;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "I")
    public static int field1395 = 0;

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "I")
    public static int field1402 = 500;

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "Lma;")
    public static class5 field1398 = null;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;", line = 10)
    public static final String method603(byte arg0, Throwable arg1) throws IOException {
        String var3;
        if (arg1 instanceof class235) {
            class235 var2 = (class235) arg1;
            arg1 = var2.field3884;
            var3 = var2.field3883 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        field1399++;
        if (arg0 <= 56) {
            return (String) null;
        }
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
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
                int var11 = var9.indexOf(40);
                int var12 = var9.indexOf(41, var11 + 1);
                if (var11 >= 0 && var12 >= 0) {
                    String var13 = var9.substring(var11 + 1, var12);
                    int var14 = var13.indexOf(".java:");
                    if (var14 >= 0) {
                        String var15 = var13.substring(0, var14) + var13.substring(var14 + 5);
                        var3 = var3 + var15 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var11);
                }
                String var16 = var9.trim();
                String var17 = var16.substring(var16.lastIndexOf(32) + 1);
                String var18 = var17.substring(var17.lastIndexOf(9) + 1);
                var3 = var3 + var18 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "()I", line = 78)
    public final int method248() {
        field1405++;
        return this.field1390;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIII)V", line = 91)
    public static final void method604(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class239.method1690(arg2 - arg3, 23267, arg2 + arg3, class137.field2032[arg0], arg1);
        field1394++;
        int var6 = 0;
        int var7 = arg5;
        if (arg4 != 221786337) {
            method605((byte) -70, 33, -34, 57, -74, -26);
        }
        int var8 = arg3 * arg3;
        int var9 = arg5 * arg5;
        int var10 = var8 << 1;
        int var11 = arg5 << 1;
        int var12 = var9 - ((var11 - 1) * var10);
        int var13 = var8 << 2;
        int var14 = var9 << 1;
        int var15 = var9 << 2;
        int var16 = ((var6 << 1) + 3) * var14;
        int var17 = (1 - var11) * var8 + var14;
        int var18 = ((arg5 << 1) - 3) * var10;
        int var19 = (var6 + 1) * var15;
        int var20 = (arg5 - 1) * var13;
        while (var7 > 0) {
            var7--;
            if (var17 < 0) {
                while (var17 < 0) {
                    var17 += var16;
                    var16 += var15;
                    var6++;
                    var12 += var19;
                    var19 += var15;
                }
            }
            if (var12 < 0) {
                var17 += var16;
                var12 += var19;
                var6++;
                var19 += var15;
                var16 += var15;
            }
            int var21 = arg0 + var7;
            var12 += -var18;
            int var22 = arg2 + var6;
            int var23 = arg0 - var7;
            var18 -= var13;
            int var24 = arg2 - var6;
            class239.method1690(var24, arg4 - 221763070, var22, class137.field2032[var23], arg1);
            class239.method1690(var24, 23267, var22, class137.field2032[var21], arg1);
            var17 += -var20;
            var20 -= var13;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BIIIII)V", line = 173)
    public static final void method605(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var8 = arg1 + 1;
        class239.method1690(arg3, 23267, arg2, class137.field2032[arg1], arg5);
        int var9 = arg4 - 1;
        class239.method1690(arg3, 23267, arg2, class137.field2032[arg4], arg5);
        if (arg0 <= 113) {
            field1402 = -64;
        }
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class137.field2032[var6];
            var7[arg3] = var7[arg2] = arg5;
        }
        field1404++;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(IIIIIII)V", line = 312)
    public class92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1409 = arg3;
        this.field1397 = arg4;
        this.field1389 = arg1;
        this.field1410 = arg0;
        this.field1407 = arg5 + arg6;
        this.field1391 = arg2;
        int var8 = class57.method430(this.field1410, 22867872).field753;
        if (var8 == -1) {
            this.field1400 = true;
        } else {
            this.field1400 = false;
            this.field1401 = class171.method1136(var8, -6722);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V", line = 209)
    public static void method606(byte arg0) {
        if (arg0 > -34) {
            field1398 = (class5) null;
        }
        field1398 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIIIIJ)V", line = 228)
    public final void method242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1403++;
        class34 var11 = this.method607((byte) -87);
        if (var11 != null) {
            var11.method242(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1390 = var11.method248();
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)Lkl;", line = 246)
    private final class34 method607(byte arg0) {
        field1396++;
        if (arg0 > -77) {
            this.field1409 = 34;
        }
        class48 var2 = class57.method430(this.field1410, 22867872);
        class34 var3;
        if (this.field1400) {
            var3 = var2.method360(-1, (byte) 61);
        } else {
            var3 = var2.method360(this.field1408, (byte) 61);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)V", line = 278)
    public final void method608(int arg0, boolean arg1) {
        field1406++;
        if (!arg1 || this.field1400) {
            return;
        }
        this.field1393 += arg0;
        while (this.field1401.field502[this.field1408] < this.field1393) {
            this.field1393 -= this.field1401.field502[this.field1408];
            this.field1408++;
            if (this.field1401.field529.length <= this.field1408) {
                this.field1400 = true;
                break;
            }
        }
    }
}
