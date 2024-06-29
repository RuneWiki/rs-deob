import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class149 {

    @OriginalMember(owner = "client!co", name = "a", descriptor = "Lmg;")
    public class247 field2100 = null;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "Lmg;")
    public class247 field2102 = null;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "[Lai;")
    public class201[] field2103 = null;

    @OriginalMember(owner = "client!co", name = "f", descriptor = "[Lai;")
    public class201[] field2105 = null;

    @OriginalMember(owner = "client!co", name = "g", descriptor = "Z")
    public boolean field2106;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2101;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2104;

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lqi;)V", line = 53)
    public class149(class458 arg0) {
        this.field2106 = arg0.field6398;
        method915();
        if (this.field2106) {
            byte[] var5 = new byte[524288];
            field2101.get(var5);
            field2101.position(0);
            this.field2100 = new class247(arg0, 6410, 128, 128, 16, var5, 6410);
            field2104.get(var5);
            field2104.position(0);
            this.field2102 = new class247(arg0, 6410, 128, 128, 16, var5, 6410);
        } else {
            byte[] var2 = new byte[32768];
            this.field2105 = new class201[16];
            for (int var3 = 0; var3 < 16; var3++) {
                field2101.get(var2, 0, 32768);
                this.field2105[var3] = new class201(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field2101.position(0);
            this.field2103 = new class201[16];
            for (int var4 = 0; var4 < 16; var4++) {
                field2104.get(var2, 0, 32768);
                this.field2103[var4] = new class201(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field2104.position(0);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "()V", line = 26)
    private static final void method915() {
        if (field2101 == null) {
            class134 var0 = new class134();
            byte[] var1 = var0.method809(128, 128, 16);
            field2101 = ByteBuffer.allocateDirect(var1.length);
            field2101.position(0);
            field2101.put(var1);
            field2101.flip();
        }
        if (field2104 != null) {
            return;
        }
        class74 var2 = new class74();
        byte[] var3 = var2.method503(128, 128, 16);
        field2104 = ByteBuffer.allocateDirect(var3.length);
        field2104.position(0);
        field2104.put(var3);
        field2104.flip();
    }
}
