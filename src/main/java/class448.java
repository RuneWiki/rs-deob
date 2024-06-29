import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class448 {

    @OriginalMember(owner = "client!c", name = "f", descriptor = "Lni;")
    public class457 field6597 = null;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "[Lpq;")
    public class46[] field6592 = null;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "Lni;")
    public class457 field6595 = null;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "[Lpq;")
    public class46[] field6594 = null;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "Z")
    public boolean field6596;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field6593;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field6598;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()V")
    private static final void method2763() {
        if (field6593 == null) {
            class64 var0 = new class64();
            byte[] var1 = var0.method341(128, 128, 16);
            field6593 = ByteBuffer.allocateDirect(var1.length);
            field6593.position(0);
            field6593.put(var1);
            field6593.flip();
        }
        if (field6598 != null) {
            return;
        }
        class40 var2 = new class40();
        byte[] var3 = var2.method227(128, 128, 16);
        field6598 = ByteBuffer.allocateDirect(var3.length);
        field6598.position(0);
        field6598.put(var3);
        field6598.flip();
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Lcg;)V")
    public class448(class393 arg0) {
        this.field6596 = arg0.field5805;
        method2763();
        if (this.field6596) {
            byte[] var5 = new byte[524288];
            field6593.get(var5);
            field6593.position(0);
            this.field6597 = new class457(arg0, 6410, 128, 128, 16, var5, 6410);
            field6598.get(var5);
            field6598.position(0);
            this.field6595 = new class457(arg0, 6410, 128, 128, 16, var5, 6410);
        } else {
            byte[] var2 = new byte[32768];
            this.field6594 = new class46[16];
            for (int var3 = 0; var3 < 16; var3++) {
                field6593.get(var2, 0, 32768);
                this.field6594[var3] = new class46(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field6593.position(0);
            this.field6592 = new class46[16];
            for (int var4 = 0; var4 < 16; var4++) {
                field6598.get(var2, 0, 32768);
                this.field6592[var4] = new class46(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field6598.position(0);
        }
    }
}
