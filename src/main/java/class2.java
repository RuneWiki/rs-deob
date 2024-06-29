import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class2 implements Runnable {

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "Lrh;")
    private class69 field16 = new class69();

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public int field23 = 0;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "Z")
    private boolean field22 = false;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field20;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "Z")
    public static boolean field19 = true;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "Ljava/lang/String;")
    public static String field21 = "shake:";

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "[J")
    public static long[] field18 = new long[32];

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V", line = 4)
    public static void method4(int arg0) {
        int var1 = 76 % ((-arg0 - 7) / 55);
        field21 = null;
        field18 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lpd;I)V", line = 15)
    private final void method5(class84 arg0, int arg1) {
        class69 var3 = this.field16;
        synchronized (this.field16) {
            this.field16.method393((byte) 72, arg0);
            this.field23++;
            this.field16.notifyAll();
            if (arg1 != 1) {
                this.method11(119, (byte[]) null, (class334) null, true);
            }
        }
        field9++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZLqk;I)Lpd;", line = 32)
    public final class84 method6(boolean arg0, class334 arg1, int arg2) {
        field24++;
        class84 var4 = new class84();
        var4.field933 = 1;
        class69 var5 = this.field16;
        synchronized (this.field16) {
            class84 var6 = (class84) this.field16.method399(125);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg2 == var6.field2365 && var6.field932 == arg1 && var6.field933 == 2) {
                    var4.field938 = var6.field938;
                    var4.field1708 = false;
                    return var4;
                }
                var6 = (class84) this.field16.method397(18244);
            }
        }
        var4.field938 = arg1.method1905(-13253, arg2);
        var4.field1700 = true;
        var4.field1708 = arg0;
        return var4;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V", line = 64)
    public final void method7(byte arg0) {
        field10++;
        this.field22 = true;
        class69 var2 = this.field16;
        synchronized (this.field16) {
            this.field16.notifyAll();
        }
        if (arg0 <= 61) {
            this.field22 = false;
        }
        try {
            this.field20.join();
        } catch (InterruptedException var3) {
        }
        this.field20 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIZZ)V", line = 84)
    public static final void method8(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        class231.field3184 = arg1;
        class209.field2840 = arg2;
        class430.field6316 = arg3;
        class234.field3225 = new class96[arg0][class231.field3184][class209.field2840];
        class272.field3682 = new class54[4];
        if (arg4) {
            class341.field4571 = new class96[1][class231.field3184][class209.field2840];
            class116.field1450 = new int[class231.field3184][class209.field2840];
            class275.field3707 = new class54[1];
        } else {
            class341.field4571 = null;
            class116.field1450 = null;
            class275.field3707 = null;
        }
        if (arg5) {
            class396.field5706 = new int[arg0][arg1][arg2];
            class227.field3090 = new class106[255];
            class101.field1193 = new boolean[255];
            class436.field6376 = 0;
        } else {
            class396.field5706 = null;
            class227.field3090 = null;
            class101.field1193 = null;
            class436.field6376 = 0;
        }
        class335.method1918(false);
        class179.field2250 = new class427[500];
        class248.field3338 = 0;
        class176.field2208 = new class427[500];
        class68.field706 = 0;
        class220.field2959 = new int[arg0][class231.field3184 + 1][class209.field2840 + 1];
        class420.field6141 = new class17[5000];
        class10.field89 = 0;
        class342.field4573 = new boolean[class430.field6316 + class430.field6316 + 1][class430.field6316 + class430.field6316 + 1];
        class379.field5356 = new boolean[class430.field6316 + class430.field6316 + 2][class430.field6316 + class430.field6316 + 2];
        class211.field2862 = null;
    }

    @OriginalMember(owner = "client!ud", name = "run", descriptor = "()V", line = 132)
    public final void run() {
        field17++;
        while (!this.field22) {
            class69 var1 = this.field16;
            class84 var2;
            synchronized (this.field16) {
                var2 = (class84) this.field16.method398((byte) 38);
                if (var2 == null) {
                    try {
                        this.field16.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field23--;
            }
            try {
                if (var2.field933 == 2) {
                    var2.field932.method1906(var2.field938, 22061, (int) var2.field2365, var2.field938.length);
                } else if (var2.field933 == 3) {
                    var2.field938 = var2.field932.method1905(-13253, (int) var2.field2365);
                }
            } catch (Exception var6) {
                class254.method1439(22292, var6, (String) null);
            }
            var2.field1708 = false;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lam;I)V", line = 176)
    public static final void method9(class286 arg0, int arg1) {
        if (arg1 > 81) {
            field11++;
            class370.field5181 = arg0;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BILqk;)Lpd;", line = 189)
    public final class84 method10(byte arg0, int arg1, class334 arg2) {
        field13++;
        class84 var4 = new class84();
        var4.field2365 = (long) arg1;
        int var5 = -92 % ((-arg0 - 45) / 53);
        var4.field932 = arg2;
        var4.field1700 = false;
        var4.field933 = 3;
        this.method5(var4, 1);
        return var4;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Llh;)V", line = 320)
    public class2(class450 arg0) {
        class304 var2 = arg0.method2788(this, 5, -71);
        while (var2.field4123 == 0) {
            class370.method2235(10L, 10);
        }
        if (var2.field4123 == 2) {
            throw new RuntimeException();
        }
        this.field20 = (Thread) var2.field4126;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[BLqk;Z)Lpd;", line = 231)
    public final class84 method11(int arg0, byte[] arg1, class334 arg2, boolean arg3) {
        field12++;
        class84 var5 = new class84();
        var5.field932 = arg2;
        var5.field938 = arg1;
        var5.field2365 = (long) arg0;
        if (arg3) {
            var5.field933 = 2;
            var5.field1700 = false;
            this.method5(var5, 1);
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([Ljava/lang/String;[SIZI)V", line = 250)
    public static final void method12(String[] arg0, short[] arg1, int arg2, boolean arg3, int arg4) {
        if (arg2 < arg4) {
            int var5 = (arg2 + arg4) / 2;
            int var6 = arg2;
            String var7 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var7;
            short var8 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var8;
            for (int var9 = arg2; var9 < arg4; var9++) {
                if (var7 == null || arg0[var9] != null && arg0[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    short var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg0[arg4] = arg0[var6];
            arg0[var6] = var7;
            arg1[arg4] = arg1[var6];
            arg1[var6] = var8;
            method12(arg0, arg1, arg2, false, var6 - 1);
            method12(arg0, arg1, var6 + 1, false, arg4);
        }
        field15++;
        if (arg3) {
            field18 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)I", line = 304)
    public static final int method13(int arg0, int arg1) {
        if (arg1 != -14956) {
            field18 = null;
        }
        field14++;
        return arg0 >>> 7;
    }
}
