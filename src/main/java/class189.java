import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class189 implements class258 {

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "[S")
    public static short[] field3333 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "Z")
    public static boolean field3338 = false;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Lbf;")
    public static class199 field3334 = new class199(64);

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "Lqk;")
    private static class207 field3340 = class24.method212(255, "Checking for updates )2 ");

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "Lqk;")
    public static class207 field3339 = field3340;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public static int field3341 = -1;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "Lgh;")
    public static class24 field3337;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static void method1317(int arg0) {
        field3340 = null;
        field3339 = null;
        if (arg0 == 10) {
            field3337 = null;
            field3334 = null;
            field3333 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BIII)La;")
    public static final class47 method1318(byte arg0, int arg1, int arg2, int arg3) {
        field3336++;
        class47 var4 = new class47();
        var4.field934 = arg3;
        var4.field926 = arg1;
        class171.field3028.method1863((byte) 72, var4, (long) arg2);
        class188.method1311(arg3, 20404);
        class220 var5 = class233.method1667(arg2, arg0 - 52);
        if (var5 != null) {
            class82.method614((byte) 64, var5);
        }
        if (class89.field1605 != null) {
            class82.method614((byte) 106, class89.field1605);
            class89.field1605 = null;
        }
        int var6 = class268.field4751;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class147.method1022(class82.field1494[var7], 7)) {
                class186.method1300(61, var7);
            }
        }
        if (arg0 != 80) {
            return null;
        }
        if (class268.field4751 == 1) {
            class256.field4588 = false;
            class245.method1725(class132.field2279, class214.field3806, class17.field268, 0, class182.field3250);
        } else {
            class245.method1725(class132.field2279, class214.field3806, class17.field268, 0, class182.field3250);
            int var8 = class284.field4996.method1608(class83.field1533);
            for (int var9 = 0; var9 < class268.field4751; var9++) {
                int var10 = class284.field4996.method1608(class244.method1718(var9, 0));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class132.field2279 = var8 + 8;
            class214.field3806 = class268.field4751 * 15 + (class221.field4068 ? 26 : 22);
        }
        if (var5 != null) {
            class191.method1333(var5, false, -230095088);
        }
        class153.method1097(arg3, (byte) -90);
        if (class165.field2915 != -1) {
            class41.method313(1, true, class165.field2915);
        }
        return var4;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lv;I)V")
    public static final void method1319(class149 arg0, int arg1) {
        field3332++;
        if (arg1 != -21934) {
            return;
        }
        for (int var2 = 0; var2 < class220.field4008; var2++) {
            int var3 = arg0.method1067(-32768);
            int var4 = arg0.method1050(1272006568);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class113.field1965[var3] != null) {
                class113.field1965[var3].field4938 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "([IBJI)Lqk;")
    public final class207 method1320(int[] arg0, byte arg1, long arg2, int arg3) {
        field3335++;
        if (arg3 == 0) {
            class230 var6 = class121.method859(arg0[0], false);
            return var6.method1647((int) arg2, (byte) 89);
        } else if (arg3 == 1 || arg3 == 10) {
            class173 var7 = class117.method829((int) arg2, (byte) 96);
            return var7.field3057;
        } else {
            if (arg1 != -82) {
                method1319((class149) null, 122);
            }
            return arg3 == 6 || arg3 == 7 || arg3 == 11 ? class121.method859(arg0[0], false).method1647((int) arg2, (byte) 91) : null;
        }
    }
}
