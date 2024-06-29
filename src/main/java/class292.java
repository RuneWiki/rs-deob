import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class292 extends class11 {

    @OriginalMember(owner = "client!un", name = "J", descriptor = "I")
    private int field4033 = 4096;

    @OriginalMember(owner = "client!un", name = "L", descriptor = "[I")
    private int[] field4035 = new int[3];

    @OriginalMember(owner = "client!un", name = "K", descriptor = "I")
    private int field4034 = 4096;

    @OriginalMember(owner = "client!un", name = "N", descriptor = "I")
    private int field4037 = 409;

    @OriginalMember(owner = "client!un", name = "R", descriptor = "I")
    private int field4041 = 4096;

    @OriginalMember(owner = "client!un", name = "I", descriptor = "Lar;")
    public static class479 field4032 = new class479();

    @OriginalMember(owner = "client!un", name = "P", descriptor = "I")
    public static int field4039 = 0;

    @OriginalMember(owner = "client!un", name = "S", descriptor = "Z")
    public static volatile boolean field4042 = true;

    @OriginalMember(owner = "client!un", name = "O", descriptor = "Ldi;")
    public static class83 field4038 = new class83(80, -1);

    @OriginalMember(owner = "client!un", name = "U", descriptor = "Lri;")
    public static class74 field4044 = new class74(14, 7);

    @OriginalMember(owner = "client!un", name = "G", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!un", name = "H", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!un", name = "M", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!un", name = "Q", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!un", name = "T", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "(I)V", line = 4)
    public static void method1731(int arg0) {
        field4038 = null;
        field4032 = null;
        field4044 = null;
        if (arg0 != 3353) {
            field4043 = -127;
        }
    }

    @OriginalMember(owner = "client!un", name = "e", descriptor = "(II)V", line = 18)
    public static final void method1732(int arg0, int arg1) {
        ++field4030;
        if (~arg1 > -1 || arg1 > 2) {
            arg1 = 0;
        }
        if (arg0 != 2794) {
            method1733(101);
        }
        class359.field5234 = arg1;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)[[I", line = 33)
    public final int[][] method41(int arg0, int arg1) {
        int var3 = -36 / ((arg0 - -75) / 49);
        ++field4040;
        int[][] var4 = super.field156.method1719(arg1, 3);
        if (super.field156.field4001) {
            int[][] var5 = this.method49(arg1, 0, 122);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; ~class90.field1316 < ~var12; ++var12) {
                int var13 = var6[var12];
                int var14 = -this.field4035[0] + var13;
                if (~var14 > -1) {
                    var14 = -var14;
                }
                if (~var14 < ~this.field4037) {
                    var9[var12] = var13;
                    var10[var12] = var7[var12];
                    var11[var12] = var8[var12];
                } else {
                    int var15 = var7[var12];
                    int var16 = -this.field4035[1] + var15;
                    if (var16 < 0) {
                        var16 = -var16;
                    }
                    if (var16 > this.field4037) {
                        var9[var12] = var13;
                        var10[var12] = var15;
                        var11[var12] = var8[var12];
                    } else {
                        int var17 = var8[var12];
                        int var18 = -this.field4035[2] + var17;
                        if (~var18 > -1) {
                            var18 = -var18;
                        }
                        if (var18 > this.field4037) {
                            var9[var12] = var13;
                            var10[var12] = var15;
                            var11[var12] = var17;
                        } else {
                            var9[var12] = this.field4041 * var13 >> 12;
                            var10[var12] = this.field4034 * var15 >> 12;
                            var11[var12] = this.field4033 * var17 >> 12;
                        }
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V", line = 124)
    public class292() {
        super(1, false);
    }

    @OriginalMember(owner = "client!un", name = "g", descriptor = "(I)V", line = 127)
    public static final void method1733(int arg0) {
        ++field4031;
        if (~class489.field7144 != -1) {
            try {
                if (~(++class447.field6582) < -1501) {
                    if (class33.field438 != null) {
                        class33.field438.method2839(arg0 ^ -20827);
                        class33.field438 = null;
                    }
                    if (class526.field7782 >= 1) {
                        class489.field7144 = 0;
                        class154.field2357 = -5;
                        return;
                    }
                    if (class241.field3373 == class140.field1991) {
                        class140.field1991 = class220.field3117;
                    } else {
                        class140.field1991 = class241.field3373;
                    }
                    class489.field7144 = 1;
                    class447.field6582 = 0;
                    ++class526.field7782;
                }
                if (class489.field7144 == arg0) {
                    class85.field1262 = class202.field2840.method2952(class140.field1991, false, class267.field3697);
                    class489.field7144 = 2;
                }
                if (~class489.field7144 == -3) {
                    if (class85.field1262.field667 == 2) {
                        throw new IOException();
                    }
                    if (~class85.field1262.field667 != -2) {
                        return;
                    }
                    class33.field438 = new class483((Socket) class85.field1262.field670, class202.field2840);
                    class85.field1262 = null;
                    class33.field438.method2835((byte) 95, class481.field7027.field5719, class481.field7027.field5678, 0);
                    class67.method570(-30266);
                    int var1 = class33.field438.method2844(-113);
                    class67.method570(-30266);
                    if (var1 != 101) {
                        class154.field2357 = var1;
                        class489.field7144 = 0;
                        class33.field438.method2839(-20828);
                        class33.field438 = null;
                        return;
                    }
                    class489.field7144 = 3;
                }
                if (class489.field7144 == 3) {
                    if (~class33.field438.method2842(0) <= -3) {
                        int var2 = class33.field438.method2844(arg0 + -89) << 8 | class33.field438.method2844(arg0 + -36);
                        class345.method2046(var2, -123);
                        if (class316.field4329 == -1) {
                            class154.field2357 = 6;
                            class489.field7144 = 0;
                            class33.field438.method2839(-20828);
                            class33.field438 = null;
                        } else {
                            class489.field7144 = 0;
                            class33.field438.method2839(-20828);
                            class33.field438 = null;
                            class226.method1399((byte) 13);
                        }
                    }
                }
            } catch (IOException var3) {
                if (class33.field438 != null) {
                    class33.field438.method2839(-20828);
                    class33.field438 = null;
                }
                if (class526.field7782 < 1) {
                    class489.field7144 = 1;
                    class447.field6582 = 0;
                    ++class526.field7782;
                    if (~class241.field3373 == ~class140.field1991) {
                        class140.field1991 = class220.field3117;
                    } else {
                        class140.field1991 = class241.field3373;
                    }
                } else {
                    class489.field7144 = 0;
                    class154.field2357 = -4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lsi;II)V", line = 292)
    public final void method43(class391 arg0, int arg1, int arg2) {
        ++field4036;
        if (arg1 > -40) {
            field4043 = -115;
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 == -5) {
                            int var5 = arg0.method2338(true);
                            this.field4035[2] = class251.method1501(0, var5 >> 12);
                            this.field4035[0] = class251.method1501(var5, 16711680) << 4;
                            this.field4035[1] = class251.method1501(var5 >> 4, 4080);
                        }
                    } else {
                        this.field4041 = arg0.method2353((byte) 125);
                    }
                } else {
                    this.field4034 = arg0.method2353((byte) 98);
                }
            } else {
                this.field4033 = arg0.method2353((byte) 107);
            }
        } else {
            this.field4037 = arg0.method2353((byte) 92);
        }
    }
}
