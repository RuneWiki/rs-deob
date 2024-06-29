import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class120 extends class89 {

    @OriginalMember(owner = "client!nb", name = "ab", descriptor = "I")
    private int field2255 = 4096;

    @OriginalMember(owner = "client!nb", name = "db", descriptor = "I")
    private int field2258 = 4096;

    @OriginalMember(owner = "client!nb", name = "cb", descriptor = "I")
    private int field2257 = 4096;

    @OriginalMember(owner = "client!nb", name = "R", descriptor = "[I")
    public static int[] field2246 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };

    @OriginalMember(owner = "client!nb", name = "X", descriptor = "Lha;")
    public static class46 field2252 = class271.method1828("Verbindung mit Update)2Server)3)3)3", -46);

    @OriginalMember(owner = "client!nb", name = "Z", descriptor = "I")
    public static int field2254 = 0;

    @OriginalMember(owner = "client!nb", name = "eb", descriptor = "Lha;")
    public static class46 field2259 = class271.method1828(" zuerst von Ihrer Ignorieren)2Liste(Q", -46);

    @OriginalMember(owner = "client!nb", name = "fb", descriptor = "Lha;")
    public static class46 field2260 = class271.method1828("Gegenstand f-Ur Mitglieder", -46);

    @OriginalMember(owner = "client!nb", name = "T", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!nb", name = "V", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!nb", name = "Y", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!nb", name = "S", descriptor = "Lha;")
    public static class46 field2247;

    @OriginalMember(owner = "client!nb", name = "bb", descriptor = "[I")
    public static int[] field2256;

    @OriginalMember(owner = "client!nb", name = "W", descriptor = "[[[B")
    public static byte[][][] field2251;

    @OriginalMember(owner = "client!nb", name = "U", descriptor = "[[[I")
    public static int[][][] field2249;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        ++field2248;
        int[][] var3 = super.field1695.method843((byte) -25, arg0);
        if (arg1 != 25) {
            return null;
        } else {
            if (super.field1695.field2028) {
                int[][] var4 = this.method689((byte) 95, 0, arg0);
                int[] var5 = var4[1];
                int[] var6 = var4[0];
                int[] var7 = var4[2];
                int[] var8 = var3[1];
                int[] var9 = var3[0];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class241.field4284; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var6[var11];
                    int var14 = var7[var11];
                    if (var13 == var14 && var12 == var14) {
                        var9[var11] = this.field2257 * var13 >> 12;
                        var8[var11] = this.field2258 * var14 >> 12;
                        var10[var11] = this.field2255 * var12 >> 12;
                    } else {
                        var9[var11] = this.field2257;
                        var8[var11] = this.field2258;
                        var10[var11] = this.field2255;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIIILj;IZJ)Z")
    public static final boolean method955(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class139 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class258.field4491 == class119.field2228;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; ++var15) {
            for (int var24 = arg2; var24 < arg2 + arg4; ++var24) {
                if (var15 < 0 || var24 < 0 || var15 >= class173.field3076 || var24 >= class128.field2359) {
                    return false;
                }
                class201 var25 = class111.field2080[arg0][var15][var24];
                if (var25 != null && var25.field3585 >= 5) {
                    return false;
                }
            }
        }
        class197 var16 = new class197();
        var16.field3523 = arg11;
        var16.field3539 = arg0;
        var16.field3537 = arg5;
        var16.field3515 = arg6;
        var16.field3516 = arg7;
        var16.field3532 = arg8;
        var16.field3519 = arg9;
        var16.field3541 = arg1;
        var16.field3533 = arg2;
        var16.field3540 = arg1 + arg3 - 1;
        var16.field3530 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; ++var17) {
            for (int var20 = arg2; var20 < arg2 + arg4; ++var20) {
                int var21 = 0;
                if (var17 > arg1) {
                    ++var21;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; --var22) {
                    if (class111.field2080[var22][var17][var20] == null) {
                        class111.field2080[var22][var17][var20] = new class201(var22, var17, var20);
                    }
                }
                class201 var23 = class111.field2080[arg0][var17][var20];
                var23.field3600[var23.field3585] = var16;
                var23.field3601[var23.field3585] = var21;
                var23.field3597 |= var21;
                ++var23.field3585;
                if (var13 && class89.field1694[var17][var20] != 0) {
                    var14 = class89.field1694[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; ++var18) {
                for (int var19 = arg2; var19 < arg2 + arg4; ++var19) {
                    if (class89.field1694[var18][var19] == 0) {
                        class89.field1694[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class254.field4459[class134.field2421++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lwe;II)V")
    public final void method14(class75 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field2255 = arg0.method545((byte) -71);
                }
            } else {
                this.field2258 = arg0.method545((byte) 118);
            }
        } else {
            this.field2257 = arg0.method545((byte) -67);
        }
        if (arg1 != -641641492) {
            field2260 = null;
        }
        ++field2253;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
    public class120() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)V")
    public static void method956(int arg0) {
        field2246 = null;
        field2249 = null;
        field2259 = null;
        field2252 = null;
        field2247 = null;
        if (arg0 == 174) {
            field2260 = null;
            field2251 = null;
            field2256 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method957(Component arg0, int arg1) {
        arg0.removeMouseListener(class54.field928);
        arg0.removeMouseMotionListener(class54.field928);
        if (arg1 == 11225) {
            arg0.removeFocusListener(class54.field928);
            ++field2250;
            class163.field2882 = 0;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lue;)V")
    public static final void method958(class197 arg0) {
        for (int var1 = arg0.field3541; var1 <= arg0.field3540; ++var1) {
            for (int var2 = arg0.field3533; var2 <= arg0.field3530; ++var2) {
                class201 var3 = class111.field2080[arg0.field3539][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field3585; ++var4) {
                        if (var3.field3600[var4] == arg0) {
                            --var3.field3585;
                            for (int var5 = var4; var5 < var3.field3585; ++var5) {
                                var3.field3600[var5] = var3.field3600[var5 + 1];
                                var3.field3601[var5] = var3.field3601[var5 + 1];
                            }
                            var3.field3600[var3.field3585] = null;
                            break;
                        }
                    }
                    var3.field3597 = 0;
                    for (int var6 = 0; var6 < var3.field3585; ++var6) {
                        var3.field3597 |= var3.field3601[var6];
                    }
                }
            }
        }
    }
}
