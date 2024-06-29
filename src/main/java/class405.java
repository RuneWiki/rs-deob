import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class405 {

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field5554 = new String[200];

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
    public static int field5559 = 50;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field5556 = new String[field5559];

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "[I")
    public static int[] field5550 = new int[field5559];

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "[I")
    public static int[] field5557 = new int[field5559];

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "[I")
    public static int[] field5551 = new int[field5559];

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "[I")
    public static int[] field5553 = new int[field5559];

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "[I")
    public static int[] field5546 = new int[field5559];

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "[I")
    public static int[] field5564 = new int[field5559];

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "[I")
    public static int[] field5566;

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "Lh;")
    public static class434 field5567;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "B")
    public byte field5562;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field5552;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    public int field5561;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "Ljava/lang/String;")
    public String field5555;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "Ljava/lang/String;")
    public String field5558;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "Ljava/lang/String;")
    public String field5560;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "Ljava/lang/String;")
    public String field5565;

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "[[I")
    public static int[][] field5568;

    static {
        new class206("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
        field5566 = new int[13];
        field5567 = new class434(32, -2);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)I", line = 7)
    public static final int method2445(byte arg0) {
        field5547++;
        try {
            if (class222.field2947 == 0) {
                if (class26.field319 > class440.method2583(25267) - 5000L) {
                    return 0;
                }
                class279.field3714 = class251.field3359.method1333(class209.field2832, class135.field1966, 1);
                class367.field5047 = class440.method2583(25267);
                class222.field2947 = 1;
            }
            if (class440.method2583(25267) > (class367.field5047 + 30000L)) {
                return class330.method1837(0, 1000);
            }
            if (class222.field2947 == 1) {
                if (class279.field3714.field6534 == 2) {
                    return class330.method1837(0, 1001);
                }
                if (class279.field3714.field6534 != 1) {
                    return -1;
                }
                class280.field3743 = new class375((Socket) class279.field3714.field6529, class251.field3359);
                class279.field3714 = null;
                int var1 = 0;
                class203.field2751.field456 = 0;
                if (class341.field4562) {
                    var1 = class190.field2582;
                }
                class203.field2751.method228(class419.field5697.field1076, 32);
                class203.field2751.method199((byte) -117, var1);
                class280.field3743.method2308(false, 0, class203.field2751.field456, class203.field2751.field472);
                if (class259.field3433 != null) {
                    class259.field3433.method851(8);
                }
                if (class98.field1434 != null) {
                    class98.field1434.method851(8);
                }
                int var2 = class280.field3743.method2311(1);
                if (class259.field3433 != null) {
                    class259.field3433.method851(8);
                }
                if (class98.field1434 != null) {
                    class98.field1434.method851(8);
                }
                if (var2 != 0) {
                    return class330.method1837(0, var2);
                }
                class222.field2947 = 2;
            }
            if (class222.field2947 == 2) {
                if (class280.field3743.method2306(1) < 2) {
                    return -1;
                }
                class433.field5890 = class280.field3743.method2311(1);
                class433.field5890 <<= 0x8;
                class433.field5890 += class280.field3743.method2311(1);
                class346.field4765 = new byte[class433.field5890];
                class488.field6816 = 0;
                class222.field2947 = 3;
            }
            int var3 = -42 % ((arg0 + 58) / 49);
            if (class222.field2947 != 3) {
                return -1;
            }
            int var4 = class280.field3743.method2306(1);
            if (var4 < 1) {
                return -1;
            }
            if (var4 > (class433.field5890 - class488.field6816)) {
                var4 = class433.field5890 - class488.field6816;
            }
            class280.field3743.method2304(class346.field4765, var4, 1, class488.field6816);
            class488.field6816 += var4;
            if (class433.field5890 > class488.field6816) {
                return -1;
            } else if (class279.method1578(125, class346.field4765)) {
                class159.field2195 = new class348[class52.field688];
                int var5 = 0;
                for (int var6 = class385.field5320; var6 <= class124.field1816; var6++) {
                    class348 var7 = class445.method2613(var6, (byte) -77);
                    if (var7 != null) {
                        class159.field2195[var5++] = var7;
                    }
                }
                class483.field6660 = null;
                class142.field2054 = 0;
                class280.field3743.method2310(-95);
                class222.field2947 = 0;
                class413.field5653 = 0;
                class346.field4765 = null;
                class280.field3743 = null;
                class26.field319 = class440.method2583(25267);
                return 0;
            } else {
                return class330.method1837(0, 1002);
            }
        } catch (IOException var8) {
            return class330.method1837(0, 1003);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)I", line = 140)
    public static final int method2446(int arg0, int arg1) {
        field5548++;
        if (arg0 != 14776) {
            method2445((byte) -110);
        }
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 151)
    public static final void method2447(int arg0, String arg1, int arg2) {
        field5563++;
        class106 var3 = class250.method1400(3, arg2 + 105, arg0);
        var3.method658(0);
        if (arg2 != -1) {
            method2448(true, 102, -4, (String) null);
        }
        var3.field1583 = arg1;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZIILjava/lang/String;)I", line = 177)
    public static final int method2448(boolean arg0, int arg1, int arg2, String arg3) {
        field5549++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg3.length();
        if (arg2 > -89) {
            return -6;
        }
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg3.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg0) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (arg1 <= var11) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg1 * var6 + var11;
            if ((var10 / arg1) != var6) {
                throw new NumberFormatException();
            }
            var5 = true;
            var6 = var10;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)V", line = 260)
    public static void method2449(byte arg0) {
        field5546 = null;
        field5554 = null;
        if (arg0 != -60) {
            field5568 = null;
        }
        field5551 = null;
        field5550 = null;
        field5567 = null;
        field5564 = null;
        field5553 = null;
        field5556 = null;
        field5568 = null;
        field5566 = null;
        field5557 = null;
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(B)V", line = 280)
    public static final void method2450(byte arg0) {
        int var1 = 51 % ((-arg0 - 63) / 35);
        field5552++;
        if (class18.field256 == 5) {
            class18.field256 = 6;
        }
    }
}
