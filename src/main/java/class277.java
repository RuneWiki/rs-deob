import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class277 extends class21 {

    @OriginalMember(owner = "client!pk", name = "N", descriptor = "Lpn;")
    public static class148 field4249 = new class148();

    @OriginalMember(owner = "client!pk", name = "R", descriptor = "Ljava/lang/String;")
    public static String field4253 = "slide:";

    @OriginalMember(owner = "client!pk", name = "S", descriptor = "I")
    public static int field4254 = 0;

    @OriginalMember(owner = "client!pk", name = "O", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!pk", name = "P", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!pk", name = "Q", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!pk", name = "T", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(I)V", line = 4)
    public static void method1862(int arg0) {
        field4253 = null;
        int var1 = -102 / ((72 - arg0) / 53);
        field4249 = null;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(II)I", line = 16)
    public static final int method1863(int arg0, int arg1) {
        if (arg1 != -1579675065) {
            method1866((class47) null, true);
        }
        field4252++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(II)Lga;", line = 27)
    public static final class31 method1864(int arg0, int arg1) {
        field4251++;
        class31 var2 = (class31) class227.field3586.method1881(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class103.field1782.method2036(class255.method1706(arg1 ^ 0x57, arg0), class282.method1898(arg0, arg1 ^ 0x7B), (byte) 46);
        class31 var4 = new class31();
        if (arg1 != 0) {
            field4249 = (class148) null;
        }
        var4.field596 = arg0;
        if (var3 != null) {
            var4.method244(71, new class202(var3));
        }
        var4.method242(-105);
        if (var4.field614) {
            var4.field624 = 0;
            var4.field639 = false;
        }
        if (!class47.field961 && var4.field606) {
            var4.field619 = null;
        }
        class227.field3586.method1880(var4, (long) arg0, 106);
        return var4;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V", line = 70)
    public class277() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILbm;BI)[Lfd;", line = 79)
    public static final class206[] method1865(int arg0, class307 arg1, byte arg2, int arg3) {
        field4255++;
        if (arg2 < 40) {
            method1865(111, (class307) null, (byte) -63, -91);
        }
        return class135.method885(arg3, arg1, -10948, arg0) ? class56.method435(-108) : null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lmj;Z)V", line = 93)
    public static final void method1866(class47 arg0, boolean arg1) {
        class95.field1706.method427((byte) 122, arg0);
        while (true) {
            class47 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class47[][] var7;
            class47 var78;
            do {
                class47 var77;
                do {
                    class47 var76;
                    do {
                        class47 var75;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class47) class95.field1706.method430(5);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field968);
                                            var3 = var2.field984;
                                            var4 = var2.field971;
                                            var5 = var2.field962;
                                            var6 = var2.field966;
                                            var7 = class326.field4975[var5];
                                            float var8 = 0.0F;
                                            if (class249.field3893) {
                                                if (class45.field923 == class136.field2290) {
                                                    int var9 = class25.field498[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class201.field3205 != var10) {
                                                        class201.field3205 = var10;
                                                        class48.method370(var10, (byte) 67);
                                                        class65.method496(class17.method121(0));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class116.field2034 != var11) {
                                                        class116.field2034 = var11;
                                                        class160.method1033((byte) -128, var11);
                                                    }
                                                    int var12 = class46.field954[0][var3 + 1][var4] + class46.field954[0][var3][var4] + class46.field954[0][var3][var4 + 1] + class46.field954[0][var3 + 1][var4 + 1] >> 2;
                                                    class128.method844(-var12, 3, (byte) -87);
                                                    var8 = 201.5F;
                                                    class249.method1678(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class249.method1678(var8);
                                                }
                                            }
                                            if (!var2.field963) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class47 var13 = class326.field4975[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field968) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class166.field2675 && var3 > class189.field3061) {
                                                    class47 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field968 && (var14.field963 || (var2.field980 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class166.field2675 && var3 < class190.field3081 - 1) {
                                                    class47 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field968 && (var15.field963 || (var2.field980 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class56.field1108 && var4 > class23.field471) {
                                                    class47 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field968 && (var16.field963 || (var2.field980 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class56.field1108 && var4 < class121.field2092 - 1) {
                                                    class47 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field968 && (var17.field963 || (var2.field980 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field963 = false;
                                            if (var2.field976 != null) {
                                                class47 var18 = var2.field976;
                                                if (class249.field3893) {
                                                    class249.method1678(201.5F - (float) (var18.field966 + 1) * 50.0F);
                                                }
                                                if (var18.field970 == null) {
                                                    if (var18.field973 != null) {
                                                        if (class2.method8(0, var3, var4)) {
                                                            class18.method126(var18.field973, class136.field2288, class159.field2599, class333.field5110, class235.field3701, var3, var4, true);
                                                        } else {
                                                            class18.method126(var18.field973, class136.field2288, class159.field2599, class333.field5110, class235.field3701, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class2.method8(0, var3, var4)) {
                                                    class52.method397(var18.field970, 0, class136.field2288, class159.field2599, class333.field5110, class235.field3701, var3, var4, true);
                                                } else {
                                                    class52.method397(var18.field970, 0, class136.field2288, class159.field2599, class333.field5110, class235.field3701, var3, var4, false);
                                                }
                                                class41 var19 = var18.field965;
                                                if (var19 != null) {
                                                    if (class249.field3893) {
                                                        if ((var19.field790 & var2.field981) == 0) {
                                                            class310.method2083(class56.field1113, class344.field5347, class303.field4606, var5, var3, var4);
                                                        } else {
                                                            class310.method2086(var19.field790, class56.field1113, class344.field5347, class303.field4606, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field796.method26(0, class136.field2288, class159.field2599, class333.field5110, class235.field3701, var19.field789 - class56.field1113, var19.field794 - class344.field5347, var19.field784 - class303.field4606, var19.field795, var5, (class275) null);
                                                }
                                                for (int var20 = 0; var20 < var18.field969; var20++) {
                                                    class271 var21 = var18.field974[var20];
                                                    if (var21 != null) {
                                                        if (class249.field3893) {
                                                            class310.method2083(class56.field1113, class344.field5347, class303.field4606, var5, var3, var4);
                                                        }
                                                        var21.field4182.method26(var21.field4188, class136.field2288, class159.field2599, class333.field5110, class235.field3701, var21.field4179 - class56.field1113, var21.field4174 - class344.field5347, var21.field4185 - class303.field4606, var21.field4191, var5, (class275) null);
                                                    }
                                                }
                                                if (class249.field3893) {
                                                    class249.method1678(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field970 == null) {
                                                if (var2.field973 != null) {
                                                    if (class2.method8(var6, var3, var4)) {
                                                        class18.method126(var2.field973, class136.field2288, class159.field2599, class333.field5110, class235.field3701, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class18.method126(var2.field973, class136.field2288, class159.field2599, class333.field5110, class235.field3701, var3, var4, false);
                                                    }
                                                }
                                            } else if (class2.method8(var6, var3, var4)) {
                                                class52.method397(var2.field970, var6, class136.field2288, class159.field2599, class333.field5110, class235.field3701, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field970.field2517 != 12345678 || class70.field1477 && var5 <= class100.field1757) {
                                                    class52.method397(var2.field970, var6, class136.field2288, class159.field2599, class333.field5110, class235.field3701, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class289 var23 = var2.field967;
                                                if (var23 != null && (var23.field4446 & 0x80000000L) != 0L) {
                                                    if (class249.field3893 && var23.field4444) {
                                                        class249.method1678(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class249.field3893) {
                                                        class310.method2083(class56.field1113, class344.field5347, class303.field4606, var5, var3, var4);
                                                    }
                                                    var23.field4443.method26(0, class136.field2288, class159.field2599, class333.field5110, class235.field3701, var23.field4442 - class56.field1113, var23.field4447 - class344.field5347, var23.field4441 - class303.field4606, var23.field4446, var5, (class275) null);
                                                    if (class249.field3893 && var23.field4444) {
                                                        class249.method1678(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class41 var26 = var2.field965;
                                            class11 var27 = var2.field975;
                                            if (var26 != null || var27 != null) {
                                                if (class166.field2675 == var3) {
                                                    var24++;
                                                } else if (class166.field2675 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class56.field1108 == var4) {
                                                    var24 += 3;
                                                } else if (class56.field1108 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class289.field4440[var24];
                                                var2.field981 = class15.field278[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field790 & class66.field1251[var24]) == 0) {
                                                    var2.field985 = 0;
                                                } else if (var26.field790 == 16) {
                                                    var2.field985 = 3;
                                                    var2.field972 = class305.field4615[var24];
                                                    var2.field978 = 3 - var2.field972;
                                                } else if (var26.field790 == 32) {
                                                    var2.field985 = 6;
                                                    var2.field972 = class302.field4580[var24];
                                                    var2.field978 = 6 - var2.field972;
                                                } else if (var26.field790 == 64) {
                                                    var2.field985 = 12;
                                                    var2.field972 = class336.field5154[var24];
                                                    var2.field978 = 12 - var2.field972;
                                                } else {
                                                    var2.field985 = 9;
                                                    var2.field972 = class136.field2283[var24];
                                                    var2.field978 = 9 - var2.field972;
                                                }
                                                if ((var26.field790 & var25) != 0 && !class205.method1380(var6, var3, var4, var26.field790)) {
                                                    if (class249.field3893) {
                                                        class310.method2083(class56.field1113, class344.field5347, class303.field4606, var5, var3, var4);
                                                    }
                                                    var26.field796.method26(0, class136.field2288, class159.field2599, class333.field5110, class235.field3701, var26.field789 - class56.field1113, var26.field794 - class344.field5347, var26.field784 - class303.field4606, var26.field795, var5, (class275) null);
                                                }
                                                if ((var26.field793 & var25) != 0 && !class205.method1380(var6, var3, var4, var26.field793)) {
                                                    if (class249.field3893) {
                                                        class310.method2083(class56.field1113, class344.field5347, class303.field4606, var5, var3, var4);
                                                    }
                                                    var26.field788.method26(0, class136.field2288, class159.field2599, class333.field5110, class235.field3701, var26.field789 - class56.field1113, var26.field794 - class344.field5347, var26.field784 - class303.field4606, var26.field795, var5, (class275) null);
                                                }
                                            }
                                            if (var27 != null && !class199.method1268(var6, var3, var4, var27.field224.method39())) {
                                                if (class249.field3893) {
                                                    class249.method1678(var8 - 0.5F);
                                                }
                                                if ((var27.field218 & var25) != 0) {
                                                    if (class249.field3893) {
                                                        class310.method2083(class56.field1113, class344.field5347, class303.field4606, var5, var3, var4);
                                                    }
                                                    var27.field224.method26(0, class136.field2288, class159.field2599, class333.field5110, class235.field3701, var27.field234 + var27.field219 - class56.field1113, var27.field233 - class344.field5347, var27.field229 + var27.field220 - class303.field4606, var27.field228, var5, (class275) null);
                                                } else if (var27.field218 == 256) {
                                                    int var28 = var27.field234 - class56.field1113;
                                                    int var29 = var27.field233 - class344.field5347;
                                                    int var30 = var27.field229 - class303.field4606;
                                                    int var31 = var27.field223;
                                                    int var32;
                                                    if (var31 == 1 || var31 == 2) {
                                                        var32 = -var28;
                                                    } else {
                                                        var32 = var28;
                                                    }
                                                    int var33;
                                                    if (var31 == 2 || var31 == 3) {
                                                        var33 = -var30;
                                                    } else {
                                                        var33 = var30;
                                                    }
                                                    if (var33 < var32) {
                                                        if (class249.field3893) {
                                                            class310.method2083(class56.field1113, class344.field5347, class303.field4606, var5, var3, var4);
                                                        }
                                                        var27.field224.method26(0, class136.field2288, class159.field2599, class333.field5110, class235.field3701, var27.field219 + var28, var29, var27.field220 + var30, var27.field228, var5, (class275) null);
                                                    } else if (var27.field231 != null) {
                                                        if (class249.field3893) {
                                                            class310.method2083(class56.field1113, class344.field5347, class303.field4606, var5, var3, var4);
                                                        }
                                                        var27.field231.method26(0, class136.field2288, class159.field2599, class333.field5110, class235.field3701, var28, var29, var30, var27.field228, var5, (class275) null);
                                                    }
                                                }
                                                if (class249.field3893) {
                                                    class249.method1678(var8);
                                                }
                                            }
                                            if (var22) {
                                                class289 var34 = var2.field967;
                                                if (var34 != null && (var34.field4446 & 0x80000000L) == 0L) {
                                                    if (class249.field3893 && var34.field4444) {
                                                        class249.method1678(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class249.field3893) {
                                                        class310.method2083(class56.field1113, class344.field5347, class303.field4606, var5, var3, var4);
                                                    }
                                                    var34.field4443.method26(0, class136.field2288, class159.field2599, class333.field5110, class235.field3701, var34.field4442 - class56.field1113, var34.field4447 - class344.field5347, var34.field4441 - class303.field4606, var34.field4446, var5, (class275) null);
                                                    if (class249.field3893 && var34.field4444) {
                                                        class249.method1678(var8);
                                                    }
                                                }
                                                class59 var35 = var2.field964;
                                                if (var35 != null && var35.field1157 == 0) {
                                                    if (class249.field3893) {
                                                        class310.method2083(class56.field1113, class344.field5347, class303.field4606, var5, var3, var4);
                                                    }
                                                    if (var35.field1154 != null) {
                                                        var35.field1154.method26(0, class136.field2288, class159.field2599, class333.field5110, class235.field3701, var35.field1159 - class56.field1113, var35.field1163 - class344.field5347, var35.field1158 - class303.field4606, var35.field1161, var5, (class275) null);
                                                    }
                                                    if (var35.field1166 != null) {
                                                        var35.field1166.method26(0, class136.field2288, class159.field2599, class333.field5110, class235.field3701, var35.field1159 - class56.field1113, var35.field1163 - class344.field5347, var35.field1158 - class303.field4606, var35.field1161, var5, (class275) null);
                                                    }
                                                    if (var35.field1155 != null) {
                                                        var35.field1155.method26(0, class136.field2288, class159.field2599, class333.field5110, class235.field3701, var35.field1159 - class56.field1113, var35.field1163 - class344.field5347, var35.field1158 - class303.field4606, var35.field1161, var5, (class275) null);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field980;
                                            if (var36 != 0) {
                                                if (var3 < class166.field2675 && (var36 & 0x4) != 0) {
                                                    class47 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field968) {
                                                        class95.field1706.method427((byte) 102, var37);
                                                    }
                                                }
                                                if (var4 < class56.field1108 && (var36 & 0x2) != 0) {
                                                    class47 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field968) {
                                                        class95.field1706.method427((byte) 75, var38);
                                                    }
                                                }
                                                if (var3 > class166.field2675 && (var36 & 0x1) != 0) {
                                                    class47 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field968) {
                                                        class95.field1706.method427((byte) -124, var39);
                                                    }
                                                }
                                                if (var4 > class56.field1108 && (var36 & 0x8) != 0) {
                                                    class47 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field968) {
                                                        class95.field1706.method427((byte) -65, var40);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field985 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field969; var42++) {
                                                if (class186.field3020 != var2.field974[var42].field4178 && (var2.field982[var42] & var2.field985) == var2.field972) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class41 var43 = var2.field965;
                                                if (!class205.method1380(var6, var3, var4, var43.field790)) {
                                                    if (class249.field3893) {
                                                        label882: {
                                                            if ((var43.field795 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field789 - class56.field1113;
                                                                int var45 = var43.field784 - class303.field4606;
                                                                int var46 = (int) (var43.field795 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class39.field762 - 1) {
                                                                        class310.method2083(class56.field1113, class344.field5347, class303.field4606, var5, var3 - 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class306.field4629 - 1 && var4 < class39.field762 - 1) {
                                                                        class310.method2083(class56.field1113, class344.field5347, class303.field4606, var5, var3 + 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class306.field4629 - 1 && var4 > 0) {
                                                                        class310.method2083(class56.field1113, class344.field5347, class303.field4606, var5, var3 + 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class310.method2083(class56.field1113, class344.field5347, class303.field4606, var5, var3 - 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                }
                                                            }
                                                            class310.method2083(class56.field1113, class344.field5347, class303.field4606, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field796.method26(0, class136.field2288, class159.field2599, class333.field5110, class235.field3701, var43.field789 - class56.field1113, var43.field794 - class344.field5347, var43.field784 - class303.field4606, var43.field795, var5, (class275) null);
                                                }
                                                var2.field985 = 0;
                                            }
                                        }
                                        if (!var2.field979) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field969;
                                            var2.field979 = false;
                                            int var48 = 0;
                                            label767: for (int var49 = 0; var49 < var47; var49++) {
                                                class271 var50 = var2.field974[var49];
                                                if (class186.field3020 != var50.field4178) {
                                                    for (int var51 = var50.field4180; var51 <= var50.field4176; var51++) {
                                                        for (int var52 = var50.field4187; var52 <= var50.field4181; var52++) {
                                                            class47 var53 = var7[var51][var52];
                                                            if (var53.field963) {
                                                                var2.field979 = true;
                                                                continue label767;
                                                            }
                                                            if (var53.field985 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field4180) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field4176) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field4187) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field4181) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field985) == var2.field978) {
                                                                    var2.field979 = true;
                                                                    continue label767;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class276.field4215[var48++] = var50;
                                                    int var55 = class166.field2675 - var50.field4180;
                                                    int var56 = var50.field4176 - class166.field2675;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class56.field1108 - var50.field4187;
                                                    int var58 = var50.field4181 - class56.field1108;
                                                    if (var58 > var57) {
                                                        var50.field4183 = var55 + var58;
                                                    } else {
                                                        var50.field4183 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class271 var62 = class276.field4215[var61];
                                                    if (class186.field3020 != var62.field4178) {
                                                        if (var62.field4183 > var59) {
                                                            var59 = var62.field4183;
                                                            var60 = var61;
                                                        } else if (var62.field4183 == var59) {
                                                            int var63 = var62.field4179 - class56.field1113;
                                                            int var64 = var62.field4185 - class303.field4606;
                                                            int var65 = class276.field4215[var60].field4179 - class56.field1113;
                                                            int var66 = class276.field4215[var60].field4185 - class303.field4606;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class271 var67 = class276.field4215[var60];
                                                var67.field4178 = class186.field3020;
                                                if (!class306.method2026(var6, var67.field4180, var67.field4176, var67.field4187, var67.field4181, var67.field4182.method39())) {
                                                    if (class249.field3893) {
                                                        if ((var67.field4191 & 0xFC000L) == 147456L) {
                                                            class310.method2083(class56.field1113, class344.field5347, class303.field4606, var5, var3, var4);
                                                            int var68 = var67.field4179 - class56.field1113;
                                                            int var69 = var67.field4185 - class303.field4606;
                                                            int var70 = (int) (var67.field4191 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class310.method2082(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class310.method2082(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class310.method2082(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class310.method2082(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class310.method2078(class56.field1113, class344.field5347, class303.field4606, var5, var67.field4180, var67.field4187, var67.field4176, var67.field4181);
                                                        }
                                                    }
                                                    var67.field4182.method26(var67.field4188, class136.field2288, class159.field2599, class333.field5110, class235.field3701, var67.field4179 - class56.field1113, var67.field4174 - class344.field5347, var67.field4185 - class303.field4606, var67.field4191, var5, (class275) null);
                                                }
                                                for (int var71 = var67.field4180; var71 <= var67.field4176; var71++) {
                                                    for (int var72 = var67.field4187; var72 <= var67.field4181; var72++) {
                                                        class47 var73 = var7[var71][var72];
                                                        if (var73.field985 != 0) {
                                                            class95.field1706.method427((byte) 90, var73);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field968) {
                                                            class95.field1706.method427((byte) 67, var73);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field979) {
                                                break;
                                            }
                                        } catch (Exception var93) {
                                            var2.field979 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field968);
                            } while (var2.field985 != 0);
                            if (var3 > class166.field2675 || var3 <= class189.field3061) {
                                break;
                            }
                            var75 = var7[var3 - 1][var4];
                        } while (var75 != null && var75.field968);
                        if (var3 < class166.field2675 || var3 >= class190.field3081 - 1) {
                            break;
                        }
                        var76 = var7[var3 + 1][var4];
                    } while (var76 != null && var76.field968);
                    if (var4 > class56.field1108 || var4 <= class23.field471) {
                        break;
                    }
                    var77 = var7[var3][var4 - 1];
                } while (var77 != null && var77.field968);
                if (var4 < class56.field1108 || var4 >= class121.field2092 - 1) {
                    break;
                }
                var78 = var7[var3][var4 + 1];
            } while (var78 != null && var78.field968);
            var2.field968 = false;
            class330.field5056--;
            class59 var79 = var2.field964;
            if (var79 != null && var79.field1157 != 0) {
                if (class249.field3893) {
                    class310.method2083(class56.field1113, class344.field5347, class303.field4606, var5, var3, var4);
                }
                if (var79.field1154 != null) {
                    var79.field1154.method26(0, class136.field2288, class159.field2599, class333.field5110, class235.field3701, var79.field1159 - class56.field1113, var79.field1163 - class344.field5347 - var79.field1157, var79.field1158 - class303.field4606, var79.field1161, var5, (class275) null);
                }
                if (var79.field1166 != null) {
                    var79.field1166.method26(0, class136.field2288, class159.field2599, class333.field5110, class235.field3701, var79.field1159 - class56.field1113, var79.field1163 - class344.field5347 - var79.field1157, var79.field1158 - class303.field4606, var79.field1161, var5, (class275) null);
                }
                if (var79.field1155 != null) {
                    var79.field1155.method26(0, class136.field2288, class159.field2599, class333.field5110, class235.field3701, var79.field1159 - class56.field1113, var79.field1163 - class344.field5347 - var79.field1157, var79.field1158 - class303.field4606, var79.field1161, var5, (class275) null);
                }
            }
            if (var2.field981 != 0) {
                class11 var80 = var2.field975;
                if (var80 != null && !class199.method1268(var6, var3, var4, var80.field224.method39())) {
                    if ((var80.field218 & var2.field981) != 0) {
                        if (class249.field3893) {
                            class310.method2083(class56.field1113, class344.field5347, class303.field4606, var5, var3, var4);
                        }
                        var80.field224.method26(0, class136.field2288, class159.field2599, class333.field5110, class235.field3701, var80.field234 + var80.field219 - class56.field1113, var80.field233 - class344.field5347, var80.field229 + var80.field220 - class303.field4606, var80.field228, var5, (class275) null);
                    } else if (var80.field218 == 256) {
                        int var81 = var80.field234 - class56.field1113;
                        int var82 = var80.field233 - class344.field5347;
                        int var83 = var80.field229 - class303.field4606;
                        int var84 = var80.field223;
                        int var85;
                        if (var84 == 1 || var84 == 2) {
                            var85 = -var81;
                        } else {
                            var85 = var81;
                        }
                        int var86;
                        if (var84 == 2 || var84 == 3) {
                            var86 = -var83;
                        } else {
                            var86 = var83;
                        }
                        if (var86 >= var85) {
                            if (class249.field3893) {
                                class310.method2083(class56.field1113, class344.field5347, class303.field4606, var5, var3, var4);
                            }
                            var80.field224.method26(0, class136.field2288, class159.field2599, class333.field5110, class235.field3701, var80.field219 + var81, var82, var80.field220 + var83, var80.field228, var5, (class275) null);
                        } else if (var80.field231 != null) {
                            if (class249.field3893) {
                                class310.method2083(class56.field1113, class344.field5347, class303.field4606, var5, var3, var4);
                            }
                            var80.field231.method26(0, class136.field2288, class159.field2599, class333.field5110, class235.field3701, var81, var82, var83, var80.field228, var5, (class275) null);
                        }
                    }
                }
                class41 var87 = var2.field965;
                if (var87 != null) {
                    if ((var87.field793 & var2.field981) != 0 && !class205.method1380(var6, var3, var4, var87.field793)) {
                        if (class249.field3893) {
                            class310.method2086(var87.field793, class56.field1113, class344.field5347, class303.field4606, var6, var3, var4);
                        }
                        var87.field788.method26(0, class136.field2288, class159.field2599, class333.field5110, class235.field3701, var87.field789 - class56.field1113, var87.field794 - class344.field5347, var87.field784 - class303.field4606, var87.field795, var5, (class275) null);
                    }
                    if ((var87.field790 & var2.field981) != 0 && !class205.method1380(var6, var3, var4, var87.field790)) {
                        if (class249.field3893) {
                            class310.method2086(var87.field790, class56.field1113, class344.field5347, class303.field4606, var6, var3, var4);
                        }
                        var87.field796.method26(0, class136.field2288, class159.field2599, class333.field5110, class235.field3701, var87.field789 - class56.field1113, var87.field794 - class344.field5347, var87.field784 - class303.field4606, var87.field795, var5, (class275) null);
                    }
                }
            }
            if (var5 < class164.field2638 - 1) {
                class47 var88 = class326.field4975[var5 + 1][var3][var4];
                if (var88 != null && var88.field968) {
                    class95.field1706.method427((byte) -64, var88);
                }
            }
            if (var3 < class166.field2675) {
                class47 var89 = var7[var3 + 1][var4];
                if (var89 != null && var89.field968) {
                    class95.field1706.method427((byte) 93, var89);
                }
            }
            if (var4 < class56.field1108) {
                class47 var90 = var7[var3][var4 + 1];
                if (var90 != null && var90.field968) {
                    class95.field1706.method427((byte) 64, var90);
                }
            }
            if (var3 > class166.field2675) {
                class47 var91 = var7[var3 - 1][var4];
                if (var91 != null && var91.field968) {
                    class95.field1706.method427((byte) 84, var91);
                }
            }
            if (var4 > class56.field1108) {
                class47 var92 = var7[var3][var4 - 1];
                if (var92 != null && var92.field968) {
                    class95.field1706.method427((byte) -78, var92);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)[I", line = 1085)
    public final int[] method177(int arg0, int arg1) {
        int var3 = 2 % ((arg0 - 33) / 36);
        field4250++;
        return class51.field1027;
    }
}
