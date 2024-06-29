import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class2 {

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public int field35 = -1;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public int field32 = 5;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
    public int field43 = -1;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public int field39 = -1;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "I")
    public int field47 = -1;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public int field41 = -1;

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "I")
    public int field54 = 99;

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "Z")
    public boolean field50 = false;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "Z")
    private boolean field49 = false;

    @OriginalMember(owner = "client!pa", name = "B", descriptor = "I")
    public int field58 = 2;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field42 = -2;

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "Lli;")
    public static class185 field55 = class245.method1649(": ", 126);

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "Lli;")
    public static class185 field52 = class245.method1649("cookieprefix", -33);

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!pa", name = "A", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "Lpg;")
    public static class169 field44;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "[I")
    private int[] field34;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "[I")
    public int[] field37;

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "[I")
    public int[] field51;

    @OriginalMember(owner = "client!pa", name = "C", descriptor = "[I")
    private int[] field59;

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "[[I")
    public int[][] field56;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILic;I)Lic;")
    public final class98 method19(int arg0, class98 arg1, int arg2) {
        int var4 = this.field37[arg0];
        class105 var5 = class166.method1187(var4 >> 16, 18553);
        field33++;
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method627(true, true);
        } else if (arg2 == 10) {
            class98 var7 = arg1.method627(!var5.method739(var6, arg2 + 245), !this.field49);
            var7.method626(var5, var6, this.field49);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lic;BII)Lic;")
    public final class98 method20(class98 arg0, byte arg1, int arg2, int arg3) {
        int var5 = this.field37[arg3];
        field53++;
        class105 var6 = class166.method1187(var5 >> 16, 18553);
        if (arg1 < 32) {
            this.method20((class98) null, (byte) 15, 118, -65);
        }
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg0.method627(true, true);
        }
        int var8 = arg2 & 0x3;
        class98 var9 = arg0.method627(!var6.method739(var7, 255), !this.field49);
        if (var8 == 1) {
            var9.method644();
        } else if (var8 == 2) {
            var9.method638();
        } else if (var8 == 3) {
            var9.method629();
        }
        var9.method626(var6, var7, this.field49);
        if (var8 == 1) {
            var9.method629();
        } else if (var8 == 2) {
            var9.method638();
        } else if (var8 == 3) {
            var9.method644();
        }
        return var9;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILic;B)Lic;")
    public final class98 method21(int arg0, class98 arg1, byte arg2) {
        int var4 = this.field37[arg0];
        field36++;
        class105 var5 = class166.method1187(var4 >> 16, 18553);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method639(true, true);
        }
        class98 var7 = arg1.method639(!var5.method739(var6, 255), !this.field49);
        var7.method626(var5, var6, this.field49);
        if (arg2 != -105) {
            this.method28((class118) null, -97);
        }
        return var7;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BZ)V")
    public static final void method22(byte arg0, boolean arg1) {
        class275.field4882 = 99;
        class269.field4758 = new int[104];
        field46++;
        class260.field4615 = new int[104];
        class106.field1919 = new int[104];
        class36.field565 = new int[104];
        class220.field4009 = new int[104];
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class239.field4267 = new byte[var2][104][104];
        class38.field611 = new byte[var2][104][104];
        class157.field2981 = new byte[var2][105][105];
        class178.field3253 = new byte[var2][104][104];
        if (arg0 == -107) {
            class235.field4216 = new byte[var2][104][104];
            class185.field3450 = new int[var2][105][105];
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lic;Lpa;III)Lic;")
    public final class98 method23(class98 arg0, class2 arg1, int arg2, int arg3, int arg4) {
        field31++;
        if (arg2 != -1842587056) {
            field42 = -66;
        }
        int var6 = this.field37[arg3];
        class105 var7 = class166.method1187(var6 >> 16, arg2 + 1842605609);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg1.method19(arg4, arg0, 10);
        }
        int var9 = arg1.field37[arg4];
        class105 var10 = class166.method1187(var9 >> 16, arg2 ^ 0x922C1229);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class98 var12 = arg0.method627(!var7.method739(var8, arg2 + 1842587311), !this.field49);
            var12.method626(var7, var8, this.field49);
            return var12;
        } else {
            class98 var13 = arg0.method627(!var7.method739(var8, arg2 ^ 0x922C5AAF) & !var10.method739(var11, 255), !arg1.field49 & !this.field49);
            var13.method630(var7, var8, var10, var11, this.field34, arg1.field49 | this.field49);
            return var13;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public final void method24(int arg0) {
        if (~this.field43 == arg0) {
            if (this.field34 == null) {
                this.field43 = 0;
            } else {
                this.field43 = 2;
            }
        }
        if (this.field41 == -1) {
            if (this.field34 == null) {
                this.field41 = 0;
            } else {
                this.field41 = 2;
            }
        }
        field48++;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIILp;)V")
    public static final void method25(int arg0, int arg1, int arg2, class82 arg3) {
        if (arg0 != 1) {
            field44 = null;
        }
        if (arg3.field1480 == 1) {
            class105.method738(0L, 0, class20.field336, (short) 6, -1, arg3.field1641, arg3.field1579, arg0 - 111);
            class234.field4210++;
        }
        field40++;
        if (arg3.field1480 == 2 && !class254.field4504) {
            class185 var4 = class142.method1019(arg3, (byte) -49);
            if (var4 != null) {
                class105.method738(0L, -1, class87.method567(-11039, new class185[] { class225.field4125, arg3.field1560 }), (short) 45, -1, var4, arg3.field1579, -102);
                class127.field2268++;
            }
        }
        if (arg3.field1480 == 3) {
            class257.field4568++;
            class105.method738(0L, 0, class20.field336, (short) 48, -1, class145.field2753, arg3.field1579, -110);
        }
        if (arg3.field1480 == 4) {
            class105.method738(0L, 0, class20.field336, (short) 30, -1, arg3.field1641, arg3.field1579, -111);
            class138.field2577++;
        }
        if (arg3.field1480 == 5) {
            class85.field1673++;
            class105.method738(0L, 0, class20.field336, (short) 41, -1, arg3.field1641, arg3.field1579, -98);
        }
        if (arg3.field1480 == 6 && class225.field4118 == null) {
            class105.method738(0L, -1, class20.field336, (short) 10, -1, arg3.field1641, arg3.field1579, -103);
            class5.field127++;
        }
        if (arg3.field1612 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg3.field1481; var6++) {
                for (int var7 = 0; var7 < arg3.field1566; var7++) {
                    int var8 = (arg3.field1610 + 32) * var7;
                    int var9 = (arg3.field1614 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg3.field1568[var5];
                        var8 += arg3.field1479[var5];
                    }
                    if (arg1 >= var8 && arg2 >= var9 && arg1 < var8 + 32 && (var9 + 32) > arg2) {
                        class263.field4663 = arg3;
                        class110.field1976 = var5;
                        if (arg3.field1576[var5] > 0) {
                            class134 var10 = class165.method1179(102, arg3.field1576[var5] - 1);
                            if (class187.field3471 == 1 && class206.method1459(-1705783874, client.method1502(arg3))) {
                                if (class215.field3952 != arg3.field1579 || class210.field3840 != var5) {
                                    class245.field4357++;
                                    class105.method738((long) var10.field2396, var5, class87.method567(arg0 - 11040, new class185[] { class264.field4689, class71.field1252, var10.field2436 }), (short) 37, -1, class32.field523, arg3.field1579, -100);
                                }
                            } else if (!class254.field4504 || !class206.method1459(-1705783874, client.method1502(arg3))) {
                                class71.field1240++;
                                class185[] var11 = var10.field2390;
                                if (class47.field760) {
                                    var11 = class194.method1399(var11, -1);
                                }
                                if (class206.method1459(-1705783874, client.method1502(arg3))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class18.field292++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 31;
                                            } else {
                                                var13 = 50;
                                            }
                                            class105.method738((long) var10.field2396, var5, class87.method567(arg0 ^ 0xFFFFD4E0, new class185[] { class20.field335, var10.field2436 }), var13, -1, var11[var12], arg3.field1579, -109);
                                        }
                                    }
                                }
                                if (class19.method131((byte) -62, client.method1502(arg3))) {
                                    class105.method738((long) var10.field2396, var5, class87.method567(-11039, new class185[] { class20.field335, var10.field2436 }), (short) 9, class181.field3335, class32.field523, arg3.field1579, -103);
                                    class56.field947++;
                                }
                                if (class206.method1459(-1705783874, client.method1502(arg3)) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class136.field2555++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 36;
                                            }
                                            if (var14 == 1) {
                                                var15 = 43;
                                            }
                                            if (var14 == 2) {
                                                var15 = 58;
                                            }
                                            class105.method738((long) var10.field2396, var5, class87.method567(-11039, new class185[] { class20.field335, var10.field2436 }), var15, -1, var11[var14], arg3.field1579, -121);
                                        }
                                    }
                                }
                                class185[] var16 = arg3.field1534;
                                if (class47.field760) {
                                    var16 = class194.method1399(var16, -1);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class282.field4972++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 51;
                                            }
                                            if (var17 == 1) {
                                                var18 = 33;
                                            }
                                            if (var17 == 2) {
                                                var18 = 11;
                                            }
                                            if (var17 == 3) {
                                                var18 = 44;
                                            }
                                            if (var17 == 4) {
                                                var18 = 2;
                                            }
                                            class105.method738((long) var10.field2396, var5, class87.method567(-11039, new class185[] { class20.field335, var10.field2436 }), var18, -1, var16[var17], arg3.field1579, -105);
                                        }
                                    }
                                }
                                class105.method738((long) var10.field2396, var5, class87.method567(-11039, new class185[] { class20.field335, var10.field2436 }), (short) 1001, class248.field4405, class206.field3779, arg3.field1579, -97);
                            } else if ((class214.field3908 & 0x10) == 16) {
                                class226.field4129++;
                                class105.method738((long) var10.field2396, var5, class87.method567(-11039, new class185[] { class110.field1980, class71.field1252, var10.field2436 }), (short) 24, -1, class102.field1856, arg3.field1579, arg0 ^ 0xFFFFFF97);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg3.field1572) {
            return;
        }
        if (class254.field4504) {
            if (!class155.method1104(-1, client.method1502(arg3)) || (class214.field3908 & 0x20) != 32) {
                return;
            }
            class182.field3348++;
            class105.method738(0L, arg3.field1637, class87.method567(arg0 - 11040, new class185[] { class110.field1980, class87.field1710, arg3.field1502 }), (short) 26, -1, class102.field1856, arg3.field1579, -124);
            return;
        }
        for (int var19 = 9; var19 >= 5; var19--) {
            class185 var23 = class191.method1379(arg3, -99, var19);
            if (var23 != null) {
                class113.field2033++;
                class105.method738((long) (var19 + 1), arg3.field1637, arg3.field1502, (short) 1004, class259.method1755(arg3, var19, arg0 - 2), var23, arg3.field1579, -120);
            }
        }
        class185 var20 = class142.method1019(arg3, (byte) -85);
        if (var20 != null) {
            class105.method738(0L, arg3.field1637, arg3.field1502, (short) 45, -1, var20, arg3.field1579, -110);
            class127.field2268++;
        }
        for (int var21 = 4; var21 >= 0; var21--) {
            class185 var22 = class191.method1379(arg3, -66, var21);
            if (var22 != null) {
                class113.field2033++;
                class105.method738((long) (var21 + 1), arg3.field1637, arg3.field1502, (short) 22, class259.method1755(arg3, var21, -1), var22, arg3.field1579, -112);
            }
        }
        if (class59.method409(arg0, client.method1502(arg3))) {
            class105.method738(0L, arg3.field1637, class20.field336, (short) 10, -1, class25.field425, arg3.field1579, -126);
            class5.field127++;
            return;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IILic;)Lic;")
    public final class98 method26(int arg0, int arg1, class98 arg2) {
        field57++;
        int var4 = this.field37[arg0];
        class105 var5 = class166.method1187(var4 >> 16, 18553);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method627(true, true);
        }
        class105 var7 = null;
        if (arg1 != 27408) {
            this.method29(0, 79, (class118) null);
        }
        int var8 = 0;
        if (this.field59 != null && arg0 < this.field59.length) {
            int var9 = this.field59[arg0];
            var7 = class166.method1187(var9 >> 16, 18553);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class98 var11 = arg2.method627(!var5.method739(var6, 255), !this.field49);
            var11.method626(var5, var6, this.field49);
            return var11;
        } else {
            class98 var10 = arg2.method627(!var5.method739(var6, arg1 ^ 0x6BEF) & !var7.method739(var8, 255), !this.field49);
            var10.method626(var5, var6, this.field49);
            var10.method626(var7, var8, this.field49);
            return var10;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)J")
    public static final long method27(int arg0, int arg1, int arg2) {
        class198 var3 = class153.field2896[arg0][arg1][arg2];
        return var3 == null || var3.field3636 == null ? 0L : var3.field3636.field597;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljd;I)V")
    public final void method28(class118 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method867(false);
            if (var3 == 0) {
                field45++;
                if (arg1 != -1) {
                    this.method23((class98) null, (class2) null, 18, -35, -15);
                    return;
                }
                return;
            }
            this.method29(var3, -9, arg0);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IILjd;)V")
    private final void method29(int arg0, int arg1, class118 arg2) {
        if (arg0 == 1) {
            int var4 = arg2.method827(255);
            this.field51 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field51[var5] = arg2.method827(255);
            }
            this.field37 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field37[var6] = arg2.method827(255);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field37[var7] += arg2.method827(class260.method1766(arg1, -248)) << 16;
            }
        } else if (arg0 == 2) {
            this.field47 = arg2.method827(arg1 ^ 0xFFFFFF08);
        } else if (arg0 == 3) {
            int var8 = arg2.method867(false);
            this.field34 = new int[var8 + 1];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field34[var9] = arg2.method867(false);
            }
            this.field34[var8] = 9999999;
        } else if (arg0 == 4) {
            this.field50 = true;
        } else if (arg0 == 5) {
            this.field32 = arg2.method867(false);
        } else if (arg0 == 6) {
            this.field35 = arg2.method827(255);
        } else if (arg0 == 7) {
            this.field39 = arg2.method827(arg1 ^ 0xFFFFFF08);
        } else if (arg0 == 8) {
            this.field54 = arg2.method867(false);
        } else if (arg0 == 9) {
            this.field43 = arg2.method867(false);
        } else if (arg0 == 10) {
            this.field41 = arg2.method867(false);
        } else if (arg0 == 11) {
            this.field58 = arg2.method867(false);
        } else if (arg0 == 12) {
            int var10 = arg2.method867(false);
            this.field59 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field59[var11] = arg2.method827(255);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field59[var12] += arg2.method827(255) << 16;
            }
        } else if (arg0 == 13) {
            int var13 = arg2.method827(255);
            this.field56 = new int[var13][];
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = arg2.method867(false);
                if (var15 > 0) {
                    this.field56[var14] = new int[var15];
                    this.field56[var14][0] = arg2.method873((byte) -106);
                    for (int var16 = 1; var16 < var15; var16++) {
                        this.field56[var14][var16] = arg2.method827(class260.method1766(arg1, -248));
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field49 = true;
        }
        if (arg1 != -9) {
            method22((byte) -101, false);
        }
        field38++;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V")
    public static void method30(boolean arg0) {
        field52 = null;
        field55 = null;
        if (arg0) {
            field44 = null;
        }
        field44 = null;
    }
}
