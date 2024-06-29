import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class365 implements Runnable {

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "Llga;")
    private class711 field5164 = new class711();

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "Z")
    private boolean field5172 = false;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public int field5174 = 0;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field5173;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "F")
    public static float field5166;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILvaa;)V")
    public static final void method2323(int arg0, class468 arg1) {
        field5167++;
        if (arg0 > -106) {
            return;
        }
        for (class231 var2 = (class231) class234.field3152.method2765(-12261); var2 != null; var2 = (class231) class234.field3152.method2759(-15361)) {
            if (var2.field3137 == arg1) {
                if (var2.field3123 != null) {
                    class192.field2560.method1733(var2.field3123);
                    var2.field3123 = null;
                }
                var2.method1185(-102);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILmda;I)Lqda;")
    public final class103 method2324(int arg0, class263 arg1, int arg2) {
        int var4 = -52 / ((34 - arg2) / 39);
        field5162++;
        class103 var5 = new class103();
        var5.field1221 = 3;
        var5.field1224 = arg1;
        var5.field8207 = arg0;
        var5.field4255 = false;
        this.method2327(var5, -3);
        return var5;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "([BILmda;I)Lqda;")
    public final class103 method2325(byte[] arg0, int arg1, class263 arg2, int arg3) {
        field5165++;
        class103 var5 = new class103();
        var5.field1227 = arg0;
        var5.field1224 = arg2;
        var5.field4255 = false;
        var5.field8207 = arg3;
        if (arg1 == 29288) {
            var5.field1221 = 2;
            this.method2327(var5, -3);
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public final void method2326(int arg0) {
        field5168++;
        this.field5172 = true;
        class711 var2 = this.field5164;
        synchronized (this.field5164) {
            this.field5164.notifyAll();
            if (arg0 != -3) {
                this.method2326(-113);
            }
        }
        try {
            this.field5173.join();
        } catch (InterruptedException var3) {
        }
        this.field5173 = null;
    }

    @OriginalMember(owner = "client!bc", name = "run", descriptor = "()V")
    public final void run() {
        field5170++;
        while (!this.field5172) {
            class711 var1 = this.field5164;
            class103 var2;
            synchronized (this.field5164) {
                var2 = (class103) this.field5164.method3997(0);
                if (var2 == null) {
                    try {
                        this.field5164.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field5174--;
            }
            try {
                if (var2.field1221 == 2) {
                    var2.field1224.method1720((int) var2.field8207, var2.field1227.length, 0, var2.field1227);
                } else if (var2.field1221 == 3) {
                    var2.field1227 = var2.field1224.method1721(255, (int) var2.field8207);
                }
            } catch (Exception var6) {
                class248.method1583((byte) -69, null, var6);
            }
            var2.field4256 = false;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lqda;I)V")
    private final void method2327(class103 arg0, int arg1) {
        if (arg1 != -3) {
            return;
        }
        field5163++;
        class711 var3 = this.field5164;
        synchronized (this.field5164) {
            this.field5164.method3999(arg0, 21934);
            this.field5174++;
            this.field5164.notifyAll();
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IILmda;)Lqda;")
    public final class103 method2328(int arg0, int arg1, class263 arg2) {
        field5169++;
        class103 var4 = new class103();
        var4.field1221 = 1;
        class711 var5 = this.field5164;
        synchronized (this.field5164) {
            class103 var6 = (class103) this.field5164.method4000((byte) -7);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg1) == var6.field8207 && var6.field1224 == arg2 && var6.field1221 == 2) {
                    var4.field4256 = false;
                    var4.field1227 = var6.field1227;
                    return var4;
                }
                var6 = (class103) this.field5164.method4002(-62);
            }
        }
        var4.field1227 = arg2.method1721(255, arg1);
        var4.field4255 = true;
        if (arg0 != -10970) {
            this.method2325(null, -101, null, 124);
        }
        var4.field4256 = false;
        return var4;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lvc;)V")
    public class365(class316 arg0) {
        class249 var2 = arg0.method2046(2, this, 5);
        while (var2.field3310 == 0) {
            class756.method4205(10L, 0);
        }
        if (var2.field3310 == 2) {
            throw new RuntimeException();
        }
        this.field5173 = (Thread) var2.field3311;
    }
}
