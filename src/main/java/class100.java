import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class100 {

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "Lqb;")
    private class113 field2423 = new class113();

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field2415 = 0;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Loc;")
    public static class100 field2408 = new class100();

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "Lu;")
    public static class135 field2419 = class87.method676((byte) -87, "::gc");

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public static int field2420 = 0;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "Z")
    public static boolean field2422 = false;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "J")
    public static long field2421;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "Lsd;")
    public static class127 field2418;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)Lqb;")
    public final class113 method820(int arg0) {
        field2414++;
        class113 var2 = this.field2423.field2731;
        if (arg0 <= 62) {
            return null;
        } else if (this.field2423 == var2) {
            return null;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)Lqb;")
    public final class113 method821(byte arg0) {
        class113 var2 = this.field2423.field2731;
        field2412++;
        if (this.field2423 == var2) {
            return null;
        } else {
            int var3 = 6 % ((-arg0 - 5) / 55);
            var2.method921(2001);
            return var2;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILqb;)V")
    public final void method822(int arg0, class113 arg1) {
        field2409++;
        if (arg1.field2741 != null) {
            arg1.method921(2001);
        }
        arg1.field2741 = this.field2423.field2741;
        arg1.field2731 = this.field2423;
        arg1.field2741.field2731 = arg1;
        if (arg0 != 0) {
            field2418 = null;
        }
        arg1.field2731.field2741 = arg1;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(ILqb;)V")
    public final void method823(int arg0, class113 arg1) {
        if (arg1.field2741 != null) {
            arg1.method921(2001);
        }
        arg1.field2741 = this.field2423;
        arg1.field2731 = this.field2423.field2731;
        if (arg0 != -51) {
            field2421 = 63L;
        }
        field2416++;
        arg1.field2741.field2731 = arg1;
        arg1.field2731.field2741 = arg1;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZI)V")
    public static final void method824(boolean arg0, int arg1) {
        field2411++;
        if (class41.field965.field645 == null) {
            return;
        }
        if (arg1 != -51) {
            field2422 = false;
        }
        for (int var2 = 0; var2 < 50 && class41.field965.field645.peekEvent() != null; var2++) {
            class96.method795(1L, 88);
        }
        if (arg0) {
            class41.field965.field645.postEvent(new ActionEvent(class59.field1484, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
    public static void method825(int arg0) {
        int var1 = -58 % (arg0 / 61);
        field2418 = null;
        field2419 = null;
        field2408 = null;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
    public static final void method826(byte arg0) {
        field2410++;
        if (class53.field1258) {
            class37.method282(true);
            class53.field1258 = false;
            class47.method356(-78);
            class135.field3239 = true;
            class42.field979 = true;
            class10.field244 = true;
            class65.field1634 = true;
        }
        class132.method1057(false);
        if (class128.field3077 && class94.field2237 == 1) {
            class135.field3239 = true;
        }
        if (class80.field1900 != -1) {
            boolean var1 = class107.method865(true, class80.field1900);
            if (var1) {
                class135.field3239 = true;
            }
        }
        if (class107.field2568 == 2) {
            class135.field3239 = true;
        }
        if (class32.field760 == 2) {
            class135.field3239 = true;
        }
        if (arg0 > -111) {
            field2422 = false;
        }
        if (class135.field3239) {
            class135.field3239 = false;
            class22.method180(89);
        }
        if (class49.field1174 == -1) {
            class2.field60.field3671 = class26.field637 - class53.field1261 - 77;
            if (class53.field1278 > 17 && class53.field1278 < 560 && class76.field1798 > 332) {
                class90.method684(-1, class76.field1798 - 357, 463, 0, class53.field1278 - 17, class2.field60, 77, -4, class26.field637);
            }
            int var2 = class26.field637 - class2.field60.field3671 - 77;
            if (var2 < 0) {
                var2 = 0;
            }
            if (var2 > class26.field637 - 77) {
                var2 = class26.field637 - 77;
            }
            if (class53.field1261 != var2) {
                class65.field1634 = true;
                class53.field1261 = var2;
            }
        }
        if (class49.field1174 == -1 && class42.field975 == 3) {
            class2.field60.field3671 = class151.field3735;
            int var3 = class79.field1884 * 14 + 7;
            if (class53.field1278 > 17 && class53.field1278 < 560 && class76.field1798 > 332) {
                class90.method684(-1, class76.field1798 - 357, 463, 0, class53.field1278 - 17, class2.field60, 77, -4, var3);
            }
            int var4 = class2.field60.field3671;
            if (var4 < 0) {
                var4 = 0;
            }
            if (var4 > var3 - 77) {
                var4 = var3 - 77;
            }
            if (class151.field3735 != var4) {
                class151.field3735 = var4;
                class65.field1634 = true;
            }
        }
        if (class49.field1174 != -1) {
            boolean var5 = class107.method865(true, class49.field1174);
            if (var5) {
                class65.field1634 = true;
            }
        }
        if (class107.field2568 == 3) {
            class65.field1634 = true;
        }
        if (class32.field760 == 3) {
            class65.field1634 = true;
        }
        if (class21.field487 != null) {
            class65.field1634 = true;
        }
        if (class128.field3077 && class94.field2237 == 2) {
            class65.field1634 = true;
        }
        if (class65.field1634) {
            class65.field1634 = false;
            class63.method524(6597);
        }
        class21.method160((byte) -31);
        if (class53.field1250 != -1) {
            class10.field244 = true;
        }
        if (class10.field244) {
            if (class53.field1250 != -1 && class53.field1250 == class49.field1167) {
                class15.field353++;
                class53.field1250 = -1;
                class152.field3751.method929(96, -14044);
                class152.field3751.method452(class49.field1167, 255);
            }
            class128.field3081 = true;
            class10.field244 = false;
            class133.method1061((byte) -99, class21.field491, class49.field1167, class126.field2998 % 20 < 10 ? -1 : class53.field1250, class80.field1900 == -1);
        }
        if (class42.field979) {
            class42.field979 = false;
            class128.field3081 = true;
            class30.method245(class93.field2200, (byte) 111, class126.field3014, class48.field1135, class79.field1858);
        }
        class48.method362(7522, class136.field3301, class116.field2789.field173, class116.field2789.field172, class20.field452);
        class20.field452 = 0;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lga;I)V")
    public static final void method827(class44 arg0, int arg1) {
        field2413++;
        int var2 = -49 % ((arg1 - 44) / 54);
        int var3 = 0;
        int var4 = 0;
        if (arg0.field1063 == 0) {
            var3 = field2418.method1019(arg0.field1058, arg0.field1060, arg0.field1073);
        }
        if (arg0.field1063 == 1) {
            var3 = field2418.method991(arg0.field1058, arg0.field1060, arg0.field1073);
        }
        int var5 = 0;
        int var6 = -1;
        if (arg0.field1063 == 2) {
            var3 = field2418.method1013(arg0.field1058, arg0.field1060, arg0.field1073);
        }
        if (arg0.field1063 == 3) {
            var3 = field2418.method1011(arg0.field1058, arg0.field1060, arg0.field1073);
        }
        if (var3 != 0) {
            var6 = var3 >> 14 & 0x7FFF;
            int var7 = field2418.method998(arg0.field1058, arg0.field1060, arg0.field1073, var3);
            var5 = var7 >> 6 & 0x3;
            var4 = var7 & 0x1F;
        }
        arg0.field1078 = var6;
        arg0.field1071 = var4;
        arg0.field1057 = var5;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
    public class100() {
        this.field2423.field2731 = this.field2423;
        this.field2423.field2741 = this.field2423;
    }
}
