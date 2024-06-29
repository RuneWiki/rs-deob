import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class377 extends class117 implements class503 {

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "Lei;")
    public class117 field5520;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "Ldi;")
    public static class83 field5515 = new class83(52, 4);

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
    public static int field5530 = -2;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
    public static int field5517;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "I")
    public static int field5523;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "J")
    public static long field5531;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(ILya;)V", line = 5)
    public final void method493(int arg0, class38 arg1) {
        if (arg0 >= -114) {
            this.method496(57);
        }
        field5518++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V", line = 15)
    public static final void method2246(boolean arg0) {
        field5523++;
        if (!arg0) {
            method2248(-102, -80, 34, -93, null, -120);
        }
        if (class118.field1759 != null) {
            class118.field1759.method2610((byte) -97);
        }
        if (class102.field1544 != null) {
            class102.field1544.method2610((byte) -97);
        }
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)I", line = 33)
    public final int method499(int arg0) {
        if (arg0 != -15561) {
            this.method492(43);
        }
        field5525++;
        return 0;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(Z)V", line = 44)
    public static void method2247(boolean arg0) {
        field5515 = null;
        if (arg0) {
            method2246(false);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIILlh;I)V", line = 55)
    public static final void method2248(int arg0, int arg1, int arg2, int arg3, class365 arg4, int arg5) {
        field5527++;
        if (arg4.field5348 == -1 && arg4.field5352 == null) {
            return;
        }
        int var6 = 0;
        int var7 = class20.field269.field7640 * arg4.field5354 >> 8;
        if (arg5 > arg4.field5336) {
            var6 += arg5 - arg4.field5336;
        } else if (arg5 < arg4.field5347) {
            var6 += arg4.field5347 - arg5;
        }
        int var8 = -76 / ((arg0 + 59) / 60);
        if (arg2 > arg4.field5359) {
            var6 += arg2 - arg4.field5359;
        } else if (arg4.field5335 > arg2) {
            var6 += arg4.field5335 - arg2;
        }
        if (arg4.field5343 == 0 || var6 - 64 > arg4.field5343 || class20.field269.field7640 == 0 || arg4.field5339 != arg3) {
            if (arg4.field5356 != null) {
                class361.field5267.method582(arg4.field5356);
                arg4.field5356 = null;
            }
            if (arg4.field5342 != null) {
                class361.field5267.method582(arg4.field5342);
                arg4.field5342 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var9 = (arg4.field5343 - var6) * var7 / arg4.field5343;
        if (arg4.field5356 != null) {
            arg4.field5356.method2990(var9);
        } else if (arg4.field5348 >= 0) {
            class191 var10 = class191.method1202(class167.field2509, arg4.field5348, 0);
            if (var10 != null) {
                class452 var11 = var10.method1201().method2666(class305.field4166);
                class505 var12 = class505.method2998(var11, 100, var9);
                var12.method3010(-1);
                class361.field5267.method583(var12);
                arg4.field5356 = var12;
            }
        }
        if (arg4.field5342 != null) {
            arg4.field5342.method2990(var9);
            if (arg4.field5342.method1564(4)) {
                return;
            }
            arg4.field5342 = null;
        } else if (arg4.field5352 != null && (arg4.field5344 -= arg1) <= 0) {
            int var13 = (int) (Math.random() * (double) arg4.field5352.length);
            class191 var14 = class191.method1202(class167.field2509, arg4.field5352[var13], 0);
            if (var14 != null) {
                class452 var15 = var14.method1201().method2666(class305.field4166);
                class505 var16 = class505.method2998(var15, 100, var9);
                var16.method3010(0);
                class361.field5267.method583(var16);
                arg4.field5342 = var16;
                arg4.field5344 = arg4.field5358 + (int) (Math.random() * (double) (arg4.field5338 - arg4.field5358));
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lya;ZLhq;Lcu;)V", line = 180)
    public static final void method2249(class38 arg0, boolean arg1, class109 arg2, class146 arg3) {
        field5511++;
        class16 var4 = arg3.method982(arg0, (byte) 98);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method102();
        if (!arg1) {
            method2246(true);
        }
        if (var5 < var4.method98()) {
            var5 = var4.method98();
        }
        byte var6 = 10;
        int var7 = arg2.field1643;
        int var8 = arg2.field1642;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg3.field2082 != null) {
            var9 = class117.field1753.method2875(class411.field6016, 0, null, arg3.field2082, null);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class411.field6016[var12];
                if (var12 < (var9 - 1)) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class24.field316.method602(var13);
                if (var10 < var14) {
                    var10 = var14;
                }
            }
            var11 = var9 * class24.field316.method599() + (class24.field316.method601() / 2);
        }
        int var15 = var5 / 2 + arg2.field1643;
        int var16 = arg2.field1642;
        if (var7 < (class350.field5142 + var5)) {
            var15 = var5 / 2 + class350.field5142 + var10 / 2 + var6 + 5;
            var7 = class350.field5142;
        } else if (class350.field5126 - var5 < var7) {
            var7 = class350.field5126 - var5;
            var15 = class350.field5126 - (var5 / 2) - (var10 / 2) - var6 - 5;
        }
        if (var8 < (class350.field5129 + var5)) {
            var8 = class350.field5129;
            var16 = var5 / 2 + var6 + class350.field5129;
        } else if (var8 > class350.field5140 - var5) {
            var16 = class350.field5140 - (var5 / 2) - var6 - var11;
            var8 = class350.field5140 - var5;
        }
        int var17 = (int) (Math.atan2((double) (var7 - arg2.field1643), (double) (var8 - arg2.field1642)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        var4.method92((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg3.field2082 != null) {
            var18 = var15 - (var10 / 2) - 5;
            var19 = var16;
            var20 = var18 + var10 + 10;
            var21 = class24.field316.method599() * var9 + var16 + 3;
            if (arg3.field2115 != 0) {
                arg0.method325(var18, var20 - var18, arg3.field2115, 1, var16, var21 - var16);
            }
            if (arg3.field2095 != 0) {
                arg0.method233(var21 - var16, var16, var20 - var18, var18, !arg1, arg3.field2095);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class411.field6016[var22];
                if (var22 < var9 - 1) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class24.field316.method600(arg0, var23, var15, var16, arg3.field2100, true);
                var16 += class24.field316.method599();
            }
        }
        if (arg3.field2113 == -1 && arg3.field2082 == null) {
            return;
        }
        int var24 = var5 >> 1;
        class454 var25 = new class454(arg2);
        var25.field6664 = var19;
        var25.field6672 = var7 - var24;
        var25.field6675 = var18;
        var25.field6667 = var8 + var24;
        var25.field6673 = var7 + var24;
        var25.field6670 = var21;
        var25.field6676 = var8 - var24;
        var25.field6668 = var20;
        class212.field2958.method2809(var25, 2);
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)I", line = 326)
    public final int method490(int arg0) {
        field5514++;
        if (arg0 != -29679) {
            this.field5520 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lya;IZLij;III)V", line = 338)
    public final void method498(class38 arg0, int arg1, boolean arg2, class291 arg3, int arg4, int arg5, int arg6) {
        if (arg6 == -1) {
            field5517++;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZILya;I)Z", line = 348)
    public final boolean method500(boolean arg0, int arg1, class38 arg2, int arg3) {
        if (!arg0) {
            this.field5520 = null;
        }
        field5513++;
        return false;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)I", line = 359)
    public final int method496(int arg0) {
        int var2 = -100 / ((-arg0 - 4) / 61);
        field5526++;
        return 0;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lya;B)Lmf;", line = 371)
    public final class289 method484(class38 arg0, byte arg1) {
        if (arg1 <= 111) {
            this.method499(36);
        }
        field5522++;
        return null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILya;)V", line = 384)
    public final void method482(int arg0, class38 arg1) {
        field5519++;
        if (arg0 >= -56) {
            this.field5520 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(ILya;)V", line = 394)
    public final void method486(int arg0, class38 arg1) {
        field5529++;
        if (arg0 != 9229) {
            field5515 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)Z", line = 404)
    public final boolean method489(int arg0) {
        int var2 = -2 / ((arg0 - 23) / 62);
        field5521++;
        return false;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLya;I)Lt;", line = 419)
    public final class471 method488(byte arg0, class38 arg1, int arg2) {
        if (arg0 != 124) {
            this.method490(-20);
        }
        field5512++;
        return null;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V", line = 430)
    public final void method485(int arg0) {
        if (arg0 >= -92) {
            field5531 = -66L;
        }
        field5524++;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(IIILei;)V", line = 442)
    public class377(int arg0, int arg1, int arg2, class117 arg3) {
        super(arg0, arg1, arg2, false, false);
        this.field5520 = arg3;
    }

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)Z", line = 453)
    public final boolean method492(int arg0) {
        if (arg0 == -1) {
            field5528++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "(I)V", line = 465)
    public final void method495(int arg0) {
        if (arg0 >= -104) {
            this.method493(84, null);
        }
        field5516++;
    }
}
