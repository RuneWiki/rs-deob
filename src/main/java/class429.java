import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class429 {

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "Ljava/lang/String;")
    public String field6281;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "I")
    public int field6284;

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "J")
    public long field6286;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "Ljava/lang/String;")
    public String field6282;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public int field6278;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "Ljava/lang/String;")
    public static String field6277 = null;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
    public static int field6280 = 0;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public static int field6279;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
    public static int field6287;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IBII)Z", line = 10)
    public static final boolean method2671(int arg0, byte arg1, int arg2, int arg3) {
        field6279++;
        if (!class432.field6336 || !class199.field3402) {
            return false;
        } else if (class699.field9884 < 100) {
            return false;
        } else {
            int var4 = class158.field2452[arg0][arg2][arg3];
            if ((-class245.field3946) == var4) {
                return false;
            } else if (class245.field3946 == var4) {
                return true;
            } else if (class211.field3511 == class152.field2374) {
                return false;
            } else {
                if (arg1 >= -23) {
                    method2671(29, (byte) -10, 64, -24);
                }
                int var5 = arg2 << class662.field9425;
                int var6 = arg3 << class662.field9425;
                if (class129.method1039(class211.field3511[arg0].method2160(-94, arg3, arg2), var5 + class382.field5732 - 1, (byte) -85, var6 + 1, class211.field3511[arg0].method2160(-116, arg3 + 1, arg2), var5 + 1, class211.field3511[arg0].method2160(-84, arg3 + 1, arg2 + 1), var5 + 1, class382.field5732 + var6 + -1, var6 + class382.field5732 - 1) && class129.method1039(class211.field3511[arg0].method2160(-99, arg3, arg2), class382.field5732 + var5 - 1, (byte) -64, var6 + 1, class211.field3511[arg0].method2160(-111, arg3 - -1, arg2 + 1), class382.field5732 + var5 - 1, class211.field3511[arg0].method2160(-113, arg3, arg2 - -1), var5 + 1, var6 - -class382.field5732 + -1, var6 + 1)) {
                    class331.field4876++;
                    class158.field2452[arg0][arg2][arg3] = class245.field3946;
                    return true;
                } else {
                    class158.field2452[arg0][arg2][arg3] = -class245.field3946;
                    return false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ltw;I)Z", line = 60)
    public static final boolean method2672(class523 arg0, int arg1) {
        field6285++;
        if (arg1 != 32) {
            field6283 = -11;
        }
        class595 var2 = class576.field8167.method3074(0, arg0.method87(arg1 + 2804));
        if (var2.field8444 == -1) {
            return true;
        } else {
            class308 var3 = class629.field8840.method3852(var2.field8444, true);
            return var3.field4653 == -1 ? true : var3.method2036((byte) -114);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;", line = 88)
    public static final String method2673(Throwable arg0, byte arg1) throws IOException {
        field6287++;
        String var3;
        if (arg0 instanceof class106) {
            class106 var2 = (class106) arg0;
            var3 = var2.field1550 + " | ";
            arg0 = var2.field1547;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        int var6 = -108 / ((33 - arg1) / 50);
        arg0.printStackTrace(var5);
        var5.close();
        String var7 = var4.toString();
        BufferedReader var8 = new BufferedReader(new StringReader(var7));
        String var9 = var8.readLine();
        while (true) {
            String var10 = var8.readLine();
            if (var10 == null) {
                return var3 + "| " + var9;
            }
            int var11 = var10.indexOf(40);
            int var12 = var10.indexOf(41, var11 + 1);
            String var13;
            if (var11 == -1) {
                var13 = var10;
            } else {
                var13 = var10.substring(0, var11);
            }
            String var14 = var13.trim();
            String var15 = var14.substring(var14.lastIndexOf(32) + 1);
            String var16 = var15.substring(var15.lastIndexOf(9) + 1);
            String var17 = var3 + var16;
            if (var11 != -1 && var12 != -1) {
                int var18 = var10.indexOf(".java:", var11);
                if (var18 >= 0) {
                    var17 = var17 + var10.substring(var18 + 5, var12);
                }
            }
            var3 = var17 + ' ';
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V", line = 159)
    public static void method2674(byte arg0) {
        int var1 = -65 / ((64 - arg0) / 55);
        field6277 = null;
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V", line = 171)
    public class429(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field6281 = arg3;
        this.field6284 = arg2;
        this.field6286 = arg4;
        this.field6282 = arg1;
        this.field6278 = arg0;
    }
}
