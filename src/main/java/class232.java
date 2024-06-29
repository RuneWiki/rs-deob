import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class232 extends class78 {

    @OriginalMember(owner = "client!td", name = "D", descriptor = "I")
    private final int field3812;

    @OriginalMember(owner = "client!td", name = "E", descriptor = "I")
    private final int field3813;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "I")
    private final int field3810;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "I")
    private final int field3803;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "Lqd;")
    public static class40 field3808 = class147.method1106("null", (byte) -119);

    @OriginalMember(owner = "client!td", name = "v", descriptor = "[S")
    public static short[] field3804 = new short[256];

    @OriginalMember(owner = "client!td", name = "s", descriptor = "[I")
    public static int[] field3801 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!td", name = "C", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!td", name = "F", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "Lo;")
    public static class199 field3802;

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(IIIIII)V", line = 3)
    public class232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field3812 = arg3;
        this.field3813 = arg2;
        this.field3810 = arg1;
        this.field3803 = arg0;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 15)
    public static final void method1608(Component arg0, int arg1) {
        field3807++;
        arg0.removeKeyListener(class306.field5135);
        arg0.removeFocusListener(class306.field5135);
        if (arg1 != 660) {
            method1613(86);
        }
        class265.field4447 = -1;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZLce;ZILce;)Lwa;", line = 35)
    public static final class76 method1609(boolean arg0, class239 arg1, boolean arg2, int arg3, class239 arg4) {
        boolean var5 = arg2;
        field3809++;
        int[] var6 = arg1.method1673((byte) -128, arg3);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg1.method1662(var6[var7], 116, arg3);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg0) {
                    var10 = arg4.method1662(var9, 52, 0);
                } else {
                    var10 = arg4.method1662(0, 70, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class76(arg1, arg4, arg3, arg0);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(III)V", line = 85)
    public static final void method1610(int arg0, int arg1, int arg2) {
        field3811++;
        class177 var3 = class177.method1310(34, 6, arg1);
        var3.method1302(-20040);
        var3.field2908 = arg0;
        if (arg2 < 48) {
            method1609(true, (class239) null, false, 34, (class239) null);
        }
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(III)V", line = 100)
    public final void method5(int arg0, int arg1, int arg2) {
        if (arg2 == -1) {
            field3805++;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lce;Lce;I)I", line = 111)
    public static final int method1611(class239 arg0, class239 arg1, int arg2) {
        int var3 = 0;
        if (arg0.method1676(class85.field1470, arg2 - 47481)) {
            var3++;
        }
        if (arg2 != 27447) {
            field3802 = (class199) null;
        }
        if (arg0.method1676(class72.field1273, arg2 - 47481)) {
            var3++;
        }
        field3806++;
        if (arg0.method1676(class159.field2649, arg2 - 47481)) {
            var3++;
        }
        if (arg1.method1676(class85.field1470, -20034)) {
            var3++;
        }
        if (arg1.method1676(class72.field1273, -20034)) {
            var3++;
        }
        if (arg1.method1676(class159.field2649, arg2 - 47481)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZIZ)Lqd;", line = 148)
    public static final class40 method1612(boolean arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field3802 = (class199) null;
        }
        field3799++;
        return class208.method1473(10, arg1, (byte) 127, arg0);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IBI)V", line = 162)
    public final void method3(int arg0, byte arg1, int arg2) {
        if (arg1 < -71) {
            field3800++;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(III)V", line = 186)
    public final void method2(int arg0, int arg1, int arg2) {
        int var4 = this.field3803 * arg1 >> 12;
        if (arg0 <= 33) {
            method1612(true, 13, false);
        }
        field3814++;
        int var5 = this.field3812 * arg2 >> 12;
        int var6 = this.field3810 * arg2 >> 12;
        int var7 = this.field3813 * arg1 >> 12;
        class228.method1598(-18921, this.field1325, var7, var6, var5, var4);
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V", line = 205)
    public static void method1613(int arg0) {
        field3802 = null;
        field3808 = null;
        if (arg0 < 68) {
            field3802 = (class199) null;
        }
        field3804 = null;
        field3801 = null;
    }
}
