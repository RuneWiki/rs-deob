import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class237 extends class200 {

    @OriginalMember(owner = "client!s", name = "V", descriptor = "I")
    private int field4156 = 4096;

    @OriginalMember(owner = "client!s", name = "T", descriptor = "I")
    private int field4154 = 4096;

    @OriginalMember(owner = "client!s", name = "R", descriptor = "I")
    private int field4152 = 4096;

    @OriginalMember(owner = "client!s", name = "O", descriptor = "Z")
    public static boolean field4149 = false;

    @OriginalMember(owner = "client!s", name = "N", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!s", name = "P", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!s", name = "Q", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!s", name = "U", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!s", name = "W", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!s", name = "X", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!s", name = "S", descriptor = "Lal;")
    public static class230 field4153;

    @OriginalMember(owner = "client!s", name = "Y", descriptor = "Lal;")
    public static class230 field4159;

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
    public class237() {
        super(1, false);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method24(boolean arg0, int arg1) {
        ++field4157;
        if (!arg0) {
            this.method31((class74) null, false, -100);
        }
        int[][] var3 = super.field3632.method965(arg1, 50);
        if (super.field3632.field2550) {
            int[][] var4 = this.method1366(arg1, false, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var3[0];
            int[] var10 = var4[1];
            for (int var11 = 0; class137.field2515 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var10[var11];
                if (var12 == var13 && ~var13 == ~var14) {
                    var9[var11] = this.field4154 * var12 >> 12;
                    var7[var11] = this.field4152 * var13 >> 12;
                    var8[var11] = this.field4156 * var14 >> 12;
                } else {
                    var9[var11] = this.field4154;
                    var7[var11] = this.field4152;
                    var8[var11] = this.field4156;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(I)V")
    public static void method1602(int arg0) {
        field4153 = null;
        field4159 = null;
        if (arg0 != 7288) {
            method1604((byte) 10, (class20) null);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([Lid;I)Lid;")
    public static final class149 method1603(class149[] arg0, int arg1) {
        ++field4148;
        if (~arg0.length > -3) {
            throw new IllegalArgumentException();
        } else {
            return arg1 > -90 ? null : class199.method1363(arg0.length, arg0, 0, (byte) -67);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BLbk;)I")
    public static final int method1604(byte arg0, class20 arg1) {
        ++field4150;
        class59 var2 = arg1.field296;
        if (var2.field1046 != null) {
            var2 = var2.method374(-1);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field1056;
        if (arg0 < 72) {
            field4153 = null;
        }
        class264 var4 = arg1.method923((byte) -97);
        if (arg1.field2334 != var4.field4718) {
            if (~arg1.field2334 != ~var4.field4733 && arg1.field2334 != var4.field4716 && arg1.field2334 != var4.field4703 && arg1.field2334 != var4.field4727) {
                if (arg1.field2334 == var4.field4711 || arg1.field2334 == var4.field4714 || ~arg1.field2334 == ~var4.field4710 || arg1.field2334 == var4.field4690) {
                    var3 = var2.field1075;
                }
            } else {
                var3 = var2.field1074;
            }
        } else {
            var3 = var2.field1011;
        }
        return var3;
    }

    @OriginalMember(owner = "client!s", name = "f", descriptor = "(I)V")
    public static final void method1605(int arg0) {
        ++field4151;
        int var1 = 0;
        for (int var2 = 0; ~var2 > -105; ++var2) {
            for (int var3 = 0; var3 < 104; ++var3) {
                if (class171.method1227(true, var3, (byte) 79, var1, class261.field4664, var2)) {
                    ++var1;
                }
                if (~var1 <= -513) {
                    return;
                }
            }
        }
        if (arg0 < 62) {
            field4149 = false;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        if (arg1) {
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (arg2 == 2) {
                        this.field4156 = arg0.method485(-2386);
                    }
                } else {
                    this.field4152 = arg0.method485(-2386);
                }
            } else {
                this.field4154 = arg0.method485(-2386);
            }
            ++field4155;
        }
    }
}
