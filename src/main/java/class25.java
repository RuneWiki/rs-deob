import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class25 implements Runnable {

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "Lqk;")
    private class65 field321 = new class65();

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "Z")
    private boolean field324 = false;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    public int field323 = 0;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field322;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "Ljava/util/Calendar;")
    public static Calendar field311 = Calendar.getInstance();

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "[I")
    public static int[] field312;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)Lkn;", line = 7)
    public static final class178 method145(int arg0) {
        int var1 = class323.field4903[0] * class288.field4281[0];
        byte[] var2 = class209.field3012[0];
        field318++;
        if (arg0 != 17511) {
            return (class178) null;
        }
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class235.field3331[class47.method303(255, var2[var4])];
        }
        class178 var5 = new class178(class154.field2136, class194.field2674, class209.field3002[0], class274.field4115[0], class323.field4903[0], class288.field4281[0], var3);
        class236.method1624(85);
        return var5;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V", line = 33)
    public final void method146(int arg0) {
        field320++;
        this.field324 = true;
        class65 var2 = this.field321;
        synchronized (this.field321) {
            this.field321.notifyAll();
        }
        try {
            this.field322.join();
        } catch (InterruptedException var6) {
        }
        this.field322 = null;
        int var5 = 114 / ((arg0 - 63) / 49);
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)V", line = 52)
    public static void method147(int arg0) {
        field311 = null;
        if (arg0 != 6834) {
            method147(-90);
        }
        field312 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IBLng;)Lck;", line = 66)
    public final class79 method148(int arg0, byte arg1, class330 arg2) {
        field310++;
        class79 var4 = new class79();
        if (arg1 <= 40) {
            return (class79) null;
        }
        var4.field414 = (long) arg0;
        var4.field1139 = 3;
        var4.field120 = false;
        var4.field1145 = arg2;
        this.method149(2, var4);
        return var4;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILck;)V", line = 86)
    private final void method149(int arg0, class79 arg1) {
        field313++;
        if (arg0 != 2) {
            return;
        }
        class65 var3 = this.field321;
        synchronized (this.field321) {
            this.field321.method443(true, arg1);
            this.field323++;
            this.field321.notifyAll();
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lng;IB[B)Lck;", line = 105)
    public final class79 method150(class330 arg0, int arg1, byte arg2, byte[] arg3) {
        field314++;
        class79 var5 = new class79();
        var5.field1145 = arg0;
        if (arg2 != 16) {
            this.method150((class330) null, -110, (byte) -64, (byte[]) null);
        }
        var5.field1143 = arg3;
        var5.field414 = (long) arg1;
        var5.field1139 = 2;
        var5.field120 = false;
        this.method149(2, var5);
        return var5;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lng;II)Lck;", line = 125)
    public final class79 method151(class330 arg0, int arg1, int arg2) {
        field317++;
        class79 var4 = new class79();
        var4.field1139 = 1;
        if (arg1 != 24628) {
            return (class79) null;
        }
        class65 var5 = this.field321;
        synchronized (this.field321) {
            class79 var6 = (class79) this.field321.method442(-95);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg2) == var6.field414 && var6.field1145 == arg0 && var6.field1139 == 2) {
                    var4.field115 = false;
                    var4.field1143 = var6.field1143;
                    return var4;
                }
                var6 = (class79) this.field321.method444((byte) 83);
            }
        }
        var4.field1143 = arg0.method2303(0, arg2);
        var4.field120 = true;
        var4.field115 = false;
        return var4;
    }

    @OriginalMember(owner = "client!pk", name = "run", descriptor = "()V", line = 160)
    public final void run() {
        field316++;
        while (!this.field324) {
            class65 var1 = this.field321;
            class79 var2;
            synchronized (this.field321) {
                var2 = (class79) this.field321.method445((byte) 120);
                if (var2 == null) {
                    try {
                        this.field321.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field323--;
            }
            try {
                if (var2.field1139 == 2) {
                    var2.field1145.method2304(var2.field1143, (int) var2.field414, true, var2.field1143.length);
                } else if (var2.field1139 == 3) {
                    var2.field1143 = var2.field1145.method2303(0, (int) var2.field414);
                }
            } catch (Exception var6) {
                class187.method1307((String) null, var6, -97);
            }
            var2.field115 = false;
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V", line = 226)
    public class25() {
        class285 var1 = class165.field2258.method612(this, 90, 5);
        while (var1.field4241 == 0) {
            class186.method1304(10, 10L);
        }
        if (var1.field4241 == 2) {
            throw new RuntimeException();
        }
        this.field322 = (Thread) var1.field4244;
    }
}
