import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class580 implements class549 {

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public int field7897;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
    public int field7904;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "Ljava/lang/String;")
    public String field7898;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public int field7900;

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
    public int field7908;

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
    public int field7906;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "Lft;")
    public class4 field7907;

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
    public int field7911;

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "I")
    public int field7910;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public int field7893;

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "Lps;")
    public class105 field7909;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public int field7901;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public int field7895;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "Llja;")
    public static class744 field7903 = new class744(59, 3);

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "Lifa;")
    public static class450 field7913 = new class450();

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field7892;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field7894;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field7896;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public static int field7899;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public static int field7902;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
    public static int field7905;

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
    public static int field7912;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V", line = 8)
    public static final void method3339(byte arg0) {
        if (class388.field4979 != null) {
            class388.field4979.method1556(arg0 ^ 0xFFFFC0C6);
        }
        if (arg0 == -58) {
            field7899++;
            if (class95.field1247 != null) {
                class95.field1247.method1556(arg0 + 16186);
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILkq;)Lkq;", line = 25)
    public static final class620 method3340(int arg0, class620 arg1) {
        field7902++;
        if (arg0 != -24688) {
            return null;
        }
        class620 var2 = client.method1885(arg1);
        if (var2 == null) {
            var2 = arg1.field8500;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V", line = 43)
    public static final void method3341(int arg0) {
        if (arg0 != 1) {
            method3343(null, -6, 24);
        }
        for (int var1 = 0; var1 < class223.field2612; var1++) {
            int var2 = class764.method4235(class645.field8791 + var1, -128, class223.field2612) * class331.field4092;
            for (int var3 = 0; var3 < class331.field4092; var3++) {
                int var4 = class764.method4235(class105.field1339 + var3, -28, class331.field4092) + var2;
                if (class534.field7524[var4] == class222.field2581) {
                    class340.field4250[var4].method2948(0, 0, class603.field8149, class372.field4683, class603.field8149 * var3, class372.field4683 * var1, true, true);
                }
            }
        }
        field7905++;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BZ)Z", line = 89)
    public static final boolean method3342(byte arg0, boolean arg1) {
        int var2 = 7 / ((22 - arg0) / 63);
        field7894++;
        boolean var3 = class363.field4526.method54();
        if (var3 == arg1) {
            return true;
        }
        if (!arg1) {
            class363.field4526.method2();
        } else if (!class363.field4526.method71()) {
            arg1 = false;
        }
        if (var3 == arg1) {
            return false;
        } else {
            class118.field1503.method4295(class118.field1503.field10667, arg1 ? 1 : 0, false);
            class14.method194(true);
            return true;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([Lgda;II)V", line = 124)
    public static final void method3343(class61[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class61 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field816;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field816 > (var7 & 0x1) + var6) {
                class61 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method3343(arg0, arg1, var4 - 1);
        method3343(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)V", line = 164)
    public static void method3344(byte arg0) {
        field7903 = null;
        field7913 = null;
        if (arg0 < 121) {
            field7913 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)Llf;", line = 180)
    public final class251 method94(int arg0) {
        field7896++;
        return arg0 == 1024 ? class198.field2358 : null;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Ljava/lang/String;Lps;Lft;IIIIIIIIII)V", line = 190)
    public class580(String arg0, class105 arg1, class4 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field7897 = arg12;
        this.field7904 = arg3;
        this.field7898 = arg0;
        this.field7900 = arg8;
        this.field7908 = arg5;
        this.field7906 = arg9;
        this.field7907 = arg2;
        this.field7911 = arg11;
        this.field7910 = arg7;
        this.field7893 = arg10;
        this.field7909 = arg1;
        this.field7901 = arg4;
        this.field7895 = arg6;
    }
}
