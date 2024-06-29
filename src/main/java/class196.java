import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class196 implements class12 {

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field3402 = 100;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "Lqe;")
    public static class168 field3398 = class66.method448("gelb:", 47);

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "Lqe;")
    public static class168 field3399 = class66.method448("scape main", 61);

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "Loe;")
    public static class256 field3403;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public static void method1261(int arg0) {
        field3399 = null;
        field3403 = null;
        if (arg0 == 11677) {
            field3398 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(JBI[I)Lqe;")
    public final class168 method40(long arg0, byte arg1, int arg2, int[] arg3) {
        field3406++;
        if (arg2 == 0) {
            class194 var6 = class171.method1133(arg3[0], (byte) -31);
            return var6.method1254((int) arg0, (byte) 114);
        } else if (arg1 > -122) {
            return null;
        } else if (arg2 == 1 || arg2 == 10) {
            class242 var7 = class151.method1005(520, (int) arg0);
            return var7.field4167;
        } else if (arg2 == 6 || arg2 == 7) {
            return class171.method1133(arg3[0], (byte) 109).method1254((int) arg0, (byte) 114);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
    public static final void method1262(int arg0) {
        field3405++;
        if (class239.field4099.toLowerCase().indexOf("microsoft") == -1) {
            class34.field426[93] = 43;
            if (class239.field4096 == null) {
                class34.field426[222] = 59;
                class34.field426[192] = 58;
            } else {
                class34.field426[192] = 28;
                class34.field426[222] = 58;
                class34.field426[520] = 59;
            }
            class34.field426[91] = 42;
            class34.field426[47] = 73;
            class34.field426[44] = 71;
            class34.field426[59] = 57;
            class34.field426[61] = 27;
            class34.field426[46] = 72;
            class34.field426[45] = 26;
            class34.field426[92] = 74;
        } else {
            class34.field426[220] = 74;
            class34.field426[223] = 28;
            class34.field426[187] = 27;
            class34.field426[219] = 42;
            class34.field426[221] = 43;
            class34.field426[189] = 26;
            class34.field426[191] = 73;
            class34.field426[188] = 71;
            class34.field426[222] = 59;
            class34.field426[186] = 57;
            class34.field426[190] = 72;
            class34.field426[192] = 58;
        }
        if (arg0 >= -11) {
            method1261(-105);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILgj;ILnh;)V")
    public static final void method1263(int arg0, class239 arg1, int arg2, class112 arg3) {
        field3404++;
        class143 var4 = new class143();
        var4.field2511 = arg3.method758(true);
        var4.field2510 = arg3.method769((byte) -86);
        var4.field2508 = new int[var4.field2511];
        if (arg2 > -11) {
            return;
        }
        var4.field2519 = new int[var4.field2511];
        var4.field2518 = new int[var4.field2511];
        var4.field2507 = new class5[var4.field2511];
        var4.field2523 = new class5[var4.field2511];
        var4.field2512 = new byte[var4.field2511][][];
        for (int var5 = 0; var5 < var4.field2511; var5++) {
            try {
                int var6 = arg3.method758(true);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg3.method751((byte) -112).method1081(-7));
                    String var18 = new String(arg3.method751((byte) -94).method1081(24));
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg3.method769((byte) -86);
                    }
                    var4.field2508[var5] = var6;
                    var4.field2518[var5] = var19;
                    var4.field2523[var5] = arg1.method1554((byte) -124, var18, class130.method882((byte) 16, var17));
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg3.method751((byte) -100).method1081(-104));
                    String var8 = new String(arg3.method751((byte) -115).method1081(-98));
                    int var9 = arg3.method758(true);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg3.method751((byte) -92).method1081(117));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg3.method769((byte) -86);
                            var12[var13] = new byte[var14];
                            arg3.method754(0, -4, var14, var12[var13]);
                        }
                    }
                    var4.field2508[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class130.method882((byte) 16, var10[var16]);
                    }
                    var4.field2507[var5] = arg1.method1565(var15, var8, true, class130.method882((byte) 16, var7));
                    var4.field2512[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field2519[var5] = -1;
            } catch (SecurityException var21) {
                var4.field2519[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field2519[var5] = -3;
            } catch (Exception var23) {
                var4.field2519[var5] = -4;
            } catch (Throwable var24) {
                var4.field2519[var5] = -5;
            }
        }
        class74.field1124.method311((byte) 16, var4);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method1264(int arg0, Throwable arg1) throws IOException {
        field3400++;
        String var2;
        if (arg1 instanceof class7) {
            class7 var3 = (class7) arg1;
            var2 = var3.field81 + " | ";
            arg1 = var3.field82;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        if (arg0 != -22715) {
            field3402 = 115;
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
}
