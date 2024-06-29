import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class266 {

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "[I")
    public static int[] field3508 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "Z")
    public static boolean field3517 = false;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "Lmc;")
    public static class78 field3510 = new class78(18, -1);

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "Lkb;")
    public class449 field3512;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "Lgn;")
    public class456 field3514;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V", line = 3)
    public static final void method1500(byte arg0) {
        int var1 = 118 % ((arg0 - 85) / 41);
        class367.field5051 = class392.field5448.field4782 + class392.field5448.field4772 + 2;
        class471.field6495 = new String[500];
        class107.field1603 = class448.field6097.field4782 + class448.field6097.field4772 + 2;
        field3515++;
        for (int var2 = 0; var2 < class471.field6495.length; var2++) {
            class471.field6495[var2] = "";
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIII)V", line = 28)
    public static final void method1501(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 > -105) {
            method1500((byte) 84);
        }
        for (int var5 = 0; var5 < class318.field4195; var5++) {
            Rectangle var6 = class341.field4560[var5];
            if (arg2 < (var6.x + var6.width) && var6.x < (arg2 + arg4) && var6.y + var6.height > arg0 && arg0 + arg3 > var6.y) {
                class385.field5327[var5] = true;
            }
        }
        field3516++;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIII)I", line = 57)
    public static final int method1502(int arg0, int arg1, int arg2, int arg3) {
        field3513++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg3;
        } else {
            if (arg1 != -15286) {
                method1502(-4, 13, -118, -114);
            }
            return var4 == 2 ? 7 - arg0 : -arg3 + 7;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V", line = 84)
    public static void method1503(int arg0) {
        if (arg0 == 7) {
            field3510 = null;
            field3508 = null;
        }
    }
}
