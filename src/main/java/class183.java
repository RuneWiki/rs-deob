import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class183 {

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "Ldf;")
    public static class51 field3021 = class46.method233("loginscreen", 100);

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "Ldf;")
    private static class51 field3020 = class46.method233("wave2:", 100);

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "Ldf;")
    public static class51 field3023 = class46.method233("Standort", 100);

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "Ldf;")
    public static class51 field3026 = class46.method233("VOLL", 100);

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "Ldf;")
    public static class51 field3024 = field3020;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "Ldf;")
    public static class51 field3028 = field3020;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field3015 = 0;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "Ldf;")
    private static class51 field3030 = class46.method233("Use", 100);

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "Ldf;")
    public static class51 field3029 = class46.method233(" <col=ffff00>", 100);

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "Z")
    public static boolean field3032 = true;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "Ldf;")
    public static class51 field3031 = field3030;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "Lu;")
    public static class111 field3027;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "Lkb;")
    public class49 field3017;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public static void method1294(byte arg0) {
        field3031 = null;
        field3028 = null;
        field3023 = null;
        field3021 = null;
        field3029 = null;
        field3030 = null;
        field3027 = null;
        if (arg0 <= 27) {
            field3032 = false;
        }
        field3020 = null;
        field3024 = null;
        field3026 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILdf;)Z")
    public static final boolean method1295(int arg0, class51 arg1) {
        field3022++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 != 11418) {
            method1299(-24);
        }
        for (int var2 = 0; var2 < class184.field3051; var2++) {
            if (arg1.method292(true, class216.field3749[var2])) {
                return true;
            }
        }
        return arg1.method292(true, class44.field706.field1711);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Llb;I)Lwa;")
    public static final class238 method1296(class121 arg0, int arg1) {
        if (arg1 != -1) {
            field3024 = null;
        }
        field3018++;
        return new class238(arg0.method884(14513), arg0.method884(14513), arg0.method884(14513), arg0.method884(arg1 ^ 0xFFFFC74E), arg0.method891((byte) -110), arg0.method891((byte) -119), arg0.method897(-46));
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZ[Lwc;)V")
    public static final void method1297(int arg0, boolean arg1, class213[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class213 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field3623 == 0) {
                    if (var4.field3556 != null) {
                        method1297(arg0, false, var4.field3556);
                    }
                    class42 var5 = (class42) class79.field1265.method1453((long) var4.field3703, 1);
                    if (var5 != null) {
                        class17.method88(var5.field668, (byte) -126, arg0);
                    }
                }
                if (arg0 == 0 && var4.field3555 != null) {
                    class205 var6 = new class205();
                    var6.field3433 = var4;
                    var6.field3423 = var4.field3555;
                    class176.method1233(var6, (byte) 113);
                }
                if (arg0 == 1 && var4.field3542 != null) {
                    if (var4.field3568 >= 0) {
                        class213 var7 = class198.method1392(11823, var4.field3703);
                        if (var7 == null || var7.field3556 == null || var4.field3568 >= var7.field3556.length || var7.field3556[var4.field3568] != var4) {
                            continue;
                        }
                    }
                    class205 var8 = new class205();
                    var8.field3433 = var4;
                    var8.field3423 = var4.field3542;
                    class176.method1233(var8, (byte) 123);
                }
            }
        }
        field3019++;
        if (arg1) {
            field3030 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILwc;)Ldf;")
    public static final class51 method1298(int arg0, class213 arg1) {
        field3025++;
        if (class149.method1075(client.method1061(arg1), arg0 ^ 0x3E44E68D) == 0) {
            return null;
        } else if (arg1.field3541 == null || arg1.field3541.method310(-1).method293(false) == 0) {
            return class79.field1263 ? class28.field402 : null;
        } else {
            if (arg0 != 31942) {
                method1299(34);
            }
            return arg1.field3541;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
    public static final void method1299(int arg0) {
        field3016++;
        class75.field1214.method1353(arg0 - 90);
        if (arg0 != 0) {
            method1298(-83, (class213) null);
        }
    }
}
