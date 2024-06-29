import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class361 extends class290 implements class518 {

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "B")
    private byte field5599;

    @OriginalMember(owner = "client!qn", name = "J", descriptor = "B")
    private byte field5608;

    @OriginalMember(owner = "client!qn", name = "B", descriptor = "Z")
    private boolean field5600;

    @OriginalMember(owner = "client!qn", name = "M", descriptor = "Z")
    private boolean field5611;

    @OriginalMember(owner = "client!qn", name = "U", descriptor = "B")
    private byte field5619;

    @OriginalMember(owner = "client!qn", name = "S", descriptor = "Z")
    private boolean field5617;

    @OriginalMember(owner = "client!qn", name = "C", descriptor = "S")
    private short field5601;

    @OriginalMember(owner = "client!qn", name = "W", descriptor = "Z")
    private boolean field5621;

    @OriginalMember(owner = "client!qn", name = "V", descriptor = "Le;")
    public class530 field5620;

    @OriginalMember(owner = "client!qn", name = "cb", descriptor = "Li;")
    private class515 field5627;

    @OriginalMember(owner = "client!qn", name = "F", descriptor = "Z")
    public static boolean field5604 = false;

    @OriginalMember(owner = "client!qn", name = "Q", descriptor = "[I")
    public static int[] field5615 = new int[2];

    @OriginalMember(owner = "client!qn", name = "R", descriptor = "I")
    public static int field5616 = 52;

    @OriginalMember(owner = "client!qn", name = "x", descriptor = "I")
    public static int field5597;

    @OriginalMember(owner = "client!qn", name = "y", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!qn", name = "E", descriptor = "I")
    public static int field5603;

    @OriginalMember(owner = "client!qn", name = "G", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!qn", name = "H", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!qn", name = "I", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!qn", name = "K", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!qn", name = "L", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!qn", name = "N", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!qn", name = "O", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!qn", name = "P", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!qn", name = "T", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!qn", name = "X", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!qn", name = "Y", descriptor = "I")
    public static int field5623;

    @OriginalMember(owner = "client!qn", name = "Z", descriptor = "I")
    public static int field5624;

    @OriginalMember(owner = "client!qn", name = "ab", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!qn", name = "bb", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!qn", name = "db", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!qn", name = "eb", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!qn", name = "fb", descriptor = "I")
    public static int field5630;

    @OriginalMember(owner = "client!qn", name = "D", descriptor = "[[[I")
    public static int[][][] field5602;

    static {
        new class306("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)I", line = 4)
    public final int method29(int arg0) {
        int var2 = 50 % ((arg0 - 40) / 52);
        ++field5614;
        return this.field5608;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)I", line = 14)
    public final int method28(byte arg0) {
        if (arg0 != -118) {
            return -31;
        } else {
            ++field5623;
            return this.field5601 & 65535;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILza;)V", line = 26)
    public final void method34(int arg0, class491 arg1) {
        if (arg0 != 25747) {
            method2310(124);
        }
        ++field5622;
        Object var3 = null;
        class515 var5;
        if (this.field5627 == null && this.field5621) {
            class489 var4 = this.method2308(262144, arg1, true, (byte) -114);
            var5 = var4 != null ? var4.field7152 : null;
        } else {
            var5 = this.field5627;
            this.field5627 = null;
        }
        if (var5 != null) {
            class335.method2114(var5, this.field5599, super.field4716, super.field4714, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lza;Lp;IIIIIZIIIIIIZ)V", line = 56)
    public class361(class491 arg0, class39 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field573 == 1, class360.method2305(arg12, arg13, (byte) 45));
        this.field5599 = (byte) arg3;
        this.field5608 = (byte) arg12;
        this.field5600 = ~arg1.field618 != -1 && !arg7;
        this.field5611 = arg14;
        this.field5619 = (byte) arg13;
        this.field5617 = arg7;
        this.field5601 = (short) arg1.field587;
        this.field5621 = arg0.method841() && arg1.field655 && !this.field5617 && ~class510.field7403.method2041(-118, class511.field7485) != -1;
        int var16 = 2048;
        if (this.field5611) {
            var16 |= 65536;
        }
        class489 var17 = this.method2308(var16, arg0, this.field5621, (byte) -114);
        if (var17 != null) {
            this.field5620 = var17.field7150;
            this.field5627 = var17.field7152;
            if (this.field5611) {
                this.field5620 = this.field5620.method739((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(BLza;)V", line = 97)
    public final void method43(byte arg0, class491 arg1) {
        ++field5597;
        if (arg0 != 35) {
            this.field5620 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(Z)V", line = 114)
    public final void method36(boolean arg0) {
        ++field5612;
        this.field5611 = arg0;
        if (this.field5620 != null) {
            this.field5620.method762(this.field5620.method741() & -65537);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lza;IB)Le;", line = 127)
    private final class530 method2306(class491 arg0, int arg1, byte arg2) {
        ++field5629;
        int var4 = -2 / ((-68 - arg2) / 49);
        if (this.field5620 != null && ~arg0.method902(this.field5620.method741(), arg1) == -1) {
            return this.field5620;
        } else {
            class489 var5 = this.method2308(arg1, arg0, false, (byte) -114);
            return var5 == null ? null : var5.field7150;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BLza;)V", line = 147)
    public final void method26(byte arg0, class491 arg1) {
        if (arg0 != 111) {
            this.method26((byte) 23, (class491) null);
        }
        ++field5630;
        Object var3 = null;
        class515 var5;
        if (this.field5627 == null && this.field5621) {
            class489 var4 = this.method2308(262144, arg1, true, (byte) -114);
            var5 = var4 == null ? null : var4.field7152;
        } else {
            var5 = this.field5627;
            this.field5627 = null;
        }
        if (var5 != null) {
            class219.method1506(var5, this.field5599, super.field4716, super.field4714, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "(I)I", line = 174)
    public final int method2307(int arg0) {
        ++field5605;
        if (arg0 != 15) {
            this.field5619 = 5;
        }
        return this.field5620 == null ? 15 : this.field5620.method749() / 4;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(ILza;)Lsr;", line = 186)
    public final class430 method40(int arg0, class491 arg1) {
        ++field5613;
        if (arg0 >= -24) {
            return null;
        } else if (this.field5620 == null) {
            return null;
        } else {
            class202 var3 = arg1.method820();
            var3.method1246(super.field4716, super.field4728, super.field4714);
            class430 var4 = null;
            if (this.field5600) {
                var4 = class21.method111((byte) -95, 1);
            }
            this.field5620.method736(var3, var4 != null ? var4.field6447[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILza;ZB)Ljl;", line = 213)
    private final class489 method2308(int arg0, class491 arg1, boolean arg2, byte arg3) {
        ++field5610;
        if (arg3 != -114) {
            this.field5621 = true;
        }
        class39 var5 = class61.field928.method791(65535 & this.field5601, true);
        class220 var6;
        class220 var7;
        if (this.field5617) {
            var6 = class511.field7488[0];
            var7 = class320.field5039[this.field5599];
        } else {
            var7 = class511.field7488[this.field5599];
            if (this.field5599 < 3) {
                var6 = class511.field7488[this.field5599 + 1];
            } else {
                var6 = null;
            }
        }
        return var5.method298(arg1, super.field4716, var7, super.field4714, arg2, arg0, ~this.field5608 == -12 ? 10 : this.field5608, super.field4728, var6, ~this.field5608 != -12 ? this.field5619 : this.field5619 + 4, 7280);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IILza;IILvl;Z)V", line = 247)
    public final void method39(int arg0, int arg1, class491 arg2, int arg3, int arg4, class243 arg5, boolean arg6) {
        if (arg0 != 0) {
            this.method2308(36, (class491) null, true, (byte) 33);
        }
        ++field5598;
        if (!(arg5 instanceof class386)) {
            if (arg5 instanceof class361) {
                class361 var8 = (class361) arg5;
                if (this.field5620 != null && var8.field5620 != null) {
                    this.field5620.method772(var8.field5620, arg1, arg4, arg3, arg6);
                    return;
                }
            }
        } else {
            class386 var9 = (class386) arg5;
            if (this.field5620 == null || var9.field5945 == null) {
                return;
            }
            this.field5620.method772(var9.field5945, arg1, arg4, arg3, arg6);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lco;ILmo;ILza;I)Z", line = 278)
    public static final boolean method2309(class445 arg0, int arg1, class366 arg2, int arg3, class491 arg4, int arg5) {
        ++field5628;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg0.field6625 != null) {
            var7 = (-class210.field3354 + arg0.field6630 + arg2.field5692) * (-class210.field3344 + class210.field3361) / (-class210.field3354 + class210.field3348) + class210.field3344;
            var8 = -((class210.field3346 - class210.field3356) * (-class210.field3349 + arg2.field5690 + arg0.field6646) / (-class210.field3349 + class210.field3355)) + class210.field3346;
            var6 = (-class210.field3354 + arg0.field6627 + arg2.field5692) * (-class210.field3344 + class210.field3361) / (-class210.field3354 + class210.field3348) + class210.field3344;
            var9 = class210.field3346 - (-class210.field3349 + arg2.field5690 + arg0.field6652) * (-class210.field3356 + class210.field3346) / (-class210.field3349 + class210.field3355);
        }
        if (arg5 != -8495) {
            method2309((class445) null, 91, (class366) null, -101, (class491) null, 7);
        }
        class138 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg0.field6653 != -1) {
            if (arg2.field5697 && ~arg0.field6616 != 0) {
                var10 = arg0.method2670(true, true, arg4);
            } else {
                var10 = arg0.method2670(false, true, arg4);
            }
            if (var10 != null) {
                var11 = arg2.field5695 + -(1 + var10.method200() >> 1);
                var12 = arg2.field5695 + (1 + var10.method200() >> 1);
                if (~var11 > ~var6) {
                    var6 = var11;
                }
                var13 = arg2.field5687 - (var10.method198() - -1 >> 1);
                if (~var12 < ~var7) {
                    var7 = var12;
                }
                var14 = arg2.field5687 + (1 + var10.method198() >> 1);
                if (var13 < var8) {
                    var8 = var13;
                }
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class514 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg0.field6629 != null) {
            var15 = class360.method2302(arg0.field6611, true);
            if (var15 != null) {
                var16 = class66.field978.method2083((class138[]) null, false, arg0.field6629, (int[]) null, class165.field2607);
                int var23 = arg2.field5687;
                if (var10 == null) {
                    var17 = var23 - var16 * var15.method3044() / 2;
                } else {
                    var17 = var23 - ((var10.method198() >> 1) + var15.method3045() * var16);
                }
                for (int var24 = 0; ~var16 < ~var24; ++var24) {
                    String var25 = class165.field2607[var24];
                    if (~var24 > ~(var16 + -1)) {
                        var25 = var25.substring(0, -4 + var25.length());
                    }
                    int var26 = var15.method3039(var25);
                    if (var26 > var18) {
                        var18 = var26;
                    }
                }
                var19 = arg2.field5695 - -arg1 + -(var18 / 2);
                var20 = var18 / 2 + arg2.field5695 + arg1;
                if (~var19 > ~var6) {
                    var6 = var19;
                }
                if (var20 > var7) {
                    var7 = var20;
                }
                var21 = arg3 + var17;
                if (var8 > var21) {
                    var8 = var21;
                }
                var22 = arg3 + var17 - -(var15.method3045() * var16);
                if (var22 > var9) {
                    var9 = var22;
                }
            }
        }
        if (~class210.field3344 >= ~var7 && class210.field3361 >= var6 && ~class210.field3356 >= ~var9 && ~var8 >= ~class210.field3346) {
            if (arg0.field6625 != null) {
                int[] var27 = new int[arg0.field6625.length];
                for (int var28 = 0; ~(var27.length / 2) < ~var28; ++var28) {
                    int var30 = arg0.field6625[var28 * 2] + arg2.field5692;
                    int var31 = arg0.field6625[var28 * 2 - -1] + arg2.field5690;
                    var27[var28 * 2] = (class210.field3361 - class210.field3344) * (-class210.field3354 + var30) / (class210.field3348 - class210.field3354) + class210.field3344;
                    var27[var28 * 2 + 1] = -((class210.field3346 - class210.field3356) * (-class210.field3349 + var31) / (-class210.field3349 + class210.field3355)) + class210.field3346;
                }
                class267.method1790(arg4, var27, arg0.field6621);
                for (int var29 = 0; ~(var27.length / 2 - 1) < ~var29; ++var29) {
                    arg4.method2869(24207, arg0.field6649, var27[var29 * 2 + 1], var27[(var29 + 1) * 2], var27[var29 * 2 + 3], var27[var29 * 2]);
                }
                arg4.method2869(24207, arg0.field6649, var27[var27.length - 1], var27[0], var27[1], var27[var27.length - 2]);
            }
            if (var10 != null) {
                if (~class461.field6825 < -1 && (class536.field7876 != -1 && class536.field7876 == arg2.field5694 || ~class1.field10 != 0 && ~class1.field10 == ~arg0.field6613)) {
                    int var32;
                    if (~class187.field2933 < -51) {
                        var32 = (-class187.field2933 + 100) * 2;
                    } else {
                        var32 = class187.field2933 * 2;
                    }
                    int var33 = var32 << 24 | 16776960;
                    arg4.method2858(arg2.field5687, 1, 7 + var10.method204() / 2, var33, arg2.field5695);
                    arg4.method2858(arg2.field5687, arg5 ^ -8496, var10.method204() / 2 + 5, var33, arg2.field5695);
                    arg4.method2858(arg2.field5687, 1, var10.method204() / 2 + 3, var33, arg2.field5695);
                    arg4.method2858(arg2.field5687, arg5 ^ -8496, 1 + var10.method204() / 2, var33, arg2.field5695);
                    arg4.method2858(arg2.field5687, 1, var10.method204() / 2, var33, arg2.field5695);
                }
                var10.method1039(arg2.field5695 + -(var10.method200() >> 1), arg2.field5687 - (var10.method198() >> 1));
            }
            if (arg0.field6629 != null && var15 != null) {
                class6.method37(var18, arg0, var17, arg2, arg4, var15, (byte) -104, var16);
            }
            if (arg0.field6653 != -1 || arg0.field6629 != null) {
                class417 var34 = new class417(arg2);
                var34.field6323 = var22;
                var34.field6318 = var21;
                var34.field6319 = var20;
                var34.field6320 = var12;
                var34.field6314 = var13;
                var34.field6315 = var11;
                var34.field6322 = var19;
                var34.field6325 = var14;
                class536.field7873.method2541(arg5 ^ -8495, var34);
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z)Z", line = 501)
    public final boolean method42(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            ++field5624;
            return this.field5611;
        }
    }

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "(I)I", line = 514)
    public final int method325(int arg0) {
        ++field5626;
        if (arg0 != 5) {
            this.method34(95, (class491) null);
        }
        return this.field5620 == null ? 0 : this.field5620.method726();
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)I", line = 525)
    public final int method38(int arg0) {
        if (arg0 != 5638) {
            method2310(-101);
        }
        ++field5625;
        return this.field5619;
    }

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "(I)V", line = 540)
    public static void method2310(int arg0) {
        field5602 = null;
        if (arg0 == -26579) {
            field5615 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)V", line = 553)
    public final void method31(int arg0) {
        ++field5606;
        if (this.field5620 != null) {
            this.field5620.method743();
        }
        int var2 = -68 % ((57 - arg0) / 48);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILza;I)Le;", line = 567)
    public final class530 method32(int arg0, class491 arg1, int arg2) {
        ++field5609;
        int var4 = 31 / ((-24 - arg2) / 60);
        return this.method2306(arg1, arg0, (byte) -126);
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(B)Z", line = 581)
    public final boolean method33(byte arg0) {
        ++field5618;
        int var2 = -47 / ((arg0 - 8) / 45);
        return this.field5621;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lza;III)Z", line = 591)
    public final boolean method27(class491 arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 121) {
            this.field5617 = false;
        }
        ++field5607;
        class530 var5 = this.method2306(arg0, 131072, (byte) 64);
        if (var5 != null) {
            class202 var6 = arg0.method820();
            var6.method1246(super.field4716, super.field4728, super.field4714);
            return var5.method776(arg3, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BI)V", line = 616)
    public static final void method2311(byte arg0, int arg1) {
        if (arg0 == 70) {
            class461.field6825 = 3;
            class187.field2933 = 100;
            class1.field10 = -1;
            class536.field7876 = arg1;
            ++field5603;
        }
    }
}
