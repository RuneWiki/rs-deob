import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class32 extends class72 {

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "[B")
    public byte[] field673;

    @OriginalMember(owner = "client!fa", name = "X", descriptor = "I")
    public static int field680 = 0;

    @OriginalMember(owner = "client!fa", name = "R", descriptor = "I")
    public static int field674 = -1;

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field675 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!fa", name = "Y", descriptor = "I")
    public static int field681 = 99;

    @OriginalMember(owner = "client!fa", name = "cb", descriptor = "Lec;")
    public static class28 field685 = class28.method210(-46, "Connecting to friendserver");

    @OriginalMember(owner = "client!fa", name = "Z", descriptor = "J")
    public static long field682 = 0L;

    @OriginalMember(owner = "client!fa", name = "eb", descriptor = "Lec;")
    public static class28 field687 = class28.method210(-46, "Add ignore @whi@");

    @OriginalMember(owner = "client!fa", name = "db", descriptor = "J")
    public static long field686 = 0L;

    @OriginalMember(owner = "client!fa", name = "ab", descriptor = "Lec;")
    public static class28 field683 = class28.method210(-46, "@or1@");

    @OriginalMember(owner = "client!fa", name = "ib", descriptor = "I")
    public static int field691 = 0;

    @OriginalMember(owner = "client!fa", name = "gb", descriptor = "I")
    public static int field689 = 0;

    @OriginalMember(owner = "client!fa", name = "hb", descriptor = "I")
    public static int field690 = 0;

    @OriginalMember(owner = "client!fa", name = "T", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!fa", name = "U", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!fa", name = "V", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!fa", name = "fb", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!fa", name = "jb", descriptor = "Lwc;")
    public static class128 field692;

    @OriginalMember(owner = "client!fa", name = "bb", descriptor = "Lcc;")
    public static class16 field684;

    @OriginalMember(owner = "client!fa", name = "W", descriptor = "[I")
    public static int[] field679;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)Lvc;")
    public static final class123 method252(int arg0, int arg1) {
        class123 var2 = (class123) class122.field2643.method660(-2, (long) arg1);
        field677++;
        if (var2 != null) {
            return var2;
        } else if (arg0 == -15381) {
            byte[] var3 = client.field404.method932(127, arg1, 13);
            class123 var4 = new class123();
            var4.field2667 = arg1;
            if (var3 != null) {
                var4.method949(-50, new class119(var3));
            }
            class122.field2643.method666(false, var4, (long) arg1);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)V")
    public static void method253(byte arg0) {
        if (arg0 > -67) {
            return;
        }
        field679 = null;
        field692 = null;
        field683 = null;
        field687 = null;
        field675 = null;
        field684 = null;
        field685 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lta;IIIIIZLub;II)V")
    public static final void method254(class111 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, class117 arg7, int arg8, int arg9) {
        field676++;
        int var10 = class118.field2523[arg4][arg8][arg2];
        int var11 = class118.field2523[arg4][arg8 + 1][arg2 + 1];
        int var12 = class118.field2523[arg4][arg8 + 1][arg2];
        int var13 = class118.field2523[arg4][arg8][arg2 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        class45 var15 = class72.method566(arg1, 120);
        int var16 = (arg9 << 6) + arg5;
        int var17 = (arg1 << 14) + (arg2 << 7) + arg8 + 1073741824;
        if (arg6) {
            return;
        }
        if (var15.field977 == 0) {
            var17 += Integer.MIN_VALUE;
        }
        if (var15.field991 == 1) {
            var16 += 256;
        }
        if (arg5 == 22) {
            class87 var18;
            if (var15.field973 == -1 && var15.field982 == null) {
                var18 = var15.method362(var11, arg9, 22, var13, var10, -123, var12);
            } else {
                var18 = new class86(arg1, 22, arg9, var10, var12, var11, var13, var15.field973, true);
            }
            arg0.method792(arg3, arg8, arg2, var14, var18, var17, var16);
            if (var15.field980 && var15.field977 == 1) {
                arg7.method845(arg8, 2097152, arg2);
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class87 var38;
            if (var15.field973 == -1 && var15.field982 == null) {
                var38 = var15.method362(var11, arg9, 10, var13, var10, -91, var12);
            } else {
                var38 = new class86(arg1, 10, arg9, var10, var12, var11, var13, var15.field973, true);
            }
            if (var38 != null) {
                int var39;
                int var40;
                if (arg9 == 1 || arg9 == 3) {
                    var40 = var15.field979;
                    var39 = var15.field1002;
                } else {
                    var39 = var15.field979;
                    var40 = var15.field1002;
                }
                int var41 = 0;
                if (arg5 == 11) {
                    var41 += 256;
                }
                arg0.method807(arg3, arg8, arg2, var14, var40, var39, var38, var41, var17, var16);
            }
            if (var15.field980) {
                arg7.method831(arg8, var15.field976, arg9, 18691, var15.field979, var15.field1002, arg2);
            }
        } else if (arg5 >= 12) {
            class87 var19;
            if (var15.field973 == -1 && var15.field982 == null) {
                var19 = var15.method362(var11, arg9, arg5, var13, var10, -93, var12);
            } else {
                var19 = new class86(arg1, arg5, arg9, var10, var12, var11, var13, var15.field973, true);
            }
            arg0.method807(arg3, arg8, arg2, var14, 1, 1, var19, 0, var17, var16);
            if (var15.field980) {
                arg7.method831(arg8, var15.field976, arg9, 18691, var15.field979, var15.field1002, arg2);
            }
        } else if (arg5 == 0) {
            class87 var20;
            if (var15.field973 == -1 && var15.field982 == null) {
                var20 = var15.method362(var11, arg9, 0, var13, var10, -112, var12);
            } else {
                var20 = new class86(arg1, 0, arg9, var10, var12, var11, var13, var15.field973, true);
            }
            arg0.method803(arg3, arg8, arg2, var14, var20, null, class16.field319[arg9], 0, var17, var16);
            if (var15.field980) {
                arg7.method841(19398920, var15.field976, arg2, arg9, arg5, arg8);
            }
        } else if (arg5 == 1) {
            class87 var21;
            if (var15.field973 == -1 && var15.field982 == null) {
                var21 = var15.method362(var11, arg9, 1, var13, var10, -125, var12);
            } else {
                var21 = new class86(arg1, 1, arg9, var10, var12, var11, var13, var15.field973, true);
            }
            arg0.method803(arg3, arg8, arg2, var14, var21, null, class92.field2022[arg9], 0, var17, var16);
            if (var15.field980) {
                arg7.method841(19398920, var15.field976, arg2, arg9, arg5, arg8);
            }
        } else if (arg5 == 2) {
            int var22 = arg9 + 1 & 0x3;
            class87 var23;
            class87 var24;
            if (var15.field973 == -1 && var15.field982 == null) {
                var23 = var15.method362(var11, arg9 + 4, 2, var13, var10, -100, var12);
                var24 = var15.method362(var11, var22, 2, var13, var10, -91, var12);
            } else {
                var23 = new class86(arg1, 2, arg9 + 4, var10, var12, var11, var13, var15.field973, true);
                var24 = new class86(arg1, 2, var22, var10, var12, var11, var13, var15.field973, true);
            }
            arg0.method803(arg3, arg8, arg2, var14, var23, var24, class16.field319[arg9], class16.field319[var22], var17, var16);
            if (var15.field980) {
                arg7.method841(19398920, var15.field976, arg2, arg9, arg5, arg8);
            }
        } else if (arg5 == 3) {
            class87 var25;
            if (var15.field973 == -1 && var15.field982 == null) {
                var25 = var15.method362(var11, arg9, 3, var13, var10, -101, var12);
            } else {
                var25 = new class86(arg1, 3, arg9, var10, var12, var11, var13, var15.field973, true);
            }
            arg0.method803(arg3, arg8, arg2, var14, var25, null, class92.field2022[arg9], 0, var17, var16);
            if (var15.field980) {
                arg7.method841(19398920, var15.field976, arg2, arg9, arg5, arg8);
            }
        } else if (arg5 == 9) {
            class87 var26;
            if (var15.field973 == -1 && var15.field982 == null) {
                var26 = var15.method362(var11, arg9, arg5, var13, var10, -106, var12);
            } else {
                var26 = new class86(arg1, arg5, arg9, var10, var12, var11, var13, var15.field973, true);
            }
            arg0.method807(arg3, arg8, arg2, var14, 1, 1, var26, 0, var17, var16);
            if (var15.field980) {
                arg7.method831(arg8, var15.field976, arg9, 18691, var15.field979, var15.field1002, arg2);
            }
        } else {
            if (var15.field1004) {
                if (arg9 == 1) {
                    int var27 = var13;
                    var13 = var11;
                    var11 = var12;
                    var12 = var10;
                    var10 = var27;
                } else if (arg9 == 2) {
                    int var28 = var13;
                    var13 = var12;
                    var12 = var28;
                    int var29 = var11;
                    var11 = var10;
                    var10 = var29;
                } else if (arg9 == 3) {
                    int var30 = var13;
                    var13 = var10;
                    var10 = var12;
                    var12 = var11;
                    var11 = var30;
                }
            }
            if (arg5 == 4) {
                class87 var31;
                if (var15.field973 == -1 && var15.field982 == null) {
                    var31 = var15.method362(var11, 0, 4, var13, var10, -110, var12);
                } else {
                    var31 = new class86(arg1, 4, 0, var10, var12, var11, var13, var15.field973, true);
                }
                arg0.method801(arg3, arg8, arg2, var14, var31, class16.field319[arg9], arg9 * 512, 0, 0, var17, var16);
            } else if (arg5 == 5) {
                int var32 = arg0.method783(arg3, arg8, arg2);
                int var33 = 16;
                if (var32 > 0) {
                    var33 = class72.method566(var32 >> 14 & 0x7FFF, 104).field955;
                }
                class87 var34;
                if (var15.field973 == -1 && var15.field982 == null) {
                    var34 = var15.method362(var11, 0, 4, var13, var10, -100, var12);
                } else {
                    var34 = new class86(arg1, 4, 0, var10, var12, var11, var13, var15.field973, true);
                }
                arg0.method801(arg3, arg8, arg2, var14, var34, class16.field319[arg9], arg9 * 512, class118.field2516[arg9] * var33, class36.field825[arg9] * var33, var17, var16);
            } else if (arg5 == 6) {
                class87 var35;
                if (var15.field973 == -1 && var15.field982 == null) {
                    var35 = var15.method362(var11, 0, 4, var13, var10, -116, var12);
                } else {
                    var35 = new class86(arg1, 4, 0, var10, var12, var11, var13, var15.field973, true);
                }
                arg0.method801(arg3, arg8, arg2, var14, var35, 256, arg9, 0, 0, var17, var16);
            } else if (arg5 == 7) {
                class87 var36;
                if (var15.field973 == -1 && var15.field982 == null) {
                    var36 = var15.method362(var11, 0, 4, var13, var10, -100, var12);
                } else {
                    var36 = new class86(arg1, 4, 0, var10, var12, var11, var13, var15.field973, true);
                }
                arg0.method801(arg3, arg8, arg2, var14, var36, 512, arg9, 0, 0, var17, var16);
            } else if (arg5 == 8) {
                class87 var37;
                if (var15.field973 == -1 && var15.field982 == null) {
                    var37 = var15.method362(var11, 0, 4, var13, var10, -127, var12);
                } else {
                    var37 = new class86(arg1, 4, 0, var10, var12, var11, var13, var15.field973, true);
                }
                arg0.method801(arg3, arg8, arg2, var14, var37, 768, arg9, 0, 0, var17, var16);
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "([B)V")
    public class32(byte[] arg0) {
        this.field673 = arg0;
    }
}
