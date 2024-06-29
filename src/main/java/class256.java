import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class256 {

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "Lhg;")
    public class291 field3562 = null;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "[Lhn;")
    public class257[] field3565 = null;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "[Lhn;")
    public class257[] field3566 = null;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "Lhg;")
    public class291 field3563 = null;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "Z")
    public boolean field3564;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3567;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3568;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "()V", line = 4)
    private static final void method1656() {
        if (field3568 == null) {
            class329 var0 = new class329();
            byte[] var1 = var0.method2002(128, 128, 16);
            field3568 = ByteBuffer.allocateDirect(var1.length);
            field3568.position(0);
            field3568.put(var1);
            field3568.flip();
        }
        if (field3567 != null) {
            return;
        }
        class212 var2 = new class212();
        byte[] var3 = var2.method1421(128, 128, 16);
        field3567 = ByteBuffer.allocateDirect(var3.length);
        field3567.position(0);
        field3567.put(var3);
        field3567.flip();
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lmm;)V", line = 52)
    public class256(class357 arg0) {
        this.field3564 = arg0.field4895;
        method1656();
        if (this.field3564) {
            byte[] var5 = new byte[524288];
            field3568.get(var5);
            field3568.position(0);
            this.field3562 = new class291(arg0, 6410, 128, 128, 16, var5, 6410);
            field3567.get(var5);
            field3567.position(0);
            this.field3563 = new class291(arg0, 6410, 128, 128, 16, var5, 6410);
        } else {
            byte[] var2 = new byte[32768];
            this.field3565 = new class257[16];
            for (int var3 = 0; var3 < 16; var3++) {
                field3568.get(var2, 0, 32768);
                this.field3565[var3] = new class257(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field3568.position(0);
            this.field3566 = new class257[16];
            for (int var4 = 0; var4 < 16; var4++) {
                field3567.get(var2, 0, 32768);
                this.field3566[var4] = new class257(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field3567.position(0);
        }
    }
}
