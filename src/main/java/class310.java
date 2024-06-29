import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class310 {

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "[I")
    public static int[] field3965 = new int[16384];

    @OriginalMember(owner = "client!wca", name = "d", descriptor = "[I")
    public static int[] field3966 = new int[16384];

    @OriginalMember(owner = "client!wca", name = "h", descriptor = "Lim;")
    public static class353 field3970;

    @OriginalMember(owner = "client!wca", name = "j", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!wca", name = "e", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!wca", name = "f", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!wca", name = "g", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!wca", name = "i", descriptor = "[[[B")
    public static byte[][][] field3971;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIIILpa;ILha;Ljq;)V")
    public static final void method1865(int arg0, int arg1, int arg2, int arg3, class594 arg4, int arg5, class116 arg6, class447 arg7) {
        field3964++;
        if (arg6 == null) {
            return;
        }
        int var8;
        if (class621.field8952 == 4) {
            var8 = (int) class521.field7250 & 0x3FFF;
        } else {
            var8 = (int) class521.field7250 + class374.field5212 & 0x3FFF;
        }
        int var9 = Math.max(arg7.field6330 / 2, arg7.field6218 / 2) + 10;
        int var10 = arg2 * arg2 + arg3 * arg3;
        if (var10 > (var9 * var9)) {
            return;
        }
        int var11 = field3966[var8];
        int var12 = field3965[var8];
        if (arg1 < 113) {
            field3971 = null;
        }
        if (class621.field8952 != 4) {
            var11 = var11 * 256 / (class54.field728 + 256);
            var12 = var12 * 256 / (class54.field728 + 256);
        }
        int var13 = arg3 * var11 + (arg2 * var12) >> 14;
        int var14 = arg3 * var12 - (arg2 * var11) >> 14;
        arg6.method634(arg7.field6330 / 2 + arg5 + var13 - (arg6.method627() / 2), arg0 - -(arg7.field6218 / 2) + -var14 - arg6.method631() / 2, arg4, arg5, arg0);
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(III)Z")
    public static final boolean method1866(int arg0, int arg1, int arg2) {
        if (arg2 != 5170) {
            method1866(95, 113, -77);
        }
        field3967++;
        return (arg0 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method1867(Throwable arg0, int arg1) throws IOException {
        field3963++;
        String var2;
        if ((arg0 instanceof class342)) {
            class342 var3 = (class342) arg0;
            var2 = var3.field4752 + " | ";
            arg0 = var3.field4755;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        if (arg1 != 821428738) {
            field3971 = null;
        }
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var2 + "| " + var8;
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
            String var16 = var2 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Z)V")
    public static void method1868(boolean arg0) {
        field3966 = null;
        if (arg0) {
            method1865(101, 91, -81, -35, null, -28, null, null);
        }
        field3965 = null;
        field3970 = null;
        field3971 = null;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lge;II)Ljava/lang/String;")
    public static final String method1869(class551 arg0, int arg1, int arg2) {
        field3969++;
        try {
            int var3 = arg0.method3059(76);
            if (var3 > arg1) {
                var3 = arg1;
            }
            if (arg2 != 8624) {
                method1868(true);
            }
            byte[] var4 = new byte[var3];
            arg0.field7707 += class154.field2006.method2678(0, arg0.field7693, arg0.field7707, var3, var4, 0);
            return class492.method2764(var3, var4, -3, 0);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(III)Z")
    public static final boolean method1870(int arg0, int arg1, int arg2) {
        field3968++;
        if (arg0 == 63) {
            return (arg2 & 0x21) != 0;
        } else {
            return true;
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field3966[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field3965[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
        field3970 = new class353(46, -2);
        field3972 = 0;
    }
}
