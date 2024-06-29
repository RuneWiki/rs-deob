import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!g")
public class class13 {

    @OriginalMember(owner = "mapview!g", name = "c", descriptor = "Lr;")
    public static class33 field166 = class29.method192("Tannery", (byte) 126);

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "Lr;")
    public static class33 field164 = class29.method192("download", (byte) 126);

    @OriginalMember(owner = "mapview!g", name = "e", descriptor = "Lr;")
    public static class33 field168 = class29.method192("Dairy Churn", (byte) 126);

    @OriginalMember(owner = "mapview!g", name = "b", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "mapview!g", name = "d", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(I)[Le;", line = 16)
    public static final class9[] method92(int arg0) {
        class9[] var1 = new class9[class35.field477];
        for (int var2 = arg0; var2 < class35.field477; var2++) {
            class9 var3 = var1[var2] = new class9();
            var3.field123 = class25.field272[var2];
            var3.field120 = class36.field494[var2];
            var3.field124 = class21.field219[var2];
            var3.field122 = class22.field230[var2];
            int var4 = var3.field124 * var3.field122;
            byte[] var5 = class32.field448[var2];
            var3.field121 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field121[var6] = class11.field146[class30.method198(var5[var6], 255)];
            }
        }
        class2.method14((byte) -128);
        return var1;
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(B)V", line = 62)
    public static void method93(byte arg0) {
        field166 = null;
        field164 = null;
        if (arg0 >= -125) {
            method94(27);
        }
        field168 = null;
    }

    @OriginalMember(owner = "mapview!g", name = "b", descriptor = "(I)J", line = 88)
    public static final synchronized long method94(int arg0) {
        long var1 = System.currentTimeMillis();
        if (class37.field501 > var1) {
            class12.field150 += class37.field501 - var1;
        }
        if (arg0 >= -50) {
            return 71L;
        } else {
            class37.field501 = var1;
            return class12.field150 + var1;
        }
    }
}
