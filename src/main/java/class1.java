import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 extends class88 {

    @OriginalMember(owner = "client!a", name = "y", descriptor = "[B")
    public byte[] field4;

    @OriginalMember(owner = "client!a", name = "w", descriptor = "Ltd;")
    public static class136 field2 = class145.method1172("0(U", 45);

    @OriginalMember(owner = "client!a", name = "B", descriptor = "Ltd;")
    private static class136 field7 = class145.method1172("OFF", 45);

    @OriginalMember(owner = "client!a", name = "z", descriptor = "I")
    public static int field5 = 20;

    @OriginalMember(owner = "client!a", name = "x", descriptor = "Ltd;")
    public static class136 field3 = field7;

    @OriginalMember(owner = "client!a", name = "A", descriptor = "Ltd;")
    public static class136 field6 = class145.method1172("Zu viele Anmelde)2Versuche von Ihrer Adresse", 45);

    @OriginalMember(owner = "client!a", name = "K", descriptor = "I")
    public static int field14 = 0;

    @OriginalMember(owner = "client!a", name = "P", descriptor = "Ltd;")
    private static class136 field18 = class145.method1172("K", 45);

    @OriginalMember(owner = "client!a", name = "E", descriptor = "Ltd;")
    public static class136 field9 = field18;

    @OriginalMember(owner = "client!a", name = "Q", descriptor = "[B")
    public static byte[] field19 = new byte[520];

    @OriginalMember(owner = "client!a", name = "G", descriptor = "I")
    public static int field10 = 0;

    @OriginalMember(owner = "client!a", name = "M", descriptor = "[Lsb;")
    public static class127[] field15 = new class127[2048];

    @OriginalMember(owner = "client!a", name = "N", descriptor = "Ltd;")
    public static class136 field16 = class145.method1172("weiss:", 45);

    @OriginalMember(owner = "client!a", name = "J", descriptor = "Ltd;")
    public static class136 field13 = field18;

    @OriginalMember(owner = "client!a", name = "H", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!a", name = "I", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!a", name = "O", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!a", name = "D", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "Lla;")
    public static class77 field1;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(III)V")
    public static final void method1(int arg0, int arg1, int arg2) {
        field11++;
        if (class147.field3416 != 0 && class147.field3416 != 3) {
            return;
        }
        if (class51.field1155 == 1) {
            int var3 = class146.field3379 - arg1 - 25;
            int var4 = class8.field142 - arg2 - 5;
            if (var3 >= 0 && var4 >= 0 && var3 < 146 && var4 < 151) {
                var3 -= 73;
                int var5 = class151.field3467 + class141.field3269 & 0x7FF;
                var4 -= 75;
                int var6 = class103.field2456[var5];
                int var7 = class103.field2452[var5];
                int var8 = (class109.field2572 + 256) * var7 >> 8;
                int var9 = (class109.field2572 + 256) * var6 >> 8;
                int var10 = var4 * var8 - var3 * var9 >> 11;
                int var11 = class24.field555.field3578 - var10 >> 7;
                int var12 = var4 * var9 + var3 * var8 >> 11;
                int var13 = class24.field555.field3580 + var12 >> 7;
                boolean var14 = class41.method345(0, 0, 0, 0, class24.field555.field3581[0], 1, class24.field555.field3560[0], var11, true, 0, var13, false);
                if (var14) {
                    class15.field304.method1026(var3, (byte) 127);
                    class15.field304.method1026(var4, (byte) 127);
                    class15.field304.method997(class151.field3467, true);
                    class15.field304.method1026(57, (byte) 127);
                    class15.field304.method1026(class141.field3269, (byte) 127);
                    class15.field304.method1026(class109.field2572, (byte) 127);
                    class15.field304.method1026(89, (byte) 127);
                    class15.field304.method997(class24.field555.field3580, true);
                    class15.field304.method997(class24.field555.field3578, true);
                    class15.field304.method1026(class29.field640, (byte) 127);
                    class15.field304.method1026(63, (byte) 127);
                }
            }
        }
        if (arg0 >= -62) {
            field6 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
    public static void method2(int arg0) {
        field3 = null;
        field7 = null;
        if (arg0 != 30503) {
            return;
        }
        field19 = null;
        field13 = null;
        field16 = null;
        field1 = null;
        field18 = null;
        field15 = null;
        field2 = null;
        field6 = null;
        field9 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lpd;IILaf;)V")
    public static final void method3(class108 arg0, int arg1, int arg2, class7 arg3) {
        field17++;
        byte[] var4 = null;
        class69 var5 = class147.field3383;
        synchronized (class147.field3383) {
            for (class93 var6 = (class93) class147.field3383.method512(arg2); var6 != null; var6 = (class93) class147.field3383.method520((byte) 34)) {
                if ((long) arg1 == var6.field2090 && var6.field2177 == arg3 && var6.field2192 == 0) {
                    var4 = var6.field2193;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var7 = arg3.method37(arg2 - 13300, arg1);
            arg0.method857(arg1, true, (byte) 26, var7, arg3);
        } else {
            arg0.method857(arg1, true, (byte) 26, var4, arg3);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
    public static final Object method4(byte[] arg0, boolean arg1, int arg2) {
        field12++;
        int var3 = -67 % ((52 - arg2) / 56);
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class74.field1553) {
            try {
                class8 var4 = (class8) Class.forName("ff").getDeclaredConstructor().newInstance();
                var4.method41(6566, arg0);
                return var4;
            } catch (Throwable var5) {
                class74.field1553 = true;
            }
        }
        return arg1 ? class140.method1140(false, arg0) : arg0;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "([B)V")
    public class1(byte[] arg0) {
        this.field4 = arg0;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method5(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8++;
        if (class91.method688(arg3, (byte) -128)) {
            class133.method1081(class94.field2201[arg3], -1, arg7, arg0, arg4, arg1, arg6 ^ 0xFFFFB939, arg2, arg5);
            if (arg6 != -13751) {
                method1(-71, -121, 20);
            }
        }
    }
}
