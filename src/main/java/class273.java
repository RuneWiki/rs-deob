import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class273 {

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "Lck;")
    private static class119 field4482 = class298.method1987((byte) 97, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "Lck;")
    private static class119 field4485 = class298.method1987((byte) 56, "flash3:");

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "Lck;")
    public static class119 field4481 = field4485;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "Lck;")
    public static class119 field4484 = field4485;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "Lck;")
    public static class119 field4480 = field4482;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "Lva;")
    public static class36 field4478;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "[[[B")
    public static byte[][][] field4487;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIILvc;Lvc;IIIIJ)V", line = 10)
    public static final void method1803(int arg0, int arg1, int arg2, int arg3, class293 arg4, class293 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class106 var12 = new class106();
        var12.field1617 = arg10;
        var12.field1622 = arg1 * 128 + 64;
        var12.field1621 = arg2 * 128 + 64;
        var12.field1624 = arg3;
        var12.field1627 = arg4;
        var12.field1633 = arg5;
        var12.field1635 = arg6;
        var12.field1629 = arg7;
        var12.field1634 = arg8;
        var12.field1628 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class150.field2390[var13][arg1][arg2] == null) {
                class150.field2390[var13][arg1][arg2] = new class104(var13, arg1, arg2);
            }
        }
        class150.field2390[arg0][arg1][arg2].field1590 = var12;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)I", line = 39)
    public static final int method1804(int arg0, int arg1, int arg2) {
        class142 var3 = (class142) class185.field2933.method1329((byte) 90, (long) arg1);
        field4488++;
        if (var3 == null) {
            return -1;
        } else {
            if (arg0 != -27237) {
                field4483 = 116;
            }
            return arg2 >= 0 && var3.field2265.length > arg2 ? var3.field2265[arg2] : -1;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V", line = 81)
    public static void method1805(int arg0) {
        field4478 = null;
        field4485 = null;
        field4487 = (byte[][][]) null;
        if (arg0 == 0) {
            field4480 = null;
            field4482 = null;
            field4481 = null;
            field4484 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBI)V", line = 102)
    public static final void method1806(int arg0, byte arg1, int arg2) {
        field4479++;
        if (class157.field2504 != arg0) {
            class157.field2505 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class157.field2505[var3] = (var3 << 12) / arg0;
            }
            class88.field1353 = arg0 == 64 ? 2048 : 4096;
            class254.field4088 = arg0 - 1;
            class157.field2504 = arg0;
        }
        if (class227.field3621 != arg2) {
            if (class157.field2504 == arg2) {
                class215.field3424 = class157.field2505;
            } else {
                class215.field3424 = new int[arg2];
                for (int var4 = 0; var4 < arg2; var4++) {
                    class215.field3424[var4] = (var4 << 12) / arg2;
                }
            }
            class59.field945 = arg2 - 1;
            class227.field3621 = arg2;
        }
        if (arg1 != 120) {
            method1806(-124, (byte) 100, 51);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIII)Z", line = 159)
    public static final boolean method1807(int arg0, int arg1, int arg2, int arg3) {
        if (class216.method1360(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class114.method727(var4 + 1, class57.field926[arg0][arg1][arg2] + arg3, var5 + 1) && class114.method727(var4 + 128 - 1, class57.field926[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class114.method727(var4 + 128 - 1, class57.field926[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class114.method727(var4 + 1, class57.field926[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)V", line = 214)
    public static final void method1808(int arg0, int arg1) {
        field4489++;
        class179 var2 = class53.method397(arg1, arg0 + 999, arg0);
        var2.method1146((byte) -78);
    }
}
