import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class41 extends class518 {

    @OriginalMember(owner = "client!kq", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field627 = new String[] { method471(method470("\u0007%doy")), method471(method470("\u0007%dhy")), method471(method470("\u0017zd\u0000,")), method471(method470("\u0002!&B")), method471(method470("\u0007%diy")), method471(method470("\u0007%dmy")), method471(method470("\u0007%dky")), method471(method470("\u0007%djy")), method471(method470("\u0007%dly")) };

    @OriginalMember(owner = "client!kq", name = "H", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!kq", name = "F", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!kq", name = "G", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!kq", name = "J", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!kq", name = "D", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!kq", name = "E", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!kq", name = "I", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!kq", name = "C", descriptor = "[Ltb;")
    public static class392[] field624;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIIB)I", line = 5)
    public static final int method466(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        try {
            ++field626;
            if (arg4 != 34) {
                field624 = null;
            }
            int var5 = -class487.field7150[arg1 * 8192 / arg2] + 65536 >> 1;
            return ((-var5 + 65536) * arg0 >> 16) + (arg3 * var5 >> 16);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field627[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIILml;I)Lgda;", line = 18)
    public static final class268 method467(int arg0, int arg1, int arg2, int arg3, class194 arg4, int arg5) {
        try {
            if (arg5 != 4096) {
                return null;
            } else {
                ++field620;
                if (arg4.field2899 || class357.method2858(arg1, false) && class357.method2858(arg2, false)) {
                    return new class268(arg4, 3553, arg0, arg3, arg1, arg2, true);
                } else {
                    return arg4.field2884 ? new class268(arg4, 34037, arg0, arg3, arg1, arg2, true) : new class268(arg4, arg0, arg3, arg1, arg2, class788.method5671(1282334120, arg1), class788.method5671(1282334120, arg2), true);
                }
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field627[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field627[2] : field627[3]) + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "(II)Z", line = 37)
    public static final boolean method468(int arg0, int arg1) {
        try {
            ++field622;
            int var2 = 64 / ((55 - arg0) / 48);
            for (class228 var3 = (class228) class45.field644.method3977((byte) -39); var3 != null; var3 = (class228) class45.field644.method3987(0)) {
                if (class161.method1354(var3.field3311, 2353) && (long) arg1 == var3.field3299) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field627[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)[[I", line = 59)
    public final int[][] method349(int arg0, int arg1) {
        try {
            if (arg0 != 0) {
                field624 = null;
            }
            ++field625;
            int[][] var3 = super.field7575.method1955(arg1, -2);
            if (super.field7575.field3416) {
                int[][] var4 = this.method3943(0, arg1, -23583);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; var11 < class110.field1436; ++var11) {
                    var8[var11] = -var5[var11] + 4096;
                    var9[var11] = 4096 - var6[var11];
                    var10[var11] = -var7[var11] + 4096;
                }
            }
            return var3;
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field627[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "()V", line = 105)
    public class41() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "(B)V", line = 108)
    public static void method469(byte arg0) {
        try {
            if (arg0 < 102) {
                field624 = null;
            }
            field624 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field627[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(II)[I", line = 120)
    public final int[] method14(int arg0, int arg1) {
        try {
            ++field619;
            int[] var3 = super.field7564.method4462(26041, arg0);
            int var4 = 19 % ((arg1 - -57) / 55);
            if (super.field7564.field8652) {
                int[] var5 = this.method3944(arg0, 0, (byte) 73);
                for (int var6 = 0; ~class110.field1436 < ~var6; ++var6) {
                    var3[var6] = 4096 - var5[var6];
                }
            }
            return var3;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field627[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILjc;I)V", line = 153)
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            if (arg2 != -3) {
                field624 = null;
            }
            ++field623;
            if (arg0 == 0) {
                super.field7565 = arg1.method5128(0) == 1;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field627[5] + arg0 + ',' + (arg1 != null ? field627[2] : field627[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method470(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 81);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method471(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 108;
                    break;
                case 1:
                    var10005 = 84;
                    break;
                case 2:
                    var10005 = 74;
                    break;
                case 3:
                    var10005 = 46;
                    break;
                default:
                    var10005 = 81;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
