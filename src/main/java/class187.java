import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class187 extends class334 {

    @OriginalMember(owner = "client!so", name = "z", descriptor = "I")
    public int field2846 = -1;

    @OriginalMember(owner = "client!so", name = "o", descriptor = "Z")
    public static boolean field2835 = true;

    @OriginalMember(owner = "client!so", name = "p", descriptor = "[C")
    public static char[] field2836 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!so", name = "x", descriptor = "Lsh;")
    public static class472 field2844 = new class472(87, 28);

    @OriginalMember(owner = "client!so", name = "C", descriptor = "Lct;")
    public static class285 field2849 = new class285(38, -1);

    @OriginalMember(owner = "client!so", name = "D", descriptor = "I")
    public static int field2850 = 0;

    @OriginalMember(owner = "client!so", name = "r", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!so", name = "s", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!so", name = "t", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!so", name = "v", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!so", name = "w", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!so", name = "y", descriptor = "I")
    public int field2845;

    @OriginalMember(owner = "client!so", name = "A", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!so", name = "B", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!so", name = "q", descriptor = "Ljava/lang/String;")
    public String field2837;

    @OriginalMember(owner = "client!so", name = "u", descriptor = "Ljava/lang/String;")
    public String field2841;

    static {
        new class332("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(JB)V", line = 7)
    public static final void method1286(long arg0, byte arg1) {
        ++field2840;
        int var3 = class128.field1787;
        int var4 = class492.field6932;
        if (class312.field4705 != var3) {
            int var5 = -class312.field4705 + var3;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (~var5 < -1) {
                if (~var6 != -1) {
                    if (var5 < var6) {
                        var6 = var5;
                    }
                } else {
                    var6 = 1;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class312.field4705 += var6;
        }
        if (class379.field5641 != var4) {
            int var7 = -class379.field5641 + var4;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (~var7 >= -1) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
            } else if (~var8 == -1) {
                var8 = 1;
            } else if (~var8 < ~var7) {
                var8 = var7;
            }
            class379.field5641 += var8;
        }
        if (!class337.field5038.field3942) {
            class384.field5682 += (float) arg0 * class266.field3955 / 40.0F * 8.0F;
            class412.field5953 += (float) arg0 * class83.field1182 / 40.0F * 8.0F;
        }
        if (arg1 != 102) {
            field2844 = null;
        }
        class100.method770(true);
    }

    @OriginalMember(owner = "client!so", name = "c", descriptor = "(I)V", line = 92)
    public static final void method1287(int arg0) {
        if (arg0 == 11642) {
            class285.field4349 = null;
            class38.field531 = null;
            class144.field2044 = false;
            class489.field6850 = null;
            ++field2838;
            class140.field2004 = null;
            class433.field6159 = null;
        }
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(IB)I", line = 109)
    public static final int method1288(int arg0, byte arg1) {
        if (arg1 != 51) {
            field2835 = false;
        }
        ++field2848;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!so", name = "c", descriptor = "(IB)I", line = 120)
    public static final int method1289(int arg0, byte arg1) {
        ++field2842;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        if (arg1 != -14) {
            field2844 = null;
        }
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!so", name = "d", descriptor = "(I)V", line = 139)
    public static final void method1290(int arg0) {
        ++field2843;
        class304.field4532 = null;
        class429.field6118 = null;
        int var1 = 43 / ((36 - arg0) / 56);
    }

    @OriginalMember(owner = "client!so", name = "e", descriptor = "(B)V", line = 155)
    public static void method1291(byte arg0) {
        field2844 = null;
        field2836 = null;
        if (arg0 > -98) {
            method1287(85);
        }
        field2849 = null;
    }

    @OriginalMember(owner = "client!so", name = "e", descriptor = "(I)Lrp;", line = 167)
    public final class256 method1292(int arg0) {
        if (arg0 != 0) {
            field2849 = null;
        }
        ++field2839;
        return class449.field6347[super.field4983];
    }
}
