import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class243 extends class105 {

    @OriginalMember(owner = "client!j", name = "N", descriptor = "I")
    private int field4233 = 2048;

    @OriginalMember(owner = "client!j", name = "W", descriptor = "I")
    private int field4241 = 4096;

    @OriginalMember(owner = "client!j", name = "Y", descriptor = "I")
    private int field4243 = 2048;

    @OriginalMember(owner = "client!j", name = "O", descriptor = "I")
    private int field4234 = 8192;

    @OriginalMember(owner = "client!j", name = "M", descriptor = "I")
    private int field4232 = 12288;

    @OriginalMember(owner = "client!j", name = "fb", descriptor = "I")
    private int field4250 = 0;

    @OriginalMember(owner = "client!j", name = "db", descriptor = "I")
    private int field4248 = 0;

    @OriginalMember(owner = "client!j", name = "P", descriptor = "[[[I")
    public static int[][][] field4235 = new int[2][][];

    @OriginalMember(owner = "client!j", name = "bb", descriptor = "I")
    public static int field4246 = 0;

    @OriginalMember(owner = "client!j", name = "cb", descriptor = "[I")
    public static int[] field4247 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!j", name = "Z", descriptor = "I")
    public static int field4244 = -1;

    @OriginalMember(owner = "client!j", name = "R", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!j", name = "T", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!j", name = "U", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!j", name = "V", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!j", name = "ab", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!j", name = "eb", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!j", name = "gb", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "Lfl;")
    public static class192 field4236;

    @OriginalMember(owner = "client!j", name = "X", descriptor = "Lfl;")
    public static class192 field4242;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(JB)V")
    public static final void method1617(long arg0, byte arg1) {
        class55.field1133.field2449 = 0;
        class55.field1133.method903((byte) 36, 98);
        class55.field1133.method911(0, arg0);
        class277.field4892 = -3;
        class141.field2626 = 1;
        class212.field3813 = 0;
        ++field4245;
        class56.field1146 = 0;
        if (arg1 < 13) {
            field4249 = 84;
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(Z)V")
    public final void method94(boolean arg0) {
        ++field4238;
        class123.method831(108);
        if (arg0) {
            field4244 = -120;
        }
    }

    @OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V")
    public static void method1618(int arg0) {
        field4236 = null;
        field4235 = null;
        if (arg0 != 4096) {
            field4235 = null;
        }
        field4242 = null;
        field4247 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)[I")
    public final int[] method16(int arg0, int arg1) {
        if (arg0 != 8055) {
            method1617(46L, (byte) 78);
        }
        ++field4251;
        int[] var3 = super.field1862.method458(arg1, false);
        if (super.field1862.field1236) {
            int var4 = class219.field3951[arg1] + -2048;
            for (int var5 = 0; class94.field1668 > var5; ++var5) {
                int var6 = class277.field4894[var5] + -2048;
                int var7 = this.field4233 + var6;
                int var8 = this.field4250 + var4;
                int var9 = var8 < -2048 ? var8 + 4096 : var8;
                int var10 = ~var7 > 2047 ? var7 - -4096 : var7;
                int var11 = var6 - -this.field4248;
                int var12 = ~var11 <= 2047 ? var11 : var11 + 4096;
                int var13 = ~var9 < -2049 ? var9 - 4096 : var9;
                int var14 = ~var12 >= -2049 ? var12 : var12 + -4096;
                int var15 = this.field4243 + var4;
                int var16 = var10 > 2048 ? var10 + -4096 : var10;
                int var17 = ~var15 > 2047 ? var15 + 4096 : var15;
                int var18 = ~var17 >= -2049 ? var17 : var17 + -4096;
                var3[var5] = !this.method1620(var16, var13, (byte) -99) && !this.method1619(var14, arg0 + -12692, var18) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)Z")
    private final boolean method1619(int arg0, int arg1, int arg2) {
        if (arg1 != -4637) {
            this.method1619(-116, 113, 13);
        }
        int var4 = (arg2 - -arg0) * this.field4232 >> 12;
        ++field4239;
        int var5 = class227.field4029[(var4 * 255 & 1047678) >> 12];
        int var6 = (var5 << 12) / this.field4232;
        int var7 = (var6 << 12) / this.field4234;
        int var8 = this.field4241 * var7 >> 12;
        return var8 > -arg0 + arg2 && ~(arg2 - arg0) < ~(-var8);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field4234 = arg2.method927(125);
                                }
                            } else {
                                this.field4241 = arg2.method927(127);
                            }
                        } else {
                            this.field4232 = arg2.method927(arg1 ^ 130);
                        }
                    } else {
                        this.field4243 = arg2.method927(arg1 ^ 129);
                    }
                } else {
                    this.field4248 = arg2.method927(arg1 + -129);
                }
            } else {
                this.field4250 = arg2.method927(125);
            }
        } else {
            this.field4233 = arg2.method927(125);
        }
        if (arg1 != 255) {
            this.field4232 = -128;
        }
        ++field4240;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IIB)Z")
    private final boolean method1620(int arg0, int arg1, byte arg2) {
        ++field4237;
        int var4 = (-arg0 + arg1) * this.field4232 >> 12;
        int var5 = class227.field4029[(var4 * 255 & 1044874) >> 12];
        int var6 = (var5 << 12) / this.field4232;
        int var7 = (var6 << 12) / this.field4234;
        int var8 = this.field4241 * var7 >> 12;
        if (arg2 >= -9) {
            return true;
        } else {
            return arg0 - -arg1 < var8 && -var8 < arg0 + arg1;
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V")
    public class243() {
        super(0, true);
    }
}
