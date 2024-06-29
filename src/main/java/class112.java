import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class112 {

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "Lqb;")
    public static class209 field2022 = new class209(64);

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "[J")
    public static long[] field2026 = new long[100];

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public static int field2028 = 0;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
    public static int field2031 = 0;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "Lbd;")
    public static class162 field2030 = class17.method142(0, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "[I")
    public static int[] field2033 = new int[4096];

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "Lbd;")
    private static class162 field2027 = class17.method142(0, "K");

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "Lbd;")
    public static class162 field2029 = field2027;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "Lbd;")
    public static class162 field2032 = field2027;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "[Lbd;")
    public static class162[] field2025;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V", line = 4)
    public static void method898(boolean arg0) {
        field2025 = null;
        field2026 = null;
        field2032 = null;
        if (!arg0) {
            return;
        }
        field2027 = null;
        field2030 = null;
        field2029 = null;
        field2033 = null;
        field2022 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)Llm;", line = 21)
    public static final class43 method899(int arg0, int arg1, int arg2) {
        class225 var3 = class288.field4856[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3756; var4++) {
            class43 var5 = var3.field3765[var4];
            if ((var5.field697 >> 29 & 0x3L) == 2L && var5.field711 == arg1 && var5.field699 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V", line = 45)
    public static final void method900(int arg0) {
        for (int var1 = 0; var1 < class267.field4446; var1++) {
            int var2 = class181.field3118[var1];
            class39 var3 = class270.field4520[var2];
            int var4 = class63.field975.method756(915905888);
            if ((var4 & 0x4) != 0) {
                var4 += class63.field975.method756(915905888) << 8;
            }
            class165.method1300((byte) 66, var3, var2, var4);
        }
        field2024++;
        if (arg0 >= -72) {
            method903(104, -41, -80);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BII)V", line = 79)
    public static final void method901(byte arg0, int arg1, int arg2) {
        field2019++;
        class70 var3 = class111.method897((byte) -60, arg2);
        if (arg0 != 96) {
            method900(-42);
        }
        int var4 = var3.field1116;
        int var5 = var3.field1122;
        int var6 = var3.field1118;
        int var7 = class129.field2332[var4 - var6];
        if (arg1 < 0 || var7 < arg1) {
            arg1 = 0;
        }
        int var8 = var7 << var6;
        class153.method1192(var5, -3917, arg1 << var6 & var8 | ~var8 & class263.field4389[var5]);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILda;II)Lud;", line = 105)
    public static final class79 method902(int arg0, class143 arg1, int arg2, int arg3) {
        field2020++;
        if (class94.method757(arg1, arg2, -1908303920, arg0)) {
            return arg3 == 29 ? class1.method6((byte) -81) : (class79) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(III)Lob;", line = 125)
    public static final class78 method903(int arg0, int arg1, int arg2) {
        field2023++;
        if (arg2 != -25988) {
            method899(32, -21, 82);
        }
        class78 var3 = class61.method419((byte) 28, arg0);
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field1363 == null || var3.field1363.length <= arg1) {
            return null;
        } else {
            return var3.field1363[arg1];
        }
    }
}
