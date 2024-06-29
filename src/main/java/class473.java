import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class473 extends class134 {

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
    public static int field6543 = 0;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "[I")
    public static int[] field6544 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "F")
    public static float field6548;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
    public static int field6542;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
    public static int field6545;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
    public static int field6546;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    public static int field6547;

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
    public static int field6549;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "I")
    public static int field6552;

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "I")
    public static int field6553;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
    public static int field6554;

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "Lni;")
    public static class522 field6550;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)V", line = 3)
    public static void method2662(int arg0) {
        field6544 = null;
        field6550 = null;
        int var1 = -56 % ((arg0 - -52) / 45);
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)I", line = 16)
    public final int method2663(byte arg0) {
        if (arg0 <= 119) {
            return -123;
        } else {
            ++field6552;
            return super.field1708;
        }
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lkda;)V", line = 27)
    public class473(class391 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)I", line = 30)
    public final int method58(int arg0) {
        ++field6545;
        return arg0 != 0 ? -93 : 0;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)V", line = 41)
    public final void method60(byte arg0) {
        ++field6546;
        int var2 = super.field1712.method2280(-101).method3189(-1);
        if (var2 < 96) {
            super.field1708 = 0;
        }
        if (arg0 < 118) {
            field6548 = 0.5277947F;
        }
        if (super.field1708 > 1 && ~var2 > -129) {
            super.field1708 = 1;
        }
        if (super.field1708 > 2 && var2 < 192) {
            super.field1708 = 2;
        }
        if (super.field1708 < 0 || ~super.field1708 < -4) {
            super.field1708 = this.method58(0);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIII)V", line = 69)
    public static final void method2664(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6549;
        int var6 = class105.method716(false, class29.field238, class759.field10576, arg5);
        int var7 = class105.method716(false, class29.field238, class759.field10576, arg0);
        int var8 = class105.method716(false, class165.field2070, class122.field1604, arg1);
        int var9 = class105.method716(false, class165.field2070, class122.field1604, arg3);
        if (arg2 != -21327) {
            field6550 = null;
        }
        for (int var10 = var6; var7 >= var10; ++var10) {
            class168.method980(arg4, class300.field4036[var10], var8, var9, (byte) 13);
        }
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(ILkda;)V", line = 97)
    public class473(int arg0, class391 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)V", line = 101)
    public final void method55(int arg0, int arg1) {
        int var3 = -60 / ((-26 - arg0) / 41);
        super.field1708 = arg1;
        ++field6547;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lab;)V", line = 115)
    public static final void method2665(class669 arg0) {
        if (class474.field6562 < 65535) {
            class551 var1 = arg0.field9295;
            class85.field1176[class474.field6562] = arg0;
            class284.field3760[class474.field6562] = false;
            ++class474.field6562;
            int var2 = arg0.field9298;
            if (arg0.field9293) {
                var2 = 0;
            }
            int var3 = arg0.field9298;
            if (arg0.field9299) {
                var3 = class307.field4170 - 1;
            }
            for (int var4 = var2; var4 <= var3; ++var4) {
                int var5 = 0;
                int var6 = var1.method3136(28699) - var1.method3133(-96) + class522.field7044 >> class443.field6172;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = var1.method3136(28699) + var1.method3133(127) - class522.field7044 >> class443.field6172;
                if (var7 >= class480.field6629) {
                    var7 = class480.field6629 - 1;
                }
                for (int var8 = var6; var8 <= var7; ++var8) {
                    short var9 = arg0.field9300[var5++];
                    int var10 = (var1.method3130(7019) - var1.method3133(126) + class522.field7044 >> class443.field6172) + (var9 >>> 8);
                    int var11 = (var9 & 255) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 >= class68.field743) {
                        var11 = class68.field743 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; ++var12) {
                        long var13 = class180.field2218[var4][var12][var8];
                        if ((var13 & 65535L) == 0L) {
                            class180.field2218[var4][var12][var8] = var13 | (long) class474.field6562;
                        } else if ((var13 & 4294901760L) == 0L) {
                            class180.field2218[var4][var12][var8] = var13 | (long) class474.field6562 << 16;
                        } else if ((var13 & 281470681743360L) == 0L) {
                            class180.field2218[var4][var12][var8] = var13 | (long) class474.field6562 << 32;
                        } else if ((var13 & -281474976710656L) == 0L) {
                            class180.field2218[var4][var12][var8] = var13 | (long) class474.field6562 << 48;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(II)I", line = 207)
    public final int method57(int arg0, int arg1) {
        ++field6554;
        int var3 = super.field1712.method2280(-108).method3189(-1);
        if (var3 < 96) {
            return 3;
        } else if (arg0 > 1 && var3 < 128) {
            return 3;
        } else {
            if (arg1 != 29053) {
                this.method2667(125);
            }
            return arg0 > 3 && var3 < 192 ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIZII)V", line = 233)
    public static final void method2666(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (-arg1 + arg3 >= class122.field1604 && arg1 + arg3 <= class165.field2070 && class759.field10576 <= arg0 - arg1 && arg0 - -arg1 <= class29.field238) {
            class102.method699((byte) -127, arg3, arg4, arg1, arg0);
        } else {
            class123.method791((byte) -109, arg0, arg1, arg3, arg4);
        }
        if (!arg2) {
            method2662(-17);
        }
        ++field6542;
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "(I)Z", line = 250)
    public final boolean method2667(int arg0) {
        ++field6551;
        if (arg0 != -1) {
            method2665((class669) null);
        }
        int var2 = super.field1712.method2280(-103).method3189(arg0);
        return ~var2 <= -97;
    }
}
