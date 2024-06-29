import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class30 extends class102 {

    @OriginalMember(owner = "client!mi", name = "P", descriptor = "Lqc;")
    public static class245 field448 = new class245(64);

    @OriginalMember(owner = "client!mi", name = "T", descriptor = "I")
    public static int field452 = 0;

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!mi", name = "L", descriptor = "I")
    public int field445;

    @OriginalMember(owner = "client!mi", name = "N", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!mi", name = "O", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!mi", name = "Q", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!mi", name = "R", descriptor = "I")
    private int field450;

    @OriginalMember(owner = "client!mi", name = "S", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!mi", name = "V", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!mi", name = "W", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!mi", name = "J", descriptor = "Lr;")
    public class66 field444;

    @OriginalMember(owner = "client!mi", name = "U", descriptor = "[[[I")
    public static int[][][] field453;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(II)V")
    public static final void method167(int arg0, int arg1) {
        if (arg0 != 9) {
            method169(false);
        }
        field446++;
        class69.field1379.method1611(-18767, arg1);
        class94.field1806.method1611(-18767, arg1);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method168(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class167.field3001 * arg3 + class125.field2370 * arg0 >> 16;
        int var6 = class125.field2370 * arg3 - class167.field3001 * arg0 >> 16;
        int var7 = class218.field3752 * var6 + class160.field2875 * arg1 >> 16;
        int var8 = class218.field3752 * arg1 - class160.field2875 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class218.field3752 * var6 + class160.field2875 * arg2 >> 16;
        int var12 = class218.field3752 * arg2 - class160.field2875 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class206.field3537 && var13 < class206.field3537) {
            return false;
        } else if (var9 > class257.field4520 && var13 > class257.field4520) {
            return false;
        } else if (var10 < class20.field274 && var14 < class20.field274) {
            return false;
        } else {
            return var10 <= class233.field4072 || var14 <= class233.field4072;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V")
    public static void method169(boolean arg0) {
        if (!arg0) {
            method168(29, 48, -43, -20, -24);
        }
        field448 = null;
        field453 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Llh;II)V")
    private final void method170(class249 arg0, int arg1, int arg2) {
        if (arg1 != 5) {
            this.method172(29);
        }
        if (arg2 == 1) {
            this.field450 = arg0.method1677(arg1 - 6682);
        } else if (arg2 == 2) {
            this.field445 = arg0.method1652(arg1 - 5533);
        } else if (arg2 == 5) {
            this.field444 = arg0.method1637(arg1 + 122);
        }
        field443++;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lta;I)V")
    public static final void method171(class107 arg0, int arg1) {
        arg0.field2099 = false;
        if (arg0.field2040 != -1) {
            class224 var2 = class47.method335((byte) -36, arg0.field2040);
            if (var2 == null || var2.field3811 == null) {
                arg0.field2040 = -1;
            } else {
                arg0.field2093++;
                if (arg0.field2071 < var2.field3811.length && var2.field3834[arg0.field2071] < arg0.field2093) {
                    arg0.field2093 = 1;
                    arg0.field2071++;
                    class103.method713(false, arg0.field2071, arg0.field2077, var2, class207.field3595 == arg0, arg0.field2053);
                }
                if (arg0.field2071 >= var2.field3811.length) {
                    arg0.field2071 = 0;
                    arg0.field2093 = 0;
                    class103.method713(false, arg0.field2071, arg0.field2077, var2, class207.field3595 == arg0, arg0.field2053);
                }
            }
        }
        if (arg0.field2068 != -1 && arg0.field2057 <= class75.field1501) {
            if (arg0.field2094 < 0) {
                arg0.field2094 = 0;
            }
            int var3 = class156.method1060(arg0.field2068, 1).field1448;
            if (var3 == -1) {
                arg0.field2068 = -1;
            } else {
                class224 var4 = class47.method335((byte) -36, var3);
                if (var4 == null || var4.field3811 == null) {
                    arg0.field2068 = -1;
                } else {
                    arg0.field2102++;
                    if (arg0.field2094 < var4.field3811.length && var4.field3834[arg0.field2094] < arg0.field2102) {
                        arg0.field2102 = 1;
                        arg0.field2094++;
                        class103.method713(false, arg0.field2094, arg0.field2077, var4, class207.field3595 == arg0, arg0.field2053);
                    }
                    if (var4.field3811.length <= arg0.field2094) {
                        arg0.field2068 = -1;
                    }
                }
            }
        }
        field447++;
        if (arg1 != 1) {
            field452 = -38;
        }
        if (arg0.field2084 != -1 && arg0.field2061 <= 1) {
            class224 var5 = class47.method335((byte) -36, arg0.field2084);
            if (var5.field3819 == 1 && arg0.field2073 > 0 && class75.field1501 >= arg0.field2066 && class75.field1501 > arg0.field2037) {
                arg0.field2061 = 1;
                return;
            }
        }
        if (arg0.field2084 != -1 && arg0.field2061 == 0) {
            class224 var6 = class47.method335((byte) -36, arg0.field2084);
            if (var6 == null || var6.field3811 == null) {
                arg0.field2084 = -1;
            } else {
                arg0.field2072++;
                if (arg0.field2038 < var6.field3811.length && var6.field3834[arg0.field2038] < arg0.field2072) {
                    arg0.field2072 = 1;
                    arg0.field2038++;
                    class103.method713(false, arg0.field2038, arg0.field2077, var6, class207.field3595 == arg0, arg0.field2053);
                }
                if (arg0.field2038 >= var6.field3811.length) {
                    arg0.field2038 -= var6.field3848;
                    arg0.field2065++;
                    if (arg0.field2065 >= var6.field3813) {
                        arg0.field2084 = -1;
                    } else if (arg0.field2038 >= 0 && var6.field3811.length > arg0.field2038) {
                        class103.method713(false, arg0.field2038, arg0.field2077, var6, class207.field3595 == arg0, arg0.field2053);
                    } else {
                        arg0.field2084 = -1;
                    }
                }
                arg0.field2099 = var6.field3830;
            }
        }
        if (arg0.field2061 > 0) {
            arg0.field2061--;
        }
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)Z")
    public final boolean method172(int arg0) {
        field451++;
        if (arg0 != 115) {
            method168(-88, -16, 25, 34, 28);
        }
        return this.field450 == 115;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILlh;)V")
    public final void method173(int arg0, class249 arg1) {
        if (arg0 != 1) {
            field452 = 122;
        }
        field449++;
        while (true) {
            int var3 = arg1.method1677(-6677);
            if (var3 == 0) {
                return;
            }
            this.method170(arg1, arg0 ^ 0x4, var3);
        }
    }
}
