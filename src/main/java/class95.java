import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public class class95 extends class232 {

    @OriginalMember(owner = "client!eha", name = "O", descriptor = "[S")
    private short[] field1387 = new short[257];

    @OriginalMember(owner = "client!eha", name = "N", descriptor = "I")
    private int field1392 = 0;

    @OriginalMember(owner = "client!eha", name = "G", descriptor = "[Ljava/lang/String;")
    private static final String[] field1393 = new String[] { method924(method923("\nK\n\u0016}G")), method924(method923("\nK\n\u0016zG")), method924(method923(",V\u0019N^OL\u001b]I\u000eW\u0002WUOQ\u000eIN\u0006Q\u000eK\u001b\u000eWKT^\u000eP\u001f\u0018O\u0018LKUZ\u001dH\u000eJH")), method924(method923("\nK\n\u0016xG")), method924(method923("\nK\n\u0016\u007fG")), method924(method923("\nK\n\u0016vG")), method924(method923("\nK\n\u0016qG")), method924(method923("\nK\n\u0016wG")), method924(method923("\nK\n\u0016uG")), method924(method923("\nK\n\u0016pG")), method924(method923("\u0001V\u0007T")), method924(method923("\nK\n\u0016~G")), method924(method923("\u0014\rE\u0016F")) };

    @OriginalMember(owner = "client!eha", name = "S", descriptor = "Lhl;")
    public static class556 field1378 = new class556(139, 3);

    @OriginalMember(owner = "client!eha", name = "L", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!eha", name = "I", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!eha", name = "Q", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!eha", name = "J", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!eha", name = "W", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!eha", name = "V", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!eha", name = "H", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!eha", name = "T", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!eha", name = "K", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!eha", name = "M", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!eha", name = "P", descriptor = "[I")
    private int[] field1382;

    @OriginalMember(owner = "client!eha", name = "U", descriptor = "[I")
    private int[] field1384;

    @OriginalMember(owner = "client!eha", name = "R", descriptor = "[[I")
    private int[][] field1386;

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        try {
            ++field1377;
            int[] var3 = super.field3601.method3467(arg0, (byte) -61);
            if (arg1 != 123) {
                field1383 = -21;
            }
            if (super.field3601.field6907) {
                int[] var4 = this.method2022(arg0, 0, 0);
                for (int var5 = 0; ~class449.field6969 < ~var5; ++var5) {
                    int var6 = var4[var5] >> 4;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    if (~var6 < -257) {
                        var6 = 256;
                    }
                    var3[var5] = this.field1387[var6];
                }
            }
            return var3;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field1393[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eha", name = "<init>", descriptor = "()V")
    public class95() {
        super(1, true);
    }

    @OriginalMember(owner = "client!eha", name = "d", descriptor = "(I)V")
    private final void method916(int arg0) {
        try {
            ++field1379;
            if (arg0 < -98) {
                int[] var2 = this.field1386[0];
                int[] var3 = this.field1386[1];
                int[] var4 = this.field1386[this.field1386.length + -2];
                int[] var5 = this.field1386[this.field1386.length + -1];
                this.field1384 = new int[] { var4[0] - var5[0] + var4[0], var4[1] + -var5[1] + var4[1] };
                this.field1382 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] + -var3[1] + var2[1] };
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field1393[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eha", name = "e", descriptor = "(I)V")
    public static void method917(int arg0) {
        try {
            if (arg0 != 18239) {
                method921(108, false, -17);
            }
            field1378 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1393[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eha", name = "c", descriptor = "(B)V")
    public static final void method918(byte arg0) {
        try {
            ++field1381;
            int var1 = -97 % ((arg0 - -20) / 33);
            class30.field320 = null;
            class478.field7266 = -1;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1393[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eha", name = "c", descriptor = "(III)I")
    public static final int method919(int arg0, int arg1, int arg2) {
        try {
            ++field1390;
            int var3 = -128 + (class279.method2395(4, arg1 ^ 172, arg2 + 91923, arg0 + 45365) + (class279.method2395(2, arg1 ^ 202, arg2 + 37821, arg0 + 10294) - arg1 >> 1) - -(class279.method2395(1, 48, arg2, arg0) + -128 >> 2));
            int var4 = (int) ((double) var3 * 0.3D) + 35;
            if (var4 < 10) {
                var4 = 10;
            } else if (var4 > 60) {
                var4 = 60;
            }
            return var4;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field1393[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(ILwq;I)V")
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            if (~arg2 == -1) {
                this.field1392 = arg1.method1645((byte) -71);
                this.field1386 = new int[arg1.method1645((byte) -106)][2];
                for (int var4 = 0; ~var4 > ~this.field1386.length; ++var4) {
                    this.field1386[var4][0] = arg1.method1687((byte) -108);
                    this.field1386[var4][1] = arg1.method1687((byte) -51);
                }
            }
            if (arg0 > 96) {
                ++field1391;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field1393[11] + arg0 + ',' + (arg1 != null ? field1393[12] : field1393[10]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!eha", name = "c", descriptor = "(II)[I")
    private final int[] method920(int arg0, int arg1) {
        try {
            ++field1380;
            if (arg0 < 0) {
                return this.field1382;
            } else if (arg1 != 29290) {
                return null;
            } else {
                return arg0 >= this.field1386.length ? this.field1384 : this.field1386[arg0];
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1393[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(IZI)V")
    public static final void method921(int arg0, boolean arg1, int arg2) {
        try {
            ++field1389;
            if (!arg1) {
                field1378 = null;
            }
            if (class305.field4924 != class117.field1711) {
                if (!class101.method959(0, arg2, arg0, 1, 626, 1, 0, false, -3)) {
                    class101.method959(0, arg2, arg0, 1, 626, 1, 0, false, -2);
                }
            } else if (!class101.method959(0, arg2, arg0, 1, 626, 1, 0, false, -2)) {
                class101.method959(0, arg2, arg0, 1, 626, 1, 0, false, -3);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1393[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(B)V")
    public final void method67(byte arg0) {
        try {
            int var2 = -112 % ((arg0 - 73) / 34);
            if (this.field1386 == null) {
                this.field1386 = new int[][] { new int[2], { 4096, 4096 } };
            }
            ++field1385;
            if (this.field1386.length < 2) {
                throw new RuntimeException(field1393[2]);
            } else {
                if (this.field1392 == 2) {
                    this.method916(-99);
                }
                class204.method1843((byte) 92);
                this.method922((byte) 69);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1393[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eha", name = "b", descriptor = "(B)V")
    private final void method922(byte arg0) {
        try {
            if (arg0 != 69) {
                field1383 = 64;
            }
            int var2 = this.field1392;
            if (var2 != 2) {
                if (var2 == 1) {
                    for (int var22 = 0; var22 < 257; ++var22) {
                        int var23 = var22 << 4;
                        int var24;
                        for (var24 = 1; ~var24 > ~(this.field1386.length + -1) && var23 >= this.field1386[var24][0]; ++var24) {
                        }
                        int[] var25 = this.field1386[var24 + -1];
                        int[] var26 = this.field1386[var24];
                        int var27 = (var23 - var25[0] << 12) / (var26[0] + -var25[0]);
                        int var28 = 4096 - class266.field4305[(var27 & 8178) >> 5] >> 1;
                        int var29 = -var28 + 4096;
                        int var30 = var25[1] * var29 + var26[1] * var28 >> 12;
                        if (var30 <= -32768) {
                            var30 = -32767;
                        }
                        if (~var30 <= -32769) {
                            var30 = 32767;
                        }
                        this.field1387[var22] = (short) var30;
                    }
                } else {
                    for (int var31 = 0; ~var31 > -258; ++var31) {
                        int var32 = var31 << 4;
                        int var33;
                        for (var33 = 1; ~(this.field1386.length + -1) < ~var33 && ~this.field1386[var33][0] >= ~var32; ++var33) {
                        }
                        int[] var34 = this.field1386[var33 + -1];
                        int[] var35 = this.field1386[var33];
                        int var36 = (-var34[0] + var32 << 12) / (var35[0] + -var34[0]);
                        int var37 = -var36 + 4096;
                        int var38 = var34[1] * var37 - -(var35[1] * var36) >> 12;
                        if (~var38 >= 32767) {
                            var38 = -32767;
                        }
                        if (var38 >= 32768) {
                            var38 = 32767;
                        }
                        this.field1387[var31] = (short) var38;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field1386.length + -1 && this.field1386[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field1386[var5 + -1];
                    int[] var7 = this.field1386[var5];
                    int var8 = this.method920(var5 - 2, arg0 + 29221)[1];
                    int var9 = var6[1];
                    int var10 = var7[1];
                    int var11 = this.method920(var5 + 1, 29290)[1];
                    int var12 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var13 = var12 * var12 >> 12;
                    int var14 = -var10 + var11 + var9 + -var8;
                    int var15 = var8 - (var9 - -var14);
                    int var16 = -var8 + var10;
                    int var18 = (var12 * var14 >> 12) * var13 >> 12;
                    int var19 = var13 * var15 >> 12;
                    int var20 = var12 * var16 >> 12;
                    int var21 = var18 + var19 + var20 + var9;
                    if (var21 <= -32768) {
                        var21 = -32767;
                    }
                    if (~var21 <= -32769) {
                        var21 = 32767;
                    }
                    this.field1387[var3] = (short) var21;
                }
            }
            ++field1388;
        } catch (RuntimeException var40) {
            throw class590.method4333(var40, field1393[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method923(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 59);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method924(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 111;
                    break;
                case 1:
                    var10005 = 35;
                    break;
                case 2:
                    var10005 = 107;
                    break;
                case 3:
                    var10005 = 56;
                    break;
                default:
                    var10005 = 59;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
