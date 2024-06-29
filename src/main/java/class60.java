import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class60 {

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "[I")
    public static int[] field983 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "Lpe;")
    public static class237 field987 = null;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "Leg;")
    public static class37 field989 = class174.method1167("cross", -71);

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "Leg;")
    private static class37 field990 = class174.method1167("purple:", -76);

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "Leg;")
    public static class37 field988 = field990;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "Leg;")
    public static class37 field992 = field990;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "[I")
    public static int[] field985 = new int[32];

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field993 = 0;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "Lnc;")
    public static class11 field984;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "Lpe;")
    public static class237 field986;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)I")
    public static final int method431(int arg0, int arg1) {
        int var2 = (arg1 & 0x55555555) + ((arg1 & 0xAAAAAAAB) >>> 1);
        int var3 = ((var2 & 0xCCCCCCCE) >>> 2) + (var2 & 0x33333333);
        if (arg0 != -13941) {
            method433((byte) -46);
        }
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        field991++;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static void method432(int arg0) {
        field989 = null;
        field985 = null;
        field987 = null;
        if (arg0 != -30804) {
            field990 = null;
        }
        field983 = null;
        field984 = null;
        field990 = null;
        field986 = null;
        field992 = null;
        field988 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public static final void method433(byte arg0) {
        if (arg0 != 49) {
            method432(61);
        }
        field982++;
        int var1 = class82.field1285.field1799 + class249.field4478;
        int var2 = class165.field2741 + class82.field1285.field1793;
        if ((class72.field1134 - var1) < -500 || (class72.field1134 - var1) > 500 || class265.field4658 - var2 < -500 || (class265.field4658 - var2) > 500) {
            class72.field1134 = var1;
            class265.field4658 = var2;
        }
        if (class265.field4658 != var2) {
            class265.field4658 += (var2 - class265.field4658) / 16;
        }
        if (class72.field1134 != var1) {
            class72.field1134 += (var1 - class72.field1134) / 16;
        }
        if (class202.field3458) {
            for (int var3 = 0; var3 < class230.field3934; var3++) {
                int var4 = class215.field3717[var3];
                if (var4 == 98) {
                    class10.field166 = class10.field166 + 47 & 0xFFFFFFF0;
                } else if (var4 == 99) {
                    class10.field166 = class10.field166 - 17 & 0xFFFFFFF0;
                } else if (var4 == 96) {
                    class25.field355 = class25.field355 - 65 & 0xFFFFFF80;
                } else if (var4 == 97) {
                    class25.field355 = class25.field355 + 191 & 0xFFFFFF80;
                }
            }
        } else {
            if (class158.field2625[96]) {
                class196.field3335 += (-class196.field3335 - 24) / 2;
            } else if (class158.field2625[97]) {
                class196.field3335 += (24 - class196.field3335) / 2;
            } else {
                class196.field3335 /= 2;
            }
            if (class158.field2625[98]) {
                class27.field391 += (12 - class27.field391) / 2;
            } else if (class158.field2625[99]) {
                class27.field391 += (-class27.field391 - 12) / 2;
            } else {
                class27.field391 /= 2;
            }
            class25.field355 += class196.field3335 / 2;
            class10.field166 += class27.field391 / 2;
        }
        class256.method1744(arg0 ^ 0x4A55);
    }
}
