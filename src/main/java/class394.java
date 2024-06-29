import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class394 extends class212 {

    @OriginalMember(owner = "client!pp", name = "v", descriptor = "Ltr;")
    public static class296 field5784 = new class296();

    @OriginalMember(owner = "client!pp", name = "x", descriptor = "[[I")
    public static int[][] field5786 = new int[6][];

    @OriginalMember(owner = "client!pp", name = "y", descriptor = "Lmu;")
    public static class303 field5787 = new class303(17, 4);

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "I")
    public static int field5777;

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "I")
    public static int field5778;

    @OriginalMember(owner = "client!pp", name = "q", descriptor = "I")
    public static int field5779;

    @OriginalMember(owner = "client!pp", name = "r", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!pp", name = "s", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!pp", name = "t", descriptor = "I")
    public static int field5782;

    @OriginalMember(owner = "client!pp", name = "u", descriptor = "I")
    public static int field5783;

    @OriginalMember(owner = "client!pp", name = "A", descriptor = "I")
    public static int field5789;

    @OriginalMember(owner = "client!pp", name = "B", descriptor = "Luea;")
    public static class318 field5790;

    @OriginalMember(owner = "client!pp", name = "w", descriptor = "Lbp;")
    public static class387 field5785;

    @OriginalMember(owner = "client!pp", name = "z", descriptor = "[Lro;")
    public static class2[] field5788;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "(I)I", line = 5)
    public final int method2473(int arg0) {
        if (arg0 != -32350) {
            field5785 = null;
        }
        ++field5779;
        return super.field3006;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)V", line = 16)
    public final void method418(boolean arg0) {
        if (super.field3004.field4419.method3492(arg0) && super.field3006 == 2) {
            super.field3006 = 1;
        }
        ++field5783;
        if (super.field3006 < 0 || ~super.field3006 < -3) {
            super.field3006 = this.method422(20014);
        }
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(ILdh;)V", line = 30)
    public class394(int arg0, class322 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Ldh;)V", line = 35)
    public class394(class322 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V", line = 38)
    public static final void method2474(byte arg0) {
        ++field5780;
        class652.method3686(73);
        class168.field2643 = null;
        class112.field1938 = null;
        if (arg0 <= 89) {
            field5789 = -75;
        }
        class94.field1659 = null;
        class590.field8054 = null;
        class454.field6406 = null;
    }

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "(I)V", line = 54)
    public static void method2475(int arg0) {
        field5787 = null;
        int var1 = 108 % ((-24 - arg0) / 54);
        field5784 = null;
        field5786 = null;
        field5790 = null;
        field5788 = null;
        field5785 = null;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(III)I", line = 69)
    public static final int method2476(int arg0, int arg1, int arg2) {
        ++field5778;
        if (class498.field6966 == -1) {
            return 1;
        } else {
            if (~class693.field9368.field4468.method1099(-32350) != ~arg0) {
                class588.method3356(-2, class497.field6904.method2936(class607.field8336, 544), true, arg0);
                if (arg0 != class693.field9368.field4468.method1099(-32350)) {
                    return -1;
                }
            }
            try {
                Dimension var3 = class458.field6458.getSize();
                class130.method1074(true, class355.field5007, class308.field4276, class497.field6904.method2936(class607.field8336, 544), 2, class272.field3822);
                class37 var4 = class756.method4222(0, class301.field4202, class498.field6966, -1);
                long var5 = class554.method3190(-88);
                class272.field3822.method305();
                class244.field3536.method744(0, class72.field1328, 0);
                class272.field3822.method210(class244.field3536);
                class272.field3822.method179(var3.width / 2, var3.height / 2, 512, 512);
                class272.field3822.method228(1.0F);
                if (arg1 >= -66) {
                    field5785 = null;
                }
                class272.field3822.method218(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
                class472 var7 = class272.field3822.method174(var4, 2048, 64, 64, 768);
                int var8 = 0;
                label45: for (int var9 = 0; ~var9 > -501; ++var9) {
                    class272.field3822.method220(0);
                    class272.field3822.method324();
                    for (int var10 = 15; ~var10 <= -1; --var10) {
                        for (int var11 = 0; ~var10 <= ~var11; ++var11) {
                            class216.field3122.method744((int) (((float) var11 + -((float) var10 / 2.0F)) * (float) class1.field3), 0, (var10 + 1) * class1.field3);
                            ++var8;
                            var7.method521(class216.field3122, (class317) null, 0);
                            if (~((long) arg2) >= ~(class554.method3190(-105) + -var5)) {
                                break label45;
                            }
                        }
                    }
                }
                class272.field3822.method355();
                long var12 = (long) (var8 * 1000) / (class554.method3190(-86) + -var5);
                class272.field3822.method220(0);
                class272.field3822.method324();
                return (int) var12;
            } catch (Throwable var15) {
                var15.printStackTrace();
                return -1;
            }
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)V", line = 155)
    public final void method419(int arg0, int arg1) {
        super.field3006 = arg1;
        ++field5782;
        int var3 = -73 / ((82 - arg0) / 35);
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)I", line = 168)
    public final int method422(int arg0) {
        ++field5777;
        if (arg0 != 20014) {
            field5788 = null;
        }
        return 2;
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(II)I", line = 181)
    public final int method417(int arg0, int arg1) {
        if (arg0 != 3) {
            return 23;
        } else {
            ++field5781;
            return 1;
        }
    }
}
