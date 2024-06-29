import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class244 {

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public int field3906 = -1;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public int field3909 = -1;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public int field3911 = 0;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "Z")
    public boolean field3916 = true;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public static int field3905 = 0;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "Ljj;")
    public static class134 field3908;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "[Lle;")
    public static class220[] field3907;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "[[[Lsj;")
    public static class48[][][] field3913;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILjj;)V")
    public static final void method1601(int arg0, class134 arg1) {
        class219.field3502 = arg1;
        field3904++;
        if (arg0 != 1616169224) {
            method1606((byte) 108, 42);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static void method1602(int arg0) {
        field3913 = null;
        if (arg0 == 3) {
            field3908 = null;
            field3907 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3912++;
        if (arg5 > -113) {
            method1602(35);
        }
        if (arg3 < 1 || arg1 < 1 || arg3 > 102 || arg1 > 102) {
            return;
        }
        if (!class200.method1349(false) && (class134.field2251[0][arg3][arg1] & 0x2) == 0) {
            int var8 = arg2;
            if ((class134.field2251[arg2][arg3][arg1] & 0x8) != 0) {
                var8 = 0;
            }
            if (class109.field1891 != var8) {
                return;
            }
        }
        int var9 = arg2;
        if (arg2 < 3 && (class134.field2251[1][arg3][arg1] & 0x2) == 2) {
            var9 = arg2 + 1;
        }
        class198.method1335(arg2, arg3, arg6, -128, var9, arg1, class61.field839[arg2]);
        if (arg0 < 0) {
            return;
        }
        boolean var10 = class205.field3279;
        class205.field3279 = true;
        class150.method1021(false, arg2, arg7, arg1, false, arg3, 101, var9, arg0, arg4, class61.field839[arg2]);
        class205.field3279 = var10;
        return;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;II)V")
    public static final void method1604(String arg0, String arg1, byte arg2, String arg3, int arg4, int arg5) {
        if (arg2 >= -6) {
            method1604((String) null, (String) null, (byte) 107, (String) null, -111, 91);
        }
        for (int var6 = 99; var6 > 0; var6--) {
            class201.field3232[var6] = class201.field3232[var6 - 1];
            class157.field2522[var6] = class157.field2522[var6 - 1];
            class138.field2293[var6] = class138.field2293[var6 - 1];
            class168.field2736[var6] = class168.field2736[var6 - 1];
            class151.field2436[var6] = class151.field2436[var6 - 1];
        }
        class201.field3232[0] = arg5;
        class143.field2326 = class64.field906;
        class151.field2436[0] = arg4;
        class94.field1398++;
        field3915++;
        class157.field2522[0] = arg3;
        class138.field2293[0] = arg1;
        class168.field2736[0] = arg0;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IILhi;)V")
    public final void method1605(int arg0, int arg1, class264 arg2) {
        int var4 = -89 / ((-arg1 - 61) / 46);
        while (true) {
            int var5 = arg2.method1779(-91);
            if (var5 == 0) {
                field3902++;
                return;
            }
            this.method1607(arg2, arg0, var5, (byte) -52);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BI)I")
    public static final int method1606(byte arg0, int arg1) {
        if (arg0 != -17) {
            method1603(-123, -18, 45, 33, 18, 110, 74, 70);
        }
        field3914++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lhi;IIB)V")
    private final void method1607(class264 arg0, int arg1, int arg2, byte arg3) {
        int var5 = 95 % ((33 - arg3) / 62);
        field3917++;
        if (arg2 == 1) {
            this.field3911 = class67.method530(arg0.method1732(-25), (byte) -127);
        } else if (arg2 == 2) {
            this.field3909 = arg0.method1779(-78);
        } else if (arg2 == 3) {
            this.field3909 = arg0.method1777(-116);
            if (this.field3909 == 65535) {
                this.field3909 = -1;
                return;
            }
        } else if (arg2 == 5) {
            this.field3916 = false;
        } else if (arg2 == 7) {
            this.field3906 = class67.method530(arg0.method1732(-70), (byte) -128);
            return;
        } else if (arg2 == 8) {
            class224.field3552 = arg1;
            return;
        } else {
            if (arg2 == 9) {
                arg0.method1777(-83);
            } else if (arg2 != 10) {
                if (arg2 == 11) {
                    arg0.method1779(-97);
                    return;
                }
                if (arg2 != 12) {
                    if (arg2 == 13) {
                        arg0.method1732(-3);
                        return;
                    }
                    if (arg2 == 14) {
                        arg0.method1779(-69);
                        return;
                    }
                }
            }
            return;
        }
    }
}
