import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class158 {

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "Lbu;")
    public class17 field2351 = null;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "Lbu;")
    public class17 field2352 = null;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "[Lkh;")
    public class13[] field2355 = null;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "[Lkh;")
    public class13[] field2354 = null;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "Z")
    public boolean field2356;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2350;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2353;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "()V")
    private static final void method989() {
        if (field2353 == null) {
            class309 var0 = new class309();
            byte[] var1 = var0.method1921(128, 128, 16);
            field2353 = ByteBuffer.allocateDirect(var1.length);
            field2353.position(0);
            field2353.put(var1);
            field2353.flip();
        }
        if (field2350 != null) {
            return;
        }
        class25 var2 = new class25();
        byte[] var3 = var2.method174(128, 128, 16);
        field2350 = ByteBuffer.allocateDirect(var3.length);
        field2350.position(0);
        field2350.put(var3);
        field2350.flip();
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lmi;)V")
    public class158(class315 arg0) {
        this.field2356 = arg0.field4476;
        method989();
        if (this.field2356) {
            byte[] var5 = new byte[524288];
            field2353.get(var5);
            field2353.position(0);
            this.field2351 = new class17(arg0, 6410, 128, 128, 16, var5, 6410);
            field2350.get(var5);
            field2350.position(0);
            this.field2352 = new class17(arg0, 6410, 128, 128, 16, var5, 6410);
        } else {
            byte[] var2 = new byte[32768];
            this.field2354 = new class13[16];
            for (int var3 = 0; var3 < 16; var3++) {
                field2353.get(var2, 0, 32768);
                this.field2354[var3] = new class13(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field2353.position(0);
            this.field2355 = new class13[16];
            for (int var4 = 0; var4 < 16; var4++) {
                field2350.get(var2, 0, 32768);
                this.field2355[var4] = new class13(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field2350.position(0);
        }
    }
}
