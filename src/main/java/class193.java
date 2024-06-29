import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class193 extends class93 {

    @OriginalMember(owner = "client!ue", name = "W", descriptor = "I")
    private int field3764 = 2;

    @OriginalMember(owner = "client!ue", name = "V", descriptor = "I")
    private int field3763 = 5;

    @OriginalMember(owner = "client!ue", name = "T", descriptor = "I")
    private int field3761 = 2048;

    @OriginalMember(owner = "client!ue", name = "hb", descriptor = "I")
    private int field3775 = 25;

    @OriginalMember(owner = "client!ue", name = "jb", descriptor = "I")
    private int field3777 = 5;

    @OriginalMember(owner = "client!ue", name = "db", descriptor = "I")
    private int field3771 = 0;

    @OriginalMember(owner = "client!ue", name = "ib", descriptor = "I")
    private int field3776 = 1;

    @OriginalMember(owner = "client!ue", name = "U", descriptor = "Ljd;")
    public static class92 field3762 = class202.method1325((byte) 90, "nav");

    @OriginalMember(owner = "client!ue", name = "X", descriptor = "I")
    public static int field3765 = 0;

    @OriginalMember(owner = "client!ue", name = "fb", descriptor = "I")
    public static int field3773 = 0;

    @OriginalMember(owner = "client!ue", name = "ab", descriptor = "Ljd;")
    public static class92 field3768 = class202.method1325((byte) 90, "blinken2:");

    @OriginalMember(owner = "client!ue", name = "nb", descriptor = "Ljd;")
    public static class92 field3781 = class202.method1325((byte) 90, "Null");

    @OriginalMember(owner = "client!ue", name = "kb", descriptor = "I")
    public static int field3778 = -1;

    @OriginalMember(owner = "client!ue", name = "S", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!ue", name = "Y", descriptor = "I")
    private int field3766;

    @OriginalMember(owner = "client!ue", name = "Z", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!ue", name = "bb", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!ue", name = "cb", descriptor = "I")
    private int field3770;

    @OriginalMember(owner = "client!ue", name = "eb", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!ue", name = "lb", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!ue", name = "mb", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!ue", name = "ob", descriptor = "I")
    private int field3782;

    @OriginalMember(owner = "client!ue", name = "pb", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!ue", name = "gb", descriptor = "[[I")
    private int[][] field3774;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIII)[I")
    private final int[] method1275(int arg0, int arg1, int arg2, int arg3) {
        ++field3779;
        int[] var5 = new int[arg1];
        for (int var6 = 0; ~arg1 < ~var6; ++var6) {
            var5[var6] = Integer.MAX_VALUE;
        }
        int var7 = this.field3782 + arg3;
        int var8 = this.field3766 + arg0;
        if (var7 > 4096) {
            var7 -= 4096;
        }
        if (var8 > 4096) {
            var8 -= 4096;
        }
        int var9 = this.field3763 * var8 >> 12;
        int var10 = this.field3777 * var7 >> 12;
        int var11 = -1;
        int var12 = -1;
        int var13 = Integer.MAX_VALUE;
        int var14 = Integer.MAX_VALUE;
        int var15 = this.field3777 > 2 ? 2 : this.field3777 + -1;
        int var16 = ~this.field3763 < -3 ? 2 : this.field3763 + -1;
        for (int var17 = -var16; var16 >= var17; ++var17) {
            for (int var25 = -var15; ~var15 <= ~var25; ++var25) {
                int var26 = var10 + var25;
                int var27 = var9 - -var17;
                if (~var26 > -1) {
                    var26 += this.field3777;
                }
                if (~var27 > -1) {
                    var27 += this.field3763;
                }
                if (this.field3777 <= var26) {
                    var26 -= this.field3777;
                }
                if (~this.field3763 >= ~var27) {
                    var27 -= this.field3763;
                }
                int var28 = this.field3763 * var26 + var27;
                int var29 = this.field3774[var28][0];
                int var30 = this.field3774[var28][1];
                int var31 = -var30 + var7;
                int var32 = -var29 + var8;
                if (~var31 > -1) {
                    var31 = -var31;
                }
                if (~var31 < -2049) {
                    var31 = -var31 + 4096;
                }
                if (var32 < 0) {
                    var32 = -var32;
                }
                if (~var32 < -2049) {
                    var32 = -var32 + 4096;
                }
                int var33 = var31 * var31 + var32 * var32 >> 12;
                if (~var33 > ~var13) {
                    if (var12 == -1) {
                        var12 = var28;
                        var14 = var33;
                    } else {
                        var14 = var13;
                        var12 = var11;
                    }
                    var11 = var28;
                    var13 = var33;
                } else if (var11 == var12 && var12 != var28 || ~var14 < ~var33 && var11 != var28) {
                    var12 = var28;
                    var14 = var33;
                }
            }
        }
        int var18 = -this.field3774[var11][0] + var8;
        int var19 = -this.field3774[var12][0] + var8;
        if (~var19 > -1) {
            var19 = -var19;
        }
        int var20 = -this.field3774[var11][1] + var7;
        if (~var20 > -1) {
            var20 = -var20;
        }
        if (var18 < 0) {
            var18 = -var18;
        }
        if (~var20 < -2049) {
            var20 = 4096 - var20;
        }
        if (~var18 < -2049) {
            var18 = -var18 + 4096;
        }
        if (var19 > 2048) {
            var19 = -var19 + 4096;
        }
        int var21 = var7 - this.field3774[var12][1];
        if (var21 < 0) {
            var21 = -var21;
        }
        if (~var21 < -2049) {
            var21 = -var21 + 4096;
        }
        int var22 = this.field3776;
        int var23;
        int var24;
        if (~var22 != -2) {
            if (~var22 == -3) {
                var23 = Math.max(var18, var20);
                var24 = Math.max(var19, var21);
            } else {
                var24 = var19 * var19 + var21 * var21;
                var23 = var18 * var18 + var20 * var20;
            }
        } else {
            var23 = (int) Math.sqrt((double) (var18 * var18 + var20 * var20));
            var24 = (int) Math.sqrt((double) (var19 * var19 + var21 * var21));
        }
        var5[0] = this.field3770 * var23;
        if (~arg1 < -2) {
            var5[1] = this.field3770 * var24;
        }
        if (arg2 != 10954) {
            return null;
        } else {
            return var5;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZBI)V")
    public static final void method1276(int arg0, boolean arg1, byte arg2, int arg3) {
        ++field3783;
        if (arg3 >= 8000 && ~arg3 >= -48001) {
            class20.field492 = arg0;
            if (arg2 <= 121) {
                method1276(78, false, (byte) 58, -104);
            }
            class76.field1583 = arg1;
            class175.field3378 = arg3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "(B)V")
    private final void method1277(byte arg0) {
        ++field3780;
        Random var2 = new Random((long) this.field3771);
        int var3 = 4096 / this.field3777;
        this.field3775 = this.field3777 * this.field3763;
        this.field3774 = new int[this.field3775][2];
        int var4 = 4096 / this.field3763;
        this.field3766 = var4 >> 1;
        this.field3782 = var3 >> 1;
        int var5 = this.field3766 * this.field3761 >> 12;
        int var6 = this.field3782 * this.field3761 >> 12;
        int var7 = -117 / ((20 - arg0) / 32);
        for (int var8 = 0; this.field3777 > var8; ++var8) {
            int var9 = var3 * var8;
            for (int var10 = 0; var10 < this.field3763; ++var10) {
                int var11 = this.field3763 * var8 + var10;
                int var12 = (-4096 + class42.method265(-1, 8192, var2)) * var5 >> 12;
                int var13 = (class42.method265(-1, 8192, var2) + -4096) * var6 >> 12;
                this.field3774[var11][0] = var4 * var10 + var12;
                this.field3774[var11][1] = var13 - -var9;
            }
        }
        this.field3770 = this.field3763 > this.field3777 ? this.field3763 : this.field3777;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(III)V")
    public static final void method1278(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class151.field3003; ++var3) {
            for (int var4 = 0; var4 < class64.field1310; ++var4) {
                for (int var5 = 0; var5 < class93.field1872; ++var5) {
                    class43 var6 = class31.field698[var3][var4][var5];
                    if (var6 != null) {
                        class48 var7 = var6.field963;
                        if (var7 != null && var7.field1040 instanceof class57) {
                            class57 var8 = (class57) var7.field1040;
                            class146.method954(var8, var3, var4, var5, 1, 1);
                            if (var7.field1053 instanceof class57) {
                                class57 var9 = (class57) var7.field1053;
                                class146.method954(var9, var3, var4, var5, 1, 1);
                                class57.method337(var8, var9, 0, 0, 0, false);
                                var7.field1053 = var9.method345(var9.field1209, var9.field1164, arg0, arg1, arg2, false, false);
                            }
                            var7.field1040 = var8.method345(var8.field1209, var8.field1164, arg0, arg1, arg2, false, false);
                        }
                        for (int var10 = 0; var10 < var6.field979; ++var10) {
                            class185 var13 = var6.field966[var10];
                            if (var13 != null && var13.field3501 instanceof class57) {
                                class57 var14 = (class57) var13.field3501;
                                class146.method954(var14, var3, var4, var5, var13.field3489 - var13.field3488 + 1, var13.field3504 - var13.field3486 + 1);
                                var13.field3501 = var14.method345(var14.field1209, var14.field1164, arg0, arg1, arg2, false, false);
                            }
                        }
                        class28 var11 = var6.field969;
                        if (var11 != null && var11.field633 instanceof class57) {
                            class57 var12 = (class57) var11.field633;
                            class168.method1112(var12, var3, var4, var5);
                            var11.field633 = var12.method345(var12.field1209, var12.field1164, arg0, arg1, arg2, false, false);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(B)V")
    public final void method87(byte arg0) {
        if (arg0 != -85) {
            this.method63(-19, (class70) null, -75);
        }
        ++field3767;
        this.method1277((byte) 126);
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
    public class193() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILh;I)V")
    public final void method63(int arg0, class70 arg1, int arg2) {
        if (arg2 == 0) {
            ++field3769;
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (arg0 != 2) {
                        if (~arg0 != -4) {
                            if (arg0 != 4) {
                                if (arg0 != 5) {
                                    if (~arg0 == -7) {
                                        this.field3777 = arg1.method443(255);
                                    }
                                } else {
                                    this.field3763 = arg1.method443(255);
                                }
                            } else {
                                this.field3776 = arg1.method443(255);
                            }
                        } else {
                            this.field3764 = arg1.method443(255);
                        }
                    } else {
                        this.field3761 = arg1.method442(arg2 + -21351);
                    }
                } else {
                    this.field3771 = arg1.method443(255);
                }
            } else {
                this.field3763 = this.field3777 = arg1.method443(255);
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        int var3 = 10 % ((arg1 - 67) / 42);
        int[] var4 = super.field1887.method916(arg0, -37);
        if (super.field1887.field2757) {
            int var5 = class166.field3271[arg0];
            int var6 = this.field3764;
            if (var6 != 2) {
                if (~var6 == -2) {
                    for (int var7 = 0; class150.field2985 > var7; ++var7) {
                        int var8 = class75.field1574[var7];
                        var4[var7] = this.method1275(var8, 2, 10954, var5)[1];
                    }
                } else {
                    for (int var9 = 0; ~var9 > ~class150.field2985; ++var9) {
                        int var10 = class75.field1574[var9];
                        var4[var9] = this.method1275(var10, 1, 10954, var5)[0];
                    }
                }
            } else {
                for (int var11 = 0; ~var11 > ~class150.field2985; ++var11) {
                    int var12 = class75.field1574[var11];
                    int[] var13 = this.method1275(var12, 2, 10954, var5);
                    var4[var11] = var13[1] + -var13[0];
                }
            }
        }
        ++field3772;
        return var4;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lkd;I)V")
    public static final void method1279(class102 arg0, int arg1) {
        ++field3760;
        if (arg1 == 4096) {
            int var2 = -1;
            long var3 = 0L;
            if (~arg0.field2093 == -1) {
                var3 = class124.method831(arg0.field2106, arg0.field2108, arg0.field2102);
            }
            int var5 = 0;
            if (~arg0.field2093 == -2) {
                var3 = class74.method515(arg0.field2106, arg0.field2108, arg0.field2102);
            }
            if (~arg0.field2093 == -3) {
                var3 = class213.method1381(arg0.field2106, arg0.field2108, arg0.field2102);
            }
            if (~arg0.field2093 == -4) {
                var3 = class87.method586(arg0.field2106, arg0.field2108, arg0.field2102);
            }
            int var6 = 0;
            if (~var3 != -1L) {
                var6 = (int) var3 >> 20 & 3;
                var2 = (int) (var3 >>> 32) & Integer.MAX_VALUE;
                var5 = 31 & (int) var3 >> 14;
            }
            arg0.field2086 = var6;
            arg0.field2091 = var2;
            arg0.field2087 = var5;
        }
    }

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "(B)V")
    public static void method1280(byte arg0) {
        field3781 = null;
        field3762 = null;
        field3768 = null;
        if (arg0 != -37) {
            method1278(-38, -10, -110);
        }
    }
}
