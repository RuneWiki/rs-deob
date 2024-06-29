import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class477 implements Runnable {

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "Lvt;")
    private class516 field7049 = new class516();

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    public int field7058 = 0;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "Z")
    private boolean field7060 = false;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field7059;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field7044 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "[I")
    public static int[] field7055 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "[I")
    public static int[] field7056 = new int[500];

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public static int field7057 = 1407;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field7045;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field7046;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public static int field7047;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field7048;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field7050;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field7051;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    public static int field7053;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    public static int field7054;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "[Lec;")
    public static class68[] field7052;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public final void method2812(int arg0) {
        if (arg0 >= -34) {
            field7056 = null;
        }
        field7045++;
        this.field7060 = true;
        class516 var2 = this.field7049;
        synchronized (this.field7049) {
            this.field7049.notifyAll();
        }
        try {
            this.field7059.join();
        } catch (InterruptedException var3) {
        }
        this.field7059 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BI[BLpd;)Lcv;")
    public final class18 method2813(byte arg0, int arg1, byte[] arg2, class436 arg3) {
        field7051++;
        class18 var5 = new class18();
        var5.field200 = arg3;
        var5.field4496 = arg1;
        var5.field195 = arg2;
        var5.field201 = 2;
        var5.field6302 = false;
        if (arg0 == 69) {
            this.method2819(24286, var5);
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "run", descriptor = "()V")
    public final void run() {
        field7048++;
        while (!this.field7060) {
            class516 var1 = this.field7049;
            class18 var2;
            synchronized (this.field7049) {
                var2 = (class18) this.field7049.method3054(-29948);
                if (var2 == null) {
                    try {
                        this.field7049.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field7058--;
            }
            try {
                if (var2.field201 == 2) {
                    var2.field200.method2640(var2.field195.length, (int) var2.field4496, 0, var2.field195);
                } else if (var2.field201 == 3) {
                    var2.field195 = var2.field200.method2638(-109, (int) var2.field4496);
                }
            } catch (Exception var6) {
                class502.method2968(null, (byte) -121, var6);
            }
            var2.field6303 = false;
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V")
    public static void method2814(int arg0) {
        field7044 = null;
        field7056 = null;
        if (arg0 != 14322) {
            field7052 = null;
        }
        field7055 = null;
        field7052 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)V")
    public static final void method2815(int arg0, int arg1) {
        field7053++;
        if (arg0 != 0) {
            field7055 = null;
        }
        class266 var2 = class308.method1961(true, arg1, 2);
        var2.method1778(17991);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)Z")
    public static final boolean method2816(int arg0, int arg1, int arg2) {
        field7046++;
        if (arg0 != 3) {
            method2815(86, 24);
        }
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IBLpd;)Lcv;")
    public final class18 method2817(int arg0, byte arg1, class436 arg2) {
        int var4 = -32 % ((arg1 + 48) / 43);
        field7047++;
        class18 var5 = new class18();
        var5.field200 = arg2;
        var5.field201 = 3;
        var5.field4496 = arg0;
        var5.field6302 = false;
        this.method2819(24286, var5);
        return var5;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(IBLpd;)Lcv;")
    public final class18 method2818(int arg0, byte arg1, class436 arg2) {
        field7050++;
        class18 var4 = new class18();
        var4.field201 = 1;
        if (arg1 >= -75) {
            this.field7049 = null;
        }
        class516 var5 = this.field7049;
        synchronized (this.field7049) {
            class18 var6 = (class18) this.field7049.method3056(126);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg0) == var6.field4496 && var6.field200 == arg2 && var6.field201 == 2) {
                    var4.field195 = var6.field195;
                    var4.field6303 = false;
                    return var4;
                }
                var6 = (class18) this.field7049.method3053(75);
            }
        }
        var4.field195 = arg2.method2638(120, arg0);
        var4.field6302 = true;
        var4.field6303 = false;
        return var4;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILcv;)V")
    private final void method2819(int arg0, class18 arg1) {
        if (arg0 != 24286) {
            method2816(125, -64, 75);
        }
        class516 var3 = this.field7049;
        synchronized (this.field7049) {
            this.field7049.method3050(arg1, 2);
            this.field7058++;
            this.field7049.notifyAll();
        }
        field7054++;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lnv;)V")
    public class477(class493 arg0) {
        class169 var2 = arg0.method2874(-116, this, 5);
        while (var2.field2692 == 0) {
            class444.method2667(-28210, 10L);
        }
        if (var2.field2692 == 2) {
            throw new RuntimeException();
        }
        this.field7059 = (Thread) var2.field2695;
    }
}
