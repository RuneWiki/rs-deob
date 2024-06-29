import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class230 {

    @OriginalMember(owner = "client!an", name = "b", descriptor = "Liu;")
    public static class517 field3404 = new class517(10, -1);

    @OriginalMember(owner = "client!an", name = "d", descriptor = "Liu;")
    public static class517 field3406 = new class517(23, 17);

    @OriginalMember(owner = "client!an", name = "a", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIIII)V", line = 3)
    public static final void method1511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != -1) {
            method1511(19, 82, -96, 42, -42, 85);
        }
        for (int var6 = arg4; var6 <= arg2; var6++) {
            class614.method3490(arg0, arg3, -100, class495.field6944[var6], arg1);
        }
        field3407++;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V", line = 30)
    public static void method1512(byte arg0) {
        field3406 = null;
        field3404 = null;
        int var1 = -44 / ((arg0 - 59) / 56);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(BLjava/lang/String;)[B", line = 47)
    public static final byte[] method1513(byte arg0, String arg1) {
        if (arg0 >= -92) {
            return null;
        }
        field3405++;
        int var2 = arg1.length();
        if (var2 == 0) {
            return new byte[0];
        }
        int var3 = var2 + 3 & 0xFFFFFFFC;
        int var4 = var3 / 4 * 3;
        if (var2 <= var3 - 2 || class501.method2846(arg1.charAt(var3 - 2), (byte) 104) == -1) {
            var4 -= 2;
        } else if (var3 - 1 >= var2 || class501.method2846(arg1.charAt(var3 - 1), (byte) 104) == -1) {
            var4--;
        }
        byte[] var5 = new byte[var4];
        class356.method2166(122, var5, 0, arg1);
        return var5;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIIIIB)I", line = 77)
    public static final int method1514(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        int var7 = arg0 & 0x3;
        if ((arg3 & 0x1) == 1) {
            int var8 = arg4;
            arg4 = arg5;
            arg5 = var8;
        }
        field3403++;
        if (var7 == 0) {
            return arg1;
        } else if (var7 == 1) {
            return arg2;
        } else {
            if (arg6 < 36) {
                method1513((byte) -40, null);
            }
            return var7 == 2 ? 1 + 7 - arg4 - arg1 : -arg5 + 1 + -arg2 + 7;
        }
    }
}
