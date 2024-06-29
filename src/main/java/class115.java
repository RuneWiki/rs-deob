import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class115 extends class179 {

    @OriginalMember(owner = "client!mm", name = "bb", descriptor = "I")
    private int field2028 = 4096;

    @OriginalMember(owner = "client!mm", name = "W", descriptor = "I")
    public static int field2023 = 0;

    @OriginalMember(owner = "client!mm", name = "Y", descriptor = "[I")
    public static int[] field2025 = new int[100];

    @OriginalMember(owner = "client!mm", name = "X", descriptor = "Lke;")
    private static class256 field2024 = class316.method2202("red:", 27626);

    @OriginalMember(owner = "client!mm", name = "Z", descriptor = "Z")
    public static boolean field2026 = true;

    @OriginalMember(owner = "client!mm", name = "R", descriptor = "Lke;")
    public static class256 field2018 = field2024;

    @OriginalMember(owner = "client!mm", name = "cb", descriptor = "Lke;")
    public static class256 field2029 = class316.method2202("glissement:", 27626);

    @OriginalMember(owner = "client!mm", name = "ab", descriptor = "Lke;")
    public static class256 field2027 = field2024;

    @OriginalMember(owner = "client!mm", name = "Q", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!mm", name = "S", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!mm", name = "T", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!mm", name = "V", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!mm", name = "db", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!mm", name = "U", descriptor = "[[B")
    public static byte[][] field2021;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILke;)V", line = 4)
    public static final void method787(int arg0, class256 arg1) {
        field2017++;
        if (class284.field4914 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg1.method1780(true);
        if (var3 == 0L || arg0 < 51) {
            return;
        }
        while (var2 < class284.field4914.length && class284.field4914[var2].field2895 != var3) {
            var2++;
        }
        if (class284.field4914.length > var2 && class284.field4914[var2] != null) {
            class308.field5322.method1599(34, (byte) -90);
            class74.field1358++;
            class308.field5322.method330(255, class284.field4914[var2].field2895);
        }
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(II)V", line = 49)
    public static final void method788(int arg0, int arg1) {
        field2019++;
        if (arg1 == -25207 && class31.field490 == null || class31.field490.length < arg0) {
            class31.field490 = new int[arg0];
        }
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "()V", line = 75)
    public class115() {
        super(1, true);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILra;I)V", line = 81)
    public final void method54(int arg0, class41 arg1, int arg2) {
        if (arg0 <= 108) {
            field2023 = -122;
        }
        if (arg2 == 0) {
            this.field2028 = arg1.method346(-16);
        }
        field2022++;
    }

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "(I)V", line = 102)
    public static void method789(int arg0) {
        if (arg0 > -84) {
            method789(46);
        }
        field2029 = null;
        field2021 = (byte[][]) null;
        field2025 = null;
        field2018 = null;
        field2024 = null;
        field2027 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)[I", line = 122)
    public final int[] method41(int arg0, int arg1) {
        if (arg1 != -31598) {
            field2025 = (int[]) null;
        }
        int[] var3 = this.field3157.method1258(-63, arg0);
        if (this.field3157.field3081) {
            int[] var4 = this.method1312(0, arg0 - 1 & class19.field255, (byte) -125);
            int[] var5 = this.method1312(0, arg0, (byte) 114);
            int[] var6 = this.method1312(0, class19.field255 & arg0 + 1, (byte) 118);
            for (int var7 = 0; var7 < class161.field2858; var7++) {
                int var8 = (var6[var7] - var4[var7]) * this.field2028;
                int var9 = (var5[class285.field4945 & var7 + 1] - var5[class285.field4945 & var7 - 1]) * this.field2028;
                int var10 = var9 >> 12;
                int var11 = var10 * var10 >> 12;
                int var12 = var8 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var11 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        field2030++;
        return var3;
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "(III)V", line = 177)
    public static final void method790(int arg0, int arg1, int arg2) {
        class38 var3 = class58.method458((byte) -40, arg1);
        int var4 = var3.field687;
        int var5 = var3.field683;
        field2020++;
        if (arg2 != -24376) {
            method789(-56);
        }
        int var6 = var3.field688;
        int var7 = class59.field1063[var6 - var5];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class10.method63(var4, arg0 << var5 & var8 | class201.field3658[var4] & ~var8, true);
    }
}
