import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class371 extends class454 {

    @OriginalMember(owner = "client!eq", name = "K", descriptor = "J")
    public static long field5234 = 0L;

    @OriginalMember(owner = "client!eq", name = "H", descriptor = "Lpd;")
    public static class646 field5231 = new class646(2);

    @OriginalMember(owner = "client!eq", name = "M", descriptor = "I")
    public static int field5236 = -1;

    @OriginalMember(owner = "client!eq", name = "A", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!eq", name = "B", descriptor = "I")
    public int field5225;

    @OriginalMember(owner = "client!eq", name = "C", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!eq", name = "E", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!eq", name = "F", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!eq", name = "G", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!eq", name = "I", descriptor = "I")
    public int field5232;

    @OriginalMember(owner = "client!eq", name = "J", descriptor = "I")
    public int field5233;

    @OriginalMember(owner = "client!eq", name = "L", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!eq", name = "D", descriptor = "Ljava/lang/String;")
    public String field5227;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)V", line = 3)
    public static void method2209(byte arg0) {
        field5231 = null;
        int var1 = -81 % ((arg0 - -55) / 63);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V", line = 20)
    public static final void method2210(int arg0) {
        class388.method2335(class420.field5820.field9461.method3934(arg0 ^ -17540), (byte) 112);
        ++field5226;
        int var1 = (class733.field10199 >> 12) + (class222.field3266 >> 3);
        int var2 = (class286.field4204 >> 12) - -(class697.field9798 >> 3);
        class403.field5560 = class719.field10041.field10361 = 0;
        class719.field10041.method189(8, 8, -20480);
        byte var3 = 18;
        class613.field8704 = new byte[var3][];
        class555.field7705 = new byte[var3][];
        class114.field1832 = new int[var3];
        class789.field10791 = new byte[var3][];
        class149.field2397 = new int[var3][4];
        class687.field9715 = new int[var3];
        class11.field142 = new byte[var3][];
        class60.field912 = new int[var3];
        class12.field156 = new int[var3];
        class590.field8476 = new byte[var3][];
        if (arg0 != -1) {
            field5236 = -104;
        }
        class401.field5521 = new int[var3];
        class651.field9224 = new int[var3];
        int var4 = 0;
        for (int var5 = (-(class192.field2891 >> 4) + var1) / 8; ~var5 >= ~((var1 - -(class192.field2891 >> 4)) / 8); ++var5) {
            for (int var8 = (-(class456.field6225 >> 4) + var2) / 8; ~var8 >= ~(((class456.field6225 >> 4) + var2) / 8); ++var8) {
                int var9 = (var5 << 8) - -var8;
                class12.field156[var4] = var9;
                class687.field9715[var4] = class562.field7790.method3016(112, "m" + var5 + "_" + var8);
                class651.field9224[var4] = class562.field7790.method3016(117, "l" + var5 + "_" + var8);
                class114.field1832[var4] = class562.field7790.method3016(class172.method1269(arg0, -91), "n" + var5 + "_" + var8);
                class60.field912[var4] = class562.field7790.method3016(81, "um" + var5 + "_" + var8);
                class401.field5521[var4] = class562.field7790.method3016(88, "ul" + var5 + "_" + var8);
                if (class114.field1832[var4] == -1) {
                    class687.field9715[var4] = -1;
                    class651.field9224[var4] = -1;
                    class60.field912[var4] = -1;
                    class401.field5521[var4] = -1;
                }
                ++var4;
            }
        }
        for (int var6 = var4; var6 < class114.field1832.length; ++var6) {
            class114.field1832[var6] = -1;
            class687.field9715[var6] = -1;
            class651.field9224[var6] = -1;
            class60.field912[var6] = -1;
            class401.field5521[var6] = -1;
        }
        byte var7;
        if (class141.field2306 != 3) {
            var7 = 8;
        } else {
            var7 = 4;
        }
        class694.method3901(var7, var2, 26055, var1, false);
    }

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "(I)J", line = 107)
    public final long method2211(int arg0) {
        ++field5230;
        if (arg0 != -1011348) {
            method2210(-3);
        }
        return Long.MAX_VALUE & super.field6209;
    }

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "(I)V", line = 118)
    public final void method2212(int arg0) {
        super.field6209 |= Long.MIN_VALUE;
        if (arg0 > -54) {
            this.field5232 = -128;
        }
        ++field5235;
        if (~this.method2211(-1011348) == -1L) {
            class13.field160.method248((byte) 118, this);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "()V", line = 135)
    public static final void method2213() {
        for (int var0 = 0; var0 < class401.field5525; ++var0) {
            class208 var1 = class316.field4516[var0];
            class600.method3496(var1, true);
            class316.field4516[var0] = null;
        }
        class401.field5525 = 0;
    }

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "(I)I", line = 148)
    public final int method2214(int arg0) {
        if (arg0 != 255) {
            return 124;
        } else {
            ++field5224;
            return (int) (255L & super.field10592 >>> 56);
        }
    }

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "(I)V", line = 162)
    public final void method2215(int arg0) {
        super.field6209 = Long.MIN_VALUE & super.field6209 | class337.method2062(false) + 500L;
        ++field5228;
        if (arg0 == 4) {
            class752.field10455.method248((byte) 87, this);
        }
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(IJ)V", line = 175)
    public class371(int arg0, long arg1) {
        super.field10592 = arg1 | (long) arg0 << 56;
    }

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "(I)J", line = 192)
    public final long method2216(int arg0) {
        int var2 = -52 % ((6 - arg0) / 55);
        ++field5229;
        return 72057594037927935L & super.field10592;
    }
}
