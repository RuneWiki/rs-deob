import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class147 implements Runnable {

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "[Ltl;")
    public volatile class64[] field2113 = new class64[2];

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "Z")
    public volatile boolean field2120 = false;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "Z")
    public volatile boolean field2116 = false;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "Lwi;")
    public static class234 field2112 = null;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field2117 = 0;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "Lnm;")
    public static class201 field2119;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "Lnf;")
    public class61 field2118;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "[Lqf;")
    public static class359[] field2111;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IJ)V", line = 7)
    public static final void method1043(int arg0, long arg1) {
        field2121++;
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var5) {
        }
        int var4 = -29 % ((arg0 + 29) / 43);
    }

    @OriginalMember(owner = "client!ff", name = "run", descriptor = "()V", line = 30)
    public final void run() {
        this.field2116 = true;
        try {
            while (!this.field2120) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class64 var2 = this.field2113[var1];
                    if (var2 != null) {
                        var2.method523((byte) 83);
                    }
                }
                class184.method1283(10L, 10);
                class252.method1848(this.field2118, -73, (Object) null);
            }
        } catch (Exception var7) {
            class343.method2402((String) null, var7, -2);
        } finally {
            this.field2116 = false;
        }
        field2115++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V", line = 68)
    public static void method1044(byte arg0) {
        field2112 = null;
        field2119 = null;
        field2111 = null;
        if (arg0 != -85) {
            method1044((byte) 44);
        }
    }
}
