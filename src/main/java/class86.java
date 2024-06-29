import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class86 {

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "Z")
    public static boolean field1357 = false;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field1361 = 2301979;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILrg;IILag;II)V")
    public static final void method609(int arg0, class248 arg1, int arg2, int arg3, class197 arg4, int arg5, int arg6) {
        field1360++;
        if (arg4 == null) {
            return;
        }
        int var7 = (int) class114.field1742 + class278.field4540 & 0x7FF;
        int var8 = Math.max(arg1.field4016 / 2, arg1.field4057 / 2) + 10;
        if (arg2 != -18486) {
            field1361 = 64;
        }
        int var9 = arg5 * arg5 + arg6 * arg6;
        if ((var8 * var8) < var9) {
            return;
        }
        int var10 = class136.field2193[var7];
        int var11 = var10 * 256 / (class150.field2394 + 256);
        int var12 = class136.field2191[var7];
        int var13 = var12 * 256 / (class150.field2394 + 256);
        int var14 = arg5 * var13 + (arg6 * var11) >> 16;
        int var15 = arg5 * var11 - (arg6 * var13) >> 16;
        ((class2) arg4).method10(arg1.field4016 / 2 + arg3 + var14 - (arg4.field3177 / 2), arg1.field4057 / 2 + arg0 - (arg4.field3178 / 2 + var15), arg1.field3993, arg1.field3934);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(CB)C")
    public static final char method610(char arg0, byte arg1) {
        field1359++;
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else {
            int var2 = -62 / ((-arg1 - 42) / 37);
            if (arg0 == 'Œ') {
                return 'E';
            } else {
                return (char) (arg0 == 'œ' ? 'e' : '\u0000');
            }
        }
    }
}
