import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class215 extends class40 {

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
    private final int field3893;

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "I")
    private final int field3904;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    private final int field3891;

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "I")
    private final int field3900;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "Lhj;")
    public static class69 field3892 = class181.method1318("<col=40ff00>", (byte) -122);

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "Lhj;")
    private static class69 field3895 = class181.method1318("Continue", (byte) -127);

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "I")
    public static int field3899 = (int) (33.0D * Math.random()) - 16;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "Lhj;")
    public static class69 field3888 = field3895;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "Lhj;")
    public static class69 field3894 = class181.method1318(")1", (byte) -105);

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "[Z")
    public static boolean[] field3903 = new boolean[8];

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!ia", name = "B", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!ia", name = "C", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(IIIIII)V")
    public class215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field3893 = arg3;
        this.field3904 = arg0;
        this.field3891 = arg2;
        this.field3900 = arg1;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lhj;JIIIII)V")
    public static final void method1546(class69 arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3898;
        class128 var8 = new class128(128);
        var8.method933(10, -20946);
        var8.method943((byte) 127, (int) (Math.random() * 99999.0D));
        var8.method943((byte) 127, 512);
        var8.method918(arg1, 18820);
        var8.method908(false, (int) (9.9999999E7D * Math.random()));
        var8.method927(arg0, (byte) 125);
        var8.method908(false, (int) (Math.random() * 9.9999999E7D));
        if (arg3 != -10) {
            field3903 = null;
        }
        var8.method943((byte) 127, class114.field2181);
        var8.method933(arg6, -20946);
        var8.method933(arg4, -20946);
        var8.method908(false, (int) (9.9999999E7D * Math.random()));
        var8.method943((byte) 127, arg5);
        var8.method943((byte) 127, arg2);
        var8.method908(false, (int) (Math.random() * 9.9999999E7D));
        var8.method913(0, class241.field4422, class266.field4724);
        class48.field692.field2379 = 0;
        class48.field692.method933(237, -20946);
        class48.field692.method933(var8.field2379, -20946);
        class48.field692.method921((byte) -17, var8.field2379, var8.field2385, 0);
        class266.field4735 = 1;
        class28.field407 = -3;
        class227.field4138 = 0;
        class73.field1404 = 0;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(BII)V")
    public final void method106(byte arg0, int arg1, int arg2) {
        int var4 = this.field3904 * arg2 >> 12;
        int var5 = this.field3900 * arg1 >> 12;
        ++field3901;
        int var6 = this.field3891 * arg2 >> 12;
        int var7 = this.field3893 * arg1 >> 12;
        class136.method1021(var7, super.field567, var4, (byte) -37, var6, var5);
        if (arg0 >= -102) {
            this.method110(10, -44, -99);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public static void method1547(byte arg0) {
        field3892 = null;
        field3903 = null;
        field3895 = null;
        if (arg0 > -21) {
            field3892 = null;
        }
        field3888 = null;
        field3894 = null;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(III)V")
    public static final void method1548(int arg0, int arg1, int arg2) {
        ++field3889;
        if (class131.method971(arg1, (byte) 94)) {
            class118.method863(arg0, class116.field2222[arg1], -2);
            int var3 = -97 % ((arg2 - -62) / 39);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)Log;")
    public static final class210 method1549(boolean arg0) {
        ++field3896;
        try {
            return !arg0 ? null : (class210) Class.forName("qi").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BII)V")
    public final void method111(byte arg0, int arg1, int arg2) {
        if (arg0 != -101) {
            method1549(false);
        }
        ++field3890;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILhj;III)V")
    public static final void method1550(int arg0, class69 arg1, int arg2, int arg3, int arg4) {
        class50 var5 = class108.method814(arg2, arg3, arg0 + -113705);
        ++field3902;
        if (var5 != null) {
            if (var5.field777 != null) {
                class58 var6 = new class58();
                var6.field1042 = arg4;
                var6.field1052 = arg1;
                var6.field1048 = var5;
                var6.field1050 = var5.field777;
                class179.method1304((byte) 78, var6);
            }
            boolean var7 = true;
            if (~var5.field828 < -1) {
                var7 = class56.method336(var5, (byte) 17);
            }
            if (var7) {
                if (class8.method36(client.method1141(var5), arg0 ^ 100036, arg4 + -1)) {
                    if (arg4 == 1) {
                        class48.field692.method301(128, arg0 + -100103);
                        class48.field692.method908(false, arg3);
                        ++class109.field2083;
                        class48.field692.method943((byte) 127, arg2);
                    }
                    if (~arg4 == -3) {
                        ++class49.field717;
                        class48.field692.method301(62, -104);
                        class48.field692.method908(false, arg3);
                        class48.field692.method943((byte) 127, arg2);
                    }
                    if (~arg4 == -4) {
                        ++class164.field3027;
                        class48.field692.method301(37, -104);
                        class48.field692.method908(false, arg3);
                        class48.field692.method943((byte) 127, arg2);
                    }
                    if (arg4 == 4) {
                        ++class243.field4454;
                        class48.field692.method301(183, -104);
                        class48.field692.method908(false, arg3);
                        class48.field692.method943((byte) 127, arg2);
                    }
                    if (~arg4 == -6) {
                        class48.field692.method301(226, -104);
                        class48.field692.method908(false, arg3);
                        class48.field692.method943((byte) 127, arg2);
                        ++class116.field2209;
                    }
                    if (arg4 == 6) {
                        class48.field692.method301(115, -104);
                        class48.field692.method908(false, arg3);
                        class48.field692.method943((byte) 127, arg2);
                        ++class172.field3144;
                    }
                    if (arg4 == 7) {
                        ++class106.field1996;
                        class48.field692.method301(158, -104);
                        class48.field692.method908(false, arg3);
                        class48.field692.method943((byte) 127, arg2);
                    }
                    if (arg4 == 8) {
                        class48.field692.method301(206, arg0 + -100103);
                        ++class196.field3567;
                        class48.field692.method908(false, arg3);
                        class48.field692.method943((byte) 127, arg2);
                    }
                    if (arg0 == 99999) {
                        if (~arg4 == -10) {
                            class48.field692.method301(246, arg0 + -100103);
                            class48.field692.method908(false, arg3);
                            class48.field692.method943((byte) 127, arg2);
                            ++class126.field2318;
                        }
                        if (arg4 == 10) {
                            class48.field692.method301(240, -104);
                            ++class11.field99;
                            class48.field692.method908(false, arg3);
                            class48.field692.method943((byte) 127, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)V")
    public final void method110(int arg0, int arg1, int arg2) {
        if (arg2 != 100) {
            field3895 = null;
        }
        ++field3897;
    }
}
