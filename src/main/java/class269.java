import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public abstract class class269 {

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field4565 = 0;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "Lmh;")
    public static class62 field4568 = class201.method1405(true, "hitmarks");

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "Led;")
    public static class49 field4567 = new class49(16);

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "[[B")
    public static byte[][] field4571 = new byte[250][];

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "[I")
    public static int[] field4563;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "[Lwg;")
    public static class24[] field4570;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 8)
    public static final void method1846(int arg0) {
        if (arg0 == 65536) {
            class29.field399.method1392(0);
            field4566++;
            class112.field1832.method1392(0);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIBII)I", line = 22)
    public static final int method1847(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field4564++;
        if (class71.field1085) {
            class71.field1085 = false;
            arg3 = 1000000;
        }
        class307 var5 = class215.field3648[arg0][arg1];
        int var6 = var5.field5264;
        if (arg2 > -92) {
            return 84;
        }
        float var7 = ((float) arg4 * 0.1F + 0.7F) * var5.field5265;
        float var8 = var5.field5271;
        float var9 = var5.field5270;
        int var10 = var5.field5279;
        int var11 = var5.field5272;
        if (!class52.field756) {
            var11 = 0;
        }
        if (class251.field4251 != var6 || class262.field4408 != var7 || class216.field3728 != var8 || class212.field3556 != var9 || class91.field1440 != var10 || class120.field2000 != var11) {
            class262.field4408 = var7;
            class251.field4251 = var6;
            class120.field2000 = var11;
            class246.field4186 = 0;
            class91.field1440 = var10;
            class150.field2362 = class278.field4761;
            class261.field4385 = class118.field1965;
            class219.field3776 = class124.field2059;
            class234.field4033 = class284.field4853;
            class216.field3728 = var8;
            class206.field3489 = class181.field2869;
            class134.field2189 = class297.field5068;
            class212.field3556 = var9;
        }
        if (class246.field4186 < 65536) {
            class246.field4186 += arg3 * 250;
            if (class246.field4186 >= 65536) {
                class246.field4186 = 65536;
            }
            int var12 = 65536 - class246.field4186 >> 8;
            float var13 = (float) (65536 - class246.field4186) / 65536.0F;
            int var14 = class246.field4186 >> 8;
            class181.field2869 = ((class91.field1440 & 0xFF00FF) * var14 + (class206.field3489 & 0xFF00FF) * var12 & 0xFF00FF00) + ((class91.field1440 & 0xFF00) * var14 + (class206.field3489 & 0xFF00) * var12 & 0xFF0000) >> 8;
            float var15 = (float) class246.field4186 / 65536.0F;
            class124.field2059 = class219.field3776 * var12 + class120.field2000 * var14 >> 8;
            class278.field4761 = class262.field4408 * var15 + class150.field2362 * var13;
            class118.field1965 = class261.field4385 * var13 + class212.field3556 * var15;
            class297.field5068 = ((class251.field4251 & 0xFF00) * var14 + (class134.field2189 & 0xFF00) * var12 & 0xFF0000) + ((class251.field4251 & 0xFF00FF) * var14 + (class134.field2189 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
            class284.field4853 = class234.field4033 * var13 + class216.field3728 * var15;
        }
        class179.method1257(class297.field5068, class278.field4761, class284.field4853, class118.field1965);
        class179.method1256(class181.field2869, class124.field2059);
        class179.method1262((float) class127.field2101, (float) class186.field2967, (float) class97.field1600);
        class179.method1258();
        return class181.field2869;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V", line = 116)
    public static void method1848(int arg0) {
        if (arg0 >= -113) {
            method1847(106, 98, (byte) 71, -9, 75);
        }
        field4567 = null;
        field4571 = (byte[][]) null;
        field4568 = null;
        field4563 = null;
        field4570 = null;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V", line = 132)
    public static final void method1849(byte arg0) {
        if (arg0 != -90) {
            method1848(8);
        }
        class179.method1252();
        field4569++;
        class179.method1258();
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method1264(byte arg0, Component arg1);

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)I")
    public abstract int method1265(byte arg0);

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method1263(int arg0, Component arg1);
}
