import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class42 {

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "[I")
    public static int[] field930 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "Lvc;")
    public static class137 field922 = class45.method325("Hier klicken)1 um fortzufahren)3)3)3", -46);

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "Lvc;")
    public static class137 field928 = class45.method325("und haben es deaktiviert)3 Benutzen Sie die", -46);

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "Lwe;")
    public static class145 field925;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "Lf;")
    public static class36 field921;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILnb;)V")
    public static final void method296(int arg0, class88 arg1) {
        if (arg0 != 11765) {
            field928 = null;
        }
        class142.field3348 = arg1;
        field929++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
    public static void method297(boolean arg0) {
        field921 = null;
        field922 = null;
        field928 = null;
        if (!arg0) {
            field921 = null;
        }
        field925 = null;
        field930 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public static final void method298(int arg0) {
        class63.method460(114);
        field920++;
        if (class12.field267 == 1) {
            class23.field563[class53.field1185 / 100].method1048(class137.field3188 - 8 - 4, class78.field1741 + -4 - 8);
        }
        if (arg0 != 512) {
            method298(-100);
        }
        if (class12.field267 == 2) {
            class23.field563[class53.field1185 / 100 + 4].method1048(class137.field3188 - 8 - 4, class78.field1741 + -12);
        }
        if (class67.field1388 != -1) {
            class85.method628(class67.field1388, (byte) 120);
            class28.method222(512, 0, 334, 0, -9037, 4, class67.field1388);
        }
        if (class56.field1201 != -1) {
            class85.method628(class56.field1201, (byte) 76);
            class28.method222(512, 0, 334, 0, -9037, 0, class56.field1201);
        }
        class36.method263(arg0 ^ 0x7A951C7);
        if (!class77.field1718) {
            class1.method7((byte) 117);
            class47.method342((byte) -88);
        } else if (class107.field2486 == 0) {
            class106.method773((byte) -105);
        }
        if (class143.field3390 == 1) {
            class33.field699.method1048(472, 296);
        }
        if (class106.field2458) {
            short var1 = 507;
            byte var2 = 20;
            class75.field1695.method1135(class88.method666(-52, new class137[] { class93.field2207, class61.method435(class82.field1839, 73) }), var1, var2, 16776960);
            int var9 = var2 + 15;
            int var3 = 16776960;
            Runtime var4 = Runtime.getRuntime();
            int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
            if (var5 > 32768 && class25.field603) {
                var3 = 16711680;
            }
            if (var5 > 65536 && !class25.field603) {
                var3 = 16711680;
            }
            class75.field1695.method1135(class88.method666(118, new class137[] { class98.field2298, class61.method435(var5, arg0 ^ 0x245), class1.field30 }), var1, var9, var3);
            var9 += 15;
            if (class64.field1354) {
                class75.field1695.method1135(class22.field517, var1, var9, 16711680);
                var9 += 15;
                class64.field1354 = false;
            }
            if (class93.field2192) {
                class75.field1695.method1135(class29.field637, var1, var9, 16711680);
                var9 += 15;
                class93.field2192 = false;
            }
            if (class68.field1413) {
                class75.field1695.method1135(class21.field450, var1, var9, 16711680);
                var9 += 15;
                class68.field1413 = false;
            }
        }
        if (class49.field1107 == 0) {
            return;
        }
        int var6 = class49.field1107 / 50;
        int var7 = var6 / 60;
        int var8 = var6 % 60;
        if (var8 >= 10) {
            class75.field1695.method1131(class88.method666(125, new class137[] { class78.field1742, class61.method435(var7, arg0 - 444), class92.field2182, class61.method435(var8, 94) }), 4, 329, 16776960);
        } else {
            class75.field1695.method1131(class88.method666(119, new class137[] { class78.field1742, class61.method435(var7, 103), class84.field1877, class61.method435(var8, arg0 - 400) }), 4, 329, 16776960);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method299(Throwable arg0, int arg1) throws IOException {
        field923++;
        String var3;
        if (arg0 instanceof class104) {
            class104 var2 = (class104) arg0;
            var3 = var2.field2411 + " | ";
            arg0 = var2.field2420;
        } else {
            var3 = "";
        }
        if (arg1 > -63) {
            field930 = null;
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

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
    public static final void method300(int arg0) {
        field927++;
        if (class139.field3225 != null) {
            class139.field3225.method434(115);
        }
        int var1 = 53 / ((-arg0 - 41) / 49);
    }
}
