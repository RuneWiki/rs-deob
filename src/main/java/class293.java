import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class293 implements Runnable {

    @OriginalMember(owner = "client!dba", name = "d", descriptor = "[Len;")
    public volatile class107[] field4500 = new class107[2];

    @OriginalMember(owner = "client!dba", name = "f", descriptor = "Z")
    public volatile boolean field4502 = false;

    @OriginalMember(owner = "client!dba", name = "e", descriptor = "Z")
    public volatile boolean field4501 = false;

    @OriginalMember(owner = "client!dba", name = "g", descriptor = "[I")
    public static int[] field4503 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "D")
    public static double field4498;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!dba", name = "h", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!dba", name = "i", descriptor = "Lfc;")
    public class731 field4505;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)V", line = 10)
    public static void method1905(int arg0) {
        int var1 = 46 % ((arg0 - 45) / 52);
        field4503 = null;
    }

    @OriginalMember(owner = "client!dba", name = "run", descriptor = "()V", line = 27)
    public final void run() {
        this.field4501 = true;
        field4504++;
        try {
            while (!this.field4502) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class107 var2 = this.field4500[var1];
                    if (var2 != null) {
                        var2.method877((byte) 122);
                    }
                }
                class484.method2932(true, 10L);
                class347.method2214(this.field4505, 0, null);
            }
        } catch (Exception var9) {
            class333.method2135(var9, null, -121);
        } finally {
            Object var6 = null;
            this.field4501 = false;
        }
    }
}
