import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class181 extends class333 {

    @OriginalMember(owner = "client!no", name = "sc", descriptor = "I")
    public static int field2603 = 0;

    @OriginalMember(owner = "client!no", name = "rc", descriptor = "Ljava/lang/String;")
    public static String field2602 = "Select";

    @OriginalMember(owner = "client!no", name = "Ic", descriptor = "I")
    public static volatile int field2619 = 0;

    @OriginalMember(owner = "client!no", name = "tc", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!no", name = "uc", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!no", name = "vc", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!no", name = "wc", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!no", name = "zc", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!no", name = "Ac", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!no", name = "Bc", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!no", name = "Cc", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!no", name = "Dc", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!no", name = "Ec", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!no", name = "Fc", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!no", name = "Gc", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!no", name = "Hc", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!no", name = "yc", descriptor = "Lmf;")
    public class214 field2609;

    @OriginalMember(owner = "client!no", name = "xc", descriptor = "Lqe;")
    public static class38 field2608;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)I", line = 6)
    public final int method1251(byte arg0) {
        int var2 = -70 / ((-arg0 - 72) / 49);
        field2615++;
        if (this.field2609.field3142 != null) {
            class214 var3 = this.field2609.method1539(false);
            if (var3 != null && var3.field3108 != -1) {
                return var3.field3108;
            }
        }
        return this.field2609.field3108;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIIIIIIJILko;)V", line = 25)
    public final void method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class155 arg10) {
        field2606++;
        if (this.field2609 == null) {
            return;
        }
        class248 var13 = this.field5190 != -1 && this.field5177 == 0 ? class119.method893(this.field5190, (byte) -41) : null;
        class248 var14 = this.field5096 == -1 || this.field5096 == this.method2355(true).field262 && var13 != null ? null : class119.method893(this.field5096, (byte) -41);
        class151 var15 = this.field2609.method1546(this.field5185, this.field5108, var14, (byte) 103, this.field5180, this.field5146, this.field5151, var13, this.field5132, this.field5194);
        if (var15 == null) {
            return;
        }
        this.field5154 = var15.method371();
        class214 var16 = this.field2609;
        if (var16.field3142 != null) {
            var16 = var16.method1539(false);
        }
        if (class221.field3304 && var16.field3089) {
            class151 var17 = class122.method913(this.field5137, arg0, 116, this.field2609.field3102, this.field2609.field3128, this.field2609.field3094, this.field5165, this.field2609.field3083, var14 == null ? var13 : var14, var15, this.field5187, this.field5111, this.field2609.field3100, var14 == null ? this.field5132 : this.field5180);
            if (class141.field2031) {
                float var18 = class141.method1019();
                float var19 = class141.method988();
                class141.method1020();
                class141.method981(var18, var19 - 150.0F);
                var17.method380(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field5099);
                class141.method1023();
                class141.method981(var18, var19);
            } else {
                var17.method380(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field5099);
            }
        }
        this.method2341(var15, true);
        class151 var20 = null;
        this.method2349(arg0, -76, var15);
        if (this.field5090 != -1 && this.field5159 != -1) {
            class107 var21 = class81.method669(32, this.field5090);
            var20 = var21.method819(this.field5144, 19852, this.field5131, this.field5159);
            if (var20 != null) {
                var20.method1091(0, -this.field5100, 0);
                if (var21.field1541) {
                    if (class11.field182 != 0) {
                        var20.method1079(class11.field182);
                    }
                    if (class145.field2097 != 0) {
                        var20.method1090(class145.field2097);
                    }
                    if (class127.field1850 != 0) {
                        var20.method1091(0, class127.field1850, 0);
                    }
                }
            }
        }
        if (!class141.field2031) {
            if (var20 != null) {
                var15 = ((class317) var15).method2214(var20);
            }
            this.method2354(var20, var15, -31669);
            if (this.field2609.field3083 == 1) {
                var15.field2188 = true;
            }
            var15.method380(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field5099);
            return;
        }
        this.method2354(var20, var15, -31669);
        if (this.field2609.field3083 == 1) {
            var15.field2188 = true;
        }
        var15.method380(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field5099);
        if (var20 == null) {
            return;
        }
        if (this.field2609.field3083 == 1) {
            var20.field2188 = true;
        }
        if (this.field5099 != null) {
            class218 var22 = (class218) var20;
            this.field5099.method1118(var22.field3216, var22.field3241, true, var22.field3244, var22.field3246, var22.field3214);
        }
        var20.method380(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field5099);
    }

    @OriginalMember(owner = "client!no", name = "finalize", descriptor = "()V", line = 147)
    protected final void finalize() {
        if (this.field5099 != null) {
            this.field5099.method1129();
        }
        field2610++;
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(II)Ljava/lang/String;", line = 158)
    public static final String method1252(int arg0, int arg1) {
        if (arg1 != -21419) {
            field2608 = (class38) null;
        }
        field2612++;
        return class281.field4267[arg0].length() > 0 ? class158.field2274[arg0] + class236.field3550 + class281.field4267[arg0] : class158.field2274[arg0];
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(B)Luo;", line = 174)
    public static final class316 method1253(byte arg0) {
        int var1 = -59 / ((arg0 - 6) / 52);
        class179.field2563 = 0;
        field2616++;
        return class108.method826(4096);
    }

    @OriginalMember(owner = "client!no", name = "f", descriptor = "(I)V", line = 189)
    public static void method1254(int arg0) {
        field2602 = null;
        if (arg0 <= -39) {
            field2608 = null;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)I", line = 207)
    public final int method1255(int arg0) {
        if (arg0 != 28952) {
            return 53;
        }
        field2604++;
        if (this.field2609.field3142 != null) {
            class214 var2 = this.field2609.method1539(false);
            if (var2 != null && var2.field3144 != -1) {
                return var2.field3144;
            }
        }
        return this.field5195;
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(I)Z", line = 228)
    public final boolean method1256(int arg0) {
        field2614++;
        if (arg0 == 19942) {
            return this.field2609 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIII)V", line = 242)
    public final void method391(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2605++;
        if (this.field2609 == null) {
            return;
        }
        if (!this.field5148) {
            class248 var6 = this.field5190 != -1 && this.field5177 == 0 ? class119.method893(this.field5190, (byte) -41) : null;
            class248 var7 = this.field5096 == -1 || this.field5096 == this.method2355(true).field262 && var6 != null ? null : class119.method893(this.field5096, (byte) -41);
            class151 var8 = this.field2609.method1546(this.field5185, this.field5108, var7, (byte) 105, this.field5180, this.field5146, this.field5151, var6, this.field5132, this.field5194);
            if (var8 == null) {
                return;
            }
            this.method2354((class151) null, var8, -31669);
        }
        if (this.field5099 != null) {
            this.field5099.method1109(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIIIIIZIIII)V", line = 276)
    public static final void method1257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class17.field283[var12][var13] = 0;
                class208.field3040[var12][var13] = 99999999;
            }
        }
        int var14 = arg4;
        field2607++;
        if (arg11 != 8) {
            method1253((byte) 111);
        }
        int var15 = arg2;
        byte var16 = 0;
        class17.field283[arg4][arg2] = 99;
        class208.field3040[arg4][arg2] = 0;
        class1.field59[var16] = arg4;
        int var37 = var16 + 1;
        class67.field988[var16] = arg2;
        int var17 = 0;
        boolean var18 = false;
        int[][] var19 = class92.field1269[class321.field4835].field1349;
        label332: while (var37 != var17) {
            var15 = class67.field988[var17];
            var14 = class1.field59[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg8 == var14 && arg6 == var15) {
                var18 = true;
                break;
            }
            if (arg1 != 0) {
                if ((arg1 < 5 || arg1 == 10) && class92.field1269[class321.field4835].method759(arg8, arg11 - 1140146936, var15, arg1 - 1, var14, arg3, arg10, arg6)) {
                    var18 = true;
                    break;
                }
                if (arg1 < 10 && class92.field1269[class321.field4835].method751(arg10, arg1 - 1, arg3, var14, arg8, 1, var15, arg6)) {
                    var18 = true;
                    break;
                }
            }
            if (arg5 != 0 && arg0 != 0 && class92.field1269[class321.field4835].method764(var15, arg5, arg9, arg8, arg0, arg6, arg10, var14, -7)) {
                var18 = true;
                break;
            }
            int var20 = class208.field3040[var14][var15] + 1;
            if (var14 > 0 && class17.field283[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x2C010E) == 0 && (var19[var14 - 1][var15 + arg10 - 1] & 0x2C0138) == 0) {
                int var21 = 1;
                while (true) {
                    if (var21 >= (arg10 - 1)) {
                        class1.field59[var37] = var14 - 1;
                        class67.field988[var37] = var15;
                        class17.field283[var14 - 1][var15] = 2;
                        class208.field3040[var14 - 1][var15] = var20;
                        var37 = var37 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var21] & 0x2C013E) != 0) {
                        break;
                    }
                    var21++;
                }
            }
            if (var14 < 102 && class17.field283[var14 + 1][var15] == 0 && (var19[arg10 + var14][var15] & 0x2C0183) == 0 && (var19[arg10 + var14][arg10 + var15 - 1] & 0x2C01E0) == 0) {
                int var22 = 1;
                while (true) {
                    if (var22 >= arg10 - 1) {
                        class1.field59[var37] = var14 + 1;
                        class67.field988[var37] = var15;
                        class17.field283[var14 + 1][var15] = 8;
                        class208.field3040[var14 + 1][var15] = var20;
                        var37 = var37 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[var14 + arg10][var15 + var22] & 0x2C01E3) != 0) {
                        break;
                    }
                    var22++;
                }
            }
            if (var15 > 0 && class17.field283[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x2C010E) == 0 && (var19[arg10 + var14 - 1][var15 - 1] & 0x2C0183) == 0) {
                int var23 = 1;
                while (true) {
                    if ((arg10 - 1) <= var23) {
                        class1.field59[var37] = var14;
                        class67.field988[var37] = var15 - 1;
                        var37 = var37 + 1 & 0xFFF;
                        class17.field283[var14][var15 - 1] = 1;
                        class208.field3040[var14][var15 - 1] = var20;
                        break;
                    }
                    if ((var19[var14 + var23][var15 - 1] & 0x2C018F) != 0) {
                        break;
                    }
                    var23++;
                }
            }
            if (var15 < 102 && class17.field283[var14][var15 + 1] == 0 && (var19[var14][var15 + arg10] & 0x2C0138) == 0 && (var19[var14 + arg10 - 1][var15 + arg10] & 0x2C01E0) == 0) {
                int var24 = 1;
                while (true) {
                    if (var24 >= (arg10 - 1)) {
                        class1.field59[var37] = var14;
                        class67.field988[var37] = var15 + 1;
                        class17.field283[var14][var15 + 1] = 4;
                        class208.field3040[var14][var15 + 1] = var20;
                        var37 = var37 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[var14 + var24][var15 + arg10] & 0x2C01F8) != 0) {
                        break;
                    }
                    var24++;
                }
            }
            if (var14 > 0 && var15 > 0 && class17.field283[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15 - 1] & 0x2C010E) == 0) {
                int var25 = 1;
                while (true) {
                    if (arg10 <= var25) {
                        class1.field59[var37] = var14 - 1;
                        class67.field988[var37] = var15 - 1;
                        var37 = var37 + 1 & 0xFFF;
                        class17.field283[var14 - 1][var15 - 1] = 3;
                        class208.field3040[var14 - 1][var15 - 1] = var20;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var25 - 1] & 0x2C013E) != 0 || (var19[var14 + var25 - 1][var15 - 1] & 0x2C018F) != 0) {
                        break;
                    }
                    var25++;
                }
            }
            if (var14 < 102 && var15 > 0 && class17.field283[var14 + 1][var15 - 1] == 0 && (var19[arg10 + var14][var15 - 1] & 0x2C0183) == 0) {
                int var26 = 1;
                while (true) {
                    if (arg10 <= var26) {
                        class1.field59[var37] = var14 + 1;
                        class67.field988[var37] = var15 - 1;
                        var37 = var37 + 1 & 0xFFF;
                        class17.field283[var14 + 1][var15 - 1] = 9;
                        class208.field3040[var14 + 1][var15 - 1] = var20;
                        break;
                    }
                    if ((var19[var14 + arg10][var26 + var15 - 1] & 0x2C01E3) != 0 || (var19[var14 + var26][var15 - 1] & 0x2C018F) != 0) {
                        break;
                    }
                    var26++;
                }
            }
            if (var14 > 0 && var15 < 102 && class17.field283[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + arg10] & 0x2C0138) == 0) {
                int var27 = 1;
                while (true) {
                    if (arg10 <= var27) {
                        class1.field59[var37] = var14 - 1;
                        class67.field988[var37] = var15 + 1;
                        class17.field283[var14 - 1][var15 + 1] = 6;
                        var37 = var37 + 1 & 0xFFF;
                        class208.field3040[var14 - 1][var15 + 1] = var20;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var27] & 0x2C013E) != 0 || (var19[var14 + var27 - 1][arg10 + var15] & 0x2C01F8) != 0) {
                        break;
                    }
                    var27++;
                }
            }
            if (var14 < 102 && var15 < 102 && class17.field283[var14 + 1][var15 + 1] == 0 && (var19[arg10 + var14][arg10 + var15] & 0x2C01E0) == 0) {
                for (int var28 = 1; var28 < arg10; var28++) {
                    if ((var19[var14 + var28][var15 + arg10] & 0x2C01F8) != 0 || (var19[var14 + arg10][var15 + var28] & 0x2C01E3) != 0) {
                        continue label332;
                    }
                }
                class1.field59[var37] = var14 + 1;
                class67.field988[var37] = var15 + 1;
                var37 = var37 + 1 & 0xFFF;
                class17.field283[var14 + 1][var15 + 1] = 12;
                class208.field3040[var14 + 1][var15 + 1] = var20;
            }
        }
        if (!var18) {
            if (!arg7) {
                return;
            }
            int var29 = 1000;
            int var30 = 100;
            byte var31 = 10;
            for (int var32 = arg8 - var31; var32 <= (arg8 + var31); var32++) {
                for (int var33 = arg6 - var31; var33 <= arg6 + var31; var33++) {
                    if (var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104 && class208.field3040[var32][var33] < 100) {
                        int var34 = 0;
                        if (var32 < arg8) {
                            var34 = arg8 - var32;
                        } else if (arg8 + arg5 - 1 < var32) {
                            var34 = var32 + 1 - arg5 - arg8;
                        }
                        int var35 = 0;
                        if (arg6 > var33) {
                            var35 = arg6 - var33;
                        } else if (var33 > (arg0 + arg6 - 1)) {
                            var35 = var33 + 1 - arg0 - arg6;
                        }
                        int var36 = var34 * var34 + var35 * var35;
                        if (var29 > var36 || var29 == var36 && var30 > class208.field3040[var32][var33]) {
                            var15 = var33;
                            var30 = class208.field3040[var32][var33];
                            var29 = var36;
                            var14 = var32;
                        }
                    }
                }
            }
            if (var29 == 1000) {
                return;
            }
            if (arg4 == var14 && arg2 == var15) {
                return;
            }
        }
        class358.field5478 = var15;
        class50.field757 = false;
        class3.field101 = var14;
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(B)I", line = 699)
    public final int method1258(byte arg0) {
        field2617++;
        if (this.field2609.field3142 != null) {
            class214 var2 = this.field2609.method1539(false);
            if (var2 != null && var2.field3103 != -1) {
                return var2.field3103;
            }
        }
        if (this.field2609.field3103 == -1) {
            if (arg0 < 78) {
                field2619 = 13;
            }
            return super.method1258((byte) 117);
        } else {
            return this.field2609.field3103;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lmf;B)V", line = 727)
    public final void method1259(class214 arg0, byte arg1) {
        this.field2609 = arg0;
        field2618++;
        if (this.field5099 != null) {
            this.field5099.method1111();
        }
        if (arg1 != 7) {
            this.method391(-10, -74, 3, 14, 71);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ILjava/lang/String;)V", line = 743)
    public static final void method1260(int arg0, String arg1) {
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        field2613++;
        if (arg0 < 84) {
            field2602 = (String) null;
        }
        System.exit(1);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "()I", line = 755)
    public final int method371() {
        field2611++;
        return this.field5154;
    }
}
