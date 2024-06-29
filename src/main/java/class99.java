import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class99 extends class169 {

    @OriginalMember(owner = "client!c", name = "lb", descriptor = "Ldf;")
    private static class51 field1648 = class46.method233("white:", 100);

    @OriginalMember(owner = "client!c", name = "mb", descriptor = "Ldf;")
    public static class51 field1649 = class46.method233(" steht bereits auf Ihrer Freunde)2Liste(Q", 100);

    @OriginalMember(owner = "client!c", name = "sb", descriptor = "Ldf;")
    public static class51 field1655 = field1648;

    @OriginalMember(owner = "client!c", name = "qb", descriptor = "Ldf;")
    public static class51 field1653 = field1648;

    @OriginalMember(owner = "client!c", name = "rb", descriptor = "Ldf;")
    public static class51 field1654 = class46.method233("<)4col>", 100);

    @OriginalMember(owner = "client!c", name = "nb", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!c", name = "ob", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!c", name = "pb", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(BI)[[I")
    public final int[][] method46(byte arg0, int arg1) {
        ++field1652;
        int[][] var3 = super.field3285.method1548(arg1, (byte) -100);
        if (super.field3285.field3963 && this.method1175((byte) -83)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field2745 * super.field2745;
            for (int var8 = 0; ~class49.field767 < ~var8; ++var8) {
                int var9 = super.field2743[var8 % super.field2751 + var7];
                var6[var8] = class191.method1366(4080, var9 << 4);
                var5[var8] = class191.method1366(var9, 65280) >> 4;
                var4[var8] = class191.method1366(16711680, var9) >> 12;
            }
        }
        return arg0 != 11 ? null : var3;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
    public static void method727(boolean arg0) {
        field1653 = null;
        field1655 = null;
        field1654 = null;
        field1648 = null;
        if (!arg0) {
            method728((byte) -55, (class111) null);
        }
        field1649 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BLu;)V")
    public static final void method728(byte arg0, class111 arg1) {
        ++field1650;
        class100.field1658 = arg1.method810(class247.field4283, -1);
        class40.field618 = arg1.method810(class264.field4629, -1);
        class249.field4379 = arg1.method810(class238.field4145, -1);
        class211.field3507 = arg1.method810(class145.field2424, -1);
        class169.field2757 = arg1.method810(class82.field1375, -1);
        class75.field1184 = arg1.method810(class67.field1099, -1);
        class76.field1222 = arg1.method810(class234.field4108, -1);
        class95.field1572 = arg1.method810(class237.field4129, -1);
        class67.field1097 = arg1.method810(class260.field4543, -1);
        if (arg0 != -101) {
            field1654 = null;
        }
        class174.field2861 = arg1.method810(class37.field575, arg0 + 100);
        class201.field3360 = arg1.method810(class221.field3842, -1);
        class166.field2705 = arg1.method810(class214.field3720, -1);
        class192.field3206 = arg1.method810(class182.field3012, -1);
        class149.field2502 = arg1.method810(class8.field91, arg0 + 100);
        class212.field3520 = arg1.method810(class114.field1939, -1);
        class248.field4360 = arg1.method810(class222.field3892, -1);
        arg1.method810(class48.field760, arg0 ^ 100);
        class193.field3247 = arg1.method810(class248.field4370, arg0 + 100);
        class66.field1069 = arg1.method810(class14.field203, -1);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lsc;B)V")
    public static final void method729(class229 arg0, byte arg1) {
        ++field1651;
        class126 var2 = null;
        try {
            class150 var3 = arg0.method1572("runescape", -14718);
            int var4 = 86 / ((arg1 - -45) / 40);
            while (~var3.field2504 == -1) {
                class147.method1066(1L, 0);
            }
            if (var3.field2504 == 1) {
                var2 = (class126) var3.field2505;
                class121 var5 = class31.method155((byte) -104);
                var2.method940((byte) 106, 0, var5.field2026, var5.field2014);
            }
        } catch (Exception var7) {
        }
        try {
            if (var2 != null) {
                var2.method937(0);
            }
        } catch (Exception var6) {
        }
    }
}
