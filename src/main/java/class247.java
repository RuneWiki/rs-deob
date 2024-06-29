import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class247 {

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "Z")
    public boolean field3055 = false;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public int field3048 = 1;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public int field3050 = 2;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "Z")
    public boolean field3057 = false;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public int field3056 = 64;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public int field3063 = 64;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public int field3064 = -1;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "Lps;")
    public static class469 field3051 = new class469(8, 17);

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
    public static int field3061 = 0;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "Lwp;")
    public static class452 field3065 = null;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "Lfq;")
    public static class122 field3060;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "Ltf;")
    public static class701 field3053;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V", line = 8)
    public static void method1453(boolean arg0) {
        field3051 = null;
        if (!arg0) {
            field3051 = null;
        }
        field3053 = null;
        field3065 = null;
        field3060 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIZ)V", line = 24)
    public static final void method1454(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg4 == -23) {
            if ((arg5 ? class639.field9075.field6776 : class639.field9075.field6773) != 0 && arg3 != 0 && class309.field3825 < 50 && arg2 != -1) {
                class89.field891[class309.field3825++] = new class340((byte) (arg5 ? 3 : 2), arg2, arg3, arg1, arg0, 0);
            }
            field3066++;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIZIIIIBF)[[I", line = 44)
    public static final int[][] method1455(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, float arg8) {
        field3059++;
        int[][] var9 = new int[arg4][arg3];
        class36 var10 = new class36();
        var10.field366 = arg0;
        var10.field367 = arg2;
        var10.field354 = (int) (arg8 * 4096.0F);
        var10.field361 = arg5;
        int var11 = -75 / ((arg7 - 32) / 41);
        var10.field358 = arg1;
        var10.method34((byte) 23);
        class611.method3405(arg3, false, arg4);
        for (int var12 = 0; var12 < arg4; var12++) {
            var10.method191(118, var12, var9[var12]);
        }
        return var9;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lnp;III)V", line = 74)
    private final void method1456(class115 arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 1) {
            this.field3064 = arg0.method643((byte) -77);
            if (this.field3064 == 65535) {
                this.field3064 = -1;
            }
        } else if (arg3 == 2) {
            this.field3063 = arg0.method643((byte) -77) + 1;
            this.field3056 = arg0.method643((byte) -77) + 1;
        } else if (arg3 == 3) {
            arg0.method657(false);
        } else if (arg3 == 4) {
            this.field3050 = arg0.method620((byte) -22);
        } else if (arg3 == 5) {
            this.field3048 = arg0.method620((byte) 79);
        } else if (arg3 == 6) {
            this.field3057 = true;
        } else if (arg3 == 7) {
            this.field3055 = true;
        }
        field3052++;
        if (arg1 != -5) {
            method1458(112);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILnp;I)V", line = 124)
    public final void method1457(int arg0, class115 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method620((byte) 28);
            if (var4 == 0) {
                if (arg2 < 30) {
                    return;
                }
                field3062++;
                return;
            }
            this.method1456(arg1, -5, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V", line = 151)
    public static final void method1458(int arg0) {
        if (arg0 != -3) {
            field3053 = null;
        }
        field3067++;
        class605.field8500.method3438(16);
        class552.field7885.method3438(arg0 ^ 0xFFFFFFED);
        for (class336 var1 = (class336) class694.field9730.method3434((byte) 2); var1 != null; var1 = (class336) class694.field9730.method3430(true)) {
            int var18 = var1.field4231;
            if (var18 < 1000) {
                var1.method1922(91);
                if (var18 == 11 || var18 == 22 || var18 == 16 || var18 == 50 || var18 == 23 || var18 == 25 || var18 == 3) {
                    class552.field7885.method3425(var1, false);
                } else {
                    class605.field8500.method3425(var1, false);
                }
            }
        }
        class605.field8500.method3428(class694.field9730, -50);
        class552.field7885.method3428(class694.field9730, -119);
        if (class661.field9266 <= 1) {
            class348.field4664 = null;
        } else if (class701.field9845 && class140.field1549.method1945(81, false) && class661.field9266 > 2) {
            class348.field4664 = (class336) class694.field9730.field8677.field4174.field4174;
        } else {
            class348.field4664 = (class336) class694.field9730.field8677.field4174;
        }
        int var2 = -1;
        class103 var3 = (class103) class156.field1744.method3434((byte) 2);
        if (var3 != null) {
            var2 = var3.method192(-58);
        }
        if (!class188.field2148) {
            if (var2 == 0 && (class436.field6145 == 1 && class661.field9266 > 2 || class602.method3370(arg0 ^ 0x7D2))) {
                var2 = 2;
            }
            if (var2 == 2 && class661.field9266 > 0 && var3 != null) {
                if (class497.field7199 == null && class667.field9317 == 0) {
                    class599.method3354(var3.method194((byte) -106), var3.method193((byte) -87), 24320);
                } else {
                    class89.field898 = 2;
                }
            }
            if (var2 == 0 && class661.field9266 > 0) {
                class150.method818(-19202);
            }
            if (class497.field7199 != null || class667.field9317 != 0) {
                return;
            }
            class633.field8923 = null;
            class89.field898 = 0;
            return;
        }
        if (var2 == -1) {
            int var4 = class108.field1166.method253(true);
            int var5 = class108.field1166.method252(arg0 ^ 0xFFFFFFFA);
            if (var4 < class200.field2357 - 10 || (class598.field8426 + class200.field2357 + 10) < var4 || (class376.field5112 - 10) > var5 || (class376.field5112 - (-class361.field4841 - 10)) < var5) {
                class45.method239((byte) -68);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var6 = class200.field2357;
        int var7 = class376.field5112;
        int var8 = class598.field8426;
        int var9 = var3.method194((byte) -106);
        int var10 = var3.method193((byte) -60);
        int var11 = -1;
        for (int var12 = 0; var12 < class661.field9266; var12++) {
            if (class213.field2597) {
                int var16 = (class661.field9266 - (var12 + 1)) * 16 + var7 + 33;
                if (var6 < var9 && var9 < var6 + var8 && var16 - 13 < var10 && var10 < var16 + 4) {
                    var11 = var12;
                }
            } else {
                int var17 = var7 + ((class661.field9266 + -1 + -var12) * 16) + 31;
                if (var6 < var9 && var6 + var8 > var9 && var10 > (var17 - 13) && var10 < var17 + 3) {
                    var11 = var12;
                }
            }
        }
        if (var11 != -1) {
            int var13 = 0;
            class217 var14 = new class217(class694.field9730);
            for (class336 var15 = (class336) var14.method1270(true); var15 != null; var15 = (class336) var14.method1268(-15212)) {
                if (var11 == var13) {
                    class620.method3457(var15, var9, var10, 1);
                }
                var13++;
            }
        }
        class45.method239((byte) -68);
        return;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILot;Lr;)I", line = 341)
    public static final int method1459(int arg0, class226 arg1, class564 arg2) {
        field3049++;
        if (arg0 != 14917) {
            method1454(-89, -12, -9, 108, 72, true);
        }
        if (arg1.field2795 != -1) {
            return arg1.field2795;
        }
        if (arg1.field2792 != -1) {
            class295 var3 = arg2.field8050.method140(arg1.field2792, arg0 ^ 0x391B);
            if (!var3.field3674) {
                return var3.field3683;
            }
        }
        return arg1.field2799;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)Z", line = 372)
    public static final boolean method1460(int arg0, int arg1) {
        field3054++;
        if (arg0 > -68) {
            field3051 = null;
        }
        for (class336 var2 = (class336) class694.field9730.method3434((byte) 2); var2 != null; var2 = (class336) class694.field9730.method3430(true)) {
            if (class231.method1388(-113, var2.field4231) && ((long) arg1) == var2.field4226) {
                return true;
            }
        }
        return false;
    }
}
