import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class62 {

    @OriginalMember(owner = "client!naa", name = "h", descriptor = "[I")
    public static int[] field1084 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "I")
    public int field1077;

    @OriginalMember(owner = "client!naa", name = "e", descriptor = "I")
    public int field1081;

    @OriginalMember(owner = "client!naa", name = "f", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!naa", name = "g", descriptor = "I")
    public int field1083;

    @OriginalMember(owner = "client!naa", name = "d", descriptor = "Lis;")
    public static class427 field1080;

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "Lha;")
    public static class52 field1079;

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "Z")
    public boolean field1078;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(B)V")
    public static void method535(byte arg0) {
        field1084 = null;
        field1080 = null;
        field1079 = null;
        int var1 = 85 / ((-arg0 - 44) / 46);
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(IIII)I")
    public static final int method536(int arg0, int arg1, int arg2, int arg3) {
        field1082++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg0;
        }
        int var5 = 89 % ((arg1 - 90) / 35);
        if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg3;
        }
    }
}
