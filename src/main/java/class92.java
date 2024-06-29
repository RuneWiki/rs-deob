import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class92 extends class82 {

    @OriginalMember(owner = "client!id", name = "ab", descriptor = "I")
    private int field1721 = 4096;

    @OriginalMember(owner = "client!id", name = "T", descriptor = "Ldj;")
    public static class44 field1714 = class89.method650(255, "(Z");

    @OriginalMember(owner = "client!id", name = "U", descriptor = "Ldj;")
    public static class44 field1715 = class89.method650(255, "AUS");

    @OriginalMember(owner = "client!id", name = "R", descriptor = "Ls;")
    public static class190 field1712 = new class190();

    @OriginalMember(owner = "client!id", name = "db", descriptor = "I")
    public static int field1724 = 0;

    @OriginalMember(owner = "client!id", name = "bb", descriptor = "Ldj;")
    private static class44 field1722 = class89.method650(255, " is already on your ignore list)3");

    @OriginalMember(owner = "client!id", name = "fb", descriptor = "Ldj;")
    public static class44 field1726 = field1722;

    @OriginalMember(owner = "client!id", name = "P", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!id", name = "S", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!id", name = "V", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!id", name = "W", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!id", name = "X", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!id", name = "Y", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!id", name = "eb", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!id", name = "Z", descriptor = "Z")
    public static boolean field1720;

    @OriginalMember(owner = "client!id", name = "cb", descriptor = "[I")
    public static int[] field1723;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        if (arg0 != 25238) {
            return null;
        } else {
            ++field1718;
            int[] var3 = super.field1595.method603(true, arg1);
            if (super.field1595.field1538) {
                int[] var4 = this.method620(arg0 ^ 26826, class101.field1850 & arg1 - 1, 0);
                int[] var5 = this.method620(2652, arg1, 0);
                int[] var6 = this.method620(2652, class101.field1850 & arg1 - -1, 0);
                for (int var7 = 0; class129.field2287 > var7; ++var7) {
                    int var8 = (var6[var7] + -var4[var7]) * this.field1721;
                    int var9 = (var5[var7 + 1 & class53.field943] + -var5[var7 + -1 & class53.field943]) * this.field1721;
                    int var10 = var9 >> 12;
                    int var11 = var8 >> 12;
                    int var12 = var10 * var10 >> 12;
                    int var13 = var11 * var11 >> 12;
                    int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 + var13 - -4096) / 4096.0F)));
                    int var15 = var14 == 0 ? 0 : 16777216 / var14;
                    var3[var7] = 4096 - var15;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BLve;)V")
    public static final void method658(byte arg0, class225 arg1) {
        class36.field652 = arg1;
        if (arg0 < 118) {
            field1722 = null;
        }
        ++field1710;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(B)V")
    public static void method659(byte arg0) {
        field1714 = null;
        field1723 = null;
        field1712 = null;
        field1726 = null;
        int var1 = 78 / ((arg0 - 5) / 55);
        field1722 = null;
        field1715 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        ++field1717;
        if (arg1 == 0) {
            this.field1721 = arg0.method500(arg2);
        }
        if (arg2 != 68) {
            method658((byte) -114, (class225) null);
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
    public class92() {
        super(1, true);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lfj;II)Ldj;")
    public static final class44 method660(class66 arg0, int arg1, int arg2) {
        ++field1719;
        try {
            class44 var3 = new class44();
            var3.field849 = arg0.method530((byte) -117);
            if (~var3.field849 < ~arg2) {
                var3.field849 = arg2;
            }
            var3.field822 = new byte[var3.field849];
            arg0.field1195 += class97.field1784.method1427(arg1, arg0.field1195, var3.field822, (byte) 107, var3.field849, arg0.field1219);
            return var3;
        } catch (Exception var4) {
            return class118.field2104;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ldj;ILdj;Ldj;I)V")
    public static final void method661(class44 arg0, int arg1, class44 arg2, class44 arg3, int arg4) {
        ++field1713;
        class190.method1191(arg0, -29786, arg3, arg4, arg2, arg1);
    }

    @OriginalMember(owner = "client!id", name = "g", descriptor = "(I)V")
    public static final void method662(int arg0) {
        ++field1711;
        if (arg0 != -2) {
            method661((class44) null, 35, (class44) null, (class44) null, -16);
        }
        for (class132 var1 = (class132) class210.field3754.method1189(arg0 + 2); var1 != null; var1 = (class132) class210.field3754.method1192((byte) -124)) {
            if (~var1.field2361 < -1) {
                --var1.field2361;
            }
            if (~var1.field2361 == -1) {
                if (~var1.field2372 > -1 || class196.method1272(var1.field2358, (byte) -97, var1.field2372)) {
                    class178.method1127(var1.field2357, var1.field2363, var1.field2371, var1.field2359, 32, var1.field2367, var1.field2372, var1.field2358);
                    var1.method1148(-13215);
                }
            } else {
                if (var1.field2366 > 0) {
                    --var1.field2366;
                }
                if (var1.field2366 == 0 && ~var1.field2363 <= -2 && ~var1.field2371 <= -2 && var1.field2363 <= 102 && ~var1.field2371 >= -103 && (var1.field2364 < 0 || class196.method1272(var1.field2370, (byte) -104, var1.field2364))) {
                    class178.method1127(var1.field2357, var1.field2363, var1.field2371, var1.field2374, 32, var1.field2367, var1.field2364, var1.field2370);
                    var1.field2366 = -1;
                    if (~var1.field2372 == ~var1.field2364 && ~var1.field2372 == 0) {
                        var1.method1148(arg0 + -13213);
                    } else if (var1.field2372 == var1.field2364 && ~var1.field2374 == ~var1.field2359 && var1.field2370 == var1.field2358) {
                        var1.method1148(-13215);
                    }
                }
            }
        }
    }
}
