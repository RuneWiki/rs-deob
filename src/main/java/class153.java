import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class153 extends class264 {

    @OriginalMember(owner = "client!ni", name = "P", descriptor = "I")
    private int field2686 = 3216;

    @OriginalMember(owner = "client!ni", name = "N", descriptor = "I")
    private int field2684 = 4096;

    @OriginalMember(owner = "client!ni", name = "V", descriptor = "[I")
    private int[] field2692 = new int[3];

    @OriginalMember(owner = "client!ni", name = "T", descriptor = "I")
    private int field2690 = 3216;

    @OriginalMember(owner = "client!ni", name = "M", descriptor = "Lcf;")
    public static class93 field2683 = null;

    @OriginalMember(owner = "client!ni", name = "S", descriptor = "I")
    public static int field2689 = 0;

    @OriginalMember(owner = "client!ni", name = "X", descriptor = "[Lak;")
    public static class138[] field2694 = new class138[14];

    @OriginalMember(owner = "client!ni", name = "J", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!ni", name = "K", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!ni", name = "L", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!ni", name = "O", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!ni", name = "Q", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!ni", name = "R", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!ni", name = "U", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!ni", name = "W", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILee;)V")
    public static final void method1095(int arg0, class280 arg1) {
        if (arg0 != -10052) {
            method1095(-1, (class280) null);
        }
        ++field2681;
        while (true) {
            while (~arg1.field5027 > ~arg1.field5011.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method1907(16832) == 1) {
                    var2 = true;
                    var3 = arg1.method1907(16832);
                    var4 = arg1.method1907(16832);
                }
                int var5 = arg1.method1907(16832);
                int var6 = arg1.method1907(16832);
                int var7 = var5 * 64 + -class251.field4518;
                int var8 = -(var6 * 64) - (-class76.field1404 - (class183.field3373 + -1));
                if (~var7 <= -1 && ~(var8 - 63) <= -1 && var7 + 63 < class148.field2599 && var8 < class183.field3373) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; ++var11) {
                        for (int var12 = 0; ~var12 > -65; ++var12) {
                            if (!var2 || ~(var3 * 8) >= ~var11 && var3 * 8 + 8 > var11 && ~var12 <= ~(var4 * 8) && var4 * 8 + 8 > var12) {
                                int var13 = arg1.method1907(16832);
                                if (~var13 != -1) {
                                    if ((var13 & 1) == 1) {
                                        int var14 = arg1.method1907(arg0 ^ -26244);
                                        if (class257.field4632[var10][var9] == null) {
                                            class257.field4632[var10][var9] = new byte[4096];
                                        }
                                        class257.field4632[var10][var9][(-var12 + 63 << 6) + var11] = (byte) var14;
                                    }
                                    if (~(var13 & 2) == -3) {
                                        int var15 = arg1.method1893((byte) -122);
                                        if (class69.field1263[var10][var9] == null) {
                                            class69.field1263[var10][var9] = new int[4096];
                                        }
                                        class69.field1263[var10][var9][(-var12 + 63 << 6) + var11] = var15;
                                    }
                                    if ((4 & var13) == 4) {
                                        int var16 = arg1.method1893((byte) 66);
                                        if (class151.field2652[var10][var9] == null) {
                                            class151.field2652[var10][var9] = new int[4096];
                                        }
                                        --var16;
                                        class240 var17 = class34.method197(-126, var16);
                                        if (var17.field4275 != null) {
                                            var17 = var17.method1631(arg0 + 10052);
                                            if (var17 == null || var17.field4272 == -1) {
                                                continue;
                                            }
                                        }
                                        class151.field2652[var10][var9][(63 - var12 << 6) + var11] = var17.field4318 + 1;
                                        class163 var18 = new class163();
                                        var18.field2880 = var7;
                                        var18.field2883 = var17.field4272;
                                        var18.field2877 = var8;
                                        class5.field63.method1152((byte) -5, var18);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; (!var2 ? 4096 : 64) > var19; ++var19) {
                        int var20 = arg1.method1907(16832);
                        if (var20 != 0) {
                            if ((var20 & 1) == 1) {
                                ++arg1.field5027;
                            }
                            if (~(2 & var20) == -3) {
                                arg1.field5027 += 2;
                            }
                            if ((var20 & 4) == 4) {
                                arg1.field5027 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
    public final void method64(int arg0) {
        if (arg0 != -3) {
            this.field2692 = null;
        }
        this.method1098(4096);
        ++field2680;
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
    public class153() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(III)Lj;")
    public static final class165 method1096(int arg0, int arg1, int arg2) {
        int var3 = -91 % ((arg2 - 10) / 43);
        ++field2688;
        class165 var4 = new class165();
        for (class157 var5 = (class157) class85.field1538.method1151(115); var5 != null; var5 = (class157) class85.field1538.method1159(108)) {
            if (var5.field2794 && var5.method1124(arg1, 0, arg0)) {
                var4.method1190(64, var5);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IB)[I")
    public final int[] method22(int arg0, byte arg1) {
        if (arg1 > -83) {
            method1096(-127, 50, 20);
        }
        int[] var3 = super.field4716.method532((byte) 64, arg0);
        ++field2685;
        if (super.field4716.field1424) {
            int var4 = class150.field2635 * this.field2684 >> 12;
            int[] var5 = this.method1767(0, class53.field881 & arg0 + -1, 21654);
            int[] var6 = this.method1767(0, arg0, 21654);
            int[] var7 = this.method1767(0, class53.field881 & arg0 + 1, 21654);
            for (int var8 = 0; class176.field3060 > var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class55.field910] + -var6[var8 + 1 & class55.field910]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class11.field151[var11 - -((var12 + 1) * var12 >> 1)] & 255;
                int var14 = var13 * 4096 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = var10 * var13 >> 8;
                int var17 = this.field2692[0] * var16 >> 12;
                int var18 = this.field2692[2] * var14 >> 12;
                int var19 = this.field2692[1] * var15 >> 12;
                var3[var8] = var17 + var19 + var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lta;Lta;I)V")
    public static final void method1097(class254 arg0, class254 arg1, int arg2) {
        ++field2691;
        if (arg1.field4595 != null) {
            arg1.method1728(arg2 + 28167);
        }
        arg1.field4604 = arg0.field4604;
        arg1.field4595 = arg0;
        if (arg2 != 2) {
            method1095(-99, (class280) null);
        }
        arg1.field4595.field4604 = arg1;
        arg1.field4604.field4595 = arg1;
    }

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "(I)V")
    private final void method1098(int arg0) {
        ++field2682;
        double var2 = Math.cos((double) ((float) this.field2686 / 4096.0F));
        this.field2692[0] = (int) (Math.sin((double) ((float) this.field2690 / 4096.0F)) * var2 * (double) arg0);
        this.field2692[1] = (int) (var2 * Math.cos((double) ((float) this.field2690 / 4096.0F)) * 4096.0D);
        this.field2692[2] = (int) (Math.sin((double) ((float) this.field2686 / 4096.0F)) * 4096.0D);
        int var4 = this.field2692[1] * this.field2692[1] >> 12;
        int var5 = this.field2692[0] * this.field2692[0] >> 12;
        int var6 = this.field2692[2] * this.field2692[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var5 + var6 >> 12)) * 4096.0D);
        if (~var7 != -1) {
            this.field2692[0] = (this.field2692[0] << 12) / var7;
            this.field2692[1] = (this.field2692[1] << 12) / var7;
            this.field2692[2] = (this.field2692[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(B)V")
    public static void method1099(byte arg0) {
        int var1 = -21 % ((-49 - arg0) / 51);
        field2694 = null;
        field2683 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field2686 = arg2.method1891(-125);
                }
            } else {
                this.field2690 = arg2.method1891(-127);
            }
        } else {
            this.field2684 = arg2.method1891(-111);
        }
        if (arg0 > 11) {
            ++field2687;
        }
    }
}
