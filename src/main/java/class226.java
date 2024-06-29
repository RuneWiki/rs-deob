import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class226 implements Runnable {

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "Lam;")
    private class455 field3250 = new class455();

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field3253 = new Thread(this);

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "[I")
    public static int[] field3254;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "[Lwm;")
    public static class403[] field3255;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "F")
    public static float field3257;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILev;)V")
    private final void method1388(int arg0, class498 arg1) {
        field3259++;
        class455 var3 = this.field3250;
        synchronized (this.field3250) {
            this.field3250.method2657(8492, arg1);
            this.field3250.notify();
        }
        if (arg0 != 8128) {
            method1392(-104, 33);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B[[BLnd;)V")
    public static final void method1389(byte arg0, byte[][] arg1, class388 arg2) {
        if (arg0 >= -103) {
            field3257 = -0.29522252F;
        }
        field3252++;
        int var3 = class502.field7100.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg1[var4];
            if (var5 != null) {
                int var6 = (class332.field4827[var4] >> 8) * 64 - class441.field6171;
                int var7 = (class332.field4827[var4] & 0xFF) * 64 - class367.field5241;
                class322.method1949(14);
                arg2.method2246(-119, var7, var5, class143.field1877, class385.field5414, var6);
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
    public static void method1390(byte arg0) {
        if (arg0 > -70) {
            field3255 = null;
        }
        field3254 = null;
        field3255 = null;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)V")
    public final void method1391(byte arg0) {
        field3251++;
        if (this.field3253 == null) {
            return;
        }
        this.method1388(8128, new class498());
        try {
            if (arg0 <= 20) {
                return;
            }
            this.field3253.join();
        } catch (InterruptedException var2) {
        }
        this.field3253 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V")
    public static final void method1392(int arg0, int arg1) {
        class421.field5935 = arg0;
        class409.field5787 = -1;
        field3249++;
        if (arg1 > 70) {
            class409.field5787 = -1;
            class516.method3066(101);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/String;I)Lha;")
    public final class43 method1393(String arg0, int arg1) {
        field3248++;
        if (this.field3253 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class43 var3 = new class43(arg0);
            this.method1388(8128, var3);
            return arg1 == -22257 ? var3 : null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
    public class226() {
        this.field3253.setDaemon(true);
        this.field3253.start();
    }

    @OriginalMember(owner = "client!rd", name = "run", descriptor = "()V")
    public final void run() {
        field3258++;
        while (true) {
            class455 var1 = this.field3250;
            class43 var3;
            synchronized (this.field3250) {
                class498 var2;
                for (var2 = this.field3250.method2654(-1); var2 == null; var2 = this.field3250.method2654(-1)) {
                    try {
                        this.field3250.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class43)) {
                    return;
                }
                var3 = (class43) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field492).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field495 = var5;
        }
    }

    static {
        new class530("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
        new class530("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
        field3254 = new int[4096];
        for (int var0 = 0; var0 < 4096; var0++) {
            field3254[var0] = class81.method606((byte) 99, var0);
        }
        field3255 = new class403[2048];
        field3256 = 0;
    }
}
