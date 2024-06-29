import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class208 {

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public int field2510 = 0;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "Z")
    private boolean field2529 = false;

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "I")
    public int field2538 = 0;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    public static int field2525 = 52;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public int field2514;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public int field2517;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public int field2520;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    public int field2521;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    public int field2522;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    private int field2524;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
    public int field2526;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
    public int field2531;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
    public int field2533;

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
    public int field2536;

    @OriginalMember(owner = "client!ti", name = "D", descriptor = "J")
    public long field2539;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "Lqn;")
    public static class373 field2516;

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "[[B")
    public static byte[][] field2537;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
    public final void method1270(int arg0) {
        field2519++;
        this.field2531 = class363.field4917[this.field2524 << 3];
        this.field2533 = (int) Math.sqrt((double) (this.field2521 * this.field2521 + this.field2526 * this.field2526 + this.field2522 * this.field2522));
        if (this.field2514 == 0) {
            this.field2514 = 1;
        }
        if (arg0 != -698831708) {
            return;
        }
        if (this.field2536 == 0) {
            this.field2539 = 2147483647L;
        } else if (this.field2536 == 1) {
            this.field2539 = (long) (this.field2533 * 8 / this.field2514);
            this.field2539 *= this.field2539;
        } else if (this.field2536 == 2) {
            this.field2539 = (long) (this.field2533 * 8 / this.field2514);
        }
        if (this.field2529) {
            this.field2533 *= -1;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2513++;
        int var8 = class65.method376(class53.field624, class118.field1356, arg4, (byte) 94);
        int var9 = class65.method376(class53.field624, class118.field1356, arg2, (byte) 104);
        int var10 = class65.method376(class295.field3937, class427.field5844, arg6, (byte) 110);
        int var11 = class65.method376(class295.field3937, class427.field5844, arg1, (byte) 122);
        int var12 = class65.method376(class53.field624, class118.field1356, arg4 + arg0, (byte) 95);
        int var13 = class65.method376(class53.field624, class118.field1356, arg2 - arg0, (byte) 116);
        if (arg3 != 1778909736) {
            method1281((String) null, false, (class441) null, -52, true);
        }
        for (int var14 = var8; var14 < var12; var14++) {
            class384.method2394(arg7, arg3 - 1778909624, class228.field2877[var14], var11, var10);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class384.method2394(arg7, 126, class228.field2877[var15], var11, var10);
        }
        int var16 = class65.method376(class295.field3937, class427.field5844, arg0 + arg6, (byte) -125);
        int var17 = class65.method376(class295.field3937, class427.field5844, arg1 - arg0, (byte) -101);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class228.field2877[var18];
            class384.method2394(arg7, arg3 ^ 0x6A080256, var19, var16, var10);
            class384.method2394(arg5, 126, var19, var17, var16);
            class384.method2394(arg7, 113, var19, var11, var17);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
    public static final void method1272(byte arg0) {
        field2511++;
        class280.field3629.method2298(0);
        if (arg0 != 3) {
            field2525 = 38;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IB)V")
    public static final void method1273(int arg0, byte arg1) {
        field2527++;
        if (arg1 != 97) {
            method1281((String) null, true, (class441) null, 4, true);
        }
        class12 var2 = class390.method2422(341555040, arg0, 9);
        var2.method65(-82);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZ)V")
    public static final void method1274(int arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        class365 var2 = class131.field1494;
        synchronized (class131.field1494) {
            class131.field1494.method2286(arg0, (byte) 36);
        }
        field2528++;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(IZ)V")
    public static final void method1275(int arg0, boolean arg1) {
        class67.field805 = arg0;
        field2515++;
        if (!arg1) {
            field2537 = null;
        }
        class365 var2 = class347.field4723;
        synchronized (class347.field4723) {
            class347.field4723.method2298(0);
        }
        class365 var3 = class108.field1288;
        synchronized (class108.field1288) {
            class108.field1288.method2298(0);
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V")
    public static void method1276(int arg0) {
        field2516 = null;
        field2537 = null;
        if (arg0 != 0) {
            field2516 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILbg;)V")
    private final void method1277(int arg0, int arg1, class242 arg2) {
        if (arg1 == 1) {
            this.field2524 = arg2.method1587((byte) -102);
        } else if (arg1 == 2) {
            arg2.method1563(-128);
        } else if (arg1 == 3) {
            this.field2526 = arg2.method1576((byte) 123);
            this.field2522 = arg2.method1576((byte) 122);
            this.field2521 = arg2.method1576((byte) 121);
        } else if (arg1 == 4) {
            this.field2536 = arg2.method1563(-128);
            this.field2514 = arg2.method1576((byte) 123);
        } else if (arg1 == 6) {
            this.field2520 = arg2.method1563(-128);
        } else if (arg1 == 8) {
            this.field2538 = 1;
        } else if (arg1 == 9) {
            this.field2510 = 1;
        } else if (arg1 == 10) {
            this.field2529 = true;
        }
        if (arg0 != 4) {
            this.method1277(77, -97, (class242) null);
        }
        field2512++;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILbg;)V")
    public final void method1278(int arg0, class242 arg1) {
        field2518++;
        if (arg0 >= -28) {
            this.method1270(-47);
        }
        while (true) {
            int var3 = arg1.method1563(-128);
            if (var3 == 0) {
                return;
            }
            this.method1277(4, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(ILbg;)Lvn;")
    public static final class231 method1279(int arg0, class242 arg1) {
        field2532++;
        return arg0 == 12929 ? new class231(arg1.method1582(false), arg1.method1582(false), arg1.method1582(false), arg1.method1582(false), arg1.method1545(8), arg1.method1545(8), arg1.method1563(-128)) : null;
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)V")
    public static final void method1280(int arg0) {
        int var1 = -101 % ((9 - arg0) / 57);
        class394.method2444(class276.field3580, true);
        field2535++;
        int var2 = (class287.field3784 >> 10) + (class278.field3608 >> 3);
        int var3 = (class80.field979 >> 10) + (class129.field1432 >> 3);
        byte var4 = 0;
        byte var5 = 8;
        byte var6 = 8;
        byte var7 = 18;
        class352.field4796 = new int[var7];
        class262.field3375 = new byte[var7][];
        class412.field5671 = new int[var7];
        field2537 = new byte[var7][];
        class358.field4867 = new int[var7];
        class103.field1205 = new int[var7];
        class244.field3251 = new int[var7][4];
        class126.field1411 = new byte[var7][];
        class31.field345 = new byte[var7][];
        class431.field5881 = new byte[var7][];
        class325.field4337 = new int[var7];
        class203.field2385 = new int[var7];
        int var8 = 0;
        for (int var9 = (var2 - (class22.field232 >> 4)) / 8; var9 <= (((class22.field232 >> 4) + var2) / 8); var9++) {
            for (int var11 = (var3 - (class196.field2329 >> 4)) / 8; var11 <= (((class196.field2329 >> 4) + var3) / 8); var11++) {
                int var12 = (var9 << 8) + var11;
                class358.field4867[var8] = var12;
                class412.field5671[var8] = class335.field4572.method1806((byte) -114, "m" + var9 + "_" + var11);
                class203.field2385[var8] = class335.field4572.method1806((byte) -100, "l" + var9 + "_" + var11);
                class325.field4337[var8] = class335.field4572.method1806((byte) -117, "n" + var9 + "_" + var11);
                class103.field1205[var8] = class335.field4572.method1806((byte) -97, "um" + var9 + "_" + var11);
                class352.field4796[var8] = class335.field4572.method1806((byte) -117, "ul" + var9 + "_" + var11);
                if (class325.field4337[var8] == -1) {
                    class412.field5671[var8] = -1;
                    class203.field2385[var8] = -1;
                    class103.field1205[var8] = -1;
                    class352.field4796[var8] = -1;
                }
                var8++;
            }
        }
        for (int var10 = var8; var10 < class325.field4337.length; var10++) {
            class325.field4337[var10] = -1;
            class412.field5671[var10] = -1;
            class203.field2385[var10] = -1;
            class103.field1205[var10] = -1;
            class352.field4796[var10] = -1;
        }
        class314.method1978(true, var6, var4, var2, false, (byte) -127, var5, var3);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Ljava/lang/String;ZLnh;IZ)V")
    public static final void method1281(String arg0, boolean arg1, class441 arg2, int arg3, boolean arg4) {
        if (arg3 != 9) {
            field2534 = -26;
        }
        field2523++;
        if (!arg4) {
            class434.method2653(arg0, 3, arg2, -1);
            return;
        }
        if (class441.field6080.startsWith("win") && class441.field6075 != 3) {
            String var5 = null;
            if (arg2.field6077 != null) {
                var5 = arg2.field6077.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class315 var6 = class434.method2653(arg0, 0, arg2, -1);
                class204.field2458 = arg0;
                class131.field1496 = arg2;
                class451.field6295 = var6;
                return;
            }
        }
        if (class441.field6080.startsWith("mac")) {
            String var7 = null;
            if (arg2.field6077 != null) {
                var7 = arg2.field6077.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg1) {
                class434.method2653(arg0, 1, arg2, -1);
                return;
            }
        }
        class434.method2653(arg0, 2, arg2, arg3 - 10);
    }

    static {
        new class72("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
    }
}
