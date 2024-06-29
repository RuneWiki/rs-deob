import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class35 extends class449 {

    @OriginalMember(owner = "client!on", name = "w", descriptor = "[I")
    public int[] field577;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "[I")
    public int[] field568;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "[Z")
    public static boolean[] field566 = new boolean[200];

    @OriginalMember(owner = "client!on", name = "p", descriptor = "Z")
    public static boolean field570 = false;

    @OriginalMember(owner = "client!on", name = "x", descriptor = "I")
    public static int field578 = 0;

    @OriginalMember(owner = "client!on", name = "y", descriptor = "I")
    public static int field579 = 0;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!on", name = "r", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!on", name = "s", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!on", name = "u", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!on", name = "v", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!on", name = "o", descriptor = "Lor;")
    public static class296 field569;

    @OriginalMember(owner = "client!on", name = "t", descriptor = "Lnr;")
    public static class437 field574;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(B)V", line = 4)
    public static final void method285(byte arg0) {
        field571++;
        class392.field5886.method212(-83);
        if (arg0 != -1) {
            field578 = 73;
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(B)V", line = 15)
    public static final void method286(byte arg0) {
        while (true) {
            if (class114.field1556.method752(class413.field6176, (byte) 112) >= 27) {
                int var1 = class114.field1556.method763(15, false);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class23.field408[var1] == null) {
                        class23.field408[var1] = new class129();
                        var2 = true;
                        class23.field408[var1].field249 = var1;
                    }
                    class129 var3 = class23.field408[var1];
                    class416.field6202[class191.field2662++] = var1;
                    var3.field260 = class50.field698;
                    if (var3.field1714 != null && var3.field1714.method2463(0)) {
                        class188.method1170(true, var3);
                    }
                    int var4 = class114.field1556.method763(1, false);
                    int var5 = class114.field1556.method763(1, false);
                    if (var5 == 1) {
                        class159.field2085[class439.field6430++] = var1;
                    }
                    int var6 = class114.field1556.method763(5, false);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    var3.method877(114, class248.method1530(class114.field1556.method763(14, false), 95));
                    int var7 = class120.field1616[class114.field1556.method763(3, false)];
                    int var8 = class114.field1556.method763(5, false);
                    var3.method136(true, var3.field1714.field5570);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.field285 = var3.field1714.field5584 << 3;
                    if (var3.field285 == 0) {
                        var3.method133(-109, 0);
                    } else if (var2) {
                        var3.method133(-84, var7);
                    }
                    var3.method123(class100.field1350.field303[0] + var8, var4 == 1, 16383, var3.method130((byte) -116), class193.field2688, class100.field1350.field306[0] + var6);
                    if (var3.field1714.method2463(0)) {
                        class280.method1794((class194) null, 0, var3.field306[0], var3, false, class193.field2688, (class404) null, var3.field303[0]);
                    }
                    continue;
                }
            }
            if (arg0 != 101) {
                field579 = -34;
            }
            field565++;
            class114.field1556.method755(320);
            return;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(BC)Z", line = 97)
    public static final boolean method287(byte arg0, char arg1) {
        int var2 = 24 % ((-arg0 - 5) / 59);
        field567++;
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIB)V", line = 111)
    public static final void method288(int arg0, int arg1, int arg2, byte arg3) {
        class37.field606 = new byte[arg2][arg1][arg0];
        field575++;
        if (arg3 <= 74) {
            field574 = null;
        }
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(B)V", line = 128)
    public static final void method289(byte arg0) {
        field573++;
        if (arg0 < 102) {
            method290(-47, 7, (class249[]) null);
        }
        class377 var1 = null;
        try {
            class296 var2 = class361.field5285.method4(16389);
            while (var2.field4259 == 0) {
                class404.method2628(-36, 1L);
            }
            if (var2.field4259 == 1) {
                var1 = (class377) var2.field4262;
                byte[] var3 = new byte[(int) var1.method2498(-112)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2497(var3.length - var4, var3, var4, 0);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class244.method1503(104, new class265(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method2499(1);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(II[Lro;)V", line = 178)
    public static final void method290(int arg0, int arg1, class249[] arg2) {
        for (int var3 = arg1; var3 < arg2.length; var3++) {
            class249 var4 = arg2[var3];
            if (var4 != null && var4.field3623 == arg0 && (!var4.field3522 || !client.method1557(var4))) {
                if (var4.field3637 == 0) {
                    if (!var4.field3522 && client.method1557(var4) && class59.field853 != var4) {
                        continue;
                    }
                    method290(var4.field3622, arg1, arg2);
                    if (var4.field3493 != null) {
                        method290(var4.field3622, 0, var4.field3493);
                    }
                    class158 var5 = (class158) class269.field3933.method954(69, (long) var4.field3622);
                    if (var5 != null) {
                        class336.method2231((byte) -123, var5.field2075);
                    }
                }
                if (var4.field3637 == 6) {
                    if (var4.field3610 != -1 || var4.field3465 != -1) {
                        boolean var6 = class213.method1322(var4, (byte) 57);
                        int var7;
                        if (var6) {
                            var7 = var4.field3465;
                        } else {
                            var7 = var4.field3610;
                        }
                        if (var7 != -1) {
                            class15 var8 = class391.method2551(var7, (byte) -113);
                            if (var8 != null) {
                                var4.field3505 += class175.field2280;
                                while (var4.field3505 > var8.field164[var4.field3651]) {
                                    var4.field3505 -= var8.field164[var4.field3651];
                                    var4.field3651++;
                                    if (var4.field3651 >= var8.field150.length) {
                                        var4.field3651 -= var8.field174;
                                        if (var4.field3651 < 0 || var8.field150.length <= var4.field3651) {
                                            var4.field3651 = 0;
                                        }
                                    }
                                    var4.field3648 = var4.field3651 + 1;
                                    if (var4.field3648 >= var8.field150.length) {
                                        var4.field3648 -= var8.field174;
                                        if (var4.field3648 < 0 || var4.field3648 >= var8.field150.length) {
                                            var4.field3648 = -1;
                                        }
                                    }
                                    class392.method2564(arg1 ^ 0xFFFFFF82, var4);
                                }
                            }
                        }
                    }
                    if (var4.field3617 != 0 && !var4.field3522) {
                        int var9 = var4.field3617 >> 16;
                        int var10 = var4.field3617 << 16 >> 16;
                        int var11 = class175.field2280 * var9;
                        int var12 = class175.field2280 * var10;
                        var4.field3628 = var4.field3628 + var11 & 0x3FFF;
                        var4.field3649 = var4.field3649 + var12 & 0x3FFF;
                        class392.method2564(arg1 - 105, var4);
                    }
                }
            }
        }
        field572++;
    }

    @OriginalMember(owner = "client!on", name = "d", descriptor = "(B)V", line = 299)
    public static void method291(byte arg0) {
        field569 = null;
        if (arg0 != -79) {
            field569 = null;
        }
        field566 = null;
        field574 = null;
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(II[I[I)V", line = 316)
    public class35(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field577 = arg3;
        this.field568 = arg2;
    }
}
