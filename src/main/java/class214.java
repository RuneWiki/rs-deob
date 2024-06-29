import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class214 extends class243 {

    @OriginalMember(owner = "client!ta", name = "E", descriptor = "I")
    private int field2566 = 0;

    @OriginalMember(owner = "client!ta", name = "I", descriptor = "I")
    private int field2570 = 0;

    @OriginalMember(owner = "client!ta", name = "L", descriptor = "I")
    private int field2573 = 20;

    @OriginalMember(owner = "client!ta", name = "F", descriptor = "I")
    private int field2567 = 1365;

    @OriginalMember(owner = "client!ta", name = "K", descriptor = "Lns;")
    public static class406 field2572 = new class406();

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!ta", name = "G", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!ta", name = "J", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!ta", name = "M", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!ta", name = "N", descriptor = "Lda;")
    public static class61 field2575;

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
    public class214() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZII)Ljava/lang/String;")
    public static final String method1190(int arg0, boolean arg1, int arg2, int arg3) {
        ++field2565;
        if (~arg3 <= -3 && arg3 <= 36) {
            if (arg1 && ~arg0 <= -1) {
                int var4 = 2;
                for (int var5 = arg0 / arg3; ~var5 != -1; var5 /= arg3) {
                    ++var4;
                }
                if (arg2 != 328) {
                    return null;
                } else {
                    char[] var6 = new char[var4];
                    var6[0] = '+';
                    for (int var7 = var4 - 1; var7 > 0; --var7) {
                        int var8 = arg0;
                        arg0 /= arg3;
                        int var9 = -(arg0 * arg3) + var8;
                        if (var9 >= 10) {
                            var6[var7] = (char) (var9 + 87);
                        } else {
                            var6[var7] = (char) (var9 + 48);
                        }
                    }
                    return new String(var6);
                }
            } else {
                return Integer.toString(arg0, arg3);
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)V")
    public static final void method1191(int arg0) {
        if (arg0 <= 78) {
            method1190(-104, true, 77, -76);
        }
        ++field2571;
        class295.field3974 = (int) ((double) class272.field3589 * 34.46D);
        class608.field8499 = 200;
        class295.field3974 <<= 2;
        if (class21.field142.method404()) {
            class295.field3974 += 512;
        }
        class558.method3158(-546, false);
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(I)V")
    public static void method1192(int arg0) {
        field2575 = null;
        field2572 = null;
        int var1 = 12 / ((arg0 - 43) / 37);
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(B)V")
    public static final void method1193(byte arg0) {
        ++field2568;
        if (arg0 == -61) {
            class358.field4748.method2556(-95);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILji;B)V")
    public final void method1(int arg0, class611 arg1, byte arg2) {
        if (arg2 > -92) {
            method1193((byte) 111);
        }
        ++field2569;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 == 3) {
                        this.field2566 = arg1.method3402((byte) 127);
                    }
                } else {
                    this.field2570 = arg1.method3402((byte) 127);
                }
            } else {
                this.field2573 = arg1.method3402((byte) 127);
            }
        } else {
            this.field2567 = arg1.method3402((byte) 127);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)[I")
    public final int[] method5(int arg0, int arg1) {
        if (arg0 != 255) {
            return null;
        } else {
            ++field2574;
            int[] var3 = super.field3164.method3742((byte) 98, arg1);
            if (super.field3164.field9250) {
                for (int var4 = 0; var4 < class687.field9628; ++var4) {
                    int var5 = (class666.field9279[var4] << 12) / this.field2567 + this.field2570;
                    int var6 = (class685.field9613[arg1] << 12) / this.field2567 + this.field2566;
                    int var7 = var5;
                    int var8 = var6;
                    int var9 = var5;
                    int var10 = var6;
                    int var11 = var5 * var5 >> 12;
                    int var12 = var6 * var6 >> 12;
                    int var13 = 0;
                    while (~(var11 + var12) > -16385 && ~var13 > ~this.field2573) {
                        var10 = (var9 * var10 >> 12) * 2 + var8;
                        var9 = var11 - var12 + var7;
                        var11 = var9 * var9 >> 12;
                        ++var13;
                        var12 = var10 * var10 >> 12;
                    }
                    var3[var4] = ~(this.field2573 + -1) < ~var13 ? (var13 << 12) / this.field2573 : 0;
                }
            }
            return var3;
        }
    }
}
