import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class13 extends class28 {

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "I")
    private final int field102;

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
    private final int field100;

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "I")
    private final int field105;

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "I")
    private final int field101;

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "S")
    public static short field95 = 256;

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "S")
    public static short field98 = 205;

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "Lhi;")
    public static class82 field104 = class95.method664((byte) -114, "(U(Y");

    @OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(III)V", line = 9)
    public final void method24(int arg0, int arg1, int arg2) {
        field103++;
        int var4 = this.field102 * arg1 >> 12;
        if (arg2 == 0) {
            int var5 = this.field105 * arg1 >> 12;
            int var6 = this.field100 * arg0 >> 12;
            int var7 = this.field101 * arg0 >> 12;
            class39.method305(var6, this.field373, var7, var5, 16, var4);
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(IIIIIII)V", line = 27)
    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field102 = arg2;
        this.field100 = arg3;
        this.field105 = arg0;
        this.field101 = arg1;
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(III)V", line = 43)
    public final void method26(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            field96++;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)[B", line = 59)
    public static final byte[] method73(int arg0, int arg1) {
        int var2 = 8 / ((arg1 + 1) / 62);
        field97++;
        class183 var3 = (class183) class137.field2362.method2250((long) arg0, false);
        if (var3 == null) {
            Random var4 = new Random((long) arg0);
            byte[] var5 = new byte[512];
            for (int var6 = 0; var6 < 255; var6++) {
                var5[var6] = (byte) var6;
            }
            for (int var7 = 0; var7 < 255; var7++) {
                int var8 = 255 - var7;
                int var9 = class232.method1650(var8, false, var4);
                byte var10 = var5[var9];
                var5[var9] = var5[var8];
                var5[var8] = var5[511 - var7] = var10;
            }
            var3 = new class183(var5);
            class137.field2362.method2255(var3, (long) arg0, false);
        }
        return var3.field3123;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(III)V", line = 122)
    public final void method22(int arg0, int arg1, int arg2) {
        if (arg2 < 24) {
            return;
        }
        int var4 = this.field105 * arg1 >> 12;
        field94++;
        int var5 = this.field100 * arg0 >> 12;
        int var6 = this.field102 * arg1 >> 12;
        int var7 = this.field101 * arg0 >> 12;
        class315.method2159(var5, var4, this.field370, var7, this.field368, var6, -22260, this.field373);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIIIIIIZI)Z", line = 149)
    public static final boolean method74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11, int arg12) {
        for (int var13 = arg9; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                class163.field2852[var13][var14] = 0;
                class202.field3485[var13][var14] = 99999999;
            }
        }
        int var15 = arg3;
        class163.field2852[arg3][arg8] = 99;
        class202.field3485[arg3][arg8] = 0;
        int var16 = arg8;
        byte var17 = 0;
        class286.field4809[var17] = arg3;
        field99++;
        int var18 = 0;
        int var41 = var17 + 1;
        class79.field1342[var17] = arg8;
        boolean var19 = false;
        int[][] var20 = class180.field3071[class297.field5058].field3159;
        label392: while (var41 != var18) {
            var15 = class286.field4809[var18];
            var16 = class79.field1342[var18];
            var18 = var18 + 1 & 0xFFF;
            if (arg1 == var15 && arg2 == var16) {
                var19 = true;
                break;
            }
            if (arg4 != 0) {
                if ((arg4 < 5 || arg4 == 10) && class180.field3071[class297.field5058].method1311(arg4 - 1, var16, arg1, arg10, arg6, var15, (byte) 28, arg2)) {
                    var19 = true;
                    break;
                }
                if (arg4 < 10 && class180.field3071[class297.field5058].method1316(arg6, var15, var16, arg4 - 1, arg1, arg10, -1, arg2)) {
                    var19 = true;
                    break;
                }
            }
            if (arg0 != 0 && arg12 != 0 && class180.field3071[class297.field5058].method1302(arg12, 0, arg1, var15, var16, arg0, arg2, arg6, arg5)) {
                var19 = true;
                break;
            }
            int var21 = class202.field3485[var15][var16] + 1;
            if (var15 > 0 && class163.field2852[var15 - 1][var16] == 0 && (var20[var15 - 1][var16] & 0x12C010E) == 0 && (var20[var15 - 1][var16 + arg6 - 1] & 0x12C0138) == 0) {
                int var22 = 1;
                while (true) {
                    if ((arg6 - 1) <= var22) {
                        class286.field4809[var41] = var15 - 1;
                        class79.field1342[var41] = var16;
                        var41 = var41 + 1 & 0xFFF;
                        class163.field2852[var15 - 1][var16] = 2;
                        class202.field3485[var15 - 1][var16] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var16 + var22] & 0x12C013E) != 0) {
                        break;
                    }
                    var22++;
                }
            }
            if (var15 < 102 && class163.field2852[var15 + 1][var16] == 0 && (var20[var15 + arg6][var16] & 0x12C0183) == 0 && (var20[arg6 + var15][var16 + arg6 - 1] & 0x12C01E0) == 0) {
                int var23 = 1;
                while (true) {
                    if ((arg6 - 1) <= var23) {
                        class286.field4809[var41] = var15 + 1;
                        class79.field1342[var41] = var16;
                        class163.field2852[var15 + 1][var16] = 8;
                        class202.field3485[var15 + 1][var16] = var21;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var20[arg6 + var15][var16 + var23] & 0x12C01E3) != 0) {
                        break;
                    }
                    var23++;
                }
            }
            if (var16 > 0 && class163.field2852[var15][var16 - 1] == 0 && (var20[var15][var16 - 1] & 0x12C010E) == 0 && (var20[arg6 + var15 - 1][var16 - 1] & 0x12C0183) == 0) {
                int var24 = 1;
                while (true) {
                    if (arg6 - 1 <= var24) {
                        class286.field4809[var41] = var15;
                        class79.field1342[var41] = var16 - 1;
                        class163.field2852[var15][var16 - 1] = 1;
                        class202.field3485[var15][var16 - 1] = var21;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var20[var15 + var24][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var24++;
                }
            }
            if (var16 < 102 && class163.field2852[var15][var16 + 1] == 0 && (var20[var15][arg6 + var16] & 0x12C0138) == 0 && (var20[arg6 + var15 - 1][arg6 + var16] & 0x12C01E0) == 0) {
                int var25 = 1;
                while (true) {
                    if (arg6 - 1 <= var25) {
                        class286.field4809[var41] = var15;
                        class79.field1342[var41] = var16 + 1;
                        class163.field2852[var15][var16 + 1] = 4;
                        class202.field3485[var15][var16 + 1] = var21;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var20[var15 + var25][arg6 + var16] & 0x12C01F8) != 0) {
                        break;
                    }
                    var25++;
                }
            }
            if (var15 > 0 && var16 > 0 && class163.field2852[var15 - 1][var16 - 1] == 0 && (var20[var15 - 1][var16 + arg6 - 2] & 0x12C0138) == 0 && (var20[var15 - 1][var16 - 1] & 0x12C010E) == 0 && (var20[var15 - (-arg6 + 1) - 1][var16 - 1] & 0x12C0183) == 0) {
                int var26 = 1;
                while (true) {
                    if ((arg6 - 1) <= var26) {
                        class286.field4809[var41] = var15 - 1;
                        class79.field1342[var41] = var16 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class163.field2852[var15 - 1][var16 - 1] = 3;
                        class202.field3485[var15 - 1][var16 - 1] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var16 + var26 - 1] & 0x12C013E) != 0 || (var20[var26 + var15 - 1][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var26++;
                }
            }
            if (var15 < 102 && var16 > 0 && class163.field2852[var15 + 1][var16 - 1] == 0 && (var20[var15 + 1][var16 - 1] & 0x12C010E) == 0 && (var20[var15 + arg6][var16 - 1] & 0x12C0183) == 0 && (var20[var15 + arg6][arg6 + var16 - 1 - 1] & 0x12C01E0) == 0) {
                int var27 = 1;
                while (true) {
                    if ((arg6 - 1) <= var27) {
                        class286.field4809[var41] = var15 + 1;
                        class79.field1342[var41] = var16 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class163.field2852[var15 + 1][var16 - 1] = 9;
                        class202.field3485[var15 + 1][var16 - 1] = var21;
                        break;
                    }
                    if ((var20[arg6 + var15][var16 + var27 - 1] & 0x12C01E3) != 0 || (var20[var15 + var27 + 1][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var27++;
                }
            }
            if (var15 > 0 && var16 < 102 && class163.field2852[var15 - 1][var16 + 1] == 0 && (var20[var15 - 1][var16 + 1] & 0x12C010E) == 0 && (var20[var15 - 1][arg6 + var16] & 0x12C0138) == 0 && (var20[var15][arg6 + var16] & 0x12C01E0) == 0) {
                int var28 = 1;
                while (true) {
                    if (arg6 - 1 <= var28) {
                        class286.field4809[var41] = var15 - 1;
                        class79.field1342[var41] = var16 + 1;
                        class163.field2852[var15 - 1][var16 + 1] = 6;
                        class202.field3485[var15 - 1][var16 + 1] = var21;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var20[var15 - 1][var28 + var16 + 1] & 0x12C013E) != 0 || (var20[var15 + var28 - 1][arg6 + var16] & 0x12C01F8) != 0) {
                        break;
                    }
                    var28++;
                }
            }
            if (var15 < 102 && var16 < 102 && class163.field2852[var15 + 1][var16 + 1] == 0 && (var20[var15 + 1][arg6 + var16] & 0x12C0138) == 0 && (var20[var15 + arg6][arg6 + var16] & 0x12C01E0) == 0 && (var20[arg6 + var15][var16 + 1] & 0x12C0183) == 0) {
                for (int var29 = 1; var29 < arg6 - 1; var29++) {
                    if ((var20[var15 + var29 + 1][arg6 + var16] & 0x12C01F8) != 0 || (var20[var15 + arg6][var16 - (-var29 - 1)] & 0x12C01E3) != 0) {
                        continue label392;
                    }
                }
                class286.field4809[var41] = var15 + 1;
                class79.field1342[var41] = var16 + 1;
                class163.field2852[var15 + 1][var16 + 1] = 12;
                class202.field3485[var15 + 1][var16 + 1] = var21;
                var41 = var41 + 1 & 0xFFF;
            }
        }
        class166.field2907 = 0;
        if (!var19) {
            if (!arg11) {
                return false;
            }
            int var30 = 1000;
            int var31 = 100;
            byte var32 = 10;
            for (int var33 = arg1 - var32; var33 <= arg1 + var32; var33++) {
                for (int var34 = arg2 - var32; var34 <= (arg2 + var32); var34++) {
                    if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && class202.field3485[var33][var34] < 100) {
                        int var35 = 0;
                        if (arg1 > var33) {
                            var35 = arg1 - var33;
                        } else if (var33 > (arg0 + arg1 - 1)) {
                            var35 = var33 + 1 - arg0 - arg1;
                        }
                        int var36 = 0;
                        if (arg2 > var34) {
                            var36 = arg2 - var34;
                        } else if ((arg2 + arg12 - 1) < var34) {
                            var36 = var34 + 1 - arg2 - arg12;
                        }
                        int var37 = var35 * var35 + var36 * var36;
                        if (var30 > var37 || var30 == var37 && var31 > class202.field3485[var33][var34]) {
                            var31 = class202.field3485[var33][var34];
                            var15 = var33;
                            var16 = var34;
                            var30 = var37;
                        }
                    }
                }
            }
            if (var30 == 1000) {
                return false;
            }
            if (arg3 == var15 && arg8 == var16) {
                return false;
            }
            class166.field2907 = 1;
        }
        byte var38 = 0;
        class286.field4809[var38] = var15;
        int var42 = var38 + 1;
        class79.field1342[var38] = var16;
        int var39;
        int var40 = var39 = class163.field2852[var15][var16];
        while (arg3 != var15 || arg8 != var16) {
            if (var39 != var40) {
                var39 = var40;
                class286.field4809[var42] = var15;
                class79.field1342[var42++] = var16;
            }
            if ((var40 & 0x1) != 0) {
                var16++;
            } else if ((var40 & 0x4) != 0) {
                var16--;
            }
            if ((var40 & 0x2) != 0) {
                var15++;
            } else if ((var40 & 0x8) != 0) {
                var15--;
            }
            var40 = class163.field2852[var15][var16];
        }
        if (var42 > 0) {
            class193.method1342(var42, arg7, -78);
            return true;
        } else if (arg7 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V", line = 642)
    public static void method75(int arg0) {
        field104 = null;
        if (arg0 != -1) {
            method75(109);
        }
    }
}
