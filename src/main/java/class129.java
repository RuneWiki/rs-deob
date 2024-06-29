import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class129 extends class242 {

    @OriginalMember(owner = "client!lb", name = "R", descriptor = "[Lp;")
    public static class280[] field2236 = new class280[200];

    @OriginalMember(owner = "client!lb", name = "W", descriptor = "Lp;")
    private static class280 field2241 = class18.method140((byte) -120, "Hidden");

    @OriginalMember(owner = "client!lb", name = "T", descriptor = "I")
    public static int field2238 = 0;

    @OriginalMember(owner = "client!lb", name = "X", descriptor = "I")
    public static int field2242 = 0;

    @OriginalMember(owner = "client!lb", name = "U", descriptor = "Lp;")
    public static class280 field2239 = field2241;

    @OriginalMember(owner = "client!lb", name = "V", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!lb", name = "Y", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!lb", name = "Z", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!lb", name = "ab", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!lb", name = "S", descriptor = "Ljava/awt/Frame;")
    public static Frame field2237;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZII)Lp;")
    public static final class280 method885(int arg0, boolean arg1, int arg2, int arg3) {
        field2245++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        int var4 = arg3 / arg0;
        int var5 = 1;
        while (var4 != 0) {
            var4 /= arg0;
            var5++;
        }
        int var6 = var5;
        if (~arg3 > arg2 || arg1) {
            var6 = var5 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg3 < 0) {
            var7[0] = 45;
        } else if (arg1) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = arg3 % arg0;
            arg3 /= arg0;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class280 var9 = new class280();
        var9.field4908 = var6;
        var9.field4907 = var7;
        return var9;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)[I")
    public final int[] method54(int arg0, int arg1) {
        int var3 = 106 % ((arg1 - 73) / 41);
        field2244++;
        return class102.field1701;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
    public class129() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "(I)V")
    public static void method886(int arg0) {
        field2237 = null;
        field2236 = null;
        if (arg0 >= -2) {
            field2238 = 20;
        }
        field2239 = null;
        field2241 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lp;BLp;I)V")
    public static final void method887(class280 arg0, byte arg1, class280 arg2, int arg3) {
        class229.field3963 = arg2;
        class109.field1828 = arg3;
        class229.field3961 = arg0;
        field2243++;
        if (class229.field3961.method1888(class229.field3959, 25648) || class229.field3963.method1888(class229.field3959, arg1 + 25700)) {
            class8.field148 = 3;
        } else if (class105.field1741 == -1) {
            class6.field130 = 0;
            class189.field3317 = 1;
            class140.field2431 = 0;
            class8.field148 = -3;
            class25 var4 = new class25(128);
            var4.method227(-20435, 10);
            var4.method214(-3, (int) (Math.random() * 99999.0D));
            var4.method214(-3, 528);
            var4.method219(class229.field3961.method1896(118), arg1 + 154);
            var4.method231(11510, (int) (Math.random() * 9.9999999E7D));
            var4.method195(class229.field3963, -66);
            var4.method231(11510, (int) (Math.random() * 9.9999999E7D));
            var4.method196(class155.field2714, class152.field2636, 30267);
            if (arg1 == -52) {
                class34.field627.field481 = 0;
                class34.field627.method227(-20435, 111);
                class34.field627.method227(-20435, var4.field481);
                class34.field627.method207(var4.field481, 0, (byte) 21, var4.field475);
            }
        } else {
            class90.method640(0);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILtg;BI)[Lde;")
    public static final class108[] method888(int arg0, class180 arg1, byte arg2, int arg3) {
        field2240++;
        if (arg2 > -94) {
            return null;
        } else if (class90.method648(arg0, arg3, arg1, -41)) {
            return class267.method1796((byte) 108);
        } else {
            return null;
        }
    }
}
