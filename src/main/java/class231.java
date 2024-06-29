import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class231 extends class242 {

    @OriginalMember(owner = "client!bg", name = "bb", descriptor = "I")
    private int field4023 = -1;

    @OriginalMember(owner = "client!bg", name = "ib", descriptor = "Lp;")
    public static class280 field4030 = null;

    @OriginalMember(owner = "client!bg", name = "R", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!bg", name = "S", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!bg", name = "T", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!bg", name = "U", descriptor = "I")
    private int field4016;

    @OriginalMember(owner = "client!bg", name = "V", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!bg", name = "W", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!bg", name = "X", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!bg", name = "Y", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!bg", name = "Z", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!bg", name = "cb", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!bg", name = "db", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!bg", name = "eb", descriptor = "I")
    private int field4026;

    @OriginalMember(owner = "client!bg", name = "fb", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!bg", name = "gb", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!bg", name = "hb", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!bg", name = "ab", descriptor = "[I")
    private int[] field4022;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
    public static final void method1553(byte arg0) {
        ++field4014;
        class104.field1731.method1485((byte) -77);
        class101.field1644.method1485((byte) -98);
        class232.field4046.method1485((byte) -81);
        if (arg0 <= 24) {
            field4015 = -77;
        }
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)V")
    public final void method1091(int arg0) {
        ++field4029;
        super.method1091(arg0 + arg0);
        this.field4022 = null;
    }

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)I")
    public final int method1554(int arg0) {
        ++field4018;
        if (arg0 <= 22) {
            this.method1557(14);
        }
        return this.field4023;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V")
    public static void method1555(byte arg0) {
        field4030 = null;
        if (arg0 >= -105) {
            method1559(false, (class113) null, true);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLlj;)V")
    public static final void method1556(byte arg0, class25 arg1) {
        if (arg0 > -97) {
            field4030 = null;
        }
        int var2 = arg1.method210(65536);
        class232.field4053 = new class145[var2];
        for (int var3 = 0; var2 > var3; ++var3) {
            class232.field4053[var3] = new class145();
            class232.field4053[var3].field2534 = arg1.method210(65536);
            class232.field4053[var3].field2538 = arg1.method237(-1);
        }
        ++field4025;
        class248.field4348 = arg1.method210(65536);
        class51.field833 = arg1.method210(65536);
        class60.field976 = arg1.method210(65536);
        class150.field2608 = new class2[class51.field833 - (class248.field4348 + -1)];
        for (int var4 = 0; var4 < class60.field976; ++var4) {
            int var5 = arg1.method210(65536);
            class2 var6 = class150.field2608[var5] = new class2();
            var6.field1540 = arg1.method189((byte) -103);
            var6.field1545 = arg1.method199((byte) -85);
            var6.field88 = class248.field4348 + var5;
            var6.field92 = arg1.method237(-1);
            var6.field89 = arg1.method237(-1);
        }
        class89.field1439 = arg1.method199((byte) -85);
        class36.field655 = true;
    }

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "(I)Z")
    private final boolean method1557(int arg0) {
        ++field4027;
        if (this.field4022 != null) {
            return true;
        } else if (~this.field4023 <= arg0) {
            int var2 = class264.field4654;
            int var3 = class25.field486;
            int var4 = !class100.field1626.method1450(this.field4023, (byte) -119) ? 128 : 64;
            this.field4022 = class100.field1626.method1448(true, this.field4023);
            this.field4026 = var4;
            this.field4016 = var4;
            class37.method298(-126, var3, var2);
            return this.field4022 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
    public class231() {
        super(0, false);
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)I")
    public static final int method1558(byte arg0) {
        if (arg0 >= -125) {
            return 2;
        } else {
            ++field4024;
            return 16;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        if (arg0 >= -119) {
            method1553((byte) -100);
        }
        ++field4019;
        if (~arg1 == -1) {
            this.field4023 = arg2.method193((byte) 77);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method71(boolean arg0, int arg1) {
        ++field4028;
        if (!arg0) {
            return null;
        } else {
            int[][] var3 = super.field4257.method917(arg1, 1);
            if (super.field4257.field2357 && this.method1557(-1)) {
                int var4 = (~class25.field486 == ~this.field4026 ? arg1 : this.field4026 * arg1 / class25.field486) * this.field4016;
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                if (class264.field4654 != this.field4016) {
                    for (int var8 = 0; var8 < class264.field4654; ++var8) {
                        int var9 = this.field4016 * var8 / class264.field4654;
                        int var10 = this.field4022[var4 + var9];
                        var7[var8] = class214.method1432(var10, 255) << 4;
                        var6[var8] = class214.method1432(4080, var10 >> 4);
                        var5[var8] = class214.method1432(var10, 16711680) >> 12;
                    }
                } else {
                    for (int var11 = 0; ~var11 > ~class264.field4654; ++var11) {
                        int var12 = this.field4022[var4++];
                        var7[var11] = class214.method1432(255, var12) << 4;
                        var6[var11] = class214.method1432(var12, 65280) >> 4;
                        var5[var11] = class214.method1432(4080, var12 >> 12);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZLua;Z)V")
    public static final void method1559(boolean arg0, class113 arg1, boolean arg2) {
        ++field4017;
        int var3 = ~arg1.field1875 == -1 ? arg1.field1995 : arg1.field1875;
        int var4 = ~arg1.field1890 == -1 ? arg1.field1869 : arg1.field1890;
        class130.method890(var4, (byte) 122, class251.field4394[arg1.field1964 >> 16], var3, arg0, arg1.field1964);
        if (arg1.field1865 != null) {
            class130.method890(var4, (byte) 113, arg1.field1865, var3, arg0, arg1.field1964);
        }
        if (!arg2) {
            method1555((byte) 0);
        }
        class144 var5 = (class144) class261.field4614.method150((long) arg1.field1964, 127);
        if (var5 != null) {
            class44.method332(var3, arg0, var4, (byte) 81, var5.field2517);
        }
    }
}
