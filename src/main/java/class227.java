import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class227 extends class45 {

    @OriginalMember(owner = "client!jea", name = "r", descriptor = "Z")
    public boolean field2952;

    @OriginalMember(owner = "client!jea", name = "p", descriptor = "I")
    public int field2950;

    @OriginalMember(owner = "client!jea", name = "m", descriptor = "I")
    public int field2947;

    @OriginalMember(owner = "client!jea", name = "o", descriptor = "I")
    public int field2949;

    @OriginalMember(owner = "client!jea", name = "q", descriptor = "I")
    public int field2951;

    @OriginalMember(owner = "client!jea", name = "j", descriptor = "I")
    public int field2944;

    @OriginalMember(owner = "client!jea", name = "k", descriptor = "I")
    public static int field2945 = 0;

    @OriginalMember(owner = "client!jea", name = "n", descriptor = "[I")
    public static int[] field2948 = new int[5];

    @OriginalMember(owner = "client!jea", name = "l", descriptor = "Z")
    public static boolean field2946 = false;

    @OriginalMember(owner = "client!jea", name = "i", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(II)S", line = 12)
    public static final short method1412(int arg0, int arg1) {
        field2943++;
        int var2 = arg1 >> 10 & 0x3F;
        int var3 = -8 % ((54 - arg0) / 54);
        int var4 = (arg1 & 0x381) >> 3;
        int var5 = arg1 & 0x7F;
        int var6 = var5 > 64 ? (127 - var5) * var4 >> 7 : var4 * var5 >> 7;
        int var7 = var5 + var6;
        int var8;
        if (var7 == 0) {
            var8 = var6 << 1;
        } else {
            var8 = (var6 << 8) / var7;
        }
        return (short) (var7 | var2 << 10 | var8 >> 4 << 7);
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(I)V", line = 39)
    public static void method1413(int arg0) {
        field2948 = null;
        if (arg0 != 1197289511) {
            field2945 = -47;
        }
    }

    @OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(IIIIIZ)V", line = 62)
    public class227(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field2952 = arg5;
        this.field2950 = arg2;
        this.field2947 = arg0;
        this.field2949 = arg4;
        this.field2951 = arg3;
        this.field2944 = arg1;
    }
}
