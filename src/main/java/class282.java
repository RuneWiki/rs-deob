import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class282 {

    @OriginalMember(owner = "client!n", name = "k", descriptor = "Lce;")
    private class246 field4707 = new class246();

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    private int field4709;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    private int field4703;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "Lsc;")
    private class259 field4710;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Lna;")
    public static class26 field4701 = class69.method505(")2", (byte) -123);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "[[[B")
    public static byte[][][] field4704;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BLjava/lang/Object;J)V", line = 5)
    public final void method1978(byte arg0, Object arg1, long arg2) {
        field4706++;
        this.method1981(arg2, (byte) -124);
        if (arg0 > -72) {
            this.field4710 = (class259) null;
        }
        if (this.field4703 == 0) {
            class8 var5 = (class8) this.field4707.method1693(-1);
            var5.method1006(-1024);
            var5.method722((byte) -107);
        } else {
            this.field4703--;
        }
        class94 var6 = new class94(arg1);
        this.field4710.method1826(1, var6, arg2);
        this.field4707.method1695(var6, (byte) -19);
        var6.field1564 = 0L;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V", line = 36)
    public static final void method1979(int arg0, int arg1) {
        field4713++;
        class120 var2 = class293.method2059(4, 3, arg0);
        var2.method823(true);
        if (arg1 < 87) {
            field4701 = (class26) null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V", line = 52)
    public static final void method1980(byte arg0) {
        class312.field5334 = null;
        class110.field1749 = null;
        if (arg0 != -118) {
            method1979(64, 82);
        }
        class50.field792 = null;
        field4711++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(JB)V", line = 70)
    public final void method1981(long arg0, byte arg1) {
        class8 var4 = (class8) this.field4710.method1827(arg0, 0);
        if (arg1 != -124) {
            return;
        }
        if (var4 != null) {
            var4.method1006(-1024);
            var4.method722((byte) -107);
            this.field4703++;
        }
        field4714++;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(II)I", line = 90)
    public static int method1982(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)I", line = 100)
    public final int method1983(int arg0) {
        field4699++;
        if (arg0 != -12623) {
            return -85;
        }
        int var2 = 0;
        for (class8 var3 = (class8) this.field4707.method1692((byte) 70); var3 != null; var3 = (class8) this.field4707.method1694(arg0 + 12744)) {
            if (!var3.method54(-22358)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V", line = 126)
    public static void method1984(int arg0) {
        field4704 = (byte[][][]) null;
        field4701 = null;
        if (arg0 != 3101) {
            method1979(99, -14);
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(II)V", line = 141)
    public final void method1985(int arg0, int arg1) {
        if (class275.field4595 != null) {
            for (class8 var3 = (class8) this.field4707.method1692((byte) 42); var3 != null; var3 = (class8) this.field4707.method1694(-48)) {
                if (var3.method54(-22358)) {
                    if (var3.method53(true) == null) {
                        var3.method1006(-1024);
                        var3.method722((byte) -107);
                        this.field4703++;
                    }
                } else if (++var3.field1564 > (long) arg1) {
                    class8 var4 = class275.field4595.method725(var3, -108);
                    this.field4710.method1826(1, var4, var3.field2293);
                    class7.method47(var3, var4, (byte) 121);
                    var3.method1006(-1024);
                    var3.method722((byte) -107);
                }
            }
        }
        field4702++;
        if (arg0 > -124) {
            this.method1981(24L, (byte) -18);
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(B)V", line = 200)
    public final void method1986(byte arg0) {
        for (class8 var2 = (class8) this.field4707.method1692((byte) 52); var2 != null; var2 = (class8) this.field4707.method1694(-43)) {
            if (var2.method54(-22358)) {
                var2.method1006(-1024);
                var2.method722((byte) -107);
                this.field4703++;
            }
        }
        field4700++;
        if (arg0 > -98) {
            this.field4709 = 56;
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V", line = 224)
    public final void method1987(int arg0) {
        if (arg0 == 3) {
            field4712++;
            this.field4707.method1699(17126);
            this.field4710.method1820(114);
            this.field4703 = this.field4709;
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(I)V", line = 240)
    public class282(int arg0) {
        this.field4709 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field4703 = arg0;
        this.field4710 = new class259(var2);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIII)V", line = 256)
    public static final void method1988(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4697++;
        int var6 = class308.method2151(class117.field1840, arg3, (byte) 0, class80.field1259);
        int var7 = class308.method2151(class117.field1840, arg5, (byte) 0, class80.field1259);
        int var8 = class308.method2151(class27.field454, arg4, (byte) 0, class225.field3572);
        if (arg0 != 3074) {
            method1979(75, -7);
        }
        int var9 = class308.method2151(class27.field454, arg2, (byte) 0, class225.field3572);
        for (int var10 = var6; var10 <= var7; var10++) {
            class76.method543(class45.field710[var10], var8, arg0 - 2974, var9, arg1);
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(JB)Ljava/lang/Object;", line = 288)
    public final Object method1989(long arg0, byte arg1) {
        field4705++;
        class8 var4 = (class8) this.field4710.method1827(arg0, arg1 - 121);
        if (arg1 != 121) {
            return (Object) null;
        } else if (var4 == null) {
            return null;
        } else {
            Object var5 = var4.method53(true);
            if (var5 == null) {
                var4.method1006(-1024);
                var4.method722((byte) -107);
                this.field4703++;
                return null;
            }
            if (var4.method54(-22358)) {
                class94 var6 = new class94(var5);
                this.field4710.method1826(1, var6, var4.field2293);
                this.field4707.method1695(var6, (byte) 84);
                var6.field1564 = 0L;
                var4.method1006(-1024);
                var4.method722((byte) -107);
            } else {
                this.field4707.method1695(var4, (byte) -127);
                var4.field1564 = 0L;
            }
            return var5;
        }
    }
}
