import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class123 {

    @OriginalMember(owner = "client!v", name = "a", descriptor = "J")
    public static long field2978 = 0L;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field2984 = 0;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "Lwb;")
    private static class130 field2980 = class26.method212("Could not complete login)3", -32376);

    @OriginalMember(owner = "client!v", name = "f", descriptor = "Lwb;")
    private static class130 field2983 = class26.method212("Malformed login packet)3", -32376);

    @OriginalMember(owner = "client!v", name = "b", descriptor = "Lwb;")
    public static class130 field2979 = field2980;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "Lwb;")
    public static class130 field2988 = class26.method212("Der Anmelde)2Server ist offline)3", -32376);

    @OriginalMember(owner = "client!v", name = "m", descriptor = "Lwb;")
    public static class130 field2990 = field2983;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "Lge;")
    public static class41 field2985 = new class41(64);

    @OriginalMember(owner = "client!v", name = "n", descriptor = "[I")
    public static int[] field2991 = new int[50];

    @OriginalMember(owner = "client!v", name = "p", descriptor = "Lwb;")
    public static class130 field2993 = class26.method212(" hat sich eingeloggt)3", -32376);

    @OriginalMember(owner = "client!v", name = "q", descriptor = "Lwb;")
    public static class130 field2994 = class26.method212(" )2>", -32376);

    @OriginalMember(owner = "client!v", name = "o", descriptor = "Lge;")
    public static class41 field2992 = new class41(64);

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "Lmc;")
    public static class75 field2996;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V", line = 8)
    public static void method934(int arg0) {
        if (arg0 != 0) {
            method936(-8, 33);
        }
        field2983 = null;
        field2992 = null;
        field2990 = null;
        field2988 = null;
        field2980 = null;
        field2979 = null;
        field2991 = null;
        field2996 = null;
        field2985 = null;
        field2993 = null;
        field2994 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([BIIIIIIII[Luc;)V", line = 29)
    public static final void method935(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class121[] arg9) {
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg3 + var10 > 0 && arg3 + var10 < 103 && arg4 + var16 > 0 && arg4 + var16 < 103) {
                    arg9[arg1].field2964[arg3 + var10][arg4 + var16] = class32.method257(arg9[arg1].field2964[arg3 + var10][arg4 + var16], -16777217);
                }
            }
        }
        field2986++;
        class36 var11 = new class36(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg7 == var12 && var14 >= arg6 && var14 < arg6 + 8 && var15 >= arg8 && arg8 + 8 > var15) {
                        class40.method395(arg4 + class37.method376(arg2, -28338, var15 & 0x7, var14 & 0x7), 0, arg1, 0, var11, 12, arg2, arg3 + class53.method453(var14 & 0x7, var15 & 0x7, arg2, 74));
                    } else {
                        class40.method395(-1, 0, 0, 0, var11, 10, 0, -1);
                    }
                }
            }
        }
        int var13 = -6 / ((-arg5 - 44) / 62);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)[B", line = 106)
    public static final synchronized byte[] method936(int arg0, int arg1) {
        if (arg1 >= -85) {
            method936(104, -28);
        }
        field2989++;
        if (arg0 == 100 && class41.field1148 > 0) {
            byte[] var2 = class41.field1146[--class41.field1148];
            class41.field1146[class41.field1148] = null;
            return var2;
        } else if (arg0 == 5000 && class2.field51 > 0) {
            byte[] var3 = class65.field1664[--class2.field51];
            class65.field1664[class2.field51] = null;
            return var3;
        } else if (arg0 == 30000 && class24.field715 > 0) {
            byte[] var4 = class92.field2204[--class24.field715];
            class92.field2204[class24.field715] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lwb;B)V", line = 155)
    public static final void method937(class130 arg0, byte arg1) {
        if (arg1 != 29) {
            return;
        }
        field2987++;
        if (arg0 == null || arg0.method958((byte) -38) == 0) {
            class97.field2353 = 0;
            return;
        }
        class130 var2 = arg0;
        class130[] var3 = new class130[100];
        int var4 = 0;
        while (true) {
            int var5 = var2.method965((byte) -112, 32);
            if (var5 == -1) {
                class130 var6 = var2.method967((byte) 56);
                if (var6.method958((byte) -38) > 0) {
                    var3[var4++] = var6.method974(123);
                }
                class97.field2353 = 0;
                label50: for (int var7 = 0; var7 < class58.field1461; var7++) {
                    class67 var8 = class84.method630((byte) 11, var7);
                    if (var8.field1696 == -1 && var8.field1688 != null) {
                        class130 var9 = var8.field1688.method974(118);
                        for (int var10 = 0; var10 < var4; var10++) {
                            if (var9.method973(var3[var10], -31451) == -1) {
                                continue label50;
                            }
                        }
                        class94.field2264[class97.field2353] = var9;
                        class2.field59[class97.field2353] = var7;
                        class97.field2353++;
                        if (class97.field2353 >= class94.field2264.length) {
                            return;
                        }
                    }
                }
                return;
            }
            class130 var11 = var2.method970(true, var5, 0).method967((byte) 56);
            if (var11.method958((byte) -38) > 0) {
                var3[var4++] = var11.method974(101);
            }
            var2 = var2.method977(var5 + 1, true);
        }
    }
}
