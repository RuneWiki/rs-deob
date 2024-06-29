import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class233 {

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "Lgi;")
    private class153 field4035 = new class153();

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "Lp;")
    private class272 field4044 = new class272();

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
    private int field4043;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
    private int field4042;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "Lge;")
    private class69 field4045;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "Lpj;")
    private static class237 field4034 = class33.method353("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", 60);

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "Lpj;")
    public static class237 field4039 = class33.method353("details", 87);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "Lpj;")
    public static class237 field4026 = field4034;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "Lpj;")
    private static class237 field4037 = class33.method353("Loaded fonts", 32);

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "Lpj;")
    public static class237 field4038 = field4037;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "Lpj;")
    private static class237 field4036 = class33.method353("Your ignore list is full)3 Max of 100 users)3", 60);

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "Lpj;")
    public static class237 field4032 = field4036;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "[I")
    public static int[] field4029;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static void method1545(int arg0) {
        field4039 = null;
        field4032 = null;
        field4026 = null;
        field4037 = null;
        field4034 = null;
        field4038 = null;
        if (arg0 >= -49) {
            method1551((class254) null, -24, 27, 64, -83, -49, 113, -13, true);
        }
        field4036 = null;
        field4029 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIILqe;IJIIII)Z")
    public static final boolean method1546(int arg0, int arg1, int arg2, int arg3, class95 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class43.method416(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)Llk;")
    public final class81 method1547(boolean arg0) {
        field4031++;
        if (arg0) {
            this.method1548(false);
        }
        return this.field4045.method565(-72);
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(Z)Llk;")
    public final class81 method1548(boolean arg0) {
        field4030++;
        if (!arg0) {
            this.field4045 = null;
        }
        return this.field4045.method566(0);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(JI)Lgi;")
    public final class153 method1549(long arg0, int arg1) {
        class153 var4 = (class153) this.field4045.method568(arg0, arg1 ^ 0xFFFFDB18);
        field4040++;
        if (arg1 == 9447) {
            if (var4 != null) {
                this.field4044.method1819(-26979, var4);
            }
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public final void method1550(byte arg0) {
        this.field4044.method1814(-11430);
        this.field4045.method563((byte) -95);
        field4028++;
        this.field4035 = new class153();
        int var2 = -2 % ((37 - arg0) / 63);
        this.field4043 = this.field4042;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lof;IIIIIIIZ)V")
    public static final void method1551(class254 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class249.field4311;
        int var11;
        int var12 = var11 = (arg7 << 7) - class101.field1800;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class99.field1773[arg1][arg6][arg7] - class32.field696;
        int var18 = class99.field1773[arg1][arg6 + 1][arg7] - class32.field696;
        int var19 = class99.field1773[arg1][arg6 + 1][arg7 + 1] - class32.field696;
        int var20 = class99.field1773[arg1][arg6][arg7 + 1] - class32.field696;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class150.field2664;
        int var46 = (var24 << 9) / var25 + class150.field2669;
        int var47 = (var27 << 9) / var31 + class150.field2664;
        int var48 = (var30 << 9) / var31 + class150.field2669;
        int var49 = (var33 << 9) / var37 + class150.field2664;
        int var50 = (var36 << 9) / var37 + class150.field2669;
        int var51 = (var39 << 9) / var43 + class150.field2664;
        int var52 = (var42 << 9) / var43 + class150.field2669;
        class150.field2672 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class247.field4304 && class190.method1287(class8.field152 + class150.field2664, class227.field3886 + class150.field2669, var50, var52, var48, var49, var51, var47)) {
                class23.field428 = arg6;
                class129.field2260 = arg7;
            }
            if (!arg8) {
                class150.field2667 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class150.field2678 || var51 > class150.field2678 || var47 > class150.field2678) {
                    class150.field2667 = true;
                }
                if (arg0.field4365 == -1) {
                    if (arg0.field4360 != 12345678) {
                        class150.method1015(var50, var52, var48, var49, var51, var47, arg0.field4360, arg0.field4361, arg0.field4366);
                    }
                } else if (!class59.field1207) {
                    int var53 = class150.field2674.method80((byte) -122, arg0.field4365);
                    class150.method1015(var50, var52, var48, var49, var51, var47, class47.method438(var53, arg0.field4360), class47.method438(var53, arg0.field4361), class47.method438(var53, arg0.field4366));
                } else if (arg0.field4364) {
                    class150.method1029(var50, var52, var48, var49, var51, var47, arg0.field4360, arg0.field4361, arg0.field4366, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field4365);
                } else {
                    class150.method1029(var50, var52, var48, var49, var51, var47, arg0.field4360, arg0.field4361, arg0.field4366, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field4365);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class247.field4304 && class190.method1287(class8.field152 + class150.field2664, class227.field3886 + class150.field2669, var46, var48, var52, var45, var47, var51)) {
            class23.field428 = arg6;
            class129.field2260 = arg7;
        }
        if (arg8) {
            return;
        }
        class150.field2667 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class150.field2678 || var47 > class150.field2678 || var51 > class150.field2678) {
            class150.field2667 = true;
        }
        if (arg0.field4365 != -1) {
            if (class59.field1207) {
                class150.method1029(var46, var48, var52, var45, var47, var51, arg0.field4370, arg0.field4366, arg0.field4361, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field4365);
                return;
            }
            int var54 = class150.field2674.method80((byte) -85, arg0.field4365);
            class150.method1015(var46, var48, var52, var45, var47, var51, class47.method438(var54, arg0.field4370), class47.method438(var54, arg0.field4366), class47.method438(var54, arg0.field4361));
        } else if (arg0.field4370 != 12345678) {
            class150.method1015(var46, var48, var52, var45, var47, var51, arg0.field4370, arg0.field4366, arg0.field4361);
            return;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLgi;J)V")
    public final void method1552(byte arg0, class153 arg1, long arg2) {
        field4027++;
        if (this.field4043 == 0) {
            class153 var5 = this.field4044.method1815(-105);
            var5.method629(0);
            var5.method1053((byte) 51);
            if (this.field4035 == var5) {
                class153 var6 = this.field4044.method1815(-117);
                var6.method629(0);
                var6.method1053((byte) 52);
            }
        } else {
            this.field4043--;
        }
        this.field4045.method562(arg1, arg2, (byte) 56);
        if (arg0 >= -53) {
            field4034 = null;
        }
        this.field4044.method1819(-26979, arg1);
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(I)V")
    public class233(int arg0) {
        this.field4043 = arg0;
        this.field4042 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field4045 = new class69(var2);
    }
}
