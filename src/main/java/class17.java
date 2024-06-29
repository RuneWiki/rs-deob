import jagex3.jagmisc.jagmisc;
import java.awt.Container;
import java.awt.Insets;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class17 implements Runnable {

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "Lmf;")
    private class291 field272 = new class291();

    @OriginalMember(owner = "client!bu", name = "g", descriptor = "Ljava/lang/Thread;")
    private Thread field277 = new Thread(this);

    @OriginalMember(owner = "client!bu", name = "k", descriptor = "Los;")
    public static class309 field281 = new class309(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!bu", name = "h", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!bu", name = "i", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!bu", name = "l", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "Lwp;")
    public static class121 field275;

    @OriginalMember(owner = "client!bu", name = "j", descriptor = "Lud;")
    public static class27 field280;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Les;B)V", line = 4)
    private final void method110(class261 arg0, byte arg1) {
        int var3 = -101 % ((arg1 - 47) / 50);
        class291 var4 = this.field272;
        synchronized (this.field272) {
            this.field272.method1885(false, arg0);
            this.field272.notify();
        }
        field279++;
    }

    @OriginalMember(owner = "client!bu", name = "run", descriptor = "()V", line = 17)
    public final void run() {
        field271++;
        while (true) {
            class291 var1 = this.field272;
            class103 var3;
            synchronized (this.field272) {
                class261 var2;
                for (var2 = this.field272.method1894((byte) -91); var2 == null; var2 = this.field272.method1894((byte) -93)) {
                    try {
                        this.field272.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class103)) {
                    return;
                }
                var3 = (class103) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field1950).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field1948 = var5;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Z)V", line = 59)
    public static final void method111(boolean arg0) {
        field274++;
        if (class387.field5662 != null) {
            return;
        }
        Container var1;
        if (class97.field1889 == null) {
            var1 = class497.field7305.field7072;
        } else {
            var1 = class97.field1889;
        }
        if (arg0) {
            field281 = null;
        }
        class322.field4917 = var1.getSize().width;
        class456.field6771 = var1.getSize().height;
        if (class97.field1889 == var1) {
            Insets var2 = class97.field1889.getInsets();
            class456.field6771 -= var2.top + var2.bottom;
            class322.field4917 -= var2.right + var2.left;
        }
        if (class13.method86(3) == 1) {
            class65.field1330 = class458.field6802;
            class75.field1536 = 0;
            class376.field5503 = (class322.field4917 - class327.field4958) / 2;
            class71.field1415 = class327.field4958;
        } else if (class370.field5418 < 96 && class133.field2236 == 0) {
            int var3 = class322.field4917 > 1024 ? 1024 : class322.field4917;
            int var4 = class456.field6771 <= 768 ? class456.field6771 : 768;
            class71.field1415 = var3;
            class376.field5503 = (class322.field4917 - var3) / 2;
            class75.field1536 = 0;
            class65.field1330 = var4;
        } else {
            class376.field5503 = 0;
            class75.field1536 = 0;
            class65.field1330 = class456.field6771;
            class71.field1415 = class322.field4917;
        }
        if (class9.field137 != class522.field7582) {
            boolean var10000;
            if (class71.field1415 < 1024 && class65.field1330 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class262.field4007.setSize(class71.field1415, class65.field1330);
        if (class262.field4006 != null) {
            class262.field4006.method318(class262.field4007);
        }
        if (class97.field1889 == var1) {
            Insets var5 = class97.field1889.getInsets();
            class262.field4007.setLocation(class376.field5503 + var5.left, class75.field1536 + var5.top);
        } else {
            class262.field4007.setLocation(class376.field5503, class75.field1536);
        }
        if (class155.field2523 != -1) {
            class505.method3033((byte) 122, true);
        }
        class183.method1253(123);
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)V", line = 157)
    public static void method112(byte arg0) {
        field280 = null;
        field281 = null;
        field275 = null;
        if (arg0 >= -5) {
            method111(false);
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Ljava/lang/String;I)Lmg;", line = 172)
    public final class103 method113(String arg0, int arg1) {
        field278++;
        if (this.field277 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class103 var3 = new class103(arg0);
            if (arg1 != 21146) {
                field281 = null;
            }
            this.method110(var3, (byte) 112);
            return var3;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(II)Z", line = 192)
    public static final boolean method114(int arg0, int arg1) {
        class238.field3678 = true;
        class71.field1418 = arg1 & arg0 + 1;
        field273++;
        return true;
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "()V", line = 206)
    public class17() {
        this.field277.setDaemon(true);
        this.field277.start();
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V", line = 219)
    public final void method115(int arg0) {
        field276++;
        if (arg0 != 2 || this.field277 == null) {
            return;
        }
        this.method110(new class261(), (byte) 103);
        try {
            this.field277.join();
        } catch (InterruptedException var2) {
        }
        this.field277 = null;
    }
}
