import java.awt.Canvas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class42 implements Runnable {

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field1207 = 0;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "Lrd;")
    private static class117 field1204 = class95.method812("Enter name of player to add to list", (byte) 8);

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "Lrd;")
    public static class117 field1209 = class95.method812("Wen m-Ochten Sie von der Liste entfernen?", (byte) 8);

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "Lrd;")
    public static class117 field1212 = class95.method812("backleft1", (byte) 8);

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "Lrd;")
    private static class117 field1205 = class95.method812("Login limit exceeded)3", (byte) 8);

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "[I")
    public static int[] field1208 = new int[25];

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "Lrd;")
    public static class117 field1210 = class95.method812(" steht bereits auf Ihrer Ignorieren)2Liste(Q", (byte) 8);

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field1202 = 0;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "Lrd;")
    public static class117 field1214 = field1205;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "Lrd;")
    public static class117 field1213 = field1204;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "Lga;")
    public static class44 field1206;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1216;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public static void method475(int arg0) {
        int var1 = 90 / ((arg0 - 3) / 33);
        field1212 = null;
        field1209 = null;
        field1213 = null;
        field1204 = null;
        field1208 = null;
        field1210 = null;
        field1216 = null;
        field1214 = null;
        field1205 = null;
        field1206 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method476(Throwable arg0, int arg1) throws IOException {
        String var3;
        if (arg0 instanceof class111) {
            class111 var2 = (class111) arg0;
            var3 = var2.field2789 + " | ";
            arg0 = var2.field2779;
        } else {
            var3 = "";
        }
        field1211++;
        if (arg1 < 66) {
            field1204 = null;
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
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

    @OriginalMember(owner = "client!ff", name = "run", descriptor = "()V")
    public final void run() {
        field1215++;
        try {
            while (true) {
                class1 var1 = class132.field3168;
                class27 var2;
                synchronized (class132.field3168) {
                    var2 = (class27) class132.field3168.method3(false);
                }
                if (var2 == null) {
                    class60.method611(100L, true);
                    Object var3 = class118.field2904;
                    synchronized (class118.field2904) {
                        if (class27.field810 <= 1) {
                            class27.field810 = 0;
                            class118.field2904.notifyAll();
                            return;
                        }
                        class27.field810--;
                    }
                } else {
                    if (var2.field804 == 0) {
                        var2.field791.method800(var2.field792.length, var2.field792, (int) var2.field2048, (byte) 108);
                        class1 var5 = class132.field3168;
                        synchronized (class132.field3168) {
                            var2.method691(0);
                        }
                    } else if (var2.field804 == 1) {
                        var2.field792 = var2.field791.method799((byte) -123, (int) var2.field2048);
                        class1 var4 = class132.field3168;
                        synchronized (class132.field3168) {
                            class132.field3156.method10(var2, (byte) 127);
                        }
                    }
                    Object var6 = class118.field2904;
                    synchronized (class118.field2904) {
                        if (class27.field810 <= 1) {
                            class27.field810 = 0;
                            class118.field2904.notifyAll();
                            return;
                        }
                        class27.field810 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class109.method897(-8638, var17, null);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lrd;I)V")
    public static final void method477(class117 arg0, int arg1) {
        field1217++;
        if (arg0 == null || arg0.method954(arg1 - 33) == 0) {
            class111.field2777 = 0;
            return;
        }
        class117 var2 = arg0;
        class117[] var3 = new class117[100];
        int var4 = 0;
        while (true) {
            int var5 = var2.method951(34, 32);
            if (var5 == -1) {
                class117 var6 = var2.method976(arg1 ^ 0x6C);
                if (var6.method954(arg1 - 90) > 0) {
                    var3[var4++] = var6.method972(76);
                }
                class111.field2777 = 0;
                label47: for (int var7 = arg1; var7 < class65.field1840; var7++) {
                    class49 var8 = class108.method887(arg1 - 1, var7);
                    if (var8.field1413 == -1 && var8.field1414 != null) {
                        class117 var9 = var8.field1414.method972(arg1 - 64);
                        for (int var10 = 0; var10 < var4; var10++) {
                            if (var9.method948((byte) 101, var3[var10]) == -1) {
                                continue label47;
                            }
                        }
                        class38.field1101[class111.field2777] = var9;
                        class94.field2367[class111.field2777] = var7;
                        class111.field2777++;
                        if (class111.field2777 >= class38.field1101.length) {
                            return;
                        }
                    }
                }
                return;
            }
            class117 var11 = var2.method963(var5, 0, (byte) -127).method976(68);
            if (var11.method954(arg1 ^ 0xFFFFFF95) > 0) {
                var3[var4++] = var11.method972(80);
            }
            var2 = var2.method949(var5 + 1, 0);
        }
    }
}
