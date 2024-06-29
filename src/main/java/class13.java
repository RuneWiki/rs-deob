import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!g")
public class class13 extends RuntimeException {

    @OriginalMember(owner = "mapview!g", name = "c", descriptor = "Ljava/lang/String;")
    public String field124;

    @OriginalMember(owner = "mapview!g", name = "e", descriptor = "Ljava/lang/Throwable;")
    public Throwable field126;

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "Ls;")
    public static class34 field122 = class9.method35("Agility Training", 220);

    @OriginalMember(owner = "mapview!g", name = "d", descriptor = "Ls;")
    public static class34 field125 = class9.method35("Furnace", 220);

    @OriginalMember(owner = "mapview!g", name = "b", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(II[BZ)Ls;", line = 26)
    public static final class34 method55(int arg0, int arg1, byte[] arg2, boolean arg3) {
        class34 var4 = new class34();
        var4.field475 = new byte[arg0];
        var4.field478 = 0;
        if (arg3) {
            field122 = null;
        }
        for (int var5 = arg1; var5 < arg0 + arg1; var5++) {
            if (arg2[var5] != 0) {
                var4.field475[var4.field478++] = arg2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(I)I", line = 59)
    public static final int method56(int arg0) {
        int var1 = -61 / ((-arg0 - 36) / 58);
        if (class9.field86 == null) {
            return 0;
        } else if (class9.field86.field18 == null) {
            return class22.field218[class9.field86.field11 & 0xFF];
        } else {
            return class22.field218[class9.field86.field18[class31.field433] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(Z)V", line = 80)
    public static void method57(boolean arg0) {
        field122 = null;
        if (!arg0) {
            field125 = null;
        }
    }

    @OriginalMember(owner = "mapview!g", name = "b", descriptor = "(I)[Lf;", line = 92)
    public static final class11[] method58(int arg0) {
        class11[] var1 = new class11[class9.field94];
        if (arg0 >= 0) {
            field123 = -9;
        }
        for (int var2 = 0; var2 < class9.field94; var2++) {
            class11 var3 = new class11();
            var3.field107 = class14.field128[var2];
            var3.field106 = class34.field468[var2];
            var3.field110 = class28.field383[var2];
            var3.field109 = mapview.field293[var2];
            byte[] var4 = class9.field91[var2];
            int var5 = var3.field110 * var3.field109;
            var3.field108 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                var3.field108[var6] = class27.field377[class31.method206(var4[var6], 255)];
            }
            var1[var2] = var3;
        }
        class30.method202((byte) -82);
        return var1;
    }

    @OriginalMember(owner = "mapview!g", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 142)
    public class13(Throwable arg0, String arg1) {
        this.field124 = arg1;
        this.field126 = arg0;
    }
}
