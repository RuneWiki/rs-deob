import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class359 {

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "Lvk;")
    public class227 field4960 = null;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "[Lal;")
    public class58[] field4962 = null;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "[Lal;")
    public class58[] field4963 = null;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "Lvk;")
    public class227 field4964 = null;

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "Z")
    public boolean field4965;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field4959;

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field4961;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "()V")
    private static final void method2199() {
        if (field4959 == null) {
            class423 var0 = new class423();
            byte[] var1 = var0.method2503(128, 128, 16);
            field4959 = ByteBuffer.allocateDirect(var1.length);
            field4959.position(0);
            field4959.put(var1);
            field4959.flip();
        }
        if (field4961 != null) {
            return;
        }
        class376 var2 = new class376();
        byte[] var3 = var2.method2314(128, 128, 16);
        field4961 = ByteBuffer.allocateDirect(var3.length);
        field4961.position(0);
        field4961.put(var3);
        field4961.flip();
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lbf;)V")
    public class359(class344 arg0) {
        this.field4965 = arg0.field4739;
        method2199();
        if (this.field4965) {
            byte[] var5 = new byte[524288];
            field4959.get(var5);
            field4959.position(0);
            this.field4964 = new class227(arg0, 6410, 128, 128, 16, var5, 6410);
            field4961.get(var5);
            field4961.position(0);
            this.field4960 = new class227(arg0, 6410, 128, 128, 16, var5, 6410);
        } else {
            byte[] var2 = new byte[32768];
            this.field4962 = new class58[16];
            for (int var3 = 0; var3 < 16; var3++) {
                field4959.get(var2, 0, 32768);
                this.field4962[var3] = new class58(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field4959.position(0);
            this.field4963 = new class58[16];
            for (int var4 = 0; var4 < 16; var4++) {
                field4961.get(var2, 0, 32768);
                this.field4963[var4] = new class58(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field4961.position(0);
        }
    }
}
