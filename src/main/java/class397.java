import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class397 extends class406 {

    @OriginalMember(owner = "client!qp", name = "w", descriptor = "I")
    public static int field5685 = -1;

    @OriginalMember(owner = "client!qp", name = "z", descriptor = "F")
    public float field5688;

    @OriginalMember(owner = "client!qp", name = "p", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!qp", name = "q", descriptor = "I")
    public int field5679;

    @OriginalMember(owner = "client!qp", name = "r", descriptor = "I")
    public int field5680;

    @OriginalMember(owner = "client!qp", name = "s", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!qp", name = "t", descriptor = "I")
    public int field5682;

    @OriginalMember(owner = "client!qp", name = "u", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!qp", name = "v", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!qp", name = "y", descriptor = "I")
    public int field5687;

    @OriginalMember(owner = "client!qp", name = "A", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!qp", name = "B", descriptor = "I")
    public int field5690;

    @OriginalMember(owner = "client!qp", name = "x", descriptor = "Ltq;")
    public static class376 field5686;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V")
    public static final void method2534(int arg0) {
        field5689++;
        for (class267 var1 = (class267) class79.field928.method506((byte) -128); var1 != null; var1 = (class267) class79.field928.method514(true)) {
            class8 var2 = var1.field3802;
            if (class129.field1570 != var2.field3285 || var2.field127) {
                var1.method2594((byte) -22);
                var2.method59(2);
            } else if (var2.field114 <= class189.field2726) {
                var2.method58(-15676, class34.field392);
                if (var2.field127) {
                    var1.method2594((byte) -22);
                } else {
                    class371.method2364(var2, true);
                }
            }
        }
        if (arg0 < 55) {
            method2537(41);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(III)V")
    public static final void method2535(int arg0, int arg1, int arg2) {
        field5681++;
        class20 var3 = class369.method2351((byte) 105, arg1, arg2);
        var3.method146(72);
        var3.field252 = arg0;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public static final void method2536(int arg0, String arg1, boolean arg2) {
        field5683++;
        class335.field4751++;
        class62.field718.method2143(211, -2);
        class62.field718.method1583(class81.method457(arg1, (byte) -49) + 1, (byte) -67);
        class62.field718.method1596(arg1, arg2);
        class62.field718.method1611(-55, arg0);
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(I)V")
    public static void method2537(int arg0) {
        if (arg0 == 0) {
            field5686 = null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2538(int arg0, String arg1) {
        if (class411.field5899 == null) {
            class255.method1718(2);
        }
        field5684++;
        String[] var2 = class409.method2618(1, arg1, '\n');
        int var3 = 0;
        int var4 = 35 / ((-arg0 - 66) / 45);
        while (var3 < var2.length) {
            for (int var5 = class345.field4888; var5 > 0; var5--) {
                class411.field5899[var5] = class411.field5899[var5 - 1];
            }
            class411.field5899[0] = var2[var3];
            if (class345.field4888 < (class411.field5899.length - 1)) {
                if (class101.field1235 > 0) {
                    class101.field1235++;
                }
                class345.field4888++;
            }
            var3++;
        }
    }
}
