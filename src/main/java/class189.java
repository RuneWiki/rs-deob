import jagex3.jagmisc.jagmisc;
import java.awt.Rectangle;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class189 implements Runnable {

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "Lsm;")
    private class249 field2714 = new class249();

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "Ljava/lang/Thread;")
    private Thread field2706 = new Thread(this);

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "Ltm;")
    public static class112 field2710 = new class112("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!qq", name = "j", descriptor = "[I")
    public static int[] field2715 = new int[50];

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "[I")
    public static int[] field2713 = new int[2048];

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!qq", name = "k", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILag;)V")
    private final void method1221(int arg0, class180 arg1) {
        field2707++;
        if (arg0 != 21191) {
            this.method1225(-79);
        }
        class249 var3 = this.field2714;
        synchronized (this.field2714) {
            this.field2714.method1553((byte) -107, arg1);
            this.field2714.notify();
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIII)V")
    public static final void method1222(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -10584) {
            field2713 = null;
        }
        for (int var5 = 0; var5 < class417.field5736; var5++) {
            Rectangle var6 = class180.field2611[var5];
            if (arg1 < var6.x + var6.width && var6.x < arg1 + arg4 && arg3 < (var6.y + var6.height) && var6.y < arg0 + arg3) {
                class127.field1809[var5] = true;
            }
        }
        field2709++;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V")
    public static void method1223(int arg0) {
        field2710 = null;
        if (arg0 != -7185) {
            method1223(115);
        }
        field2715 = null;
        field2713 = null;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Ljava/lang/String;I)Lid;")
    public final class400 method1224(String arg0, int arg1) {
        field2712++;
        if (this.field2706 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            if (arg1 != 3) {
                this.field2714 = null;
            }
            class400 var3 = new class400(arg0);
            this.method1221(arg1 ^ 0x52C4, var3);
            return var3;
        }
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "()V")
    public class189() {
        this.field2706.setDaemon(true);
        this.field2706.start();
    }

    @OriginalMember(owner = "client!qq", name = "run", descriptor = "()V")
    public final void run() {
        field2711++;
        while (true) {
            class249 var1 = this.field2714;
            class400 var3;
            synchronized (this.field2714) {
                class180 var2;
                for (var2 = this.field2714.method1548(8779); var2 == null; var2 = this.field2714.method1548(8779)) {
                    try {
                        this.field2714.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class400)) {
                    return;
                }
                var3 = (class400) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field5589).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field5590 = var5;
        }
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)V")
    public final void method1225(int arg0) {
        field2708++;
        if (this.field2706 == null) {
            return;
        }
        this.method1221(21191, new class180());
        try {
            this.field2706.join();
            int var2 = -32 % ((arg0 - 15) / 42);
        } catch (InterruptedException var3) {
        }
        this.field2706 = null;
    }
}
