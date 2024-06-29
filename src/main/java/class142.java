import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class142 {

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "Lhj;")
    public class106 field2147 = null;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "[Loe;")
    public class231[] field2145 = null;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "[Loe;")
    public class231[] field2150 = null;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "Lhj;")
    public class106 field2149 = null;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Z")
    public boolean field2144;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2146;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2148;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "()V")
    private static final void method1107() {
        if (field2148 == null) {
            class140 var0 = new class140();
            byte[] var1 = var0.method1102(128, 128, 16);
            field2148 = ByteBuffer.allocateDirect(var1.length);
            field2148.position(0);
            field2148.put(var1);
            field2148.flip();
        }
        if (field2146 != null) {
            return;
        }
        class238 var2 = new class238();
        byte[] var3 = var2.method1586(128, 128, 16);
        field2146 = ByteBuffer.allocateDirect(var3.length);
        field2146.position(0);
        field2146.put(var3);
        field2146.flip();
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lhd;)V")
    public class142(class17 arg0) {
        this.field2144 = arg0.field283;
        method1107();
        if (this.field2144) {
            byte[] var5 = new byte[524288];
            field2148.get(var5);
            field2148.position(0);
            this.field2147 = new class106(arg0, 6410, 128, 128, 16, var5, 6410);
            field2146.get(var5);
            field2146.position(0);
            this.field2149 = new class106(arg0, 6410, 128, 128, 16, var5, 6410);
        } else {
            byte[] var2 = new byte[32768];
            this.field2150 = new class231[16];
            for (int var3 = 0; var3 < 16; var3++) {
                field2148.get(var2, 0, 32768);
                this.field2150[var3] = new class231(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field2148.position(0);
            this.field2145 = new class231[16];
            for (int var4 = 0; var4 < 16; var4++) {
                field2146.get(var2, 0, 32768);
                this.field2145[var4] = new class231(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field2146.position(0);
        }
    }
}
