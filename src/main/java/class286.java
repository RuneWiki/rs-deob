import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class286 implements Runnable {

    @OriginalMember(owner = "client!th", name = "n", descriptor = "Lje;")
    private class265 field3562 = new class265();

    @OriginalMember(owner = "client!th", name = "o", descriptor = "Z")
    private boolean field3563 = false;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "I")
    public int field3565 = 0;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field3564;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "[C")
    public static char[] field3555 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field3557 = -1;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "[I")
    public static int[] field3558 = null;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "[I")
    public static int[] field3561 = new int[14];

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "Lmc;")
    public static class424 field3552;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "[I")
    public static int[] field3559;

    @OriginalMember(owner = "client!th", name = "run", descriptor = "()V", line = 5)
    public final void run() {
        field3556++;
        while (!this.field3563) {
            class265 var1 = this.field3562;
            class285 var2;
            synchronized (this.field3562) {
                var2 = (class285) this.field3562.method1537(-21957);
                if (var2 == null) {
                    try {
                        this.field3562.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field3565--;
            }
            try {
                if (var2.field3540 == 2) {
                    var2.field3538.method3793(var2.field3544.length, var2.field3544, (int) var2.field6874, -68);
                } else if (var2.field3540 == 3) {
                    var2.field3544 = var2.field3538.method3791((byte) 108, (int) var2.field6874);
                }
            } catch (Exception var6) {
                class106.method597(null, -2, var6);
            }
            var2.field7755 = false;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IILda;II)Lsd;", line = 53)
    public static final class362 method1606(int arg0, int arg1, class474 arg2, int arg3, int arg4) {
        if (arg0 != -24294) {
            method1606(-109, -34, null, 105, -123);
        }
        field3550++;
        return arg2 == null ? null : new class362(arg4, arg1, arg3, arg2.method727(), arg2.method758(), arg2.method699(), arg2.method757(), arg2.method703(), arg2.method734(), arg2.method692());
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZLkf;)V", line = 71)
    private final void method1607(boolean arg0, class285 arg1) {
        class265 var3 = this.field3562;
        synchronized (this.field3562) {
            if (arg0) {
                field3557 = 62;
            }
            this.field3562.method1541(75, arg1);
            this.field3565++;
            this.field3562.notifyAll();
        }
        field3553++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V", line = 92)
    public final void method1608(byte arg0) {
        this.field3563 = true;
        field3549++;
        class265 var2 = this.field3562;
        synchronized (this.field3562) {
            this.field3562.notifyAll();
        }
        if (arg0 >= -98) {
            method1606(-55, -95, null, -90, 89);
        }
        try {
            this.field3564.join();
        } catch (InterruptedException var3) {
        }
        this.field3564 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IILlf;)Lkf;", line = 116)
    public final class285 method1609(int arg0, int arg1, class676 arg2) {
        field3560++;
        class285 var4 = new class285();
        if (arg1 > -73) {
            return null;
        }
        var4.field6874 = arg0;
        var4.field3540 = 3;
        var4.field3538 = arg2;
        var4.field7752 = false;
        this.method1607(false, var4);
        return var4;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "([BZLlf;I)Lkf;", line = 135)
    public final class285 method1610(byte[] arg0, boolean arg1, class676 arg2, int arg3) {
        field3551++;
        class285 var5 = new class285();
        var5.field7752 = false;
        var5.field6874 = arg3;
        var5.field3540 = 2;
        var5.field3544 = arg0;
        if (!arg1) {
            this.field3562 = null;
        }
        var5.field3538 = arg2;
        this.method1607(false, var5);
        return var5;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILlf;I)Lkf;", line = 162)
    public final class285 method1611(int arg0, class676 arg1, int arg2) {
        field3554++;
        class285 var4 = new class285();
        var4.field3540 = 1;
        class265 var5 = this.field3562;
        synchronized (this.field3562) {
            if (arg0 != 8217) {
                return null;
            }
            class285 var7 = (class285) this.field3562.method1546((byte) -121);
            while (true) {
                if (var7 == null) {
                    break;
                }
                if (((long) arg2) == var7.field6874 && var7.field3538 == arg1 && var7.field3540 == 2) {
                    var4.field3544 = var7.field3544;
                    var4.field7755 = false;
                    return var4;
                }
                var7 = (class285) this.field3562.method1536(1252027233);
            }
        }
        var4.field3544 = arg1.method3791((byte) 108, arg2);
        var4.field7752 = true;
        var4.field7755 = false;
        return var4;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lrj;)V", line = 222)
    public class286(class648 arg0) {
        class264 var2 = arg0.method3626(5, this, 0);
        while (var2.field3358 == 0) {
            class419.method2233(-28448, 10L);
        }
        if (var2.field3358 == 2) {
            throw new RuntimeException();
        }
        this.field3564 = (Thread) var2.field3356;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V", line = 200)
    public static void method1612(byte arg0) {
        field3555 = null;
        field3558 = null;
        field3561 = null;
        field3559 = null;
        field3552 = null;
        if (arg0 <= 2) {
            method1612((byte) -7);
        }
    }
}
