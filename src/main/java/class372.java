import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class372 implements Runnable {

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "Llj;")
    private class59 field5371 = new class59();

    @OriginalMember(owner = "client!pt", name = "k", descriptor = "Z")
    private boolean field5380 = false;

    @OriginalMember(owner = "client!pt", name = "l", descriptor = "I")
    public int field5381 = 0;

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field5379;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "I")
    public static int field5370;

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "I")
    public static int field5372;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
    public static int field5375;

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "I")
    public static int field5378;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BLoh;Lqa;)V", line = 4)
    public static final void method2256(byte arg0, class549 arg1, class167 arg2) {
        field5374++;
        boolean var3 = class611.field8684.method1626((byte) -124, arg1.field7740, arg1.field7699 | 0xFF000000, arg2, arg1.field7642, arg1.field7787, arg1.field7651 ? class644.field9367.field5984 : null, arg1.field7703) == null;
        if (arg0 < 29) {
            method2256((byte) -45, null, null);
        }
        if (var3) {
            class97.field1677.method414(new class229(arg1.field7703, arg1.field7740, arg1.field7642, arg1.field7699 | 0xFF000000, arg1.field7787, arg1.field7651), (byte) 122);
            class412.method2497(arg1, 114);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IBLgg;)Lbq;", line = 25)
    public final class420 method2257(int arg0, byte arg1, class270 arg2) {
        field5370++;
        class420 var4 = new class420();
        var4.field6180 = 1;
        class59 var5 = this.field5371;
        synchronized (this.field5371) {
            if (arg1 > -95) {
                this.field5371 = null;
            }
            class420 var6 = (class420) this.field5371.method475(78);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg0 == var6.field6471 && var6.field6174 == arg2 && var6.field6180 == 2) {
                    var4.field6814 = false;
                    var4.field6175 = var6.field6175;
                    return var4;
                }
                var6 = (class420) this.field5371.method480(-76);
            }
        }
        var4.field6175 = arg2.method1754(arg0, 103);
        var4.field6811 = true;
        var4.field6814 = false;
        return var4;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I[BLgg;I)Lbq;", line = 60)
    public final class420 method2258(int arg0, byte[] arg1, class270 arg2, int arg3) {
        field5372++;
        class420 var5 = new class420();
        var5.field6175 = arg1;
        var5.field6180 = 2;
        var5.field6471 = arg3;
        if (arg0 == 24702) {
            var5.field6811 = false;
            var5.field6174 = arg2;
            this.method2261(var5, -3836);
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pt", name = "run", descriptor = "()V", line = 80)
    public final void run() {
        while (!this.field5380) {
            class59 var1 = this.field5371;
            class420 var2;
            synchronized (this.field5371) {
                var2 = (class420) this.field5371.method472(true);
                if (var2 == null) {
                    try {
                        this.field5371.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field5381--;
            }
            try {
                if (var2.field6180 == 2) {
                    var2.field6174.method1757(var2.field6175, (byte) -108, (int) var2.field6471, var2.field6175.length);
                } else if (var2.field6180 == 3) {
                    var2.field6175 = var2.field6174.method1754((int) var2.field6471, 70);
                }
            } catch (Exception var6) {
                class593.method3390(null, var6, 0);
            }
            var2.field6814 = false;
        }
        field5375++;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILgg;B)Lbq;", line = 131)
    public final class420 method2259(int arg0, class270 arg1, byte arg2) {
        int var4 = 74 % ((-arg2 - 25) / 62);
        field5376++;
        class420 var5 = new class420();
        var5.field6174 = arg1;
        var5.field6811 = false;
        var5.field6471 = arg0;
        var5.field6180 = 3;
        this.method2261(var5, -3836);
        return var5;
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lae;)V", line = 194)
    public class372(class40 arg0) {
        class329 var2 = arg0.method353(this, 5, false);
        while (var2.field4739 == 0) {
            class210.method1342(-33, 10L);
        }
        if (var2.field4739 == 2) {
            throw new RuntimeException();
        }
        this.field5379 = (Thread) var2.field4737;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Z)V", line = 151)
    public final void method2260(boolean arg0) {
        this.field5380 = true;
        field5378++;
        if (arg0) {
            this.field5379 = null;
        }
        class59 var2 = this.field5371;
        synchronized (this.field5371) {
            this.field5371.notifyAll();
        }
        try {
            this.field5379.join();
        } catch (InterruptedException var3) {
        }
        this.field5379 = null;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lbq;I)V", line = 176)
    private final void method2261(class420 arg0, int arg1) {
        class59 var3 = this.field5371;
        synchronized (this.field5371) {
            this.field5371.method477(arg0, false);
            this.field5381++;
            this.field5371.notifyAll();
        }
        field5373++;
        if (arg1 != -3836) {
            field5377 = -69;
        }
    }
}
