import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class216 {

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "[Lsf;")
    public static class187[] field3810 = new class187[4];

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "Le;")
    public static class191 field3811 = class54.method368("W-=hlen Sie eine Welt", 2047);

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "Le;")
    public static class191 field3812 = class54.method368("Hidden)2use", 2047);

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "F")
    public static float field3808;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "Lwa;")
    public static class226 field3815;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)Lq;")
    public static final class154 method1469(int arg0, int arg1) {
        field3807++;
        class154 var2 = (class154) class132.field2203.method991((long) arg0, arg1 - 25858);
        if (var2 != null) {
            return var2;
        } else if (arg1 == 0) {
            byte[] var3 = class133.field2231.method826((byte) 35, 3, arg0);
            class154 var4 = new class154();
            if (var3 != null) {
                var4.method1049((byte) -18, new class225(var3));
            }
            class132.field2203.method987(var4, (long) arg0, -2438);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIII)I")
    public static final int method1470(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -2465) {
            return 102;
        }
        int var4 = arg2 & 0x3;
        field3809++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static void method1471(int arg0) {
        field3811 = null;
        field3812 = null;
        field3810 = null;
        if (arg0 != 0) {
            method1473(-112, 91, -102, false, -20);
        }
        field3815 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)Lji;")
    public static final class225 method1472(boolean arg0) {
        field3806++;
        class225 var1 = new class225(24);
        var1.method1613(3, 21);
        var1.method1613(class87.field1421, 21);
        var1.method1613(class230.field4129 ? 1 : 0, 21);
        var1.method1613(class183.field3154 ? 1 : 0, 21);
        var1.method1613(class225.field4029 ? 1 : 0, 21);
        var1.method1613(class209.field3721 ? 1 : 0, 21);
        if (!arg0) {
            return null;
        }
        var1.method1613(class41.field729 ? 1 : 0, 21);
        var1.method1613(class127.field2111 ? 1 : 0, 21);
        var1.method1613(class226.field4074 ? 1 : 0, 21);
        var1.method1613(class252.field4472 ? 1 : 0, 21);
        var1.method1613(class102.field1660, 21);
        var1.method1613(class75.field1289 ? 1 : 0, 21);
        var1.method1613(class213.field3772 ? 1 : 0, 21);
        var1.method1613(class50.field898 ? 1 : 0, 21);
        var1.method1613(class56.field1036, 21);
        var1.method1613(class126.field2088 ? 1 : 0, 21);
        var1.method1613(class30.field425, 21);
        var1.method1613(class255.field4532, 21);
        var1.method1613(class173.field2904, 21);
        var1.method1608(class273.field4836, false);
        var1.method1608(class27.field398, false);
        var1.method1613(class61.field1105 ? 1 : 0, 21);
        return var1;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIZI)V")
    public static final void method1473(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field3805++;
        class241 var5 = class14.method97(10, arg4, -94);
        var5.method1694((byte) -90);
        var5.field4301 = arg2;
        var5.field4290 = arg0;
        var5.field4279 = arg1;
        if (!arg3) {
            field3815 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIBII)V")
    public static final void method1474(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class67.field1160 = class161.field2728 * arg4 / arg3;
        class270.field4767 = -1;
        class30.field420 = class189.field3327 * arg0 / arg1;
        class225.field4008 = -1;
        field3813++;
        if (arg2 > 30) {
            class185.method1256(0);
        }
    }
}
