import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class333 implements Runnable {

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "Lfea;")
    private class47 field4781 = new class47();

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "Ljava/lang/Thread;")
    private Thread field4789 = new Thread(this);

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "[F")
    public static float[] field4783 = new float[4];

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "Luaa;")
    public static class395 field4787 = new class395(8);

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "[F")
    public static float[] field4790 = new float[4];

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "Lfa;")
    public static class482 field4786;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V")
    public static void method2056(byte arg0) {
        int var1 = 78 % ((arg0 + 69) / 47);
        field4787 = null;
        field4783 = null;
        field4786 = null;
        field4790 = null;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ljava/lang/String;I)Lpj;")
    public final class218 method2057(String arg0, int arg1) {
        field4782++;
        if (this.field4789 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            if (arg1 != 1) {
                field4790 = null;
            }
            class218 var3 = new class218(arg0);
            this.method2058(var3, 1000);
            return var3;
        }
    }

    @OriginalMember(owner = "client!mo", name = "run", descriptor = "()V")
    public final void run() {
        field4785++;
        while (true) {
            class47 var1 = this.field4781;
            class218 var3;
            synchronized (this.field4781) {
                class108 var2;
                for (var2 = this.field4781.method417((byte) 51); var2 == null; var2 = this.field4781.method417((byte) 51)) {
                    try {
                        this.field4781.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class218)) {
                    return;
                }
                var3 = (class218) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field3287).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field3286 = var5;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lum;I)V")
    private final void method2058(class108 arg0, int arg1) {
        field4788++;
        class47 var3 = this.field4781;
        synchronized (this.field4781) {
            this.field4781.method414(arg0, (byte) 45);
            this.field4781.notify();
            if (arg1 != 1000) {
                field4786 = null;
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
    public final void method2059(int arg0) {
        field4784++;
        if (arg0 != 4) {
            this.method2058(null, 119);
        }
        if (this.field4789 == null) {
            return;
        }
        this.method2058(new class108(), 1000);
        try {
            this.field4789.join();
        } catch (InterruptedException var2) {
        }
        this.field4789 = null;
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
    public class333() {
        this.field4789.setDaemon(true);
        this.field4789.start();
    }
}
