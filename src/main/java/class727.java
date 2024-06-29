import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class727 extends class574 {

    @OriginalMember(owner = "client!ih", name = "J", descriptor = "[Ljava/lang/String;")
    private static final String[] field10548 = new String[] { method5309(method5308("z,\u0014\u0011l")), method5309(method5308("z,\u0014\u001cl")), method5309(method5308("hj\u0014y9")), method5309(method5308("z,\u0014\u001al")), method5309(method5308("}1V;")), method5309(method5308("z,\u0014\u001dl")), method5309(method5308("z,\u0014\u001bl")), method5309(method5308("z,\u0014\u0018l")), method5309(method5308("z,\u0014\u0019l")) };

    @OriginalMember(owner = "client!ih", name = "H", descriptor = "F")
    public static float field10544 = 1.0F;

    @OriginalMember(owner = "client!ih", name = "I", descriptor = "Lel;")
    public static class573 field10542 = new class573(113, 7);

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "B")
    public byte field10543;

    @OriginalMember(owner = "client!ih", name = "D", descriptor = "I")
    public static int field10537;

    @OriginalMember(owner = "client!ih", name = "G", descriptor = "I")
    public static int field10538;

    @OriginalMember(owner = "client!ih", name = "E", descriptor = "I")
    public int field10539;

    @OriginalMember(owner = "client!ih", name = "C", descriptor = "I")
    public static int field10540;

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "I")
    public static int field10541;

    @OriginalMember(owner = "client!ih", name = "A", descriptor = "I")
    public static int field10545;

    @OriginalMember(owner = "client!ih", name = "F", descriptor = "I")
    public static int field10546;

    @OriginalMember(owner = "client!ih", name = "B", descriptor = "Lib;")
    public class163 field10547;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "(B)V", line = 6)
    public static void method5303(byte arg0) {
        try {
            if (arg0 == 21) {
                field10542 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10548[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIZ)V", line = 18)
    public static final void method5304(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        try {
            ++field10538;
            if (class334.method2801(arg0, arg1 ^ arg1)) {
                class657.method4824(arg2, class683.field9897[arg0], arg3, arg1 + 22653, arg4, -1);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field10548[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)I", line = 32)
    public final int method4285(byte arg0) {
        try {
            ++field10546;
            if (arg0 != -42) {
                return 100;
            } else {
                return this.field10547 == null ? 0 : this.field10547.field2201 * 100 / (this.field10547.field2209.length + -this.field10543);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10548[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)I", line = 47)
    public static final int method5305(byte arg0, int arg1) {
        try {
            if (arg0 <= 98) {
                return 15;
            } else {
                ++field10537;
                return 255 & arg1;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10548[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 60)
    public static final String method5306(byte arg0, String arg1) {
        try {
            ++field10541;
            if (arg1 == null) {
                return null;
            } else {
                if (arg0 > -27) {
                    field10544 = -1.0703143F;
                }
                int var2 = 0;
                int var3 = arg1.length();
                while (var3 > var2 && class762.method5518(8, arg1.charAt(var2))) {
                    ++var2;
                }
                while (~var3 < ~var2 && class762.method5518(8, arg1.charAt(var3 + -1))) {
                    --var3;
                }
                int var4 = -var2 + var3;
                if (~var4 <= -2 && var4 <= 12) {
                    StringBuffer var5 = new StringBuffer(var4);
                    for (int var6 = var2; ~var6 > ~var3; ++var6) {
                        char var7 = arg1.charAt(var6);
                        if (class145.method1229(var7, 3)) {
                            char var8 = class322.method2725(var7, (byte) 124);
                            if (~var8 != -1) {
                                var5.append(var8);
                            }
                        }
                    }
                    if (var5.length() == 0) {
                        return null;
                    } else {
                        return var5.toString();
                    }
                } else {
                    return null;
                }
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field10548[3] + arg0 + ',' + (arg1 != null ? field10548[2] : field10548[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(B)[B", line = 114)
    public final byte[] method4281(byte arg0) {
        try {
            if (arg0 != -68) {
                this.field10543 = -109;
            }
            ++field10540;
            if (!super.field8473 && this.field10547.field2201 >= this.field10547.field2209.length + -this.field10543) {
                return this.field10547.field2209;
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10548[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([ILla;BLla;)V", line = 142)
    public static final void method5307(int[] arg0, class476 arg1, byte arg2, class476 arg3) {
        try {
            class451.field6617 = arg1;
            class657.field9488 = arg3;
            if (arg2 < 97) {
                field10544 = -0.51048696F;
            }
            if (arg0 != null) {
                class151.field1867 = arg0;
            }
            ++field10545;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10548[6] + (arg0 != null ? field10548[2] : field10548[4]) + ',' + (arg1 != null ? field10548[2] : field10548[4]) + ',' + arg2 + ',' + (arg3 != null ? field10548[2] : field10548[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5308(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 68);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5309(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 19;
                    break;
                case 1:
                    var10005 = 68;
                    break;
                case 2:
                    var10005 = 58;
                    break;
                case 3:
                    var10005 = 87;
                    break;
                default:
                    var10005 = 68;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
