import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class508 extends class89 {

    @OriginalMember(owner = "client!vs", name = "n", descriptor = "Lbj;")
    public static class430 field7176 = new class430();

    @OriginalMember(owner = "client!vs", name = "w", descriptor = "Lqia;")
    public static class547 field7185 = new class547();

    @OriginalMember(owner = "client!vs", name = "A", descriptor = "Z")
    public static boolean field7189 = false;

    @OriginalMember(owner = "client!vs", name = "y", descriptor = "Lqi;")
    public static class669 field7187 = new class669(0, 1);

    @OriginalMember(owner = "client!vs", name = "o", descriptor = "I")
    public static int field7177;

    @OriginalMember(owner = "client!vs", name = "p", descriptor = "I")
    public static int field7178;

    @OriginalMember(owner = "client!vs", name = "q", descriptor = "I")
    public static int field7179;

    @OriginalMember(owner = "client!vs", name = "r", descriptor = "I")
    public static int field7180;

    @OriginalMember(owner = "client!vs", name = "s", descriptor = "I")
    public static int field7181;

    @OriginalMember(owner = "client!vs", name = "u", descriptor = "I")
    public static int field7183;

    @OriginalMember(owner = "client!vs", name = "v", descriptor = "I")
    public static int field7184;

    @OriginalMember(owner = "client!vs", name = "B", descriptor = "I")
    public static int field7190;

    @OriginalMember(owner = "client!vs", name = "z", descriptor = "Lmw;")
    public static class457 field7188;

    @OriginalMember(owner = "client!vs", name = "t", descriptor = "Lac;")
    private class712 field7182;

    @OriginalMember(owner = "client!vs", name = "x", descriptor = "Lmq;")
    public static class78 field7186;

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(IIIZ)V")
    public final void method622(int arg0, int arg1, int arg2, boolean arg3) {
        ++field7184;
        class458.field6407.method136(arg1 - arg2, arg0, super.field1128.field8673 + 4, super.field1128.field8665 + 2, ((class663) super.field1128).field9085, 0);
        class458.field6407.method136(arg1 + -1, arg0 - -1, super.field1128.field8673 + 2, super.field1128.field8665, 0, 0);
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lkha;Lkha;Lfa;)V")
    public class508(class687 arg0, class687 arg1, class663 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "([BZI)V")
    public static final void method2933(byte[] arg0, boolean arg1, int arg2) {
        if (class748.field10468 == null) {
            class748.field10468 = new class179(20000);
        }
        if (arg2 < 55) {
            method2933((byte[]) null, true, -104);
        }
        ++field7177;
        class748.field10468.method1123(arg0.length, (byte) 34, 0, arg0);
        if (arg1) {
            class142.method876(-3671, class748.field10468.field2325);
            class303.field3903 = new class266[class642.field8864];
            int var3 = 0;
            for (int var4 = class33.field518; var4 <= class466.field6725; ++var4) {
                class266 var5 = class531.method3032(var4, (byte) -101);
                if (var5 != null) {
                    class303.field3903[var3++] = var5;
                }
            }
            class372.field5233 = false;
            class750.field10503 = class97.method654((byte) 114);
            class748.field10468 = null;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIIZ)V")
    public final void method619(int arg0, int arg1, int arg2, boolean arg3) {
        ++field7179;
        int var5 = this.method618(10000) * super.field1128.field8673 / 10000;
        int var6 = 71 / ((12 - arg2) / 43);
        int[] var7 = new int[4];
        class458.field6407.method76(var7);
        class458.field6407.method131(arg0, arg1 + 2, arg0 + var5, super.field1128.field8665 + arg1);
        this.field7182.method3938(arg0, arg1 - -2, super.field1128.field8673, super.field1128.field8665);
        class458.field6407.method131(var7[0], var7[1], var7[2], var7[3]);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V")
    public final void method621(int arg0) {
        super.method621(arg0);
        ++field7178;
        this.field7182 = class339.method1984(super.field1132, ((class663) super.field1128).field9086, arg0 + -27738);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
    public static final void method2934(String arg0, boolean arg1, int arg2) {
        ++field7181;
        if (arg0 != null) {
            if (~class497.field7034 <= -101) {
                class395.method2352(class586.field8164.method3261(class416.field5920, (byte) 82), 4, -128);
            } else {
                String var3 = class165.method1022((byte) 102, arg0);
                if (var3 != null) {
                    for (int var4 = 0; ~class497.field7034 < ~var4; ++var4) {
                        String var9 = class165.method1022((byte) 114, class736.field10317[var4]);
                        if (var9 != null && var9.equals(var3)) {
                            class395.method2352(arg0 + class586.field8165.method3261(class416.field5920, (byte) 82), 4, arg2 + -132);
                            return;
                        }
                        if (class415.field5866[var4] != null) {
                            String var10 = class165.method1022((byte) 120, class415.field5866[var4]);
                            if (var10 != null && var10.equals(var3)) {
                                class395.method2352(arg0 + class586.field8165.method3261(class416.field5920, (byte) 82), 4, -128);
                                return;
                            }
                        }
                    }
                    int var5 = 0;
                    if (arg2 != 4) {
                        method2933((byte[]) null, false, 71);
                    }
                    while (~class727.field10184 < ~var5) {
                        String var7 = class165.method1022((byte) 124, class4.field34[var5]);
                        if (var7 != null && var7.equals(var3)) {
                            class395.method2352(class586.field8170.method3261(class416.field5920, (byte) 82) + arg0 + class586.field8171.method3261(class416.field5920, (byte) 82), 4, arg2 + -132);
                            return;
                        }
                        if (class17.field238[var5] != null) {
                            String var8 = class165.method1022((byte) 123, class17.field238[var5]);
                            if (var8 != null && var8.equals(var3)) {
                                class395.method2352(class586.field8170.method3261(class416.field5920, (byte) 82) + arg0 + class586.field8171.method3261(class416.field5920, (byte) 82), 4, -128);
                                return;
                            }
                        }
                        ++var5;
                    }
                    if (class165.method1022((byte) 102, class339.field4374.field7690).equals(var3)) {
                        class395.method2352(class586.field8167.method3261(class416.field5920, (byte) 82), 4, -128);
                    } else {
                        ++class411.field5795;
                        class650 var6 = class314.method1837(class744.field10381, true, class625.field8727);
                        var6.field8928.method1141(class663.method3588(0, arg0) + 1, arg2 ^ -113);
                        var6.field8928.method1110(arg0, -30452);
                        var6.field8928.method1141(!arg1 ? 0 : 1, 110);
                        class108.method745(var6, -80);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)Z")
    public final boolean method616(byte arg0) {
        ++field7183;
        return !super.method616(arg0) ? false : super.field1132.method3827(((class663) super.field1128).field9086, (byte) 96);
    }

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "(I)V")
    public static void method2935(int arg0) {
        field7187 = null;
        field7186 = null;
        field7185 = null;
        field7188 = null;
        field7176 = null;
        if (arg0 != 1) {
            field7176 = null;
        }
    }
}
