import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class102 implements Runnable {

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Luj;")
    private class259 field1685 = new class259();

    @OriginalMember(owner = "client!d", name = "l", descriptor = "Z")
    private boolean field1690 = false;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "I")
    public int field1688 = 0;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field1689;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "Lrn;")
    public static class174 field1691;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "Lqj;")
    public static class351 field1684;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "Lqj;")
    public static class351 field1692;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field1694;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILbb;)V")
    private final void method758(int arg0, class217 arg1) {
        field1679++;
        if (arg0 <= 37) {
            this.field1685 = null;
        }
        class259 var3 = this.field1685;
        synchronized (this.field1685) {
            this.field1685.method1673(arg1, 4304);
            this.field1688++;
            this.field1685.notifyAll();
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILsk;B)Lbb;")
    public final class217 method759(int arg0, class438 arg1, byte arg2) {
        field1682++;
        class217 var4 = new class217();
        var4.field3113 = arg1;
        var4.field4056 = false;
        var4.field3118 = 3;
        if (arg2 >= -29) {
            this.method759(-78, null, (byte) -11);
        }
        var4.field2927 = arg0;
        this.method758(67, var4);
        return var4;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZLsk;[BI)Lbb;")
    public final class217 method760(boolean arg0, class438 arg1, byte[] arg2, int arg3) {
        field1681++;
        class217 var5 = new class217();
        var5.field3118 = 2;
        var5.field3113 = arg1;
        var5.field3123 = arg2;
        var5.field4056 = arg0;
        var5.field2927 = arg3;
        this.method758(125, var5);
        return var5;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public final void method761(int arg0) {
        if (arg0 != 3) {
            this.field1690 = true;
        }
        this.field1690 = true;
        field1680++;
        class259 var2 = this.field1685;
        synchronized (this.field1685) {
            this.field1685.notifyAll();
        }
        try {
            this.field1689.join();
        } catch (InterruptedException var3) {
        }
        this.field1689 = null;
    }

    @OriginalMember(owner = "client!d", name = "run", descriptor = "()V")
    public final void run() {
        field1687++;
        while (!this.field1690) {
            class259 var1 = this.field1685;
            class217 var2;
            synchronized (this.field1685) {
                var2 = (class217) this.field1685.method1674((byte) -70);
                if (var2 == null) {
                    try {
                        this.field1685.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field1688--;
            }
            try {
                if (var2.field3118 == 2) {
                    var2.field3113.method2621((byte) -103, var2.field3123.length, var2.field3123, (int) var2.field2927);
                } else if (var2.field3118 == 3) {
                    var2.field3123 = var2.field3113.method2622(false, (int) var2.field2927);
                }
            } catch (Exception var6) {
                class320.method2087(0, var6, null);
            }
            var2.field4053 = false;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
    public static void method762(int arg0) {
        field1692 = null;
        if (arg0 == 0) {
            field1691 = null;
            field1684 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)V")
    public static final void method763(boolean arg0) {
        if (arg0) {
            class380.field5761 = class268.field3870;
            class88.field1546 = class335.field5061;
        } else {
            class380.field5761 = class40.field733;
            class88.field1546 = class43.field829;
        }
        class190.field2830 = class380.field5761.length;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lsk;II)Lbb;")
    public final class217 method764(class438 arg0, int arg1, int arg2) {
        field1683++;
        class217 var4 = new class217();
        var4.field3118 = arg2;
        class259 var5 = this.field1685;
        synchronized (this.field1685) {
            class217 var6 = (class217) this.field1685.method1679(255);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg1) == var6.field2927 && var6.field3113 == arg0 && var6.field3118 == 2) {
                    var4.field4053 = false;
                    var4.field3123 = var6.field3123;
                    return var4;
                }
                var6 = (class217) this.field1685.method1671(-10033);
            }
        }
        var4.field3123 = arg0.method2622(false, arg1);
        var4.field4053 = false;
        var4.field4056 = true;
        return var4;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
    public static final void method765(byte arg0) {
        if (class293.field4179 == 2) {
            class457.field6854 = 96;
        } else {
            try {
                Method var1 = (field1694 == null ? (field1694 = method766("java.lang.Runtime")) : field1694).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class457.field6854 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        field1686++;
        if (arg0 >= -74) {
            method762(-124);
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lli;)V")
    public class102(class293 arg0) {
        class324 var2 = arg0.method1859(5, true, this);
        while (var2.field4940 == 0) {
            class71.method583(10L, 78);
        }
        if (var2.field4940 == 2) {
            throw new RuntimeException();
        }
        this.field1689 = (Thread) var2.field4939;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method766(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class342("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
        field1691 = new class174(66, 2);
    }
}
