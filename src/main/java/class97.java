import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class97 {

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "Lft;")
    public class6 field1192 = null;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "[Ltr;")
    public class151[] field1194 = null;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "[Ltr;")
    public class151[] field1196 = null;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "Lft;")
    public class6 field1197 = null;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "Z")
    public boolean field1195;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1191;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1193;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()V")
    private static final void method475() {
        if (field1191 == null) {
            class149 var0 = new class149();
            byte[] var1 = var0.method719(128, 128, 16);
            field1191 = ByteBuffer.allocateDirect(var1.length);
            field1191.position(0);
            field1191.put(var1);
            field1191.flip();
        }
        if (field1193 != null) {
            return;
        }
        class33 var2 = new class33();
        byte[] var3 = var2.method171(128, 128, 16);
        field1193 = ByteBuffer.allocateDirect(var3.length);
        field1193.position(0);
        field1193.put(var3);
        field1193.flip();
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lic;)V")
    public class97(class246 arg0) {
        this.field1195 = arg0.field3457;
        method475();
        if (this.field1195) {
            byte[] var5 = new byte[524288];
            field1191.get(var5);
            field1191.position(0);
            this.field1197 = new class6(arg0, 6410, 128, 128, 16, var5, 6410);
            field1193.get(var5);
            field1193.position(0);
            this.field1192 = new class6(arg0, 6410, 128, 128, 16, var5, 6410);
        } else {
            byte[] var2 = new byte[32768];
            this.field1196 = new class151[16];
            for (int var3 = 0; var3 < 16; var3++) {
                field1191.get(var2, 0, 32768);
                this.field1196[var3] = new class151(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field1191.position(0);
            this.field1194 = new class151[16];
            for (int var4 = 0; var4 < 16; var4++) {
                field1193.get(var2, 0, 32768);
                this.field1194[var4] = new class151(arg0, 3553, 6410, 128, 128, true, var2, 6410, false);
            }
            field1193.position(0);
        }
    }
}
