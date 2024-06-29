import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class148 extends class149 {

    @OriginalMember(owner = "client!vu", name = "K", descriptor = "I")
    private int field2127 = -1;

    @OriginalMember(owner = "client!vu", name = "L", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!vu", name = "M", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!vu", name = "N", descriptor = "I")
    private int field2130;

    @OriginalMember(owner = "client!vu", name = "O", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!vu", name = "P", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!vu", name = "Q", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!vu", name = "R", descriptor = "I")
    private int field2134;

    @OriginalMember(owner = "client!vu", name = "S", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!vu", name = "T", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!vu", name = "U", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!vu", name = "I", descriptor = "[I")
    private int[] field2125;

    @OriginalMember(owner = "client!vu", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field2126;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(BI)[[I", line = 4)
    public final int[][] method139(byte arg0, int arg1) {
        ++field2131;
        int[][] var3 = super.field2147.method2726(arg1, 0);
        if (super.field2147.field6664) {
            int var4 = (~class150.field2159 == ~this.field2130 ? arg1 : this.field2130 * arg1 / class150.field2159) * this.field2134;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class316.field4838 == this.field2134) {
                for (int var8 = 0; class316.field4838 > var8; ++var8) {
                    int var9 = this.field2125[var4++];
                    var7[var8] = class494.method2942(4080, var9 << 4);
                    var6[var8] = class494.method2942(var9 >> 4, 4080);
                    var5[var8] = class494.method2942(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; ~var10 > ~class316.field4838; ++var10) {
                    int var11 = this.field2134 * var10 / class316.field4838;
                    int var12 = this.field2125[var4 + var11];
                    var7[var10] = class494.method2942(var12 << 4, 4080);
                    var6[var10] = class494.method2942(var12, 65280) >> 4;
                    var5[var10] = class494.method2942(4080, var12 >> 12);
                }
            }
        }
        if (arg0 >= -45) {
            this.method397((byte) -29);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(III)V", line = 69)
    public final void method977(int arg0, int arg1, int arg2) {
        super.method977(arg0, arg1, arg2);
        ++field2133;
        if (~this.field2127 <= -1 && class186.field2615 != null) {
            int var4 = class186.field2615.method1558(this.field2127, (byte) 119).field3654 ? 64 : 128;
            this.field2125 = class186.field2615.method1552(1.0F, this.field2127, true, var4, false, var4);
            this.field2130 = var4;
            this.field2134 = var4;
        }
    }

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "(B)V", line = 88)
    public static void method978(byte arg0) {
        field2126 = null;
        if (arg0 != 33) {
            method981(-104, (byte) 80);
        }
    }

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "(III)Z", line = 99)
    public static final boolean method979(int arg0, int arg1, int arg2) {
        if (arg2 != 128) {
            return false;
        } else {
            ++field2136;
            return (arg1 & 458752) != 0 | class310.method1996(arg1, 111, arg0) || class202.method1407(arg1, arg0, false);
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IBLtl;)V", line = 110)
    public final void method93(int arg0, byte arg1, class91 arg2) {
        ++field2137;
        if (arg1 != 35) {
            this.field2125 = null;
        }
        if (~arg0 == -1) {
            this.field2127 = arg2.method631(arg1 ^ 10461);
        }
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "()V", line = 128)
    public class148() {
        super(0, false);
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(B)V", line = 133)
    public final void method397(byte arg0) {
        super.method397(arg0);
        ++field2132;
        this.field2125 = null;
    }

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "(I)I", line = 148)
    public final int method980(int arg0) {
        ++field2135;
        if (arg0 != -1) {
            method978((byte) -90);
        }
        return this.field2127;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IB)V", line = 159)
    public static final void method981(int arg0, byte arg1) {
        if (arg1 != 105) {
            method981(-19, (byte) 87);
        }
        ++field2129;
        class15.field250.method1016(arg0, (byte) 127);
    }
}
