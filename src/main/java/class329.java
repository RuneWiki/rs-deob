import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class329 extends class227 {

    @OriginalMember(owner = "client!qe", name = "M", descriptor = "I")
    private int field4370 = 0;

    @OriginalMember(owner = "client!qe", name = "I", descriptor = "I")
    private int field4366 = 4096;

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "I")
    public static int field4364 = 0;

    @OriginalMember(owner = "client!qe", name = "L", descriptor = "Z")
    public static boolean field4369 = false;

    @OriginalMember(owner = "client!qe", name = "P", descriptor = "I")
    public static int field4373 = 0;

    @OriginalMember(owner = "client!qe", name = "H", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!qe", name = "J", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!qe", name = "K", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!qe", name = "N", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!qe", name = "O", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1930(String arg0, int arg1) {
        ++field4368;
        if (arg1 != 25572) {
            field4364 = -65;
        }
        if (class176.field2278 == null) {
            class328.method1928(7806);
        }
        String[] var2 = class436.method2679((byte) 74, '\n', arg0);
        for (int var3 = 0; var3 < var2.length; ++var3) {
            for (int var4 = class277.field3678; ~var4 < -1; --var4) {
                class176.field2278[var4] = class176.field2278[var4 + -1];
            }
            class176.field2278[0] = var2[var3];
            if (~class277.field3678 > ~(class176.field2278.length + -1)) {
                if (~class4.field15 < -1) {
                    ++class4.field15;
                }
                ++class277.field3678;
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
    public class329() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)[I")
    public final int[] method62(int arg0, int arg1) {
        ++field4365;
        if (arg0 != 15811) {
            this.field4366 = -47;
        }
        int[] var3 = super.field3068.method1970(arg1, (byte) 99);
        if (super.field3068.field4480) {
            int[] var4 = this.method1459(arg1, -36, 0);
            for (int var5 = 0; class446.field6486 > var5; ++var5) {
                int var6 = var4[var5];
                if (~this.field4370 < ~var6) {
                    var3[var5] = this.field4370;
                } else if (~var6 < ~this.field4366) {
                    var3[var5] = this.field4366;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method112(int arg0, boolean arg1) {
        ++field4367;
        int[][] var3 = super.field3059.method28((byte) -76, arg0);
        if (!arg1) {
            this.method112(9, false);
        }
        if (super.field3059.field57) {
            int[][] var4 = this.method1460(arg0, 0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class446.field6486; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (this.field4370 <= var12) {
                    if (~var12 < ~this.field4366) {
                        var8[var11] = this.field4366;
                    } else {
                        var8[var11] = var12;
                    }
                } else {
                    var8[var11] = this.field4370;
                }
                if (this.field4370 <= var13) {
                    if (~var13 >= ~this.field4366) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field4366;
                    }
                } else {
                    var9[var11] = this.field4370;
                }
                if (var14 < this.field4370) {
                    var10[var11] = this.field4370;
                } else if (~this.field4366 > ~var14) {
                    var10[var11] = this.field4366;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lug;II)V")
    public final void method61(class396 arg0, int arg1, int arg2) {
        ++field4372;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field3066 = arg0.method2388((byte) -123) == 1;
                }
            } else {
                this.field4366 = arg0.method2386(-23648);
            }
        } else {
            this.field4370 = arg0.method2386(-23648);
        }
        if (arg1 != 487215116) {
            this.field4370 = 20;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILvb;)V")
    public static final void method1931(int arg0, class133 arg1) {
        if (arg1.field1755 != null) {
            arg1.field1755.field7336 = 0;
        }
        ++field4371;
        arg1.field1756 = false;
        if (arg0 != 0) {
            field4373 = -99;
        }
        for (class133 var2 = arg1.method602(); var2 != null; var2 = arg1.method596()) {
            method1931(0, var2);
        }
    }
}
