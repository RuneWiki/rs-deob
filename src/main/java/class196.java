import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class196 implements Runnable {

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "Loe;")
    private class57 field3164 = new class57();

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
    public int field3175 = 0;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "Z")
    private boolean field3173 = false;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field3179;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "[I")
    public static int[] field3166 = new int[1000];

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "Lqd;")
    public static class173 field3174 = new class173(64);

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
    public static int field3178 = 0;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3176 = " more options";

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "Lqd;")
    public static class173 field3177 = new class173(20);

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILlj;I)Lml;")
    public final class14 method1372(int arg0, class25 arg1, int arg2) {
        field3171++;
        class14 var4 = new class14();
        if (arg0 > -39) {
            method1378((class211) null, 83, 123, 127);
        }
        var4.field150 = arg1;
        var4.field2169 = (long) arg2;
        var4.field153 = 3;
        var4.field201 = false;
        this.method1373(var4, -124);
        return var4;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lml;I)V")
    private final void method1373(class14 arg0, int arg1) {
        class57 var3 = this.field3164;
        synchronized (this.field3164) {
            this.field3164.method395(30985, arg0);
            this.field3175++;
            if (arg1 > -46) {
                return;
            }
            this.field3164.notifyAll();
        }
        field3170++;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
    public final void method1374(int arg0) {
        if (arg0 <= 58) {
            this.method1377((byte) 50, -103, (class25) null);
        }
        field3165++;
        this.field3173 = true;
        class57 var2 = this.field3164;
        synchronized (this.field3164) {
            this.field3164.notifyAll();
        }
        try {
            this.field3179.join();
        } catch (InterruptedException var3) {
        }
        this.field3179 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIII)V")
    public static final void method1375(int arg0, int arg1, int arg2, int arg3) {
        field3181++;
        class175 var4 = class182.method1317(arg1, arg2, false);
        var4.method1279((byte) -80);
        var4.field2865 = arg0;
        var4.field2855 = arg3;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "([BZILlj;)Lml;")
    public final class14 method1376(byte[] arg0, boolean arg1, int arg2, class25 arg3) {
        field3168++;
        class14 var5 = new class14();
        var5.field2169 = (long) arg2;
        var5.field150 = arg3;
        var5.field201 = false;
        var5.field153 = 2;
        if (!arg1) {
            this.method1374(-12);
        }
        var5.field148 = arg0;
        this.method1373(var5, -48);
        return var5;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BILlj;)Lml;")
    public final class14 method1377(byte arg0, int arg1, class25 arg2) {
        class14 var4 = new class14();
        var4.field153 = 1;
        field3180++;
        class57 var5 = this.field3164;
        synchronized (this.field3164) {
            class14 var6 = (class14) this.field3164.method389(0);
            while (true) {
                if (var6 == null) {
                    if (arg0 != -105) {
                        field3178 = -61;
                    }
                    break;
                }
                if ((long) arg1 == var6.field2169 && var6.field150 == arg2 && var6.field153 == 2) {
                    var4.field205 = false;
                    var4.field148 = var6.field148;
                    return var4;
                }
                var6 = (class14) this.field3164.method396(0);
            }
        }
        var4.field148 = arg2.method137(arg0 ^ 0xFFFFFF97, arg1);
        var4.field205 = false;
        var4.field201 = true;
        return var4;
    }

    @OriginalMember(owner = "client!wk", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field3173) {
            class57 var1 = this.field3164;
            class14 var2;
            synchronized (this.field3164) {
                var2 = (class14) this.field3164.method390(-109);
                if (var2 == null) {
                    try {
                        this.field3164.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field3175--;
            }
            try {
                if (var2.field153 == 2) {
                    var2.field150.method135(var2.field148, -24339, (int) var2.field2169, var2.field148.length);
                } else if (var2.field153 == 3) {
                    var2.field148 = var2.field150.method137(0, (int) var2.field2169);
                }
            } catch (Exception var7) {
                class19.method94(-109, var7, (String) null);
            }
            var2.field205 = false;
        }
        field3172++;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lag;III)V")
    public static final void method1378(class211 arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -9347) {
            return;
        }
        field3169++;
        if (client.field4857 != null || class286.field4537 || arg0 == null || class73.method500((byte) 121, arg0) == null) {
            return;
        }
        client.field4857 = arg0;
        class277.field4446 = class73.method500((byte) 114, arg0);
        class151.field2371 = arg3;
        class280.field4484 = 0;
        class272.field4371 = arg2;
        class182.field2999 = false;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
    public static void method1379(int arg0) {
        field3166 = null;
        if (arg0 <= -88) {
            field3174 = null;
            field3176 = null;
            field3177 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V")
    public class196() {
        class172 var1 = class268.field4323.method319(5, this, (byte) -125);
        while (var1.field2814 == 0) {
            class262.method1758(10L, 29552);
        }
        if (var1.field2814 == 2) {
            throw new RuntimeException();
        }
        this.field3179 = (Thread) var1.field2817;
    }
}
