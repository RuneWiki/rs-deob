import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class459 extends class516 {

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "Lag;")
    private class587 field6491;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "Ljq;")
    private class438 field6502;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "Loba;")
    private class220 field6492;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "Lh;")
    public static class572 field6493 = new class572("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field6485;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public static int field6486;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public static int field6487;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
    public static int field6488;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public static int field6490;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    public static int field6494;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    public static int field6495;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
    public static int field6496;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
    public static int field6497;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    public static int field6498;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
    public static int field6499;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    public static int field6500;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "Lhf;")
    public static class335 field6501;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public static final void method2777(String arg0, String arg1, boolean arg2) {
        ++field6486;
        class378.field5211 = 1;
        class84.field1208 = -1;
        class263.method1665(arg0, false, -126, arg1);
        if (!arg2) {
            field6493 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BZ)V")
    public final void method199(byte arg0, boolean arg1) {
        int var3 = -101 % ((63 - arg0) / 38);
        OpenGL.glBindProgramARB(34336, this.field6492.field3200);
        ++field6490;
        OpenGL.glEnable(34336);
        super.field7353.method2598(class645.field9388, 0, (byte) 59);
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(B)V")
    public static final void method2778(byte arg0) {
        ++field6494;
        if (arg0 == 51) {
            class374[] var1 = class572.field8427;
            synchronized (class572.field8427) {
                for (int var2 = 0; ~var2 > ~class572.field8427.length; ++var2) {
                    class572.field8427[var2] = new class374();
                    class25.field244[var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "(B)V")
    public static void method2779(byte arg0) {
        int var1 = -46 / ((19 - arg0) / 44);
        field6493 = null;
        field6501 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
    public static final void method2780(int arg0, int arg1) {
        if (arg0 <= -100) {
            ++field6495;
            class221 var2 = class65.method413(5, arg1, (byte) 126);
            var2.method1432(0);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
    public final void method197(boolean arg0) {
        ++field6499;
        super.field7353.method2598(class453.field6405, 0, (byte) 59);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34820);
        if (arg0) {
            method2781((byte) 122);
        }
        OpenGL.glDisable(34336);
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lag;Lkda;Ljq;)V")
    public class459(class587 arg0, class328 arg1, class438 arg2) {
        super(arg0);
        this.field6491 = arg0;
        this.field6502 = arg2;
        if (this.field6502.method2555(true) && this.field6491.field8707) {
            this.field6492 = class639.method3699(34336, this.field6491, (byte) 117, arg1.method1990("transparent_water", 0, "gl"));
        } else {
            this.field6492 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "(B)V")
    public static final void method2781(byte arg0) {
        ++field6487;
        class391.field5388.method673(1);
        class437.field5844.method1632(true);
        class194.field2879.method3640(0);
        class216.field3172.method1497(64);
        class64.field797.method1173((byte) 104);
        class150.field2242.method3596((byte) -126);
        class463.field6521.method2981(true);
        class59.field742.method862(-3367);
        class32.field393.method2261((byte) 41);
        class110.field1564.method2298(5511);
        class105.field1514.method925(64);
        class599.field8839.method546(64);
        class440.field5876.method3063(20725);
        class86.field1226.method2172((byte) -101);
        class516.field7358.method1270(1);
        class97.field1414.method3020(-128);
        class351.field4786.method3619((byte) 127);
        class116.field1639.method816(true);
        class583.field8559.method3573(true);
        class47.field560.method901((byte) 73);
        class112.method817((byte) -124);
        class424.method2492((byte) -27);
        class156.method1127(126);
        if (class577.field8514 != class186.field2781) {
            for (int var1 = 0; class485.field6911.length > var1; ++var1) {
                class485.field6911[var1] = null;
            }
            class529.field7899 = 0;
        }
        class92.method733(0);
        class60.method396(20035);
        class346.method2107((byte) 106);
        class248.method1572(true);
        class277.method1736(15362);
        class98.field1442.method837(125);
        class99.field1445.method485();
        class135.field1843.method1420((byte) -104);
        class25.method155(-1);
        class248.field3570.method1969(false);
        class243.field3473.method1969(false);
        int var2 = 75 / ((arg0 - -21) / 62);
        class493.field7012.method1969(false);
        class630.field9253.method1969(false);
        class472.field6666.method1969(false);
        class282.field3952.method1969(false);
        class333.field4619.method1969(false);
        class511.field7275.method1969(false);
        class585.field8595.method1969(false);
        class582.field8550.method1969(false);
        class88.field1321.method1969(false);
        class634.field9289.method1969(false);
        class429.field5766.method1969(false);
        class647.field9401.method1969(false);
        class623.field9185.method1969(false);
        class38.field467.method1969(false);
        class392.field5396.method1969(false);
        class11.field110.method1969(false);
        class49.field572.method1969(false);
        class146.field2116.method1969(false);
        class195.field2890.method1969(false);
        class286.field3991.method1969(false);
        class252.field3643.method1969(false);
        class180.field2737.method1969(false);
        class310.field4271.method1969(false);
        class637.field9307.method1969(false);
        class366.field5043.method1969(false);
        client.field3636.method1969(false);
        class520.field7414.method1969(false);
        class481.field6843.method1969(false);
        class138.field1968.method1969(false);
        class96.field1410.method1969(false);
        class647.field9397.method837(126);
        class1.field1.method837(126);
        class333.field4607.method837(127);
        class398.field5471.method837(125);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BIII)I")
    public static final int method2782(byte arg0, int arg1, int arg2, int arg3) {
        ++field6496;
        if (arg1 == arg2) {
            return arg2;
        } else {
            int var4 = -arg3 + 128;
            if (arg0 != 84) {
                return -7;
            } else {
                int var5 = (arg2 & 127) * var4 - -((127 & arg1) * arg3) >> 7;
                int var6 = (arg1 & 896) * arg3 + (arg2 & 896) * var4 >> 7;
                int var7 = (arg1 & 64512) * arg3 + (64512 & arg2) * var4 >> 7;
                return 127 & var5 | 896 & var6 | var7 & 64512;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V")
    public final void method200(int arg0, int arg1, int arg2) {
        ++field6500;
        int var4 = 44 / ((arg0 - -41) / 57);
        if (!this.field6502.field5849) {
            int var5 = super.field7353.field6100 % 4000 * 16 / 4000;
            super.field7353.method2632(this.field6502.field5852[var5], 0);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        } else {
            float var6 = (float) (super.field7353.field6100 % 4000) / 4000.0F;
            super.field7353.method2632(this.field6502.field5850, 0);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var6, 0.0F, 0.0F, 1.0F);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZZ)V")
    public final void method195(boolean arg0, boolean arg1) {
        super.field7353.method2643(class533.field7939, -10304, class296.field4074);
        if (!arg1) {
            method2782((byte) -53, 6, -39, -20);
        }
        ++field6489;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(B)Z")
    public final boolean method201(byte arg0) {
        ++field6485;
        if (arg0 > -60) {
            return true;
        } else {
            return this.field6492 != null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lpb;II)V")
    public final void method202(class563 arg0, int arg1, int arg2) {
        ++field6488;
        if (arg2 != -1) {
            field6501 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(III)V")
    public static final void method2783(int arg0, int arg1, int arg2) {
        if (arg1 >= 110) {
            ++field6497;
            class221 var3 = class65.method413(6, arg2, (byte) -86);
            var3.method1426((byte) -127);
            var3.field3214 = arg0;
        }
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)[Lada;")
    public static final class144[] method2784(int arg0) {
        if (arg0 >= -52) {
            return null;
        } else {
            ++field6498;
            return new class144[] { class476.field6737, class424.field5735, class361.field4905, class316.field4349, class558.field8299, class532.field7935, class437.field5841, class556.field8279, class510.field7255, class473.field6688, class214.field3162, class93.field1396, class161.field2381, class52.field609, class64.field796, class86.field1235, class38.field461, class494.field7038, class11.field106, class221.field3207, class377.field5198, class291.field4030, class184.field2769, class153.field2309, class145.field2096, class477.field6766, class40.field480, class360.field4897, class6.field55, class593.field8767, class317.field4371, class3.field27, class389.field5372, class526.field7531, class158.field2349, class33.field400, class69.field877, class282.field3955, class587.field8648, class532.field7936, class300.field4115, class296.field4072, class24.field231, class96.field1407, class190.field2826, class587.field8693, class171.field2654, class596.field8819, class616.field9111, class51.field600, class415.field5637, class569.field8392, class19.field181, class83.field1195, class58.field736, class431.field5777, class505.field7146, class187.field2790, class537.field8009, class242.field3467, class230.field3366, class449.field6293, class64.field798, class144.field2010, class587.field8699, class415.field5633, class162.field2538, class435.field5822, class454.field6422, class192.field2851, class415.field5635, class528.field7894, class354.field4812, class611.field9061, class588.field8728, class366.field5042, class442.field5894, class289.field4017, class9.field102, class521.field7433, class604.field8996, class306.field4201, class426.field5740, class125.field1756, class266.field3788, class641.field9333, class403.field5512, class291.field4027, class32.field396, class490.field6979, class195.field2885, class312.field4310, class447.field6261, class212.field3118, class540.field8082, class626.field9222, class83.field1193, class344.field4743, class183.field2750, class115.field1621, class494.field7035, class374.field5177, class357.field4864, class320.field4419, class436.field5827, class423.field5706, class192.field2849, class424.field5737, class424.field5738, class69.field878, class170.field2649, class157.field2335, class159.field2367, class52.field611 };
        }
    }
}
