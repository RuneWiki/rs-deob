import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class541 implements Runnable {

    @OriginalMember(owner = "client!id", name = "c", descriptor = "[Ljp;")
    public volatile class322[] field7562 = new class322[2];

    @OriginalMember(owner = "client!id", name = "e", descriptor = "Z")
    public volatile boolean field7564 = false;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Z")
    public volatile boolean field7561 = false;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field7560;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Lft;")
    public class4 field7563;

    @OriginalMember(owner = "client!id", name = "run", descriptor = "()V", line = 5)
    public final void run() {
        this.field7561 = true;
        field7560++;
        try {
            while (!this.field7564) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class322 var2 = this.field7562[var1];
                    if (var2 != null) {
                        var2.method2020((byte) 109);
                    }
                }
                class561.method3202(10L, (byte) -124);
                class182.method1231(this.field7563, (byte) -86, null);
            }
        } catch (Exception var9) {
            class699.method3896(104, var9, null);
        } finally {
            Object var6 = null;
            this.field7561 = false;
        }
    }
}
