import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class79 {

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field929 = 0;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "Lwq;")
    public static class92 field928 = new class92();

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method438(boolean arg0) {
        class347.field4916.method505((byte) 44);
        field930++;
        for (class302 var1 = (class302) class393.field5547.method506((byte) -128); var1 != null; var1 = (class302) class393.field5547.method514(true)) {
            if (var1.field4247 < 1000) {
                var1.method2594((byte) -22);
                class347.field4916.method509((byte) 112, var1);
            }
        }
        class347.field4916.method503(class393.field5547, arg0);
        if (class225.field3144 != null || class2.field19 > 0) {
            return;
        }
        int var2 = -1;
        if (class203.field2927 != null) {
            var2 = class203.field2927.method1828(1);
        }
        if (!class435.field6270) {
            if (class105.field1261 >= 0) {
                var2 = class105.field1261;
            }
            class105.field1261 = -1;
            if (var2 == 0 && (class392.field5516 == 1 && class208.field2958 > 2 || class129.method797(-2001))) {
                var2 = 2;
            }
            if (var2 == 2 && class208.field2958 > 0) {
                if (class203.field2927 == null) {
                    class244.method1661((byte) -102, class233.field3281, class222.field3123);
                } else {
                    class244.method1661((byte) -102, class203.field2927.method1830(32431), class203.field2927.method1823((byte) 100));
                }
            }
            if (var2 == 0 && class208.field2958 > 0) {
                class274.method1810(109);
                return;
            }
            return;
        }
        if (var2 == -1) {
            int var3 = class306.field4306.method17(20417);
            int var4 = class306.field4306.method18(1);
            if (class8.field120 - 10 > var3 || class8.field120 + class113.field1393 + 10 < var3 || class379.field5341 - 10 > var4 || class379.field5341 + class302.field4246 + 10 < var4) {
                class435.field6270 = false;
                class186.method1280(0, class302.field4246, class8.field120, class379.field5341, class113.field1393);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var5 = class8.field120;
        int var6 = class379.field5341;
        int var7 = class113.field1393;
        int var8 = class203.field2927.method1823((byte) 116);
        int var9 = class203.field2927.method1830(32431);
        int var10 = -1;
        for (int var11 = 0; var11 < class208.field2958; var11++) {
            if (class331.field4686) {
                int var15 = (class208.field2958 - var11 - 1) * 16 + var6 + 33;
                if (var5 < var8 && var5 + var7 > var8 && var15 - 13 < var9 && var15 + 4 > var9) {
                    var10 = var11;
                }
            } else {
                int var16 = (class208.field2958 - var11 - 1) * 16 + var6 + 31;
                if (var5 < var8 && (var5 + var7) > var8 && (var16 - 13) < var9 && var9 < var16 + 3) {
                    var10 = var11;
                }
            }
        }
        if (var10 != -1) {
            int var12 = 0;
            class322 var13 = new class322(class393.field5547);
            for (class302 var14 = (class302) var13.method2102(13); var14 != null; var14 = (class302) var13.method2100(512)) {
                if (var10 == var12) {
                    class240.method1644(55, var14);
                }
                var12++;
            }
        }
        class435.field6270 = false;
        class186.method1280(0, class302.field4246, class8.field120, class379.field5341, class113.field1393);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)Z", line = 156)
    public static final boolean method439(int arg0) {
        field933++;
        try {
            if (arg0 <= 38) {
                method440((class327) null, (class119[]) null, -71, false, (class134) null, -127);
            }
            if (class383.field5407 == 2) {
                if (class324.field4620 == null) {
                    class324.field4620 = class417.method2650(class362.field5168, class367.field5205, class193.field2793);
                    if (class324.field4620 == null) {
                        return false;
                    }
                }
                if (class98.field1196 == null) {
                    class98.field1196 = new class5(class123.field1515, class240.field3398);
                }
                if (class385.field5427.method1067(22050, (byte) 71, class98.field1196, class394.field5559, class324.field4620)) {
                    class385.field5427.method1071(127);
                    class385.field5427.method1040(class311.field4393, -38);
                    class385.field5427.method1063(class324.field4620, (byte) -66, class295.field4117);
                    class383.field5407 = 0;
                    class362.field5168 = null;
                    class324.field4620 = null;
                    class98.field1196 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class385.field5427.method1041(921769607);
            class362.field5168 = null;
            class324.field4620 = null;
            class383.field5407 = 0;
            class98.field1196 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lgh;[Lp;IZLae;I)V", line = 205)
    public static final void method440(class327 arg0, class119[] arg1, int arg2, boolean arg3, class134 arg4, int arg5) {
        if (!arg3) {
            for (int var6 = 0; var6 < 4; var6++) {
                for (int var7 = 0; var7 < class176.field2403; var7++) {
                    for (int var8 = 0; var8 < class383.field5395; var8++) {
                        if ((class399.field5699[var6][var7][var8] & 0x1) != 0) {
                            int var9 = var6;
                            if ((class399.field5699[1][var7][var8] & 0x2) != 0) {
                                var9 = var6 - 1;
                            }
                            if (var9 >= 0) {
                                arg1[var9].method742(var8, var7, (byte) -98);
                            }
                        }
                    }
                }
            }
        }
        field932++;
        int[][] var10 = new int[class176.field2403][class383.field5395];
        for (int var11 = arg5; var11 < arg2; var11++) {
            for (int var13 = 0; var13 < class383.field5395; var13++) {
                class164.field2321[var13] = 0;
                class435.field6272[var13] = 0;
                class131.field1588[var13] = 0;
                class389.field5496[var13] = 0;
                class257.field3686[var13] = 0;
            }
            for (int var14 = -5; var14 < class176.field2403; var14++) {
                for (int var15 = 0; var15 < class383.field5395; var15++) {
                    int var24 = var14 + 5;
                    int var10002;
                    if (class176.field2403 > var24) {
                        int var25 = class141.field1747[var11][var24][var15] & 0xFF;
                        if (var25 > 0) {
                            class36 var26 = class258.method1729(-115, var25 - 1);
                            class164.field2321[var15] += var26.field417;
                            class435.field6272[var15] += var26.field412;
                            class131.field1588[var15] += var26.field414;
                            class389.field5496[var15] += var26.field416;
                            var10002 = class257.field3686[var15]++;
                        }
                    }
                    int var27 = var14 - 5;
                    if (var27 >= 0) {
                        int var28 = class141.field1747[var11][var27][var15] & 0xFF;
                        if (var28 > 0) {
                            class36 var29 = class258.method1729(-89, var28 - 1);
                            class164.field2321[var15] -= var29.field417;
                            class435.field6272[var15] -= var29.field412;
                            class131.field1588[var15] -= var29.field414;
                            class389.field5496[var15] -= var29.field416;
                            var10002 = class257.field3686[var15]--;
                        }
                    }
                }
                if (var14 >= 0) {
                    int var16 = 0;
                    int var17 = 0;
                    int var18 = 0;
                    int var19 = 0;
                    int var20 = 0;
                    for (int var21 = -5; var21 < class383.field5395; var21++) {
                        int var22 = var21 + 5;
                        if (var22 < class383.field5395) {
                            var19 += class389.field5496[var22];
                            var17 += class435.field6272[var22];
                            var16 += class164.field2321[var22];
                            var20 += class257.field3686[var22];
                            var18 += class131.field1588[var22];
                        }
                        int var23 = var21 - 5;
                        if (var23 >= 0) {
                            var18 -= class131.field1588[var23];
                            var17 -= class435.field6272[var23];
                            var20 -= class257.field3686[var23];
                            var19 -= class389.field5496[var23];
                            var16 -= class164.field2321[var23];
                        }
                        if (var21 >= 0 && var19 > 0 && var20 > 0) {
                            var10[var14][var21] = class114.method711(69, var16 * 256 / var19, var17 / var20, var18 / var20);
                        }
                    }
                }
            }
            class313.method2065(-1, class161.field2122[var11], arg0, var10, class190.field2743[var11], arg3, arg4, var11, class176.field2403, class141.field1747[var11], class383.field5395, class369.field5213[var11], class421.field6018[var11]);
            class141.field1747[var11] = null;
            class190.field2743[var11] = null;
            class369.field5213[var11] = null;
            class421.field6018[var11] = null;
        }
        if (!arg3) {
            if (class272.field3859) {
                class352.method2247();
            }
            if (class141.field1739 != 0) {
                class18.method118();
            }
        }
        for (int var12 = 0; var12 < arg2; var12++) {
            class161.field2122[var12].method332();
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BI)V", line = 429)
    public static final void method441(byte arg0, int arg1) {
        class345.field4887.method1629(arg1, 127);
        if (arg0 >= -97) {
            field929 = -100;
        }
        field927++;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V", line = 441)
    public static void method442(int arg0) {
        if (arg0 != -1) {
            field928 = null;
        }
        field928 = null;
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V", line = 452)
    public static final void method443(int arg0) {
        class288.field4024.method1887(arg0 ^ 0xFFFFFEA3);
        field931++;
        class305.field4286.method1887(-122);
        if (arg0 != 256) {
            field928 = null;
        }
    }
}
