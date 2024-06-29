import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class112 implements Runnable {

    @OriginalMember(owner = "client!th", name = "l", descriptor = "Lb;")
    private class84 field1768 = new class84();

    @OriginalMember(owner = "client!th", name = "o", descriptor = "Z")
    private boolean field1771 = false;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "I")
    public int field1774 = 0;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field1770;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "[I")
    public static int[] field1762 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field1765 = 0;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "[I")
    public static int[] field1764 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!th", name = "q", descriptor = "I")
    public static int field1773 = 3353893;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "[I")
    public static int[] field1761 = new int[200];

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "[I")
    public static int[] field1769;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lpe;I[BI)Lld;")
    public final class80 method826(class252 arg0, int arg1, byte[] arg2, int arg3) {
        class80 var5 = new class80();
        var5.field1336 = arg0;
        var5.field1330 = arg2;
        var5.field2383 = false;
        field1759++;
        var5.field1340 = 2;
        var5.field4603 = (long) arg1;
        this.method831(1, var5);
        int var6 = -48 / ((arg3 - 56) / 44);
        return var5;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
    public static final void method827(byte arg0) {
        class245.field3797.method1783(0);
        int var1 = -6 % ((-arg0 - 30) / 39);
        field1767++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public final void method828(int arg0) {
        field1763++;
        this.field1771 = true;
        class84 var2 = this.field1768;
        synchronized (this.field1768) {
            this.field1768.notifyAll();
        }
        try {
            this.field1770.join();
        } catch (InterruptedException var3) {
        }
        this.field1770 = null;
        if (arg0 != -7230) {
            field1762 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IILpe;)Lld;")
    public final class80 method829(int arg0, int arg1, class252 arg2) {
        field1760++;
        class80 var4 = new class80();
        var4.field1340 = arg1;
        var4.field2383 = false;
        var4.field4603 = (long) arg0;
        var4.field1336 = arg2;
        this.method831(arg1 ^ 0x2, var4);
        return var4;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V")
    public static void method830(boolean arg0) {
        field1761 = null;
        if (!arg0) {
            field1762 = null;
            field1764 = null;
            field1769 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field1771) {
            class84 var1 = this.field1768;
            class80 var2;
            synchronized (this.field1768) {
                var2 = (class80) this.field1768.method685(0);
                if (var2 == null) {
                    try {
                        this.field1768.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field1774--;
            }
            try {
                if (var2.field1340 == 2) {
                    var2.field1336.method1684(var2.field1330.length, var2.field1330, (int) var2.field4603, (byte) 83);
                } else if (var2.field1340 == 3) {
                    var2.field1330 = var2.field1336.method1688((int) var2.field4603, (byte) 61);
                }
            } catch (Exception var7) {
                class223.method1490(var7, (String) null, (byte) -128);
            }
            var2.field2386 = false;
        }
        field1757++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILld;)V")
    private final void method831(int arg0, class80 arg1) {
        class84 var3 = this.field1768;
        synchronized (this.field1768) {
            if (arg0 != 1) {
                return;
            }
            this.field1768.method683(arg1, 114);
            this.field1774++;
            this.field1768.notifyAll();
        }
        field1758++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIII)I")
    public static final int method832(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1766++;
        if ((arg2 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg4;
            arg4 = var7;
        }
        int var8 = arg3 & 0x3;
        if (arg1 == var8) {
            return arg6;
        } else if (var8 == 1) {
            return 1 + 7 - arg5 - arg0;
        } else if (var8 == 2) {
            return 1 + 7 - arg6 - arg4;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILpe;B)Lld;")
    public final class80 method833(int arg0, class252 arg1, byte arg2) {
        field1772++;
        class80 var4 = new class80();
        var4.field1340 = 1;
        class84 var5 = this.field1768;
        synchronized (this.field1768) {
            class80 var6 = (class80) this.field1768.method681(2);
            while (true) {
                if (var6 == null) {
                    if (arg2 <= 96) {
                        this.field1771 = true;
                    }
                    break;
                }
                if ((long) arg0 == var6.field4603 && var6.field1336 == arg1 && var6.field1340 == 2) {
                    var4.field2386 = false;
                    var4.field1330 = var6.field1330;
                    return var4;
                }
                var6 = (class80) this.field1768.method680(110);
            }
        }
        var4.field1330 = arg1.method1688(arg0, (byte) 111);
        var4.field2386 = false;
        var4.field2383 = true;
        return var4;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
    public class112() {
        class248 var1 = class22.field329.method467(5, this, true);
        while (var1.field3828 == 0) {
            class42.method354(10L, false);
        }
        if (var1.field3828 == 2) {
            throw new RuntimeException();
        }
        this.field1770 = (Thread) var1.field3831;
    }
}
