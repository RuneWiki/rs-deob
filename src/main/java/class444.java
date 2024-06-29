import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class444 implements Runnable {

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "Lst;")
    private class366 field6319 = new class366();

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public int field6321 = 0;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "Z")
    private boolean field6323 = false;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field6324;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "Lej;")
    public static class104 field6322 = new class104("Loaded SW3D", "SW3D geladen", "SW3D chargé", "SW3D carregado");

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
    public static int field6326 = 1;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field6317;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field6320;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    public static int field6325;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Loba;II)Lkv;")
    public final class226 method2624(class219 arg0, int arg1, int arg2) {
        field6314++;
        if (arg2 < 45) {
            this.field6324 = null;
        }
        class226 var4 = new class226();
        var4.field3232 = arg0;
        var4.field2110 = arg1;
        var4.field791 = false;
        var4.field3237 = 3;
        this.method2629(var4, -24216);
        return var4;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
    public final void method2625(byte arg0) {
        this.field6323 = true;
        field6317++;
        class366 var2 = this.field6319;
        synchronized (this.field6319) {
            this.field6319.notifyAll();
        }
        try {
            this.field6324.join();
        } catch (InterruptedException var3) {
        }
        if (arg0 != -116) {
            this.field6321 = 113;
        }
        this.field6324 = null;
    }

    @OriginalMember(owner = "client!ni", name = "run", descriptor = "()V")
    public final void run() {
        field6316++;
        while (!this.field6323) {
            class366 var1 = this.field6319;
            class226 var2;
            synchronized (this.field6319) {
                var2 = (class226) this.field6319.method2193(-11636);
                if (var2 == null) {
                    try {
                        this.field6319.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field6321--;
            }
            try {
                if (var2.field3237 == 2) {
                    var2.field3232.method1412((int) var2.field2110, var2.field3231, 520, var2.field3231.length);
                } else if (var2.field3237 == 3) {
                    var2.field3231 = var2.field3232.method1414(7745, (int) var2.field2110);
                }
            } catch (Exception var6) {
                class235.method1474(var6, null, (byte) 115);
            }
            var2.field792 = false;
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(Loba;II)Lkv;")
    public final class226 method2626(class219 arg0, int arg1, int arg2) {
        field6315++;
        class226 var4 = new class226();
        var4.field3237 = 1;
        class366 var5 = this.field6319;
        synchronized (this.field6319) {
            class226 var6 = (class226) this.field6319.method2197(0);
            while (true) {
                if (var6 == null) {
                    if (arg2 >= -34) {
                        field6322 = null;
                    }
                    break;
                }
                if (((long) arg1) == var6.field2110 && var6.field3232 == arg0 && var6.field3237 == 2) {
                    var4.field792 = false;
                    var4.field3231 = var6.field3231;
                    return var4;
                }
                var6 = (class226) this.field6319.method2200(-1);
            }
        }
        var4.field3231 = arg0.method1414(7745, arg1);
        var4.field792 = false;
        var4.field791 = true;
        return var4;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Loba;IZ[B)Lkv;")
    public final class226 method2627(class219 arg0, int arg1, boolean arg2, byte[] arg3) {
        field6320++;
        class226 var5 = new class226();
        var5.field3231 = arg3;
        var5.field2110 = arg1;
        var5.field3237 = 2;
        var5.field791 = arg2;
        var5.field3232 = arg0;
        this.method2629(var5, -24216);
        return var5;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIILwe;Lwe;)V")
    public static final void method2628(int arg0, int arg1, int arg2, class344 arg3, class344 arg4) {
        class622 var5 = class452.method2656(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field8985 = arg3;
            var5.field8982 = arg4;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lkv;I)V")
    private final void method2629(class226 arg0, int arg1) {
        field6318++;
        class366 var3 = this.field6319;
        synchronized (this.field6319) {
            this.field6319.method2199(-23751, arg0);
            this.field6321++;
            this.field6319.notifyAll();
            if (arg1 != -24216) {
                field6322 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)V")
    public static void method2630(byte arg0) {
        if (arg0 >= -76) {
            method2628(-8, -96, -94, null, null);
        }
        field6322 = null;
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Ldj;)V")
    public class444(class288 arg0) {
        class382 var2 = arg0.method1848(-10, this, 5);
        while (var2.field5134 == 0) {
            class21.method220(0, 10L);
        }
        if (var2.field5134 == 2) {
            throw new RuntimeException();
        }
        this.field6324 = (Thread) var2.field5132;
    }
}
