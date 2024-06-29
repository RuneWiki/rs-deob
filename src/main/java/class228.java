import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class228 extends class240 {

    @OriginalMember(owner = "client!of", name = "U", descriptor = "[I")
    public static int[] field3873 = new int[4096];

    @OriginalMember(owner = "client!of", name = "R", descriptor = "Lig;")
    public static class168 field3870 = new class168(64);

    @OriginalMember(owner = "client!of", name = "Y", descriptor = "S")
    public static short field3877 = 256;

    @OriginalMember(owner = "client!of", name = "Z", descriptor = "I")
    public static int field3878 = 0;

    @OriginalMember(owner = "client!of", name = "O", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!of", name = "P", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!of", name = "Q", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!of", name = "S", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!of", name = "T", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!of", name = "V", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!of", name = "W", descriptor = "Loa;")
    public static class275 field3875;

    @OriginalMember(owner = "client!of", name = "X", descriptor = "Lte;")
    public static class282 field3876;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "(B)[Lqd;", line = 4)
    public static final class40[] method1646(byte arg0) {
        field3867++;
        class40[] var1 = new class40[class265.field4554];
        if (arg0 < 11) {
            method1646((byte) -26);
        }
        for (int var2 = 0; var2 < class265.field4554; var2++) {
            int var3 = class310.field5263[var2] * class223.field3811[var2];
            byte[] var4 = class58.field969[var2];
            if (class119.field2162[var2]) {
                byte[] var7 = class194.field3304[var2];
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class11.method91(class236.field3985[class224.method1614(255, var4[var9])], class224.method1614(-16777216, var7[var9] << 24));
                }
                if (class123.field2216) {
                    var1[var2] = new class311(class24.field400, class46.field755, class234.field3959[var2], class251.field4365[var2], class223.field3811[var2], class310.field5263[var2], var8);
                } else {
                    var1[var2] = new class208(class24.field400, class46.field755, class234.field3959[var2], class251.field4365[var2], class223.field3811[var2], class310.field5263[var2], var8);
                }
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class236.field3985[class224.method1614(255, var4[var6])];
                }
                if (class123.field2216) {
                    var1[var2] = new class136(class24.field400, class46.field755, class234.field3959[var2], class251.field4365[var2], class223.field3811[var2], class310.field5263[var2], var5);
                } else {
                    var1[var2] = new class127(class24.field400, class46.field755, class234.field3959[var2], class251.field4365[var2], class223.field3811[var2], class310.field5263[var2], var5);
                }
            }
        }
        class251.method1803(-1);
        return var1;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V", line = 74)
    public class228() {
        super(0, true);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)[I", line = 80)
    public final int[] method12(int arg0, int arg1) {
        if (arg0 != 64) {
            method1646((byte) -81);
        }
        int[] var3 = this.field4094.method179(arg1, true);
        field3868++;
        if (this.field4094.field344) {
            int var4 = class268.field4615[arg1];
            for (int var5 = 0; var5 < class169.field2936; var5++) {
                var3[var5] = this.method1648((byte) -61, var4, class74.field1408[var5]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILcd;)V", line = 111)
    public static final void method1647(int arg0, class64 arg1) {
        class145.field2560 = arg1;
        field3874++;
        if (field3876.field4845 == null) {
            return;
        }
        try {
            class64 var2 = class162.field2841.method505((byte) 60, field3876.field4845);
            class64 var3 = class12.field238.method505((byte) 75, field3876.field4845);
            class64 var4 = class104.method768(new class64[] { var2, class263.field4519, arg1, class138.field2451, var3 }, false);
            class64 var5;
            if (arg1.method540(28981) == 0) {
                var5 = class104.method768(new class64[] { var4, class266.field4573 }, false);
            } else {
                var5 = class104.method768(new class64[] { var4, class261.field4484, class10.method88(class154.method1114(true) + 94608000000L, 11), class202.field3455, class275.method1909(94608000L, (byte) -55) }, false);
            }
            class104.method768(new class64[] { class149.field2607, var5, class255.field4435 }, false).method513(-25286, field3876.field4845);
        } catch (Throwable var7) {
        }
        if (arg0 != -5164) {
            method1646((byte) -103);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BII)I", line = 151)
    private final int method1648(byte arg0, int arg1, int arg2) {
        field3871++;
        int var4 = -38 % ((2 - arg0) / 57);
        int var5 = arg1 * 57 + arg2;
        int var6 = var5 << 1 ^ var5;
        return 4096 - ((Integer.MAX_VALUE & (var6 * var6 * 15731 + 789221) * var6 + 1376312589) / 262144);
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(III)I", line = 164)
    public static final int method1649(int arg0, int arg1, int arg2) {
        field3869++;
        int var3 = class281.method1941(0, 4, arg0 + 91923, arg2 + 45365) - (128 - (class281.method1941(0, 2, arg0 + 37821, arg2 + 10294) - 128 >> 1) - (class281.method1941(0, 1, arg0, arg2) - 128 >> 2));
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (arg1 >= -71) {
            return 93;
        }
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!of", name = "f", descriptor = "(B)V", line = 187)
    public static void method1650(byte arg0) {
        field3875 = null;
        if (arg0 <= -62) {
            field3876 = null;
            field3870 = null;
            field3873 = null;
        }
    }
}
