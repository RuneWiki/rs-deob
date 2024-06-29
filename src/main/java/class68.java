import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class68 {

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "Lwq;")
    private class178 field729 = new class178(128);

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "Lwq;")
    public class178 field731 = new class178(64);

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "Lla;")
    public class476 field730;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "Lla;")
    private class476 field724;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field734 = new String[] { method624(method623("GnL\u001cYKc\u0016\u001e\u0018")), method624(method623("^$L\u000eM")), method624(method623("K\u007f\u000eL")), method624(method623("GnLd\u0018")), method624(method623("GnLc\u0018")), method624(method623("GnLb\u0018")), method624(method623("GnLa\u0018")), method624(method623("GnLf\u0018")), method624(method623("GnLe\u0018")) };

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "Leh;")
    public static class379 field728 = new class379(2);

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "B")
    public static byte field732;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V", line = 6)
    public final void method617(int arg0, int arg1) {
        try {
            class178 var3 = this.field729;
            synchronized (this.field729) {
                this.field729.method1557(arg1, (byte) -119);
            }
            if (arg0 == 36) {
                field727++;
                class178 var4 = this.field731;
                synchronized (this.field731) {
                    this.field731.method1557(arg1, (byte) -113);
                }
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field734[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V", line = 22)
    public static void method618(int arg0) {
        try {
            field728 = null;
            if (arg0 != 2) {
                method618(7);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field734[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V", line = 37)
    public final void method619(byte arg0) {
        try {
            class178 var2 = this.field729;
            synchronized (this.field729) {
                if (arg0 < 32) {
                    this.method617(91, -80);
                }
                this.field729.method1569(10574);
            }
            field725++;
            class178 var3 = this.field731;
            synchronized (this.field731) {
                this.field731.method1569(10574);
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field734[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lto;ILla;Lla;)V", line = 90)
    public class68(class8 arg0, int arg1, class476 arg2, class476 arg3) {
        try {
            this.field730 = arg3;
            this.field724 = arg2;
            this.field724.method3646(36, (byte) -56);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field734[0] + (arg0 == null ? field734[2] : field734[1]) + ',' + arg1 + ',' + (arg2 == null ? field734[2] : field734[1]) + ',' + (arg3 == null ? field734[2] : field734[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 62)
    public final void method620(int arg0) {
        try {
            class178 var2 = this.field729;
            synchronized (this.field729) {
                this.field729.method1559(arg0 ^ arg0);
            }
            field726++;
            class178 var3 = this.field731;
            synchronized (this.field731) {
                this.field731.method1559(0);
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field734[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)V", line = 75)
    public final void method621(int arg0, int arg1, int arg2) {
        try {
            this.field729 = new class178(arg2);
            field723++;
            if (arg0 == 36) {
                this.field731 = new class178(arg1);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field734[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)Lsb;", line = 106)
    public final class306 method622(int arg0, byte arg1) {
        try {
            field733++;
            class178 var3 = this.field729;
            class306 var4;
            synchronized (this.field729) {
                var4 = (class306) this.field729.method1558((byte) 96, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            class476 var5 = this.field724;
            byte[] var6;
            synchronized (this.field724) {
                var6 = this.field724.method3632(36, arg0, -118);
            }
            class306 var7 = new class306();
            var7.field4778 = this;
            var7.field4783 = arg0;
            int var8 = 99 % ((arg1 + 8) / 53);
            if (var6 != null) {
                var7.method2598((byte) 93, new class163(var6));
            }
            var7.method2596(true);
            class178 var9 = this.field729;
            synchronized (this.field729) {
                this.field729.method1556((long) arg0, var7, 1);
                return var7;
            }
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field734[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method623(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x30);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method624(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 37;
                    break;
                case 1:
                    var10005 = 10;
                    break;
                case 2:
                    var10005 = 98;
                    break;
                case 3:
                    var10005 = 32;
                    break;
                default:
                    var10005 = 48;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
