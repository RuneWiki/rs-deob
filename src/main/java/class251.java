import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class251 {

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Lea;")
    private class12 field4251;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "Lio;")
    private class353 field4253;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "Lol;")
    private class198 field4249;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4243 = "Loaded defaults";

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field4250 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "Len;")
    public static class192 field4255;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "Lqm;")
    private class227 field4254;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "[Lne;")
    private class90[] field4252;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZLja;Lja;)Lne;", line = 5)
    public final class90 method1946(int arg0, boolean arg1, class302 arg2, class302 arg3) {
        field4248++;
        if (arg1) {
            this.method1952((class302) null, true, (byte) -123, (class302) null, 20);
        }
        return this.method1952(arg2, true, (byte) 7, arg3, arg0);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)I", line = 24)
    public static final int method1947(int arg0) {
        field4256++;
        if (arg0 != -298939596) {
            field4250 = (String[]) null;
        }
        return ((class272.field4520 == 0 ? 0 : 1) << 22) + ((class45.field704 == 0 ? 0 : 1) << 20) + ((class198.field3165 ? 1 : 0) << 16) + ((class193.field3083 ? 1 : 0) << 15) + ((class131.field2214 & 0x3) << 11) + ((class75.field1272 ? 1 : 0) << 9) + ((class241.field3979 ? 1 : 0) << 7) + ((class44.field690 ? 1 : 0) << 6) + ((class292.field4726 ? 1 : 0) << 5) + ((class160.field2561 ? 1 : 0) << 4) + (class166.field2649 & 0x7) + ((class264.field4429 ? 1 : 0) << 3) + ((class127.field2147 << 17) - (-((class248.field4052 ? 1 : 0) << 19) - (((class235.field3899 == 0 ? 0 : 1) << 21) + (class158.method1219() << 23)))) - (-((class243.field4004 ? 1 : 0) << 8) - (((client.field717 ? 1 : 0) << 10) + ((class3.field36 ? 1 : 0) << 13)));
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)Z", line = 36)
    public final boolean method1948(boolean arg0) {
        field4245++;
        if (this.field4254 != null) {
            return true;
        }
        if (this.field4249 == null) {
            if (this.field4251.method63(20844)) {
                return false;
            }
            this.field4249 = this.field4251.method66(true, (byte) -93, 255, 255, (byte) 0);
        }
        if (this.field4249.field1434) {
            return false;
        }
        if (arg0) {
            this.field4249 = (class198) null;
        }
        this.field4254 = new class227(this.field4249.method676((byte) -128));
        this.field4252 = new class90[(this.field4254.field3793.length - 5) / 8];
        return true;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V", line = 66)
    public static void method1949(int arg0) {
        field4243 = null;
        field4255 = null;
        field4250 = null;
        if (arg0 > -36) {
            method1950(24, (byte) -30, 68, (class258) null);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBILjh;)V", line = 80)
    public static final void method1950(int arg0, byte arg1, int arg2, class258 arg3) {
        field4244++;
        if ((arg0 & 0x10) != 0) {
            arg3.field3488 = class29.field383.method1763((byte) 43);
            arg3.field3545 = class29.field383.method1764(128);
        }
        if ((arg0 & 0x4) != 0) {
            int var4 = class29.field383.method1750(17852);
            byte[] var5 = new byte[var4];
            class227 var6 = new class227(var5);
            class29.field383.method1718(0, (byte) -62, var4, var5);
            class261.field4401[arg2] = var6;
            arg3.method1979(true, var6, arg2);
        }
        if ((arg0 & 0x8) != 0) {
            int var7 = class29.field383.method1708((byte) 103);
            int var8 = class29.field383.method1750(17852);
            arg3.method1637(var7, 0, var8, class332.field5261);
            arg3.field3481 = class332.field5261 + 300;
            arg3.field3525 = class29.field383.method1748(3);
        }
        if ((arg0 & 0x800) != 0) {
            int var9 = class29.field383.method1762((byte) 17);
            int[] var10 = new int[var9];
            int[] var11 = new int[var9];
            int[] var12 = new int[var9];
            for (int var13 = 0; var13 < var9; var13++) {
                int var14 = class29.field383.method1764(128);
                if (var14 == 65535) {
                    var14 = -1;
                }
                var10[var13] = var14;
                var11[var13] = class29.field383.method1720((byte) -118);
                var12[var13] = class29.field383.method1765(true);
            }
            class297.method2126(arg3, var10, var11, var12, true);
        }
        if ((arg0 & 0x400) != 0) {
            int var15 = class29.field383.method1708((byte) 103);
            int var16 = class29.field383.method1762((byte) 17);
            arg3.method1637(var15, 0, var16, class332.field5261);
        }
        if ((arg0 & 0x40) != 0) {
            arg3.field3570 = class29.field383.method1758((byte) 105);
            if (arg3.field3570.charAt(0) == '~') {
                arg3.field3570 = arg3.field3570.substring(1);
                class35.method241(1, 0, arg3.field3570, 2, arg3.method1975(true, 12473), arg3.method1975(false, 12473));
            } else if (class6.field55 == arg3) {
                class35.method241(1, 0, arg3.field3570, 2, arg3.method1975(true, 12473), arg3.method1975(false, 12473));
            }
            arg3.field3565 = 150;
            arg3.field3518 = 0;
            arg3.field3483 = 0;
        }
        if ((arg0 & 0x80) != 0) {
            int var17 = class29.field383.method1763((byte) 50);
            int var18 = class29.field383.method1720((byte) -49);
            int var19 = class29.field383.method1762((byte) 17);
            int var20 = class29.field383.field3760;
            boolean var21 = (var17 & 0x8000) != 0;
            if (arg3.field4349 != null && arg3.field4316 != null) {
                boolean var22 = false;
                if (var18 <= 1) {
                    if (!var21 && (class322.field5124 && !class93.field1568 || class314.field4991)) {
                        var22 = true;
                    } else if (class57.method481(true, arg3.field4349)) {
                        var22 = true;
                    }
                }
                if (!var22 && class272.field4518 == 0) {
                    class34.field502.field3760 = 0;
                    class29.field383.method1730(class34.field502.field3793, var19, 0, 0);
                    int var23 = -1;
                    class34.field502.field3760 = 0;
                    String var25;
                    if (var21) {
                        class243 var24 = class195.method1507(class34.field502, 64);
                        var17 &= 0x7FFF;
                        var23 = var24.field4000;
                        var25 = var24.field3999.method1012(class34.field502, (byte) -46);
                    } else {
                        var25 = class171.method1348(class123.method970(false, class254.method1961(249, class34.field502)));
                    }
                    int var26;
                    if (var18 == 1 || var18 == 2) {
                        var26 = var21 ? 17 : 1;
                    } else {
                        var26 = var21 ? 17 : 2;
                    }
                    arg3.field3570 = var25.trim();
                    arg3.field3565 = 150;
                    arg3.field3483 = var17 & 0xFF;
                    arg3.field3518 = var17 >> 8;
                    if (var18 == 2) {
                        class291.method2104("<img=1>" + arg3.method1975(true, 12473), -127, var25, (String) null, "<img=1>" + arg3.method1975(false, 12473), var26, var23, 0);
                    } else if (var18 == 1) {
                        class291.method2104("<img=0>" + arg3.method1975(true, 12473), -107, var25, (String) null, "<img=0>" + arg3.method1975(false, 12473), var26, var23, 0);
                    } else {
                        class291.method2104(arg3.method1975(true, 12473), -107, var25, (String) null, arg3.method1975(false, 12473), var26, var23, 0);
                    }
                }
            }
            class29.field383.field3760 = var19 + var20;
        }
        if (arg1 > -18) {
            method1949(-106);
        }
        if ((arg0 & 0x2) != 0) {
            int var27 = class29.field383.method1764(128);
            int var28 = class29.field383.method1750(17852);
            if (var27 == 65535) {
                var27 = -1;
            }
            class165.method1284(arg3, var28, 1, var27);
        }
        if ((arg0 & 0x100) != 0) {
            boolean var29 = true;
            int var30 = class29.field383.method1759(-26608);
            if (var30 == 65535) {
                var30 = -1;
            }
            int var31 = class29.field383.method1766(102);
            if (var30 != -1 && arg3.field3552 != -1 && class198.method1524(class282.method2071(var30, 0).field1594, 97).field660 < class198.method1524(class282.method2071(arg3.field3552, 0).field1594, 86).field660) {
                var29 = false;
            }
            if (var29) {
                arg3.field3527 = 0;
                arg3.field3499 = 1;
                arg3.field3566 = 0;
                arg3.field3500 = class332.field5261 + (var31 & 0xFFFF);
                arg3.field3552 = var30;
                arg3.field3509 = var31 >> 16;
                if (arg3.field3500 > class332.field5261) {
                    arg3.field3566 = -1;
                }
                if (arg3.field3552 != -1 && class332.field5261 == arg3.field3500) {
                    int var32 = class282.method2071(arg3.field3552, 0).field1594;
                    if (var32 != -1) {
                        class43 var33 = class198.method1524(var32, -75);
                        if (var33 != null && var33.field677 != null) {
                            class334.method2338(class6.field55 == arg3, arg3.field3577, arg3.field3511, 0, (byte) -13, var33);
                        }
                    }
                }
            }
        }
        if ((arg0 & 0x1) != 0) {
            arg3.field3567 = class29.field383.method1764(128);
            if (arg3.field3567 == 65535) {
                arg3.field3567 = -1;
            }
        }
        if ((arg0 & 0x200) == 0) {
            return;
        }
        arg3.field3563 = class29.field383.method1748(3);
        arg3.field3530 = class29.field383.method1762((byte) 17);
        arg3.field3495 = class29.field383.method1762((byte) 17);
        arg3.field3524 = class29.field383.method1762((byte) 17);
        arg3.field3515 = class29.field383.method1764(128) + class332.field5261;
        arg3.field3479 = class29.field383.method1765(true) + class332.field5261;
        arg3.field3569 = class29.field383.method1748(3);
        arg3.field3503 = 1;
        arg3.field3491 = 0;
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V", line = 358)
    public final void method1951(int arg0) {
        field4247++;
        if (this.field4252 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field4252.length; var2++) {
            if (this.field4252[var2] != null) {
                this.field4252[var2].method709((byte) 77);
            }
        }
        if (arg0 != 4) {
            this.field4251 = (class12) null;
        }
        for (int var3 = 0; var3 < this.field4252.length; var3++) {
            if (this.field4252[var3] != null) {
                this.field4252[var3].method714((byte) 79);
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lea;Lio;)V", line = 398)
    public class251(class12 arg0, class353 arg1) {
        this.field4251 = arg0;
        this.field4253 = arg1;
        if (!this.field4251.method63(20844)) {
            this.field4249 = this.field4251.method66(true, (byte) -97, 255, 255, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lja;ZBLja;I)Lne;", line = 411)
    private final class90 method1952(class302 arg0, boolean arg1, byte arg2, class302 arg3, int arg4) {
        field4246++;
        if (this.field4254 == null) {
            throw new RuntimeException();
        }
        this.field4254.field3760 = arg4 * 8 + 5;
        if (this.field4254.field3760 >= this.field4254.field3793.length) {
            throw new RuntimeException();
        } else if (this.field4252[arg4] == null) {
            int var6 = 116 / ((arg2 + 34) / 35);
            int var7 = this.field4254.method1715((byte) 83);
            int var8 = this.field4254.method1715((byte) -108);
            class90 var9 = new class90(arg4, arg0, arg3, this.field4251, this.field4253, var7, var8, arg1);
            this.field4252[arg4] = var9;
            return var9;
        } else {
            return this.field4252[arg4];
        }
    }
}
