import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class57 implements Runnable {

    @OriginalMember(owner = "client!f", name = "i", descriptor = "Lar;")
    private class47 field781 = new class47();

    @OriginalMember(owner = "client!f", name = "d", descriptor = "Ljava/lang/Thread;")
    private Thread field776 = new Thread(this);

    @OriginalMember(owner = "client!f", name = "c", descriptor = "[Z")
    public static boolean[] field775 = new boolean[100];

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILfb;)V")
    private final void method393(int arg0, class45 arg1) {
        class47 var3 = this.field781;
        synchronized (this.field781) {
            this.field781.method330(arg1, -2130841184);
            this.field781.notify();
        }
        field778++;
        int var4 = 67 / ((64 - arg0) / 33);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public static void method394(int arg0) {
        int var1 = 68 / ((-arg0 - 69) / 53);
        field775 = null;
    }

    @OriginalMember(owner = "client!f", name = "run", descriptor = "()V")
    public final void run() {
        field780++;
        while (true) {
            class47 var1 = this.field781;
            class120 var3;
            synchronized (this.field781) {
                class45 var2;
                for (var2 = this.field781.method340(false); var2 == null; var2 = this.field781.method340(false)) {
                    try {
                        this.field781.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class120)) {
                    return;
                }
                var3 = (class120) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field1677).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field1675 = var5;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
    public final void method395(byte arg0) {
        field777++;
        if (this.field776 == null) {
            return;
        }
        this.method393(114, new class45());
        try {
            if (arg0 >= -24) {
                return;
            }
            this.field776.join();
        } catch (InterruptedException var2) {
        }
        this.field776 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/lang/String;I)Loq;")
    public final class120 method396(String arg0, int arg1) {
        field773++;
        if (this.field776 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class120 var3 = new class120(arg0);
            this.method393(102, var3);
            int var4 = 12 / ((arg1 + 28) / 40);
            return var3;
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(B)V")
    public static final void method397(byte arg0) {
        if (arg0 != -119) {
            return;
        }
        field779++;
        if (class36.field507.toLowerCase().indexOf("microsoft") != -1) {
            class331.field4816[192] = 58;
            class331.field4816[189] = 26;
            class331.field4816[190] = 72;
            class331.field4816[188] = 71;
            class331.field4816[186] = 57;
            class331.field4816[222] = 59;
            class331.field4816[191] = 73;
            class331.field4816[219] = 42;
            class331.field4816[221] = 43;
            class331.field4816[223] = 28;
            class331.field4816[220] = 74;
            class331.field4816[187] = 27;
            return;
        }
        class331.field4816[59] = 57;
        class331.field4816[46] = 72;
        if (class36.field522 == null) {
            class331.field4816[192] = 58;
            class331.field4816[222] = 59;
        } else {
            class331.field4816[520] = 59;
            class331.field4816[222] = 58;
            class331.field4816[192] = 28;
        }
        class331.field4816[92] = 74;
        class331.field4816[61] = 27;
        class331.field4816[47] = 73;
        class331.field4816[45] = 26;
        class331.field4816[44] = 71;
        class331.field4816[93] = 43;
        class331.field4816[91] = 42;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
    public class57() {
        this.field776.setDaemon(true);
        this.field776.start();
    }
}
