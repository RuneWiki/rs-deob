import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class374 extends class336 implements class345 {

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
    private int field5186;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "[Lla;")
    public static class456[] field5189 = new class456[14];

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
    public static int field5188;

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "[I")
    public static int[] field5194;

    static {
        new class235("", 73);
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lrda;ILjaclib/memory/Buffer;IZ)V", line = 4)
    public class374(class663 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field5186 = arg1;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BII[B)V", line = 12)
    public final void method2063(byte arg0, int arg1, int arg2, byte[] arg3) {
        this.method2024(arg1, arg3, 0);
        ++field5185;
        if (arg0 != 77) {
            field5193 = 97;
        }
        this.field5186 = arg2;
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V", line = 24)
    public static void method2188(int arg0) {
        field5189 = null;
        field5194 = null;
        int var1 = -77 % ((11 - arg0) / 37);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)Z", line = 36)
    public static final boolean method2189(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            return true;
        } else {
            ++field5188;
            return (arg1 & 2048) != 0;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)I", line = 52)
    public final int method2064(byte arg0) {
        ++field5191;
        int var2 = -57 % ((arg0 - 61) / 42);
        return super.field4759;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lrda;I[BIZ)V", line = 64)
    public class374(class663 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field5186 = arg1;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)V", line = 72)
    public final void method680(byte arg0) {
        int var2 = -9 / ((-2 - arg0) / 59);
        super.field4771.method3592(-4593, this);
        ++field5190;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)J", line = 83)
    public final long method2066(int arg0) {
        ++field5187;
        if (arg0 != 9889) {
            this.field5186 = -92;
        }
        return 0L;
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(B)I", line = 94)
    public static final int method2190(byte arg0) {
        if (arg0 <= 21) {
            field5189 = null;
        }
        ++field5192;
        boolean var1 = false;
        boolean var2 = false;
        boolean var3 = false;
        if (class66.field828.field2892 && !class66.field828.field2900) {
            var1 = true;
            if (~class136.field2170.field8620 > -513 && class136.field2170.field8620 != 0) {
                var1 = false;
            }
            if (!class192.field2897.startsWith("win")) {
                var2 = true;
            } else {
                var3 = true;
                var2 = true;
            }
        }
        if (class672.field9323) {
            var2 = false;
        }
        if (class314.field4493) {
            var1 = false;
        }
        if (class676.field9388) {
            var3 = false;
        }
        if (!var1 && !var2 && !var3) {
            return class461.method2620((byte) 62);
        } else {
            int var4 = -1;
            int var5 = -1;
            if (var1) {
                try {
                    var4 = class35.method289(2, true, 1000);
                } catch (Exception var15) {
                }
            }
            int var6 = -1;
            if (var3) {
                try {
                    var6 = class35.method289(3, true, 1000);
                    if (class411.field5711.field3913.method3282(true) == 3) {
                        class240 var7 = class341.field4807.method397();
                        long var8 = var7.field3382 & 281474976710655L;
                        int var10 = var7.field3378;
                        if (~var10 != -4319) {
                            if (~var10 == -4099) {
                                var2 &= ~var8 <= -60129613780L;
                            }
                        } else {
                            var2 &= var8 >= 64425238954L;
                        }
                    }
                } catch (Exception var14) {
                }
            }
            if (var2) {
                try {
                    var5 = class35.method289(1, true, 1000);
                } catch (Exception var13) {
                }
            }
            if (var4 == -1 && ~var5 == 0 && var6 == -1) {
                return class461.method2620((byte) 62);
            } else {
                int var11 = (int) ((float) var5 * 1.1F);
                int var12 = (int) ((float) var6 * 1.1F);
                if (~var12 > ~var4 && ~var11 > ~var4) {
                    return class404.method2374(0, var4);
                } else {
                    return ~var12 >= ~var11 ? class536.method2976(var11, 1, (byte) 103) : class536.method2976(var12, 3, (byte) 101);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)I", line = 265)
    public final int method2065(int arg0) {
        ++field5184;
        if (arg0 != 26249) {
            field5189 = null;
        }
        return this.field5186;
    }
}
