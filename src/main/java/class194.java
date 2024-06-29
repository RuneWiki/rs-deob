import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class194 extends class166 {

    @OriginalMember(owner = "client!bf", name = "cb", descriptor = "I")
    private int field3546 = -1;

    @OriginalMember(owner = "client!bf", name = "Q", descriptor = "I")
    public static int field3534 = 0;

    @OriginalMember(owner = "client!bf", name = "R", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!bf", name = "T", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!bf", name = "U", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!bf", name = "V", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!bf", name = "X", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!bf", name = "Y", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!bf", name = "Z", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!bf", name = "bb", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!bf", name = "db", descriptor = "I")
    public int field3547;

    @OriginalMember(owner = "client!bf", name = "eb", descriptor = "I")
    public int field3548;

    @OriginalMember(owner = "client!bf", name = "gb", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!bf", name = "hb", descriptor = "Lak;")
    public static class134 field3551;

    @OriginalMember(owner = "client!bf", name = "P", descriptor = "Lkc;")
    public static class264 field3533;

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "Lnc;")
    public static class83 field3532;

    @OriginalMember(owner = "client!bf", name = "ab", descriptor = "Lnc;")
    public static class83 field3544;

    @OriginalMember(owner = "client!bf", name = "W", descriptor = "[I")
    public static int[] field3540;

    @OriginalMember(owner = "client!bf", name = "fb", descriptor = "[I")
    public int[] field3549;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method1407(String arg0, int arg1) throws ClassNotFoundException {
        ++field3535;
        int var2 = -109 / ((arg1 - 54) / 52);
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else {
            return arg0.equals("C") ? Character.TYPE : Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(JI)Lhj;")
    public static final class69 method1408(long arg0, int arg1) {
        ++field3541;
        if (arg1 != 0) {
            method1410(-77);
        }
        return class177.method1280((byte) 122, arg0, 10, false);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        if (arg2 == 0) {
            this.field3546 = arg1.method912(arg0 + -1);
        }
        if (arg0 != 96) {
            field3540 = null;
        }
        ++field3542;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(III)I")
    public static final int method1409(int arg0, int arg1, int arg2) {
        if (arg2 >= -98) {
            return -77;
        } else {
            int var3 = arg1 >>> 31;
            ++field3545;
            return (arg1 - -var3) / arg0 - var3;
        }
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)V")
    public static void method1410(int arg0) {
        field3551 = null;
        if (arg0 != 0) {
            field3551 = null;
        }
        field3532 = null;
        field3544 = null;
        field3540 = null;
        field3533 = null;
    }

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)Z")
    public final boolean method1411(int arg0) {
        ++field3537;
        if (this.field3549 != null) {
            return true;
        } else if (this.field3546 >= arg0) {
            class264 var2 = class4.method19(this.field3546, class130.field2422, true);
            var2.method1831();
            this.field3547 = var2.field1010;
            this.field3549 = var2.field4704;
            this.field3548 = var2.field999;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(Z)I")
    public final int method1227(boolean arg0) {
        if (arg0) {
            field3544 = null;
        }
        ++field3538;
        return this.field3546;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)V")
    public final void method1225(int arg0) {
        ++field3550;
        super.method1225(arg0);
        this.field3549 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lth;B)V")
    public static final void method1412(class108 arg0, byte arg1) {
        ++field3539;
        if (arg1 != 40) {
            field3533 = null;
        }
        class175 var2 = (class175) class208.field3780.method769(true, arg0.field2045.method473((byte) 46));
        if (var2 != null) {
            if (var2.field3197 != null) {
                class54.field959.method1788(var2.field3197);
                var2.field3197 = null;
            }
            var2.method632(arg1 ^ -8272);
        }
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(B)Lhk;")
    public static final class121 method1413(byte arg0) {
        if (arg0 >= -111) {
            return null;
        } else {
            class121 var1 = new class121(class229.field4196, class53.field941, class138.field2585[0], class88.field1682[0], class69.field1350[0], class113.field2167[0], class157.field2919[0], class50.field841);
            ++field3536;
            class229.method1636((byte) 101);
            return var1;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)[[I")
    public int[][] method134(int arg0, int arg1) {
        ++field3543;
        if (arg0 != 0) {
            method1409(-14, -90, -122);
        }
        int[][] var3 = super.field3064.method320(arg1, (byte) -31);
        if (super.field3064.field979 && this.method1411(0)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int var6 = this.field3547 * (class146.field2691 == this.field3548 ? arg1 : this.field3548 * arg1 / class146.field2691);
            int[] var7 = var3[2];
            if (~class253.field4565 == ~this.field3547) {
                for (int var8 = 0; ~class253.field4565 < ~var8; ++var8) {
                    int var9 = this.field3549[var6++];
                    var7[var8] = class69.method443(var9, 255) << 4;
                    var5[var8] = class69.method443(var9 >> 4, 4080);
                    var4[var8] = class69.method443(var9 >> 12, 4080);
                }
            } else {
                for (int var10 = 0; class253.field4565 > var10; ++var10) {
                    int var11 = this.field3547 * var10 / class253.field4565;
                    int var12 = this.field3549[var6 + var11];
                    var7[var10] = class69.method443(var12 << 4, 4080);
                    var5[var10] = class69.method443(4080, var12 >> 4);
                    var4[var10] = class69.method443(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
    public class194() {
        super(0, false);
    }
}
