import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fa")
public class class52 extends class85 {

    @OriginalMember(owner = "fa", name = "V", descriptor = "I")
    private int field1053 = 1024;

    @OriginalMember(owner = "fa", name = "T", descriptor = "I")
    private int field1051 = 2048;

    @OriginalMember(owner = "fa", name = "bb", descriptor = "I")
    private int field1059 = 3072;

    @OriginalMember(owner = "fa", name = "Q", descriptor = "Z")
    public static boolean field1048 = false;

    @OriginalMember(owner = "fa", name = "W", descriptor = "I")
    public static volatile int field1054 = 0;

    @OriginalMember(owner = "fa", name = "db", descriptor = "Llf;")
    public static class109 field1061 = class35.method275("Ihr Spielkonto wurde deaktiviert)3", 2);

    @OriginalMember(owner = "fa", name = "cb", descriptor = "I")
    public static volatile int field1060 = -1;

    @OriginalMember(owner = "fa", name = "eb", descriptor = "Llf;")
    private static class109 field1062 = class35.method275("flash3:", 2);

    @OriginalMember(owner = "fa", name = "S", descriptor = "Llf;")
    public static class109 field1050 = field1062;

    @OriginalMember(owner = "fa", name = "gb", descriptor = "I")
    public static int field1064 = -1;

    @OriginalMember(owner = "fa", name = "ib", descriptor = "Llf;")
    public static class109 field1066 = field1062;

    @OriginalMember(owner = "fa", name = "R", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "fa", name = "U", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "fa", name = "X", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "fa", name = "Y", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "fa", name = "Z", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "fa", name = "ab", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "fa", name = "fb", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "fa", name = "hb", descriptor = "Lbg;")
    public static class18 field1065;

    @OriginalMember(owner = "fa", name = "d", descriptor = "(B)V")
    public static final void method344(byte arg0) {
        ++field1056;
        if (class13.field193 > 0) {
            class121.method871(-1);
        } else {
            class36.method278(40, (byte) -64);
            class45.field952 = class55.field1114;
            class55.field1114 = null;
            if (arg0 != -125) {
                field1062 = null;
            }
        }
    }

    @OriginalMember(owner = "fa", name = "a", descriptor = "(BILja;)V")
    public final void method31(byte arg0, int arg1, class86 arg2) {
        ++field1049;
        if (arg0 >= -120) {
            method344((byte) 114);
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field1726 = arg2.method598((byte) 81) == 1;
                }
            } else {
                this.field1059 = arg2.method569(true);
            }
        } else {
            this.field1053 = arg2.method569(true);
        }
    }

    @OriginalMember(owner = "fa", name = "a", descriptor = "(BI)Llf;")
    public static final class109 method345(byte arg0, int arg1) {
        ++field1058;
        if (arg0 != 85) {
            field1050 = null;
        }
        return class164.method1110(10, -19865, false, arg1);
    }

    @OriginalMember(owner = "fa", name = "c", descriptor = "(I)V")
    public final void method199(int arg0) {
        if (arg0 != 25614) {
            method346(46L, false);
        }
        ++field1052;
        this.field1051 = -this.field1053 + this.field1059;
    }

    @OriginalMember(owner = "fa", name = "b", descriptor = "(II)[[I")
    public final int[][] method29(int arg0, int arg1) {
        ++field1057;
        if (arg1 != 2177) {
            return null;
        } else {
            int[][] var3 = super.field1719.method673((byte) -128, arg0);
            if (super.field1719.field1926) {
                int[][] var4 = this.method544(false, arg0, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[2];
                int[] var7 = var3[0];
                int[] var8 = var4[1];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class57.field1152; ++var11) {
                    var7[var11] = this.field1053 - -(var5[var11] * this.field1051 >> 12);
                    var9[var11] = (var8[var11] * this.field1051 >> 12) + this.field1053;
                    var10[var11] = this.field1053 - -(var6[var11] * this.field1051 >> 12);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "fa", name = "a", descriptor = "(JZ)V")
    public static final void method346(long arg0, boolean arg1) {
        ++field1055;
        if (arg0 != 0L) {
            if (~class19.field426 <= -101) {
                class98.method690(class174.field3306, false, class49.field1000, 0);
            } else {
                class109 var3 = class136.method981((byte) -75, arg0).method810(true);
                for (int var4 = 0; ~class19.field426 < ~var4; ++var4) {
                    if (~class82.field1607[var4] == ~arg0) {
                        class98.method690(class174.field3306, false, class36.method279(new class109[] { var3, class178.field3359 }, 1), 0);
                        return;
                    }
                }
                for (int var5 = 0; ~class199.field3786 < ~var5; ++var5) {
                    if (~class109.field2160[var5] == ~arg0) {
                        class98.method690(class174.field3306, arg1, class36.method279(new class109[] { class210.field4086, var3, class138.field2674 }, 1), 0);
                        return;
                    }
                }
                if (arg1) {
                    field1064 = 120;
                }
                if (var3.method809(class157.field2955.field3455, -1)) {
                    class98.method690(class174.field3306, false, class80.field1574, 0);
                } else {
                    class82.field1607[class19.field426] = arg0;
                    class31.field741[class19.field426++] = class136.method981((byte) -101, arg0);
                    class107.field2127 = class75.field1442;
                    class200.field3850.method1339((byte) 95, 147);
                    ++class39.field839;
                    class200.field3850.method592(arg0, -562765672);
                }
            }
        }
    }

    @OriginalMember(owner = "fa", name = "e", descriptor = "(I)V")
    public static void method347(int arg0) {
        field1065 = null;
        field1061 = null;
        if (arg0 != 0) {
            method345((byte) -2, 87);
        }
        field1050 = null;
        field1062 = null;
        field1066 = null;
    }

    @OriginalMember(owner = "fa", name = "a", descriptor = "(II)[I")
    public final int[] method87(int arg0, int arg1) {
        ++field1063;
        if (arg0 >= -49) {
            this.method29(89, 74);
        }
        int[] var3 = super.field1736.method835(-314, arg1);
        if (super.field1736.field2253) {
            int[] var4 = this.method540(arg1, 96, 0);
            for (int var5 = 0; ~class57.field1152 < ~var5; ++var5) {
                var3[var5] = (var4[var5] * this.field1051 >> 12) + this.field1053;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "fa", name = "<init>", descriptor = "()V")
    public class52() {
        super(1, false);
    }
}
