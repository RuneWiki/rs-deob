import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class712 extends class497 {

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10016 = new String[] { method5159(method5158(",bXb\u001f")), method5159(method5158(",bXn\u001f")), method5159(method5158("3'X\u0004J")), method5159(method5158(",bXf\u001f")), method5159(method5158("&|\u001aF")), method5159(method5158(",bXi\u001f")), method5159(method5158(",bXh\u001f")), method5159(method5158(",bXo\u001f")), method5159(method5158(",bXc\u001f")), method5159(method5158(",bXk\u001f")), method5159(method5158(",bXm\u001f")), method5159(method5158(",bXl\u001f")) };

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public static int field10004;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    public static int field10005;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public static int field10006;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    public static int field10007;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field10008;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field10009;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public static int field10010;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
    public static int field10011;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public static int field10012;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    public static int field10013;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public static int field10014;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
    public static int field10015;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIII)V", line = 3)
    public static final void method5152(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field10010;
            int var6 = arg4;
            int var7 = arg0;
            int var8 = arg2 * arg2;
            int var9 = arg0 * arg0;
            int var10 = var9 << 1;
            int var11 = var8 << 1;
            int var12 = arg0 << 1;
            int var13 = (-var12 + 1) * var8 + var10;
            int var14 = var9 - (var12 - 1) * var11;
            int var15 = var8 << 2;
            int var16 = var9 << 2;
            int var17 = ((arg4 << 1) - -3) * var10;
            int var18 = ((arg0 << 1) + -3) * var11;
            int var19 = (arg4 + 1) * var16;
            class576.method4282(arg4 ^ -7, -arg2 + arg1, arg5, class529.field7682[arg3], arg1 + arg2);
            int var20 = (arg0 + -1) * var15;
            while (~var7 < -1) {
                if (var13 < 0) {
                    while (~var13 > -1) {
                        var13 += var17;
                        var14 += var19;
                        var17 += var16;
                        ++var6;
                        var19 += var16;
                    }
                }
                if (~var14 > -1) {
                    var13 += var17;
                    var14 += var19;
                    var19 += var16;
                    var17 += var16;
                    ++var6;
                }
                var13 += -var20;
                var14 += -var18;
                var20 -= var15;
                --var7;
                var18 -= var15;
                int var21 = -var7 + arg3;
                int var22 = arg3 - -var7;
                int var23 = arg1 + var6;
                int var24 = -var6 + arg1;
                class576.method4282(-7, var24, arg5, class529.field7682[var21], var23);
                class576.method4282(-7, var24, arg5, class529.field7682[var22], var23);
            }
        } catch (RuntimeException var26) {
            throw class665.method4799(var26, field10016[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)I", line = 83)
    public final int method5153(int arg0) {
        try {
            if (arg0 != 3) {
                return -115;
            } else {
                ++field10011;
                return super.field7292;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10016[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILqo;)V", line = 94)
    public static final void method5154(int arg0, class170 arg1) {
        try {
            ++field10004;
            if (arg1 instanceof class717) {
                class717 var2 = (class717) arg1;
                if (var2.field10229 != null) {
                    class560.method4189(true, ~class203.field2988.field2981 != ~var2.field2981, var2);
                }
            } else if (arg1 instanceof class339) {
                class339 var3 = (class339) arg1;
                class228.method1897(false, var3, class203.field2988.field2981 != var3.field2981);
            }
            if (arg0 < 61) {
                field10013 = 77;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field10016[3] + arg0 + ',' + (arg1 != null ? field10016[2] : field10016[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)I", line = 124)
    public final int method1032(int arg0) {
        try {
            ++field10014;
            if (arg0 > -101) {
                method5154(-6, (class170) null);
            }
            return 0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10016[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)Z", line = 135)
    public final boolean method5155(int arg0) {
        try {
            if (arg0 >= -127) {
                return false;
            } else {
                ++field10012;
                return true;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10016[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V", line = 147)
    public final void method1031(byte arg0) {
        try {
            if (arg0 < -70) {
                ++field10015;
                if (this.method5157((byte) 108)) {
                    if (super.field7293.field9134.method4716(0) && !class226.method1892((byte) -22, super.field7293.field9134.method4717(3))) {
                        super.field7292 = 1;
                    }
                    if (super.field7293.field9119.method1595(3) == 1) {
                        super.field7292 = 1;
                    }
                }
                if (~super.field7292 == -4) {
                    super.field7292 = 2;
                }
                if (super.field7292 < 0 || super.field7292 > 3) {
                    super.field7292 = this.method1032(-102);
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10016[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)V", line = 176)
    public final void method1030(int arg0, int arg1) {
        try {
            super.field7292 = arg1;
            ++field10009;
            if (arg0 != 64) {
                field10013 = 62;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10016[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)[B", line = 194)
    public static final byte[] method5156(int arg0, byte arg1) {
        try {
            ++field10008;
            if (arg1 != 126) {
                return null;
            } else {
                class281 var2 = (class281) class530.field7684.method2730(true, (long) arg0);
                if (var2 == null) {
                    byte[] var3 = new byte[512];
                    Random var4 = new Random((long) arg0);
                    for (int var5 = 0; ~var5 > -256; ++var5) {
                        var3[var5] = (byte) var5;
                    }
                    for (int var6 = 0; var6 < 255; ++var6) {
                        int var7 = 255 - var6;
                        int var8 = class70.method723(var4, var7, (byte) 58);
                        byte var9 = var3[var8];
                        var3[var8] = var3[var7];
                        var3[var7] = var3[-var6 + 511] = var9;
                    }
                    var2 = new class281(var3);
                    class530.field7684.method2734((long) arg0, arg1 + -127, var2);
                }
                return var2.field3959;
            }
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field10016[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lpp;)V", line = 243)
    public class712(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)Z", line = 246)
    public final boolean method5157(byte arg0) {
        try {
            ++field10007;
            int var2 = 11 / ((56 - arg0) / 39);
            return class255.method2135(0, super.field7292);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10016[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(ILpp;)V", line = 259)
    public class712(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BI)I", line = 262)
    public final int method1029(byte arg0, int arg1) {
        try {
            ++field10006;
            if (arg0 != -73) {
                return 126;
            } else {
                if (class255.method2135(0, arg1)) {
                    if (super.field7293.field9134.method4716(0) && !class226.method1892((byte) 117, super.field7293.field9134.method4717(3))) {
                        return 3;
                    }
                    if (~super.field7293.field9119.method1595(3) == -2) {
                        return 3;
                    }
                }
                if (arg1 == 3) {
                    return 3;
                } else {
                    return class255.method2135(0, arg1) ? 2 : 1;
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10016[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5158(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 55);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5159(char[] arg0) {
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
                    var10005 = 9;
                    break;
                case 2:
                    var10005 = 118;
                    break;
                case 3:
                    var10005 = 42;
                    break;
                default:
                    var10005 = 55;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
