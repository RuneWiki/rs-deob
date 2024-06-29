import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public abstract class class18 {

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "Lid;")
    public static class226 field244 = new class226();

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "Leg;")
    private static class37 field247 = class174.method1167(" has logged in)3", 59);

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "Leg;")
    public static class37 field248 = field247;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "Leg;")
    public static class37 field249 = class174.method1167("lila:", -79);

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILpe;I)V")
    public static final void method120(int arg0, int arg1, class237 arg2, int arg3) {
        field246++;
        if (class159.field2661 < 2 && class23.field292 == 0 && !class174.field2924) {
            return;
        }
        int var4 = 29 % ((arg0 - 40) / 38);
        class37 var5;
        if (class23.field292 == 1 && class159.field2661 < 2) {
            var5 = class156.method1061((byte) -84, new class37[] { class86.field1365, class55.field835, class150.field2523, class140.field2415 });
        } else if (class174.field2924 && class159.field2661 < 2) {
            var5 = class156.method1061((byte) -114, new class37[] { class147.field2497, class55.field835, class93.field1464, class140.field2415 });
        } else if (class56.field877 && class158.field2625[81] && class159.field2661 > 2) {
            var5 = class132.method945(class159.field2661 - 2, 116);
        } else {
            var5 = class132.method945(class159.field2661 - 1, 83);
        }
        if (class159.field2661 > 2) {
            var5 = class156.method1061((byte) 105, new class37[] { var5, class263.field4630, class163.method1096(class159.field2661 - 2, (byte) -35), class147.field2498 });
        }
        if (arg2 == null) {
            int var7 = class180.field3002.method1224(var5, arg1 + 4, arg3 + 15, 16777215, 0, class252.field4502, class248.field4453);
            class171.method1151(arg3, class180.field3002.method1211(var5) + var7, arg1 + 4, -30822, 15);
            return;
        }
        class183 var6 = arg2.method1634((byte) 40, class165.field2748);
        if (var6 == null) {
            var6 = class180.field3002;
        }
        var6.method1212(var5, arg1, arg3, arg2.field4067, arg2.field4206, arg2.field4124, arg2.field4144, arg2.field4087, arg2.field4118, class252.field4502, class248.field4453, class289.field5105);
        class171.method1151(class289.field5105[1], class289.field5105[2], class289.field5105[0], -30822, class289.field5105[3]);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V")
    public static final void method121(int arg0, int arg1) {
        field245++;
        if (class262.method1772(arg0 + 1, arg1)) {
            class152.method1042(arg0, 80, class232.field4000[arg1]);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public static final void method122(int arg0) {
        field243++;
        class17.field238.method480(-8543);
        for (int var1 = 0; var1 < 32; var1++) {
            class170.field2849[var1] = 0L;
        }
        for (int var2 = arg0; var2 < 32; var2++) {
            class223.field3829[var2] = 0L;
        }
        class175.field2930 = 0;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
    public static void method123(byte arg0) {
        if (arg0 > -101) {
            method123((byte) -79);
        }
        field244 = null;
        field249 = null;
        field248 = null;
        field247 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLpe;)V")
    public static final void method124(byte arg0, class237 arg1) {
        field242++;
        class237 var2 = class113.method810(false, arg1);
        if (arg0 != 63) {
            return;
        }
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class199.field3390;
            var4 = class249.field4479;
        } else {
            var4 = var2.field4067;
            var3 = var2.field4206;
        }
        class35.method204(false, arg1, (byte) 127, var3, var4);
        class273.method1825(var4, false, arg1, var3);
    }
}
