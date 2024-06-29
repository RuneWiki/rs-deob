import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public abstract class class12 extends class593 {

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "S")
    public short field168;

    @OriginalMember(owner = "client!ma", name = "G", descriptor = "I")
    public static int field171 = 0;

    @OriginalMember(owner = "client!ma", name = "H", descriptor = "[Ljava/lang/String;")
    public static String[] field172 = new String[200];

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "Lhe;")
    public static class372 field173 = new class372(64);

    @OriginalMember(owner = "client!ma", name = "K", descriptor = "Loi;")
    public static class73 field175 = new class73("", 11);

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!ma", name = "F", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!ma", name = "E", descriptor = "[Lpga;")
    public static class536[] field169;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(Lha;I)Z", line = 4)
    public final boolean method79(class60 arg0, int arg1) {
        ++field167;
        return arg1 != 9721 ? false : class320.method2026(82, super.field8417, super.field8423 >> class459.field6769, super.field8428 >> class459.field6769, this);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V", line = 15)
    public static final void method80(int arg0, int arg1) {
        ++field170;
        if (arg0 != -1) {
            method81(0);
        }
        class273.field3880 = arg1;
        class59.field838.method809(true);
    }

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "(I)V", line = 33)
    public static void method81(int arg0) {
        field172 = null;
        field173 = null;
        field169 = null;
        field175 = null;
        if (arg0 <= 111) {
            method82(-128, -105);
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)V", line = 48)
    public static final void method82(int arg0, int arg1) {
        ++field174;
        class184 var2 = class255.field3657.method2283(false);
        if (arg1 != -1) {
            method82(6, 13);
        }
        while (var2 != null) {
            if (~((long) arg0) == ~(var2.field2810 >> 48 & 65535L)) {
                var2.method1304((byte) 7);
            }
            var2 = class255.field3657.method2282((byte) 64);
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(IIIIII)V", line = 71)
    public class12(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field8417 = (byte) arg4;
        this.field168 = (short) arg5;
        super.field8421 = arg1;
        super.field8428 = arg2;
        super.field8423 = arg0;
        super.field8429 = (byte) arg3;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIB)V", line = 87)
    public static final void method83(int arg0, int arg1, int arg2, byte arg3) {
        ++field165;
        int var4 = arg0 * class63.field916.field10184.method2268(17503) >> 8;
        if (~arg1 == 0 && !class202.field3022) {
            class54.method379((byte) -90);
        } else if (~arg1 != 0 && (~class9.field142 != ~arg1 || !class426.method2662(99)) && var4 != 0 && !class202.field3022) {
            class308.method1952(arg2, class299.field4244, false, 0, var4, 1, arg1);
            class718.method4079((byte) -86);
        }
        if (class9.field142 != arg1) {
            class407.field6148 = null;
        }
        class9.field142 = arg1;
        if (arg3 <= 108) {
            method81(-34);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I[Lraa;)I", line = 117)
    public final int method84(int arg0, class609[] arg1) {
        ++field164;
        int var3 = super.field8423 >> class459.field6769;
        int var4 = super.field8428 >> class459.field6769;
        int var5 = 0;
        if (~class736.field10315 != ~var3) {
            if (~var3 < ~class736.field10315) {
                var5 += 2;
            }
        } else {
            ++var5;
        }
        if (arg0 < 24) {
            field172 = null;
        }
        if (~class116.field1600 == ~var4) {
            var5 += 3;
        } else if (~var4 > ~class116.field1600) {
            var5 += 6;
        }
        int var6 = class145.field1938[var5];
        if (~(var6 & this.field168) != -1) {
            return this.method3463(var4, arg1, false, var3);
        } else if (~this.field168 == -2 && ~var3 < -1) {
            return this.method3463(var4, arg1, false, var3 + -1);
        } else if (this.field168 == 4 && var3 <= class34.field356) {
            return this.method3463(var4, arg1, false, var3 + 1);
        } else if (~this.field168 == -9 && var4 > 0) {
            return this.method3463(var4 - 1, arg1, false, var3);
        } else if (~this.field168 == -3 && ~var4 >= ~class565.field8040) {
            return this.method3463(var4 - -1, arg1, false, var3);
        } else if (~this.field168 == -17 && ~var3 < -1 && ~class565.field8040 <= ~var4) {
            return this.method3463(var4 + 1, arg1, false, var3 + -1);
        } else if (this.field168 == 32 && class34.field356 >= var3 && var4 <= class565.field8040) {
            return this.method3463(var4 + 1, arg1, false, var3 + 1);
        } else if (~this.field168 == -129 && var3 > 0 && ~var4 < -1) {
            return this.method3463(var4 + -1, arg1, false, var3 + -1);
        } else if (this.field168 == 64 && ~var3 >= ~class34.field356 && ~var4 < -1) {
            return this.method3463(var4 + -1, arg1, false, var3 - -1);
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)Z", line = 199)
    public final boolean method85(int arg0) {
        int var2 = -91 % ((16 - arg0) / 58);
        ++field166;
        return class464.field6819[(super.field8423 >> class459.field6769) - -class60.field843 + -class736.field10315][(super.field8428 >> class459.field6769) + class60.field843 + -class116.field1600];
    }
}
