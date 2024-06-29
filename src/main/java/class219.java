import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class219 extends class135 {

    @OriginalMember(owner = "client!of", name = "hb", descriptor = "I")
    private int field3931 = 3216;

    @OriginalMember(owner = "client!of", name = "lb", descriptor = "I")
    private int field3935 = 3216;

    @OriginalMember(owner = "client!of", name = "cb", descriptor = "[I")
    private int[] field3926 = new int[3];

    @OriginalMember(owner = "client!of", name = "nb", descriptor = "I")
    private int field3937 = 4096;

    @OriginalMember(owner = "client!of", name = "W", descriptor = "S")
    public static short field3920 = 1;

    @OriginalMember(owner = "client!of", name = "V", descriptor = "Z")
    public static boolean field3919 = true;

    @OriginalMember(owner = "client!of", name = "bb", descriptor = "Lqj;")
    public static class196 field3925 = class80.method502("Angreifen", -48);

    @OriginalMember(owner = "client!of", name = "ab", descriptor = "Lqj;")
    public static class196 field3924 = class80.method502("event_opbase", -48);

    @OriginalMember(owner = "client!of", name = "mb", descriptor = "[I")
    public static int[] field3936 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!of", name = "jb", descriptor = "I")
    public static int field3933 = 0;

    @OriginalMember(owner = "client!of", name = "X", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!of", name = "Y", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!of", name = "db", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!of", name = "eb", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!of", name = "fb", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!of", name = "gb", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!of", name = "ib", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!of", name = "kb", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!of", name = "pb", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!of", name = "ob", descriptor = "Lbk;")
    public static class136 field3938;

    @OriginalMember(owner = "client!of", name = "Z", descriptor = "Lec;")
    public static class178 field3923;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(Z)V")
    public static final void method1492(boolean arg0) {
        if (arg0) {
            method1493(false);
        }
        ++field3927;
        while (true) {
            class243 var1 = class243.field4323;
            class57 var2;
            synchronized (class243.field4323) {
                var2 = (class57) class1.field4.method1665(3072);
            }
            if (var2 == null) {
                return;
            }
            var2.field760.method592(false, (int) var2.field1850, var2.field774, -101, var2.field759);
        }
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(Z)V")
    public static void method1493(boolean arg0) {
        field3938 = null;
        field3936 = null;
        field3923 = null;
        field3924 = null;
        if (arg0) {
            method1494(90, (byte) -75);
        }
        field3925 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)I")
    public static final int method1494(int arg0, byte arg1) {
        ++field3930;
        if (arg1 >= -66) {
            field3938 = null;
        }
        return arg0 & 127;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
    public class219() {
        super(1, true);
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(B)V")
    public final void method102(byte arg0) {
        this.method1495(36);
        ++field3939;
        if (arg0 != -85) {
            field3936 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(I)V")
    private final void method1495(int arg0) {
        ++field3929;
        double var2 = Math.cos((double) ((float) this.field3935 / 4096.0F));
        this.field3926[0] = (int) (var2 * Math.sin((double) ((float) this.field3931 / 4096.0F)) * 4096.0D);
        this.field3926[1] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field3931 / 4096.0F)));
        this.field3926[2] = (int) (Math.sin((double) ((float) this.field3935 / 4096.0F)) * 4096.0D);
        int var4 = this.field3926[1] * this.field3926[1] >> 12;
        if (arg0 < 2) {
            field3924 = null;
        }
        int var5 = this.field3926[0] * this.field3926[0] >> 12;
        int var6 = this.field3926[2] * this.field3926[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var5 + var6 + var4 >> 12)));
        if (var7 != 0) {
            this.field3926[2] = (this.field3926[2] << 12) / var7;
            this.field3926[1] = (this.field3926[1] << 12) / var7;
            this.field3926[0] = (this.field3926[0] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIIIIILpe;IZJ)Z")
    public static final boolean method1496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class258 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class42.field480 == class145.field2265;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; ++var15) {
            for (int var24 = arg2; var24 < arg2 + arg4; ++var24) {
                if (var15 < 0 || var24 < 0 || var15 >= class23.field293 || var24 >= class110.field1566) {
                    return false;
                }
                class61 var25 = class249.field4410[arg0][var15][var24];
                if (var25 != null && var25.field836 >= 5) {
                    return false;
                }
            }
        }
        class200 var16 = new class200();
        var16.field3554 = arg11;
        var16.field3553 = arg0;
        var16.field3547 = arg5;
        var16.field3551 = arg6;
        var16.field3546 = arg7;
        var16.field3544 = arg8;
        var16.field3558 = arg9;
        var16.field3549 = arg1;
        var16.field3548 = arg2;
        var16.field3539 = arg1 + arg3 - 1;
        var16.field3556 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; ++var17) {
            for (int var20 = arg2; var20 < arg2 + arg4; ++var20) {
                int var21 = 0;
                if (var17 > arg1) {
                    ++var21;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; --var22) {
                    if (class249.field4410[var22][var17][var20] == null) {
                        class249.field4410[var22][var17][var20] = new class61(var22, var17, var20);
                    }
                }
                class61 var23 = class249.field4410[arg0][var17][var20];
                var23.field823[var23.field836] = var16;
                var23.field820[var23.field836] = var21;
                var23.field831 |= var21;
                ++var23.field836;
                if (var13 && class235.field4183[var17][var20] != 0) {
                    var14 = class235.field4183[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; ++var18) {
                for (int var19 = arg2; var19 < arg2 + arg4; ++var19) {
                    if (class235.field4183[var18][var19] == 0) {
                        class235.field4183[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class229.field4085[class150.field2403++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IZ)[I")
    public final int[] method99(int arg0, boolean arg1) {
        ++field3934;
        int[] var3 = super.field1954.method110(arg0, 101);
        if (super.field1954.field244) {
            int var4 = class17.field186 * this.field3937 >> 12;
            int[] var5 = this.method819(-97, 0, arg0 + -1 & class53.field667);
            int[] var6 = this.method819(-101, 0, arg0);
            int[] var7 = this.method819(-124, 0, arg0 + 1 & class53.field667);
            for (int var8 = 0; ~class131.field1862 < ~var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class61.field816] + -var6[class61.field816 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                int var12 = var9 >> 4;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = 255 & class132.field1886[((var12 + 1) * var12 >> 1) + var11];
                int var14 = var13 * 4096 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field3926[2] * var14 >> 12;
                int var18 = this.field3926[1] * var16 >> 12;
                int var19 = this.field3926[0] * var15 >> 12;
                var3[var8] = var18 + var19 + var17;
            }
        }
        if (arg1) {
            this.method102((byte) 22);
        }
        return var3;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field3935 = arg0.method318(true);
                }
            } else {
                this.field3931 = arg0.method318(true);
            }
        } else {
            this.field3937 = arg0.method318(true);
        }
        if (arg2 != -16231) {
            field3923 = null;
        }
        ++field3921;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IJII)Z")
    public static final boolean method1497(int arg0, long arg1, int arg2, int arg3) {
        ++field3928;
        int var5 = ((int) arg1 & 519670) >> 14;
        int var6 = (int) arg1 >> 20 & 3;
        int var7 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
        if (~var5 != -11 && var5 != 11 && var5 != 22) {
            class194.method1277(class102.field1477.field2102[0], 2, true, 0, arg3, var6, arg2, class102.field1477.field2046[0], var5 + 1, 0, 63, 0);
        } else {
            class145 var8 = class83.method521(var7, (byte) 105);
            int var9;
            int var10;
            if (var6 != 0 && var6 != 2) {
                var9 = var8.field2278;
                var10 = var8.field2263;
            } else {
                var10 = var8.field2278;
                var9 = var8.field2263;
            }
            int var11 = var8.field2254;
            if (var6 != 0) {
                var11 = (15 & var11 << var6) - -(var11 >> -var6 + 4);
            }
            class194.method1277(class102.field1477.field2102[0], 2, true, var10, arg3, 0, arg2, class102.field1477.field2046[0], 0, var11, 103, var9);
        }
        class96.field1409 = 0;
        if (arg0 != 22978) {
            return false;
        } else {
            class223.field4002 = class61.field812;
            class27.field342 = 2;
            class27.field343 = class28.field350;
            return true;
        }
    }
}
