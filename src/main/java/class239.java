import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class239 {

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "Z")
    public boolean field3454 = false;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3445 = "Take";

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "Z")
    public static boolean field3451 = false;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "[I")
    public static int[] field3458 = new int[1000];

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "J")
    public static long field3460 = 0L;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "B")
    public static byte field3459;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public int field3446;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public int field3455;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "Ldp;")
    public static class174 field3441;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "Ljava/awt/Frame;")
    public static Frame field3443;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBLec;)V")
    public final void method1737(int arg0, byte arg1, class37 arg2) {
        int var4 = 45 / ((-arg1 - 18) / 53);
        field3444++;
        while (true) {
            int var5 = arg2.method271((byte) 126);
            if (var5 == 0) {
                return;
            }
            this.method1744(-4, arg2, arg0, var5);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BLdp;)V")
    public static final void method1738(byte arg0, class174 arg1) {
        field3461++;
        class91.field1449 = arg1;
        if (arg0 != 28) {
            method1746((byte) -120);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
    public static void method1739(byte arg0) {
        field3441 = null;
        field3458 = null;
        field3443 = null;
        if (arg0 >= -75) {
            field3460 = -79L;
        }
        field3445 = null;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V")
    public static final void method1740(byte arg0) {
        field3447++;
        class184 var1 = null;
        if (arg0 < 86) {
            method1741((class90) null, (class181) null, (byte) 71);
        }
        try {
            class131 var2 = class188.field2783.method1367((byte) -124);
            while (var2.field2121 == 0) {
                class134.method1106(1L, 10);
            }
            if (var2.field2121 == 1) {
                var1 = (class184) var2.field2125;
                class37 var3 = new class37((class289.field4306 * 6) + 3);
                var3.method267(1, false);
                var3.method324(class289.field4306, -78);
                for (int var4 = 0; var4 < class27.field401.length; var4++) {
                    if (class102.field1590[var4]) {
                        var3.method324(var4, -88);
                        var3.method275(class27.field401[var4], 1414495172);
                    }
                }
                var1.method1436(var3.field565, 0, var3.field578, 1);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method1431(-1);
            }
        } catch (Exception var5) {
        }
        class402.field5880 = class10.method63(-21149);
        class315.field4587 = false;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lja;Lcj;B)V")
    public static final void method1741(class90 arg0, class181 arg1, byte arg2) {
        field3457++;
        if (class272.field4070 == null) {
            return;
        }
        if (class358.field5117 < 10) {
            if (!class272.field4071.method1329(class272.field4070.field4360, 0)) {
                class358.field5117 = class49.field785.method1338(-4342, class272.field4070.field4360) / 10;
                return;
            }
            class105.method936(-12382);
            class358.field5117 = 10;
        }
        if (class358.field5117 == 10) {
            class272.field4088 = class272.field4070.field4357 >> 6 << 6;
            class272.field4096 = class272.field4070.field4370 >> 6 << 6;
            class272.field4093 = (class272.field4070.field4359 >> 6 << 6) + 64 - class272.field4088;
            class272.field4099 = (class272.field4070.field4367 >> 6 << 6) + 64 - class272.field4096;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class272.field4070.method2061((class86.field1394.field6520 >> 7) + class379.field5384, (byte) 78, class367.field5213, class294.field4362 + (class86.field1394.field6519 >> 7), var3)) {
                var4 = var3[1] - class272.field4096;
                var5 = var3[2] - class272.field4088;
            }
            if (!class236.field3402 && var4 >= 0 && class272.field4099 > var4 && var5 >= 0 && var5 < class272.field4093) {
                int var6 = var5 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var4 + (int) (Math.random() * 10.0D) - 5;
                class373.field5295 = var6;
                class110.field1797 = var7;
            } else if (class217.field3205 == -1 || class420.field6133 == -1) {
                class272.field4070.method2053((class272.field4070.field4361 & 0xFFFF301) >> 14, class272.field4070.field4361 & 0x3FFF, 16559, var3);
                class373.field5295 = var3[2] - class272.field4088;
                class110.field1797 = var3[1] - class272.field4096;
            } else {
                class272.field4070.method2053(class217.field3205, class420.field6133, 16559, var3);
                class420.field6133 = -1;
                class217.field3205 = -1;
                class236.field3402 = false;
                if (var3 != null) {
                    class110.field1797 = var3[1] - class272.field4096;
                    class373.field5295 = var3[2] - class272.field4088;
                }
            }
            if (class272.field4070.field4379 == 37) {
                class272.field4078 = 3.0F;
                class272.field4082 = 3.0F;
            } else if (class272.field4070.field4379 == 50) {
                class272.field4078 = 4.0F;
                class272.field4082 = 4.0F;
            } else if (class272.field4070.field4379 == 75) {
                class272.field4078 = 6.0F;
                class272.field4082 = 6.0F;
            } else if (class272.field4070.field4379 == 100) {
                class272.field4078 = 8.0F;
                class272.field4082 = 8.0F;
            } else if (class272.field4070.field4379 == 200) {
                class272.field4078 = 16.0F;
                class272.field4082 = 16.0F;
            } else {
                class272.field4078 = 8.0F;
                class272.field4082 = 8.0F;
            }
            class272.field4077 = (int) class272.field4078 >> 1;
            class272.field4080 = class144.method1134(-117, class272.field4077);
            class441.method2748(-37);
            class272.method1945();
            class356.field5064 = new class22();
            class349.field4960 = new class214();
            class272.field4079 += (int) (Math.random() * 5.0D) - 2;
            if (class272.field4079 < -8) {
                class272.field4079 = -8;
            }
            class272.field4073 += (int) (Math.random() * 5.0D) - 2;
            if (class272.field4079 > 8) {
                class272.field4079 = 8;
            }
            if (class272.field4073 < -16) {
                class272.field4073 = -16;
            }
            if (class272.field4073 > 16) {
                class272.field4073 = 16;
            }
            class272.method1952(arg1, class272.field4079 >> 2 << 10, class272.field4073 >> 1);
            class199.method1515(1024, 256, 120);
            class417.method2616(256, (byte) 54, 256);
            class397.method2537((byte) -21, 4096);
            class373.method2374((byte) -66, 256);
            class358.field5117 = 20;
        } else if (class358.field5117 == 20) {
            class336.method2187(-51, true);
            class272.method1933(arg0, class272.field4079, class272.field4073);
            class358.field5117 = 60;
            class336.method2187(-51, true);
            class79.method627(-114);
        } else if (class358.field5117 == 60) {
            if (class272.field4071.method1356(class272.field4070.field4360 + "_staticelements", (byte) 120)) {
                if (!class272.field4071.method1329(class272.field4070.field4360 + "_staticelements", 0)) {
                    return;
                }
                class272.field4074 = class76.method597(0, class121.field1908, class272.field4070.field4360 + "_staticelements", class272.field4071);
            } else {
                class272.field4074 = new class378(0);
            }
            class272.method1949();
            class358.field5117 = 70;
            class336.method2187(-51, true);
            class79.method627(-32);
        } else if (class358.field5117 == 70) {
            class286.field4284 = new class304(arg0, 11, true, class33.field475);
            class358.field5117 = 73;
            class336.method2187(-51, true);
            class79.method627(-126);
        } else if (class358.field5117 == 73) {
            class283.field4235 = new class304(arg0, 12, true, class33.field475);
            class358.field5117 = 76;
            class336.method2187(-51, true);
            class79.method627(-46);
        } else if (class358.field5117 == 76) {
            class218.field3232 = new class304(arg0, 14, true, class33.field475);
            class358.field5117 = 79;
            class336.method2187(-51, true);
            class79.method627(-58);
        } else if (class358.field5117 == 79) {
            class19.field280 = new class304(arg0, 17, true, class33.field475);
            class358.field5117 = 82;
            class336.method2187(-51, true);
            class79.method627(-42);
        } else {
            int var8 = -108 / ((43 - arg2) / 63);
            if (class358.field5117 == 82) {
                class273.field4112 = new class304(arg0, 19, true, class33.field475);
                class358.field5117 = 85;
                class336.method2187(-51, true);
                class79.method627(-108);
            } else if (class358.field5117 == 85) {
                class200.field2925 = new class304(arg0, 22, true, class33.field475);
                class358.field5117 = 88;
                class336.method2187(-51, true);
                class79.method627(-71);
            } else if (class358.field5117 == 88) {
                class14.field224 = new class304(arg0, 26, true, class33.field475);
                class358.field5117 = 91;
                class336.method2187(-51, true);
                class79.method627(-85);
            } else {
                class21.field321 = new class304(arg0, 30, true, class33.field475);
                class358.field5117 = 100;
                class336.method2187(-51, true);
                class79.method627(-69);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)Lll;")
    public static final class332 method1742(int arg0) {
        field3456++;
        try {
            if (arg0 != 12121) {
                method1739((byte) -25);
            }
            return (class332) Class.forName("lc").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZILja;I)Lof;")
    public final class421 method1743(boolean arg0, int arg1, class90 arg2, int arg3) {
        field3449++;
        long var5 = (long) (arg2.field1431 << 19 | arg1 << 16 | this.field3446 | (arg0 ? 262144 : 0));
        class421 var7 = (class421) class30.field436.method103(0, var5);
        if (var7 != null) {
            return var7;
        } else if (class182.field2690.method1348(255, this.field3446)) {
            class344 var8 = class344.method2217(class182.field2690, this.field3446, 0);
            if (var8 != null) {
                var8.field4864 = var8.field4866 = var8.field4861 = var8.field4865 = 0;
                if (arg0) {
                    var8.method2216();
                }
                for (int var9 = 0; var9 < arg1; var9++) {
                    var8.method2218();
                }
            }
            if (arg3 >= -65) {
                return null;
            }
            class421 var10 = arg2.method734(var8, true);
            if (var10 != null) {
                class30.field436.method113(var10, 0, var5);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILec;II)V")
    private final void method1744(int arg0, class37 arg1, int arg2, int arg3) {
        if (arg3 == 1) {
            this.field3446 = arg1.method320((byte) -87);
        } else if (arg3 == 2) {
            this.field3455 = arg1.method295(true);
        } else if (arg3 == 3) {
            this.field3454 = true;
        } else if (arg3 == 4) {
            this.field3446 = -1;
        }
        if (arg0 == -4) {
            field3452++;
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)Z")
    public final boolean method1745(int arg0) {
        if (arg0 != -1184447798) {
            this.method1745(116);
        }
        field3442++;
        return class182.field2690.method1348(arg0 ^ 0xB966C235, this.field3446);
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(B)V")
    public static final void method1746(byte arg0) {
        field3450++;
        if (!class122.method1034(24037) && class367.field5213 != class140.field2216) {
            class157.method1233(28, class86.field1394.field5696[0], class231.field3378, class86.field1394.field5694[0], class135.field2160, class367.field5213, false, false);
            return;
        }
        class391.method2491(class73.field1235, true);
        if (class367.field5213 != class365.field5202) {
            class364.method2327(3891);
        }
        if (arg0 != 48) {
            method1742(-94);
        }
    }
}
