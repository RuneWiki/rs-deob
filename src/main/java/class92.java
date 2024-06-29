import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class92 implements Runnable {

    @OriginalMember(owner = "client!s", name = "f", descriptor = "Lgf;")
    private class222 field1619 = new class222();

    @OriginalMember(owner = "client!s", name = "n", descriptor = "Z")
    private boolean field1627 = false;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    public int field1628 = 0;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field1629;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1618 = "Loaded interfaces";

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1617 = "scroll:";

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field1616 = 0;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "S")
    public static short field1622 = 1;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "[I")
    public static int[] field1615;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IILac;)Ldg;")
    public final class6 method590(int arg0, int arg1, class126 arg2) {
        field1626++;
        class6 var4 = new class6();
        var4.field2267 = (long) arg0;
        if (arg1 >= -19) {
            this.field1629 = null;
        }
        var4.field75 = arg2;
        var4.field2885 = false;
        var4.field81 = 3;
        this.method591(-853521336, var4);
        return var4;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILdg;)V")
    private final void method591(int arg0, class6 arg1) {
        field1625++;
        class222 var3 = this.field1619;
        synchronized (this.field1619) {
            this.field1619.method1498(arg0 ^ arg0, arg1);
            this.field1628++;
            this.field1619.notifyAll();
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
    public static void method592(byte arg0) {
        field1615 = null;
        field1617 = null;
        field1618 = null;
        if (arg0 <= 30) {
            method592((byte) 96);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public final void method593(int arg0) {
        field1623++;
        this.field1627 = true;
        class222 var2 = this.field1619;
        synchronized (this.field1619) {
            this.field1619.notifyAll();
        }
        if (arg0 != -10190) {
            field1616 = -68;
        }
        try {
            this.field1629.join();
        } catch (InterruptedException var3) {
        }
        this.field1629 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lac;I[BI)Ldg;")
    public final class6 method594(class126 arg0, int arg1, byte[] arg2, int arg3) {
        field1621++;
        class6 var5 = new class6();
        var5.field75 = arg0;
        if (arg1 != -16380) {
            return null;
        }
        var5.field81 = 2;
        var5.field2267 = (long) arg3;
        var5.field74 = arg2;
        var5.field2885 = false;
        this.method591(arg1 - 853504956, var5);
        return var5;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method595(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != -853521336) {
            field1618 = null;
        }
        field1614++;
        int var8 = arg1 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class105.field1866 - class107.field1905) * var8 / 100 + class107.field1905;
        int var10 = arg7 * var9 >> 8;
        int var11 = 2048 - arg2 & 0x7FF;
        int var12 = 2048 - arg4 & 0x7FF;
        int var13 = 0;
        int var14 = var10;
        int var15 = 0;
        if (var11 != 0) {
            int var16 = class287.field4567[var11];
            var13 = -var10 * var16 >> 16;
            int var17 = class287.field4562[var11];
            var14 = var10 * var17 >> 16;
        }
        if (var12 != 0) {
            int var18 = class287.field4562[var12];
            int var19 = class287.field4567[var12];
            var15 = var14 * var19 >> 16;
            var14 = var14 * var18 >> 16;
        }
        class52.field914 = arg4;
        class56.field976 = arg5 - var15;
        class250.field4093 = arg0 - var13;
        class237.field3904 = arg3 - var14;
        class228.field3844 = arg2;
    }

    @OriginalMember(owner = "client!s", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field1627) {
            class222 var1 = this.field1619;
            class6 var2;
            synchronized (this.field1619) {
                var2 = (class6) this.field1619.method1492((byte) 104);
                if (var2 == null) {
                    try {
                        this.field1619.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field1628--;
            }
            try {
                if (var2.field81 == 2) {
                    var2.field75.method862(0, (int) var2.field2267, var2.field74, var2.field74.length);
                } else if (var2.field81 == 3) {
                    var2.field74 = var2.field75.method860(true, (int) var2.field2267);
                }
            } catch (Exception var7) {
                class254.method1684(126, var7, (String) null);
            }
            var2.field2893 = false;
        }
        field1620++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILac;Z)Ldg;")
    public final class6 method596(int arg0, class126 arg1, boolean arg2) {
        field1624++;
        class6 var4 = new class6();
        var4.field81 = 1;
        class222 var5 = this.field1619;
        synchronized (this.field1619) {
            class6 var6 = (class6) this.field1619.method1499(-16216);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg0 == var6.field2267 && var6.field75 == arg1 && var6.field81 == 2) {
                    var4.field74 = var6.field74;
                    var4.field2893 = false;
                    return var4;
                }
                var6 = (class6) this.field1619.method1495(63);
            }
        }
        var4.field74 = arg1.method860(true, arg0);
        var4.field2893 = arg2;
        var4.field2885 = true;
        return var4;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
    public class92() {
        class174 var1 = class127.field2238.method917(5, (byte) 127, this);
        while (var1.field2857 == 0) {
            class245.method1636(false, 10L);
        }
        if (var1.field2857 == 2) {
            throw new RuntimeException();
        }
        this.field1629 = (Thread) var1.field2859;
    }
}
