import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class492 extends class577 {

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "Z")
    public boolean field6974 = false;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public int field6971 = -1;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "[I")
    public static int[] field6975 = new int[2];

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public int field6969;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public int field6970;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public int field6972;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public int field6973;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    public int field6976;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field6977;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public static int field6978;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)V")
    public static void method2929(byte arg0) {
        field6975 = null;
        if (arg0 != -117) {
            field6977 = 8;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIII)I")
    public static final int method2930(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 22666) {
            field6977 = -19;
        }
        field6978++;
        int var5 = 65536 - class376.field5188[arg4 * 8192 / arg3] >> 1;
        return ((65536 - var5) * arg2 >> 16) + (arg1 * var5 >> 16);
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(I)V")
    public class492(int arg0) {
        this.field6971 = arg0;
    }
}
