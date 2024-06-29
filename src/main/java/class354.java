import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class354 {

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "Lwq;")
    private class178 field5449 = new class178(64);

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "Lla;")
    private class476 field5454;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public int field5457;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5458 = new String[] { method2905(method2904("\u001b\u0013\r\u0019\u0016")), method2905(method2904("\u001b\u0013\r\u0018\u0016")), method2905(method2904("\u001b\u0013\r\u001f\u0016")), method2905(method2904("\u001b\u0013\r\u001d\u0016")), method2905(method2904("\u001b\u0013\r\u001e\u0016")), method2905(method2904("\u001b\u0013\r\u001a\u0016")), method2905(method2904("\u001b\u0013\rgW\u0007\u001eWe\u0016")), method2905(method2904("\u0012Y\ruC")), method2905(method2904("\u0007\u0002O7")) };

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field5453;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "Lvt;")
    public static class319 field5455;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V", line = 5)
    public final void method2898(byte arg0) {
        try {
            class178 var2 = this.field5449;
            synchronized (this.field5449) {
                this.field5449.method1559(0);
            }
            if (arg0 != -25) {
                this.method2901((byte) -128);
            }
            field5450++;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5458[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V", line = 21)
    public final void method2899(int arg0, int arg1) {
        try {
            field5451++;
            class178 var3 = this.field5449;
            synchronized (this.field5449) {
                this.field5449.method1557(arg1, (byte) -108);
            }
            if (arg0 < 41) {
                this.field5449 = null;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field5458[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 34)
    public static void method2900(int arg0) {
        try {
            field5455 = null;
            if (arg0 != 10) {
                method2902(-10, -71, -67L);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5458[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)V", line = 46)
    public final void method2901(byte arg0) {
        try {
            class178 var2 = this.field5449;
            synchronized (this.field5449) {
                this.field5449.method1569(10574);
            }
            if (arg0 >= -52) {
                this.field5449 = null;
            }
            field5456++;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5458[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIJ)Ljava/lang/String;", line = 62)
    public static final String method2902(int arg0, int arg1, long arg2) {
        try {
            field5453++;
            class693.method5066(arg2, true);
            int var4 = class555.field8270.get(5);
            int var5 = class555.field8270.get(2) + 1;
            int var6 = class555.field8270.get(1);
            if (arg0 < 73) {
                method2900(-44);
            }
            return Integer.toString(var4 / 10) + var4 % 10 + "/" + var5 / 10 + var5 % 10 + "/" + var6 % 100 / 10 + var6 % 10;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field5458[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)Lsh;", line = 80)
    public final class77 method2903(int arg0, byte arg1) {
        try {
            field5452++;
            class178 var3 = this.field5449;
            class77 var4;
            synchronized (this.field5449) {
                var4 = (class77) this.field5449.method1558((byte) 96, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            class476 var5 = this.field5454;
            byte[] var6;
            synchronized (this.field5454) {
                var6 = this.field5454.method3632(16, arg0, -11);
            }
            if (arg1 != 38) {
                method2902(-72, 49, -11L);
            }
            class77 var7 = new class77();
            if (var6 != null) {
                var7.method685(new class163(var6), (byte) -57);
            }
            class178 var8 = this.field5449;
            synchronized (this.field5449) {
                this.field5449.method1556((long) arg0, var7, 1);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field5458[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lto;ILla;)V", line = 112)
    public class354(class8 arg0, int arg1, class476 arg2) {
        try {
            this.field5454 = arg2;
            if (this.field5454 == null) {
                this.field5457 = 0;
            } else {
                this.field5457 = this.field5454.method3646(16, (byte) -98);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5458[6] + (arg0 == null ? field5458[8] : field5458[7]) + ',' + arg1 + ',' + (arg2 == null ? field5458[8] : field5458[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2904(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2905(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 105;
                    break;
                case 1:
                    var10005 = 119;
                    break;
                case 2:
                    var10005 = 35;
                    break;
                case 3:
                    var10005 = 91;
                    break;
                default:
                    var10005 = 62;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
