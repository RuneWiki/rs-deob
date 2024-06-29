import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class258 {

    @OriginalMember(owner = "client!s", name = "e", descriptor = "Lme;")
    public class459 field3686 = null;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Lme;")
    public class459 field3683 = null;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "[Luo;")
    public class429[] field3687 = null;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "[Luo;")
    public class429[] field3688 = null;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "Z")
    public boolean field3684;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3682;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3685;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "()V", line = 10)
    private static final void method1741() {
        if (field3682 == null) {
            class115 var0 = new class115();
            byte[] var1 = var0.method906(128, 128, 16);
            field3682 = ByteBuffer.allocateDirect(var1.length);
            field3682.position(0);
            field3682.put(var1);
            field3682.flip();
        }
        if (field3685 != null) {
            return;
        }
        class470 var2 = new class470();
        byte[] var3 = var2.method2795(128, 128, 16);
        field3685 = ByteBuffer.allocateDirect(var3.length);
        field3685.position(0);
        field3685.put(var3);
        field3685.flip();
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Lfu;)V", line = 53)
    public class258(class42 arg0) {
        this.field3684 = arg0.field620;
        method1741();
        if (this.field3684) {
            byte[] var5 = new byte[524288];
            field3682.get(var5);
            field3682.position(0);
            this.field3683 = new class459(arg0, 6410, 128, 128, 16, var5, 6410);
            field3685.get(var5);
            field3685.position(0);
            this.field3686 = new class459(arg0, 6410, 128, 128, 16, var5, 6410);
        } else {
            byte[] var2 = new byte[32768];
            this.field3688 = new class429[16];
            for (int var3 = 0; var3 < 16; var3++) {
                field3682.get(var2, 0, 32768);
                this.field3688[var3] = new class429(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field3682.position(0);
            this.field3687 = new class429[16];
            for (int var4 = 0; var4 < 16; var4++) {
                field3685.get(var2, 0, 32768);
                this.field3687[var4] = new class429(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field3685.position(0);
        }
    }
}
