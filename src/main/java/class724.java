import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class724 implements Runnable {

    @OriginalMember(owner = "client!aca", name = "e", descriptor = "Lmn;")
    private class368 field9813 = new class368();

    @OriginalMember(owner = "client!aca", name = "m", descriptor = "Z")
    private boolean field9821 = false;

    @OriginalMember(owner = "client!aca", name = "i", descriptor = "I")
    public int field9817 = 0;

    @OriginalMember(owner = "client!aca", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field9816;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "I")
    public static int field9809;

    @OriginalMember(owner = "client!aca", name = "c", descriptor = "I")
    public static int field9811;

    @OriginalMember(owner = "client!aca", name = "d", descriptor = "I")
    public static int field9812;

    @OriginalMember(owner = "client!aca", name = "f", descriptor = "I")
    public static int field9814;

    @OriginalMember(owner = "client!aca", name = "g", descriptor = "I")
    public static int field9815;

    @OriginalMember(owner = "client!aca", name = "j", descriptor = "I")
    public static int field9818;

    @OriginalMember(owner = "client!aca", name = "k", descriptor = "I")
    public static int field9819;

    @OriginalMember(owner = "client!aca", name = "l", descriptor = "I")
    public static int field9820;

    @OriginalMember(owner = "client!aca", name = "b", descriptor = "Lrh;")
    public static class267 field9810;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "([BLnw;BI)Lqh;", line = 4)
    public final class68 method4011(byte[] arg0, class586 arg1, byte arg2, int arg3) {
        if (arg2 != 10) {
            this.field9821 = false;
        }
        field9815++;
        class68 var5 = new class68();
        var5.field1276 = arg0;
        var5.field2807 = false;
        var5.field1273 = arg1;
        var5.field235 = arg3;
        var5.field1272 = 2;
        this.method4012(var5, arg2 - 123);
        return var5;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Lqh;I)V", line = 23)
    private final void method4012(class68 arg0, int arg1) {
        field9818++;
        class368 var3 = this.field9813;
        synchronized (this.field9813) {
            this.field9813.method2338(true, arg0);
            this.field9817++;
            if (arg1 > -100) {
                field9810 = null;
            }
            this.field9813.notifyAll();
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Z)V", line = 40)
    public final void method4013(boolean arg0) {
        this.field9821 = arg0;
        field9814++;
        class368 var2 = this.field9813;
        synchronized (this.field9813) {
            this.field9813.notifyAll();
        }
        try {
            this.field9816.join();
        } catch (InterruptedException var3) {
        }
        this.field9816 = null;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(B)V", line = 56)
    public static void method4014(byte arg0) {
        field9810 = null;
        int var1 = 107 % ((arg0 + 20) / 50);
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)I", line = 69)
    public static final int method4015(int arg0) {
        field9811++;
        if (arg0 != 3112) {
            method4014((byte) 121);
        }
        if (class591.field8071 == null) {
            if (!class311.field4321 && class693.field9372 != null) {
                return class693.field9372.field4506;
            }
            int var1 = class284.field3963.method574(true);
            int var2 = class284.field3963.method571((byte) 81);
            if (class715.field9742) {
                if (class106.field1869 < var1 && var1 < class565.field7788 + class106.field1869) {
                    int var3 = -1;
                    for (int var4 = 0; var4 < class436.field6235; var4++) {
                        if (class545.field7514) {
                            int var8 = class749.field10379 + (var4 * 16) + 33;
                            if ((var8 - 13) < var2 && var2 <= var8 + 3) {
                                var3 = var4;
                            }
                        } else {
                            int var9 = var4 * 16 + class749.field10379 + 31;
                            if ((var9 - 13) < var2 && (var9 + 3) >= var2) {
                                var3 = var4;
                            }
                        }
                    }
                    if (var3 != -1) {
                        int var5 = 0;
                        class444 var6 = new class444(class631.field8684);
                        for (class462 var7 = (class462) var6.method2670(110); var7 != null; var7 = (class462) var6.method2673((byte) 77)) {
                            if (var3 == var5++) {
                                return ((class324) var7.field6503.field5243.field241).field4506;
                            }
                        }
                    }
                } else if (class164.field2589 != null && class142.field2352 < var1 && var1 < (class465.field6522 + class142.field2352)) {
                    int var10 = -1;
                    for (int var11 = 0; var11 < class164.field2589.field6497; var11++) {
                        if (class545.field7514) {
                            int var16 = var11 * 16 + class157.field2522 + 33;
                            if (var16 - 13 < var2 && var2 <= (var16 + 3)) {
                                var10 = var11;
                            }
                        } else {
                            int var15 = var11 * 16 + class157.field2522 + 31;
                            if (var2 > (var15 - 13) && var15 + 3 >= var2) {
                                var10 = var11;
                            }
                        }
                    }
                    if (var10 != -1) {
                        int var12 = 0;
                        class444 var13 = new class444(class164.field2589.field6503);
                        for (class324 var14 = (class324) var13.method2670(9); var14 != null; var14 = (class324) var13.method2673((byte) 90)) {
                            if (var12++ == var10) {
                                return var14.field4506;
                            }
                        }
                    }
                }
            } else if (class106.field1869 < var1 && var1 < class106.field1869 + class565.field7788) {
                int var17 = -1;
                for (int var18 = 0; var18 < class192.field2844; var18++) {
                    if (class545.field7514) {
                        int var23 = (class192.field2844 - var18 - 1) * 16 + class749.field10379 + 33;
                        if (var2 > var23 - 13 && var2 <= (var23 + 3)) {
                            var17 = var18;
                        }
                    } else {
                        int var22 = (class192.field2844 - var18 - 1) * 16 + class749.field10379 + 31;
                        if (var2 > (var22 - 13) && var22 + 3 >= var2) {
                            var17 = var18;
                        }
                    }
                }
                if (var17 != -1) {
                    int var19 = 0;
                    class482 var20 = new class482(class528.field7301);
                    for (class324 var21 = (class324) var20.method2824((byte) -53); var21 != null; var21 = (class324) var20.method2826(arg0 - 3102)) {
                        if (var17 == var19++) {
                            return var21.field4506;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Lnw;IB)Lqh;", line = 262)
    public final class68 method4016(class586 arg0, int arg1, byte arg2) {
        field9812++;
        class68 var4 = new class68();
        if (arg2 != -112) {
            return null;
        }
        var4.field2807 = false;
        var4.field1272 = 3;
        var4.field235 = arg1;
        var4.field1273 = arg0;
        this.method4012(var4, -101);
        return var4;
    }

    @OriginalMember(owner = "client!aca", name = "run", descriptor = "()V", line = 281)
    public final void run() {
        while (!this.field9821) {
            class368 var1 = this.field9813;
            class68 var2;
            synchronized (this.field9813) {
                var2 = (class68) this.field9813.method2341(20);
                if (var2 == null) {
                    try {
                        this.field9813.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field9817--;
            }
            try {
                if (var2.field1272 == 2) {
                    var2.field1273.method3346(var2.field1276.length, (int) var2.field235, var2.field1276, -7305);
                } else if (var2.field1272 == 3) {
                    var2.field1276 = var2.field1273.method3347((byte) -4, (int) var2.field235);
                }
            } catch (Exception var6) {
                class444.method2672(null, var6, 15004);
            }
            var2.field2808 = false;
        }
        field9819++;
    }

    @OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(Lwea;)V", line = 374)
    public class724(class158 arg0) {
        class622 var2 = arg0.method1210(this, -10240, 5);
        while (var2.field8462 == 0) {
            class700.method3916((byte) 43, 10L);
        }
        if (var2.field8462 == 2) {
            throw new RuntimeException();
        }
        this.field9816 = (Thread) var2.field8463;
    }

    @OriginalMember(owner = "client!aca", name = "b", descriptor = "(Lnw;IB)Lqh;", line = 331)
    public final class68 method4017(class586 arg0, int arg1, byte arg2) {
        if (arg2 >= -98) {
            method4014((byte) 110);
        }
        field9820++;
        class68 var4 = new class68();
        var4.field1272 = 1;
        class368 var5 = this.field9813;
        synchronized (this.field9813) {
            class68 var6 = (class68) this.field9813.method2344(-95);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg1 == var6.field235 && var6.field1273 == arg0 && var6.field1272 == 2) {
                    var4.field1276 = var6.field1276;
                    var4.field2808 = false;
                    return var4;
                }
                var6 = (class68) this.field9813.method2336((byte) 73);
            }
        }
        var4.field1276 = arg0.method3347((byte) -4, arg1);
        var4.field2807 = true;
        var4.field2808 = false;
        return var4;
    }
}
