import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class180 {

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "Lnc;")
    public class75 field2415 = null;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "[Loa;")
    public class121[] field2417 = null;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "[Loa;")
    public class121[] field2416 = null;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "Lnc;")
    public class75 field2414 = null;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "Z")
    public boolean field2413;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2412;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2418;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "()V")
    private static final void method1183() {
        if (field2418 == null) {
            class250 var0 = new class250();
            byte[] var1 = var0.method1638(128, 128, 16);
            field2418 = ByteBuffer.allocateDirect(var1.length);
            field2418.position(0);
            field2418.put(var1);
            field2418.flip();
        }
        if (field2412 != null) {
            return;
        }
        class376 var2 = new class376();
        byte[] var3 = var2.method2460(128, 128, 16);
        field2412 = ByteBuffer.allocateDirect(var3.length);
        field2412.position(0);
        field2412.put(var3);
        field2412.flip();
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lse;)V")
    public class180(class282 arg0) {
        this.field2413 = arg0.field4241;
        method1183();
        if (this.field2413) {
            byte[] var5 = new byte[524288];
            field2418.get(var5);
            field2418.position(0);
            this.field2414 = new class75(arg0, 6410, 128, 128, 16, var5, 6410);
            field2412.get(var5);
            field2412.position(0);
            this.field2415 = new class75(arg0, 6410, 128, 128, 16, var5, 6410);
        } else {
            byte[] var2 = new byte[32768];
            this.field2416 = new class121[16];
            for (int var3 = 0; var3 < 16; var3++) {
                field2418.get(var2, 0, 32768);
                this.field2416[var3] = new class121(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field2418.position(0);
            this.field2417 = new class121[16];
            for (int var4 = 0; var4 < 16; var4++) {
                field2412.get(var2, 0, 32768);
                this.field2417[var4] = new class121(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field2412.position(0);
        }
    }
}
