import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class401 {

    @OriginalMember(owner = "client!rfa", name = "f", descriptor = "I")
    public int field5741 = 0;

    @OriginalMember(owner = "client!rfa", name = "g", descriptor = "I")
    public int field5742 = 2048;

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "I")
    public int field5737 = 2048;

    @OriginalMember(owner = "client!rfa", name = "k", descriptor = "I")
    public int field5746 = 0;

    @OriginalMember(owner = "client!rfa", name = "j", descriptor = "Lwn;")
    public static class585 field5745 = new class585("", 14);

    @OriginalMember(owner = "client!rfa", name = "l", descriptor = "Liv;")
    public static class25 field5747 = new class25(1);

    @OriginalMember(owner = "client!rfa", name = "q", descriptor = "I")
    public static int field5752 = 1;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!rfa", name = "d", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!rfa", name = "e", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!rfa", name = "h", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!rfa", name = "i", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!rfa", name = "m", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!rfa", name = "n", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!rfa", name = "o", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!rfa", name = "p", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I)V")
    public static final void method2494(int arg0) {
        field5744++;
        int var1 = class209.field2736;
        int[] var2 = class344.field4898;
        if (arg0 != -1) {
            field5745 = null;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            class96 var9 = class251.field3675[var2[var3]];
            if (var9 != null && var9.field7124 > 0) {
                var9.field7124--;
                if (var9.field7124 == 0) {
                    var9.field7162 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class262.field3837; var4++) {
            long var5 = (long) class446.field6192[var4];
            class234 var7 = (class234) class372.field5245.method812(107, var5);
            if (var7 != null) {
                class679 var8 = var7.field3471;
                if (var8.field7124 > 0) {
                    var8.field7124--;
                    if (var8.field7124 == 0) {
                        var8.field7162 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Ldc;B)V")
    public final void method2495(class63 arg0, byte arg1) {
        field5740++;
        while (true) {
            int var3 = arg0.method505((byte) -119);
            if (var3 == 0) {
                if (arg1 < 5) {
                    method2494(-66);
                    return;
                } else {
                    return;
                }
            }
            this.method2497(arg0, var3, -80);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method2496(Throwable arg0, int arg1) throws IOException {
        field5736++;
        String var3;
        if (arg0 instanceof class185) {
            class185 var2 = (class185) arg0;
            arg0 = var2.field2532;
            var3 = var2.field2533 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        if (arg1 != 0) {
            method2498(-14);
        }
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

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Ldc;II)V")
    private final void method2497(class63 arg0, int arg1, int arg2) {
        field5743++;
        int var4 = 94 / ((arg2 - 31) / 40);
        if (arg1 == 1) {
            this.field5746 = arg0.method505((byte) -119);
        } else if (arg1 == 2) {
            this.field5742 = arg0.method482(-772591672);
        } else if (arg1 == 3) {
            this.field5737 = arg0.method482(-772591672);
            return;
        } else if (arg1 == 4) {
            this.field5741 = arg0.method496(-66);
            return;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(I)V")
    public static void method2498(int arg0) {
        field5747 = null;
        if (arg0 < 88) {
            method2500((byte) -10, null);
        }
        field5745 = null;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lpia;II)V")
    public static final void method2499(class57 arg0, int arg1, int arg2) {
        field5738++;
        if (class12.field108 >= 50 || arg0 == null || arg0.field803 == null || arg1 >= arg0.field803.length || arg0.field803[arg1] == null) {
            return;
        }
        if (arg2 != -26802) {
            method2500((byte) -13, null);
        }
        int var3 = arg0.field803[arg1][0];
        int var4 = var3 >> 8;
        int var5 = var3 >> 5 & 0x7;
        if (arg0.field803[arg1].length > 1) {
            int var6 = (int) (Math.random() * (double) arg0.field803[arg1].length);
            if (var6 > 0) {
                var4 = arg0.field803[arg1][var6];
            }
        }
        int var7 = 256;
        if (arg0.field820 != null && arg0.field822 != null) {
            var7 = class35.method188((byte) -117, arg0.field820[arg1], arg0.field822[arg1]);
        }
        if (arg0.field819) {
            class545.method3220(255, var4, var7, false, (byte) 104, 0, var5);
        } else {
            class604.method3439(var4, -397, var7, 255, var5, 0);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(BLdc;)Ltca;")
    public static final class275 method2500(byte arg0, class63 arg1) {
        field5739++;
        class545 var2 = class272.method1831(arg0 - 93, arg1);
        int var3 = arg1.method457(-14532);
        int var4 = arg1.method457(-14532);
        if (arg0 != -30) {
            method2499(null, 9, 65);
        }
        return new class275(var2.field7560, var2.field7553, var2.field7557, var2.field7562, var2.field7561, var2.field7550, var2.field7555, var2.field7549, var2.field7563, var3, var4);
    }
}
