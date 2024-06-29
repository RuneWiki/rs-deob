import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class1 implements class147 {

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "Loa;")
    public static class99 field1 = class221.method1463(2844, "document)3cookie=(R");

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "Loa;")
    public static class99 field6 = class221.method1463(2844, "");

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)Laa;")
    public static final class170 method1(boolean arg0) {
        field3++;
        class109 var1 = new class109(class164.field2883, class88.field1520, class290.field5082[0], class11.field94[0], class223.field3885[0], class193.field3395[0], class181.field3151[0], class173.field3062);
        if (arg0) {
            class24.method181(!arg0);
            return var1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZI)I")
    public static final int method2(boolean arg0, int arg1) {
        field4++;
        if (!arg0) {
            method2(true, 72);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/lang/Throwable;Z)Ljava/lang/String;")
    public static final String method3(Throwable arg0, boolean arg1) throws IOException {
        field11++;
        String var2;
        if ((arg0 instanceof class69)) {
            class69 var3 = (class69) arg0;
            var2 = var3.field1151 + " | ";
            arg0 = var3.field1146;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        if (arg1) {
            field1 = null;
        }
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BI[IJ)Loa;")
    public final class99 method4(byte arg0, int arg1, int[] arg2, long arg3) {
        field7++;
        if (arg1 == 0) {
            class234 var6 = class229.method1504(-1, arg2[0]);
            return var6.method1523((int) arg3, 104);
        } else if (arg1 == 1 || arg1 == 10) {
            class166 var7 = class222.method1468(1, (int) arg3);
            return var7.field2963;
        } else {
            if (arg0 >= -11) {
                field10 = 33;
            }
            return arg1 == 6 || arg1 == 7 || arg1 == 11 ? class229.method1504(-1, arg2[0]).method1523((int) arg3, 104) : null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
    public static void method5(byte arg0) {
        int var1 = 66 % ((60 - arg0) / 45);
        field1 = null;
        field6 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "()V")
    public static final void method6() {
        for (int var0 = 0; var0 < class288.field5032; var0++) {
            class77 var1 = class242.field4198[var0];
            class19.method115(var1);
            class242.field4198[var0] = null;
        }
        class288.field5032 = 0;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIILuk;IJZ)Z")
    public static final boolean method7(int arg0, int arg1, int arg2, int arg3, int arg4, class98 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class210.method1411(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BLjd;)V")
    public static final void method8(byte arg0, class87 arg1) {
        if (arg0 != 34) {
            field10 = 61;
        }
        field9++;
        class5 var2 = null;
        try {
            class275 var3 = arg1.method590(arg0 - 60, "runescape");
            while (var3.field4844 == 0) {
                class100.method711(0, 1L);
            }
            if (var3.field4844 == 1) {
                var2 = (class5) var3.field4843;
                class261 var4 = class143.method963((byte) -122);
                var2.method51(var4.field4619, 1, var4.field4587, 0);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method47(false);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILtg;)V")
    public static final void method9(int arg0, class182 arg1) {
        class194.field3410 = arg1;
        field8++;
        class128.field2229 = class194.field3410.method1233(arg0, false);
    }
}
