import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class5 extends class253 {

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "Ljd;")
    public static class85 field49 = class221.method1499(")1", (byte) -103);

    @OriginalMember(owner = "client!ti", name = "E", descriptor = "[I")
    public static int[] field60 = new int[2];

    @OriginalMember(owner = "client!ti", name = "F", descriptor = "[I")
    public static int[] field61 = new int[1000];

    @OriginalMember(owner = "client!ti", name = "J", descriptor = "Ljd;")
    public static class85 field65 = class221.method1499("Standort", (byte) 98);

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    public int field48;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
    public int field51;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "I")
    public int field54;

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
    public int field56;

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!ti", name = "G", descriptor = "I")
    public int field62;

    @OriginalMember(owner = "client!ti", name = "H", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!ti", name = "I", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "Ljb;")
    public class255 field58;

    @OriginalMember(owner = "client!ti", name = "D", descriptor = "Ljb;")
    public class255 field59;

    @OriginalMember(owner = "client!ti", name = "K", descriptor = "Ljd;")
    public class85 field66;

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "Z")
    public boolean field53;

    @OriginalMember(owner = "client!ti", name = "L", descriptor = "[Ljava/lang/Object;")
    public Object[] field67;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(I)V")
    public static void method18(int arg0) {
        field49 = null;
        if (arg0 != 20) {
            field63 = 106;
        }
        field61 = null;
        field65 = null;
        field60 = null;
    }

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "(I)V")
    public static final void method19(int arg0) {
        field50++;
        if (class227.field3945 == null) {
            return;
        }
        if (class56.field976 < 10) {
            if (!class272.field4807.method473(true, class227.field3945.field1488) || !class272.field4807.method473(true, class172.method1150(new class85[] { class227.field3945.field1488, class202.field3524 }, ~arg0))) {
                class56.field976 = class1.field10.method453(arg0 ^ 0x47, class227.field3945.field1488) / 10;
                return;
            }
            class210.method1446(-128);
            class56.field976 = 10;
        }
        if (class56.field976 == 10) {
            class21.field303 = class227.field3945.field1485 >> 6 << 6;
            int var1 = (class22.field308.field1042 >> 7) + class244.field4172 - class21.field303;
            class99.field1779 = 8.0F;
            class11.field165 = 8.0F;
            class100.field1793 = (class227.field3945.field1499 >> 6 << 6) + 64 - class21.field303;
            class196.field3371 = class227.field3945.field1505 >> 6 << 6;
            class79.field1458 = (class227.field3945.field1494 >> 6 << 6) + 64 - class196.field3371;
            int var2 = -class213.field3742 - (-class196.field3371 - class79.field1458) - (class22.field308.field1027 >> 7) - 1;
            int var3 = var2 + ((int) (Math.random() * 10.0D) - 5);
            int var4 = var1 + (int) (Math.random() * 10.0D) - 5;
            if (var4 >= 0 && var4 < class100.field1793 && var3 >= 0 && var3 < class79.field1458) {
                class168.field2901 = var3;
                class6.field75 = var4;
            } else {
                class168.field2901 = class196.field3371 + (class79.field1458 - 1) - class227.field3945.field1492 * 64;
                class6.field75 = class227.field3945.field1489 * 64 - class21.field303;
            }
            class201.method1381(0);
            int var5 = class27.field408 >> 2 << 10;
            int var6 = class79.field1458 >> 6;
            class154.field2666 = new int[class73.field1368 + 1];
            int var7 = class100.field1793 >> 6;
            class35.field545 = new short[var7][var6][];
            class127.field2216 = new byte[var7][var6][];
            class134.field2341 = new byte[var7][var6][];
            class8.field109 = new byte[var7][var6][];
            class239.field4121 = new byte[var7][var6][];
            class70.field1308 = new byte[var7][var6][];
            class193.field3299 = new int[var7][var6][];
            class100.field1794 = new int[var7][var6][];
            int var8 = class2.field21 >> 1;
            class63.method429(var8, -3857, var5);
            class56.field976 = 20;
        } else if (class56.field976 == 20) {
            class199.method1371((byte) 99, new class247(class272.field4807.method481(class35.field532, 17702, class227.field3945.field1488)));
            class56.field976 = 30;
            class162.method1063(true, arg0 ^ 0xFFFFFFCD);
            class251.method1730(arg0 + 1);
        } else if (class56.field976 == 30) {
            class230.method1540(new class247(class272.field4807.method481(class261.field4622, arg0 + 17703, class227.field3945.field1488)), 128);
            class56.field976 = 40;
            class251.method1730(~arg0);
        } else if (class56.field976 == 40) {
            class118.method825(-85, new class247(class272.field4807.method481(class13.field197, arg0 + 17703, class227.field3945.field1488)));
            class56.field976 = 50;
            class251.method1730(~arg0);
        } else if (class56.field976 == 50) {
            class113.method778(new class247(class272.field4807.method481(class130.field2273, 17702, class227.field3945.field1488)), -121);
            class56.field976 = 60;
            class162.method1063(true, 50);
            class251.method1730(0);
        } else if (class56.field976 == 60) {
            class177.field3025 = class70.method486(arg0 - 53, class272.field4807, class172.method1150(new class85[] { class227.field3945.field1488, class202.field3524 }, 0));
            class56.field976 = 70;
            class251.method1730(0);
        } else if (class56.field976 == 70) {
            class261.field4618 = new class62(11, true, class254.field4389);
            class56.field976 = 73;
            class162.method1063(true, 50);
            class251.method1730(0);
        } else if (class56.field976 == 73) {
            class38.field579 = new class62(12, true, class254.field4389);
            class56.field976 = 76;
            class162.method1063(true, 50);
            class251.method1730(~arg0);
        } else if (class56.field976 == 76) {
            class129.field2262 = new class62(14, true, class254.field4389);
            class56.field976 = 79;
            class162.method1063(true, 50);
            class251.method1730(0);
        } else if (class56.field976 == 79) {
            class113.field1966 = new class62(17, true, class254.field4389);
            class56.field976 = 82;
            class162.method1063(true, 50);
            class251.method1730(arg0 + 1);
        } else if (class56.field976 == 82) {
            class129.field2265 = new class62(19, true, class254.field4389);
            class56.field976 = 85;
            class162.method1063(true, 50);
            class251.method1730(0);
        } else if (class56.field976 == 85) {
            class194.field3311 = new class62(22, true, class254.field4389);
            class56.field976 = 88;
            class162.method1063(true, arg0 + 51);
            class251.method1730(0);
        } else if (class56.field976 == 88) {
            class111.field1947 = new class62(26, true, class254.field4389);
            class56.field976 = 91;
            class162.method1063(true, 50);
            class251.method1730(arg0 + 1);
        } else {
            class253.field4367 = new class62(30, true, class254.field4389);
            class56.field976 = 100;
            class162.method1063(true, 50);
            class251.method1730(0);
            class147.field2496 = -1;
            class150.field2537 = arg0;
            System.gc();
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BZIIZIZI)Lfg;")
    public static final class12 method20(byte arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6, int arg7) {
        class61 var8 = class32.method221(arg0 ^ 0xFFFFD24B, arg3);
        if (arg5 > 1 && var8.field1109 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (var8.field1114[var10] <= arg5 && var8.field1114[var10] != 0) {
                    var9 = var8.field1109[var10];
                }
            }
            if (var9 != -1) {
                var8 = class32.method221(11649, var9);
            }
        }
        field55++;
        class42 var11 = var8.method413((byte) 117);
        if (var11 == null) {
            return null;
        }
        class266 var12 = null;
        if (var8.field1133 != -1) {
            var12 = (class266) method20((byte) -54, true, 0, var8.field1123, false, 10, true, 1);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field1138 != -1) {
            var12 = (class266) method20((byte) -54, false, arg2, var8.field1117, false, arg5, true, arg7);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class179.field3068;
        if (arg0 != -54) {
            method19(83);
        }
        int var14 = class179.field3069;
        int[] var15 = new int[4];
        int var16 = class179.field3066;
        class179.method1224(var15);
        class266 var17 = new class266(36, 32);
        class179.method1227(var17.field4745, 36, 32);
        class173.method1169();
        class173.method1161(16, 16);
        int var18 = var8.field1141;
        if (arg1) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg7 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        class173.field2999 = false;
        int var19 = class173.field2995[var8.field1105] * var18 >> 16;
        int var20 = class173.field2984[var8.field1105] * var18 >> 16;
        var11.method174(0, var8.field1156, var8.field1139, var8.field1105, var8.field1112, var20 + var8.field1100 - (var11.method6() / 2), var8.field1100 + var19);
        if (arg7 >= 1) {
            var17.method1835(1);
            if (arg7 >= 2) {
                var17.method1835(16777215);
            }
            class179.method1227(var17.field4745, 36, 32);
        }
        if (arg2 != 0) {
            var17.method1837(arg2);
        }
        if (var8.field1133 != -1) {
            var12.method56(0, 0);
        } else if (var8.field1138 != -1) {
            class179.method1227(var12.field4745, 36, 32);
            var17.method56(0, 0);
            var17 = var12;
        }
        if (arg4 && (var8.field1158 == 1 || arg5 != 1) && arg5 != -1) {
            class235.field4073.method67(class91.method666(arg5, arg0 - 7844), 0, 9, 16776960, 1);
        }
        class179.method1227(var13, var16, var14);
        class179.method1225(var15);
        class173.method1169();
        class173.field2999 = true;
        return var17;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)Z")
    public static final boolean method21(int arg0, int arg1) {
        if (arg1 <= 22) {
            method21(34, -71);
        }
        field57++;
        return (arg0 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(II)I")
    public static final int method22(int arg0, int arg1) {
        field64++;
        return arg1 == -41 ? arg0 & 0xFF : 25;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
    public static final void method23(byte arg0) {
        field52++;
        class13.field200.method1262(17244);
        class112.field1960.method1262(17244);
        class152.field2585.method1262(17244);
        if (arg0 >= -66) {
            field63 = -15;
        }
    }
}
