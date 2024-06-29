import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class88 extends class3 {

    @OriginalMember(owner = "client!we", name = "G", descriptor = "Lok;")
    private class41 field1275 = class150.field2338;

    @OriginalMember(owner = "client!we", name = "P", descriptor = "Lda;")
    public static class212 field1284 = new class212();

    @OriginalMember(owner = "client!we", name = "bb", descriptor = "Lok;")
    public static class41 field1294 = class137.method956(" )2> <col=ffff00>", 45);

    @OriginalMember(owner = "client!we", name = "ab", descriptor = "Ljava/util/Random;")
    public static Random field1293 = new Random();

    @OriginalMember(owner = "client!we", name = "cb", descriptor = "Lok;")
    public static class41 field1295 = class137.method956("Abbrechen", 45);

    @OriginalMember(owner = "client!we", name = "eb", descriptor = "Lok;")
    public static class41 field1297 = class137.method956("titlebg", 45);

    @OriginalMember(owner = "client!we", name = "ib", descriptor = "S")
    public static short field1301 = 1;

    @OriginalMember(owner = "client!we", name = "F", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!we", name = "H", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!we", name = "I", descriptor = "I")
    public int field1277;

    @OriginalMember(owner = "client!we", name = "J", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!we", name = "K", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!we", name = "L", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!we", name = "M", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!we", name = "N", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!we", name = "O", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!we", name = "Q", descriptor = "I")
    private int field1285;

    @OriginalMember(owner = "client!we", name = "S", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!we", name = "T", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!we", name = "V", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!we", name = "X", descriptor = "I")
    public int field1290;

    @OriginalMember(owner = "client!we", name = "Y", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!we", name = "gb", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!we", name = "hb", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!we", name = "fb", descriptor = "Ltb;")
    public static class199 field1298;

    @OriginalMember(owner = "client!we", name = "db", descriptor = "Lwb;")
    public static class82 field1296;

    @OriginalMember(owner = "client!we", name = "U", descriptor = "Lfl;")
    public class86 field1288;

    @OriginalMember(owner = "client!we", name = "Z", descriptor = "Lfl;")
    private class86 field1292;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)I", line = 6)
    public final int method621(int arg0, int arg1) {
        field1286++;
        if (arg0 != 128) {
            this.method622(63);
        }
        if (this.field1288 == null) {
            return this.field1285;
        } else {
            class55 var3 = (class55) this.field1288.method617((long) arg1, false);
            return var3 == null ? this.field1285 : var3.field804;
        }
    }

    @OriginalMember(owner = "client!we", name = "f", descriptor = "(I)V", line = 35)
    private final void method622(int arg0) {
        field1280++;
        if (arg0 != 128) {
            field1298 = (class199) null;
        }
        this.field1292 = new class86(this.field1288.method618((byte) 104));
        for (class55 var2 = (class55) this.field1288.method609(arg0 - 16); var2 != null; var2 = (class55) this.field1288.method616(121)) {
            class55 var3 = new class55((int) var2.field844);
            this.field1292.method610(110, var3, (long) var2.field804);
        }
    }

    @OriginalMember(owner = "client!we", name = "g", descriptor = "(I)V", line = 57)
    private final void method623(int arg0) {
        field1289++;
        this.field1292 = new class86(this.field1288.method618((byte) 104));
        for (class167 var2 = (class167) this.field1288.method609(118); var2 != null; var2 = (class167) this.field1288.method616(125)) {
            class277 var3 = new class277(var2.field2658, (int) var2.field844);
            this.field1292.method610(103, var3, var2.field2658.method267(890436613));
        }
        if (arg0 != -1) {
            this.method633((class112) null, 93);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(SI)Z", line = 80)
    public static final boolean method624(short arg0, int arg1) {
        field1278++;
        if (arg0 == 1 || arg0 == 51 || arg0 == 5 || arg0 == 24 || arg0 == 26 || arg0 == 17 || arg0 == 2 || arg0 == 37) {
            return true;
        } else if (arg0 == 7 || arg0 == 10 || arg0 == 1003 || arg0 == 1004) {
            return true;
        } else {
            if (arg1 != 3) {
                field1295 = (class41) null;
            }
            if (arg0 == 18 || arg0 == 15 || arg0 == 21 || arg0 == 35 || arg0 == 13) {
                return true;
            } else {
                return arg0 == 59 || arg0 == 50 || arg0 == 31 || arg0 == 33 || arg0 == 39 || arg0 == 43;
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(II)Z", line = 114)
    public final boolean method625(int arg0, int arg1) {
        field1282++;
        if (arg1 != -104) {
            method624((short) -36, 38);
        }
        if (this.field1288 == null) {
            return false;
        }
        if (this.field1292 == null) {
            this.method622(arg1 ^ 0xFFFFFF18);
        }
        class55 var3 = (class55) this.field1292.method617((long) arg0, false);
        return var3 != null;
    }

    @OriginalMember(owner = "client!we", name = "h", descriptor = "(I)V", line = 140)
    public static void method626(int arg0) {
        field1293 = null;
        field1296 = null;
        field1298 = null;
        field1284 = null;
        field1297 = null;
        field1294 = null;
        field1295 = null;
        if (arg0 != -5258) {
            method626(-15);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III)Luh;", line = 157)
    public static final class241 method627(int arg0, int arg1, int arg2) {
        class308 var3 = class205.field3312[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class241 var4 = var3.field5210;
            var3.field5210 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIIIIII)V", line = 169)
    public static final void method628(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 != 3) {
            return;
        }
        if (arg0 == arg7 && arg1 == arg6 && arg2 == arg4 && arg3 == arg8) {
            class164.method1152(arg8, arg6, arg0, arg2, false, arg9);
        } else {
            int var10 = arg6;
            int var11 = arg0;
            int var12 = arg0 * 3;
            int var13 = arg7 * 3;
            int var14 = arg6 * 3;
            int var15 = arg1 * 3;
            int var16 = arg4 * 3;
            int var17 = arg3 * 3;
            int var18 = var15 + arg8 - var17 - arg6;
            int var19 = var16 + var12 - var13 - var13;
            int var20 = var14 + var17 - var15 - var15;
            int var21 = var15 - var14;
            int var22 = var13 + arg2 - arg0 - var16;
            int var23 = var13 - var12;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var22 * var26;
                int var28 = var18 * var26;
                int var29 = var19 * var25;
                int var30 = var20 * var25;
                int var31 = var23 * var24;
                int var32 = var21 * var24;
                int var33 = (var29 + var31 + var27 >> 12) + arg0;
                int var34 = (var30 + var32 + var28 >> 12) + arg6;
                class164.method1152(var34, var10, var11, var33, false, arg9);
                var10 = var34;
                var11 = var33;
            }
        }
        field1274++;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(II)Lok;", line = 248)
    public final class41 method629(int arg0, int arg1) {
        field1287++;
        if (this.field1288 == null) {
            return this.field1275;
        }
        class167 var3 = (class167) this.field1288.method617((long) arg0, false);
        if (arg1 <= 46) {
            return (class41) null;
        } else if (var3 == null) {
            return this.field1275;
        } else {
            return var3.field2658;
        }
    }

    @OriginalMember(owner = "client!we", name = "i", descriptor = "(I)V", line = 268)
    public static final void method630(int arg0) {
        field1291++;
        try {
            if (class199.field3199 == 1) {
                int var1 = class210.field3379.method1078(47);
                if (var1 > 0 && class210.field3379.method1073(125)) {
                    int var2 = var1 - class44.field698;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class210.field3379.method1061(var2, (byte) 119);
                    return;
                }
                class210.field3379.method1052((byte) -120);
                class210.field3379.method1081(-1);
                class312.field5265 = null;
                if (class301.field4874 == null) {
                    class199.field3199 = 0;
                } else {
                    class199.field3199 = 2;
                }
                class242.field3865 = null;
            }
            if (arg0 != -104) {
                field1295 = (class41) null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class210.field3379.method1052((byte) -125);
            class199.field3199 = 0;
            class301.field4874 = null;
            class242.field3865 = null;
            class312.field5265 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BLok;)Z", line = 313)
    public final boolean method631(byte arg0, class41 arg1) {
        field1283++;
        if (this.field1288 == null) {
            return false;
        } else if (arg0 >= -70) {
            return true;
        } else {
            if (this.field1292 == null) {
                this.method623(-1);
            }
            for (class277 var3 = (class277) this.field1292.method617(arg1.method267(890436613), false); var3 != null; var3 = (class277) this.field1292.method613(51)) {
                if (var3.field4541.method268(arg1, 1631)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([Lue;IIZBIIII[BI)V", line = 343)
    public static final void method632(class223[] arg0, int arg1, int arg2, boolean arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, byte[] arg9, int arg10) {
        field1279++;
        class112 var11 = new class112(arg9);
        if (arg4 != -37) {
            return;
        }
        int var12 = -1;
        while (true) {
            int var13 = var11.method801(-128);
            if (var13 == 0) {
                return;
            }
            int var14 = 0;
            var12 += var13;
            while (true) {
                int var15 = var11.method756(96);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var11.method792(2);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg6 == var18 && arg1 <= var17 && var17 < (arg1 + 8) && var16 >= arg8 && (arg8 + 8) > var16) {
                    class171 var22 = class234.method1684(-2441, var12);
                    int var23 = class113.method820(-2, var17 & 0x7, var16 & 0x7, arg5, var21, var22.field2752, var22.field2784) + arg7;
                    int var24 = arg2 + class195.method1398(arg4 ^ 0x6D, var16 & 0x7, var17 & 0x7, var21, var22.field2752, arg5, var22.field2784);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class223 var25 = null;
                        if (!arg3) {
                            int var26 = arg10;
                            if ((class126.field1879[1][var23][var24] & 0x2) == 2) {
                                var26 = arg10 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg0[var26];
                            }
                        }
                        class181.method1295(var24, var20, var25, arg10, var23, arg10, (byte) -120, arg3, !arg3, arg5 + var21 & 0x3, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(Llb;I)V", line = 429)
    public final void method633(class112 arg0, int arg1) {
        if (arg1 != -1) {
            this.field1275 = (class41) null;
        }
        while (true) {
            int var3 = arg0.method792(2);
            if (var3 == 0) {
                field1281++;
                return;
            }
            this.method634(-113, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILlb;I)V", line = 476)
    private final void method634(int arg0, class112 arg1, int arg2) {
        if (arg2 == 1) {
            this.field1290 = arg1.method792(2);
        } else if (arg2 == 2) {
            this.field1277 = arg1.method792(2);
        } else if (arg2 == 3) {
            this.field1275 = arg1.method763(true);
        } else if (arg2 == 4) {
            this.field1285 = arg1.method779(-27100);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg1.method759((byte) -116);
            this.field1288 = new class86(class110.method746(var4, -705295902));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method779(-27100);
                class59 var7;
                if (arg2 == 5) {
                    var7 = new class167(arg1.method763(true));
                } else {
                    var7 = new class55(arg1.method779(-27100));
                }
                this.field1288.method610(94, var7, (long) var6);
            }
        }
        if (arg0 >= -103) {
            field1299 = -95;
        }
        field1276++;
    }
}
