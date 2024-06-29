import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class372 extends class202 {

    @OriginalMember(owner = "client!wf", name = "K", descriptor = "I")
    private int field5708 = 1;

    @OriginalMember(owner = "client!wf", name = "M", descriptor = "I")
    private int field5710 = 204;

    @OriginalMember(owner = "client!wf", name = "O", descriptor = "I")
    private int field5712 = 1;

    @OriginalMember(owner = "client!wf", name = "Q", descriptor = "[I")
    public static int[] field5714 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!wf", name = "N", descriptor = "Lss;")
    public static class213 field5711 = new class213("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!wf", name = "T", descriptor = "I")
    public static int field5717 = -1;

    @OriginalMember(owner = "client!wf", name = "U", descriptor = "Z")
    public static volatile boolean field5718 = true;

    @OriginalMember(owner = "client!wf", name = "V", descriptor = "Ljava/lang/String;")
    public static String field5719 = "";

    @OriginalMember(owner = "client!wf", name = "W", descriptor = "J")
    public static long field5720 = -1L;

    @OriginalMember(owner = "client!wf", name = "I", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!wf", name = "L", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!wf", name = "P", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!wf", name = "R", descriptor = "I")
    public static int field5715;

    @OriginalMember(owner = "client!wf", name = "S", descriptor = "I")
    public static int field5716;

    @OriginalMember(owner = "client!wf", name = "X", descriptor = "Ljl;")
    public static class495 field5721;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "(I)V")
    public static void method2418(int arg0) {
        field5711 = null;
        if (arg0 == 26061) {
            field5721 = null;
            field5714 = null;
            field5719 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2419(int arg0, String arg1) {
        if (arg0 <= 54) {
            field5719 = null;
        }
        ++field5715;
        if (class183.field2658 != null) {
            class81.method578((byte) 66, class164.field2371);
            ++class502.field7531;
            class170.field2488.method1479((byte) -121, class147.method896(arg1, (byte) -99));
            class170.field2488.method1458(arg1, (byte) 78);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZILkj;)V")
    public static final void method2420(boolean arg0, int arg1, class55 arg2) {
        ++field5713;
        int var3 = -1;
        int var4 = 0;
        if (~arg2.field796 >= ~class88.field1278) {
            if (class88.field1278 > arg2.field846) {
                class443.method2804(arg2, false, (byte) 121);
                var4 = class438.field6804;
                var3 = class540.field7894;
            } else {
                class299.method2001((byte) -120, arg2);
            }
        } else {
            class319.method2140(arg2, -24689);
        }
        if (arg2.field6417 < 128 || arg2.field6410 < 128 || class135.field1839 * 128 + -128 <= arg2.field6417 || ~(class197.field3038 * 128 - 128) >= ~arg2.field6410) {
            arg2.field840 = -1;
            arg2.field796 = 0;
            arg2.field846 = 0;
            var3 = -1;
            arg2.field800 = -1;
            var4 = 0;
            arg2.field844 = -1;
            arg2.field6417 = arg2.field894[0] * 128 + arg2.method415(-4) * 64;
            arg2.field6410 = arg2.field899[0] * 128 + arg2.method415(-4) * 64;
            arg2.method419(0);
        }
        if (class358.field5565 == arg2 && (arg2.field6417 < 1536 || ~arg2.field6410 > -1537 || ~((class135.field1839 + -12) * 128) >= ~arg2.field6417 || arg2.field6410 >= class197.field3038 * 128 - 1536)) {
            arg2.field840 = -1;
            arg2.field844 = -1;
            arg2.field796 = 0;
            arg2.field800 = -1;
            var3 = -1;
            arg2.field846 = 0;
            var4 = 0;
            arg2.field6417 = arg2.field894[0] * 128 - -(arg2.method415(-4) * 64);
            arg2.field6410 = arg2.field899[0] * 128 - -(64 * arg2.method415(-4));
            arg2.method419(0);
        }
        if (!arg0) {
            int var5 = class113.method726(arg2, 32768);
            class315.method2108((byte) 2, var4, var3, arg2, var5);
            class328.method2194((byte) -68, arg2);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZ)[I")
    public final int[] method41(int arg0, boolean arg1) {
        ++field5709;
        int[] var3 = super.field3064.method2452((byte) 64, arg0);
        if (!arg1) {
            method2418(-59);
        }
        if (super.field3064.field5837) {
            for (int var4 = 0; class276.field4375 > var4; ++var4) {
                int var5 = class476.field7271[var4];
                int var6 = class521.field7716[arg0];
                int var7 = this.field5708 * var5 >> 12;
                int var8 = this.field5712 * var6 >> 12;
                int var9 = var5 % (4096 / this.field5708) * this.field5708;
                int var10 = var6 % (4096 / this.field5712) * this.field5712;
                if (var10 < this.field5710) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field5710 > var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field5710) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "(I)Z")
    public static final boolean method2421(int arg0) {
        if (arg0 > -60) {
            return true;
        } else {
            ++field5706;
            return class168.field2448;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIII)V")
    public static final void method2422(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 78 / ((arg2 - 23) / 54);
        ++field5707;
        if (~class141.field1911.field6109 != -1 && ~arg1 != -1 && class486.field7371 < 50 && ~arg3 != 0) {
            class357.field5540[class486.field7371++] = new class17((byte) 1, arg3, arg1, arg4, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        int var4 = -61 / ((-46 - arg1) / 50);
        ++field5716;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field5710 = arg0.method1455(-3387);
                }
            } else {
                this.field5712 = arg0.method1445(-107);
            }
        } else {
            this.field5708 = arg0.method1445(47);
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
    public class372() {
        super(0, true);
    }
}
