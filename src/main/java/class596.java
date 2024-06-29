import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class596 {

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "Lin;")
    public static class380 field8516 = new class380(27, 8);

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "I")
    public int field8513;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
    public static int field8514;

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
    public int field8515;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "I")
    public int field8517;

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "I")
    public int field8518;

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "I")
    public static int field8519;

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "I")
    public int field8520;

    @OriginalMember(owner = "client!ip", name = "i", descriptor = "I")
    public int field8521;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)Ljd;", line = 5)
    public static final class624 method3479(int arg0, int arg1) {
        field8514++;
        class624[] var2 = class135.method1122(2);
        for (int var3 = arg1; var3 < var2.length; var3++) {
            class624 var4 = var2[var3];
            if (var4.field8864 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V", line = 30)
    public static void method3480(byte arg0) {
        int var1 = 57 / ((-arg0 - 8) / 48);
        field8516 = null;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Llea;III[IIZI)Luk;", line = 41)
    public static final class296 method3481(class573 arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, boolean arg6, int arg7) {
        if (arg5 != 15765) {
            field8516 = null;
        }
        field8519++;
        if (!arg0.field8186 && (!class362.method2181(arg2, arg5 - 15766) || !class362.method2181(arg3, arg5 ^ 0xFFFFC26A))) {
            return arg0.field8220 ? new class296(arg0, 34037, arg2, arg3, arg6, arg4, arg1, arg7) : new class296(arg0, arg2, arg3, class661.method3706(arg2, true), class661.method3706(arg3, true), arg4);
        } else {
            return new class296(arg0, 3553, arg2, arg3, arg6, arg4, arg1, arg7);
        }
    }
}
