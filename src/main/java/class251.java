import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class251 extends class249 {

    @OriginalMember(owner = "client!t", name = "I", descriptor = "I")
    public int field4354 = 0;

    @OriginalMember(owner = "client!t", name = "H", descriptor = "I")
    public int field4353 = -1;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "[Lmb;")
    public static class96[] field4336 = new class96[200];

    @OriginalMember(owner = "client!t", name = "q", descriptor = "[I")
    public static int[] field4337 = new int[200];

    @OriginalMember(owner = "client!t", name = "D", descriptor = "I")
    public static int field4349 = -1;

    @OriginalMember(owner = "client!t", name = "A", descriptor = "Lmb;")
    public static class96 field4347 = class243.method1708("rect_debug=", (byte) 125);

    @OriginalMember(owner = "client!t", name = "J", descriptor = "[I")
    public static int[] field4355 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!t", name = "o", descriptor = "I")
    public int field4335;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "I")
    public int field4338;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "I")
    public int field4340;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "I")
    public int field4341;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "I")
    public int field4345;

    @OriginalMember(owner = "client!t", name = "z", descriptor = "I")
    public int field4346;

    @OriginalMember(owner = "client!t", name = "B", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!t", name = "E", descriptor = "I")
    public int field4350;

    @OriginalMember(owner = "client!t", name = "F", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!t", name = "G", descriptor = "I")
    public int field4352;

    @OriginalMember(owner = "client!t", name = "K", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!t", name = "L", descriptor = "I")
    public int field4357;

    @OriginalMember(owner = "client!t", name = "M", descriptor = "I")
    public int field4358;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "Lff;")
    public static class3 field4344;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
    public static void method1748(int arg0) {
        field4355 = null;
        field4336 = null;
        if (arg0 == 15286) {
            field4344 = null;
            field4337 = null;
            field4347 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIZILrg;I)V")
    public static final void method1749(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, class239 arg7, int arg8) {
        field4342++;
        if (arg6 >= -65) {
            return;
        }
        if (arg4 < 0 || arg4 >= 104 || arg1 < 0 || arg1 >= 104) {
            while (true) {
                int var11 = arg7.method1651(4139);
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg7.method1651(4139);
                    return;
                }
                if (var11 <= 49) {
                    arg7.method1651(4139);
                }
            }
        }
        if (!arg5) {
            class132.field2376[arg3][arg4][arg1] = 0;
        }
        while (true) {
            int var9 = arg7.method1651(4139);
            if (var9 == 0) {
                if (arg5) {
                    class173.field3022[0][arg4][arg1] = class106.field1790[0][arg4][arg1];
                    return;
                } else if (arg3 == 0) {
                    class173.field3022[0][arg4][arg1] = -class94.method660(arg1 + arg8 + 556238, arg2 + 932731 - -arg4, -1) * 8;
                    return;
                } else {
                    class173.field3022[arg3][arg4][arg1] = class173.field3022[arg3 - 1][arg4][arg1] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg7.method1651(4139);
                if (arg5) {
                    class173.field3022[0][arg4][arg1] = var10 * 8 + class106.field1790[0][arg4][arg1];
                    return;
                }
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg3 != 0) {
                    class173.field3022[arg3][arg4][arg1] = class173.field3022[arg3 - 1][arg4][arg1] - (var10 * 8);
                    return;
                }
                class173.field3022[0][arg4][arg1] = -var10 * 8;
                return;
            }
            if (var9 <= 49) {
                class247.field4276[arg3][arg4][arg1] = arg7.method1656(-90);
                class272.field4733[arg3][arg4][arg1] = (byte) ((var9 - 2) / 4);
                class169.field2969[arg3][arg4][arg1] = (byte) class130.method985(3, arg0 + var9 - 2);
            } else if (var9 > 81) {
                class48.field857[arg3][arg4][arg1] = (byte) (var9 - 81);
            } else if (!arg5) {
                class132.field2376[arg3][arg4][arg1] = (byte) (var9 - 49);
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BI)I")
    public static final int method1750(byte arg0, int arg1) {
        if (arg0 <= 80) {
            field4349 = -18;
        }
        if (class211.field3638 != null) {
            class211.field3638.method1605(-4);
            class211.field3638 = null;
        }
        field4356++;
        class55.field956++;
        if (class55.field956 > 4) {
            class235.field4021 = 0;
            class55.field956 = 0;
            return arg1;
        }
        if (class47.field841 == class208.field3582) {
            class208.field3582 = class124.field2303;
        } else {
            class208.field3582 = class47.field841;
        }
        class235.field4021 = 0;
        return -1;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BLwk;)V")
    public static final void method1751(byte arg0, class47 arg1) {
        field4351++;
        class38 var2 = (class38) class260.field4525.method1081(0, arg1.field828.method685((byte) 118));
        if (var2 != null) {
            if (var2.field671 != null) {
                class120.field2228.method1550(var2.field671);
                var2.field671 = null;
            }
            var2.method1743((byte) 63);
        }
        if (arg0 < 91) {
            field4336 = null;
        }
    }
}
