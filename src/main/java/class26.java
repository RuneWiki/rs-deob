import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class26 extends class535 {

    @OriginalMember(owner = "client!wv", name = "L", descriptor = "I")
    private int field368 = 0;

    @OriginalMember(owner = "client!wv", name = "S", descriptor = "I")
    private int field375 = 4096;

    @OriginalMember(owner = "client!wv", name = "P", descriptor = "I")
    private int field372 = 0;

    @OriginalMember(owner = "client!wv", name = "R", descriptor = "I")
    private int field374 = 16;

    @OriginalMember(owner = "client!wv", name = "I", descriptor = "I")
    private int field366 = 2000;

    @OriginalMember(owner = "client!wv", name = "O", descriptor = "I")
    public static int field371 = 2;

    @OriginalMember(owner = "client!wv", name = "F", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!wv", name = "G", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!wv", name = "J", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!wv", name = "M", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!wv", name = "N", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!wv", name = "Q", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "(B)V", line = 5)
    public final void method66(byte arg0) {
        if (arg0 <= 111) {
            this.method60(117, (class519) null, -35);
        }
        ++field373;
        class100.method744(-122);
    }

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "(II)[I", line = 16)
    public final int[] method65(int arg0, int arg1) {
        ++field364;
        if (arg1 != 1) {
            return null;
        } else {
            int[] var3 = super.field7885.method974(-30531, arg0);
            if (super.field7885.field2086) {
                int var4 = this.field375 >> 1;
                int[][] var5 = super.field7885.method975((byte) -121);
                Random var6 = new Random((long) this.field372);
                for (int var7 = 0; this.field366 > var7; ++var7) {
                    int var8 = ~this.field375 < -1 ? this.field368 - (var4 + -class392.method2360(arg1 + Integer.MAX_VALUE, var6, this.field375)) : this.field368;
                    int var9 = 255 & var8 >> 4;
                    int var10 = class392.method2360(Integer.MIN_VALUE, var6, class174.field2597);
                    int var11 = class392.method2360(Integer.MIN_VALUE, var6, class362.field5263);
                    int var12 = (class434.field6213[var9] * this.field374 >> 12) + var10;
                    int var13 = (class294.field4388[var9] * this.field374 >> 12) + var11;
                    int var14 = var13 - var11;
                    int var15 = -var10 + var12;
                    if (~var15 != -1 || var14 != 0) {
                        if (var15 < 0) {
                            var15 = -var15;
                        }
                        if (var14 < 0) {
                            var14 = -var14;
                        }
                        boolean var16 = ~var14 < ~var15;
                        if (var16) {
                            int var17 = var10;
                            var10 = var11;
                            int var18 = var12;
                            var12 = var13;
                            var11 = var17;
                            var13 = var18;
                        }
                        if (var12 < var10) {
                            int var19 = var10;
                            var10 = var12;
                            int var20 = var11;
                            var11 = var13;
                            var12 = var19;
                            var13 = var20;
                        }
                        int var21 = var11;
                        int var22 = -var10 + var12;
                        int var23 = var13 - var11;
                        int var24 = -var22 / 2;
                        int var25 = 2048 / var22;
                        int var26 = -(class392.method2360(arg1 + Integer.MAX_VALUE, var6, 4096) >> 2) + 1024;
                        if (var23 < 0) {
                            var23 = -var23;
                        }
                        int var27 = ~var11 <= ~var13 ? -1 : 1;
                        for (int var28 = var10; ~var28 > ~var12; ++var28) {
                            int var29 = (-var10 + var28) * var25 + var26 + 1024;
                            int var30 = class529.field7783 & var28;
                            int var31 = var21 & class293.field4364;
                            if (var16) {
                                var5[var31][var30] = var29;
                            } else {
                                var5[var30][var31] = var29;
                            }
                            var24 += var23;
                            if (var24 > 0) {
                                var24 -= var22;
                                var21 += var27;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(ILuc;I)V", line = 153)
    public static final void method160(int arg0, class23 arg1, int arg2) {
        ++field367;
        if (arg0 >= 8) {
            int var3 = -1;
            int var4 = 0;
            if (~arg1.field308 >= ~class24.field349) {
                if (~class24.field349 < ~arg1.field314) {
                    class412.method2467(arg1, false, 11906);
                    var4 = class249.field3720;
                    var3 = class544.field7980;
                } else {
                    class23.method138(arg1, false);
                }
            } else {
                class541.method3180(arg1, 79);
            }
            if (~arg1.field6961 > -129 || ~arg1.field6965 > -129 || arg1.field6961 >= class69.field1139 * 128 - 128 || ~arg1.field6965 <= ~((class255.field3763 + -1) * 128)) {
                arg1.field314 = 0;
                arg1.field274 = -1;
                arg1.field286 = -1;
                arg1.field250 = -1;
                var3 = -1;
                var4 = 0;
                arg1.field308 = 0;
                arg1.field6961 = arg1.field343[0] * 128 + 64 * arg1.method135((byte) 72);
                arg1.field6965 = arg1.field344[0] * 128 + arg1.method135((byte) 72) * 64;
                arg1.method136(-101);
            }
            if (class364.field5293 == arg1 && (arg1.field6961 < 1536 || ~arg1.field6965 > -1537 || (class69.field1139 + -12) * 128 <= arg1.field6961 || class255.field3763 * 128 - 1536 <= arg1.field6965)) {
                arg1.field308 = 0;
                arg1.field286 = -1;
                arg1.field274 = -1;
                arg1.field250 = -1;
                var3 = -1;
                arg1.field314 = 0;
                var4 = 0;
                arg1.field6961 = arg1.field343[0] * 128 + arg1.method135((byte) 72) * 64;
                arg1.field6965 = arg1.field344[0] * 128 + arg1.method135((byte) 72) * 64;
                arg1.method136(-93);
            }
            int var5 = class261.method1685(arg1, 64);
            class279.method1796(var5, (byte) -114, arg1, var3, var4);
            class395.method2385(arg1, -16599);
        }
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "()V", line = 282)
    public class26() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(ILwn;I)V", line = 223)
    public final void method60(int arg0, class519 arg1, int arg2) {
        if (arg2 == -6232) {
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (~arg0 != -3) {
                        if (~arg0 != -4) {
                            if (arg0 == 4) {
                                this.field375 = arg1.method3018(566990904);
                            }
                        } else {
                            this.field368 = arg1.method3018(566990904);
                        }
                    } else {
                        this.field374 = arg1.method3072((byte) -126);
                    }
                } else {
                    this.field366 = arg1.method3018(arg2 + 566997136);
                }
            } else {
                this.field372 = arg1.method3072((byte) -122);
            }
            ++field365;
        }
    }
}
