import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class210 extends class221 {

    @OriginalMember(owner = "client!rc", name = "Rb", descriptor = "I")
    public static int field3337 = 0;

    @OriginalMember(owner = "client!rc", name = "Sb", descriptor = "Lii;")
    public static class221 field3338 = new class221(8);

    @OriginalMember(owner = "client!rc", name = "gc", descriptor = "Ltj;")
    public static class73 field3352 = new class73(30);

    @OriginalMember(owner = "client!rc", name = "ic", descriptor = "I")
    public static int field3354 = 0;

    @OriginalMember(owner = "client!rc", name = "hc", descriptor = "I")
    public static int field3353 = 0;

    @OriginalMember(owner = "client!rc", name = "jc", descriptor = "Lma;")
    public static class5 field3355 = class12.method119("Fps:", (byte) 112);

    @OriginalMember(owner = "client!rc", name = "Ob", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!rc", name = "Pb", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!rc", name = "Qb", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!rc", name = "Tb", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!rc", name = "Ub", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!rc", name = "Vb", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!rc", name = "Wb", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!rc", name = "Yb", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!rc", name = "Zb", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!rc", name = "ac", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!rc", name = "bc", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!rc", name = "cc", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!rc", name = "dc", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!rc", name = "ec", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!rc", name = "fc", descriptor = "I")
    private int field3351;

    @OriginalMember(owner = "client!rc", name = "Xb", descriptor = "Lpc;")
    private class274 field3343;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZI)Lsk;", line = 4)
    public static final class252 method1383(boolean arg0, int arg1) {
        field3342++;
        class252 var2 = (class252) class20.field341.method964(-257, (long) arg1);
        if (!arg0) {
            field3353 = 88;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class201.field3196.method1342(79, 5, arg1);
        class252 var4 = new class252();
        if (var3 != null) {
            var4.method1763(-106, new class221(var3));
        }
        class20.field341.method966(var4, (long) arg1, (byte) 73);
        return var4;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(I)V", line = 27)
    public class210(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "(B)V", line = 37)
    public static void method1384(byte arg0) {
        if (arg0 == -29) {
            field3338 = null;
            field3352 = null;
            field3355 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIII)V", line = 51)
    public static final void method1385(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 2) {
            method1383(true, -35);
        }
        field3349++;
        long var6 = class223.method1576(arg5, arg1, arg0);
        if (var6 != 0L) {
            int var8 = (int) var6 >> 20 & 0x3;
            int var9 = ((int) var6 & 0x7EC24) >> 14;
            int var10 = arg4;
            if (var6 > 0L) {
                var10 = arg3;
            }
            int[] var11 = class191.field2981;
            int var12 = (52736 - arg0 * 512) * 4 + arg1 * 4 + 24624;
            int var13 = (int) (var6 >>> 32) & Integer.MAX_VALUE;
            class185 var14 = class77.method536(var13, 121);
            if (var14.field2892 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var8 == 1) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 3 + 512] = var10;
                        var11[var12 + 1024 + 3] = var10;
                        var11[var12 + 1539] = var10;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1 + 1536] = var10;
                        var11[var12 + 2 + 1536] = var10;
                        var11[var12 + 1539] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var11[var12] = var10;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var10;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var8 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 3 + 512] = var10;
                        var11[var12 + 1024 + 3] = var10;
                        var11[var12 + 1536 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1 + 1536] = var10;
                        var11[var12 + 1536 + 2] = var10;
                        var11[var12 + 1539] = var10;
                    }
                }
            } else {
                class178 var15 = null;
                if (!var14.field2869) {
                    var15 = class49.field769[var14.field2892];
                } else if (var8 == 0) {
                    var15 = class49.field769[var14.field2892];
                } else if (var8 == 1) {
                    var15 = class5.field36[var14.field2892];
                } else if (var8 == 2) {
                    var15 = class118.field1789[var14.field2892];
                } else if (var8 == 3) {
                    var15 = class14.field267[var14.field2892];
                }
                if (var15 != null) {
                    int var16 = (var14.field2840 * 4 - var15.field1163) / 2;
                    int var17 = (var14.field2859 * 4 - var15.field1172) / 2;
                    var15.method525(arg1 * 4 + var16 + 48, 48 - (-((-var14.field2859 + -arg0 + 104) * 4) + -var17));
                }
            }
        }
        long var18 = class158.method1013(arg5, arg1, arg0);
        if (var18 != 0L) {
            int var20 = (int) var18 >> 14 & 0x1F;
            int var21 = ((int) var18 & 0x316553) >> 20;
            int var22 = Integer.MAX_VALUE & (int) (var18 >>> 32);
            class185 var23 = class77.method536(var22, arg2 + 119);
            if (var23.field2892 != -1) {
                class178 var27 = null;
                if (!var23.field2869) {
                    var27 = class49.field769[var23.field2892];
                } else if (var21 == 0) {
                    var27 = class49.field769[var23.field2892];
                } else if (var21 == 1) {
                    var27 = class5.field36[var23.field2892];
                } else if (var21 == 2) {
                    var27 = class118.field1789[var23.field2892];
                } else if (var21 == 3) {
                    var27 = class14.field267[var23.field2892];
                }
                if (var27 != null) {
                    int var28 = (var23.field2859 * 4 - var27.field1172) / 2;
                    int var29 = (var23.field2840 * 4 - var27.field1163) / 2;
                    var27.method525(arg1 * 4 + var29 + 48, (-arg0 - var23.field2859 + 104) * 4 + var28 + 48);
                }
            } else if (var20 == 9) {
                int var24 = 15658734;
                if (var18 > 0L) {
                    var24 = 15597568;
                }
                int var25 = (52736 - (arg0 * 512)) * 4 + ((arg1 * 4) + 24624);
                int[] var26 = class191.field2981;
                if (var21 == 0 || var21 == 2) {
                    var26[var25 + 1536] = var24;
                    var26[var25 + 1024 + 1] = var24;
                    var26[var25 + 514] = var24;
                    var26[var25 + 3] = var24;
                } else {
                    var26[var25] = var24;
                    var26[var25 + 513] = var24;
                    var26[var25 + 1024 + 2] = var24;
                    var26[var25 + 1539] = var24;
                }
            }
        }
        long var30 = class157.method1008(arg5, arg1, arg0);
        if (var30 == 0L) {
            return;
        }
        int var32 = Integer.MAX_VALUE & (int) (var30 >>> 32);
        int var33 = (int) var30 >> 20 & 0x3;
        class185 var34 = class77.method536(var32, arg2 ^ 0x7F);
        if (var34.field2892 == -1) {
            return;
        }
        class178 var35 = null;
        if (!var34.field2869) {
            var35 = class49.field769[var34.field2892];
        } else if (var33 == 0) {
            var35 = class49.field769[var34.field2892];
        } else if (var33 == 1) {
            var35 = class5.field36[var34.field2892];
        } else if (var33 == 2) {
            var35 = class118.field1789[var34.field2892];
        } else if (var33 == 3) {
            var35 = class14.field267[var34.field2892];
        }
        if (var35 != null) {
            int var36 = (var34.field2859 * 4 - var35.field1172) / 2;
            int var37 = (var34.field2840 * 4 - var35.field1163) / 2;
            var35.method525(arg1 * 4 + (var37 + 48), (104 - (var34.field2859 + arg0)) * 4 + var36 + 48);
        }
    }

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "(II)I", line = 364)
    public final int method1386(int arg0, int arg1) {
        if (arg1 != 13327) {
            field3338 = (class221) null;
        }
        field3340++;
        return arg0 * 8 - this.field3351;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(ZI)I", line = 383)
    public final int method1387(boolean arg0, int arg1) {
        field3348++;
        if (!arg0) {
            this.method1386(-34, 50);
        }
        int var3 = this.field3351 >> 3;
        int var4 = 0;
        int var5 = 8 - (this.field3351 & 0x7);
        this.field3351 += arg1;
        while (var5 < arg1) {
            var4 += (class239.field3972[var5] & this.field3617[var3++]) << arg1 - var5;
            arg1 -= var5;
            var5 = 8;
        }
        int var6;
        if (arg1 == var5) {
            var6 = (this.field3617[var3] & class239.field3972[var5]) + var4;
        } else {
            var6 = (this.field3617[var3] >> var5 - arg1 & class239.field3972[arg1]) + var4;
        }
        return var6;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILeb;II)V", line = 417)
    public static final void method1388(int arg0, class253 arg1, int arg2, int arg3) {
        int var4 = 45 / ((arg0 - 47) / 32);
        field3345++;
        if (class174.field2664 != null || class251.field4162 || arg1 == null || class267.method1832(-1, arg1) == null) {
            return;
        }
        class174.field2664 = arg1;
        class189.field2959 = class267.method1832(-1, arg1);
        class136.field2018 = 0;
        class98.field1466 = arg3;
        class136.field2011 = false;
        class270.field4630 = arg2;
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(BI)V", line = 440)
    public final void method1389(byte arg0, int arg1) {
        field3344++;
        int var3 = -99 / ((arg0 - 58) / 37);
        this.field3617[this.field3610++] = (byte) (arg1 + this.field3343.method1869(256));
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([II)V", line = 456)
    public final void method1390(int[] arg0, int arg1) {
        if (arg1 != 48) {
            field3355 = (class5) null;
        }
        this.field3343 = new class274(arg0);
        field3346++;
    }

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "(I)V", line = 468)
    public final void method1391(int arg0) {
        this.field3610 = (this.field3351 + 7) / 8;
        if (arg0 != 2) {
            field3337 = 80;
        }
        field3347++;
    }

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "(I)V", line = 484)
    public final void method1392(int arg0) {
        field3336++;
        this.field3351 = this.field3610 * 8;
        if (arg0 != -3564) {
            field3337 = -70;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([Lf;III)V", line = 495)
    public static final void method1393(class303[] arg0, int arg1, int arg2, int arg3) {
        field3334++;
        if (arg1 < 49) {
            field3355 = (class5) null;
        }
        if (arg3 <= arg2) {
            return;
        }
        int var4 = arg2 - 1;
        int var5 = (arg2 + arg3) / 2;
        class303 var6 = arg0[var5];
        int var7 = arg3 + 1;
        arg0[var5] = arg0[arg2];
        arg0[arg2] = var6;
        while (var7 > var4) {
            boolean var8 = true;
            do {
                var7--;
                for (int var9 = 0; var9 < 4; var9++) {
                    int var10;
                    int var11;
                    if (class166.field2535[var9] == 2) {
                        var10 = arg0[var7].field5110;
                        var11 = var6.field5110;
                    } else if (class166.field2535[var9] == 1) {
                        var10 = arg0[var7].field5118;
                        var11 = var6.field5118;
                        if (var10 == -1 && class267.field4596[var9] == 1) {
                            var10 = 2001;
                        }
                        if (var11 == -1 && class267.field4596[var9] == 1) {
                            var11 = 2001;
                        }
                    } else if (class166.field2535[var9] == 3) {
                        var10 = arg0[var7].field5117 ? 1 : 0;
                        var11 = var6.field5117 ? 1 : 0;
                    } else {
                        var11 = var6.field5100;
                        var10 = arg0[var7].field5100;
                    }
                    if (var10 != var11) {
                        if ((class267.field4596[var9] != 1 || var10 <= var11) && (class267.field4596[var9] != 0 || var11 <= var10)) {
                            var8 = false;
                        }
                        break;
                    }
                    if (var9 == 3) {
                        var8 = false;
                    }
                }
            } while (var8);
            boolean var12 = true;
            do {
                var4++;
                for (int var13 = 0; var13 < 4; var13++) {
                    int var14;
                    int var15;
                    if (class166.field2535[var13] == 2) {
                        var14 = arg0[var4].field5110;
                        var15 = var6.field5110;
                    } else if (class166.field2535[var13] == 1) {
                        var15 = var6.field5118;
                        var14 = arg0[var4].field5118;
                        if (var14 == -1 && class267.field4596[var13] == 1) {
                            var14 = 2001;
                        }
                        if (var15 == -1 && class267.field4596[var13] == 1) {
                            var15 = 2001;
                        }
                    } else if (class166.field2535[var13] == 3) {
                        var15 = var6.field5117 ? 1 : 0;
                        var14 = arg0[var4].field5117 ? 1 : 0;
                    } else {
                        var14 = arg0[var4].field5100;
                        var15 = var6.field5100;
                    }
                    if (var14 != var15) {
                        if ((class267.field4596[var13] != 1 || var14 >= var15) && (class267.field4596[var13] != 0 || var15 >= var14)) {
                            var12 = false;
                        }
                        break;
                    }
                    if (var13 == 3) {
                        var12 = false;
                    }
                }
            } while (var12);
            if (var4 < var7) {
                class303 var16 = arg0[var4];
                arg0[var4] = arg0[var7];
                arg0[var7] = var16;
            }
        }
        method1393(arg0, 99, arg2, var7);
        method1393(arg0, 91, var7 + 1, arg3);
    }

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "(I)I", line = 681)
    public final int method1394(int arg0) {
        field3339++;
        return arg0 == 255 ? this.field3617[this.field3610++] - this.field3343.method1869(256) & 0xFF : 11;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II[BB)V", line = 694)
    public final void method1395(int arg0, int arg1, byte[] arg2, byte arg3) {
        for (int var5 = 0; var5 < arg0; var5++) {
            arg2[arg1 + var5] = (byte) (this.field3617[this.field3610++] - this.field3343.method1869(256));
        }
        int var6 = -65 / ((arg3 - 36) / 43);
        field3335++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZBIILni;I)V", line = 708)
    public static final void method1396(int arg0, boolean arg1, byte arg2, int arg3, int arg4, class202 arg5, int arg6) {
        class100.field1487 = arg0;
        class33.field509 = arg1;
        class106.field1579 = 1;
        class142.field2088 = arg4;
        class15.field274 = arg6;
        class174.field2656 = arg3;
        field3350++;
        class171.field2629 = arg5;
        if (arg2 > -1) {
            field3338 = (class221) null;
        }
    }
}
