import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class172 {

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "S")
    public static short field3138 = 256;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "Lcc;")
    public static class209 field3144 = class95.method669(94, "jaune:");

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public static int field3147 = -1;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "Lbd;")
    public static class185 field3142 = new class185(128);

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "Lcc;")
    public static class209 field3150 = class95.method669(94, "<)4col>");

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "Lcc;")
    public static class209 field3148 = class95.method669(121, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "Lcc;")
    public static class209 field3151 = class95.method669(98, "titlebg");

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "Lcc;")
    public static class209 field3152 = class95.method669(92, "Veuillez patienter )2 tentative de r-Btablissement)3");

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "Ldg;")
    public static class139 field3143;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "Lcc;")
    public static class209 field3139;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "Lbi;")
    public static class91 field3146;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public static void method1188(int arg0) {
        field3143 = null;
        field3150 = null;
        field3146 = null;
        field3151 = null;
        field3152 = null;
        field3142 = null;
        int var1 = 12 / ((arg0 + 12) / 57);
        field3139 = null;
        field3144 = null;
        field3148 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIZLmb;Lmb;)I")
    public static final int method1189(int arg0, int arg1, boolean arg2, class159 arg3, class159 arg4) {
        field3141++;
        if (arg0 == 1) {
            int var5 = arg4.field2380;
            int var6 = arg3.field2380;
            if (!arg2) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg0 == 2) {
            return arg4.method1104(-108).field221.method1489((byte) 88, arg3.method1104(-116).field221);
        } else if (arg0 == 3) {
            if (arg4.field2897.method1457((byte) -63, class209.field3781)) {
                if (arg3.field2897.method1457((byte) -68, class209.field3781)) {
                    return 0;
                } else if (arg2) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg3.field2897.method1457((byte) -85, class209.field3781)) {
                return arg2 ? 1 : -1;
            } else {
                return arg4.field2897.method1489((byte) 88, arg3.field2897);
            }
        } else if (arg0 == 4) {
            if (arg4.method844((byte) -125)) {
                return arg3.method844((byte) -67) ? 0 : 1;
            } else if (arg3.method844((byte) 95)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 5) {
            if (arg4.method846(true)) {
                return arg3.method846(true) ? 0 : 1;
            } else if (arg3.method846(true)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 6) {
            if (arg4.method845(-1)) {
                return arg3.method845(-1) ? 0 : 1;
            } else if (arg3.method845(-1)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 != 7) {
            int var7 = -14 / ((4 - arg1) / 50);
            return arg4.field2894 - arg3.field2894;
        } else if (arg4.method847((byte) -98)) {
            return arg3.method847((byte) -98) ? 0 : 1;
        } else if (arg3.method847((byte) -98)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BLtf;)Ljh;")
    public static final class284 method1190(byte arg0, class106 arg1) {
        field3145++;
        if (arg0 != 41) {
            method1189(-49, 18, true, (class159) null, (class159) null);
        }
        class284 var2 = new class284(arg1.method755(1), arg1.method755(1), arg1.method736(127), arg1.method736(123), arg1.method746((byte) -100), arg1.method774((byte) 92) == 1);
        int var3 = arg1.method774((byte) 122);
        for (int var4 = 0; var4 < var3; var4++) {
            var2.field4980.method1123(new class167(arg1.method736(127), arg1.method736(arg0 ^ 0x54), arg1.method736(arg0 + 84), arg1.method736(127)), (byte) -128);
        }
        var2.method1912(true);
        return var2;
    }
}
