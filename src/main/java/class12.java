import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class12 {

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "Loa;")
    public class150 field138 = null;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "Loa;")
    public class150 field139 = null;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "[Leq;")
    public class140[] field140 = null;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "[Leq;")
    public class140[] field143 = null;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "Z")
    public boolean field144;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field141;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field142;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "()V")
    private static final void method84() {
        if (field141 == null) {
            class218 var0 = new class218();
            byte[] var1 = var0.method1357(128, 128, 16);
            field141 = ByteBuffer.allocateDirect(var1.length);
            field141.position(0);
            field141.put(var1);
            field141.flip();
        }
        if (field142 != null) {
            return;
        }
        class241 var2 = new class241();
        byte[] var3 = var2.method1492(128, 128, 16);
        field142 = ByteBuffer.allocateDirect(var3.length);
        field142.position(0);
        field142.put(var3);
        field142.flip();
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lih;)V")
    public class12(class330 arg0) {
        this.field144 = arg0.field4770;
        method84();
        if (this.field144) {
            byte[] var5 = new byte[524288];
            field141.get(var5);
            field141.position(0);
            this.field139 = new class150(arg0, 6410, 128, 128, 16, var5, 6410);
            field142.get(var5);
            field142.position(0);
            this.field138 = new class150(arg0, 6410, 128, 128, 16, var5, 6410);
        } else {
            byte[] var2 = new byte[32768];
            this.field140 = new class140[16];
            for (int var3 = 0; var3 < 16; var3++) {
                field141.get(var2, 0, 32768);
                this.field140[var3] = new class140(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field141.position(0);
            this.field143 = new class140[16];
            for (int var4 = 0; var4 < 16; var4++) {
                field142.get(var2, 0, 32768);
                this.field143[var4] = new class140(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field142.position(0);
        }
    }
}
