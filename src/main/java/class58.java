import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class58 extends class129 {

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "Lmj;")
    public class143 field1019;

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "Ljava/lang/String;")
    public static String field1012 = "purple:";

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "[[I")
    public static int[][] field1021 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "Li;")
    public static class112 field1018 = new class112(16);

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "Ljava/lang/String;")
    public static String field1022 = "Prepared sound engine";

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "J")
    public static long field1023 = 0L;

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!fd", name = "C", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "Lvh;")
    public static class108 field1015;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)V")
    public static final void method358(int arg0, int arg1) {
        field1014++;
        class55 var2 = class62.method395(8, arg0, (byte) -66);
        var2.method341((byte) 62);
        if (arg1 != 0) {
            method360((class101) null, false);
        }
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)V")
    public static final void method359(int arg0) {
        if (arg0 != 1) {
            method362((byte) 49);
        }
        class229.field3855.method58(arg0 - 1);
        field1017++;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Leh;Z)Lcb;")
    public static final class33 method360(class101 arg0, boolean arg1) {
        if (!arg1) {
            field1012 = null;
        }
        field1020++;
        return new class33(arg0.method686(-3), arg0.method686(-3), arg0.method686(-3), arg0.method686(-3), arg0.method658(22292), arg0.method658(22292), arg0.method669((byte) 36));
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
    public static void method361(byte arg0) {
        field1022 = null;
        field1021 = null;
        field1012 = null;
        if (arg0 < -81) {
            field1018 = null;
            field1015 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)V")
    public static final void method362(byte arg0) {
        field1013++;
        class24.method166(-12414, class103.field1818);
        int var1 = (class56.field976 >> 10) + (class126.field2206 >> 3);
        int var2 = (class255.field4162 >> 3) + (class237.field3904 >> 10);
        byte var3 = 0;
        byte var4 = 8;
        byte var5 = 8;
        byte var6 = 18;
        class89.field1583 = new int[var6];
        class163.field2697 = new int[var6];
        class61.field1059 = new byte[var6][];
        class166.field2714 = new int[var6];
        class276.field4405 = new int[var6];
        class220.field3686 = new byte[var6][];
        class175.field2877 = new int[var6][4];
        class37.field520 = new int[var6];
        class69.field1139 = new int[var6];
        class163.field2695 = new byte[var6][];
        int var7 = 0;
        for (int var8 = (var1 - 6) / 8; var8 <= ((var1 + 6) / 8); var8++) {
            for (int var10 = (var2 - 6) / 8; var10 <= (var2 + 6) / 8; var10++) {
                int var11 = (var8 << 8) + var10;
                class276.field4405[var7] = var11;
                class166.field2714[var7] = class198.field3197.method749("m" + var8 + "_" + var10, 1);
                class163.field2697[var7] = class198.field3197.method749("l" + var8 + "_" + var10, 1);
                class37.field520[var7] = class198.field3197.method749("n" + var8 + "_" + var10, 1);
                class89.field1583[var7] = class198.field3197.method749("um" + var8 + "_" + var10, 1);
                class69.field1139[var7] = class198.field3197.method749("ul" + var8 + "_" + var10, 1);
                if (class37.field520[var7] == -1) {
                    class166.field2714[var7] = -1;
                    class163.field2697[var7] = -1;
                    class89.field1583[var7] = -1;
                    class69.field1139[var7] = -1;
                }
                var7++;
            }
        }
        int var9 = var7;
        if (arg0 != 47) {
            method362((byte) 69);
        }
        while (class37.field520.length > var9) {
            class37.field520[var9] = -1;
            class166.field2714[var9] = -1;
            class163.field2697[var9] = -1;
            class89.field1583[var9] = -1;
            class69.field1139[var9] = -1;
            var9++;
        }
        class223.method1502(true, var4, 0, var2, false, var3, var5, var1);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZB)V")
    public static final void method363(boolean arg0, byte arg1) {
        int var2 = -73 / ((arg1 - 70) / 34);
        byte[][] var3 = class163.field2695;
        byte var4 = 4;
        for (int var5 = 0; var5 < var4; var5++) {
            class97.method614(32067);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    int var8 = class290.field4634[var5][var6][var7];
                    if (var8 != -1) {
                        int var9 = (var8 & 0x390E4FF) >> 24;
                        if (!arg0 || var9 == 0) {
                            int var10 = (var8 & 0x6) >> 1;
                            int var11 = var8 >> 14 & 0x3FF;
                            int var12 = var8 >> 3 & 0x7FF;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class276.field4405.length; var14++) {
                                if (class276.field4405[var14] == var13 && var3[var14] != null) {
                                    class151.method1037(var7 * 8, (byte) -68, class99.field1699, var6 * 8, (var11 & 0x7) * 8, var3[var14], arg0, (var12 & 0x7) * 8, var9, var5, var10);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        field1016++;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lmj;)V")
    public class58(class143 arg0) {
        this.field1019 = arg0;
    }
}
