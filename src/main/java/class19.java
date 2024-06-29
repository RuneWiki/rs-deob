import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ja")
public class class19 {

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "Lna;")
    public static class26 field240 = class30.method205((byte) 61, "Platelegs Shop");

    @OriginalMember(owner = "mapview!ja", name = "e", descriptor = "Z")
    public static boolean field243 = true;

    @OriginalMember(owner = "mapview!ja", name = "c", descriptor = "Lna;")
    public static class26 field241 = class30.method205((byte) 14, "Gem Shop");

    @OriginalMember(owner = "mapview!ja", name = "g", descriptor = "I")
    public static int field245 = 0;

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "mapview!ja", name = "f", descriptor = "[I")
    public static int[] field244;

    @OriginalMember(owner = "mapview!ja", name = "d", descriptor = "[Lna;")
    public static class26[] field242;

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(B)V", line = 22)
    public static final void method118(byte arg0) {
        class5 var1 = class15.field204;
        synchronized (class15.field204) {
            class29.field387 = class18.field237;
            if (arg0 != -17) {
                field239 = 40;
            }
            if (class4.field131 >= 0) {
                while (class4.field131 != class30.field401) {
                    int var2 = class41.field525[class30.field401];
                    class30.field401 = class30.field401 + 1 & 0x7F;
                    if (var2 >= 0) {
                        class27.field375[var2] = true;
                    } else {
                        class27.field375[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class27.field375[var3] = false;
                }
                class4.field131 = class30.field401;
            }
            class18.field237 = class15.field208;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "(B)V", line = 63)
    public static final void method119(byte arg0) {
        class37.field479 = null;
        class13.field192 = null;
        if (arg0 > 12) {
            class29.field385 = null;
            class31.field408 = null;
            class17.field224 = null;
            class30.field396 = null;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(Z)V", line = 81)
    public static void method120(boolean arg0) {
        field240 = null;
        field241 = null;
        field242 = null;
        field244 = null;
        if (arg0) {
            method118((byte) 7);
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(I)I", line = 102)
    public static final int method121(int arg0) {
        if (arg0 != 6171) {
            return 122;
        } else if (class26.field362 == null) {
            return 0;
        } else if (class26.field362.field481 == null) {
            return class25.field343[class26.field362.field483 & 0xFF];
        } else {
            return class25.field343[class26.field362.field481[field239] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "(I)V", line = 120)
    public static final void method122(int arg0) {
        if (++class1.field104 >= 64) {
            class1.field102++;
            class1.field104 = 0;
            if (class1.field102 < class26.field360 >> 6) {
                class35.method224(300);
            }
        }
        field239 = (class1.field104 << 6) + class20.field286;
        if (arg0 != 771523174) {
            method121(88);
        }
    }
}
