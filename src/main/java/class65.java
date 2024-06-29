import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class65 {

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "J")
    public static long field960;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "Ljo;")
    public static class150 field957;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V", line = 13)
    public static void method454(int arg0) {
        field957 = null;
        int var1 = 91 % ((arg0 + 30) / 60);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V", line = 22)
    public static final void method455(byte arg0) {
        field958++;
        class41.field624.method651(0);
        if (arg0 >= -119) {
            method457(24, 19);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZIIIIII)V", line = 46)
    public static final void method456(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field955++;
        class224.field3514 = arg4;
        if (arg3 != 12961) {
            method458((byte) -86);
        }
        class15.field194 = arg2;
        class236.field3737 = arg1;
        class24.field360 = arg5;
        class183.field2839 = arg6;
        if (arg0 && class236.field3737 >= 100) {
            class41.field625 = class15.field194 * 128 + 64;
            class259.field4098 = class24.field360 * 128 + 64;
            class74.field1117 = client.method889(class41.field625, class120.field1779, class259.field4098, -117) - class183.field2839;
        }
        class269.field4427 = 2;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)V", line = 71)
    public static final void method457(int arg0, int arg1) {
        field956++;
        int var2 = -41 % ((arg0 - 69) / 48);
        if (arg1 == -1 || !class31.method266(arg1, 1)) {
            return;
        }
        class264[] var3 = class167.field2627[arg1];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class264 var5 = var3[var4];
            if (var5.field4208 != null) {
                class190 var6 = new class190();
                var6.field2937 = var5;
                var6.field2940 = var5.field4208;
                class170.method1178(var6, 2000000, (byte) -24);
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)V", line = 111)
    public static final void method458(byte arg0) {
        field954++;
        if (arg0 < 113) {
            method454(66);
        }
        while (class159.field2552.method249(class201.field3091, -6941) >= 27) {
            int var1 = class159.field2552.method246(8, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class329.field5377[var1] == null) {
                var2 = true;
                class329.field5377[var1] = new class233();
            }
            class233 var3 = class329.field5377[var1];
            class243.field3843[class294.field4892++] = var1;
            var3.field4743 = class58.field875;
            if (var3.field3702 != null && var3.field3702.method985((byte) -57)) {
                class146.method1043(128, var3);
            }
            int var4 = class159.field2552.method246(8, 1);
            int var5 = class159.field2552.method246(8, 5);
            int var6 = class159.field2552.method246(8, 1);
            if (var5 > 15) {
                var5 -= 32;
            }
            if (var6 == 1) {
                class166.field2611[class99.field1440++] = var1;
            }
            int var7 = class236.field3739[class159.field2552.method246(8, 3)];
            if (var2) {
                var3.field4780 = var3.field4778 = var7;
            }
            var3.method1610(-14884, class38.method307(class159.field2552.method246(8, 14), 0));
            int var8 = class159.field2552.method246(8, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method2028((byte) 10, var3.field3702.field2220);
            var3.field4722 = var3.field3702.field2202;
            var3.field4732 = var3.field3702.field2228;
            if (var3.field4732 == 0) {
                var3.field4778 = 0;
            }
            var3.method2030(class329.field5388.field4757[0] + var8, var4 == 1, 29313, class329.field5388.field4762[0] + var5, var3.method312(37));
            if (var3.field3702.method985((byte) -79)) {
                class358.method2492(-104, var3.field4757[0], var3.field4762[0], var3, class120.field1779, 0, (class39) null, (class126) null);
            }
        }
        class159.field2552.method253((byte) -94);
    }
}
