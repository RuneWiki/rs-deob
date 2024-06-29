import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class218 {

    @OriginalMember(owner = "client!th", name = "d", descriptor = "Le;")
    public static class191 field3835 = class54.method368("www)2wtrc", 2047);

    @OriginalMember(owner = "client!th", name = "e", descriptor = "Le;")
    public static class191 field3836 = class54.method368("Okay", 2047);

    @OriginalMember(owner = "client!th", name = "h", descriptor = "Le;")
    private static class191 field3839 = class54.method368(" is already on your ignore list)3", 2047);

    @OriginalMember(owner = "client!th", name = "a", descriptor = "Le;")
    public static class191 field3832 = field3839;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field3840 = 0;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "[Lc;")
    public static class60[] field3834;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
    public static void method1483(byte arg0) {
        field3839 = null;
        if (arg0 != -31) {
            method1483((byte) -97);
        }
        field3836 = null;
        field3832 = null;
        field3835 = null;
        field3834 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V")
    public static final void method1484(int arg0, int arg1) {
        class241.field4281 += arg0 * 128;
        field3837++;
        if (class86.field1413.length < class241.field4281) {
            class241.field4281 -= class86.field1413.length;
            int var2 = (int) (Math.random() * 12.0D);
            class176.method1186(class193.field3464[var2], (byte) -120);
        }
        int var3 = 0;
        short var4 = 256;
        int var5 = arg0 * 128;
        int var6 = (var4 - arg0) * 128;
        int var7 = -10 % ((arg1 + 35) / 34);
        for (int var8 = 0; var8 < var6; var8++) {
            int var27 = class76.field1294[var3 + var5] - class86.field1413[class86.field1413.length - 1 & class241.field4281 + var3] * arg0 / 6;
            if (var27 < 0) {
                var27 = 0;
            }
            class76.field1294[var3++] = var27;
        }
        for (int var9 = var4 - arg0; var9 < var4; var9++) {
            int var24 = var9 * 128;
            for (int var25 = 0; var25 < 128; var25++) {
                int var26 = (int) (Math.random() * 100.0D);
                if (var26 < 50 && var25 > 10 && var25 < 118) {
                    class76.field1294[var24 + var25] = 255;
                } else {
                    class76.field1294[var24 + var25] = 0;
                }
            }
        }
        for (int var10 = 0; var10 < (var4 - arg0); var10++) {
            class243.field4340[var10] = class243.field4340[arg0 + var10];
        }
        for (int var11 = var4 - arg0; var11 < var4; var11++) {
            class243.field4340[var11] = (int) (Math.sin((double) class4.field29 / 14.0D) * 16.0D + Math.sin((double) class4.field29 / 15.0D) * 14.0D + Math.sin((double) class4.field29 / 16.0D) * 12.0D);
            class4.field29++;
        }
        class25.field360 += arg0;
        int var12 = ((class135.field2267 & 0x1) + arg0) / 2;
        if (var12 <= 0) {
            return;
        }
        for (int var13 = 0; var13 < class25.field360; var13++) {
            int var22 = (int) (Math.random() * 124.0D) + 2;
            int var23 = (int) (Math.random() * 128.0D) + 128;
            class76.field1294[(var23 << 7) + var22] = 192;
        }
        class25.field360 = 0;
        for (int var14 = 0; var14 < var4; var14++) {
            int var19 = var14 * 128;
            int var20 = 0;
            for (int var21 = -var12; var21 < 128; var21++) {
                if (var12 + var21 < 128) {
                    var20 += class76.field1294[var12 + var19 + var21];
                }
                if (var21 - var12 - 1 >= 0) {
                    var20 -= class76.field1294[var21 + var19 - var12 - 1];
                }
                if (var21 >= 0) {
                    class257.field4561[var19 + var21] = var20 / (var12 * 2 + 1);
                }
            }
        }
        for (int var15 = 0; var15 < 128; var15++) {
            int var16 = 0;
            for (int var17 = -var12; var17 < var4; var17++) {
                int var18 = var17 * 128;
                if ((var17 + var12) < var4) {
                    var16 += class257.field4561[var12 * 128 + var15 + var18];
                }
                if ((var17 - var12 - 1) >= 0) {
                    var16 -= class257.field4561[var15 + var18 - ((var12 + 1) * 128)];
                }
                if (var17 >= 0) {
                    class76.field1294[var15 + var18] = var16 / (var12 * 2 + 1);
                }
            }
        }
    }
}
