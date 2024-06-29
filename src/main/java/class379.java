import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class379 implements Runnable {

    @OriginalMember(owner = "client!ru", name = "j", descriptor = "Ljh;")
    private class462 field5589 = new class462();

    @OriginalMember(owner = "client!ru", name = "m", descriptor = "I")
    public int field5592 = 0;

    @OriginalMember(owner = "client!ru", name = "n", descriptor = "Z")
    private boolean field5593 = false;

    @OriginalMember(owner = "client!ru", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field5591;

    @OriginalMember(owner = "client!ru", name = "g", descriptor = "[I")
    public static int[] field5586 = new int[13];

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "I")
    public static int field5580;

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "I")
    public static int field5582;

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "I")
    public static int field5583;

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!ru", name = "h", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!ru", name = "i", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!ru", name = "k", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)V")
    public static void method2408(byte arg0) {
        int var1 = -8 / ((-arg0 - 9) / 59);
        field5586 = null;
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(B)[Lrl;")
    public static final class530[] method2409(byte arg0) {
        if (arg0 > -13) {
            field5586 = null;
        }
        field5583++;
        return new class530[] { class491.field7184, class491.field7186, class491.field7188, class491.field7189, class491.field7190, class491.field7191, class491.field7192, class491.field7193, class491.field7194, class491.field7195, class491.field7196, class491.field7197 };
    }

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "(B)V")
    public final void method2410(byte arg0) {
        field5584++;
        this.field5593 = true;
        class462 var2 = this.field5589;
        synchronized (this.field5589) {
            this.field5589.notifyAll();
        }
        try {
            this.field5591.join();
        } catch (InterruptedException var3) {
        }
        if (arg0 != 71) {
            this.field5589 = null;
        }
        this.field5591 = null;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(ILbh;)V")
    private final void method2411(int arg0, class422 arg1) {
        class462 var3 = this.field5589;
        synchronized (this.field5589) {
            if (arg0 != 0) {
                field5586 = null;
            }
            this.field5589.method2829(-14061, arg1);
            this.field5592++;
            this.field5589.notifyAll();
        }
        field5580++;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(I[BILcn;)Lbh;")
    public final class422 method2412(int arg0, byte[] arg1, int arg2, class14 arg3) {
        field5590++;
        class422 var5 = new class422();
        var5.field6199 = arg1;
        var5.field6926 = arg0;
        if (arg2 != 6569) {
            field5586 = null;
        }
        var5.field6197 = arg3;
        var5.field2871 = false;
        var5.field6198 = 2;
        this.method2411(arg2 - 6569, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(ILcn;B)Lbh;")
    public final class422 method2413(int arg0, class14 arg1, byte arg2) {
        field5582++;
        class422 var4 = new class422();
        var4.field2871 = false;
        var4.field6198 = 3;
        var4.field6926 = arg0;
        var4.field6197 = arg1;
        int var5 = -64 / ((-arg2 - 12) / 53);
        this.method2411(0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ru", name = "run", descriptor = "()V")
    public final void run() {
        field5585++;
        while (!this.field5593) {
            class462 var1 = this.field5589;
            class422 var2;
            synchronized (this.field5589) {
                var2 = (class422) this.field5589.method2828(false);
                if (var2 == null) {
                    try {
                        this.field5589.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field5592--;
            }
            try {
                if (var2.field6198 == 2) {
                    var2.field6197.method84((int) var2.field6926, var2.field6199, var2.field6199.length, (byte) 93);
                } else if (var2.field6198 == 3) {
                    var2.field6199 = var2.field6197.method86((int) var2.field6926, 126);
                }
            } catch (Exception var6) {
                class197.method1407(true, null, var6);
            }
            var2.field2870 = false;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lcn;II)Lbh;")
    public final class422 method2414(class14 arg0, int arg1, int arg2) {
        field5581++;
        class422 var4 = new class422();
        var4.field6198 = 1;
        class462 var5 = this.field5589;
        synchronized (this.field5589) {
            if (arg1 != 2) {
                this.method2414(null, -23, -8);
            }
            class422 var6 = (class422) this.field5589.method2825(-1);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg2 == var6.field6926 && var6.field6197 == arg0 && var6.field6198 == 2) {
                    var4.field6199 = var6.field6199;
                    var4.field2870 = false;
                    return var4;
                }
                var6 = (class422) this.field5589.method2827(-123);
            }
        }
        var4.field6199 = arg0.method86(arg2, arg1 ^ 0x7C);
        var4.field2871 = true;
        var4.field2870 = false;
        return var4;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method2415(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5587++;
        if (arg0 != -3) {
            return true;
        } else if ((class229.field3460[0][arg2][arg3] & 0x2) != 0) {
            return true;
        } else if ((class229.field3460[arg1][arg2][arg3] & 0x10) == 0) {
            return class291.method1950((byte) -76, arg3, arg1, arg2) == arg4;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lgt;)V")
    public class379(class66 arg0) {
        class329 var2 = arg0.method448(5, this, (byte) 97);
        while (var2.field4974 == 0) {
            class468.method2848(10L, (byte) -80);
        }
        if (var2.field4974 == 2) {
            throw new RuntimeException();
        }
        this.field5591 = (Thread) var2.field4975;
    }
}
