import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class428 {

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "[I")
    public int[] field6287;

    @OriginalMember(owner = "client!taa", name = "g", descriptor = "[I")
    public int[] field6292;

    @OriginalMember(owner = "client!taa", name = "h", descriptor = "[[F")
    public float[][] field6291;

    @OriginalMember(owner = "client!taa", name = "e", descriptor = "[I")
    public int[] field6288;

    @OriginalMember(owner = "client!taa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6295 = new String[] { method3291(method3290("M@?~'PO7$%\u0011")), method3291(method3290("B\u000fp~f")), method3291(method3290("WT2<")), method3291(method3290("M@?~Y\u0011")), method3291(method3290("M@?~Z\u0011")) };

    @OriginalMember(owner = "client!taa", name = "d", descriptor = "I")
    public static int field6289 = 0;

    @OriginalMember(owner = "client!taa", name = "f", descriptor = "Z")
    public static boolean field6294 = false;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "I")
    public static int field6293;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(ZII)V", line = 10)
    public static final void method3288(boolean arg0, int arg1, int arg2) {
        try {
            field6293++;
            if (class301.field4720 != null) {
                int var3 = class187.field2571;
                int var4 = class601.field8825;
                class154.method1289(arg2, arg1, (byte) 75);
                if (class166.field2283 == 0) {
                    class730.field10602 = null;
                    class730.field10602 = class301.field4720.method507(class301.field4720.method478(class57.field613, class69.field742), class301.field4720.method486(class57.field613, class69.field742));
                } else if (class166.field2283 == 1 && (class792.field11524 == null || class187.field2571 != var3 || class601.field8825 != var4)) {
                    class792.field11524 = new class82[class601.field8825 * class187.field2571];
                    for (int var5 = 0; var5 < class792.field11524.length; var5++) {
                        class792.field11524[var5] = class301.field4720.method507(class301.field4720.method478(class283.field4239, class335.field5236), class301.field4720.method486(class283.field4239, class335.field5236));
                    }
                    class1.field5 = new int[class601.field8825 * class187.field2571];
                    class702.field10205 = 1;
                }
                class222.field3412 = arg0;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field6295[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!taa", name = "<init>", descriptor = "([I[I[I[[F)V", line = 53)
    public class428(int[] arg0, int[] arg1, int[] arg2, float[][] arg3) {
        try {
            this.field6287 = arg0;
            this.field6292 = arg1;
            this.field6291 = arg3;
            this.field6288 = arg2;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field6295[0] + (arg0 == null ? field6295[2] : field6295[1]) + ',' + (arg1 == null ? field6295[2] : field6295[1]) + ',' + (arg2 == null ? field6295[2] : field6295[1]) + ',' + (arg3 == null ? field6295[2] : field6295[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(BLjava/lang/String;)V", line = 65)
    public static final void method3289(byte arg0, String arg1) {
        try {
            field6290++;
            class280 var2 = class454.method3475((byte) 90);
            var2.field4197.method1428((byte) -24, class27.field338.field9786);
            var2.field4197.method1406(0, 380332136);
            int var3 = var2.field4197.field2201;
            var2.field4197.method1406(652, arg0 + 380332054);
            if (arg0 == 82) {
                int[] var4 = class477.method3656(-24197, var2);
                int var5 = var2.field4197.field2201;
                var2.field4197.method1464(arg1, 255);
                var2.field4197.method1428((byte) -24, class167.field2300);
                var2.field4197.field2201 += 7;
                var2.field4197.method1460(var5, var2.field4197.field2201, var4, false);
                var2.field4197.method1459((byte) 7, var2.field4197.field2201 - var3);
                class106.method934((byte) 53, var2);
                class545.field8147 = 1;
                class236.field3560 = 0;
                class388.field5854 = 0;
                class325.field5130 = -3;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field6295[3] + arg0 + ',' + (arg1 == null ? field6295[2] : field6295[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!taa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3290(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!taa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3291(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 57;
                    break;
                case 1:
                    var10005 = 33;
                    break;
                case 2:
                    var10005 = 94;
                    break;
                case 3:
                    var10005 = 80;
                    break;
                default:
                    var10005 = 27;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
