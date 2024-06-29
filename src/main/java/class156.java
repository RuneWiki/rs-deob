import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class156 {

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "Lqj;")
    public static class196 field2513 = class80.method502("Musik)2Engine vorbereitet)3", -48);

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field2510 = 0;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Lqj;")
    private static class196 field2509 = class80.method502("wave2:", -48);

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "Lqj;")
    public static class196 field2518 = class80.method502("0(U", -48);

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "Lqj;")
    public static class196 field2512 = field2509;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "Z")
    public static boolean field2521 = true;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static volatile int field2522 = 0;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "Lqj;")
    public static class196 field2523 = field2509;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field2514 = 0;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLbk;)Z")
    public static final boolean method985(byte arg0, class136 arg1) {
        if (arg0 >= -63) {
            field2512 = null;
        }
        field2516++;
        return arg1.method838((byte) 23, class244.field4350);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
    public static final void method986(byte arg0) {
        field2515++;
        if (class171.field2876 == null) {
            return;
        }
        try {
            byte[] var1 = class171.field2876.method1186(0);
            if (arg0 != 48) {
                field2523 = null;
            }
            if (var1 != null) {
                class56 var2 = new class56(var1);
                class193.field3405 = var2.method318(true);
                class64.field881 = new class146[class193.field3405];
                for (int var3 = 0; var3 < class193.field3405; var3++) {
                    class146 var4 = class64.field881[var3] = new class146();
                    int var5 = var2.method318(true);
                    var4.field2299 = (var5 & 0x8000) != 0;
                    var4.field2312 = var5 & 0x7FFF;
                    var4.field2303 = var2.method326(true);
                    var4.field2313 = var2.method338((byte) -66);
                    var4.field2306 = var3;
                    var4.field2307 = class172.method1128(97, var2.method318(true));
                }
                class203.method1381(class64.field881.length - 1, class64.field881, arg0 - 50, 0);
                class171.field2876 = null;
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class171.field2876 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static void method987(int arg0) {
        field2513 = null;
        field2512 = null;
        field2518 = null;
        field2523 = null;
        field2509 = null;
        if (arg0 < 123) {
            method985((byte) 46, null);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lec;B)Lec;")
    public static final class178 method988(class178 arg0, byte arg1) {
        if (arg1 != -12) {
            method986((byte) 117);
        }
        field2519++;
        if (arg0.field2990 != -1) {
            return class201.method1356(arg0.field2990, (byte) 71);
        }
        int var2 = arg0.field3117 >>> 16;
        for (class63 var3 = (class63) class101.field1445.method1554(6539); var3 != null; var3 = (class63) class101.field1445.method1547(342)) {
            if (var3.field864 == var2) {
                return class201.method1356((int) var3.field1850, (byte) -70);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Loc;IIIIII)Loc;")
    public static final class119 method989(class119 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2520++;
        long var7 = (long) arg4;
        class119 var9 = (class119) class217.field3900.method132(var7, 119);
        if (var9 == null) {
            class208 var10 = class208.method1436(class40.field445, arg4, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1432(64, 768, -50, -10, -50);
            class217.field3900.method129(30972, var7, var9);
        }
        int var11 = arg0.method740();
        int var12 = arg0.method727();
        int var13 = arg0.method735();
        int var14 = arg0.method730();
        class119 var15 = var9.method734(true, true);
        if (~arg5 != arg2) {
            var15.method731(arg5);
        }
        class167 var16 = (class167) var15;
        if (class74.method470(arg1 + var13, class27.field335, 103, arg6 + var11) != arg3 || class74.method470(arg1 + var14, class27.field335, arg2 + 104, arg6 + var12) != arg3) {
            for (int var17 = 0; var17 < var16.field2772; var17++) {
                var16.field2758[var17] += class74.method470(var16.field2774[var17] + arg1, class27.field335, class246.method1675(arg2, -104), var16.field2754[var17] + arg6) - arg3;
            }
            var16.field2770 = false;
        }
        return var15;
    }
}
