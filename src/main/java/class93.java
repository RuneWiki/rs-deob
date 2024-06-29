import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class93 {

    @OriginalMember(owner = "client!p", name = "b", descriptor = "Lmh;")
    public static class128 field1576 = class22.method156(125, ":duelfriend:");

    @OriginalMember(owner = "client!p", name = "f", descriptor = "Lmh;")
    public static class128 field1580 = class22.method156(126, ")4");

    @OriginalMember(owner = "client!p", name = "a", descriptor = "Ls;")
    public static class261 field1575 = new class261(4);

    @OriginalMember(owner = "client!p", name = "g", descriptor = "[I")
    public static int[] field1581 = new int[5];

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)I", line = 8)
    public static final int method582(int arg0) {
        field1578++;
        if (arg0 >= -68) {
            field1576 = (class128) null;
        }
        return class222.field3901;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IB)V", line = 27)
    public static final void method583(int arg0, byte arg1) {
        field1577++;
        for (class155 var2 = (class155) class129.field2257.method729(-93); var2 != null; var2 = (class155) class129.field2257.method732(1)) {
            if ((var2.field4915 >> 48 & 0xFFFFL) == (long) arg0) {
                var2.method1978((byte) 41);
            }
        }
        if (arg1 >= -89) {
            field1580 = (class128) null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V", line = 51)
    public static void method584(byte arg0) {
        field1581 = null;
        if (arg0 > 2) {
            field1580 = null;
            field1575 = null;
            field1576 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V", line = 64)
    public static final void method585(byte arg0) {
        if (arg0 != -77) {
            return;
        }
        class298.field5086 = -1;
        class102.field1749 = 0;
        class203.field3594 = 0;
        class283.field4872 = 0;
        class271.field4721 = false;
        class206.field3622 = -1;
        field1579++;
        class189.field3284 = -1;
        client.field4158 = -1;
        class71.field1320.field3380 = 0;
        class219.field3863 = 0;
        class32.field713 = 0;
        class54.field1051.field3380 = 0;
        class275.field4769 = 0;
        for (int var1 = 0; var1 < class140.field2405.length; var1++) {
            if (class140.field2405[var1] != null) {
                class140.field2405[var1].field458 = -1;
            }
        }
        for (int var2 = 0; var2 < class201.field3560.length; var2++) {
            if (class201.field3560[var2] != null) {
                class201.field3560[var2].field458 = -1;
            }
        }
        class233.method1603(arg0 + 109);
        class1.field21 = 1;
        class298.method2039((byte) -52, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class26.field581[var3] = true;
        }
        class81.method518(0);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIII)Z", line = 120)
    public static final boolean method586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class289.field4943[arg0][var8][var9] == -class99.field1712) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class250.field4334[arg0][arg1][arg3] + arg5;
            if (!class62.method409(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class62.method409(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class62.method409(var10, var12, var14)) {
                return false;
            } else if (class62.method409(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class74.method488(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class62.method409(var6 + 1, class250.field4334[arg0][arg1][arg3] + arg5, var7 + 1) && class62.method409(var6 + 128 - 1, class250.field4334[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class62.method409(var6 + 128 - 1, class250.field4334[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class62.method409(var6 + 1, class250.field4334[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }
}
