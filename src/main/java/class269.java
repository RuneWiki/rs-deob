import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class269 extends class81 {

    @OriginalMember(owner = "client!rf", name = "B", descriptor = "[I")
    public static int[] field4594 = new int[5];

    @OriginalMember(owner = "client!rf", name = "E", descriptor = "Lpj;")
    public static class237 field4597 = class33.method353(" )2> ", 71);

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "Lpj;")
    public static class237 field4607 = class33.method353("(U0a )2 non)2existant gosub script)2num: ", 38);

    @OriginalMember(owner = "client!rf", name = "H", descriptor = "I")
    public static int field4600 = 0;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "I")
    public int field4583;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "I")
    public int field4586;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
    public int field4587;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
    public int field4588;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
    public int field4590;

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "I")
    public int field4591;

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "I")
    public int field4592;

    @OriginalMember(owner = "client!rf", name = "A", descriptor = "I")
    public int field4593;

    @OriginalMember(owner = "client!rf", name = "C", descriptor = "I")
    public int field4595;

    @OriginalMember(owner = "client!rf", name = "D", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!rf", name = "F", descriptor = "I")
    public int field4598;

    @OriginalMember(owner = "client!rf", name = "G", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!rf", name = "I", descriptor = "I")
    public int field4601;

    @OriginalMember(owner = "client!rf", name = "J", descriptor = "I")
    public int field4602;

    @OriginalMember(owner = "client!rf", name = "K", descriptor = "I")
    public int field4603;

    @OriginalMember(owner = "client!rf", name = "M", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!rf", name = "P", descriptor = "I")
    public int field4608;

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "I")
    public int field4611;

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "I")
    public int field4613;

    @OriginalMember(owner = "client!rf", name = "V", descriptor = "I")
    public int field4614;

    @OriginalMember(owner = "client!rf", name = "W", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "Lve;")
    public class185 field4585;

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "Ls;")
    public class229 field4612;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "Lkc;")
    public class266 field4584;

    @OriginalMember(owner = "client!rf", name = "L", descriptor = "Lud;")
    public class2 field4604;

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "Lclient;")
    public static client field4606;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)I")
    public static final int method1786(int arg0, int arg1) {
        if (arg0 <= 51) {
            method1790(-8, 27, -118, -24, -64, 85, true, -83, -14);
        }
        field4609++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
    public static void method1787(byte arg0) {
        field4607 = null;
        field4597 = null;
        int var1 = 87 / ((arg0 - 28) / 51);
        field4594 = null;
        field4606 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BI)V")
    public static final void method1788(byte arg0, int arg1) {
        field4610++;
        if (arg1 == -1 || !class257.field4423[arg1] || arg0 < 41) {
            return;
        }
        class203.field3477.method1651(arg1, 66);
        if (class22.field406[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class22.field406[arg1].length; var3++) {
            if (class22.field406[arg1][var3] != null) {
                if (class22.field406[arg1][var3].field2529 == 2) {
                    var2 = false;
                } else {
                    class22.field406[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class22.field406[arg1] = null;
        }
        class257.field4423[arg1] = false;
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)V")
    public final void method1789(int arg0) {
        field4596++;
        if (arg0 == 5) {
            this.field4612 = null;
            this.field4584 = null;
            this.field4585 = null;
            this.field4604 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIIIZII)V")
    public static final void method1790(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        int var9 = arg2 - arg7;
        field4615++;
        int var10 = arg1 - arg0;
        int var11 = (arg3 - arg8 << 16) / var10;
        int var12 = (arg4 - arg5 << 16) / var9;
        if (arg6) {
            method1792(-38, (byte) -80, -65, 16);
        }
        class55.method485(0, arg5, arg7, arg2, arg1, var11, arg8, arg0, -35, var12, 0);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIZILw;I)V")
    public static final void method1791(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class141 arg6, int arg7) {
        if (!arg4) {
            method1787((byte) -125);
        }
        field4582++;
        if (class69.field1360) {
            class64.field1285 = 32;
        } else {
            class64.field1285 = 0;
        }
        class69.field1360 = false;
        if (class170.field2986 != 0) {
            if (arg3 <= arg2 && arg2 < arg3 + 16 && arg0 <= arg7 && arg7 < arg0 + 16) {
                arg6.field2413 -= 4;
                class128.method911(arg6, -17149);
            } else if (arg2 >= arg3 && arg2 < arg3 + 16 && arg0 + arg5 - 16 <= arg7 && arg0 + arg5 > arg7) {
                arg6.field2413 += 4;
                class128.method911(arg6, -17149);
            } else if (arg2 >= arg3 - class64.field1285 && arg2 < (arg3 + class64.field1285 + 16) && arg7 >= (arg0 + 16) && arg0 + arg5 - 16 > arg7) {
                int var8 = (arg5 - 32) * arg5 / arg1;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg7 - arg0 - (var8 / 2) - 16;
                int var10 = arg5 - var8 - 32;
                arg6.field2413 = (arg1 - arg5) * var9 / var10;
                class128.method911(arg6, -17149);
                class69.field1360 = true;
            }
        }
        if (class79.field1480 == 0) {
            return;
        }
        int var11 = arg6.field2575;
        if (arg2 >= arg3 - var11 && arg0 <= arg7 && arg2 < arg3 + 16 && arg7 <= arg0 + arg5) {
            arg6.field2413 += class79.field1480 * 45;
            class128.method911(arg6, -17149);
            return;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IBII)I")
    public static final int method1792(int arg0, byte arg1, int arg2, int arg3) {
        field4589++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg2;
        } else {
            int var5 = 86 / ((-arg1 - 42) / 56);
            return var4 == 2 ? 7 - arg3 : -arg2 + 7;
        }
    }
}
