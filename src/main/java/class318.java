import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class318 {

    @OriginalMember(owner = "client!un", name = "b", descriptor = "S")
    public static short field4542 = 320;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "I")
    public static int field4544 = 0;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "Lop;")
    public static class353 field4545 = new class353(128);

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!un", name = "i", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!un", name = "j", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "Ldr;")
    public static class213 field4547;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "Lqa;")
    public static class243 field4543;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ZI)Ljava/lang/String;", line = 10)
    public static final String method1974(boolean arg0, int arg1) {
        if (arg0) {
            return null;
        } else {
            field4548++;
            return (arg1 >> 24 & 0xFF) + "." + ((arg1 & 0xFF2585) >> 16) + "." + ((arg1 & 0xFF35) >> 8) + "." + (arg1 & 0xFF);
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ZILsm;Z)V", line = 24)
    public static final void method1975(boolean arg0, int arg1, class158 arg2, boolean arg3) {
        field4550++;
        int var4 = arg2.field2075;
        int var5 = (int) arg2.field5903;
        arg2.method2574((byte) 116);
        if (arg0) {
            class139.method934(var4, 0);
        }
        class229.method1420((byte) 98, var4);
        if (arg1 != 25697) {
            method1977(-24);
        }
        class249 var6 = class107.method746(var5, -87);
        if (var6 != null) {
            class392.method2564(-101, var6);
        }
        class165.method1027(-85);
        if (!arg3 && class404.field6020 != -1) {
            class116.method813(class404.field6020, 4095, 1);
        }
        class355 var7 = new class355(class269.field3933);
        for (class158 var8 = (class158) var7.method2333(24056); var8 != null; var8 = (class158) var7.method2332((byte) 93)) {
            if (!var8.method2571(true)) {
                var8 = (class158) var7.method2333(24056);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field2074 == 3) {
                int var9 = (int) var8.field5903;
                if (var9 >>> 16 == var4) {
                    method1975(true, 25697, var8, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ZBIIIII)V", line = 83)
    public static final void method1976(boolean arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class95.field1306 = arg4;
        class344.field5053 = arg5;
        class37.field599 = arg2;
        class148.field1956 = arg6;
        int var7 = 58 / ((arg1 + 55) / 50);
        class153.field2003 = arg3;
        field4546++;
        if (arg0 && class344.field5053 >= 100) {
            class237.field3326 = class95.field1306 * 128 + 64;
            class7.field71 = class148.field1956 * 128 + 64;
            class130.field1745 = class139.method935(class7.field71, -29, class237.field3326, class193.field2688) - class153.field2003;
        }
        class5.field48 = 2;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V", line = 107)
    public static void method1977(int arg0) {
        field4543 = null;
        field4545 = null;
        field4547 = null;
        if (arg0 != 25106) {
            field4544 = 108;
        }
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(I)I", line = 126)
    public static final int method1978(int arg0) {
        field4549++;
        class437 var1 = class35.field574;
        boolean var2 = false;
        if (class265.field3854 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class437.method2760(0, -9426, (class2) null, var3, 0, (class386) null);
        }
        long var4 = class55.method375(arg0 ^ 0xF0B7);
        int var6 = 0;
        if (arg0 != -65536) {
            method1975(true, 54, (class158) null, false);
        }
        while (var6 < 10000) {
            var1.method2075(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
            var6++;
        }
        int var7 = (int) (class55.method375(-3913) - var4);
        var1.method2766(100, 100, 0, 0, -16777216, 120);
        if (var2) {
            var1.method2761(-31586);
        }
        return var7;
    }
}
