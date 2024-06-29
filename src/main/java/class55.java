import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class55 {

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Lr;")
    private static class118 field1298 = class153.method1136(105, "Select");

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "Lr;")
    public static class118 field1304 = class153.method1136(89, "huffman");

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "Lr;")
    private static class118 field1301 = class153.method1136(83, "Existing User");

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "Lr;")
    public static class118 field1307 = class153.method1136(118, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "Lr;")
    public static class118 field1306 = class153.method1136(126, "(Udns");

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "Lr;")
    public static class118 field1303 = field1298;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "Lr;")
    public static class118 field1300 = field1301;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "Lr;")
    public static class118 field1308 = class153.method1136(74, "(U5");

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "Ljf;")
    public static class68 field1305;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "Ljf;")
    public static class68 field1309;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
    public static final void method494(byte arg0) {
        while (true) {
            if (class53.field1253.method728(class88.field2140, 0) >= 11) {
                int var1 = class53.field1253.method725(8, 11);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class108.field2526[var1] == null) {
                        var2 = true;
                        class108.field2526[var1] = new class132();
                        if (class44.field1052[var1] != null) {
                            class108.field2526[var1].method1021(arg0 - 46, class44.field1052[var1]);
                        }
                    }
                    class73.field1685[class105.field2425++] = var1;
                    class132 var3 = class108.field2526[var1];
                    var3.field742 = class65.field1479;
                    int var4 = class53.field1253.method725(8, 1);
                    if (var4 == 1) {
                        class157.field3628[class92.field2216++] = var1;
                    }
                    int var5 = class53.field1253.method725(8, 1);
                    int var6 = class136.field3088[class53.field1253.method725(arg0 ^ 0x25, 3)];
                    if (var2) {
                        var3.field756 = var3.field768 = var6;
                    }
                    int var7 = class53.field1253.method725(8, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = class53.field1253.method725(8, 5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.method255(class89.field2150.field710[0] + var8, class89.field2150.field755[0] + var7, -20149, ~var5 == -2);
                    continue;
                }
            }
            if (arg0 != 45) {
                return;
            }
            class53.field1253.method732(1);
            field1310++;
            return;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZZI)I")
    public static final int method495(boolean arg0, boolean arg1, int arg2) {
        field1302++;
        int var3 = arg2;
        if (arg1) {
            var3 = class56.field1316 + class27.field656 + arg2;
        }
        if (arg0) {
            var3 += class133.field3041 + class34.field847;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIIIIIB)V")
    public static final void method496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        field1299++;
        class13 var10 = null;
        for (class13 var11 = (class13) class112.field2607.method889(-11); var11 != null; var11 = (class13) class112.field2607.method884(true)) {
            if (var11.field280 == arg8 && var11.field282 == arg3 && var11.field279 == arg5 && var11.field290 == arg0) {
                var10 = var11;
                break;
            }
        }
        if (arg9 != -25) {
            return;
        }
        if (var10 == null) {
            var10 = new class13();
            var10.field279 = arg5;
            var10.field280 = arg8;
            var10.field282 = arg3;
            var10.field290 = arg0;
            class84.method685(var10, -105);
            class112.field2607.method883(var10, -26866);
        }
        var10.field287 = arg1;
        var10.field274 = arg6;
        var10.field294 = arg2;
        var10.field273 = arg4;
        var10.field284 = arg7;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public static void method497(int arg0) {
        field1307 = null;
        field1300 = null;
        if (arg0 != 2047) {
            method497(54);
        }
        field1305 = null;
        field1303 = null;
        field1308 = null;
        field1309 = null;
        field1306 = null;
        field1298 = null;
        field1304 = null;
        field1301 = null;
    }
}
