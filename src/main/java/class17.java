import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!i")
public abstract class class17 {

    @OriginalMember(owner = "mapview!i", name = "g", descriptor = "I")
    public static int field171 = 0;

    @OriginalMember(owner = "mapview!i", name = "i", descriptor = "Z")
    public static boolean field173 = false;

    @OriginalMember(owner = "mapview!i", name = "f", descriptor = "Ll;")
    public static class22 field170 = class33.method229("Vegetable Store", -80);

    @OriginalMember(owner = "mapview!i", name = "h", descriptor = "Ll;")
    public static class22 field172 = class33.method229("Gem Shop", -122);

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "mapview!i", name = "e", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "mapview!i", name = "b", descriptor = "Lma;")
    public static class25 field166;

    @OriginalMember(owner = "mapview!i", name = "d", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field168;

    @OriginalMember(owner = "mapview!i", name = "c", descriptor = "[I")
    public static int[] field167;

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(Z)[Lba;", line = 37)
    public static final class4[] method98(boolean arg0) {
        class4[] var1 = new class4[class10.field82];
        for (int var2 = 0; var2 < class10.field82; var2++) {
            class4 var3 = var1[var2] = new class4();
            var3.field32 = class24.field235[var2];
            var3.field29 = class14.field147[var2];
            var3.field30 = class19.field196[var2];
            var3.field33 = class21.field209[var2];
            byte[] var4 = class30.field425[var2];
            int var5 = var3.field33 * var3.field30;
            var3.field31 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                var3.field31[var6] = class38.field501[class19.method119(255, var4[var6])];
            }
        }
        if (arg0) {
            method98(false);
        }
        class23.method157(-27401);
        return var1;
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(II)Ll;", line = 80)
    public static final class22 method99(int arg0, int arg1) {
        if (arg0 != 0) {
            method98(true);
        }
        return class23.method159(false, arg1, 10, -128);
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(ILjava/lang/Object;Z)[B", line = 100)
    public static final byte[] method100(int arg0, Object arg1, boolean arg2) {
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var4 = (byte[]) arg1;
            return arg2 ? class32.method223(0, var4) : var4;
        } else if (arg1 instanceof class34) {
            class34 var3 = (class34) arg1;
            return var3.method231(1);
        } else {
            if (arg0 != 0) {
                field173 = false;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!i", name = "b", descriptor = "(B)V", line = 134)
    public static void method101(byte arg0) {
        field166 = null;
        if (arg0 >= -36) {
            method99(-19, 45);
        }
        field170 = null;
        field167 = null;
        field168 = null;
        field172 = null;
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(III)I")
    public abstract int method96(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(B)V")
    public abstract void method97(byte arg0);
}
