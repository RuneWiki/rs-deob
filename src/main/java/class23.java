import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public abstract class class23 extends class307 {

    @OriginalMember(owner = "client!ni", name = "L", descriptor = "[Lni;")
    public class23[] field411;

    @OriginalMember(owner = "client!ni", name = "P", descriptor = "Z")
    public boolean field415;

    @OriginalMember(owner = "client!ni", name = "F", descriptor = "Lqd;")
    public static class40 field405 = class147.method1106("Liste der Welten geladen", (byte) -107);

    @OriginalMember(owner = "client!ni", name = "K", descriptor = "I")
    public static int field410 = -1;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "Lqd;")
    public static class40 field396 = class147.method1106("lila:", (byte) -70);

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "Lqd;")
    public static class40 field400 = class147.method1106("leuchten1:", (byte) -97);

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "Z")
    public static boolean field401 = false;

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "Lqd;")
    public static class40 field402 = class147.method1106("http:)4)4", (byte) -121);

    @OriginalMember(owner = "client!ni", name = "W", descriptor = "Lqd;")
    private static class40 field422 = class147.method1106("RuneScape is loading )2 please wait)3)3)3", (byte) -56);

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "Lqd;")
    public static class40 field399 = field422;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!ni", name = "E", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!ni", name = "G", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!ni", name = "H", descriptor = "I")
    public int field407;

    @OriginalMember(owner = "client!ni", name = "J", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!ni", name = "M", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!ni", name = "N", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!ni", name = "O", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!ni", name = "Q", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!ni", name = "S", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!ni", name = "V", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!ni", name = "X", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!ni", name = "R", descriptor = "Lhc;")
    public class166 field417;

    @OriginalMember(owner = "client!ni", name = "I", descriptor = "Lce;")
    public static class239 field408;

    @OriginalMember(owner = "client!ni", name = "U", descriptor = "Lce;")
    public static class239 field420;

    @OriginalMember(owner = "client!ni", name = "T", descriptor = "Lwd;")
    public static class75 field419;

    @OriginalMember(owner = "client!ni", name = "D", descriptor = "Lwc;")
    public class98 field403;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)I", line = 16)
    public int method170(int arg0) {
        if (arg0 > -54) {
            return -76;
        } else {
            field397++;
            return -1;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V", line = 27)
    public void method18(boolean arg0) {
        field414++;
        if (this.field415) {
            this.field403.method729(0);
            this.field403 = null;
        } else {
            this.field417.method1248(-117);
            this.field417 = null;
        }
        if (!arg0) {
            field405 = (class40) null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIIIIZIIII)Z", line = 56)
    public static final boolean method171(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11, int arg12) {
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                class5.field58[var13][var14] = 0;
                class272.field4514[var13][var14] = 99999999;
            }
        }
        field421++;
        class5.field58[arg3][arg10] = 99;
        int var15 = arg3;
        int var16 = arg10;
        class272.field4514[arg3][arg10] = 0;
        byte var17 = 0;
        class71.field1266[var17] = arg3;
        int var41 = var17 + 1;
        class308.field5169[var17] = arg10;
        if (arg4 != 19661118) {
            return false;
        }
        int var18 = 0;
        int[][] var19 = class255.field4247[class160.field2671].field839;
        boolean var20 = false;
        label390: while (var41 != var18) {
            var16 = class308.field5169[var18];
            var15 = class71.field1266[var18];
            var18 = var18 + 1 & 0xFFF;
            if (arg1 == var15 && arg0 == var16) {
                var20 = true;
                break;
            }
            if (arg2 != 0) {
                if ((arg2 < 5 || arg2 == 10) && class255.field4247[class160.field2671].method411(var16, (byte) 110, var15, arg0, arg1, arg2 - 1, arg5, arg11)) {
                    var20 = true;
                    break;
                }
                if (arg2 < 10 && class255.field4247[class160.field2671].method405(arg1, arg2 - 1, arg5, var16, false, arg0, arg11, var15)) {
                    var20 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg12 != 0 && class255.field4247[class160.field2671].method408(arg7, false, arg1, arg0, var16, var15, arg6, arg12, arg11)) {
                var20 = true;
                break;
            }
            int var21 = class272.field4514[var15][var16] + 1;
            if (var15 > 0 && class5.field58[var15 - 1][var16] == 0 && (var19[var15 - 1][var16] & 0x12C010E) == 0 && (var19[var15 - 1][var16 + arg11 - 1] & 0x12C0138) == 0) {
                int var22 = 1;
                while (true) {
                    if (var22 >= arg11 - 1) {
                        class71.field1266[var41] = var15 - 1;
                        class308.field5169[var41] = var16;
                        var41 = var41 + 1 & 0xFFF;
                        class5.field58[var15 - 1][var16] = 2;
                        class272.field4514[var15 - 1][var16] = var21;
                        break;
                    }
                    if ((var19[var15 - 1][var16 + var22] & 0x12C013E) != 0) {
                        break;
                    }
                    var22++;
                }
            }
            if (var15 < 102 && class5.field58[var15 + 1][var16] == 0 && (var19[arg11 + var15][var16] & 0x12C0183) == 0 && (var19[arg11 + var15][var16 + arg11 - 1] & 0x12C01E0) == 0) {
                int var23 = 1;
                while (true) {
                    if ((arg11 - 1) <= var23) {
                        class71.field1266[var41] = var15 + 1;
                        class308.field5169[var41] = var16;
                        var41 = var41 + 1 & 0xFFF;
                        class5.field58[var15 + 1][var16] = 8;
                        class272.field4514[var15 + 1][var16] = var21;
                        break;
                    }
                    if ((var19[arg11 + var15][var16 + var23] & 0x12C01E3) != 0) {
                        break;
                    }
                    var23++;
                }
            }
            if (var16 > 0 && class5.field58[var15][var16 - 1] == 0 && (var19[var15][var16 - 1] & 0x12C010E) == 0 && (var19[arg11 + var15 - 1][var16 - 1] & 0x12C0183) == 0) {
                int var24 = 1;
                while (true) {
                    if (var24 >= (arg11 - 1)) {
                        class71.field1266[var41] = var15;
                        class308.field5169[var41] = var16 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class5.field58[var15][var16 - 1] = 1;
                        class272.field4514[var15][var16 - 1] = var21;
                        break;
                    }
                    if ((var19[var15 + var24][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var24++;
                }
            }
            if (var16 < 102 && class5.field58[var15][var16 + 1] == 0 && (var19[var15][arg11 + var16] & 0x12C0138) == 0 && (var19[arg11 + var15 - 1][arg11 + var16] & 0x12C01E0) == 0) {
                int var25 = 1;
                while (true) {
                    if (arg11 - 1 <= var25) {
                        class71.field1266[var41] = var15;
                        class308.field5169[var41] = var16 + 1;
                        class5.field58[var15][var16 + 1] = 4;
                        var41 = var41 + 1 & 0xFFF;
                        class272.field4514[var15][var16 + 1] = var21;
                        break;
                    }
                    if ((var19[var15 + var25][arg11 + var16] & 0x12C01F8) != 0) {
                        break;
                    }
                    var25++;
                }
            }
            if (var15 > 0 && var16 > 0 && class5.field58[var15 - 1][var16 - 1] == 0 && (var19[var15 - 1][var16 - (-arg11 - -1) - 1] & 0x12C0138) == 0 && (var19[var15 - 1][var16 - 1] & 0x12C010E) == 0 && (var19[var15 + arg11 - 1 - 1][var16 - 1] & 0x12C0183) == 0) {
                int var26 = 1;
                while (true) {
                    if ((arg11 - 1) <= var26) {
                        class71.field1266[var41] = var15 - 1;
                        class308.field5169[var41] = var16 - 1;
                        class5.field58[var15 - 1][var16 - 1] = 3;
                        var41 = var41 + 1 & 0xFFF;
                        class272.field4514[var15 - 1][var16 - 1] = var21;
                        break;
                    }
                    if ((var19[var15 - 1][var16 + var26 - 1] & 0x12C013E) != 0 || (var19[var15 + var26 - 1][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var26++;
                }
            }
            if (var15 < 102 && var16 > 0 && class5.field58[var15 + 1][var16 - 1] == 0 && (var19[var15 + 1][var16 - 1] & 0x12C010E) == 0 && (var19[var15 + arg11][var16 - 1] & 0x12C0183) == 0 && (var19[arg11 + var15][var16 + arg11 - 1 - 1] & 0x12C01E0) == 0) {
                int var27 = 1;
                while (true) {
                    if ((arg11 - 1) <= var27) {
                        class71.field1266[var41] = var15 + 1;
                        class308.field5169[var41] = var16 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class5.field58[var15 + 1][var16 - 1] = 9;
                        class272.field4514[var15 + 1][var16 - 1] = var21;
                        break;
                    }
                    if ((var19[arg11 + var15][var16 + var27 - 1] & 0x12C01E3) != 0 || (var19[var15 + var27 + 1][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var27++;
                }
            }
            if (var15 > 0 && var16 < 102 && class5.field58[var15 - 1][var16 + 1] == 0 && (var19[var15 - 1][var16 + 1] & 0x12C010E) == 0 && (var19[var15 - 1][arg11 + var16] & 0x12C0138) == 0 && (var19[var15][arg11 + var16] & 0x12C01E0) == 0) {
                int var28 = 1;
                while (true) {
                    if (arg11 - 1 <= var28) {
                        class71.field1266[var41] = var15 - 1;
                        class308.field5169[var41] = var16 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class5.field58[var15 - 1][var16 + 1] = 6;
                        class272.field4514[var15 - 1][var16 + 1] = var21;
                        break;
                    }
                    if ((var19[var15 - 1][var16 + var28 + 1] & 0x12C013E) != 0 || (var19[var15 + var28 - 1][var16 + arg11] & 0x12C01F8) != 0) {
                        break;
                    }
                    var28++;
                }
            }
            if (var15 < 102 && var16 < 102 && class5.field58[var15 + 1][var16 + 1] == 0 && (var19[var15 + 1][arg11 + var16] & 0x12C0138) == 0 && (var19[var15 + arg11][arg11 + var16] & 0x12C01E0) == 0 && (var19[arg11 + var15][var16 + 1] & 0x12C0183) == 0) {
                for (int var29 = 1; var29 < (arg11 - 1); var29++) {
                    if ((var19[var15 + var29 + 1][var16 + arg11] & 0x12C01F8) != 0 || (var19[arg11 + var15][var16 + var29 + 1] & 0x12C01E3) != 0) {
                        continue label390;
                    }
                }
                class71.field1266[var41] = var15 + 1;
                class308.field5169[var41] = var16 + 1;
                var41 = var41 + 1 & 0xFFF;
                class5.field58[var15 + 1][var16 + 1] = 12;
                class272.field4514[var15 + 1][var16 + 1] = var21;
            }
        }
        class303.field5081 = 0;
        if (!var20) {
            if (!arg8) {
                return false;
            }
            int var30 = 100;
            byte var31 = 10;
            int var32 = 1000;
            for (int var33 = arg1 - var31; var33 <= arg1 + var31; var33++) {
                for (int var34 = arg0 - var31; var34 <= arg0 + var31; var34++) {
                    if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && class272.field4514[var33][var34] < 100) {
                        int var35 = 0;
                        if (var33 < arg1) {
                            var35 = arg1 - var33;
                        } else if (var33 > arg1 - (1 - arg7)) {
                            var35 = 1 - (arg1 - (var33 - arg7));
                        }
                        int var36 = 0;
                        if (arg0 > var34) {
                            var36 = arg0 - var34;
                        } else if (arg0 + arg12 - 1 < var34) {
                            var36 = var34 + 1 - arg12 - arg0;
                        }
                        int var37 = var35 * var35 + var36 * var36;
                        if (var37 < var32 || var32 == var37 && var30 > class272.field4514[var33][var34]) {
                            var30 = class272.field4514[var33][var34];
                            var32 = var37;
                            var15 = var33;
                            var16 = var34;
                        }
                    }
                }
            }
            if (var32 == 1000) {
                return false;
            }
            if (arg3 == var15 && arg10 == var16) {
                return false;
            }
            class303.field5081 = 1;
        }
        byte var38 = 0;
        class71.field1266[var38] = var15;
        int var42 = var38 + 1;
        class308.field5169[var38] = var16;
        int var39;
        int var40 = var39 = class5.field58[var15][var16];
        while (arg3 != var15 || arg10 != var16) {
            if (var39 != var40) {
                var39 = var40;
                class71.field1266[var42] = var15;
                class308.field5169[var42++] = var16;
            }
            if ((var40 & 0x2) != 0) {
                var15++;
            } else if ((var40 & 0x8) != 0) {
                var15--;
            }
            if ((var40 & 0x1) != 0) {
                var16++;
            } else if ((var40 & 0x4) != 0) {
                var16--;
            }
            var40 = class5.field58[var15][var16];
        }
        if (var42 > 0) {
            class226.method1586(arg9, var42, -9065);
            return true;
        } else if (arg9 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)[[I", line = 553)
    public int[][] method17(int arg0, int arg1) {
        if (arg0 < 30) {
            field396 = (class40) null;
        }
        field413++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BI)[I", line = 568)
    public int[] method32(byte arg0, int arg1) {
        if (arg0 == -94) {
            field406++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "(I)V", line = 581)
    public static void method172(int arg0) {
        field420 = null;
        field408 = null;
        field405 = null;
        field422 = null;
        field400 = null;
        if (arg0 >= 44) {
            field402 = null;
            field399 = null;
            field396 = null;
            field419 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V", line = 600)
    public void method61(byte arg0) {
        field416++;
        if (arg0 != 4) {
            field398 = -87;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IILsd;)V", line = 629)
    public void method23(int arg0, int arg1, class26 arg2) {
        if (arg1 != 0) {
            field405 = (class40) null;
        }
        field412++;
    }

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "(I)I", line = 644)
    public int method19(int arg0) {
        if (arg0 > -40) {
            return -11;
        } else {
            field404++;
            return -1;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIB)[[I", line = 656)
    public final int[][] method173(int arg0, int arg1, byte arg2) {
        field409++;
        int var4 = -8 / ((arg2 + 52) / 51);
        if (this.field411[arg0].field415) {
            int[] var5 = this.field411[arg0].method32((byte) -94, arg1);
            return new int[][] { var5, var5, var5 };
        } else {
            return this.field411[arg0].method17(66, arg1);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)[I", line = 688)
    public final int[] method174(int arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            field418++;
            return this.field411[arg0].field415 ? this.field411[arg0].method32((byte) -94, arg2) : this.field411[arg0].method17(44, arg2)[0];
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(IZ)V", line = 720)
    public class23(int arg0, boolean arg1) {
        this.field411 = new class23[arg0];
        this.field415 = arg1;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IBI)V", line = 749)
    public final void method175(int arg0, byte arg1, int arg2) {
        field423++;
        int var4 = this.field407 == 255 ? arg2 : this.field407;
        if (this.field415) {
            this.field403 = new class98(var4, arg2, arg0);
        } else {
            this.field417 = new class166(var4, arg2, arg0);
        }
        if (arg1 <= 8) {
            this.method19(-82);
        }
    }
}
