import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class507 implements Runnable {

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Lgca;")
    private class227 field6949 = new class227();

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field6957 = new Thread(this);

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field6950 = -1;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "Lkr;")
    public static class693 field6948 = new class693();

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "F")
    public static float field6955;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field6947;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field6951;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field6952;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field6954;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field6956;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field6958;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "Lsea;")
    public static class648 field6953;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V", line = 7)
    public static final void method2896(int arg0, int arg1) {
        field6952++;
        int var2 = 113 / ((47 - arg0) / 37);
        class51 var3 = class703.method3938(-1989279584, arg1, 12);
        var3.method404(90);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lrp;I)V", line = 19)
    private final void method2897(class401 arg0, int arg1) {
        field6954++;
        if (arg1 >= -2) {
            method2900(-38, -128);
        }
        class227 var3 = this.field6949;
        synchronized (this.field6949) {
            this.field6949.method1441(arg0, 0);
            this.field6949.notify();
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 33)
    public final void method2898(int arg0) {
        if (arg0 != -201) {
            this.method2897(null, -103);
        }
        field6958++;
        if (this.field6957 == null) {
            return;
        }
        this.method2897(new class401(), -20);
        try {
            this.field6957.join();
        } catch (InterruptedException var2) {
        }
        this.field6957 = null;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V", line = 55)
    public static void method2899(int arg0) {
        field6953 = null;
        if (arg0 != 2) {
            method2899(63);
        }
        field6948 = null;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)V", line = 70)
    public static final void method2900(int arg0, int arg1) {
        if (arg1 == 37) {
            class510.field6991 = 3.0F;
        } else if (arg1 == 50) {
            class510.field6991 = 4.0F;
        } else if (arg1 == 75) {
            class510.field6991 = 6.0F;
        } else if (arg1 == 100) {
            class510.field6991 = 8.0F;
        } else if (arg1 == 200) {
            class510.field6991 = 16.0F;
        }
        field6947++;
        int var2 = -26 / ((-arg0 - 65) / 35);
        class14.field152 = -1;
        class14.field152 = -1;
    }

    @OriginalMember(owner = "client!ea", name = "run", descriptor = "()V", line = 100)
    public final void run() {
        field6956++;
        while (true) {
            class227 var1 = this.field6949;
            class150 var3;
            synchronized (this.field6949) {
                class401 var2;
                for (var2 = this.field6949.method1442(-10011); var2 == null; var2 = this.field6949.method1442(-10011)) {
                    try {
                        this.field6949.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class150)) {
                    return;
                }
                var3 = (class150) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field2205).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field2204 = var5;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/lang/String;I)Luh;", line = 139)
    public final class150 method2901(String arg0, int arg1) {
        if (arg1 != 15328) {
            this.method2901(null, 57);
        }
        field6951++;
        if (this.field6957 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class150 var3 = new class150(arg0);
            this.method2897(var3, -104);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V", line = 169)
    public class507() {
        this.field6957.setDaemon(true);
        this.field6957.start();
    }
}
