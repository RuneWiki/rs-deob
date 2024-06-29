import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class296 implements class305 {

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public int field3843;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Lpi;")
    public static class340 field3845 = new class340(77, 10);

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "[B")
    public static byte[] field3847 = new byte[16384];

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "[[Leo;")
    public static class423[][] field3842;

    @OriginalMember(owner = "client!pb", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field3840++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLmv;ZII)V", line = 14)
    public static final void method1779(byte arg0, class518 arg1, boolean arg2, int arg3, int arg4) {
        if (arg2) {
            return;
        }
        field3844++;
        int var5 = arg1.field5246[0];
        int var6 = arg1.field5251[0];
        if (var5 < 0 || class200.field2594 <= var5 || var6 < 0 || class118.field1647 <= var6 || arg3 < 0 || class200.field2594 <= arg3 || arg4 < 0 || class118.field1647 <= arg4) {
            return;
        }
        int var7 = class254.method1584(arg1.method2342(10804), class85.field1145, true, arg3, 109, var5, class157.field2067, class171.field2215[arg1.field6220], 0, -4, var6, 0, 0, arg4, 0);
        if (var7 >= 1 && var7 <= 3) {
            for (int var8 = 0; var8 < (var7 - 1); var8++) {
                arg1.method3082(class85.field1145[var8], class157.field2067[var8], arg0, -13839);
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZB)V", line = 52)
    public static final void method1780(boolean arg0, byte arg1) {
        class376.method2197(class282.field3610, class23.field419, arg0, (byte) -75, class92.field1281);
        field3841++;
        if (arg1 != 31) {
            method1780(false, (byte) -86);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIBI)I", line = 74)
    public static final int method1781(int arg0, int arg1, byte arg2, int arg3) {
        field3848++;
        if (arg0 == arg1) {
            return arg1;
        }
        int var4 = 128 - arg3;
        int var5 = (arg0 & 0x7F) * arg3 + (arg1 & 0x7F) * var4 >> 7;
        if (arg2 == -121) {
            int var6 = (arg1 & 0x380) * var4 + ((arg0 & 0x380) * arg3) >> 7;
            int var7 = (arg0 & 0xFC00) * arg3 + (arg1 & 0xFC00) * var4 >> 7;
            return var7 & 0xFC00 | var6 & 0x380 | var5 & 0x7F;
        } else {
            return -85;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lm;BIIIILqa;)V", line = 100)
    public static final void method1782(class79 arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, class129 arg6) {
        if (class412.field5499 < 100) {
            class5.method26(arg0, arg6, 10);
        }
        field3846++;
        arg6.method925(arg5, arg2, arg4 + arg5, arg2 + arg3);
        if (class412.field5499 < 100) {
            byte var7 = 20;
            int var8 = arg4 / 2 + arg5;
            int var9 = arg2 + (arg3 / 2) - var7 - 18;
            arg6.method861(arg5, arg2, arg4, arg3, -16777216, 0);
            arg6.method918(var8 - 152, var9, 304, 34, class333.field4266[class246.field3150].getRGB(), 0);
            arg6.method861(var8 - 150, var9 + 2, class412.field5499 * 3, 30, class311.field4020[class246.field3150].getRGB(), 0);
            class200.field2590.method1105(class457.field6380.method1127(class379.field4920, false), var8, var7 + var9, (byte) -88, class211.field2715[class246.field3150].getRGB(), -1);
            return;
        }
        int var10 = class267.field3389 - ((int) ((float) arg4 / class230.field2952));
        if (arg1 >= -79) {
            field3847 = null;
        }
        int var11 = class346.field4413 + ((int) ((float) arg3 / class230.field2952));
        int var12 = class267.field3389 + ((int) ((float) arg4 / class230.field2952));
        int var13 = class346.field4413 - ((int) ((float) arg3 / class230.field2952));
        class175.field2248 = class346.field4413 - (int) ((float) arg3 / class230.field2952);
        class357.field4599 = class267.field3389 - ((int) ((float) arg4 / class230.field2952));
        class302.field3917 = (int) ((float) (arg3 * 2) / class230.field2952);
        class529.field7801 = (int) ((float) (arg4 * 2) / class230.field2952);
        class230.method1463(class230.field2983 + var10, class230.field2971 + var11, var12 + class230.field2983, class230.field2971 + var13, arg5, arg2, arg4 + arg5, arg2 + arg3 + 1);
        class230.method1469(arg6);
        class7 var14 = class230.method1466(arg6);
        class283.method1728(1, 0, var14, 0, arg6);
        if (class407.field5459 > 0) {
            class181.field2366--;
            if (class181.field2366 == 0) {
                class407.field5459--;
                class181.field2366 = 20;
            }
        }
        if (!class232.field2998) {
            return;
        }
        int var15 = arg5 + arg4 - 5;
        int var16 = arg2 + arg3 - 8;
        class43.field635.method1113(30, var15, var16, "Fps:" + class130.field1775, 16776960, -1);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class43.field635.method1113(89, var15, var20, "Mem:" + var18 + "k", var19, -1);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V", line = 189)
    public static void method1783(boolean arg0) {
        field3842 = null;
        field3845 = null;
        if (arg0) {
            field3847 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 200)
    public class296(String arg0, int arg1) {
        this.field3843 = arg1;
    }
}
