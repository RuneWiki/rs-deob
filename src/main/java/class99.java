import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class99 extends class518 {

    @OriginalMember(owner = "client!hr", name = "L", descriptor = "I")
    private int field1335 = 0;

    @OriginalMember(owner = "client!hr", name = "J", descriptor = "[S")
    private short[] field1348 = new short[257];

    @OriginalMember(owner = "client!hr", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field1349 = new String[] { method975(method974(" `=\tE")), method975(method974(" `=\rE")), method975(method974(" `=\u0005E")), method975(method974("\u000bga9\bh}c*\u001f)fz \u0003h`v>\u0018!`v<M)f3#\b)ago\u0019?}3\"\f:yv=\u001e")), method975(method974(" `=\bE")), method975(method974("3<=a\u0010")), method975(method974("&g\u007f#")), method975(method974(" `=\fE")), method975(method974(" `=\u000bE")), method975(method974(" `=\nE")) };

    @OriginalMember(owner = "client!hr", name = "E", descriptor = "[Lmc;")
    public static class337[] field1336 = new class337[8];

    @OriginalMember(owner = "client!hr", name = "N", descriptor = "Lsb;")
    public static class261 field1334 = new class261(65, 3);

    @OriginalMember(owner = "client!hr", name = "P", descriptor = "[I")
    public static int[] field1344 = new int[2];

    @OriginalMember(owner = "client!hr", name = "H", descriptor = "Z")
    public static boolean field1345 = false;

    @OriginalMember(owner = "client!hr", name = "G", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!hr", name = "K", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!hr", name = "M", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!hr", name = "F", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!hr", name = "Q", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!hr", name = "B", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!hr", name = "D", descriptor = "[I")
    private int[] field1341;

    @OriginalMember(owner = "client!hr", name = "O", descriptor = "[I")
    private int[] field1346;

    @OriginalMember(owner = "client!hr", name = "I", descriptor = "[[I")
    private int[][] field1339;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "(I)V")
    private final void method970(int arg0) {
        try {
            ++field1338;
            int var2 = this.field1335;
            if (~var2 != -3) {
                if (~var2 == -2) {
                    for (int var22 = 0; var22 < 257; ++var22) {
                        int var23 = var22 << 4;
                        int var24;
                        for (var24 = 1; var24 < this.field1339.length + -1 && var23 >= this.field1339[var24][0]; ++var24) {
                        }
                        int[] var25 = this.field1339[var24 + -1];
                        int[] var26 = this.field1339[var24];
                        int var27 = (-var25[0] + var23 << 12) / (var26[0] + -var25[0]);
                        int var28 = -class412.field5931[var27 >> 5 & 255] + 4096 >> 1;
                        int var29 = 4096 - var28;
                        int var30 = var25[1] * var29 + var26[1] * var28 >> 12;
                        if (~var30 >= 32767) {
                            var30 = -32767;
                        }
                        if (~var30 <= -32769) {
                            var30 = 32767;
                        }
                        this.field1348[var22] = (short) var30;
                    }
                } else {
                    for (int var31 = 0; var31 < 257; ++var31) {
                        int var32 = var31 << 2085635396;
                        int var33;
                        for (var33 = 1; ~var33 > ~(this.field1339.length + -1) && ~var32 <= ~this.field1339[var33][0]; ++var33) {
                        }
                        int[] var34 = this.field1339[var33 - 1];
                        int[] var35 = this.field1339[var33];
                        int var36 = (-var34[0] + var32 << 12) / (var35[0] + -var34[0]);
                        int var37 = 4096 - var36;
                        int var38 = var34[1] * var37 + var35[1] * var36 >> 12;
                        if (var38 <= -32768) {
                            var38 = -32767;
                        }
                        if (var38 >= 32768) {
                            var38 = 32767;
                        }
                        this.field1348[var31] = (short) var38;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~(this.field1339.length + -1) < ~var5 && var4 >= this.field1339[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field1339[var5 + -1];
                    int[] var7 = this.field1339[var5];
                    int var8 = this.method971(-124, var5 + -2)[1];
                    int var9 = var6[1];
                    int var10 = var7[1];
                    int var11 = this.method971(-95, var5 + 1)[1];
                    int var12 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var13 = var12 * var12 >> 12;
                    int var14 = var11 - (-var9 + var10) + -var8;
                    int var15 = -var9 + var8 + -var14;
                    int var16 = -var8 + var10;
                    int var18 = (var12 * var14 >> 12) * var13 >> 12;
                    int var19 = var13 * var15 >> 12;
                    int var20 = var12 * var16 >> 12;
                    int var21 = var9 + var18 + var19 + var20;
                    if (~var21 >= 32767) {
                        var21 = -32767;
                    }
                    if (var21 >= 32768) {
                        var21 = 32767;
                    }
                    this.field1348[var3] = (short) var21;
                }
            }
            if (arg0 != 1) {
                this.method17(-122, (class711) null, 112);
            }
        } catch (RuntimeException var40) {
            throw class665.method4799(var40, field1349[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(II)[I")
    private final int[] method971(int arg0, int arg1) {
        try {
            ++field1340;
            if (arg1 < 0) {
                return this.field1341;
            } else if (arg1 >= this.field1339.length) {
                return this.field1346;
            } else {
                if (arg0 > -74) {
                    this.method971(-69, -72);
                }
                return this.field1339[arg1];
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1349[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "()V")
    public class99() {
        super(1, true);
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(II)[I")
    public final int[] method14(int arg0, int arg1) {
        try {
            ++field1347;
            int[] var3 = super.field7564.method4462(26041, arg0);
            if (super.field7564.field8652) {
                int[] var4 = this.method3944(arg0, 0, (byte) 73);
                for (int var5 = 0; class110.field1436 > var5; ++var5) {
                    int var6 = var4[var5] >> 4;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    if (~var6 < -257) {
                        var6 = 256;
                    }
                    var3[var5] = this.field1348[var6];
                }
            }
            int var7 = -3 % ((arg1 - -57) / 55);
            return var3;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field1349[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "(I)V")
    public static void method972(int arg0) {
        try {
            field1334 = null;
            field1336 = null;
            field1344 = null;
            if (arg0 <= 112) {
                field1345 = false;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1349[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)V")
    public final void method12(int arg0) {
        try {
            ++field1342;
            if (this.field1339 == null) {
                this.field1339 = new int[][] { new int[2], { 4096, 4096 } };
            }
            if (~this.field1339.length > -3) {
                throw new RuntimeException(field1349[3]);
            } else {
                if (this.field1335 == 2) {
                    this.method973(-63);
                }
                class119.method1079(1);
                if (arg0 < 38) {
                    field1334 = null;
                }
                this.method970(1);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1349[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILjc;I)V")
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            if (arg2 != -3) {
                field1344 = null;
            }
            ++field1343;
            if (arg0 == 0) {
                this.field1335 = arg1.method5128(0);
                this.field1339 = new int[arg1.method5128(0)][2];
                for (int var4 = 0; ~this.field1339.length < ~var4; ++var4) {
                    this.field1339[var4][0] = arg1.method5116((byte) -119);
                    this.field1339[var4][1] = arg1.method5116((byte) -113);
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field1349[7] + arg0 + ',' + (arg1 != null ? field1349[5] : field1349[6]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "(I)V")
    private final void method973(int arg0) {
        try {
            ++field1337;
            if (arg0 < -38) {
                int[] var2 = this.field1339[0];
                int[] var3 = this.field1339[1];
                int[] var4 = this.field1339[this.field1339.length + -2];
                int[] var5 = this.field1339[this.field1339.length + -1];
                this.field1346 = new int[] { var4[0] + -var5[0] + var4[0], -var5[1] - (-var4[1] - var4[1]) };
                this.field1341 = new int[] { var2[0] - var3[0] + var2[0], var2[1] - var3[1] + var2[1] };
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field1349[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method974(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 109);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method975(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 72;
                    break;
                case 1:
                    var10005 = 18;
                    break;
                case 2:
                    var10005 = 19;
                    break;
                case 3:
                    var10005 = 79;
                    break;
                default:
                    var10005 = 109;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
