import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class192 extends class331 {

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "I")
    public static int field2510 = 0;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "D")
    public static double field2504 = -1.0D;

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "F")
    public static float field2514;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)I", line = 3)
    public final int method226(byte arg0) {
        if (arg0 != 13) {
            return 64;
        } else {
            ++field2512;
            if (!super.field4203.method344((byte) -97)) {
                return super.field4203.field633.method4193((byte) 63) && class452.method2654(super.field4203.field633.method4191((byte) -126), 0) ? 1 : 0;
            } else {
                return 2;
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(ILts;)V", line = 24)
    public class192(int arg0, class41 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)I", line = 29)
    public final int method222(int arg0, int arg1) {
        ++field2507;
        if (super.field4203.method344((byte) 23)) {
            return 3;
        } else {
            if (arg1 != 1) {
                this.method224(-127);
            }
            return 1;
        }
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(II)V", line = 44)
    public final void method227(int arg0, int arg1) {
        if (arg0 < 113) {
            field2504 = -0.5084988275671193D;
        }
        ++field2506;
        super.field4202 = arg1;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 55)
    public final void method224(int arg0) {
        if (super.field4203.method344((byte) -91)) {
            super.field4202 = 2;
        }
        ++field2509;
        if (super.field4202 < 0 || ~super.field4202 < -3) {
            super.field4202 = this.method226((byte) 13);
        }
        if (arg0 != -1959) {
            field2504 = 0.4439716523692359D;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZ)I", line = 74)
    public static final int method1207(int arg0, boolean arg1) {
        ++field2511;
        if (arg0 < 115) {
            field2510 = 86;
        }
        int var2 = class709.field9973;
        if (~var2 != -1) {
            if (~var2 != -2) {
                return ~var2 == -3 ? 0 : 0;
            } else {
                return class437.field6143;
            }
        } else {
            return !arg1 ? class437.field6143 : 0;
        }
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)Z", line = 118)
    public final boolean method1208(byte arg0) {
        ++field2513;
        if (arg0 <= 103) {
            return true;
        } else {
            return !super.field4203.method344((byte) -84);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)Z", line = 146)
    public static final boolean method1209(int arg0, int arg1, int arg2) {
        ++field2508;
        int var3 = -2 / ((arg2 - 18) / 43);
        return ~(arg1 & 458752) != -1 | class517.method2969((byte) 95, arg0, arg1) || class10.method45(0, arg0, arg1);
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lts;)V", line = 156)
    public class192(class41 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILjava/lang/String;)V", line = 159)
    public static final void method1210(int arg0, String arg1) {
        if (class48.field701 == null) {
            class470.method2769(-2);
        }
        ++field2505;
        class444.field6221.setTime(new Date(class97.method654((byte) 95)));
        int var2 = class444.field6221.get(11);
        int var3 = class444.field6221.get(12);
        int var4 = class444.field6221.get(13);
        int var5 = -115 / ((-42 - arg0) / 37);
        String var6 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
        String[] var7 = class124.method809('\n', 122, arg1);
        for (int var8 = 0; var7.length > var8; ++var8) {
            for (int var9 = class10.field113; var9 > 0; --var9) {
                class48.field701[var9] = class48.field701[var9 + -1];
            }
            class48.field701[0] = var6 + ": " + var7[var8];
            if (class422.field6000 != null) {
                try {
                    class422.field6000.write(class589.method3271(class48.field701[0] + "\n", true));
                } catch (IOException var10) {
                }
            }
            if (~class10.field113 > ~(class48.field701.length + -1)) {
                ++class10.field113;
                if (class249.field3167 > 0) {
                    ++class249.field3167;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(B)I", line = 219)
    public final int method1211(byte arg0) {
        if (arg0 >= -119) {
            this.method1208((byte) -116);
        }
        ++field2503;
        return super.field4202;
    }
}
