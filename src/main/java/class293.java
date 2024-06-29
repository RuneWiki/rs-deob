import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class293 extends class220 {

    @OriginalMember(owner = "client!k", name = "Y", descriptor = "I")
    private int field4249 = 0;

    @OriginalMember(owner = "client!k", name = "X", descriptor = "I")
    private int field4248 = 1;

    @OriginalMember(owner = "client!k", name = "V", descriptor = "I")
    private int field4246 = 0;

    @OriginalMember(owner = "client!k", name = "S", descriptor = "[[I")
    public static int[][] field4243 = new int[128][128];

    @OriginalMember(owner = "client!k", name = "T", descriptor = "I")
    public static int field4244 = -2;

    @OriginalMember(owner = "client!k", name = "U", descriptor = "I")
    public static int field4245 = -1;

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field4241 = "flash3:";

    @OriginalMember(owner = "client!k", name = "P", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!k", name = "R", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!k", name = "W", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!k", name = "Z", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!k", name = "ab", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(II)[I", line = 3)
    public final int[] method43(int arg0, int arg1) {
        if (arg0 != -11543) {
            this.method43(-102, 105);
        }
        ++field4251;
        int[] var3 = super.field3125.method2005(arg1, (byte) 89);
        if (super.field3125.field4676) {
            int var4 = class58.field831[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; class344.field5043 > var6; ++var6) {
                int var7 = class160.field2096[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (this.field4246 != 0) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (4096.0D * Math.sqrt((double) ((float) var9 / 4096.0F)));
                    var11 = (int) ((double) (this.field4248 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field4248;
                }
                int var12 = var11 - (var11 & -4096);
                if (~this.field4249 != -1) {
                    if (~this.field4249 == -3) {
                        var12 -= 2048;
                        if (var12 < 0) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class442.field6459[var12 >> 4 & 255] - -4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V", line = 72)
    public class293() {
        super(0, true);
    }

    @OriginalMember(owner = "client!k", name = "e", descriptor = "(I)V", line = 75)
    public static final void method1877(int arg0) {
        int var1 = 72 % ((arg0 - -53) / 36);
        ++field4240;
        class24 var2 = class51.field755;
        synchronized (class51.field755) {
            class51.field755.method212(-106);
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(Z)V", line = 90)
    public static void method1878(boolean arg0) {
        if (!arg0) {
            field4241 = null;
            field4243 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(II)V", line = 106)
    public static final void method1879(int arg0, int arg1) {
        ++field4247;
        class152 var2 = class126.field1672;
        synchronized (class126.field1672) {
            class295.field4256 = arg0;
            if (arg1 != 606422945) {
                method1878(true);
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(I)V", line = 128)
    public final void method440(int arg0) {
        ++field4250;
        class261.method1638(arg0);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IBLil;)V", line = 142)
    public final void method2(int arg0, byte arg1, class265 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -4) {
                    this.field4248 = arg2.method1697(arg1 + 149);
                }
            } else {
                this.field4249 = arg2.method1697(arg1 ^ -107);
            }
        } else {
            this.field4246 = arg2.method1697(-15);
        }
        if (arg1 != -49) {
            method1877(-55);
        }
        ++field4242;
    }
}
