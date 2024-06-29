import jaggl.OpenGL;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oha")
public class class739 extends class85 {

    @OriginalMember(owner = "client!oha", name = "j", descriptor = "I")
    public static int field10276 = 0;

    @OriginalMember(owner = "client!oha", name = "k", descriptor = "I")
    public static int field10277;

    @OriginalMember(owner = "client!oha", name = "m", descriptor = "I")
    public static int field10279;

    @OriginalMember(owner = "client!oha", name = "n", descriptor = "I")
    public static int field10280;

    @OriginalMember(owner = "client!oha", name = "p", descriptor = "I")
    public static int field10282;

    @OriginalMember(owner = "client!oha", name = "q", descriptor = "I")
    public static int field10283;

    @OriginalMember(owner = "client!oha", name = "r", descriptor = "I")
    public static int field10284;

    @OriginalMember(owner = "client!oha", name = "o", descriptor = "[I")
    public static int[] field10281;

    @OriginalMember(owner = "client!oha", name = "l", descriptor = "[[B")
    public static byte[][] field10278;

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "(Z)V", line = 8)
    public static void method4126(boolean arg0) {
        field10281 = null;
        field10278 = null;
        if (arg0) {
            method4129((byte) -81);
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(ZIII)I", line = 20)
    public static final int method4127(boolean arg0, int arg1, int arg2, int arg3) {
        field10277++;
        class95 var4 = class71.method589(arg0, -9854, arg1);
        if (var4 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var5 = 0;
            int var6 = 0;
            if (arg3 > -68) {
                method4126(true);
            }
            while (var6 < var4.field1113.length) {
                if (var4.field1107[var6] == arg2) {
                    var5 += var4.field1113[var6];
                }
                var6++;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(IIIIII[B)V", line = 63)
    public static final void method4128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        if (arg3 < 42) {
            return;
        }
        field10283++;
        if (arg2 > 0 && !class253.method1681(arg2, (byte) 66)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class253.method1681(arg0, (byte) 112)) {
            int var7 = class21.method133(arg5, true);
            int var8 = 0;
            int var9 = arg0 > arg2 ? arg2 : arg0;
            int var10 = arg2 >> 1;
            int var11 = arg0 >> 1;
            byte[] var12 = arg6;
            byte[] var13 = new byte[var7 * var10 * var11];
            while (true) {
                OpenGL.glTexImage2Dub(arg1, var8, arg4, arg2, arg0, 0, arg5, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg2 * var7;
                byte[] var15 = var13;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var14 + var16;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            int var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var13[var17] = (byte) (var27 >> 2);
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                var13 = var12;
                arg0 = var11;
                var12 = var15;
                arg2 = var10;
                var8++;
                var9 >>= 0x1;
                var10 >>= 0x1;
                var11 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "(B)V", line = 160)
    public static final void method4129(byte arg0) {
        if (arg0 < 101) {
            field10278 = null;
        }
        field10282++;
        for (class651 var1 = (class651) class310.field4316.method2765(-12261); var1 != null; var1 = (class651) class310.field4316.method2759(-15361)) {
            class182 var2 = var1.field8947;
            if (class740.field10285 > var2.field2428) {
                var1.method1185(-125);
                var2.method1145(16383);
            } else if (var2.field2465 <= class740.field10285) {
                var2.method1143((byte) 97);
                if (var2.field2430 > 0) {
                    class740 var3 = (class740) class373.field5230.method1180((byte) 26, (long) (var2.field2430 - 1));
                    if (var3 != null) {
                        class468 var4 = var3.field10289;
                        if (var4.field1264 >= 0 && var4.field1264 < (class336.field4683 * 512) && var4.field1250 >= 0 && var4.field1250 < (class700.field9768 * 512)) {
                            var2.method1147(class469.method2798(69, var4.field1250, var2.field1266, var4.field1264) - var2.field2462, var4.field1264, 0, var4.field1250, class740.field10285);
                        }
                    }
                }
                if (var2.field2430 < 0) {
                    int var5 = -var2.field2430 - 1;
                    class280 var6;
                    if (class389.field5512 == var5) {
                        var6 = class660.field9039;
                    } else {
                        var6 = class309.field4311[var5];
                    }
                    if (var6 != null && var6.field1264 >= 0 && var6.field1264 < (class336.field4683 * 512) && var6.field1250 >= 0 && class700.field9768 * 512 > var6.field1250) {
                        var2.method1147(class469.method2798(110, var6.field1250, var2.field1266, var6.field1264) - var2.field2462, var6.field1264, 0, var6.field1250, class740.field10285);
                    }
                }
                var2.method1155(class144.field2064, (byte) 104);
                class505.method2989(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 225)
    public static final String method4130(int arg0, Throwable arg1) throws IOException {
        field10280++;
        String var2;
        if ((arg1 instanceof class738)) {
            class738 var3 = (class738) arg1;
            arg1 = var3.field10270;
            var2 = var3.field10271 + " | ";
        } else {
            var2 = "";
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
                if (arg0 >= -111) {
                    field10281 = null;
                }
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

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "([BIII)[B", line = 308)
    public static final byte[] method4131(byte[] arg0, int arg1, int arg2, int arg3) {
        int var4 = 63 % ((arg2 + 60) / 46);
        field10279++;
        byte[] var5;
        if (arg3 <= 0) {
            var5 = arg0;
        } else {
            var5 = new byte[arg1];
            for (int var6 = 0; var6 < arg1; var6++) {
                var5[var6] = arg0[arg3 + var6];
            }
        }
        class146 var7 = new class146();
        var7.method1015(-2);
        var7.method1011((byte) -64, (long) (arg1 * 8), var5);
        byte[] var8 = new byte[64];
        var7.method1014(110, 0, var8);
        return var8;
    }
}
