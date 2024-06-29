import java.awt.event.ActionEvent;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class106 {

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    private int field2597 = 0;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    private int field2598;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    private int field2599;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "[[I")
    public int[][] field2602;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    private int field2595;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "Lid;")
    public static class60 field2614 = class11.method72("hitmarks", (byte) -89);

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2607 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "Lid;")
    public static class60 field2620 = class11.method72(" steht bereits auf Ihrer Ignorieren)2Liste(Q", (byte) -56);

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "[Lof;")
    public static class103[] field2618 = new class103[2048];

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "Lid;")
    public static class60 field2622 = class11.method72("::errortest", (byte) 117);

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "Lid;")
    private static class60 field2623 = class11.method72("Select", (byte) -50);

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "I")
    public static int field2625 = 0;

    @OriginalMember(owner = "client!pb", name = "G", descriptor = "I")
    public static int field2626 = 0;

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "I")
    public static int field2627 = 0;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "Lid;")
    public static class60 field2616 = field2623;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "Lid;")
    public static class60 field2619 = class11.method72("k", (byte) -15);

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "Lid;")
    public static class60 field2628 = class11.method72("Spieler", (byte) 126);

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "Lid;")
    public static class60 field2617 = class11.method72("Lade Eingabe)2Steuerungsprogramm)3)3)3", (byte) 105);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "[I")
    public static int[] field2596;

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "[Le;")
    public static class29[] field2624;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIII)V")
    public static final void method866(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class144 var5 = (class144) class152.field3400.method496(10153); var5 != null; var5 = (class144) class152.field3400.method500(-1)) {
            if (var5.field3259 != -1 || var5.field3251 != null) {
                int var6 = 0;
                if (arg2 > var5.field3242) {
                    var6 += arg2 - var5.field3242;
                } else if (var5.field3245 > arg2) {
                    var6 += var5.field3245 - arg2;
                }
                if (var5.field3238 < arg1) {
                    var6 += arg1 - var5.field3238;
                } else if (var5.field3244 > arg1) {
                    var6 += var5.field3244 - arg1;
                }
                if (var6 - 64 > var5.field3257 || class74.field1784 == 0 || var5.field3248 != arg3) {
                    if (var5.field3236 != null) {
                        class33.field770.method1104(var5.field3236);
                        var5.field3236 = null;
                    }
                    if (var5.field3249 != null) {
                        class33.field770.method1104(var5.field3249);
                        var5.field3249 = null;
                    }
                } else {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (var5.field3257 - var6) * class74.field1784 / var5.field3257;
                    if (var5.field3236 != null) {
                        var5.field3236.method655(var7);
                    } else if (var5.field3259 >= 0) {
                        class134 var8 = class134.method1055(class158.field3617, var5.field3259, 0);
                        if (var8 != null) {
                            class83 var9 = var8.method1053().method694(class129.field2944);
                            class79 var10 = class79.method659(var9, 100, var7);
                            var10.method663(-1);
                            class33.field770.method1106(var10);
                            var5.field3236 = var10;
                        }
                    }
                    if (var5.field3249 != null) {
                        var5.field3249.method655(var7);
                        if (!var5.field3249.method1010(-121)) {
                            var5.field3249 = null;
                        }
                    } else if (var5.field3251 != null && (var5.field3254 -= arg4) <= 0) {
                        int var11 = (int) (Math.random() * (double) var5.field3251.length);
                        class134 var12 = class134.method1055(class158.field3617, var5.field3251[var11], 0);
                        if (var12 != null) {
                            class83 var13 = var12.method1053().method694(class129.field2944);
                            class79 var14 = class79.method659(var13, 100, var7);
                            var14.method663(0);
                            class33.field770.method1106(var14);
                            var5.field3254 = (int) (Math.random() * (double) (var5.field3246 - var5.field3256)) + var5.field3256;
                            var5.field3249 = var14;
                        }
                    }
                }
            }
        }
        if (arg0 < 98) {
            field2622 = null;
        }
        field2613++;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZIIIII)Z")
    public final boolean method867(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2612++;
        if (arg0 == arg3 && arg2 == arg4) {
            return true;
        }
        int var8 = arg2 - this.field2597;
        int var9 = arg0 - this.field2595;
        int var10 = arg3 - this.field2595;
        int var11 = arg4 - this.field2597;
        if (arg6 == 0) {
            if (arg5 == 0) {
                if (var10 - 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field2602[var9][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field2602[var9][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var9 == var10 && var8 + 1 == var11) {
                    return true;
                }
                if (var10 - 1 == var9 && var8 == var11 && (this.field2602[var9][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field2602[var9][var11] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var10 + 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field2602[var9][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field2602[var9][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var9 == var10 && var8 - 1 == var11) {
                    return true;
                }
                if (var10 - 1 == var9 && var8 == var11 && (this.field2602[var9][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field2602[var9][var11] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg6 == 2) {
            if (arg5 == 0) {
                if (var10 - 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field2602[var9][var11] & 0x12C0180) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field2602[var9][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var10 - 1 == var9 && var8 == var11 && (this.field2602[var9][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field2602[var9][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var10 - 1 == var9 && var8 == var11 && (this.field2602[var9][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field2602[var9][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var10 - 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field2602[var9][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field2602[var9][var11] & 0x12C0180) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11) {
                    return true;
                }
            }
        }
        if (arg1) {
            field2623 = null;
        }
        if (arg6 == 9) {
            if (var9 == var10 && var8 + 1 == var11 && (this.field2602[var9][var11] & 0x20) == 0) {
                return true;
            }
            if (var9 == var10 && var8 - 1 == var11 && (this.field2602[var9][var11] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var9 && var8 == var11 && (this.field2602[var9][var11] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var9 && var8 == var11 && (this.field2602[var9][var11] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static void method868(int arg0) {
        field2623 = null;
        field2607 = null;
        field2628 = null;
        field2617 = null;
        field2618 = null;
        field2624 = null;
        field2619 = null;
        field2622 = null;
        field2616 = null;
        field2614 = null;
        field2620 = null;
        field2596 = null;
        if (arg0 != -1) {
            method866(51, -21, -15, 5, -96);
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
    public final void method869(int arg0) {
        field2610++;
        for (int var2 = 0; var2 < this.field2599; var2++) {
            for (int var4 = 0; var4 < this.field2598; var4++) {
                if (var2 == 0 || var4 == 0 || this.field2599 - 5 <= var2 || this.field2598 - 5 <= var4) {
                    this.field2602[var2][var4] = 16777215;
                } else {
                    this.field2602[var2][var4] = 16777216;
                }
            }
        }
        int var3 = 41 % ((arg0 + 60) / 40);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIB)V")
    private final void method870(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 <= 88) {
            field2626 = 22;
        }
        field2594++;
        this.field2602[arg0][arg2] = class80.method680(this.field2602[arg0][arg2], ~arg1);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIZII)V")
    public final void method871(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = arg6 - this.field2595;
        field2606++;
        int var9 = arg3 - this.field2597;
        int var10 = 256;
        if (arg0 == arg2 || arg0 == 3) {
            int var11 = arg5;
            arg5 = arg1;
            arg1 = var11;
        }
        if (arg4) {
            var10 += 131072;
        }
        for (int var12 = var8; var12 < arg5 + var8; var12++) {
            if (var12 >= 0 && this.field2599 > var12) {
                for (int var13 = var9; var13 < arg1 + var9; var13++) {
                    if (var13 >= 0 && var13 < this.field2598) {
                        this.method870(var12, var10, var13, (byte) 127);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ldd;Ljava/lang/Object;I)V")
    public static final void method872(class26 arg0, Object arg1, int arg2) {
        if (arg2 != -51) {
            return;
        }
        field2604++;
        if (arg0.field624 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field624.peekEvent() != null; var3++) {
            class128.method1007((byte) 87, 1L);
        }
        if (arg1 != null) {
            arg0.field624.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(IIIIZII)V")
    public final void method873(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field2609++;
        int var8 = arg2 - this.field2595;
        int var9 = arg6 - this.field2597;
        if (arg1 <= 59) {
            return;
        }
        if (arg0 == 1 || arg0 == 3) {
            int var10 = arg5;
            arg5 = arg3;
            arg3 = var10;
        }
        int var11 = 256;
        if (arg4) {
            var11 += 131072;
        }
        for (int var12 = var8; var12 < arg5 + var8; var12++) {
            if (var12 >= 0 && this.field2599 > var12) {
                for (int var13 = var9; var13 < arg3 + var9; var13++) {
                    if (var13 >= 0 && var13 < this.field2598) {
                        this.method878(var11, var12, var13, -4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)V")
    public final void method874(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2597;
        int var5 = arg1 - this.field2595;
        this.field2602[var5][var4] = class97.method769(this.field2602[var5][var4], arg0);
        field2615++;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIZ)V")
    public final void method875(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2605++;
        int var7 = arg1 - this.field2597;
        int var8 = arg3 - this.field2595;
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method878(128, var8, var7, arg0 - 5);
                this.method878(8, var8 - 1, var7, -4);
            }
            if (arg4 == 1) {
                this.method878(2, var8, var7, -4);
                this.method878(32, var8, var7 + 1, -4);
            }
            if (arg4 == 2) {
                this.method878(8, var8, var7, -4);
                this.method878(128, var8 + 1, var7, -4);
            }
            if (arg4 == 3) {
                this.method878(32, var8, var7, arg0 - 5);
                this.method878(2, var8, var7 - 1, -4);
            }
        }
        if (arg0 != 1) {
            this.method879(-40, 13, -14, -38, false, 80);
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method878(1, var8, var7, -4);
                this.method878(16, var8 - 1, var7 + 1, -4);
            }
            if (arg4 == 1) {
                this.method878(4, var8, var7, arg0 - 5);
                this.method878(64, var8 + 1, var7 - -1, -4);
            }
            if (arg4 == 2) {
                this.method878(16, var8, var7, -4);
                this.method878(1, var8 + 1, var7 - 1, -4);
            }
            if (arg4 == 3) {
                this.method878(64, var8, var7, -4);
                this.method878(4, var8 - 1, var7 - 1, -4);
            }
        }
        if (arg2 == 2) {
            if (arg4 == 0) {
                this.method878(130, var8, var7, arg0 ^ 0xFFFFFFFD);
                this.method878(8, var8 - 1, var7, arg0 - 5);
                this.method878(32, var8, var7 + 1, -4);
            }
            if (arg4 == 1) {
                this.method878(10, var8, var7, -4);
                this.method878(32, var8, var7 + 1, -4);
                this.method878(128, var8 + 1, var7, arg0 ^ 0xFFFFFFFD);
            }
            if (arg4 == 2) {
                this.method878(40, var8, var7, arg0 - 5);
                this.method878(128, var8 + 1, var7, -4);
                this.method878(2, var8, var7 - 1, -4);
            }
            if (arg4 == 3) {
                this.method878(160, var8, var7, arg0 - 5);
                this.method878(2, var8, var7 - 1, -4);
                this.method878(8, var8 - 1, var7, -4);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method878(65536, var8, var7, arg0 - 5);
                this.method878(4096, var8 - 1, var7, arg0 - 5);
            }
            if (arg4 == 1) {
                this.method878(1024, var8, var7, arg0 ^ 0xFFFFFFFD);
                this.method878(16384, var8, var7 + 1, arg0 ^ 0xFFFFFFFD);
            }
            if (arg4 == 2) {
                this.method878(4096, var8, var7, arg0 - 5);
                this.method878(65536, var8 + 1, var7, arg0 ^ 0xFFFFFFFD);
            }
            if (arg4 == 3) {
                this.method878(16384, var8, var7, -4);
                this.method878(1024, var8, var7 - 1, -4);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method878(512, var8, var7, -4);
                this.method878(8192, var8 - 1, var7 - -1, -4);
            }
            if (arg4 == 1) {
                this.method878(2048, var8, var7, -4);
                this.method878(32768, var8 + 1, var7 + 1, arg0 ^ 0xFFFFFFFD);
            }
            if (arg4 == 2) {
                this.method878(8192, var8, var7, arg0 - 5);
                this.method878(512, var8 + 1, var7 + -1, -4);
            }
            if (arg4 == 3) {
                this.method878(32768, var8, var7, -4);
                this.method878(2048, var8 - 1, var7 + -1, -4);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method878(66560, var8, var7, -4);
            this.method878(4096, var8 - 1, var7, -4);
            this.method878(16384, var8, var7 + 1, -4);
        }
        if (arg4 == 1) {
            this.method878(5120, var8, var7, -4);
            this.method878(16384, var8, var7 + 1, -4);
            this.method878(65536, var8 + 1, var7, -4);
        }
        if (arg4 == 2) {
            this.method878(20480, var8, var7, -4);
            this.method878(65536, var8 + 1, var7, -4);
            this.method878(1024, var8, var7 - 1, arg0 + -5);
        }
        if (arg4 == 3) {
            this.method878(81920, var8, var7, -4);
            this.method878(1024, var8, var7 - 1, -4);
            this.method878(4096, var8 - 1, var7, -4);
            return;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIB)V")
    public final void method876(int arg0, int arg1, byte arg2) {
        int var4 = arg1 - this.field2595;
        field2601++;
        int var5 = arg0 - this.field2597;
        this.field2602[var4][var5] = class97.method769(this.field2602[var4][var5], 262144);
        if (arg2 != -94) {
            this.method881(70, -21, -43, -14, 7, 73, -38, 36);
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(IZIIIII)Z")
    public final boolean method877(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!arg1) {
            this.method876(-75, -29, (byte) 111);
        }
        field2608++;
        if (arg3 == arg4 && arg0 == arg5) {
            return true;
        }
        int var8 = arg5 - this.field2597;
        int var9 = arg0 - this.field2597;
        int var10 = arg4 - this.field2595;
        int var11 = arg3 - this.field2595;
        if (arg6 == 6 || arg6 == 7) {
            if (arg6 == 7) {
                arg2 = arg2 + 2 & 0x3;
            }
            if (arg2 == 0) {
                if (var10 + 1 == var11 && var8 == var9 && (this.field2602[var11][var8] & 0x80) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var8 && (this.field2602[var11][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var10 - 1 == var11 && var8 == var9 && (this.field2602[var11][var8] & 0x8) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var8 && (this.field2602[var11][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 - 1 == var11 && var8 == var9 && (this.field2602[var11][var8] & 0x8) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 + 1 == var8 && (this.field2602[var11][var8] & 0x20) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var10 + 1 == var11 && var8 == var9 && (this.field2602[var11][var8] & 0x80) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 + 1 == var8 && (this.field2602[var11][var8] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg6 == 8) {
            if (var10 == var11 && var9 + 1 == var8 && (this.field2602[var11][var8] & 0x20) == 0) {
                return true;
            }
            if (var10 == var11 && var9 - 1 == var8 && (this.field2602[var11][var8] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var11 && var8 == var9 && (this.field2602[var11][var8] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var11 && var8 == var9 && (this.field2602[var11][var8] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIII)V")
    private final void method878(int arg0, int arg1, int arg2, int arg3) {
        this.field2602[arg1][arg2] = class97.method769(this.field2602[arg1][arg2], arg0);
        field2621++;
        if (arg3 != -4) {
            this.field2598 = -48;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIZI)V")
    public final void method879(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field2603++;
        int var7 = arg5 - this.field2595;
        int var8 = 24 / ((-arg0 - 17) / 62);
        int var9 = arg2 - this.field2597;
        if (arg1 == 0) {
            if (arg3 == 0) {
                this.method870(var7, 128, var9, (byte) 127);
                this.method870(var7 - 1, 8, var9, (byte) 93);
            }
            if (arg3 == 1) {
                this.method870(var7, 2, var9, (byte) 101);
                this.method870(var7, 32, var9 + 1, (byte) 116);
            }
            if (arg3 == 2) {
                this.method870(var7, 8, var9, (byte) 120);
                this.method870(var7 + 1, 128, var9, (byte) 103);
            }
            if (arg3 == 3) {
                this.method870(var7, 32, var9, (byte) 100);
                this.method870(var7, 2, var9 - 1, (byte) 104);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg3 == 0) {
                this.method870(var7, 1, var9, (byte) 105);
                this.method870(var7 - 1, 16, var9 + 1, (byte) 111);
            }
            if (arg3 == 1) {
                this.method870(var7, 4, var9, (byte) 90);
                this.method870(var7 + 1, 64, var9 + 1, (byte) 102);
            }
            if (arg3 == 2) {
                this.method870(var7, 16, var9, (byte) 102);
                this.method870(var7 + 1, 1, var9 - 1, (byte) 97);
            }
            if (arg3 == 3) {
                this.method870(var7, 64, var9, (byte) 116);
                this.method870(var7 - 1, 4, var9 - 1, (byte) 123);
            }
        }
        if (arg1 == 2) {
            if (arg3 == 0) {
                this.method870(var7, 130, var9, (byte) 109);
                this.method870(var7 - 1, 8, var9, (byte) 107);
                this.method870(var7, 32, var9 + 1, (byte) 121);
            }
            if (arg3 == 1) {
                this.method870(var7, 10, var9, (byte) 96);
                this.method870(var7, 32, var9 + 1, (byte) 125);
                this.method870(var7 + 1, 128, var9, (byte) 104);
            }
            if (arg3 == 2) {
                this.method870(var7, 40, var9, (byte) 109);
                this.method870(var7 + 1, 128, var9, (byte) 99);
                this.method870(var7, 2, var9 - 1, (byte) 92);
            }
            if (arg3 == 3) {
                this.method870(var7, 160, var9, (byte) 108);
                this.method870(var7, 2, var9 - 1, (byte) 119);
                this.method870(var7 - 1, 8, var9, (byte) 95);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg1 == 0) {
            if (arg3 == 0) {
                this.method870(var7, 65536, var9, (byte) 125);
                this.method870(var7 - 1, 4096, var9, (byte) 108);
            }
            if (arg3 == 1) {
                this.method870(var7, 1024, var9, (byte) 106);
                this.method870(var7, 16384, var9 + 1, (byte) 125);
            }
            if (arg3 == 2) {
                this.method870(var7, 4096, var9, (byte) 108);
                this.method870(var7 + 1, 65536, var9, (byte) 95);
            }
            if (arg3 == 3) {
                this.method870(var7, 16384, var9, (byte) 104);
                this.method870(var7, 1024, var9 - 1, (byte) 122);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg3 == 0) {
                this.method870(var7, 512, var9, (byte) 90);
                this.method870(var7 - 1, 8192, var9 + 1, (byte) 103);
            }
            if (arg3 == 1) {
                this.method870(var7, 2048, var9, (byte) 112);
                this.method870(var7 + 1, 32768, var9 + 1, (byte) 107);
            }
            if (arg3 == 2) {
                this.method870(var7, 8192, var9, (byte) 99);
                this.method870(var7 + 1, 512, var9 - 1, (byte) 125);
            }
            if (arg3 == 3) {
                this.method870(var7, 32768, var9, (byte) 98);
                this.method870(var7 - 1, 2048, var9 - 1, (byte) 109);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method870(var7, 66560, var9, (byte) 119);
            this.method870(var7 - 1, 4096, var9, (byte) 126);
            this.method870(var7, 16384, var9 + 1, (byte) 109);
        }
        if (arg3 == 1) {
            this.method870(var7, 5120, var9, (byte) 91);
            this.method870(var7, 16384, var9 + 1, (byte) 109);
            this.method870(var7 + 1, 65536, var9, (byte) 114);
        }
        if (arg3 == 2) {
            this.method870(var7, 20480, var9, (byte) 114);
            this.method870(var7 + 1, 65536, var9, (byte) 97);
            this.method870(var7, 1024, var9 - 1, (byte) 99);
        }
        if (arg3 == 3) {
            this.method870(var7, 81920, var9, (byte) 94);
            this.method870(var7, 1024, var9 - 1, (byte) 115);
            this.method870(var7 - 1, 4096, var9, (byte) 91);
            return;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(IIB)V")
    public final void method880(int arg0, int arg1, byte arg2) {
        if (arg2 != 110) {
            method866(19, -79, 72, -51, -83);
        }
        int var4 = arg0 - this.field2595;
        int var5 = arg1 - this.field2597;
        field2611++;
        this.field2602[var4][var5] = class80.method680(this.field2602[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method881(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg1 + arg3 - 1;
        int var10 = 121 / ((-arg2 - 22) / 40);
        field2600++;
        int var11 = arg0 + arg4 - 1;
        if (arg7 >= arg1 && arg7 <= var9 && arg5 >= arg4 && var11 >= arg5) {
            return true;
        } else if (arg1 - 1 == arg7 && arg5 >= arg4 && var11 >= arg5 && (this.field2602[arg7 - this.field2595][arg5 - this.field2597] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg7 && arg5 >= arg4 && var11 >= arg5 && (this.field2602[arg7 - this.field2595][arg5 - this.field2597] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if (arg4 - 1 == arg5 && arg1 <= arg7 && var9 >= arg7 && (this.field2602[arg7 - this.field2595][arg5 - this.field2597] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg5 && arg7 >= arg1 && var9 >= arg7 && (this.field2602[arg7 - this.field2595][arg5 - this.field2597] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(II)V")
    public class106(int arg0, int arg1) {
        this.field2598 = arg1;
        this.field2599 = arg0;
        this.field2602 = new int[this.field2599][this.field2598];
        this.field2595 = 0;
        this.method869(76);
    }
}
