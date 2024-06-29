import java.awt.Component;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class444 extends class396 {

    @OriginalMember(owner = "client!pn", name = "v", descriptor = "I")
    public int field6483 = 0;

    @OriginalMember(owner = "client!pn", name = "u", descriptor = "I")
    public static int field6482 = 0;

    @OriginalMember(owner = "client!pn", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field6480 = new String[100];

    @OriginalMember(owner = "client!pn", name = "z", descriptor = "Lfi;")
    public static class331 field6487 = new class331(500);

    @OriginalMember(owner = "client!pn", name = "C", descriptor = "I")
    public static int field6490 = 0;

    @OriginalMember(owner = "client!pn", name = "F", descriptor = "I")
    public static int field6493 = 0;

    @OriginalMember(owner = "client!pn", name = "H", descriptor = "[I")
    public static int[] field6495 = new int[13];

    @OriginalMember(owner = "client!pn", name = "r", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!pn", name = "t", descriptor = "I")
    public static int field6481;

    @OriginalMember(owner = "client!pn", name = "w", descriptor = "I")
    public static int field6484;

    @OriginalMember(owner = "client!pn", name = "x", descriptor = "I")
    public static int field6485;

    @OriginalMember(owner = "client!pn", name = "y", descriptor = "I")
    public static int field6486;

    @OriginalMember(owner = "client!pn", name = "B", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!pn", name = "D", descriptor = "I")
    public static int field6491;

    @OriginalMember(owner = "client!pn", name = "A", descriptor = "Lis;")
    public static class291 field6488;

    @OriginalMember(owner = "client!pn", name = "E", descriptor = "Lra;")
    public static class57 field6492;

    @OriginalMember(owner = "client!pn", name = "G", descriptor = "Lra;")
    public static class57 field6494;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "(I)V")
    public static void method2748(int arg0) {
        field6495 = null;
        field6494 = null;
        field6480 = null;
        field6488 = null;
        field6487 = null;
        field6492 = null;
        if (arg0 < 85) {
            field6493 = -62;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IILbk;)V")
    private final void method2749(int arg0, int arg1, class211 arg2) {
        if (arg1 >= 72) {
            if (arg0 == 2) {
                this.field6483 = arg2.method1355(32136);
            }
            field6479++;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lbk;I)V")
    public final void method2750(class211 arg0, int arg1) {
        field6484++;
        while (true) {
            int var3 = arg0.method1342((byte) -128);
            if (var3 == 0) {
                int var4 = -11 % ((26 - arg1) / 47);
                return;
            }
            this.method2749(var3, 85, arg0);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lam;BILjava/awt/Component;I)Lis;")
    public static final class291 method2751(class378 arg0, byte arg1, int arg2, Component arg3, int arg4) {
        field6481++;
        if (class233.field3158 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                int var5 = 88 / ((arg1 - 69) / 52);
                class291 var6 = (class291) Class.forName("aq").getDeclaredConstructor().newInstance();
                var6.field4193 = arg2;
                var6.field4183 = new int[(class134.field1882 ? 2 : 1) * 256];
                var6.method489(arg3);
                var6.field4199 = (arg2 & 0xFFFFFC00) + 1024;
                if (var6.field4199 > 16384) {
                    var6.field4199 = 16384;
                }
                var6.method487(var6.field4199);
                if (class118.field1409 > 0 && class403.field5882 == null) {
                    class403.field5882 = new class192();
                    class403.field5882.field2621 = arg0;
                    arg0.method2386(class118.field1409, class403.field5882, (byte) -55);
                }
                if (class403.field5882 != null) {
                    if (class403.field5882.field2619[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class403.field5882.field2619[arg4] = var6;
                }
                return var6;
            } catch (Throwable var9) {
                try {
                    class316 var7 = new class316(arg0, arg4);
                    var7.field4193 = arg2;
                    var7.field4183 = new int[(class134.field1882 ? 2 : 1) * 256];
                    var7.method489(arg3);
                    var7.field4199 = 16384;
                    var7.method487(var7.field4199);
                    if (class118.field1409 > 0 && class403.field5882 == null) {
                        class403.field5882 = new class192();
                        class403.field5882.field2621 = arg0;
                        arg0.method2386(class118.field1409, class403.field5882, (byte) -55);
                    }
                    if (class403.field5882 != null) {
                        if (class403.field5882.field2619[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class403.field5882.field2619[arg4] = var7;
                    }
                    return var7;
                } catch (Throwable var8) {
                    return new class291();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lra;Lra;I)V")
    public static final void method2752(class57 arg0, class57 arg1, int arg2) {
        field6489++;
        if (arg2 != 256) {
            field6490 = 85;
        }
        class59.field712 = arg1;
        class362.field5276 = arg0;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
    public static final String method2753(Throwable arg0, byte arg1) throws IOException {
        field6486++;
        String var2;
        if ((arg0 instanceof class77)) {
            class77 var3 = (class77) arg0;
            arg0 = var3.field864;
            var2 = var3.field862 + " | ";
        } else {
            var2 = "";
        }
        if (arg1 != 116) {
            method2752((class57) null, (class57) null, -107);
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
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

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)I")
    public static final int method2754(int arg0, int arg1) {
        if (arg1 == -1) {
            field6485++;
            return arg0 == 16711935 ? -1 : class6.method59(arg0, -27643);
        } else {
            return -3;
        }
    }
}
