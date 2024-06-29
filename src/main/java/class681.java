import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class681 implements Runnable {

    @OriginalMember(owner = "client!ufa", name = "f", descriptor = "Lro;")
    private class2 field9511 = new class2();

    @OriginalMember(owner = "client!ufa", name = "d", descriptor = "Ljava/lang/Thread;")
    private Thread field9509 = new Thread(this);

    @OriginalMember(owner = "client!ufa", name = "g", descriptor = "Lkaa;")
    public static class47 field9512 = new class47(33, 4);

    @OriginalMember(owner = "client!ufa", name = "m", descriptor = "Lhda;")
    public static class752 field9518 = new class752(44, 2);

    @OriginalMember(owner = "client!ufa", name = "n", descriptor = "Lro;")
    public static class2 field9519 = new class2();

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "I")
    public static int field9506;

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "I")
    public static int field9507;

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "I")
    public static int field9508;

    @OriginalMember(owner = "client!ufa", name = "e", descriptor = "I")
    public static int field9510;

    @OriginalMember(owner = "client!ufa", name = "i", descriptor = "I")
    public static int field9514;

    @OriginalMember(owner = "client!ufa", name = "l", descriptor = "I")
    public static int field9517;

    @OriginalMember(owner = "client!ufa", name = "h", descriptor = "Lofa;")
    public static class333 field9513;

    @OriginalMember(owner = "client!ufa", name = "j", descriptor = "Lav;")
    public static class640 field9515;

    @OriginalMember(owner = "client!ufa", name = "k", descriptor = "[[[Lih;")
    public static class701[][][] field9516;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)V")
    public final void method3844(byte arg0) {
        field9506++;
        if (this.field9509 == null) {
            return;
        }
        int var2 = 32 / ((-arg0 - 27) / 35);
        this.method3848(2, new class656());
        try {
            this.field9509.join();
        } catch (InterruptedException var3) {
        }
        this.field9509 = null;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Ljava/lang/String;I)Lu;")
    public final class74 method3845(String arg0, int arg1) {
        if (arg1 != -23210) {
            return null;
        }
        field9508++;
        if (this.field9509 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class74 var3 = new class74(arg0);
            this.method3848(2, var3);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I[BFIFBFFFIIIILcq;)V")
    public static final void method3846(int arg0, byte[] arg1, float arg2, int arg3, float arg4, byte arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, class470 arg13) {
        field9517++;
        int var14 = arg3 * arg9;
        float[] var15 = new float[var14];
        for (int var16 = 0; var16 < arg10; var16++) {
            int var19 = arg12;
            arg13.method2651(var15, arg11, arg4 * 127.0F, (byte) -56, arg3, arg6 / (float) arg9, arg9, 0, arg2 / (float) arg3, arg8 / (float) arg0, arg0);
            arg4 *= arg7;
            arg8 *= 2.0F;
            for (int var20 = 0; var20 < var14; var20++) {
                arg1[var19] = (byte) ((int) ((float) arg1[var19] + var15[var20]));
                var19++;
            }
            arg6 *= 2.0F;
            arg2 *= 2.0F;
        }
        int var17 = arg12;
        int var18 = 0;
        if (arg5 != -67) {
            method3847(55);
        }
        while (var14 > var18) {
            arg1[var17] = (byte) (arg1[var17] + 127);
            var17++;
            var18++;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)V")
    public static void method3847(int arg0) {
        if (arg0 > -51) {
            method3846(1, null, 0.99206257F, 39, -1.298694F, (byte) -31, -0.52409846F, -0.32472795F, -0.7783365F, -18, -14, -48, 83, null);
        }
        field9516 = null;
        field9519 = null;
        field9515 = null;
        field9518 = null;
        field9513 = null;
        field9512 = null;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ILpb;)V")
    private final void method3848(int arg0, class656 arg1) {
        field9510++;
        class2 var3 = this.field9511;
        synchronized (this.field9511) {
            this.field9511.method11(arg1, -101);
            this.field9511.notify();
        }
        if (arg0 != 2) {
            method3847(-5);
        }
    }

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "()V")
    public class681() {
        this.field9509.setDaemon(true);
        this.field9509.start();
    }

    @OriginalMember(owner = "client!ufa", name = "run", descriptor = "()V")
    public final void run() {
        field9514++;
        while (true) {
            class2 var1 = this.field9511;
            class74 var3;
            synchronized (this.field9511) {
                class656 var2;
                for (var2 = this.field9511.method10(false); var2 == null; var2 = this.field9511.method10(false)) {
                    try {
                        this.field9511.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class74)) {
                    return;
                }
                var3 = (class74) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field903).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field900 = var5;
        }
    }
}
