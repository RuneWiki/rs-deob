import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class53 {

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "Lad;")
    private class19 field538 = new class19(64);

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "Lad;")
    public class19 field539 = new class19(50);

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "Lkga;")
    public class558 field540 = new class558(250);

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "Lve;")
    private class248 field541 = new class248();

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "Lhda;")
    private class264 field543;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "Z")
    private boolean field536;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "Ltf;")
    public class701 field518;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "Ltf;")
    private class701 field527;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
    public int field537;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public int field522;

    @OriginalMember(owner = "client!fb", name = "B", descriptor = "[Ljava/lang/String;")
    private String[] field545;

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field542;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "Lcq;")
    public static class110 field519 = new class110(39, 6);

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    public static int field533 = 0;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "I")
    public int field544;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "Lhda;")
    public static class264 field531;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field535;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILr;IIIZLea;I)Lf;", line = 3)
    public final class534 method271(int arg0, class564 arg1, int arg2, int arg3, int arg4, boolean arg5, class158 arg6, int arg7) {
        field528++;
        this.field541.field3070 = arg3;
        this.field541.field3074 = arg7;
        this.field541.field3072 = arg2;
        this.field541.field3068 = arg0;
        if (arg5) {
            this.method277(-40, (byte) 122);
        }
        this.field541.field3071 = arg6 != null;
        this.field541.field3081 = arg1.field8053;
        this.field541.field3076 = arg4;
        return (class534) this.field540.method3168(20548, this.field541);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)Llo;", line = 22)
    public final class487 method272(int arg0, int arg1) {
        field524++;
        class19 var3 = this.field538;
        class487 var4;
        synchronized (this.field538) {
            var4 = (class487) this.field538.method78(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class701 var5 = this.field527;
        byte[] var6;
        synchronized (this.field527) {
            var6 = this.field527.method3854((byte) 27, class39.method201(arg0, false), class563.method3195(-1, arg0));
        }
        class487 var7 = new class487();
        var7.field7077 = arg0;
        var7.field7079 = this;
        var7.field7063 = new String[] { null, null, class198.field2292.method1195((byte) 62, this.field537), null, null };
        if (arg1 != -11824) {
            return null;
        }
        var7.field7047 = new String[] { null, null, null, null, class198.field2293.method1195((byte) 62, this.field537) };
        if (var6 != null) {
            var7.method2811((byte) -83, new class115(var6));
        }
        var7.method2820((byte) -26);
        if (var7.field7034 != -1) {
            var7.method2824(this.method272(var7.field7034, -11824), this.method272(var7.field7017, arg1), -127);
        }
        if (var7.field7030 != -1) {
            var7.method2826(this.method272(var7.field7018, -11824), (byte) -116, this.method272(var7.field7030, -11824));
        }
        if (!this.field536 && var7.field7068) {
            var7.field7027 = class198.field2290.method1195((byte) 62, this.field537);
            var7.field7033 = null;
            var7.field7012 = 0;
            var7.field7047 = this.field542;
            var7.field7045 = false;
            var7.field7063 = this.field545;
            if (var7.field7054 != null) {
                boolean var8 = false;
                for (class333 var9 = var7.field7054.method3674(127); var9 != null; var9 = var7.field7054.method3672(-1)) {
                    class166 var10 = this.field543.method1562((int) var9.field4176, (byte) 118);
                    if (var10.field1860) {
                        var9.method1922(112);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field7054 = null;
                }
            }
        }
        class19 var11 = this.field538;
        synchronized (this.field538) {
            this.field538.method92(1, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V", line = 100)
    public final void method273(boolean arg0) {
        field534++;
        class558 var2 = this.field540;
        synchronized (this.field540) {
            this.field540.method3165(-10859);
            if (arg0) {
                this.method273(true);
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZI)V", line = 114)
    public final void method274(boolean arg0, int arg1) {
        if (arg1 != -1) {
            this.field537 = 63;
        }
        field521++;
        if (arg0 != this.field536) {
            this.field536 = arg0;
            this.method278(-12404);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILr;IZLla;ILea;ZBLr;II)Lf;", line = 130)
    public final class534 method275(int arg0, class564 arg1, int arg2, boolean arg3, class413 arg4, int arg5, class158 arg6, boolean arg7, byte arg8, class564 arg9, int arg10, int arg11) {
        field529++;
        class534 var13 = this.method271(arg2, arg9, arg0, arg11, arg10, false, arg6, arg5);
        if (var13 != null) {
            return var13;
        }
        class487 var14 = this.method272(arg10, -11824);
        if (arg11 > 1 && var14.field7090 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg11 >= var14.field7014[var16] && var14.field7014[var16] != 0) {
                    var15 = var14.field7090[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method272(var15, -11824);
            }
        }
        int[] var17 = var14.method2821(arg11, arg0, arg2, (byte) -59, arg6, arg3, arg4, arg9, arg5, arg1);
        if (var17 == null) {
            return null;
        }
        if (arg8 != 85) {
            this.method273(true);
        }
        class534 var18;
        if (arg7) {
            var18 = arg1.method1017(var17, 0, 36, 36, 32);
        } else {
            var18 = arg9.method1017(var17, 0, 36, 36, 32);
        }
        if (!arg7) {
            class248 var19 = new class248();
            var19.field3070 = arg11;
            var19.field3074 = arg5;
            var19.field3081 = arg9.field8053;
            var19.field3072 = arg0;
            var19.field3076 = arg10;
            var19.field3068 = arg2;
            var19.field3071 = arg6 != null;
            this.field540.method3160((byte) -18, var19, var18);
        }
        return var18;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V", line = 197)
    public static void method276(byte arg0) {
        field519 = null;
        field535 = null;
        if (arg0 == -39) {
            field531 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)V", line = 210)
    public final void method277(int arg0, byte arg1) {
        field532++;
        class19 var3 = this.field538;
        synchronized (this.field538) {
            this.field538.method83((byte) -2, arg0);
        }
        class19 var4 = this.field539;
        synchronized (this.field539) {
            this.field539.method83((byte) -2, arg0);
        }
        class558 var5 = this.field540;
        synchronized (this.field540) {
            this.field540.method3159(arg0, false);
            int var6 = -83 % ((-arg1 - 57) / 35);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V", line = 228)
    public final void method278(int arg0) {
        class19 var2 = this.field538;
        synchronized (this.field538) {
            this.field538.method88(arg0 ^ 0xFFFFCFFF);
        }
        field523++;
        class19 var3 = this.field539;
        synchronized (this.field539) {
            this.field539.method88(94);
            if (arg0 != -12404) {
                this.method278(-21);
            }
        }
        class558 var4 = this.field540;
        synchronized (this.field540) {
            this.field540.method3165(-10859);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IILjava/lang/String;JIZILjava/lang/String;ZII)V", line = 252)
    public static final void method279(int arg0, int arg1, String arg2, long arg3, int arg4, boolean arg5, int arg6, String arg7, boolean arg8, int arg9, int arg10) {
        field520++;
        if (class188.field2148 || class661.field9266 >= 500) {
            return;
        }
        int var12 = arg9 == -1 ? class178.field1992 : arg9;
        class336 var13 = new class336(arg7, arg2, var12, arg6, arg0, arg3, arg10, arg1, arg5, arg8);
        class694.field9730.method3425(var13, false);
        if (arg4 <= 99) {
            field519 = null;
        }
        class661.field9266++;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V", line = 272)
    public final void method280(int arg0) {
        class19 var2 = this.field538;
        synchronized (this.field538) {
            this.field538.method80((byte) 69);
        }
        field530++;
        class19 var3 = this.field539;
        synchronized (this.field539) {
            this.field539.method80((byte) 122);
        }
        class558 var4 = this.field540;
        synchronized (this.field540) {
            this.field540.method3166((byte) 80);
        }
        if (arg0 != 36) {
            this.method273(true);
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V", line = 301)
    public final void method281(int arg0) {
        field525++;
        class19 var2 = this.field539;
        synchronized (this.field539) {
            this.field539.method88(94);
            int var3 = 82 / ((arg0 + 55) / 56);
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(ZI)V", line = 316)
    public final void method282(boolean arg0, int arg1) {
        field526++;
        this.field544 = arg1;
        if (!arg0) {
            this.field522 = -91;
        }
        class19 var3 = this.field539;
        synchronized (this.field539) {
            this.field539.method88(113);
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lqh;IZLhda;Ltf;Ltf;)V", line = 354)
    public class53(class320 arg0, int arg1, boolean arg2, class264 arg3, class701 arg4, class701 arg5) {
        this.field543 = arg3;
        this.field536 = arg2;
        this.field518 = arg5;
        this.field527 = arg4;
        this.field537 = arg1;
        if (this.field527 == null) {
            this.field522 = 0;
        } else {
            int var7 = this.field527.method3877(100) - 1;
            this.field522 = var7 * 256 + this.field527.method3883(var7, 0);
        }
        this.field545 = new String[] { null, null, class198.field2292.method1195((byte) 62, this.field537), null, null };
        this.field542 = new String[] { null, null, null, null, class198.field2293.method1195((byte) 62, this.field537) };
    }
}
