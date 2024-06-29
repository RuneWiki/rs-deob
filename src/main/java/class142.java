import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class142 {

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "Ltd;")
    public static class136 field3299 = class145.method1172("<img=1>", 45);

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field3292 = 0;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "Lue;")
    public static class143 field3301 = new class143(64);

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "Lk;")
    public static class69 field3305 = new class69();

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "[Lbb;")
    public static class10[] field3304;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZLjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method1152(boolean arg0, Throwable arg1) throws IOException {
        String var2;
        if (arg1 instanceof class63) {
            class63 var3 = (class63) arg1;
            var2 = var3.field1336 + " | ";
            arg1 = var3.field1345;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        if (!arg0) {
            method1154(81, 59);
        }
        field3296++;
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

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
    public static final void method1153(boolean arg0) {
        if (class133.field3140 != null) {
            class133.field3140.method144(1);
            class133.field3140 = null;
        }
        class5.method32((byte) 127);
        field3293++;
        class146.field3366.method761();
        for (int var1 = 0; var1 < 4; var1++) {
            class4.field83[var1].method616(2);
        }
        System.gc();
        class125.method958(0, 2);
        class110.field2582 = -1;
        class47.field1078 = false;
        class13.method90(false);
        class73.method534((byte) 73, 10);
        if (!arg0) {
            method1158(16L, 14);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)Lsc;")
    public static final class128 method1154(int arg0, int arg1) {
        field3303++;
        class128 var2 = (class128) class35.field814.method1162((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class71.field1486.method669(arg0, 6, -62);
        class128 var4 = new class128();
        var4.field3067 = arg0;
        if (var3 != null) {
            var4.method1046(new class127(var3), -32731);
        }
        var4.method1043(false);
        int var5 = -86 / ((-arg1 - 12) / 48);
        if (var4.field3045) {
            var4.field3033 = false;
            var4.field3026 = 0;
        }
        class35.field814.method1164((long) arg0, var4, (byte) 127);
        return var4;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lh;I)V")
    public static final void method1155(class49 arg0, int arg1) {
        field3294++;
        if (arg1 != -1) {
            field3301 = null;
        }
        if (class51.field1155 != 1) {
            return;
        }
        short var2 = 280;
        if (class146.field3379 >= var2 && var2 + 14 >= class146.field3379 && class8.field142 >= 4 && class8.field142 <= 18) {
            class69.method506(0, 0, (byte) -87);
            return;
        }
        if (class146.field3379 >= var2 + 15 && var2 + 80 >= class146.field3379 && class8.field142 >= 4 && class8.field142 <= 18) {
            class69.method506(1, 0, (byte) -113);
            return;
        }
        short var3 = 390;
        if (var3 <= class146.field3379 && class146.field3379 <= var3 + 14 && class8.field142 >= 4 && class8.field142 <= 18) {
            class69.method506(0, 1, (byte) 106);
            return;
        }
        if (class146.field3379 >= var3 + 15 && var3 + 80 >= class146.field3379 && class8.field142 >= 4 && class8.field142 <= 18) {
            class69.method506(1, 1, (byte) -90);
            return;
        }
        short var4 = 500;
        if (class146.field3379 >= var4 && var4 + 14 >= class146.field3379 && class8.field142 >= 4 && class8.field142 <= 18) {
            class69.method506(0, 2, (byte) -106);
            return;
        }
        if (var4 + 15 <= class146.field3379 && class146.field3379 <= var4 + 80 && class8.field142 >= 4 && class8.field142 <= 18) {
            class69.method506(1, 2, (byte) 97);
            return;
        }
        short var5 = 610;
        if (var5 <= class146.field3379 && class146.field3379 <= var5 + 14 && class8.field142 >= 4 && class8.field142 <= 18) {
            class69.method506(0, 3, (byte) 112);
            return;
        }
        if (var5 + 15 <= class146.field3379 && var5 + 80 >= class146.field3379 && class8.field142 >= 4 && class8.field142 <= 18) {
            class69.method506(1, 3, (byte) -76);
            return;
        }
        if (class146.field3379 >= 708 && class8.field142 >= 4 && class146.field3379 <= 758 && class8.field142 <= 20) {
            class155.field3545 = false;
            class116.field2653.method51(0, 0);
            client.field450.method51(382, 0);
            class62.field1326.method693(382 - class62.field1326.field2170 / 2, 18);
            return;
        }
        if (class19.field381 == -1) {
            return;
        }
        class11 var6 = class11.field189[class19.field381];
        if (var6.field181 == class146.field3378) {
            byte[] var7 = class79.method570(arg1 + 1, new class136[] { var6.field176, class101.field2428 }).method1123(false);
            class43.field982 = new String(var7, 0, var7.length);
            if (class81.field1932 != 0) {
                class136.field3217 = 443;
                class81.field1932 = 0;
                class101.field2423 = 43594;
                class81.field1933 = 43594;
            }
            class155.field3545 = false;
            class44.field1011 = var6.field182;
            class116.field2653.method51(0, 0);
            client.field450.method51(382, 0);
            class62.field1326.method693(382 - class62.field1326.field2170 / 2, 18);
            return;
        }
        class136 var8 = class79.method570(0, new class136[] { class127.field3020, var6.field176, class101.field2428, class37.field857, class3.field54, class19.method140(class65.field1399 ? 1 : 0, -127), class21.field420, class19.method140(class108.field2565, -87), class101.field2417, class19.method140(class118.field2686, arg1 ^ 0x5F) });
        try {
            arg0.getAppletContext().showDocument(var8.method1103((byte) -111), "_self");
            return;
        } catch (Exception var9) {
            return;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIB)I")
    public static final int method1156(int arg0, int arg1, byte arg2) {
        field3298++;
        int var3 = class63.method476(arg0 - 1, arg1 + -1, (byte) -12) + class63.method476(arg0 - 1, arg1 - -1, (byte) -12) + class63.method476(arg0 + 1, arg1 + -1, (byte) -12) + class63.method476(arg0 + 1, arg1 + 1, (byte) -12);
        if (arg2 != 113) {
            field3299 = null;
        }
        int var4 = class63.method476(arg0, arg1 - 1, (byte) -12) + class63.method476(arg0, arg1 + 1, (byte) -12) + class63.method476(arg0 + -1, arg1, (byte) -12) + class63.method476(arg0 + 1, arg1, (byte) -12);
        int var5 = class63.method476(arg0, arg1, (byte) -12);
        return var3 / 16 + var4 / 8 + var5 / 4;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
    public static void method1157(byte arg0) {
        field3305 = null;
        field3299 = null;
        field3301 = null;
        int var1 = -47 / ((62 - arg0) / 46);
        field3304 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(JI)V")
    public static final void method1158(long arg0, int arg1) {
        field3300++;
        if (arg0 == 0L) {
            return;
        }
        int var3 = 0;
        if (arg1 != -20479) {
            field3304 = null;
        }
        while (var3 < class89.field2104) {
            if (class43.field988[var3] == arg0) {
                class89.field2104--;
                class83.field1965++;
                for (int var4 = var3; var4 < class89.field2104; var4++) {
                    class43.field988[var4] = class43.field988[var4 + 1];
                }
                class154.field3522 = class67.field1423;
                class15.field304.method867(171, true);
                class15.field304.method990(arg0, (byte) 127);
                return;
            }
            var3++;
        }
    }
}
