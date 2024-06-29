import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class394 {

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "F")
    public static float field5492 = 0.0F;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "Z")
    public static boolean field5494 = false;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "[Z")
    public static boolean[] field5495 = new boolean[8];

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Laa;ILhu;IIIILvfa;)V", line = 4)
    public static final void method2326(class490 arg0, int arg1, class133 arg2, int arg3, int arg4, int arg5, int arg6, class672 arg7) {
        field5490++;
        if (arg2 == null) {
            return;
        }
        int var8;
        if (class278.field3898 == 4) {
            var8 = (int) class547.field7230 & 0x3FFF;
        } else {
            var8 = (int) class547.field7230 + class649.field8626 & 0x3FFF;
        }
        int var9 = Math.max(arg7.field9287 / 2, arg7.field9178 / 2) + 10;
        int var10 = arg3 * arg3 + arg4 * arg4;
        if (var10 > var9 * var9) {
            return;
        }
        int var11 = class451.field6174[var8];
        int var12 = 36 / ((40 - arg5) / 32);
        int var13 = class451.field6177[var8];
        if (class278.field3898 != 4) {
            var11 = var11 * 256 / (class260.field3629 + 256);
            var13 = var13 * 256 / (class260.field3629 + 256);
        }
        int var14 = arg3 * var11 + (arg4 * var13) >> 14;
        int var15 = arg3 * var13 - (arg4 * var11) >> 14;
        arg2.method1031(arg1 + var14 + arg7.field9287 / 2 - (arg2.method1036() / 2), arg7.field9178 / 2 + -var15 + arg6 + -(arg2.method1048() / 2), arg0, arg1, arg6);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V", line = 48)
    public static void method2327(byte arg0) {
        if (arg0 <= 40) {
            method2326(null, 110, null, 27, 75, 117, -99, null);
        }
        field5495 = null;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZB)V", line = 78)
    public static final void method2328(boolean arg0, byte arg1) {
        field5489++;
        int var2 = class91.field1097;
        int var3 = class512.field6793;
        if (arg0 && class540.field7159) {
            var2 <<= 0x1;
            var3 = -var2;
        }
        int var4 = -76 % ((arg1 - 27) / 54);
        class341.field4807.method491(var3, var2);
    }
}
