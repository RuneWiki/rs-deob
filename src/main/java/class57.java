import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class57 extends class198 {

    @OriginalMember(owner = "client!i", name = "T", descriptor = "I")
    private int field777 = 2048;

    @OriginalMember(owner = "client!i", name = "N", descriptor = "I")
    private int field771 = 0;

    @OriginalMember(owner = "client!i", name = "I", descriptor = "I")
    private int field766 = 0;

    @OriginalMember(owner = "client!i", name = "Y", descriptor = "I")
    private int field782 = 2048;

    @OriginalMember(owner = "client!i", name = "bb", descriptor = "I")
    private int field785 = 4096;

    @OriginalMember(owner = "client!i", name = "O", descriptor = "I")
    private int field772 = 8192;

    @OriginalMember(owner = "client!i", name = "db", descriptor = "I")
    private int field787 = 12288;

    @OriginalMember(owner = "client!i", name = "M", descriptor = "Z")
    public static boolean field770 = false;

    @OriginalMember(owner = "client!i", name = "J", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!i", name = "K", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!i", name = "L", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!i", name = "R", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!i", name = "S", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!i", name = "U", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!i", name = "V", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!i", name = "W", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!i", name = "X", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!i", name = "ab", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!i", name = "cb", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!i", name = "P", descriptor = "Ljava/lang/String;")
    public static String field773;

    @OriginalMember(owner = "client!i", name = "Z", descriptor = "[I")
    public static int[] field783;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        ++field776;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field772 = arg1.method1419(118);
                                }
                            } else {
                                this.field785 = arg1.method1419(108);
                            }
                        } else {
                            this.field787 = arg1.method1419(98);
                        }
                    } else {
                        this.field777 = arg1.method1419(117);
                    }
                } else {
                    this.field771 = arg1.method1419(108);
                }
            } else {
                this.field766 = arg1.method1419(106);
            }
        } else {
            this.field782 = arg1.method1419(81);
        }
        int var5 = 9 % ((60 - arg0) / 61);
    }

    @OriginalMember(owner = "client!i", name = "g", descriptor = "(I)V")
    public static void method340(int arg0) {
        field773 = null;
        field783 = null;
        if (arg0 != 65536) {
            method344((byte) 18, 98);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZII)Z")
    private final boolean method341(boolean arg0, int arg1, int arg2) {
        ++field780;
        int var4 = (arg1 + arg2) * this.field787 >> 12;
        int var5 = class179.field2790[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field787;
        int var7 = (var6 << 12) / this.field772;
        int var8 = this.field785 * var7 >> 12;
        if (arg0) {
            field778 = 33;
        }
        return arg1 - arg2 < var8 && -arg2 + arg1 > -var8;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Led;Lli;I)V")
    public static final void method342(class195 arg0, class314 arg1, int arg2) {
        ++field786;
        class5 var3 = arg0.method1352((byte) -125);
        if (var3 != null) {
            int var4 = var3.field1681;
            int var5 = arg1.field5060;
            if (var3.field1672 > var3.field1681) {
                var4 = var3.field1672;
            }
            int var6 = arg1.field5062;
            if (arg2 < 29) {
                method343(127, -4, 15, 21, (class276) null, -44L, (class276) null, (class276) null);
            }
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            if (arg0.field3088 != null) {
                var7 = class249.field3970.method732(arg0.field3088, (int[]) null, class96.field1422);
                for (int var10 = 0; var7 > var10; ++var10) {
                    String var11 = class96.field1422[var10];
                    if (var7 + -1 > var10) {
                        var11 = var11.substring(0, -4 + var11.length());
                    }
                    int var12 = class294.field4826.method174(var11);
                    if (~var12 < ~var9) {
                        var9 = var12;
                    }
                }
                var8 = class294.field4826.method177() * (var7 + -1) + class294.field4826.method179() / 2;
            }
            int var13 = -(var8 / 2) + arg1.field5062;
            int var14 = arg1.field5060;
            if (class13.field178 + var4 > var5) {
                var14 = class13.field178 - -(var4 / 2) - (-(var9 / 2) - 5) + var4;
                var5 = class13.field178 + var4;
            } else if (~(-var4 + class13.field191) > ~var5) {
                var14 = -(var4 / 2) + -(var9 / 2) + -var4 + -5 + class13.field191;
                var5 = -var4 + class13.field191;
            }
            if (var6 >= class13.field177 + var4) {
                if (~var6 < ~(-var4 + class13.field189)) {
                    var6 = class13.field189 - var4;
                    var13 = -(var4 / 2) + class13.field189 + -var4 + -var8;
                }
            } else {
                var6 = class13.field177 + var4;
                var13 = var4 / 2 + var4 + (class13.field177 - -class294.field4826.method177());
            }
            int var15 = 65535 & (int) (32767.0D * (Math.atan2((double) (var5 - arg1.field5060), (double) (-arg1.field5062 + var6)) / 3.141592653589793D));
            int var16 = var4 >> 1;
            int var17 = -2;
            int var18 = -2;
            int var19 = -2;
            var3.method28(var3.field1680 << 3, var3.field1682 << 3, (var5 << 4) + var16, (var6 << 4) + var16, var15, 4096);
            int var20 = -2;
            if (arg0.field3088 != null) {
                var20 = var14 - 5 + -(var9 / 2);
                var19 = var13 - class294.field4826.method179() - 3;
                var18 = var20 - (-var9 - 10);
                var17 = class294.field4826.method177() * var7 + var19;
                if (arg0.field3102 != 0) {
                    class62.method395(var20, var19, -var20 + var18, -var19 + var17, arg0.field3102, arg0.field3102 >>> 24);
                }
                if (~arg0.field3097 != -1) {
                    class62.method388(var20, var19, -var20 + var18, -var19 + var17, arg0.field3097, arg0.field3097 >>> 24);
                }
                for (int var21 = 0; var7 > var21; ++var21) {
                    String var22 = class96.field1422[var21];
                    if (~var21 > ~(var7 + -1)) {
                        var22 = var22.substring(0, -4 + var22.length());
                    }
                    class294.field4826.method180(var22, var14, var13, arg0.field3075, true);
                    var13 += class294.field4826.method177();
                }
            }
            if (~(var5 - var16) > ~class1.field1 && var5 + var16 > class1.field1 && class60.field924 > -var16 + var6 && var6 - -var16 > class60.field924 || var20 < class1.field1 && ~var18 < ~class1.field1 && class60.field924 > var19 && class60.field924 < var17) {
                if (arg0.field3079[4] != null) {
                    class192.method1333(0, arg0.field3079[4], (long) arg1.field5051, arg0.field3091, (short) 1007, 0, -1, 9910);
                }
                if (arg0.field3079[3] != null) {
                    class192.method1333(0, arg0.field3079[3], (long) arg1.field5051, arg0.field3091, (short) 1002, 0, -1, 9910);
                }
                if (arg0.field3079[2] != null) {
                    class192.method1333(0, arg0.field3079[2], (long) arg1.field5051, arg0.field3091, (short) 1012, 0, -1, 9910);
                }
                if (arg0.field3079[1] != null) {
                    class192.method1333(0, arg0.field3079[1], (long) arg1.field5051, arg0.field3091, (short) 1001, 0, -1, 9910);
                }
                if (arg0.field3079[0] != null) {
                    class192.method1333(0, arg0.field3079[0], (long) arg1.field5051, arg0.field3091, (short) 1010, 0, -1, 9910);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIILjk;JLjk;Ljk;)V")
    public static final void method343(int arg0, int arg1, int arg2, int arg3, class276 arg4, long arg5, class276 arg6, class276 arg7) {
        class166 var9 = new class166();
        var9.field2612 = arg4;
        var9.field2605 = arg1 * 128 + 64;
        var9.field2606 = arg2 * 128 + 64;
        var9.field2604 = arg3;
        var9.field2611 = arg5;
        var9.field2610 = arg6;
        var9.field2613 = arg7;
        int var10 = 0;
        class154 var11 = class27.field346[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field2431; ++var12) {
                class114 var13 = var11.field2418[var12];
                if ((var13.field1712 & 4194304L) == 4194304L) {
                    int var14 = var13.field1726.method206();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field2614 = -var10;
        if (class27.field346[arg0][arg1][arg2] == null) {
            class27.field346[arg0][arg1][arg2] = new class154(arg0, arg1, arg2);
        }
        class27.field346[arg0][arg1][arg2].field2430 = var9;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BI)V")
    public static final void method344(byte arg0, int arg1) {
        class258.field4247.method147(arg1, (byte) -117);
        ++field769;
        int var2 = 59 % ((8 - arg0) / 63);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZI)[I")
    public final int[] method32(boolean arg0, int arg1) {
        if (!arg0) {
            field773 = null;
        }
        ++field774;
        int[] var3 = super.field3134.method36(arg1, 30672);
        if (super.field3134.field69) {
            int var4 = class42.field591[arg1] + -2048;
            for (int var5 = 0; ~var5 > ~class42.field590; ++var5) {
                int var6 = class152.field2367[var5] + -2048;
                int var7 = this.field771 + var6;
                int var8 = ~var7 > 2047 ? var7 + 4096 : var7;
                int var9 = this.field782 + var6;
                int var10 = this.field766 + var4;
                int var11 = ~var8 < -2049 ? var8 + -4096 : var8;
                int var12 = var9 < -2048 ? var9 + 4096 : var9;
                int var13 = ~var12 < -2049 ? var12 - 4096 : var12;
                int var14 = ~var10 <= 2047 ? var10 : var10 + 4096;
                int var15 = ~var14 < -2049 ? var14 - 4096 : var14;
                int var16 = var4 - -this.field777;
                int var17 = ~var16 > 2047 ? var16 - -4096 : var16;
                int var18 = ~var17 >= -2049 ? var17 : var17 + -4096;
                var3[var5] = !this.method346(var13, var15, (byte) 121) && !this.method341(false, var18, var11) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(B)Z")
    public static final boolean method345(byte arg0) {
        int var1 = -101 % ((arg0 - -18) / 41);
        ++field779;
        return ~class202.field3238 != -1 ? true : class72.field1040.method1987((byte) -91);
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(IIB)Z")
    private final boolean method346(int arg0, int arg1, byte arg2) {
        ++field768;
        int var4 = (arg1 - arg0) * this.field787 >> 12;
        int var5 = class179.field2790[(var4 * 255 & 1044695) >> 12];
        if (arg2 < 56) {
            method344((byte) 11, -65);
        }
        int var6 = (var5 << 12) / this.field787;
        int var7 = (var6 << 12) / this.field772;
        int var8 = this.field785 * var7 >> 12;
        return var8 > arg0 + arg1 && -var8 < arg0 + arg1;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lfa;Lmi;ILfa;Lfa;)Z")
    public static final boolean method347(class273 arg0, class282 arg1, int arg2, class273 arg3, class273 arg4) {
        class20.field276 = arg0;
        ++field784;
        class74.field1147 = arg4;
        class72.field1040 = arg1;
        int var5 = 19 / ((arg2 - -43) / 33);
        class286.field4770 = arg3;
        return true;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIII)I")
    public static final int method348(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field767;
        if (arg1 != -2048) {
            method348(-100, -121, 19, -39, 26);
        }
        int var5 = -class172.field2658[arg0 * 1024 / arg2] + 65536 >> 1;
        return ((-var5 + 65536) * arg3 >> 16) + (arg4 * var5 >> 16);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
    public class57() {
        super(0, true);
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(B)V")
    public final void method142(byte arg0) {
        ++field775;
        int var2 = 35 % ((-46 - arg0) / 47);
        class217.method1516((byte) 79);
    }
}
