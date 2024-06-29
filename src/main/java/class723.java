import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jha")
public class class723 extends class585 {

    @OriginalMember(owner = "client!jha", name = "G", descriptor = "I")
    private int field10011 = 16;

    @OriginalMember(owner = "client!jha", name = "J", descriptor = "I")
    private int field10014 = 4096;

    @OriginalMember(owner = "client!jha", name = "N", descriptor = "I")
    private int field10018 = 2000;

    @OriginalMember(owner = "client!jha", name = "P", descriptor = "I")
    private int field10020 = 0;

    @OriginalMember(owner = "client!jha", name = "E", descriptor = "I")
    private int field10010 = 0;

    @OriginalMember(owner = "client!jha", name = "I", descriptor = "Lls;")
    public static class149 field10013 = new class149("WIP", 2);

    @OriginalMember(owner = "client!jha", name = "Q", descriptor = "[I")
    public static int[] field10021 = new int[16];

    @OriginalMember(owner = "client!jha", name = "H", descriptor = "I")
    public static int field10012;

    @OriginalMember(owner = "client!jha", name = "K", descriptor = "I")
    public static int field10015;

    @OriginalMember(owner = "client!jha", name = "L", descriptor = "I")
    public static int field10016;

    @OriginalMember(owner = "client!jha", name = "M", descriptor = "I")
    public static int field10017;

    @OriginalMember(owner = "client!jha", name = "O", descriptor = "I")
    public static int field10019;

    @OriginalMember(owner = "client!jha", name = "<init>", descriptor = "()V", line = 4)
    public class723() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jha", name = "c", descriptor = "(I)V", line = 13)
    public static void method4058(int arg0) {
        if (arg0 != -14604) {
            method4058(-73);
        }
        field10021 = null;
        field10013 = null;
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(II[B)[B", line = 24)
    public static final byte[] method4059(int arg0, int arg1, byte[] arg2) {
        ++field10016;
        byte[] var3 = new byte[arg0];
        if (arg1 != -10339) {
            return null;
        } else {
            class595.method3467(arg2, 0, var3, 0, arg0);
            return var3;
        }
    }

    @OriginalMember(owner = "client!jha", name = "b", descriptor = "(II)[I", line = 40)
    public final int[] method55(int arg0, int arg1) {
        ++field10012;
        int[] var3 = super.field8255.method1637(-29827, arg0);
        if (arg1 <= 123) {
            method4060(-71, -127L);
        }
        if (super.field8255.field3677) {
            int var4 = this.field10014 >> 1;
            int[][] var5 = super.field8255.method1639(0);
            Random var6 = new Random((long) this.field10010);
            for (int var7 = 0; var7 < this.field10018; ++var7) {
                int var8 = this.field10014 > 0 ? this.field10020 + class7.method51(9, var6, this.field10014) + -var4 : this.field10020;
                int var9 = 255 & var8 >> 4;
                int var10 = class7.method51(-14, var6, class293.field4278);
                int var11 = class7.method51(-21, var6, class270.field3923);
                int var12 = (class356.field5015[var9] * this.field10011 >> 12) + var10;
                int var13 = (class145.field2121[var9] * this.field10011 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (var15 != 0 || ~var14 != -1) {
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    boolean var16 = ~var14 < ~var15;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (~var12 > ~var10) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var12 = var19;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 - (class7.method51(-53, var6, 4096) >> 2);
                    int var27 = ~var13 < ~var11 ? 1 : -1;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; var12 > var28; ++var28) {
                        int var29 = var26 - -((var28 - var10) * var25) + 1024;
                        int var30 = class625.field8759 & var28;
                        int var31 = var21 & class305.field4391;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        var24 += var23;
                        if (var24 > 0) {
                            var24 += -var22;
                            var21 -= -var27;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(Lso;II)V", line = 172)
    public final void method54(class494 arg0, int arg1, int arg2) {
        ++field10019;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 == 4) {
                            this.field10014 = arg0.method2998(true);
                        }
                    } else {
                        this.field10020 = arg0.method2998(true);
                    }
                } else {
                    this.field10011 = arg0.method2964((byte) 80);
                }
            } else {
                this.field10018 = arg0.method2998(true);
            }
        } else {
            this.field10010 = arg0.method2964((byte) 87);
        }
        if (arg1 != 1) {
            this.field10020 = -55;
        }
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(IJ)V", line = 241)
    public static final void method4060(int arg0, long arg1) {
        ++field10015;
        try {
            Thread.sleep(arg1);
            if (arg0 != 271323724) {
                method4059(69, -57, (byte[]) null);
            }
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(I)V", line = 262)
    public final void method52(int arg0) {
        if (arg0 != -4096) {
            this.method54((class494) null, -43, 45);
        }
        class635.method3634((byte) -83);
        ++field10017;
    }
}
