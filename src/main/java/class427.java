import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class427 {

    @OriginalMember(owner = "client!mfa", name = "d", descriptor = "I")
    public int field5621 = -1;

    @OriginalMember(owner = "client!mfa", name = "j", descriptor = "I")
    public int field5627 = -1;

    @OriginalMember(owner = "client!mfa", name = "h", descriptor = "I")
    public int field5625 = -1;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "I")
    public int field5618;

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!mfa", name = "c", descriptor = "I")
    public int field5620;

    @OriginalMember(owner = "client!mfa", name = "e", descriptor = "I")
    public int field5622;

    @OriginalMember(owner = "client!mfa", name = "g", descriptor = "I")
    public int field5624;

    @OriginalMember(owner = "client!mfa", name = "i", descriptor = "I")
    public int field5626;

    @OriginalMember(owner = "client!mfa", name = "k", descriptor = "I")
    public int field5628;

    @OriginalMember(owner = "client!mfa", name = "l", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!mfa", name = "f", descriptor = "[I")
    public static int[] field5623;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(B)V")
    public static void method2471(byte arg0) {
        field5623 = null;
        if (arg0 != -12) {
            field5623 = null;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(BIII)I")
    public static final int method2472(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        if (arg0 < 118) {
            method2471((byte) -59);
        }
        field5629++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Ltia;Ljha;IBI)V")
    public static final void method2473(class740 arg0, class33 arg1, int arg2, byte arg3, int arg4) {
        field5619++;
        if ((arg2 & 0x1) != 0) {
            arg1.field347 = arg0.method1551(255);
            if (arg1.field4764 == 0) {
                arg1.method2171(arg1.field347, false);
                arg1.field347 = -1;
            }
        }
        byte var5 = -1;
        if ((arg2 & 0x800) != 0) {
            var5 = arg0.method1512(23037);
        }
        if ((arg2 & 0x1000) != 0) {
            int var6 = arg0.method1511(128);
            int[] var7 = new int[var6];
            int[] var8 = new int[var6];
            int[] var9 = new int[var6];
            for (int var10 = 0; var10 < var6; var10++) {
                int var11 = arg0.method1553((byte) -118);
                if (var11 == 65535) {
                    var11 = -1;
                }
                var7[var10] = var11;
                var8[var10] = arg0.method1492(-68);
                var9[var10] = arg0.method1551(255);
            }
            class291.method1758(var9, var7, arg1, var8, true);
        }
        if ((arg2 & 0x80) != 0) {
            int[] var12 = new int[4];
            for (int var13 = 0; var13 < 4; var13++) {
                var12[var13] = arg0.method1553((byte) 37);
                if (var12[var13] == 65535) {
                    var12[var13] = -1;
                }
            }
            int var14 = arg0.method1522(13763);
            class780.method4276(var12, var14, (byte) 75, arg1);
        }
        if ((arg2 & 0x20000) != 0) {
            int var15 = arg0.method1522(13763);
            int[] var16 = new int[var15];
            int[] var17 = new int[var15];
            for (int var18 = 0; var18 < var15; var18++) {
                int var19 = arg0.method1489(2);
                if ((var19 & 0xC000) == 49152) {
                    int var20 = arg0.method1553((byte) -120);
                    var16[var18] = class77.method473(var20, var19 << 16);
                } else {
                    var16[var18] = var19;
                }
                var17[var18] = arg0.method1531((byte) -2);
            }
            arg1.method2170(var16, var17, 256);
        }
        if ((arg2 & 0x40000) != 0) {
            arg1.field4713 = arg0.method1554(27806);
            arg1.field4686 = arg0.method1504(-5434);
            arg1.field4699 = arg0.method1503(16711680);
            arg1.field4674 = (byte) arg0.method1522(13763);
            arg1.field4711 = class693.field8900 + arg0.method1489(2);
            arg1.field4718 = class693.field8900 + arg0.method1553((byte) -114);
        }
        if ((arg2 & 0x10000) != 0) {
            int var21 = arg0.method1489(2);
            int var22 = arg0.method1527(1879355664);
            if (var21 == 65535) {
                var21 = -1;
            }
            int var23 = arg0.method1511(128);
            int var24 = var23 & 0x7;
            int var25 = (var23 & 0x7E) >> 3;
            if (var25 == 15) {
                var25 = -1;
            }
            arg1.method2183(var22, -91, var25, 2, var21, var24);
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field342 = arg0.method1492(-83) == 1;
        }
        if ((arg2 & 0x8) != 0) {
            class282.field3657[arg4] = arg0.method1554(27806);
        }
        if ((arg2 & 0x100) != 0) {
            int var26 = arg0.method1551(255);
            arg1.field4708 = arg0.method1492(-33);
            arg1.field4751 = arg0.method1511(128);
            arg1.field4703 = var26 & 0x7FFF;
            arg1.field4689 = (var26 & 0x8000) != 0;
            arg1.field4702 = class693.field8900 - (-arg1.field4703 - arg1.field4708);
        }
        if ((arg2 & 0x4000) != 0) {
            arg1.field4736 = arg0.method1503(16711680);
            arg1.field4745 = arg0.method1554(27806);
            arg1.field4727 = arg0.method1512(23037);
            arg1.field4680 = arg0.method1503(16711680);
            arg1.field4675 = arg0.method1551(255) + class693.field8900;
            arg1.field4690 = arg0.method1553((byte) -121) + class693.field8900;
            arg1.field4693 = arg0.method1492(-18);
            if (arg1.field333) {
                arg1.field4736 += arg1.field348;
                arg1.field4680 += arg1.field372;
                arg1.field4727 += arg1.field348;
                arg1.field4745 += arg1.field372;
                arg1.field4764 = 0;
            } else {
                arg1.field4736 += arg1.field4767[0];
                arg1.field4727 += arg1.field4767[0];
                arg1.field4745 += arg1.field4758[0];
                arg1.field4680 += arg1.field4758[0];
                arg1.field4764 = 1;
            }
            arg1.field4765 = 0;
        }
        if ((arg2 & 0x2000) != 0) {
            int var27 = arg0.method1531((byte) -2);
            if (var27 == 65535) {
                var27 = -1;
            }
            int var28 = arg0.method1526((byte) 125);
            int var29 = arg0.method1522(13763);
            int var30 = var29 & 0x7;
            int var31 = (var29 & 0x7C) >> 3;
            if (var31 == 15) {
                var31 = -1;
            }
            arg1.method2183(var28, 112, var31, 1, var27, var30);
        }
        int var32 = 34 % ((20 - arg3) / 58);
        if ((arg2 & 0x2) != 0) {
            int var33 = arg0.method1509(true);
            if (var33 > 0) {
                for (int var34 = 0; var34 < var33; var34++) {
                    int var35 = -1;
                    int var36 = -1;
                    int var37 = arg0.method1505((byte) -6);
                    int var38 = -1;
                    if (var37 == 32767) {
                        var37 = arg0.method1505((byte) -6);
                        var36 = arg0.method1505((byte) -6);
                        var35 = arg0.method1505((byte) -6);
                        var38 = arg0.method1505((byte) -6);
                    } else if (var37 == 32766) {
                        var37 = -1;
                    } else {
                        var36 = arg0.method1505((byte) -6);
                    }
                    int var39 = arg0.method1505((byte) -6);
                    int var40 = arg0.method1509(true);
                    arg1.method2168(var40, class693.field8900, var36, var37, var39, -70, var35, var38);
                }
            }
        }
        if ((arg2 & 0x10) != 0) {
            int var41 = arg0.method1489(2);
            if (var41 == 65535) {
                var41 = -1;
            }
            arg1.field4723 = var41;
        }
        if ((arg2 & 0x80000) != 0) {
            arg1.field344 = arg0.method1509(true) == 1;
        }
        if ((arg2 & 0x40) != 0) {
            int var42 = arg0.method1551(255);
            if (var42 == 65535) {
                var42 = -1;
            }
            int var43 = arg0.method1527(1879355664);
            int var44 = arg0.method1511(128);
            int var45 = var44 & 0x7;
            int var46 = var44 >> 3 & 0xF;
            if (var46 == 15) {
                var46 = -1;
            }
            arg1.method2183(var43, 109, var46, 0, var42, var45);
        }
        if ((arg2 & 0x200) != 0) {
            arg1.field4709 = arg0.method1540((byte) -116);
            if (arg1.field4709.charAt(0) == '~') {
                arg1.field4709 = arg1.field4709.substring(1);
                class416.method2405(0, arg1.method191(-83, false), arg1.method180(true, 14), arg1.field358, arg1.field4709, 2, -1);
            } else if (class422.field5564 == arg1) {
                class416.method2405(0, arg1.method191(123, false), arg1.method180(true, -121), arg1.field358, arg1.field4709, 2, -1);
            }
            arg1.field4730 = 0;
            arg1.field4664 = 150;
            arg1.field4710 = 0;
        }
        if ((arg2 & 0x4) != 0) {
            int var47 = arg0.method1511(128);
            byte[] var48 = new byte[var47];
            class234 var49 = new class234(var48);
            arg0.method1495(var47, 0, (byte) -127, var48);
            class26.field229[arg4] = var49;
            arg1.method177(var49, -1);
        }
        if (!arg1.field333) {
            return;
        }
        if (var5 == 127) {
            arg1.method184(arg1.field372, arg1.field348, 104);
            return;
        }
        byte var50;
        if (var5 == -1) {
            var50 = class282.field3657[arg4];
        } else {
            var50 = var5;
        }
        class393.method2281(var50, arg1, 0);
        arg1.method176(arg1.field348, var50, (byte) -107, arg1.field372);
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(Lfda;)V")
    public class427(class381 arg0) {
    }
}
