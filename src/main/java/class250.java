import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class250 {

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "Lmu;")
    public static class303 field3606 = new class303(92, -1);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Lhv;")
    public static class519 field3607 = new class519(14, 0);

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Lhv;")
    public static class519 field3609 = new class519(15, 4);

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Lhv;")
    public static class519 field3610 = new class519(16, -2);

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "Lhv;")
    public static class519 field3611 = new class519(17, 0);

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "Lhv;")
    public static class519 field3612 = new class519(18, -2);

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "Lhv;")
    public static class519 field3613 = new class519(19, -2);

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "Lhv;")
    public static class519 field3614 = new class519(20, 6);

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "Lhv;")
    public static class519 field3615 = new class519(21, 9);

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "Lhv;")
    public static class519 field3616 = new class519(22, -2);

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "Lhv;")
    public static class519 field3617 = new class519(23, 4);

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "Lhv;")
    public static class519 field3618 = new class519(24, -1);

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "Lhv;")
    public static class519 field3619 = new class519(26, 0);

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "Lhv;")
    public static class519 field3620 = new class519(27, 0);

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "Lhv;")
    public static class519 field3621 = new class519(28, -2);

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "[Lhv;")
    private static class519[] field3622 = new class519[32];

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field3608;

    static {
        class519[] var0 = class311.method2028((byte) 59);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field3622[var0[var1].field7212] = var0[var1];
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V", line = 4)
    public static void method1701(int arg0) {
        field3614 = null;
        field3617 = null;
        field3612 = null;
        field3620 = null;
        field3606 = null;
        if (arg0 > -74) {
            method1702(true, null, -116, -47, true, null, true);
        }
        field3618 = null;
        field3622 = null;
        field3621 = null;
        field3619 = null;
        field3607 = null;
        field3611 = null;
        field3609 = null;
        field3613 = null;
        field3610 = null;
        field3616 = null;
        field3615 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZLjava/lang/String;IIZLjava/lang/String;Z)V", line = 34)
    public static final void method1702(boolean arg0, String arg1, int arg2, int arg3, boolean arg4, String arg5, boolean arg6) {
        field3605++;
        class558.field7731.field1592 = 1;
        String var7 = arg5.toLowerCase();
        short[] var8 = new short[16];
        int var9 = -1;
        String var10 = null;
        if (arg3 != -1) {
            class118 var11 = class495.field6863.method19(arg3, 28364);
            if (var11 == null || arg0 != var11.method1031(!arg6)) {
                return;
            }
            if (var11.method1031(!arg6)) {
                var10 = var11.field2002;
            } else {
                var9 = var11.field2000;
            }
        }
        int var12 = 0;
        int var13 = 0;
        if (!arg6) {
            field3620 = null;
        }
        while (var13 < class721.field9801.field302) {
            class352 var16 = class721.field9801.method162(-74, var13);
            if ((!arg4 || var16.field4898) && var16.field4976 == -1 && var16.field4955 == -1 && var16.field4942 == 0 && var16.field4938.toLowerCase().indexOf(var7) != -1) {
                label112: {
                    if (arg3 != -1) {
                        if (arg0) {
                            if (!arg1.equals(var16.method2208(var10, arg3, -1511086397))) {
                                break label112;
                            }
                        } else if (var16.method2214(var9, -116, arg3) != arg2) {
                            break label112;
                        }
                    }
                    if (var12 >= 250) {
                        class476.field6651 = null;
                        class440.field6265 = -1;
                        return;
                    }
                    if (var8.length <= var12) {
                        short[] var17 = new short[var8.length * 2];
                        for (int var18 = 0; var18 < var12; var18++) {
                            var17[var18] = var8[var18];
                        }
                        var8 = var17;
                    }
                    var8[var12++] = (short) var13;
                }
            }
            var13++;
        }
        class476.field6651 = var8;
        class440.field6265 = var12;
        class474.field6620 = 0;
        String[] var14 = new String[class440.field6265];
        for (int var15 = 0; var15 < class440.field6265; var15++) {
            var14[var15] = class721.field9801.method162(123, var8[var15]).field4938;
        }
        class558.method3205(class476.field6651, 26073, var14);
        class558.field7731.method865((byte) 116);
        class558.field7731.field1592 = 2;
    }
}
