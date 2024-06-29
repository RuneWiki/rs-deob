import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class10 implements class218 {

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "[I")
    public static int[] field134 = new int[2000];

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "Ljava/lang/String;")
    public static String field136 = "Loaded config";

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
    public static int field144 = 0;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "Lrn;")
    public static class18 field137;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIII)V", line = 7)
    public static final void method100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field140++;
        int var6 = arg0 - arg2;
        int var7 = arg1 - arg4;
        if (var6 == 0) {
            if (var7 != 0) {
                class318.method2248((byte) -107, arg3, arg1, arg2, arg4);
            }
        } else if (var7 == 0) {
            class276.method2024(8, arg2, arg4, arg0, arg3);
        } else if (arg5 == -28776) {
            int var8 = (var7 << 12) / var6;
            int var9 = arg4 - (arg2 * var8 >> 12);
            int var10;
            int var11;
            if (arg0 < class43.field693) {
                var10 = class43.field693;
                var11 = var9 + (class43.field693 * var8 >> 12);
            } else if (arg0 <= class128.field2130) {
                var10 = arg0;
                var11 = arg1;
            } else {
                var11 = (class128.field2130 * var8 >> 12) + var9;
                var10 = class128.field2130;
            }
            int var12;
            int var13;
            if (arg2 < class43.field693) {
                var12 = class43.field693;
                var13 = (class43.field693 * var8 >> 12) + var9;
            } else if (arg2 > class128.field2130) {
                var12 = class128.field2130;
                var13 = var9 + (class128.field2130 * var8 >> 12);
            } else {
                var13 = arg4;
                var12 = arg2;
            }
            if (var13 < class328.field5042) {
                var13 = class328.field5042;
                var12 = (class328.field5042 - var9 << 12) / var8;
            } else if (class284.field4385 < var13) {
                var12 = (class284.field4385 - var9 << 12) / var8;
                var13 = class284.field4385;
            }
            if (var11 < class328.field5042) {
                var11 = class328.field5042;
                var10 = (class328.field5042 - var9 << 12) / var8;
            } else if (var11 > class284.field4385) {
                var10 = (class284.field4385 - var9 << 12) / var8;
                var11 = class284.field4385;
            }
            class268.method1967(var10, arg5 ^ 0x703A, var12, var11, var13, arg3);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)V", line = 112)
    public static void method101(boolean arg0) {
        field137 = null;
        if (arg0) {
            field134 = null;
            field136 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIII)Z", line = 123)
    public static final boolean method102(int arg0, int arg1, int arg2, int arg3) {
        if (class62.method625(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class112.method965(var4 + 1, class277.field4290[arg0][arg1][arg2] + arg3, var5 + 1) && class112.method965(var4 + 128 - 1, class277.field4290[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class112.method965(var4 + 128 - 1, class277.field4290[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class112.method965(var4 + 1, class277.field4290[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V", line = 144)
    public static final void method103(int arg0) {
        int var1 = class64.field988.method1194(class222.field3450);
        if (arg0 < 21) {
            return;
        }
        for (int var2 = 0; var2 < class66.field1006; var2++) {
            int var3 = class64.field988.method1194(class78.method720(var2, false));
            if (var3 > var1) {
                var1 = var3;
            }
        }
        field135++;
        int var4 = class66.field1006 * 15 + 21;
        var1 += 8;
        int var5 = class344.field5479 - (var1 / 2);
        int var6 = class191.field3003;
        if (class362.field5740 < var4 + var6) {
            var6 = class362.field5740 - var4;
        }
        if (class126.field2113 < (var1 + var5)) {
            var5 = class126.field2113 - var1;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class307.field4755 == 1) {
            if (class344.field5479 == class215.field3364 && class317.field4880 == class191.field3003) {
                field141 = var5;
                class135.field2259 = (class149.field2444 ? 26 : 22) + class66.field1006 * 15;
                class310.field4785 = var6;
                class43.field700 = var1;
                class6.field89 = true;
                class307.field4755 = 0;
            }
        } else if (class344.field5479 == class305.field4745 && class254.field3916 == class191.field3003) {
            class43.field700 = var1;
            class6.field89 = true;
            class307.field4755 = 0;
            class310.field4785 = var6;
            field141 = var5;
            class135.field2259 = (class149.field2444 ? 26 : 22) + class66.field1006 * 15;
        } else {
            class307.field4755 = 1;
            class317.field4880 = class254.field3916;
            class215.field3364 = class305.field4745;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V", line = 236)
    public static final void method104(int arg0) {
        if (arg0 >= 41) {
            class112.field1715.method656(0);
            field139++;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBIIIII)V", line = 249)
    public static final void method105(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field142++;
        if (arg1 >= -104) {
            return;
        }
        if (class43.field693 <= arg4 && class128.field2130 >= arg5 && arg2 >= class328.field5042 && arg3 <= class284.field4385) {
            if (arg0 == 1) {
                class308.method2200(arg6, 69, arg3, arg4, arg5, arg2);
            } else {
                class222.method1667(arg6, arg3, arg4, arg2, -29872, arg5, arg0);
            }
        } else if (arg0 == 1) {
            class292.method2113(arg6, arg4, arg5, arg2, arg3, -127);
        } else {
            class49.method475(arg3, arg5, arg0, arg4, 32677, arg2, arg6);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBJ[I)Ljava/lang/String;", line = 287)
    public final String method106(int arg0, byte arg1, long arg2, int[] arg3) {
        if (arg1 < 109) {
            field134 = (int[]) null;
        }
        field138++;
        if (arg0 == 0) {
            class81 var7 = class130.method1124(arg3[0], false);
            return var7.method730(-2, (int) arg2);
        } else if (arg0 == 1 || arg0 == 10) {
            class263 var6 = class48.method469(10, (int) arg2);
            return var6.field4058;
        } else if (arg0 == 6 || arg0 == 7 || arg0 == 11) {
            return class130.method1124(arg3[0], false).method730(-2, (int) arg2);
        } else {
            return null;
        }
    }
}
