import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class439 extends class401 {

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
    public int field6094;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public int field6093;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "[I")
    public static int[] field6089 = new int[3];

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "[I")
    public static int[] field6091 = new int[2048];

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "Llh;")
    public static class487 field6092 = new class487(68, -1);

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public static int field6088;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "Z")
    public static boolean field6090;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([SZI)[S", line = 11)
    public static final short[] method2505(short[] arg0, boolean arg1, int arg2) {
        field6088++;
        short[] var3 = new short[arg2];
        if (!arg1) {
            method2505(null, true, -79);
        }
        class359.method2050(arg0, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V", line = 25)
    public static void method2506(byte arg0) {
        field6092 = null;
        field6091 = null;
        if (arg0 != -87) {
            method2506((byte) 97);
        }
        field6089 = null;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(II)V", line = 38)
    public class439(int arg0, int arg1) {
        this.field6094 = arg0;
        this.field6093 = arg1;
    }
}
