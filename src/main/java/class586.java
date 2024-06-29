import jagex3.jagmisc.jagmisc;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class586 extends class516 {

    @OriginalMember(owner = "client!ar", name = "n", descriptor = "F")
    private float field8600 = 0.0F;

    @OriginalMember(owner = "client!ar", name = "m", descriptor = "Ljq;")
    private class438 field8599;

    @OriginalMember(owner = "client!ar", name = "w", descriptor = "Llt;")
    public static class581 field8609 = new class581("WIP", 2);

    @OriginalMember(owner = "client!ar", name = "x", descriptor = "[I")
    public static int[] field8610 = new int[13];

    @OriginalMember(owner = "client!ar", name = "k", descriptor = "I")
    public static int field8597;

    @OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
    public static int field8598;

    @OriginalMember(owner = "client!ar", name = "o", descriptor = "I")
    public static int field8601;

    @OriginalMember(owner = "client!ar", name = "p", descriptor = "I")
    public static int field8602;

    @OriginalMember(owner = "client!ar", name = "q", descriptor = "I")
    public static int field8603;

    @OriginalMember(owner = "client!ar", name = "r", descriptor = "I")
    public static int field8604;

    @OriginalMember(owner = "client!ar", name = "s", descriptor = "I")
    public static int field8605;

    @OriginalMember(owner = "client!ar", name = "t", descriptor = "I")
    public static int field8606;

    @OriginalMember(owner = "client!ar", name = "u", descriptor = "I")
    public static int field8607;

    @OriginalMember(owner = "client!ar", name = "v", descriptor = "I")
    public static int field8608;

    @OriginalMember(owner = "client!ar", name = "y", descriptor = "I")
    public static int field8611;

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "(B)V")
    public static void method3483(byte arg0) {
        field8609 = null;
        int var1 = 87 % ((arg0 - -57) / 52);
        field8610 = null;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILlp;ILjava/lang/String;)Lqo;")
    public static final class21 method3484(int arg0, class331 arg1, int arg2, String arg3) {
        ++field8602;
        if (arg2 != 0) {
            return null;
        } else if (~arg0 == -1) {
            return arg1.method2016(arg3, 118);
        } else if (~arg0 == -2) {
            try {
                class640.method3701("openjs", new Object[] { (new URL(arg1.field4568.getCodeBase(), arg3)).toString() }, arg1.field4568, (byte) 2);
                class21 var4 = new class21();
                var4.field202 = 1;
                return var4;
            } catch (Throwable var10) {
                class21 var5 = new class21();
                var5.field202 = 2;
                return var5;
            }
        } else if (~arg0 == -3) {
            try {
                arg1.field4568.getAppletContext().showDocument(new URL(arg1.field4568.getCodeBase(), arg3), "_blank");
                class21 var6 = new class21();
                var6.field202 = 1;
                return var6;
            } catch (Exception var11) {
                class21 var7 = new class21();
                var7.field202 = 2;
                return var7;
            }
        } else if (arg0 == 3) {
            try {
                class640.method3702(arg1.field4568, (byte) 124, "loggedout");
            } catch (Throwable var13) {
            }
            try {
                arg1.field4568.getAppletContext().showDocument(new URL(arg1.field4568.getCodeBase(), arg3), "_top");
                class21 var8 = new class21();
                var8.field202 = 1;
                return var8;
            } catch (Exception var12) {
                class21 var9 = new class21();
                var9.field202 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIZ)I")
    public static final int method3485(int arg0, int arg1, int arg2, boolean arg3) {
        ++field8605;
        class38 var4 = class487.method2920(arg3, 13993, arg2);
        if (var4 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var5 = 0;
            int var6 = 71 / ((arg1 - -72) / 48);
            for (int var7 = 0; ~var7 > ~var4.field465.length; ++var7) {
                if (var4.field466[var7] == arg0) {
                    var5 += var4.field465[var7];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Z)V")
    public final void method197(boolean arg0) {
        if (arg0) {
            method3487((class162) null, 82, -79, -59);
        }
        ++field8607;
        super.field7353.method2646(1, 127);
        super.field7353.method2643(class132.field1816, -10304, class132.field1816);
        super.field7353.method2598(class453.field6405, 0, (byte) 59);
        super.field7353.method2655(0, -43, class453.field6405);
        super.field7353.method2567(1, 0);
        super.field7353.method2632((class563) null, 0);
        super.field7353.method2646(0, 113);
        super.field7353.method2655(0, -38, class453.field6405);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZBI)V")
    public static final void method3486(boolean arg0, byte arg1, int arg2) {
        ++field8601;
        if (arg2 != 0) {
            if (arg0) {
                class99.field1445 = class208.method1382(class87.field1282, false, 0, 0, class96.field1410, class79.field1069);
                class99.field1445.method421(0);
                class352 var3 = class26.method166(0, class647.field9401, class38.field464, 1499);
                class92 var4 = class99.field1445.method492(var3, class126.method889(class585.field8595, class38.field464, 0), true);
                class438.method2554(class459.field6493.method3408(102, class63.field795), true, (byte) -26, var4);
                class286.method1779(-126);
                class99.field1445.method1372(4);
            }
            try {
                class99.field1445 = class208.method1382(class87.field1282, false, class56.field668.field6831 * 2, arg2, class96.field1410, class79.field1069);
                if (class99.field1445.method437()) {
                    boolean var5 = true;
                    try {
                        var5 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var8) {
                    }
                    class65 var6;
                    if (var5) {
                        var6 = class99.field1445.method455(146800640);
                    } else {
                        var6 = class99.field1445.method455(104857600);
                    }
                    class99.field1445.method448(var6);
                }
            } catch (Throwable var9) {
                class99.field1445 = class208.method1382(class87.field1282, false, 0, 0, class96.field1410, class79.field1069);
                arg2 = 0;
            }
        } else {
            class99.field1445 = class208.method1382(class87.field1282, false, class56.field668.field6831 * 2, 0, class96.field1410, class79.field1069);
        }
        class526.field7533 = arg2;
        class25.method155(-1);
        if (!class99.field1445.method434()) {
            class238.field3433 = 1;
        }
        class99.field1445.method502(class238.field3433);
        class99.field1445.method459(0);
        class99.field1445.method463(8);
        class259.field3707 = class99.field1445.method522();
        class106.field1520 = class99.field1445.method522();
        class238.method1523(50);
        class99.field1445.method495(!class56.field668.field6835);
        if (class99.field1445.method530()) {
            class631.method3674((byte) -24, class56.field668.field6867);
        }
        int var7 = -61 / ((arg1 - 3) / 54);
        class197.method1326(class99.field1445, class410.field5609 >> 3, 2, class146.field2125 >> 3);
        class232.method1489(8);
        class508.field7214 = false;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZZ)V")
    public final void method195(boolean arg0, boolean arg1) {
        super.field7353.method2643(class296.field4074, -10304, class132.field1816);
        ++field8604;
        if (!arg1) {
            field8610 = null;
        }
    }

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "(I)V")
    public final void method1196(int arg0) {
        if (arg0 != -3385) {
            field8609 = null;
        }
        ++field8608;
        if (~super.field7353.method2611((byte) -118) == -1) {
            class57 var2 = super.field7353.method2600(arg0 + 3385);
            super.field7353.method2646(1, 110);
            class57 var3 = super.field7353.method2653((byte) -110);
            var3.method337(var2);
            var3.method373(0.125F, 16383, 0.125F, 1.0F);
            var3.method366(0.0F, this.field8600, 0.0F, -6701);
            super.field7353.method2623(112, class408.field5564);
            super.field7353.method2646(0, 112);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lpb;II)V")
    public final void method202(class563 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            this.method201((byte) 30);
        }
        super.field7353.method2632(arg0, 0);
        ++field8611;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(III)V")
    public final void method200(int arg0, int arg1, int arg2) {
        super.field7353.method2646(1, 106);
        ++field8606;
        if (~(arg1 & 128) != -1) {
            super.field7353.method2632((class563) null, 0);
        } else if ((arg2 & 1) == 1) {
            if (!this.field8599.field5849) {
                int var4 = super.field7353.field6100 % 4000 * 16 / 4000;
                super.field7353.method2632(this.field8599.field5852[var4], 0);
            } else {
                this.field8600 = (float) (super.field7353.field6100 % 4000) / 4000.0F;
                super.field7353.method2632(this.field8599.field5850, 0);
            }
        } else if (!this.field8599.field5849) {
            super.field7353.method2632(this.field8599.field5852[0], 0);
        } else {
            super.field7353.method2632(this.field8599.field5850, 0);
        }
        int var5 = -47 / ((arg0 - -41) / 57);
        super.field7353.method2646(0, 126);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lvp;III)V")
    public static final void method3487(class162 arg0, int arg1, int arg2, int arg3) {
        class270.field3826 = arg0;
        class420.field5687 = arg2;
        class104.field1507 = arg3;
        ++field8598;
        if (arg1 != -1556679837) {
            method3484(46, (class331) null, -62, (String) null);
        }
    }

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "(B)Z")
    public final boolean method201(byte arg0) {
        if (arg0 > -60) {
            this.field8599 = null;
        }
        ++field8597;
        return this.field8599.method2555(true);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(BZ)V")
    public final void method199(byte arg0, boolean arg1) {
        ++field8603;
        super.field7353.method2646(1, 124);
        super.field7353.method2643(class296.field4074, -10304, class533.field7939);
        super.field7353.method2612(true, 0, (byte) 64, false, class453.field6405);
        super.field7353.method2655(0, -38, class645.field9388);
        int var3 = -68 / ((arg0 - 63) / 38);
        super.field7353.method2567(0, 0);
        super.field7353.method2646(0, 126);
        super.field7353.method2688(-16777216, 28366);
        super.field7353.method2655(0, -76, class314.field4331);
        this.method1196(-3385);
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lcb;Ljq;)V")
    public class586(class444 arg0, class438 arg1) {
        super(arg0);
        this.field8599 = arg1;
    }
}
