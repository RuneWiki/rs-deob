import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class153 extends class240 {

    @OriginalMember(owner = "client!ki", name = "X", descriptor = "I")
    public static int field2714 = 100;

    @OriginalMember(owner = "client!ki", name = "Y", descriptor = "[Lcd;")
    public static class64[] field2715 = new class64[500];

    @OriginalMember(owner = "client!ki", name = "Q", descriptor = "[Z")
    public static boolean[] field2707 = new boolean[200];

    @OriginalMember(owner = "client!ki", name = "P", descriptor = "F")
    public static float field2706;

    @OriginalMember(owner = "client!ki", name = "O", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!ki", name = "R", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!ki", name = "S", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!ki", name = "T", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!ki", name = "U", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!ki", name = "V", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!ki", name = "W", descriptor = "I")
    private int field2713;

    @OriginalMember(owner = "client!ki", name = "Z", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!ki", name = "ab", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!ki", name = "bb", descriptor = "I")
    private int field2718;

    @OriginalMember(owner = "client!ki", name = "db", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!ki", name = "eb", descriptor = "I")
    private int field2721;

    @OriginalMember(owner = "client!ki", name = "cb", descriptor = "Lwb;")
    public static class145 field2719;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "(B)Ldb;", line = 4)
    public static final class175 method1103(byte arg0) {
        if (arg0 != -57) {
            field2719 = (class145) null;
        }
        class175 var1;
        if (class123.field2216) {
            var1 = new class33(class24.field400, class46.field755, class234.field3959[0], class251.field4365[0], class223.field3811[0], class310.field5263[0], class58.field969[0], class236.field3985);
        } else {
            var1 = new class176(class24.field400, class46.field755, class234.field3959[0], class251.field4365[0], class223.field3811[0], class310.field5263[0], class58.field969[0], class236.field3985);
        }
        field2711++;
        class251.method1803(-1);
        return var1;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BI)[[I", line = 29)
    public final int[][] method286(byte arg0, int arg1) {
        field2709++;
        if (arg0 <= 34) {
            field2706 = -1.2696594F;
        }
        int[][] var3 = this.field4095.method1797(arg1, -57);
        if (this.field4095.field4355) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class169.field2936; var7++) {
                var4[var7] = this.field2718;
                var5[var7] = this.field2721;
                var6[var7] = this.field2713;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "(I)V", line = 67)
    public static void method1104(int arg0) {
        field2719 = null;
        int var1 = 101 % ((arg0 - 1) / 32);
        field2707 = null;
        field2715 = null;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(IBI)V", line = 84)
    public static final void method1105(int arg0, byte arg1, int arg2) {
        field2720++;
        class105 var3 = class298.method2077(arg0, -256);
        int var4 = var3.field1941;
        int var5 = -33 % ((18 - arg1) / 37);
        int var6 = var3.field1938;
        int var7 = var3.field1934;
        int var8 = class261.field4496[var6 - var7];
        if (arg2 < 0 || arg2 > var8) {
            arg2 = 0;
        }
        int var9 = var8 << var7;
        class218.method1559(var4, arg2 << var7 & var9 | class88.field1601[var4] & ~var9, -26319);
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(I)V", line = 113)
    private class153(int arg0) {
        super(0, false);
        this.method1106(arg0, 88);
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)V", line = 123)
    private final void method1106(int arg0, int arg1) {
        field2717++;
        this.field2721 = (arg0 & 0xFF00) >> 4;
        this.field2713 = arg0 & 0xFF << 4;
        this.field2718 = arg0 >> 12 & 0xFF0;
        if (arg1 <= 76) {
            this.method1106(-27, 77);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)V", line = 141)
    public static final void method1107(int arg0, byte arg1) {
        field2708++;
        if (class128.field2277 == arg0) {
            return;
        }
        if (class128.field2277 == 0) {
            class246.method1780(-91);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (arg0 == 40) {
            class255.method1819(16234);
        }
        if (arg0 != 40 && class54.field895 != null) {
            class54.field895.method225(1);
            class54.field895 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class64.field1236 = 0;
            class9.field187 = 0;
            class112.field2076 = 1;
            class28.field453 = 0;
            class143.field2520 = 1;
            class143.method1018(-77);
        }
        if (arg0 == 5) {
            class54.method411(-28901, class3.field17);
        } else {
            class296.method2066(1);
        }
        boolean var3 = class128.field2277 == 5 || class128.field2277 == 10 || class128.field2277 == 28;
        if (var3 != var2) {
            if (var2) {
                class78.field1469 = class70.field1356;
                if (class163.field2865 == 0) {
                    class54.method418(2, 1382);
                } else {
                    class2.method7(121, class297.field5114, class70.field1356, 0, false, 255, 2);
                }
                class111.field2055.method1313((byte) 25, false);
            } else {
                class54.method418(2, 1382);
                class111.field2055.method1313((byte) 25, true);
            }
        }
        if (arg1 >= -71) {
            method1104(-70);
        }
        if (class123.field2216 && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
            class123.method866();
        }
        class128.field2277 = arg0;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILkh;)V", line = 223)
    public final void method16(int arg0, int arg1, class13 arg2) {
        if (arg1 == 0) {
            this.method1106(arg2.method111(1263702152), 104);
        }
        field2710++;
        if (arg0 != 2) {
            this.method286((byte) -44, -125);
        }
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V", line = 248)
    public class153() {
        this(0);
    }

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "(B)V", line = 255)
    public static final void method1108(byte arg0) {
        class280.field4825.method1198(false);
        if (arg0 != 3) {
            method1108((byte) -81);
        }
        field2705++;
    }
}
