import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class99 implements Runnable {

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "Lgo;")
    private class304 field1400 = new class304();

    @OriginalMember(owner = "client!ls", name = "l", descriptor = "I")
    public int field1407 = 0;

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "Z")
    private boolean field1405 = false;

    @OriginalMember(owner = "client!ls", name = "o", descriptor = "Ljava/lang/Thread;")
    private Thread field1410;

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "Lib;")
    public static class444 field1397 = null;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
    public static int field1396 = 2;

    @OriginalMember(owner = "client!ls", name = "m", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1408 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!ls", name = "k", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!ls", name = "n", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!ls", name = "p", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)V")
    public static final void method812(byte arg0) {
        class303.field4310 = 0;
        field1402++;
        class6.field38.method773(-1568);
        class205.field3005 = false;
        int var1 = 77 % ((arg0 - 30) / 37);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lq;IB)Lqg;")
    public final class186 method813(class102 arg0, int arg1, byte arg2) {
        field1398++;
        class186 var4 = new class186();
        if (arg2 <= 56) {
            return null;
        }
        var4.field2795 = 1;
        class304 var5 = this.field1400;
        synchronized (this.field1400) {
            class186 var6 = (class186) this.field1400.method1955(0);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg1) == var6.field713 && var6.field2797 == arg0 && var6.field2795 == 2) {
                    var4.field6539 = false;
                    var4.field2796 = var6.field2796;
                    return var4;
                }
                var6 = (class186) this.field1400.method1954(false);
            }
        }
        var4.field2796 = arg0.method821(arg1, 120);
        var4.field6546 = true;
        var4.field6539 = false;
        return var4;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ILq;I)Lqg;")
    public final class186 method814(int arg0, class102 arg1, int arg2) {
        field1411++;
        class186 var4 = new class186();
        var4.field2795 = 3;
        var4.field6546 = false;
        var4.field2797 = arg1;
        var4.field713 = (long) arg0;
        this.method817(false, var4);
        if (arg2 != 11748) {
            this.field1405 = true;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(B)Z")
    public static final boolean method815(byte arg0) {
        field1404++;
        if (class352.field4847) {
            try {
                if ((Boolean) class32.method200("showingVideoAd", (byte) -103, class436.field6206.field960)) {
                    return false;
                }
                return true;
            } catch (Throwable var2) {
            }
        }
        int var1 = 41 / ((arg0 - 27) / 37);
        return true;
    }

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "(B)V")
    public static void method816(byte arg0) {
        if (arg0 <= 102) {
            method816((byte) 94);
        }
        field1408 = null;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZLqg;)V")
    private final void method817(boolean arg0, class186 arg1) {
        field1406++;
        class304 var3 = this.field1400;
        synchronized (this.field1400) {
            this.field1400.method1962((byte) -67, arg1);
            this.field1407++;
            if (arg0) {
                field1408 = null;
            }
            this.field1400.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method818(String arg0, int arg1) {
        field1399++;
        if (arg0 == null) {
            return false;
        }
        int var2 = 0;
        if (arg1 != 1575) {
            method816((byte) 45);
        }
        while (class349.field4807 > var2) {
            if (arg0.equalsIgnoreCase(class37.field446[var2])) {
                return true;
            }
            var2++;
        }
        return arg0.equalsIgnoreCase(class262.field3781.field485);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I[BILq;)Lqg;")
    public final class186 method819(int arg0, byte[] arg1, int arg2, class102 arg3) {
        field1403++;
        class186 var5 = new class186();
        var5.field2797 = arg3;
        var5.field2795 = 2;
        var5.field713 = (long) arg2;
        var5.field6546 = false;
        var5.field2796 = arg1;
        if (arg0 > -121) {
            this.method814(-66, (class102) null, -69);
        }
        this.method817(false, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ls", name = "run", descriptor = "()V")
    public final void run() {
        field1409++;
        while (!this.field1405) {
            class304 var1 = this.field1400;
            class186 var2;
            synchronized (this.field1400) {
                var2 = (class186) this.field1400.method1961((byte) 49);
                if (var2 == null) {
                    try {
                        this.field1400.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field1407--;
            }
            try {
                if (var2.field2795 == 2) {
                    var2.field2797.method822((int) var2.field713, var2.field2796, var2.field2796.length, 124);
                } else if (var2.field2795 == 3) {
                    var2.field2796 = var2.field2797.method821((int) var2.field713, -60);
                }
            } catch (Exception var6) {
                class83.method704((byte) 96, var6, (String) null);
            }
            var2.field6539 = false;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Z)V")
    public final void method820(boolean arg0) {
        this.field1405 = arg0;
        field1401++;
        class304 var2 = this.field1400;
        synchronized (this.field1400) {
            this.field1400.notifyAll();
        }
        try {
            this.field1410.join();
        } catch (InterruptedException var3) {
        }
        this.field1410 = null;
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lis;)V")
    public class99(class65 arg0) {
        class275 var2 = arg0.method616(this, 1, 5);
        while (var2.field3979 == 0) {
            class89.method752(0, 10L);
        }
        if (var2.field3979 == 2) {
            throw new RuntimeException();
        }
        this.field1410 = (Thread) var2.field3984;
    }
}
