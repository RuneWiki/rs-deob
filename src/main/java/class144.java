import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class144 extends class148 {

    @OriginalMember(owner = "client!va", name = "B", descriptor = "Lja;")
    public static class62 field3358 = class30.method243(43, "va");

    @OriginalMember(owner = "client!va", name = "z", descriptor = "I")
    public static int field3356 = 0;

    @OriginalMember(owner = "client!va", name = "I", descriptor = "Lja;")
    private static class62 field3365 = class30.method243(43, " ");

    @OriginalMember(owner = "client!va", name = "E", descriptor = "Z")
    public static boolean field3361 = false;

    @OriginalMember(owner = "client!va", name = "L", descriptor = "Lja;")
    private static class62 field3368 = class30.method243(43, "Too many incorrect logins from your address)3");

    @OriginalMember(owner = "client!va", name = "H", descriptor = "Lja;")
    public static class62 field3364 = field3365;

    @OriginalMember(owner = "client!va", name = "G", descriptor = "Lja;")
    public static class62 field3363 = field3368;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "I")
    public int field3357;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!va", name = "F", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!va", name = "N", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!va", name = "M", descriptor = "Lu;")
    public class141 field3369;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "Lea;")
    public class29 field3360;

    @OriginalMember(owner = "client!va", name = "K", descriptor = "[B")
    public byte[] field3367;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(B)Z")
    public static final boolean method1137(byte arg0) {
        field3355++;
        if (arg0 != -16) {
            field3361 = true;
        }
        try {
            if (class43.field1011 == 2) {
                if (class142.field3315 == null) {
                    class142.field3315 = class33.method258(class15.field368, class22.field518, class90.field2143);
                    if (class142.field3315 == null) {
                        return false;
                    }
                }
                if (class8.field226 == null) {
                    class8.field226 = new class15(class84.field2013, class43.field1004);
                }
                if (class94.field2215.method47(class98.field2292, class142.field3315, 22050, class8.field226, (byte) 40)) {
                    class94.field2215.method57(125);
                    class94.field2215.method58((byte) -21, class151.field3542);
                    class94.field2215.method46((byte) -42, class93.field2179, class142.field3315);
                    class15.field368 = null;
                    class8.field226 = null;
                    class43.field1011 = 0;
                    class142.field3315 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class94.field2215.method50((byte) -31);
            class8.field226 = null;
            class142.field3315 = null;
            class43.field1011 = 0;
            class15.field368 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(B)V")
    public static void method1138(byte arg0) {
        field3363 = null;
        field3365 = null;
        if (arg0 < 102) {
            method1140(67, 115, 75, (byte) 56, -9);
        }
        field3368 = null;
        field3364 = null;
        field3358 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(JB)V")
    public static final void method1139(long arg0, byte arg1) {
        field3362++;
        if (arg0 == 0L) {
            return;
        }
        if (class54.field1334 >= 100 && class43.field994 != 1 || class54.field1334 >= 200) {
            class43.method320(0, 0, class110.field2512, class83.field1991);
            return;
        }
        class62 var3 = class111.method899(false, arg0).method462(125);
        for (int var4 = 0; var4 < class54.field1334; var4++) {
            if (class94.field2217[var4] == arg0) {
                class43.method320(0, 0, class70.method594(new class62[] { var3, class50.field1155 }, 1229), class83.field1991);
                return;
            }
        }
        for (int var5 = 0; var5 < class100.field2339; var5++) {
            if (class47.field1077[var5] == arg0) {
                class43.method320(0, 0, class70.method594(new class62[] { class39.field909, var3, class38.field891 }, 1229), class83.field1991);
                return;
            }
        }
        if (var3.method475(82, class40.field936.field2653)) {
            class43.method320(0, 0, class71.field1805, class83.field1991);
            return;
        }
        class6.field140++;
        class155.field3597[class54.field1334] = var3;
        class94.field2217[class54.field1334] = arg0;
        class136.field3128[class54.field1334] = 0;
        if (arg1 >= -18) {
            field3358 = null;
        }
        class39.field918[class54.field1334] = 0;
        class5.field102 = class150.field3538;
        class54.field1334++;
        class136.field3140.method810(-2, 50);
        class136.field3140.method1008(arg0, (byte) 38);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIBI)V")
    public static final void method1140(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (class77.field1899 == 1) {
            class110.field2522[class98.field2300 / 100].method417(class68.field1711 - 8, class97.field2270 + -8);
        }
        field3366++;
        if (class77.field1899 == 2) {
            class110.field2522[class98.field2300 / 100 + 4].method417(class68.field1711 - 8, class97.field2270 + -8);
        }
        class5.method55(-1549588921);
        if (arg3 != 78 || !class126.field2843) {
            return;
        }
        int var5 = arg1 + 512 - 5;
        int var6 = arg2 + 20;
        class86.field2067.method699(class70.method594(new class62[] { class94.field2204, class31.method249(true, class84.field2026) }, 1229), var5, var6, 16776960, -1);
        Runtime var7 = Runtime.getRuntime();
        int var8 = 16776960;
        int var9 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
        if (var9 > 32768 && field3361) {
            var8 = 16711680;
        }
        var6 += 15;
        if (var9 > 65536 && !field3361) {
            var8 = 16711680;
        }
        class86.field2067.method699(class70.method594(new class62[] { class120.field2764, class31.method249(true, var9), class12.field291 }, 1229), var5, var6, var8, -1);
        var6 += 15;
    }
}
