import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class413 extends class427 implements class226 {

    @OriginalMember(owner = "client!sj", name = "U", descriptor = "Z")
    private boolean field5654 = false;

    @OriginalMember(owner = "client!sj", name = "lb", descriptor = "Lnb;")
    public class356 field5671;

    @OriginalMember(owner = "client!sj", name = "Z", descriptor = "Z")
    private boolean field5659;

    @OriginalMember(owner = "client!sj", name = "nb", descriptor = "Lin;")
    public static class380 field5673 = new class380(24, -1);

    @OriginalMember(owner = "client!sj", name = "pb", descriptor = "Z")
    public static boolean field5675 = false;

    @OriginalMember(owner = "client!sj", name = "S", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!sj", name = "T", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!sj", name = "V", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!sj", name = "X", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!sj", name = "Y", descriptor = "I")
    public static int field5658;

    @OriginalMember(owner = "client!sj", name = "ab", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!sj", name = "bb", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!sj", name = "cb", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!sj", name = "db", descriptor = "I")
    public static int field5663;

    @OriginalMember(owner = "client!sj", name = "eb", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!sj", name = "fb", descriptor = "I")
    public static int field5665;

    @OriginalMember(owner = "client!sj", name = "gb", descriptor = "I")
    public static int field5666;

    @OriginalMember(owner = "client!sj", name = "hb", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!sj", name = "ib", descriptor = "I")
    public static int field5668;

    @OriginalMember(owner = "client!sj", name = "jb", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!sj", name = "kb", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!sj", name = "mb", descriptor = "I")
    public static int field5672;

    @OriginalMember(owner = "client!sj", name = "ob", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!sj", name = "W", descriptor = "Lmg;")
    private class248 field5656;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(BLha;)Lmg;", line = 3)
    public final class248 method205(byte arg0, class475 arg1) {
        ++field5655;
        if (arg0 != 45) {
            field5675 = true;
        }
        return this.field5656;
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lha;Lsea;IIIIIZIIIII)V", line = 14)
    public class413(class475 arg0, class416 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field5671 = new class356(arg0, arg1, arg10, arg11, super.field10361, arg3, this, arg7, arg12);
        this.field5659 = ~arg1.field5754 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILha;)V", line = 24)
    public final void method1163(int arg0, class475 arg1) {
        this.field5671.method2158(arg1, -9152);
        if (arg0 == 18030) {
            ++field5665;
        }
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(B)V", line = 35)
    public final void method1172(byte arg0) {
        ++field5661;
        if (arg0 < 72) {
            this.method204((class475) null, -8);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lha;I)Luh;", line = 45)
    public final class162 method204(class475 arg0, int arg1) {
        ++field5663;
        class233 var3 = this.field5671.method2152(true, arg0, -128, 2048, false);
        if (var3 == null) {
            return null;
        } else {
            class765 var4 = arg0.method457();
            var4.method1568(super.field5923 + super.field10347, super.field10358, super.field5927 + super.field10350);
            class162 var5 = class527.method3085(1, this.field5659, 0);
            if (arg1 != -1) {
                this.method1172((byte) -90);
            }
            int var6 = super.field10347 >> 9;
            int var7 = super.field10350 >> 9;
            this.field5671.method2148(var7, (byte) 111, var6, var4, var3, var7, true, arg0, var6);
            if (class765.field10581) {
                var3.method546(var4, var5.field2500[0], class349.field4956, 0);
            } else {
                var3.method575(var4, var5.field2500[0], 0);
            }
            if (this.field5671.field5071 != null) {
                class667 var8 = this.field5671.field5071.method1346();
                if (class765.field10581) {
                    arg0.method429(var8, class349.field4956);
                } else {
                    arg0.method455(var8);
                }
            }
            this.field5654 = var3.method558() || this.field5671.field5071 != null;
            if (this.field5656 != null) {
                class182.method1319(super.field10350, super.field10347, super.field10358, this.field5656, var3, (byte) 59);
            } else {
                this.field5656 = class229.method1563(super.field10350, super.field10358, (byte) -128, var3, super.field10347);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)Z", line = 98)
    public final boolean method1170(int arg0) {
        if (arg0 != 16383) {
            this.method1175((byte) 70);
        }
        ++field5669;
        return false;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)Z", line = 110)
    public final boolean method1164(byte arg0) {
        ++field5672;
        if (arg0 != 4) {
            this.method1170(58);
        }
        return this.field5671.method2155((byte) -128);
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(Z)I", line = 122)
    public final int method1173(boolean arg0) {
        ++field5674;
        return !arg0 ? 34 : this.field5671.method2159(-115);
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(ILha;)V", line = 133)
    public final void method192(int arg0, class475 arg1) {
        ++field5662;
        class233 var3 = this.field5671.method2152(true, arg1, -120, 262144, false);
        if (arg0 < 2) {
            method2433(-123, -4, 41, (int[]) null, (Object[]) null);
        }
        if (var3 != null) {
            int var4 = super.field10347 >> 9;
            int var5 = super.field10350 >> 9;
            class765 var6 = arg1.method457();
            var6.method1568(super.field10347, super.field10358, super.field10350);
            this.field5671.method2148(var5, (byte) 111, var4, var6, var3, var5, false, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "(I)I", line = 157)
    public final int method1167(int arg0) {
        if (arg0 < 75) {
            this.field5654 = true;
        }
        ++field5658;
        return this.field5671.method2147(52);
    }

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "(I)V", line = 169)
    public static void method2431(int arg0) {
        if (arg0 != -1) {
            field5673 = null;
        }
        field5673 = null;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(ILha;)V", line = 183)
    public final void method1169(int arg0, class475 arg1) {
        if (arg0 == -10526) {
            ++field5664;
            this.field5671.method2157(arg1, (byte) -63);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)I", line = 195)
    public final int method1166(int arg0) {
        ++field5670;
        int var2 = 45 / ((arg0 - 14) / 62);
        return this.field5671.field5067;
    }

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "(B)Z", line = 205)
    public final boolean method1175(byte arg0) {
        ++field5666;
        if (arg0 < 38) {
            this.field5656 = null;
        }
        return this.field5654;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BIILha;)Z", line = 217)
    public final boolean method198(byte arg0, int arg1, int arg2, class475 arg3) {
        ++field5653;
        class233 var5 = this.field5671.method2152(false, arg3, -128, 131072, false);
        if (var5 == null) {
            return false;
        } else {
            class765 var6 = arg3.method457();
            int var7 = 38 % ((51 - arg0) / 51);
            var6.method1568(super.field5923 + super.field10347, super.field10358, super.field5927 + super.field10350);
            return class765.field10581 ? var5.method584(arg1, arg2, var6, false, 0, class349.field4956) : var5.method589(arg1, arg2, var6, false, 0);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lol;I)V", line = 240)
    public static final void method2432(class431 arg0, int arg1) {
        ++field5660;
        if (arg0.field6002.length + -arg0.field5983 >= 1) {
            int var2 = arg0.method2557(14929);
            if (~var2 <= -1 && ~var2 >= -2) {
                if (~(arg0.field6002.length + -arg0.field5983) <= -3) {
                    int var3 = arg0.method2565((byte) -123);
                    if (~(var3 * 6) >= ~(arg0.field6002.length + -arg0.field5983)) {
                        for (int var4 = 0; ~var4 > ~var3; ++var4) {
                            int var5 = arg0.method2565((byte) -97);
                            int var6 = arg0.method2526(arg1 + 14487);
                            if (~class362.field5135.length < ~var5 && class769.field10616[var5] && (~class402.field5548.method1738(false, var5).field3397 != -50 || var6 >= -1 && ~var6 >= -2)) {
                                class362.field5135[var5] = var6;
                            }
                        }
                        if (arg1 != -14470) {
                            field5673 = null;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(B)I", line = 289)
    public final int method1174(byte arg0) {
        int var2 = -50 / ((-63 - arg0) / 47);
        ++field5657;
        return this.field5671.field5040;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(III[I[Ljava/lang/Object;)V", line = 301)
    public static final void method2433(int arg0, int arg1, int arg2, int[] arg3, Object[] arg4) {
        if (arg1 != 2) {
            method2433(-83, 65, -51, (int[]) null, (Object[]) null);
        }
        ++field5668;
        if (arg0 > arg2) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg2;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            Object var8 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var8;
            int var9 = var7 != Integer.MAX_VALUE ? 1 : 0;
            for (int var10 = arg2; ~arg0 < ~var10; ++var10) {
                if ((var9 & var10) + var7 > arg3[var10]) {
                    int var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    Object var12 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6++] = var12;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg4[arg0] = arg4[var6];
            arg4[var6] = var8;
            method2433(var6 + -1, arg1, arg2, arg3, arg4);
            method2433(arg0, arg1, var6 - -1, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lpe;B)V", line = 359)
    public final void method2434(class685 arg0, byte arg1) {
        if (arg1 != -100) {
            method2431(64);
        }
        this.field5671.method2153(arg0, true);
        ++field5652;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)I", line = 370)
    public final int method1165(byte arg0) {
        if (arg0 <= 89) {
            return 118;
        } else {
            ++field5667;
            return this.field5671.field5054;
        }
    }
}
