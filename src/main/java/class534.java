import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class534 extends class74 {

    @OriginalMember(owner = "client!jn", name = "z", descriptor = "F")
    private float field7197 = 0.0F;

    @OriginalMember(owner = "client!jn", name = "t", descriptor = "Lbd;")
    private class190 field7191;

    @OriginalMember(owner = "client!jn", name = "y", descriptor = "[I")
    public static int[] field7196 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!jn", name = "D", descriptor = "Lwp;")
    public static class453 field7200 = new class453(54, -2);

    @OriginalMember(owner = "client!jn", name = "I", descriptor = "[I")
    public static int[] field7204 = new int[4096];

    @OriginalMember(owner = "client!jn", name = "u", descriptor = "I")
    public static int field7192;

    @OriginalMember(owner = "client!jn", name = "v", descriptor = "I")
    public static int field7193;

    @OriginalMember(owner = "client!jn", name = "w", descriptor = "I")
    public static int field7194;

    @OriginalMember(owner = "client!jn", name = "x", descriptor = "I")
    public static int field7195;

    @OriginalMember(owner = "client!jn", name = "A", descriptor = "I")
    public static int field7198;

    @OriginalMember(owner = "client!jn", name = "B", descriptor = "I")
    public static int field7199;

    @OriginalMember(owner = "client!jn", name = "E", descriptor = "I")
    public static int field7201;

    @OriginalMember(owner = "client!jn", name = "F", descriptor = "I")
    public static int field7202;

    @OriginalMember(owner = "client!jn", name = "G", descriptor = "I")
    public static int field7203;

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Len;Lbd;)V", line = 3)
    public class534(class478 arg0, class190 arg1) {
        super(arg0);
        this.field7191 = arg1;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)Z", line = 11)
    public final boolean method346(int arg0) {
        if (arg0 != -16777216) {
            this.method339(true, false);
        }
        ++field7192;
        return this.field7191.method1156((byte) -44);
    }

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "(I)V", line = 25)
    public static void method2893(int arg0) {
        field7204 = null;
        field7200 = null;
        field7196 = null;
        if (arg0 < 110) {
            field7204 = null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BLqi;)V", line = 38)
    public static final void method2894(byte arg0, class514 arg1) {
        if (arg0 == 70) {
            ++field7195;
            class164 var2 = (class164) class646.field9086.method399(-32748, (long) arg1.field9676);
            if (var2 != null) {
                if (var2.field2170 != null) {
                    class480.field6387.method1295(var2.field2170);
                    var2.field2170 = null;
                }
                var2.method1871(-15);
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IZ)V", line = 65)
    public final void method347(int arg0, boolean arg1) {
        super.field1011.method2589(0, 1);
        ++field7203;
        super.field1011.method2550(class88.field1235, true, class538.field7226);
        super.field1011.method1676(false, class5.field119, 0, true, (byte) 39);
        super.field1011.method2561(0, class141.field1830, -18836);
        super.field1011.method1705(3, 0);
        super.field1011.method2589(0, 0);
        int var3 = -62 % ((52 - arg0) / 36);
        super.field1011.method2597((byte) 48, -16777216);
        super.field1011.method2561(0, class700.field9903, -18836);
        this.method338((byte) -108);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IILhfa;)V", line = 83)
    public final void method341(int arg0, int arg1, class466 arg2) {
        super.field1011.method2596(arg2, 0);
        if (arg1 <= 47) {
            this.method346(-28);
        }
        ++field7202;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 94)
    public static final void method2895(int arg0, String arg1, int arg2) {
        ++field7194;
        class592 var3 = class61.method371(2, arg2, (byte) -84);
        var3.method3256((byte) 11);
        if (arg0 != 11332) {
            field7200 = null;
        }
        var3.field8316 = arg1;
    }

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "(I)V", line = 114)
    public final void method343(int arg0) {
        ++field7199;
        super.field1011.method2589(0, 1);
        super.field1011.method2550(class112.field1466, true, class112.field1466);
        super.field1011.method2602(0, 1, class5.field119);
        super.field1011.method2561(0, class5.field119, -18836);
        super.field1011.method1705(arg0 + 19095, 1);
        super.field1011.method2596((class466) null, 0);
        super.field1011.method2589(arg0 + 19092, 0);
        if (arg0 != -19092) {
            field7196 = null;
        }
        super.field1011.method2561(0, class5.field119, -18836);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIB)V", line = 135)
    public final void method340(int arg0, int arg1, byte arg2) {
        ++field7193;
        super.field1011.method2589(0, 1);
        if (~(arg0 & 128) != -1) {
            super.field1011.method2596((class466) null, 0);
        } else if (~(1 & arg1) == -2) {
            if (this.field7191.field2372) {
                this.field7197 = (float) (super.field1011.field6279 % 4000) / 4000.0F;
                super.field1011.method2596(this.field7191.field2369, arg2 + -65);
            } else {
                int var4 = super.field1011.field6279 % 4000 * 16 / 4000;
                super.field1011.method2596(this.field7191.field2370[var4], arg2 + -65);
            }
        } else if (!this.field7191.field2372) {
            super.field1011.method2596(this.field7191.field2370[0], 0);
        } else {
            super.field1011.method2596(this.field7191.field2369, 0);
        }
        if (arg2 != 65) {
            this.method339(true, false);
        }
        super.field1011.method2589(0, 0);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZZ)V", line = 179)
    public final void method339(boolean arg0, boolean arg1) {
        super.field1011.method2550(class112.field1466, arg0, class538.field7226);
        ++field7201;
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(B)V", line = 189)
    public final void method338(byte arg0) {
        ++field7198;
        if (~super.field1011.method2570(-41) == -1) {
            class691 var2 = super.field1011.method2546(true);
            super.field1011.method2589(0, 1);
            class691 var3 = super.field1011.method2562(97);
            var3.method919(var2);
            var3.method3903((byte) -75, 0.125F, 0.125F, 1.0F);
            var3.method3885(0.0F, this.field7197, 0.0F, (byte) -112);
            super.field1011.method2524(104, class590.field8284);
            super.field1011.method2589(0, 0);
        }
        if (arg0 > -35) {
            method2893(-43);
        }
    }
}
