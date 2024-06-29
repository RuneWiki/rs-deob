import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class353 extends class584 {

    @OriginalMember(owner = "client!tm", name = "v", descriptor = "F")
    private float field4630 = 0.0F;

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "Lie;")
    private class6 field4623;

    @OriginalMember(owner = "client!tm", name = "u", descriptor = "[I")
    public static int[] field4629 = new int[2];

    @OriginalMember(owner = "client!tm", name = "w", descriptor = "Lfv;")
    public static class108 field4631 = new class108(12, 0, 1, 0);

    @OriginalMember(owner = "client!tm", name = "y", descriptor = "Lpr;")
    public static class407 field4633 = new class407(40, 3);

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!tm", name = "r", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!tm", name = "s", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!tm", name = "t", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!tm", name = "x", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!tm", name = "z", descriptor = "Ljo;")
    public static class303 field4634;

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lfo;Lie;)V", line = 3)
    public class353(class473 arg0, class6 arg1) {
        super(arg0);
        this.field4623 = arg1;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZZ)V", line = 14)
    public final void method177(boolean arg0, boolean arg1) {
        ++field4622;
        if (arg1) {
            super.field8309.method2759(class676.field9584, (byte) -5, class193.field2323);
        }
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(B)Z", line = 25)
    public final boolean method178(byte arg0) {
        ++field4632;
        if (arg0 > -6) {
            this.field4623 = null;
        }
        return this.field4623.method28(false);
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(B)V", line = 36)
    public static void method1954(byte arg0) {
        field4631 = null;
        field4634 = null;
        int var1 = 87 / ((arg0 - 11) / 35);
        field4629 = null;
        field4633 = null;
    }

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "(I)V", line = 49)
    public final void method174(int arg0) {
        super.field8309.method2690(1, 5);
        ++field4621;
        super.field8309.method2759(class193.field2323, (byte) -5, class193.field2323);
        super.field8309.method2757(class67.field708, (byte) -73, 0);
        super.field8309.method2723(class67.field708, -30892, 0);
        super.field8309.method1178(1, 8);
        super.field8309.method2696(-2, (class155) null);
        super.field8309.method2690(0, 5);
        int var2 = 51 % ((86 - arg0) / 40);
        super.field8309.method2723(class67.field708, -30892, 0);
    }

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "(I)Lav;", line = 68)
    public static final class583 method1955(int arg0) {
        ++field4626;
        if (arg0 != 1) {
            field4629 = null;
        }
        return class231.method1346(77, 1);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILld;B)V", line = 82)
    public final void method185(int arg0, class155 arg1, byte arg2) {
        ++field4624;
        if (arg2 >= 17) {
            super.field8309.method2696(-2, arg1);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)V", line = 93)
    public final void method175(int arg0, int arg1, int arg2) {
        ++field4627;
        if (arg2 > 116) {
            super.field8309.method2690(1, 5);
            if ((arg0 & 128) == 0) {
                if (~(arg1 & 1) == -2) {
                    if (!this.field4623.field50) {
                        int var4 = super.field8309.field6884 % 4000 * 16 / 4000;
                        super.field8309.method2696(-2, this.field4623.field53[var4]);
                    } else {
                        this.field4630 = (float) (super.field8309.field6884 % 4000) / 4000.0F;
                        super.field8309.method2696(-2, this.field4623.field49);
                    }
                } else if (this.field4623.field50) {
                    super.field8309.method2696(-2, this.field4623.field49);
                } else {
                    super.field8309.method2696(-2, this.field4623.field53[0]);
                }
            } else {
                super.field8309.method2696(-2, (class155) null);
            }
            super.field8309.method2690(0, 5);
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(ZI)V", line = 137)
    public final void method180(boolean arg0, int arg1) {
        super.field8309.method2690(1, 5);
        ++field4620;
        super.field8309.method2759(class676.field9584, (byte) -5, class250.field3212);
        super.field8309.method1168(false, true, class67.field708, 0, 4);
        super.field8309.method2723(class19.field171, -30892, 0);
        super.field8309.method1178(0, arg1 + 9);
        super.field8309.method2690(0, 5);
        super.field8309.method2719(-16777216, (byte) -116);
        if (arg1 != -1) {
            this.method180(false, -68);
        }
        super.field8309.method2723(class521.field7461, arg1 + -30891, 0);
        this.method182((byte) 127);
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(B)V", line = 156)
    public final void method182(byte arg0) {
        ++field4628;
        if (super.field8309.method2688(0) == 0) {
            class667 var2 = super.field8309.method2691(-124);
            super.field8309.method2690(1, 5);
            class667 var3 = super.field8309.method2730(113);
            var3.method233(var2);
            var3.method3753(1, 0.125F, 0.125F, 1.0F);
            var3.method3756(false, this.field4630, 0.0F, 0.0F);
            super.field8309.method2689(false, class354.field4652);
            super.field8309.method2690(0, 5);
        }
        int var4 = -57 % ((arg0 - 66) / 54);
    }
}
