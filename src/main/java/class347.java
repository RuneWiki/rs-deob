import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class347 extends class210 {

    @OriginalMember(owner = "client!gm", name = "I", descriptor = "I")
    private int field5104 = 4096;

    @OriginalMember(owner = "client!gm", name = "N", descriptor = "I")
    private int field5109 = 0;

    @OriginalMember(owner = "client!gm", name = "K", descriptor = "Lvm;")
    public static class332 field5106 = new class332(0, -1);

    @OriginalMember(owner = "client!gm", name = "O", descriptor = "Lbt;")
    public static class363 field5110 = new class363(64);

    @OriginalMember(owner = "client!gm", name = "J", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!gm", name = "L", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!gm", name = "M", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!gm", name = "P", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)[[I")
    public final int[][] method58(int arg0, int arg1) {
        ++field5111;
        int[][] var3 = super.field2967.method1572(125, arg0);
        if (arg1 <= 94) {
            method2244((byte) -97);
        }
        if (super.field2967.field3454) {
            int[][] var4 = this.method1444(1, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class202.field2852; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~var12 <= ~this.field5109) {
                    if (this.field5104 >= var12) {
                        var8[var11] = var12;
                    } else {
                        var8[var11] = this.field5104;
                    }
                } else {
                    var8[var11] = this.field5109;
                }
                if (~var13 <= ~this.field5109) {
                    if (var13 <= this.field5104) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field5104;
                    }
                } else {
                    var9[var11] = this.field5109;
                }
                if (var14 >= this.field5109) {
                    if (~var14 < ~this.field5104) {
                        var10[var11] = this.field5104;
                    } else {
                        var10[var11] = var14;
                    }
                } else {
                    var10[var11] = this.field5109;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(B)I")
    public static final int method2243(byte arg0) {
        if (arg0 != 112) {
            return 46;
        } else {
            ++field5105;
            return ((~class450.field6629 == -1 ? 0 : 1) << 21) + ((class134.field1847 ? 1 : 0) << 19) + (class213.field3010 << 11 & 6144) + ((class182.field2561 ? 1 : 0) << 10) + ((!class62.field826 ? 0 : 1) << 8) + ((!class367.field5307 ? 0 : 1) << 5) + ((!class323.field4773 ? 0 : 1) << 4) + ((class349.field5124 ? 1 : 0) << 3) + (class52.field652 & 7) + ((class231.field3482 ? 1 : 0) << 6) + ((!class403.field5834 ? 0 : 1) << 9) - -((!class307.field4535 ? 0 : 1) << 13) + ((class13.field224 ? 1 : 0) << 15) + ((class76.field969 ? 1 : 0) << 16) - (-(class376.field5491 << 17) - ((class372.field5437 == 0 ? 0 : 1) << 20) - (((~class178.field2539 != -1 ? 1 : 0) << 22) + (class145.method1007(arg0 + -14276) << 23) + (class337.field4974 << 25) - (-((!class29.field418 ? 0 : 1) << 27) - (class322.field4739 << 28))));
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IB)[I")
    public final int[] method361(int arg0, byte arg1) {
        ++field5108;
        if (arg1 != -38) {
            field5110 = null;
        }
        int[] var3 = super.field2950.method1892(arg0, (byte) -115);
        if (super.field2950.field4111) {
            int[] var4 = this.method1447(arg0, -128, 0);
            for (int var5 = 0; ~class202.field2852 < ~var5; ++var5) {
                int var6 = var4[var5];
                if (~var6 > ~this.field5109) {
                    var3[var5] = this.field5109;
                } else if (var6 > this.field5104) {
                    var3[var5] = this.field5104;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(B)V")
    public static void method2244(byte arg0) {
        int var1 = -4 % ((arg0 - -49) / 47);
        field5110 = null;
        field5106 = null;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IILat;)V")
    public final void method56(int arg0, int arg1, class256 arg2) {
        if (arg1 != -11941) {
            field5106 = null;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field2956 = arg2.method1738((byte) -62) == 1;
                }
            } else {
                this.field5104 = arg2.method1767(arg1 + 1930505517);
            }
        } else {
            this.field5109 = arg2.method1767(1930493576);
        }
        ++field5107;
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V")
    public class347() {
        super(1, false);
    }
}
