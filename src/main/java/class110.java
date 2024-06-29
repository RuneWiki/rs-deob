import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class110 {

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "F")
    public float field1676 = 1.0F;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "F")
    public float field1678 = 0.25F;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "F")
    public float field1677 = 1.0F;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public int field1680;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
    public int field1690;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "F")
    public float field1689;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
    public int field1694;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public int field1679;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public int field1675;

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
    public int field1695;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "F")
    public float field1684;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "F")
    public float field1685;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "Lwm;")
    public class96 field1692;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public static int field1681 = 0;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "[Lsd;")
    public static class244[] field1683 = new class244[32768];

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "Z")
    public static boolean field1686 = true;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "Lclient;")
    public static client field1674;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIIIIIIIZ)V", line = 13)
    public static final void method954(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class335.field5123[var12][var13] = 0;
                class321.field4947[var12][var13] = 99999999;
            }
        }
        int var14 = arg9;
        int var15 = arg3;
        field1691++;
        byte var16 = 0;
        if (arg1 != 2884064) {
            field1681 = 53;
        }
        class335.field5123[arg9][arg3] = 99;
        class321.field4947[arg9][arg3] = 0;
        class274.field4253[var16] = arg9;
        int var37 = var16 + 1;
        class89.field1270[var16] = arg3;
        boolean var17 = false;
        int var18 = 0;
        int[][] var19 = class57.field905[class119.field1826].field4520;
        label338: while (var37 != var18) {
            var14 = class274.field4253[var18];
            var15 = class89.field1270[var18];
            var18 = var18 + 1 & 0xFFF;
            if (arg7 == var14 && arg0 == var15) {
                var17 = true;
                break;
            }
            if (arg4 != 0) {
                if ((arg4 < 5 || arg4 == 10) && class57.field905[class119.field1826].method2102(arg0, arg4 - 1, arg6, var14, var15, arg7, (byte) -128, arg5)) {
                    var17 = true;
                    break;
                }
                if (arg4 < 10 && class57.field905[class119.field1826].method2093(arg7, arg4 - 1, arg5, var15, arg0, var14, arg6, arg1 ^ 0x2C01E1)) {
                    var17 = true;
                    break;
                }
            }
            if (arg10 != 0 && arg2 != 0 && class57.field905[class119.field1826].method2095(arg10, arg2, var15, var14, arg6, arg1 - 2884158, arg0, arg7, arg8)) {
                var17 = true;
                break;
            }
            int var20 = class321.field4947[var14][var15] + 1;
            if (var14 > 0 && class335.field5123[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x2C010E) == 0 && (var19[var14 - 1][var15 + arg6 - 1] & 0x2C0138) == 0) {
                int var21 = 1;
                while (true) {
                    if (var21 >= arg6 - 1) {
                        class274.field4253[var37] = var14 - 1;
                        class89.field1270[var37] = var15;
                        var37 = var37 + 1 & 0xFFF;
                        class335.field5123[var14 - 1][var15] = 2;
                        class321.field4947[var14 - 1][var15] = var20;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var21] & 0x2C013E) != 0) {
                        break;
                    }
                    var21++;
                }
            }
            if (var14 < 102 && class335.field5123[var14 + 1][var15] == 0 && (var19[arg6 + var14][var15] & 0x2C0183) == 0 && (var19[var14 + arg6][arg6 + var15 - 1] & 0x2C01E0) == 0) {
                int var22 = 1;
                while (true) {
                    if (arg6 - 1 <= var22) {
                        class274.field4253[var37] = var14 + 1;
                        class89.field1270[var37] = var15;
                        var37 = var37 + 1 & 0xFFF;
                        class335.field5123[var14 + 1][var15] = 8;
                        class321.field4947[var14 + 1][var15] = var20;
                        break;
                    }
                    if ((var19[arg6 + var14][var15 + var22] & 0x2C01E3) != 0) {
                        break;
                    }
                    var22++;
                }
            }
            if (var15 > 0 && class335.field5123[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x2C010E) == 0 && (var19[arg6 + var14 - 1][var15 - 1] & 0x2C0183) == 0) {
                int var23 = 1;
                while (true) {
                    if ((arg6 - 1) <= var23) {
                        class274.field4253[var37] = var14;
                        class89.field1270[var37] = var15 - 1;
                        var37 = var37 + 1 & 0xFFF;
                        class335.field5123[var14][var15 - 1] = 1;
                        class321.field4947[var14][var15 - 1] = var20;
                        break;
                    }
                    if ((var19[var14 + var23][var15 - 1] & 0x2C018F) != 0) {
                        break;
                    }
                    var23++;
                }
            }
            if (var15 < 102 && class335.field5123[var14][var15 + 1] == 0 && (var19[var14][var15 + arg6] & 0x2C0138) == 0 && (var19[var14 + arg6 - 1][var15 + arg6] & 0x2C01E0) == 0) {
                int var24 = 1;
                while (true) {
                    if (var24 >= arg6 - 1) {
                        class274.field4253[var37] = var14;
                        class89.field1270[var37] = var15 + 1;
                        class335.field5123[var14][var15 + 1] = 4;
                        class321.field4947[var14][var15 + 1] = var20;
                        var37 = var37 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[var14 + var24][var15 + arg6] & 0x2C01F8) != 0) {
                        break;
                    }
                    var24++;
                }
            }
            if (var14 > 0 && var15 > 0 && class335.field5123[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15 - 1] & 0x2C010E) == 0) {
                int var25 = 1;
                while (true) {
                    if (var25 >= arg6) {
                        class274.field4253[var37] = var14 - 1;
                        class89.field1270[var37] = var15 - 1;
                        class335.field5123[var14 - 1][var15 - 1] = 3;
                        class321.field4947[var14 - 1][var15 - 1] = var20;
                        var37 = var37 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var25 - 1] & 0x2C013E) != 0 || (var19[var14 + var25 - 1][var15 - 1] & 0x2C018F) != 0) {
                        break;
                    }
                    var25++;
                }
            }
            if (var14 < 102 && var15 > 0 && class335.field5123[var14 + 1][var15 - 1] == 0 && (var19[arg6 + var14][var15 - 1] & 0x2C0183) == 0) {
                int var26 = 1;
                while (true) {
                    if (arg6 <= var26) {
                        class274.field4253[var37] = var14 + 1;
                        class89.field1270[var37] = var15 - 1;
                        class335.field5123[var14 + 1][var15 - 1] = 9;
                        var37 = var37 + 1 & 0xFFF;
                        class321.field4947[var14 + 1][var15 - 1] = var20;
                        break;
                    }
                    if ((var19[arg6 + var14][var15 + var26 - 1] & 0x2C01E3) != 0 || (var19[var14 + var26][var15 - 1] & 0x2C018F) != 0) {
                        break;
                    }
                    var26++;
                }
            }
            if (var14 > 0 && var15 < 102 && class335.field5123[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][arg6 + var15] & 0x2C0138) == 0) {
                int var27 = 1;
                while (true) {
                    if (arg6 <= var27) {
                        class274.field4253[var37] = var14 - 1;
                        class89.field1270[var37] = var15 + 1;
                        class335.field5123[var14 - 1][var15 + 1] = 6;
                        class321.field4947[var14 - 1][var15 + 1] = var20;
                        var37 = var37 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var27] & 0x2C013E) != 0 || (var19[var14 + var27 - 1][arg6 + var15] & 0x2C01F8) != 0) {
                        break;
                    }
                    var27++;
                }
            }
            if (var14 < 102 && var15 < 102 && class335.field5123[var14 + 1][var15 + 1] == 0 && (var19[arg6 + var14][arg6 + var15] & 0x2C01E0) == 0) {
                for (int var28 = 1; var28 < arg6; var28++) {
                    if ((var19[var14 + var28][arg6 + var15] & 0x2C01F8) != 0 || (var19[arg6 + var14][var15 + var28] & 0x2C01E3) != 0) {
                        continue label338;
                    }
                }
                class274.field4253[var37] = var14 + 1;
                class89.field1270[var37] = var15 + 1;
                var37 = var37 + 1 & 0xFFF;
                class335.field5123[var14 + 1][var15 + 1] = 12;
                class321.field4947[var14 + 1][var15 + 1] = var20;
            }
        }
        if (!var17) {
            if (!arg11) {
                return;
            }
            int var29 = 1000;
            int var30 = 100;
            byte var31 = 10;
            for (int var32 = arg7 - var31; var32 <= arg7 + var31; var32++) {
                for (int var33 = arg0 - var31; var33 <= (arg0 + var31); var33++) {
                    if (var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104 && class321.field4947[var32][var33] < 100) {
                        int var34 = 0;
                        if (var32 < arg7) {
                            var34 = arg7 - var32;
                        } else if (arg7 + arg10 - 1 < var32) {
                            var34 = var32 + 1 - arg7 - arg10;
                        }
                        int var35 = 0;
                        if (arg0 > var33) {
                            var35 = arg0 - var33;
                        } else if (arg0 - (1 - arg2) < var33) {
                            var35 = var33 + 1 - arg0 - arg2;
                        }
                        int var36 = var34 * var34 + var35 * var35;
                        if (var29 > var36 || var29 == var36 && var30 > class321.field4947[var32][var33]) {
                            var15 = var33;
                            var14 = var32;
                            var30 = class321.field4947[var32][var33];
                            var29 = var36;
                        }
                    }
                }
            }
            if (var29 == 1000) {
                return;
            }
            if (arg9 == var14 && arg3 == var15) {
                return;
            }
        }
        class278.field4291 = var15;
        class29.field472 = false;
        class266.field4126 = var14;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V", line = 511)
    public class110() {
        this.field1680 = -50;
        this.field1690 = 0;
        this.field1689 = 1.2F;
        this.field1694 = class103.field1551;
        this.field1679 = -60;
        this.field1675 = -50;
        this.field1695 = class103.field1545;
        this.field1684 = 0.69921875F;
        this.field1685 = 1.1523438F;
        if (class305.field4741 != null) {
            this.field1692 = class96.method845(class305.field4741[0], class305.field4741[1], class305.field4741[2], class305.field4741[3], class305.field4741[4], class305.field4741[5]);
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lug;)V", line = 530)
    public class110(class25 arg0) {
        int var2 = arg0.method281(108);
        if ((var2 & 0x1) == 0) {
            this.field1694 = class103.field1551;
        } else {
            this.field1694 = arg0.method262((byte) 89);
        }
        if ((var2 & 0x2) == 0) {
            this.field1685 = 1.1523438F;
        } else {
            this.field1685 = (float) arg0.method314((byte) 40) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field1684 = 0.69921875F;
        } else {
            this.field1684 = (float) arg0.method314((byte) 101) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field1689 = 1.2F;
        } else {
            this.field1689 = (float) arg0.method314((byte) 51) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field1675 = -50;
            this.field1680 = -50;
            this.field1679 = -60;
        } else {
            this.field1675 = arg0.method296(-81);
            this.field1679 = arg0.method296(-108);
            this.field1680 = arg0.method296(-74);
        }
        if ((var2 & 0x20) == 0) {
            this.field1695 = class103.field1545;
        } else {
            this.field1695 = arg0.method262((byte) 26);
        }
        if ((var2 & 0x40) == 0) {
            this.field1690 = 0;
        } else {
            this.field1690 = arg0.method314((byte) 89);
        }
        if ((var2 & 0x80) != 0) {
            this.field1692 = class96.method845(arg0.method314((byte) 37), arg0.method314((byte) 75), arg0.method314((byte) 124), arg0.method314((byte) 55), arg0.method314((byte) 34), arg0.method314((byte) 59));
        } else if (class305.field4741 != null) {
            this.field1692 = class96.method845(class305.field4741[0], class305.field4741[1], class305.field4741[2], class305.field4741[3], class305.field4741[4], class305.field4741[5]);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)I", line = 445)
    public static final int method955(int arg0) {
        field1682++;
        return ~class14.field233 == arg0 ? 0 : class138.field2284[class14.field233].method230();
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLug;)V", line = 480)
    public final void method956(byte arg0, class25 arg1) {
        this.field1677 = (float) (arg1.method281(-127) * 8) / 255.0F;
        field1687++;
        this.field1678 = (float) (arg1.method281(34) * 8) / 255.0F;
        if (arg0 != 106) {
            field1681 = -79;
        }
        this.field1676 = (float) (arg1.method281(79) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V", line = 497)
    public static void method957(byte arg0) {
        field1674 = null;
        if (arg0 < -107) {
            field1683 = null;
        }
    }
}
