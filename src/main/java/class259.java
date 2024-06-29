import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class259 extends class25 {

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "I")
    public static int field4521 = 1;

    @OriginalMember(owner = "client!rf", name = "K", descriptor = "I")
    public static volatile int field4518 = -1;

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "I")
    public static int field4527 = 0;

    @OriginalMember(owner = "client!rf", name = "J", descriptor = "[I")
    public static int[] field4517 = new int[25];

    @OriginalMember(owner = "client!rf", name = "M", descriptor = "[Ldf;")
    public static class51[] field4520 = new class51[100];

    @OriginalMember(owner = "client!rf", name = "bb", descriptor = "Ldf;")
    private static class51 field4535 = class46.method233("Choose Option", 100);

    @OriginalMember(owner = "client!rf", name = "H", descriptor = "Ldf;")
    public static class51 field4515 = field4535;

    @OriginalMember(owner = "client!rf", name = "F", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!rf", name = "I", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!rf", name = "P", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!rf", name = "V", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!rf", name = "X", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!rf", name = "Y", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!rf", name = "Z", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!rf", name = "ab", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!rf", name = "cb", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!rf", name = "db", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!rf", name = "W", descriptor = "Lgb;")
    public static class139 field4530;

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "Lp;")
    public static class262 field4526;

    @OriginalMember(owner = "client!rf", name = "G", descriptor = "[I")
    private int[] field4514;

    @OriginalMember(owner = "client!rf", name = "L", descriptor = "[I")
    public int[] field4519;

    @OriginalMember(owner = "client!rf", name = "E", descriptor = "[Ldf;")
    private class51[] field4512;

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "[[I")
    private int[][] field4524;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILlb;[I)V")
    public final void method1755(int arg0, class121 arg1, int[] arg2) {
        field4522++;
        if (this.field4514 == null) {
            return;
        }
        for (int var4 = arg0; var4 < this.field4514.length; var4++) {
            if (var4 >= arg2.length) {
                return;
            }
            int var5 = class161.field2641[this.method1756(true, var4)];
            if (var5 > 0) {
                arg1.method910(-1, var5, (long) arg2[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZI)I")
    public final int method1756(boolean arg0, int arg1) {
        if (arg0) {
            field4534++;
            return this.field4514 == null || arg1 < 0 || arg1 > this.field4514.length ? -1 : this.field4514[arg1];
        } else {
            return 37;
        }
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(B)I")
    public final int method1757(byte arg0) {
        field4536++;
        if (arg0 < 105) {
            return 93;
        } else if (this.field4514 == null) {
            return 0;
        } else {
            return this.field4514.length;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BII)I")
    public final int method1758(byte arg0, int arg1, int arg2) {
        field4523++;
        if (this.field4514 == null || arg1 < 0 || this.field4514.length < arg1) {
            return -1;
        } else if (this.field4524[arg1] == null || arg2 < 0 || this.field4524[arg1].length < arg2) {
            return -1;
        } else {
            if (arg0 >= -98) {
                this.method1757((byte) 122);
            }
            return this.field4524[arg1][arg2];
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Llb;I)Ldf;")
    public final class51 method1759(class121 arg0, int arg1) {
        if (arg1 != -1) {
            field4521 = -55;
        }
        field4516++;
        class51 var3 = class131.method964(0, 80);
        if (this.field4514 != null) {
            for (int var4 = 0; var4 < this.field4514.length; var4++) {
                var3.method305((byte) -83, this.field4512[var4]);
                var3.method305((byte) -81, class44.method225((byte) 97, arg0.method872(class135.field2253[this.field4514[var4]], arg1 - 22301), this.field4524[var4], this.field4514[var4]));
            }
        }
        var3.method305((byte) -104, this.field4512[this.field4512.length - 1]);
        return var3.method285(43);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Llb;II)V")
    private final void method1760(class121 arg0, int arg1, int arg2) {
        field4531++;
        if (arg2 == 1) {
            this.field4512 = arg0.method903((byte) 108).method312(60, arg1 ^ 0xFFFFFFBF);
        } else if (arg2 == 2) {
            int var4 = arg0.method897(106);
            this.field4519 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4519[var5] = arg0.method876(false);
            }
        } else if (arg2 == 3) {
            int var6 = arg0.method897(116);
            this.field4524 = new int[var6][];
            this.field4514 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method876(false);
                this.field4514[var7] = var8;
                this.field4524[var7] = new int[class252.field4421[var8]];
                for (int var9 = 0; var9 < class252.field4421[var8]; var9++) {
                    this.field4524[var7][var9] = arg0.method876(false);
                }
            }
        }
        if (arg1 != 60) {
            this.method1756(true, -8);
        }
    }

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "(I)Ldf;")
    public final class51 method1761(int arg0) {
        field4529++;
        class51 var2 = class131.method964(0, arg0);
        if (this.field4512 == null) {
            return class208.field3483;
        }
        var2.method305((byte) -79, this.field4512[0]);
        for (int var3 = 1; var3 < this.field4512.length; var3++) {
            var2.method305((byte) -85, class249.field4376);
            var2.method305((byte) -104, this.field4512[var3]);
        }
        return var2.method285(43);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIIIIIZIII)Z")
    public static final boolean method1762(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class76.field1219[var12][var31] = 0;
                class157.field2600[var12][var31] = 99999999;
            }
        }
        class76.field1219[arg0][arg11] = 99;
        field4513++;
        int var13 = arg11;
        if (arg2 != 1) {
            return false;
        }
        class157.field2600[arg0][arg11] = 0;
        int var14 = 0;
        byte var15 = 0;
        int var16 = arg0;
        class159.field2609[var15] = arg0;
        boolean var17 = false;
        int var32 = var15 + 1;
        class191.field3200[var15] = arg11;
        int[][] var18 = class159.field2605[class257.field4496].field2787;
        while (var14 != var32) {
            var13 = class191.field3200[var14];
            var16 = class159.field2609[var14];
            var14 = var14 + 1 & 0xFFF;
            if (arg6 == var16 && arg1 == var13) {
                var17 = true;
                break;
            }
            if (arg4 != 0) {
                if ((arg4 < 5 || arg4 == 10) && class159.field2605[class257.field4496].method1180(arg4 - 1, arg5, (byte) -115, var16, 1, var13, arg1, arg6)) {
                    var17 = true;
                    break;
                }
                if (arg4 < 10 && class159.field2605[class257.field4496].method1197(var13, arg2 + 116, 1, arg5, arg1, arg4 - 1, var16, arg6)) {
                    var17 = true;
                    break;
                }
            }
            if (arg3 != 0 && arg9 != 0 && class159.field2605[class257.field4496].method1183(arg6, arg9, var13, arg3, -1, 1, arg1, var16, arg10)) {
                var17 = true;
                break;
            }
            int var30 = class157.field2600[var16][var13] + 1;
            if (var16 > 0 && class76.field1219[var16 - 1][var13] == 0 && (var18[var16 - 1][var13] & 0x12C0108) == 0) {
                class159.field2609[var32] = var16 - 1;
                class191.field3200[var32] = var13;
                class76.field1219[var16 - 1][var13] = 2;
                var32 = var32 + 1 & 0xFFF;
                class157.field2600[var16 - 1][var13] = var30;
            }
            if (var16 < 103 && class76.field1219[var16 + 1][var13] == 0 && (var18[var16 + 1][var13] & 0x12C0180) == 0) {
                class159.field2609[var32] = var16 + 1;
                class191.field3200[var32] = var13;
                var32 = var32 + 1 & 0xFFF;
                class76.field1219[var16 + 1][var13] = 8;
                class157.field2600[var16 + 1][var13] = var30;
            }
            if (var13 > 0 && class76.field1219[var16][var13 - 1] == 0 && (var18[var16][var13 - 1] & 0x12C0102) == 0) {
                class159.field2609[var32] = var16;
                class191.field3200[var32] = var13 - 1;
                class76.field1219[var16][var13 - 1] = 1;
                var32 = var32 + 1 & 0xFFF;
                class157.field2600[var16][var13 - 1] = var30;
            }
            if (var13 < 103 && class76.field1219[var16][var13 + 1] == 0 && (var18[var16][var13 + 1] & 0x12C0120) == 0) {
                class159.field2609[var32] = var16;
                class191.field3200[var32] = var13 + 1;
                class76.field1219[var16][var13 + 1] = 4;
                var32 = var32 + 1 & 0xFFF;
                class157.field2600[var16][var13 + 1] = var30;
            }
            if (var16 > 0 && var13 > 0 && class76.field1219[var16 - 1][var13 - 1] == 0 && (var18[var16 - 1][var13 - 1] & 0x12C010E) == 0 && (var18[var16 - 1][var13] & 0x12C0108) == 0 && (var18[var16][var13 - 1] & 0x12C0102) == 0) {
                class159.field2609[var32] = var16 - 1;
                class191.field3200[var32] = var13 - 1;
                class76.field1219[var16 - 1][var13 - 1] = 3;
                class157.field2600[var16 - 1][var13 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var16 < 103 && var13 > 0 && class76.field1219[var16 + 1][var13 - 1] == 0 && (var18[var16 + 1][var13 - 1] & 0x12C0183) == 0 && (var18[var16 + 1][var13] & 0x12C0180) == 0 && (var18[var16][var13 - 1] & 0x12C0102) == 0) {
                class159.field2609[var32] = var16 + 1;
                class191.field3200[var32] = var13 - 1;
                var32 = var32 + 1 & 0xFFF;
                class76.field1219[var16 + 1][var13 - 1] = 9;
                class157.field2600[var16 + 1][var13 - 1] = var30;
            }
            if (var16 > 0 && var13 < 103 && class76.field1219[var16 - 1][var13 + 1] == 0 && (var18[var16 - 1][var13 + 1] & 0x12C0138) == 0 && (var18[var16 - 1][var13] & 0x12C0108) == 0 && (var18[var16][var13 + 1] & 0x12C0120) == 0) {
                class159.field2609[var32] = var16 - 1;
                class191.field3200[var32] = var13 + 1;
                class76.field1219[var16 - 1][var13 + 1] = 6;
                var32 = var32 + 1 & 0xFFF;
                class157.field2600[var16 - 1][var13 + 1] = var30;
            }
            if (var16 < 103 && var13 < 103 && class76.field1219[var16 + 1][var13 + 1] == 0 && (var18[var16 + 1][var13 + 1] & 0x12C01E0) == 0 && (var18[var16 + 1][var13] & 0x12C0180) == 0 && (var18[var16][var13 + 1] & 0x12C0120) == 0) {
                class159.field2609[var32] = var16 + 1;
                class191.field3200[var32] = var13 + 1;
                var32 = var32 + 1 & 0xFFF;
                class76.field1219[var16 + 1][var13 + 1] = 12;
                class157.field2600[var16 + 1][var13 + 1] = var30;
            }
        }
        class45.field724 = 0;
        if (!var17) {
            if (!arg8) {
                return false;
            }
            int var19 = 100;
            int var20 = 1000;
            byte var21 = 10;
            for (int var22 = arg6 - var21; var22 <= (arg6 + var21); var22++) {
                for (int var23 = arg1 - var21; var23 <= (arg1 + var21); var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class157.field2600[var22][var23] < 100) {
                        int var24 = 0;
                        if (arg1 > var23) {
                            var24 = arg1 - var23;
                        } else if (arg1 + arg9 - 1 < var23) {
                            var24 = var23 + 1 - arg1 - arg9;
                        }
                        int var25 = 0;
                        if (var22 < arg6) {
                            var25 = arg6 - var22;
                        } else if (arg6 + arg3 - 1 < var22) {
                            var25 = var22 + 1 - arg3 - arg6;
                        }
                        int var26 = var25 * var25 + (var24 * var24);
                        if (var26 < var20 || var20 == var26 && class157.field2600[var22][var23] < var19) {
                            var16 = var22;
                            var13 = var23;
                            var19 = class157.field2600[var22][var23];
                            var20 = var26;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg0 == var16 && arg11 == var13) {
                return false;
            }
            class45.field724 = 1;
        }
        byte var27 = 0;
        class159.field2609[var27] = var16;
        int var33 = var27 + 1;
        class191.field3200[var27] = var13;
        int var28;
        int var29 = var28 = class76.field1219[var16][var13];
        while (arg0 != var16 || arg11 != var13) {
            if (var28 != var29) {
                class159.field2609[var33] = var16;
                var28 = var29;
                class191.field3200[var33++] = var13;
            }
            if ((var29 & 0x2) != 0) {
                var16++;
            } else if ((var29 & 0x8) != 0) {
                var16--;
            }
            if ((var29 & 0x1) != 0) {
                var13++;
            } else if ((var29 & 0x4) != 0) {
                var13--;
            }
            var29 = class76.field1219[var16][var13];
        }
        if (var33 > 0) {
            class175.method1227(var33, arg7, arg2 ^ 0x7546);
            return true;
        } else if (arg7 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BIII)I")
    public static final int method1763(byte arg0, int arg1, int arg2, int arg3) {
        field4528++;
        if ((class160.field2626[arg2][arg3][arg1] & 0x8) == 0) {
            if (arg0 < 96) {
                method1763((byte) 66, 55, 31, 14);
            }
            return arg2 <= 0 || (class160.field2626[1][arg3][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(II)V")
    public static final void method1764(int arg0, int arg1) {
        class261.field4561.method1348(arg1 + 1, arg0);
        field4533++;
        if (arg1 != -1) {
            field4530 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(Llb;I)V")
    public final void method1765(class121 arg0, int arg1) {
        if (arg1 > -82) {
            field4515 = null;
        }
        while (true) {
            int var3 = arg0.method897(123);
            if (var3 == 0) {
                field4525++;
                return;
            }
            this.method1760(arg0, 60, var3);
        }
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(B)V")
    public final void method1766(byte arg0) {
        if (this.field4519 != null) {
            for (int var2 = 0; var2 < this.field4519.length; var2++) {
                this.field4519[var2] = class82.method642(this.field4519[var2], 32768);
            }
        }
        int var3 = -36 / ((arg0 - 31) / 32);
        field4537++;
    }

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)V")
    public static void method1767(int arg0) {
        field4520 = null;
        if (arg0 > -109) {
            method1767(118);
        }
        field4517 = null;
        field4526 = null;
        field4535 = null;
        field4515 = null;
        field4530 = null;
    }
}
