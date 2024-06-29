import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class141 implements Runnable {

    @OriginalMember(owner = "client!su", name = "j", descriptor = "Ltk;")
    private class230 field1822 = new class230();

    @OriginalMember(owner = "client!su", name = "k", descriptor = "I")
    public int field1823 = 0;

    @OriginalMember(owner = "client!su", name = "m", descriptor = "Z")
    private boolean field1825 = false;

    @OriginalMember(owner = "client!su", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field1824;

    @OriginalMember(owner = "client!su", name = "b", descriptor = "Lap;")
    public static class335 field1814 = new class335("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!su", name = "o", descriptor = "Lkg;")
    public static class179 field1827 = new class179(5, -1);

    @OriginalMember(owner = "client!su", name = "p", descriptor = "Lbe;")
    public static class29 field1828 = new class29(1);

    @OriginalMember(owner = "client!su", name = "q", descriptor = "Lap;")
    public static class335 field1829 = new class335("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!su", name = "r", descriptor = "Ldq;")
    public static class493 field1830 = new class493(103, 6);

    @OriginalMember(owner = "client!su", name = "u", descriptor = "I")
    public static int field1833 = 0;

    @OriginalMember(owner = "client!su", name = "s", descriptor = "F")
    public static float field1831;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!su", name = "c", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!su", name = "d", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!su", name = "e", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!su", name = "f", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!su", name = "g", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!su", name = "h", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!su", name = "i", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!su", name = "t", descriptor = "Ljv;")
    public static class56 field1832;

    @OriginalMember(owner = "client!su", name = "n", descriptor = "[[B")
    public static byte[][] field1826;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Z)V")
    public static final void method955(boolean arg0) {
        field1818++;
        int var1 = class436.field6234;
        int[] var2 = class12.field218;
        for (int var3 = 0; var3 < var1; var3++) {
            class223 var4 = class387.field5107[var2[var3]];
            if (var4 != null) {
                class489.method2964(var4.method1366((byte) -126), 0, var4);
            }
        }
        if (arg0) {
            field1827 = null;
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(BILht;)Lef;")
    public final class339 method956(byte arg0, int arg1, class412 arg2) {
        field1819++;
        class339 var4 = new class339();
        var4.field4258 = 1;
        class230 var5 = this.field1822;
        synchronized (this.field1822) {
            class339 var6 = (class339) this.field1822.method1399(arg0 ^ 0x6C);
            while (true) {
                if (var6 == null) {
                    if (arg0 != 20) {
                        field1827 = null;
                    }
                    break;
                }
                if ((long) arg1 == var6.field1098 && var6.field4249 == arg2 && var6.field4258 == 2) {
                    var4.field7502 = false;
                    var4.field4250 = var6.field4250;
                    return var4;
                }
                var6 = (class339) this.field1822.method1394((byte) 14);
            }
        }
        var4.field4250 = arg2.method2438(665786192, arg1);
        var4.field7502 = false;
        var4.field7504 = true;
        return var4;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I)V")
    public static void method957(int arg0) {
        field1814 = null;
        field1826 = null;
        if (arg0 != 31866) {
            field1830 = null;
        }
        field1829 = null;
        field1828 = null;
        field1832 = null;
        field1830 = null;
        field1827 = null;
    }

    @OriginalMember(owner = "client!su", name = "run", descriptor = "()V")
    public final void run() {
        field1820++;
        while (!this.field1825) {
            class230 var1 = this.field1822;
            class339 var2;
            synchronized (this.field1822) {
                var2 = (class339) this.field1822.method1393((byte) 127);
                if (var2 == null) {
                    try {
                        this.field1822.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field1823--;
            }
            try {
                if (var2.field4258 == 2) {
                    var2.field4249.method2439((int) var2.field1098, 104, var2.field4250.length, var2.field4250);
                } else if (var2.field4258 == 3) {
                    var2.field4250 = var2.field4249.method2438(665786192, (int) var2.field1098);
                }
            } catch (Exception var6) {
                class461.method2719(var6, null, 1);
            }
            var2.field7502 = false;
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIZI[BILug;)Lnq;")
    public static final class322 method958(int arg0, int arg1, int arg2, boolean arg3, int arg4, byte[] arg5, int arg6, class395 arg7) {
        field1813++;
        int var8 = -64 % ((arg1 + 20) / 51);
        if (!arg7.field5591 && (!class351.method2014(10, arg0) || !class351.method2014(10, arg6))) {
            return arg7.field5624 ? new class322(arg7, 34037, arg4, arg0, arg6, arg3, arg5, arg2) : new class322(arg7, arg4, arg0, arg6, class60.method550(122, arg0), class60.method550(101, arg6), arg5, arg2);
        } else {
            return new class322(arg7, 3553, arg4, arg0, arg6, arg3, arg5, arg2);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(ILht;I)Lef;")
    public final class339 method959(int arg0, class412 arg1, int arg2) {
        if (arg0 != -20440) {
            return null;
        }
        field1816++;
        class339 var4 = new class339();
        var4.field4249 = arg1;
        var4.field4258 = 3;
        var4.field1098 = arg2;
        var4.field7504 = false;
        this.method960(var4, false);
        return var4;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Lef;Z)V")
    private final void method960(class339 arg0, boolean arg1) {
        field1821++;
        class230 var3 = this.field1822;
        synchronized (this.field1822) {
            this.field1822.method1400(arg1, arg0);
            this.field1823++;
            this.field1822.notifyAll();
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "([BILht;I)Lef;")
    public final class339 method961(byte[] arg0, int arg1, class412 arg2, int arg3) {
        field1817++;
        class339 var5 = new class339();
        var5.field4249 = arg2;
        var5.field1098 = arg3;
        var5.field4258 = arg1;
        var5.field4250 = arg0;
        var5.field7504 = false;
        this.method960(var5, false);
        return var5;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V")
    public final void method962(byte arg0) {
        this.field1825 = true;
        field1815++;
        class230 var2 = this.field1822;
        synchronized (this.field1822) {
            this.field1822.notifyAll();
        }
        try {
            this.field1824.join();
        } catch (InterruptedException var3) {
        }
        if (arg0 == 95) {
            this.field1824 = null;
        }
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lpc;)V")
    public class141(class476 arg0) {
        class121 var2 = arg0.method2870(false, 5, this);
        while (var2.field1628 == 0) {
            class199.method1251(10L, (byte) 107);
        }
        if (var2.field1628 == 2) {
            throw new RuntimeException();
        }
        this.field1824 = (Thread) var2.field1627;
    }
}
