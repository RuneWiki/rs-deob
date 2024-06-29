import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sja")
public class class11 {

    @OriginalMember(owner = "client!sja", name = "c", descriptor = "Lwq;")
    private class178 field134 = new class178(16);

    @OriginalMember(owner = "client!sja", name = "h", descriptor = "Lla;")
    private class476 field127;

    @OriginalMember(owner = "client!sja", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field139 = new String[] { method80(method79("\nMK,KQ")), method80(method79("\u0017RFn")), method80(method79("\u0002\t\u0004,r")), method80(method79("\nMK,3\u0010ICv1Q")), method80(method79("\nMK,JQ")), method80(method79("\nMK,LQ")), method80(method79("\nMK,IQ")), method80(method79("\nMK,NQ")), method80(method79("\nMK,MQ")) };

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "Llk;")
    public static class613 field131 = new class613();

    @OriginalMember(owner = "client!sja", name = "i", descriptor = "I")
    public static int field138 = 0;

    @OriginalMember(owner = "client!sja", name = "g", descriptor = "[[I")
    public static int[][] field137 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!sja", name = "j", descriptor = "D")
    public static double field136;

    @OriginalMember(owner = "client!sja", name = "l", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!sja", name = "d", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!sja", name = "f", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!sja", name = "b", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!sja", name = "k", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!sja", name = "e", descriptor = "[[Z")
    public static boolean[][] field135;

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(B)V", line = 3)
    public final void method73(byte arg0) {
        try {
            class178 var2 = this.field134;
            synchronized (this.field134) {
                this.field134.method1559(0);
                int var3 = 52 / ((arg0 + 61) / 33);
            }
            field132++;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field139[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(BI)V", line = 22)
    public final void method74(byte arg0, int arg1) {
        try {
            class178 var3 = this.field134;
            synchronized (this.field134) {
                this.field134.method1557(arg1, (byte) -127);
            }
            field130++;
            if (arg0 != -38) {
                field136 = -0.8240262092620586D;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field139[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(I)V", line = 37)
    public final void method75(int arg0) {
        try {
            class178 var2 = this.field134;
            synchronized (this.field134) {
                this.field134.method1569(arg0 + 10574);
                if (arg0 != 0) {
                    field135 = null;
                }
            }
            field128++;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field139[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(ILec;)I", line = 57)
    public static final int method76(int arg0, class247 arg1) {
        try {
            field129++;
            if (arg1.field3810 == 0) {
                return 0;
            }
            if (arg1.field3842 != arg0) {
                class247 var2 = null;
                if (arg1.field3842 < 32768) {
                    class383 var3 = (class383) class207.field3184.method977((long) arg1.field3842, 1);
                    if (var3 != null) {
                        var2 = var3.field5799;
                    }
                } else if (arg1.field3842 >= 32768) {
                    var2 = class197.field2685[arg1.field3842 - 32768];
                }
                if (var2 != null) {
                    int var4 = arg1.field6197 - var2.field6197;
                    int var5 = arg1.field6211 - var2.field6211;
                    if (var4 != 0 || var5 != 0) {
                        arg1.method2097((int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF, 0);
                    }
                }
            }
            if ((arg1 instanceof class726)) {
                class726 var9 = (class726) arg1;
                if (var9.field10502 != -1 && (var9.field3862 == 0 || var9.field3867 > 0)) {
                    var9.method2097(var9.field10502, arg0 + 1);
                    var9.field10502 = -1;
                }
            } else if (arg1 instanceof class612) {
                class612 var6 = (class612) arg1;
                if (var6.field8932 != -1 && (var6.field3862 == 0 || var6.field3867 > 0)) {
                    int var7 = var6.field6197 - ((var6.field8932 - class494.field7101 - class494.field7101) * 256);
                    int var8 = var6.field6211 - ((var6.field8933 - (class281.field4219 + class281.field4219)) * 256);
                    if (var7 != 0 || var8 != 0) {
                        var6.method2097((int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF, ~arg0);
                    }
                    var6.field8932 = -1;
                }
            }
            return arg1.method2105(1);
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field139[8] + arg0 + ',' + (arg1 == null ? field139[1] : field139[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(Z)V", line = 134)
    public static void method77(boolean arg0) {
        try {
            field137 = null;
            field135 = null;
            if (!arg0) {
                method77(false);
            }
            field131 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field139[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(IB)Lvh;", line = 151)
    public final class378 method78(int arg0, byte arg1) {
        try {
            field133++;
            class178 var3 = this.field134;
            class378 var4;
            synchronized (this.field134) {
                var4 = (class378) this.field134.method1558((byte) 96, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            class476 var5 = this.field127;
            byte[] var6;
            synchronized (this.field127) {
                var6 = this.field127.method3632(30, arg0, 70);
            }
            class378 var7 = new class378();
            if (var6 != null) {
                var7.method3046(new class163(var6), 0);
            }
            class178 var8 = this.field134;
            synchronized (this.field134) {
                this.field134.method1556((long) arg0, var7, 1);
                if (arg1 > -36) {
                    this.field127 = null;
                }
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field139[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sja", name = "<init>", descriptor = "(Lto;ILla;)V", line = 187)
    public class11(class8 arg0, int arg1, class476 arg2) {
        try {
            this.field127 = arg2;
            this.field127.method3646(30, (byte) -97);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field139[3] + (arg0 == null ? field139[1] : field139[2]) + ',' + arg1 + ',' + (arg2 == null ? field139[1] : field139[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!sja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method79(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xF);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method80(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 121;
                    break;
                case 1:
                    var10005 = 39;
                    break;
                case 2:
                    var10005 = 42;
                    break;
                case 3:
                    var10005 = 2;
                    break;
                default:
                    var10005 = 15;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
