import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class556 extends class601 {

    @OriginalMember(owner = "client!po", name = "j", descriptor = "[[I")
    public static int[][] field7972 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!po", name = "n", descriptor = "S")
    public static short field7976 = 1;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "I")
    public static int field7966;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "I")
    public static int field7967;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "I")
    public static int field7969;

    @OriginalMember(owner = "client!po", name = "h", descriptor = "I")
    public static int field7970;

    @OriginalMember(owner = "client!po", name = "i", descriptor = "I")
    public static int field7971;

    @OriginalMember(owner = "client!po", name = "k", descriptor = "I")
    public static int field7973;

    @OriginalMember(owner = "client!po", name = "l", descriptor = "I")
    public static int field7974;

    @OriginalMember(owner = "client!po", name = "m", descriptor = "I")
    public static int field7975;

    @OriginalMember(owner = "client!po", name = "o", descriptor = "I")
    public static int field7977;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field7968;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lwp;II)Z", line = 4)
    public static final boolean method3261(class179 arg0, int arg1, int arg2) {
        ++field7967;
        int var3 = arg0.method1102(255, 2);
        if (var3 == 0) {
            if (~arg0.method1102(255, 1) != -1) {
                method3261(arg0, 59, arg2);
            }
            int var4 = arg0.method1102(255, 6);
            int var5 = arg0.method1102(255, 6);
            boolean var6 = ~arg0.method1102(255, 1) == -2;
            if (var6) {
                class111.field1169[class165.field1846++] = arg2;
            }
            if (class75.field792[arg2] != null) {
                throw new RuntimeException("hr:lr");
            } else {
                class98 var7 = class603.field8577[arg2];
                class183 var8 = class75.field792[arg2] = new class183();
                var8.field7107 = arg2;
                if (class633.field9108[arg2] != null) {
                    var8.method1134(class633.field9108[arg2], (byte) 67);
                }
                var8.method2990(var7.field1025, 78, true);
                var8.field7148 = var7.field1027;
                int var9 = var7.field1023;
                int var10 = var9 >> 28;
                int var11 = 255 & var9 >> 14;
                int var12 = 255 & var9;
                int var13 = (var11 << 6) + -class464.field6624 + var4;
                var8.field2176 = var7.field1026;
                int var14 = (var12 << 6) + -class181.field2144 + var5;
                var8.field7183[0] = class311.field3859[arg2];
                var8.field4628 = var8.field4633 = (byte) var10;
                if (class728.method4056(var14, var13, (byte) 122)) {
                    ++var8.field4633;
                }
                var8.method1132(var13, var14, 0);
                var8.field2165 = false;
                class603.field8577[arg2] = null;
                return true;
            }
        } else if (~var3 == -2) {
            int var15 = arg0.method1102(255, 2);
            int var16 = class603.field8577[arg2].field1023;
            class603.field8577[arg2].field1023 = ((var16 >> 28) + var15 << 28 & 805306368) + (268435455 & var16);
            return false;
        } else if (~var3 == -3) {
            int var17 = arg0.method1102(255, 5);
            int var18 = var17 >> 3;
            int var19 = var17 & 7;
            int var20 = class603.field8577[arg2].field1023;
            int var21 = (var20 >> 28) + var18 & 3;
            int var22 = 255 & var20 >> 14;
            int var23 = var20 & 255;
            if (~var19 == -1) {
                --var23;
                --var22;
            }
            if (var19 == 1) {
                --var23;
            }
            if (~var19 == -3) {
                ++var22;
                --var23;
            }
            if (~var19 == -4) {
                --var22;
            }
            if (var19 == 4) {
                ++var22;
            }
            if (~var19 == -6) {
                ++var23;
                --var22;
            }
            if (~var19 == -7) {
                ++var23;
            }
            if (~var19 == -8) {
                ++var23;
                ++var22;
            }
            class603.field8577[arg2].field1023 = (var21 << 28) + (var22 << 14) + var23;
            return false;
        } else {
            int var24 = arg0.method1102(255, 18);
            int var25 = var24 >> 16;
            int var26 = (var24 & 65365) >> 8;
            int var27 = 110 / (-arg1 / 53);
            int var28 = var24 & 255;
            int var29 = class603.field8577[arg2].field1023;
            int var30 = (var29 >> 28) - -var25 & 3;
            int var31 = (var29 >> 14) + var26 & 255;
            int var32 = 255 & var28 + var29;
            class603.field8577[arg2].field1023 = (var30 << 28) - -(var31 << 14) + var32;
            return false;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IZ)V", line = 166)
    public final void method40(int arg0, boolean arg1) {
        ++field7969;
        if (arg1) {
            field7968 = null;
        }
        super.field8565 = arg0;
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(B)I", line = 177)
    public final int method39(byte arg0) {
        ++field7970;
        return arg0 != -17 ? -83 : 1;
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(ILgn;)V", line = 191)
    public class556(int arg0, class699 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V", line = 195)
    public static void method3262(int arg0) {
        field7972 = null;
        field7968 = null;
        if (arg0 <= 9) {
            field7976 = -8;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Z)V", line = 214)
    public static final void method3263(boolean arg0) {
        class622.method3558((byte) 109);
        ++field7971;
        if (arg0) {
            field7968 = null;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(B)V", line = 225)
    public final void method35(byte arg0) {
        ++field7974;
        if (super.field8563.method3926(120) != class101.field1048) {
            super.field8565 = 1;
        } else if (super.field8563.method3930(19)) {
            super.field8565 = 0;
        }
        if (super.field8565 != 0 && ~super.field8565 != -2) {
            super.field8565 = this.method39((byte) -17);
        }
        if (arg0 >= -37) {
            this.method39((byte) -73);
        }
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(I)Z", line = 248)
    public final boolean method3264(int arg0) {
        ++field7975;
        if (super.field8563.method3930(19)) {
            return false;
        } else {
            if (arg0 != -9242) {
                this.method39((byte) 6);
            }
            return super.field8563.method3926(33) == class101.field1048;
        }
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(I)I", line = 267)
    public final int method3265(int arg0) {
        ++field7973;
        int var2 = 95 % ((-59 - arg0) / 61);
        return super.field8565;
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(B)V", line = 277)
    public static final void method3266(byte arg0) {
        if (arg0 == -86) {
            for (class709 var1 = (class709) class147.field1636.method2793(arg0 + 14797); var1 != null; var1 = (class709) class147.field1636.method2793(14711)) {
                class622.method3559(2, var1);
            }
            ++field7977;
            int var2;
            int var3;
            if (class654.field9334.field9858.method2982(arg0 + -40) != 1) {
                var2 = class316.field4035;
                var3 = class316.field4035;
            } else {
                var2 = 3;
                var3 = 0;
            }
            client.method1792();
            for (int var4 = var3; var4 <= var2; ++var4) {
                client.method1798();
                client.method1791(var4);
                client.method1786(var4);
            }
            client.method1795();
            client.method1794();
        }
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lgn;)V", line = 320)
    public class556(class699 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(II)I", line = 326)
    public final int method34(int arg0, int arg1) {
        ++field7966;
        if (super.field8563.method3930(19)) {
            return 3;
        } else {
            if (arg1 != 15706) {
                this.method3264(-111);
            }
            if (super.field8563.method3926(33) == class101.field1048) {
                if (arg0 == 0) {
                    if (~super.field8563.field9848.method3892(-125) == -2) {
                        return 2;
                    }
                    if (super.field8563.field9836.method466(107) == 1) {
                        return 2;
                    }
                    if (super.field8563.field9837.method1829(arg1 ^ 15648) > 0) {
                        return 2;
                    }
                }
                return 1;
            } else {
                return 3;
            }
        }
    }
}
