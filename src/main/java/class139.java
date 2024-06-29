import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class139 extends class55 {

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "I")
    public static int field2016 = 0;

    @OriginalMember(owner = "client!ti", name = "F", descriptor = "Z")
    public static boolean field2022 = false;

    @OriginalMember(owner = "client!ti", name = "G", descriptor = "C")
    private char field2023;

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "I")
    public int field2019;

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!ti", name = "E", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!ti", name = "H", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!ti", name = "I", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "Ljava/lang/String;")
    public String field2018;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIII)Z")
    public static final boolean method905(int arg0, int arg1, int arg2, int arg3) {
        if (!class152.method996(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class290.field4536[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class77.field927) {
                    if (!class241.method1570(var4, var6, var5)) {
                        return false;
                    }
                    if (!class241.method1570(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class241.method1570(var4, var7, var5)) {
                        return false;
                    }
                    if (!class241.method1570(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class241.method1570(var4, var8, var5)) {
                    return false;
                }
                if (!class241.method1570(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class296.field4671) {
                    if (!class241.method1570(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class241.method1570(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class241.method1570(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class241.method1570(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class241.method1570(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class241.method1570(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class77.field927) {
                    if (!class241.method1570(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class241.method1570(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class241.method1570(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class241.method1570(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class241.method1570(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class241.method1570(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class296.field4671) {
                    if (!class241.method1570(var4, var6, var5)) {
                        return false;
                    }
                    if (!class241.method1570(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class241.method1570(var4, var7, var5)) {
                        return false;
                    }
                    if (!class241.method1570(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class241.method1570(var4, var8, var5)) {
                    return false;
                }
                if (!class241.method1570(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class241.method1570(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class241.method1570(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class241.method1570(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class241.method1570(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class241.method1570(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIZII)V")
    public static final void method906(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg0 > arg1) {
            class76.method463(arg1, 0, arg3, arg0, class268.field3919[arg4]);
        } else {
            class76.method463(arg0, 0, arg3, arg1, class268.field3919[arg4]);
        }
        field2020++;
        if (!arg2) {
            method905(-34, 111, 113, -48);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)I")
    public static final int method907(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILqi;)V")
    private final void method908(int arg0, int arg1, class216 arg2) {
        if (arg1 == 1) {
            this.field2023 = class285.method1908((byte) 68, arg2.method1355(true));
        } else if (arg1 == 2) {
            this.field2019 = arg2.method1358(62);
        } else if (arg1 == 5) {
            this.field2018 = arg2.method1352((byte) 54);
        }
        int var4 = -124 / ((45 - arg0) / 40);
        field2021++;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILqi;)V")
    public final void method909(int arg0, class216 arg1) {
        while (true) {
            int var3 = arg1.method1407(113);
            if (var3 == 0) {
                if (arg0 != 0) {
                    return;
                }
                field2024++;
                return;
            }
            this.method908(-93, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "(I)Z")
    public final boolean method910(int arg0) {
        field2015++;
        if (arg0 != -116) {
            field2016 = 34;
        }
        return this.field2023 == 's';
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIII)V")
    public static final void method911(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class274.field4103 = -1;
        class294.field4647 = -1;
        field2017++;
        if (arg0 > -24) {
            field2022 = false;
        }
        class271.field3963 = class133.field1940 * arg2 / arg4;
        class261.field3800 = client.field4446 * arg1 / arg3;
        class199.method1281(-1);
    }
}
