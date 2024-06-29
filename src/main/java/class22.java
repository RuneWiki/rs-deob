import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public abstract class class22 extends class577 {

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "Lbu;")
    public static class21 field360 = new class21(94, 9);

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "F")
    public static float field362 = 1.0F;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "Lfba;")
    public static class27 field363 = new class27(1, 2);

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    public static int field365 = 0;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "Z")
    public static boolean field367 = false;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "[I")
    public static int[] field366 = new int[13];

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public int field358;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    public int field361;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "Lwia;")
    public static class791 field364;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "[I")
    public int[] field356;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIIIIII)V", line = 4)
    public static final void method224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 >= class618.field8645 && arg7 <= class463.field6533 && arg0 >= class618.field8645 && class463.field6533 >= arg0 && arg6 >= class618.field8645 && arg6 <= class463.field6533 && arg1 >= class618.field8645 && class463.field6533 >= arg1 && class734.field10153 <= arg4 && arg4 <= class407.field5535 && class734.field10153 <= arg5 && class407.field5535 >= arg5 && arg3 >= class734.field10153 && arg3 <= class407.field5535 && class734.field10153 <= arg9 && arg9 <= class407.field5535) {
            class197.method1362((byte) -75, arg2, arg6, arg3, arg4, arg1, arg0, arg5, arg7, arg9);
        } else {
            class7.method49(arg4, arg5, arg1, false, arg3, arg7, arg2, arg9, arg6, arg0);
        }
        field359++;
        if (arg8 != -1949423318) {
            field360 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V", line = 21)
    public static final void method225(byte arg0) {
        field355++;
        class313 var1 = class312.method1998(0L, 15, -1);
        var1.method2006(-43);
        if (arg0 > -36) {
            method225((byte) -38);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)S", line = 34)
    public static final short method226(int arg0, int arg1) {
        field357++;
        int var2 = (arg1 & 0xFC5F) >> 10;
        int var3 = (arg1 & 0x387) >> 3;
        int var4 = arg1 & 0x7F;
        int var5 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (~var6 == arg0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var6 | var7 >> 4 << 7 | var2 << 10);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V", line = 67)
    public static void method228(int arg0) {
        field363 = null;
        field366 = null;
        if (arg0 <= 5) {
            method226(-111, 95);
        }
        field364 = null;
        field360 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIBILjava/awt/Graphics;II)V")
    public abstract void method223(int arg0, int arg1, int arg2, byte arg3, int arg4, Graphics arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILjava/awt/Canvas;I)V")
    public abstract void method227(int arg0, int arg1, Canvas arg2, int arg3);
}
