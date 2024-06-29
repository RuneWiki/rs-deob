import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public class class246 implements Runnable {

    @OriginalMember(owner = "client!dia", name = "i", descriptor = "Lqw;")
    private class84 field3218 = new class84();

    @OriginalMember(owner = "client!dia", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field3220 = new Thread(this);

    @OriginalMember(owner = "client!dia", name = "d", descriptor = "Z")
    public static boolean field3213 = false;

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "Ljb;")
    public static class519 field3211 = new class519(105, 3);

    @OriginalMember(owner = "client!dia", name = "f", descriptor = "I")
    public static int field3215 = 0;

    @OriginalMember(owner = "client!dia", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field3216 = new String[200];

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!dia", name = "c", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!dia", name = "e", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!dia", name = "h", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!dia", name = "j", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(Z)V")
    public static void method1527(boolean arg0) {
        field3211 = null;
        if (!arg0) {
            field3216 = null;
        }
        field3216 = null;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(II[B[BIIIII)V")
    public static final void method1528(int arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3210++;
        int var9 = -(arg4 >> 2);
        int var10 = -(arg4 & 0x3);
        int var11 = -arg1;
        if (arg7 != 0) {
            field3211 = null;
        }
        while (var11 < 0) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg8++;
                arg3[var10001] += arg2[arg0++];
                int var14 = arg8++;
                arg3[var14] += arg2[arg0++];
                int var15 = arg8++;
                arg3[var15] += arg2[arg0++];
                int var16 = arg8++;
                arg3[var16] += arg2[arg0++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg8++;
                arg3[var10001] += arg2[arg0++];
            }
            arg0 += arg6;
            arg8 += arg5;
            var11++;
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(Ljava/lang/String;Z)Lrda;")
    public final class689 method1529(String arg0, boolean arg1) {
        field3217++;
        if (arg1) {
            this.field3220 = null;
        }
        if (this.field3220 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class689 var3 = new class689(arg0);
            this.method1530((byte) -96, var3);
            return var3;
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(BLmg;)V")
    private final void method1530(byte arg0, class159 arg1) {
        field3214++;
        class84 var3 = this.field3218;
        synchronized (this.field3218) {
            if (arg0 == -96) {
                this.field3218.method689(arg1, arg0 + 194);
                this.field3218.notify();
            }
        }
    }

    @OriginalMember(owner = "client!dia", name = "run", descriptor = "()V")
    public final void run() {
        field3212++;
        while (true) {
            class84 var1 = this.field3218;
            class689 var3;
            synchronized (this.field3218) {
                class159 var2;
                for (var2 = this.field3218.method687((byte) -92); var2 == null; var2 = this.field3218.method687((byte) -57)) {
                    try {
                        this.field3218.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class689)) {
                    return;
                }
                var3 = (class689) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field9212).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field9211 = var5;
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(B)V")
    public final void method1531(byte arg0) {
        int var2 = 99 / ((arg0 + 43) / 51);
        field3219++;
        if (this.field3220 == null) {
            return;
        }
        this.method1530((byte) -96, new class159());
        try {
            this.field3220.join();
        } catch (InterruptedException var3) {
        }
        this.field3220 = null;
    }

    @OriginalMember(owner = "client!dia", name = "<init>", descriptor = "()V")
    public class246() {
        this.field3220.setDaemon(true);
        this.field3220.start();
    }
}
