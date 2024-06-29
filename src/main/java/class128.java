import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class128 {

    @OriginalMember(owner = "client!rw", name = "f", descriptor = "Los;")
    private class468 field1692;

    @OriginalMember(owner = "client!rw", name = "o", descriptor = "Lnba;")
    private class366 field1701;

    @OriginalMember(owner = "client!rw", name = "q", descriptor = "I")
    public int field1703;

    @OriginalMember(owner = "client!rw", name = "l", descriptor = "I")
    private int field1698;

    @OriginalMember(owner = "client!rw", name = "k", descriptor = "[B")
    public byte[] field1697;

    @OriginalMember(owner = "client!rw", name = "h", descriptor = "I")
    private int field1694;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "I")
    private int field1687;

    @OriginalMember(owner = "client!rw", name = "i", descriptor = "I")
    private int field1695;

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!rw", name = "d", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!rw", name = "j", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!rw", name = "m", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!rw", name = "n", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!rw", name = "p", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!rw", name = "r", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!rw", name = "s", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!rw", name = "t", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!rw", name = "e", descriptor = "[Lha;")
    public static class116[] field1691;

    @OriginalMember(owner = "client!rw", name = "g", descriptor = "[[Ldba;")
    private class223[][] field1693;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(ZIIII[[Z)V", line = 10)
    public final void method792(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean[][] arg5) {
        field1696++;
        this.field1692.method2828(5126, false);
        this.field1692.method2800(false, -32);
        this.field1692.method2778(-2, 0);
        this.field1692.method2791(1, (byte) -69);
        this.field1692.method2796((byte) -80, 1);
        int var7 = -68 % ((45 - arg3) / 46);
        float var8 = 1.0F / (float) (this.field1692.field6958 * 128);
        if (arg0) {
            for (int var23 = 0; var23 < this.field1695; var23++) {
                int var24 = var23 << this.field1694;
                int var25 = var23 + 1 << this.field1694;
                label85: for (int var26 = 0; var26 < this.field1687; var26++) {
                    int var27 = var26 << this.field1694;
                    int var28 = var26 + 1 << this.field1694;
                    for (int var29 = var27; var29 < var28; var29++) {
                        if ((var29 - arg1) >= (-arg4) && arg4 >= (var29 - arg1)) {
                            for (int var30 = var24; var30 < var25; var30++) {
                                if ((var30 - arg2) >= (-arg4) && arg4 >= (var30 - arg2) && arg5[arg4 + var29 - arg1][var30 - (arg2 - arg4)]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var8, var8, 1.0F);
                                    OpenGL.glTranslatef((float) (-var26) / var8, (float) (-var23) / var8, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field1693[var26][var23].method1463((byte) -43);
                                    continue label85;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var9 = 0; var9 < this.field1695; var9++) {
                int var10 = var9 << this.field1694;
                int var11 = var9 + 1 << this.field1694;
                for (int var12 = 0; var12 < this.field1687; var12++) {
                    int var13 = 0;
                    int var14 = var12 << this.field1694;
                    int var15 = var12 + 1 << this.field1694;
                    class444 var16 = this.field1692.field7005;
                    var16.field6221 = 0;
                    for (int var17 = var10; var17 < var11; var17++) {
                        if (-arg4 <= var17 - arg2 && arg4 >= (var17 - arg2)) {
                            int var18 = this.field1701.field8121 * var17 + var14;
                            for (int var19 = var14; var19 < var15; var19++) {
                                if (-arg4 <= var19 - arg1 && arg4 >= (var19 - arg1) && arg5[arg4 + var19 - arg1][var17 + arg4 - arg2]) {
                                    short[] var20 = this.field1701.field5284[var18];
                                    if (var20 != null) {
                                        if (this.field1692.field7004) {
                                            for (int var21 = 0; var21 < var20.length; var21++) {
                                                var16.method2608(var20[var21] & 0xFFFF, (byte) 47);
                                                var13++;
                                            }
                                        } else {
                                            for (int var22 = 0; var22 < var20.length; var22++) {
                                                var13++;
                                                var16.method2590(var20[var22] & 0xFFFF, (byte) -94);
                                            }
                                        }
                                    }
                                }
                                var18++;
                            }
                        }
                    }
                    if (var13 > 0) {
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glLoadIdentity();
                        OpenGL.glScalef(var8, var8, 1.0F);
                        OpenGL.glTranslatef((float) (-var12) / var8, (float) (-var9) / var8, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field1693[var12][var9].method1468(false, 5123, var13, var16.field6162);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(IILk;I)Z", line = 194)
    public final boolean method793(int arg0, int arg1, class88 arg2, int arg3) {
        field1699++;
        class469 var5 = (class469) arg2;
        int var6 = var5.field7118 + arg3 + 1;
        int var7 = var5.field7117 + arg1 + 1;
        int var8 = this.field1703 * var6 + var7;
        int var9 = var5.field7109;
        int var10 = var5.field7114;
        if (var6 <= 0) {
            int var11 = 1 - var6;
            var8 += this.field1703 * var11;
            var6 = 1;
            var9 -= var11;
        }
        int var12 = this.field1703 - var10;
        if (this.field1698 <= var6 + var9) {
            int var13 = var9 + var6 + 1 - this.field1698;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var12 += var14;
            var7 = 1;
            var8 += var14;
            var10 -= var14;
        }
        if ((var7 + var10) >= this.field1703) {
            int var15 = var7 + var10 + 1 - this.field1703;
            var12 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (arg0 + var16) * this.field1703 + var12;
            return client.method3601(var9, var10, this.field1697, var8, (byte) 89, var16, var17);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIIII)V", line = 267)
    public static final void method794(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 >= class130.field1712 && class401.field5755 >= arg4) {
            int var5 = class406.method2430(class483.field7334, arg1, class202.field3021, 64);
            int var6 = class406.method2430(class483.field7334, arg0, class202.field3021, 64);
            class548.method3210(var6, true, var5, arg2, arg4);
        }
        if (arg3 >= 125) {
            field1704++;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(ILk;II)V", line = 285)
    public final void method795(int arg0, class88 arg1, int arg2, int arg3) {
        field1690++;
        class469 var5 = (class469) arg1;
        int var6 = var5.field7118 + arg2 + 1;
        int var7 = var5.field7117 + arg0 + 1;
        int var8 = this.field1703 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field7109;
        if (arg3 != 25250) {
            this.field1695 = -63;
        }
        int var11 = var5.field7114;
        int var12 = this.field1703 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var8 += this.field1703 * var13;
            var6 = 1;
            var10 -= var13;
            var9 += var11 * var13;
        }
        int var14 = 0;
        if (this.field1698 <= (var6 + var10)) {
            int var15 = var6 + var10 + 1 - this.field1698;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var11 -= var16;
            var7 = 1;
            var9 += var16;
            var12 += var16;
            var8 += var16;
            var14 += var16;
        }
        if (var7 + var11 >= this.field1703) {
            int var17 = var7 + var11 + 1 - this.field1703;
            var11 -= var17;
            var12 += var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class240.method1543(var12, var5.field7111, var11, var10, (byte) -20, var9, var8, var14, this.field1697);
            this.method799(var7, true, var10, var6, var11);
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)V", line = 359)
    public static final void method796(byte arg0) {
        for (int var1 = 0; var1 < class644.field9342; var1++) {
            int var2 = class18.field157[var1];
            class383 var3 = ((class234) class627.field9185.method1333((long) var2, false)).field3443;
            int var4 = class271.field4010.method2561((byte) -28);
            if ((var4 & 0x2) != 0) {
                var4 += class271.field4010.method2561((byte) 121) << 8;
            }
            if ((var4 & 0x800) != 0) {
                var3.field1011 = class271.field4010.method2626(-128);
                var3.field1073 = class271.field4010.method2598(true);
                var3.field1001 = class271.field4010.method2604(27700);
                var3.field1063 = (byte) class271.field4010.method2600(-33);
                var3.field1075 = class576.field8505 + class271.field4010.method2587(11615);
                var3.field1080 = class576.field8505 + class271.field4010.method2620(78);
            }
            if ((var4 & 0x200) != 0) {
                int var5 = class271.field4010.method2616(50);
                int var6 = class271.field4010.method2588(-93);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var7 = class271.field4010.method2561((byte) 115);
                var3.method507(var5, var7, true, var6, 48);
            }
            if ((var4 & 0x1) != 0) {
                int var8 = class271.field4010.method2587(11615);
                int var9 = class271.field4010.method2564((byte) 80);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var10 = class271.field4010.method2600(-25);
                var3.method507(var8, var10, false, var9, 65);
            }
            if ((var4 & 0x10) != 0) {
                int var11 = class271.field4010.method2573(-14319);
                int var12 = class271.field4010.method2615(255);
                var3.method497(82, class576.field8505, var11, var12);
            }
            if ((var4 & 0x100) != 0) {
                var3.field1015 = class271.field4010.method2598(true);
                var3.field1030 = class271.field4010.method2626(-128);
                var3.field1018 = class271.field4010.method2570((byte) 57);
                var3.field1040 = class271.field4010.method2626(-128);
                var3.field1045 = class271.field4010.method2620(41) + class576.field8505;
                var3.field1004 = class271.field4010.method2587(11615) + class576.field8505;
                var3.field1077 = class271.field4010.method2574((byte) -38);
                var3.field1018 += var3.field1090[0];
                var3.field1015 += var3.field1090[0];
                var3.field1030 += var3.field1089[0];
                var3.field1097 = 0;
                var3.field1040 += var3.field1089[0];
                var3.field1091 = 1;
            }
            if ((var4 & 0x2000) != 0) {
                var3.field5588 = class271.field4010.method2620(20);
                var3.field5603 = class271.field4010.method2587(11615);
            }
            if ((var4 & 0x8) != 0) {
                var3.field1042 = class271.field4010.method2585(-23);
                var3.field1027 = 100;
            }
            if ((var4 & 0x400) != 0) {
                int var13 = class271.field4010.method2561((byte) -85);
                int[] var14 = new int[var13];
                int[] var15 = new int[var13];
                int[] var16 = new int[var13];
                for (int var17 = 0; var17 < var13; var17++) {
                    int var18 = class271.field4010.method2616(78);
                    if (var18 == 65535) {
                        var18 = -1;
                    }
                    var14[var17] = var18;
                    var15[var17] = class271.field4010.method2574((byte) 114);
                    var16[var17] = class271.field4010.method2620(16);
                }
                class511.method3050(var14, var16, -1, var3, var15);
            }
            if ((var4 & 0x40) != 0) {
                int var19 = class271.field4010.method2616(87);
                if (var19 == 65535) {
                    var19 = -1;
                }
                int var20 = class271.field4010.method2615(255);
                class576.method3373(var19, var3, 0, var20);
            }
            if ((var4 & 0x80) != 0) {
                var3.field1037 = class271.field4010.method2587(11615);
                if (var3.field1037 == 65535) {
                    var3.field1037 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                int var21 = class271.field4010.method2573(-14319);
                int var22 = class271.field4010.method2561((byte) 113);
                var3.method497(83, class576.field8505, var21, var22);
                var3.field1032 = class576.field8505 + 300;
                var3.field1014 = class271.field4010.method2574((byte) 104);
            }
            if ((var4 & 0x1000) != 0) {
                int var23 = class271.field4010.method2621(-18757);
                var3.field995 = class271.field4010.method2600(111);
                var3.field1006 = class271.field4010.method2574((byte) -64);
                var3.field1020 = var23 & 0x7FFF;
                var3.field1078 = (var23 & 0x8000) != 0;
                var3.field1085 = class576.field8505 + var3.field1020 + var3.field995;
            }
            if ((var4 & 0x20) != 0) {
                if (var3.field5601.method2631((byte) -78)) {
                    class292.method1807(9107, var3);
                }
                var3.method2322(class369.field5329.method1783(-1, class271.field4010.method2620(50)), -31902);
                var3.method508(20060, var3.field5601.field6234);
                var3.field1059 = var3.field5601.field6263 << 3;
                if (var3.field5601.method2631((byte) -78)) {
                    class118.method727(var3.field1089[0], null, (byte) 67, 0, null, var3.field3457, var3.field1090[0], var3);
                }
            }
        }
        if (arg0 > -58) {
            method796((byte) -30);
        }
        field1702++;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(BI)Lln;", line = 568)
    public static final class94 method797(byte arg0, int arg1) {
        field1689++;
        class94 var2 = (class94) class14.field128.method227((long) arg1, (byte) 116);
        if (var2 != null) {
            return var2;
        }
        if (arg0 < 19) {
            field1691 = null;
        }
        byte[] var3 = class301.field4409.method3486((byte) -32, 0, arg1);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class94 var4 = class228.method1492(-22, var3);
            class14.field128.method230((long) arg1, var4, 50);
            return var4;
        }
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(ILk;II)V", line = 592)
    public final void method798(int arg0, class88 arg1, int arg2, int arg3) {
        field1688++;
        class469 var5 = (class469) arg1;
        int var6 = var5.field7118 + arg2 + arg0;
        int var7 = var5.field7117 + arg3 + 1;
        int var8 = this.field1703 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field7109;
        int var11 = var5.field7114;
        int var12 = this.field1703 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var8 += this.field1703 * var14;
            var9 += var11 * var14;
            var10 -= var14;
            var6 = 1;
        }
        if ((var6 + var10) >= this.field1698) {
            int var15 = var6 + var10 + 1 - this.field1698;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var7 = 1;
            var9 += var16;
            var8 += var16;
            var13 += var16;
            var11 -= var16;
            var12 += var16;
        }
        if ((var7 + var11) >= this.field1703) {
            int var17 = var7 + var11 + 1 - this.field1703;
            var11 -= var17;
            var12 += var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class490.method2969(-27373, var13, var5.field7111, var10, var12, var11, var8, var9, this.field1697);
            this.method799(var7, true, var10, var6, var11);
        }
    }

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Los;Lnba;)V", line = 659)
    public class128(class468 arg0, class366 arg1) {
        this.field1692 = arg0;
        this.field1701 = arg1;
        this.field1703 = (this.field1701.field8121 * this.field1701.field8116 >> this.field1692.field6959) + 2;
        this.field1698 = (this.field1701.field8118 * this.field1701.field8116 >> this.field1692.field6959) + 2;
        this.field1697 = new byte[this.field1703 * this.field1698];
        this.field1694 = this.field1692.field6959 + 7 - this.field1701.field8119;
        this.field1687 = this.field1701.field8121 >> this.field1694;
        this.field1695 = this.field1701.field8118 >> this.field1694;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(IZIII)V", line = 676)
    private final void method799(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!arg1) {
            return;
        }
        field1705++;
        if (this.field1693 == null) {
            return;
        }
        int var6 = arg0 - 1 >> 7;
        int var7 = arg0 + arg4 - 1 - 1 >> 7;
        int var8 = arg3 - 1 >> 7;
        int var9 = arg2 + arg3 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class223[] var11 = this.field1693[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field3287 = true;
            }
        }
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(B)V", line = 715)
    public final void method800(byte arg0) {
        field1706++;
        this.field1693 = new class223[this.field1687][this.field1695];
        for (int var2 = 0; var2 < this.field1695; var2++) {
            for (int var3 = 0; var3 < this.field1687; var3++) {
                this.field1693[var3][var2] = new class223(this.field1692, this, this.field1701, var3, var2, this.field1694, var3 * 128 + 1, var2 * 128 - -1);
            }
        }
        if (arg0 != -116) {
            method801((byte) 98);
        }
    }

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "(B)V", line = 743)
    public static void method801(byte arg0) {
        field1691 = null;
        if (arg0 != 30) {
            field1691 = null;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(II)I", line = 753)
    public static final int method802(int arg0, int arg1) {
        field1700++;
        if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
            return 6407;
        }
        if (arg1 != 1) {
            field1691 = null;
        }
        if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
            return 6408;
        } else if (arg0 == 6406 || arg0 == 34844) {
            return 6406;
        } else if (arg0 == 6409 || arg0 == 34846) {
            return 6409;
        } else if (arg0 == 6410 || arg0 == 34847) {
            return 6410;
        } else if (arg0 == 6402) {
            return 6402;
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
