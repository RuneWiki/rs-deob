import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class354 {

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "[Ljo;")
    public class218[] field5005 = null;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "Lgg;")
    public class311 field5008 = null;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "[Ljo;")
    public class218[] field5007 = null;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "Lgg;")
    public class311 field5009 = null;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "Z")
    public boolean field5006;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field5004;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field5010;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "()V")
    private static final void method2166() {
        if (field5010 == null) {
            class399 var0 = new class399();
            byte[] var1 = var0.method2492(128, 128, 16);
            field5010 = ByteBuffer.allocateDirect(var1.length);
            field5010.position(0);
            field5010.put(var1);
            field5010.flip();
        }
        if (field5004 != null) {
            return;
        }
        class147 var2 = new class147();
        byte[] var3 = var2.method792(128, 128, 16);
        field5004 = ByteBuffer.allocateDirect(var3.length);
        field5004.position(0);
        field5004.put(var3);
        field5004.flip();
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lql;)V")
    public class354(class346 arg0) {
        this.field5006 = arg0.field4729;
        method2166();
        if (this.field5006) {
            byte[] var5 = new byte[524288];
            field5010.get(var5);
            field5010.position(0);
            this.field5008 = new class311(arg0, 6410, 128, 128, 16, var5, 6410);
            field5004.get(var5);
            field5004.position(0);
            this.field5009 = new class311(arg0, 6410, 128, 128, 16, var5, 6410);
        } else {
            byte[] var2 = new byte[32768];
            this.field5005 = new class218[16];
            for (int var3 = 0; var3 < 16; var3++) {
                field5010.get(var2, 0, 32768);
                this.field5005[var3] = new class218(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field5010.position(0);
            this.field5007 = new class218[16];
            for (int var4 = 0; var4 < 16; var4++) {
                field5004.get(var2, 0, 32768);
                this.field5007[var4] = new class218(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field5004.position(0);
        }
    }
}
