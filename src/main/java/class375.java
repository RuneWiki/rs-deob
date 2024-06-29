import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class375 implements Runnable {

    @OriginalMember(owner = "client!su", name = "i", descriptor = "Lnj;")
    private class317 field5752 = new class317();

    @OriginalMember(owner = "client!su", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field5751 = new Thread(this);

    @OriginalMember(owner = "client!su", name = "e", descriptor = "I")
    public static int field5748 = 0;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!su", name = "b", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!su", name = "c", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!su", name = "d", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!su", name = "g", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!su", name = "j", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!su", name = "k", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!su", name = "l", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!su", name = "f", descriptor = "Lll;")
    public static class377 field5749;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IB)V")
    public static final void method2424(int arg0, byte arg1) {
        field5750++;
        class456 var2 = class233.method1654(arg0, 3, 126);
        var2.method2862(0);
        if (arg1 <= 7) {
            method2430(null, null, false);
        }
    }

    @OriginalMember(owner = "client!su", name = "run", descriptor = "()V")
    public final void run() {
        field5754++;
        while (true) {
            class317 var1 = this.field5752;
            class141 var3;
            synchronized (this.field5752) {
                class529 var2;
                for (var2 = this.field5752.method2127(-106); var2 == null; var2 = this.field5752.method2127(-119)) {
                    try {
                        this.field5752.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class141)) {
                    return;
                }
                var3 = (class141) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field1910).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field1908 = var5;
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(ILwh;)V")
    private final void method2425(int arg0, class529 arg1) {
        class317 var3 = this.field5752;
        synchronized (this.field5752) {
            if (arg0 != 10932) {
                method2424(-121, (byte) -40);
            }
            this.field5752.method2124(arg1, (byte) 102);
            this.field5752.notify();
        }
        field5745++;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I[Lo;)V")
    public static final void method2426(int arg0, class139[] arg1) {
        field5746++;
        class147.field1990 = arg1.length;
        class181.field2633 = new int[class147.field1990 + 10];
        class243.field3946 = new class139[class147.field1990 + 10];
        class324.method2168(arg1, 0, class243.field3946, 0, class147.field1990);
        for (int var2 = 0; var2 < class147.field1990; var2++) {
            class181.field2633[var2] = class243.field3946[var2].method618();
        }
        for (int var3 = class147.field1990; var3 < class243.field3946.length; var3++) {
            class181.field2633[var3] = 12;
        }
        if (arg0 != -2106) {
            field5749 = null;
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(BI)V")
    public static final void method2427(byte arg0, int arg1) {
        class297.field4679 = arg1;
        class6.field71 = -1;
        if (arg0 >= -86) {
            field5749 = null;
        }
        field5755++;
        class6.field71 = -1;
        class100.method676(102);
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(BLjava/lang/String;)Lvn;")
    public final class141 method2428(byte arg0, String arg1) {
        field5744++;
        if (this.field5751 == null) {
            throw new IllegalStateException("");
        } else if (arg1 == null) {
            throw new IllegalArgumentException("");
        } else {
            if (arg0 != -102) {
                this.method2425(83, null);
            }
            class141 var3 = new class141(arg1);
            this.method2425(arg0 + 11034, var3);
            return var3;
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V")
    public final void method2429(byte arg0) {
        field5753++;
        if (this.field5751 == null) {
            return;
        }
        this.method2425(10932, new class529());
        try {
            this.field5751.join();
            if (arg0 <= 108) {
                method2427((byte) -23, 12);
            }
        } catch (InterruptedException var2) {
        }
        this.field5751 = null;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "([[BLhd;Z)V")
    public static final void method2430(byte[][] arg0, class242 arg1, boolean arg2) {
        field5747++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg0.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg0[var5];
            if (var10 != null) {
                class208 var11 = new class208(var10);
                int var12 = class529.field7782[var5] >> 8;
                int var13 = class529.field7782[var5] & 0xFF;
                int var14 = var12 * 64 - class453.field7018;
                int var15 = var13 * 64 - class126.field1718;
                class500.method3052(0);
                arg1.method2849(class352.field5488, var11, 0, class453.field7018, class126.field1718, var14, var15);
                arg1.method1685(var11, var14, 102, var3, class19.field198, var15);
                if (!arg1.field6992 && (class517.field7675 / 8) == var12 && (class95.field1386 / 8) == var13 && var3[0] != -1) {
                    class302.field4737 = class93.field1361.method836(116, class187.field2727, var3[2], var3[0], var3[3], var3[1]);
                    class386.field5898 = var3[4];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class529.field7782[var6] >> 8) * 64 - class453.field7018;
            int var8 = (class529.field7782[var6] & 0xFF) * 64 - class126.field1718;
            byte[] var9 = arg0[var6];
            if (var9 == null && class95.field1386 < 800) {
                class500.method3052(0);
                arg1.method2841(35, var8, var7, 64, 64);
            }
        }
        if (arg2) {
            field5748 = 94;
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I)V")
    public static void method2431(int arg0) {
        if (arg0 > 38) {
            field5749 = null;
        }
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "()V")
    public class375() {
        this.field5751.setDaemon(true);
        this.field5751.start();
    }
}
