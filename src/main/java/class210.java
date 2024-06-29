import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class210 {

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "Lfb;")
    public class401 field3367 = null;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "Lfb;")
    public class401 field3369 = null;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "[Lai;")
    public class355[] field3371 = null;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "[Lai;")
    public class355[] field3370 = null;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "Z")
    public boolean field3372;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3368;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3373;

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lsq;)V", line = 53)
    public class210(class96 arg0) {
        this.field3372 = arg0.field1189;
        method1482();
        if (this.field3372) {
            byte[] var5 = new byte[524288];
            field3373.get(var5);
            field3373.position(0);
            this.field3369 = new class401(arg0, 6410, 128, 128, 16, var5, 6410);
            field3368.get(var5);
            field3368.position(0);
            this.field3367 = new class401(arg0, 6410, 128, 128, 16, var5, 6410);
        } else {
            byte[] var2 = new byte[32768];
            this.field3371 = new class355[16];
            for (int var3 = 0; var3 < 16; var3++) {
                field3373.get(var2, 0, 32768);
                this.field3371[var3] = new class355(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field3373.position(0);
            this.field3370 = new class355[16];
            for (int var4 = 0; var4 < 16; var4++) {
                field3368.get(var2, 0, 32768);
                this.field3370[var4] = new class355(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field3368.position(0);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "()V", line = 27)
    private static final void method1482() {
        if (field3373 == null) {
            class16 var0 = new class16();
            byte[] var1 = var0.method132(128, 128, 16);
            field3373 = ByteBuffer.allocateDirect(var1.length);
            field3373.position(0);
            field3373.put(var1);
            field3373.flip();
        }
        if (field3368 != null) {
            return;
        }
        class22 var2 = new class22();
        byte[] var3 = var2.method158(128, 128, 16);
        field3368 = ByteBuffer.allocateDirect(var3.length);
        field3368.position(0);
        field3368.put(var3);
        field3368.flip();
    }
}
