import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class155 {

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "Lmf;")
    public class14 field2096 = null;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "Lmf;")
    public class14 field2100 = null;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "[Lir;")
    public class216[] field2099 = null;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "[Lir;")
    public class216[] field2098 = null;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "Z")
    public boolean field2097;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2101;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2102;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "()V")
    private static final void method965() {
        if (field2102 == null) {
            class20 var0 = new class20();
            byte[] var1 = var0.method143(128, 128, 16);
            field2102 = ByteBuffer.allocateDirect(var1.length);
            field2102.position(0);
            field2102.put(var1);
            field2102.flip();
        }
        if (field2101 != null) {
            return;
        }
        class81 var2 = new class81();
        byte[] var3 = var2.method577(128, 128, 16);
        field2101 = ByteBuffer.allocateDirect(var3.length);
        field2101.position(0);
        field2101.put(var3);
        field2101.flip();
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lnf;)V")
    public class155(class256 arg0) {
        this.field2097 = arg0.field3762;
        method965();
        if (this.field2097) {
            byte[] var5 = new byte[524288];
            field2102.get(var5);
            field2102.position(0);
            this.field2100 = new class14(arg0, 6410, 128, 128, 16, var5, 6410);
            field2101.get(var5);
            field2101.position(0);
            this.field2096 = new class14(arg0, 6410, 128, 128, 16, var5, 6410);
        } else {
            byte[] var2 = new byte[32768];
            this.field2098 = new class216[16];
            for (int var3 = 0; var3 < 16; var3++) {
                field2102.get(var2, 0, 32768);
                this.field2098[var3] = new class216(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field2102.position(0);
            this.field2099 = new class216[16];
            for (int var4 = 0; var4 < 16; var4++) {
                field2101.get(var2, 0, 32768);
                this.field2099[var4] = new class216(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field2101.position(0);
        }
    }
}
