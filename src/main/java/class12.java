import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class12 {

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "Lnq;")
    public static class268 field247;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V")
    public static void method215(byte arg0) {
        field247 = null;
        if (arg0 < 116) {
            method219((byte) -72, (String) null);
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V")
    public static final void method216(byte arg0) {
        field248++;
        class18.method251((byte) 97, false);
        if (class434.field6129 >= 0 && class434.field6129 != 0) {
            class412.method2588(class434.field6129, 95);
            class434.field6129 = -1;
        }
        if (arg0 < 35) {
            field247 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)Z")
    public static final boolean method217(int arg0) {
        field246++;
        if (class373.field5238) {
            try {
                class262.method1715("showVideoAd", class241.field3426.field4121, (byte) -112);
                return true;
            } catch (Throwable var1) {
            }
        }
        return arg0 == 1 ? false : false;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILms;Lms;)V")
    public static final void method218(int arg0, class453 arg1, class453 arg2) {
        class46.field648.method1178(63, arg0);
        field249++;
        class128.field1794++;
        class46.field648.method155(15489, arg2.field6314);
        class46.field648.method169(-83, arg1.field6314);
        class46.field648.method183(arg2.field6452, true);
        class46.field648.method191(arg2.field6406, -100);
        class46.field648.method183(arg1.field6406, true);
        class46.field648.method178(arg1.field6452, -89);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method219(byte arg0, String arg1) {
        field245++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class427.method2690(arg1, -23289);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class272.field3777; var3++) {
            String var4 = class288.field4045[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class427.method2690(var4, -23289);
            if (var5 != null && var5.equals(var2)) {
                class272.field3777--;
                for (int var6 = var3; var6 < class272.field3777; var6++) {
                    class288.field4045[var6] = class288.field4045[var6 + 1];
                    class22.field398[var6] = class22.field398[var6 + 1];
                    class218.field3018[var6] = class218.field3018[var6 + 1];
                    class73.field1044[var6] = class73.field1044[var6 + 1];
                    class184.field2513[var6] = class184.field2513[var6 + 1];
                    class66.field990[var6] = class66.field990[var6 + 1];
                }
                class159.field2236 = class367.field5186;
                class159.field2228++;
                class46.field648.method1178(63, 181);
                class46.field648.method173(class273.method1782((byte) 25, arg1), 255);
                class46.field648.method160(arg1, false);
                break;
            }
        }
        int var7 = -89 % ((-arg0 - 61) / 40);
    }
}
