import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public abstract class class116 {

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "I")
    public static int field1454 = 0;

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "[I")
    public static int[] field1458 = new int[8];

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "Lie;")
    public static class6 field1453 = new class6();

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
    public static int field1459 = 0;

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "J")
    public static long field1460 = -1L;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V", line = 3)
    public static void method684(int arg0) {
        if (arg0 <= 36) {
            field1460 = 75L;
        }
        field1458 = null;
        field1453 = null;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Ljr;IBI)Lpj;", line = 21)
    public static final class126 method685(class92 arg0, int arg1, byte arg2, int arg3) {
        field1455++;
        int var4 = arg1 << 8 | arg0.field1131;
        class126 var5 = (class126) class198.field2387.method696(3, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class48.field401.method2560(class48.field401.method2576(126, var4), -6914);
        if (var6 == null) {
            int var8 = arg0.field1131 | arg3 + 65536 << 8;
            class126 var9 = (class126) class198.field2387.method696(3, (long) var8 << 16);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class48.field401.method2560(class48.field401.method2576(83, var8), -6914);
            if (arg2 < 80) {
                field1459 = 39;
            }
            if (var10 == null) {
                int var12 = arg0.field1131 | 0xFFFF00;
                class126 var13 = (class126) class198.field2387.method696(3, (long) var12 << 16);
                if (var13 != null) {
                    return var13;
                }
                byte[] var14 = class48.field401.method2560(class48.field401.method2576(80, var12), -6914);
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class126 var15 = class470.method2743(false, var14);
                    var15.field1546 = arg0;
                    class198.field2387.method691((byte) 88, var15, (long) var12 << 16);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class126 var11 = class470.method2743(false, var10);
                var11.field1546 = arg0;
                class198.field2387.method691((byte) 81, var11, (long) var8 << 16);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class126 var7 = class470.method2743(false, var6);
            var7.field1546 = arg0;
            class198.field2387.method691((byte) 102, var7, (long) var4 << 16);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)V", line = 94)
    public static final void method686(int arg0) {
        class106.field1298.method478(-128);
        field1456++;
        class299.field3844.method215(-119);
        class368.field4857.method2748(false);
        class16.field126.method1749(-15616);
        class518.field7296.method148(5);
        class449.field6217.method2025(arg0 - 104);
        class393.field5190.method769(56);
        class344.field4461.method1389(30);
        class530.field7446.method2055((byte) 121);
        class29.field203.method3529(false);
        class16.field125.method3602((byte) -126);
        class284.field3721.method3422((byte) 120);
        class450.field6233.method3241(36);
        class240.field3001.method3441(106);
        class290.field3771.method2788((byte) -37);
        class562.field8276.method2984((byte) -99);
        class643.field9362.method817((byte) -68);
        class76.field887.method2241(64);
        class290.field3765.method2041(-2);
        class503.field6971.method3477(26);
        class396.method2279((byte) 112);
        class356.method2006((byte) 12);
        class608.method3504((byte) 7);
        if (class507.field7033 != class36.field282) {
            for (int var1 = 0; var1 < class358.field4717.length; var1++) {
                class358.field4717[var1] = null;
            }
            class114.field1425 = 0;
        }
        class582.method3388(arg0 ^ 0xFFFFFF01);
        class118.method690((byte) 9);
        class470.method2742(arg0);
        class202.method1087(-1629);
        class547.method3212((byte) 83);
        class630.field9059.method3687(1402);
        class210.field2560.method1137();
        class198.field2387.method695(55);
        class632.method3633(arg0 ^ 0xFE);
        class601.field8674.method2549(arg0 + 126);
        class566.field8314.method2549(119);
        class489.field6828.method2549(-117);
        class280.field3679.method2549(arg0 + 110);
        class173.field2110.method2549(arg0 ^ 0xFFFFFF86);
        class368.field4834.method2549(97);
        class282.field3709.method2549(105);
        class377.field5020.method2549(-73);
        class39.field299.method2549(arg0 ^ 0x45);
        class315.field4016.method2549(-38);
        class596.field8637.method2549(107);
        class531.field7458.method2549(94);
        class48.field401.method2549(-67);
        class593.field8621.method2549(109);
        class479.field6729.method2549(115);
        class92.field1132.method2549(102);
        class106.field1286.method2549(99);
        class507.field7035.method2549(-80);
        class584.field8484.method2549(119);
        class200.field2405.method2549(arg0 ^ 0x74);
        class44.field372.method2549(91);
        class319.field4071.method2549(-104);
        class420.field5435.method2549(95);
        class584.field8486.method2549(127);
        class245.field3143.method2549(112);
        class185.field2237.method2549(-109);
        class66.field645.method2549(93);
        class418.field5428.method2549(101);
        class104.field1266.method2549(-80);
        class300.field3851.method2549(-91);
        class645.field9391.method2549(98);
        class516.field7285.method2549(127);
        class436.field5918.method3687(1402);
        class220.field2716.method3687(1402);
        class562.field8256.method3687(1402);
        class29.field200.method3687(1402);
    }
}
