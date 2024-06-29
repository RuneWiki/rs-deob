import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class14 implements Runnable {

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "Loaa;")
    private class305 field211 = new class305();

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public int field213 = 0;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "Z")
    private boolean field215 = false;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field214;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Lfja;")
    public static class783 field212 = new class783(68, -1);

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "Lul;")
    public static class599 field216 = new class599(1);

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "Lbba;")
    public static class125 field217 = new class125(16);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)Ljava/lang/String;", line = 3)
    public static final String method76(int arg0, int arg1) {
        field209++;
        String var2 = Integer.toString(arg0);
        if (arg1 >= -38) {
            return null;
        }
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class641.field8851.method3566((byte) -77, class464.field6309) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class641.field8853.method3566((byte) 127, class464.field6309) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!ma", name = "run", descriptor = "()V", line = 31)
    public final void run() {
        field207++;
        while (!this.field215) {
            class305 var1 = this.field211;
            class312 var2;
            synchronized (this.field211) {
                var2 = (class312) this.field211.method1948(true);
                if (var2 == null) {
                    try {
                        this.field211.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field213--;
            }
            try {
                if (var2.field4259 == 2) {
                    var2.field4261.method1605(var2.field4255, var2.field4255.length, 255, (int) var2.field7008);
                } else if (var2.field4259 == 3) {
                    var2.field4255 = var2.field4261.method1604((int) var2.field7008, true);
                }
            } catch (Exception var6) {
                class281.method1820(null, 28395, var6);
            }
            var2.field2489 = false;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V", line = 77)
    public static void method77(int arg0) {
        field212 = null;
        field216 = null;
        field217 = null;
        if (arg0 != -27146) {
            field217 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lod;I)V", line = 91)
    public static final void method78(class534 arg0, int arg1) {
        int var2 = 60 / ((62 - arg1) / 52);
        field210++;
        if (arg0 == null) {
            return;
        }
        class208.field3119.method3594((byte) 103, arg0);
        class690.field9574++;
        Object var3 = null;
        class606 var6;
        if (arg0.field7228 || "".equals(arg0.field7233)) {
            var6 = new class606(arg0.field7233);
            class430.field5861++;
        } else {
            long var4 = arg0.field7235;
            for (var6 = (class606) class732.field10102.method337(var4, 1); var6 != null && !var6.field8462.equals(arg0.field7233); var6 = (class606) class732.field10102.method344((byte) 122)) {
            }
            if (var6 == null) {
                var6 = (class606) class668.field9294.method266((byte) -98, var4);
                if (var6 != null && !var6.field8462.equals(arg0.field7233)) {
                    var6 = null;
                }
                if (var6 == null) {
                    var6 = new class606(arg0.field7233);
                }
                class732.field10102.method341(var4, var6, (byte) 25);
                class430.field5861++;
            }
        }
        if (var6.method3440(arg0, (byte) -61)) {
            client.method2011((byte) -69, var6);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lrt;IB)Ltf;", line = 146)
    public final class312 method79(class241 arg0, int arg1, byte arg2) {
        int var4 = 77 / ((-arg2 - 57) / 60);
        field205++;
        class312 var5 = new class312();
        var5.field4259 = 3;
        var5.field2490 = false;
        var5.field7008 = arg1;
        var5.field4261 = arg0;
        this.method83(-121, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(Lrt;IB)Ltf;", line = 164)
    public final class312 method80(class241 arg0, int arg1, byte arg2) {
        field203++;
        class312 var4 = new class312();
        var4.field4259 = 1;
        class305 var5 = this.field211;
        synchronized (this.field211) {
            class312 var6 = (class312) this.field211.method1951(-723780560);
            if (arg2 != -69) {
                field218 = 25;
            }
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg1) == var6.field7008 && var6.field4261 == arg0 && var6.field4259 == 2) {
                    var4.field4255 = var6.field4255;
                    var4.field2489 = false;
                    return var4;
                }
                var6 = (class312) this.field211.method1946(arg2 ^ 0x1B79);
            }
        }
        var4.field4255 = arg0.method1604(arg1, true);
        var4.field2490 = true;
        var4.field2489 = false;
        return var4;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([BZLrt;I)Ltf;", line = 199)
    public final class312 method81(byte[] arg0, boolean arg1, class241 arg2, int arg3) {
        field204++;
        class312 var5 = new class312();
        var5.field4255 = arg0;
        var5.field2490 = false;
        var5.field7008 = arg3;
        var5.field4259 = 2;
        var5.field4261 = arg2;
        if (!arg1) {
            field212 = null;
        }
        this.method83(-103, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V", line = 219)
    public final void method82(int arg0) {
        this.field215 = true;
        field208++;
        class305 var2 = this.field211;
        synchronized (this.field211) {
            this.field211.notifyAll();
            if (arg0 != -18733) {
                method76(-89, -75);
            }
        }
        try {
            this.field214.join();
        } catch (InterruptedException var3) {
        }
        this.field214 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILtf;)V", line = 243)
    private final void method83(int arg0, class312 arg1) {
        if (arg0 >= -77) {
            method78(null, -30);
        }
        class305 var3 = this.field211;
        synchronized (this.field211) {
            this.field211.method1953((byte) 83, arg1);
            this.field213++;
            this.field211.notifyAll();
        }
        field206++;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Llu;)V", line = 278)
    public class14(class742 arg0) {
        class545 var2 = arg0.method4116(5, this, (byte) 124);
        while (var2.field7412 == 0) {
            class643.method3577(10L, 0);
        }
        if (var2.field7412 == 2) {
            throw new RuntimeException();
        }
        this.field214 = (Thread) var2.field7416;
    }
}
