import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class32 extends class170 {

    @OriginalMember(owner = "client!db", name = "qc", descriptor = "I")
    public int field605 = 0;

    @OriginalMember(owner = "client!db", name = "uc", descriptor = "Z")
    public boolean field609 = false;

    @OriginalMember(owner = "client!db", name = "vc", descriptor = "I")
    public int field610 = 0;

    @OriginalMember(owner = "client!db", name = "Cc", descriptor = "I")
    public int field617 = -1;

    @OriginalMember(owner = "client!db", name = "xc", descriptor = "I")
    public int field612 = -1;

    @OriginalMember(owner = "client!db", name = "wc", descriptor = "I")
    public int field611 = 0;

    @OriginalMember(owner = "client!db", name = "Ic", descriptor = "I")
    public int field623 = 0;

    @OriginalMember(owner = "client!db", name = "yc", descriptor = "S")
    private short field613 = 0;

    @OriginalMember(owner = "client!db", name = "kc", descriptor = "S")
    private short field599 = 0;

    @OriginalMember(owner = "client!db", name = "Jc", descriptor = "I")
    public int field624 = 0;

    @OriginalMember(owner = "client!db", name = "Bc", descriptor = "Leh;")
    public static class47 field616 = class195.method1282((byte) -4, "Bitte benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!db", name = "Gc", descriptor = "[I")
    public static int[] field621 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!db", name = "Ec", descriptor = "[Llc;")
    public static class102[] field619 = new class102[4];

    @OriginalMember(owner = "client!db", name = "pc", descriptor = "Leh;")
    public static class47 field604 = class195.method1282((byte) -4, "headicons_hint");

    @OriginalMember(owner = "client!db", name = "sc", descriptor = "Leh;")
    public static class47 field607 = class195.method1282((byte) -4, "(U4");

    @OriginalMember(owner = "client!db", name = "lc", descriptor = "I")
    public int field600;

    @OriginalMember(owner = "client!db", name = "nc", descriptor = "I")
    public int field602;

    @OriginalMember(owner = "client!db", name = "oc", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!db", name = "tc", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!db", name = "zc", descriptor = "I")
    public int field614;

    @OriginalMember(owner = "client!db", name = "Ac", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!db", name = "Dc", descriptor = "I")
    public int field618;

    @OriginalMember(owner = "client!db", name = "Fc", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!db", name = "Hc", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!db", name = "Kc", descriptor = "I")
    public int field625;

    @OriginalMember(owner = "client!db", name = "Lc", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!db", name = "Mc", descriptor = "I")
    public int field627;

    @OriginalMember(owner = "client!db", name = "Nc", descriptor = "I")
    public int field628;

    @OriginalMember(owner = "client!db", name = "Oc", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!db", name = "rc", descriptor = "Lub;")
    public class182 field606;

    @OriginalMember(owner = "client!db", name = "mc", descriptor = "Ld;")
    public class30 field601;

    @OriginalMember(owner = "client!db", name = "W", descriptor = "Leh;")
    public class47 field598;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BII)Lgf;")
    public static final class61 method278(byte arg0, int arg1, int arg2) {
        int var3 = -61 / ((arg0 - -10) / 42);
        ++field629;
        class61 var4 = class23.method224(arg1, 484111152);
        if (~arg2 == 0) {
            return var4;
        } else {
            return var4 != null && var4.field1227 != null && var4.field1227.length > arg2 ? var4.field1227[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(Z)V")
    public static final void method279(boolean arg0) {
        if (!arg0) {
            ++field603;
            while (true) {
                class40 var1 = class80.field1725;
                class181 var2;
                synchronized (class80.field1725) {
                    var2 = (class181) class120.field2430.method342(8292);
                }
                if (var2 == null) {
                    return;
                }
                var2.field3474.method462((int) var2.field2283, var2.field3475, (byte) 125, false, var2.field3467);
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "g", descriptor = "(I)Z")
    public final boolean method280(int arg0) {
        if (arg0 >= -92) {
            return true;
        } else {
            ++field626;
            return this.field606 != null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method45(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field622;
        if (this.field606 != null) {
            class22 var11 = ~super.field3330 != 0 && ~super.field3329 == -1 ? class25.method236(false, super.field3330) : null;
            class22 var12 = super.field3323 == -1 || this.field609 || super.field3323 == super.field3314 && var11 != null ? null : class25.method236(false, super.field3323);
            class30 var13 = this.field606.method1210(super.field3306, var11, var12, 120, super.field3290);
            if (var13 != null) {
                var13.method266();
                super.field1928 = var13.field1928;
                if (~this.field613 != -1 && ~this.field599 != -1) {
                    int var14 = class17.field350[arg0];
                    int var15 = class17.field341[arg0];
                    short var16 = this.field613;
                    short var17 = this.field599;
                    int var18 = -var16 / 2;
                    int var19 = -var17 / 2;
                    int var20 = var16 / 2;
                    int var21 = -var17 / 2;
                    int var22 = var14 * var21 + -(var15 * var20) >> 16;
                    int var23 = var15 * var21 - -(var14 * var20) >> 16;
                    int var24 = var15 * var19 - -(var14 * var18) >> 16;
                    int var25 = var14 * var19 - var15 * var18 >> 16;
                    int var26 = class39.method335(super.field3291 + var24, class196.field3827, super.field3281 - -var25, 20896);
                    int var27 = class39.method335(super.field3291 - -var23, class196.field3827, super.field3281 - -var22, 20896);
                    int var28 = -var16 / 2;
                    int var29 = var16 / 2;
                    int var30 = var17 / 2;
                    int var31 = var14 * var28 + var15 * var30 >> 16;
                    int var32 = var17 / 2;
                    int var33 = var14 * var29 + var15 * var32 >> 16;
                    int var34 = var14 * var32 + -(var15 * var29) >> 16;
                    int var35 = var14 * var30 + -(var15 * var28) >> 16;
                    int var36 = class39.method335(super.field3291 + var31, class196.field3827, super.field3281 + var35, 20896);
                    int var37 = class39.method335(super.field3291 + var33, class196.field3827, super.field3281 - -var34, 20896);
                    int var38 = ~var27 >= ~var26 ? var27 : var26;
                    int var39 = ~var36 > ~var37 ? var36 : var37;
                    int var40 = (int) (320.0D * Math.atan2((double) (-var39 + var38), (double) var17)) & 2047;
                    int var41 = ~var37 >= ~var27 ? var37 : var27;
                    int var42 = ~var26 > ~var36 ? var26 : var36;
                    var13.method271(var40);
                    int var43 = (var39 + var41 + var42 + var38) / 4;
                    int var44 = (int) (Math.atan2((double) (var42 - var41), (double) var16) * 320.0D) & 2047;
                    var13.method268(var44);
                    var13.method264(0, -super.field3301 + var43, 0);
                }
                class30 var45 = null;
                if (!this.field609 && ~super.field3279 != 0 && ~super.field3337 != 0) {
                    var45 = class2.method8(super.field3279, -120).method212(super.field3337, (byte) -80);
                    if (var45 != null) {
                        var45.method264(0, -super.field3320, 0);
                    }
                }
                class30 var46 = null;
                if (!this.field609 && this.field601 != null) {
                    if (class18.field362 >= this.field624) {
                        this.field601 = null;
                    }
                    if (this.field610 <= class18.field362 && this.field624 > class18.field362) {
                        var46 = this.field601;
                        var46.method264(-super.field3291 + this.field614, -super.field3301 + this.field628, this.field627 - super.field3281);
                        if (~super.field3282 == -513) {
                            var46.method265();
                            var46.method265();
                            var46.method265();
                        } else if (~super.field3282 != -1025) {
                            if (super.field3282 == 1536) {
                                var46.method265();
                            }
                        } else {
                            var46.method265();
                            var46.method265();
                        }
                    }
                }
                if (var45 != null) {
                    var13 = ((class7) var13).method39(var45);
                }
                if (var46 != null) {
                    var13 = ((class7) var13).method39(var46);
                }
                var13.field560 = true;
                var13.method45(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
                if (var46 != null) {
                    if (super.field3282 != 512) {
                        if (~super.field3282 == -1025) {
                            var46.method265();
                            var46.method265();
                        } else if (super.field3282 == 1536) {
                            var46.method265();
                            var46.method265();
                            var46.method265();
                        }
                    } else {
                        var46.method265();
                    }
                    var46.method264(-this.field614 + super.field3291, -this.field628 + super.field3301, -this.field627 + super.field3281);
                }
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
    public static void method281(byte arg0) {
        field604 = null;
        if (arg0 == 121) {
            field619 = null;
            field607 = null;
            field616 = null;
            field621 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lhd;I)V")
    public final void method282(class68 arg0, int arg1) {
        arg0.field1454 = 0;
        int var3 = arg0.method604((byte) -11);
        boolean var4 = (4 & var3) != 0;
        ++field615;
        int var5 = 1 & var3;
        if ((2 & var3) != 2) {
            this.field599 = 0;
            this.field613 = 0;
        } else {
            this.field613 = (short) (arg0.method604((byte) -123) << 2);
            this.field599 = (short) (arg0.method604((byte) 26) << 2);
        }
        super.field3276 = (var3 >> 3) + 1;
        int[] var6 = new int[12];
        this.field612 = arg0.method567(-1);
        int var7 = -1;
        this.field617 = arg0.method567(-1);
        this.field611 = 0;
        for (int var8 = 0; var8 < 12; ++var8) {
            int var9 = arg0.method604((byte) 103);
            if (var9 == 0) {
                var6[var8] = 0;
            } else {
                int var10 = arg0.method604((byte) -123);
                int var11 = (var9 << 8) - -var10;
                if (~var8 == -1 && ~var11 == -65536) {
                    var7 = arg0.method569(26496);
                    break;
                }
                if (~var11 <= -32769) {
                    int var16 = class110.field2278[var11 + -32768];
                    var6[var8] = class57.method495(1073741824, var16);
                    int var17 = class87.method713(125, var16).field1599;
                    if (~var17 != -1) {
                        this.field611 = var17;
                    }
                } else {
                    var6[var8] = class57.method495(Integer.MIN_VALUE, var11 + -256);
                }
            }
        }
        int[] var12 = new int[5];
        for (int var13 = 0; ~var13 > -6; ++var13) {
            int var15 = arg0.method604((byte) -124);
            if (var15 < 0 || var15 >= class85.field1797[var13].length) {
                var15 = 0;
            }
            var12[var13] = var15;
        }
        super.field3314 = arg0.method569(26496);
        if (super.field3314 == 65535) {
            super.field3314 = -1;
        }
        super.field3319 = arg0.method569(26496);
        if (~super.field3319 == -65536) {
            super.field3319 = -1;
        }
        super.field3275 = super.field3319;
        super.field3328 = arg0.method569(26496);
        if (super.field3328 == 65535) {
            super.field3328 = -1;
        }
        super.field3338 = arg0.method569(26496);
        if (super.field3338 == 65535) {
            super.field3338 = -1;
        }
        super.field3332 = arg0.method569(26496);
        if (~super.field3332 == -65536) {
            super.field3332 = -1;
        }
        super.field3280 = arg0.method569(26496);
        if (~super.field3280 == -65536) {
            super.field3280 = -1;
        }
        super.field3294 = arg0.method569(26496);
        int var14 = -120 % ((63 - arg1) / 52);
        if (super.field3294 == 65535) {
            super.field3294 = -1;
        }
        this.field598 = class173.method1166(arg0.method570((byte) 10), 1).method387(false);
        this.field605 = arg0.method604((byte) -127);
        if (var4) {
            this.field623 = arg0.method569(26496);
        }
        if (this.field606 == null) {
            this.field606 = new class182();
        }
        this.field606.method1205(false, var12, var5 == 1, var7, var6);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)V")
    public static final void method283(int arg0, boolean arg1) {
        ++field620;
        if (!arg1) {
            field619 = null;
        }
        class120 var2 = (class120) class2.field21.method1342((long) arg0, (byte) -20);
        if (var2 != null) {
            for (int var3 = 0; var3 < var2.field2426.length; ++var3) {
                var2.field2426[var3] = -1;
                var2.field2429[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(III)V")
    public static final void method284(int arg0, int arg1, int arg2) {
        class152 var3 = class173.field3351[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field3001 = null;
        }
    }
}
