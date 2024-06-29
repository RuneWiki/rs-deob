import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class252 {

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public int field4141 = 0;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "Z")
    private boolean field4140 = false;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
    public int field4149 = 0;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field4144 = 0;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "Z")
    public static boolean field4143 = true;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "[I")
    public static int[] field4146 = new int[128];

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public int field4131;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public int field4132;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public int field4133;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public int field4135;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    private int field4138;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public int field4145;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    public int field4147;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
    public int field4151;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "I")
    public int field4152;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "I")
    public int field4153;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "J")
    public long field4134;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Loe;I)V", line = 7)
    public final void method1774(class146 arg0, int arg1) {
        field4150++;
        if (arg1 < 52) {
            this.field4140 = false;
        }
        while (true) {
            int var3 = arg0.method1005((byte) 122);
            if (var3 == 0) {
                return;
            }
            this.method1776((byte) -97, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "([BIIB)Z", line = 38)
    public static final boolean method1775(byte[] arg0, int arg1, int arg2, byte arg3) {
        class146 var4 = new class146(arg0);
        boolean var5 = true;
        field4137++;
        int var6 = -1;
        label60: while (true) {
            int var7 = var4.method1016((byte) 126);
            if (var7 == 0) {
                if (arg3 >= -84) {
                    method1775((byte[]) null, 95, -49, (byte) -82);
                }
                return var5;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var4.method1020(true);
                    if (var11 == 0) {
                        continue label60;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var4.method1005((byte) 122) >> 2;
                    int var15 = arg1 + var13;
                    int var16 = arg2 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class238 var17 = class1.method7(var6, 25);
                        if (var14 != 22 || class349.field5590 || var17.field3931 != 0 || var17.field3930 == 1 || var17.field3918) {
                            if (!var17.method1652(17504)) {
                                var5 = false;
                                class52.field1044++;
                            }
                            var9 = true;
                        }
                    }
                }
                int var10 = var4.method1020(true);
                if (var10 == 0) {
                    break;
                }
                var4.method1005((byte) 122);
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BLoe;I)V", line = 124)
    private final void method1776(byte arg0, class146 arg1, int arg2) {
        field4139++;
        if (arg2 == 1) {
            this.field4138 = arg1.method989(75);
        } else if (arg2 == 2) {
            arg1.method1005((byte) 122);
        } else if (arg2 == 3) {
            this.field4145 = arg1.method1004(3);
            this.field4133 = arg1.method1004(3);
            this.field4151 = arg1.method1004(3);
        } else if (arg2 == 4) {
            this.field4152 = arg1.method1005((byte) 122);
            this.field4147 = arg1.method1004(3);
        } else if (arg2 == 6) {
            this.field4135 = arg1.method1005((byte) 122);
        } else if (arg2 == 8) {
            this.field4149 = 1;
        } else if (arg2 == 9) {
            this.field4141 = 1;
        } else if (arg2 == 10) {
            this.field4140 = true;
        }
        if (arg0 != -97) {
            this.field4147 = -105;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V", line = 184)
    public static void method1777(int arg0) {
        if (arg0 != -13376) {
            field4144 = -113;
        }
        field4146 = null;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V", line = 197)
    public final void method1778(int arg0) {
        field4148++;
        if (arg0 != -863) {
            this.field4134 = -116L;
        }
        this.field4131 = class305.field4957[this.field4138];
        this.field4132 = (int) Math.sqrt((double) (this.field4151 * this.field4151 + this.field4145 * this.field4145 + this.field4133 * this.field4133));
        if (this.field4147 == 0) {
            this.field4147 = 1;
        }
        if (this.field4152 == 0) {
            this.field4134 = 2147483647L;
        } else if (this.field4152 == 1) {
            this.field4134 = (long) (this.field4132 * 8 / this.field4147);
            this.field4134 *= this.field4134;
        } else if (this.field4152 == 2) {
            this.field4134 = (long) (this.field4132 * 8 / this.field4147);
        }
        if (this.field4140) {
            this.field4132 *= -1;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)I", line = 232)
    public static final int method1779(int arg0, int arg1) {
        field4142++;
        class335 var2 = class119.method868(arg1, (byte) -117);
        int var3 = var2.field5329;
        int var4 = var2.field5334;
        if (arg0 == -6741) {
            int var5 = var2.field5337;
            int var6 = class238.field3970[var5 - var4];
            return class334.field5322[var3] >> var4 & var6;
        } else {
            return -122;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)Lwa;", line = 253)
    public static final class94 method1780(int arg0, int arg1, int arg2) {
        class312 var3 = class353.field5644[arg0][arg1][arg2];
        return var3 == null || var3.field5092 == null ? null : var3.field5092;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZIIIIIIIZII)V", line = 263)
    public static final void method1781(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11) {
        if (!arg1) {
            method1780(-120, -39, -122);
        }
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class92.field1638[var12][var13] = 0;
                class311.field5066[var12][var13] = 99999999;
            }
        }
        class92.field1638[arg2][arg10] = 99;
        class311.field5066[arg2][arg10] = 0;
        field4136++;
        int var14 = arg2;
        byte var15 = 0;
        int var16 = arg10;
        int var17 = 0;
        boolean var18 = false;
        class145.field2433[var15] = arg2;
        int var37 = var15 + 1;
        class316.field5135[var15] = arg10;
        int[][] var19 = class23.field576[class276.field4506].field4451;
        label337: while (var37 != var17) {
            var16 = class316.field5135[var17];
            var14 = class145.field2433[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg3 == var14 && arg6 == var16) {
                var18 = true;
                break;
            }
            if (arg8 != 0) {
                if ((arg8 < 5 || arg8 == 10) && class23.field576[class276.field4506].method1927(arg6, arg7, arg3, var16, var14, arg8 - 1, arg11, (byte) 103)) {
                    var18 = true;
                    break;
                }
                if (arg8 < 10 && class23.field576[class276.field4506].method1945(arg3, arg7, var16, 16777216, arg8 - 1, arg6, var14, arg11)) {
                    var18 = true;
                    break;
                }
            }
            if (arg0 != 0 && arg5 != 0 && class23.field576[class276.field4506].method1931(var14, arg0, var16, arg4, arg6, arg11, arg5, arg3, -1)) {
                var18 = true;
                break;
            }
            int var20 = class311.field5066[var14][var16] + 1;
            if (var14 > 0 && class92.field1638[var14 - 1][var16] == 0 && (var19[var14 - 1][var16] & 0x2C010E) == 0 && (var19[var14 - 1][arg11 + var16 - 1] & 0x2C0138) == 0) {
                int var21 = 1;
                while (true) {
                    if (var21 >= (arg11 - 1)) {
                        class145.field2433[var37] = var14 - 1;
                        class316.field5135[var37] = var16;
                        class92.field1638[var14 - 1][var16] = 2;
                        var37 = var37 + 1 & 0xFFF;
                        class311.field5066[var14 - 1][var16] = var20;
                        break;
                    }
                    if ((var19[var14 - 1][var16 + var21] & 0x2C013E) != 0) {
                        break;
                    }
                    var21++;
                }
            }
            if (var14 < 102 && class92.field1638[var14 + 1][var16] == 0 && (var19[arg11 + var14][var16] & 0x2C0183) == 0 && (var19[arg11 + var14][var16 + arg11 - 1] & 0x2C01E0) == 0) {
                int var22 = 1;
                while (true) {
                    if (var22 >= arg11 - 1) {
                        class145.field2433[var37] = var14 + 1;
                        class316.field5135[var37] = var16;
                        var37 = var37 + 1 & 0xFFF;
                        class92.field1638[var14 + 1][var16] = 8;
                        class311.field5066[var14 + 1][var16] = var20;
                        break;
                    }
                    if ((var19[arg11 + var14][var16 + var22] & 0x2C01E3) != 0) {
                        break;
                    }
                    var22++;
                }
            }
            if (var16 > 0 && class92.field1638[var14][var16 - 1] == 0 && (var19[var14][var16 - 1] & 0x2C010E) == 0 && (var19[arg11 + var14 - 1][var16 - 1] & 0x2C0183) == 0) {
                int var23 = 1;
                while (true) {
                    if ((arg11 - 1) <= var23) {
                        class145.field2433[var37] = var14;
                        class316.field5135[var37] = var16 - 1;
                        class92.field1638[var14][var16 - 1] = 1;
                        class311.field5066[var14][var16 - 1] = var20;
                        var37 = var37 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[var14 + var23][var16 - 1] & 0x2C018F) != 0) {
                        break;
                    }
                    var23++;
                }
            }
            if (var16 < 102 && class92.field1638[var14][var16 + 1] == 0 && (var19[var14][arg11 + var16] & 0x2C0138) == 0 && (var19[arg11 + var14 - 1][arg11 + var16] & 0x2C01E0) == 0) {
                int var24 = 1;
                while (true) {
                    if (var24 >= arg11 - 1) {
                        class145.field2433[var37] = var14;
                        class316.field5135[var37] = var16 + 1;
                        var37 = var37 + 1 & 0xFFF;
                        class92.field1638[var14][var16 + 1] = 4;
                        class311.field5066[var14][var16 + 1] = var20;
                        break;
                    }
                    if ((var19[var14 + var24][arg11 + var16] & 0x2C01F8) != 0) {
                        break;
                    }
                    var24++;
                }
            }
            if (var14 > 0 && var16 > 0 && class92.field1638[var14 - 1][var16 - 1] == 0 && (var19[var14 - 1][var16 - 1] & 0x2C010E) == 0) {
                int var25 = 1;
                while (true) {
                    if (arg11 <= var25) {
                        class145.field2433[var37] = var14 - 1;
                        class316.field5135[var37] = var16 - 1;
                        class92.field1638[var14 - 1][var16 - 1] = 3;
                        var37 = var37 + 1 & 0xFFF;
                        class311.field5066[var14 - 1][var16 - 1] = var20;
                        break;
                    }
                    if ((var19[var14 - 1][var16 + var25 - 1] & 0x2C013E) != 0 || (var19[var25 + var14 - 1][var16 - 1] & 0x2C018F) != 0) {
                        break;
                    }
                    var25++;
                }
            }
            if (var14 < 102 && var16 > 0 && class92.field1638[var14 + 1][var16 - 1] == 0 && (var19[var14 + arg11][var16 - 1] & 0x2C0183) == 0) {
                int var26 = 1;
                while (true) {
                    if (arg11 <= var26) {
                        class145.field2433[var37] = var14 + 1;
                        class316.field5135[var37] = var16 - 1;
                        class92.field1638[var14 + 1][var16 - 1] = 9;
                        class311.field5066[var14 + 1][var16 - 1] = var20;
                        var37 = var37 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[arg11 + var14][var16 + var26 - 1] & 0x2C01E3) != 0 || (var19[var14 + var26][var16 - 1] & 0x2C018F) != 0) {
                        break;
                    }
                    var26++;
                }
            }
            if (var14 > 0 && var16 < 102 && class92.field1638[var14 - 1][var16 + 1] == 0 && (var19[var14 - 1][var16 + arg11] & 0x2C0138) == 0) {
                int var27 = 1;
                while (true) {
                    if (arg11 <= var27) {
                        class145.field2433[var37] = var14 - 1;
                        class316.field5135[var37] = var16 + 1;
                        var37 = var37 + 1 & 0xFFF;
                        class92.field1638[var14 - 1][var16 + 1] = 6;
                        class311.field5066[var14 - 1][var16 + 1] = var20;
                        break;
                    }
                    if ((var19[var14 - 1][var16 + var27] & 0x2C013E) != 0 || (var19[var14 + var27 - 1][arg11 + var16] & 0x2C01F8) != 0) {
                        break;
                    }
                    var27++;
                }
            }
            if (var14 < 102 && var16 < 102 && class92.field1638[var14 + 1][var16 + 1] == 0 && (var19[arg11 + var14][arg11 + var16] & 0x2C01E0) == 0) {
                for (int var28 = 1; var28 < arg11; var28++) {
                    if ((var19[var14 + var28][arg11 + var16] & 0x2C01F8) != 0 || (var19[var14 + arg11][var16 + var28] & 0x2C01E3) != 0) {
                        continue label337;
                    }
                }
                class145.field2433[var37] = var14 + 1;
                class316.field5135[var37] = var16 + 1;
                var37 = var37 + 1 & 0xFFF;
                class92.field1638[var14 + 1][var16 + 1] = 12;
                class311.field5066[var14 + 1][var16 + 1] = var20;
            }
        }
        if (!var18) {
            if (!arg9) {
                return;
            }
            int var29 = 1000;
            int var30 = 100;
            byte var31 = 10;
            for (int var32 = arg3 - var31; var32 <= arg3 + var31; var32++) {
                for (int var33 = arg6 - var31; var33 <= (arg6 + var31); var33++) {
                    if (var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104 && class311.field5066[var32][var33] < 100) {
                        int var34 = 0;
                        if (arg3 > var32) {
                            var34 = arg3 - var32;
                        } else if (arg3 + arg0 - 1 < var32) {
                            var34 = var32 - (arg0 + arg3 - 1);
                        }
                        int var35 = 0;
                        if (var33 < arg6) {
                            var35 = arg6 - var33;
                        } else if (var33 > (arg6 + arg5 - 1)) {
                            var35 = var33 + 1 - arg6 - arg5;
                        }
                        int var36 = var34 * var34 + var35 * var35;
                        if (var36 < var29 || var29 == var36 && class311.field5066[var32][var33] < var30) {
                            var30 = class311.field5066[var32][var33];
                            var14 = var32;
                            var16 = var33;
                            var29 = var36;
                        }
                    }
                }
            }
            if (var29 == 1000) {
                return;
            }
            if (arg2 == var14 && arg10 == var16) {
                return;
            }
        }
        class284.field4641 = var16;
        class92.field1637 = var14;
        class275.field4492 = false;
    }
}
