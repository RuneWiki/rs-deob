import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class217 implements Runnable {

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Luc;")
    private class202 field3366 = new class202();

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "Z")
    private boolean field3380 = false;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public int field3373 = 0;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field3369;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field3370 = 0;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field3372 = -1;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "F")
    public static float field3376 = 0.0F;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "Ljava/lang/String;")
    public static String field3382 = "flash2:";

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "F")
    public static float field3374;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "Ltk;")
    public static class266 field3381;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lpm;IZ)Lon;", line = 5)
    public final class78 method1568(class111 arg0, int arg1, boolean arg2) {
        class78 var4 = new class78();
        var4.field2439 = arg2;
        var4.field2003 = (long) arg1;
        var4.field1219 = arg0;
        field3364++;
        var4.field1218 = 3;
        this.method1571(var4, true);
        return var4;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V", line = 21)
    public final void method1569(byte arg0) {
        field3368++;
        this.field3380 = true;
        class202 var2 = this.field3366;
        synchronized (this.field3366) {
            this.field3366.notifyAll();
        }
        try {
            this.field3369.join();
        } catch (InterruptedException var5) {
        }
        if (arg0 < -6) {
            this.field3369 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 40)
    public static void method1570(int arg0) {
        field3381 = null;
        field3382 = null;
        if (arg0 != 3018) {
            method1572((boolean[]) null, (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), (int[]) null, (int[][]) ((int[][]) null), -28, -2, (byte) 40, -63, true, false, -84, 1, (int[][]) ((int[][]) null), false, -51, -23, false, 103, (float[][]) ((float[][]) null), (class256) null, 125);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lon;Z)V", line = 52)
    private final void method1571(class78 arg0, boolean arg1) {
        class202 var3 = this.field3366;
        synchronized (this.field3366) {
            if (!arg1) {
                method1572((boolean[]) null, (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), (int[]) null, (int[][]) ((int[][]) null), -38, -97, (byte) -39, 127, false, true, 117, 97, (int[][]) ((int[][]) null), false, 59, 20, true, 82, (float[][]) ((float[][]) null), (class256) null, 111);
            }
            this.field3366.method1453(arg0, -93);
            this.field3373++;
            this.field3366.notifyAll();
        }
        field3377++;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V", line = 240)
    public class217() {
        class23 var1 = class92.field1484.method553(this, (byte) 102, 5);
        while (var1.field405 == 0) {
            class245.method1729(-8, 10L);
        }
        if (var1.field405 == 2) {
            throw new RuntimeException();
        }
        this.field3369 = (Thread) var1.field409;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([Z[[F[[F[I[[IIIBIZZII[[IZIIZI[[FLtd;I)V", line = 86)
    public static final void method1572(boolean[] arg0, float[][] arg1, float[][] arg2, int[] arg3, int[][] arg4, int arg5, int arg6, byte arg7, int arg8, boolean arg9, boolean arg10, int arg11, int arg12, int[][] arg13, boolean arg14, int arg15, int arg16, boolean arg17, int arg18, float[][] arg19, class256 arg20, int arg21) {
        int var22 = (arg8 << 8) + (arg14 ? 255 : 0);
        int var23 = (arg11 << 8) + (arg17 ? 255 : 0);
        field3375++;
        int var24 = (arg12 << 8) + (arg9 ? 255 : 0);
        if (arg16 != 2) {
            field3367 = -79;
        }
        int var25 = (arg10 ? 255 : 0) + (arg18 << 8);
        int[] var26 = new int[arg3.length / 2];
        for (int var27 = 0; var27 < var26.length; var27++) {
            int var28 = arg3[var27 + var27];
            int[][] var29 = arg4 == null || arg0 == null || !arg0[var27] ? arg13 : arg4;
            int var30 = arg3[var27 + var27 + 1];
            var26[var27] = class218.method1575(var24, var25, (float) arg5, arg2, arg20, arg6, var22, var30, var28, arg4, var29, arg7, -8515, false, arg15, arg1, arg19, var23);
        }
        arg20.method1772(arg21, arg15, arg6, var26, (int[]) null, false);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IILpm;)Lon;", line = 122)
    public final class78 method1573(int arg0, int arg1, class111 arg2) {
        field3379++;
        class78 var4 = new class78();
        var4.field1218 = 1;
        class202 var5 = this.field3366;
        synchronized (this.field3366) {
            for (class78 var6 = (class78) this.field3366.method1449(arg1 + 21); var6 != null; var6 = (class78) this.field3366.method1448(23)) {
                if ((long) arg0 == var6.field2003 && var6.field1219 == arg2 && var6.field1218 == 2) {
                    var4.field1220 = var6.field1220;
                    var4.field2433 = false;
                    return var4;
                }
            }
        }
        if (arg1 != 2) {
            field3370 = -110;
        }
        var4.field1220 = arg2.method873(arg0, -17049);
        var4.field2433 = false;
        var4.field2439 = true;
        return var4;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lpm;[BIB)Lon;", line = 157)
    public final class78 method1574(class111 arg0, byte[] arg1, int arg2, byte arg3) {
        field3378++;
        class78 var5 = new class78();
        if (arg3 >= -70) {
            return (class78) null;
        }
        var5.field2439 = false;
        var5.field1220 = arg1;
        var5.field1218 = 2;
        var5.field1219 = arg0;
        var5.field2003 = (long) arg2;
        this.method1571(var5, true);
        return var5;
    }

    @OriginalMember(owner = "client!ea", name = "run", descriptor = "()V", line = 184)
    public final void run() {
        field3365++;
        while (!this.field3380) {
            class202 var1 = this.field3366;
            class78 var2;
            synchronized (this.field3366) {
                var2 = (class78) this.field3366.method1452(13634);
                if (var2 == null) {
                    try {
                        this.field3366.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field3373--;
            }
            try {
                if (var2.field1218 == 2) {
                    var2.field1219.method869(var2.field1220, var2.field1220.length, -4278, (int) var2.field2003);
                } else if (var2.field1218 == 3) {
                    var2.field1220 = var2.field1219.method873((int) var2.field2003, -17049);
                }
            } catch (Exception var6) {
                class79.method622((String) null, var6, -652852820);
            }
            var2.field2433 = false;
        }
    }
}
