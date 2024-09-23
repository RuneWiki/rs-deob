import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JDPRJRPB")
public class class25 {

    @OriginalMember(owner = "JDPRJRPB", name = "i", descriptor = "[LZOZPAWWH;")
    private class71[] field870 = new class71[10];

    @OriginalMember(owner = "JDPRJRPB", name = "a", descriptor = "I")
    private static int field862 = 8;

    @OriginalMember(owner = "JDPRJRPB", name = "b", descriptor = "I")
    private static int field863 = -10491;

    @OriginalMember(owner = "JDPRJRPB", name = "d", descriptor = "B")
    private static byte field865 = 2;

    @OriginalMember(owner = "JDPRJRPB", name = "e", descriptor = "[LJDPRJRPB;")
    private static class25[] field866 = new class25[5000];

    @OriginalMember(owner = "JDPRJRPB", name = "f", descriptor = "[I")
    public static int[] field867 = new int[5000];

    @OriginalMember(owner = "JDPRJRPB", name = "c", descriptor = "I")
    private int field864;

    @OriginalMember(owner = "JDPRJRPB", name = "j", descriptor = "I")
    private int field871;

    @OriginalMember(owner = "JDPRJRPB", name = "k", descriptor = "I")
    private int field872;

    @OriginalMember(owner = "JDPRJRPB", name = "h", descriptor = "LMUKVLYLC;")
    private static class33 field869;

    @OriginalMember(owner = "JDPRJRPB", name = "g", descriptor = "[B")
    private static byte[] field868;

    @OriginalMember(owner = "JDPRJRPB", name = "<init>", descriptor = "(I)V")
    private class25(int arg0) {
        if (arg0 != 37460) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "JDPRJRPB", name = "a", descriptor = "(LMUKVLYLC;Z)V")
    public static final void method254(class33 arg0, boolean arg1) {
        field868 = new byte[441000];
        if (arg1) {
            field863 = -133;
        }
        field869 = new class33(field862, field868);
        class71.method588();
        while (true) {
            int var2 = arg0.method294();
            if (var2 == 65535) {
                return;
            }
            field866[var2] = new class25(37460);
            field866[var2].method256(arg0, false);
            field867[var2] = field866[var2].method257(true);
        }
    }

    @OriginalMember(owner = "JDPRJRPB", name = "a", descriptor = "(III)LMUKVLYLC;")
    public static final class33 method255(int arg0, int arg1, int arg2) {
        if (arg0 != 9) {
            throw new NullPointerException();
        } else if (field866[arg2] == null) {
            return null;
        } else {
            class25 var3 = field866[arg2];
            return var3.method258(arg1, field865);
        }
    }

    @OriginalMember(owner = "JDPRJRPB", name = "b", descriptor = "(LMUKVLYLC;Z)V")
    private final void method256(class33 arg0, boolean arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg0.method292();
            if (var4 != 0) {
                arg0.field954--;
                this.field870[var3] = new class71();
                this.field870[var3].method591(arg0, false);
            }
        }
        this.field871 = arg0.method294();
        this.field872 = arg0.method294();
        if (arg1) {
            this.field864 = 142;
        }
    }

    @OriginalMember(owner = "JDPRJRPB", name = "a", descriptor = "(Z)I")
    private final int method257(boolean arg0) {
        int var2 = 9999999;
        if (!arg0) {
            return field863;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field870[var3] != null && this.field870[var3].field1715 / 20 < var2) {
                var2 = this.field870[var3].field1715 / 20;
            }
        }
        if (this.field871 < this.field872 && this.field871 / 20 < var2) {
            var2 = this.field871 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field870[var4] != null) {
                this.field870[var4].field1715 -= var2 * 20;
            }
        }
        if (this.field871 < this.field872) {
            this.field871 -= var2 * 20;
            this.field872 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "JDPRJRPB", name = "a", descriptor = "(IB)LMUKVLYLC;")
    private final class33 method258(int arg0, byte arg1) {
        int var3 = this.method259(arg0);
        if (arg1 != 2) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        field869.field954 = 0;
        field869.method286(1380533830);
        field869.method287(var3 + 36, 684);
        field869.method286(1463899717);
        field869.method286(1718449184);
        field869.method287(16, 684);
        field869.method284(1, 699);
        field869.method284(1, 699);
        field869.method287(22050, 684);
        field869.method287(22050, 684);
        field869.method284(1, 699);
        field869.method284(8, 699);
        field869.method286(1684108385);
        field869.method287(var3, 684);
        field869.field954 += var3;
        return field869;
    }

    @OriginalMember(owner = "JDPRJRPB", name = "a", descriptor = "(I)I")
    private final int method259(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field870[var3] != null && this.field870[var3].field1715 + this.field870[var3].field1714 > var2) {
                var2 = this.field870[var3].field1715 + this.field870[var3].field1714;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field871 * 22050 / 1000;
        int var6 = this.field872 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field868[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field870[var9] != null) {
                int var15 = this.field870[var9].field1714 * 22050 / 1000;
                int var16 = this.field870[var9].field1715 * 22050 / 1000;
                int[] var17 = this.field870[var9].method589(var15, this.field870[var9].field1714);
                for (int var18 = 0; var18 < var15; var18++) {
                    field868[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
                }
            }
        }
        if (arg0 > 1) {
            var5 += 44;
            var6 += 44;
            var4 += 44;
            var7 += 44;
            int var10 = var7 - var4;
            for (int var11 = var4 - 1; var11 >= var6; var11--) {
                field868[var10 + var11] = field868[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field868[var13 + var14] = field868[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
