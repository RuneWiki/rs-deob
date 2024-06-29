import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class342 {

    @OriginalMember(owner = "client!im", name = "a", descriptor = "Lnm;")
    public class277 field4848 = null;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "[Lrj;")
    public class354[] field4851 = null;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "[Lrj;")
    public class354[] field4853 = null;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "Lnm;")
    public class277 field4852 = null;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "Z")
    public boolean field4850;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field4849;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field4854;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "()V")
    private static final void method2193() {
        if (field4849 == null) {
            class304 var0 = new class304();
            byte[] var1 = var0.method2005(128, 128, 16);
            field4849 = ByteBuffer.allocateDirect(var1.length);
            field4849.position(0);
            field4849.put(var1);
            field4849.flip();
        }
        if (field4854 != null) {
            return;
        }
        class52 var2 = new class52();
        byte[] var3 = var2.method302(128, 128, 16);
        field4854 = ByteBuffer.allocateDirect(var3.length);
        field4854.position(0);
        field4854.put(var3);
        field4854.flip();
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lao;)V")
    public class342(class157 arg0) {
        this.field4850 = arg0.field1963;
        method2193();
        if (this.field4850) {
            byte[] var5 = new byte[524288];
            field4849.get(var5);
            field4849.position(0);
            this.field4852 = new class277(arg0, 6410, 128, 128, 16, var5, 6410);
            field4854.get(var5);
            field4854.position(0);
            this.field4848 = new class277(arg0, 6410, 128, 128, 16, var5, 6410);
        } else {
            byte[] var2 = new byte[32768];
            this.field4851 = new class354[16];
            for (int var3 = 0; var3 < 16; var3++) {
                field4849.get(var2, 0, 32768);
                this.field4851[var3] = new class354(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field4849.position(0);
            this.field4853 = new class354[16];
            for (int var4 = 0; var4 < 16; var4++) {
                field4854.get(var2, 0, 32768);
                this.field4853[var4] = new class354(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field4854.position(0);
        }
    }
}
