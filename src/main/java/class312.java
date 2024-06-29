import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class312 implements Runnable {

    @OriginalMember(owner = "client!hfa", name = "c", descriptor = "Lre;")
    private class603 field4404 = new class603();

    @OriginalMember(owner = "client!hfa", name = "k", descriptor = "Z")
    private boolean field4412 = false;

    @OriginalMember(owner = "client!hfa", name = "l", descriptor = "I")
    public int field4413 = 0;

    @OriginalMember(owner = "client!hfa", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field4414;

    @OriginalMember(owner = "client!hfa", name = "i", descriptor = "I")
    public static int field4410 = 0;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!hfa", name = "d", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!hfa", name = "e", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!hfa", name = "f", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!hfa", name = "g", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!hfa", name = "h", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!hfa", name = "j", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)V", line = 3)
    public final void method1968(int arg0) {
        this.field4412 = true;
        if (arg0 < 125) {
            field4410 = 83;
        }
        field4408++;
        class603 var2 = this.field4404;
        synchronized (this.field4404) {
            this.field4404.notifyAll();
        }
        try {
            this.field4414.join();
        } catch (InterruptedException var3) {
        }
        this.field4414 = null;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(ZLnp;I)Lbfa;", line = 22)
    public final class370 method1969(boolean arg0, class492 arg1, int arg2) {
        field4405++;
        class370 var4 = new class370();
        var4.field5317 = 1;
        class603 var5 = this.field4404;
        synchronized (this.field4404) {
            class370 var6 = (class370) this.field4404.method3508(-2);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg2 == var6.field6154 && var6.field5318 == arg1 && var6.field5317 == 2) {
                    var4.field5320 = var6.field5320;
                    var4.field3226 = false;
                    return var4;
                }
                var6 = (class370) this.field4404.method3507(-104);
            }
        }
        var4.field5320 = arg1.method2939(0, arg2);
        var4.field3228 = arg0;
        var4.field3226 = false;
        return var4;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "([[BBLjda;)V", line = 56)
    public static final void method1970(byte[][] arg0, byte arg1, class227 arg2) {
        field4409++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg0.length;
        if (arg1 >= -22) {
            return;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg0[var5];
            if (var10 != null) {
                class645 var11 = new class645(var10);
                int var12 = class434.field6462[var5] >> 8;
                int var13 = class434.field6462[var5] & 0xFF;
                int var14 = var12 * 64 - class361.field5224;
                int var15 = var13 * 64 - class582.field8288;
                class290.method1858((byte) 56);
                arg2.method59(var15, var11, class361.field5224, var14, class326.field4655, -13, class582.field8288);
                arg2.method1532(class736.field10316, var15, (byte) -124, var14, var11, var3);
                if (!arg2.field122 && (class352.field5126 / 8) == var12 && class499.field7093 / 8 == var13 && var3[0] != -1) {
                    class704.field9842 = class684.field9464.method1749(class288.field4108, var3[1], var3[3], var3[0], 16, var3[2]);
                    class291.field4170 = var3[4];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class434.field6462[var6] >> 8) * 64 - class361.field5224;
            int var8 = (class434.field6462[var6] & 0xFF) * 64 - class582.field8288;
            byte[] var9 = arg0[var6];
            if (var9 == null && class499.field7093 < 800) {
                class290.method1858((byte) 42);
                arg2.method60(64, var7, 64, -13557, var8);
            }
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(JLvd;IIIZI)V", line = 129)
    public static final void method1971(long arg0, class39 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class740.method4145(arg5, arg2, arg6, -121, arg4, arg0, arg1, arg3);
        field4402++;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Lnp;II)Lbfa;", line = 137)
    public final class370 method1972(class492 arg0, int arg1, int arg2) {
        if (arg1 != 4706) {
            this.field4412 = true;
        }
        field4406++;
        class370 var4 = new class370();
        var4.field5318 = arg0;
        var4.field5317 = 3;
        var4.field3228 = false;
        var4.field6154 = arg2;
        this.method1974(arg1 ^ 0x1260, var4);
        return var4;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Lnp;[BII)Lbfa;", line = 158)
    public final class370 method1973(class492 arg0, byte[] arg1, int arg2, int arg3) {
        int var5 = 92 % ((-arg2 - 15) / 47);
        field4411++;
        class370 var6 = new class370();
        var6.field5318 = arg0;
        var6.field6154 = arg3;
        var6.field5317 = 2;
        var6.field3228 = false;
        var6.field5320 = arg1;
        this.method1974(2, var6);
        return var6;
    }

    @OriginalMember(owner = "client!hfa", name = "run", descriptor = "()V", line = 181)
    public final void run() {
        while (!this.field4412) {
            class603 var1 = this.field4404;
            class370 var2;
            synchronized (this.field4404) {
                var2 = (class370) this.field4404.method3510(-96);
                if (var2 == null) {
                    try {
                        this.field4404.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field4413--;
            }
            try {
                if (var2.field5317 == 2) {
                    var2.field5318.method2936(var2.field5320.length, (int) var2.field6154, 0, var2.field5320);
                } else if (var2.field5317 == 3) {
                    var2.field5320 = var2.field5318.method2939(0, (int) var2.field6154);
                }
            } catch (Exception var6) {
                class326.method2072(-3753, var6, null);
            }
            var2.field3226 = false;
        }
        field4407++;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(ILbfa;)V", line = 225)
    private final void method1974(int arg0, class370 arg1) {
        if (arg0 != 2) {
            return;
        }
        class603 var3 = this.field4404;
        synchronized (this.field4404) {
            this.field4404.method3505(arg1, 4);
            this.field4413++;
            this.field4404.notifyAll();
        }
        field4403++;
    }

    @OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(Lge;)V", line = 258)
    public class312(class711 arg0) {
        class197 var2 = arg0.method4056(this, 91, 5);
        while (var2.field2986 == 0) {
            class277.method1759(10L, 56);
        }
        if (var2.field2986 == 2) {
            throw new RuntimeException();
        }
        this.field4414 = (Thread) var2.field2990;
    }
}
