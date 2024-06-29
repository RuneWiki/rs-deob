import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class34 extends class83 {

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "I")
    private int field334 = -1;

    @OriginalMember(owner = "client!pc", name = "W", descriptor = "I")
    public static int field339 = -13423323;

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "I")
    public int field327;

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!pc", name = "O", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!pc", name = "S", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!pc", name = "U", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!pc", name = "V", descriptor = "I")
    public int field338;

    @OriginalMember(owner = "client!pc", name = "X", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "[I")
    public int[] field332;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)I", line = 6)
    public final int method159(boolean arg0) {
        ++field336;
        if (!arg0) {
            method161(false, 50, 11, -55);
        }
        return this.field334;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBLtq;)V", line = 19)
    public final void method35(int arg0, byte arg1, class250 arg2) {
        int var4 = -82 / ((-27 - arg1) / 50);
        ++field330;
        if (arg0 == 0) {
            this.field334 = arg2.method1374(-2);
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V", line = 31)
    public class34() {
        super(0, false);
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)Z", line = 34)
    public final boolean method160(int arg0) {
        ++field328;
        if (arg0 != 16711680) {
            field339 = 108;
        }
        if (this.field332 != null) {
            return true;
        } else if (this.field334 >= 0) {
            class241 var2 = class161.field2069 >= 0 ? class241.method1289(class58.field598, class161.field2069, this.field334) : class241.method1283(class58.field598, this.field334);
            var2.method1294();
            this.field332 = var2.method1297();
            this.field338 = var2.field3280;
            this.field327 = var2.field3282;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZIII)I", line = 60)
    public static final int method161(boolean arg0, int arg1, int arg2, int arg3) {
        ++field333;
        if (arg2 == arg3) {
            return arg3;
        } else {
            int var4 = -arg1 + 128;
            if (arg0) {
                return 59;
            } else {
                int var5 = (arg2 & 127) * arg1 + (arg3 & 127) * var4 >> 7;
                int var6 = (896 & arg2) * arg1 + (arg3 & 896) * var4 >> 7;
                int var7 = (64512 & arg2) * arg1 + (64512 & arg3) * var4 >> 7;
                return 127 & var5 | 64512 & var7 | 896 & var6;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(B)V", line = 86)
    public static final void method162(byte arg0) {
        int var1 = 71 / ((arg0 - 15) / 52);
        ++field329;
        if (class6.field46 != -1) {
            class208.method1125(class6.field46, false, -1, 4, -1);
            class6.field46 = -1;
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)V", line = 108)
    public final void method114(byte arg0) {
        ++field335;
        super.method114((byte) 100);
        if (arg0 < 95) {
            field339 = -127;
        }
        this.field332 = null;
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(II)V", line = 123)
    public static final void method163(int arg0, int arg1) {
        if (arg1 < 0 || ~arg1 < -3) {
            arg1 = 0;
        }
        ++field331;
        if (arg0 < -20) {
            class235.field3247 = arg1;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZI)[[I", line = 141)
    public int[][] method21(boolean arg0, int arg1) {
        ++field340;
        int[][] var3 = super.field927.method1774((byte) -60, arg1);
        if (!arg0) {
            field337 = -56;
        }
        if (super.field927.field4104 && this.method160(16711680)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (~class91.field1047 != ~this.field338 ? this.field338 * arg1 / class91.field1047 : arg1) * this.field327;
            if (~class420.field6139 == ~this.field327) {
                for (int var8 = 0; ~class420.field6139 < ~var8; ++var8) {
                    int var9 = this.field332[var7++];
                    var6[var8] = class262.method1461(4080, var9 << 4);
                    var5[var8] = class262.method1461(var9, 65280) >> 4;
                    var4[var8] = class262.method1461(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; ~var10 > ~class420.field6139; ++var10) {
                    int var11 = this.field327 * var10 / class420.field6139;
                    int var12 = this.field332[var7 - -var11];
                    var6[var10] = class262.method1461(var12, 255) << 4;
                    var5[var10] = class262.method1461(var12, 65280) >> 4;
                    var4[var10] = class262.method1461(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }
}
