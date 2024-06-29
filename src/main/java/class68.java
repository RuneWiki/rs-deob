import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class68 {

    @OriginalMember(owner = "client!le", name = "d", descriptor = "[Lqb;")
    public class89[] field901 = null;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "Lbq;")
    public class54 field900 = null;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "[Lqb;")
    public class89[] field903 = null;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "Lbq;")
    public class54 field902 = null;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "Z")
    public boolean field904;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field898;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field899;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "()V", line = 4)
    private static final void method506() {
        if (field899 == null) {
            class426 var0 = new class426();
            byte[] var1 = var0.method2616(128, 128, 16);
            field899 = ByteBuffer.allocateDirect(var1.length);
            field899.position(0);
            field899.put(var1);
            field899.flip();
        }
        if (field898 != null) {
            return;
        }
        class168 var2 = new class168();
        byte[] var3 = var2.method1103(128, 128, 16);
        field898 = ByteBuffer.allocateDirect(var3.length);
        field898.position(0);
        field898.put(var3);
        field898.flip();
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lks;)V", line = 52)
    public class68(class173 arg0) {
        this.field904 = arg0.field2376;
        method506();
        if (this.field904) {
            byte[] var5 = new byte[524288];
            field899.get(var5);
            field899.position(0);
            this.field900 = new class54(arg0, 6410, 128, 128, 16, var5, 6410);
            field898.get(var5);
            field898.position(0);
            this.field902 = new class54(arg0, 6410, 128, 128, 16, var5, 6410);
        } else {
            byte[] var2 = new byte[32768];
            this.field901 = new class89[16];
            for (int var3 = 0; var3 < 16; var3++) {
                field899.get(var2, 0, 32768);
                this.field901[var3] = new class89(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field899.position(0);
            this.field903 = new class89[16];
            for (int var4 = 0; var4 < 16; var4++) {
                field898.get(var2, 0, 32768);
                this.field903[var4] = new class89(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field898.position(0);
        }
    }
}
