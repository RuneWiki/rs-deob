import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class59 {

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field1244 = 0;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "Lie;")
    public static class117 field1243 = new class117(200);

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "Lia;")
    private static class257 field1246 = class28.method234(87, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public static int field1249 = 0;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "Lia;")
    public static class257 field1252 = field1246;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "Lia;")
    private static class257 field1247 = class28.method234(-106, "OFF");

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "Lia;")
    public static class257 field1251 = field1247;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "Lmb;")
    public static class178 field1250;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "Z")
    public static boolean field1248;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
    public static void method443(byte arg0) {
        field1250 = null;
        field1247 = null;
        field1252 = null;
        field1251 = null;
        field1246 = null;
        field1243 = null;
        int var1 = -93 / ((arg0 + 26) / 58);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IBLmb;)Lfd;")
    public static final class253 method444(int arg0, byte arg1, class178 arg2) {
        byte[] var3 = arg2.method1212(arg1 ^ 0x6A4E, arg0);
        field1240++;
        if (var3 == null) {
            return null;
        } else if (arg1 == -120) {
            return new class253(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)Z")
    public static final boolean method445(byte arg0) {
        field1239++;
        try {
            if (class244.field4242 == 2) {
                if (class182.field3154 == null) {
                    class182.field3154 = class110.method805(class252.field4334, class178.field3086, class196.field3316);
                    if (class182.field3154 == null) {
                        return false;
                    }
                }
                if (class42.field847 == null) {
                    class42.field847 = new class191(class205.field3510, class175.field2990);
                }
                if (class40.field835.method22(22050, 0, class42.field847, class182.field3154, class5.field131)) {
                    class40.field835.method43(111);
                    class40.field835.method6((byte) 125, class55.field1179);
                    class40.field835.method41(class182.field3154, class19.field405, 23395);
                    class182.field3154 = null;
                    class244.field4242 = 0;
                    class252.field4334 = null;
                    class42.field847 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class40.field835.method25(false);
            class42.field847 = null;
            class252.field4334 = null;
            class182.field3154 = null;
            class244.field4242 = 0;
        }
        return arg0 < 29 ? false : false;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)I")
    public static final int method446(int arg0, int arg1, int arg2) {
        if (arg1 <= 25) {
            method445((byte) 47);
        }
        field1242++;
        int var3 = class205.method1376(arg0 - 1, arg2 + -1, false) + class205.method1376(arg0 - 1, arg2 + 1, false) + class205.method1376(arg0 + 1, arg2 + -1, false) + class205.method1376(arg0 + 1, arg2 - -1, false);
        int var4 = class205.method1376(arg0, arg2 - 1, false) - (-class205.method1376(arg0, arg2 + 1, false) - class205.method1376(arg0 - 1, arg2, false)) + class205.method1376(arg0 + 1, arg2, false);
        int var5 = class205.method1376(arg0, arg2, false);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(B)V")
    public static final void method447(byte arg0) {
        field1245++;
        for (int var1 = 0; var1 < 5; var1++) {
            class225.field3777[var1] = false;
        }
        class238.field4094 = -1;
        class197.field3326 = -1;
        if (arg0 != 34) {
            field1243 = null;
        }
        class224.field3766 = 1;
    }
}
