import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class698 extends class38 {

    @OriginalMember(owner = "client!sfa", name = "M", descriptor = "I")
    private int field9630 = 0;

    @OriginalMember(owner = "client!sfa", name = "L", descriptor = "I")
    private int field9629 = 10;

    @OriginalMember(owner = "client!sfa", name = "Q", descriptor = "I")
    private int field9634 = 2048;

    @OriginalMember(owner = "client!sfa", name = "H", descriptor = "[Z")
    public static boolean[] field9625 = new boolean[8];

    @OriginalMember(owner = "client!sfa", name = "F", descriptor = "F")
    public static float field9624;

    @OriginalMember(owner = "client!sfa", name = "D", descriptor = "I")
    public static int field9622;

    @OriginalMember(owner = "client!sfa", name = "I", descriptor = "I")
    public static int field9626;

    @OriginalMember(owner = "client!sfa", name = "J", descriptor = "I")
    public static int field9627;

    @OriginalMember(owner = "client!sfa", name = "K", descriptor = "I")
    public static int field9628;

    @OriginalMember(owner = "client!sfa", name = "O", descriptor = "I")
    public static int field9632;

    @OriginalMember(owner = "client!sfa", name = "P", descriptor = "I")
    public static int field9633;

    @OriginalMember(owner = "client!sfa", name = "E", descriptor = "[I")
    private int[] field9623;

    @OriginalMember(owner = "client!sfa", name = "N", descriptor = "[I")
    private int[] field9631;

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(BI)[I", line = 11)
    public final int[] method199(byte arg0, int arg1) {
        if (arg0 > -43) {
            this.field9634 = 63;
        }
        ++field9626;
        int[] var3 = super.field397.method1376(arg1, (byte) 120);
        if (super.field397.field3005) {
            int var4 = class136.field1816[arg1];
            if (~this.field9630 != -1) {
                for (int var5 = 0; var5 < class729.field10216; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class255.field3666[var5];
                    int var9 = this.field9630;
                    if (var9 != 1) {
                        if (var9 != 2) {
                            if (var9 == 3) {
                                var6 = (-var4 + var8 >> 1) + 2048;
                            }
                        } else {
                            var6 = (var4 - (4096 - var8) >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; this.field9629 > var10; ++var10) {
                        if (var6 >= this.field9631[var10] && ~this.field9631[var10 + 1] < ~var6) {
                            if (~this.field9623[var10] < ~var6) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; this.field9629 > var12; ++var12) {
                    if (var4 >= this.field9631[var12] && ~var4 > ~this.field9631[var12 - -1]) {
                        if (~this.field9623[var12] < ~var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class319.method2021(var3, 0, class729.field10216, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sfa", name = "f", descriptor = "(B)V", line = 127)
    public static final void method3962(byte arg0) {
        ++field9627;
        class110.method825(false);
        class304.field4314 = null;
        if (arg0 == -15) {
            class183.field2805 = null;
            class396.field5947 = null;
            class729.field10214 = null;
            class633.field8865 = null;
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(B)V", line = 144)
    public final void method191(byte arg0) {
        ++field9632;
        if (arg0 > 120) {
            this.method3965(1000);
        }
    }

    @OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "()V", line = 158)
    public class698() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IILrg;)V", line = 161)
    public final void method190(int arg0, int arg1, class645 arg2) {
        ++field9633;
        if (arg0 < 34) {
            this.field9634 = 23;
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field9630 = arg2.method3745(-6314);
                }
            } else {
                this.field9634 = arg2.method3712((byte) 3);
            }
        } else {
            this.field9629 = arg2.method3745(-6314);
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Z)I", line = 208)
    public static final int method3963(boolean arg0) {
        ++field9622;
        if (!arg0) {
            return 120;
        } else {
            byte var1;
            if (~class265.field3794 > -97) {
                var1 = 1;
                class645.method3699(true, !arg0);
            } else {
                int var2 = class341.method2171((byte) -52);
                if (~var2 < -101) {
                    if (var2 > 500) {
                        if (var2 <= 1000) {
                            var1 = 2;
                            class242.method1608(0);
                        } else {
                            class645.method3699(true, false);
                            var1 = 1;
                        }
                    } else {
                        class505.method2999(0);
                        var1 = 3;
                    }
                } else {
                    var1 = 4;
                    class647.method3761(-28280);
                }
            }
            if (~class63.field916.field10200.method3848(17503) != -1) {
                class63.field916.method4111(109, 0, class63.field916.field10177);
                class134.method950(0, 0, false);
            }
            class585.method3384(118);
            return var1;
        }
    }

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "(Z)V", line = 269)
    public static void method3964(boolean arg0) {
        field9625 = null;
        if (arg0) {
            field9625 = null;
        }
    }

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "(I)V", line = 279)
    private final void method3965(int arg0) {
        ++field9628;
        this.field9623 = new int[this.field9629 - -1];
        int var2 = 0;
        this.field9631 = new int[this.field9629 + 1];
        int var3 = 4096 / this.field9629;
        if (arg0 != 1000) {
            this.method191((byte) -2);
        }
        int var4 = this.field9634 * var3 >> 12;
        for (int var5 = 0; this.field9629 > var5; ++var5) {
            this.field9631[var5] = var2;
            this.field9623[var5] = var2 + var4;
            var2 += var3;
        }
        this.field9631[this.field9629] = 4096;
        this.field9623[this.field9629] = this.field9623[0] + 4096;
    }
}
