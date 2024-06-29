import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class326 {

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "[Lhi;")
    public class41[] field4879 = null;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "Lqc;")
    public class241 field4877 = null;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "[Lhi;")
    public class41[] field4878 = null;

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "Lqc;")
    public class241 field4883 = null;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "Z")
    public boolean field4880;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field4881;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field4882;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "()V", line = 5)
    private static final void method2006() {
        if (field4882 == null) {
            class167 var0 = new class167();
            byte[] var1 = var0.method1169(128, 128, 16);
            field4882 = ByteBuffer.allocateDirect(var1.length);
            field4882.position(0);
            field4882.put(var1);
            field4882.flip();
        }
        if (field4881 != null) {
            return;
        }
        class214 var2 = new class214();
        byte[] var3 = var2.method1432(128, 128, 16);
        field4881 = ByteBuffer.allocateDirect(var3.length);
        field4881.position(0);
        field4881.put(var3);
        field4881.flip();
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lnm;)V", line = 53)
    public class326(class254 arg0) {
        this.field4880 = arg0.field3682;
        method2006();
        if (this.field4880) {
            byte[] var5 = new byte[524288];
            field4882.get(var5);
            field4882.position(0);
            this.field4883 = new class241(arg0, 6410, 128, 128, 16, var5, 6410);
            field4881.get(var5);
            field4881.position(0);
            this.field4877 = new class241(arg0, 6410, 128, 128, 16, var5, 6410);
        } else {
            byte[] var2 = new byte[32768];
            this.field4879 = new class41[16];
            for (int var3 = 0; var3 < 16; var3++) {
                field4882.get(var2, 0, 32768);
                this.field4879[var3] = new class41(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field4882.position(0);
            this.field4878 = new class41[16];
            for (int var4 = 0; var4 < 16; var4++) {
                field4881.get(var2, 0, 32768);
                this.field4878[var4] = new class41(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field4881.position(0);
        }
    }
}
