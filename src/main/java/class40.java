import java.awt.Component;
import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class40 extends class228 {

    @OriginalMember(owner = "client!ok", name = "bb", descriptor = "I")
    private int field681 = 0;

    @OriginalMember(owner = "client!ok", name = "ab", descriptor = "I")
    private int field680 = 0;

    @OriginalMember(owner = "client!ok", name = "kb", descriptor = "I")
    private int field690 = 0;

    @OriginalMember(owner = "client!ok", name = "V", descriptor = "Loa;")
    public static class99 field675 = class221.method1463(2844, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!ok", name = "S", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!ok", name = "T", descriptor = "I")
    private int field673;

    @OriginalMember(owner = "client!ok", name = "U", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!ok", name = "W", descriptor = "I")
    private int field676;

    @OriginalMember(owner = "client!ok", name = "X", descriptor = "I")
    private int field677;

    @OriginalMember(owner = "client!ok", name = "Y", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!ok", name = "Z", descriptor = "I")
    private int field679;

    @OriginalMember(owner = "client!ok", name = "cb", descriptor = "I")
    private int field682;

    @OriginalMember(owner = "client!ok", name = "db", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!ok", name = "eb", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!ok", name = "fb", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!ok", name = "gb", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!ok", name = "hb", descriptor = "I")
    private int field687;

    @OriginalMember(owner = "client!ok", name = "ib", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!ok", name = "jb", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIII)V")
    public static final void method306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field674;
        int var9 = arg2 + 1;
        class175.method1174(class124.field2177[arg2], arg5, arg4 + -9, arg3, arg1);
        int var8 = arg0 - 1;
        class175.method1174(class124.field2177[arg0], arg5, -7, arg3, arg1);
        if (arg4 != 2) {
            field675 = null;
        }
        for (int var6 = var9; ~var8 <= ~var6; ++var6) {
            int[] var7 = class124.field2177[var6];
            var7[arg3] = var7[arg1] = arg5;
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V")
    public class40() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIII)V")
    private final void method307(int arg0, int arg1, int arg2, int arg3) {
        ++field683;
        int var5 = ~arg2 >= -2049 ? (4096 - -arg0) * arg2 >> 12 : -(arg0 * arg2 >> 12) + arg2 - -arg0;
        int var6 = -6 / ((arg1 - -40) / 57);
        if (var5 <= 0) {
            this.field677 = this.field673 = this.field687 = arg2;
        } else {
            int var7 = arg3 * 6;
            int var8 = var7 >> 12;
            int var9 = arg2 - (-arg2 - -var5);
            int var10 = (-var9 + var5 << 12) / var5;
            int var11 = -(var8 << 12) + var7;
            int var13 = var10 * var5 >> 12;
            int var14 = var11 * var13 >> 12;
            int var15 = var9 + var14;
            int var16 = -var14 + var5;
            if (var8 != 0) {
                if (~var8 != -2) {
                    if (var8 != 2) {
                        if (var8 != 3) {
                            if (var8 != 4) {
                                if (var8 == 5) {
                                    this.field673 = var9;
                                    this.field677 = var5;
                                    this.field687 = var16;
                                }
                            } else {
                                this.field673 = var9;
                                this.field677 = var15;
                                this.field687 = var5;
                            }
                        } else {
                            this.field673 = var16;
                            this.field687 = var5;
                            this.field677 = var9;
                        }
                    } else {
                        this.field677 = var9;
                        this.field687 = var15;
                        this.field673 = var5;
                    }
                } else {
                    this.field673 = var5;
                    this.field677 = var16;
                    this.field687 = var9;
                }
            } else {
                this.field687 = var9;
                this.field677 = var5;
                this.field673 = var15;
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILik;I)V")
    public final void method18(int arg0, class261 arg1, int arg2) {
        ++field686;
        if (arg2 != -7618) {
            this.field677 = 85;
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field681 = (arg1.method1706(10819) << 12) / 100;
                }
            } else {
                this.field680 = (arg1.method1706(arg2 + 18437) << 12) / 100;
            }
        } else {
            this.field690 = arg1.method1751(128);
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(IIII)V")
    private final void method308(int arg0, int arg1, int arg2, int arg3) {
        ++field684;
        int var5 = ~arg3 <= ~arg1 ? arg3 : arg1;
        int var6 = ~arg2 < ~var5 ? arg2 : var5;
        if (arg0 != 4096) {
            this.method18(-28, (class261) null, 37);
        }
        int var7 = ~arg1 > ~arg3 ? arg1 : arg3;
        int var8 = ~var7 >= ~arg2 ? var7 : arg2;
        int var9 = -var8 + var6;
        if (var9 > 0) {
            int var10 = (-arg1 + var6 << 12) / var9;
            int var11 = (var6 - arg3 << 12) / var9;
            int var12 = (-arg2 + var6 << 12) / var9;
            if (arg1 != var6) {
                if (arg3 == var6) {
                    this.field682 = arg2 == var8 ? var10 + 4096 : -var12 + 12288;
                } else {
                    this.field682 = arg1 == var8 ? var11 + 12288 : -var10 + 20480;
                }
            } else {
                this.field682 = ~arg3 != ~var8 ? -var11 + 4096 : 20480 - -var12;
            }
            this.field682 /= 6;
        } else {
            this.field682 = 0;
        }
        this.field679 = (var6 + var8) / 2;
        if (this.field679 > 0 && this.field679 < 4096) {
            this.field676 = (var9 << 12) / (~this.field679 < -2049 ? 8192 - this.field679 * 2 : this.field679 * 2);
        } else {
            this.field676 = 0;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IILjava/awt/Component;I)Ldb;")
    public static final class17 method309(int arg0, int arg1, Component arg2, int arg3) {
        ++field689;
        try {
            Class var4 = Class.forName("rj");
            if (arg3 <= 2) {
                method311(101);
            }
            class17 var5 = (class17) var4.newInstance();
            var5.method64(arg1, (byte) 65, arg2, arg0);
            return var5;
        } catch (Throwable var7) {
            class52 var6 = new class52();
            var6.method64(arg1, (byte) 121, arg2, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)V")
    public static void method310(int arg0) {
        int var1 = -83 % ((-22 - arg0) / 62);
        field675 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)[[I")
    public final int[][] method19(byte arg0, int arg1) {
        int[][] var3 = super.field3948.method1797(arg1, (byte) -124);
        if (arg0 != -27) {
            this.field677 = -50;
        }
        if (super.field3948.field4791) {
            int[][] var4 = this.method1502(255, arg1, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class234.field4046; ++var11) {
                this.method308(arg0 + 4123, var6[var11], var7[var11], var5[var11]);
                this.field682 += this.field690;
                this.field679 += this.field681;
                this.field676 += this.field680;
                while (~this.field682 > -1) {
                    this.field682 += 4096;
                }
                if (this.field679 < 0) {
                    this.field679 = 0;
                }
                while (this.field682 > 4096) {
                    this.field682 -= 4096;
                }
                if (this.field679 > 4096) {
                    this.field679 = 4096;
                }
                if (~this.field676 > -1) {
                    this.field676 = 0;
                }
                if (~this.field676 < -4097) {
                    this.field676 = 4096;
                }
                this.method307(this.field676, arg0 ^ 119, this.field679, this.field682);
                var8[var11] = this.field677;
                var9[var11] = this.field673;
                var10[var11] = this.field687;
            }
        }
        ++field688;
        return var3;
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(I)V")
    public static final void method311(int arg0) {
        Container var1;
        if (class253.field4377 == null) {
            if (class75.field1281 == null) {
                var1 = class24.field368.field1493;
            } else {
                var1 = class75.field1281;
            }
        } else {
            var1 = class253.field4377;
        }
        class254.field4390 = var1.getSize().width;
        class280.field4901 = var1.getSize().height;
        if (class75.field1281 == var1) {
            Insets var2 = class75.field1281.getInsets();
            class280.field4901 -= var2.top + var2.bottom;
            class254.field4390 -= var2.right + var2.left;
        }
        if (class143.method972(-3) < 2) {
            class199.field3458 = 765;
            class252.field4368 = (class254.field4390 + -765) / 2;
            class2.field16 = 0;
            class24.field373 = 503;
        } else {
            class24.field373 = class280.field4901;
            class199.field3458 = class254.field4390;
            class252.field4368 = 0;
            class2.field16 = 0;
        }
        int var3 = -88 % ((arg0 - -30) / 52);
        class166.field2951.setSize(class199.field3458, class24.field373);
        ++field678;
        if (class75.field1281 == var1) {
            Insets var4 = class75.field1281.getInsets();
            class166.field2951.setLocation(class252.field4368 + var4.left, var4.top - -class2.field16);
        } else {
            class166.field2951.setLocation(class252.field4368, class2.field16);
        }
        if (class9.field75 != -1) {
            class43.method326(-32039, true);
        }
        class122.method810((byte) 70);
    }
}
