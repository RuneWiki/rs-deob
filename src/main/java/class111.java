import java.awt.Component;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public abstract class class111 {

    @OriginalMember(owner = "client!p", name = "g", descriptor = "[J")
    public static long[] field1577 = new long[100];

    @OriginalMember(owner = "client!p", name = "f", descriptor = "Lak;")
    public static class20 field1576 = new class20(500);

    @OriginalMember(owner = "client!p", name = "h", descriptor = "Lok;")
    public static class41 field1578 = class137.method956("Untersuchen", 45);

    @OriginalMember(owner = "client!p", name = "k", descriptor = "Lok;")
    public static class41 field1581 = class137.method956(")1", 45);

    @OriginalMember(owner = "client!p", name = "i", descriptor = "Z")
    public static boolean field1579 = false;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field1582 = 2;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)V", line = 6)
    public static final void method750(int arg0, int arg1, int arg2, int arg3) {
        field1574++;
        class41 var4 = class187.method1346(new class41[] { class149.field2325, class1.method4(arg0, (byte) 80), class203.field3284, class1.method4(arg2 >> 6, (byte) 123), class203.field3284, class1.method4(arg1 >> 6, (byte) 94), class203.field3284, class1.method4(arg2 & 0x3F, (byte) 69), class203.field3284, class1.method4(arg1 & 0x3F, (byte) 125) }, arg3 + arg3);
        var4.method287((byte) -113);
        class282.method1988(var4, arg3 - 26612);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ltc;I)V", line = 31)
    public static final void method751(class268 arg0, int arg1) {
        field1572++;
        if (arg0.field4282 == 0) {
            return;
        }
        if (arg0.field4335 != -1 && arg0.field4335 < 32768) {
            class50 var2 = class216.field3471[arg0.field4335];
            if (var2 != null) {
                int var3 = arg0.field4280 - var2.field4280;
                int var4 = arg0.field4311 - var2.field4311;
                if (var3 != 0 || var4 != 0) {
                    arg0.field4332 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field4335 >= 32768) {
            int var5 = arg0.field4335 - 32768;
            if (class204.field3300 == var5) {
                var5 = 2047;
            }
            class245 var6 = class246.field3955[var5];
            if (var6 != null) {
                int var7 = arg0.field4280 - var6.field4280;
                int var8 = arg0.field4311 - var6.field4311;
                if (var7 != 0 || var8 != 0) {
                    arg0.field4332 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field4327 != 0 || arg0.field4319 != 0) && (arg0.field4322 == 0 || arg0.field4302 > 0)) {
            int var9 = arg0.field4280 + arg0.method1753((byte) -15) * 64 - ((-class88.field1300 + arg0.field4327 - class88.field1300) * 64) - 64;
            int var10 = arg0.field4311 - (((-class55.field809 + arg0.field4319 - class55.field809) * 64) + 64 - (arg0.method1753((byte) -15) * 64));
            if (var9 != 0 || var10 != 0) {
                arg0.field4332 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg0.field4319 = 0;
            arg0.field4327 = 0;
        }
        int var11 = arg0.field4332 - arg0.field4297 & 0x7FF;
        if (var11 == 0) {
            arg0.field4336 = 0;
        } else {
            arg0.field4336++;
            if (var11 <= 1024) {
                arg0.field4297 += arg0.field4282;
                boolean var12 = true;
                if (var11 < arg0.field4282 || var11 > 2048 - arg0.field4282) {
                    var12 = false;
                    arg0.field4297 = arg0.field4332;
                }
                if (arg0.field4333 == arg0.field4321 && (arg0.field4336 > 25 || var12)) {
                    if (arg0.field4313 == -1) {
                        arg0.field4333 = arg0.field4298;
                    } else {
                        arg0.field4333 = arg0.field4313;
                    }
                }
            } else {
                boolean var13 = true;
                arg0.field4297 -= arg0.field4282;
                if (var11 < arg0.field4282 || 2048 - arg0.field4282 < var11) {
                    var13 = false;
                    arg0.field4297 = arg0.field4332;
                }
                if (arg0.field4333 == arg0.field4321 && (arg0.field4336 > 25 || var13)) {
                    if (arg0.field4339 == -1) {
                        arg0.field4333 = arg0.field4298;
                    } else {
                        arg0.field4333 = arg0.field4339;
                    }
                }
            }
            arg0.field4297 &= 0x7FF;
        }
        if (arg1 > -72) {
            field1579 = true;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V", line = 160)
    public static final void method752(int arg0) {
        if (arg0 < -78) {
            class104.field1483++;
            field1571++;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 173)
    public static final String method753(Throwable arg0, int arg1) throws IOException {
        field1573++;
        String var3;
        if (arg0 instanceof class173) {
            class173 var2 = (class173) arg0;
            var3 = var2.field2811 + " | ";
            arg0 = var2.field2808;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        if (arg1 != -1) {
            field1577 = (long[]) null;
        }
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

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V", line = 242)
    public static void method754(int arg0) {
        field1578 = null;
        field1576 = null;
        field1577 = null;
        if (arg0 > 117) {
            field1581 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)Lm;", line = 255)
    public static final class46 method755(boolean arg0) {
        if (arg0) {
            return (class46) null;
        }
        field1575++;
        class46 var1 = (class46) class152.field2394.method2057(-86);
        if (var1 != null) {
            var1.method418(6971);
            var1.method11(!arg0);
            return var1;
        }
        class46 var2;
        do {
            var2 = (class46) class306.field5132.method2057(121);
            if (var2 == null) {
                return null;
            }
            if (var2.method338((byte) -100) > class247.method1762(19166)) {
                return null;
            }
            var2.method418(6971);
            var2.method11(true);
        } while ((Long.MIN_VALUE & var2.field41) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method263(Component arg0, int arg1);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)I")
    public abstract int method264(int arg0);

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method265(Component arg0, int arg1);
}
