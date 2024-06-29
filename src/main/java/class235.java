import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class235 implements Runnable {

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "Lj;")
    private class165 field4202 = new class165();

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "Z")
    private boolean field4203 = false;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
    public int field4206 = 0;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "Ljava/lang/Thread;")
    private Thread field4207;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field4198 = -1;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "Z")
    public static boolean field4195 = true;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "Lcf;")
    public static class93 field4205 = class147.method1066("clignotant2:", -48);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "Lwd;")
    public static class22 field4192;

    @OriginalMember(owner = "client!dc", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field4203) {
            class165 var1 = this.field4202;
            class204 var2;
            synchronized (this.field4202) {
                var2 = (class204) this.field4202.method1195((byte) 69);
                if (var2 == null) {
                    try {
                        this.field4202.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field4206--;
            }
            try {
                if (var2.field3681 == 2) {
                    var2.field3684.method1856(var2.field3678, (int) var2.field4598, var2.field3678.length, 3540);
                } else if (var2.field3681 == 3) {
                    var2.field3678 = var2.field3684.method1860((int) var2.field4598, (byte) 122);
                }
            } catch (Exception var6) {
                class127.method931((byte) -124, (String) null, var6);
            }
            var2.field343 = false;
        }
        field4193++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static final void method1600(int arg0) {
        int var1 = class137.field2394;
        field4201++;
        int var2 = class266.field4739;
        int var3 = class61.field1040;
        int var4 = class147.field2584;
        int var5 = 6116423;
        if (arg0 != -11220) {
            method1608((Component) null, (byte) -96);
        }
        class75.method517(var1, var4, var3, var2, var5);
        class75.method517(var1 + 1, var4 - -1, var3 - 2, 16, 0);
        class75.method513(var1 + 1, var4 + 18, var3 - 2, var2 + -19, 0);
        class183.field3383.method1832(class11.field154, var1 + 3, var4 - -14, var5, -1);
        int var6 = class227.field4056;
        int var7 = class157.field2793;
        for (int var8 = 0; var8 < class253.field4549; var8++) {
            int var9 = 16777215;
            int var10 = var4 - (-((class253.field4549 - var8 - 1) * 15) - 31);
            if (var1 < var6 && (var1 + var3) > var6 && (var10 - 13) < var7 && var10 + 3 > var7) {
                var9 = 16776960;
            }
            class183.field3383.method1832(class3.method12(var8, arg0 + 11337), var1 + 3, var10, var9, 0);
        }
        class165.method1201(class147.field2584, class266.field4739, (byte) -110, class61.field1040, class137.field2394);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILah;[BI)Lkd;")
    public final class204 method1601(int arg0, class277 arg1, byte[] arg2, int arg3) {
        if (arg0 != -48) {
            return null;
        }
        field4204++;
        class204 var5 = new class204();
        var5.field346 = false;
        var5.field4598 = (long) arg3;
        var5.field3684 = arg1;
        var5.field3681 = 2;
        var5.field3678 = arg2;
        this.method1604(true, var5);
        return var5;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lah;BI)Lkd;")
    public final class204 method1602(class277 arg0, byte arg1, int arg2) {
        field4196++;
        class204 var4 = new class204();
        var4.field3681 = 1;
        class165 var5 = this.field4202;
        synchronized (this.field4202) {
            class204 var6 = (class204) this.field4202.method1196(2);
            while (true) {
                if (var6 == null) {
                    if (arg1 >= -10) {
                        this.method1603((byte) 78);
                    }
                    break;
                }
                if (((long) arg2) == var6.field4598 && var6.field3684 == arg0 && var6.field3681 == 2) {
                    var4.field343 = false;
                    var4.field3678 = var6.field3678;
                    return var4;
                }
                var6 = (class204) this.field4202.method1200(9844);
            }
        }
        var4.field3678 = arg0.method1860(arg2, (byte) -27);
        var4.field346 = true;
        var4.field343 = false;
        return var4;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    public final void method1603(byte arg0) {
        this.field4203 = true;
        class165 var2 = this.field4202;
        synchronized (this.field4202) {
            this.field4202.notifyAll();
        }
        field4197++;
        if (arg0 != 85) {
            this.method1607((class277) null, -54, 73);
        }
        try {
            this.field4207.join();
        } catch (InterruptedException var3) {
        }
        this.field4207 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZLkd;)V")
    private final void method1604(boolean arg0, class204 arg1) {
        class165 var3 = this.field4202;
        synchronized (this.field4202) {
            this.field4202.method1190(64, arg1);
            this.field4206++;
            this.field4202.notifyAll();
            if (!arg0) {
                this.method1602((class277) null, (byte) -111, 115);
            }
        }
        field4191++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIZI)V")
    public static final void method1605(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (!arg4) {
            method1606(-69);
        }
        field4200++;
        if (arg0 == arg5) {
            class196.method1411(18650, arg0, arg2, arg1, arg3);
        } else if ((arg1 - arg0) >= class277.field4967 && arg0 + arg1 <= class147.field2593 && class26.field342 <= (arg3 - arg5) && class271.field4820 >= (arg3 + arg5)) {
            class254.method1726(arg0, (byte) -51, arg3, arg1, arg5, arg2);
        } else {
            class42.method239(0, arg0, arg2, arg5, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    public static void method1606(int arg0) {
        if (arg0 != -13) {
            method1605(115, 0, -31, 125, true, 61);
        }
        field4192 = null;
        field4205 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lah;II)Lkd;")
    public final class204 method1607(class277 arg0, int arg1, int arg2) {
        field4194++;
        if (arg2 >= -24) {
            field4198 = 32;
        }
        class204 var4 = new class204();
        var4.field3684 = arg0;
        var4.field346 = false;
        var4.field3681 = 3;
        var4.field4598 = (long) arg1;
        this.method1604(true, var4);
        return var4;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method1608(Component arg0, byte arg1) {
        arg0.addMouseListener(class272.field4835);
        arg0.addMouseMotionListener(class272.field4835);
        if (arg1 == -15) {
            field4199++;
            arg0.addFocusListener(class272.field4835);
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class235() {
        class22 var1 = class169.field2967.method1960(5, this, (byte) -56);
        while (var1.field290 == 0) {
            class53.method290(10L, true);
        }
        if (var1.field290 == 2) {
            throw new RuntimeException();
        }
        this.field4207 = (Thread) var1.field292;
    }
}
