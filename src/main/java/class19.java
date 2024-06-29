import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class19 {

    @OriginalMember(owner = "client!na", name = "i", descriptor = "J")
    public long field309 = 0L;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "Lmb;")
    public static class96 field310 = class243.method1708(")4p=", (byte) 92);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field301 = 0;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "Lmb;")
    public static class96 field304 = class243.method1708("Okay", (byte) 107);

    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
    public static int field312 = -1;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "[I")
    public static int[] field307 = new int[32];

    @OriginalMember(owner = "client!na", name = "b", descriptor = "Lmb;")
    public static class96 field302 = class243.method1708(")1o", (byte) 115);

    @OriginalMember(owner = "client!na", name = "q", descriptor = "[Z")
    public static boolean[] field317;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "[I")
    public static int[] field318;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "Lqj;")
    public static class186 field316;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public int field305;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public int field306;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public int field308;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "I")
    public int field314;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    public int field315;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "Lnb;")
    public class108 field303;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "Lnb;")
    public class108 field311;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public static void method141(int arg0) {
        if (arg0 != -12052) {
            field302 = null;
        }
        field304 = null;
        field317 = null;
        field310 = null;
        field316 = null;
        field307 = null;
        field318 = null;
        field302 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILwk;II)V")
    public static final void method142(int arg0, class47 arg1, int arg2, int arg3) {
        field313++;
        if ((arg0 & 0x40) != 0) {
            int var4 = class1.field4.method1635(2);
            int var5 = class1.field4.method1669(arg2 + 555);
            arg1.method1800(var4, true, class236.field4053, var5);
            arg1.field4560 = class236.field4053 + 300;
            arg1.field4565 = class1.field4.method1635(arg2 ^ 0xFFFFFED6);
        }
        if ((arg0 & 0x80) != 0) {
            int var6 = class1.field4.method1623(true);
            if (var6 == 65535) {
                var6 = -1;
            }
            int var7 = class1.field4.method1645(-84);
            class215.method1490(-3, var7, var6, arg1);
        }
        if ((arg0 & 0x100) != 0) {
            arg1.field4574 = class1.field4.method1635(2);
            arg1.field4572 = class1.field4.method1651(4139);
            arg1.field4523 = class1.field4.method1635(2);
            arg1.field4575 = class1.field4.method1651(4139);
            arg1.field4506 = class1.field4.method1623(true) + class236.field4053;
            arg1.field4559 = class1.field4.method1663((byte) -71) + class236.field4053;
            arg1.field4541 = class1.field4.method1635(2);
            arg1.field4563 = 1;
            arg1.field4558 = 0;
        }
        if ((arg0 & 0x200) != 0) {
            int var8 = class1.field4.method1635(2);
            int var9 = class1.field4.method1645(arg2 ^ 0x145);
            arg1.method1800(var8, true, class236.field4053, var9);
        }
        if ((arg0 & 0x1) != 0) {
            arg1.field4537 = class1.field4.method1618(-111);
            if (arg1.field4537 == 65535) {
                arg1.field4537 = -1;
            }
        }
        if ((arg0 & 0x4) != 0) {
            arg1.field4509 = class1.field4.method1634(-107);
            if (arg1.field4509.method687(0, arg2 ^ 0xFFFFFED4) == 126) {
                arg1.field4509 = arg1.field4509.method710(122, 1);
                class226.method1540(arg1.method365(arg2 + 369), 2, (byte) -79, arg1.field4509);
            } else if (class236.field4047 == arg1) {
                class226.method1540(arg1.method365(89), 2, (byte) 104, arg1.field4509);
            }
            arg1.field4568 = 0;
            arg1.field4504 = 0;
            arg1.field4556 = 150;
        }
        if (arg2 != -300) {
            method142(-126, (class47) null, -123, 16);
        }
        if ((arg0 & 0x10) != 0) {
            arg1.field4520 = class1.field4.method1623(true);
            arg1.field4554 = class1.field4.method1663((byte) -93);
        }
        if ((arg0 & 0x20) != 0) {
            int var10 = class1.field4.method1635(2);
            byte[] var11 = new byte[var10];
            class239 var12 = new class239(var11);
            class1.field4.method1630(var10, (byte) 0, var11, 0);
            class140.field2514[arg3] = var12;
            arg1.method367((byte) -120, var12);
        }
        if ((arg0 & 0x400) != 0) {
            arg1.field4543 = class1.field4.method1623(true);
            int var13 = class1.field4.method1637((byte) -87);
            arg1.field4553 = 0;
            if (arg1.field4543 == 65535) {
                arg1.field4543 = -1;
            }
            arg1.field4548 = 0;
            arg1.field4518 = class236.field4053 + (var13 & 0xFFFF);
            if (class236.field4053 < arg1.field4518) {
                arg1.field4548 = -1;
            }
            arg1.field4579 = var13 >> 16;
            if (arg1.field4543 != -1 && class236.field4053 == arg1.field4518) {
                int var14 = class146.method1082(arg1.field4543, (byte) 123).field3175;
                if (var14 != -1) {
                    class67 var15 = class189.method1332(var14, 2);
                    if (var15 != null && var15.field1140 != null) {
                        class71.method481(arg1.field4533, true, var15, arg1.field4511, 0, class236.field4047 == arg1);
                    }
                }
            }
        }
        if ((arg0 & 0x2) == 0) {
            return;
        }
        int var16 = class1.field4.method1618(-127);
        int var17 = class1.field4.method1651(4139);
        int var18 = class1.field4.method1651(arg2 + 4439);
        int var19 = class1.field4.field4124;
        boolean var20 = (var16 & 0x8000) != 0;
        if (arg1.field828 != null && arg1.field812 != null) {
            long var21 = arg1.field828.method685((byte) -7);
            boolean var23 = false;
            if (var17 <= 1) {
                if (var20 || (!class31.field487 || class265.field4625) && !class74.field1277) {
                    for (int var24 = 0; var24 < class231.field3974; var24++) {
                        if (class7.field132[var24] == var21) {
                            var23 = true;
                            break;
                        }
                    }
                } else {
                    var23 = true;
                }
            }
            if (!var23 && class71.field1226 == 0) {
                class53.field934.field4124 = 0;
                class1.field4.method1650(var18, 0, -128, class53.field934.field4144);
                class53.field934.field4124 = 0;
                int var25 = -1;
                class96 var26;
                if (var20) {
                    var16 &= 0x7FFF;
                    class267 var27 = class145.method1071((byte) -9, class53.field934);
                    var25 = var27.field4650;
                    var26 = var27.field4653.method1447(class53.field934, (byte) 78);
                } else {
                    var26 = class18.method139(class127.method973(class53.field934, (byte) 114).method682((byte) -68));
                }
                arg1.field4509 = var26.method678((byte) -92);
                arg1.field4504 = var16 & 0xFF;
                arg1.field4556 = 150;
                arg1.field4568 = var16 >> 8;
                if (var17 == 2) {
                    class29.method193(-1, (class96) null, var26, var25, var20 ? 17 : 1, class36.method289(-5615, new class96[] { class3.field71, arg1.method365(arg2 + 197) }));
                } else if (var17 == 1) {
                    class29.method193(-1, (class96) null, var26, var25, var20 ? 17 : 1, class36.method289(-5615, new class96[] { class29.field479, arg1.method365(107) }));
                } else {
                    class29.method193(-1, (class96) null, var26, var25, var20 ? 17 : 2, arg1.method365(70));
                }
            }
        }
        class1.field4.field4124 = var19 + var18;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field307[var1] = var0 - 1;
            var0 += var0;
        }
        field317 = new boolean[100];
        field318 = new int[4096];
        field316 = new class186();
        field319 = 20;
        field320 = 0;
    }
}
