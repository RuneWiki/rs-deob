import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public abstract class class104 {

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "Lqe;")
    public static class168 field1672 = null;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "Lui;")
    public static class236 field1673 = new class236(16);

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "[Lhh;")
    public static class121[] field1677 = new class121[2048];

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public static int field1678 = 0;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIII)V")
    public static final void method690(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1671++;
        if (arg1 == arg4) {
            class161.method1046(true, arg1, arg2, arg0, arg5);
            return;
        }
        if (arg0 - arg1 >= class174.field3055 && arg0 + arg1 <= class249.field4314 && class222.field3811 <= arg2 - arg4 && arg2 + arg4 <= class196.field3402) {
            class205.method1330(arg1, -1, arg4, arg0, arg2, arg5);
        } else {
            class247.method1619(arg1, 111, arg0, arg2, arg5, arg4);
        }
        if (arg3 != -17654) {
            field1672 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static void method691(int arg0) {
        field1672 = null;
        field1677 = null;
        if (arg0 != 18707) {
            field1675 = 101;
        }
        field1673 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILtb;IIII)V")
    public static final void method692(int arg0, int arg1, class52 arg2, int arg3, int arg4, int arg5, int arg6) {
        long var7 = 0L;
        if (arg5 == 0) {
            var7 = class186.method1213(arg1, arg3, arg0);
        } else if (arg5 == 1) {
            var7 = class87.method578(arg1, arg3, arg0);
        } else if (arg5 == 2) {
            var7 = class94.method622(arg1, arg3, arg0);
        } else if (arg5 == 3) {
            var7 = class23.method117(arg1, arg3, arg0);
        }
        boolean var9 = true;
        int var10 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        field1669++;
        boolean var11 = false;
        class70 var12 = class190.method1232(var10, 13090);
        if (var12.method482(-1)) {
            class245.method1607(128, arg0, arg3, arg1, var12);
        }
        int var13 = 27 % ((-arg4 - 7) / 50);
        int var14 = (int) var7 >> 14 & 0x1F;
        boolean var15 = false;
        int var16 = (int) var7 >> 20 & 0x3;
        if (var7 == 0L) {
            return;
        }
        if (arg5 == 0) {
            class46.method307(arg1, arg3, arg0);
            if (var12.field1022 != 0) {
                arg2.method360(-109, var16, var12.field1025, arg3, var14, arg0);
                return;
            }
        } else if (arg5 == 1) {
            class34.method215(arg1, arg3, arg0);
        } else if (arg5 == 2) {
            class147.method987(arg1, arg3, arg0);
            if (var12.field1022 != 0 && var12.field1059 + arg3 < 104 && var12.field1059 + arg0 < 104 && var12.field1048 + arg3 < 104 && arg0 + var12.field1048 < 104) {
                arg2.method362(var12.field1048, var12.field1025, var16, arg3, true, arg0, var12.field1059);
                return;
            }
            return;
        } else if (arg5 == 3) {
            class133.method898(arg1, arg3, arg0);
            if (var12.field1022 == 1) {
                arg2.method366(arg3, true, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
    public abstract void method693(byte arg0);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIILmj;)V")
    public static final void method694(int arg0, int arg1, int arg2, class129 arg3) {
        field1674++;
        if (class242.field4198 != 0 && class242.field4198 != 3 || !arg3.method874((byte) -78)) {
            return;
        }
        int var4 = arg3.field2150[arg0];
        if (var4 > arg2 || arg3.field2206[arg0] + var4 < arg2) {
            return;
        }
        int var5 = arg2 - arg3.field2175 / 2;
        int var6 = class159.field2742 + class103.field1665 & 0x7FF;
        int var7 = class248.field4297[var6];
        int var8 = class248.field4301[var6];
        int var9 = (class100.field1583 + 256) * var7 >> 8;
        if (arg1 > -10) {
            method690(122, -122, -54, 53, 64, 26);
        }
        int var10 = (class100.field1583 + 256) * var8 >> 8;
        int var11 = arg0 - arg3.field2210 / 2;
        int var12 = var5 * var10 + var9 * var11 >> 11;
        int var13 = var10 * var11 - var5 * var9 >> 11;
        int var14 = class7.field85.field190 + var12 >> 7;
        int var15 = class7.field85.field166 - var13 >> 7;
        boolean var16 = class88.method585(1, 0, var14, 0, 0, 0, class7.field85.field206[0], true, class7.field85.field219[0], var15, (byte) 26, 0);
        if (!var16) {
            return;
        }
        class87.field1348.method768(var5, 7295);
        class87.field1348.method768(var11, 7295);
        class87.field1348.method753(class103.field1665, -242005080);
        class87.field1348.method768(57, 7295);
        class87.field1348.method768(class159.field2742, 7295);
        class87.field1348.method768(class100.field1583, 7295);
        class87.field1348.method768(89, 7295);
        class87.field1348.method753(class7.field85.field190, -242005080);
        class87.field1348.method753(class7.field85.field166, -242005080);
        class87.field1348.method768(class187.field3286, 7295);
        class87.field1348.method768(63, 7295);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)I")
    public abstract int method695(int arg0, int arg1, int arg2);
}
