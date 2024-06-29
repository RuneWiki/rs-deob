import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class276 {

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "Z")
    public boolean field4397 = false;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "[[S")
    public static short[][] field4391 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4395 = "Connected to update server";

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    public static int field4400 = -1;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "S")
    public static short field4404 = 1;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    public int field4399;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
    public int field4405;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "Ldl;")
    public static class123 field4392;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "Ldl;")
    public static class123 field4403;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)Lwe;")
    public final class15 method1851(int arg0, byte arg1) {
        field4402++;
        class15 var3 = (class15) class44.field562.method1428((long) (this.field4399 | arg0 << 16), (byte) -40);
        if (var3 != null) {
            return var3;
        }
        class49.field625.method806(110, this.field4399);
        class15 var4 = class236.method1602(0, 1, this.field4399, class49.field625);
        int var5 = -104 / ((21 - arg1) / 60);
        if (var4 != null) {
            var4.method108(class13.field178, class70.field984, class194.field3059);
            var4.field2143 = var4.field2142;
            var4.field2136 = var4.field2148;
            for (int var6 = 0; var6 < arg0; var6++) {
                var4.method107();
            }
            class44.field562.method1424((long) (this.field4399 | arg0 << 16), var4, -2003648287);
        }
        return var4;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public static final void method1852(int arg0) {
        if (class39.field526 != null) {
            class250 var1 = class39.field526;
            synchronized (class39.field526) {
                class39.field526 = null;
            }
        }
        field4393++;
        if (arg0 != 9366) {
            method1856(55);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Llj;IB)V")
    public final void method1853(class25 arg0, int arg1, byte arg2) {
        field4401++;
        if (arg2 != 65) {
            return;
        }
        while (true) {
            int var4 = arg0.method201(255);
            if (var4 == 0) {
                return;
            }
            this.method1854(arg0, var4, -2381, arg1);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Llj;III)V")
    private final void method1854(class25 arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 1) {
            this.field4399 = arg0.method190(-3);
        } else if (arg1 == 2) {
            this.field4405 = arg0.method215((byte) 108);
        } else if (arg1 == 3) {
            this.field4397 = true;
        } else if (arg1 == 4) {
            this.field4399 = -1;
        }
        if (arg2 != -2381) {
            method1852(123);
        }
        field4390++;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZI)V")
    public static final void method1855(boolean arg0, int arg1) {
        field4394++;
        class249.field3992.method1425(arg1, -115);
        if (arg0) {
            class44.field562.method1425(arg1, -109);
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V")
    public static void method1856(int arg0) {
        if (arg0 == -31200) {
            field4395 = null;
            field4403 = null;
            field4392 = null;
            field4391 = null;
        }
    }
}
