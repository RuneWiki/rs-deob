import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class81 extends class401 {

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public int field1213 = -1;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    public int field1222 = 0;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "[I")
    public static int[] field1215 = new int[5];

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public int field1214;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public int field1216;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    public int field1217;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public int field1219;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public int field1220;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
    public int field1221;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public int field1224;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
    public int field1225;

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "I")
    public int field1226;

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
    public int field1227;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V", line = 3)
    public static void method630(int arg0) {
        field1215 = null;
        int var1 = -116 % ((arg0 - 15) / 51);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)I", line = 21)
    public static final int method631(int arg0, int arg1) {
        field1223++;
        int var2 = arg0 & 0x3F;
        if (arg1 != 18510) {
            return -57;
        }
        int var3 = (arg0 & 0xF6) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIILls;BII)V", line = 94)
    public static final void method632(int arg0, int arg1, int arg2, class124 arg3, byte arg4, int arg5, int arg6) {
        int var7 = -37 % ((45 - arg4) / 49);
        field1218++;
        class255.method1573(arg3.field4053, arg1, arg0, arg2, arg3.field4047, 0, arg3.field4042, 0, arg6, arg5);
    }
}
