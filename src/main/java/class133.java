import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class133 extends class14 {

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "[I")
    public static int[] field2324 = new int[100];

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "Llc;")
    public static class143 field2329 = class66.method374("_", -1);

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "Z")
    public static boolean field2328 = false;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public static int field2323 = 0;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "Llc;")
    public static class143 field2332 = class66.method374("Librairie 3D d-Bmarr-Be", -1);

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "[I")
    public static int[] field2330 = new int[100];

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
    public int field2331;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "Llc;")
    public class143 field2327;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "Llc;")
    public class143 field2335;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "[I")
    public static int[] field2326;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)Luc;")
    public final class165 method793(int arg0) {
        if (arg0 != 0) {
            field2326 = null;
        }
        ++field2333;
        return class26.field431[super.field259];
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIII)V")
    public static final void method794(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class223 var7 = new class223();
        var7.field4051 = arg1 / 128;
        var7.field4053 = arg2 / 128;
        var7.field4039 = arg3 / 128;
        var7.field4052 = arg4 / 128;
        var7.field4059 = arg0;
        var7.field4060 = arg1;
        var7.field4055 = arg2;
        var7.field4043 = arg3;
        var7.field4057 = arg4;
        var7.field4063 = arg5;
        var7.field4048 = arg6;
        class164.field2944[class136.field2392++] = var7;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)V")
    public static final void method795(int arg0, int arg1) {
        if (arg0 <= -3) {
            class189.field3419 = false;
            class238.field4309 = -1;
            class88.field1599 = -1;
            class70.field1339 = 0;
            class7.field121 = null;
            class85.field1515 = arg1;
            class24.field416 = 1;
            ++field2325;
        }
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V")
    public static void method796(int arg0) {
        field2326 = null;
        field2329 = null;
        field2324 = null;
        if (arg0 != 0) {
            field2328 = true;
        }
        field2332 = null;
        field2330 = null;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)Llc;")
    public static final class143 method797(byte arg0) {
        ++field2334;
        if (arg0 <= 113) {
            return null;
        } else {
            class143 var1 = class105.field1861;
            if (class235.field4290 != 0) {
                var1 = class64.field1208;
            }
            class143 var2 = class21.field342;
            if (class173.field3104 != null) {
                var2 = class25.method179(0, new class143[] { class185.field3359, class173.field3104 });
            }
            return class25.method179(0, new class143[] { class10.field190, var1, class250.field4508, class274.method1806(class141.field2467, true), class240.field4344, class274.method1806(class188.field3414, true), var2, class203.field3684 });
        }
    }
}
