import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class28 implements Runnable {

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "Ldm;")
    private class98 field361 = new class98();

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "Z")
    private boolean field368 = false;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
    public int field366 = 0;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field369;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public static int field362 = 0;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lis;I)V", line = 3)
    private final void method203(class331 arg0, int arg1) {
        class98 var3 = this.field361;
        synchronized (this.field361) {
            if (arg1 != 26077) {
                this.field361 = null;
            }
            this.field361.method666(8192, arg0);
            this.field366++;
            this.field361.notifyAll();
        }
        field367++;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V", line = 18)
    public final void method204(int arg0) {
        this.field368 = true;
        field359++;
        class98 var2 = this.field361;
        synchronized (this.field361) {
            this.field361.notifyAll();
        }
        int var3 = 77 % ((arg0 + 3) / 42);
        try {
            this.field369.join();
        } catch (InterruptedException var4) {
        }
        this.field369 = null;
    }

    @OriginalMember(owner = "client!wm", name = "run", descriptor = "()V", line = 38)
    public final void run() {
        field363++;
        while (!this.field368) {
            class98 var1 = this.field361;
            class331 var2;
            synchronized (this.field361) {
                var2 = (class331) this.field361.method665((byte) -55);
                if (var2 == null) {
                    try {
                        this.field361.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field366--;
            }
            try {
                if (var2.field4252 == 2) {
                    var2.field4250.method1549((int) var2.field3778, var2.field4249.length, var2.field4249, 1);
                } else if (var2.field4252 == 3) {
                    var2.field4249 = var2.field4250.method1547((byte) 92, (int) var2.field3778);
                }
            } catch (Exception var6) {
                class233.method1495((byte) 49, var6, null);
            }
            var2.field846 = false;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "()V", line = 87)
    public static final void method205() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class523.field7347.length; var1++) {
                if (class523.field7347[var1].method3397()) {
                    class638.field9070[var1] = class523.field7347[var1].method3393();
                } else {
                    synchronized (class523.field7347[var1]) {
                        class523.field7347[var1].notify();
                    }
                    var0 = false;
                }
            }
            if (var0) {
                class523.field7347[class523.field7347.length - 1].method3391();
                class182.method1218(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class523.field7347.length - 1; var4++) {
                        if (!class523.field7347[var4].method3397()) {
                            synchronized (class523.field7347[var4]) {
                                class523.field7347[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class523.field7347.length - 2; var6++) {
                            class523.field7347[var6].method3391();
                        }
                        class182.method1218(2);
                        while (!class523.field7347[0].method3397()) {
                            synchronized (class523.field7347[0]) {
                                class523.field7347[0].notify();
                            }
                            try {
                                class740.method4124(1L, 47);
                            } catch (Exception var9) {
                            }
                        }
                        class523.field7347[0].method3391();
                        return;
                    }
                    try {
                        class740.method4124(1L, 83);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class740.method4124(1L, 89);
            } catch (Exception var8) {
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILhca;I)Lis;", line = 181)
    public final class331 method206(int arg0, class244 arg1, int arg2) {
        field360++;
        class331 var4 = new class331();
        var4.field4252 = 1;
        if (arg2 != 32178) {
            this.method204(-101);
        }
        class98 var5 = this.field361;
        synchronized (this.field361) {
            class331 var6 = (class331) this.field361.method667(true);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg0) == var6.field3778 && var6.field4250 == arg1 && var6.field4252 == 2) {
                    var4.field4249 = var6.field4249;
                    var4.field846 = false;
                    return var4;
                }
                var6 = (class331) this.field361.method662((byte) 17);
            }
        }
        var4.field4249 = arg1.method1547((byte) 71, arg0);
        var4.field846 = false;
        var4.field843 = true;
        return var4;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIII)V", line = 215)
    public static final void method207(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class395.field5484 >= arg3 && arg0 >= class675.field9512) {
            boolean var6;
            if (class490.field6592 > arg2) {
                arg2 = class490.field6592;
                var6 = false;
            } else if (class116.field1628 < arg2) {
                arg2 = class116.field1628;
                var6 = false;
            } else {
                var6 = true;
            }
            boolean var7;
            if (class490.field6592 > arg4) {
                var7 = false;
                arg4 = class490.field6592;
            } else if (arg4 <= class116.field1628) {
                var7 = true;
            } else {
                arg4 = class116.field1628;
                var7 = false;
            }
            if (class675.field9512 > arg3) {
                arg3 = class675.field9512;
            } else {
                class721.method4044(class591.field8480[arg3++], arg2, (byte) -122, arg4, arg1);
            }
            if (class395.field5484 < arg0) {
                arg0 = class395.field5484;
            } else {
                class721.method4044(class591.field8480[arg0--], arg2, (byte) -125, arg4, arg1);
            }
            if (var6 && var7) {
                for (int var8 = arg3; var8 <= arg0; var8++) {
                    int[] var9 = class591.field8480[var8];
                    var9[arg2] = var9[arg4] = arg1;
                }
            } else if (var6) {
                for (int var10 = arg3; var10 <= arg0; var10++) {
                    class591.field8480[var10][arg2] = arg1;
                }
            } else if (var7) {
                for (int var11 = arg3; var11 <= arg0; var11++) {
                    class591.field8480[var11][arg4] = arg1;
                }
            }
        }
        field370++;
        if (arg5 <= 70) {
            field362 = 5;
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(ILhca;I)Lis;", line = 320)
    public final class331 method208(int arg0, class244 arg1, int arg2) {
        if (arg2 < 30) {
            this.field361 = null;
        }
        field365++;
        class331 var4 = new class331();
        var4.field4250 = arg1;
        var4.field4252 = 3;
        var4.field843 = false;
        var4.field3778 = arg0;
        this.method203(var4, 26077);
        return var4;
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lmr;)V", line = 374)
    public class28(class613 arg0) {
        class436 var2 = arg0.method3580(this, 65, 5);
        while (var2.field5975 == 0) {
            class740.method4124(10L, 70);
        }
        if (var2.field5975 == 2) {
            throw new RuntimeException();
        }
        this.field369 = (Thread) var2.field5973;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "([BZILhca;)Lis;", line = 349)
    public final class331 method209(byte[] arg0, boolean arg1, int arg2, class244 arg3) {
        field364++;
        class331 var5 = new class331();
        var5.field4249 = arg0;
        var5.field4250 = arg3;
        var5.field843 = arg1;
        var5.field4252 = 2;
        var5.field3778 = arg2;
        this.method203(var5, 26077);
        return var5;
    }
}
