import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class103 extends class30 {

    @OriginalMember(owner = "client!la", name = "I", descriptor = "I")
    public int field1921 = 0;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field1907 = 1;

    @OriginalMember(owner = "client!la", name = "L", descriptor = "Lia;")
    public static class257 field1924 = class28.method234(-108, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!la", name = "U", descriptor = "Lia;")
    public static class257 field1933 = class28.method234(86, "Mem:");

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    public int field1908;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!la", name = "z", descriptor = "I")
    public int field1912;

    @OriginalMember(owner = "client!la", name = "B", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!la", name = "C", descriptor = "I")
    public int field1915;

    @OriginalMember(owner = "client!la", name = "G", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!la", name = "J", descriptor = "I")
    public int field1922;

    @OriginalMember(owner = "client!la", name = "K", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!la", name = "N", descriptor = "I")
    public int field1926;

    @OriginalMember(owner = "client!la", name = "O", descriptor = "I")
    public int field1927;

    @OriginalMember(owner = "client!la", name = "P", descriptor = "I")
    public int field1928;

    @OriginalMember(owner = "client!la", name = "Q", descriptor = "I")
    public int field1929;

    @OriginalMember(owner = "client!la", name = "S", descriptor = "I")
    public int field1931;

    @OriginalMember(owner = "client!la", name = "T", descriptor = "I")
    public int field1932;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "Lti;")
    public static class128 field1910;

    @OriginalMember(owner = "client!la", name = "H", descriptor = "Lib;")
    public class180 field1920;

    @OriginalMember(owner = "client!la", name = "E", descriptor = "Lqe;")
    public class197 field1917;

    @OriginalMember(owner = "client!la", name = "R", descriptor = "Lp;")
    public class233 field1930;

    @OriginalMember(owner = "client!la", name = "A", descriptor = "Lnc;")
    public class4 field1913;

    @OriginalMember(owner = "client!la", name = "M", descriptor = "Lnc;")
    public class4 field1925;

    @OriginalMember(owner = "client!la", name = "D", descriptor = "Z")
    public boolean field1916;

    @OriginalMember(owner = "client!la", name = "F", descriptor = "[I")
    public int[] field1918;

    @OriginalMember(owner = "client!la", name = "y", descriptor = "[[[Lea;")
    public static class177[][][] field1911;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII)Z")
    public static final boolean method747(int arg0, int arg1, int arg2, int arg3) {
        if (!class42.method332(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class243.field4208[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class26.field512) {
                    if (!class175.method1188(var4, var6, var5)) {
                        return false;
                    }
                    if (!class175.method1188(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class175.method1188(var4, var7, var5)) {
                        return false;
                    }
                    if (!class175.method1188(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class175.method1188(var4, var8, var5)) {
                    return false;
                }
                if (!class175.method1188(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class224.field3765) {
                    if (!class175.method1188(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class175.method1188(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class175.method1188(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class175.method1188(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class175.method1188(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class175.method1188(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class26.field512) {
                    if (!class175.method1188(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class175.method1188(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class175.method1188(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class175.method1188(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class175.method1188(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class175.method1188(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class224.field3765) {
                    if (!class175.method1188(var4, var6, var5)) {
                        return false;
                    }
                    if (!class175.method1188(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class175.method1188(var4, var7, var5)) {
                        return false;
                    }
                    if (!class175.method1188(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class175.method1188(var4, var8, var5)) {
                    return false;
                }
                if (!class175.method1188(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class175.method1188(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class175.method1188(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class175.method1188(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class175.method1188(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class175.method1188(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V")
    public final void method748(byte arg0) {
        field1923++;
        int var2 = this.field1927;
        if (this.field1930 != null) {
            class233 var5 = this.field1930.method1537((byte) 87);
            if (var5 == null) {
                this.field1927 = -1;
                this.field1929 = 0;
                this.field1928 = 0;
                this.field1908 = 0;
                this.field1918 = null;
            } else {
                this.field1928 = var5.field3976 * 128;
                this.field1929 = var5.field3968;
                this.field1927 = var5.field3948;
                this.field1908 = var5.field3978;
                this.field1918 = var5.field4010;
            }
        } else if (this.field1917 != null) {
            int var3 = class199.method1339(this.field1917, -103);
            if (var2 != var3) {
                class198 var4 = this.field1917.field3322;
                this.field1927 = var3;
                if (var4.field3393 != null) {
                    var4 = var4.method1324((byte) 125);
                }
                if (var4 == null) {
                    this.field1928 = 0;
                } else {
                    this.field1928 = var4.field3366 * 128;
                }
            }
        } else if (this.field1920 != null) {
            this.field1927 = class120.method846(0, this.field1920);
            this.field1928 = this.field1920.field3125 * 128;
        }
        if (this.field1927 != var2 && this.field1913 != null) {
            class78.field1504.method459(this.field1913);
            this.field1913 = null;
        }
        if (arg0 >= -125) {
            field1911 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BZ)V")
    public static final void method749(byte arg0, boolean arg1) {
        field1914++;
        class57.field1221 = arg1;
        if (arg0 != -110) {
            return;
        }
        if (!class57.field1221) {
            int var25 = class40.field827.method1052(false);
            int var26 = (class209.field3582 - class40.field827.field2677) / 16;
            class259.field4497 = new int[var26][4];
            for (int var27 = 0; var27 < var26; var27++) {
                for (int var37 = 0; var37 < 4; var37++) {
                    class259.field4497[var27][var37] = class40.field827.method1062(-1);
                }
            }
            int var28 = class40.field827.method1041((byte) 100);
            int var29 = class40.field827.method1067(515473640);
            int var30 = class40.field827.method1029(25925);
            int var31 = class40.field827.method1063(-17162);
            boolean var32 = false;
            class135.field2409 = new byte[var26][];
            class119.field2128 = new int[var26];
            class197.field3328 = new int[var26];
            class253.field4353 = new byte[var26][];
            if ((var29 / 8 == 48 || (var29 / 8) == 49) && (var31 / 8) == 48) {
                var32 = true;
            }
            if (var29 / 8 == 48 && (var31 / 8) == 148) {
                var32 = true;
            }
            class62.field1283 = null;
            class251.field4327 = new int[var26];
            class128.field2276 = null;
            int var33 = 0;
            for (int var34 = (var29 - 6) / 8; var34 <= (var29 + 6) / 8; var34++) {
                for (int var35 = (var31 - 6) / 8; var35 <= (var31 + 6) / 8; var35++) {
                    int var36 = (var34 << 8) + var35;
                    if (var32 && var35 == 49 || var35 == 149 || var35 == 147 || var34 == 50 || !(var34 != 49 || var35 != 47)) {
                        class197.field3328[var33] = var36;
                        class119.field2128[var33] = -1;
                        class251.field4327[var33] = -1;
                    } else {
                        class197.field3328[var33] = var36;
                        class119.field2128[var33] = class128.field2279.method1211(class233.method1528(new class257[] { class18.field386, class111.method808(10, var34), class121.field2173, class111.method808(10, var35) }, 0), (byte) -59);
                        class251.field4327[var33] = class128.field2279.method1211(class233.method1528(new class257[] { class19.field407, class111.method808(10, var34), class121.field2173, class111.method808(10, var35) }, class238.method1553(arg0, -110)), (byte) -62);
                    }
                    var33++;
                }
            }
            class25.method222(false, var29, false, var28, var31, var25, var30);
            return;
        }
        int var2 = class40.field827.method1063(-17162);
        int var3 = class40.field827.method1041((byte) 109);
        int var4 = class40.field827.method1021((byte) -96);
        int var5 = class40.field827.method1067(515473640);
        class40.field827.method912((byte) 36);
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = class40.field827.method909(1, (byte) -125);
                    if (var24 == 1) {
                        class154.field2708[var6][var22][var23] = class40.field827.method909(26, (byte) -107);
                    } else {
                        class154.field2708[var6][var22][var23] = -1;
                    }
                }
            }
        }
        class40.field827.method911(false);
        int var7 = (class209.field3582 - class40.field827.field2677) / 16;
        class259.field4497 = new int[var7][4];
        for (int var8 = 0; var8 < var7; var8++) {
            for (int var21 = 0; var21 < 4; var21++) {
                class259.field4497[var8][var21] = class40.field827.method1027(127);
            }
        }
        int var9 = class40.field827.method1063(-17162);
        class128.field2276 = null;
        class62.field1283 = null;
        class119.field2128 = new int[var7];
        class197.field3328 = new int[var7];
        class135.field2409 = new byte[var7][];
        class251.field4327 = new int[var7];
        class253.field4353 = new byte[var7][];
        int var10 = 0;
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < 13; var12++) {
                for (int var13 = 0; var13 < 13; var13++) {
                    int var14 = class154.field2708[var11][var12][var13];
                    if (var14 != -1) {
                        int var15 = var14 >> 14 & 0x3FF;
                        int var16 = var14 >> 3 & 0x7FF;
                        int var17 = (var15 / 8 << 8) + (var16 / 8);
                        for (int var18 = 0; var18 < var10; var18++) {
                            if (class197.field3328[var18] == var17) {
                                var17 = -1;
                                break;
                            }
                        }
                        if (var17 != -1) {
                            class197.field3328[var10] = var17;
                            int var19 = var17 >> 8 & 0xFF;
                            int var20 = var17 & 0xFF;
                            class119.field2128[var10] = class128.field2279.method1211(class233.method1528(new class257[] { class18.field386, class111.method808(10, var19), class121.field2173, class111.method808(10, var20) }, 0), (byte) -98);
                            class251.field4327[var10] = class128.field2279.method1211(class233.method1528(new class257[] { class19.field407, class111.method808(10, var19), class121.field2173, class111.method808(10, var20) }, 0), (byte) -54);
                            var10++;
                        }
                    }
                }
            }
        }
        class25.method222(false, var9, false, var3, var2, var5, var4);
    }

    @OriginalMember(owner = "client!la", name = "e", descriptor = "(I)V")
    public static void method750(int arg0) {
        field1910 = null;
        field1933 = null;
        if (arg0 != 128) {
            method747(-36, 23, 49, -1);
        }
        field1924 = null;
        field1911 = null;
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(B)V")
    public static final void method751(byte arg0) {
        if (arg0 < 21) {
            method747(113, -21, -98, 100);
        }
        field1909++;
        for (class118 var1 = (class118) class245.field4257.method288(26111); var1 != null; var1 = (class118) class245.field4257.method277(1)) {
            class74 var2 = var1.field2115;
            if (class189.field3261 != var2.field1440 || var2.field1444) {
                var1.method254(1);
            } else if (class7.field153 >= var2.field1450) {
                var2.method547(class171.field2935, -1);
                if (var2.field1444) {
                    var1.method254(1);
                } else {
                    class246.method1614(var2.field1440, var2.field1437, var2.field1429, var2.field1445, 60, var2, 0, -1L, false);
                }
            }
        }
    }
}
