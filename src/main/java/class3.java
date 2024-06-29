import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class3 extends class260 {

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "[I")
    public static int[] field55 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "Loh;")
    public static class263 field57 = class253.method1681(-128, "; version=1; path=)4; domain=");

    @OriginalMember(owner = "client!qd", name = "P", descriptor = "I")
    public static int field58 = 0;

    @OriginalMember(owner = "client!qd", name = "T", descriptor = "Loh;")
    public static class263 field62 = class253.method1681(-126, "");

    @OriginalMember(owner = "client!qd", name = "Y", descriptor = "Loh;")
    private static class263 field67 = class253.method1681(-124, "wave:");

    @OriginalMember(owner = "client!qd", name = "X", descriptor = "Loh;")
    public static class263 field66 = field67;

    @OriginalMember(owner = "client!qd", name = "W", descriptor = "Loh;")
    public static class263 field65 = field67;

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!qd", name = "N", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!qd", name = "Q", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!qd", name = "R", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!qd", name = "S", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!qd", name = "U", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!qd", name = "V", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!qd", name = "Z", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIII)V")
    public static final void method13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field54;
        if (arg1 == 128) {
            for (int var6 = arg2; ~arg0 <= ~var6; ++var6) {
                class191.method1255(arg3, arg5, arg4, arg1 + -53, class38.field870[var6]);
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 == 1002) {
            if (~arg0 == ~arg9 && arg4 == arg8 && ~arg2 == ~arg7 && arg5 == arg6) {
                class103.method695(arg2, arg4, arg1, arg0, 119, arg5);
            } else {
                int var10 = arg0;
                int var11 = arg4;
                int var12 = arg4 * 3;
                int var13 = arg0 * 3;
                int var14 = arg8 * 3;
                int var15 = arg9 * 3;
                int var16 = arg7 * 3;
                int var17 = arg6 * 3;
                int var18 = -arg0 + var15 + -var16 + arg2;
                int var19 = -var15 + -var15 + var16 + var13;
                int var20 = -arg4 + arg5 - (var17 - var14);
                int var21 = -var14 + var17 - -var12 + -var14;
                int var22 = var15 - var13;
                int var23 = -var12 + var14;
                for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                    int var25 = var24 * var24 >> 12;
                    int var26 = var24 * var25 >> 12;
                    int var27 = var18 * var26;
                    int var28 = var19 * var25;
                    int var29 = var20 * var26;
                    int var30 = var21 * var25;
                    int var31 = var22 * var24;
                    int var32 = (var27 + var31 + var28 >> 12) + arg0;
                    int var33 = var23 * var24;
                    int var34 = arg4 - -(var29 + var33 + var30 >> 12);
                    class103.method695(var32, var11, arg1, var10, 124, var34);
                    var11 = var34;
                    var10 = var32;
                }
            }
            ++field56;
        }
    }

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)I")
    public static final int method15(int arg0) {
        ++field63;
        try {
            if (arg0 != -2048) {
                return 124;
            } else {
                if (~class184.field3335 == -1) {
                    if (~class13.field340 < ~(class25.method182(true) + -5000L)) {
                        return 0;
                    }
                    class111.field2098 = class95.field1867.method1736(arg0 ^ 1955, class48.field1032, class48.field1048);
                    class90.field1786 = class25.method182(true);
                    class184.field3335 = 1;
                }
                if (class90.field1786 + 30000L < class25.method182(true)) {
                    return class23.method173(false, 1000);
                } else {
                    if (~class184.field3335 == -2) {
                        if (~class111.field2098.field4114 == -3) {
                            return class23.method173(false, 1001);
                        }
                        if (class111.field2098.field4114 != 1) {
                            return -1;
                        }
                        class166.field3023 = new class125((Socket) class111.field2098.field4117, class95.field1867);
                        class154.field2792.field3497 = 0;
                        int var1 = 0;
                        class111.field2098 = null;
                        if (class260.field4498) {
                            var1 = class249.field4348;
                        }
                        class154.field2792.method1288((byte) -73, 242);
                        class154.field2792.method1286(-11740, var1);
                        class166.field3023.method806(0, class154.field2792.field3497, class154.field2792.field3469, arg0 + 1937);
                        if (class30.field745 != null) {
                            class30.field745.method1575(0);
                        }
                        if (class93.field1843 != null) {
                            class93.field1843.method1575(0);
                        }
                        int var2 = class166.field3023.method800((byte) -126);
                        if (class30.field745 != null) {
                            class30.field745.method1575(0);
                        }
                        if (class93.field1843 != null) {
                            class93.field1843.method1575(0);
                        }
                        if (var2 != 0) {
                            return class23.method173(false, var2);
                        }
                        class184.field3335 = 2;
                    }
                    if (~class184.field3335 == -3) {
                        if (~class166.field3023.method803(-115) > -3) {
                            return -1;
                        }
                        class240.field4213 = class166.field3023.method800((byte) -126);
                        class240.field4213 <<= 8;
                        class240.field4213 += class166.field3023.method800((byte) -126);
                        class184.field3335 = 3;
                        class83.field1650 = new byte[class240.field4213];
                        class163.field2966 = 0;
                    }
                    if (~class184.field3335 == -4) {
                        int var3 = class166.field3023.method803(-90);
                        if (var3 < 1) {
                            return -1;
                        } else {
                            if (~var3 < ~(-class163.field2966 + class240.field4213)) {
                                var3 = -class163.field2966 + class240.field4213;
                            }
                            class166.field3023.method810(class163.field2966, arg0 ^ 2047, var3, class83.field1650);
                            class163.field2966 += var3;
                            if (~class240.field4213 < ~class163.field2966) {
                                return -1;
                            } else if (!class178.method1201(class83.field1650, arg0 ^ 2030)) {
                                return class23.method173(false, 1002);
                            } else {
                                class214.field3810 = new class130[class165.field3011];
                                int var4 = 0;
                                for (int var5 = class208.field3772; ~var5 >= ~field64; ++var5) {
                                    class130 var6 = class249.method1671(1824, var5);
                                    if (var6 != null) {
                                        class214.field3810[var4++] = var6;
                                    }
                                }
                                class166.field3023.method809((byte) 93);
                                class166.field3023 = null;
                                class83.field1650 = null;
                                class138.field2551 = 0;
                                class184.field3335 = 0;
                                class13.field340 = class25.method182(true);
                                return 0;
                            }
                        }
                    } else {
                        return -1;
                    }
                }
            }
        } catch (IOException var7) {
            return class23.method173(false, 1003);
        }
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(B)V")
    public static void method16(byte arg0) {
        if (arg0 < 103) {
            field59 = -64;
        }
        field55 = null;
        field67 = null;
        field57 = null;
        field65 = null;
        field62 = null;
        field66 = null;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)[I")
    public final int[] method17(int arg0, int arg1) {
        if (arg1 != 255) {
            field68 = -97;
        }
        ++field61;
        int[] var3 = super.field4511.method304(arg0, false);
        if (super.field4511.field1029) {
            class149.method978(var3, 0, class49.field1052, class275.field4825[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIILnj;JLnj;Lnj;)V")
    public static final void method18(int arg0, int arg1, int arg2, int arg3, class139 arg4, long arg5, class139 arg6, class139 arg7) {
        class164 var9 = new class164();
        var9.field2996 = arg4;
        var9.field2987 = arg1 * 128 + 64;
        var9.field2988 = arg2 * 128 + 64;
        var9.field2985 = arg3;
        var9.field2971 = arg5;
        var9.field2991 = arg6;
        var9.field2984 = arg7;
        int var10 = 0;
        class2 var11 = class18.field417[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field27; ++var12) {
                class70 var13 = var11.field37[var12];
                if ((var13.field1408 & 4194304L) == 4194304L) {
                    int var14 = var13.field1398.method106();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field2995 = -var10;
        if (class18.field417[arg0][arg1][arg2] == null) {
            class18.field417[arg0][arg1][arg2] = new class2(arg0, arg1, arg2);
        }
        class18.field417[arg0][arg1][arg2].field50 = var9;
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(II)I")
    public static final int method19(int arg0, int arg1) {
        int var2 = 63 & arg0;
        if (arg1 <= 121) {
            field59 = -95;
        }
        ++field60;
        int var3 = arg0 >> 6 & 3;
        if (~var2 != -19) {
            if (var2 == 19 || var2 == 21) {
                if (var3 == 0) {
                    return 16;
                }
                if (var3 == 1) {
                    return 32;
                }
                if (var3 == 2) {
                    return 64;
                }
                if (~var3 == -4) {
                    return 128;
                }
            }
        } else {
            if (var3 == 0) {
                return 1;
            }
            if (~var3 == -2) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
    public class3() {
        super(0, true);
    }
}
