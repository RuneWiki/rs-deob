import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class263 {

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "Ldga;")
    private class713 field3717;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "J")
    public long field3720;

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3724 = new String[] { method2178(method2177("\u0006\u0001^o2")), method2178(method2177("\u0006\u0001^h2")), method2178(method2177("\u000e\u0016\u001c@")), method2178(method2177("\u001bM^\u0002g")), method2178(method2177("\u0006\u0001^\u0010s\u000e\n\u0004\u00122")), method2178(method2177("\u0006\u0001^m2")), method2178(method2177("\u0006\u0001^n2")), method2178(method2177("4QP\u0001:")), method2178(method2177("@NP")), method2178(method2177("\u0006\u0001^Js\u000e\u0002\u001cE`\u0005K")) };

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field3715 = -1;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "Ltf;")
    public static class524 field3713 = new class524();

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field3723 = -1;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "[I")
    public static int[] field3721;

    @OriginalMember(owner = "client!fb", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() throws Throwable {
        try {
            field3718++;
            this.field3717.method5161(this.field3720, (byte) -124);
            super.finalize();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3724[9] + ')');
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V", line = 19)
    public static void method2173(byte arg0) {
        try {
            field3721 = null;
            int var1 = 64 % ((arg0 - 64) / 40);
            field3713 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3724[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)Z", line = 35)
    public static final boolean method2174(int arg0, int arg1, int arg2) {
        try {
            if (arg1 < 123) {
                return true;
            } else {
                field3719++;
                return (arg0 & 0x8000) != 0;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3724[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lob;I)Z", line = 46)
    public static final boolean method2175(class779 arg0, int arg1) {
        try {
            field3722++;
            try {
                int var2 = -94 % ((-arg1 - 46) / 53);
                return class692.method4939(arg0, (byte) -1);
            } catch (IOException var7) {
                if (class559.field8139 == 9) {
                    arg0.field11096 = null;
                    return false;
                } else {
                    class177.method1482(-14523);
                    return true;
                }
            } catch (Exception var8) {
                String var4 = field3724[7] + (arg0.field11112 == null ? -1 : arg0.field11112.method2169(-12884)) + "," + (arg0.field11103 == null ? -1 : arg0.field11103.method2169(-12884)) + "," + (arg0.field11113 == null ? -1 : arg0.field11113.method2169(-12884)) + field3724[8] + arg0.field11105 + "," + (class203.field2988.field2252[0] + class537.field7895) + "," + (class655.field9286 + class203.field2988.field2256[0]) + field3724[8];
                for (int var5 = 0; arg0.field11105 > var5 && var5 < 50; var5++) {
                    var4 = var4 + arg0.field11099.field9996[var5] + ",";
                }
                class162.method1374(var8, var4, (byte) -93);
                class794.method5727(-1, false);
                return true;
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field3724[6] + (arg0 == null ? field3724[2] : field3724[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Ldga;JI)V", line = 92)
    public class263(class713 arg0, long arg1, int arg2) {
        try {
            this.field3717 = arg0;
            this.field3720 = arg1;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field3724[4] + (arg0 == null ? field3724[2] : field3724[3]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/String;I[BI)I", line = 103)
    public static final int method2176(String arg0, int arg1, byte[] arg2, int arg3) {
        try {
            field3714++;
            int var4 = arg1;
            int var5 = arg0.length();
            for (int var6 = arg3; var6 < var5; var6 += 4) {
                int var7 = class430.method3351(arg0.charAt(var6), 3);
                int var8 = var5 <= (var6 + 1) ? -1 : class430.method3351(arg0.charAt(var6 + 1), 3);
                int var9 = var6 + 2 >= var5 ? -1 : class430.method3351(arg0.charAt(var6 + 2), arg3 ^ 0x3);
                int var10 = (var6 + 3) < var5 ? class430.method3351(arg0.charAt(var6 + 3), 3) : -1;
                arg2[arg1++] = (byte) class10.method71(var7 << 2, var8 >>> 4);
                if (var9 == -1) {
                    break;
                }
                arg2[arg1++] = (byte) class10.method71(var9 >>> 2, class434.method3377(240, var8 << 4));
                if (var10 == -1) {
                    break;
                }
                arg2[arg1++] = (byte) class10.method71(var10, class434.method3377(var9 << 6, 192));
            }
            return arg1 - var4;
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field3724[1] + (arg0 == null ? field3724[2] : field3724[3]) + ',' + arg1 + ',' + (arg2 == null ? field3724[2] : field3724[3]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2177(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2178(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 96;
                    break;
                case 1:
                    var10005 = 99;
                    break;
                case 2:
                    var10005 = 112;
                    break;
                case 3:
                    var10005 = 44;
                    break;
                default:
                    var10005 = 26;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
