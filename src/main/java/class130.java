import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class130 {

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "Lta;")
    public static class262 field2018 = new class262(500);

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "Z")
    public static boolean field2019 = true;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "Z")
    public static boolean field2020 = false;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "Lta;")
    public static class262 field2023 = new class262(64);

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "[Z")
    public static boolean[] field2025 = new boolean[100];

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "Luf;")
    public static class176 field2021;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "[I")
    public static int[] field2024;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public static final void method916(int arg0) {
        field2022++;
        if (class46.field737 != null) {
            class46.field737.method64((byte) -106);
        }
        if (class33.field531 != null) {
            class33.field531.method64((byte) -106);
        }
        if (arg0 > -106) {
            field2020 = true;
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
    public static final void method917(int arg0) {
        if (arg0 >= 44) {
            field2017++;
            class70.field1120.method1782(104);
            class39.field649.method1782(-106);
            class203.field3169.method1782(116);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIII)V")
    public static final void method918(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg4; var6 <= arg1 + arg4; var6++) {
            for (int var12 = arg5; var12 <= (arg3 + arg5); var12++) {
                if (var12 >= 0 && var12 < 104 && var6 >= 0 && var6 < 104) {
                    class113.field1782[arg0][var12][var6] = 127;
                }
            }
        }
        int var7 = arg4;
        int var8 = -94 % ((34 - arg2) / 56);
        while ((arg1 + arg4) > var7) {
            for (int var11 = arg5; var11 < (arg3 + arg5); var11++) {
                if (var11 >= 0 && var11 < 104 && var7 >= 0 && var7 < 104) {
                    class68.field1079[arg0][var11][var7] = arg0 > 0 ? class68.field1079[arg0 - 1][var11][var7] : 0;
                }
            }
            var7++;
        }
        if (arg5 > 0 && arg5 < 104) {
            for (int var9 = arg4 + 1; var9 < arg4 + arg1; var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class68.field1079[arg0][arg5][var9] = class68.field1079[arg0][arg5 - 1][var9];
                }
            }
        }
        field2014++;
        if (arg4 > 0 && arg4 < 104) {
            for (int var10 = arg5 + 1; var10 < (arg3 + arg5); var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class68.field1079[arg0][var10][arg4] = class68.field1079[arg0][var10][arg4 - 1];
                }
            }
        }
        if (arg5 < 0 || arg4 < 0 || arg5 >= 104 || arg4 >= 104) {
            return;
        }
        if (arg0 == 0) {
            if (arg5 > 0 && class68.field1079[arg0][arg5 - 1][arg4] != 0) {
                class68.field1079[arg0][arg5][arg4] = class68.field1079[arg0][arg5 - 1][arg4];
                return;
            }
            if (arg4 > 0 && class68.field1079[arg0][arg5][arg4 - 1] != 0) {
                class68.field1079[arg0][arg5][arg4] = class68.field1079[arg0][arg5][arg4 - 1];
                return;
            }
            if (arg5 > 0 && arg4 > 0 && class68.field1079[arg0][arg5 - 1][arg4 - 1] != 0) {
                class68.field1079[arg0][arg5][arg4] = class68.field1079[arg0][arg5 - 1][arg4 - 1];
                return;
            }
        } else if (arg5 <= 0 || class68.field1079[arg0 - 1][arg5 - 1][arg4] == class68.field1079[arg0][arg5 - 1][arg4]) {
            if (arg4 > 0 && class68.field1079[arg0 - 1][arg5][arg4 - 1] != class68.field1079[arg0][arg5][arg4 - 1]) {
                class68.field1079[arg0][arg5][arg4] = class68.field1079[arg0][arg5][arg4 - 1];
                return;
            }
            if (arg5 > 0 && arg4 > 0 && class68.field1079[arg0][arg5 - 1][arg4 - 1] != class68.field1079[arg0 - 1][arg5 - 1][arg4 - 1]) {
                class68.field1079[arg0][arg5][arg4] = class68.field1079[arg0][arg5 - 1][arg4 - 1];
                return;
            }
            return;
        } else {
            class68.field1079[arg0][arg5][arg4] = class68.field1079[arg0][arg5 - 1][arg4];
        }
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)V")
    public static void method919(int arg0) {
        field2018 = null;
        field2024 = null;
        field2021 = null;
        field2025 = null;
        field2023 = null;
        int var1 = -1 / ((arg0 + 29) / 42);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZLuf;)I")
    public static final int method920(boolean arg0, class176 arg1) {
        int var2 = 0;
        field2016++;
        if (arg1.method1147(class241.field3730, -63)) {
            var2++;
        }
        if (arg1.method1147(class35.field570, -103)) {
            var2++;
        }
        if (arg1.method1147(class127.field1997, -105)) {
            var2++;
        }
        if (arg1.method1147(class21.field318, -59)) {
            var2++;
        }
        if (arg1.method1147(class116.field1799, -88)) {
            var2++;
        }
        if (arg1.method1147(class210.field3259, -111)) {
            var2++;
        }
        if (arg1.method1147(class206.field3205, -77)) {
            var2++;
        }
        if (arg1.method1147(class22.field327, -126)) {
            var2++;
        }
        if (arg1.method1147(class167.field2526, -84)) {
            var2++;
        }
        if (arg1.method1147(class257.field3946, -95)) {
            var2++;
        }
        if (arg1.method1147(class290.field4572, -106)) {
            var2++;
        }
        if (arg1.method1147(class62.field999, -126)) {
            var2++;
        }
        if (!arg0) {
            method920(false, (class176) null);
        }
        if (arg1.method1147(class206.field3203, -56)) {
            var2++;
        }
        if (arg1.method1147(class117.field1821, -116)) {
            var2++;
        }
        if (arg1.method1147(class262.field4090, -75)) {
            var2++;
        }
        return var2;
    }
}
