import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class200 extends class115 {

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "[I")
    public static int[] field3425 = new int[32];

    @OriginalMember(owner = "client!ge", name = "X", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "Lub;")
    private static class227 field3436;

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "Lub;")
    public static class227 field3433;

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "Lub;")
    public static class227 field3434;

    @OriginalMember(owner = "client!ge", name = "Y", descriptor = "[Lrj;")
    public static class93[] field3439;

    @OriginalMember(owner = "client!ge", name = "ab", descriptor = "Lub;")
    public static class227 field3441;

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "I")
    public int field3426;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "I")
    public int field3427;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
    public int field3428;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!ge", name = "Z", descriptor = "I")
    public int field3440;

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "Lbc;")
    public static class201 field3437;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "Lub;")
    public class227 field3429;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "[I")
    public int[] field3421;

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "[I")
    public int[] field3435;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "[Lbc;")
    public class201[] field3424;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "[Lub;")
    public class227[] field3431;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)Z")
    public static final boolean method1287(int arg0) {
        field3423++;
        try {
            if (class140.field2419 == 2) {
                if (class42.field702 == null) {
                    class42.field702 = class183.method1167(class252.field4359, class22.field387, class148.field2587);
                    if (class42.field702 == null) {
                        return false;
                    }
                }
                if (class199.field3408 == null) {
                    class199.field3408 = new class215(class149.field2605, class103.field1801);
                }
                if (class235.field4078.method1716(22050, class199.field3408, class47.field835, -1, class42.field702)) {
                    class235.field4078.method1722((byte) -101);
                    class235.field4078.method1703(16, class72.field1257);
                    class235.field4078.method1693(128, class235.field4076, class42.field702);
                    class199.field3408 = null;
                    class42.field702 = null;
                    class140.field2419 = 0;
                    class252.field4359 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class235.field4078.method1709(-1);
            class140.field2419 = 0;
            class42.field702 = null;
            class252.field4359 = null;
            class199.field3408 = null;
        }
        return arg0 < 6 ? false : false;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)Z")
    public static final boolean method1288(int arg0, int arg1, int arg2) {
        field3432++;
        if (arg1 == 1) {
            return (arg0 >> arg2 + 1 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)Z")
    public static final boolean method1289(int arg0, int arg1) {
        field3430++;
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        }
        if (arg1 > -38) {
            field3433 = null;
        }
        if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(Z)V")
    public static void method1290(boolean arg0) {
        field3434 = null;
        field3436 = null;
        field3433 = null;
        field3425 = null;
        field3439 = null;
        field3441 = null;
        if (arg0) {
            field3439 = null;
        }
        field3437 = null;
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(B)V")
    public static final void method1291(byte arg0) {
        int var1 = class32.field512.method660(8, true);
        if (var1 < class146.field2512) {
            for (int var2 = var1; var2 < class146.field2512; var2++) {
                class8.field164[class236.field4094++] = class15.field278[var2];
            }
        }
        field3422++;
        if (var1 > class146.field2512) {
            throw new RuntimeException("gppov1");
        }
        class146.field2512 = 0;
        if (arg0 != -80) {
            return;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class15.field278[var3];
            class225 var5 = class27.field446[var4];
            int var6 = class32.field512.method660(1, true);
            if (var6 == 0) {
                class15.field278[class146.field2512++] = var4;
                var5.field73 = class253.field4393;
            } else {
                int var7 = class32.field512.method660(2, true);
                if (var7 == 0) {
                    class15.field278[class146.field2512++] = var4;
                    var5.field73 = class253.field4393;
                    class131.field2293[class147.field2572++] = var4;
                } else if (var7 == 1) {
                    class15.field278[class146.field2512++] = var4;
                    var5.field73 = class253.field4393;
                    int var8 = class32.field512.method660(3, true);
                    var5.method19(var8, true, false);
                    int var9 = class32.field512.method660(1, true);
                    if (var9 == 1) {
                        class131.field2293[class147.field2572++] = var4;
                    }
                } else if (var7 == 2) {
                    class15.field278[class146.field2512++] = var4;
                    var5.field73 = class253.field4393;
                    int var10 = class32.field512.method660(3, true);
                    var5.method19(var10, true, true);
                    int var11 = class32.field512.method660(3, true);
                    var5.method19(var11, true, true);
                    int var12 = class32.field512.method660(1, true);
                    if (var12 == 1) {
                        class131.field2293[class147.field2572++] = var4;
                    }
                } else if (var7 == 3) {
                    class8.field164[class236.field4094++] = var4;
                }
            }
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3425[var1] = var0 - 1;
            var0 += var0;
        }
        field3438 = 0;
        field3436 = class257.method1749("flash1:", 17263);
        field3433 = field3436;
        field3434 = field3436;
        field3439 = new class93[4];
        field3441 = class257.method1749("", 17263);
    }
}
