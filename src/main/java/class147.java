import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class147 extends class666 {

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "[Lwe;")
    public static class359[] field2053 = new class359[100];

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "[I")
    public static int[] field2055 = new int[2];

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "Luv;")
    public static class755 field2054 = null;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    public int field2051;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "Lkv;")
    public class684 field2056;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "[B")
    public byte[] field2052;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "(I)V", line = 4)
    public static void method949(int arg0) {
        field2054 = null;
        if (arg0 == 0) {
            field2055 = null;
            field2053 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)I", line = 28)
    public final int method212(int arg0) {
        if (arg0 != 100) {
            return -74;
        } else {
            ++field2057;
            return super.field9191 ? 0 : 100;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)[B", line = 45)
    public final byte[] method214(byte arg0) {
        ++field2058;
        if (super.field9191) {
            throw new RuntimeException();
        } else {
            if (arg0 > -86) {
                method949(-110);
            }
            return this.field2052;
        }
    }
}
