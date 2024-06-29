import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class473 {

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6868 = new String[] { method3597(method3596("Qyf5\r")), method3597(method3596("I>f]X")), method3597(method3596("D\"$w")), method3597(method3596("I>fZX")), method3597(method3596("I>fYX")), method3597(method3596("I>f_X")), method3597(method3596("I>fXX")), method3597(method3596("I>f^X")) };

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "Ldl;")
    public static class70 field6860 = new class70(16);

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "Z")
    public static boolean field6862 = false;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "Lwia;")
    public static class790 field6861 = new class790(57, 3);

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "Lel;")
    public static class573 field6866 = new class573(50, 10);

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field6867 = 0;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field6858;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field6859;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field6863;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public static int field6864;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field6865;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/String;I)J", line = 4)
    public static final long method3590(String arg0, int arg1) {
        try {
            field6859++;
            long var2 = 0L;
            int var4 = arg0.length();
            for (int var5 = 0; var5 < var4; var5++) {
                var2 *= 37L;
                char var6 = arg0.charAt(var5);
                if (var6 >= 'A' && var6 <= 'Z') {
                    var2 += (var6 - 64);
                } else if (var6 >= 'a' && var6 <= 'z') {
                    var2 += (var6 + 1 - 97);
                } else if (var6 >= '0' && var6 <= '9') {
                    var2 += (var6 + 27 - 48);
                }
                if (var2 >= 177917621779460413L) {
                    break;
                }
            }
            if (arg1 < 12) {
                method3592((byte) 62, 104);
            }
            while (var2 % 37L == 0L && var2 != 0L) {
                var2 /= 37L;
            }
            return var2;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field6868[3] + (arg0 == null ? field6868[2] : field6868[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IBIIII)I", line = 50)
    public static final int method3591(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            field6864++;
            if (class555.field8261 == null) {
                return 0;
            }
            if (arg0 < 3) {
                int var6 = arg4 >> 9;
                int var7 = arg3 >> 9;
                if (arg2 < 0 || arg5 < 0 || arg2 > (class648.field9378 - 1) || (class659.field9506 - 1) < arg5) {
                    return 0;
                }
                if (var6 < 1 || var7 < 1 || var6 > class648.field9378 - 1 || class659.field9506 - 1 < var7) {
                    return 0;
                }
                boolean var8 = (class184.field2545[1][arg4 >> 9][arg3 >> 9] & 0x2) != 0;
                if ((arg4 & 0x1FF) == 0) {
                    boolean var9 = (class184.field2545[1][var6 - 1][arg3 >> 9] & 0x2) != 0;
                    boolean var10 = (class184.field2545[1][var6][arg3 >> 9] & 0x2) != 0;
                    if (var10 != var9) {
                        var8 = (class184.field2545[1][arg2][arg5] & 0x2) != 0;
                    }
                }
                if ((arg3 & 0x1FF) == 0) {
                    boolean var11 = (class184.field2545[1][arg4 >> 9][var7 - 1] & 0x2) != 0;
                    boolean var12 = (class184.field2545[1][arg4 >> 9][var7] & 0x2) != 0;
                    if (var11 != var12) {
                        var8 = (class184.field2545[1][arg2][arg5] & 0x2) != 0;
                    }
                }
                if (var8) {
                    arg0++;
                }
            }
            int var13 = 105 / ((8 - arg1) / 45);
            return class555.field8261[arg0].method2404((byte) 109, arg4, arg3);
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field6868[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)Z", line = 112)
    public static final boolean method3592(byte arg0, int arg1) {
        try {
            field6858++;
            if (arg1 == 48 || arg1 == 5 || arg1 == 21 || arg1 == 50 || arg1 == 60) {
                return true;
            } else {
                if (arg0 <= 124) {
                    field6862 = true;
                }
                return arg1 == 10 || arg1 == 1007;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6868[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)V", line = 137)
    public static void method3593(int arg0) {
        try {
            field6866 = null;
            field6861 = null;
            if (arg0 < 56) {
                field6862 = false;
            }
            field6860 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6868[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V", line = 149)
    public static final void method3594(int arg0) {
        try {
            field6865++;
            int var1 = class3.field34;
            int[] var2 = class358.field5483;
            for (int var3 = arg0; var3 < var1; var3++) {
                class726 var4 = class197.field2685[var2[var3]];
                if (var4 != null && var4.field3812 > 0) {
                    var4.field3812--;
                    if (var4.field3812 == 0) {
                        var4.field3782 = null;
                    }
                }
            }
            for (int var5 = 0; var5 < class6.field60; var5++) {
                long var6 = (long) class590.field8680[var5];
                class383 var8 = (class383) class207.field3184.method977(var6, 1);
                if (var8 != null) {
                    class612 var9 = var8.field5799;
                    if (var9.field3812 > 0) {
                        var9.field3812--;
                        if (var9.field3812 == 0) {
                            var9.field3782 = null;
                        }
                    }
                }
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field6868[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(Ljava/lang/String;I)I", line = 205)
    public static final int method3595(String arg0, int arg1) {
        try {
            field6863++;
            if (!class8.field79.field388) {
                return -1;
            } else if (class275.field4152.containsKey(arg0)) {
                return 100;
            } else {
                String var2 = class128.method1117(false, arg0);
                if (var2 == null) {
                    return -1;
                }
                String var3 = class58.field622 + var2;
                if (!class275.field4157.method3630(4, "", var3)) {
                    return -1;
                } else if (class275.field4157.method3647(var3, 76)) {
                    byte[] var4 = class275.field4157.method3640((byte) 15, "", var3);
                    Object var5 = null;
                    File var6;
                    try {
                        var6 = class345.method2857(var2, (byte) 98);
                        if (arg1 != -6) {
                            method3595(null, 76);
                        }
                    } catch (RuntimeException var11) {
                        return -1;
                    }
                    if (var4 == null || var6 == null) {
                        return -1;
                    }
                    boolean var7 = true;
                    byte[] var8 = class655.method4807(var6, (byte) -52);
                    if (var8 != null && var4.length == var8.length) {
                        for (int var9 = 0; var9 < var8.length; var9++) {
                            if (var4[var9] != var8[var9]) {
                                var7 = false;
                                break;
                            }
                        }
                    } else {
                        var7 = false;
                    }
                    try {
                        if (!var7) {
                            class8.field79.method220(var6, var4, 0);
                        }
                    } catch (Throwable var12) {
                        return -1;
                    }
                    class729.method5317(18002, var6, arg0);
                    return 100;
                } else {
                    return class275.field4157.method3628((byte) 66, var3);
                }
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field6868[1] + (arg0 == null ? field6868[2] : field6868[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3596(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x70);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3597(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 42;
                    break;
                case 1:
                    var10005 = 87;
                    break;
                case 2:
                    var10005 = 72;
                    break;
                case 3:
                    var10005 = 27;
                    break;
                default:
                    var10005 = 112;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
