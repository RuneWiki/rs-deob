import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class430 {

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "[Lim;")
    public class342[] field6080 = null;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "Lhe;")
    public class209 field6079 = null;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "Lhe;")
    public class209 field6081 = null;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "[Lim;")
    public class342[] field6085 = null;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "Z")
    public boolean field6082;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field6083;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field6084;

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Ltb;)V", line = 53)
    public class430(class227 arg0) {
        this.field6082 = arg0.field3252;
        method2715();
        if (this.field6082) {
            byte[] var5 = new byte[524288];
            field6083.get(var5);
            field6083.position(0);
            this.field6079 = new class209(arg0, 6410, 128, 128, 16, var5, 6410);
            field6084.get(var5);
            field6084.position(0);
            this.field6081 = new class209(arg0, 6410, 128, 128, 16, var5, 6410);
        } else {
            byte[] var2 = new byte[32768];
            this.field6080 = new class342[16];
            for (int var3 = 0; var3 < 16; var3++) {
                field6083.get(var2, 0, 32768);
                this.field6080[var3] = new class342(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field6083.position(0);
            this.field6085 = new class342[16];
            for (int var4 = 0; var4 < 16; var4++) {
                field6084.get(var2, 0, 32768);
                this.field6085[var4] = new class342(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field6084.position(0);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "()V", line = 13)
    private static final void method2715() {
        if (field6083 == null) {
            class185 var0 = new class185();
            byte[] var1 = var0.method1207(128, 128, 16);
            field6083 = ByteBuffer.allocateDirect(var1.length);
            field6083.position(0);
            field6083.put(var1);
            field6083.flip();
        }
        if (field6084 != null) {
            return;
        }
        class379 var2 = new class379();
        byte[] var3 = var2.method2422(128, 128, 16);
        field6084 = ByteBuffer.allocateDirect(var3.length);
        field6084.position(0);
        field6084.put(var3);
        field6084.flip();
    }
}
