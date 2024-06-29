import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class155 implements Runnable {

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "Lrb;")
    private class196 field2691 = new class196();

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    public int field2708 = 0;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "Z")
    private boolean field2707 = false;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "Ljava/lang/Thread;")
    private Thread field2705;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "Z")
    public static boolean field2695 = true;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public static int field2701 = 0;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field2694 = 0;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "Lda;")
    public static class275 field2709 = class255.method1672(124, "<col=ff0000>");

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lmf;I)V")
    private final void method1091(class52 arg0, int arg1) {
        class196 var3 = this.field2691;
        synchronized (this.field2691) {
            if (arg1 != 3587) {
                return;
            }
            this.field2691.method1282(arg0, (byte) 15);
            this.field2708++;
            this.field2691.notifyAll();
        }
        field2692++;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
    public static final void method1092(int arg0) {
        class169.field2942 = new class84();
        if (arg0 == -14607) {
            field2697++;
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V")
    public static final void method1093(int arg0) {
        int var1 = class19.field264;
        if (arg0 != 11076) {
            return;
        }
        int var2 = class42.field709;
        int var3 = class244.field4258 - class249.field4391 - var1;
        field2703++;
        int var4 = class63.field1054 - class212.field3587 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class276.field4821 != null) {
                var5 = class276.field4821;
            } else if (class165.field2870 == null) {
                var5 = class3.field24.field970;
            } else {
                var5 = class165.field2870;
            }
            int var6 = 0;
            int var7 = 0;
            if (class165.field2870 == var5) {
                Insets var8 = class165.field2870.getInsets();
                var6 = var8.top;
                var7 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var7, var6, var1, class63.field1054);
            }
            if (var2 > 0) {
                var9.fillRect(var7, var6, class244.field4258, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class244.field4258 + var7 - var3, var6, var3, class63.field1054);
            }
            if (var4 > 0) {
                var9.fillRect(var7, class63.field1054 + var6 - var4, class244.field4258, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!ti", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field2707) {
            class196 var1 = this.field2691;
            class52 var2;
            synchronized (this.field2691) {
                var2 = (class52) this.field2691.method1273((byte) -56);
                if (var2 == null) {
                    try {
                        this.field2691.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field2708--;
            }
            try {
                if (var2.field862 == 2) {
                    var2.field858.method850(var2.field868, 90, var2.field868.length, (int) var2.field2057);
                } else if (var2.field862 == 3) {
                    var2.field868 = var2.field858.method852((int) var2.field2057, 0);
                }
            } catch (Exception var6) {
                class1.method1(var6, (String) null, false);
            }
            var2.field748 = false;
        }
        field2693++;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V")
    public final void method1094(boolean arg0) {
        this.field2707 = arg0;
        field2698++;
        class196 var2 = this.field2691;
        synchronized (this.field2691) {
            this.field2691.notifyAll();
        }
        try {
            this.field2705.join();
        } catch (InterruptedException var3) {
        }
        this.field2705 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
    public static void method1095(byte arg0) {
        field2709 = null;
        if (arg0 != 93) {
            method1093(73);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "([BILob;I)Lmf;")
    public final class52 method1096(byte[] arg0, int arg1, class117 arg2, int arg3) {
        field2700++;
        class52 var5 = new class52();
        var5.field858 = arg2;
        var5.field2057 = (long) arg3;
        var5.field741 = false;
        var5.field862 = 2;
        if (arg1 == -3) {
            var5.field868 = arg0;
            this.method1091(var5, 3587);
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILob;I)Lmf;")
    public final class52 method1097(int arg0, class117 arg1, int arg2) {
        int var4 = -90 / ((-arg2 - 26) / 50);
        class52 var5 = new class52();
        field2704++;
        var5.field862 = 1;
        class196 var6 = this.field2691;
        synchronized (this.field2691) {
            class52 var7 = (class52) this.field2691.method1281(false);
            while (true) {
                if (var7 == null) {
                    break;
                }
                if (((long) arg0) == var7.field2057 && var7.field858 == arg1 && var7.field862 == 2) {
                    var5.field748 = false;
                    var5.field868 = var7.field868;
                    return var5;
                }
                var7 = (class52) this.field2691.method1280(-120);
            }
        }
        var5.field868 = arg1.method852(arg0, 0);
        var5.field748 = false;
        var5.field741 = true;
        return var5;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1098(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BLda;)I")
    public static final int method1099(byte arg0, class275 arg1) {
        field2699++;
        if (arg1 == null) {
            return -1;
        }
        int var2 = 0;
        if (arg0 <= 28) {
            return 36;
        }
        while (class63.field1053 > var2) {
            if (arg1.method1844(90, class148.field2585[var2])) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
    public class155() {
        class266 var1 = class3.field24.method368((byte) -126, 5, this);
        while (var1.field4623 == 0) {
            class250.method1640(10L, -57);
        }
        if (var1.field4623 == 2) {
            throw new RuntimeException();
        }
        this.field2705 = (Thread) var1.field4625;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(ILob;I)Lmf;")
    public final class52 method1100(int arg0, class117 arg1, int arg2) {
        class52 var4 = new class52();
        var4.field858 = arg1;
        field2706++;
        var4.field2057 = (long) arg2;
        var4.field741 = false;
        var4.field862 = arg0;
        this.method1091(var4, 3587);
        return var4;
    }
}
