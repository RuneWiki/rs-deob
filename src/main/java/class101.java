import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class101 extends class254 {

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
    public int field1506;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
    public int field1505;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "[[I")
    public int[][] field1499;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "[Z")
    public boolean[] field1498;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "[I")
    public int[] field1497;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "[I")
    public int[] field1501;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "[I")
    public static int[] field1503 = new int[100];

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1502 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "Lha;")
    public static class267 field1508 = null;

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "Ljava/lang/String;")
    public static String field1509 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "Lkj;")
    public static class154 field1510;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
    public static void method672(int arg0) {
        field1502 = null;
        field1503 = null;
        field1508 = null;
        field1510 = null;
        if (arg0 != 104) {
            method675((byte) -82, -102, -107);
        }
        field1509 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(III[Lqb;IIZI[BII)V")
    public static final void method673(int arg0, int arg1, int arg2, class86[] arg3, int arg4, int arg5, boolean arg6, int arg7, byte[] arg8, int arg9, int arg10) {
        field1504++;
        if (!arg6) {
            for (int var11 = 0; var11 < 8; var11++) {
                for (int var12 = 0; var12 < 8; var12++) {
                    if ((arg7 + var11) > 0 && (arg7 + var11) < 103 && arg2 + var12 > 0 && arg2 + var12 < 103) {
                        arg3[arg1].field1319[arg7 + var11][arg2 + var12] = class184.method1188(arg3[arg1].field1319[arg7 + var11][arg2 + var12], -16777217);
                    }
                }
            }
        }
        byte var13;
        if (arg6) {
            var13 = 1;
        } else {
            var13 = 4;
        }
        class114 var14 = new class114(arg8);
        for (int var15 = 0; var15 < var13; var15++) {
            for (int var35 = 0; var35 < 64; var35++) {
                for (int var36 = 0; var36 < 64; var36++) {
                    if (arg4 == var15 && var35 >= arg0 && var35 < arg0 + 8 && var36 >= arg5 && var36 < (arg5 + 8)) {
                        class142.method945(var14, class254.method1703(arg10, -2, var36 & 0x7, var35 & 0x7) + arg2, arg6, 0, class207.method1335(var35 & 0x7, var36 & 0x7, 0, arg10) + arg7, arg1, arg10, true, 0);
                    } else {
                        class142.method945(var14, -1, arg6, 0, -1, 0, 0, true, 0);
                    }
                }
            }
        }
        if (arg9 != 22054) {
            method674(-47, -117);
        }
        while (var14.field1629.length > var14.field1673) {
            int var16 = var14.method760(false);
            if (var16 != 129) {
                var14.field1673--;
                break;
            }
            for (int var17 = 0; var17 < 4; var17++) {
                byte var18 = var14.method741(3083);
                if (var18 == 0) {
                    if (arg4 >= var17) {
                        int var26 = arg7;
                        if (arg7 < 0) {
                            var26 = 0;
                        } else if (arg7 >= 104) {
                            var26 = 104;
                        }
                        int var27 = arg2;
                        if (arg2 < 0) {
                            var27 = 0;
                        } else if (arg2 >= 104) {
                            var27 = 104;
                        }
                        int var28 = arg7 + 7;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 >= 104) {
                            var28 = 104;
                        }
                        int var29 = arg2 + 7;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 >= 104) {
                            var29 = 104;
                        }
                        while (var26 < var28) {
                            while (var29 > var27) {
                                class111.field1600[arg1][var26][var27] = 0;
                                var27++;
                            }
                            var26++;
                        }
                    }
                } else if (var18 == 1) {
                    for (int var19 = 0; var19 < 64; var19 += 4) {
                        for (int var20 = 0; var20 < 64; var20 += 4) {
                            byte var21 = var14.method741(arg9 - 18971);
                            if (arg4 >= var17) {
                                for (int var22 = var19; var22 < (var19 + 4); var22++) {
                                    for (int var23 = var20; var23 < (var20 + 4); var23++) {
                                        if (arg0 <= var22 && var22 < (arg0 + 8) && arg5 <= var23 && (arg5 + 8) > arg5) {
                                            int var24 = class207.method1335(var22 & 0x7, var23 & 0x7, 0, arg10) + arg7;
                                            int var25 = class254.method1703(arg10, arg9 - 22056, var23 & 0x7, var22 & 0x7) + arg2;
                                            if (var24 >= 0 && var24 < 104 && var25 >= 0 && var25 < 104) {
                                                class111.field1600[arg1][var24][var25] = var21;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var30 = false;
        if (var30) {
            return;
        }
        int var31 = arg2 + 7;
        int var32 = arg7 + 7;
        for (int var33 = arg7; var33 < var32; var33++) {
            for (int var34 = arg2; var34 < var31; var34++) {
                class111.field1600[arg1][var33][var34] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(II)V")
    public static final void method674(int arg0, int arg1) {
        if (arg1 != -1694) {
            field1503 = null;
        }
        field1507++;
        class270 var2 = class190.method1213(25702, arg0, 3);
        var2.method1806(-8173);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BII)I")
    public static final int method675(byte arg0, int arg1, int arg2) {
        if (arg0 >= -99) {
            field1502 = null;
        }
        field1500++;
        int var3 = arg1 >>> 31;
        return (arg1 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(I[B)V")
    public class101(int arg0, byte[] arg1) {
        this.field1506 = arg0;
        class114 var3 = new class114(arg1);
        this.field1505 = var3.method760(false);
        this.field1499 = new int[this.field1505][];
        this.field1498 = new boolean[this.field1505];
        this.field1497 = new int[this.field1505];
        this.field1501 = new int[this.field1505];
        for (int var4 = 0; var4 < this.field1505; var4++) {
            this.field1501[var4] = var3.method760(false);
        }
        for (int var5 = 0; var5 < this.field1505; var5++) {
            this.field1498[var5] = var3.method760(false) == 1;
        }
        for (int var6 = 0; var6 < this.field1505; var6++) {
            this.field1497[var6] = var3.method756(-29901);
        }
        for (int var7 = 0; var7 < this.field1505; var7++) {
            this.field1499[var7] = new int[var3.method760(false)];
        }
        for (int var8 = 0; var8 < this.field1505; var8++) {
            for (int var9 = 0; var9 < this.field1499[var8].length; var9++) {
                this.field1499[var8][var9] = var3.method760(false);
            }
        }
    }
}
