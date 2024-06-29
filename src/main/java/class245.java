import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class245 extends class157 {

    @OriginalMember(owner = "client!pe", name = "Y", descriptor = "I")
    private int field4449 = 4096;

    @OriginalMember(owner = "client!pe", name = "R", descriptor = "Z")
    public static boolean field4442 = false;

    @OriginalMember(owner = "client!pe", name = "Q", descriptor = "Lcc;")
    public static class209 field4441 = class95.method669(121, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!pe", name = "N", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!pe", name = "O", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!pe", name = "P", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!pe", name = "S", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!pe", name = "T", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!pe", name = "U", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!pe", name = "V", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!pe", name = "W", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!pe", name = "X", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!pe", name = "Z", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)Lfl;")
    public static final class241 method1706(int arg0, byte arg1) {
        ++field4447;
        class241 var2 = (class241) class68.field1300.method670((byte) -69, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class23.field428.method353(class150.method1040((byte) 122, arg0), -47, class141.method983(arg0, (byte) 110));
            class241 var4 = new class241();
            if (arg1 <= 117) {
                method1709(-40, (class163) null, -106, 11);
            }
            if (var3 != null) {
                var4.method1662(new class106(var3), 65535);
            }
            var4.method1663(-29919);
            class68.field1300.method673((long) arg0, -5087, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(IIIIIIII)V")
    public static final void method1707(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field4450;
        int var8 = 47 % ((-12 - arg6) / 51);
        if (class262.field4723 <= arg7 && ~arg2 >= ~class230.field4184 && ~class102.field1957 >= ~arg4 && class155.field2847 >= arg5) {
            class76.method534(arg7, arg3, arg2, arg5, arg4, arg0, arg1, -32686);
        } else {
            class201.method1379(0, arg0, arg2, arg1, arg5, arg4, arg7, arg3);
        }
    }

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "(I)V")
    public static final void method1708(int arg0) {
        ++field4448;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; ~var2 > ~(class98.field1912 - 1); ++var2) {
                if (class40.field680[var2] < 1000 && class40.field680[var2 + 1] > 1000) {
                    var1 = false;
                    class209 var3 = class20.field391[var2];
                    class20.field391[var2] = class20.field391[var2 + 1];
                    class20.field391[var2 + 1] = var3;
                    class209 var4 = class219.field3993[var2];
                    class219.field3993[var2] = class219.field3993[var2 + 1];
                    class219.field3993[var2 + 1] = var4;
                    int var5 = class106.field2096[var2];
                    class106.field2096[var2] = class106.field2096[var2 + 1];
                    class106.field2096[var2 + 1] = var5;
                    int var6 = class52.field1032[var2];
                    class52.field1032[var2] = class52.field1032[var2 + 1];
                    class52.field1032[var2 + 1] = var6;
                    short var7 = class40.field680[var2];
                    class40.field680[var2] = class40.field680[var2 + 1];
                    class40.field680[var2 + 1] = var7;
                    long var8 = class111.field2248[var2];
                    class111.field2248[var2] = class111.field2248[var2 + 1];
                    class111.field2248[var2 + 1] = var8;
                }
            }
        }
        if (arg0 != -676534904) {
            method1710(-123);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILek;II)V")
    public static final void method1709(int arg0, class163 arg1, int arg2, int arg3) {
        if (arg3 > -14) {
            field4442 = false;
        }
        if (arg1.field1541 == arg2 && ~arg2 != 0) {
            class241 var4 = method1706(arg2, (byte) 125);
            int var5 = var4.field4367;
            if (var5 == 1) {
                arg1.field1566 = 0;
                arg1.field1539 = arg0;
                arg1.field1521 = 0;
                arg1.field1506 = 0;
                class224.method1577(arg1.field1521, var4, arg1.field1534, arg1.field1571, 128, false);
            }
            if (~var5 == -3) {
                arg1.field1506 = 0;
            }
        } else if (arg2 == -1 || ~arg1.field1541 == 0 || method1706(arg2, (byte) 123).field4362 >= method1706(arg1.field1541, (byte) 118).field4362) {
            arg1.field1573 = arg1.field1510;
            arg1.field1506 = 0;
            arg1.field1539 = arg0;
            arg1.field1541 = arg2;
            arg1.field1566 = 0;
            arg1.field1521 = 0;
            if (arg1.field1541 != -1) {
                class224.method1577(arg1.field1521, method1706(arg1.field1541, (byte) 126), arg1.field1534, arg1.field1571, 128, false);
            }
        }
        ++field4446;
    }

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "(I)V")
    public static final void method1710(int arg0) {
        class285.field5025.method665(1);
        ++field4445;
        if (arg0 < 65) {
            field4444 = 120;
        }
        class37.field639.method665(1);
        class93.field1848.method665(1);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBLtf;)V")
    public final void method1(int arg0, byte arg1, class106 arg2) {
        ++field4439;
        if (arg0 == 0) {
            this.field4449 = arg2.method736(127);
        }
        if (arg1 >= -29) {
            field4444 = -63;
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)Lck;")
    public static final class218 method1711(int arg0, int arg1) {
        ++field4440;
        class218 var2 = (class218) class118.field2364.method670((byte) -72, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class273.field4840.method353(class197.method1348(arg1, true), 100, class148.method1028((byte) -22, arg1));
            class218 var4 = new class218();
            if (arg0 != 27093) {
                method1707(-12, -91, -7, 24, -57, -113, -32, 109);
            }
            var4.field3952 = arg1;
            if (var3 != null) {
                var4.method1533(-123, new class106(var3));
            }
            var4.method1541(103);
            if (var4.field3914) {
                var4.field3926 = 0;
                var4.field3949 = false;
            }
            if (!class10.field194 && var4.field3947) {
                var4.field3928 = null;
            }
            class118.field2364.method673((long) arg1, -5087, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)[I")
    public final int[] method4(byte arg0, int arg1) {
        ++field4443;
        int[] var3 = super.field2879.method1269(arg1, 17885);
        if (arg0 != -98) {
            field4444 = 50;
        }
        if (super.field2879.field3363) {
            int[] var4 = this.method1097((byte) 75, 0, arg1 - 1 & class42.field859);
            int[] var5 = this.method1097((byte) 75, 0, arg1);
            int[] var6 = this.method1097((byte) 75, 0, arg1 + 1 & class42.field859);
            for (int var7 = 0; ~var7 > ~class226.field4124; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field4449;
                int var9 = (var5[var7 + 1 & class249.field4490] + -var5[var7 + -1 & class249.field4490]) * this.field4449;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 - -var13 - -4096) / 4096.0F)));
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "(I)V")
    public static void method1712(int arg0) {
        if (arg0 != -17450) {
            method1710(-80);
        }
        field4441 = null;
    }

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "(I)I")
    public static final int method1713(int arg0) {
        ++field4438;
        if (arg0 >= -99) {
            method1706(94, (byte) -89);
        }
        return ((~class176.field3202 != -1 ? 1 : 0) << 22) + ((!class9.field185 ? 0 : 1) << 8) + ((!class161.field2917 ? 0 : 1) << 7) + ((class84.field1681 ? 1 : 0) << 6) + (class128.field2469 & 7) - (-((!class234.field4212 ? 0 : 1) << 3) - ((!class129.field2484 ? 0 : 1) << 4)) + ((class52.field1022 ? 1 : 0) << 5) + ((!class39.field662 ? 0 : 1) << 9) + ((!class234.field4209 ? 0 : 1) << 10) - (-(6144 & class254.field4587 << 11) + -((class163.field2961 ? 1 : 0) << 13) - ((class145.field2671 ? 1 : 0) << 15) + -((class281.field4940 ? 1 : 0) << 16) + -((!class71.field1343 ? 0 : 1) << 19) + -((class75.field1406 == 0 ? 0 : 1) << 20) - (((~class258.field4662 == -1 ? 0 : 1) << 21) + (class221.method1561() << 23)));
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
    public class245() {
        super(1, true);
    }
}
