import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class182 {

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field3123 = 1;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "Lbe;")
    public static class283 field3125 = class153.method941(-71, "<col=ff0000>");

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "Lbe;")
    public static class283 field3131 = class153.method941(127, "scrollen:");

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public static int field3130 = 0;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "Lek;")
    public static class172 field3126;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "Lnj;")
    public static class214 field3132;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V", line = 14)
    public static final void method1202(byte arg0) {
        if (arg0 != 79) {
            method1202((byte) 28);
        }
        field3127++;
        while (class262.field4462.method619((byte) -98, class260.field4419) >= 11) {
            int var1 = class262.field4462.method617((byte) -21, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class149.field2436[var1] == null) {
                class149.field2436[var1] = new class191();
                var2 = true;
                if (class177.field3041[var1] != null) {
                    class149.field2436[var1].method1244(class177.field3041[var1], (byte) -3);
                }
            }
            class162.field2666[class297.field5033++] = var1;
            class191 var3 = class149.field2436[var1];
            var3.field1186 = class75.field1309;
            int var4 = class262.field4462.method617((byte) -21, 5);
            int var5 = class262.field4462.method617((byte) -21, 1);
            if (var4 > 15) {
                var4 -= 32;
            }
            if (var5 == 1) {
                class26.field393[class69.field1015++] = var1;
            }
            int var6 = class262.field4462.method617((byte) -21, 1);
            int var7 = class262.field4462.method617((byte) -21, 5);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class76.field1318[class262.field4462.method617((byte) -21, 3)];
            if (var2) {
                var3.field1153 = var3.field1160 = var8;
            }
            var3.method1241((byte) -122, var6 == 1, class213.field3624.field1150[0] + var7, class213.field3624.field1178[0] - -var4);
        }
        class262.field4462.method620(true);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIIIIIII)V", line = 85)
    public static final void method1203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3129++;
        if (arg1 <= 46) {
            return;
        }
        if (arg2 == arg9 && arg3 == arg5 && arg0 == arg6 && arg4 == arg8) {
            class97.method647(arg8, arg6, arg7, (byte) 101, arg9, arg3);
            return;
        }
        int var10 = arg3;
        int var11 = arg9 * 3;
        int var12 = arg9;
        int var13 = arg3 * 3;
        int var14 = arg2 * 3;
        int var15 = arg5 * 3;
        int var16 = arg0 * 3;
        int var17 = arg4 * 3;
        int var18 = var15 + arg8 - var17 - arg3;
        int var19 = arg6 - (arg9 - var14) - var16;
        int var20 = var16 + var11 - var14 - var14;
        int var21 = var17 - var15 - (var15 - var13);
        int var22 = var14 - var11;
        int var23 = var15 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var19 * var26;
            int var28 = var18 * var26;
            int var29 = var20 * var25;
            int var30 = var21 * var25;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = (var27 + var29 + var31 >> 12) + arg9;
            int var34 = arg3 + (var28 + var32 + var30 >> 12);
            class97.method647(var34, var33, arg7, (byte) 44, var12, var10);
            var12 = var33;
            var10 = var34;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIIIII)V", line = 168)
    public static final void method1204(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3122++;
        if (arg1 != 15623) {
            method1203(70, -110, 63, 15, 32, 7, -97, 46, 63, 46);
        }
        int var8 = arg5 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class94.field1580 - class207.field3558) * var8 / 100 + class207.field3558;
        int var10 = arg7 * var9 >> 8;
        int var11 = 2048 - arg4 & 0x7FF;
        int var12 = 2048 - arg0 & 0x7FF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            int var16 = class139.field2309[var11];
            int var17 = class139.field2316[var11];
            var13 = -var10 * var16 >> 16;
            var15 = var10 * var17 >> 16;
        }
        if (var12 != 0) {
            int var18 = class139.field2309[var12];
            int var19 = class139.field2316[var12];
            var14 = var15 * var18 >> 16;
            var15 = var15 * var19 >> 16;
        }
        class150.field2450 = arg4;
        class63.field876 = arg3 - var13;
        class295.field5011 = arg0;
        class116.field1976 = arg6 - var14;
        class135.field2273 = arg2 - var15;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/Throwable;Z)Ljava/lang/String;", line = 271)
    public static final String method1205(Throwable arg0, boolean arg1) throws IOException {
        field3124++;
        String var3;
        if (arg0 instanceof class257) {
            class257 var2 = (class257) arg0;
            var3 = var2.field4340 + " | ";
            arg0 = var2.field4336;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        if (arg1) {
            field3131 = (class283) null;
        }
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var3 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var3 = var3 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var3 = var3 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 345)
    public static void method1206(int arg0) {
        field3125 = null;
        if (arg0 != -28762) {
            method1206(-20);
        }
        field3126 = null;
        field3131 = null;
        field3132 = null;
    }
}
