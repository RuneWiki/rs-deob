import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public abstract class class175 {

    @OriginalMember(owner = "client!db", name = "b", descriptor = "Z")
    public static boolean field3000 = true;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "[I")
    public static int[] field3005 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

    @OriginalMember(owner = "client!db", name = "a", descriptor = "Z")
    public static boolean field2999 = false;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public int field3001;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public int field3003;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public int field3007;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public int field3008;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public int field3009;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public int field3011;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IILja;)I", line = 6)
    public static final int method1223(int arg0, int arg1, class60 arg2) {
        field3004++;
        if (arg2.field1185 == null || arg2.field1185.length <= arg1) {
            return -2;
        }
        try {
            int var3 = arg0;
            int var4 = 0;
            int[] var5 = arg2.field1185[arg1];
            byte var6 = 0;
            while (true) {
                int var7 = var5[var4++];
                byte var8 = 0;
                int var9 = 0;
                if (var7 == 0) {
                    return var3;
                }
                if (var7 == 1) {
                    var9 = class160.field2824[var5[var4++]];
                }
                if (var7 == 2) {
                    var9 = class274.field4708[var5[var4++]];
                }
                if (var7 == 3) {
                    var9 = class77.field1456[var5[var4++]];
                }
                if (var7 == 15) {
                    var8 = 1;
                }
                if (var7 == 16) {
                    var8 = 2;
                }
                if (var7 == 17) {
                    var8 = 3;
                }
                if (var7 == 4) {
                    int var10 = var5[var4++] << 16;
                    int var11 = var10 + var5[var4++];
                    class60 var12 = class125.method907(var11, -110);
                    int var13 = var5[var4++];
                    if (var13 != -1 && (!class132.method949(var13, false).field1660 || class269.field4641)) {
                        for (int var14 = 0; var14 < var12.field1117.length; var14++) {
                            if (var13 + 1 == var12.field1117[var14]) {
                                var9 += var12.field1110[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var9 = class289.field4941[var5[var4++]];
                }
                if (var7 == 6) {
                    var9 = class195.field3314[class274.field4708[var5[var4++]] - 1];
                }
                if (var7 == 7) {
                    var9 = class289.field4941[var5[var4++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var9 = class139.field2472.field659;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class46.field751[var15]) {
                            var9 += class274.field4708[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var5[var4++] << 16;
                    int var17 = var16 + var5[var4++];
                    class60 var18 = class125.method907(var17, -98);
                    int var19 = var5[var4++];
                    if (var19 != -1 && (!class132.method949(var19, false).field1660 || class269.field4641)) {
                        for (int var20 = 0; var20 < var18.field1117.length; var20++) {
                            if ((var19 + 1) == var18.field1117[var20]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var9 = class200.field3422;
                }
                if (var7 == 12) {
                    var9 = class220.field3724;
                }
                if (var7 == 13) {
                    int var21 = class289.field4941[var5[var4++]];
                    int var22 = var5[var4++];
                    var9 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var5[var4++];
                    var9 = class278.method1928((byte) -110, var23);
                }
                if (var7 == 18) {
                    var9 = (class139.field2472.field1859 >> 7) + class190.field3269;
                }
                if (var7 == 19) {
                    var9 = (class139.field2472.field1865 >> 7) + class121.field2184;
                }
                if (var7 == 20) {
                    var9 = var5[var4++];
                }
                if (var8 == 0) {
                    if (var6 == 0) {
                        var3 += var9;
                    }
                    if (var6 == 1) {
                        var3 -= var9;
                    }
                    if (var6 == 2 && var9 != 0) {
                        var3 /= var9;
                    }
                    if (var6 == 3) {
                        var3 *= var9;
                    }
                    var6 = 0;
                } else {
                    var6 = var8;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 219)
    public static final void method1224(int arg0) {
        int var1 = -13 % ((44 - arg0) / 60);
        int var2 = class180.field3099.length;
        for (int var3 = 0; var3 < var2; var3++) {
            if (class180.field3099[var3] != null) {
                int var4 = -1;
                for (int var5 = 0; var5 < class253.field4401; var5++) {
                    if (class89.field1611[var3] == class8.field179[var5]) {
                        var4 = var5;
                        break;
                    }
                }
                if (var4 == -1) {
                    class8.field179[class253.field4401] = class89.field1611[var3];
                    var4 = class253.field4401++;
                }
                class13 var6 = new class13(class180.field3099[var3]);
                int var7 = 0;
                while (var6.field281 < class180.field3099[var3].length && var7 < 511) {
                    int var8 = var7++ << 6 | var4;
                    int var9 = var6.method112((byte) 92);
                    int var10 = var9 >> 14;
                    int var11 = var9 >> 7 & 0x3F;
                    int var12 = var9 & 0x3F;
                    int var13 = (class89.field1611[var3] >> 8) * 64 - (class190.field3269 - var11);
                    int var14 = (class89.field1611[var3] & 0xFF) * 64 + var12 - class121.field2184;
                    class6 var15 = class9.method79((byte) 94, var6.method112((byte) 92));
                    if (class2.field12[var8] == null && (var15.field130 & 0x1) > 0 && class27.field438 == var10 && var13 >= 0 && var13 + var15.field141 < 104 && var14 >= 0 && var14 + var15.field141 < 104) {
                        class2.field12[var8] = new class232();
                        class232 var16 = class2.field12[var8];
                        class254.field4422[class218.field3707++] = var8;
                        var16.field3911 = var15;
                        var16.field1911 = class29.field482;
                        var16.method760(var16.field3911.field141, 0);
                        var16.field1861 = var16.field3911.field111;
                        var16.field1886 = var16.field3911.field158;
                        var16.field1854 = var16.field3911.field112;
                        var16.field1895 = var16.field3911.field113;
                        var16.field1887 = var16.field3911.field162;
                        var16.field1901 = var16.field3911.field132;
                        var16.field1873 = var16.field3911.field167;
                        var16.field1856 = var16.field3911.field124;
                        if (var16.field1887 == 0) {
                            var16.field1863 = 0;
                        }
                        var16.method758(var16.method325(-12808), true, var13, (byte) 70, var14);
                    }
                }
            }
        }
        field3002++;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V", line = 328)
    public static void method1225(int arg0) {
        int var1 = -25 % ((arg0 - 18) / 47);
        field3005 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)I", line = 340)
    public static final int method1226(int arg0, byte arg1) {
        field3010++;
        int var2 = -13 / ((arg1 - 52) / 62);
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIZIII)V", line = 359)
    public static final void method1227(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (!arg2) {
            method1224(-6);
        }
        long var6 = class313.method2167(arg0, arg3, arg4);
        field3006++;
        if (var6 != 0L) {
            int var8 = ((int) var6 & 0x7FC69) >> 14;
            int var9 = (int) var6 >> 20 & 0x3;
            int var10 = arg5;
            if (var6 > 0L) {
                var10 = arg1;
            }
            int[] var11 = class210.field3529;
            int var12 = (int) (var6 >>> 32) & Integer.MAX_VALUE;
            int var13 = (103 - arg4) * 512 * 4 + arg3 * 4 + 24624;
            class290 var14 = class172.method1207(var12, -116);
            if (var14.field5010 == -1) {
                if (var8 == 0 || var8 == 2) {
                    if (var9 == 0) {
                        var11[var13] = var10;
                        var11[var13 + 512] = var10;
                        var11[var13 + 1024] = var10;
                        var11[var13 + 1536] = var10;
                    } else if (var9 == 1) {
                        var11[var13] = var10;
                        var11[var13 + 1] = var10;
                        var11[var13 + 2] = var10;
                        var11[var13 + 3] = var10;
                    } else if (var9 == 2) {
                        var11[var13 + 3] = var10;
                        var11[var13 + 3 + 512] = var10;
                        var11[var13 + 1024 + 3] = var10;
                        var11[var13 + 3 + 1536] = var10;
                    } else if (var9 == 3) {
                        var11[var13 + 1536] = var10;
                        var11[var13 + 1537] = var10;
                        var11[var13 + 1538] = var10;
                        var11[var13 + 1539] = var10;
                    }
                }
                if (var8 == 3) {
                    if (var9 == 0) {
                        var11[var13] = var10;
                    } else if (var9 == 1) {
                        var11[var13 + 3] = var10;
                    } else if (var9 == 2) {
                        var11[var13 + 1536 + 3] = var10;
                    } else if (var9 == 3) {
                        var11[var13 + 1536] = var10;
                    }
                }
                if (var8 == 2) {
                    if (var9 == 3) {
                        var11[var13] = var10;
                        var11[var13 + 512] = var10;
                        var11[var13 + 1024] = var10;
                        var11[var13 + 1536] = var10;
                    } else if (var9 == 0) {
                        var11[var13] = var10;
                        var11[var13 + 1] = var10;
                        var11[var13 + 2] = var10;
                        var11[var13 + 3] = var10;
                    } else if (var9 == 1) {
                        var11[var13 + 3] = var10;
                        var11[var13 + 3 + 512] = var10;
                        var11[var13 + 1024 + 3] = var10;
                        var11[var13 + 1536 + 3] = var10;
                    } else if (var9 == 2) {
                        var11[var13 + 1536] = var10;
                        var11[var13 + 1 + 1536] = var10;
                        var11[var13 + 2 + 1536] = var10;
                        var11[var13 + 1536 + 3] = var10;
                    }
                }
            } else {
                class176 var15 = null;
                if (!var14.field5002) {
                    var15 = class189.field3254[var14.field5010];
                } else if (var9 == 0) {
                    var15 = class189.field3254[var14.field5010];
                } else if (var9 == 1) {
                    var15 = class200.field3432[var14.field5010];
                } else if (var9 == 2) {
                    var15 = class14.field315[var14.field5010];
                } else if (var9 == 3) {
                    var15 = class273.field4682[var14.field5010];
                }
                if (var15 != null) {
                    int var16 = (var14.field5017 * 4 - var15.field3008) / 2;
                    int var17 = (var14.field4957 * 4 - var15.field3011) / 2;
                    var15.method279(arg3 * 4 + var16 + 48, 48 - -((104 - var14.field4957 + -arg4) * 4) - -var17);
                }
            }
        }
        long var18 = class141.method1000(arg0, arg3, arg4);
        if (var18 != 0L) {
            int var20 = (int) var18 >> 20 & 0x3;
            int var21 = (int) var18 >> 14 & 0x1F;
            int var22 = (int) (var18 >>> 32) & Integer.MAX_VALUE;
            class290 var23 = class172.method1207(var22, -114);
            if (var23.field5010 != -1) {
                class176 var27 = null;
                if (!var23.field5002) {
                    var27 = class189.field3254[var23.field5010];
                } else if (var20 == 0) {
                    var27 = class189.field3254[var23.field5010];
                } else if (var20 == 1) {
                    var27 = class200.field3432[var23.field5010];
                } else if (var20 == 2) {
                    var27 = class14.field315[var23.field5010];
                } else if (var20 == 3) {
                    var27 = class273.field4682[var23.field5010];
                }
                if (var27 != null) {
                    int var28 = (var23.field5017 * 4 - var27.field3008) / 2;
                    int var29 = (var23.field4957 * 4 - var27.field3011) / 2;
                    var27.method279((arg3 * 4) + var28 + 48, 48 - -((-arg4 + 104 + -var23.field4957) * 4) + var29);
                }
            } else if (var21 == 9) {
                int var24 = 15658734;
                if (var18 > 0L) {
                    var24 = 15597568;
                }
                int var25 = arg3 * 4 + ((52736 - (arg4 * 512)) * 4) + 24624;
                int[] var26 = class210.field3529;
                if (var20 == 0 || var20 == 2) {
                    var26[var25 + 1536] = var24;
                    var26[var25 + 1024 + 1] = var24;
                    var26[var25 + 514] = var24;
                    var26[var25 + 3] = var24;
                } else {
                    var26[var25] = var24;
                    var26[var25 + 513] = var24;
                    var26[var25 + 1026] = var24;
                    var26[var25 + 1536 + 3] = var24;
                }
            }
        }
        long var30 = class244.method1775(arg0, arg3, arg4);
        if (var30 == 0L) {
            return;
        }
        int var32 = ((int) var30 & 0x3F3D86) >> 20;
        int var33 = (int) (var30 >>> 32) & Integer.MAX_VALUE;
        class290 var34 = class172.method1207(var33, -114);
        if (var34.field5010 == -1) {
            return;
        }
        class176 var35 = null;
        if (!var34.field5002) {
            var35 = class189.field3254[var34.field5010];
        } else if (var32 == 0) {
            var35 = class189.field3254[var34.field5010];
        } else if (var32 == 1) {
            var35 = class200.field3432[var34.field5010];
        } else if (var32 == 2) {
            var35 = class14.field315[var34.field5010];
        } else if (var32 == 3) {
            var35 = class273.field4682[var34.field5010];
        }
        if (var35 != null) {
            int var36 = (var34.field4957 * 4 - var35.field3011) / 2;
            int var37 = (var34.field5017 * 4 - var35.field3008) / 2;
            var35.method279(arg3 * 4 + (var37 + 48), (-var34.field4957 + 104 + -arg4) * 4 + var36 + 48);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III)V")
    public abstract void method281(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V")
    public abstract void method279(int arg0, int arg1);
}
