import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LOEGFAGM")
public class class34 {

    @OriginalMember(owner = "client!LOEGFAGM", name = "c", descriptor = "Z")
    private boolean field1059 = true;

    @OriginalMember(owner = "client!LOEGFAGM", name = "d", descriptor = "Z")
    private boolean field1060 = true;

    @OriginalMember(owner = "client!LOEGFAGM", name = "i", descriptor = "[LVCSQFXER;")
    private class58[] field1065 = new class58[10];

    @OriginalMember(owner = "client!LOEGFAGM", name = "e", descriptor = "[LLOEGFAGM;")
    private static class34[] field1061 = new class34[5000];

    @OriginalMember(owner = "client!LOEGFAGM", name = "f", descriptor = "[I")
    public static int[] field1062 = new int[5000];

    @OriginalMember(owner = "client!LOEGFAGM", name = "a", descriptor = "I")
    private static int field1057;

    @OriginalMember(owner = "client!LOEGFAGM", name = "j", descriptor = "I")
    private int field1066;

    @OriginalMember(owner = "client!LOEGFAGM", name = "k", descriptor = "I")
    private int field1067;

    @OriginalMember(owner = "client!LOEGFAGM", name = "h", descriptor = "LBFQIDHPO;")
    private static class3 field1064;

    @OriginalMember(owner = "client!LOEGFAGM", name = "b", descriptor = "Z")
    private static boolean field1058;

    @OriginalMember(owner = "client!LOEGFAGM", name = "g", descriptor = "[B")
    private static byte[] field1063;

    @OriginalMember(owner = "client!LOEGFAGM", name = "<init>", descriptor = "(I)V")
    private class34(int arg0) {
        if (arg0 != -11406) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!LOEGFAGM", name = "a", descriptor = "(ZLBFQIDHPO;)V")
    public static final void method338(boolean arg0, class3 arg1) {
        if (!arg0) {
            field1057 = -201;
        }
        field1063 = new byte[441000];
        field1064 = new class3(field1063, -990);
        class58.method521();
        while (true) {
            int var2 = arg1.method56();
            if (var2 == 65535) {
                return;
            }
            field1061[var2] = new class34(-11406);
            field1061[var2].method340((byte) -11, arg1);
            field1062[var2] = field1061[var2].method341(field1058);
        }
    }

    @OriginalMember(owner = "client!LOEGFAGM", name = "a", descriptor = "(III)LBFQIDHPO;")
    public static final class3 method339(int arg0, int arg1, int arg2) {
        int var3 = 45 / arg2;
        if (field1061[arg1] == null) {
            return null;
        } else {
            class34 var4 = field1061[arg1];
            return var4.method342(true, arg0);
        }
    }

    @OriginalMember(owner = "client!LOEGFAGM", name = "a", descriptor = "(BLBFQIDHPO;)V")
    private final void method340(byte arg0, class3 arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var5 = arg1.method54();
            if (var5 != 0) {
                arg1.field50--;
                this.field1065[var3] = new class58();
                this.field1065[var3].method524((byte) -11, arg1);
            }
        }
        this.field1066 = arg1.method56();
        if (arg0 != -11) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field1067 = arg1.method56();
    }

    @OriginalMember(owner = "client!LOEGFAGM", name = "a", descriptor = "(Z)I")
    private final int method341(boolean arg0) {
        if (arg0) {
            return field1057;
        }
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1065[var3] != null && this.field1065[var3].field1529 / 20 < var2) {
                var2 = this.field1065[var3].field1529 / 20;
            }
        }
        if (this.field1066 < this.field1067 && this.field1066 / 20 < var2) {
            var2 = this.field1066 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field1065[var4] != null) {
                this.field1065[var4].field1529 -= var2 * 20;
            }
        }
        if (this.field1066 < this.field1067) {
            this.field1066 -= var2 * 20;
            this.field1067 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "client!LOEGFAGM", name = "a", descriptor = "(ZI)LBFQIDHPO;")
    private final class3 method342(boolean arg0, int arg1) {
        int var3 = this.method343(arg1);
        field1064.field50 = 0;
        field1064.method48(1380533830);
        field1064.method49(var3 + 36, (byte) 4);
        field1064.method48(1463899717);
        if (!arg0) {
            this.field1059 = !this.field1059;
        }
        field1064.method48(1718449184);
        field1064.method49(16, (byte) 4);
        field1064.method46(1, 7);
        field1064.method46(1, 7);
        field1064.method49(22050, (byte) 4);
        field1064.method49(22050, (byte) 4);
        field1064.method46(1, 7);
        field1064.method46(8, 7);
        field1064.method48(1684108385);
        field1064.method49(var3, (byte) 4);
        field1064.field50 += var3;
        return field1064;
    }

    @OriginalMember(owner = "client!LOEGFAGM", name = "a", descriptor = "(I)I")
    private final int method343(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1065[var3] != null && this.field1065[var3].field1529 + this.field1065[var3].field1528 > var2) {
                var2 = this.field1065[var3].field1529 + this.field1065[var3].field1528;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field1066 * 22050 / 1000;
        int var6 = this.field1067 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field1063[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field1065[var9] != null) {
                int var15 = this.field1065[var9].field1528 * 22050 / 1000;
                int var16 = this.field1065[var9].field1529 * 22050 / 1000;
                int[] var17 = this.field1065[var9].method522(var15, this.field1065[var9].field1528);
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = (var17[var18] >> 8) + (field1063[var16 + var18 + 44] & 0xFF);
                    if ((var19 & 0xFFFFFF00) != 0) {
                        var19 = ~(var19 >> 31);
                    }
                    field1063[var16 + var18 + 44] = (byte) var19;
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
                field1063[var10 + var11] = field1063[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field1063[var13 + var14] = field1063[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
