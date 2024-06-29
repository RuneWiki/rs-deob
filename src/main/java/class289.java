import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class289 implements Runnable {

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Lvm;")
    private class84 field4533 = new class84();

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public int field4536 = 0;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "Z")
    private boolean field4537 = false;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field4539;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4527 = "Loading interfaces - ";

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field4528 = -1;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Llc;")
    public static class175 field4534;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "[Lbi;")
    public static class91[] field4529;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V", line = 4)
    public static void method2061(int arg0) {
        field4527 = null;
        if (arg0 == 0) {
            field4534 = null;
            field4529 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIBIIII)V", line = 17)
    public static final void method2062(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 == arg2 && arg6 == arg8 && arg3 == arg9 && arg4 == arg7) {
            class233.method1647(arg0, arg3, arg1, 107, arg4, arg8);
        } else {
            int var10 = arg1;
            int var11 = arg2 * 3;
            int var12 = arg8 * 3;
            int var13 = arg1 * 3;
            int var14 = arg8;
            int var15 = arg6 * 3;
            int var16 = arg9 * 3;
            int var17 = arg7 * 3;
            int var18 = var16 + var13 - var11 - var11;
            int var19 = arg3 + var11 - var16 - arg1;
            int var20 = var17 + var12 - var15 - var15;
            int var21 = var11 - var13;
            int var22 = arg4 + var15 - arg8 - var17;
            int var23 = var15 - var12;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var18 * var25;
                int var27 = var24 * var25 >> 12;
                int var28 = var20 * var25;
                int var29 = var19 * var27;
                int var30 = var22 * var27;
                int var31 = var23 * var24;
                int var32 = var21 * var24;
                int var33 = arg8 + (var28 + var31 + var30 >> 12);
                int var34 = (var26 + var32 + var29 >> 12) + arg1;
                class233.method1647(arg0, var34, var10, 109, var33, var14);
                var14 = var33;
                var10 = var34;
            }
        }
        field4526++;
        if (arg5 < 15) {
            field4528 = -50;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IILjg;)Lhg;", line = 92)
    public final class183 method2063(int arg0, int arg1, class315 arg2) {
        field4530++;
        class183 var4 = new class183();
        var4.field2572 = false;
        var4.field2637 = arg1;
        var4.field2645 = arg2;
        var4.field1344 = (long) arg0;
        this.method2069(var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILjg;I)Lhg;", line = 120)
    public final class183 method2064(int arg0, class315 arg1, int arg2) {
        class183 var4 = new class183();
        var4.field2637 = 1;
        field4525++;
        class84 var5 = this.field4533;
        synchronized (this.field4533) {
            class183 var6 = (class183) this.field4533.method499(3346);
            while (true) {
                if (var6 == null) {
                    if (arg2 != 1438536492) {
                        field4529 = (class91[]) null;
                    }
                    break;
                }
                if ((long) arg0 == var6.field1344 && var6.field2645 == arg1 && var6.field2637 == 2) {
                    var4.field2578 = false;
                    var4.field2641 = var6.field2641;
                    return var4;
                }
                var6 = (class183) this.field4533.method501((byte) 102);
            }
        }
        var4.field2641 = arg1.method2200(arg0, 0);
        var4.field2572 = true;
        var4.field2578 = false;
        return var4;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIILg;II)V", line = 161)
    public static final void method2065(int arg0, int arg1, int arg2, int arg3, class170 arg4, int arg5, int arg6) {
        class41.method241(arg3, arg2, arg4.field2357, arg6, (byte) -125, arg4.field2392, arg1, arg5);
        if (arg0 == -3) {
            field4531++;
        }
    }

    @OriginalMember(owner = "client!a", name = "run", descriptor = "()V", line = 175)
    public final void run() {
        field4538++;
        while (!this.field4537) {
            class84 var1 = this.field4533;
            class183 var2;
            synchronized (this.field4533) {
                var2 = (class183) this.field4533.method494(10425);
                if (var2 == null) {
                    try {
                        this.field4533.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field4536--;
            }
            try {
                if (var2.field2637 == 2) {
                    var2.field2645.method2202((int) var2.field1344, var2.field2641.length, 57, var2.field2641);
                } else if (var2.field2637 == 3) {
                    var2.field2641 = var2.field2645.method2200((int) var2.field1344, 0);
                }
            } catch (Exception var6) {
                class42.method245((String) null, 1, var6);
            }
            var2.field2578 = false;
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V", line = 339)
    public class289() {
        class18 var1 = class9.field131.method1926(5, (byte) 49, this);
        while (var1.field238 == 0) {
            class81.method485(10L, 1);
        }
        if (var1.field238 == 2) {
            throw new RuntimeException();
        }
        this.field4539 = (Thread) var1.field241;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V", line = 223)
    public final void method2066(int arg0) {
        this.field4537 = true;
        class84 var2 = this.field4533;
        synchronized (this.field4533) {
            this.field4533.notifyAll();
        }
        if (arg0 != 3) {
            method2065(40, -99, -43, -115, (class170) null, -65, -51);
        }
        field4532++;
        try {
            this.field4539.join();
        } catch (InterruptedException var5) {
        }
        this.field4539 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I[BLjg;B)Lhg;", line = 243)
    public final class183 method2067(int arg0, byte[] arg1, class315 arg2, byte arg3) {
        field4524++;
        class183 var5 = new class183();
        var5.field2572 = false;
        var5.field2637 = 2;
        var5.field1344 = (long) arg0;
        var5.field2645 = arg2;
        if (arg3 == 39) {
            var5.field2641 = arg1;
            this.method2069(var5, arg3 ^ 0x27);
            return var5;
        } else {
            return (class183) null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BLhc;II)V", line = 265)
    public static final void method2068(byte arg0, class184 arg1, int arg2, int arg3) {
        field4540++;
        if (arg1.field2435 == arg2 && arg2 != -1) {
            class247 var4 = class185.method1289(arg2, (byte) 109);
            int var5 = var4.field3729;
            if (var5 == 1) {
                arg1.field2366 = 0;
                arg1.field2405 = 1;
                arg1.field2365 = arg3;
                arg1.field2425 = 0;
                arg1.field2356 = 0;
                class337.method2329(false, var4, (byte) -97, arg1.field2392, arg1.field2357, arg1.field2425);
            }
            if (var5 == 2) {
                arg1.field2356 = 0;
            }
        } else if (arg2 == -1 || arg1.field2435 == -1 || class185.method1289(arg2, (byte) 121).field3740 >= class185.method1289(arg1.field2435, (byte) 112).field3740) {
            arg1.field2365 = arg3;
            arg1.field2425 = 0;
            arg1.field2405 = 1;
            arg1.field2450 = arg1.field2411;
            arg1.field2356 = 0;
            arg1.field2435 = arg2;
            arg1.field2366 = 0;
            if (arg1.field2435 != -1) {
                class337.method2329(false, class185.method1289(arg1.field2435, (byte) 119), (byte) -97, arg1.field2392, arg1.field2357, arg1.field2425);
            }
        }
        if (arg0 <= 106) {
            method2062(7, -17, -19, 9, 67, (byte) -34, -14, -23, -56, 126);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lhg;I)V", line = 321)
    private final void method2069(class183 arg0, int arg1) {
        class84 var3 = this.field4533;
        synchronized (this.field4533) {
            this.field4533.method495((byte) -117, arg0);
            this.field4536++;
            if (arg1 != 0) {
                method2062(-100, -96, -64, -54, -20, (byte) -52, 30, -4, -90, -17);
            }
            this.field4533.notifyAll();
        }
        field4535++;
    }
}
