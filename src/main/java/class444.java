import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class444 {

    @OriginalMember(owner = "client!un", name = "a", descriptor = "Lwq;")
    private class178 field6526 = new class178(64);

    @OriginalMember(owner = "client!un", name = "h", descriptor = "Lla;")
    private class476 field6524;

    @OriginalMember(owner = "client!un", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6528 = new String[] { method3417(method3416("sv?x")), method3417(method3416("hm}(tsj'*5")), method3417(method3416("f-}:`")), method3417(method3416("hm}P5")), method3417(method3416("hm}R5")), method3417(method3416("hm}W5")), method3417(method3416("hm}Q5")), method3417(method3416("hm}U5")), method3417(method3416("hm}V5")) };

    @OriginalMember(owner = "client!un", name = "c", descriptor = "I")
    public static int field6520;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "I")
    public static int field6521;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "I")
    public static int field6522;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    public static int field6523;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "I")
    public static int field6527;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(II)V")
    public static final void method3410(int arg0, int arg1) {
        try {
            if (arg1 == -17453) {
                field6527++;
                class618.field9078.method1557(arg0, (byte) -108);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6528[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(B)V")
    public final void method3411(byte arg0) {
        try {
            field6520++;
            class178 var2 = this.field6526;
            synchronized (this.field6526) {
                this.field6526.method1559(arg0 ^ 0xFFFFFFD7);
            }
            if (arg0 != -41) {
                this.field6526 = null;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field6528[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lhaa;[[BB)V")
    public static final void method3412(class89 arg0, byte[][] arg1, byte arg2) {
        try {
            for (int var3 = 0; var3 < arg0.field6419; var3++) {
                class318.method2691(1);
                for (int var4 = 0; var4 < (class648.field9378 >> 3); var4++) {
                    for (int var5 = 0; var5 < class659.field9506 >> 3; var5++) {
                        int var6 = class138.field1642[var3][var4][var5];
                        if (var6 != -1) {
                            int var7 = var6 >> 24 & 0x3;
                            if (!arg0.field6424 || var7 == 0) {
                                int var8 = (var6 & 0x6) >> 1;
                                int var9 = (var6 & 0xFFF4B4) >> 14;
                                int var10 = (var6 & 0x3FFF) >> 3;
                                int var11 = (var9 / 8 << 8) + (var10 / 8);
                                for (int var12 = 0; var12 < class752.field10938.length; var12++) {
                                    if (class752.field10938[var12] == var11 && arg1[var12] != null) {
                                        arg0.method756(var5 * 8, arg1[var12], var8, var4 * 8, class610.field8913, class429.field6298, (byte) 105, var7, var3, (var10 & 0x7) * 8, (var9 & 0x7) * 8);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int var13 = -105 % ((arg2 + 49) / 42);
            field6523++;
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field6528[7] + (arg0 == null ? field6528[0] : field6528[2]) + ',' + (arg1 == null ? field6528[0] : field6528[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(BI)Lgw;")
    public final class181 method3413(byte arg0, int arg1) {
        try {
            field6521++;
            class178 var3 = this.field6526;
            class181 var4;
            synchronized (this.field6526) {
                var4 = (class181) this.field6526.method1558((byte) 96, (long) arg1);
            }
            if (var4 != null) {
                return var4;
            }
            class476 var5 = this.field6524;
            byte[] var6;
            synchronized (this.field6524) {
                var6 = this.field6524.method3632(11, arg1, -127);
                if (arg0 != -34) {
                    this.field6526 = null;
                }
            }
            class181 var7 = new class181();
            if (var6 != null) {
                var7.method1581(0, new class163(var6));
            }
            class178 var8 = this.field6526;
            synchronized (this.field6526) {
                this.field6526.method1556((long) arg1, var7, arg0 ^ 0xFFFFFFDF);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field6528[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)V")
    public final void method3414(int arg0, int arg1) {
        try {
            int var3 = 45 / ((arg0 + 23) / 35);
            field6522++;
            class178 var4 = this.field6526;
            synchronized (this.field6526) {
                this.field6526.method1557(arg1, (byte) -107);
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field6528[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V")
    public final void method3415(int arg0) {
        try {
            class178 var2 = this.field6526;
            synchronized (this.field6526) {
                this.field6526.method1569(10574);
            }
            field6525++;
            if (arg0 > -37) {
                this.field6526 = null;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field6528[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lto;ILla;)V")
    public class444(class8 arg0, int arg1, class476 arg2) {
        try {
            this.field6524 = arg2;
            if (this.field6524 != null) {
                this.field6524.method3646(11, (byte) -68);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field6528[1] + (arg0 == null ? field6528[0] : field6528[2]) + ',' + arg1 + ',' + (arg2 == null ? field6528[0] : field6528[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!un", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3416(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!un", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3417(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 29;
                    break;
                case 1:
                    var10005 = 3;
                    break;
                case 2:
                    var10005 = 83;
                    break;
                case 3:
                    var10005 = 20;
                    break;
                default:
                    var10005 = 29;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
