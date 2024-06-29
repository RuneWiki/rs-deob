import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class234 extends class107 {

    @OriginalMember(owner = "client!qf", name = "eb", descriptor = "I")
    private int field4060 = 2048;

    @OriginalMember(owner = "client!qf", name = "ib", descriptor = "I")
    private int field4064 = 1024;

    @OriginalMember(owner = "client!qf", name = "Z", descriptor = "I")
    private int field4055 = 3072;

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "I")
    public static int field4050 = 0;

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "Lpj;")
    public static class237 field4047 = class33.method353(" ", 115);

    @OriginalMember(owner = "client!qf", name = "fb", descriptor = "Lpj;")
    private static class237 field4061 = class33.method353("Loading)3)3)3", 49);

    @OriginalMember(owner = "client!qf", name = "jb", descriptor = "Lpj;")
    private static class237 field4065 = class33.method353("Starting 3d Library", 33);

    @OriginalMember(owner = "client!qf", name = "Y", descriptor = "Lpj;")
    public static class237 field4054 = field4061;

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "Lpj;")
    public static class237 field4049 = field4065;

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "Loa;")
    public static class97 field4048 = null;

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!qf", name = "V", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!qf", name = "W", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!qf", name = "X", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!qf", name = "ab", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!qf", name = "cb", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!qf", name = "db", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!qf", name = "gb", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!qf", name = "hb", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!qf", name = "lb", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!qf", name = "kb", descriptor = "Ljj;")
    public static class103 field4066;

    @OriginalMember(owner = "client!qf", name = "bb", descriptor = "Z")
    public static boolean field4057;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "(I)V")
    public final void method124(int arg0) {
        ++field4053;
        if (arg0 == 31) {
            this.field4060 = -this.field4064 + this.field4055;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)I")
    public static final int method1553(int arg0, int arg1) {
        ++field4059;
        int var2 = -63 % ((arg1 - 57) / 55);
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "(I)V")
    public static final void method1554(int arg0) {
        ++field4063;
        int var1 = class269.field4599;
        int var2 = class176.field3088;
        int var3 = class23.field423;
        int var4 = 6116423;
        if (arg0 > 40) {
            int var5 = class166.field2940;
            class192.method1301(var1, var2, var3, var5, var4);
            class192.method1301(var1 + 1, var2 - -1, var3 - 2, 16, 0);
            class192.method1316(var1 + 1, var2 + 18, var3 - 2, var5 - 19, 0);
            class80.field1507.method1337(class239.field4181, var1 + 3, var2 + 14, var4, -1);
            int var6 = class28.field515;
            int var7 = class174.field3059;
            for (int var8 = 0; var8 < class271.field4664; ++var8) {
                int var9 = (class271.field4664 + -1 - var8) * 15 + var2 + 31;
                int var10 = 16777215;
                if (~var1 > ~var6 && var6 < var1 + var3 && ~var7 < ~(var9 + -13) && var9 + 3 > var7) {
                    var10 = 16776960;
                }
                class80.field1507.method1337(class15.method135((byte) -6, var8), var1 + 3, var9, var10, 0);
            }
            class138.method956(class23.field423, class166.field2940, 0, class176.field3088, class269.field4599);
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
    public class234() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field1897 = arg0.method316((byte) 3) == 1;
                }
            } else {
                this.field4055 = arg0.method339(-16777216);
            }
        } else {
            this.field4064 = arg0.method339(-16777216);
        }
        if (arg2 != -32513) {
            method1553(-17, 33);
        }
        ++field4056;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILbe;II)V")
    public static final void method1555(int arg0, int arg1, class28 arg2, int arg3, int arg4) {
        ++field4051;
        for (class249 var5 = (class249) class156.field2757.method673(false); var5 != null; var5 = (class249) class156.field2757.method680(95)) {
            if (var5.field4318 == arg4 && arg0 * 128 == var5.field4309 && ~(arg1 * 128) == ~var5.field4315 && var5.field4321.field527 == arg2.field527) {
                if (var5.field4333 != null) {
                    class74.field1424.method583(var5.field4333);
                    var5.field4333 = null;
                }
                if (var5.field4335 != null) {
                    class74.field1424.method583(var5.field4335);
                    var5.field4335 = null;
                }
                var5.method629(0);
                return;
            }
        }
        int var6 = -10 % ((44 - arg3) / 59);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIBILw;)V")
    public static final void method1556(int arg0, int arg1, byte arg2, int arg3, class141 arg4) {
        if (class111.field1952 >= 3) {
            class192.method1305(arg3, arg0, 0, arg4.field2442, arg4.field2429);
        } else {
            ((class225) class23.field417).method809(arg3, arg0, arg4.field2575, arg4.field2490, class23.field417.field2018 / 2, class23.field417.field2014 / 2, class257.field4417, 256, arg4.field2442, arg4.field2429);
        }
        ++field4046;
        class114.field2008[arg1] = true;
        int var5 = 108 / ((68 - arg2) / 56);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(BI)[I")
    public final int[] method123(byte arg0, int arg1) {
        ++field4058;
        int[] var3 = super.field1921.method1388(arg1, (byte) -26);
        if (super.field1921.field3539) {
            int[] var4 = this.method797(0, arg1, (byte) 111);
            for (int var5 = 0; class106.field1862 > var5; ++var5) {
                var3[var5] = (var4[var5] * this.field4060 >> 12) + this.field4064;
            }
        }
        return arg0 != -17 ? null : var3;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BI)[[I")
    public final int[][] method240(byte arg0, int arg1) {
        int var3 = 24 / ((arg0 - 26) / 45);
        ++field4062;
        int[][] var4 = super.field1903.method634(arg1, 13012);
        if (super.field1903.field1551) {
            int[][] var5 = this.method802(3, arg1, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var4[0];
            int[] var9 = var5[2];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class106.field1862; ++var12) {
                var8[var12] = this.field4064 - -(var6[var12] * this.field4060 >> 12);
                var10[var12] = (var7[var12] * this.field4060 >> 12) + this.field4064;
                var11[var12] = (var9[var12] * this.field4060 >> 12) + this.field4064;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLjh;)V")
    public static final void method1557(byte arg0, class271 arg1) {
        if (arg0 >= -20) {
            method1556(-40, 23, (byte) 61, -67, (class141) null);
        }
        ++field4052;
        class249 var2 = (class249) class33.field703.method568(arg1.field4655.method1616(0), -1);
        if (var2 == null) {
            class96.method719(arg1.field3743[0], arg1.field3715[0], 0, (class28) null, (byte) 57, arg1, (class210) null, class274.field4798);
        } else {
            var2.method1702(94);
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)Ldg;")
    public static final class137 method1558(int arg0, int arg1) {
        class137 var2 = (class137) class273.field4730.method940((long) arg1, arg0 ^ -24126);
        ++field4067;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class76.field1438.method1645(true, arg1, 4);
            class137 var4 = new class137();
            if (var3 != null) {
                var4.method951(112, arg1, new class32(var3));
            }
            if (arg0 != -24174) {
                method1554(-60);
            }
            class273.field4730.method937(-104, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(B)V")
    public static void method1559(byte arg0) {
        field4054 = null;
        field4047 = null;
        if (arg0 != 18) {
            method1559((byte) -102);
        }
        field4049 = null;
        field4066 = null;
        field4061 = null;
        field4065 = null;
    }
}
