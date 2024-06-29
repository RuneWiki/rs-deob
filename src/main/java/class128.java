import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class128 {

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "Ljd;")
    private class92 field1986;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Lrk;")
    private class16 field1984;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "Ltg;")
    private class93 field1985;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "Lre;")
    private class263 field1989;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "[Lrj;")
    private class258[] field1992;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLog;ILog;)Lrj;", line = 4)
    public final class258 method951(byte arg0, class283 arg1, int arg2, class283 arg3) {
        if (arg0 < 1) {
            return (class258) null;
        } else {
            field1993++;
            return this.method956(arg1, arg3, true, (byte) 110, arg2);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIBIIII)Z", line = 18)
    public static final boolean method952(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field1991++;
        long var8 = class179.method1237(arg6, arg1 + arg2, arg0 + arg4);
        if (var8 != 0L) {
            int var10 = (int) var8 >> 14 & 0x1F;
            int var11 = ((int) var8 & 0x3F7761) >> 20;
            int var12 = Integer.MAX_VALUE & (int) (var8 >>> 32);
            class22 var13 = class284.method1980(var12, (byte) 112);
            if (var13.field300 == -1) {
                int var14 = arg5;
                if (var8 > 0L) {
                    var14 = arg7;
                }
                int[] var15 = class46.field577;
                int var16 = arg2 * 4 + (((52736 - (arg0 * 512)) * 4) + 24624);
                if (var10 == 0 || var10 == 2) {
                    if (var11 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var11 == 1) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var11 == 2) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 512 + 3] = var14;
                        var15[var16 + 3 + 1024] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var11 == 3) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1536 + 1] = var14;
                        var15[var16 + 1536 + 2] = var14;
                        var15[var16 + 1536 + 3] = var14;
                    }
                }
                if (var10 == 3) {
                    if (var11 == 0) {
                        var15[var16] = var14;
                    } else if (var11 == 1) {
                        var15[var16 + 3] = var14;
                    } else if (var11 == 2) {
                        var15[var16 + 1539] = var14;
                    } else if (var11 == 3) {
                        var15[var16 + 1536] = var14;
                    }
                }
                if (var10 == 2) {
                    if (var11 == 3) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var11 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var11 == 1) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 512 + 3] = var14;
                        var15[var16 + 1024 + 3] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var11 == 2) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1537] = var14;
                        var15[var16 + 1536 + 2] = var14;
                        var15[var16 + 1536 + 3] = var14;
                    }
                }
            } else if (!class307.method2117(arg2, arg1, var11, arg0, var13, 109, arg4)) {
                return false;
            }
        }
        long var17 = class73.method471(arg6, arg1 + arg2, arg0 + arg4);
        if (arg3 != 76) {
            return false;
        }
        if (var17 != 0L) {
            int var19 = (int) var17 >> 20 & 0x3;
            int var20 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            int var21 = (int) var17 >> 14 & 0x1F;
            class22 var22 = class284.method1980(var20, (byte) 90);
            if (var22.field300 == -1) {
                if (var21 == 9) {
                    int[] var23 = class46.field577;
                    int var24 = 15658734;
                    int var25 = (103 - arg0) * 2048 + ((arg2 * 4) + 24624);
                    if (var17 > 0L) {
                        var24 = 15597568;
                    }
                    if (var19 == 0 || var19 == 2) {
                        var23[var25 + 1536] = var24;
                        var23[var25 + 1024 + 1] = var24;
                        var23[var25 + 514] = var24;
                        var23[var25 + 3] = var24;
                    } else {
                        var23[var25] = var24;
                        var23[var25 + 1 + 512] = var24;
                        var23[var25 + 1024 + 2] = var24;
                        var23[var25 + 1536 + 3] = var24;
                    }
                }
            } else if (!class307.method2117(arg2, arg1, var19, arg0, var22, 108, arg4)) {
                return false;
            }
        }
        long var26 = class316.method2165(arg6, arg1 + arg2, arg0 + arg4);
        if (var26 != 0L) {
            int var28 = (int) var26 >> 20 & 0x3;
            int var29 = Integer.MAX_VALUE & (int) (var26 >>> 32);
            class22 var30 = class284.method1980(var29, (byte) 126);
            if (var30.field300 != -1 && !class307.method2117(arg2, arg1, var28, arg0, var30, arg3 ^ 0x3E, arg4)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)Z", line = 230)
    public final boolean method953(int arg0) {
        if (arg0 >= -18) {
            this.method951((byte) 73, (class283) null, -114, (class283) null);
        }
        field1988++;
        if (this.field1989 != null) {
            return true;
        }
        if (this.field1985 == null) {
            if (this.field1986.method651((byte) 54)) {
                return false;
            }
            this.field1985 = this.field1986.method647(255, true, (byte) 0, 255, 1321879792);
        }
        if (this.field1985.field1129) {
            return false;
        } else {
            this.field1989 = new class263(this.field1985.method75(954));
            this.field1992 = new class258[(this.field1989.field3986.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V", line = 264)
    public final void method954(byte arg0) {
        field1990++;
        if (this.field1992 == null) {
            return;
        }
        if (arg0 != 60) {
            this.field1989 = (class263) null;
        }
        for (int var2 = 0; var2 < this.field1992.length; var2++) {
            if (this.field1992[var2] != null) {
                this.field1992[var2].method1756((byte) -90);
            }
        }
        for (int var3 = 0; var3 < this.field1992.length; var3++) {
            if (this.field1992[var3] != null) {
                this.field1992[var3].method1755(true);
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lum;Z)V", line = 300)
    public static final void method955(class221 arg0, boolean arg1) {
        class109.field1686.method1108(arg0, 65280);
        while (true) {
            class221 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class221[][] var7;
            class221 var78;
            do {
                class221 var77;
                do {
                    class221 var76;
                    do {
                        class221 var75;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class221) class109.field1686.method1114(-13454);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field3360);
                                            var3 = var2.field3353;
                                            var4 = var2.field3366;
                                            var5 = var2.field3372;
                                            var6 = var2.field3376;
                                            var7 = class158.field2367[var5];
                                            float var8 = 0.0F;
                                            if (class117.field1817) {
                                                if (class318.field4797 == class294.field4502) {
                                                    int var9 = class56.field705[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class192.field2883 != var10) {
                                                        class192.field2883 = var10;
                                                        class192.method1331(var10, -110);
                                                        class280.method1954(class258.method1748(-64));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class294.field4501 != var11) {
                                                        class294.field4501 = var11;
                                                        class181.method1254((byte) -43, var11);
                                                    }
                                                    int var12 = class55.field690[0][var3 + 1][var4] + class55.field690[0][var3][var4] + class55.field690[0][var3][var4 + 1] + class55.field690[0][var3 + 1][var4 + 1] >> 2;
                                                    class204.method1397(-90, -var12, 3);
                                                    var8 = 201.5F;
                                                    class117.method801(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class117.method801(var8);
                                                }
                                            }
                                            if (!var2.field3365) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class221 var13 = class158.field2367[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field3360) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class271.field4153 && var3 > class183.field2741) {
                                                    class221 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field3360 && (var14.field3365 || (var2.field3363 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class271.field4153 && var3 < class327.field4917 - 1) {
                                                    class221 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field3360 && (var15.field3365 || (var2.field3363 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class147.field2214 && var4 > class212.field3223) {
                                                    class221 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field3360 && (var16.field3365 || (var2.field3363 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class147.field2214 && var4 < class76.field993 - 1) {
                                                    class221 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field3360 && (var17.field3365 || (var2.field3363 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field3365 = false;
                                            if (var2.field3356 != null) {
                                                class221 var18 = var2.field3356;
                                                if (class117.field1817) {
                                                    class117.method801(201.5F - (float) (var18.field3376 + 1) * 50.0F);
                                                }
                                                if (var18.field3378 == null) {
                                                    if (var18.field3379 != null) {
                                                        if (class310.method2143(0, var3, var4)) {
                                                            class228.method1579(var18.field3379, class26.field366, class113.field1748, class28.field382, class184.field2756, var3, var4, true);
                                                        } else {
                                                            class228.method1579(var18.field3379, class26.field366, class113.field1748, class28.field382, class184.field2756, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class310.method2143(0, var3, var4)) {
                                                    class316.method2167(var18.field3378, 0, class26.field366, class113.field1748, class28.field382, class184.field2756, var3, var4, true);
                                                } else {
                                                    class316.method2167(var18.field3378, 0, class26.field366, class113.field1748, class28.field382, class184.field2756, var3, var4, false);
                                                }
                                                class163 var19 = var18.field3370;
                                                if (var19 != null) {
                                                    if (class117.field1817) {
                                                        if ((var19.field2460 & var2.field3359) == 0) {
                                                            class31.method202(class44.field556, class257.field3885, class316.field4773, var5, var3, var4);
                                                        } else {
                                                            class31.method204(var19.field2460, class44.field556, class257.field3885, class316.field4773, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field2451.method111(0, class26.field366, class113.field1748, class28.field382, class184.field2756, var19.field2449 - class44.field556, var19.field2461 - class257.field3885, var19.field2464 - class316.field4773, var19.field2448, var5, (class18) null);
                                                }
                                                for (int var20 = 0; var20 < var18.field3374; var20++) {
                                                    class311 var21 = var18.field3354[var20];
                                                    if (var21 != null) {
                                                        if (class117.field1817) {
                                                            class31.method202(class44.field556, class257.field3885, class316.field4773, var5, var3, var4);
                                                        }
                                                        var21.field4728.method111(var21.field4721, class26.field366, class113.field1748, class28.field382, class184.field2756, var21.field4723 - class44.field556, var21.field4727 - class257.field3885, var21.field4739 - class316.field4773, var21.field4720, var5, (class18) null);
                                                    }
                                                }
                                                if (class117.field1817) {
                                                    class117.method801(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field3378 == null) {
                                                if (var2.field3379 != null) {
                                                    if (class310.method2143(var6, var3, var4)) {
                                                        class228.method1579(var2.field3379, class26.field366, class113.field1748, class28.field382, class184.field2756, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class228.method1579(var2.field3379, class26.field366, class113.field1748, class28.field382, class184.field2756, var3, var4, false);
                                                    }
                                                }
                                            } else if (class310.method2143(var6, var3, var4)) {
                                                class316.method2167(var2.field3378, var6, class26.field366, class113.field1748, class28.field382, class184.field2756, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field3378.field3467 != 12345678 || class126.field1976 && var5 <= class172.field2578) {
                                                    class316.method2167(var2.field3378, var6, class26.field366, class113.field1748, class28.field382, class184.field2756, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class187 var23 = var2.field3364;
                                                if (var23 != null && (var23.field2787 & 0x80000000L) != 0L) {
                                                    if (class117.field1817 && var23.field2794) {
                                                        class117.method801(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class117.field1817) {
                                                        class31.method202(class44.field556, class257.field3885, class316.field4773, var5, var3, var4);
                                                    }
                                                    var23.field2781.method111(0, class26.field366, class113.field1748, class28.field382, class184.field2756, var23.field2793 - class44.field556, var23.field2782 - class257.field3885, var23.field2792 - class316.field4773, var23.field2787, var5, (class18) null);
                                                    if (class117.field1817 && var23.field2794) {
                                                        class117.method801(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class163 var26 = var2.field3370;
                                            class226 var27 = var2.field3368;
                                            if (var26 != null || var27 != null) {
                                                if (class271.field4153 == var3) {
                                                    var24++;
                                                } else if (class271.field4153 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class147.field2214 == var4) {
                                                    var24 += 3;
                                                } else if (class147.field2214 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class286.field4319[var24];
                                                var2.field3359 = class195.field2923[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field2460 & class111.field1720[var24]) == 0) {
                                                    var2.field3375 = 0;
                                                } else if (var26.field2460 == 16) {
                                                    var2.field3375 = 3;
                                                    var2.field3367 = class157.field2356[var24];
                                                    var2.field3358 = 3 - var2.field3367;
                                                } else if (var26.field2460 == 32) {
                                                    var2.field3375 = 6;
                                                    var2.field3367 = class45.field565[var24];
                                                    var2.field3358 = 6 - var2.field3367;
                                                } else if (var26.field2460 == 64) {
                                                    var2.field3375 = 12;
                                                    var2.field3367 = class287.field4337[var24];
                                                    var2.field3358 = 12 - var2.field3367;
                                                } else {
                                                    var2.field3375 = 9;
                                                    var2.field3367 = class76.field981[var24];
                                                    var2.field3358 = 9 - var2.field3367;
                                                }
                                                if ((var26.field2460 & var25) != 0 && !class16.method105(var6, var3, var4, var26.field2460)) {
                                                    if (class117.field1817) {
                                                        class31.method202(class44.field556, class257.field3885, class316.field4773, var5, var3, var4);
                                                    }
                                                    var26.field2451.method111(0, class26.field366, class113.field1748, class28.field382, class184.field2756, var26.field2449 - class44.field556, var26.field2461 - class257.field3885, var26.field2464 - class316.field4773, var26.field2448, var5, (class18) null);
                                                }
                                                if ((var26.field2457 & var25) != 0 && !class16.method105(var6, var3, var4, var26.field2457)) {
                                                    if (class117.field1817) {
                                                        class31.method202(class44.field556, class257.field3885, class316.field4773, var5, var3, var4);
                                                    }
                                                    var26.field2452.method111(0, class26.field366, class113.field1748, class28.field382, class184.field2756, var26.field2449 - class44.field556, var26.field2461 - class257.field3885, var26.field2464 - class316.field4773, var26.field2448, var5, (class18) null);
                                                }
                                            }
                                            if (var27 != null && !class26.method170(var6, var3, var4, var27.field3450.method115())) {
                                                if (class117.field1817) {
                                                    class117.method801(var8 - 0.5F);
                                                }
                                                if ((var27.field3432 & var25) != 0) {
                                                    if (class117.field1817) {
                                                        class31.method202(class44.field556, class257.field3885, class316.field4773, var5, var3, var4);
                                                    }
                                                    var27.field3450.method111(0, class26.field366, class113.field1748, class28.field382, class184.field2756, var27.field3447 + var27.field3434 - class44.field556, var27.field3441 - class257.field3885, var27.field3446 + var27.field3438 - class316.field4773, var27.field3440, var5, (class18) null);
                                                } else if (var27.field3432 == 256) {
                                                    int var28 = var27.field3447 - class44.field556;
                                                    int var29 = var27.field3441 - class257.field3885;
                                                    int var30 = var27.field3446 - class316.field4773;
                                                    int var31 = var27.field3443;
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
                                                        if (class117.field1817) {
                                                            class31.method202(class44.field556, class257.field3885, class316.field4773, var5, var3, var4);
                                                        }
                                                        var27.field3450.method111(0, class26.field366, class113.field1748, class28.field382, class184.field2756, var27.field3434 + var28, var29, var27.field3438 + var30, var27.field3440, var5, (class18) null);
                                                    } else if (var27.field3435 != null) {
                                                        if (class117.field1817) {
                                                            class31.method202(class44.field556, class257.field3885, class316.field4773, var5, var3, var4);
                                                        }
                                                        var27.field3435.method111(0, class26.field366, class113.field1748, class28.field382, class184.field2756, var28, var29, var30, var27.field3440, var5, (class18) null);
                                                    }
                                                }
                                                if (class117.field1817) {
                                                    class117.method801(var8);
                                                }
                                            }
                                            if (var22) {
                                                class187 var34 = var2.field3364;
                                                if (var34 != null && (var34.field2787 & 0x80000000L) == 0L) {
                                                    if (class117.field1817 && var34.field2794) {
                                                        class117.method801(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class117.field1817) {
                                                        class31.method202(class44.field556, class257.field3885, class316.field4773, var5, var3, var4);
                                                    }
                                                    var34.field2781.method111(0, class26.field366, class113.field1748, class28.field382, class184.field2756, var34.field2793 - class44.field556, var34.field2782 - class257.field3885, var34.field2792 - class316.field4773, var34.field2787, var5, (class18) null);
                                                    if (class117.field1817 && var34.field2794) {
                                                        class117.method801(var8);
                                                    }
                                                }
                                                class295 var35 = var2.field3357;
                                                if (var35 != null && var35.field4511 == 0) {
                                                    if (class117.field1817) {
                                                        class31.method202(class44.field556, class257.field3885, class316.field4773, var5, var3, var4);
                                                    }
                                                    if (var35.field4518 != null) {
                                                        var35.field4518.method111(0, class26.field366, class113.field1748, class28.field382, class184.field2756, var35.field4509 - class44.field556, var35.field4524 - class257.field3885, var35.field4510 - class316.field4773, var35.field4508, var5, (class18) null);
                                                    }
                                                    if (var35.field4516 != null) {
                                                        var35.field4516.method111(0, class26.field366, class113.field1748, class28.field382, class184.field2756, var35.field4509 - class44.field556, var35.field4524 - class257.field3885, var35.field4510 - class316.field4773, var35.field4508, var5, (class18) null);
                                                    }
                                                    if (var35.field4512 != null) {
                                                        var35.field4512.method111(0, class26.field366, class113.field1748, class28.field382, class184.field2756, var35.field4509 - class44.field556, var35.field4524 - class257.field3885, var35.field4510 - class316.field4773, var35.field4508, var5, (class18) null);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field3363;
                                            if (var36 != 0) {
                                                if (var3 < class271.field4153 && (var36 & 0x4) != 0) {
                                                    class221 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field3360) {
                                                        class109.field1686.method1108(var37, 65280);
                                                    }
                                                }
                                                if (var4 < class147.field2214 && (var36 & 0x2) != 0) {
                                                    class221 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field3360) {
                                                        class109.field1686.method1108(var38, 65280);
                                                    }
                                                }
                                                if (var3 > class271.field4153 && (var36 & 0x1) != 0) {
                                                    class221 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field3360) {
                                                        class109.field1686.method1108(var39, 65280);
                                                    }
                                                }
                                                if (var4 > class147.field2214 && (var36 & 0x8) != 0) {
                                                    class221 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field3360) {
                                                        class109.field1686.method1108(var40, 65280);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field3375 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field3374; var42++) {
                                                if (class170.field2557 != var2.field3354[var42].field4737 && (var2.field3361[var42] & var2.field3375) == var2.field3367) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class163 var43 = var2.field3370;
                                                if (!class16.method105(var6, var3, var4, var43.field2460)) {
                                                    if (class117.field1817) {
                                                        label882: {
                                                            if ((var43.field2448 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field2449 - class44.field556;
                                                                int var45 = var43.field2464 - class316.field4773;
                                                                int var46 = (int) (var43.field2448 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class191.field2844 - 1) {
                                                                        class31.method202(class44.field556, class257.field3885, class316.field4773, var5, var3 - 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class311.field4734 - 1 && var4 < class191.field2844 - 1) {
                                                                        class31.method202(class44.field556, class257.field3885, class316.field4773, var5, var3 + 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class311.field4734 - 1 && var4 > 0) {
                                                                        class31.method202(class44.field556, class257.field3885, class316.field4773, var5, var3 + 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class31.method202(class44.field556, class257.field3885, class316.field4773, var5, var3 - 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                }
                                                            }
                                                            class31.method202(class44.field556, class257.field3885, class316.field4773, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field2451.method111(0, class26.field366, class113.field1748, class28.field382, class184.field2756, var43.field2449 - class44.field556, var43.field2461 - class257.field3885, var43.field2464 - class316.field4773, var43.field2448, var5, (class18) null);
                                                }
                                                var2.field3375 = 0;
                                            }
                                        }
                                        if (!var2.field3377) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field3374;
                                            var2.field3377 = false;
                                            int var48 = 0;
                                            label767: for (int var49 = 0; var49 < var47; var49++) {
                                                class311 var50 = var2.field3354[var49];
                                                if (class170.field2557 != var50.field4737) {
                                                    for (int var51 = var50.field4724; var51 <= var50.field4722; var51++) {
                                                        for (int var52 = var50.field4735; var52 <= var50.field4726; var52++) {
                                                            class221 var53 = var7[var51][var52];
                                                            if (var53.field3365) {
                                                                var2.field3377 = true;
                                                                continue label767;
                                                            }
                                                            if (var53.field3375 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field4724) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field4722) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field4735) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field4726) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field3375) == var2.field3358) {
                                                                    var2.field3377 = true;
                                                                    continue label767;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class161.field2411[var48++] = var50;
                                                    int var55 = class271.field4153 - var50.field4724;
                                                    int var56 = var50.field4722 - class271.field4153;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class147.field2214 - var50.field4735;
                                                    int var58 = var50.field4726 - class147.field2214;
                                                    if (var58 > var57) {
                                                        var50.field4742 = var55 + var58;
                                                    } else {
                                                        var50.field4742 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class311 var62 = class161.field2411[var61];
                                                    if (class170.field2557 != var62.field4737) {
                                                        if (var62.field4742 > var59) {
                                                            var59 = var62.field4742;
                                                            var60 = var61;
                                                        } else if (var62.field4742 == var59) {
                                                            int var63 = var62.field4723 - class44.field556;
                                                            int var64 = var62.field4739 - class316.field4773;
                                                            int var65 = class161.field2411[var60].field4723 - class44.field556;
                                                            int var66 = class161.field2411[var60].field4739 - class316.field4773;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class311 var67 = class161.field2411[var60];
                                                var67.field4737 = class170.field2557;
                                                if (!class57.method378(var6, var67.field4724, var67.field4722, var67.field4735, var67.field4726, var67.field4728.method115())) {
                                                    if (class117.field1817) {
                                                        if ((var67.field4720 & 0xFC000L) == 147456L) {
                                                            class31.method202(class44.field556, class257.field3885, class316.field4773, var5, var3, var4);
                                                            int var68 = var67.field4723 - class44.field556;
                                                            int var69 = var67.field4739 - class316.field4773;
                                                            int var70 = (int) (var67.field4720 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class31.method203(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class31.method203(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class31.method203(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class31.method203(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class31.method217(class44.field556, class257.field3885, class316.field4773, var5, var67.field4724, var67.field4735, var67.field4722, var67.field4726);
                                                        }
                                                    }
                                                    var67.field4728.method111(var67.field4721, class26.field366, class113.field1748, class28.field382, class184.field2756, var67.field4723 - class44.field556, var67.field4727 - class257.field3885, var67.field4739 - class316.field4773, var67.field4720, var5, (class18) null);
                                                }
                                                for (int var71 = var67.field4724; var71 <= var67.field4722; var71++) {
                                                    for (int var72 = var67.field4735; var72 <= var67.field4726; var72++) {
                                                        class221 var73 = var7[var71][var72];
                                                        if (var73.field3375 != 0) {
                                                            class109.field1686.method1108(var73, 65280);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field3360) {
                                                            class109.field1686.method1108(var73, 65280);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field3377) {
                                                break;
                                            }
                                        } catch (Exception var93) {
                                            var2.field3377 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field3360);
                            } while (var2.field3375 != 0);
                            if (var3 > class271.field4153 || var3 <= class183.field2741) {
                                break;
                            }
                            var75 = var7[var3 - 1][var4];
                        } while (var75 != null && var75.field3360);
                        if (var3 < class271.field4153 || var3 >= class327.field4917 - 1) {
                            break;
                        }
                        var76 = var7[var3 + 1][var4];
                    } while (var76 != null && var76.field3360);
                    if (var4 > class147.field2214 || var4 <= class212.field3223) {
                        break;
                    }
                    var77 = var7[var3][var4 - 1];
                } while (var77 != null && var77.field3360);
                if (var4 < class147.field2214 || var4 >= class76.field993 - 1) {
                    break;
                }
                var78 = var7[var3][var4 + 1];
            } while (var78 != null && var78.field3360);
            var2.field3360 = false;
            class302.field4615--;
            class295 var79 = var2.field3357;
            if (var79 != null && var79.field4511 != 0) {
                if (class117.field1817) {
                    class31.method202(class44.field556, class257.field3885, class316.field4773, var5, var3, var4);
                }
                if (var79.field4518 != null) {
                    var79.field4518.method111(0, class26.field366, class113.field1748, class28.field382, class184.field2756, var79.field4509 - class44.field556, var79.field4524 - class257.field3885 - var79.field4511, var79.field4510 - class316.field4773, var79.field4508, var5, (class18) null);
                }
                if (var79.field4516 != null) {
                    var79.field4516.method111(0, class26.field366, class113.field1748, class28.field382, class184.field2756, var79.field4509 - class44.field556, var79.field4524 - class257.field3885 - var79.field4511, var79.field4510 - class316.field4773, var79.field4508, var5, (class18) null);
                }
                if (var79.field4512 != null) {
                    var79.field4512.method111(0, class26.field366, class113.field1748, class28.field382, class184.field2756, var79.field4509 - class44.field556, var79.field4524 - class257.field3885 - var79.field4511, var79.field4510 - class316.field4773, var79.field4508, var5, (class18) null);
                }
            }
            if (var2.field3359 != 0) {
                class226 var80 = var2.field3368;
                if (var80 != null && !class26.method170(var6, var3, var4, var80.field3450.method115())) {
                    if ((var80.field3432 & var2.field3359) != 0) {
                        if (class117.field1817) {
                            class31.method202(class44.field556, class257.field3885, class316.field4773, var5, var3, var4);
                        }
                        var80.field3450.method111(0, class26.field366, class113.field1748, class28.field382, class184.field2756, var80.field3447 + var80.field3434 - class44.field556, var80.field3441 - class257.field3885, var80.field3446 + var80.field3438 - class316.field4773, var80.field3440, var5, (class18) null);
                    } else if (var80.field3432 == 256) {
                        int var81 = var80.field3447 - class44.field556;
                        int var82 = var80.field3441 - class257.field3885;
                        int var83 = var80.field3446 - class316.field4773;
                        int var84 = var80.field3443;
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
                            if (class117.field1817) {
                                class31.method202(class44.field556, class257.field3885, class316.field4773, var5, var3, var4);
                            }
                            var80.field3450.method111(0, class26.field366, class113.field1748, class28.field382, class184.field2756, var80.field3434 + var81, var82, var80.field3438 + var83, var80.field3440, var5, (class18) null);
                        } else if (var80.field3435 != null) {
                            if (class117.field1817) {
                                class31.method202(class44.field556, class257.field3885, class316.field4773, var5, var3, var4);
                            }
                            var80.field3435.method111(0, class26.field366, class113.field1748, class28.field382, class184.field2756, var81, var82, var83, var80.field3440, var5, (class18) null);
                        }
                    }
                }
                class163 var87 = var2.field3370;
                if (var87 != null) {
                    if ((var87.field2457 & var2.field3359) != 0 && !class16.method105(var6, var3, var4, var87.field2457)) {
                        if (class117.field1817) {
                            class31.method204(var87.field2457, class44.field556, class257.field3885, class316.field4773, var6, var3, var4);
                        }
                        var87.field2452.method111(0, class26.field366, class113.field1748, class28.field382, class184.field2756, var87.field2449 - class44.field556, var87.field2461 - class257.field3885, var87.field2464 - class316.field4773, var87.field2448, var5, (class18) null);
                    }
                    if ((var87.field2460 & var2.field3359) != 0 && !class16.method105(var6, var3, var4, var87.field2460)) {
                        if (class117.field1817) {
                            class31.method204(var87.field2460, class44.field556, class257.field3885, class316.field4773, var6, var3, var4);
                        }
                        var87.field2451.method111(0, class26.field366, class113.field1748, class28.field382, class184.field2756, var87.field2449 - class44.field556, var87.field2461 - class257.field3885, var87.field2464 - class316.field4773, var87.field2448, var5, (class18) null);
                    }
                }
            }
            if (var5 < class183.field2743 - 1) {
                class221 var88 = class158.field2367[var5 + 1][var3][var4];
                if (var88 != null && var88.field3360) {
                    class109.field1686.method1108(var88, 65280);
                }
            }
            if (var3 < class271.field4153) {
                class221 var89 = var7[var3 + 1][var4];
                if (var89 != null && var89.field3360) {
                    class109.field1686.method1108(var89, 65280);
                }
            }
            if (var4 < class147.field2214) {
                class221 var90 = var7[var3][var4 + 1];
                if (var90 != null && var90.field3360) {
                    class109.field1686.method1108(var90, 65280);
                }
            }
            if (var3 > class271.field4153) {
                class221 var91 = var7[var3 - 1][var4];
                if (var91 != null && var91.field3360) {
                    class109.field1686.method1108(var91, 65280);
                }
            }
            if (var4 > class147.field2214) {
                class221 var92 = var7[var3][var4 - 1];
                if (var92 != null && var92.field3360) {
                    class109.field1686.method1108(var92, 65280);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Log;Log;ZBI)Lrj;", line = 1287)
    private final class258 method956(class283 arg0, class283 arg1, boolean arg2, byte arg3, int arg4) {
        field1987++;
        if (this.field1989 == null) {
            throw new RuntimeException();
        } else if (arg3 <= 96) {
            return (class258) null;
        } else {
            this.field1989.field4025 = arg4 * 8 + 5;
            if (this.field1989.field3986.length <= this.field1989.field4025) {
                throw new RuntimeException();
            } else if (this.field1992[arg4] == null) {
                int var6 = this.field1989.method1826(-206227536);
                int var7 = this.field1989.method1826(-206227536);
                class258 var8 = new class258(arg4, arg0, arg1, this.field1986, this.field1984, var6, var7, arg2);
                this.field1992[arg4] = var8;
                return var8;
            } else {
                return this.field1992[arg4];
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Ljd;Lrk;)V", line = 1328)
    public class128(class92 arg0, class16 arg1) {
        this.field1986 = arg0;
        this.field1984 = arg1;
        if (!this.field1986.method651((byte) 96)) {
            this.field1985 = this.field1986.method647(255, true, (byte) 0, 255, 1321879792);
        }
    }
}
