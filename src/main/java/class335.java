import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class335 extends class371 {

    @OriginalMember(owner = "client!sc", name = "P", descriptor = "I")
    private int field4927 = -1;

    @OriginalMember(owner = "client!sc", name = "I", descriptor = "I")
    public int field4921;

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "I")
    public int field4926;

    @OriginalMember(owner = "client!sc", name = "R", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!sc", name = "T", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!sc", name = "V", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!sc", name = "Q", descriptor = "[I")
    public int[] field4928;

    @OriginalMember(owner = "client!sc", name = "U", descriptor = "[S")
    public static short[] field4931;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "(I)V", line = 5)
    public static void method2091(int arg0) {
        if (arg0 != -19113) {
            method2091(127);
        }
        field4931 = null;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)Z", line = 15)
    public final boolean method2092(byte arg0) {
        ++field4930;
        if (arg0 < 86) {
            return true;
        } else if (this.field4928 != null) {
            return true;
        } else if (this.field4927 >= 0) {
            class610 var2 = class626.field9176 < 0 ? class610.method3552(class158.field2105, this.field4927) : class610.method3555(class158.field2105, class626.field9176, this.field4927);
            var2.method3553();
            this.field4928 = var2.method3548();
            this.field4921 = var2.field8972;
            this.field4926 = var2.field8975;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(Z)I", line = 41)
    public final int method2093(boolean arg0) {
        ++field4929;
        if (arg0) {
            this.method81(-75, (byte) -89, (class428) null);
        }
        return this.field4927;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)[[I", line = 52)
    public int[][] method78(byte arg0, int arg1) {
        ++field4924;
        int[][] var3 = super.field5364.method3064(1, arg1);
        if (super.field5364.field7632 && this.method2092((byte) 99)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field4926 * (~class23.field201 == ~this.field4921 ? arg1 : this.field4921 * arg1 / class23.field201);
            if (class41.field455 == this.field4926) {
                for (int var8 = 0; var8 < class41.field455; ++var8) {
                    int var9 = this.field4928[var7++];
                    var6[var8] = class637.method3693(255, var9) << 4;
                    var5[var8] = class637.method3693(var9 >> 4, 4080);
                    var4[var8] = class637.method3693(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; ~class41.field455 < ~var10; ++var10) {
                    int var11 = this.field4926 * var10 / class41.field455;
                    int var12 = this.field4928[var7 - -var11];
                    var6[var10] = class637.method3693(var12 << 4, 4080);
                    var5[var10] = class637.method3693(var12, 65280) >> 4;
                    var4[var10] = class637.method3693(var12, 16711680) >> 12;
                }
            }
        }
        if (arg0 != 36) {
            this.method78((byte) 16, 113);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(III)V", line = 129)
    public static final void method2094(int arg0, int arg1, int arg2) {
        int var3 = -115 / ((25 - arg0) / 53);
        ++field4923;
        if (~class41.field455 != ~arg2) {
            class287.field4215 = new int[arg2];
            for (int var4 = 0; arg2 > var4; ++var4) {
                class287.field4215[var4] = (var4 << 12) / arg2;
            }
            class41.field455 = arg2;
            class197.field2970 = arg2 * 32;
            class343.field5013 = arg2 + -1;
        }
        if (class23.field201 != arg1) {
            if (~class41.field455 != ~arg1) {
                class614.field9004 = new int[arg1];
                for (int var5 = 0; var5 < arg1; ++var5) {
                    class614.field9004[var5] = (var5 << 12) / arg1;
                }
            } else {
                class614.field9004 = class287.field4215;
            }
            class23.field201 = arg1;
            class135.field1789 = arg1 - 1;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBLps;)V", line = 176)
    public final void method81(int arg0, byte arg1, class428 arg2) {
        if (arg0 == 0) {
            this.field4927 = arg2.method2620(110);
        }
        ++field4925;
        int var4 = 91 / ((-15 - arg1) / 39);
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V", line = 192)
    public class335() {
        super(0, false);
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V", line = 197)
    public final void method1480(int arg0) {
        super.method1480(118);
        if (arg0 < 48) {
            method2091(-125);
        }
        ++field4932;
        this.field4928 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[BI)I", line = 209)
    public static final int method2095(int arg0, byte[] arg1, int arg2) {
        if (arg2 != 10425) {
            return -69;
        } else {
            ++field4922;
            return class220.method1450(arg0, 0, arg1, 0);
        }
    }
}
