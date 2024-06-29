import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class422 extends class214 {

    @OriginalMember(owner = "client!kq", name = "F", descriptor = "Loe;")
    public class137 field6294 = new class137();

    @OriginalMember(owner = "client!kq", name = "H", descriptor = "Lfw;")
    public class41 field6296 = new class41();

    @OriginalMember(owner = "client!kq", name = "C", descriptor = "Lmf;")
    private class291 field6291;

    @OriginalMember(owner = "client!kq", name = "s", descriptor = "Lob;")
    public static class521 field6281 = new class521(39, -1);

    @OriginalMember(owner = "client!kq", name = "x", descriptor = "[I")
    public static int[] field6286 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!kq", name = "E", descriptor = "[I")
    public static int[] field6293 = new int[25];

    @OriginalMember(owner = "client!kq", name = "z", descriptor = "Lak;")
    public static class234 field6288 = new class234("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!kq", name = "o", descriptor = "I")
    public static int field6277;

    @OriginalMember(owner = "client!kq", name = "p", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!kq", name = "q", descriptor = "I")
    public static int field6279;

    @OriginalMember(owner = "client!kq", name = "r", descriptor = "I")
    public static int field6280;

    @OriginalMember(owner = "client!kq", name = "t", descriptor = "I")
    public static int field6282;

    @OriginalMember(owner = "client!kq", name = "u", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!kq", name = "v", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!kq", name = "w", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!kq", name = "y", descriptor = "I")
    public static int field6287;

    @OriginalMember(owner = "client!kq", name = "A", descriptor = "I")
    public static int field6289;

    @OriginalMember(owner = "client!kq", name = "B", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!kq", name = "D", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!kq", name = "G", descriptor = "I")
    public static int field6295;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kq", name = "I", descriptor = "Ljava/lang/Class;")
    public static Class field6297;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(III)V")
    public static final void method2629(int arg0, int arg1, int arg2) {
        if ((class7.field91 < class7.field92)) {
            class7.field91 = (float) ((double) class7.field91 / 30.0D + (double) class7.field91);
            if (class7.field91 > class7.field92) {
                class7.field91 = class7.field92;
            }
            class233.method1632(arg2 - 2);
            class7.field90 = (int) class7.field91 >> 1;
            class7.field87 = class110.method842(class7.field90, (byte) -1);
        } else if (class7.field91 > class7.field92) {
            class7.field91 = (float) ((double) class7.field91 - (double) class7.field91 / 30.0D);
            if (class7.field91 < class7.field92) {
                class7.field91 = class7.field92;
            }
            class233.method1632(arg2 - 2);
            class7.field90 = (int) class7.field91 >> 1;
            class7.field87 = class110.method842(class7.field90, (byte) -1);
        }
        field6285++;
        if (arg2 != 1) {
            return;
        }
        if (class334.field4988 != -1 && class108.field1510 != -1) {
            int var3 = class334.field4988 - class136.field2074;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class108.field1510 - class319.field4810;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class136.field2074 += var3;
            if (var3 == 0 && var4 == 0) {
                class334.field4988 = -1;
                class108.field1510 = -1;
            }
            class319.field4810 += var4;
            class233.method1632(-1);
        }
        if (class197.field3283 <= 0) {
            class458.field6663 = -1;
            class71.field1026 = -1;
        } else {
            class324.field4851--;
            if (class324.field4851 == 0) {
                class197.field3283--;
                class324.field4851 = 100;
            }
        }
        if (!class398.field5955 || class34.field394 == null) {
            return;
        }
        for (class162 var5 = (class162) class34.field394.method1004((byte) -97); var5 != null; var5 = (class162) class34.field394.method996(1)) {
            class519 var6 = class7.field75.method3071(arg2 ^ 0xFFFFFF93, var5.field2404.field7645);
            if (var5.method1098(arg1, Integer.MIN_VALUE, arg0)) {
                if (var6.field7561 != null) {
                    if (var6.field7561[4] != null) {
                        class168.method1127(-1, var6.field7600, var6.field7562, 0, true, 1009, false, var6.field7561[4], -81, -1, (long) var5.field2404.field7645);
                    }
                    if (var6.field7561[3] != null) {
                        class168.method1127(-1, var6.field7600, var6.field7562, 0, true, 1011, false, var6.field7561[3], arg2 - 80, -1, (long) var5.field2404.field7645);
                    }
                    if (var6.field7561[2] != null) {
                        class168.method1127(-1, var6.field7600, var6.field7562, 0, true, 1008, false, var6.field7561[2], -104, -1, (long) var5.field2404.field7645);
                    }
                    if (var6.field7561[1] != null) {
                        class168.method1127(-1, var6.field7600, var6.field7562, 0, true, 1002, false, var6.field7561[1], -104, -1, (long) var5.field2404.field7645);
                    }
                    if (var6.field7561[0] != null) {
                        class168.method1127(-1, var6.field7600, var6.field7562, 0, true, 1012, false, var6.field7561[0], -89, -1, (long) var5.field2404.field7645);
                    }
                }
                if (!var5.field2404.field7650) {
                    var5.field2404.field7650 = true;
                    class192.method1345(class322.field4830, var5.field2404.field7645, var6.field7562);
                }
                if (var5.field2404.field7650) {
                    class192.method1345(class295.field4502, var5.field2404.field7645, var6.field7562);
                }
            } else if (var5.field2404.field7650) {
                var5.field2404.field7650 = false;
                class192.method1345(class38.field514, var5.field2404.field7645, var6.field7562);
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V")
    public final void method389(int arg0) {
        this.field6296.method389(arg0);
        field6287++;
        for (class80 var2 = (class80) this.field6294.method1004((byte) -58); var2 != null; var2 = (class80) this.field6294.method996(1)) {
            if (!this.field6291.method1897(false, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field1145 >= var3) {
                        this.method2634(var2, var3, (byte) -51);
                        var2.field1145 -= var3;
                        break;
                    }
                    this.method2634(var2, var2.field1145, (byte) -103);
                    var3 -= var2.field1145;
                } while (!this.field6291.method1878(false, var2, 0, null, var3));
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "()Lfp;")
    public final class214 method386() {
        field6278++;
        class80 var1 = (class80) this.field6294.method1004((byte) -97);
        if (var1 == null) {
            return null;
        } else if (var1.field1165 == null) {
            return this.method394();
        } else {
            return var1.field1165;
        }
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "()I")
    public final int method391() {
        field6277++;
        return 0;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZI[IILej;I)V")
    private final void method2630(boolean arg0, int arg1, int[] arg2, int arg3, class80 arg4, int arg5) {
        if (arg0) {
            return;
        }
        if ((this.field6291.field4409[arg4.field1153] & 0x4) != 0 && arg4.field1157 < 0) {
            int var7 = this.field6291.field4412[arg4.field1153] / class40.field540;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field1161) / var7;
                if (arg5 < var8) {
                    arg4.field1161 += arg5 * var7;
                    break;
                }
                arg4.field1165.method387(arg2, arg3, var8);
                arg5 -= var8;
                arg4.field1161 += var7 * var8 - 1048576;
                arg3 += var8;
                int var9 = class40.field540 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class392 var11 = arg4.field1165;
                if (this.field6291.field4383[arg4.field1153] == 0) {
                    arg4.field1165 = class392.method2458(arg4.field1156, var11.method2467(), var11.method2460(), var11.method2451());
                } else {
                    arg4.field1165 = class392.method2458(arg4.field1156, var11.method2467(), 0, var11.method2451());
                    this.field6291.method1902(arg4.field1162.field3469[arg4.field1158] < 0, 14853, arg4);
                    arg4.field1165.method2470(var9, var11.method2460());
                }
                if (arg4.field1162.field3469[arg4.field1158] < 0) {
                    arg4.field1165.method2454(-1);
                }
                var11.method2445(var9);
                var11.method387(arg2, arg3, arg1 - arg3);
                if (var11.method2464()) {
                    this.field6296.method392(var11);
                }
            }
        }
        field6279++;
        arg4.field1165.method387(arg2, arg3, arg5);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(JI)V")
    public static final void method2631(long arg0, int arg1) {
        class71.field1020.field3556 = 0;
        field6284++;
        class71.field1020.method1545(class518.field7552.field1077, -101);
        if (arg1 != -15901) {
            field6293 = null;
        }
        class71.field1020.method1507(arg0, (byte) -115);
        class71.field1020.method1545(class224.field3673, -66);
        class517.field7517 = 0;
        class490.field7043 = 0;
        class182.field2723 = -3;
        class197.field3291 = 1;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "([III)V")
    public final void method387(int[] arg0, int arg1, int arg2) {
        field6283++;
        this.field6296.method387(arg0, arg1, arg2);
        for (class80 var4 = (class80) this.field6294.method1004((byte) -68); var4 != null; var4 = (class80) this.field6294.method996(1)) {
            if (!this.field6291.method1897(false, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field1145 >= var6) {
                        this.method2630(false, var5 + var6, arg0, var5, var4, var6);
                        var4.field1145 -= var6;
                        break;
                    }
                    this.method2630(false, var5 + var6, arg0, var5, var4, var4.field1145);
                    var5 += var4.field1145;
                    var6 -= var4.field1145;
                } while (!this.field6291.method1878(false, var4, var5, arg0, var6));
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "()Lfp;")
    public final class214 method394() {
        field6280++;
        class80 var1;
        do {
            var1 = (class80) this.field6294.method996(1);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1165 == null);
        return var1.field1165;
    }

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "(I)V")
    public static void method2632(int arg0) {
        if (arg0 != 0) {
            method2636(-72);
        }
        field6293 = null;
        field6286 = null;
        field6281 = null;
        field6288 = null;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I[IIIIILpd;IIIZ[IIBI)I")
    public static final int method2633(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, class172 arg6, int arg7, int arg8, int arg9, boolean arg10, int[] arg11, int arg12, byte arg13, int arg14) {
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class237.field3810[var15][var35] = 0;
                class129.field1947[var15][var35] = 99999999;
            }
        }
        field6290++;
        boolean var16;
        if (arg0 == 1) {
            var16 = class473.method2846(arg2, arg14, -122, arg12, arg8, arg3, arg6, arg5, arg7, arg4, arg9);
        } else if (arg0 == 2) {
            var16 = class49.method488(arg6, -10657, arg7, arg3, arg9, arg12, arg14, arg4, arg2, arg5, arg8);
        } else {
            var16 = class462.method2804(arg12, arg5, arg2, arg3, arg14, (byte) -82, arg4, arg8, arg9, arg6, arg7, arg0);
        }
        int var17 = arg14 - 64;
        int var18 = arg8 - 64;
        int var19 = class428.field6371;
        int var20 = class162.field2406;
        if (!var16) {
            if (!arg10) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg2 - var23; var24 <= arg2 + var23; var24++) {
                for (int var25 = arg4 - var23; var25 <= (arg4 + var23); var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class129.field1947[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg2 > var24) {
                            var28 = arg2 - var24;
                        } else if (var24 > (arg2 + arg7 - 1)) {
                            var28 = var24 + 1 - arg2 - arg7;
                        }
                        int var29 = 0;
                        if (arg4 > var25) {
                            var29 = arg4 - var25;
                        } else if ((arg4 + arg12 - 1) < var25) {
                            var29 = var25 - arg4 - (arg12 + -1);
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var21 || var21 == var30 && var22 > class129.field1947[var26][var27]) {
                            var21 = var30;
                            var19 = var24;
                            var22 = class129.field1947[var26][var27];
                            var20 = var25;
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg13 > -54) {
            return 30;
        } else if (arg14 == var19 && arg8 == var20) {
            return 0;
        } else {
            byte var31 = 0;
            class53.field661[var31] = var19;
            int var37 = var31 + 1;
            class349.field5164[var31] = var20;
            int var32;
            int var33 = var32 = class237.field3810[var19 - var17][var20 - var18];
            while (arg14 != var19 || arg8 != var20) {
                if (var32 != var33) {
                    var32 = var33;
                    class53.field661[var37] = var19;
                    class349.field5164[var37++] = var20;
                }
                if ((var33 & 0x2) != 0) {
                    var19++;
                } else if ((var33 & 0x8) != 0) {
                    var19--;
                }
                if ((var33 & 0x1) != 0) {
                    var20++;
                } else if ((var33 & 0x4) != 0) {
                    var20--;
                }
                var33 = class237.field3810[var19 - var17][var20 - var18];
            }
            int var34 = 0;
            while ((var37--) > 0) {
                arg1[var34] = class53.field661[var37];
                arg11[var34++] = class349.field5164[var37];
                if (arg1.length <= var34) {
                    break;
                }
            }
            return var34;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lej;IB)V")
    private final void method2634(class80 arg0, int arg1, byte arg2) {
        field6292++;
        if ((this.field6291.field4409[arg0.field1153] & 0x4) != 0 && arg0.field1157 < 0) {
            int var4 = this.field6291.field4412[arg0.field1153] / class40.field540;
            int var5 = (var4 + 1048575 - arg0.field1161) / var4;
            arg0.field1161 = arg1 * var4 + arg0.field1161 & 0xFFFFF;
            if (var5 <= arg1) {
                if (this.field6291.field4383[arg0.field1153] == 0) {
                    arg0.field1165 = class392.method2458(arg0.field1156, arg0.field1165.method2467(), arg0.field1165.method2460(), arg0.field1165.method2451());
                } else {
                    arg0.field1165 = class392.method2458(arg0.field1156, arg0.field1165.method2467(), 0, arg0.field1165.method2451());
                    this.field6291.method1902(arg0.field1162.field3469[arg0.field1158] < 0, 14853, arg0);
                }
                if (arg0.field1162.field3469[arg0.field1158] < 0) {
                    arg0.field1165.method2454(-1);
                }
                arg1 = arg0.field1161 / var4;
            }
        }
        if (arg2 <= -22) {
            arg0.field1165.method389(arg1);
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIII)Z")
    public static final boolean method2635(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 31154) {
            method2632(76);
        }
        field6289++;
        class164 var4 = (class164) class85.method713(arg2, arg3, arg0);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class157.method1080(var4, 0);
        }
        class164 var6 = (class164) class154.method1057(arg2, arg3, arg0, field6297 == null ? (field6297 = method2637("ig")) : field6297);
        if (var6 != null) {
            var5 &= class157.method1080(var6, 0);
        }
        class164 var7 = (class164) class446.method2736(arg2, arg3, arg0);
        if (var7 != null) {
            var5 &= class157.method1080(var7, 0);
        }
        return var5;
    }

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "(I)V")
    public static final void method2636(int arg0) {
        field6282++;
        if (class312.field4694 != null) {
            return;
        }
        class312.field4694 = new int[65536];
        if (arg0 >= -25) {
            method2635(-18, -30, -60, -44);
        }
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) (var3 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var6 = (double) (var3 >> 7 & 0x7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if (var8 < 0.5D) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - (var6 * var8);
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if (var24 < 0.0D) {
                    var24++;
                }
                if (var4 * 6.0D < 1.0D) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if (var4 * 2.0D < 1.0D) {
                    var12 = var16;
                } else if (var4 * 3.0D < 2.0D) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if ((var20 * 6.0D < 1.0D)) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if ((var20 * 2.0D < 1.0D)) {
                    var10 = var16;
                } else if ((var20 * 3.0D < 2.0D)) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var24 * 6.0D < 1.0D) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if ((var24 * 2.0D < 1.0D)) {
                    var14 = var16;
                } else if (var24 * 3.0D < 2.0D) {
                    var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var32 << 16) + (var33 << 8) + var34;
            class312.field4694[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lmf;)V")
    public class422(class291 arg0) {
        this.field6291 = arg0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2637(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
