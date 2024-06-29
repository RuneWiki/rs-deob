import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class47 {

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "Ljava/lang/String;")
    public static String field587 = "shake:";

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public int field574;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public int field576;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public int field578;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public int field581;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public int field582;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public int field583;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public int field584;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "Lwh;")
    public static class137 field580;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "[B")
    public byte[] field573;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "[B")
    public byte[] field586;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "[I")
    public static int[] field577;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "[[I")
    public static int[][] field589;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIIII)V", line = 6)
    public static final void method299(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field579++;
        if (arg6 >= 1 && arg4 >= 1 && arg6 <= 102 && arg4 <= 102) {
            if (!class154.method1113(arg7 - 107) && (class240.field3406[0][arg6][arg4] & 0x2) == 0) {
                int var8 = arg5;
                if ((class240.field3406[arg5][arg6][arg4] & 0x8) != 0) {
                    var8 = 0;
                }
                if (class270.field4028 != var8) {
                    return;
                }
            }
            int var9 = arg5;
            if (arg5 < 3 && (class240.field3406[1][arg6][arg4] & 0x2) == 2) {
                var9 = arg5 + 1;
            }
            class169.method1190(1, arg1, arg6, class312.field4714[arg5], arg5, var9, arg4);
            if (arg3 >= 0) {
                boolean var10 = class183.field2517;
                class183.field2517 = true;
                class108.method794(arg2, arg5, class312.field4714[arg5], arg0, false, var9, false, arg3, arg4, arg6, 0);
                class183.field2517 = var10;
            }
        }
        if (arg7 != 0) {
            field580 = (class137) null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 54)
    public static final String method300(Throwable arg0, int arg1) throws IOException {
        field585++;
        String var3;
        if (arg0 instanceof class74) {
            class74 var2 = (class74) arg0;
            arg0 = var2.field1017;
            var3 = var2.field1026 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        if (arg1 >= -120) {
            field589 = (int[][]) ((int[][]) null);
        }
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var11 = var9.indexOf(40);
            int var12 = var9.indexOf(41, var11 + 1);
            String var13;
            if (var11 == -1) {
                var13 = var9;
            } else {
                var13 = var9.substring(0, var11);
            }
            String var14 = var13.trim();
            String var15 = var14.substring(var14.lastIndexOf(32) + 1);
            String var16 = var15.substring(var15.lastIndexOf(9) + 1);
            String var17 = var3 + var16;
            if (var11 != -1 && var12 != -1) {
                int var18 = var9.indexOf(".java:", var11);
                if (var18 >= 0) {
                    var17 = var17 + var9.substring(var18 + 5, var12);
                }
            }
            var3 = var17 + ' ';
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([I[IBLfj;[I)V", line = 127)
    public static final void method301(int[] arg0, int[] arg1, byte arg2, class241 arg3, int[] arg4) {
        field588++;
        for (int var5 = 0; var5 < arg0.length; var5++) {
            int var6 = arg0[var5];
            int var7 = arg4[var5];
            int var8 = arg1[var5];
            for (int var9 = 0; var7 != 0 && arg3.field3674.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field3674[var9] = null;
                    } else {
                        class125 var10 = class52.method361(true, var6);
                        class108 var11 = arg3.field3674[var9];
                        int var12 = var10.field1681;
                        if (var11 != null) {
                            if (var11.field1465 == var6) {
                                if (var12 == 0) {
                                    var11 = arg3.field3674[var9] = null;
                                } else if (var12 == 1) {
                                    var11.field1457 = 0;
                                    var11.field1454 = 1;
                                    var11.field1459 = var8;
                                    var11.field1458 = 0;
                                    var11.field1456 = 0;
                                    class241.method1651(0, class173.field2356 == arg3, arg3.field3745, var10, arg3.field3679, -43);
                                } else if (var12 == 2) {
                                    var11.field1458 = 0;
                                }
                            } else if (var10.field1684 >= class52.method361(true, var11.field1465).field1684) {
                                var11 = arg3.field3674[var9] = null;
                            }
                        }
                        if (var11 == null) {
                            class108 var13 = arg3.field3674[var9] = new class108();
                            var13.field1465 = var6;
                            var13.field1454 = 1;
                            var13.field1457 = 0;
                            var13.field1459 = var8;
                            var13.field1458 = 0;
                            var13.field1456 = 0;
                            class241.method1651(0, class173.field2356 == arg3, arg3.field3745, var10, arg3.field3679, 100);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        int var14 = -95 / ((arg2 + 21) / 56);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V", line = 225)
    public static void method302(byte arg0) {
        field580 = null;
        if (arg0 >= -38) {
            field589 = (int[][]) ((int[][]) null);
        }
        field577 = null;
        field587 = null;
        field589 = (int[][]) null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)I", line = 242)
    public static int method303(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
