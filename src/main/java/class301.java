import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public abstract class class301 {

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "Z")
    public static boolean field3603 = false;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field3602 = 0;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "Z")
    public static boolean field3605 = false;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "[I")
    public static int[] field3604 = new int[32];

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "Lps;")
    public static class105 field3601 = new class105();

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "Lda;")
    public static class67 field3607;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V", line = 7)
    public static void method1755(byte arg0) {
        int var1 = -96 % ((arg0 - 50) / 52);
        field3607 = null;
        field3604 = null;
        field3601 = null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILjava/lang/String;)V", line = 24)
    public static final void method1756(int arg0, String arg1) {
        field3608++;
        class28.field429 = arg1;
        if (class345.field4331 == null) {
            return;
        }
        try {
            String var2 = class345.field4331.getParameter("cookieprefix");
            String var3 = class345.field4331.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class139.method1018(false, class349.method2069(true) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class745.method4172(class345.field4331, "document.cookie=\"" + var5 + "\"", (byte) -35);
            if (arg0 != 16) {
                method1755((byte) 115);
            }
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lha;ILd;)V", line = 62)
    public static final void method1757(class66 arg0, int arg1, class162 arg2) {
        field3606++;
        if (class9.field140 == null) {
            return;
        }
        if (class121.field1557 < 10) {
            if (!class9.field142.method444((byte) -24, class9.field140.field3042)) {
                class121.field1557 = class132.field1645.method435(0, class9.field140.field3042) / 10;
                return;
            }
            class587.method3372(110);
            class121.field1557 = 10;
        }
        if (class121.field1557 == 10) {
            class9.field176 = class9.field140.field3040 >> 6 << 6;
            class9.field178 = class9.field140.field3045 >> 6 << 6;
            class9.field166 = (class9.field140.field3036 >> 6 << 6) + 64 - class9.field176;
            class9.field179 = (class9.field140.field3053 >> 6 << 6) + 64 - class9.field178;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class9.field140.method1545(class632.field8626 + (class300.field3596.field823 >> 9), (class300.field3596.field813 >> 9) + class620.field8435, -102, class300.field3596.field808, var3)) {
                var5 = var3[2] - class9.field178;
                var4 = var3[1] - class9.field176;
            }
            if (!class676.field9282 && var4 >= 0 && class9.field166 > var4 && var5 >= 0 && var5 < class9.field179) {
                int var6 = var4 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var5 + (int) (Math.random() * 10.0D) - 5;
                class62.field850 = var7;
                class580.field7912 = var6;
            } else if (class406.field5343 == -1 || class455.field6413 == -1) {
                class9.field140.method1549((byte) 59, (class9.field140.field3033 & 0xFFFD469) >> 14, class9.field140.field3033 & 0x3FFF, var3);
                class62.field850 = var3[2] - class9.field178;
                class580.field7912 = var3[1] - class9.field176;
            } else {
                class9.field140.method1549((byte) 59, class406.field5343, class455.field6413, var3);
                if (var3 != null) {
                    class62.field850 = var3[2] - class9.field178;
                    class580.field7912 = var3[1] - class9.field176;
                }
                class455.field6413 = -1;
                class406.field5343 = -1;
                class676.field9282 = false;
            }
            if (class9.field140.field3037 == 37) {
                class9.field154 = 3.0F;
                class9.field149 = 3.0F;
            } else if (class9.field140.field3037 == 50) {
                class9.field154 = 4.0F;
                class9.field149 = 4.0F;
            } else if (class9.field140.field3037 == 75) {
                class9.field154 = 6.0F;
                class9.field149 = 6.0F;
            } else if (class9.field140.field3037 == 100) {
                class9.field154 = 8.0F;
                class9.field149 = 8.0F;
            } else if (class9.field140.field3037 == 200) {
                class9.field154 = 16.0F;
                class9.field149 = 16.0F;
            } else {
                class9.field154 = 8.0F;
                class9.field149 = 8.0F;
            }
            class9.field153 = (int) class9.field154 >> 1;
            class9.field157 = class100.method846(class9.field153, (byte) 1);
            class448.method2641(-1);
            class9.method157();
            class476.field6612 = new class450();
            class9.field152 += (int) (Math.random() * 5.0D) - 2;
            if (class9.field152 < -8) {
                class9.field152 = -8;
            }
            if (class9.field152 > 8) {
                class9.field152 = 8;
            }
            class9.field155 += (int) (Math.random() * 5.0D) - 2;
            if (class9.field155 < -16) {
                class9.field155 = -16;
            }
            if (class9.field155 > 16) {
                class9.field155 = 16;
            }
            class9.method162(arg2, class9.field152 >> 2 << 10, class9.field155 >> 1);
            class9.field143.method4139(1024, 256, (byte) 86);
            class9.field141.method1706(119, 256, 256);
            class9.field139.method4187(false, 4096);
            class687.field9368.method4183(64, 256);
            class121.field1557 = 20;
        } else if (class121.field1557 == 20) {
            class571.method3315(true, -25849);
            class9.method146(arg0, class9.field152, class9.field155);
            class121.field1557 = 60;
            class571.method3315(true, -25849);
            class750.method4194(0);
        } else if (class121.field1557 == 60) {
            if (class9.field142.method440(class9.field140.field3042 + "_staticelements", 162)) {
                if (!class9.field142.method444((byte) -24, class9.field140.field3042 + "_staticelements")) {
                    return;
                }
                class9.field150 = class286.method1660(class9.field140.field3042 + "_staticelements", class9.field142, class629.field8601, 0);
            } else {
                class9.field150 = new class146(0);
            }
            class9.method147();
            class121.field1557 = 70;
            class571.method3315(true, -25849);
            class750.method4194(0);
        } else if (class121.field1557 == 70) {
            class535.field7531 = new class143(arg0, 11, true, class109.field1370);
            class121.field1557 = 73;
            class571.method3315(true, -25849);
            class750.method4194(0);
        } else if (class121.field1557 == 73) {
            class356.field4422 = new class143(arg0, 12, true, class109.field1370);
            class121.field1557 = 76;
            class571.method3315(true, -25849);
            class750.method4194(0);
        } else if (class121.field1557 == 76) {
            class389.field5029 = new class143(arg0, 14, true, class109.field1370);
            class121.field1557 = 79;
            class571.method3315(true, -25849);
            class750.method4194(0);
        } else if (arg1 >= 44) {
            if (class121.field1557 == 79) {
                class52.field709 = new class143(arg0, 17, true, class109.field1370);
                class121.field1557 = 82;
                class571.method3315(true, -25849);
                class750.method4194(0);
            } else if (class121.field1557 == 82) {
                class784.field10823 = new class143(arg0, 19, true, class109.field1370);
                class121.field1557 = 85;
                class571.method3315(true, -25849);
                class750.method4194(0);
            } else if (class121.field1557 == 85) {
                class648.field8842 = new class143(arg0, 22, true, class109.field1370);
                class121.field1557 = 88;
                class571.method3315(true, -25849);
                class750.method4194(0);
            } else if (class121.field1557 == 88) {
                class181.field2211 = new class143(arg0, 26, true, class109.field1370);
                class121.field1557 = 91;
                class571.method3315(true, -25849);
                class750.method4194(0);
            } else {
                class554.field7705 = new class143(arg0, 30, true, class109.field1370);
                class121.field1557 = 100;
                class571.method3315(true, -25849);
                class750.method4194(0);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lle;Z)Lle;")
    public abstract class325 method1574(class325 arg0, boolean arg1);
}
