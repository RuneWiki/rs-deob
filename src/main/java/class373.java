import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class373 {

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public int field5313 = -1;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "[I")
    public static int[] field5317;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "Lfc;")
    public static class174 field5316;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "Ltn;")
    public static class60 field5318;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public int field5302;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public int field5303;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public int field5305;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public int field5306;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public int field5307;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public int field5308;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public int field5310;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public int field5311;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "Lbc;")
    public static class250 field5309;

    static {
        new class530("clan_chat", "clanchat", "conversation_clan", "clan_chat");
        field5317 = new int[250];
        field5316 = new class174(64);
        field5318 = new class60(27, 2);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 5)
    public static void method2182(int arg0) {
        if (arg0 != 99999999) {
            field5318 = null;
        }
        field5309 = null;
        field5316 = null;
        field5317 = null;
        field5318 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BJZLjava/lang/String;)V", line = 18)
    public static final void method2183(byte arg0, long arg1, boolean arg2, String arg3) {
        field5304++;
        if (arg2) {
            class124.method816(-1);
            if (class427.field6018.equals("")) {
                class319.field4622 = 39;
                return;
            }
        }
        if (arg0 != -55) {
            return;
        }
        class403 var5 = new class403(128);
        var5.method2376((byte) 122, 10);
        var5.method2372((int) (Math.random() * 65535.0D), -128);
        var5.method2358(arg1, (byte) -115);
        var5.method2372(class496.field7034, 114);
        var5.method2354((int) (Math.random() * 9.9999999E7D), false);
        var5.method2377((byte) -53, arg3);
        var5.method2354((int) (Math.random() * 9.9999999E7D), false);
        if (arg2) {
            var5.method2358(class85.method617(-58, class427.field6018), (byte) -76);
            try {
                var5.method2358(Long.parseLong(class538.field7869), (byte) -46);
            } catch (Exception var6) {
                class319.field4622 = 39;
                return;
            }
        } else {
            var5.method2354((int) (Math.random() * 9.9999999E7D), false);
            var5.method2354((int) (Math.random() * 9.9999999E7D), false);
            var5.method2354((int) (Math.random() * 9.9999999E7D), false);
            var5.method2354((int) (Math.random() * 9.9999999E7D), false);
        }
        var5.method2354((int) (Math.random() * 9.9999999E7D), false);
        var5.method2364((byte) 88, class90.field1119, class184.field2660);
        class30.field357.field5665 = 0;
        class30.field357.method2376((byte) 122, arg2 ? class215.field3115.field7739 : class215.field3112.field7739);
        class30.field357.method2372(var5.field5665 + 28, -128);
        class30.field357.method2372(601, -17);
        class30.field357.method2376((byte) 122, class149.field1979);
        class30.field357.method2376((byte) 122, class246.field3594.field2962);
        class347.method2056(0, class30.field357);
        class30.field357.method2363(0, var5.field5663, arg0 ^ 0x36, var5.field5665);
        class319.field4622 = -3;
        class269.field3925 = 0;
        class170.field2473 = 1;
        class526.field7740 = 0;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(FFFI)I", line = 89)
    public static final int method2184(float arg0, float arg1, float arg2, int arg3) {
        if (arg3 != 1) {
            field5318 = null;
        }
        field5314++;
        float var4 = (arg1 < 0.0F) ? -arg1 : arg1;
        float var5 = arg0 < 0.0F ? -arg0 : arg0;
        float var6 = (arg2 < 0.0F) ? -arg2 : arg2;
        if (var5 > var4 && var6 < var5) {
            return arg0 > 0.0F ? 0 : 1;
        } else if (var4 < var6 && var6 > var5) {
            return arg2 > 0.0F ? 2 : 3;
        } else if (arg1 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V", line = 138)
    public static final void method2185(boolean arg0) {
        field5312++;
        class505.field7486 = arg0;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IILhm;B)V", line = 146)
    public static final void method2186(int arg0, int arg1, class150 arg2, byte arg3) {
        field5315++;
        if (class471.field6573 != null || class424.field5977 || arg2 == null || class397.method2304(arg2, -8896) == null) {
            return;
        }
        class471.field6573 = arg2;
        class147.field1965 = class397.method2304(arg2, -8896);
        class172.field2487 = false;
        class454.field6370 = arg1;
        class403.field5714 = arg0;
        class408.field5783 = 0;
        int var4 = 120 / ((arg3 + 11) / 47);
    }
}
