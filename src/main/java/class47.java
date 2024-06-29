import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class47 extends class325 {

    @OriginalMember(owner = "client!bt", name = "H", descriptor = "I")
    private int field707 = 0;

    @OriginalMember(owner = "client!bt", name = "S", descriptor = "I")
    private int field718 = 0;

    @OriginalMember(owner = "client!bt", name = "T", descriptor = "I")
    private int field719 = 0;

    @OriginalMember(owner = "client!bt", name = "C", descriptor = "I")
    private int field702;

    @OriginalMember(owner = "client!bt", name = "D", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!bt", name = "E", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!bt", name = "F", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!bt", name = "G", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!bt", name = "I", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!bt", name = "J", descriptor = "I")
    private int field709;

    @OriginalMember(owner = "client!bt", name = "K", descriptor = "I")
    private int field710;

    @OriginalMember(owner = "client!bt", name = "L", descriptor = "I")
    private int field711;

    @OriginalMember(owner = "client!bt", name = "N", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!bt", name = "O", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!bt", name = "P", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!bt", name = "Q", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!bt", name = "R", descriptor = "I")
    private int field717;

    @OriginalMember(owner = "client!bt", name = "U", descriptor = "I")
    private int field720;

    @OriginalMember(owner = "client!bt", name = "V", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!bt", name = "M", descriptor = "[I")
    public static int[] field712;

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "()V", line = 6)
    public class47() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)V", line = 9)
    public static final void method358(int arg0, int arg1) {
        if (arg0 <= 36) {
            method362((byte) -65);
        }
        ++field705;
        class150 var2 = (class150) class507.field7007.method3953((long) arg1, 14);
        if (var2 != null) {
            var2.field2088 = !var2.field2088;
            var2.field2082.method2722(var2.field2088, -90);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(BIIII)V", line = 28)
    public static final void method359(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field706;
        class16 var5 = class94.method753(8, 13175, (long) arg2);
        if (arg0 > -44) {
            field712 = null;
        }
        var5.method119(-98);
        var5.field244 = arg4;
        var5.field245 = arg3;
        var5.field237 = arg1;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IB)[[I", line = 45)
    public final int[][] method360(int arg0, byte arg1) {
        ++field716;
        int[][] var3 = super.field4733.method1251((byte) 60, arg0);
        if (super.field4733.field2369) {
            int[][] var4 = this.method2063(0, 1, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class261.field3874 > var11; ++var11) {
                this.method367(var7[var11], var5[var11], var6[var11], true);
                this.field702 += this.field719;
                this.field720 += this.field718;
                this.field717 += this.field707;
                while (~this.field702 > -1) {
                    this.field702 += 4096;
                }
                if (~this.field720 > -1) {
                    this.field720 = 0;
                }
                while (~this.field702 < -4097) {
                    this.field702 -= 4096;
                }
                if (~this.field717 > -1) {
                    this.field717 = 0;
                }
                if (~this.field720 < -4097) {
                    this.field720 = 4096;
                }
                if (this.field717 > 4096) {
                    this.field717 = 4096;
                }
                this.method364(this.field702, this.field720, (byte) 119, this.field717);
                var8[var11] = this.field709;
                var9[var11] = this.field711;
                var10[var11] = this.field710;
            }
        }
        return arg1 != -9 ? null : var3;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 116)
    public static final void method361(String arg0, int arg1) {
        ++field703;
        if (!arg0.equals("")) {
            ++class104.field1433;
            class267 var2 = class545.method3099((byte) 61, class269.field3966, class52.field745);
            var2.field3938.method2380(65280, class469.method2769(arg0, (byte) 88));
            if (arg1 > -71) {
                method366(-36);
            }
            var2.field3938.method2349(58, arg0);
            class617.method3392(var2, true);
        }
    }

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "(B)V", line = 137)
    public static void method362(byte arg0) {
        if (arg0 < -100) {
            field712 = null;
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(Z)Z", line = 150)
    public static final boolean method363(boolean arg0) {
        ++field713;
        if (!arg0) {
            field712 = null;
        }
        try {
            class129 var1 = new class129();
            byte[] var2 = var1.method1041(class13.field193, 10);
            class620.method3407(0, var2);
            return true;
        } catch (Exception var3) {
            return false;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIBI)V", line = 175)
    private final void method364(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 < 71) {
            method361((String) null, -48);
        }
        ++field714;
        int var5 = arg3 <= 2048 ? (arg1 + 4096) * arg3 >> 12 : -(arg1 * arg3 >> 12) + arg3 - -arg1;
        if (~var5 < -1) {
            int var6 = arg0 * 6;
            int var7 = -var5 + arg3 + arg3;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = var5 - var13;
            if (var9 == 0) {
                this.field710 = var7;
                this.field711 = var14;
                this.field709 = var5;
                return;
            }
            if (~var9 == -2) {
                this.field711 = var5;
                this.field709 = var15;
                this.field710 = var7;
                return;
            }
            if (~var9 == -3) {
                this.field709 = var7;
                this.field710 = var14;
                this.field711 = var5;
                return;
            }
            if (~var9 == -4) {
                this.field711 = var15;
                this.field710 = var5;
                this.field709 = var7;
                return;
            }
            if (~var9 == -5) {
                this.field710 = var5;
                this.field711 = var7;
                this.field709 = var14;
                return;
            }
            if (var9 == 5) {
                this.field710 = var15;
                this.field711 = var7;
                this.field709 = var5;
                return;
            }
        } else {
            this.field709 = this.field711 = this.field710 = arg3;
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V", line = 285)
    public static final void method365(int arg0) {
        ++field708;
        if (arg0 != 1) {
            method359((byte) -116, -20, -62, -105, 43);
        }
        class617.field8329.method1552(30);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljp;IB)V", line = 296)
    public final void method95(class376 arg0, int arg1, byte arg2) {
        ++field704;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field707 = (arg0.method2387((byte) 28) << 12) / 100;
                }
            } else {
                this.field718 = (arg0.method2387((byte) 54) << 12) / 100;
            }
        } else {
            this.field719 = arg0.method2355(3);
        }
        if (arg2 >= -41) {
            this.field709 = 74;
        }
    }

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "(I)Lkf;", line = 338)
    public static final class267 method366(int arg0) {
        ++field715;
        if (arg0 != -2) {
            return null;
        } else {
            return class700.field9831 == 0 ? new class267() : class350.field5139[--class700.field9831];
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIZ)V", line = 353)
    private final void method367(int arg0, int arg1, int arg2, boolean arg3) {
        ++field721;
        int var5 = ~arg2 <= ~arg1 ? arg2 : arg1;
        if (!arg3) {
            method359((byte) -114, -105, 3, 112, 29);
        }
        int var6 = arg2 <= arg1 ? arg2 : arg1;
        int var7 = arg0 > var5 ? arg0 : var5;
        int var8 = ~var6 < ~arg0 ? arg0 : var6;
        int var9 = -var8 + var7;
        this.field717 = (var7 + var8) / 2;
        if (~var9 >= -1) {
            this.field702 = 0;
        } else {
            int var10 = (var7 - arg1 << 12) / var9;
            int var11 = (var7 - arg2 << 12) / var9;
            int var12 = (var7 - arg0 << 12) / var9;
            if (arg1 != var7) {
                if (~arg2 != ~var7) {
                    this.field702 = ~arg1 == ~var8 ? var11 + 12288 : -var10 + 20480;
                } else {
                    this.field702 = arg0 == var8 ? var10 + 4096 : -var12 + 12288;
                }
            } else {
                this.field702 = arg2 != var8 ? 4096 - var11 : var12 + 20480;
            }
            this.field702 /= 6;
        }
        if (~this.field717 < -1 && this.field717 < 4096) {
            this.field720 = (var9 << 12) / (this.field717 <= 2048 ? this.field717 * 2 : -(this.field717 * 2) + 8192);
        } else {
            this.field720 = 0;
        }
    }
}
