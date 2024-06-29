import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class185 {

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "J")
    public long field3495 = 0L;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field3498 = -1;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "Lgh;")
    public static class68 field3497 = new class68(5000);

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "[I")
    public static int[] field3503 = new int[32];

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "I")
    public static int field3505 = 0;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public int field3486;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public int field3487;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public int field3488;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public int field3489;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public int field3490;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public int field3491;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public int field3492;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public int field3493;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public int field3496;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public int field3499;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
    public int field3504;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "Ltg;")
    public class186 field3501;

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "La;")
    public static class1 field3506;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)Lja;")
    public static final class89 method1200(int arg0, int arg1) {
        field3500++;
        class89 var2 = (class89) class4.field256.method930(86, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class118.field2400.method899((byte) 87, 4, arg0);
        class89 var4 = new class89();
        if (var3 != null) {
            var4.method592(arg0, new class70(var3), true);
        }
        if (arg1 < 93) {
            method1201(122, 71, 51);
        }
        class4.field256.method927(24744, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)V")
    public static final void method1201(int arg0, int arg1, int arg2) {
        class31.field714 = true;
        class30.field657 = arg0;
        class33.field733 = arg1;
        class150.field2971 = arg2;
        class116.field2353 = -1;
        class214.field4190 = -1;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
    public static void method1202(byte arg0) {
        field3497 = null;
        field3506 = null;
        field3503 = null;
        if (arg0 >= -118) {
            method1202((byte) 104);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BLac;)V")
    public static final void method1203(byte arg0, class4 arg1) {
        field3502++;
        if (arg0 != -69) {
            method1201(111, 19, -108);
        }
        if (arg1.field195 == 0) {
            return;
        }
        if (arg1.field204 != -1 && arg1.field204 < 32768) {
            class129 var2 = class107.field2187[arg1.field204];
            if (var2 != null) {
                int var3 = arg1.field246 - var2.field246;
                int var4 = arg1.field208 - var2.field208;
                if (var3 != 0 || var4 != 0) {
                    arg1.field243 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field204 >= 32768) {
            int var5 = arg1.field204 - 32768;
            if (class170.field3313 == var5) {
                var5 = 2047;
            }
            class91 var6 = class172.field3347[var5];
            if (var6 != null) {
                int var7 = arg1.field246 - var6.field246;
                int var8 = arg1.field208 - var6.field208;
                if (var7 != 0 || var8 != 0) {
                    arg1.field243 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field225 != 0 || arg1.field194 != 0) && (arg1.field235 == 0 || arg1.field252 > 0)) {
            int var9 = arg1.field246 - (arg1.field225 - class115.field2343 - class115.field2343) * 64;
            int var10 = arg1.field208 - (arg1.field194 - class210.field4077 - class210.field4077) * 64;
            if (var9 != 0 || var10 != 0) {
                arg1.field243 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field225 = 0;
            arg1.field194 = 0;
        }
        int var11 = arg1.field243 - arg1.field234 & 0x7FF;
        if (var11 == 0) {
            arg1.field259 = 0;
            return;
        }
        arg1.field259++;
        if (var11 <= 1024) {
            arg1.field234 += arg1.field195;
            boolean var12 = true;
            if (var11 < arg1.field195 || var11 > 2048 - arg1.field195) {
                arg1.field234 = arg1.field243;
                var12 = false;
            }
            if (arg1.field224 == arg1.field216 && (arg1.field259 > 25 || var12)) {
                if (arg1.field192 == -1) {
                    arg1.field216 = arg1.field217;
                } else {
                    arg1.field216 = arg1.field192;
                }
            }
        } else {
            arg1.field234 -= arg1.field195;
            boolean var13 = true;
            if (arg1.field195 > var11 || var11 > 2048 - arg1.field195) {
                arg1.field234 = arg1.field243;
                var13 = false;
            }
            if (arg1.field224 == arg1.field216 && (arg1.field259 > 25 || var13)) {
                if (arg1.field201 == -1) {
                    arg1.field216 = arg1.field217;
                } else {
                    arg1.field216 = arg1.field201;
                }
            }
        }
        arg1.field234 &= 0x7FF;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method1204(int arg0, Throwable arg1) throws IOException {
        String var3;
        if (arg1 instanceof class127) {
            class127 var2 = (class127) arg1;
            var3 = var2.field2567 + " | ";
            arg1 = var2.field2572;
        } else {
            var3 = "";
        }
        field3494++;
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        int var6 = -110 % ((arg0 - 41) / 62);
        arg1.printStackTrace(var5);
        var5.close();
        String var7 = var4.toString();
        BufferedReader var8 = new BufferedReader(new StringReader(var7));
        String var9 = var8.readLine();
        while (true) {
            while (true) {
                String var10 = var8.readLine();
                if (var10 == null) {
                    return var3 + "| " + var9;
                }
                int var11 = var10.indexOf(40);
                int var12 = var10.indexOf(41, var11 + 1);
                if (var11 >= 0 && var12 >= 0) {
                    String var13 = var10.substring(var11 + 1, var12);
                    int var14 = var13.indexOf(".java:");
                    if (var14 >= 0) {
                        String var15 = var13.substring(0, var14) + var13.substring(var14 + 5);
                        var3 = var3 + var15 + ' ';
                        continue;
                    }
                    var10 = var10.substring(0, var11);
                }
                String var16 = var10.trim();
                String var17 = var16.substring(var16.lastIndexOf(32) + 1);
                String var18 = var17.substring(var17.lastIndexOf(9) + 1);
                var3 = var3 + var18 + ' ';
            }
        }
    }
}
