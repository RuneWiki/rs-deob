import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class79 {

    @OriginalMember(owner = "client!p", name = "e", descriptor = "J")
    public long field1222 = 0L;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "Leg;")
    public static class37 field1220 = class174.method1167("(U(Y", 78);

    @OriginalMember(owner = "client!p", name = "p", descriptor = "Leg;")
    public static class37 field1233 = class174.method1167("::replacecanvas", -65);

    @OriginalMember(owner = "client!p", name = "i", descriptor = "D")
    public static double field1226 = -1.0D;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "[Lel;")
    public static class211[] field1236 = new class211[4];

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field1223 = 0;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "Leg;")
    public static class37 field1231 = class174.method1167("welle2:", 93);

    @OriginalMember(owner = "client!p", name = "l", descriptor = "F")
    public static float field1229;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public int field1219;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public int field1224;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public int field1228;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public int field1230;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "I")
    public int field1234;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "Lme;")
    public class67 field1221;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "Lme;")
    public class67 field1235;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Leg;Z)Z")
    public static final boolean method531(class37 arg0, boolean arg1) {
        field1232++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class242.field4363; var2++) {
            if (arg0.method256(!arg1, class22.field289[var2])) {
                return true;
            }
        }
        if (arg1) {
            method532((class207) null, false);
        }
        if (arg0.method256(true, class82.field1285.field3235)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Llb;Z)V")
    public static final void method532(class207 arg0, boolean arg1) {
        field1218++;
        class15 var2 = null;
        try {
            class251 var3 = arg0.method1434("runescape", 1);
            while (var3.field4488 == 0) {
                class144.method1008(89, 1L);
            }
            if (var3.field4488 == 1) {
                var2 = (class15) var3.field4483;
                class187 var4 = class255.method1741(true);
                var2.method113(var4.field3175, (byte) 124, 0, var4.field3169);
            }
            if (!arg1) {
                method533(105);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method116(10388);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
    public static void method533(int arg0) {
        field1236 = null;
        field1231 = null;
        field1220 = null;
        field1233 = null;
        if (arg0 != 0) {
            field1231 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IBII)V")
    public static final void method534(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 < 109) {
            field1236 = null;
        }
        field1227++;
        if (class156.field2602 == 0 || arg0 == 0 || class159.field2658 >= 50 || arg3 == -1) {
            return;
        }
        class202.field3443[class159.field2658] = arg3;
        class281.field4957[class159.field2658] = arg0;
        class235.field4055[class159.field2658] = arg2;
        class202.field3446[class159.field2658] = null;
        class42.field667[class159.field2658] = 0;
        class159.field2658++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)Lrk;")
    public static final class14 method535(boolean arg0) {
        field1238++;
        class14 var1 = new class14(class257.field4567, class126.field2118, class249.field4476[0], class158.field2636[0], class224.field3852[0], class125.field2101[0], class170.field2848[0], class262.field4617);
        class5.method33(24094);
        return arg0 ? var1 : null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)Lke;")
    public static final class231 method536(int arg0, int arg1) {
        field1225++;
        class231 var2 = (class231) class181.field3033.method1411(-4, (long) arg1);
        int var3 = 73 / ((arg0 - 41) / 52);
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class276.field4896.method666(class67.method466((byte) 86, arg1), class68.method472(1338847880, arg1), (byte) -51);
        class231 var5 = new class231();
        var5.field3955 = arg1;
        if (var4 != null) {
            var5.method1589((byte) 97, new class187(var4));
        }
        class181.field3033.method1404((long) arg1, false, var5);
        return var5;
    }
}
