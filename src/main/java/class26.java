import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class26 extends class695 {

    @OriginalMember(owner = "client!qaa", name = "Tb", descriptor = "Lnea;")
    public static class664 field388 = new class664(89, -2);

    @OriginalMember(owner = "client!qaa", name = "Ub", descriptor = "[I")
    public static int[] field389 = new int[32];

    @OriginalMember(owner = "client!qaa", name = "Vb", descriptor = "[I")
    public static int[] field390 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!qaa", name = "Eb", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!qaa", name = "Fb", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!qaa", name = "Gb", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!qaa", name = "Hb", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!qaa", name = "Ib", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!qaa", name = "Jb", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!qaa", name = "Kb", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!qaa", name = "Lb", descriptor = "I")
    private int field380;

    @OriginalMember(owner = "client!qaa", name = "Mb", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!qaa", name = "Nb", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!qaa", name = "Ob", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!qaa", name = "Pb", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!qaa", name = "Rb", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!qaa", name = "Sb", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!qaa", name = "Qb", descriptor = "Lqm;")
    private class129 field385;

    @OriginalMember(owner = "client!qaa", name = "Wb", descriptor = "Lla;")
    public static class416 field391;

    @OriginalMember(owner = "client!qaa", name = "e", descriptor = "(BI)I")
    public final int method309(byte arg0, int arg1) {
        ++field373;
        int var3 = this.field380 >> 3;
        int var4 = -(7 & this.field380) + 8;
        int var5 = 0;
        this.field380 += arg1;
        while (var4 < arg1) {
            var5 += (super.field9796[var3++] & class479.field6802[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        if (arg0 != 57) {
            field388 = null;
        }
        int var6;
        if (arg1 != var4) {
            var6 = (super.field9796[var3] >> -arg1 + var4 & class479.field6802[arg1]) + var5;
        } else {
            var6 = (class479.field6802[var4] & super.field9796[var3]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!qaa", name = "m", descriptor = "(B)I")
    public final int method310(byte arg0) {
        int var2 = 103 / ((-17 - arg0) / 58);
        ++field386;
        int var3 = super.field9796[super.field9761++] - this.field385.method964((byte) 80) & 255;
        return ~var3 > -129 ? var3 : (var3 + -128 << 8) + (super.field9796[super.field9761++] - this.field385.method964((byte) 59) & 255);
    }

    @OriginalMember(owner = "client!qaa", name = "f", descriptor = "(BI)I")
    public final int method311(byte arg0, int arg1) {
        ++field383;
        return arg0 != -31 ? 64 : arg1 * 8 + -this.field380;
    }

    @OriginalMember(owner = "client!qaa", name = "p", descriptor = "(I)V")
    public final void method312(int arg0) {
        ++field377;
        this.field380 = super.field9761 * 8;
        if (arg0 <= 102) {
            method313(52);
        }
    }

    @OriginalMember(owner = "client!qaa", name = "q", descriptor = "(I)V")
    public static void method313(int arg0) {
        field391 = null;
        field388 = null;
        if (arg0 > -89) {
            field390 = null;
        }
        field390 = null;
        field389 = null;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Loda;")
    public static final class102 method314(Throwable arg0, String arg1) {
        ++field378;
        class102 var2;
        if (!(arg0 instanceof class102)) {
            var2 = new class102(arg0, arg1);
        } else {
            var2 = (class102) arg0;
            var2.field1603 = var2.field1603 + ' ' + arg1;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qaa", name = "r", descriptor = "(I)[Lnea;")
    public static final class664[] method315(int arg0) {
        if (arg0 != 255) {
            method313(-78);
        }
        ++field384;
        return new class664[] { class599.field8475, class203.field2873, class40.field655, class123.field1854, class484.field6874, class221.field3096, class177.field2520, class14.field116, class399.field5892, class319.field4700, class24.field329, class318.field4689, class169.field2432, class43.field697, class344.field5031, class19.field221, class547.field7691, class274.field4180, class519.field7317, class159.field2286, class368.field5264, class310.field4594, class206.field2894, class540.field7558, class327.field4851, class520.field7334, class682.field9619, class310.field4591, class566.field7977, class517.field7290, class223.field3140, class411.field5993, class491.field6969, class563.field7930, class46.field711, class352.field5073, class633.field8925, class395.field5860, class591.field8276, class550.field7728, class361.field5175, class599.field8474, class139.field2044, class581.field8182, class87.field1466, class311.field4613, class661.field9345, class523.field7389, class31.field488, class355.field5103, class83.field1377, class21.field286, class109.field1674, class169.field2430, class548.field7710, class56.field1088, class648.field9105, class279.field4211, class158.field2272, class97.field1527, class523.field7391, class376.field5353, class208.field2923, class289.field4298, class311.field4610, class665.field9383, class17.field187, class356.field5112, class97.field1534, class77.field1331, class84.field1391, class648.field9104, class321.field4715, class592.field8301, class23.field310, class662.field9359, class270.field4048, class67.field1227, class423.field6156, class632.field8836, class329.field4863, class492.field7003, class374.field5329, class111.field1686, class136.field1988, class132.field1955, class502.field7108, class302.field4506, class633.field8942, field388, class87.field1468, class635.field8985, class248.field3858, class86.field1409, class673.field9518, class373.field5325, class69.field1244, class578.field8149, class83.field1374, class219.field3059, class559.field7885, class143.field2111, class654.field9180, class563.field7929, class234.field3636, class503.field7113, class236.field3648, class293.field4320, class249.field3863, class139.field2045, class666.field9400, class508.field7173, class658.field9229, class164.field2360, class671.field9488, class521.field7340, class134.field1972 };
    }

    @OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(I)V")
    public class26(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qaa", name = "g", descriptor = "(BI)V")
    public final void method316(byte arg0, int arg1) {
        if (arg0 != -74) {
            field389 = null;
        }
        super.field9796[super.field9761++] = (byte) (this.field385.method964((byte) 30) + arg1);
        ++field387;
    }

    @OriginalMember(owner = "client!qaa", name = "s", descriptor = "(I)V")
    public final void method317(int arg0) {
        ++field382;
        super.field9761 = (this.field380 + 7) / arg0;
    }

    @OriginalMember(owner = "client!qaa", name = "t", descriptor = "(I)Z")
    public final boolean method318(int arg0) {
        if (arg0 != -7976) {
            field391 = null;
        }
        ++field376;
        int var2 = 255 & super.field9796[super.field9761] - this.field385.method965((byte) 109);
        return var2 >= 128;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ILqm;)V")
    public final void method319(int arg0, class129 arg1) {
        ++field379;
        this.field385 = arg1;
        if (arg0 != 255) {
            method313(-84);
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I[I)V")
    public final void method320(int arg0, int[] arg1) {
        this.field385 = new class129(arg1);
        if (arg0 != 8) {
            this.method310((byte) 38);
        }
        ++field381;
    }

    @OriginalMember(owner = "client!qaa", name = "j", descriptor = "(II)Lkq;")
    public static final class549 method321(int arg0, int arg1) {
        ++field374;
        class392[] var2 = class552.field7824;
        synchronized (class552.field7824) {
            if (arg1 != 0) {
                method315(-16);
            }
            class549 var3;
            if (arg0 < class552.field7824.length && !class552.field7824[arg0].method2411((byte) -51)) {
                var3 = (class549) class552.field7824[arg0].method2412(true);
                var3.method3414(0);
                int var10002 = class97.field1522[arg0]--;
            } else {
                var3 = new class549();
                var3.field7711 = new class253[arg0];
                for (int var4 = 0; ~arg0 < ~var4; ++var4) {
                    var3.field7711[var4] = new class253();
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "([BIIB)V")
    public final void method322(byte[] arg0, int arg1, int arg2, byte arg3) {
        for (int var5 = 0; ~var5 > ~arg2; ++var5) {
            arg0[var5 - -arg1] = (byte) (super.field9796[super.field9761++] + -this.field385.method964((byte) 109));
        }
        ++field375;
        int var6 = -120 / ((57 - arg3) / 49);
    }
}
