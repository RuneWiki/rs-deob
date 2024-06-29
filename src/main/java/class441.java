import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class441 implements Runnable {

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "Lak;")
    private class498 field6283 = new class498();

    @OriginalMember(owner = "client!pt", name = "m", descriptor = "I")
    public int field6288 = 0;

    @OriginalMember(owner = "client!pt", name = "n", descriptor = "Z")
    private boolean field6289 = false;

    @OriginalMember(owner = "client!pt", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field6287;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "Lgr;")
    public static class530 field6276 = new class530(22, 7);

    @OriginalMember(owner = "client!pt", name = "o", descriptor = "Lmr;")
    public static class611 field6290 = new class611();

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "I")
    public static int field6277;

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "I")
    public static int field6280;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "I")
    public static int field6282;

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!pt", name = "k", descriptor = "I")
    public static int field6286;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "Lhga;")
    public static class300 field6279;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Llp;II)Lom;", line = 3)
    public final class641 method2695(class247 arg0, int arg1, int arg2) {
        field6278++;
        int var4 = 102 / ((arg2 - 57) / 47);
        class641 var5 = new class641();
        var5.field9127 = 3;
        var5.field9126 = arg0;
        var5.field9445 = false;
        var5.field5602 = arg1;
        this.method2698(var5, -1785230652);
        return var5;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "([BZILlp;)Lom;", line = 21)
    public final class641 method2696(byte[] arg0, boolean arg1, int arg2, class247 arg3) {
        field6281++;
        if (!arg1) {
            return null;
        }
        class641 var5 = new class641();
        var5.field9127 = 2;
        var5.field9445 = false;
        var5.field9123 = arg0;
        var5.field9126 = arg3;
        var5.field5602 = arg2;
        this.method2698(var5, -1785230652);
        return var5;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V", line = 40)
    public static void method2697(byte arg0) {
        field6276 = null;
        field6290 = null;
        field6279 = null;
        if (arg0 != -96) {
            method2701(-60, -101, -62, (byte) 100, 19, 6);
        }
    }

    @OriginalMember(owner = "client!pt", name = "run", descriptor = "()V", line = 52)
    public final void run() {
        while (!this.field6289) {
            class498 var1 = this.field6283;
            class641 var2;
            synchronized (this.field6283) {
                var2 = (class641) this.field6283.method3030(111);
                if (var2 == null) {
                    try {
                        this.field6283.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field6288--;
            }
            try {
                if (var2.field9127 == 2) {
                    var2.field9126.method1678(124, (int) var2.field5602, var2.field9123.length, var2.field9123);
                } else if (var2.field9127 == 3) {
                    var2.field9123 = var2.field9126.method1680((int) var2.field5602, -28);
                }
            } catch (Exception var6) {
                class705.method3952(null, var6, -29913);
            }
            var2.field9450 = false;
        }
        field6284++;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lom;I)V", line = 98)
    private final void method2698(class641 arg0, int arg1) {
        field6285++;
        class498 var3 = this.field6283;
        synchronized (this.field6283) {
            this.field6283.method3029(0, arg0);
            this.field6288++;
            this.field6283.notifyAll();
        }
        if (arg1 != -1785230652) {
            this.field6288 = 120;
        }
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(B)V", line = 114)
    public static final void method2699(byte arg0) {
        field6280++;
        class445.field6361 = 0;
        int var1 = class352.field5213.method2904(117);
        if (arg0 != 82) {
            return;
        }
        int var2 = class352.field5213.method2897(arg0 + 65198);
        int var3 = class352.field5213.method2897(arg0 + 65198);
        boolean var4 = class352.field5213.method2924((byte) -99) == 1;
        class734.method4084(false);
        class247.method1681(var1, 1541132643);
        int var5 = (class322.field4395 - class352.field5213.field6864) / 16;
        class491.field7065 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class491.field7065[var6][var10] = class352.field5213.method2868(class639.method3689(arg0, -61));
            }
        }
        class269.field3822 = new int[var5];
        class672.field9577 = new int[var5];
        class667.field9528 = new byte[var5][];
        class629.field8917 = new int[var5];
        class132.field1823 = null;
        class236.field3543 = new int[var5];
        class658.field9419 = null;
        class429.field6176 = new byte[var5][];
        class645.field9289 = new byte[var5][];
        class284.field3961 = new int[var5];
        class397.field5685 = new byte[var5][];
        int var7 = 0;
        for (int var8 = (var3 - (class184.field2546 >> 4)) / 8; var8 <= ((var3 + (class184.field2546 >> 4)) / 8); var8++) {
            for (int var9 = (var2 - (class240.field3555 >> 4)) / 8; var9 <= ((class240.field3555 >> 4) + var2) / 8; var9++) {
                class284.field3961[var7] = (var8 << 8) + var9;
                class269.field3822[var7] = class275.field3876.method2602((byte) -124, "m" + var8 + "_" + var9);
                class629.field8917[var7] = class275.field3876.method2602((byte) -128, "l" + var8 + "_" + var9);
                class236.field3543[var7] = class275.field3876.method2602((byte) -128, "um" + var8 + "_" + var9);
                class672.field9577[var7] = class275.field3876.method2602((byte) -121, "ul" + var8 + "_" + var9);
                var7++;
            }
        }
        class426.method2648(var2, 11, arg0 - 1070116110, var3, var4);
    }

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "(B)V", line = 197)
    public final void method2700(byte arg0) {
        this.field6289 = true;
        field6282++;
        class498 var2 = this.field6283;
        synchronized (this.field6283) {
            this.field6283.notifyAll();
        }
        try {
            this.field6287.join();
            if (arg0 != 57) {
                this.method2700((byte) -115);
            }
        } catch (InterruptedException var3) {
        }
        this.field6287 = null;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIIBII)V", line = 217)
    public static final void method2701(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 < 50) {
            field6276 = null;
        }
        field6286++;
        if (class362.field5291 < arg2 || arg4 < class377.field5458) {
            return;
        }
        boolean var6;
        if (arg0 < class200.field2976) {
            var6 = false;
            arg0 = class200.field2976;
        } else if (class204.field3061 < arg0) {
            var6 = false;
            arg0 = class204.field3061;
        } else {
            var6 = true;
        }
        boolean var7;
        if (arg5 < class200.field2976) {
            var7 = false;
            arg5 = class200.field2976;
        } else if (class204.field3061 >= arg5) {
            var7 = true;
        } else {
            arg5 = class204.field3061;
            var7 = false;
        }
        if (arg2 < class377.field5458) {
            arg2 = class377.field5458;
        } else {
            class518.method3153(arg5, arg0, class193.field2839[arg2++], -7, arg1);
        }
        if (arg4 > class362.field5291) {
            arg4 = class362.field5291;
        } else {
            class518.method3153(arg5, arg0, class193.field2839[arg4--], -7, arg1);
        }
        if (var6 && var7) {
            for (int var8 = arg2; var8 <= arg4; var8++) {
                int[] var9 = class193.field2839[var8];
                var9[arg0] = var9[arg5] = arg1;
            }
            return;
        }
        if (var6) {
            for (int var10 = arg2; var10 <= arg4; var10++) {
                class193.field2839[var10][arg0] = arg1;
            }
            return;
        }
        if (var7) {
            for (int var11 = arg2; var11 <= arg4; var11++) {
                class193.field2839[var11][arg5] = arg1;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BILlp;)Lom;", line = 323)
    public final class641 method2702(byte arg0, int arg1, class247 arg2) {
        field6277++;
        class641 var4 = new class641();
        var4.field9127 = 1;
        class498 var5 = this.field6283;
        synchronized (this.field6283) {
            class641 var6 = (class641) this.field6283.method3025(false);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg1) == var6.field5602 && var6.field9126 == arg2 && var6.field9127 == 2) {
                    var4.field9123 = var6.field9123;
                    var4.field9450 = false;
                    return var4;
                }
                var6 = (class641) this.field6283.method3026(true);
            }
        }
        var4.field9123 = arg2.method1680(arg1, -59);
        if (arg0 == 51) {
            var4.field9450 = false;
            var4.field9445 = true;
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lhga;)V", line = 376)
    public class441(class300 arg0) {
        class432 var2 = arg0.method1872(5, false, this);
        while (var2.field6198 == 0) {
            class363.method2283(10L, -24244);
        }
        if (var2.field6198 == 2) {
            throw new RuntimeException();
        }
        this.field6287 = (Thread) var2.field6200;
    }
}
