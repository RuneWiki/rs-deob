import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class class9 {

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field177 = 0;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "[Lqa;")
    public static class88[] field181 = new class88[50];

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "Lia;")
    public static class257 field185 = class28.method234(117, "null");

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Lia;")
    public static class257 field182 = class28.method234(99, "Okay");

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "Lfa;")
    public static class176 field180;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "[Llc;")
    public static class90[] field179;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static void method113(int arg0) {
        field185 = null;
        field181 = null;
        field182 = null;
        field180 = null;
        field179 = null;
        if (arg0 != 21615) {
            method113(-98);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLmc;)Lmc;")
    public abstract class104 method114(byte arg0, class104 arg1);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public static final void method115(byte arg0) {
        while (true) {
            if (class40.field827.method910((byte) 45, class209.field3582) >= 27) {
                int var1 = class40.field827.method909(15, (byte) -128);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class92.field1758[var1] == null) {
                        var2 = true;
                        class92.field1758[var1] = new class197();
                    }
                    class197 var3 = class92.field1758[var1];
                    class199.field3412[class140.field2487++] = var1;
                    var3.field4180 = class7.field153;
                    int var4 = class40.field827.method909(1, (byte) -124);
                    if (var4 == 1) {
                        class210.field3591[class212.field3628++] = var1;
                    }
                    var3.field3322 = class92.method682(true, class40.field827.method909(14, (byte) -128));
                    int var5 = class245.field4258[class40.field827.method909(3, (byte) -112)];
                    if (var2) {
                        var3.field4125 = var3.field4118 = var5;
                    }
                    int var6 = class40.field827.method909(1, (byte) -123);
                    int var7 = class40.field827.method909(5, (byte) -127);
                    int var8 = class40.field827.method909(5, (byte) -127);
                    var3.field4128 = var3.field3322.field3390;
                    var3.field4165 = var3.field3322.field3343;
                    var3.field4178 = var3.field3322.field3351;
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var3.field4183 = var3.field3322.field3389;
                    var3.field4124 = var3.field3322.field3384;
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.field4145 = var3.field3322.field3373;
                    var3.field4149 = var3.field3322.field3368;
                    var3.field4176 = var3.field3322.field3360;
                    var3.field4146 = var3.field3322.field3400;
                    if (var3.field4146 == 0) {
                        var3.field4118 = 0;
                    }
                    var3.method1586(class137.field2441.field4119[0] + var8, var6 == 1, class137.field2441.field4182[0] + var7, (byte) 98);
                    if (var3.field3322.method1333(false)) {
                        class13.method135(var3, var3.field4182[0], (class233) null, class189.field3261, (class180) null, 0, 128, var3.field4119[0]);
                    }
                    continue;
                }
            }
            class40.field827.method911(false);
            field183++;
            int var9 = 33 / ((3 - arg0) / 47);
            return;
        }
    }
}
