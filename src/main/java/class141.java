import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class141 extends class211 {

    @OriginalMember(owner = "client!hh", name = "O", descriptor = "I")
    private int field1681 = 0;

    @OriginalMember(owner = "client!hh", name = "L", descriptor = "I")
    private int field1678 = 0;

    @OriginalMember(owner = "client!hh", name = "H", descriptor = "I")
    private int field1674 = 0;

    @OriginalMember(owner = "client!hh", name = "F", descriptor = "[Ljava/lang/String;")
    private static final String[] field1683 = new String[] { method1210(method1209("\u0015dh+8")), method1210(method1209("\u0013y*\u0002")), method1210(method1209("\u0015dh-8")), method1210(method1209("\u0006\"h@m")), method1210(method1209("\u0015dh/8")), method1210(method1209("\u0015dh'8")), method1210(method1209("\u0015dh*8")) };

    @OriginalMember(owner = "client!hh", name = "E", descriptor = "Lef;")
    public static class513 field1680 = new class513();

    @OriginalMember(owner = "client!hh", name = "Q", descriptor = "I")
    private int field1669;

    @OriginalMember(owner = "client!hh", name = "K", descriptor = "I")
    private int field1670;

    @OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!hh", name = "R", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!hh", name = "N", descriptor = "I")
    private int field1673;

    @OriginalMember(owner = "client!hh", name = "G", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!hh", name = "C", descriptor = "I")
    private int field1676;

    @OriginalMember(owner = "client!hh", name = "P", descriptor = "I")
    private int field1677;

    @OriginalMember(owner = "client!hh", name = "D", descriptor = "I")
    private int field1679;

    @OriginalMember(owner = "client!hh", name = "M", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V", line = 4)
    public class141() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIII)V", line = 9)
    private final void method1206(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field1675;
            int var5 = arg2 >= arg3 ? arg2 : arg3;
            int var6 = arg2 <= arg3 ? arg2 : arg3;
            int var7 = arg1 <= var5 ? var5 : arg1;
            int var8 = ~arg1 > ~var6 ? arg1 : var6;
            int var9 = var7 - var8;
            this.field1676 = (var7 + var8) / 2;
            if (this.field1676 > 0 && this.field1676 < 4096) {
                this.field1670 = (var9 << 12) / (~this.field1676 >= -2049 ? this.field1676 * 2 : -(this.field1676 * 2) + 8192);
            } else {
                this.field1670 = 0;
            }
            if (arg0 == -28614) {
                if (~var9 >= -1) {
                    this.field1673 = 0;
                } else {
                    int var10 = (-arg3 + var7 << 12) / var9;
                    int var11 = (-arg2 + var7 << 12) / var9;
                    int var12 = (-arg1 + var7 << 12) / var9;
                    if (arg3 == var7) {
                        this.field1673 = arg2 == var8 ? var12 + 20480 : -var11 + 4096;
                    } else if (arg2 != var7) {
                        this.field1673 = ~arg3 == ~var8 ? var11 + 12288 : -var10 + 20480;
                    } else {
                        this.field1673 = ~arg1 == ~var8 ? var10 + 4096 : -var12 + 12288;
                    }
                    this.field1673 /= 6;
                }
            }
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field1683[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)[[I", line = 65)
    public final int[][] method234(int arg0, int arg1) {
        try {
            ++field1671;
            if (arg1 > -38) {
                this.field1679 = 22;
            }
            int[][] var3 = super.field3230.method5463((byte) -8, arg0);
            if (super.field3230.field10931) {
                int[][] var4 = this.method1853(0, 0, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; var11 < class343.field5332; ++var11) {
                    this.method1206(-28614, var7[var11], var6[var11], var5[var11]);
                    this.field1670 += this.field1674;
                    this.field1673 += this.field1681;
                    this.field1676 += this.field1678;
                    while (~this.field1673 > -1) {
                        this.field1673 += 4096;
                    }
                    if (this.field1670 < 0) {
                        this.field1670 = 0;
                    }
                    while (~this.field1673 < -4097) {
                        this.field1673 -= 4096;
                    }
                    if (~this.field1670 < -4097) {
                        this.field1670 = 4096;
                    }
                    if (this.field1676 < 0) {
                        this.field1676 = 0;
                    }
                    if (~this.field1676 < -4097) {
                        this.field1676 = 4096;
                    }
                    this.method1208(this.field1670, this.field1676, 0, this.field1673);
                    var8[var11] = this.field1677;
                    var9[var11] = this.field1669;
                    var10[var11] = this.field1679;
                }
            }
            return var3;
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field1683[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(B)V", line = 141)
    public static void method1207(byte arg0) {
        try {
            if (arg0 != -71) {
                field1680 = null;
            }
            field1680 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1683[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BILib;)V", line = 154)
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (arg1 == 2) {
                        this.field1678 = (arg2.method1414(1) << 12) / 100;
                    }
                } else {
                    this.field1674 = (arg2.method1414(1) << 12) / 100;
                }
            } else {
                this.field1681 = arg2.method1442(65280);
            }
            if (arg0 < 67) {
                this.field1679 = 81;
            }
            ++field1672;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field1683[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1683[3] : field1683[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(IIII)V", line = 201)
    private final void method1208(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field1682;
            int var5 = ~arg1 < -2049 ? -(arg0 * arg1 >> 12) + arg1 + arg0 : (arg0 + 4096) * arg1 >> 12;
            if (var5 > arg2) {
                int var18 = arg3 * 6;
                int var6 = arg1 + arg1 + -var5;
                int var7 = (-var6 + var5 << 12) / var5;
                int var8 = var18 >> 12;
                int var9 = -(var8 << 12) + var18;
                int var11 = var7 * var5 >> 12;
                int var12 = var9 * var11 >> 12;
                int var13 = var6 + var12;
                int var14 = -var12 + var5;
                if (var8 == 0) {
                    this.field1669 = var13;
                    this.field1677 = var5;
                    this.field1679 = var6;
                    return;
                }
                if (var8 == 1) {
                    this.field1679 = var6;
                    this.field1669 = var5;
                    this.field1677 = var14;
                    return;
                }
                if (~var8 == -3) {
                    this.field1669 = var5;
                    this.field1677 = var6;
                    this.field1679 = var13;
                    return;
                }
                if (~var8 == -4) {
                    this.field1677 = var6;
                    this.field1679 = var5;
                    this.field1669 = var14;
                    return;
                }
                if (var8 == 4) {
                    this.field1679 = var5;
                    this.field1677 = var13;
                    this.field1669 = var6;
                    return;
                }
                if (~var8 == -6) {
                    this.field1669 = var6;
                    this.field1679 = var14;
                    this.field1677 = var5;
                    return;
                }
            } else {
                this.field1677 = this.field1669 = this.field1679 = arg1;
            }
        } catch (RuntimeException var17) {
            throw class759.method5498(var17, field1683[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1209(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 16);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1210(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 125;
                    break;
                case 1:
                    var10005 = 12;
                    break;
                case 2:
                    var10005 = 70;
                    break;
                case 3:
                    var10005 = 110;
                    break;
                default:
                    var10005 = 16;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
