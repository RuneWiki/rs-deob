import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class358 extends class125 {

    @OriginalMember(owner = "client!hs", name = "i", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!hs", name = "j", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!hs", name = "k", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!hs", name = "n", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(BI)V", line = 6)
    public final void method157(byte arg0, int arg1) {
        if (arg0 < -32) {
            ++field5274;
            super.field1732 = arg1;
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(Z)V", line = 17)
    public final void method156(boolean arg0) {
        if (arg0) {
            if (super.field1732 != 1 && super.field1732 != 0) {
                super.field1732 = this.method158((byte) -122);
            }
            ++field5270;
        }
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(ILgp;)V", line = 33)
    public class358(int arg0, class549 arg1) {
        super(arg1);
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lgp;)V", line = 36)
    public class358(class549 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZIILjava/lang/String;)V", line = 40)
    public static final void method2271(boolean arg0, int arg1, int arg2, String arg3) {
        ++field5272;
        class169.method1211(89);
        if (arg1 != arg2) {
            class543 var4 = null;
            if (arg3 != null) {
                var4 = class68.method612(0, false, 0, class481.field6877, class95.field1383, class621.field8832);
                var4.method1240(0);
                class502 var5 = class396.method2403(0, (byte) 79, class726.field10209, class555.field8066);
                class400 var6 = var4.method322(var5, class676.method3846(class603.field8548, class555.field8066, 0), true);
                class457.method2783((byte) 76);
                class343.method2105(var5, var4, var6, (byte) -14, true, arg3);
            }
            try {
                class211.field3164 = class68.method612(class243.field3580.field8017.method2498(false) * 2, false, arg1, class481.field6877, class95.field1383, class621.field8832);
                if (arg3 != null) {
                    var4.method1240(0);
                    class502 var7 = class396.method2403(0, (byte) 79, class726.field10209, class555.field8066);
                    class400 var8 = var4.method322(var7, class676.method3846(class603.field8548, class555.field8066, 0), true);
                    class457.method2783((byte) 76);
                    class343.method2105(var7, var4, var8, (byte) -14, true, arg3);
                }
                if (class211.field3164.method407()) {
                    boolean var9 = true;
                    try {
                        var9 = ~jagmisc.getTotalPhysicalMemory() < -268435457L;
                    } catch (Throwable var14) {
                    }
                    class254 var10;
                    if (!var9) {
                        var10 = class211.field3164.method205(104857600);
                    } else {
                        var10 = class211.field3164.method205(146800640);
                    }
                    class211.field3164.method393(var10);
                }
            } catch (Throwable var15) {
                arg1 = 0;
                class211.field3164 = class68.method612(0, false, 0, class481.field6877, class95.field1383, class621.field8832);
            }
            if (var4 != null) {
                try {
                    var4.method3266(1);
                } catch (Throwable var13) {
                }
            }
        } else {
            class211.field3164 = class68.method612(2 * class243.field3580.field8017.method2498(false), false, 0, class481.field6877, class95.field1383, class621.field8832);
            if (arg3 != null) {
                class211.field3164.method1240(0);
                class502 var11 = class396.method2403(0, (byte) 79, class726.field10209, class555.field8066);
                class400 var12 = class211.field3164.method322(var11, class676.method3846(class603.field8548, class555.field8066, 0), true);
                class457.method2783((byte) 76);
                class343.method2105(var11, class211.field3164, var12, (byte) -14, true, arg3);
            }
        }
        class243.field3580.field7975.method3772(arg2 + 1, !arg0);
        class243.field3580.method3301(arg1, 24, class243.field3580.field7975);
        class530.method3215(true);
        class211.field3164.method379(10000);
        class211.field3164.method369(32);
        class182.field2510 = class211.field3164.method348();
        class569.field8215 = class211.field3164.method348();
        class200.method1418(true);
        class211.field3164.method274(~class243.field3580.field7985.method1475(false) == -2);
        if (class211.field3164.method395()) {
            class202.method1436(arg2 + -96, class243.field3580.field8011.method2959(false) == 1);
        }
        class349.method2228(class211.field3164, (byte) -103, class240.field3555 >> 3, class184.field2546 >> 3);
        class728.method4065(arg2 ^ -1386);
        class350.field5202 = null;
        class567.field8205 = true;
        class713.field10057 = false;
        class50.method468(-127);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)I", line = 149)
    public final int method158(byte arg0) {
        int var2 = 123 / ((-63 - arg0) / 49);
        ++field5273;
        return 1;
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(Z)I", line = 159)
    public final int method2272(boolean arg0) {
        if (arg0) {
            return -71;
        } else {
            ++field5271;
            return super.field1732;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZI)I", line = 171)
    public final int method155(boolean arg0, int arg1) {
        ++field5275;
        if (!arg0) {
            this.method158((byte) -25);
        }
        return 1;
    }
}
