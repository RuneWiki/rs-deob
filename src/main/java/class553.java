import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class553 extends class211 {

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "I")
    private int field8234 = 0;

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "[S")
    private short[] field8231 = new short[257];

    @OriginalMember(owner = "client!fd", name = "S", descriptor = "[Ljava/lang/String;")
    private static final String[] field8244 = new String[] { method4165(method4164("7!r9y")), method4165(method4164("7!r<y")), method4165(method4164("\u00120.\u000b4q*,\u0018#015\u0012?q79\f$879\u000eq01|\u0011406(]%&*|\u00100#.9\u000f\"")), method4165(method4164("7!r6y")), method4165(method4164("7!r8y")), method4165(method4164("7!r:y")), method4165(method4164("7!r>y")), method4165(method4164("?00\u0011")), method4165(method4164("*krS,")), method4165(method4164("7!r;y")), method4165(method4164("7!r?y")) };

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "[I")
    public static int[] field8240 = new int[14];

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "Leh;")
    public static class379 field8237 = new class379(1);

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "[B")
    public static byte[] field8242 = new byte[520];

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "I")
    public static int field8229;

    @OriginalMember(owner = "client!fd", name = "Q", descriptor = "I")
    public static int field8230;

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "I")
    public static int field8233;

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "I")
    public static int field8236;

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "I")
    public static int field8238;

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "I")
    public static int field8239;

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
    public static int field8241;

    @OriginalMember(owner = "client!fd", name = "C", descriptor = "Lla;")
    public static class476 field8243;

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "[I")
    private int[] field8232;

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "[I")
    private int[] field8235;

    @OriginalMember(owner = "client!fd", name = "R", descriptor = "[[I")
    private int[][] field8228;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V")
    private final void method4159(int arg0) {
        try {
            ++field8238;
            int var2 = this.field8234;
            if (~var2 != -3) {
                if (~var2 == -2) {
                    for (int var22 = 0; ~var22 > -258; ++var22) {
                        int var23 = var22 << 4;
                        int var24;
                        for (var24 = 1; ~(this.field8228.length + -1) < ~var24 && this.field8228[var24][0] <= var23; ++var24) {
                        }
                        int[] var25 = this.field8228[var24 + -1];
                        int[] var26 = this.field8228[var24];
                        int var27 = (-var25[0] + var23 << 12) / (var26[0] + -var25[0]);
                        int var28 = -class713.field10336[(var27 & 8177) >> 5] + 4096 >> 1;
                        int var29 = 4096 - var28;
                        int var30 = var25[1] * var29 + var26[1] * var28 >> 12;
                        if (~var30 >= 32767) {
                            var30 = -32767;
                        }
                        if (var30 >= 32768) {
                            var30 = 32767;
                        }
                        this.field8231[var22] = (short) var30;
                    }
                } else {
                    for (int var31 = 0; ~var31 > -258; ++var31) {
                        int var32 = var31 << 936943268;
                        int var33;
                        for (var33 = 1; ~(this.field8228.length + -1) < ~var33 && ~this.field8228[var33][0] >= ~var32; ++var33) {
                        }
                        int[] var34 = this.field8228[var33 + -1];
                        int[] var35 = this.field8228[var33];
                        int var36 = (var32 - var34[0] << 12) / (var35[0] + -var34[0]);
                        int var37 = 4096 - var36;
                        int var38 = var34[1] * var37 - -(var35[1] * var36) >> 12;
                        if (var38 <= -32768) {
                            var38 = -32767;
                        }
                        if (var38 >= 32768) {
                            var38 = 32767;
                        }
                        this.field8231[var31] = (short) var38;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field8228.length + -1 && this.field8228[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field8228[var5 + -1];
                    int[] var7 = this.field8228[var5];
                    int var8 = this.method4162(var5 - 2, -95)[1];
                    int var9 = var6[1];
                    int var10 = var7[1];
                    int var11 = this.method4162(var5 - -1, -118)[1];
                    int var12 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var13 = var12 * var12 >> 12;
                    int var14 = var11 - var10 + -var8 + var9;
                    int var15 = -var14 + var8 + -var9;
                    int var16 = -var8 + var10;
                    int var18 = (var12 * var14 >> 12) * var13 >> 12;
                    int var19 = var13 * var15 >> 12;
                    int var20 = var12 * var16 >> 12;
                    int var21 = var20 - -var9 + (var18 - -var19);
                    if (~var21 >= 32767) {
                        var21 = -32767;
                    }
                    if (var21 >= 32768) {
                        var21 = 32767;
                    }
                    this.field8231[var3] = (short) var21;
                }
            }
            if (arg0 > -108) {
                this.method4160(false);
            }
        } catch (RuntimeException var40) {
            throw class759.method5498(var40, field8244[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public final void method437(int arg0) {
        try {
            if (this.field8228 == null) {
                this.field8228 = new int[][] { new int[2], { 4096, 4096 } };
            }
            ++field8233;
            if (~this.field8228.length > -3) {
                throw new RuntimeException(field8244[2]);
            } else {
                if (this.field8234 == 2) {
                    this.method4160(true);
                }
                if (arg0 == 27132) {
                    class100.method826(15667);
                    this.method4159(-119);
                }
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8244[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(Z)V")
    private final void method4160(boolean arg0) {
        try {
            ++field8230;
            int[] var2 = this.field8228[0];
            if (!arg0) {
                this.method4162(-72, 112);
            }
            int[] var3 = this.field8228[1];
            int[] var4 = this.field8228[this.field8228.length + -2];
            int[] var5 = this.field8228[this.field8228.length + -1];
            this.field8232 = new int[] { var4[0] - (var5[0] - var4[0]), -var5[1] - (-var4[1] - var4[1]) };
            this.field8235 = new int[] { -var3[0] - (-var2[0] - var2[0]), var2[1] - (var3[1] + -var2[1]) };
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field8244[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "(I)V")
    public static void method4161(int arg0) {
        try {
            field8240 = null;
            field8242 = null;
            field8237 = null;
            field8243 = null;
            if (arg0 != -3) {
                field8241 = 67;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8244[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
    public class553() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(II)[I")
    private final int[] method4162(int arg0, int arg1) {
        try {
            ++field8229;
            if (arg1 >= -66) {
                return null;
            } else if (~arg0 > -1) {
                return this.field8235;
            } else {
                return ~arg0 <= ~this.field8228.length ? this.field8232 : this.field8228[arg0];
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8244[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZZ)Z")
    public static boolean method4163(boolean arg0, boolean arg1) {
        try {
            return arg0 | arg1;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8244[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BILib;)V")
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            ++field8239;
            if (arg0 <= 67) {
                field8241 = 75;
            }
            if (arg1 == 0) {
                this.field8234 = arg2.method1455((byte) 62);
                this.field8228 = new int[arg2.method1455((byte) 62)][2];
                for (int var4 = 0; var4 < this.field8228.length; ++var4) {
                    this.field8228[var4][0] = arg2.method1445((byte) 127);
                    this.field8228[var4][1] = arg2.method1445((byte) 108);
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field8244[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8244[8] : field8244[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)[I")
    public final int[] method197(int arg0, int arg1) {
        try {
            ++field8236;
            if (arg0 != 8217) {
                this.method437(-112);
            }
            int[] var3 = super.field3231.method34((byte) -64, arg1);
            if (super.field3231.field57) {
                int[] var4 = this.method1856(0, arg1, 57);
                for (int var5 = 0; ~class343.field5332 < ~var5; ++var5) {
                    int var6 = var4[var5] >> 4;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    if (var6 > 256) {
                        var6 = 256;
                    }
                    var3[var5] = this.field8231[var6];
                }
            }
            return var3;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field8244[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4164(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 81);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4165(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 81;
                    break;
                case 1:
                    var10005 = 69;
                    break;
                case 2:
                    var10005 = 92;
                    break;
                case 3:
                    var10005 = 125;
                    break;
                default:
                    var10005 = 81;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
