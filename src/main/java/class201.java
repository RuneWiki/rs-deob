import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class201 extends class161 {

    @OriginalMember(owner = "client!el", name = "y", descriptor = "[I")
    public int[] field3520 = new int[1];

    @OriginalMember(owner = "client!el", name = "p", descriptor = "[I")
    public int[] field3511 = new int[] { -1 };

    @OriginalMember(owner = "client!el", name = "t", descriptor = "I")
    public static int field3515 = 1;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "Lp;")
    public static class280 field3512 = class18.method140((byte) -122, "(U3");

    @OriginalMember(owner = "client!el", name = "A", descriptor = "I")
    public static int field3522 = 0;

    @OriginalMember(owner = "client!el", name = "z", descriptor = "Lp;")
    public static class280 field3521 = class18.method140((byte) -128, "(U0a )2 in: ");

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!el", name = "v", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!el", name = "w", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!el", name = "x", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "[I")
    public static int[] field3516;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BI)Z")
    public static final boolean method1377(byte arg0, int arg1) {
        field3517++;
        int var2 = -65 / ((arg0 - 46) / 57);
        class2 var3 = class180.method1242(arg1, 97);
        if (var3 == null) {
            return false;
        } else if (class198.field3469 == 1 || class198.field3469 == 2 || class128.field2232 == 2) {
            byte[] var4 = var3.field89.method1898((byte) -104);
            class54.field895 = new String(var4, 0, var4.length);
            class105.field1741 = var3.field88;
            if (class128.field2232 != 0) {
                class74.field1218 = class105.field1741 + 50000;
                class238.field4132 = class105.field1741 + 40000;
                class152.field2637 = class238.field4132;
            }
            return true;
        } else {
            class280 var5 = class61.field985;
            if (class128.field2232 != 0) {
                var5 = class30.method266(new class280[] { class91.field1485, class249.method1685((byte) 47, var3.field88 + 7000) }, (byte) -87);
            }
            class280 var6 = class61.field985;
            if (class188.field3309 != null) {
                var6 = class30.method266(new class280[] { class105.field1755, class188.field3309 }, (byte) -87);
            }
            class280 var7 = class30.method266(new class280[] { class78.field1283, var3.field89, var5, class162.field2830, class249.method1685((byte) 68, class269.field4725), class36.field656, class249.method1685((byte) -75, class108.field1778), var6, class145.field2533, class255.field4481 ? class164.field2878 : class90.field1466, class34.field633, class105.field1739 ? class164.field2878 : class90.field1466, class235.field4105, class16.field295 ? class164.field2878 : class90.field1466 }, (byte) -87);
            try {
                class194.field3418.getAppletContext().showDocument(var7.method1878((byte) 70), "_self");
                return true;
            } catch (Exception var8) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(I)V")
    public static void method1378(int arg0) {
        int var1 = -108 % ((arg0 - 46) / 45);
        field3521 = null;
        field3516 = null;
        field3512 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IJIIIILp;)V")
    public static final void method1379(int arg0, long arg1, int arg2, int arg3, int arg4, int arg5, class280 arg6) {
        class25 var8 = new class25(128);
        var8.method227(-20435, 10);
        field3519++;
        if (arg2 != 25314) {
            return;
        }
        var8.method214(arg2 ^ 0xFFFF9D1F, (int) (Math.random() * 99999.0D));
        var8.method214(-3, 528);
        var8.method219(arg1, -89);
        var8.method231(11510, (int) (Math.random() * 9.9999999E7D));
        var8.method195(arg6, -66);
        var8.method231(11510, (int) (Math.random() * 9.9999999E7D));
        var8.method214(-3, class108.field1778);
        var8.method227(-20435, arg4);
        var8.method227(-20435, arg5);
        var8.method231(arg2 ^ 0x4E14, (int) (Math.random() * 9.9999999E7D));
        var8.method214(arg2 ^ 0xFFFF9D1F, arg3);
        var8.method214(-3, arg0);
        var8.method231(arg2 - 13804, (int) (Math.random() * 9.9999999E7D));
        var8.method196(class155.field2714, class152.field2636, arg2 + 4953);
        class34.field627.field481 = 0;
        class34.field627.method227(arg2 - 45749, 123);
        class34.field627.method227(-20435, var8.field481);
        class34.field627.method207(var8.field481, 0, (byte) 57, var8.field475);
        class133.field2366 = 1;
        class235.field4096 = 0;
        class120.field2128 = -3;
        class154.field2664 = 0;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IB)I")
    public static final int method1380(int arg0, byte arg1) {
        field3518++;
        if (arg1 != -124) {
            field3522 = -18;
        }
        int var2 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAB) >>> 1);
        int var3 = ((var2 & 0xCCCCCCCE) >>> 2) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }
}
