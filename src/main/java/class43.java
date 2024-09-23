import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PMDEXOWJ")
public class class43 {

    @OriginalMember(owner = "PMDEXOWJ", name = "b", descriptor = "I")
    private int field1251 = -192;

    @OriginalMember(owner = "PMDEXOWJ", name = "g", descriptor = "I")
    public int field1256 = -1;

    @OriginalMember(owner = "PMDEXOWJ", name = "i", descriptor = "[I")
    public int[] field1258 = new int[6];

    @OriginalMember(owner = "PMDEXOWJ", name = "j", descriptor = "[I")
    public int[] field1259 = new int[6];

    @OriginalMember(owner = "PMDEXOWJ", name = "k", descriptor = "I")
    public int field1260 = 128;

    @OriginalMember(owner = "PMDEXOWJ", name = "l", descriptor = "I")
    public int field1261 = 128;

    @OriginalMember(owner = "PMDEXOWJ", name = "a", descriptor = "I")
    private static int field1250 = 41598;

    @OriginalMember(owner = "PMDEXOWJ", name = "p", descriptor = "LEOJHVRZF;")
    public static class12 field1265 = new class12(10369, 30);

    @OriginalMember(owner = "PMDEXOWJ", name = "c", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "PMDEXOWJ", name = "e", descriptor = "I")
    public int field1254;

    @OriginalMember(owner = "PMDEXOWJ", name = "f", descriptor = "I")
    public int field1255;

    @OriginalMember(owner = "PMDEXOWJ", name = "m", descriptor = "I")
    public int field1262;

    @OriginalMember(owner = "PMDEXOWJ", name = "n", descriptor = "I")
    public int field1263;

    @OriginalMember(owner = "PMDEXOWJ", name = "o", descriptor = "I")
    public int field1264;

    @OriginalMember(owner = "PMDEXOWJ", name = "h", descriptor = "LRIUJHZLL;")
    public class47 field1257;

    @OriginalMember(owner = "PMDEXOWJ", name = "d", descriptor = "[LPMDEXOWJ;")
    public static class43[] field1253;

    @OriginalMember(owner = "PMDEXOWJ", name = "a", descriptor = "(ILRVLWVPJQ;)V")
    public static void method402(int arg0, class50 arg1) {
        if (arg0 != 0) {
            field1250 = -410;
        }
        class55 var2 = new class55(741, arg1.method424("spotanim.dat", null));
        field1252 = var2.method457();
        if (field1253 == null) {
            field1253 = new class43[field1252];
        }
        for (int var3 = 0; var3 < field1252; var3++) {
            if (field1253[var3] == null) {
                field1253[var3] = new class43();
            }
            field1253[var3].field1254 = var3;
            field1253[var3].method403(-7321, var2);
        }
    }

    @OriginalMember(owner = "PMDEXOWJ", name = "a", descriptor = "(ILUAWAYCTK;)V")
    public void method403(int arg0, class55 arg1) {
        if (arg0 != -7321) {
            this.field1251 = -250;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method455();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1255 = arg1.method457();
                } else if (var3 == 2) {
                    this.field1256 = arg1.method457();
                    if (class47.field1280 != null) {
                        this.field1257 = class47.field1280[this.field1256];
                    }
                } else if (var3 == 4) {
                    this.field1260 = arg1.method457();
                } else if (var3 == 5) {
                    this.field1261 = arg1.method457();
                } else if (var3 == 6) {
                    this.field1262 = arg1.method457();
                } else if (var3 == 7) {
                    this.field1263 = arg1.method455();
                } else if (var3 == 8) {
                    this.field1264 = arg1.method455();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1258[var3 - 40] = arg1.method457();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1259[var3 - 50] = arg1.method457();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "PMDEXOWJ", name = "a", descriptor = "()LWEVRTBOZ;")
    public class66 method404() {
        class66 var1 = (class66) field1265.method206((long) this.field1254);
        if (var1 != null) {
            return var1;
        }
        class66 var2 = class66.method525(892, this.field1255);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1258[0] != 0) {
                var2.method539(this.field1258[var3], this.field1259[var3]);
            }
        }
        field1265.method207((long) this.field1254, 77, var2);
        return var2;
    }
}
