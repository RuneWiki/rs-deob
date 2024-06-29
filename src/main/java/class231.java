import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class231 {

    @OriginalMember(owner = "client!nt", name = "g", descriptor = "Lpa;")
    private class387 field3360 = new class387(64);

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "Lcb;")
    private class544 field3359;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!nt", name = "h", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!nt", name = "i", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!nt", name = "j", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)Lcu;", line = 7)
    public final class228 method1601(int arg0, int arg1) {
        field3356++;
        class387 var3 = this.field3360;
        class228 var4;
        synchronized (this.field3360) {
            var4 = (class228) this.field3360.method2373((long) arg0, 103);
        }
        if (var4 != null) {
            return var4;
        }
        class544 var5 = this.field3359;
        byte[] var6;
        synchronized (this.field3359) {
            var6 = this.field3359.method3150(arg0, -80, arg1);
        }
        class228 var7 = new class228();
        if (var6 != null) {
            var7.method1575(new class120(var6), -1);
        }
        var7.method1576(12326);
        class387 var8 = this.field3360;
        synchronized (this.field3360) {
            this.field3360.method2362(var7, arg1 - 35, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V", line = 42)
    public final void method1602(byte arg0) {
        if (arg0 != -90) {
            this.method1601(-25, 28);
        }
        field3363++;
        class387 var2 = this.field3360;
        synchronized (this.field3360) {
            this.field3360.method2364(1);
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V", line = 60)
    public final void method1603(int arg0) {
        if (arg0 != -1) {
            method1604(-88, 98, true, 109, null, 59);
        }
        class387 var2 = this.field3360;
        synchronized (this.field3360) {
            this.field3360.method2369(arg0);
        }
        field3361++;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIZI[[[Lrr;I)Z", line = 73)
    public static final boolean method1604(int arg0, int arg1, boolean arg2, int arg3, class379[][][] arg4, int arg5) {
        field3357++;
        byte var6 = arg2 ? 1 : (byte) (class327.field4890 & 0xFF);
        if (class278.field3871[class410.field5771][arg5][arg1] == var6) {
            return false;
        } else if ((class617.field8700[class410.field5771][arg5][arg1] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class110.field1320[var7] = arg5;
            int var8 = 0;
            int var35 = var7 + 1;
            class147.field1871[var7] = arg1;
            class278.field3871[class410.field5771][arg5][arg1] = var6;
            while (var35 != var8) {
                int var9 = class110.field1320[var8] & 0xFFFF;
                int var10 = (class110.field1320[var8] & 0xFF18AC) >> 16;
                int var11 = class110.field1320[var8] >> 24 & 0xFF;
                int var12 = class147.field1871[var8] & 0xFFFF;
                int var13 = class147.field1871[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class617.field8700[class410.field5771][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                if (arg4 != null) {
                    label244: for (int var16 = class410.field5771 + 1; var16 <= 3; var16++) {
                        if (arg4[var16] != null && (class617.field8700[var16][var9][var12] & 0x8) == 0) {
                            if (var14 && arg4[var16][var9][var12] != null) {
                                if (arg4[var16][var9][var12].field5439 != null) {
                                    int var17 = class38.method273(3, var10);
                                    if (arg4[var16][var9][var12].field5439.field10107 == var17 || arg4[var16][var9][var12].field5430 != null && arg4[var16][var9][var12].field5430.field10107 == var17) {
                                        continue;
                                    }
                                    if (var11 != 0) {
                                        int var18 = class38.method273(arg3 + 19742, var11);
                                        if (arg4[var16][var9][var12].field5439.field10107 == var18 || arg4[var16][var9][var12].field5430 != null && arg4[var16][var9][var12].field5430.field10107 == var18) {
                                            continue;
                                        }
                                    }
                                    if (var13 != 0) {
                                        int var19 = class38.method273(3, var13);
                                        if (arg4[var16][var9][var12].field5439.field10107 == var19 || arg4[var16][var9][var12].field5430 != null && arg4[var16][var9][var12].field5430.field10107 == var19) {
                                            continue;
                                        }
                                    }
                                }
                                class379 var20 = arg4[var16][var9][var12];
                                if (var20.field5437 != null) {
                                    for (class393 var21 = var20.field5437; var21 != null; var21 = var21.field5574) {
                                        class778 var22 = var21.field5578;
                                        if (var22 instanceof class362) {
                                            class362 var23 = (class362) var22;
                                            int var24 = var23.method646((byte) 45);
                                            if (var24 == 21) {
                                                var24 = 19;
                                            }
                                            int var25 = var23.method643(false);
                                            int var26 = var24 | var25 << 6;
                                            if (var10 == var26 || var11 != 0 && var11 == var26 || var13 != 0 && var13 == var26) {
                                                continue label244;
                                            }
                                        }
                                    }
                                }
                            }
                            class379 var27 = arg4[var16][var9][var12];
                            if (var27 != null && var27.field5437 != null) {
                                for (class393 var28 = var27.field5437; var28 != null; var28 = var28.field5574) {
                                    class778 var29 = var28.field5578;
                                    if (var29.field10733 != var29.field10727 || var29.field10736 != var29.field10730) {
                                        for (int var30 = var29.field10733; var30 <= var29.field10727; var30++) {
                                            for (int var31 = var29.field10730; var31 <= var29.field10736; var31++) {
                                                class278.field3871[var16][var30][var31] = var6;
                                            }
                                        }
                                    }
                                }
                            }
                            var15 = true;
                            class278.field3871[var16][var9][var12] = var6;
                        }
                    }
                }
                if (var15) {
                    int var32 = class622.field8777[class410.field5771 + 1].method1976(var9, -1, var12);
                    if (class175.field2497[arg0] < var32) {
                        class175.field2497[arg0] = var32;
                    }
                    int var33 = var9 << 9;
                    int var34 = var12 << 9;
                    if (class685.field9720[arg0] > var33) {
                        class685.field9720[arg0] = var33;
                    } else if (class206.field3023[arg0] < var33) {
                        class206.field3023[arg0] = var33;
                    }
                    if (class145.field1854[arg0] > var34) {
                        class145.field1854[arg0] = var34;
                    } else if (class624.field8795[arg0] < var34) {
                        class624.field8795[arg0] = var34;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class278.field3871[class410.field5771][var9 - 1][var12] != var6) {
                        class110.field1320[var35] = class281.method1904(-754974720, class281.method1904(var9 - 1, 1179648));
                        class147.field1871[var35] = class281.method1904(var12, 1245184);
                        var35 = var35 + 1 & 0xFFF;
                        class278.field3871[class410.field5771][var9 - 1][var12] = var6;
                    }
                    int var10000 = ~class760.field10479;
                    var12++;
                    if (var10000 < ~var12) {
                        if ((var9 - 1) >= 0 && class278.field3871[class410.field5771][var9 - 1][var12] != var6 && (class617.field8700[class410.field5771][var9][var12] & 0x4) == 0 && (class617.field8700[class410.field5771][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class110.field1320[var35] = class281.method1904(class281.method1904(1179648, var9 - 1), 1375731712);
                            class147.field1871[var35] = class281.method1904(1245184, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class278.field3871[class410.field5771][var9 - 1][var12] = var6;
                        }
                        if (class278.field3871[class410.field5771][var9][var12] != var6) {
                            class110.field1320[var35] = class281.method1904(class281.method1904(var9, 5373952), 318767104);
                            class147.field1871[var35] = class281.method1904(var12, 5439488);
                            class278.field3871[class410.field5771][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class109.field1314 > var9 + 1 && class278.field3871[class410.field5771][var9 + 1][var12] != var6 && (class617.field8700[class410.field5771][var9][var12] & 0x4) == 0 && (class617.field8700[class410.field5771][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class110.field1320[var35] = class281.method1904(-1845493760, class281.method1904(var9 + 1, 5373952));
                            class147.field1871[var35] = class281.method1904(var12, 5439488);
                            class278.field3871[class410.field5771][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if (class109.field1314 > var9 + 1 && class278.field3871[class410.field5771][var9 + 1][var12] != var6) {
                        class110.field1320[var35] = class281.method1904(class281.method1904(var9 + 1, 9568256), 1392508928);
                        class147.field1871[var35] = class281.method1904(9633792, var12);
                        var35 = var35 + 1 & 0xFFF;
                        class278.field3871[class410.field5771][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class278.field3871[class410.field5771][var9 - 1][var12] != var6 && (class617.field8700[class410.field5771][var9][var12] & 0x4) == 0 && (class617.field8700[class410.field5771][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class110.field1320[var35] = class281.method1904(301989888, class281.method1904(var9 - 1, 13762560));
                            class147.field1871[var35] = class281.method1904(var12, 13828096);
                            var35 = var35 + 1 & 0xFFF;
                            class278.field3871[class410.field5771][var9 - 1][var12] = var6;
                        }
                        if (class278.field3871[class410.field5771][var9][var12] != var6) {
                            class110.field1320[var35] = class281.method1904(-1828716544, class281.method1904(13762560, var9));
                            class147.field1871[var35] = class281.method1904(13828096, var12);
                            class278.field3871[class410.field5771][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < class109.field1314 && class278.field3871[class410.field5771][var9 + 1][var12] != var6 && (class617.field8700[class410.field5771][var9][var12] & 0x4) == 0 && (class617.field8700[class410.field5771][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class110.field1320[var35] = class281.method1904(-771751936, class281.method1904(var9 + 1, 9568256));
                            class147.field1871[var35] = class281.method1904(9633792, var12);
                            class278.field3871[class410.field5771][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (arg3 != -19739) {
                method1604(124, 98, true, 110, null, -23);
            }
            if (class175.field2497[arg0] != -1000000) {
                class175.field2497[arg0] += 40;
                class685.field9720[arg0] -= 512;
                class206.field3023[arg0] += 512;
                class624.field8795[arg0] += 512;
                class145.field1854[arg0] -= 512;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Liv;ILcb;)V", line = 413)
    public class231(class106 arg0, int arg1, class544 arg2) {
        this.field3359 = arg2;
        if (this.field3359 != null) {
            this.field3359.method3147(35, 34);
        }
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(II)V", line = 401)
    public final void method1605(int arg0, int arg1) {
        field3362++;
        class387 var3 = this.field3360;
        synchronized (this.field3360) {
            this.field3360.method2366(arg0, 113);
            if (arg1 != 5635) {
                field3358 = 77;
            }
        }
    }
}
