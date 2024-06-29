import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 extends class127 {

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "Lhb;")
    public static class44 field115 = class102.method810(")3", -28606);

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
    public static int field116 = -1;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "I")
    public static int field117 = -1;

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "Lhb;")
    public static class44 field123 = class102.method810(" hat sich eingeloggt)3", -28606);

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "Lhb;")
    private static class44 field124 = class102.method810("button near the top of that page)3", -28606);

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "Lhb;")
    public static class44 field129 = class102.method810("(Z", -28606);

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "Lhb;")
    public static class44 field131 = class102.method810("Ihre Nachricht an: ", -28606);

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "Lhb;")
    public static class44 field122 = class102.method810("@cr1@", -28606);

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "Lhb;")
    public static class44 field125 = class102.method810("m", -28606);

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "[I")
    public static int[] field130 = new int[1000];

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "I")
    public static int field121 = 0;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "Lhb;")
    public static class44 field126 = field124;

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "Lqd;")
    public static class100 field132;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "Lad;")
    public class5 field120;

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "Lad;")
    public class5 field127;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ad", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field135;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method43(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V", line = 15)
    public static final void method38(int arg0) {
        if (arg0 != -335) {
            return;
        }
        field133++;
        int var1 = class34.field820.method297(class19.field411);
        for (int var2 = 0; var2 < class71.field1744; var2++) {
            int var10 = class34.field820.method304(class64.field1625[var2]);
            if (var1 < var10) {
                var1 = var10;
            }
        }
        var1 += 8;
        int var3 = class71.field1744 * 15 + 21;
        if (class57.field1508 > 4 && class40.field902 > 4 && class57.field1508 < 516 && class40.field902 < 338) {
            class15.field289 = true;
            class78.field1951 = class71.field1744 * 15 + 22;
            class82.field2093 = var1;
            class25.field584 = 0;
            int var4 = class57.field1508 - var1 / 2 - 4;
            if (var4 + var1 > 512) {
                var4 = 512 - var1;
            }
            if (var4 < 0) {
                var4 = 0;
            }
            class107.field2715 = var4;
            int var5 = class40.field902 - 4;
            if (var3 + var5 > 334) {
                var5 = 334 - var3;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            class46.field1146 = var5;
        }
        if (class57.field1508 > 553 && class40.field902 > 205 && class57.field1508 < 743 && class40.field902 < 466) {
            class15.field289 = true;
            class82.field2093 = var1;
            class78.field1951 = class71.field1744 * 15 + 22;
            int var6 = class57.field1508 - var1 / 2 - 553;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 + var1 > 190) {
                var6 = 190 - var1;
            }
            class107.field2715 = var6;
            class25.field584 = 1;
            int var7 = class40.field902 - 205;
            if (var7 < 0) {
                var7 = 0;
            } else if (var3 + var7 > 261) {
                var7 = 261 - var3;
            }
            class46.field1146 = var7;
        }
        if (class57.field1508 <= 17 || class40.field902 <= 357 || class57.field1508 >= 496 || class40.field902 >= 453) {
            return;
        }
        class82.field2093 = var1;
        class78.field1951 = class71.field1744 * 15 + 22;
        class25.field584 = 2;
        class15.field289 = true;
        int var8 = class40.field902 - 357;
        if (var8 < 0) {
            var8 = 0;
        } else if (var3 + var8 > 96) {
            var8 = 96 - var3;
        }
        int var9 = class57.field1508 - var1 / 2 - 17;
        class46.field1146 = var8;
        if (var9 < 0) {
            var9 = 0;
        } else if (var1 + var9 > 479) {
            var9 = 479 - var1;
        }
        class107.field2715 = var9;
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)V", line = 131)
    public final void method39(int arg0) {
        field134++;
        if (this.field127 == null) {
            return;
        }
        this.field127.field120 = this.field120;
        this.field120.field127 = this.field127;
        if (arg0 != 1) {
            field122 = null;
        }
        this.field120 = null;
        this.field127 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(JB)V", line = 158)
    public static final void method40(long arg0, byte arg1) {
        field119++;
        if (arg0 == 0L) {
            return;
        }
        if (arg1 >= -93) {
            method40(96L, (byte) 39);
        }
        for (int var3 = 0; var3 < class43.field983; var3++) {
            if (class51.field1235[var3] == arg0) {
                class88.field2251 = true;
                class71.field1734++;
                class43.field983--;
                for (int var4 = var3; var4 < class43.field983; var4++) {
                    class51.field1235[var4] = class51.field1235[var4 + 1];
                }
                class92.field2333.method702(true, 10);
                class92.field2333.method1018(arg0, -5952);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V", line = 211)
    public static final void method41(byte arg0) {
        field128++;
        if (class16.field325 == null) {
            return;
        }
        long var1 = System.currentTimeMillis();
        if (var1 <= class109.field2739) {
            return;
        }
        class16.field325.method95(var1);
        int var3 = (int) (var1 - class109.field2739);
        class109.field2739 = var1;
        int var4 = 114 / ((arg0 + 40) / 51);
        synchronized (field135 == null ? (field135 = method43("ca")) : field135) {
            class128.field3085 += class94.field2391 * var3;
            int var6 = (class128.field3085 - class94.field2391 * 2000) / 1000;
            if (var6 > 0) {
                if (class72.field1830 != null) {
                    class72.field1830.method24(var6);
                }
                class128.field3085 -= var6 * 1000;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)V", line = 285)
    public static void method42(int arg0) {
        field115 = null;
        if (arg0 != 0) {
            return;
        }
        field130 = null;
        field123 = null;
        field125 = null;
        field124 = null;
        field129 = null;
        field132 = null;
        field126 = null;
        field122 = null;
        field131 = null;
    }
}
