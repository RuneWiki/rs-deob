import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class70 implements Runnable {

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "Ltc;")
    private class196 field1088 = new class196();

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field1089 = new Thread(this);

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "[I")
    public static int[] field1090 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILjava/lang/String;)Lh;")
    public final class396 method476(int arg0, String arg1) {
        if (arg0 != -7633) {
            return null;
        }
        field1092++;
        if (this.field1089 == null) {
            throw new IllegalStateException("");
        } else if (arg1 == null) {
            throw new IllegalArgumentException("");
        } else {
            class396 var3 = new class396(arg1);
            this.method478(-117, var3);
            return var3;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public static void method477(int arg0) {
        field1090 = null;
        if (arg0 != 1) {
            method479(59, -19, (String) null, -123, (String) null, (String) null, -52, (String) null);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILmh;)V")
    private final void method478(int arg0, class376 arg1) {
        field1091++;
        class196 var3 = this.field1088;
        synchronized (this.field1088) {
            int var4 = -93 % ((-arg0 - 35) / 53);
            this.field1088.method1301(50, arg1);
            this.field1088.notify();
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public static final void method479(int arg0, int arg1, String arg2, int arg3, String arg4, String arg5, int arg6, String arg7) {
        for (int var8 = 99; var8 > 0; var8--) {
            class386.field5627[var8] = class386.field5627[var8 - 1];
            class223.field2991[var8] = class223.field2991[var8 - 1];
            class235.field3195[var8] = class235.field3195[var8 - 1];
            class412.field5992[var8] = class412.field5992[var8 - 1];
            class353.field4952[var8] = class353.field4952[var8 - 1];
            class261.field3567[var8] = class261.field3567[var8 - 1];
            class164.field2321[var8] = class164.field2321[var8 - 1];
        }
        field1095++;
        class386.field5627[0] = arg1;
        class223.field2991[0] = arg3;
        class235.field3195[0] = arg7;
        class412.field5992[0] = arg4;
        class353.field4952[0] = arg5;
        class155.field2194++;
        class54.field789 = class441.field6398;
        class164.field2321[0] = arg0;
        if (arg6 == -1) {
            class261.field3567[0] = arg2;
        }
    }

    @OriginalMember(owner = "client!wf", name = "run", descriptor = "()V")
    public final void run() {
        field1093++;
        while (true) {
            class196 var1 = this.field1088;
            class396 var3;
            synchronized (this.field1088) {
                class376 var2;
                for (var2 = this.field1088.method1314((byte) -126); var2 == null; var2 = this.field1088.method1314((byte) 72)) {
                    try {
                        this.field1088.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class396)) {
                    return;
                }
                var3 = (class396) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field5787).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field5789 = var5;
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
    public final void method480(int arg0) {
        field1094++;
        if (arg0 >= -122) {
            this.field1088 = null;
        }
        if (this.field1089 == null) {
            return;
        }
        this.method478(-90, new class376());
        try {
            this.field1089.join();
        } catch (InterruptedException var2) {
        }
        this.field1089 = null;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
    public class70() {
        this.field1089.setDaemon(true);
        this.field1089.start();
    }
}
