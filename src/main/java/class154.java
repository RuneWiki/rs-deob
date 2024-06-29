import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class154 {

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "[Llb;")
    public class208[] field2349 = null;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "Lor;")
    public class295 field2350 = null;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "Lor;")
    public class295 field2355 = null;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "[Llb;")
    public class208[] field2354 = null;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "Z")
    public boolean field2351;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2352;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2353;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "()V", line = 6)
    private static final void method1185() {
        if (field2353 == null) {
            class426 var0 = new class426();
            byte[] var1 = var0.method2669(128, 128, 16);
            field2353 = ByteBuffer.allocateDirect(var1.length);
            field2353.position(0);
            field2353.put(var1);
            field2353.flip();
        }
        if (field2352 != null) {
            return;
        }
        class215 var2 = new class215();
        byte[] var3 = var2.method1633(128, 128, 16);
        field2352 = ByteBuffer.allocateDirect(var3.length);
        field2352.position(0);
        field2352.put(var3);
        field2352.flip();
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lge;)V", line = 53)
    public class154(class104 arg0) {
        this.field2351 = arg0.field1715;
        method1185();
        if (this.field2351) {
            byte[] var5 = new byte[524288];
            field2353.get(var5);
            field2353.position(0);
            this.field2355 = new class295(arg0, 6410, 128, 128, 16, var5, 6410);
            field2352.get(var5);
            field2352.position(0);
            this.field2350 = new class295(arg0, 6410, 128, 128, 16, var5, 6410);
        } else {
            byte[] var2 = new byte[32768];
            this.field2349 = new class208[16];
            for (int var3 = 0; var3 < 16; var3++) {
                field2353.get(var2, 0, 32768);
                this.field2349[var3] = new class208(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field2353.position(0);
            this.field2354 = new class208[16];
            for (int var4 = 0; var4 < 16; var4++) {
                field2352.get(var2, 0, 32768);
                this.field2354[var4] = new class208(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field2352.position(0);
        }
    }
}
