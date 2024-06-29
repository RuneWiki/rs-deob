import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class378 extends class55 {

    @OriginalMember(owner = "client!wq", name = "yc", descriptor = "I")
    public int field5803 = -1;

    @OriginalMember(owner = "client!wq", name = "Ic", descriptor = "I")
    public int field5813 = -1;

    @OriginalMember(owner = "client!wq", name = "Kc", descriptor = "I")
    public static int field5815 = 0;

    @OriginalMember(owner = "client!wq", name = "wc", descriptor = "I")
    public static int field5801;

    @OriginalMember(owner = "client!wq", name = "xc", descriptor = "I")
    public static int field5802;

    @OriginalMember(owner = "client!wq", name = "zc", descriptor = "I")
    public static int field5804;

    @OriginalMember(owner = "client!wq", name = "Ac", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!wq", name = "Bc", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!wq", name = "Dc", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!wq", name = "Fc", descriptor = "I")
    public static int field5810;

    @OriginalMember(owner = "client!wq", name = "Gc", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!wq", name = "Hc", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!wq", name = "Jc", descriptor = "I")
    public static int field5814;

    @OriginalMember(owner = "client!wq", name = "Lc", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!wq", name = "Mc", descriptor = "I")
    public static int field5817;

    @OriginalMember(owner = "client!wq", name = "Nc", descriptor = "I")
    public static int field5818;

    @OriginalMember(owner = "client!wq", name = "Oc", descriptor = "I")
    public static int field5819;

    @OriginalMember(owner = "client!wq", name = "Pc", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!wq", name = "Qc", descriptor = "I")
    public static int field5821;

    @OriginalMember(owner = "client!wq", name = "Rc", descriptor = "I")
    public static int field5822;

    @OriginalMember(owner = "client!wq", name = "Ec", descriptor = "Lfm;")
    public class191 field5809;

    @OriginalMember(owner = "client!wq", name = "Cc", descriptor = "Laq;")
    public static class340 field5807;

    @OriginalMember(owner = "client!wq", name = "vc", descriptor = "[I")
    public static int[] field5800;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIIBZ)V")
    public final void method2441(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        ++field5819;
        super.field6419 = (byte) arg2;
        if (super.field840 != -1 && class388.field5915.method1703(super.field840, -12536).field5624 == 1) {
            super.field840 = -1;
        }
        if (arg4 != -20) {
            this.field5813 = 23;
        }
        if (super.field844 != -1) {
            class279 var7 = class85.field1242.method1972((byte) -58, super.field844);
            if (var7.field4419 && ~var7.field4398 != 0 && ~class388.field5915.method1703(var7.field4398, arg4 ^ 12516).field5624 == -2) {
                super.field844 = -1;
            }
        }
        if (super.field800 != -1) {
            class279 var8 = class85.field1242.method1972((byte) -58, super.field800);
            if (var8.field4419 && ~var8.field4398 != 0 && ~class388.field5915.method1703(var8.field4398, arg4 ^ 12516).field5624 == -2) {
                super.field800 = -1;
            }
        }
        if (!arg5) {
            int var9 = -super.field894[0] + arg1;
            int var10 = arg3 - super.field899[0];
            if (~var9 <= 7 && ~var9 >= -9 && var10 >= -8 && var10 <= 8) {
                if (~super.field898 > -10) {
                    ++super.field898;
                }
                for (int var11 = super.field898; var11 > 0; --var11) {
                    super.field894[var11] = super.field894[var11 + -1];
                    super.field899[var11] = super.field899[var11 + -1];
                    super.field895[var11] = super.field895[var11 + -1];
                }
                super.field894[0] = arg1;
                super.field895[0] = 1;
                super.field899[0] = arg3;
                return;
            }
        }
        super.field893 = 0;
        super.field894[0] = arg1;
        super.field898 = 0;
        super.field900 = 0;
        super.field899[0] = arg3;
        super.field6417 = (super.field894[0] << 7) + (arg0 << 6);
        super.field6410 = (super.field899[0] << 7) + (arg0 << 6);
        if (super.field891 != null) {
            super.field891.method2346();
        }
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(ILza;)Lon;")
    public final class514 method108(int arg0, class497 arg1) {
        ++field5820;
        if (this.field5809 != null && this.method2442(arg1, 2048, 0)) {
            class205 var3 = arg1.method1231();
            int var4 = super.field887.method2986((byte) -125);
            var3.method164(var4);
            var3.method163(super.field6417, super.field6412, super.field6410);
            class289 var5 = this.method418((byte) -41);
            class191 var6 = this.field5809.field2798 == null ? this.field5809 : this.field5809.method1190(-1, class96.field1394);
            if (class141.field1911.field6093 && var6.field2832 && var5.field4542) {
                class363 var7 = ~super.field840 != 0 && super.field836 == 0 ? class388.field5915.method1703(super.field840, -12536) : null;
                class363 var8 = ~super.field837 == 0 || super.field822 && var7 != null ? null : class388.field5915.method1703(super.field837, -12536);
                int var9 = 0;
                if (~super.field851 != -1) {
                    var9 = this.method416(0);
                }
                class536 var10 = class382.method2470(super.field799, super.field807, var4, this.field5809.field2771 & 255, this.field5809.field2809, super.field817, this.field5809.field2804 & 65535, var9, super.field892[0], var8 == null ? super.field875 : super.field883, this.field5809.field2806 & 255, this.field5809.field2773 & 65535, 83, var8 == null ? var7 : var8, arg1);
                if (var10 != null) {
                    float var11 = arg1.method1268();
                    float var12 = arg1.method1328();
                    arg1.method1240(false);
                    arg1.method1309(var11, var12 - 150.0F);
                    var10.method295(var3, (class182) null, 0);
                    arg1.method1309(var11, var12);
                    arg1.method1240(true);
                }
            }
            class514 var13 = null;
            if (this.method2445(arg0 ^ -125)) {
                var13 = class104.method706(arg0 + -2, super.field892.length);
            }
            if (super.field891 == null) {
                arg1.method1289(super.field892, var3, var13 != null ? var13.field7629 : null, 0);
            } else {
                class519 var14 = super.field891.method2354();
                arg1.method1302(super.field892, var14, var3, var13 == null ? null : var13.field7629, 0);
            }
            this.method433(super.field892, (byte) -85, arg1, false);
            if (super.field892[2] != null) {
                if (~var4 != -1) {
                    super.field892[2].method280(var4);
                }
                super.field892[2].method325(-super.field890.field582 + super.field6417, -super.field890.field589 + super.field6412, -super.field890.field585 + super.field6410);
            }
            if (arg0 != 2) {
                field5815 = 46;
            }
            super.field892[0] = super.field892[1] = super.field892[2] = super.field892[3] = null;
            super.field877 = class479.field7323;
            return var13;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "(Z)I")
    public final int method1596(boolean arg0) {
        ++field5802;
        if (!arg0) {
            field5815 = 117;
        }
        return super.field845;
    }

    @OriginalMember(owner = "client!wq", name = "i", descriptor = "(I)I")
    public final int method425(int arg0) {
        ++field5818;
        if (arg0 != 0) {
            return 104;
        } else {
            if (this.field5809.field2798 != null) {
                class191 var2 = this.field5809.method1190(-1, class96.field1394);
                if (var2 != null && var2.field2822 != -1) {
                    return var2.field2822;
                }
            }
            return this.field5809.field2822 != -1 ? this.field5809.field2822 : super.method425(0);
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lza;II)Z")
    private final boolean method2442(class497 arg0, int arg1, int arg2) {
        ++field5805;
        int var4 = arg1;
        class289 var5 = this.method418((byte) -41);
        class363 var6 = super.field840 != -1 && super.field836 == 0 ? class388.field5915.method1703(super.field840, -12536) : null;
        class363 var7 = ~super.field837 == 0 || super.field822 && var6 != null ? null : class388.field5915.method1703(super.field837, -12536);
        int var8 = var5.field4574;
        int var9 = var5.field4521;
        if (~var8 != -1 || ~var9 != -1 || var5.field4529 != 0 || var5.field4550 != 0) {
            arg1 |= 7;
        }
        boolean var10 = super.field866 != 0 && class88.field1278 >= super.field824 && ~super.field880 < ~class88.field1278;
        if (var10) {
            arg1 |= 524288;
        }
        class536 var11 = super.field892[arg2] = this.field5809.method1198(var7, super.field826, super.field815, var6, arg0, false, super.field883, super.field875, arg1, super.field886, class19.field199, class388.field5915, super.field831, class96.field1394, super.field818);
        if (var11 == null) {
            return false;
        } else {
            super.field845 = var11.method305();
            this.method429(0, var11);
            int var12 = super.field887.method2986((byte) -121);
            if (var8 == 0 && ~var9 == -1) {
                this.method421(var12, this.method415(-4) << 7, 0, 42, this.method415(arg2 + -4) << 7, 0);
            } else {
                this.method421(var12, var9, var5.field4560, 119, var8, var5.field4556);
                if (~super.field817 != -1) {
                    super.field892[0].method278(super.field817);
                }
                if (~super.field807 != -1) {
                    super.field892[0].method319(super.field807);
                }
                if (super.field799 != 0) {
                    super.field892[0].method325(0, super.field799, 0);
                }
            }
            if (var10) {
                var11.method324(super.field843, super.field859, super.field842, super.field866 & 255);
            }
            if (~super.field844 != 0 && ~super.field876 != 0) {
                class279 var13 = class85.field1242.method1972((byte) -58, super.field844);
                boolean var14 = var13.field4397 == 3 && (var8 != 0 || ~var9 != -1);
                int var15 = var4;
                if (var14) {
                    var15 = var4 | 7;
                } else {
                    if (~super.field795 != -1) {
                        var15 = var4 | 5;
                    }
                    if (super.field853 != 0) {
                        var15 |= 2;
                    }
                }
                class536 var16 = super.field892[1] = var13.method1878(arg0, super.field863, var15, super.field885, (byte) -38, class388.field5915, super.field876);
                if (var16 != null) {
                    if (~super.field853 != -1) {
                        var16.method325(0, -super.field853 << 0, 0);
                    }
                    if (~super.field795 != -1) {
                        var16.method280(super.field795 * 2048);
                    }
                    if (var14) {
                        if (super.field817 != 0) {
                            var16.method278(super.field817);
                        }
                        if (~super.field807 != -1) {
                            var16.method319(super.field807);
                        }
                        if (~super.field799 != -1) {
                            var16.method325(0, super.field799, 0);
                        }
                    }
                }
            } else {
                super.field892[1] = null;
            }
            if (super.field800 != -1 && super.field858 != -1) {
                class279 var17 = class85.field1242.method1972((byte) -58, super.field800);
                boolean var18 = var17.field4397 == 3 && (~var8 != -1 || var9 != 0);
                int var19 = var4;
                if (!var18) {
                    if (~super.field802 != -1) {
                        var19 = var4 | 5;
                    }
                    if (~super.field864 != -1) {
                        var19 |= 2;
                    }
                } else {
                    var19 = var4 | 7;
                }
                class536 var20 = super.field892[3] = var17.method1880(true, class388.field5915, super.field828, super.field841, var19, arg0, super.field858);
                if (var20 != null) {
                    if (super.field864 != 0) {
                        var20.method325(0, -super.field864 << 0, 0);
                    }
                    if (~super.field802 != -1) {
                        var20.method280(super.field802 * 2048);
                    }
                    if (var18) {
                        if (super.field817 != 0) {
                            var20.method278(super.field817);
                        }
                        if (super.field807 != 0) {
                            var20.method319(super.field807);
                        }
                        if (~super.field799 != -1) {
                            var20.method325(0, super.field799, 0);
                        }
                    }
                }
            } else {
                super.field892[3] = null;
            }
            super.field892[2] = null;
            if (super.field890 != null) {
                if (~super.field890.field576 >= ~class88.field1278) {
                    super.field890 = null;
                } else if (~class88.field1278 <= ~super.field890.field578) {
                    class536 var21 = super.field890.method332(arg0, -128, 7 | var4);
                    if (var21 != null) {
                        var21.method325(-super.field6417 + super.field890.field582, -super.field6412 + super.field890.field589, -super.field6410 + super.field890.field585);
                        if (~var12 != -1) {
                            var21.method280(var12);
                        }
                        super.field892[2] = var21;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lfm;B)V")
    public final void method2443(class191 arg0, byte arg1) {
        this.field5809 = arg0;
        ++field5822;
        int var3 = -93 / ((arg1 - -34) / 50);
        if (super.field891 != null) {
            super.field891.method2346();
        }
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)V")
    public final void method934(int arg0) {
        ++field5816;
        if (arg0 != 287) {
            field5815 = -120;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "(ILza;)V")
    public final void method102(int arg0, class497 arg1) {
        ++field5811;
        if (this.field5809 != null) {
            if (super.field896 || this.method2442(arg1, 0, 0)) {
                if (arg0 != -1) {
                    field5815 = 127;
                }
                this.method433(super.field892, (byte) -85, arg1, super.field896);
                super.field892[0] = super.field892[1] = super.field892[2] = super.field892[3] = null;
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(Z)Z")
    public final boolean method936(boolean arg0) {
        ++field5814;
        return arg0;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Z)Z")
    public final boolean method2444(boolean arg0) {
        ++field5801;
        if (this.field5809 == null) {
            return false;
        } else {
            if (arg0) {
                field5800 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!wq", name = "l", descriptor = "(I)Z")
    private final boolean method2445(int arg0) {
        ++field5817;
        if (arg0 >= -89) {
            this.method105(101, -12, 39, (class497) null);
        }
        return this.field5809.field2813;
    }

    @OriginalMember(owner = "client!wq", name = "f", descriptor = "(I)I")
    public final int method417(int arg0) {
        ++field5808;
        if (this.field5809.field2798 != null) {
            class191 var2 = this.field5809.method1190(-1, class96.field1394);
            if (var2 != null && var2.field2787 != -1) {
                return var2.field2787;
            }
        }
        if (arg0 != 64) {
            this.field5809 = null;
        }
        return this.field5809.field2787;
    }

    @OriginalMember(owner = "client!wq", name = "j", descriptor = "(I)I")
    public final int method431(int arg0) {
        ++field5810;
        if (this.field5809.field2798 != null) {
            class191 var2 = this.field5809.method1190(-1, class96.field1394);
            if (var2 != null && var2.field2811 != -1) {
                return var2.field2811;
            }
        }
        return arg0 != 3 ? 75 : this.field5809.field2811;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(III)V")
    public final void method2446(int arg0, int arg1, int arg2) {
        ++field5806;
        int var4 = super.field894[0];
        int var5 = super.field899[0];
        if (~arg2 == -1) {
            ++var5;
        }
        if (arg0 == arg2) {
            ++var4;
            ++var5;
        }
        if (~arg2 == -3) {
            ++var4;
        }
        if (arg2 == 3) {
            --var5;
            ++var4;
        }
        if (~arg2 == -5) {
            --var5;
        }
        if (~arg2 == -6) {
            --var4;
            --var5;
        }
        if (~arg2 == -7) {
            --var4;
        }
        if (arg2 == 7) {
            --var4;
            ++var5;
        }
        if (super.field840 != -1 && class388.field5915.method1703(super.field840, arg0 + -12537).field5624 == 1) {
            super.field840 = -1;
        }
        if (~super.field844 != 0) {
            class279 var6 = class85.field1242.method1972((byte) -58, super.field844);
            if (var6.field4419 && ~var6.field4398 != 0 && class388.field5915.method1703(var6.field4398, -12536).field5624 == 1) {
                super.field844 = -1;
            }
        }
        if (~super.field800 != 0) {
            class279 var7 = class85.field1242.method1972((byte) -58, super.field800);
            if (var7.field4419 && ~var7.field4398 != 0 && class388.field5915.method1703(var7.field4398, -12536).field5624 == 1) {
                super.field800 = -1;
            }
        }
        if (super.field898 < 9) {
            ++super.field898;
        }
        for (int var8 = super.field898; ~var8 < -1; --var8) {
            super.field894[var8] = super.field894[var8 + -1];
            super.field899[var8] = super.field899[var8 + -1];
            super.field895[var8] = super.field895[var8 + -1];
        }
        super.field894[0] = var4;
        super.field899[0] = var5;
        super.field895[0] = (byte) arg1;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIILza;)Z")
    public final boolean method105(int arg0, int arg1, int arg2, class497 arg3) {
        ++field5821;
        if (this.field5809 != null && this.method2442(arg3, 131072, 0)) {
            class205 var5 = arg3.method1231();
            if (arg1 != 32689) {
                this.field5813 = -52;
            }
            int var6 = super.field887.method2986((byte) 44);
            var5.method164(var6);
            var5.method163(super.field6417, super.field6412, super.field6410);
            boolean var7 = false;
            for (int var8 = 0; ~var8 > ~super.field892.length; ++var8) {
                if (super.field892[var8] != null && super.field892[var8].method298(arg0, arg2, var5, ~this.field5809.field2809 == -2)) {
                    var7 = true;
                    break;
                }
            }
            super.field892[0] = super.field892[1] = super.field892[2] = super.field892[3] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wq", name = "m", descriptor = "(I)V")
    public static void method2447(int arg0) {
        if (arg0 == 0) {
            field5807 = null;
            field5800 = null;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILza;IZBILbm;)V")
    public final void method938(int arg0, class497 arg1, int arg2, boolean arg3, byte arg4, int arg5, class484 arg6) {
        int var8 = 41 % ((arg4 - 27) / 32);
        ++field5804;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(III)V")
    public static final void method2448(int arg0, int arg1, int arg2) {
        class6.field71 = -class194.field2900 + arg0;
        ++field5812;
        class484.field7357 = -class194.field2883 + arg1;
        if (arg2 != 131072) {
            field5800 = null;
        }
    }

    static {
        new class213("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
    }
}
