import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public abstract class class87 {

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "Z")
    public static boolean field1082 = true;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "[[I")
    public static int[][] field1083 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "F")
    public static float field1088 = 1.0F;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)V")
    public static final void method695(int arg0, int arg1, int arg2) {
        if (arg1 != 2) {
            method697(-119, 62, 54, true, 116, -119, -120, null, -117, -98, -60, null, 62);
        }
        field1084++;
        class524 var3 = class371.field4797[arg2][arg0];
        if (var3 != null) {
            class402.field5732 = var3.field7747;
            class461.field6586 = var3.field7738;
            class351.field4508 = var3.field7735;
        }
        class309.method1800(arg1 ^ 0x304E5522);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
    public static void method696(byte arg0) {
        field1083 = null;
        if (arg0 < 42) {
            method697(-10, -87, 35, false, 21, 52, -57, null, 27, -10, 69, null, -34);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIZIII[[[BIIILya;I)V")
    public static final void method697(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int arg8, int arg9, int arg10, class38 arg11, int arg12) {
        field1087++;
        if (arg0 == 0 || arg2 == 0 || arg3) {
            return;
        }
        if (arg0 == 9) {
            arg0 = 1;
            arg6 = arg6 + 1 & 0x3;
        }
        if (arg0 == 10) {
            arg0 = 1;
            arg6 = arg6 + 3 & 0x3;
        }
        if (arg0 == 11) {
            arg6 = arg6 + 3 & 0x3;
            arg0 = 8;
        }
        arg11.method349(arg4, arg5, arg10, arg1, arg12, arg8, arg7[arg0 - 1][arg6], arg2, arg9);
    }
}
