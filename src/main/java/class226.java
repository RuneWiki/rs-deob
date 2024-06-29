import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public abstract class class226 extends class167 {

    @OriginalMember(owner = "client!wa", name = "M", descriptor = "Lef;")
    public static class175 field4067 = new class175();

    @OriginalMember(owner = "client!wa", name = "T", descriptor = "Z")
    public static boolean field4074 = true;

    @OriginalMember(owner = "client!wa", name = "W", descriptor = "I")
    public static int field4077 = 0;

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!wa", name = "N", descriptor = "I")
    public int field4068;

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "I")
    public int field4070;

    @OriginalMember(owner = "client!wa", name = "Q", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!wa", name = "R", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!wa", name = "S", descriptor = "I")
    public int field4073;

    @OriginalMember(owner = "client!wa", name = "U", descriptor = "I")
    public int field4075;

    @OriginalMember(owner = "client!wa", name = "V", descriptor = "I")
    public int field4076;

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!wa", name = "Y", descriptor = "I")
    public int field4079;

    @OriginalMember(owner = "client!wa", name = "L", descriptor = "[[[B")
    public static byte[][][] field4066;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIII)V")
    public final void method1617(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 21900) {
            method1620(-59, 87, (class191) null, -87, -84L, -75, 62);
        }
        field4072++;
        int var6 = this.field4070 << 3;
        int var7 = this.field4079 << 3;
        int var8 = (arg0 << 4) + (var6 & 0xF);
        int var9 = (arg2 << 4) + (var7 & 0xF);
        this.method591(var6, var7, var8, var9, arg1, arg4);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)V")
    public abstract void method600(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(IIIII)V")
    public abstract void method595(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIII)V")
    public abstract void method591(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(IIII)V")
    public abstract void method1060(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(II)I")
    public static final int method1618(int arg0, int arg1) {
        field4078++;
        if (arg1 < 0) {
            return 0;
        }
        class34 var2 = (class34) class91.field1475.method612((long) arg1, true);
        if (var2 == null) {
            return class211.method1456(5, arg1).field1585;
        }
        int var3 = arg0;
        for (int var4 = 0; var4 < var2.field634.length; var4++) {
            if (var2.field634[var4] == -1) {
                var3++;
            }
        }
        return var3 + class211.method1456(5, arg1).field1585 - var2.field634.length;
    }

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "(I)V")
    public static void method1619(int arg0) {
        field4067 = null;
        field4066 = null;
        if (arg0 != 4556) {
            method1619(11);
        }
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(II)V")
    public abstract void method593(int arg0, int arg1);

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "(II)V")
    public abstract void method598(int arg0, int arg1);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IILe;IJII)V")
    public static final void method1620(int arg0, int arg1, class191 arg2, int arg3, long arg4, int arg5, int arg6) {
        field4065++;
        class225 var8 = new class225(128);
        var8.method1613(10, 21);
        var8.method1608((int) (Math.random() * 99999.0D), false);
        var8.method1608(513, false);
        var8.method1589(arg4, false);
        var8.method1576(30289, (int) (Math.random() * 9.9999999E7D));
        var8.method1586(arg2, (byte) -117);
        var8.method1576(30289, (int) (Math.random() * 9.9999999E7D));
        var8.method1608(class235.field4190, false);
        var8.method1613(arg5, 21);
        var8.method1613(arg1, 21);
        var8.method1576(30289, (int) (Math.random() * 9.9999999E7D));
        var8.method1608(arg3, false);
        var8.method1608(arg6, false);
        var8.method1576(30289, (int) (Math.random() * 9.9999999E7D));
        var8.method1569(0, class184.field3167, class266.field4700);
        class53.field963.field3996 = 0;
        class53.field963.method1613(140, 21);
        class53.field963.method1613(var8.field3996, 21);
        class53.field963.method1566(var8.field3995, 3, var8.field3996, 0);
        class24.field345 = -3;
        class126.field2081 = 1;
        class173.field2902 = 0;
        int var9 = -116 / ((-arg0 - 12) / 62);
        class239.field4224 = 0;
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(IIII)V")
    public abstract void method1063(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method1621(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class215 var20 = new class215(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class201.field3608[var21][arg1][arg2] == null) {
                    class201.field3608[var21][arg1][arg2] = new class199(var21, arg1, arg2);
                }
            }
            class201.field3608[arg0][arg1][arg2].field3560 = var20;
        } else if (arg3 == 1) {
            class215 var22 = new class215(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class201.field3608[var23][arg1][arg2] == null) {
                    class201.field3608[var23][arg1][arg2] = new class199(var23, arg1, arg2);
                }
            }
            class201.field3608[arg0][arg1][arg2].field3560 = var22;
        } else {
            class48 var24 = new class48(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class201.field3608[var25][arg1][arg2] == null) {
                    class201.field3608[var25][arg1][arg2] = new class199(var25, arg1, arg2);
                }
            }
            class201.field3608[arg0][arg1][arg2].field3552 = var24;
        }
    }
}
