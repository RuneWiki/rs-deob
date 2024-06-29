import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class195 {

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public final int field3627;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public final int field3610;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public final int field3624;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "Lqh;")
    public final class263 field3626;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "Llc;")
    public static class143 field3616 = class66.method374("leuchten2:", -1);

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "Llc;")
    public static class143 field3611 = class66.method374("Chargement de la liste des serveurs", -1);

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "Llc;")
    public static class143 field3620 = class66.method374("<img=0>", -1);

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field3614 = -1;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lvh;I)Z")
    public static final boolean method1341(class43 arg0, int arg1) {
        field3622++;
        if (arg0.field875 == null) {
            return false;
        }
        if (arg1 < 118) {
            method1349((byte) 12);
        }
        for (int var2 = 0; var2 < arg0.field875.length; var2++) {
            int var3 = class123.method745(false, arg0, var2);
            int var4 = arg0.field712[var2];
            if (arg0.field875[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg0.field875[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg0.field875[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZ)Lwh;")
    public static final class9 method1342(int arg0, boolean arg1) {
        field3613++;
        class9 var2 = (class9) class242.field4352.method1168((long) arg0, (byte) 96);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class201.field3673.method41(-18328, class167.method1100(arg0, arg1), class152.method1005(-124, arg0));
        class9 var4 = new class9();
        if (var3 != null) {
            var4.method72(true, new class190(var3));
        }
        class242.field4352.method1163(var4, (long) arg0, 0);
        return var4;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IB)V")
    public static final void method1343(int arg0, byte arg1) {
        field3618++;
        if (arg0 == -1 || !class47.method289((byte) -109, arg0) || arg1 != 13) {
            return;
        }
        class43[] var2 = class223.field4045[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class43 var4 = var2[var3];
            if (var4.field839 != null) {
                class91 var5 = new class91();
                var5.field1641 = var4;
                var5.field1639 = var4.field839;
                class146.method932(2000000, -42, var5);
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BI)Z")
    public static final boolean method1344(byte arg0, int arg1) {
        field3623++;
        if (arg0 >= -19) {
            field3620 = null;
        }
        return (arg1 & -arg1) == arg1;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIIIIIZ)V")
    public static final void method1345(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        if (arg2 >= class31.field481 && class9.field173 >= arg2 && arg5 >= class31.field481 && class9.field173 >= arg5 && arg6 >= class31.field481 && arg6 <= class9.field173 && arg4 >= class31.field481 && class9.field173 >= arg4 && class188.field3398 <= arg0 && arg0 <= class239.field4321 && class188.field3398 <= arg1 && arg1 <= class239.field4321 && arg3 >= class188.field3398 && class239.field4321 >= arg3 && class188.field3398 <= arg8 && class239.field4321 >= arg8) {
            class173.method1134(arg4, arg1, arg6, arg2, arg5, arg8, arg3, arg7, (byte) -128, arg0);
        } else {
            class169.method1109(arg2, arg7, arg8, 32017, arg0, arg4, arg1, arg3, arg6, arg5);
        }
        if (arg9) {
            field3621++;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
    public static void method1346(boolean arg0) {
        field3616 = null;
        if (!arg0) {
            field3611 = null;
        }
        field3611 = null;
        field3620 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZI)I")
    public static final int method1347(int arg0, boolean arg1, int arg2) {
        int var3 = class265.method1767(arg0 + 91923, arg2 + 45365, 4, (byte) -39) - (-(class265.method1767(arg0 + 37821, arg2 + 10294, 2, (byte) -39) + -128 >> 1) + -(class265.method1767(arg0, arg2, 1, (byte) -39) + -128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (!arg1) {
            method1343(-33, (byte) 2);
        }
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        field3612++;
        return var4;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
    public static final void method1348(byte arg0) {
        class285.field5010.method799(103, 103);
        class137.field2406++;
        class285.field5010.method1243(0L, 88);
        field3615++;
        if (arg0 >= -9) {
            field3616 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V")
    public static final void method1349(byte arg0) {
        field3617++;
        if (class83.field1504 == 0) {
            return;
        }
        try {
            if ((++class249.field4488) > 2000) {
                if (class17.field298 != null) {
                    class17.field298.method1682(1);
                    class17.field298 = null;
                }
                if (class4.field63 >= 1) {
                    class83.field1504 = 0;
                    class262.field4678 = -5;
                    return;
                }
                if (class92.field1656 == class266.field4778) {
                    class266.field4778 = class209.field3843;
                } else {
                    class266.field4778 = class92.field1656;
                }
                class83.field1504 = 1;
                class249.field4488 = 0;
                class4.field63++;
            }
            if (class83.field1504 == 1) {
                class126.field2233 = class4.field62.method461(class229.field4194, class266.field4778, (byte) -46);
                class83.field1504 = 2;
            }
            if (arg0 != 29) {
                field3611 = null;
            }
            if (class83.field1504 == 2) {
                if (class126.field2233.field3241 == 2) {
                    throw new IOException();
                }
                if (class126.field2233.field3241 != 1) {
                    return;
                }
                class17.field298 = new class255((Socket) class126.field2233.field3239, class4.field62);
                class126.field2233 = null;
                class17.field298.method1685(class285.field5010.field3465, class285.field5010.field3487, false, 0);
                if (class185.field3366 != null) {
                    class185.field3366.method1647(0);
                }
                if (class231.field4232 != null) {
                    class231.field4232.method1647(arg0 - 29);
                }
                int var1 = class17.field298.method1679(false);
                if (class185.field3366 != null) {
                    class185.field3366.method1647(0);
                }
                if (class231.field4232 != null) {
                    class231.field4232.method1647(0);
                }
                if (var1 != 21) {
                    class83.field1504 = 0;
                    class262.field4678 = var1;
                    class17.field298.method1682(1);
                    class17.field298 = null;
                    return;
                }
                class83.field1504 = 3;
            }
            if (class83.field1504 == 3) {
                if (class17.field298.method1681((byte) -123) < 1) {
                    return;
                }
                class85.field1565 = new class143[class17.field298.method1679(false)];
                class83.field1504 = 4;
            }
            if (class83.field1504 == 4 && class17.field298.method1681((byte) -121) >= (class85.field1565.length * 8)) {
                class161.field2902.field3487 = 0;
                class17.field298.method1684(class85.field1565.length * 8, arg0 - 136, 0, class161.field2902.field3465);
                for (int var2 = 0; var2 < class85.field1565.length; var2++) {
                    class85.field1565[var2] = class64.method364((byte) 97, class161.field2902.method1267((byte) 111));
                }
                class83.field1504 = 0;
                class262.field4678 = 21;
                class17.field298.method1682(1);
                class17.field298 = null;
            }
        } catch (IOException var3) {
            if (class17.field298 != null) {
                class17.field298.method1682(1);
                class17.field298 = null;
            }
            if (class4.field63 < 1) {
                class249.field4488 = 0;
                if (class92.field1656 == class266.field4778) {
                    class266.field4778 = class209.field3843;
                } else {
                    class266.field4778 = class92.field1656;
                }
                class83.field1504 = 1;
                class4.field63++;
            } else {
                class83.field1504 = 0;
                class262.field4678 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(IIII)V")
    public class195(int arg0, int arg1, int arg2, int arg3) {
        class263 var5 = class48.method293(arg0, (byte) 105);
        this.field3627 = arg3;
        this.field3610 = arg1;
        this.field3624 = arg2;
        if (var5.field4740 == -1) {
            this.field3626 = var5;
        } else {
            this.field3626 = class48.method293(var5.field4740, (byte) 93);
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lqh;III)V")
    public class195(class263 arg0, int arg1, int arg2, int arg3) {
        this.field3626 = arg0;
        this.field3610 = arg1;
        this.field3624 = arg2;
        this.field3627 = arg3;
    }
}
