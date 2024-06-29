import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public abstract class class735 extends class154 {

    @OriginalMember(owner = "client!pw", name = "m", descriptor = "[[I")
    public static int[][] field10150 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!pw", name = "p", descriptor = "Z")
    public static boolean field10153 = false;

    @OriginalMember(owner = "client!pw", name = "n", descriptor = "Lfja;")
    public static class783 field10151 = new class783(96, 7);

    @OriginalMember(owner = "client!pw", name = "r", descriptor = "Ljava/lang/String;")
    public static String field10155 = null;

    @OriginalMember(owner = "client!pw", name = "i", descriptor = "I")
    public static int field10146;

    @OriginalMember(owner = "client!pw", name = "j", descriptor = "I")
    public static int field10147;

    @OriginalMember(owner = "client!pw", name = "k", descriptor = "I")
    public static int field10148;

    @OriginalMember(owner = "client!pw", name = "l", descriptor = "I")
    public static int field10149;

    @OriginalMember(owner = "client!pw", name = "q", descriptor = "I")
    public static int field10154;

    @OriginalMember(owner = "client!pw", name = "o", descriptor = "Lgj;")
    public static class662 field10152;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(II)I")
    public static final int method4077(int arg0, int arg1) {
        field10148++;
        if (arg1 != 1737677767) {
            method4078((byte) 41);
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(B)V")
    public static void method4078(byte arg0) {
        field10151 = null;
        field10155 = null;
        field10152 = null;
        field10150 = null;
        int var1 = -19 / ((arg0 + 15) / 32);
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "([BIII)[B")
    public static final byte[] method4079(byte[] arg0, int arg1, int arg2, int arg3) {
        field10149++;
        byte[] var4 = new byte[arg2];
        class275.method1771(arg0, arg1, var4, 0, arg2);
        return arg3 == -1 ? var4 : null;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIIIIIIZ)V")
    public static final void method4080(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field10146++;
        class300 var8 = null;
        for (class300 var9 = (class300) class211.field3155.method3589((byte) -127); var9 != null; var9 = (class300) class211.field3155.method3591(0)) {
            if (var9.field4130 == arg2 && var9.field4132 == arg5 && var9.field4125 == arg3 && var9.field4131 == arg4) {
                var8 = var9;
                break;
            }
        }
        if (var8 == null) {
            var8 = new class300();
            var8.field4132 = arg5;
            var8.field4125 = arg3;
            var8.field4130 = arg2;
            var8.field4131 = arg4;
            if (arg5 >= 0 && arg3 >= 0 && arg5 < class483.field6515 && class65.field926 > arg3) {
                class245.method1635(arg7, var8);
            }
            class211.field3155.method3594((byte) -98, var8);
        }
        var8.field4137 = arg6;
        var8.field4123 = arg1;
        var8.field4122 = arg7;
        var8.field4127 = false;
        var8.field4126 = arg0;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIIIB)V")
    public static final void method4081(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var5 = 0;
        int var6 = 85 / ((2 - arg4) / 50);
        while (var5 < class526.field7139) {
            Rectangle var7 = class713.field9815[var5];
            if (var7.x + var7.width > arg0 && arg0 + arg2 > var7.x && var7.y + var7.height > arg1 && var7.y < (arg1 + arg3)) {
                class377.field5145[var5] = true;
            }
            var5++;
        }
        field10147++;
        class686.method3861(arg0, arg0 + arg2, 22738, arg1, arg1 + arg3);
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(ILfca;)V")
    public abstract void method627(int arg0, class93 arg1);

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(Lrh;Z)V")
    public abstract void method624(class280 arg0, boolean arg1);
}
