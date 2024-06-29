import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class130 {

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "J")
    public static volatile long field2015 = 0L;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "Luf;")
    public static class168 field2020 = class148.method1019(-1720, "event_opbase");

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "[I")
    public static int[] field2019 = new int[5];

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    public static int field2027 = 0;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public int field2012;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public int field2013;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public int field2017;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    public int field2026;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "J")
    public long field2021;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "Lf;")
    public class231 field2014;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "Lf;")
    public class231 field2016;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "Lf;")
    public class231 field2018;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "Lwa;")
    public static class284 field2022;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V", line = 5)
    public static void method909(int arg0) {
        field2022 = null;
        if (arg0 != 3) {
            method913(17);
        }
        field2020 = null;
        field2019 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)Lg;", line = 31)
    public static final class242 method910(byte arg0, int arg1) {
        field2011++;
        int var2 = arg1 >> 16;
        if (arg0 > -77) {
            method909(-3);
        }
        int var3 = arg1 & 0xFFFF;
        if (class272.field4582[var2] == null || class272.field4582[var2][var3] == null) {
            boolean var4 = class18.method83((byte) -126, var2);
            if (!var4) {
                return null;
            }
        }
        return class272.field4582[var2][var3];
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILtb;)V", line = 61)
    public static final void method911(int arg0, class189 arg1) {
        int var2 = arg1.field3036 - class203.field3335;
        if (arg1.field3018 == 0) {
            arg1.field3037 = 1024;
        }
        field2023++;
        arg1.field3016 = 0;
        if (arg1.field3018 == 1) {
            arg1.field3037 = 1536;
        }
        if (arg1.field3018 == 2) {
            arg1.field3037 = 0;
        }
        if (arg1.field3018 == 3) {
            arg1.field3037 = 512;
        }
        int var3 = arg1.field3019 * 128 + arg1.field3012 * 64;
        arg1.field3027 += (var3 - arg1.field3027) / var2;
        int var4 = arg1.field3000 * arg0 + (arg1.field3012 * 64);
        arg1.field3021 += (var4 - arg1.field3021) / var2;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)Lfg;", line = 91)
    public static final class72 method912(byte arg0) {
        if (arg0 != 108) {
            field2022 = (class284) null;
        }
        field2024++;
        try {
            return (class72) Class.forName("fd").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V", line = 126)
    public static final void method913(int arg0) {
        class79.field1130 = new class127[arg0][class117.field1821][class244.field4160];
        class271.field4565 = new int[class117.field1821][class244.field4160];
        class118.field1835 = new int[arg0][class117.field1821 + 1][class244.field4160 + 1];
        class156.field2471 = new class192[arg0][];
    }
}
