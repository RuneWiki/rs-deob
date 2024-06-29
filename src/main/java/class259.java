import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class259 extends class481 {

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "[Z")
    public static boolean[] field3517 = new boolean[100];

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public int field3510;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public int field3514;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    public int field3518;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
    public int field3519;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    public int field3520;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
    public int field3522;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "Ljava/lang/String;")
    public String field3511;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIZ)V")
    public static final void method1537(int arg0, int arg1, int arg2, boolean arg3) {
        field3515++;
        int var4 = class76.field1075.field3685 * arg2 >> 8;
        if (var4 != 0 && arg0 != -1) {
            class188.method1258(class206.field2965, -120, arg0, false, 0, var4);
            class363.field5221 = true;
        }
        if (!arg3) {
            field3517 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)V")
    public static final void method1538(byte arg0) {
        field3516++;
        if (class496.field7236 < 1024.0F) {
            class496.field7236 = 1024.0F;
        }
        while (class191.field2797 >= 16384.0F) {
            class191.field2797 -= 16384.0F;
        }
        if (class496.field7236 > 3072.0F) {
            class496.field7236 = 3072.0F;
        }
        while (class191.field2797 < 0.0F) {
            class191.field2797 += 16384.0F;
        }
        int var1 = class70.field1012 >> 7;
        int var2 = class193.field2815 >> 7;
        int var3 = class123.method893(class193.field2815, class70.field1012, (byte) -13, class366.field5260);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && (class9.field111 - 4) > var1 && var2 < (class192.field2809 - 4)) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class366.field5260;
                    if (var7 < 3 && class363.method2175(10174, var5, var6)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class256.field3487.field10 != null && class256.field3487.field10[var7] != null) {
                        var8 = (class256.field3487.field10[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var3 + var8 - class492.field7122[var7].method85(var5, var6);
                    if (var4 < var9) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = (var4 >> 0) * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (arg0 != -84) {
            field3517 = null;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (class238.field3297 < var10) {
            class238.field3297 += (var10 - class238.field3297) / 24;
        } else if (var10 < class238.field3297) {
            class238.field3297 += (var10 - class238.field3297) / 80;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3509++;
        if (class523.method3109((byte) -65, arg3)) {
            if (class302.field4121[arg3] == null) {
                class412.method2423(-1, arg4, arg7, arg5, class505.field7387[arg3], false, arg6, arg0, arg8, arg1);
            } else {
                class412.method2423(-1, arg4, arg7, arg5, class302.field4121[arg3], false, arg6, arg0, arg8, arg1);
            }
            int var10 = -109 / ((-arg2 - 16) / 59);
        } else if (arg5 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class428.field6214[var9] = true;
            }
        } else {
            class428.field6214[arg5] = true;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
    public static final String method1540(Throwable arg0, byte arg1) throws IOException {
        field3513++;
        String var2;
        if ((arg0 instanceof class76)) {
            class76 var3 = (class76) arg0;
            var2 = var3.field1073 + " | ";
            arg0 = var3.field1070;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        if (arg1 != -125) {
            return null;
        }
        var5.close();
        String var6 = var4.toString();
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

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
    public static final void method1541(int arg0) {
        class473 var1 = class11.field127;
        synchronized (class11.field127) {
            class11.field127.method2764(-769);
        }
        field3512++;
        if (arg0 != -4) {
            field3517 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)V")
    public static final void method1542(byte arg0) {
        if (arg0 != 24) {
            method1539(-82, -31, 86, -64, -14, -128, -120, -125, -90);
        }
        class27.field373.method2764(-769);
        field3521++;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V")
    public static void method1543(int arg0) {
        field3517 = null;
        if (arg0 != 0) {
            field3517 = null;
        }
    }
}
