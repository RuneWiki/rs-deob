import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class435 {

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "[Lbj;")
    public class313[] field5949 = null;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "[Lbj;")
    public class313[] field5946 = null;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "Lwc;")
    public class324 field5950 = null;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "Lwc;")
    public class324 field5951 = null;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "Z")
    public boolean field5947;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field5945;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field5948;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "()V", line = 6)
    private static final void method2658() {
        if (field5948 == null) {
            class239 var0 = new class239();
            byte[] var1 = var0.method1530(128, 128, 16);
            field5948 = ByteBuffer.allocateDirect(var1.length);
            field5948.position(0);
            field5948.put(var1);
            field5948.flip();
        }
        if (field5945 != null) {
            return;
        }
        class120 var2 = new class120();
        byte[] var3 = var2.method799(128, 128, 16);
        field5945 = ByteBuffer.allocateDirect(var3.length);
        field5945.position(0);
        field5945.put(var3);
        field5945.flip();
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lh;)V", line = 53)
    public class435(class327 arg0) {
        this.field5947 = arg0.field4414;
        method2658();
        if (this.field5947) {
            byte[] var5 = new byte[524288];
            field5948.get(var5);
            field5948.position(0);
            this.field5950 = new class324(arg0, 6410, 128, 128, 16, var5, 6410);
            field5945.get(var5);
            field5945.position(0);
            this.field5951 = new class324(arg0, 6410, 128, 128, 16, var5, 6410);
        } else {
            byte[] var2 = new byte[32768];
            this.field5946 = new class313[16];
            for (int var3 = 0; var3 < 16; var3++) {
                field5948.get(var2, 0, 32768);
                this.field5946[var3] = new class313(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field5948.position(0);
            this.field5949 = new class313[16];
            for (int var4 = 0; var4 < 16; var4++) {
                field5945.get(var2, 0, 32768);
                this.field5949[var4] = new class313(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field5945.position(0);
        }
    }
}
