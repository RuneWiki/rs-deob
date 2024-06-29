import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class134 {

    @OriginalMember(owner = "client!an", name = "a", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!an", name = "i", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "Lwl;")
    public static class13 field1825;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "Lfh;")
    public static class140 field1826;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lfd;ZZZIIIIIIII)V", line = 4)
    public static final void method1018(class299 arg0, boolean arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field1823++;
        if (arg11 >= 0 && arg11 < 104 && arg7 >= 0 && arg7 < 104) {
            if (!arg3 && !arg2) {
                class9.field101[arg4][arg11][arg7] = 0;
            }
            while (true) {
                int var12 = arg0.method2096((byte) -122);
                if (var12 == 0) {
                    if (arg3) {
                        class74.field978[0][arg10 + arg11][arg7 + arg9] = class185.field2517[0][arg10 + arg11][arg7 + arg9];
                    } else if (arg4 == 0) {
                        class74.field978[0][arg10 + arg11][arg7 + arg9] = -class65.method473(arg5 + 932731, arg6 + 556238, -70) * 8;
                    } else {
                        class74.field978[arg4][arg10 + arg11][arg7 + arg9] = class74.field978[arg4 - 1][arg11 + arg10][arg7 + arg9] - 240;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg0.method2096((byte) -122);
                    if (arg3) {
                        class74.field978[0][arg10 + arg11][arg7 + arg9] = var13 * 8 + class185.field2517[0][arg10 + arg11][arg7 + arg9];
                    } else {
                        if (var13 == 1) {
                            var13 = 0;
                        }
                        if (arg4 == 0) {
                            class74.field978[0][arg10 + arg11][arg7 + arg9] = -var13 * 8;
                        } else {
                            class74.field978[arg4][arg10 + arg11][arg7 + arg9] = class74.field978[arg4 - 1][arg10 + arg11][arg7 + arg9] - (var13 * 8);
                        }
                    }
                    break;
                }
                if (var12 <= 49) {
                    if (arg2) {
                        arg0.method2096((byte) -122);
                    } else {
                        class55.field710[arg4][arg11][arg7] = arg0.method2104(116);
                        class352.field5500[arg4][arg11][arg7] = (byte) ((var12 - 2) / 4);
                        class178.field2439[arg4][arg11][arg7] = (byte) class335.method2339(3, arg8 + var12 - 2);
                    }
                } else if (var12 > 81) {
                    if (!arg2) {
                        class263.field3827[arg4][arg11][arg7] = (byte) (var12 - 81);
                    }
                } else if (!arg3 && !arg2) {
                    class9.field101[arg4][arg11][arg7] = (byte) (var12 - 49);
                }
            }
        } else {
            while (true) {
                int var14 = arg0.method2096((byte) -122);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg0.method2096((byte) -122);
                    break;
                }
                if (var14 <= 49) {
                    arg0.method2096((byte) -122);
                }
            }
        }
        if (arg1) {
            method1019((byte) -95);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V", line = 120)
    public static void method1019(byte arg0) {
        if (arg0 != 116) {
            method1022(-79);
        }
        field1825 = null;
        field1826 = null;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ILfh;II)Z", line = 145)
    public static final boolean method1020(int arg0, class140 arg1, int arg2, int arg3) {
        field1821++;
        byte[] var4 = arg1.method1089(arg2, (byte) 114, arg3);
        if (var4 == null) {
            return false;
        }
        class58.method436(var4, 73);
        if (arg0 != 1) {
            method1022(8);
        }
        return true;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V", line = 162)
    public static final void method1021(int arg0) {
        if (arg0 != 15575) {
            method1020(-95, (class140) null, 57, 97);
        }
        field1828++;
        class347.field5393.method2258((byte) 86);
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(I)V", line = 176)
    public static final void method1022(int arg0) {
        if (class335.field5234 != null) {
            class335.field5234.method2462(arg0 ^ 0x62B1);
        }
        if (class328.field4801 != null) {
            class328.field4801.method2462(14680);
        }
        class254.method1772(2, class103.field1343, 22050, (byte) 115);
        field1827++;
        class335.field5234 = class330.method2284(class26.field307, (byte) -112, 22050, class157.field2216, 0);
        if (arg0 == 23529) {
            class335.field5234.method2465(class163.field2312, arg0 ^ 0x5BE1);
            class328.field4801 = class330.method2284(class26.field307, (byte) -123, 2048, class157.field2216, 1);
            class328.field4801.method2465(class186.field2548, arg0 ^ 0x5BE1);
        }
    }
}
