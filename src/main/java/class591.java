import jagex3.jagmisc.jagmisc;
import java.awt.Canvas;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class591 implements Runnable {

    @OriginalMember(owner = "client!et", name = "h", descriptor = "Lnt;")
    private class220 field8298 = new class220();

    @OriginalMember(owner = "client!et", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field8296 = new Thread(this);

    @OriginalMember(owner = "client!et", name = "g", descriptor = "Lqe;")
    public static class465 field8297 = new class465(113, 6);

    @OriginalMember(owner = "client!et", name = "j", descriptor = "[I")
    public static int[] field8300 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!et", name = "m", descriptor = "[I")
    public static int[] field8303 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!et", name = "a", descriptor = "I")
    public static int field8291;

    @OriginalMember(owner = "client!et", name = "b", descriptor = "I")
    public static int field8292;

    @OriginalMember(owner = "client!et", name = "c", descriptor = "I")
    public static int field8293;

    @OriginalMember(owner = "client!et", name = "d", descriptor = "I")
    public static int field8294;

    @OriginalMember(owner = "client!et", name = "e", descriptor = "I")
    public static int field8295;

    @OriginalMember(owner = "client!et", name = "i", descriptor = "I")
    public static int field8299;

    @OriginalMember(owner = "client!et", name = "k", descriptor = "I")
    public static int field8301;

    @OriginalMember(owner = "client!et", name = "l", descriptor = "I")
    public static int field8302;

    @OriginalMember(owner = "client!et", name = "n", descriptor = "I")
    public static int field8304;

    @OriginalMember(owner = "client!et", name = "o", descriptor = "I")
    public static int field8305;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(BII)I")
    public static final int method3389(byte arg0, int arg1, int arg2) {
        field8294++;
        if (arg1 < arg2) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        if (arg0 < 74) {
            field8302 = -21;
        }
        while (arg2 != 0) {
            int var4 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Ltq;I)V")
    private final void method3390(class626 arg0, int arg1) {
        field8293++;
        if (arg1 != -28008) {
            field8303 = null;
        }
        class220 var3 = this.field8298;
        synchronized (this.field8298) {
            this.field8298.method1526(arg0, 86);
            this.field8298.notify();
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)I")
    public static final int method3391(int arg0) {
        field8301++;
        class58 var1 = class359.field5046;
        boolean var2 = false;
        if (class471.field6781.field6684.method1843(27669) != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class464.method2824(var3, null, 0, null, 0, 0);
            var2 = true;
        }
        long var4 = class742.method4128(arg0 ^ 0x65);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method535(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class742.method4128(1) - var4);
        var1.method542(arg0, 100, arg0 ^ 0xF6A, -16777216, 0, 0);
        if (var2) {
            var1.method623(-1);
        }
        return var7;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/lang/String;B)Lnaa;")
    public final class71 method3392(String arg0, byte arg1) {
        field8299++;
        if (this.field8296 == null) {
            throw new IllegalStateException("");
        }
        int var3 = -27 / ((-arg1 - 7) / 44);
        if (arg0 == null) {
            throw new IllegalArgumentException("");
        }
        class71 var4 = new class71(arg0);
        this.method3390(var4, -28008);
        return var4;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(B)Z")
    public static final boolean method3393(byte arg0) {
        field8305++;
        if (arg0 == 7) {
            return class96.method870(0, "jaclib") ? class96.method870(0, "hw3d") : false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(I)V")
    public final void method3394(int arg0) {
        field8295++;
        if (this.field8296 == null) {
            return;
        }
        this.method3390(new class626(), -28008);
        int var2 = 67 / ((48 - arg0) / 33);
        try {
            this.field8296.join();
        } catch (InterruptedException var3) {
        }
        this.field8296 = null;
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(B)V")
    public static void method3395(byte arg0) {
        int var1 = -50 % ((arg0 + 8) / 38);
        field8297 = null;
        field8303 = null;
        field8300 = null;
    }

    @OriginalMember(owner = "client!et", name = "run", descriptor = "()V")
    public final void run() {
        field8292++;
        while (true) {
            class220 var1 = this.field8298;
            class71 var3;
            synchronized (this.field8298) {
                class626 var2;
                for (var2 = this.field8298.method1521(116); var2 == null; var2 = this.field8298.method1521(111)) {
                    try {
                        this.field8298.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class71)) {
                    return;
                }
                var3 = (class71) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field1276).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field1275 = var5;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IILud;Lvk;)V")
    public static final void method3396(int arg0, int arg1, class35 arg2, class367 arg3) {
        field8291++;
        class69 var4 = new class69();
        if (arg0 != -3) {
            return;
        }
        var4.field1240 = arg2.method273(arg0 + 258);
        var4.field1234 = arg2.method234((byte) -100);
        var4.field1235 = new class637[var4.field1240];
        var4.field1237 = new byte[var4.field1240][][];
        var4.field1238 = new int[var4.field1240];
        var4.field1242 = new class637[var4.field1240];
        var4.field1241 = new int[var4.field1240];
        var4.field1244 = new int[var4.field1240];
        for (int var5 = 0; var5 < var4.field1240; var5++) {
            try {
                int var6 = arg2.method273(255);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg2.method272(2);
                    String var18 = arg2.method272(2);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg2.method234((byte) -113);
                    }
                    var4.field1238[var5] = var6;
                    var4.field1244[var5] = var19;
                    var4.field1235[var5] = arg3.method2294(var18, class374.method2354((byte) -74, var17), false);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg2.method272(~arg0);
                    String var8 = arg2.method272(2);
                    int var9 = arg2.method273(255);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg2.method272(2);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg2.method234((byte) -100);
                            var12[var13] = new byte[var14];
                            arg2.method260(var12[var13], 126, var14, 0);
                        }
                    }
                    var4.field1238[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class374.method2354((byte) -81, var10[var16]);
                    }
                    var4.field1242[var5] = arg3.method2284(class374.method2354((byte) -79, var7), 115, var8, var15);
                    var4.field1237[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field1241[var5] = -1;
            } catch (SecurityException var21) {
                var4.field1241[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field1241[var5] = -3;
            } catch (Exception var23) {
                var4.field1241[var5] = -4;
            } catch (Throwable var24) {
                var4.field1241[var5] = -5;
            }
        }
        class406.field5655.method1526(var4, -58);
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "()V")
    public class591() {
        this.field8296.setDaemon(true);
        this.field8296.start();
    }
}
