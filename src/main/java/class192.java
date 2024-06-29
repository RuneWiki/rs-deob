import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class192 extends class220 {

    @OriginalMember(owner = "client!fc", name = "Y", descriptor = "I")
    private int field2677 = 585;

    @OriginalMember(owner = "client!fc", name = "T", descriptor = "Ljava/lang/String;")
    public static String field2672 = "glow1:";

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "[I")
    public static int[] field2668 = new int[2500];

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!fc", name = "R", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!fc", name = "U", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!fc", name = "V", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!fc", name = "W", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!fc", name = "X", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!fc", name = "S", descriptor = "Z")
    public static boolean field2671;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(II)I", line = 7)
    public static final int method1191(int arg0, int arg1) {
        ++field2676;
        if (arg0 != 3676) {
            field2672 = null;
        }
        return arg1 & 255;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILqj;Lqj;)V", line = 20)
    public static final void method1192(int arg0, class238 arg1, class238 arg2) {
        class384.field5744 = arg2;
        ++field2670;
        class24.field420 = arg1;
        class384.field5744.method1476(arg0, (byte) -72);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILai;II)V", line = 33)
    public static final void method1193(int arg0, class129 arg1, int arg2, int arg3) {
        if (arg1.field222 == arg2 && ~arg2 != 0) {
            class15 var4 = class391.method2551(arg2, (byte) -98);
            int var5 = var4.field166;
            if (var5 == 1) {
                arg1.field282 = 0;
                arg1.field233 = 1;
                arg1.field231 = arg3;
                arg1.field212 = 0;
                arg1.field223 = 0;
                class277.method1770(arg1.field5284, 21155, false, arg1.field223, arg1.field5298, var4);
            }
            if (var5 == 2) {
                arg1.field282 = 0;
            }
        } else if (~arg2 == 0 || ~arg1.field222 == 0 || ~class391.method2551(arg2, (byte) -110).field153 <= ~class391.method2551(arg1.field222, (byte) -87).field153) {
            arg1.field231 = arg3;
            arg1.field222 = arg2;
            arg1.field305 = arg1.field309;
            arg1.field282 = 0;
            arg1.field233 = 1;
            arg1.field212 = 0;
            arg1.field223 = 0;
            if (arg1.field222 != -1) {
                class277.method1770(arg1.field5284, 21155, false, arg1.field223, arg1.field5298, class391.method2551(arg1.field222, (byte) -99));
            }
        }
        if (arg0 != 0) {
            field2671 = false;
        }
        ++field2673;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBLil;)V", line = 89)
    public final void method2(int arg0, byte arg1, class265 arg2) {
        if (arg1 != -49) {
            field2668 = null;
        }
        ++field2669;
        if (~arg0 == -1) {
            this.field2677 = arg2.method1685(8104);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIII)V", line = 122)
    public static final void method1194(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class23.field409 != arg0 && ~arg4 != -1 && class7.field64 < 50 && arg3 != -1) {
            class95.field1316[class7.field64] = arg3;
            class171.field2252[class7.field64] = arg4;
            class408.field6111[class7.field64] = arg2;
            class60.field865[class7.field64] = null;
            class358.field5246[class7.field64] = 0;
            class189.field2577[class7.field64] = arg1;
            ++class7.field64;
        }
        ++field2675;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V", line = 150)
    public class192() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "(B)V", line = 153)
    public static void method1195(byte arg0) {
        field2672 = null;
        field2668 = null;
        if (arg0 != -79) {
            method1191(-40, -1);
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(II)[I", line = 168)
    public final int[] method43(int arg0, int arg1) {
        ++field2674;
        if (arg0 != -11543) {
            return null;
        } else {
            int[] var3 = super.field3125.method2005(arg1, (byte) 92);
            if (super.field3125.field4676) {
                int var4 = class58.field831[arg1];
                for (int var5 = 0; class344.field5043 > var5; ++var5) {
                    int var6 = class160.field2096[var5];
                    if (this.field2677 < var6 && 4096 - this.field2677 > var6 && ~var4 < ~(-this.field2677 + 2048) && this.field2677 + 2048 > var4) {
                        int var7 = 2048 - var6;
                        int var8 = var7 < 0 ? -var7 : var7;
                        int var9 = var8 << 12;
                        int var10 = var9 / (-this.field2677 + 2048);
                        var3[var5] = -var10 + 4096;
                    } else if (~var6 < ~(2048 - this.field2677) && 2048 - -this.field2677 > var6) {
                        int var11 = var4 - 2048;
                        int var12 = var11 >= 0 ? var11 : -var11;
                        int var13 = var12 - this.field2677;
                        int var14 = var13 << 12;
                        var3[var5] = var14 / (2048 - this.field2677);
                    } else if (this.field2677 <= var4 && ~(-this.field2677 + 4096) <= ~var4) {
                        if (~var6 <= ~this.field2677 && -this.field2677 + 4096 >= var6) {
                            var3[var5] = 0;
                        } else {
                            int var15 = -var4 + 2048;
                            int var16 = var15 >= 0 ? var15 : -var15;
                            int var17 = var16 << 12;
                            int var18 = var17 / (-this.field2677 + 2048);
                            var3[var5] = -var18 + 4096;
                        }
                    } else {
                        int var19 = var6 + -2048;
                        int var20 = var19 < 0 ? -var19 : var19;
                        int var21 = var20 - this.field2677;
                        int var22 = var21 << 12;
                        var3[var5] = var22 / (-this.field2677 + 2048);
                    }
                }
            }
            return var3;
        }
    }
}
