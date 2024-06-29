import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class241 {

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    private int field4185 = 32;

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "J")
    private long field4205 = class3.method13(17161);

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "Z")
    private boolean field4208 = true;

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "I")
    private int field4210 = 0;

    @OriginalMember(owner = "client!ff", name = "F", descriptor = "J")
    private long field4214 = 0L;

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "[Lwd;")
    private class221[] field4209 = new class221[8];

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "I")
    private int field4211 = 0;

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "[Lwd;")
    private class221[] field4216 = new class221[8];

    @OriginalMember(owner = "client!ff", name = "G", descriptor = "I")
    private int field4215 = 0;

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "I")
    private int field4218 = 0;

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "J")
    private long field4219 = 0L;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "Lha;")
    public static class63 field4187 = null;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field4186 = 0;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "Lc;")
    public static class125 field4183 = new class125();

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "I")
    public static int field4207 = 7759444;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "Lc;")
    public static class125 field4204 = new class125();

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!ff", name = "D", descriptor = "I")
    private int field4212;

    @OriginalMember(owner = "client!ff", name = "E", descriptor = "I")
    public int field4213;

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "I")
    public int field4217;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "Lwd;")
    private class221 field4197;

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "[I")
    public int[] field4206;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
    public final void method1582(boolean arg0) {
        if (!arg0) {
            this.field4208 = true;
            field4189++;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([II)V")
    private final void method1583(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class162.field2909) {
            var3 = arg1 << 1;
        }
        class46.method329(arg0, 0, var3);
        this.field4218 -= arg1;
        if (this.field4197 != null && this.field4218 <= 0) {
            this.field4218 += class200.field3446 >> 4;
            class95.method655((byte) -45, this.field4197);
            this.method1589((byte) 88, this.field4197, this.field4197.method1412());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class221 var10 = null;
                        class221 var11 = this.field4209[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class55 var12 = var11.field3777;
                                if (var12 == null || var12.field951 <= var8) {
                                    var11.field3779 = true;
                                    int var13 = var11.method285();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field951 += var13;
                                    }
                                    if (var4 >= this.field4185) {
                                        break label107;
                                    }
                                    class221 var14 = var11.method278();
                                    if (var14 != null) {
                                        int var15 = var11.field3778;
                                        while (var14 != null) {
                                            this.method1589((byte) 104, var14, var15 * var14.method1412() >> 8);
                                            var14 = var11.method308();
                                        }
                                    }
                                    class221 var16 = var11.field3780;
                                    var11.field3780 = null;
                                    if (var10 == null) {
                                        this.field4209[var7] = var16;
                                    } else {
                                        var10.field3780 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field4216[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3780;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class221 var18 = this.field4209[var17];
                this.field4209[var17] = this.field4216[var17] = null;
                while (var18 != null) {
                    class221 var19 = var18.field3780;
                    var18.field3780 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field4218 < 0) {
            this.field4218 = 0;
        }
        if (this.field4197 != null) {
            this.field4197.method277(arg0, 0, arg1);
        }
        this.field4205 = class3.method13(17161);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "()V")
    public void method20() throws Exception {
        field4193++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)V")
    private final void method1584(int arg0, int arg1) {
        if (arg0 != 2955) {
            field4186 = 58;
        }
        field4191++;
        this.field4218 -= arg1;
        if (this.field4218 < 0) {
            this.field4218 = 0;
        }
        if (this.field4197 != null) {
            this.field4197.method302(arg1);
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "()I")
    public int method22() throws Exception {
        field4199++;
        return this.field4217;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public void method18(int arg0) throws Exception {
        field4194++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1585(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4198++;
        class235.method1546(arg3, arg0, arg2 + arg3, arg0 + arg1);
        class235.method1558(arg3, arg0, arg2, arg1, 0);
        if (class140.field2595 < 100) {
            return;
        }
        if (class20.field270 == null || class20.field270.field4494 != arg2 || class20.field270.field4496 != arg1) {
            class168 var5 = new class168(arg2, arg1);
            class235.method1551(var5.field3011, arg2, arg1);
            class237.method1566(0, 0, class89.field1727, 0, 0, arg2, 1391070128, arg1, class33.field500);
            class20.field270 = var5;
            class52.field908.method1002(81);
        }
        class20.field270.method974(arg3, arg0);
        int var6 = class171.field3034 * arg2 / class33.field500 + arg3;
        int var7 = arg0 + (class47.field860 * arg1 / class89.field1727);
        int var8 = class92.field1774 * arg2 / class33.field500;
        if (!arg4) {
            method1585(-12, 24, -51, 5, true);
        }
        int var9 = class260.field4594 * arg1 / class89.field1727;
        class235.method1554(var6, var7, var8, var9, 16711680, 128);
        class235.method1534(var6, var7, var8, var9, 16711680);
        if (class31.field459 <= 0 || class31.field459 % 10 >= 5) {
            return;
        }
        for (class132 var10 = (class132) class189.field3279.method873((byte) 76); var10 != null; var10 = (class132) class189.field3279.method870((byte) 90)) {
            if (class2.field30 == var10.field2468) {
                int var11 = var10.field2459 * arg2 / class33.field500 + arg3;
                int var12 = var10.field2465 * arg1 / class89.field1727 + arg0;
                class235.method1558(var11 - 2, var12 + -2, 4, 4, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZLwd;)V")
    public final synchronized void method1586(boolean arg0, class221 arg1) {
        field4190++;
        this.field4197 = arg1;
        if (arg0) {
            this.method1583((int[]) null, 104);
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "()V")
    public void method19() {
        field4184++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
    public static void method1587(byte arg0) {
        if (arg0 == -90) {
            field4183 = null;
            field4204 = null;
            field4187 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)V")
    public final synchronized void method1588(byte arg0) {
        field4203++;
        this.field4208 = true;
        if (arg0 != -100) {
            return;
        }
        try {
            this.method24();
        } catch (Exception var2) {
            this.method19();
            this.field4214 = class3.method13(17161) + 2000L;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLwd;I)V")
    private final void method1589(byte arg0, class221 arg1, int arg2) {
        field4201++;
        int var4 = arg2 >> 5;
        if (arg0 < 4) {
            this.field4216 = null;
        }
        class221 var5 = this.field4216[var4];
        if (var5 == null) {
            this.field4209[var4] = arg1;
        } else {
            var5.field3780 = arg1;
        }
        this.field4216[var4] = arg1;
        arg1.field3778 = arg2;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)V")
    public final synchronized void method1590(byte arg0) {
        int var2 = 101 / ((9 - arg0) / 44);
        field4195++;
        if (this.field4206 == null) {
            return;
        }
        long var3 = class3.method13(17161);
        try {
            if (this.field4214 != 0L) {
                if (var3 < this.field4214) {
                    return;
                }
                this.method18(this.field4217);
                this.field4214 = 0L;
                this.field4208 = true;
            }
            int var5 = this.method22();
            if (this.field4210 - var5 > this.field4215) {
                this.field4215 = this.field4210 - var5;
            }
            int var6 = this.field4213 + this.field4212;
            if ((var6 + 256) > 16384) {
                var6 = 16128;
            }
            if (this.field4217 < (var6 + 256)) {
                this.field4217 += 1024;
                if (this.field4217 > 16384) {
                    this.field4217 = 16384;
                }
                this.method19();
                this.method18(this.field4217);
                this.field4208 = true;
                var5 = 0;
                if (var6 + 256 > this.field4217) {
                    var6 = this.field4217 - 256;
                    this.field4212 = var6 - this.field4213;
                }
            }
            while (var6 > var5) {
                this.method1583(this.field4206, 256);
                this.method20();
                var5 += 256;
            }
            if (this.field4219 < var3) {
                if (this.field4208) {
                    this.field4208 = false;
                } else if (this.field4215 == 0 && this.field4211 == 0) {
                    this.method19();
                    this.field4214 = var3 + 2000L;
                    return;
                } else {
                    this.field4212 = Math.min(this.field4211, this.field4215);
                    this.field4211 = this.field4215;
                }
                this.field4215 = 0;
                this.field4219 = var3 + 2000L;
            }
            this.field4210 = var5;
        } catch (Exception var8) {
            this.method19();
            this.field4214 = var3 + 2000L;
        }
        try {
            if (var3 > (this.field4205 + 500000L)) {
                var3 = this.field4205;
            }
            while (var3 > (this.field4205 + 5000L)) {
                this.method1584(2955, 256);
                this.field4205 += (long) (256000 / class200.field3446);
            }
        } catch (Exception var7) {
            this.field4205 = var3;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
    public final synchronized void method1591(int arg0) {
        if (class103.field2003 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class103.field2003.field3069[var3] == this) {
                    class103.field2003.field3069[var3] = null;
                }
                if (class103.field2003.field3069[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class103.field2003.field3071 = true;
                while (class103.field2003.field3073) {
                    class91.method636(arg0 - 7759449, 50L);
                }
                class103.field2003 = null;
            }
        }
        field4196++;
        this.method19();
        this.field4206 = null;
        if (arg0 != 7759444) {
            this.field4208 = true;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)Lw;")
    public static final class154 method1592(int arg0, byte arg1) {
        field4202++;
        class154 var2 = (class154) class48.field867.method1617(14366, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 >= -31) {
            method1593((byte) 102, (class28) null);
        }
        class154 var3 = class161.method1091(-32, false, class38.field559, arg0, class144.field2634);
        if (var3 != null) {
            class48.field867.method1615(var3, 114, (long) arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method23(Component arg0) throws Exception {
        field4192++;
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "()V")
    public void method24() throws Exception {
        field4200++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLcj;)V")
    public static final void method1593(byte arg0, class28 arg1) {
        field4188++;
        class215.field3700 = arg1.method132(class62.field1068, (byte) -103);
        class244.field4268 = arg1.method132(class162.field2900, (byte) -117);
        class91.field1756 = arg1.method132(class60.field1021, (byte) -112);
        class102.field1994 = arg1.method132(class164.field2932, (byte) -83);
        class254.field4448 = arg1.method132(class223.field3800, (byte) -122);
        class222.field3792 = arg1.method132(class78.field1542, (byte) -128);
        class112.field2150 = arg1.method132(class107.field2100, (byte) -104);
        class8.field73 = arg1.method132(class62.field1054, (byte) -127);
        class215.field3690 = arg1.method132(class193.field3340, (byte) -99);
        class52.field912 = arg1.method132(class12.field155, (byte) -92);
        class132.field2466 = arg1.method132(class253.field4441, (byte) -88);
        class40.field638 = arg1.method132(class34.field507, (byte) -117);
        class233.field4075 = arg1.method132(class99.field1935, (byte) -106);
        class69.field1377 = arg1.method132(class78.field1551, (byte) -86);
        class94.field1812 = arg1.method132(class114.field2167, (byte) -112);
        class109.field2120 = arg1.method132(class192.field3322, (byte) -128);
        arg1.method132(class69.field1387, (byte) -127);
        if (arg0 != 105) {
            method1585(95, -83, 14, -46, false);
        }
        class11.field134 = arg1.method132(class110.field2128, (byte) -82);
        class11.field128 = arg1.method132(class224.field3840, (byte) -106);
    }
}
