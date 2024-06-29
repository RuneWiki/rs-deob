import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class253 {

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field4412 = 0;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "[I")
    public static int[] field4413 = new int[32];

    @OriginalMember(owner = "client!da", name = "g", descriptor = "Lsc;")
    public static class181 field4411 = class149.method967(255, ":clan:");

    @OriginalMember(owner = "client!da", name = "k", descriptor = "Lsc;")
    private static class181 field4415 = class149.method967(255, "Connection lost)3");

    @OriginalMember(owner = "client!da", name = "j", descriptor = "Lsc;")
    public static class181 field4414 = class149.method967(255, "Null");

    @OriginalMember(owner = "client!da", name = "c", descriptor = "Lsc;")
    public static class181 field4407 = field4415;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "Ljd;")
    public static class265 field4417 = new class265(32);

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field4421 = 0;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "Lsc;")
    public static class181 field4419 = class149.method967(255, "");

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "[I")
    public static int[] field4416;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "[[[I")
    public static int[][][] field4418;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BJ)V")
    public static final void method1720(byte arg0, long arg1) {
        field4410++;
        if (arg1 == 0L) {
            return;
        }
        if (class221.field3815 >= 100) {
            class202.method1357(class247.field4313, 0, (byte) -119, class241.field4187);
            return;
        }
        class181 var3 = class19.method184(-26890, arg1).method1223((byte) -57);
        int var4 = 0;
        if (arg0 != 99) {
            return;
        }
        while (class221.field3815 > var4) {
            if (class256.field4483[var4] == arg1) {
                class202.method1357(class175.method1164(new class181[] { var3, class155.field2575 }, (byte) 126), 0, (byte) -119, class241.field4187);
                return;
            }
            var4++;
        }
        for (int var5 = 0; var5 < class149.field2483; var5++) {
            if (class182.field3213[var5] == arg1) {
                class202.method1357(class175.method1164(new class181[] { class218.field3740, var3, class208.field3564 }, (byte) 127), 0, (byte) -116, class241.field4187);
                return;
            }
        }
        if (var3.method1202(class258.field4507.field1883, arg0 ^ 0xFFFFEE50)) {
            class202.method1357(class199.field3450, 0, (byte) -104, class241.field4187);
            return;
        }
        class256.field4483[class221.field3815] = arg1;
        class218.field3755[class221.field3815++] = class19.method184(arg0 - 26989, arg1);
        class7.field122 = class247.field4318;
        class141.field2275.method541(1, 100);
        class141.field2275.method1511(false, arg1);
        class71.field1136++;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)Lsc;")
    public static final class181 method1721(byte arg0, int arg1) {
        field4405++;
        if (arg1 < 100000) {
            return class175.method1164(new class181[] { class39.field604, class169.method1119((byte) -118, arg1), class124.field2031 }, (byte) 124);
        } else {
            if (arg0 > -49) {
                method1725(-1, -4, 57, -6, 11, 111);
            }
            return arg1 < 10000000 ? class175.method1164(new class181[] { class94.field1511, class169.method1119((byte) 81, arg1 / 1000), class120.field1954, class124.field2031 }, (byte) 123) : class175.method1164(new class181[] { class221.field3816, class169.method1119((byte) 101, arg1 / 1000000), class239.field4156, class124.field2031 }, (byte) 123);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static void method1722(int arg0) {
        field4418 = null;
        field4411 = null;
        field4407 = null;
        field4419 = null;
        field4413 = null;
        if (arg0 != 0) {
            method1721((byte) 115, 29);
        }
        field4417 = null;
        field4415 = null;
        field4416 = null;
        field4414 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZZ)V")
    public static final void method1723(boolean arg0, boolean arg1) {
        if (arg1) {
            method1722(-77);
        }
        field4408++;
        byte var2 = 4;
        byte[][] var3 = class121.field1989;
        for (int var4 = 0; var4 < var2; var4++) {
            class4.method36((byte) 18);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class27.field466[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x3A6BB08) >> 24;
                        if (!arg0 || var8 == 0) {
                            int var9 = (var7 & 0x7) >> 1;
                            int var10 = (var7 & 0xFFC41A) >> 14;
                            int var11 = (var7 & 0x3FFA) >> 3;
                            int var12 = (var10 / 8 << 8) + (var11 / 8);
                            for (int var13 = 0; var13 < class78.field1264.length; var13++) {
                                if (class78.field1264[var13] == var12 && var3[var13] != null) {
                                    class84.method568(var5 * 8, (var10 & 0x7) * 8, var8, var4, (var11 & 0x7) * 8, class109.field1784, var9, var6 * 8, var3[var13], 75, arg0);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIZII)V")
    public static final void method1724(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field4406++;
        if (arg3 == 1490393848 && class77.method537(-1, arg1)) {
            class116.method773(class208.field3563[arg1], arg2, -1, arg4, -25117, arg0);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIII)V")
    public static final void method1725(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != -11483) {
            return;
        }
        if (arg1 >= class11.field219 && class124.field2032 >= arg0 && class23.field408 <= arg2 && arg4 <= class125.field2056) {
            class126.method817(arg5, arg4, arg0, arg2, arg3 ^ 0x3E71, arg1);
        } else {
            class60.method435(arg1, false, arg4, arg5, arg2, arg0);
        }
        field4409++;
    }
}
