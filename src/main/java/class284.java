import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class284 implements Runnable {

    @OriginalMember(owner = "client!p", name = "a", descriptor = "Ltk;")
    private class51 field4981 = new class51();

    @OriginalMember(owner = "client!p", name = "i", descriptor = "Z")
    private boolean field4989 = false;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public int field4994 = 0;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "Ljava/lang/Thread;")
    private Thread field4995;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field4986 = -1;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "Lll;")
    public static class205 field4983;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "Lrg;")
    public static class226 field4996;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V")
    public static final void method1924() {
        if (class173.field3087 != null) {
            for (int var0 = 0; var0 < class173.field3087.length; var0++) {
                for (int var1 = 0; var1 < class225.field4104; var1++) {
                    for (int var2 = 0; var2 < class279.field4908; var2++) {
                        class173.field3087[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class270.field4782 != null) {
            for (int var3 = 0; var3 < class270.field4782.length; var3++) {
                for (int var4 = 0; var4 < class225.field4104; var4++) {
                    for (int var5 = 0; var5 < class279.field4908; var5++) {
                        class270.field4782[var3][var4][var5] = null;
                    }
                }
            }
        }
        class170.field3016 = 0;
        if (class92.field1639 != null) {
            for (int var6 = 0; var6 < class170.field3016; var6++) {
                class92.field1639[var6] = null;
            }
        }
        if (class18.field270 != null) {
            for (int var7 = 0; var7 < class90.field1617; var7++) {
                class18.field270[var7] = null;
            }
            class90.field1617 = 0;
        }
        if (class48.field947 != null) {
            for (int var8 = 0; var8 < class48.field947.length; var8++) {
                class48.field947[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    public static void method1925(byte arg0) {
        field4983 = null;
        field4996 = null;
        int var1 = -47 % ((22 - arg0) / 51);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lqk;BZ)V")
    public static final void method1926(class207 arg0, byte arg1, boolean arg2) {
        field4991++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class176.field3183.method1607(arg0, 250);
        int var7 = class176.field3183.method1605(arg0, 250) * 13;
        int var8 = 39 % ((-arg1 - 64) / 40);
        class23.method167(var5 - var3, -var3 + var4, var3 + var6 + var3, var3 + var7 - -var3, 0);
        class23.method166(var5 - var3, -var3 + var4, var3 + var3 + var6, var3 + var7 - -var3, 16777215);
        class176.field3183.method1609(arg0, var5, var4, var6, var7, 16777215, -1, 1, 1, 0);
        class245.method1725(var3 + var3 + var6, var3 + var7 - -var3, var4 - var3, 0, var5 - var3);
        if (!arg2) {
            class140.method973(var6, var5, (byte) -64, var4, var7);
            return;
        }
        try {
            Graphics var9 = class112.field1949.getGraphics();
            class86.field1565.method804(0, var9, -26806, 0);
        } catch (Exception var10) {
            class112.field1949.repaint();
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IBLlk;)Lek;")
    public final class163 method1927(int arg0, byte arg1, class81 arg2) {
        if (arg1 != -81) {
            this.method1934((byte) -20, (class163) null);
        }
        field4987++;
        class163 var4 = new class163();
        var4.field2873 = arg2;
        var4.field2879 = 3;
        var4.field643 = (long) arg0;
        var4.field4078 = false;
        this.method1934((byte) 115, var4);
        return var4;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIBLpk;)Luh;")
    public static final class100 method1928(int arg0, int arg1, byte arg2, class99 arg3) {
        field4988++;
        if (arg2 >= -70) {
            method1926((class207) null, (byte) -21, false);
        }
        return class78.method594(arg0, arg3, 112, arg1) ? class155.method1137(-1) : null;
    }

    @OriginalMember(owner = "client!p", name = "run", descriptor = "()V")
    public final void run() {
        field4990++;
        while (!this.field4989) {
            class51 var1 = this.field4981;
            class163 var2;
            synchronized (this.field4981) {
                var2 = (class163) this.field4981.method397(524287);
                if (var2 == null) {
                    try {
                        this.field4981.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field4994--;
            }
            try {
                if (var2.field2879 == 2) {
                    var2.field2873.method605((int) var2.field643, -7461, var2.field2887, var2.field2887.length);
                } else if (var2.field2879 == 3) {
                    var2.field2887 = var2.field2873.method611(16711680, (int) var2.field643);
                }
            } catch (Exception var6) {
                class202.method1402((String) null, 32701, var6);
            }
            var2.field4084 = false;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
    public final void method1929(int arg0) {
        field4992++;
        this.field4989 = true;
        int var2 = 89 / ((65 - arg0) / 59);
        class51 var3 = this.field4981;
        synchronized (this.field4981) {
            this.field4981.notifyAll();
        }
        try {
            this.field4995.join();
        } catch (InterruptedException var4) {
        }
        this.field4995 = null;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(IBLlk;)Lek;")
    public final class163 method1930(int arg0, byte arg1, class81 arg2) {
        field4985++;
        if (arg1 != -41) {
            return null;
        }
        class163 var4 = new class163();
        var4.field2879 = 1;
        class51 var5 = this.field4981;
        synchronized (this.field4981) {
            class163 var6 = (class163) this.field4981.method391(65535);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg0 == var6.field643 && var6.field2873 == arg2 && var6.field2879 == 2) {
                    var4.field4084 = false;
                    var4.field2887 = var6.field2887;
                    return var4;
                }
                var6 = (class163) this.field4981.method399(1048575);
            }
        }
        var4.field2887 = arg2.method611(16711680, arg0);
        var4.field4078 = true;
        var4.field4084 = false;
        return var4;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)I")
    public static final int method1931(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field4982++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            if (arg1 <= 106) {
                method1933((class207) null, false);
            }
            return arg2;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([BLlk;IB)Lek;")
    public final class163 method1932(byte[] arg0, class81 arg1, int arg2, byte arg3) {
        class163 var5 = new class163();
        var5.field2879 = 2;
        field4984++;
        if (arg3 < 23) {
            method1924();
        }
        var5.field2887 = arg0;
        var5.field643 = (long) arg2;
        var5.field2873 = arg1;
        var5.field4078 = false;
        this.method1934((byte) 115, var5);
        return var5;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lqk;Z)V")
    public static final void method1933(class207 arg0, boolean arg1) {
        if (arg1) {
            method1933((class207) null, true);
        }
        field4993++;
        int var2 = class86.method635(arg0, -21298);
        if (var2 != -1) {
            class31.method240(class57.field1052.field3294[var2], class57.field1052.field3297[var2], true);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BLek;)V")
    private final void method1934(byte arg0, class163 arg1) {
        class51 var3 = this.field4981;
        synchronized (this.field4981) {
            this.field4981.method389(false, arg1);
            this.field4994++;
            if (arg0 != 115) {
                return;
            }
            this.field4981.notifyAll();
        }
        field4997++;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V")
    public class284() {
        class96 var1 = class20.field326.method1636(false, 5, this);
        while (var1.field1696 == 0) {
            class153.method1098((byte) 76, 10L);
        }
        if (var1.field1696 == 2) {
            throw new RuntimeException();
        }
        this.field4995 = (Thread) var1.field1699;
    }
}
