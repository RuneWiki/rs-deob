import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class294 extends class96 {

    @OriginalMember(owner = "client!op", name = "L", descriptor = "I")
    private int field3805 = -1;

    @OriginalMember(owner = "client!op", name = "W", descriptor = "I")
    public static int field3816 = -1;

    @OriginalMember(owner = "client!op", name = "X", descriptor = "I")
    public static int field3817 = -1;

    @OriginalMember(owner = "client!op", name = "K", descriptor = "Lhb;")
    public static class250 field3804 = new class250(58, 11);

    @OriginalMember(owner = "client!op", name = "M", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!op", name = "N", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!op", name = "O", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!op", name = "P", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!op", name = "R", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!op", name = "S", descriptor = "I")
    public int field3812;

    @OriginalMember(owner = "client!op", name = "T", descriptor = "I")
    public int field3813;

    @OriginalMember(owner = "client!op", name = "U", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!op", name = "V", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!op", name = "Y", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!op", name = "Q", descriptor = "[I")
    public int[] field3810;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Ltn;I)Z")
    public static final boolean method1765(class429 arg0, int arg1) {
        ++field3814;
        if (arg1 != 837401932) {
            field3818 = -50;
        }
        if (arg0 == null) {
            return false;
        } else if (!arg0.field5897) {
            return false;
        } else if (!arg0.method2544(class230.field2944, -73)) {
            return false;
        } else if (class359.field4648.method2085((long) arg0.field5910, arg1 ^ -837396579) != null) {
            return false;
        } else {
            return class19.field328.method2085((long) arg0.field5912, arg1 ^ -837396579) == null;
        }
    }

    @OriginalMember(owner = "client!op", name = "e", descriptor = "(B)Z")
    public final boolean method1766(byte arg0) {
        ++field3811;
        if (arg0 != 33) {
            this.method31(57, 34, (class88) null);
        }
        if (this.field3810 != null) {
            return true;
        } else if (this.field3805 >= 0) {
            class136 var2 = ~class19.field326 > -1 ? class136.method958(class458.field6405, this.field3805) : class136.method945(class458.field6405, class19.field326, this.field3805);
            var2.method951();
            this.field3810 = var2.method956();
            this.field3812 = var2.field1837;
            this.field3813 = var2.field1832;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)I")
    public final int method654(int arg0) {
        ++field3806;
        if (arg0 != 0) {
            this.field3813 = 60;
        }
        return this.field3805;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IILbt;)V")
    public final void method31(int arg0, int arg1, class88 arg2) {
        ++field3807;
        if (arg0 == 0) {
            this.field3805 = arg2.method568((byte) 110);
        }
        if (arg1 != -1) {
            method1767(118, (byte) 109);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IB)V")
    public static final void method1767(int arg0, byte arg1) {
        ++field3808;
        if (class65.field821 != arg0) {
            if (~class65.field821 == -1) {
                class489.method2920(false);
            }
            if (arg0 == 40) {
                class164.method1086(14052);
            }
            if (arg0 != 40 && class429.field5884 != null) {
                class429.field5884.method1003(1);
                class429.field5884 = null;
            }
            if (~class65.field821 == -26 || ~class65.field821 == -29) {
                class523.field7751.field2617 = 2;
                class138.field1848.field2617 = 2;
                class270.field3423.field2617 = 2;
                class197.field2545.field2617 = 2;
                class114.field1565.field2617 = 2;
                class511.field7533.field2617 = 2;
                class11.field179.field2617 = 2;
            }
            if (~arg0 == -26 || ~arg0 == -29) {
                class523.field7755 = 1;
                class402.field5387 = 0;
                class141.field1874 = 0;
                class207.field2691 = 0;
                class267.field3384 = 1;
                class398.method2369(30935, true);
                class523.field7751.field2617 = 1;
                class138.field1848.field2617 = 1;
                class270.field3423.field2617 = 1;
                class197.field2545.field2617 = 1;
                class114.field1565.field2617 = 1;
                class511.field7533.field2617 = 1;
                class11.field179.field2617 = 1;
            }
            if (~arg0 == -26 || ~arg0 == -11) {
                class132.method931(true);
            }
            if (arg0 == 5) {
                class431.method2552(class512.field7538, class391.field5121, (byte) -121);
            } else {
                class214.method1362(-1);
            }
            boolean var2 = ~arg0 == -6 || ~arg0 == -11 || arg0 == 28;
            boolean var3 = class65.field821 == 5 || ~class65.field821 == -11 || class65.field821 == 28;
            if (var3 == !var2) {
                if (var2) {
                    class513.field7546 = class18.field317;
                    if (class421.field5647.field7712 != 0) {
                        class180.method1171(false, (byte) 46, class18.field317, class288.field3685, class421.field5647.field7712, 2, 0);
                    } else {
                        class164.method1088(2, (byte) -101);
                    }
                    class187.field2441.method2099(false, 0);
                } else {
                    class164.method1088(2, (byte) -101);
                    class187.field2441.method2099(true, 0);
                }
            }
            if (arg0 == 25 || ~arg0 == -29 || arg0 == 40) {
                class512.field7538.method836();
            }
            if (arg1 >= -46) {
                field3816 = 104;
            }
            class65.field821 = arg0;
        }
    }

    @OriginalMember(owner = "client!op", name = "d", descriptor = "(I)V")
    public final void method655(int arg0) {
        ++field3815;
        super.method655(arg0);
        this.field3810 = null;
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "()V")
    public class294() {
        super(0, false);
    }

    @OriginalMember(owner = "client!op", name = "g", descriptor = "(I)V")
    public static void method1768(int arg0) {
        field3804 = null;
        if (arg0 != -26) {
            field3816 = -8;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(II)[[I")
    public int[][] method36(int arg0, int arg1) {
        ++field3809;
        int[][] var3 = super.field1333.method694(arg1, arg0);
        if (super.field1333.field1423 && this.method1766((byte) 33)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (class477.field6965 != this.field3813 ? this.field3813 * arg1 / class477.field6965 : arg1) * this.field3812;
            if (class269.field3403 == this.field3812) {
                for (int var8 = 0; var8 < class269.field3403; ++var8) {
                    int var9 = this.field3810[var7++];
                    var6[var8] = class60.method339(255, var9) << 4;
                    var5[var8] = class60.method339(var9 >> 4, 4080);
                    var4[var8] = class60.method339(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; ~class269.field3403 < ~var10; ++var10) {
                    int var11 = this.field3812 * var10 / class269.field3403;
                    int var12 = this.field3810[var7 + var11];
                    var6[var10] = class60.method339(4080, var12 << 4);
                    var5[var10] = class60.method339(var12 >> 4, 4080);
                    var4[var10] = class60.method339(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }
}
