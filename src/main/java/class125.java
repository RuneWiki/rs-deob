import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class125 extends class112 {

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "I")
    private int field1754 = 4096;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "[I")
    private int[] field1755 = new int[3];

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "I")
    private int field1748 = 4096;

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "I")
    private int field1749 = 4096;

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "I")
    private int field1751 = 409;

    @OriginalMember(owner = "client!ai", name = "X", descriptor = "Lwm;")
    public static class152 field1760 = class157.method1048("::fpson", 99);

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "[Luk;")
    public static class93[] field1758 = new class93[14];

    @OriginalMember(owner = "client!ai", name = "Z", descriptor = "Z")
    public static boolean field1762 = false;

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "Lm;")
    public static class48 field1753 = new class48();

    @OriginalMember(owner = "client!ai", name = "ab", descriptor = "Lwm;")
    public static class152 field1763 = class157.method1048("::wm3", 98);

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!ai", name = "W", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!ai", name = "Y", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIBLse;)V", line = 6)
    public static final void method794(int arg0, int arg1, byte arg2, class12 arg3) {
        if ((arg0 & 0x80) != 0) {
            int var4 = class73.field1058.method1997(arg2 + 22760);
            byte[] var5 = new byte[var4];
            class291 var6 = new class291(var5);
            class73.field1058.method2002(0, var5, var4, arg2 - 28645);
            class120.field1701[arg1] = var6;
            arg3.method63((byte) 84, var6);
        }
        field1761++;
        if ((arg0 & 0x20) != 0) {
            arg3.field4167 = class73.field1058.method2017(true);
            if (arg3.field4167.method1002(-12637, 0) == 126) {
                arg3.field4167 = arg3.field4167.method983((byte) 88, 1);
                class245.method1687(arg3.method65(false), 2, arg3.field4167, arg2 + 39);
            } else if (class85.field1176 == arg3) {
                class245.method1687(arg3.method65(false), 2, arg3.field4167, -1);
            }
            arg3.field4238 = 0;
            arg3.field4189 = 150;
            arg3.field4228 = 0;
        }
        if ((arg0 & 0x400) != 0) {
            int var7 = class73.field1058.method1979(arg2 + 40);
            if (var7 == 65535) {
                var7 = -1;
            }
            boolean var8 = true;
            int var9 = class73.field1058.method1969((byte) -16);
            if (var7 != -1 && arg3.field4182 != -1 && class133.method851(class189.method1255(var7, (byte) -128).field5170, arg2 ^ 0xFFFFFFB7).field2152 < class133.method851(class189.method1255(arg3.field4182, (byte) -127).field5170, 110).field2152) {
                var8 = false;
            }
            if (var8) {
                arg3.field4242 = 1;
                arg3.field4196 = 0;
                arg3.field4205 = var9 >> 16;
                arg3.field4164 = (var9 & 0xFFFF) + class142.field2187;
                arg3.field4233 = 0;
                arg3.field4182 = var7;
                if (arg3.field4164 > class142.field2187) {
                    arg3.field4233 = -1;
                }
                if (arg3.field4182 != -1 && class142.field2187 == arg3.field4164) {
                    int var10 = class189.method1255(arg3.field4182, (byte) -126).field5170;
                    if (var10 != -1) {
                        class141 var11 = class133.method851(var10, -40);
                        if (var11 != null && var11.field2177 != null) {
                            class18.method114(arg3.field4162, 0, arg3.field4231, var11, class85.field1176 == arg3, arg2 ^ 0xFFFF8EF4);
                        }
                    }
                }
            }
        }
        if ((arg0 & 0x40) != 0) {
            int var12 = class73.field1058.method1979(arg2 ^ 0xFFFFFFD8);
            int var13 = class73.field1058.method1997(22720);
            boolean var14 = (var12 & 0x8000) != 0;
            int var15 = class73.field1058.method1990((byte) 114);
            int var16 = class73.field1058.field4946;
            if (arg3.field146 != null && arg3.field177 != null) {
                boolean var17 = false;
                long var18 = arg3.field146.method1013(-18674);
                if (var13 <= 1) {
                    if (var14 || (!class252.field4348 || class277.field4735) && !class205.field3346) {
                        for (int var20 = 0; var20 < class299.field5190; var20++) {
                            if (class11.field133[var20] == var18) {
                                var17 = true;
                                break;
                            }
                        }
                    } else {
                        var17 = true;
                    }
                }
                if (!var17 && class276.field4729 == 0) {
                    class111.field1568.field4946 = 0;
                    class73.field1058.method1985(0, 12352, var15, class111.field1568.field4950);
                    class111.field1568.field4946 = 0;
                    int var21 = -1;
                    class152 var23;
                    if (var14) {
                        var12 &= 0x7FFF;
                        class225 var22 = class322.method2273(class111.field1568, -3018);
                        var21 = var22.field3654;
                        var23 = var22.field3651.method1056(class111.field1568, 0);
                    } else {
                        var23 = class171.method1142(class80.method533(23178, class111.field1568).method989((byte) 118));
                    }
                    arg3.field4167 = var23.method1025(-103);
                    arg3.field4228 = var12 & 0xFF;
                    arg3.field4238 = var12 >> 8;
                    arg3.field4189 = 150;
                    if (var13 == 2) {
                        class251.method1731(var21, var14 ? 17 : 1, (byte) 127, var23, (class152) null, class195.method1307(new class152[] { class236.field3871, arg3.method65(false) }, (byte) 29));
                    } else if (var13 == 1) {
                        class251.method1731(var21, var14 ? 17 : 1, (byte) 113, var23, (class152) null, class195.method1307(new class152[] { class150.field2342, arg3.method65(false) }, (byte) 29));
                    } else {
                        class251.method1731(var21, var14 ? 17 : 2, (byte) 119, var23, (class152) null, arg3.method65(false));
                    }
                }
            }
            class73.field1058.field4946 = var15 + var16;
        }
        if ((arg0 & 0x800) != 0) {
            int var24 = class73.field1058.method2013((byte) -20);
            int var25 = class73.field1058.method1974((byte) 87);
            arg3.method1712(class142.field2187, var25, 95, var24);
        }
        if ((arg0 & 0x100) != 0) {
            int var26 = class73.field1058.method2011(-70);
            int[] var27 = new int[var26];
            int[] var28 = new int[var26];
            int[] var29 = new int[var26];
            for (int var30 = 0; var30 < var26; var30++) {
                int var31 = class73.field1058.method1976((byte) 86);
                if (var31 == 65535) {
                    var31 = -1;
                }
                var27[var30] = var31;
                var29[var30] = class73.field1058.method1990((byte) 83);
                var28[var30] = class73.field1058.method1957(810960104);
            }
            class6.method28(var28, var29, var27, arg2 - 10707, arg3);
        }
        if (arg2 != -40) {
            method797(false);
        }
        if ((arg0 & 0x4) != 0) {
            arg3.field4179 = class73.field1058.method1957(810960104);
            if (arg3.field4179 == 65535) {
                arg3.field4179 = -1;
            }
        }
        if ((arg0 & 0x200) != 0) {
            arg3.field4184 = class73.field1058.method1997(22720);
            arg3.field4235 = class73.field1058.method1974((byte) 62);
            arg3.field4243 = class73.field1058.method2011(-38);
            arg3.field4219 = class73.field1058.method1990((byte) 100);
            arg3.field4267 = class73.field1058.method1976((byte) 86) + class142.field2187;
            arg3.field4212 = class73.field1058.method1976((byte) 86) + class142.field2187;
            arg3.field4176 = class73.field1058.method1974((byte) 16);
            arg3.field4180 = 1;
            arg3.field4262 = 0;
        }
        if ((arg0 & 0x1) != 0) {
            int var32 = class73.field1058.method2013((byte) -20);
            int var33 = class73.field1058.method1997(22720);
            arg3.method1712(class142.field2187, var33, 125, var32);
            arg3.field4178 = class142.field2187 + 300;
            arg3.field4192 = class73.field1058.method1990((byte) 84);
        }
        if ((arg0 & 0x10) != 0) {
            int var34 = class73.field1058.method1957(810960104);
            if (var34 == 65535) {
                var34 = -1;
            }
            int var35 = class73.field1058.method1997(22720);
            class121.method782(var35, 1644, var34, arg3);
        }
        if ((arg0 & 0x2) != 0) {
            arg3.field4234 = class73.field1058.method1957(810960104);
            arg3.field4191 = class73.field1058.method2021((byte) 74);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZ)[[I", line = 279)
    public final int[][] method55(int arg0, boolean arg1) {
        int[][] var3 = this.field1594.method656((byte) -63, arg0);
        if (arg1) {
            this.field1749 = -114;
        }
        if (this.field1594.field1402) {
            int[][] var4 = this.method750(0, (byte) -17, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class58.field889; var11++) {
                int var12 = var5[var11];
                int var13 = var12 - this.field1755[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field1751 < var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field1755[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field1751 < var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = var16 - this.field1755[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field1751 < var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field1754 * var12 >> 12;
                            var9[var11] = this.field1749 * var14 >> 12;
                            var10[var11] = this.field1748 * var16 >> 12;
                        }
                    }
                }
            }
        }
        field1750++;
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIII)V", line = 371)
    public static final void method795(int arg0, int arg1, int arg2, int arg3) {
        field1757++;
        if (class224.field3637 != 0 && arg1 != 0 && class150.field2329 < 50 && arg3 != -1) {
            class77.field1098[class150.field2329] = arg3;
            class192.field3040[class150.field2329] = arg1;
            class281.field4795[class150.field2329] = arg2;
            class169.field2656[class150.field2329] = null;
            class106.field1516[class150.field2329] = 0;
            class150.field2329++;
        }
        if (arg0 != -30990) {
            method795(-38, 24, 80, -85);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILhi;)V", line = 398)
    public final void method52(int arg0, int arg1, class291 arg2) {
        if (arg0 != 31164) {
            return;
        }
        if (arg1 == 0) {
            this.field1751 = arg2.method2021((byte) 74);
        } else if (arg1 == 1) {
            this.field1748 = arg2.method2021((byte) 74);
        } else if (arg1 == 2) {
            this.field1749 = arg2.method2021((byte) 74);
        } else if (arg1 == 3) {
            this.field1754 = arg2.method2021((byte) 74);
        } else if (arg1 == 4) {
            int var5 = arg2.method2009((byte) 64);
            this.field1755[0] = class34.method251(var5 << 4, 267386880);
            this.field1755[2] = class34.method251(0, var5 >> 12);
            this.field1755[1] = class34.method251(var5 >> 4, 4080);
        }
        field1756++;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V", line = 493)
    public class125() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(II)V", line = 469)
    public static final void method796(int arg0, int arg1) {
        field1752++;
        if (arg0 > -32) {
            method796(71, 103);
        }
        class254.field4394.method1617(arg1, 50);
        class194.field3087.method1617(arg1, 50);
        class152.field2430.method1617(arg1, 50);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V", line = 500)
    public static void method797(boolean arg0) {
        if (!arg0) {
            field1760 = null;
            field1763 = null;
            field1758 = null;
            field1753 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILah;)V", line = 520)
    public static final void method798(int arg0, class205 arg1) {
        class113.field1611 = class160.method1078(37, class83.field1154, arg1, 0);
        class195.field3129 = class184.method1225(class80.field1125, 0, arg1, (byte) 19);
        field1759++;
        class22.field360 = class184.method1225(class289.field4894, 0, arg1, (byte) 19);
        class98.field1404 = class184.method1225(class113.field1610, 0, arg1, (byte) 19);
        class23.field402 = class184.method1225(class235.field3858, 0, arg1, (byte) 19);
        class66.field996 = class184.method1225(class4.field67, 0, arg1, (byte) 19);
        class143.field2199 = class184.method1225(class27.field459, 0, arg1, (byte) 19);
        class169.field2642 = class231.method1592(arg1, 0, class44.field704, (byte) 22);
        class123.field1732 = class137.method863(class260.field4453, 0, (byte) -6, arg1);
        class203.field3277 = class137.method863(class195.field3126, 0, (byte) -6, arg1);
        class34.field562 = class62.method403(arg1, 0, 0, class48.field745);
        class49.field772 = class62.method403(arg1, 0, 0, class172.field2726);
        class303.field5220.method1144(class49.field772, (int[]) null);
        class305.field5238.method1144(class49.field772, (int[]) null);
        class316.field5485.method1144(class49.field772, (int[]) null);
        if (class217.field3516) {
            class102.field1476 = class208.method1401(class63.field953, arg0 + 520, 0, arg1);
            for (int var2 = 0; var2 < class102.field1476.length; var2++) {
                class102.field1476[var2].method2108();
            }
        }
        class109 var3 = class307.method2137(arg1, (byte) -66, class80.field1121, 0);
        var3.method736();
        if (class217.field3516) {
            class324.field5655 = new class68(var3);
        } else {
            class324.field5655 = var3;
        }
        class109[] var4 = class160.method1078(arg0 + 57, class101.field1468, arg1, 0);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method736();
        }
        if (class217.field3516) {
            class305.field5244 = new class203[var4.length];
            for (int var6 = 0; var6 < var4.length; var6++) {
                class305.field5244[var6] = new class68(var4[var6]);
            }
        } else {
            class305.field5244 = var4;
        }
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = arg0 + (int) (Math.random() * 41.0D);
        for (int var11 = 0; var11 < class113.field1611.length; var11++) {
            class113.field1611[var11].method731(var7 + var10, var8 - -var10, var9 + var10);
        }
        if (class217.field3516) {
            class33.field543 = new class203[class113.field1611.length];
            for (int var12 = 0; var12 < class113.field1611.length; var12++) {
                class33.field543[var12] = new class68(class113.field1611[var12]);
            }
        } else {
            class33.field543 = class113.field1611;
        }
    }
}
