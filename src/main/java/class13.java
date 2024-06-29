import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class13 {

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "Lsu;")
    private class143 field186 = new class143();

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
    private int field194;

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "I")
    private int field202;

    @OriginalMember(owner = "client!kh", name = "s", descriptor = "Lgu;")
    private class412 field197;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public static int field188 = 0;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "[I")
    public static int[] field189 = new int[100];

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "I")
    public static int field195 = 0;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "[I")
    public static int[] field185 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "Lak;")
    public static class234 field191 = new class234("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!kh", name = "r", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!kh", name = "t", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!kh", name = "u", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)I")
    public final int method83(int arg0) {
        if (arg0 != 24871) {
            field189 = null;
        }
        field187++;
        return this.field194;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(JLjava/lang/Object;B)V")
    public final void method84(long arg0, Object arg1, byte arg2) {
        if (arg2 != 27) {
            method96((byte) -115);
        }
        field184++;
        this.method92(true, arg1, arg0, 1);
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)I")
    public final int method85(int arg0) {
        if (arg0 != 11049) {
            return 40;
        }
        field199++;
        int var2 = 0;
        for (class39 var3 = (class39) this.field186.method1024((byte) 91); var3 != null; var3 = (class39) this.field186.method1022(arg0 ^ 0xFFFFD4D4)) {
            if (!var3.method377(arg0 ^ 0x2B4D)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)I")
    public final int method86(int arg0) {
        field181++;
        if (arg0 != -22131) {
            this.field194 = 3;
        }
        return this.field202;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(JI)Ljava/lang/Object;")
    public final Object method87(long arg0, int arg1) {
        field193++;
        class39 var4 = (class39) this.field197.method2585((byte) 114, arg0);
        if (var4 == null) {
            return null;
        }
        if (arg1 != -2062335807) {
            this.field194 = -21;
        }
        Object var5 = var4.method374(-90);
        if (var5 == null) {
            var4.method2677(-22491);
            var4.method2754(-152804768);
            this.field194 += var4.field528;
            return null;
        }
        if (var4.method377(100)) {
            class363 var6 = new class363(var5, var4.field528);
            this.field197.method2591(var4.field6388, var6, (byte) -119);
            this.field186.method1021(var6, arg1 + 2062335703);
            var6.field6596 = 0L;
            var4.method2677(arg1 ^ 0x7AECE8E4);
            var4.method2754(arg1 ^ 0x73F722A1);
        } else {
            this.field186.method1021(var4, -112);
            var4.field6596 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)V")
    public final void method88(int arg0) {
        for (class39 var2 = (class39) this.field186.method1024((byte) 86); var2 != null; var2 = (class39) this.field186.method1022(-3)) {
            if (var2.method377(100)) {
                var2.method2677(-22491);
                var2.method2754(-152804768);
                this.field194 += var2.field528;
            }
        }
        if (arg0 < 80) {
            method96((byte) -84);
        }
        field200++;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lvg;I)V")
    private final void method89(class39 arg0, int arg1) {
        if (arg0 != null) {
            arg0.method2677(-22491);
            arg0.method2754(arg1 ^ 0x91B9D9F);
            this.field194 += arg0.field528;
        }
        if (arg1 == -1) {
            field198++;
        }
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public final Object method90(int arg0) {
        field201++;
        if (arg0 != 0) {
            this.method90(-93);
        }
        class39 var2 = (class39) this.field197.method2592(arg0 ^ 0x73);
        while (var2 != null) {
            Object var3 = var2.method374(-61);
            if (var3 != null) {
                return var3;
            }
            class39 var4 = var2;
            var2 = (class39) this.field197.method2589(-1);
            var4.method2677(-22491);
            var4.method2754(arg0 - 152804768);
            this.field194 += var2.field528;
        }
        return null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V")
    public final void method91(int arg0, int arg1) {
        if (arg0 < 12) {
            return;
        }
        if (class378.field5709 != null) {
            for (class39 var3 = (class39) this.field186.method1024((byte) 125); var3 != null; var3 = (class39) this.field186.method1022(-3)) {
                if (var3.method377(100)) {
                    if (var3.method374(-90) == null) {
                        var3.method2677(-22491);
                        var3.method2754(-152804768);
                        this.field194++;
                    }
                } else if (++var3.field6596 > (long) arg1) {
                    class39 var4 = class378.field5709.method197(0, var3);
                    this.field197.method2591(var3.field6388, var4, (byte) 115);
                    class339.method2140(var3, var4, -1279242032);
                    var3.method2677(-22491);
                    var3.method2754(-152804768);
                }
            }
        }
        field180++;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZLjava/lang/Object;JI)V")
    private final void method92(boolean arg0, Object arg1, long arg2, int arg3) {
        field190++;
        if (arg3 > this.field202) {
            throw new IllegalStateException("s>cs");
        }
        this.method95(arg2, arg0);
        this.field194 -= arg3;
        while (this.field194 < 0) {
            class39 var7 = (class39) this.field186.method1019(65408);
            this.method89(var7, -1);
        }
        if (arg0) {
            class363 var6 = new class363(arg1, arg3);
            this.field197.method2591(arg2, var6, (byte) 127);
            this.field186.method1021(var6, -111);
            var6.field6596 = 0L;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
    public final void method93(byte arg0) {
        if (arg0 > 74) {
            this.field186.method1026(-15663);
            field192++;
            this.field197.method2588(-114);
            this.field194 = this.field202;
        }
    }

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public final Object method94(int arg0) {
        if (arg0 != 30243) {
            method97((byte) 56);
        }
        field183++;
        class39 var2 = (class39) this.field197.method2589(-1);
        while (var2 != null) {
            Object var3 = var2.method374(-80);
            if (var3 != null) {
                return var3;
            }
            class39 var4 = var2;
            var2 = (class39) this.field197.method2589(arg0 - 30244);
            var4.method2677(-22491);
            var4.method2754(-152804768);
            this.field194 += var2.field528;
        }
        return null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(JZ)V")
    private final void method95(long arg0, boolean arg1) {
        field196++;
        class39 var4 = (class39) this.field197.method2585((byte) 114, arg0);
        this.method89(var4, -1);
        if (!arg1) {
            field191 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)V")
    public static final void method96(byte arg0) {
        field179++;
        if (class443.field6518) {
            return;
        }
        if (class193.field3258.field7239) {
            class473.field6830 = ((int) class473.field6830 + 191 & 0xFFFFFF80);
        } else {
            class345.field5107 += (24.0F - class345.field5107) / 2.0F;
        }
        if (arg0 == 38) {
            class471.field6814 = true;
            class443.field6518 = true;
        }
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(B)V")
    public static final void method97(byte arg0) {
        if (arg0 < -54) {
            class65.field843 = true;
            field182++;
        }
    }

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "(I)V")
    public static void method98(int arg0) {
        if (arg0 != -18035) {
            field188 = 80;
        }
        field185 = null;
        field189 = null;
        field191 = null;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(I)V")
    public class13(int arg0) {
        this.field194 = arg0;
        this.field202 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field197 = new class412(var2);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method99(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class403.method2523((byte) 109, arg5);
        field203++;
        int var7 = arg6;
        int var8 = arg5 - arg3;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg5;
        int var10 = -arg5;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (arg0 >= class404.field5987 && class433.field6414 >= arg0) {
            int[] var15 = class416.field6200[arg0];
            int var16 = class385.method2403(class184.field2777, class327.field4931, arg2 - arg5, true);
            int var17 = class385.method2403(class184.field2777, class327.field4931, arg2 + arg5, true);
            int var18 = class385.method2403(class184.field2777, class327.field4931, arg2 - var8, true);
            int var19 = class385.method2403(class184.field2777, class327.field4931, arg2 + var8, true);
            class359.method2255((byte) -75, var15, var18, var16, arg4);
            class359.method2255((byte) -124, var15, var19, var18, arg1);
            class359.method2255((byte) -65, var15, var17, var19, arg4);
        }
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class150.field2249[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg0 - var9;
                int var21 = arg0 + var9;
                if (var21 >= class404.field5987 && var20 <= class433.field6414) {
                    if (var8 > var9) {
                        int var22 = class150.field2249[var9];
                        int var23 = class385.method2403(class184.field2777, class327.field4931, arg2 + var7, true);
                        int var24 = class385.method2403(class184.field2777, class327.field4931, arg2 - var7, true);
                        int var25 = class385.method2403(class184.field2777, class327.field4931, arg2 + var22, true);
                        int var26 = class385.method2403(class184.field2777, class327.field4931, arg2 - var22, true);
                        if (class433.field6414 >= var21) {
                            int[] var27 = class416.field6200[var21];
                            class359.method2255((byte) -127, var27, var26, var24, arg4);
                            class359.method2255((byte) -103, var27, var25, var26, arg1);
                            class359.method2255((byte) -78, var27, var23, var25, arg4);
                        }
                        if (class404.field5987 <= var20) {
                            int[] var28 = class416.field6200[var20];
                            class359.method2255((byte) -67, var28, var26, var24, arg4);
                            class359.method2255((byte) -90, var28, var25, var26, arg1);
                            class359.method2255((byte) -91, var28, var23, var25, arg4);
                        }
                    } else {
                        int var29 = class385.method2403(class184.field2777, class327.field4931, arg2 + var7, true);
                        int var30 = class385.method2403(class184.field2777, class327.field4931, arg2 - var7, true);
                        if (class433.field6414 >= var21) {
                            class359.method2255((byte) -110, class416.field6200[var21], var29, var30, arg4);
                        }
                        if (class404.field5987 <= var20) {
                            class359.method2255((byte) -102, class416.field6200[var20], var29, var30, arg4);
                        }
                    }
                }
            }
            int var31 = arg0 - var7;
            int var32 = arg0 + var7;
            if (var32 >= class404.field5987 && class433.field6414 >= var31) {
                int var33 = arg2 + var9;
                int var34 = arg2 - var9;
                if (var33 >= class327.field4931 && var34 <= class184.field2777) {
                    int var35 = class385.method2403(class184.field2777, class327.field4931, var33, true);
                    int var36 = class385.method2403(class184.field2777, class327.field4931, var34, true);
                    if (var8 > var7) {
                        int var37 = var11 < var7 ? class150.field2249[var7] : var11;
                        int var38 = class385.method2403(class184.field2777, class327.field4931, arg2 + var37, true);
                        int var39 = class385.method2403(class184.field2777, class327.field4931, arg2 - var37, true);
                        if (var32 <= class433.field6414) {
                            int[] var40 = class416.field6200[var32];
                            class359.method2255((byte) -113, var40, var39, var36, arg4);
                            class359.method2255((byte) -67, var40, var38, var39, arg1);
                            class359.method2255((byte) -78, var40, var35, var38, arg4);
                        }
                        if (var31 >= class404.field5987) {
                            int[] var41 = class416.field6200[var31];
                            class359.method2255((byte) -128, var41, var39, var36, arg4);
                            class359.method2255((byte) -97, var41, var38, var39, arg1);
                            class359.method2255((byte) -117, var41, var35, var38, arg4);
                        }
                    } else {
                        if (var32 <= class433.field6414) {
                            class359.method2255((byte) -89, class416.field6200[var32], var35, var36, arg4);
                        }
                        if (var31 >= class404.field5987) {
                            class359.method2255((byte) -117, class416.field6200[var31], var35, var36, arg4);
                        }
                    }
                }
            }
        }
    }
}
