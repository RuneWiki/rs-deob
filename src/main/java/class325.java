import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class325 implements class722 {

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "Lf;")
    private class758 field4639;

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "[Lqd;")
    private class450[] field4642;

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "Leia;")
    public static class243 field4637 = new class243();

    @OriginalMember(owner = "client!fp", name = "p", descriptor = "Z")
    public static boolean field4650 = false;

    @OriginalMember(owner = "client!fp", name = "o", descriptor = "Z")
    public static boolean field4649 = false;

    @OriginalMember(owner = "client!fp", name = "m", descriptor = "B")
    public static byte field4647;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!fp", name = "k", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!fp", name = "l", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!fp", name = "j", descriptor = "Lha;")
    private class60 field4644;

    @OriginalMember(owner = "client!fp", name = "n", descriptor = "Z")
    private boolean field4648;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IJ)Z", line = 4)
    public final boolean method2063(int arg0, long arg1) {
        if (arg0 > -87) {
            this.method2070((byte) -59, false);
        }
        field4638++;
        return ((long) this.field4639.field10596 + arg1) <= class524.method3075(18);
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)I", line = 15)
    public final int method2064(int arg0) {
        field4635++;
        int var2 = 0;
        class450[] var3 = this.field4642;
        int var4 = 0;
        if (arg0 < 44) {
            this.method2064(27);
        }
        while (var4 < var3.length) {
            class450 var5 = var3[var4];
            if (var5 == null || var5.method1251(-24346)) {
                var2++;
            }
            var4++;
        }
        return var2 * 100 / this.field4642.length;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILsca;II)V", line = 43)
    public static final void method2065(int arg0, class46 arg1, int arg2, int arg3) {
        field4636++;
        if (arg2 != -11167) {
            method2068(7);
        }
        class61.field871 = arg1;
        class352.field5124 = arg3;
        class501.field7121 = arg0;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Z)V", line = 57)
    public final void method2066(boolean arg0) {
        field4646++;
        if (class736.field10316 != this.field4644) {
            this.field4644 = class736.field10316;
            this.field4648 = true;
        }
        this.field4644.method502(0);
        class450[] var2 = this.field4642;
        if (!arg0) {
            this.method2070((byte) 117, true);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class450 var4 = var2[var3];
            if (var4 != null) {
                var4.method1253(27444);
            }
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V", line = 89)
    public final void method2067(int arg0) {
        if (arg0 >= 86) {
            field4640++;
        }
    }

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(I)V", line = 99)
    public static void method2068(int arg0) {
        field4637 = null;
        if (arg0 > -23) {
            field4647 = 12;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)I", line = 115)
    public final int method2069(byte arg0) {
        field4645++;
        if (arg0 != 82) {
            this.method2066(false);
        }
        return this.field4639.field10597;
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lf;Lvo;)V", line = 132)
    public class325(class758 arg0, class43 arg1) {
        this.field4639 = arg0;
        this.field4642 = new class450[this.field4639.field10598.length];
        for (int var3 = 0; var3 < this.field4642.length; var3++) {
            this.field4642[var3] = arg1.method302(this.field4639.field10598[var3], false);
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(BZ)V", line = 150)
    public final void method2070(byte arg0, boolean arg1) {
        field4643++;
        boolean var3 = true;
        if (arg0 != 99) {
            this.method2064(117);
        }
        class450[] var4 = this.field4642;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class450 var6 = var4[var5];
            if (var6 != null) {
                var6.method1249(7620, var3 || this.field4648);
            }
        }
        this.field4648 = false;
    }
}
