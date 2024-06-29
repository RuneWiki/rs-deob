import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class367 extends class279 {

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "F")
    private float field5592 = 0.0F;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "Lno;")
    private class67 field5590;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "Ltm;")
    public static class334 field5585 = new class334(120, 3);

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZLiu;)V")
    public final void method437(int arg0, boolean arg1, class506 arg2) {
        if (arg1) {
            field5585 = null;
        }
        ++field5589;
        super.field4267.method215(8, arg2);
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lpj;Lno;)V")
    public class367(class38 arg0, class67 arg1) {
        super(arg0);
        this.field5590 = arg1;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method2346(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method2348(-72, 120, 38, -105, 8, (byte) 38, (class544) null);
        }
        ++field5587;
        return ~(16 & arg0) != -1;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZI)V")
    public final void method435(boolean arg0, int arg1) {
        if (arg1 != 2048) {
            this.method434(-22);
        }
        ++field5593;
        super.field4267.method411(1, (byte) -100);
        super.field4267.method365(class200.field3408, class750.field10454, (byte) -122);
        super.field4267.method338(0, class388.field5817, false, true, 31181);
        super.field4267.method227(0, class493.field7145, 70);
        super.field4267.method241(0, 0);
        super.field4267.method411(0, (byte) -115);
        super.field4267.method228(arg1 + -2046, -16777216);
        super.field4267.method227(0, class327.field4819, arg1 + -1978);
        this.method434(-1);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BZ)V")
    public final void method441(byte arg0, boolean arg1) {
        if (arg0 != 9) {
            field5585 = null;
        }
        super.field4267.method365(class333.field4884, class750.field10454, (byte) -122);
        ++field5591;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)Z")
    public final boolean method438(byte arg0) {
        ++field5588;
        return arg0 > -32 ? false : this.field5590.method646((byte) 75);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)V")
    public final void method443(int arg0, int arg1, int arg2) {
        ++field5595;
        super.field4267.method411(1, (byte) -85);
        if (~(arg0 & 128) == -1) {
            if (~(1 & arg2) == -2) {
                if (!this.field5590.field1050) {
                    int var4 = super.field4267.field649 % 4000 * 16 / 4000;
                    super.field4267.method215(8, this.field5590.field1052[var4]);
                } else {
                    this.field5592 = (float) (super.field4267.field649 % 4000) / 4000.0F;
                    super.field4267.method215(8, this.field5590.field1058);
                }
            } else if (!this.field5590.field1050) {
                super.field4267.method215(8, this.field5590.field1052[0]);
            } else {
                super.field4267.method215(8, this.field5590.field1058);
            }
        } else {
            super.field4267.method215(8, (class506) null);
        }
        super.field4267.method411(arg1, (byte) -97);
    }

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "(I)V")
    public static void method2347(int arg0) {
        if (arg0 != 30581) {
            field5585 = null;
        }
        field5585 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V")
    public final void method442(boolean arg0) {
        ++field5594;
        super.field4267.method411(1, (byte) -96);
        super.field4267.method365(class333.field4884, class333.field4884, (byte) -122);
        super.field4267.method321(class388.field5817, 0, (byte) -95);
        super.field4267.method227(0, class388.field5817, 70);
        super.field4267.method241(1, 0);
        super.field4267.method215(8, (class506) null);
        super.field4267.method411(0, (byte) -106);
        super.field4267.method227(0, class388.field5817, 70);
        if (arg0) {
            this.field5592 = -0.19580936F;
        }
    }

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "(I)V")
    public final void method434(int arg0) {
        ++field5584;
        if (arg0 == ~super.field4267.method306(1)) {
            class341 var2 = super.field4267.method263(false);
            super.field4267.method411(1, (byte) -90);
            class341 var3 = super.field4267.method269(arg0 + 2);
            var3.method673(var2);
            var3.method2197(0.125F, 0.125F, 1.0F, 79);
            var3.method2190((byte) 51, 0.0F, this.field5592, 0.0F);
            super.field4267.method342((byte) 72, class127.field1976);
            super.field4267.method411(0, (byte) -115);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIIBLha;)V")
    public static final void method2348(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, class544 arg6) {
        ++field5586;
        if (arg5 <= 69) {
            field5585 = null;
        }
        if ((class483.field6963 == null || class193.field3340 == null || class449.field6553 == null) && class101.field1494.method2621(class51.field820, -28975) && class101.field1494.method2621(class73.field1096, -28975) && class101.field1494.method2621(class226.field3626, -28975)) {
            class726 var7 = class726.method4002(class101.field1494, class73.field1096, 0);
            class193.field3340 = arg6.method310(var7, true);
            var7.method4015();
            class358.field5450 = arg6.method310(var7, true);
            class483.field6963 = arg6.method310(class726.method4002(class101.field1494, class51.field820, 0), true);
            class726 var8 = class726.method4002(class101.field1494, class226.field3626, 0);
            class449.field6553 = arg6.method310(var8, true);
            var8.method4015();
            class629.field8846 = arg6.method310(var8, true);
        }
        if (class483.field6963 != null && class193.field3340 != null && class449.field6553 != null) {
            int var9 = (-(class449.field6553.method175() * 2) + arg2) / class483.field6963.method175();
            for (int var10 = 0; var9 > var10; ++var10) {
                class483.field6963.method182(arg3 + class449.field6553.method175() + class483.field6963.method175() * var10, -class483.field6963.method179() + arg1 + arg0);
            }
            int var11 = (-arg4 + (arg0 - class449.field6553.method179())) / class193.field3340.method179();
            for (int var12 = 0; ~var11 < ~var12; ++var12) {
                class193.field3340.method182(arg3, class193.field3340.method179() * var12 + (arg1 - -arg4));
                class358.field5450.method182(arg2 + arg3 + -class358.field5450.method175(), arg4 + (arg1 - -(var12 * class193.field3340.method179())));
            }
            class449.field6553.method182(arg3, -class449.field6553.method179() + arg0 + arg1);
            class629.field8846.method182(-class449.field6553.method175() + arg2 + arg3, -class449.field6553.method179() + arg0 + arg1);
        }
    }
}
