import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class404 {

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "[Lrq;")
    public class195[] field5877 = null;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "Lsd;")
    public class51 field5878 = null;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "Lsd;")
    public class51 field5880 = null;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "[Lrq;")
    public class195[] field5879 = null;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "Z")
    public boolean field5883;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field5881;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field5882;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "()V", line = 12)
    private static final void method2601() {
        if (field5881 == null) {
            class87 var0 = new class87();
            byte[] var1 = var0.method603(128, 128, 16);
            field5881 = ByteBuffer.allocateDirect(var1.length);
            field5881.position(0);
            field5881.put(var1);
            field5881.flip();
        }
        if (field5882 != null) {
            return;
        }
        class110 var2 = new class110();
        byte[] var3 = var2.method736(128, 128, 16);
        field5882 = ByteBuffer.allocateDirect(var3.length);
        field5882.position(0);
        field5882.put(var3);
        field5882.flip();
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lhj;)V", line = 53)
    public class404(class338 arg0) {
        this.field5883 = arg0.field4694;
        method2601();
        if (this.field5883) {
            byte[] var5 = new byte[524288];
            field5881.get(var5);
            field5881.position(0);
            this.field5880 = new class51(arg0, 6410, 128, 128, 16, var5, 6410);
            field5882.get(var5);
            field5882.position(0);
            this.field5878 = new class51(arg0, 6410, 128, 128, 16, var5, 6410);
        } else {
            byte[] var2 = new byte[32768];
            this.field5879 = new class195[16];
            for (int var3 = 0; var3 < 16; var3++) {
                field5881.get(var2, 0, 32768);
                this.field5879[var3] = new class195(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field5881.position(0);
            this.field5877 = new class195[16];
            for (int var4 = 0; var4 < 16; var4++) {
                field5882.get(var2, 0, 32768);
                this.field5877[var4] = new class195(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field5882.position(0);
        }
    }
}
