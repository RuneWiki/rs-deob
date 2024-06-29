import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class115 extends class129 {

    @OriginalMember(owner = "client!u", name = "L", descriptor = "Ls;")
    private class105 field2622;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "Lva;")
    private static class121 field2605 = class107.method797("Loading )2 please wait)3", -10983);

    @OriginalMember(owner = "client!u", name = "p", descriptor = "Lva;")
    private static class121 field2600 = class107.method797(" from your ignore list first", -10983);

    @OriginalMember(owner = "client!u", name = "D", descriptor = "I")
    public static int field2614 = 0;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "I")
    public static volatile int field2612 = 0;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "I")
    public static int field2607 = 0;

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "Lva;")
    public static class121 field2627 = field2600;

    @OriginalMember(owner = "client!u", name = "R", descriptor = "Lva;")
    private static class121 field2628 = class107.method797("Connecting to server)3)3)3", -10983);

    @OriginalMember(owner = "client!u", name = "F", descriptor = "Lva;")
    public static class121 field2616 = field2605;

    @OriginalMember(owner = "client!u", name = "C", descriptor = "Lva;")
    private static class121 field2613 = class107.method797("Offline", -10983);

    @OriginalMember(owner = "client!u", name = "x", descriptor = "Lva;")
    public static class121 field2608 = field2628;

    @OriginalMember(owner = "client!u", name = "N", descriptor = "Lva;")
    public static class121 field2624 = field2613;

    @OriginalMember(owner = "client!u", name = "S", descriptor = "Lva;")
    public static class121 field2629 = class107.method797("_", -10983);

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "I")
    private int field2604;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!u", name = "A", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!u", name = "H", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!u", name = "I", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!u", name = "J", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "Lfa;")
    private class32 field2599;

    @OriginalMember(owner = "client!u", name = "M", descriptor = "Lle;")
    public static class71 field2623;

    @OriginalMember(owner = "client!u", name = "O", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2625;

    @OriginalMember(owner = "client!u", name = "E", descriptor = "Z")
    private boolean field2615;

    @OriginalMember(owner = "client!u", name = "G", descriptor = "Z")
    private boolean field2617;

    @OriginalMember(owner = "client!u", name = "P", descriptor = "[B")
    private byte[] field2626;

    @OriginalMember(owner = "client!u", name = "T", descriptor = "[I")
    public static int[] field2630;

    @OriginalMember(owner = "client!u", name = "K", descriptor = "[[[B")
    public static byte[][][] field2621;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V", line = 5)
    public final void method145(int arg0) {
        field2610++;
        if (this.field2599 == null || this.field2599.field795 == 0) {
            return;
        }
        if (this.field2599.field795 == 1) {
            class98 var2 = (class98) this.field2599.field800;
            try {
                var2.method662(this.field2626.length, (byte) -104, this.field2626, 0);
                var2.method665(true);
                try {
                    class122.method970(this.field2622.field2418, (byte) -43, "midibox.loop=" + (this.field2615 ? "\"infinite\"" : "0") + "; midibox.src=\"" + var2.method661(false).getPath().replace('\\', '/') + "\"; midibox.volume=" + this.field2604 + ";");
                    this.field2617 = true;
                } catch (Throwable var4) {
                }
            } catch (Exception var5) {
                try {
                    var2.method665(true);
                } catch (Exception var3) {
                }
            }
        }
        this.field2599 = null;
        if (arg0 > -90) {
            this.field2599 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)Lva;", line = 43)
    public static final class121 method879(byte arg0, int arg1) {
        if (arg0 < 38) {
            return null;
        }
        field2620++;
        class121 var2 = new class121();
        var2.field2817 = new byte[arg1];
        var2.field2783 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)V", line = 59)
    public final void method142(int arg0, byte arg1) {
        if (arg1 != 50) {
            this.method141(75);
        }
        field2611++;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIB)V", line = 70)
    public final void method143(int arg0, int arg1, byte arg2) {
        int var4 = 81 % ((-arg2 - 20) / 50);
        if (arg0 == 0) {
            arg0 = 1;
        }
        int var5 = class67.method475(arg0, 0) - arg1;
        field2603++;
        if (this.field2599 != null) {
            this.field2604 = var5;
        } else if (this.field2617) {
            try {
                class122.method970(this.field2622.field2418, (byte) -124, "midibox.volume=" + var5 + ";");
                return;
            } catch (Throwable var6) {
                return;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 125)
    public final void method141(int arg0) {
        if (arg0 == 699) {
            field2618++;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZIIIIIIIIIII)Z", line = 154)
    public static final boolean method880(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field2606++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class60.field1439[var12][var36] = 0;
                class59.field1412[var12][var36] = 99999999;
            }
        }
        class60.field1439[arg9][arg11] = 99;
        class59.field1412[arg9][arg11] = 0;
        int var13 = arg9;
        if (arg2 != 25) {
            field2621 = null;
        }
        byte var14 = 0;
        class119.field2735[var14] = arg9;
        int var15 = arg11;
        int var16 = 0;
        int var37 = var14 + 1;
        class116.field2639[var14] = arg11;
        boolean var17 = false;
        int var18 = class119.field2735.length;
        int[][] var19 = class18.field385[class121.field2807].field276;
        while (var37 != var16) {
            var15 = class116.field2639[var16];
            var13 = class119.field2735[var16];
            var16 = (var16 + 1) % var18;
            if (arg8 == var13 && arg1 == var15) {
                var17 = true;
                break;
            }
            if (arg10 != 0) {
                if ((arg10 < 5 || arg10 == 10) && class18.field385[class121.field2807].method118((byte) 69, var15, arg6, var13, arg10 - 1, arg8, arg1)) {
                    var17 = true;
                    break;
                }
                if (arg10 < 10 && class18.field385[class121.field2807].method120(arg6, 1, var13, arg8, arg1, var15, arg10 - 1)) {
                    var17 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg3 != 0 && class18.field385[class121.field2807].method117(arg1, arg7, arg3, var15, var13, arg8, (byte) 64, arg4)) {
                var17 = true;
                break;
            }
            int var35 = class59.field1412[var13][var15] + 1;
            if (var13 > 0 && class60.field1439[var13 - 1][var15] == 0 && (var19[var13 - 1][var15] & 0x1280108) == 0) {
                class119.field2735[var37] = var13 - 1;
                class116.field2639[var37] = var15;
                class60.field1439[var13 - 1][var15] = 2;
                var37 = (var37 + 1) % var18;
                class59.field1412[var13 - 1][var15] = var35;
            }
            if (var13 < 103 && class60.field1439[var13 + 1][var15] == 0 && (var19[var13 + 1][var15] & 0x1280180) == 0) {
                class119.field2735[var37] = var13 + 1;
                class116.field2639[var37] = var15;
                class60.field1439[var13 + 1][var15] = 8;
                var37 = (var37 + 1) % var18;
                class59.field1412[var13 + 1][var15] = var35;
            }
            if (var15 > 0 && class60.field1439[var13][var15 - 1] == 0 && (var19[var13][var15 - 1] & 0x1280102) == 0) {
                class119.field2735[var37] = var13;
                class116.field2639[var37] = var15 - 1;
                class60.field1439[var13][var15 - 1] = 1;
                class59.field1412[var13][var15 - 1] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var15 < 103 && class60.field1439[var13][var15 + 1] == 0 && (var19[var13][var15 + 1] & 0x1280120) == 0) {
                class119.field2735[var37] = var13;
                class116.field2639[var37] = var15 + 1;
                var37 = (var37 + 1) % var18;
                class60.field1439[var13][var15 + 1] = 4;
                class59.field1412[var13][var15 + 1] = var35;
            }
            if (var13 > 0 && var15 > 0 && class60.field1439[var13 - 1][var15 - 1] == 0 && (var19[var13 - 1][var15 - 1] & 0x128010E) == 0 && (var19[var13 - 1][var15] & 0x1280108) == 0 && (var19[var13][var15 - 1] & 0x1280102) == 0) {
                class119.field2735[var37] = var13 - 1;
                class116.field2639[var37] = var15 - 1;
                var37 = (var37 + 1) % var18;
                class60.field1439[var13 - 1][var15 - 1] = 3;
                class59.field1412[var13 - 1][var15 - 1] = var35;
            }
            if (var13 < 103 && var15 > 0 && class60.field1439[var13 + 1][var15 - 1] == 0 && (var19[var13 + 1][var15 - 1] & 0x1280183) == 0 && (var19[var13 + 1][var15] & 0x1280180) == 0 && (var19[var13][var15 - 1] & 0x1280102) == 0) {
                class119.field2735[var37] = var13 + 1;
                class116.field2639[var37] = var15 - 1;
                var37 = (var37 + 1) % var18;
                class60.field1439[var13 + 1][var15 - 1] = 9;
                class59.field1412[var13 + 1][var15 - 1] = var35;
            }
            if (var13 > 0 && var15 < 103 && class60.field1439[var13 - 1][var15 + 1] == 0 && (var19[var13 - 1][var15 + 1] & 0x1280138) == 0 && (var19[var13 - 1][var15] & 0x1280108) == 0 && (var19[var13][var15 + 1] & 0x1280120) == 0) {
                class119.field2735[var37] = var13 - 1;
                class116.field2639[var37] = var15 + 1;
                var37 = (var37 + 1) % var18;
                class60.field1439[var13 - 1][var15 + 1] = 6;
                class59.field1412[var13 - 1][var15 + 1] = var35;
            }
            if (var13 < 103 && var15 < 103 && class60.field1439[var13 + 1][var15 + 1] == 0 && (var19[var13 + 1][var15 + 1] & 0x12801E0) == 0 && (var19[var13 + 1][var15] & 0x1280180) == 0 && (var19[var13][var15 + 1] & 0x1280120) == 0) {
                class119.field2735[var37] = var13 + 1;
                class116.field2639[var37] = var15 + 1;
                class60.field1439[var13 + 1][var15 + 1] = 12;
                class59.field1412[var13 + 1][var15 + 1] = var35;
                var37 = (var37 + 1) % var18;
            }
        }
        class20.field546 = 0;
        if (!var17) {
            if (!arg0) {
                return false;
            }
            int var20 = 1000;
            byte var21 = 10;
            int var22 = 100;
            for (int var23 = arg8 - var21; var23 <= arg8 + var21; var23++) {
                for (int var24 = arg1 - var21; var24 <= arg1 + var21; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class59.field1412[var23][var24] < 100) {
                        int var25 = 0;
                        if (arg1 > var24) {
                            var25 = arg1 - var24;
                        } else if (var24 > arg1 + arg3 - 1) {
                            var25 = var24 + 1 - arg1 - arg3;
                        }
                        int var26 = 0;
                        if (arg8 > var23) {
                            var26 = arg8 - var23;
                        } else if (var23 > arg8 + arg7 - 1) {
                            var26 = var23 + 1 - arg8 - arg7;
                        }
                        int var27 = var26 * var26 + var25 * var25;
                        if (var20 > var27 || var20 == var27 && var22 > class59.field1412[var23][var24]) {
                            var22 = class59.field1412[var23][var24];
                            var13 = var23;
                            var15 = var24;
                            var20 = var27;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg9 == var13 && arg11 == var15) {
                return false;
            }
            class20.field546 = 1;
        }
        byte var28 = 0;
        class119.field2735[var28] = var13;
        int var38 = var28 + 1;
        class116.field2639[var28] = var15;
        int var29;
        int var30 = var29 = class60.field1439[var13][var15];
        while (arg9 != var13 || arg11 != var15) {
            if (var29 != var30) {
                var29 = var30;
                class119.field2735[var38] = var13;
                class116.field2639[var38++] = var15;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            if ((var30 & 0x1) != 0) {
                var15++;
            } else if ((var30 & 0x4) != 0) {
                var15--;
            }
            var30 = class60.field1439[var13][var15];
        }
        if (var38 > 0) {
            int var31 = var38--;
            int var32 = class119.field2735[var38];
            int var33 = class116.field2639[var38];
            if (var31 > 25) {
                var31 = 25;
            }
            if (arg5 == 0) {
                class44.field1004++;
                class60.field1437.method622(104, true);
                class60.field1437.method836(arg2 - 25, var31 + 3 + var31);
            }
            if (arg5 == 1) {
                class97.field2167++;
                class60.field1437.method622(142, true);
                class60.field1437.method836(0, var31 + var31 + 14 + 3);
            }
            if (arg5 == 2) {
                class60.field1437.method622(20, true);
                class86.field1978++;
                class60.field1437.method836(0, var31 + var31 + 3);
            }
            class43.field988 = class119.field2735[0];
            class60.field1444 = class116.field2639[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class60.field1437.method823(class119.field2735[var38] - var32, false);
                class60.field1437.method847(false, class116.field2639[var38] - var33);
            }
            class60.field1437.method864(class21.field570[82] ? 1 : 0, 255);
            class60.field1437.method856(96, class9.field132 + var33);
            class60.field1437.method850(class129.field2977 + var32, (byte) 94);
            return true;
        } else if (arg5 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I[BIZ)V", line = 497)
    public final void method139(int arg0, byte[] arg1, int arg2, boolean arg3) {
        field2609++;
        this.field2599 = this.field2622.method779((byte) 127);
        if (this.field2599 == null) {
            return;
        }
        if (arg0 == arg2) {
            arg0 = 1;
        }
        this.field2604 = class67.method475(arg0, 0);
        this.field2615 = arg3;
        this.field2626 = arg1;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V", line = 520)
    public final void method140(boolean arg0) {
        if (!arg0) {
            return;
        }
        if (this.field2617) {
            try {
                class122.method970(this.field2622.field2418, (byte) -32, "midibox.src=\"c:/silence.mid\";");
            } catch (Throwable var2) {
            }
            this.field2617 = false;
        }
        this.field2599 = null;
        field2601++;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(B)V", line = 550)
    public static void method881(byte arg0) {
        field2623 = null;
        field2629 = null;
        field2605 = null;
        field2600 = null;
        field2627 = null;
        field2624 = null;
        field2628 = null;
        field2608 = null;
        field2621 = null;
        field2625 = null;
        field2616 = null;
        field2613 = null;
        field2630 = null;
        if (arg0 != 62) {
            method881((byte) -99);
        }
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(I)V", line = 576)
    public static final void method882(int arg0) {
        field2619++;
        int var1 = class66.field1578.method626(8, -112);
        if (class13.field231 > var1) {
            for (int var2 = var1; var2 < class13.field231; var2++) {
                class113.field2558[class18.field392++] = class71.field1680[var2];
            }
        }
        if (class13.field231 < var1) {
            throw new RuntimeException("gppov1");
        }
        class13.field231 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class71.field1680[var3];
            class77 var5 = class127.field2895[var4];
            int var6 = class66.field1578.method626(1, arg0 ^ 0xFFFFC932);
            if (var6 == 0) {
                class71.field1680[class13.field231++] = var4;
                var5.field722 = field2614;
            } else {
                int var7 = class66.field1578.method626(2, -91);
                if (var7 == 0) {
                    class71.field1680[class13.field231++] = var4;
                    var5.field722 = field2614;
                    class15.field274[class92.field2087++] = var4;
                } else if (var7 == 1) {
                    class71.field1680[class13.field231++] = var4;
                    var5.field722 = field2614;
                    int var8 = class66.field1578.method626(3, -60);
                    var5.method225(var8, arg0 ^ 0x36FF, false);
                    int var9 = class66.field1578.method626(1, arg0 - 14087);
                    if (var9 == 1) {
                        class15.field274[class92.field2087++] = var4;
                    }
                } else if (var7 == 2) {
                    class71.field1680[class13.field231++] = var4;
                    var5.field722 = field2614;
                    int var10 = class66.field1578.method626(3, -69);
                    var5.method225(var10, 64, true);
                    int var11 = class66.field1578.method626(3, -117);
                    var5.method225(var11, arg0 - 13951, true);
                    int var12 = class66.field1578.method626(1, -43);
                    if (var12 == 1) {
                        class15.field274[class92.field2087++] = var4;
                    }
                } else if (var7 == 3) {
                    class113.field2558[class18.field392++] = var4;
                }
            }
        }
        if (arg0 != 14015) {
            method879((byte) 56, -111);
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Ls;)V", line = 699)
    public class115(class105 arg0) {
        this.field2622 = arg0;
    }
}
