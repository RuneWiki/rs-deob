import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class210 {

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "F")
    public float field2768 = 1.0F;

    @OriginalMember(owner = "client!rea", name = "t", descriptor = "F")
    public float field2786 = 1.0F;

    @OriginalMember(owner = "client!rea", name = "s", descriptor = "F")
    public float field2785 = 0.25F;

    @OriginalMember(owner = "client!rea", name = "k", descriptor = "I")
    public int field2777;

    @OriginalMember(owner = "client!rea", name = "m", descriptor = "Lmda;")
    public class267 field2779;

    @OriginalMember(owner = "client!rea", name = "d", descriptor = "I")
    public int field2770;

    @OriginalMember(owner = "client!rea", name = "j", descriptor = "I")
    public int field2776;

    @OriginalMember(owner = "client!rea", name = "h", descriptor = "F")
    public float field2774;

    @OriginalMember(owner = "client!rea", name = "o", descriptor = "I")
    public int field2781;

    @OriginalMember(owner = "client!rea", name = "c", descriptor = "I")
    public int field2769;

    @OriginalMember(owner = "client!rea", name = "e", descriptor = "F")
    public float field2771;

    @OriginalMember(owner = "client!rea", name = "l", descriptor = "I")
    public int field2778;

    @OriginalMember(owner = "client!rea", name = "q", descriptor = "F")
    public float field2783;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!rea", name = "f", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!rea", name = "g", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!rea", name = "i", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!rea", name = "n", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!rea", name = "r", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!rea", name = "p", descriptor = "Lnd;")
    public static class547 field2782;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(BILria;)Ljava/lang/String;", line = 3)
    public static final String method1348(byte arg0, int arg1, class288 arg2) {
        field2767++;
        if (arg0 != 9) {
            method1349(-103);
        }
        if (!client.method1833(arg2).method1570(arg1, 0) && arg2.field3695 == null) {
            return null;
        } else if (arg2.field3669 == null || arg2.field3669.length <= arg1 || arg2.field3669[arg1] == null || arg2.field3669[arg1].trim().length() == 0) {
            return class711.field9869 ? "Hidden-" + arg1 : null;
        } else {
            return arg2.field3669[arg1];
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(I)V", line = 36)
    public static final void method1349(int arg0) {
        class164.field2272 = null;
        if (arg0 != -1) {
            method1352(-34, 101, (byte) -55);
        }
        class468.field6279 = null;
        class178.field2496 = null;
        class212.field2797 = null;
        class7.field81 = null;
        class745.field10382 = null;
        class154.field2100 = null;
        class258.field3274 = null;
        field2773++;
        class242.field3132 = null;
        class84.field1145 = null;
        class680.field9496 = null;
        class731.field10170 = null;
        class372.field4774 = null;
        class290.field3811 = null;
        class537.field7461 = null;
        class721.field10039 = null;
        class761.field10616 = null;
        class537.field7454 = null;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(B)V", line = 64)
    public static void method1350(byte arg0) {
        field2782 = null;
        int var1 = -112 % ((arg0 + 13) / 46);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(ILria;Lria;)V", line = 73)
    public static final void method1351(int arg0, class288 arg1, class288 arg2) {
        field2784++;
        class657.field9152++;
        class589 var3 = class514.method2994(-29488, class760.field10605, class445.field5925);
        var3.field8251.method2568(arg2.field3696, -535701016);
        var3.field8251.method2611(arg1.field3740, (byte) -37);
        var3.field8251.method2608(arg1.field3696, (byte) 103);
        var3.field8251.method2620(arg1.field3700, false);
        var3.field8251.method2624(-128, arg2.field3700);
        var3.field8251.method2630(arg0 - 53, arg2.field3740);
        if (arg0 != 16) {
            field2782 = null;
        }
        class737.method4107(var3, 7);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIB)Z", line = 100)
    public static final boolean method1352(int arg0, int arg1, byte arg2) {
        if (arg2 < 20) {
            return false;
        } else {
            field2772++;
            return (arg0 & 0x34) != 0;
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(ILsl;)V", line = 113)
    public final void method1353(int arg0, class461 arg1) {
        this.field2786 = (float) (arg0 * arg1.method2600((byte) -124)) / 255.0F;
        field2780++;
        this.field2785 = (float) (arg1.method2600((byte) -127) * 8) / 255.0F;
        this.field2768 = (float) (arg1.method2600((byte) -124) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(Lrea;Z)Z", line = 125)
    public final boolean method1354(class210 arg0, boolean arg1) {
        field2775++;
        if (arg1) {
            return false;
        } else {
            return this.field2769 == arg0.field2769 && this.field2774 == arg0.field2774 && this.field2783 == arg0.field2783 && this.field2771 == arg0.field2771 && this.field2785 == arg0.field2785 && this.field2786 == arg0.field2786 && this.field2768 == arg0.field2768 && this.field2776 == arg0.field2776 && this.field2781 == arg0.field2781 && this.field2779 == arg0.field2779;
        }
    }

    @OriginalMember(owner = "client!rea", name = "<init>", descriptor = "()V", line = 149)
    public class210() {
        this.field2777 = -60;
        this.field2779 = class196.field2676;
        this.field2770 = -50;
        this.field2776 = class432.field5768;
        this.field2774 = 1.1523438F;
        this.field2781 = 0;
        this.field2769 = class605.field8416;
        this.field2771 = 1.2F;
        this.field2778 = -50;
        this.field2783 = 0.69921875F;
    }

    @OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(Lsl;)V", line = 165)
    public class210(class461 arg0) {
        int var2 = arg0.method2600((byte) -126);
        if (class748.field10451.field10427.method4196((byte) -64) == 1 && class739.field10303.method436() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field2769 = class605.field8416;
            } else {
                this.field2769 = arg0.method2622(-539564808);
            }
            if ((var2 & 0x2) == 0) {
                this.field2774 = 1.1523438F;
            } else {
                this.field2774 = (float) arg0.method2566(-2) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field2783 = 0.69921875F;
            } else {
                this.field2783 = (float) arg0.method2566(-2) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field2771 = 1.2F;
            } else {
                this.field2771 = (float) arg0.method2566(-2) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method2622(-539564808);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method2566(-2);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method2566(-2);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method2566(-2);
            }
            this.field2783 = 0.69921875F;
            this.field2769 = class605.field8416;
            this.field2774 = 1.1523438F;
            this.field2771 = 1.2F;
        }
        if ((var2 & 0x10) == 0) {
            this.field2770 = -50;
            this.field2778 = -50;
            this.field2777 = -60;
        } else {
            this.field2778 = arg0.method2577(2);
            this.field2777 = arg0.method2577(2);
            this.field2770 = arg0.method2577(2);
        }
        if ((var2 & 0x20) == 0) {
            this.field2776 = class432.field5768;
        } else {
            this.field2776 = arg0.method2622(-539564808);
        }
        if ((var2 & 0x40) == 0) {
            this.field2781 = 0;
        } else {
            this.field2781 = arg0.method2566(-2);
        }
        if ((var2 & 0x80) == 0) {
            this.field2779 = class196.field2676;
        } else {
            int var3 = arg0.method2566(-2);
            int var4 = arg0.method2566(-2);
            int var5 = arg0.method2566(-2);
            int var6 = arg0.method2566(-2);
            int var7 = arg0.method2566(-2);
            int var8 = arg0.method2566(-2);
            this.field2779 = class117.method909(var7, (byte) -28, var5, var3, var6, var8, var4);
        }
    }
}
