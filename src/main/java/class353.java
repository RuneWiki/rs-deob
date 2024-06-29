import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class353 {

    @OriginalMember(owner = "client!io", name = "e", descriptor = "J")
    public static long field5433 = 0L;

    @OriginalMember(owner = "client!io", name = "f", descriptor = "I")
    public static int field5434 = 0;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!io", name = "c", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!io", name = "g", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!io", name = "h", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIII)V", line = 19)
    public static final void method2460(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5436++;
        int var5 = -arg4;
        if (arg1 != 1) {
            return;
        }
        class329.method2285(arg3 - arg4, class274.field4158[arg0], (byte) 95, arg3 + arg4, arg2);
        int var6 = 0;
        int var7 = arg4;
        int var8 = -1;
        while (var6 < var7) {
            var6++;
            var8 += 2;
            var5 += var8;
            if (var5 >= 0) {
                var7--;
                var5 -= var7 << 1;
                int[] var9 = class274.field4158[arg0 + var7];
                int[] var10 = class274.field4158[arg0 - var7];
                int var11 = arg3 + var6;
                int var12 = arg3 - var6;
                class329.method2285(var12, var9, (byte) -83, var11, arg2);
                class329.method2285(var12, var10, (byte) 100, var11, arg2);
            }
            int var13 = arg3 + var7;
            int var14 = arg3 - var7;
            int[] var15 = class274.field4158[arg0 + var6];
            int[] var16 = class274.field4158[arg0 - var6];
            class329.method2285(var14, var15, (byte) -59, var13, arg2);
            class329.method2285(var14, var16, (byte) 73, var13, arg2);
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 82)
    public static final String method2461(int arg0, Throwable arg1) throws IOException {
        field5429++;
        String var3;
        if (arg1 instanceof class240) {
            class240 var2 = (class240) arg1;
            arg1 = var2.field3569;
            var3 = var2.field3572 + " | ";
        } else {
            var3 = "";
        }
        if (arg0 != 5) {
            method2463((byte) -23, -41L);
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

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V", line = 160)
    public static final void method2462(byte arg0) {
        int var1 = 62 / ((arg0 + 50) / 56);
        class172.field2478.method458((byte) 115);
        class209.field3048.method458((byte) 117);
        field5431++;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BJ)V", line = 170)
    public static final void method2463(byte arg0, long arg1) {
        if (!class274.field4156) {
            class36.field535 += (float) arg1 * class257.field3844 / 40.0F;
            class103.field1476 += (float) arg1 * class354.field5443 / 40.0F;
        }
        int var3 = class287.field4337 + class1.field55.field5137;
        field5432++;
        int var4 = class1.field55.field5165 + class108.field1561;
        if ((class112.field1623 - var3) < -500 || (class112.field1623 - var3) > 500 || class150.field2184 - var4 < -500 || class150.field2184 - var4 > 500) {
            class150.field2184 = var4;
            class112.field1623 = var3;
        }
        if (arg0 != -57) {
            field5433 = 68L;
        }
        if (class112.field1623 != var3) {
            int var5 = var3 - class112.field1623;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var5 > var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var5 < var6) {
                var6 = var5;
            }
            class112.field1623 += var6;
        }
        if (class150.field2184 != var4) {
            int var7 = var4 - class150.field2184;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class150.field2184 += var8;
        }
        class32.method226(90);
    }
}
