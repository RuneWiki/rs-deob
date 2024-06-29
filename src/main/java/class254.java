import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class254 extends class35 {

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "Z")
    public static boolean field3675 = false;

    @OriginalMember(owner = "client!gk", name = "B", descriptor = "[Z")
    public static boolean[] field3685 = new boolean[100];

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
    public int field3668;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    public int field3674;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "I")
    public int field3676;

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "I")
    public int field3679;

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "I")
    public int field3680;

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "Lmb;")
    public class258 field3678;

    @OriginalMember(owner = "client!gk", name = "A", descriptor = "Lmb;")
    public class258 field3684;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "Ljava/lang/String;")
    public String field3677;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "Z")
    public boolean field3667;

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "[Ljava/lang/Object;")
    public Object[] field3683;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)I", line = 13)
    public static final int method1835(int arg0) {
        field3672++;
        class18 var1 = class180.field2678;
        synchronized (class180.field2678) {
            if (arg0 > -26) {
                field3685 = null;
            }
            return class180.field2678.method114(-26474);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILpe;B)V", line = 28)
    public static final void method1836(int arg0, class390 arg1, byte arg2) {
        field3669++;
        int var3 = -1;
        int var4 = 0;
        int var5 = -92 % ((-arg2 - 7) / 45);
        if (arg1.field5601 > class267.field4002) {
            class276.method1973(arg1, 0);
        } else if (class267.field4002 > arg1.field5667) {
            class240.method1749((byte) -128, arg1, false);
            var3 = class73.field1223;
            var4 = class399.field5870;
        } else {
            class242.method1762(arg1, (byte) -78);
        }
        if (arg1.field6520 < 128 || arg1.field6519 < 128 || arg1.field6520 >= (class183.field2703 * 128 - 128) || arg1.field6519 >= (class66.field1056 - 1) * 128) {
            arg1.field5620 = -1;
            arg1.field5683 = -1;
            arg1.field5667 = 0;
            arg1.field5601 = 0;
            arg1.field6520 = arg1.field5694[0] * 128 + arg1.method1070((byte) -50) * 64;
            arg1.field6519 = arg1.field5696[0] * 128 + arg1.method1070((byte) -50) * 64;
            arg1.method2481(0);
        }
        if (class86.field1394 == arg1 && (arg1.field6520 < 1536 || arg1.field6519 < 1536 || arg1.field6520 >= class183.field2703 * 128 - 1536 || arg1.field6519 >= (class66.field1056 - 12) * 128)) {
            arg1.field5620 = -1;
            arg1.field5683 = -1;
            arg1.field5601 = 0;
            arg1.field5667 = 0;
            arg1.field6520 = arg1.field5694[0] * 128 + arg1.method1070((byte) -50) * 64;
            arg1.field6519 = arg1.field5696[0] * 128 + (arg1.method1070((byte) -50) * 64);
            arg1.method2481(0);
        }
        int var6 = class193.method1487((byte) 86, arg1);
        class91.method770(var4, var3, 0, arg1, var6);
        class387.method2452(arg1, -11877);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZIIII)V", line = 91)
    public static final void method1837(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!arg0) {
            return;
        }
        field3670++;
        if (class242.field3530 == 0 || arg3 == 0 || class361.field5154 >= 50 || arg4 == -1) {
            return;
        }
        class169.field2516[class361.field5154] = arg4;
        class169.field2514[class361.field5154] = arg3;
        class196.field2869[class361.field5154] = arg2;
        class225.field3325[class361.field5154] = null;
        class113.field1815[class361.field5154] = 0;
        class420.field6130[class361.field5154] = arg1;
        class361.field5154++;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V", line = 115)
    public static void method1838(boolean arg0) {
        if (arg0) {
            method1836(-103, (class390) null, (byte) -25);
        }
        field3685 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZZILoq;)V", line = 130)
    public static final void method1839(boolean arg0, boolean arg1, int arg2, class120 arg3) {
        field3681++;
        int var4 = arg3.field1874;
        int var5 = (int) arg3.field499;
        arg3.method251(116);
        if (arg0) {
            class137.method1122(var4, arg2 + 69);
        }
        class331.method2169(var4, (byte) -112);
        class258 var6 = class342.method2207(var5, (byte) 14);
        if (arg2 != -1) {
            return;
        }
        if (var6 != null) {
            class107.method947(true, var6);
        }
        class46.method375(76);
        if (!arg1 && class321.field4642 != -1) {
            class135.method1111((byte) 120, class321.field4642, 1);
        }
        class129 var7 = new class129(class355.field5045);
        for (class120 var8 = (class120) var7.method1090(true); var8 != null; var8 = (class120) var7.method1089(0)) {
            if (!var8.method252(-76)) {
                var8 = (class120) var7.method1090(true);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field1875 == 3) {
                int var9 = (int) var8.field499;
                if ((var9 >>> 16) == var4) {
                    method1839(true, arg1, -1, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(Z)V", line = 191)
    public static final void method1840(boolean arg0) {
        if (!arg0) {
            field3675 = true;
        }
        field3666++;
        class11.field136 = -1;
        class161.field2434 = -1;
        class234.field3392 = 0;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BB)C", line = 210)
    public static final char method1841(byte arg0, byte arg1) {
        field3673++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (arg1 >= -126) {
            method1835(-103);
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class115.field1830[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(I)V", line = 239)
    public static final void method1842(int arg0) {
        field3682++;
        class268.field4020.method2782((byte) -114);
        int var1 = class268.field4020.method2778(1, (byte) -95);
        if (var1 == 0) {
            return;
        }
        int var2 = class268.field4020.method2778(2, (byte) -95);
        if (arg0 == var2) {
            class218.field3229[class176.field2619++] = 2047;
        } else if (var2 == 1) {
            int var3 = class268.field4020.method2778(3, (byte) -95);
            class86.field1394.method2468(8272, var3, 1);
            int var4 = class268.field4020.method2778(1, (byte) -95);
            if (var4 == 1) {
                class218.field3229[class176.field2619++] = 2047;
            }
        } else if (var2 == 2) {
            if (class268.field4020.method2778(1, (byte) -95) == 1) {
                int var5 = class268.field4020.method2778(3, (byte) -95);
                class86.field1394.method2468(8272, var5, 2);
                int var6 = class268.field4020.method2778(3, (byte) -95);
                class86.field1394.method2468(8272, var6, 2);
            } else {
                int var7 = class268.field4020.method2778(3, (byte) -95);
                class86.field1394.method2468(arg0 ^ 0x2050, var7, 0);
            }
            int var8 = class268.field4020.method2778(1, (byte) -95);
            if (var8 == 1) {
                class218.field3229[class176.field2619++] = 2047;
            }
        } else if (var2 == 3) {
            class367.field5213 = class268.field4020.method2778(2, (byte) -95);
            int var9 = class268.field4020.method2778(7, (byte) -95);
            int var10 = class268.field4020.method2778(1, (byte) -95);
            if (var10 == 1) {
                class218.field3229[class176.field2619++] = 2047;
            }
            int var11 = class268.field4020.method2778(1, (byte) -95);
            int var12 = class268.field4020.method2778(7, (byte) -95);
            class86.field1394.method1071(arg0 ^ 0x1891, var12, var11 == 1, class367.field5213, var9);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([Ljava/lang/String;[SI)V", line = 321)
    public static final void method1843(String[] arg0, short[] arg1, int arg2) {
        class307.method2101(arg0.length - 1, 8, arg0, arg1, arg2);
        field3671++;
    }
}
