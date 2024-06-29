import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class49 extends class12 {

    @OriginalMember(owner = "client!ei", name = "O", descriptor = "Z")
    public static boolean field903 = false;

    @OriginalMember(owner = "client!ei", name = "N", descriptor = "Ltg;")
    private static class184 field902 = class135.method812("Loaded config", 3);

    @OriginalMember(owner = "client!ei", name = "P", descriptor = "Ltg;")
    private static class184 field904 = class135.method812("Please reload this page)3", 3);

    @OriginalMember(owner = "client!ei", name = "W", descriptor = "Ltg;")
    public static class184 field911 = field904;

    @OriginalMember(owner = "client!ei", name = "V", descriptor = "[I")
    public static int[] field910 = new int[1000];

    @OriginalMember(owner = "client!ei", name = "R", descriptor = "Ltg;")
    public static class184 field906 = field902;

    @OriginalMember(owner = "client!ei", name = "Y", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field913 = new CRC32();

    @OriginalMember(owner = "client!ei", name = "Q", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!ei", name = "S", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!ei", name = "T", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!ei", name = "U", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!ei", name = "X", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BII)I")
    private final int method276(byte arg0, int arg1, int arg2) {
        ++field907;
        if (arg0 != -128) {
            this.method276((byte) 116, 100, 51);
        }
        int var4 = arg2 * 57 + arg1;
        int var5 = var4 ^ var4 << 1;
        return -(((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB)[I")
    public final int[] method62(int arg0, byte arg1) {
        if (arg1 != 17) {
            return null;
        } else {
            ++field909;
            int[] var3 = super.field224.method7((byte) 113, arg0);
            if (super.field224.field53) {
                int var4 = class37.field698[arg0];
                for (int var5 = 0; class201.field3889 > var5; ++var5) {
                    var3[var5] = this.method276((byte) -128, class131.field2381[var5], var4) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
    public class49() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "(I)V")
    public static void method277(int arg0) {
        field902 = null;
        field904 = null;
        field910 = null;
        field913 = null;
        field906 = null;
        if (arg0 < -56) {
            field911 = null;
        }
    }
}
