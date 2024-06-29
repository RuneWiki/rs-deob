import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pha")
public class class176 extends class300 {

    @OriginalMember(owner = "client!pha", name = "H", descriptor = "Llja;")
    public static class744 field2184 = new class744(29, 5);

    @OriginalMember(owner = "client!pha", name = "J", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2186 = new CRC32();

    @OriginalMember(owner = "client!pha", name = "K", descriptor = "I")
    public static int field2187 = 0;

    @OriginalMember(owner = "client!pha", name = "F", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!pha", name = "G", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!pha", name = "I", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!pha", name = "E", descriptor = "[B")
    private byte[] field2181;

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(IIB)V")
    public final void method1201(int arg0, int arg1, byte arg2) {
        if (arg0 != -256) {
            field2184 = null;
        }
        field2183++;
        int var4 = arg1 * 2;
        int var5 = arg2 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field2181[var10001] = -1;
        this.field2181[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(IIII)[B")
    public final byte[] method1202(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 65) {
            this.method1202(79, 73, -87, -30);
        }
        this.field2181 = new byte[arg0 * 2 * arg3 * arg1];
        field2185++;
        this.method3433((byte) 18, arg0, arg1, arg3);
        return this.field2181;
    }

    @OriginalMember(owner = "client!pha", name = "<init>", descriptor = "()V")
    public class176() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!pha", name = "c", descriptor = "(I)V")
    public static void method1203(int arg0) {
        field2186 = null;
        field2184 = null;
        if (arg0 != 5) {
            method1203(-107);
        }
    }
}
