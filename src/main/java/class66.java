import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class66 {

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "[Lhf;")
    public class225[] field892 = null;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "[Lhf;")
    public class225[] field894 = null;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "Ltr;")
    public class161 field893 = null;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "Ltr;")
    public class161 field898 = null;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "Z")
    public boolean field895;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field896;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field897;

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lig;)V", line = 53)
    public class66(class132 arg0) {
        this.field895 = arg0.field1967;
        method417();
        if (this.field895) {
            byte[] var5 = new byte[524288];
            field896.get(var5);
            field896.position(0);
            this.field893 = new class161(arg0, 6410, 128, 128, 16, var5, 6410);
            field897.get(var5);
            field897.position(0);
            this.field898 = new class161(arg0, 6410, 128, 128, 16, var5, 6410);
        } else {
            byte[] var2 = new byte[32768];
            this.field892 = new class225[16];
            for (int var3 = 0; var3 < 16; var3++) {
                field896.get(var2, 0, 32768);
                this.field892[var3] = new class225(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field896.position(0);
            this.field894 = new class225[16];
            for (int var4 = 0; var4 < 16; var4++) {
                field897.get(var2, 0, 32768);
                this.field894[var4] = new class225(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field897.position(0);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "()V", line = 23)
    private static final void method417() {
        if (field896 == null) {
            class159 var0 = new class159();
            byte[] var1 = var0.method1155(128, 128, 16);
            field896 = ByteBuffer.allocateDirect(var1.length);
            field896.position(0);
            field896.put(var1);
            field896.flip();
        }
        if (field897 != null) {
            return;
        }
        class164 var2 = new class164();
        byte[] var3 = var2.method1165(128, 128, 16);
        field897 = ByteBuffer.allocateDirect(var3.length);
        field897.position(0);
        field897.put(var3);
        field897.flip();
    }
}
