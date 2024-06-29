import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class17 implements Runnable {

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Lgm;")
    private class108 field180 = new class108();

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public int field185 = 0;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "Z")
    private boolean field188 = false;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field183;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "Ldg;")
    public static class376 field176 = new class376(23, 7);

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Lnea;")
    public static class664 field187 = new class664(66, 6);

    @OriginalMember(owner = "client!n", name = "n", descriptor = "[I")
    public static int[] field189 = new int[1];

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "[I")
    public static int[] field184;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljj;Z)V")
    private final void method94(class103 arg0, boolean arg1) {
        field181++;
        class108 var3 = this.field180;
        synchronized (this.field180) {
            if (arg1) {
                method98(11);
            }
            this.field180.method852(!arg1, arg0);
            this.field185++;
            this.field180.notifyAll();
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public final void method95(int arg0) {
        this.field188 = true;
        if (arg0 != 0) {
            this.run();
        }
        field186++;
        class108 var2 = this.field180;
        synchronized (this.field180) {
            this.field180.notifyAll();
        }
        try {
            this.field183.join();
        } catch (InterruptedException var3) {
        }
        this.field183 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BILwo;)Ljj;")
    public final class103 method96(byte arg0, int arg1, class691 arg2) {
        field179++;
        class103 var4 = new class103();
        if (arg0 <= 89) {
            method98(-76);
        }
        var4.field1610 = 1;
        class108 var5 = this.field180;
        synchronized (this.field180) {
            class103 var6 = (class103) this.field180.method849((byte) 57);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg1 == var6.field5344 && var6.field1612 == arg2 && var6.field1610 == 2) {
                    var4.field2717 = false;
                    var4.field1611 = var6.field1611;
                    return var4;
                }
                var6 = (class103) this.field180.method854((byte) 103);
            }
        }
        var4.field1611 = arg2.method3801(true, arg1);
        var4.field2717 = false;
        var4.field2718 = true;
        return var4;
    }

    @OriginalMember(owner = "client!n", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field188) {
            class108 var1 = this.field180;
            class103 var2;
            synchronized (this.field180) {
                var2 = (class103) this.field180.method847(0);
                if (var2 == null) {
                    try {
                        this.field180.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field185--;
            }
            try {
                if (var2.field1610 == 2) {
                    var2.field1612.method3800((int) var2.field5344, var2.field1611.length, var2.field1611, -1);
                } else if (var2.field1610 == 3) {
                    var2.field1611 = var2.field1612.method3801(true, (int) var2.field5344);
                }
            } catch (Exception var7) {
                class699.method3896(69, var7, null);
            }
            var2.field2717 = false;
        }
        field177++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IILwo;)Ljj;")
    public final class103 method97(int arg0, int arg1, class691 arg2) {
        field182++;
        if (arg1 != -10598) {
            this.method97(-86, 110, null);
        }
        class103 var4 = new class103();
        var4.field1612 = arg2;
        var4.field1610 = 3;
        var4.field2718 = false;
        var4.field5344 = arg0;
        this.method94(var4, false);
        return var4;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
    public static void method98(int arg0) {
        field189 = null;
        if (arg0 == -1763) {
            field176 = null;
            field187 = null;
            field184 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II[BLwo;)Ljj;")
    public final class103 method99(int arg0, int arg1, byte[] arg2, class691 arg3) {
        field178++;
        class103 var5 = new class103();
        var5.field2718 = false;
        var5.field5344 = arg0;
        var5.field1612 = arg3;
        if (arg1 != -23907) {
            this.method97(-87, -116, null);
        }
        var5.field1610 = 2;
        var5.field1611 = arg2;
        this.method94(var5, false);
        return var5;
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lft;)V")
    public class17(class4 arg0) {
        class494 var2 = arg0.method22(this, 5, (byte) -127);
        while (var2.field7024 == 0) {
            class561.method3202(10L, (byte) -31);
        }
        if (var2.field7024 == 2) {
            throw new RuntimeException();
        }
        this.field183 = (Thread) var2.field7019;
    }
}
