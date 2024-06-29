import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class63 {

    @OriginalMember(owner = "client!nv", name = "l", descriptor = "Lad;")
    private class19 field645 = new class19(64);

    @OriginalMember(owner = "client!nv", name = "t", descriptor = "Lad;")
    public class19 field653 = new class19(50);

    @OriginalMember(owner = "client!nv", name = "v", descriptor = "Lad;")
    public class19 field655 = new class19(5);

    @OriginalMember(owner = "client!nv", name = "r", descriptor = "Ltf;")
    private class701 field651;

    @OriginalMember(owner = "client!nv", name = "s", descriptor = "Z")
    public boolean field652;

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "Ltf;")
    public class701 field636;

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "Lqh;")
    public class320 field639;

    @OriginalMember(owner = "client!nv", name = "q", descriptor = "Lcq;")
    public static class110 field650 = new class110(16, 2);

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!nv", name = "i", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!nv", name = "k", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!nv", name = "m", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!nv", name = "n", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!nv", name = "o", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!nv", name = "p", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!nv", name = "w", descriptor = "I")
    public int field656;

    @OriginalMember(owner = "client!nv", name = "x", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!nv", name = "u", descriptor = "Lqm;")
    public static class380 field654;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)V")
    public static void method332(byte arg0) {
        if (arg0 < 110) {
            field654 = null;
        }
        field650 = null;
        field654 = null;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V")
    public static final void method333(int arg0) {
        class275.method1614(false, -31157);
        field644++;
        if (class644.field9098 >= 0 && class644.field9098 != 0) {
            class434.method2489(class644.field9098, (byte) 82);
            class644.field9098 = -1;
        }
        if (arg0 < 95) {
            field654 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method334(int arg0, String arg1) {
        if (arg0 != 9394) {
            field654 = null;
        }
        field648++;
        return class413.method2315((byte) -104, 10, arg1, true);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IZ)V")
    public final void method335(int arg0, boolean arg1) {
        field649++;
        if (this.field652 == arg1) {
            return;
        }
        this.field652 = arg1;
        this.method338(false);
        if (arg0 != 9276) {
            this.method339(-97, -66);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(II)V")
    public final void method336(int arg0, int arg1) {
        field638++;
        class19 var3 = this.field645;
        synchronized (this.field645) {
            this.field645.method83((byte) -2, arg1);
        }
        class19 var4 = this.field653;
        synchronized (this.field653) {
            this.field653.method83((byte) -2, arg1);
        }
        class19 var5 = this.field655;
        synchronized (this.field655) {
            this.field655.method83((byte) -2, arg1);
            if (arg0 <= 30) {
                method333(-123);
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)V")
    public final void method337(int arg0) {
        class19 var2 = this.field653;
        synchronized (this.field653) {
            this.field653.method88(119);
        }
        field641++;
        class19 var3 = this.field655;
        synchronized (this.field655) {
            this.field655.method88(98);
        }
        int var4 = 100 % ((66 - arg0) / 50);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z)V")
    public final void method338(boolean arg0) {
        field657++;
        class19 var2 = this.field645;
        synchronized (this.field645) {
            this.field645.method88(85);
        }
        class19 var3 = this.field653;
        synchronized (this.field653) {
            this.field653.method88(79);
        }
        class19 var4 = this.field655;
        synchronized (this.field655) {
            this.field655.method88(74);
        }
        if (arg0) {
            this.method336(-27, -32);
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(II)V")
    public final void method339(int arg0, int arg1) {
        this.field656 = arg1;
        field643++;
        class19 var3 = this.field653;
        synchronized (this.field653) {
            this.field653.method88(110);
        }
        class19 var4 = this.field655;
        synchronized (this.field655) {
            this.field655.method88(90);
            if (arg0 != -1) {
                this.field645 = null;
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(III)Z")
    public static final boolean method340(int arg0, int arg1, int arg2) {
        field634++;
        if (arg2 == -25221) {
            return (arg1 & 0x800) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILr;IIILfa;I)V")
    public static final void method341(int arg0, class564 arg1, int arg2, int arg3, int arg4, class524 arg5, int arg6) {
        field640++;
        if (class96.field1028 < 100) {
            class610.method3397(arg1, 17, arg5);
        }
        arg1.method982(arg4, arg6, arg3 + arg4, arg2 + arg6);
        if (class96.field1028 < 100) {
            byte var7 = 20;
            int var8 = arg3 / 2 + arg4;
            int var9 = arg2 / 2 + arg6 - (var7 + 18);
            arg1.method1022(arg4, arg6, arg3, arg2, -16777216, 0);
            arg1.method999(var8 - 152, var9, 304, 34, class158.field1782[class249.field3090].getRGB(), 0);
            arg1.method1022(var8 - 150, var9 + 2, class96.field1028 * 3, 30, class312.field3853[class249.field3090].getRGB(), 0);
            class282.field3535.method2325(class198.field2303.method1195((byte) 62, class504.field7267), class414.field5556[class249.field3090].getRGB(), 1292016200, -1, var7 + var9, var8);
            return;
        }
        int var10 = class81.field838 - ((int) ((float) arg3 / class482.field6942));
        int var11 = (int) ((float) arg2 / class482.field6942) + class36.field373;
        int var12 = class81.field838 + ((int) ((float) arg3 / class482.field6942));
        int var13 = class36.field373 - ((int) ((float) arg2 / class482.field6942));
        class554.field7914 = (int) ((float) (arg3 * 2) / class482.field6942);
        class609.field8520 = class81.field838 - ((int) ((float) arg3 / class482.field6942));
        class222.field2744 = class36.field373 - ((int) ((float) arg2 / class482.field6942));
        class100.field1079 = (int) ((float) (arg2 * 2) / class482.field6942);
        class482.method2769(class482.field6943 + var10, class482.field6951 + var11, var12 + class482.field6943, class482.field6951 + var13, arg4, arg6, arg4 + arg3, arg6 + 1 - -arg2);
        class482.method2790(arg1);
        class616 var14 = class482.method2779(arg1);
        class270.method1588(-128, var14, arg1, arg0, 0);
        if (class269.field3346 > 0) {
            class348.field4660--;
            if (class348.field4660 == 0) {
                class348.field4660 = 20;
                class269.field3346--;
            }
        }
        if (!class585.field8296) {
            return;
        }
        int var15 = arg3 + arg4 - 5;
        int var16 = arg6 + arg2 - 8;
        class698.field9799.method2312(16776960, var15, "Fps:" + class359.field4816, -1, var16, (byte) 60);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class698.field9799.method2312(var19, var15, "Mem:" + var18 + "k", -1, var20, (byte) 52);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(II)Lpw;")
    public final class210 method342(int arg0, int arg1) {
        field637++;
        class19 var3 = this.field645;
        class210 var4;
        synchronized (this.field645) {
            var4 = (class210) this.field645.method78(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class701 var5 = this.field651;
        byte[] var6;
        synchronized (this.field651) {
            var6 = this.field651.method3854((byte) 28, class158.method856(false, arg1), class604.method3379(-89, arg1));
        }
        if (arg0 != -14190) {
            return null;
        }
        class210 var7 = new class210();
        var7.field2501 = arg1;
        var7.field2518 = this;
        if (var6 != null) {
            var7.method1253((byte) -101, new class115(var6));
        }
        var7.method1251((byte) 81);
        class19 var8 = this.field645;
        synchronized (this.field645) {
            this.field645.method92(1, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(IZ)Ljava/lang/String;")
    public static final String method343(int arg0, boolean arg1) {
        field647++;
        String var2 = Integer.toString(arg0);
        if (!arg1) {
            return null;
        }
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class198.field2318.method1195((byte) 62, class504.field7267) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class198.field2320.method1195((byte) 62, class504.field7267) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(I)V")
    public final void method344(int arg0) {
        field642++;
        class19 var2 = this.field645;
        synchronized (this.field645) {
            if (arg0 != 0) {
                this.field645 = null;
            }
            this.field645.method80((byte) -91);
        }
        class19 var3 = this.field653;
        synchronized (this.field653) {
            this.field653.method80((byte) -105);
        }
        class19 var4 = this.field655;
        synchronized (this.field655) {
            this.field655.method80((byte) 91);
        }
    }

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "(II)Lgu;")
    public static final class130 method345(int arg0, int arg1) {
        if (arg0 != 3) {
            method345(-12, 26);
        }
        field646++;
        return class245.field3024 && arg1 >= class267.field3330 && arg1 <= class25.field224 ? class674.field9394[arg1 - class267.field3330] : null;
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lqh;IZLtf;Ltf;)V")
    public class63(class320 arg0, int arg1, boolean arg2, class701 arg3, class701 arg4) {
        this.field651 = arg3;
        this.field652 = arg2;
        this.field636 = arg4;
        this.field639 = arg0;
        if (this.field651 != null) {
            int var6 = this.field651.method3877(100) - 1;
            this.field651.method3883(var6, 0);
        }
    }
}
