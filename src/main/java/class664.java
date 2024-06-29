import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class664 {

    @OriginalMember(owner = "client!me", name = "j", descriptor = "Ljn;")
    private class117 field9334 = new class117(64);

    @OriginalMember(owner = "client!me", name = "o", descriptor = "Ljn;")
    public class117 field9339 = new class117(50);

    @OriginalMember(owner = "client!me", name = "p", descriptor = "Ljn;")
    public class117 field9340 = new class117(5);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "Lgn;")
    public class529 field9325;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "Lvo;")
    private class345 field9330;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "Lvo;")
    public class345 field9337;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "Z")
    public boolean field9335;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "[I")
    public static int[] field9338 = new int[2];

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field9326;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field9327;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field9328;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field9329;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public static int field9331;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public static int field9332;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field9333;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public static int field9336;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    public int field9341;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V", line = 5)
    public final void method3738(int arg0) {
        class117 var2 = this.field9339;
        synchronized (this.field9339) {
            this.field9339.method936(-106);
        }
        if (arg0 != -1118) {
            return;
        }
        field9333++;
        class117 var3 = this.field9340;
        synchronized (this.field9340) {
            this.field9340.method936(-54);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 23)
    public static final void method3739(int arg0, String arg1, int arg2) {
        field9329++;
        int var3 = class643.field9134;
        int[] var4 = class98.field1458;
        boolean var5 = false;
        for (int var6 = arg2; var6 < var3; var6++) {
            class270 var7 = class76.field1186[var4[var6]];
            if (var7 != null && class103.field1708 != var7 && var7.field3848 != null && var7.field3848.equalsIgnoreCase(arg1)) {
                var5 = true;
                if (arg0 == 1) {
                    class694.field9860++;
                    class699 var12 = class452.method2630(class699.field9897, class81.field1236, (byte) 126);
                    var12.field9908.method2700(var4[var6], 0);
                    var12.field9908.method2697(27219, 0);
                    class149.method1134(var12, true);
                } else if (arg0 == 4) {
                    class81.field1212++;
                    class699 var8 = class452.method2630(class699.field9897, class466.field6732, (byte) 126);
                    var8.field9908.method2745(var4[var6], -1670631224);
                    var8.field9908.method2697(arg2 + 27219, 0);
                    class149.method1134(var8, true);
                } else if (arg0 == 5) {
                    class512.field7612++;
                    class699 var11 = class452.method2630(class699.field9897, class657.field9278, (byte) 123);
                    var11.field9908.method2745(var4[var6], arg2 ^ 0x9C6C30C8);
                    var11.field9908.method2752((byte) -1, 0);
                    class149.method1134(var11, true);
                } else if (arg0 == 6) {
                    class655.field9252++;
                    class699 var10 = class452.method2630(class699.field9897, class413.field5882, (byte) 124);
                    var10.field9908.method2697(arg2 ^ 0x6A53, 0);
                    var10.field9908.method2745(var4[var6], arg2 ^ 0x9C6C30C8);
                    class149.method1134(var10, true);
                } else if (arg0 == 7) {
                    class410.field5863++;
                    class699 var9 = class452.method2630(class699.field9897, class696.field9883, (byte) 122);
                    var9.field9908.method2745(var4[var6], -1670631224);
                    var9.field9908.method2753((byte) 75, 0);
                    class149.method1134(var9, true);
                }
                break;
            }
        }
        if (!var5) {
            class300.method1846(4, class343.field4770.method2059(class238.field3511, true) + arg1, 0);
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V", line = 114)
    public final void method3740(int arg0) {
        field9331++;
        class117 var2 = this.field9334;
        synchronized (this.field9334) {
            this.field9334.method936(-113);
        }
        class117 var3 = this.field9339;
        synchronized (this.field9339) {
            this.field9339.method936(-55);
        }
        class117 var4 = this.field9340;
        synchronized (this.field9340) {
            this.field9340.method936(-96);
        }
        if (arg0 != 1) {
            this.method3741(48, 126);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V", line = 134)
    public final void method3741(int arg0, int arg1) {
        this.field9341 = arg0;
        field9332++;
        if (arg1 != 1) {
            this.field9330 = null;
        }
        class117 var3 = this.field9339;
        synchronized (this.field9339) {
            this.field9339.method936(-82);
        }
        class117 var4 = this.field9340;
        synchronized (this.field9340) {
            this.field9340.method936(arg1 ^ 0xFFFFFFBA);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)V", line = 151)
    public final void method3742(int arg0, byte arg1) {
        if (arg1 > -100) {
            this.field9340 = null;
        }
        field9328++;
        class117 var3 = this.field9334;
        synchronized (this.field9334) {
            this.field9334.method939(28093, arg0);
        }
        class117 var4 = this.field9339;
        synchronized (this.field9339) {
            this.field9339.method939(28093, arg0);
        }
        class117 var5 = this.field9340;
        synchronized (this.field9340) {
            this.field9340.method939(28093, arg0);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IZ)Lce;", line = 172)
    public final class528 method3743(int arg0, boolean arg1) {
        field9327++;
        class117 var3 = this.field9334;
        class528 var4;
        synchronized (this.field9334) {
            var4 = (class528) this.field9334.method941((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class345 var5 = this.field9330;
        byte[] var6;
        synchronized (this.field9330) {
            var6 = this.field9330.method2081(-14, class138.method1051((byte) 112, arg0), class45.method364((byte) 0, arg0));
        }
        class528 var7 = new class528();
        var7.field7794 = this;
        var7.field7729 = arg0;
        if (var6 != null) {
            var7.method3109((byte) 98, new class465(var6));
        }
        var7.method3111(30960);
        class117 var8 = this.field9334;
        synchronized (this.field9334) {
            this.field9334.method949((long) arg0, arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZB)V", line = 202)
    public final void method3744(boolean arg0, byte arg1) {
        field9326++;
        int var3 = -9 % ((arg1 + 5) / 63);
        if (arg0 != this.field9335) {
            this.field9335 = arg0;
            this.method3740(1);
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V", line = 217)
    public static void method3745(int arg0) {
        if (arg0 != 4) {
            method3745(-91);
        }
        field9338 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V", line = 229)
    public final void method3746(byte arg0) {
        class117 var2 = this.field9334;
        synchronized (this.field9334) {
            this.field9334.method950((byte) 17);
        }
        field9336++;
        if (arg0 < 35) {
            method3739(-109, null, 7);
        }
        class117 var3 = this.field9339;
        synchronized (this.field9339) {
            this.field9339.method950((byte) -127);
        }
        class117 var4 = this.field9340;
        synchronized (this.field9340) {
            this.field9340.method950((byte) -123);
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lgn;IZLvo;Lvo;)V", line = 266)
    public class664(class529 arg0, int arg1, boolean arg2, class345 arg3, class345 arg4) {
        this.field9325 = arg0;
        this.field9330 = arg3;
        this.field9337 = arg4;
        this.field9335 = arg2;
        if (this.field9330 != null) {
            int var6 = this.field9330.method2102(true) - 1;
            this.field9330.method2098(0, var6);
        }
    }
}
