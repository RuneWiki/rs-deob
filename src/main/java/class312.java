import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class312 {

    @OriginalMember(owner = "client!de", name = "a", descriptor = "[Lfc;")
    public class141[] field4455 = null;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "Ljg;")
    public class187 field4457 = null;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Ljg;")
    public class187 field4458 = null;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "[Lfc;")
    public class141[] field4460 = null;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "Z")
    public boolean field4459;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field4456;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field4461;

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lpo;)V", line = 53)
    public class312(class332 arg0) {
        this.field4459 = arg0.field4783;
        method1957();
        if (this.field4459) {
            byte[] var5 = new byte[524288];
            field4456.get(var5);
            field4456.position(0);
            this.field4458 = new class187(arg0, 6410, 128, 128, 16, var5, 6410);
            field4461.get(var5);
            field4461.position(0);
            this.field4457 = new class187(arg0, 6410, 128, 128, 16, var5, 6410);
        } else {
            byte[] var2 = new byte[32768];
            this.field4455 = new class141[16];
            for (int var3 = 0; var3 < 16; var3++) {
                field4456.get(var2, 0, 32768);
                this.field4455[var3] = new class141(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field4456.position(0);
            this.field4460 = new class141[16];
            for (int var4 = 0; var4 < 16; var4++) {
                field4461.get(var2, 0, 32768);
                this.field4460[var4] = new class141(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field4461.position(0);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "()V", line = 18)
    private static final void method1957() {
        if (field4456 == null) {
            class13 var0 = new class13();
            byte[] var1 = var0.method98(128, 128, 16);
            field4456 = ByteBuffer.allocateDirect(var1.length);
            field4456.position(0);
            field4456.put(var1);
            field4456.flip();
        }
        if (field4461 != null) {
            return;
        }
        class229 var2 = new class229();
        byte[] var3 = var2.method1472(128, 128, 16);
        field4461 = ByteBuffer.allocateDirect(var3.length);
        field4461.position(0);
        field4461.put(var3);
        field4461.flip();
    }
}
