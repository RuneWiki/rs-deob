import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class275 implements Runnable {

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "Lp;")
    private class161 field3560 = new class161();

    @OriginalMember(owner = "client!vm", name = "p", descriptor = "Z")
    private boolean field3565 = false;

    @OriginalMember(owner = "client!vm", name = "o", descriptor = "I")
    public int field3564 = 0;

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field3562;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "Z")
    public static boolean field3557;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "[Lli;")
    public static class336[] field3558;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "I")
    public static int field3563;

    static {
        new class72("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
        field3557 = true;
        field3558 = new class336[6];
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IILfe;)Llk;", line = 8)
    public static final class272 method1725(int arg0, int arg1, class133 arg2) {
        field3556++;
        class272 var3;
        if (class228.field2880 == null) {
            var3 = new class272();
        } else {
            var3 = class228.field2880;
            class228.field2880 = class228.field2880.field3514;
            class453.field6356--;
            var3.field3514 = null;
        }
        var3.field3510 = arg0;
        if (arg1 != 0) {
            field3557 = false;
        }
        var3.field3512 = arg2;
        return var3;
    }

    @OriginalMember(owner = "client!vm", name = "run", descriptor = "()V", line = 34)
    public final void run() {
        while (!this.field3565) {
            class161 var1 = this.field3560;
            class201 var2;
            synchronized (this.field3560) {
                var2 = (class201) this.field3560.method1024(256);
                if (var2 == null) {
                    try {
                        this.field3560.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field3564--;
            }
            try {
                if (var2.field2375 == 2) {
                    var2.field2365.method2141(var2.field2369.length, (int) var2.field2090, var2.field2369, 520);
                } else if (var2.field2375 == 3) {
                    var2.field2369 = var2.field2365.method2142((byte) 124, (int) var2.field2090);
                }
            } catch (Exception var7) {
                class402.method2510((String) null, var7, -29832);
            }
            var2.field1539 = false;
        }
        field3551++;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BLpp;I)Lca;", line = 80)
    public final class201 method1726(byte arg0, class334 arg1, int arg2) {
        field3553++;
        class201 var4 = new class201();
        var4.field2090 = (long) arg2;
        var4.field2375 = 3;
        var4.field2365 = arg1;
        if (arg0 != 15) {
            field3557 = false;
        }
        var4.field1538 = false;
        this.method1728(var4, (byte) 1);
        return var4;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V", line = 102)
    public final void method1727(int arg0) {
        field3561++;
        if (arg0 != -2580) {
            this.field3565 = true;
        }
        this.field3565 = true;
        class161 var2 = this.field3560;
        synchronized (this.field3560) {
            this.field3560.notifyAll();
        }
        try {
            this.field3562.join();
        } catch (InterruptedException var3) {
        }
        this.field3562 = null;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lca;B)V", line = 123)
    private final void method1728(class201 arg0, byte arg1) {
        class161 var3 = this.field3560;
        synchronized (this.field3560) {
            this.field3560.method1028((byte) 33, arg0);
            this.field3564++;
            this.field3560.notifyAll();
        }
        int var4 = 78 / ((arg1 - 59) / 49);
        field3552++;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILpp;I)Lca;", line = 142)
    public final class201 method1729(int arg0, class334 arg1, int arg2) {
        if (arg0 > -105) {
            this.field3560 = null;
        }
        field3555++;
        class201 var4 = new class201();
        var4.field2375 = 1;
        class161 var5 = this.field3560;
        synchronized (this.field3560) {
            class201 var6 = (class201) this.field3560.method1027(-20578);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg2 == var6.field2090 && var6.field2365 == arg1 && var6.field2375 == 2) {
                    var4.field2369 = var6.field2369;
                    var4.field1539 = false;
                    return var4;
                }
                var6 = (class201) this.field3560.method1023(60);
            }
        }
        var4.field2369 = arg1.method2142((byte) -117, arg2);
        var4.field1539 = false;
        var4.field1538 = true;
        return var4;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BLjava/awt/Canvas;)Llo;", line = 177)
    public static final class318 method1730(byte arg0, Canvas arg1) {
        if (arg0 != -63) {
            return null;
        }
        field3554++;
        try {
            Class var2 = Class.forName("ds");
            class318 var3 = (class318) var2.getDeclaredConstructor().newInstance();
            var3.method1598(false, arg1);
            return var3;
        } catch (Throwable var5) {
            class332 var4 = new class332();
            var4.method1598(false, arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V", line = 201)
    public static void method1731(byte arg0) {
        field3558 = null;
        if (arg0 != -52) {
            field3558 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I[BZLpp;)Lca;", line = 216)
    public final class201 method1732(int arg0, byte[] arg1, boolean arg2, class334 arg3) {
        field3559++;
        class201 var5 = new class201();
        var5.field2365 = arg3;
        var5.field2375 = 2;
        var5.field2090 = (long) arg0;
        var5.field1538 = arg2;
        var5.field2369 = arg1;
        this.method1728(var5, (byte) -95);
        return var5;
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lnh;)V", line = 251)
    public class275(class441 arg0) {
        class315 var2 = arg0.method2733(0, this, 5);
        while (var2.field4244 == 0) {
            class219.method1330(10L, true);
        }
        if (var2.field4244 == 2) {
            throw new RuntimeException();
        }
        this.field3562 = (Thread) var2.field4243;
    }
}
