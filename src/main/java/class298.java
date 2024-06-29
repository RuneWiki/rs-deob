import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class298 {

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field5083 = 127;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "Ljf;")
    public static class229 field5088 = class212.method1457((byte) 79, "details");

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "J")
    public static long field5084 = 0L;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "Ljf;")
    public static class229 field5087 = class212.method1457((byte) 95, "Chargement des textures )2 ");

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Lui;")
    public static class268 field5082 = new class268(16);

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIII)Z", line = 4)
    public static final boolean method2054(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class211.field3626 * arg3 + class150.field2604 * arg0 >> 16;
        int var6 = class150.field2604 * arg3 - class211.field3626 * arg0 >> 16;
        int var7 = class199.field3486 * arg1 + class174.field3038 * var6 >> 16;
        int var8 = class174.field3038 * arg1 - class199.field3486 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class199.field3486 * arg2 + class174.field3038 * var6 >> 16;
        int var12 = class174.field3038 * arg2 - class199.field3486 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class214.field3688 && var13 < class214.field3688) {
            return false;
        } else if (var9 > class324.field5468 && var13 > class324.field5468) {
            return false;
        } else if (var10 < class165.field2827 && var14 < class165.field2827) {
            return false;
        } else {
            return var10 <= class297.field5079 || var14 <= class297.field5079;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V", line = 51)
    public static final void method2055(byte arg0) {
        if (arg0 != 103) {
            field5084 = 56L;
        }
        field5089++;
        if (class168.field2877 != null && class281.field4824 != null) {
            return;
        }
        class281.field4824 = new int[256];
        class168.field2877 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class168.field2877[var1] = (int) (Math.sin(var2) * 4096.0D);
            class281.field4824[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lek;I)V", line = 88)
    public static final void method2056(class185 arg0, int arg1) {
        if (arg1 >= -110) {
            field5082 = (class268) null;
        }
        class69.field1330 = arg0;
        field5086++;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V", line = 123)
    public static void method2057(int arg0) {
        if (arg0 != 4096) {
            method2056((class185) null, 123);
        }
        field5088 = null;
        field5082 = null;
        field5087 = null;
    }
}
