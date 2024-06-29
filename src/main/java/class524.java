import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class524 extends class17 {

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "I")
    public static int field7706 = 1;

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "Lkn;")
    public static class530 field7705 = new class530("M", "M", "M", "M");

    @OriginalMember(owner = "client!pg", name = "F", descriptor = "I")
    public static int field7702;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "I")
    public static int field7703;

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "I")
    public static int field7704;

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "I")
    private int field7707;

    @OriginalMember(owner = "client!pg", name = "L", descriptor = "I")
    public static int field7708;

    @OriginalMember(owner = "client!pg", name = "M", descriptor = "I")
    public static int field7709;

    @OriginalMember(owner = "client!pg", name = "N", descriptor = "I")
    private int field7710;

    @OriginalMember(owner = "client!pg", name = "O", descriptor = "I")
    private int field7711;

    @OriginalMember(owner = "client!pg", name = "P", descriptor = "I")
    public static int field7712;

    @OriginalMember(owner = "client!pg", name = "Q", descriptor = "Loi;")
    public static class53 field7713;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)Lfp;")
    public static final class216 method3093(byte arg0) {
        ++field7709;
        if (class245.field3560 != null && class55.field702 != null) {
            class55.field702.method875((byte) -18, class245.field3560);
            class216 var1 = (class216) class55.field702.method876((byte) -75);
            if (arg0 != 13) {
                field7705 = null;
            }
            if (var1 == null) {
                return null;
            } else {
                class156 var2 = class245.field3553.method1316((byte) -68, var1.field3126);
                return var2 != null && var2.field2314 && var2.method1004(false, class245.field3548) ? var1 : class31.method190((byte) -111);
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
    public class524() {
        this(0);
    }

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "(I)V")
    public static void method3094(int arg0) {
        if (arg0 != 1) {
            method3093((byte) -35);
        }
        field7713 = null;
        field7705 = null;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(I)V")
    private class524(int arg0) {
        super(0, false);
        this.method3095((byte) -121, arg0);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)V")
    private final void method3095(byte arg0, int arg1) {
        this.field7707 = arg1 >> 12 & 4080;
        ++field7708;
        this.field7710 = (arg1 & 65280) >> 4;
        if (arg0 != -121) {
            this.field7711 = -19;
        }
        this.field7711 = (255 & arg1) << 4;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(B)V")
    public static final void method3096(byte arg0) {
        ++field7712;
        class302 var1 = null;
        try {
            class370 var2 = class268.field3914.method950(true, "2", 0);
            while (var2.field5277 == 0) {
                class52.method411(1L, (byte) 127);
            }
            if (~var2.field5277 == -2) {
                var1 = (class302) var2.field5274;
                class403 var3 = new class403(class455.field6393 * 6 + 3);
                var3.method2376((byte) 122, 1);
                var3.method2372(class455.field6393, arg0 + -226);
                for (int var4 = 0; var4 < class336.field4863.length; ++var4) {
                    if (class421.field5943[var4]) {
                        var3.method2372(var4, 93);
                        var3.method2354(class336.field4863[var4], false);
                    }
                }
                var1.method1845((byte) -103, 0, var3.field5665, var3.field5663);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method1844((byte) 83);
            }
        } catch (Exception var5) {
        }
        if (arg0 != 98) {
            method3094(74);
        }
        class125.field1690 = class465.method2699((byte) 14);
        class363.field5189 = false;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)Lrv;")
    public static final class73 method3097(int arg0, int arg1) {
        ++field7703;
        class73[] var2 = class273.method1719(114);
        int var3 = 0;
        if (arg0 != 12419) {
            method3093((byte) -27);
        }
        while (~var2.length < ~var3) {
            class73 var4 = var2[var3];
            if (var4.field895 == arg1) {
                return var4;
            }
            ++var3;
        }
        return null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)[[I")
    public final int[][] method89(int arg0, byte arg1) {
        ++field7702;
        int[][] var3 = super.field201.method1851(arg0, (byte) -56);
        if (super.field201.field4431) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class530.field7763; ++var7) {
                var4[var7] = this.field7707;
                var5[var7] = this.field7710;
                var6[var7] = this.field7711;
            }
        }
        if (arg1 != -25) {
            this.method3095((byte) 89, -53);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lwm;II)V")
    public final void method34(class403 arg0, int arg1, int arg2) {
        if (arg2 == 5159) {
            if (~arg1 == -1) {
                this.method3095((byte) -121, arg0.method2323((byte) 95));
            }
            ++field7704;
        }
    }
}
