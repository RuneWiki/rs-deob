import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public class class258 extends class362 {

    @OriginalMember(owner = "client!uha", name = "y", descriptor = "I")
    private int field3611 = 0;

    @OriginalMember(owner = "client!uha", name = "z", descriptor = "I")
    private int field3612 = 16;

    @OriginalMember(owner = "client!uha", name = "H", descriptor = "I")
    private int field3620 = 4096;

    @OriginalMember(owner = "client!uha", name = "I", descriptor = "I")
    private int field3621 = 2000;

    @OriginalMember(owner = "client!uha", name = "A", descriptor = "I")
    private int field3613 = 0;

    @OriginalMember(owner = "client!uha", name = "G", descriptor = "Z")
    public static boolean field3619 = false;

    @OriginalMember(owner = "client!uha", name = "D", descriptor = "Lfja;")
    public static class783 field3616 = new class783(110, 7);

    @OriginalMember(owner = "client!uha", name = "B", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!uha", name = "C", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!uha", name = "E", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!uha", name = "F", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!uha", name = "J", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!uha", name = "K", descriptor = "Lnf;")
    public static class604 field3623;

    @OriginalMember(owner = "client!uha", name = "<init>", descriptor = "()V", line = 203)
    public class258() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(I)V", line = 9)
    public final void method160(int arg0) {
        class713.method3968(0);
        if (arg0 == -996226836) {
            ++field3615;
        }
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(Z)V", line = 21)
    public static void method1683(boolean arg0) {
        field3616 = null;
        field3623 = null;
        if (!arg0) {
            field3623 = null;
        }
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(IIIIIBII)V", line = 34)
    public static final void method1684(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        if (arg5 < 98) {
            field3623 = null;
        }
        ++field3614;
        if (~class268.field3766 >= ~arg3 && class236.field3392 >= arg0 && class223.field3260 <= arg4 && class706.field9700 >= arg1) {
            class550.method3086(arg4, arg0, arg3, arg1, -32183, arg6, arg7, arg2);
        } else {
            class505.method2885(arg2, arg6, arg1, (byte) -100, arg7, arg4, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "(IB)J", line = 53)
    public static final long method1685(int arg0, byte arg1) {
        if (arg1 > -46) {
            field3623 = null;
        }
        ++field3617;
        return (long) (arg0 + 11745) * 86400000L;
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(II)[I", line = 65)
    public final int[] method156(int arg0, int arg1) {
        ++field3622;
        int[] var3 = super.field4927.method808(-123, arg1);
        if (arg0 != -2026769311) {
            this.method156(88, -83);
        }
        if (super.field4927.field1471) {
            int var4 = this.field3620 >> 1;
            int[][] var5 = super.field4927.method809(-16352);
            Random var6 = new Random((long) this.field3611);
            for (int var7 = 0; this.field3621 > var7; ++var7) {
                int var8 = ~this.field3620 >= -1 ? this.field3613 : this.field3613 + -var4 + class38.method235(this.field3620, arg0 ^ -2026769291, var6);
                int var9 = var8 >> 4 & 255;
                int var10 = class38.method235(class769.field10597, arg0 + 2026769210, var6);
                int var11 = class38.method235(class555.field7845, arg0 + 2026769420, var6);
                int var12 = var10 - -(class551.field7540[var9] * this.field3612 >> 12);
                int var13 = var11 - -(class365.field4956[var9] * this.field3612 >> 12);
                int var14 = -var11 + var13;
                int var15 = var12 - var10;
                if (var15 != 0 || var14 != 0) {
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = ~var15 > ~var14;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var12 = var13;
                        var11 = var17;
                        var13 = var18;
                    }
                    if (~var12 > ~var10) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class38.method235(4096, 116, var6) >> 2) + 1024;
                    int var27 = var13 <= var11 ? -1 : 1;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; ~var12 < ~var28; ++var28) {
                        int var29 = (-var10 + var28) * var25 + (var26 - -1024);
                        int var30 = class522.field7083 & var28;
                        int var31 = class606.field8463 & var21;
                        var24 += var23;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        if (var24 > 0) {
                            var21 -= -var27;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(Lfca;II)V", line = 218)
    public final void method154(class93 arg0, int arg1, int arg2) {
        ++field3618;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 == 4) {
                            this.field3620 = arg0.method763(105);
                        }
                    } else {
                        this.field3613 = arg0.method763(arg2 + -8);
                    }
                } else {
                    this.field3612 = arg0.method793((byte) 55);
                }
            } else {
                this.field3621 = arg0.method763(-43);
            }
        } else {
            this.field3611 = arg0.method793((byte) 9);
        }
        if (arg2 != -1) {
            field3619 = false;
        }
    }
}
