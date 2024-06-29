import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class404 implements Runnable {

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "Lmba;")
    private class646 field5789 = new class646();

    @OriginalMember(owner = "client!ms", name = "g", descriptor = "Ljava/lang/Thread;")
    private Thread field5791 = new Thread(this);

    @OriginalMember(owner = "client!ms", name = "h", descriptor = "Lst;")
    public static class335 field5792 = new class335(65, 4);

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "I")
    public static int field5785;

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "I")
    public static int field5786;

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "I")
    public static int field5787;

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "I")
    public static int field5790;

    @OriginalMember(owner = "client!ms", name = "i", descriptor = "I")
    public static int field5793;

    @OriginalMember(owner = "client!ms", name = "j", descriptor = "I")
    public static int field5794;

    @OriginalMember(owner = "client!ms", name = "k", descriptor = "I")
    public static int field5795;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V", line = 6)
    public static void method2532(int arg0) {
        field5792 = null;
        int var1 = 113 / ((arg0 - 66) / 32);
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Ljava/lang/String;Z)Lqg;", line = 15)
    public final class269 method2533(String arg0, boolean arg1) {
        field5788++;
        if (this.field5791 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class269 var3 = new class269(arg0);
            if (!arg1) {
                this.field5791 = null;
            }
            this.method2534(var3, (byte) 118);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lno;B)V", line = 37)
    private final void method2534(class71 arg0, byte arg1) {
        class646 var3 = this.field5789;
        synchronized (this.field5789) {
            this.field5789.method3610(9289, arg0);
            if (arg1 != 118) {
                this.field5789 = null;
            }
            this.field5789.notify();
        }
        field5795++;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIIBIII)V", line = 51)
    public static final void method2535(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field5786++;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 0;
        int var11 = arg7 - arg6;
        int var12 = arg0 - arg6;
        int var13 = arg7 * arg7;
        int var14 = arg0 * arg0;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg0 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - (var22 - 1) * var20;
        int var27 = -100 % ((88 - arg4) / 35);
        int var28 = var13 << 2;
        int var29 = var14 << 2;
        int var30 = var15 << 2;
        int var31 = var16 << 2;
        int var32 = var17 * 3;
        int var33 = (var21 - 3) * var18;
        int var34 = var19 * 3;
        int var35 = (var22 - 3) * var20;
        int var36 = var29;
        int var37 = (arg0 - 1) * var28;
        int var38 = var31;
        int var39 = (var12 - 1) * var30;
        int[] var40 = class538.field7454[arg1];
        class102.method675(arg2, -68, arg5 - arg7, -var11 + arg5, var40);
        class102.method675(arg3, 116, arg5 - var11, arg5 - -var11, var40);
        class102.method675(arg2, -59, arg5 + var11, arg5 + arg7, var40);
        while (var9 > 0) {
            boolean var41 = var12 >= var9;
            if (var41) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var38;
                        var25 += var34;
                        var34 += var31;
                        var10++;
                        var38 += var31;
                    }
                }
                if (var26 < 0) {
                    var26 += var38;
                    var25 += var34;
                    var38 += var31;
                    var10++;
                    var34 += var31;
                }
                var26 += -var35;
                var25 += -var39;
                var39 -= var30;
                var35 -= var30;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var32;
                    var24 += var36;
                    var36 += var29;
                    var8++;
                    var32 += var29;
                }
            }
            if (var24 < 0) {
                var24 += var36;
                var23 += var32;
                var32 += var29;
                var36 += var29;
                var8++;
            }
            var23 += -var37;
            var24 += -var33;
            var33 -= var28;
            var9--;
            var37 -= var28;
            int var42 = arg1 - var9;
            int var43 = arg1 + var9;
            int var44 = arg5 + var8;
            int var45 = arg5 - var8;
            if (var41) {
                int var46 = arg5 + var10;
                int var47 = arg5 - var10;
                class102.method675(arg2, -123, var45, var47, class538.field7454[var42]);
                class102.method675(arg3, -107, var47, var46, class538.field7454[var42]);
                class102.method675(arg2, 83, var46, var44, class538.field7454[var42]);
                class102.method675(arg2, -114, var45, var47, class538.field7454[var43]);
                class102.method675(arg3, -41, var47, var46, class538.field7454[var43]);
                class102.method675(arg2, 41, var46, var44, class538.field7454[var43]);
            } else {
                class102.method675(arg2, -100, var45, var44, class538.field7454[var42]);
                class102.method675(arg2, 46, var45, var44, class538.field7454[var43]);
            }
        }
    }

    @OriginalMember(owner = "client!ms", name = "run", descriptor = "()V", line = 223)
    public final void run() {
        field5790++;
        while (true) {
            class646 var1 = this.field5789;
            class269 var3;
            synchronized (this.field5789) {
                class71 var2;
                for (var2 = this.field5789.method3623(0); var2 == null; var2 = this.field5789.method3623(0)) {
                    try {
                        this.field5789.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class269)) {
                    return;
                }
                var3 = (class269) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field3928).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field3930 = var5;
        }
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "()V", line = 325)
    public class404() {
        this.field5791.setDaemon(true);
        this.field5791.start();
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIIIIIIB)V", line = 269)
    public static final void method2536(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        if (arg8 >= 3) {
            class275.method1846(arg0, (byte) 56, arg3, arg2, 0, arg1, arg7, arg5, arg6, arg4);
            field5793++;
        }
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)V", line = 280)
    public final void method2537(int arg0) {
        field5785++;
        if (this.field5791 == null) {
            return;
        }
        this.method2534(new class71(), (byte) 118);
        if (arg0 != -1) {
            this.field5789 = null;
        }
        try {
            this.field5791.join();
        } catch (InterruptedException var2) {
        }
        this.field5791 = null;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(ILjava/lang/String;)J", line = 304)
    public static final long method2538(int arg0, String arg1) {
        field5787++;
        int var2 = arg1.length();
        long var3 = 0L;
        int var5 = 0;
        if (arg0 > -100) {
            method2532(-68);
        }
        while (var5 < var2) {
            var3 = (var3 << 5) + ((long) arg1.charAt(var5)) - var3;
            var5++;
        }
        return var3;
    }
}
