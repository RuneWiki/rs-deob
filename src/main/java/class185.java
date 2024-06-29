import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class185 {

    @OriginalMember(owner = "client!me", name = "e", descriptor = "Ldd;")
    public static class247 field3391 = new class247(16);

    @OriginalMember(owner = "client!me", name = "f", descriptor = "Lud;")
    public static class279 field3392 = class130.method1024("gr-Un:", 255);

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field3395 = 0;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field3396 = 0;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "Lud;")
    public static class279 field3398 = class130.method1024("::gc", 255);

    @OriginalMember(owner = "client!me", name = "k", descriptor = "Lud;")
    public static class279 field3397 = class130.method1024("Verbindung abgebrochen)3", 255);

    @OriginalMember(owner = "client!me", name = "g", descriptor = "F")
    public static float field3393;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "Lcl;")
    public static class131 field3399;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V", line = 22)
    public static final void method1427(int arg0) {
        for (int var1 = 0; var1 < 104; var1++) {
            for (int var2 = 0; var2 < 104; var2++) {
                class229.field3984[var1][var2] = 0;
            }
        }
        field3388++;
        if (arg0 != -16898) {
            method1427(82);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIII)V", line = 50)
    public static final void method1428(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class314.field5534.field1142 = arg2;
        field3389++;
        class314.field5534.method464(189, false);
        class314.field5534.method464(arg0, false);
        class314.field5534.method464(arg3, false);
        class314.field5534.method505(arg4, (byte) 7);
        class314.field5534.method505(arg1, (byte) 7);
        class180.field3280 = 0;
        class73.field1435 = -3;
        class139.field2516 = 1;
        class182.field3332 = 0;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BIII)Laf;", line = 82)
    public static final class176 method1429(byte arg0, int arg1, int arg2, int arg3) {
        class176 var4 = new class176();
        var4.field3163 = arg1;
        var4.field3165 = arg3;
        field3387++;
        class226.field3977.method612(false, var4, (long) arg2);
        class282.method2030(arg3, (byte) -59);
        class8 var5 = class273.method1940(arg2, 127);
        if (var5 != null) {
            class50.method426(var5, false);
        }
        if (class320.field5597 != null) {
            class50.method426(class320.field5597, false);
            class320.field5597 = null;
        }
        if (arg0 < 108) {
            return (class176) null;
        }
        int var6 = class194.field3488;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class32.method293(-7, class271.field4828[var7])) {
                class222.method1630(var7, -93);
            }
        }
        if (class194.field3488 == 1) {
            class238.field4184 = false;
            class35.method311(class3.field108, class7.field149, class155.field2803, class324.field5660, 32);
        } else {
            class35.method311(class3.field108, class7.field149, class155.field2803, class324.field5660, 32);
            int var8 = class292.field5210.method411(class90.field1697);
            for (int var9 = 0; var9 < class194.field3488; var9++) {
                int var10 = class292.field5210.method411(class24.method213(var9, true));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class3.field108 = class194.field3488 * 15 + (class152.field2766 ? 26 : 22);
            class7.field149 = var8 + 8;
        }
        if (var5 != null) {
            class50.method424(var5, false, -1);
        }
        class64.method563(true, arg3);
        if (class307.field5444 != -1) {
            class111.method909(class307.field5444, (byte) 127, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)[Lg;", line = 166)
    public static final class158[] method1430(byte arg0) {
        class158[] var1 = new class158[class244.field4329];
        field3390++;
        if (arg0 != -39) {
            field3394 = 64;
        }
        for (int var2 = 0; var2 < class244.field4329; var2++) {
            var1[var2] = new class158(class86.field1646, class111.field2045, class44.field915[var2], class216.field3811[var2], class1.field92[var2], class115.field2097[var2], class113.field2080[var2], class217.field3839);
        }
        class162.method1278(false);
        return var1;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(III)Lck;", line = 205)
    public static final class235 method1431(int arg0, int arg1, int arg2) {
        class191 var3 = class24.field619[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class235 var4 = var3.field3454;
            var3.field3454 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V", line = 234)
    public static void method1432(int arg0) {
        field3399 = null;
        field3397 = null;
        field3398 = null;
        field3391 = null;
        field3392 = null;
        int var1 = -5 % ((6 - arg0) / 36);
    }
}
