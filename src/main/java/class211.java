import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class211 extends Canvas {

    @OriginalMember(owner = "client!te", name = "b", descriptor = "Ljava/awt/Component;")
    private Component field3462;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field3461 = 0;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "Lnh;")
    public static class294 field3468 = new class294(0, 0);

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    public static int field3471 = 0;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "Luf;")
    public static class168 field3472 = class148.method1019(-1720, "M");

    @OriginalMember(owner = "client!te", name = "m", descriptor = "Luf;")
    private static class168 field3473 = class148.method1019(-1720, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!te", name = "j", descriptor = "Luf;")
    public static class168 field3470 = field3473;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "Lcd;")
    public static class35 field3474;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(III)Ltg;", line = 8)
    public static final class292 method1470(int arg0, int arg1, int arg2) {
        class127 var3 = class92.field1424[arg0][arg1][arg2];
        return var3 == null || var3.field1969 == null ? null : var3.field1969;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V", line = 16)
    public static void method1471(byte arg0) {
        field3473 = null;
        field3468 = null;
        field3470 = null;
        field3474 = null;
        if (arg0 >= 32) {
            field3472 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZI)V", line = 34)
    public static final void method1472(boolean arg0, int arg1) {
        if (!arg0) {
            method1473(-49);
        }
        class50.field613 = new int[arg1];
        class126.field1938 = new int[arg1];
        class284.field4814 = new int[arg1];
        class114.field1781 = new int[arg1];
        field3464++;
        class200.field3302 = new int[arg1];
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V", line = 49)
    public static final void method1473(int arg0) {
        class127.field1954 = 0;
        class9.field120 = 0;
        class78.method467(true);
        if (arg0 != -1473) {
            method1471((byte) -13);
        }
        class58.method330(true);
        field3466++;
        class71.method404(31513);
        for (int var1 = 0; var1 < class127.field1954; var1++) {
            int var2 = class300.field5084[var1];
            if (class203.field3335 != class190.field3065[var2].field3011) {
                if (class190.field3065[var2].field267.method1384((byte) -127)) {
                    class96.method729(arg0 ^ 0xFFFFFA7B, class190.field3065[var2]);
                }
                class190.field3065[var2].field267 = null;
                class190.field3065[var2] = null;
            }
        }
        if (class110.field1726 != class166.field2671.field2367) {
            throw new RuntimeException("gnp1 pos:" + class166.field2671.field2367 + " psize:" + class110.field1726);
        }
        for (int var3 = 0; var3 < class2.field15; var3++) {
            if (class190.field3065[class116.field1814[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class2.field15);
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIILdk;)Lha;", line = 106)
    public static final class49 method1474(int arg0, int arg1, int arg2, class241 arg3) {
        field3463++;
        if (arg1 == 3) {
            return class28.method148(arg2, arg3, arg0, -38) ? class251.method1713((byte) 106) : null;
        } else {
            return (class49) null;
        }
    }

    @OriginalMember(owner = "client!te", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 124)
    public final void update(Graphics arg0) {
        this.field3462.update(arg0);
        field3465++;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIILjg;IIIII)V", line = 132)
    public static final void method1475(int arg0, int arg1, int arg2, class161 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3467++;
        int var9 = arg8 & 0x3;
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var10 = arg3.field2559;
            var11 = arg3.field2558;
        } else {
            var10 = arg3.field2558;
            var11 = arg3.field2559;
        }
        int var12;
        int var13;
        if ((arg2 + var10) <= 104) {
            var12 = (var10 >> 1) + arg2;
            var13 = arg2 + (var10 + 1 >> 1);
        } else {
            var12 = arg2;
            var13 = arg2 + 1;
        }
        int var14 = (arg2 << 7) + (var10 << 6);
        int[][] var15 = class227.field3686[arg4];
        int var16 = 0;
        int var17 = (arg0 << 7) + (var11 << 6);
        int var18;
        int var19;
        if ((arg0 + var11) <= 104) {
            var18 = (var11 + 1 >> 1) + arg0;
            var19 = (var11 >> 1) + arg0;
        } else {
            var18 = arg0 + 1;
            var19 = arg0;
        }
        int var20 = var15[var12][var19] + var15[var12][var18] + var15[var13][var18] + var15[var13][var19] >> 2;
        if (arg4 != 0) {
            int[][] var21 = class227.field3686[0];
            var16 = var20 - (var21[var12][var19] + var21[var12][var18] - (-var21[var13][var18] - var21[var13][var19]) >> 2);
        }
        int[][] var22 = (int[][]) null;
        if (arg4 < 3) {
            var22 = class227.field3686[arg4 + 1];
        }
        class12 var23 = arg3.method1128(arg5, var14, var22, var20, true, var17, arg8, false, true, var15, (class265) null);
        if (arg1 <= -28) {
            class100.method761(var23.field128, var14 - arg7, var16, var17 - arg6);
        }
    }

    @OriginalMember(owner = "client!te", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 219)
    public final void paint(Graphics arg0) {
        this.field3462.paint(arg0);
        field3469++;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 228)
    public class211(Component arg0) {
        this.field3462 = arg0;
    }
}
