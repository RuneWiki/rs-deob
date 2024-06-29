import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class106 extends class481 implements class490 {

    @OriginalMember(owner = "client!jt", name = "m", descriptor = "I")
    private int field1860;

    @OriginalMember(owner = "client!jt", name = "n", descriptor = "[I")
    public static int[] field1861 = new int[2048];

    @OriginalMember(owner = "client!jt", name = "l", descriptor = "Lmu;")
    public static class303 field1859 = new class303(39, 8);

    @OriginalMember(owner = "client!jt", name = "w", descriptor = "I")
    public static int field1870 = 0;

    @OriginalMember(owner = "client!jt", name = "k", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!jt", name = "o", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!jt", name = "p", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!jt", name = "q", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!jt", name = "r", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!jt", name = "s", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!jt", name = "t", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!jt", name = "u", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!jt", name = "v", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(B)I")
    public final int method959(byte arg0) {
        ++field1858;
        if (arg0 != -97) {
            this.method962(false);
        }
        return this.field1860;
    }

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "(I)V")
    public final void method548(int arg0) {
        super.field6714.method211(91, this);
        if (arg0 >= -78) {
            this.method962(false);
        }
        ++field1862;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(II[BI)V")
    public final void method960(int arg0, int arg1, byte[] arg2, int arg3) {
        this.method2822(arg2, 0, arg1);
        ++field1863;
        this.field1860 = arg0;
        if (arg3 != -9894) {
            this.method964((byte) -37);
        }
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lqo;I[BIZ)V")
    public class106(class22 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field1860 = arg1;
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lqo;ILjaclib/memory/Buffer;IZ)V")
    public class106(class22 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field1860 = arg1;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lha;I)V")
    public static final void method961(class59 arg0, int arg1) {
        ++field1865;
        int var2 = 0;
        int var3 = 0;
        if (class241.field3529) {
            var2 = class146.method1163((byte) -122);
            var3 = class313.method2035(false);
        }
        int var4 = field1869 + var2;
        int var5 = class749.field10379 + var3;
        int var6 = class565.field7788;
        int var7 = class469.field6575 + -3;
        byte var8 = 20;
        class271.method1793(class565.field7788, field1869 + var2, arg0, class497.field6915.method2936(class607.field8336, arg1 + 528), false, class749.field10379 + var3, class469.field6575, var8);
        int var9 = var2 + class284.field3963.method574(true);
        if (arg1 != 16) {
            method963((byte) 9);
        }
        int var10 = var3 + class284.field3963.method571((byte) 95);
        if (!class715.field9742) {
            int var11 = 0;
            for (class324 var12 = (class324) class528.field7301.method1269(4); var12 != null; var12 = (class324) class528.field7301.method1264((byte) 101)) {
                int var13 = (class192.field2844 - var11 + -1) * 16 + 13 + var5 + var8;
                if (~(field1869 - -var2) > ~var9 && field1869 + var2 - -class565.field7788 > var9 && ~(var13 - 13) > ~var10 && var13 + 4 > var10 && var12.field4507) {
                    arg0.method217(field1869 + var2, var13 + -12, class565.field7788, 16, -class500.field6980 + 255 << 24 | class231.field3342, 1);
                }
                ++var11;
            }
        } else {
            int var14 = 0;
            for (class462 var15 = (class462) class631.field8684.method2344(-73); var15 != null; var15 = (class462) class631.field8684.method2336((byte) 61)) {
                int var28 = var14 * 16 + var5 - (-var8 + -13);
                if (~var9 < ~(field1869 + var2) && var9 < field1869 + var2 + class565.field7788 && ~(var28 + -13) > ~var10 && ~var10 > ~(var28 - -4) && (~var15.field6497 < -2 || ((class324) var15.field6503.field5243.field241).field4507)) {
                    arg0.method217(field1869 + var2, var28 + -12, class565.field7788, 16, -class500.field6980 + 255 << 24 | class231.field3342, 1);
                }
                ++var14;
            }
            if (class164.field2589 != null) {
                int var16 = 0;
                class271.method1793(class465.field6522, class142.field2352, arg0, class164.field2589.field6499, false, class157.field2522, class562.field7760, var8);
                for (class324 var17 = (class324) class164.field2589.field6503.method2344(-44); var17 != null; var17 = (class324) class164.field2589.field6503.method2336((byte) 71)) {
                    int var18 = var16 * 16 + (class157.field2522 + var8 - -13);
                    if (class142.field2352 < var9 && class142.field2352 - -class465.field6522 > var9 && ~var10 < ~(var18 + -13) && var18 - -4 > var10 && var17.field4507) {
                        arg0.method217(class142.field2352, var18 - 12, class465.field6522, 16, -class500.field6980 + 255 << 24 | class231.field3342, 1);
                    }
                    ++var16;
                }
                class645.method3668(var8, class142.field2352, class465.field6522, class562.field7760, 125, class157.field2522, arg0);
            }
        }
        class645.method3668(var8, field1869 + var2, class565.field7788, class469.field6575, -75, class749.field10379 - -var3, arg0);
        if (!class715.field9742) {
            int var19 = 0;
            for (class324 var20 = (class324) class528.field7301.method1269(4); var20 != null; var20 = (class324) class528.field7301.method1264((byte) 71)) {
                int var21 = var5 - -var8 - (-13 - (-var19 + -1 + class192.field2844) * 16);
                ++var19;
                class42.method534(var5, -16777216 | class608.field8347, var21, arg0, var20, var6, var10, -16777216 | class561.field7747, (byte) 125, var7, var4, var9);
            }
        } else {
            int var22 = 0;
            for (class462 var23 = (class462) class631.field8684.method2344(-77); var23 != null; var23 = (class462) class631.field8684.method2336((byte) 111)) {
                int var27 = class749.field10379 + var3 + 13 - -(var22 * 16) + var8;
                ++var22;
                if (var23.field6497 == 1) {
                    class42.method534(class749.field10379 - -var3, -16777216 | class608.field8347, var27, arg0, (class324) var23.field6503.field5243.field241, class565.field7788, var10, class561.field7747 | -16777216, (byte) 125, class469.field6575, field1869 - -var2, var9);
                } else {
                    class390.method2452(-16777216 | class561.field7747, var27, var23, var9, class565.field7788, -16777216 | class608.field8347, var10, arg0, class749.field10379 - -var3, arg1 ^ 96, field1869 + var2, class469.field6575);
                }
            }
            if (class164.field2589 != null) {
                int var24 = 0;
                for (class324 var25 = (class324) class164.field2589.field6503.method2344(-118); var25 != null; var25 = (class324) class164.field2589.field6503.method2336((byte) 111)) {
                    int var26 = var24 * 16 + 13 + class157.field2522 + var8;
                    ++var24;
                    class42.method534(class157.field2522, class608.field8347 | -16777216, var26, arg0, var25, class465.field6522, var10, class561.field7747 | -16777216, (byte) 127, class562.field7760, class142.field2352, var9);
                }
                class344.method2169(class465.field6522, class157.field2522, true, class142.field2352, class562.field7760);
            }
        }
        class344.method2169(class565.field7788, class749.field10379 - -var3, true, field1869 + var2, class469.field6575);
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z)I")
    public final int method962(boolean arg0) {
        ++field1866;
        if (!arg0) {
            this.method964((byte) -54);
        }
        return super.field6716;
    }

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "(B)V")
    public static void method963(byte arg0) {
        int var1 = -93 / ((arg0 - -75) / 36);
        field1861 = null;
        field1859 = null;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)J")
    public final long method964(byte arg0) {
        if (arg0 != 42) {
            field1859 = null;
        }
        ++field1864;
        return 0L;
    }
}
