import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class34 extends class99 {

    @OriginalMember(owner = "client!va", name = "S", descriptor = "I")
    private int field504 = 0;

    @OriginalMember(owner = "client!va", name = "Y", descriptor = "I")
    private int field510 = 1365;

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "I")
    private int field511 = 20;

    @OriginalMember(owner = "client!va", name = "bb", descriptor = "I")
    private int field513 = 0;

    @OriginalMember(owner = "client!va", name = "V", descriptor = "Lr;")
    public static class66 field507 = class93.method641(43, "mapflag");

    @OriginalMember(owner = "client!va", name = "W", descriptor = "[I")
    public static int[] field508 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!va", name = "R", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!va", name = "T", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!va", name = "U", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!va", name = "ab", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!va", name = "db", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!va", name = "X", descriptor = "[S")
    public static short[] field509;

    @OriginalMember(owner = "client!va", name = "cb", descriptor = "[[[B")
    public static byte[][][] field514;

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
    public class34() {
        super(0, true);
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(III)I")
    public static final int method191(int arg0, int arg1, int arg2) {
        ++field515;
        class15 var3 = (class15) class84.field1631.method1381((long) arg1, arg2 ^ -20597);
        if (arg2 != 20558) {
            method192((byte) 96, (class249) null);
        }
        if (var3 == null) {
            return 0;
        } else {
            return ~arg0 <= -1 && var3.field192.length > arg0 ? var3.field192[arg0] : 0;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BLlh;)V")
    public static final void method192(byte arg0, class249 arg1) {
        while (~arg1.field4335 > ~arg1.field4350.length) {
            int var2 = 0;
            boolean var3 = false;
            int var4 = 0;
            if (arg1.method1677(-6677) == 1) {
                var2 = arg1.method1677(-6677);
                var4 = arg1.method1677(-6677);
                var3 = true;
            }
            int var5 = arg1.method1677(-6677);
            int var6 = arg1.method1677(-6677);
            int var7 = var5 * 64 + -class73.field1439;
            int var8 = class89.field1727 - (-class16.field208 + 1) - var6 * 64;
            if (~var7 <= -1 && var8 + -63 >= 0 && var7 + 63 < class33.field500 && class89.field1727 > var8) {
                int var9 = var7 >> 6;
                int var10 = var8 >> 6;
                for (int var11 = 0; var11 < 64; ++var11) {
                    for (int var12 = 0; var12 < 64; ++var12) {
                        if (!var3 || ~(var2 * 8) >= ~var11 && ~var11 > ~(var2 * 8 + 8) && var4 * 8 <= var12 && ~(var4 * 8 + 8) < ~var12) {
                            byte var13 = arg1.method1682(3390);
                            if (~var13 != -1) {
                                if (class234.field4087[var9][var10] == null) {
                                    class234.field4087[var9][var10] = new byte[4096];
                                }
                                class234.field4087[var9][var10][(-var12 + 63 << 6) + var11] = var13;
                                byte var14 = arg1.method1682(3390);
                                if (class129.field2408[var9][var10] == null) {
                                    class129.field2408[var9][var10] = new byte[4096];
                                }
                                class129.field2408[var9][var10][(-var12 + 63 << 6) + var11] = var14;
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < (!var3 ? 4096 : 64); ++var15) {
                    byte var16 = arg1.method1682(arg0 + 3321);
                    if (~var16 != -1) {
                        ++arg1.field4335;
                    }
                }
            }
        }
        ++field506;
        if (arg0 != 69) {
            field509 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        ++field502;
        if (arg2 != -1) {
            this.field504 = -80;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 == -4) {
                        this.field504 = arg0.method1674(arg2 + 1355769545);
                    }
                } else {
                    this.field513 = arg0.method1674(arg2 ^ -1355769545);
                }
            } else {
                this.field511 = arg0.method1674(1355769544);
            }
        } else {
            this.field510 = arg0.method1674(arg2 ^ -1355769545);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BI)[I")
    public final int[] method10(byte arg0, int arg1) {
        if (arg0 != -61) {
            field514 = null;
        }
        int[] var3 = super.field1943.method749(false, arg1);
        if (super.field1943.field2147) {
            for (int var4 = 0; class199.field3432 > var4; ++var4) {
                int var5 = (class10.field120[var4] << 12) / this.field510 + this.field513;
                int var6 = (class19.field261[arg1] << 12) / this.field510 + this.field504;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = 0;
                int var12 = var6 * var6 >> 12;
                int var13 = var5 * var5 >> 12;
                while (~(var12 + var13) > -16385 && ~this.field511 < ~var11) {
                    ++var11;
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var7 + var13 + -var12;
                    var13 = var9 * var9 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = var11 >= this.field511 + -1 ? 0 : (var11 << 12) / this.field511;
            }
        }
        ++field503;
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(BI)V")
    public static final void method193(byte arg0, int arg1) {
        ++field505;
        class99.method684(0);
        class163.method1097(arg0 + -65);
        int var2 = class261.method1779(-85, arg1).field3049;
        if (~var2 != -1) {
            int var3 = class89.field1726[arg1];
            if (arg0 == 67) {
                if (var2 == 9) {
                    class158.field2849 = var3;
                }
                if (~var2 == -7) {
                    class199.field3441 = var3;
                }
                if (var2 == 5) {
                    class133.field2475 = var3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(B)V")
    public static void method194(byte arg0) {
        field509 = null;
        field514 = null;
        if (arg0 < -121) {
            field508 = null;
            field507 = null;
        }
    }
}
