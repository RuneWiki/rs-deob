import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class106 {

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public int field2576 = -1;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field2574 = 0;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "[J")
    public static long[] field2573 = new long[32];

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static volatile int field2575 = 0;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field2572 = 0;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "[Lw;")
    public static class135[] field2586 = new class135[256];

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "Lgd;")
    private static class40 field2580 = class14.method90(false, "Create a free account");

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "Lgd;")
    public static class40 field2587 = field2580;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "Lgd;")
    public static class40 field2589 = class14.method90(false, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
    public static int field2588 = 50;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "Lgd;")
    private static class40 field2581 = class14.method90(false, "Offline");

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "Lgd;")
    public static class40 field2585 = field2581;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "Lgd;")
    private static class40 field2579 = class14.method90(false, "Add ignore");

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "Lgd;")
    public static class40 field2577 = field2579;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "Lgd;")
    public static class40 field2592 = class14.method90(false, "k");

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "Lre;")
    public class107 field2583;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "Lu;")
    public static class123 field2593;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "Lw;")
    public static class135 field2578;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "[I")
    public static int[] field2582;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "[I")
    public int[] field2590;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "[Lgd;")
    public class40[] field2596;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;", line = 6)
    public static final String method821(byte arg0, Throwable arg1) throws IOException {
        String var3;
        if (arg1 instanceof class136) {
            class136 var2 = (class136) arg1;
            var3 = var2.field3322 + " | ";
            arg1 = var2.field3318;
        } else {
            var3 = "";
        }
        if (arg0 != -22) {
            field2579 = null;
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        field2595++;
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

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZI)V", line = 88)
    public static final void method822(boolean arg0, int arg1) {
        field2584++;
        if (class115.field2769 == arg1) {
            return;
        }
        if (class115.field2769 == 0) {
            class8.method46(-114);
        }
        if (arg1 == 20 || arg1 == 40) {
            class64.field1551 = 0;
            class9.field241 = 0;
            class30.field752 = 0;
        }
        if (arg1 != 20 && arg1 != 40 && class40.field1000 != null) {
            class40.field1000.method1079(arg0);
            class40.field1000 = null;
        }
        if (class115.field2769 == 25 || class115.field2769 == 40) {
            class113.method880(-28475);
            class27.method162();
        }
        if (class115.field2769 == 25) {
            class34.field869 = 1;
            class13.field346 = 0;
            class131.field3184 = 1;
            class103.field2473 = 0;
            class11.field273 = 0;
        }
        if (arg1 == 0 || arg1 == 35) {
            class94.method631(-1);
            class136.method1074(125);
            if (class94.field2169 == null) {
                class94.field2169 = class136.method1072(120, 765, class30.field761, 503);
            }
        }
        if (arg1 == 5 || arg1 == 10 || arg1 == 20) {
            class94.field2169 = null;
            class94.method631(-1);
            class137.method1080(class103.field2494, class30.field761, 0, field2578);
        }
        if (arg1 == 25 || arg1 == 30 || arg1 == 40) {
            class94.field2169 = null;
            class136.method1074(118);
            class130.method1027(class30.field761, (byte) 84, field2578);
        }
        class64.field1571 = arg0;
        class115.field2769 = arg1;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 190)
    public static void method823(int arg0) {
        field2589 = null;
        field2573 = null;
        field2592 = null;
        field2581 = null;
        if (arg0 != 0) {
            return;
        }
        field2578 = null;
        field2593 = null;
        field2580 = null;
        field2585 = null;
        field2582 = null;
        field2579 = null;
        field2587 = null;
        field2577 = null;
        field2586 = null;
    }
}
