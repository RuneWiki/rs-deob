import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class48 extends class82 {

    @OriginalMember(owner = "client!ec", name = "T", descriptor = "I")
    private int field884 = 4096;

    @OriginalMember(owner = "client!ec", name = "jb", descriptor = "I")
    private int field899 = 3216;

    @OriginalMember(owner = "client!ec", name = "X", descriptor = "[I")
    private int[] field887 = new int[3];

    @OriginalMember(owner = "client!ec", name = "hb", descriptor = "I")
    private int field897 = 3216;

    @OriginalMember(owner = "client!ec", name = "W", descriptor = "Ldj;")
    private static class44 field886 = class89.method650(255, "Unexpected loginserver response)3");

    @OriginalMember(owner = "client!ec", name = "U", descriptor = "I")
    public static int field885 = 0;

    @OriginalMember(owner = "client!ec", name = "R", descriptor = "Ldj;")
    public static class44 field882 = field886;

    @OriginalMember(owner = "client!ec", name = "Y", descriptor = "Ldj;")
    private static class44 field888 = class89.method650(255, "Discard");

    @OriginalMember(owner = "client!ec", name = "gb", descriptor = "Ldj;")
    public static class44 field896 = field888;

    @OriginalMember(owner = "client!ec", name = "eb", descriptor = "I")
    public static int field894 = 1;

    @OriginalMember(owner = "client!ec", name = "Z", descriptor = "Ldj;")
    private static class44 field889 = class89.method650(255, "Continue");

    @OriginalMember(owner = "client!ec", name = "kb", descriptor = "[I")
    public static int[] field900 = new int[5];

    @OriginalMember(owner = "client!ec", name = "ib", descriptor = "Ldj;")
    public static class44 field898 = field889;

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!ec", name = "Q", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!ec", name = "ab", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!ec", name = "bb", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!ec", name = "cb", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!ec", name = "db", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!ec", name = "lb", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!ec", name = "mb", descriptor = "Lnf;")
    public static class147 field902;

    @OriginalMember(owner = "client!ec", name = "fb", descriptor = "Lvc;")
    public static class223 field895;

    @OriginalMember(owner = "client!ec", name = "nb", descriptor = "Lvc;")
    public static class223 field903;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I[[I)V")
    public static final void method352(int arg0, int[][] arg1) {
        if (arg0 > -32) {
            field886 = null;
        }
        class108.field1979 = arg1;
        ++field880;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        if (arg0 != 25238) {
            this.method78((byte) 60);
        }
        int[] var3 = super.field1595.method603(true, arg1);
        ++field890;
        if (super.field1595.field1538) {
            int var4 = class64.field1190 * this.field884 >> 12;
            int[] var5 = this.method620(2652, arg1 + -1 & class101.field1850, 0);
            int[] var6 = this.method620(2652, arg1, 0);
            int[] var7 = this.method620(2652, class101.field1850 & arg1 + 1, 0);
            for (int var8 = 0; class129.field2287 > var8; ++var8) {
                int var9 = (var6[var8 - 1 & class53.field943] - var6[class53.field943 & var8 + 1]) * var4 >> 12;
                int var10 = var9 >> 4;
                int var11 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var12 = var11 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (~var10 < -256) {
                    var10 = 255;
                }
                int var13 = class175.field3031[((var12 - -1) * var12 >> 1) + var10] & 255;
                int var14 = var11 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = this.field887[2] * var15 >> 12;
                int var17 = var9 * var13 >> 8;
                int var18 = this.field887[0] * var17 >> 12;
                int var19 = this.field887[1] * var14 >> 12;
                var3[var8] = var16 + var18 - -var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "(I)V")
    public static void method353(int arg0) {
        field896 = null;
        field898 = null;
        field886 = null;
        field902 = null;
        field889 = null;
        field888 = null;
        field895 = null;
        field900 = null;
        if (arg0 == -8211) {
            field903 = null;
            field882 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "(I)V")
    public static final void method354(int arg0) {
        Object var1 = class133.field2377;
        synchronized (class133.field2377) {
            if (arg0 != -32656) {
                return;
            }
            if (class57.field1066 != 0) {
                class57.field1066 = 1;
                try {
                    class133.field2377.wait();
                } catch (InterruptedException var4) {
                }
            }
        }
        ++field892;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V")
    public final void method78(byte arg0) {
        if (arg0 < 95) {
            this.method355(-96);
        }
        ++field901;
        this.method355(86);
    }

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "(I)V")
    private final void method355(int arg0) {
        ++field891;
        double var2 = Math.cos((double) ((float) this.field897 / 4096.0F));
        this.field887[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field899 / 4096.0F)));
        this.field887[1] = (int) (4096.0D * Math.cos((double) ((float) this.field899 / 4096.0F)) * var2);
        this.field887[2] = (int) (4096.0D * Math.sin((double) ((float) this.field897 / 4096.0F)));
        int var4 = this.field887[0] * this.field887[0] >> 12;
        int var5 = 46 % ((30 - arg0) / 54);
        int var6 = this.field887[1] * this.field887[1] >> 12;
        int var7 = this.field887[2] * this.field887[2] >> 12;
        int var8 = (int) (Math.sqrt((double) (var6 + var7 + var4 >> 12)) * 4096.0D);
        if (~var8 != -1) {
            this.field887[0] = (this.field887[0] << 12) / var8;
            this.field887[1] = (this.field887[1] << 12) / var8;
            this.field887[2] = (this.field887[2] << 12) / var8;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BIILtb;I)V")
    public static final void method356(byte arg0, int arg1, int arg2, class202 arg3, int arg4) {
        ++field893;
        if (~class179.field3071 > -401) {
            if (arg3.field3589 != null) {
                arg3 = arg3.method1306(0);
            }
            if (arg3 != null) {
                if (arg0 != 21) {
                    method354(-95);
                }
                if (arg3.field3610) {
                    class44 var5 = arg3.field3624;
                    if (~arg3.field3602 != -1) {
                        var5 = class70.method555(new class44[] { var5, class35.method239(arg3.field3602, true, class96.field1774.field406), class150.field2616, class166.field2869, class199.method1287(arg3.field3602, -1), class189.field3264 }, arg0 ^ -24);
                    }
                    if (~class39.field719 == -2) {
                        class116.method815((long) arg4, class187.field3232, (short) 10, arg2, (byte) -115, class70.method555(new class44[] { class146.field2579, class60.field1114, var5 }, -3), arg1);
                        ++class105.field1917;
                    } else {
                        if (class202.field3614) {
                            if ((2 & class4.field51) == 2) {
                                class116.method815((long) arg4, class114.field2028, (short) 3, arg2, (byte) -115, class70.method555(new class44[] { class201.field3567, class60.field1114, var5 }, -3), arg1);
                                ++class171.field2978;
                                return;
                            }
                        } else {
                            ++class105.field1918;
                            class44[] var6 = arg3.field3618;
                            if (class129.field2309) {
                                var6 = class24.method172(var6, 5);
                            }
                            if (var6 != null) {
                                for (int var7 = 4; var7 >= 0; --var7) {
                                    if (var6[var7] != null && (class5.field60 != 0 || !var6[var7].method330(class19.field332, true))) {
                                        byte var8 = 0;
                                        ++class17.field303;
                                        if (~var7 == -1) {
                                            var8 = 28;
                                        }
                                        if (~var7 == -2) {
                                            var8 = 44;
                                        }
                                        if (var7 == 2) {
                                            var8 = 23;
                                        }
                                        if (~var7 == -4) {
                                            var8 = 9;
                                        }
                                        if (var7 == 4) {
                                            var8 = 43;
                                        }
                                        class116.method815((long) arg4, var6[var7], var8, arg2, (byte) -115, class70.method555(new class44[] { class30.field536, var5 }, -3), arg1);
                                    }
                                }
                            }
                            if (class5.field60 == 0 && var6 != null) {
                                for (int var9 = 4; var9 >= 0; --var9) {
                                    if (var6[var9] != null && var6[var9].method330(class19.field332, true)) {
                                        short var10 = 0;
                                        ++class22.field372;
                                        short var11 = 0;
                                        if (arg3.field3602 > class96.field1774.field406) {
                                            var10 = 2000;
                                        }
                                        if (var9 == 0) {
                                            var11 = 28;
                                        }
                                        if (var9 == 1) {
                                            var11 = 44;
                                        }
                                        if (var9 == 2) {
                                            var11 = 23;
                                        }
                                        if (~var9 == -4) {
                                            var11 = 9;
                                        }
                                        if (~var9 == -5) {
                                            var11 = 43;
                                        }
                                        if (~var11 != -1) {
                                            var11 += var10;
                                        }
                                        class116.method815((long) arg4, var6[var9], var11, arg2, (byte) -115, class70.method555(new class44[] { class30.field536, var5 }, -3), arg1);
                                    }
                                }
                            }
                            class116.method815((long) arg4, class41.field776, (short) 1002, arg2, (byte) -115, class70.method555(new class44[] { class30.field536, var5 }, -3), arg1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
    public class48() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        if (arg2 != 68) {
            field883 = 4;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field897 = arg0.method500(arg2 + -19);
                }
            } else {
                this.field899 = arg0.method500(arg2 ^ 120);
            }
        } else {
            this.field884 = arg0.method500(arg2 + 55);
        }
        ++field881;
    }
}
