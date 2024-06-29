import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nja")
public class class458 implements Runnable {

    @OriginalMember(owner = "client!nja", name = "f", descriptor = "Ldha;")
    private class84 field6347 = new class84();

    @OriginalMember(owner = "client!nja", name = "j", descriptor = "I")
    public int field6351 = 0;

    @OriginalMember(owner = "client!nja", name = "m", descriptor = "Z")
    private boolean field6354 = false;

    @OriginalMember(owner = "client!nja", name = "i", descriptor = "Ljava/lang/Thread;")
    private Thread field6350;

    @OriginalMember(owner = "client!nja", name = "h", descriptor = "Ljg;")
    public static class359 field6349 = new class359();

    @OriginalMember(owner = "client!nja", name = "k", descriptor = "Lwt;")
    public static class330 field6352 = new class330();

    @OriginalMember(owner = "client!nja", name = "l", descriptor = "I")
    public static int field6353 = 1;

    @OriginalMember(owner = "client!nja", name = "n", descriptor = "I")
    public static int field6355 = 0;

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!nja", name = "b", descriptor = "I")
    public static int field6343;

    @OriginalMember(owner = "client!nja", name = "c", descriptor = "I")
    public static int field6344;

    @OriginalMember(owner = "client!nja", name = "d", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!nja", name = "e", descriptor = "I")
    public static int field6346;

    @OriginalMember(owner = "client!nja", name = "g", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(I)V", line = 4)
    public static void method2709(int arg0) {
        field6349 = null;
        if (arg0 != -7742) {
            field6353 = -2;
        }
        field6352 = null;
    }

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(ILtk;[BI)Lci;", line = 18)
    public final class476 method2710(int arg0, class364 arg1, byte[] arg2, int arg3) {
        field6344++;
        class476 var5 = new class476();
        var5.field6620 = arg1;
        var5.field6622 = 2;
        var5.field10055 = false;
        if (arg3 != 21954) {
            this.field6354 = false;
        }
        var5.field4141 = arg0;
        var5.field6618 = arg2;
        this.method2713(false, var5);
        return var5;
    }

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(ILtk;I)Lci;", line = 37)
    public final class476 method2711(int arg0, class364 arg1, int arg2) {
        field6343++;
        class476 var4 = new class476();
        var4.field6620 = arg1;
        var4.field6622 = arg0;
        var4.field4141 = arg2;
        var4.field10055 = false;
        this.method2713(false, var4);
        return var4;
    }

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(IILtk;)Lci;", line = 52)
    public final class476 method2712(int arg0, int arg1, class364 arg2) {
        field6346++;
        class476 var4 = new class476();
        var4.field6622 = 1;
        class84 var5 = this.field6347;
        synchronized (this.field6347) {
            if (arg0 != -4) {
                return null;
            }
            class476 var7 = (class476) this.field6347.method697(0);
            while (true) {
                if (var7 == null) {
                    break;
                }
                if (((long) arg1) == var7.field4141 && var7.field6620 == arg2 && var7.field6622 == 2) {
                    var4.field10051 = false;
                    var4.field6618 = var7.field6618;
                    return var4;
                }
                var7 = (class476) this.field6347.method699(true);
            }
        }
        var4.field6618 = arg2.method2283(9557, arg1);
        var4.field10055 = true;
        var4.field10051 = false;
        return var4;
    }

    @OriginalMember(owner = "client!nja", name = "run", descriptor = "()V", line = 90)
    public final void run() {
        field6345++;
        while (!this.field6354) {
            class84 var1 = this.field6347;
            class476 var2;
            synchronized (this.field6347) {
                var2 = (class476) this.field6347.method698(-103);
                if (var2 == null) {
                    try {
                        this.field6347.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field6351--;
            }
            try {
                if (var2.field6622 == 2) {
                    var2.field6620.method2284((int) var2.field4141, var2.field6618, var2.field6618.length, 520);
                } else if (var2.field6622 == 3) {
                    var2.field6618 = var2.field6620.method2283(9557, (int) var2.field4141);
                }
            } catch (Exception var6) {
                class664.method3681((byte) -53, null, var6);
            }
            var2.field10051 = false;
        }
    }

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(ZLci;)V", line = 136)
    private final void method2713(boolean arg0, class476 arg1) {
        field6348++;
        class84 var3 = this.field6347;
        synchronized (this.field6347) {
            this.field6347.method695(-89, arg1);
            if (arg0) {
                this.run();
            }
            this.field6351++;
            this.field6347.notifyAll();
        }
    }

    @OriginalMember(owner = "client!nja", name = "<init>", descriptor = "(Lqn;)V", line = 197)
    public class458(class70 arg0) {
        class615 var2 = arg0.method623(this, 5, -5697);
        while (var2.field8321 == 0) {
            class438.method2636(true, 10L);
        }
        if (var2.field8321 == 2) {
            throw new RuntimeException();
        }
        this.field6350 = (Thread) var2.field8318;
    }

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(B)V", line = 161)
    public final void method2714(byte arg0) {
        this.field6354 = true;
        field6342++;
        class84 var2 = this.field6347;
        synchronized (this.field6347) {
            if (arg0 != 37) {
                this.method2711(-5, null, 21);
            }
            this.field6347.notifyAll();
        }
        try {
            this.field6350.join();
        } catch (InterruptedException var3) {
        }
        this.field6350 = null;
    }
}
