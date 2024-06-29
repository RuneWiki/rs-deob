import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class227 extends class498 {

    @OriginalMember(owner = "client!vu", name = "p", descriptor = "[I")
    public static int[] field3262 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!vu", name = "n", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!vu", name = "o", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!vu", name = "q", descriptor = "I")
    public int field3263;

    @OriginalMember(owner = "client!vu", name = "s", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!vu", name = "u", descriptor = "I")
    public int field3267;

    @OriginalMember(owner = "client!vu", name = "w", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!vu", name = "t", descriptor = "[I")
    public int[] field3266;

    @OriginalMember(owner = "client!vu", name = "v", descriptor = "[I")
    public int[] field3268;

    @OriginalMember(owner = "client!vu", name = "z", descriptor = "[I")
    public static int[] field3272;

    @OriginalMember(owner = "client!vu", name = "A", descriptor = "[I")
    public int[] field3273;

    @OriginalMember(owner = "client!vu", name = "r", descriptor = "[Lum;")
    public class370[] field3264;

    @OriginalMember(owner = "client!vu", name = "y", descriptor = "[Lum;")
    public class370[] field3271;

    @OriginalMember(owner = "client!vu", name = "x", descriptor = "[[[B")
    public byte[][][] field3270;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)Z")
    public static final boolean method1394(int arg0) {
        field3269++;
        if (arg0 <= 83) {
            field3260 = -8;
        }
        return class535.field7837;
    }

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "(I)V")
    public static void method1395(int arg0) {
        field3262 = null;
        field3272 = null;
        if (arg0 != 1) {
            field3262 = null;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
    public static final String method1396(int arg0, int arg1, boolean arg2) {
        field3265++;
        if (arg0 == 0) {
            return arg2 && arg1 >= 0 ? class285.method1765(true, arg2, 10, arg1) : Integer.toString(arg1);
        } else {
            return null;
        }
    }
}
