import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!f")
public class class11 {

    @OriginalMember(owner = "mapview!f", name = "f", descriptor = "[J")
    public static long[] field131 = new long[32];

    @OriginalMember(owner = "mapview!f", name = "e", descriptor = "I")
    public static int field130 = 0;

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "Ld;")
    private static class7 field127 = class38.method251((byte) 97, "Brewery");

    @OriginalMember(owner = "mapview!f", name = "c", descriptor = "[I")
    public static int[] field128 = new int[128];

    @OriginalMember(owner = "mapview!f", name = "i", descriptor = "Ld;")
    private static class7 field134 = class38.method251((byte) 125, "Bank");

    @OriginalMember(owner = "mapview!f", name = "h", descriptor = "Ld;")
    private static class7 field133 = class38.method251((byte) -77, "Hair Dressers");

    @OriginalMember(owner = "mapview!f", name = "g", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "mapview!f", name = "d", descriptor = "Ljava/awt/Frame;")
    public static Frame field129;

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "[I")
    public static int[] field126;

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(B)I", line = 10)
    public static final int method100(byte arg0) {
        if (arg0 < 64) {
            return -39;
        } else if (class20.field215 == null) {
            return 0;
        } else {
            return class20.field215[class2.field10];
        }
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(I)[Ld;", line = 24)
    public static final class7[] method101(int arg0) {
        return arg0 > -99 ? (class7[]) null : new class7[] { class22.field241, class15.field165, class16.field170, class2.field9, class7.field72, field134, class25.field266, class36.field477, class8.field93, class8.field86, class5.field60, class37.field495, class15.field162, class29.field433, class8.field91, class8.field84, class5.field66, class37.field496, class22.field244, class8.field92, class31.field450, class7.field81, class29.field423, class23.field252, class5.field61, class30.field438, mapview.field304, class5.field55, class21.field232, class7.field80, class7.field73, class7.field74, class14.field157, class14.field148, class36.field485, class17.field185, class8.field85, class22.field239, class8.field87, class12.field140, class31.field448, class37.field494, class26.field373, class5.field52, class14.field152, class2.field15, class38.field505, class28.field397, class36.field481, class4.field46, mapview.field296, class22.field243, field133, class31.field447, class37.field490, class38.field507, class29.field425, class35.field467, class4.field51, class4.field35, field127, class14.field151, class17.field192, class17.field188, class17.field192, class16.field172, class17.field192, class38.field503, class31.field451, class17.field192, class18.field198, class17.field192, class17.field192, class25.field270, class17.field192, class17.field192 };
    }

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "(I)V", line = 66)
    public static void method102(int arg0) {
        int var1 = -53 / ((9 - arg0) / 46);
        field129 = null;
        field131 = null;
        field128 = null;
        field133 = null;
        field134 = null;
        field127 = null;
        field126 = null;
    }

    @OriginalMember(owner = "mapview!f", name = "c", descriptor = "(I)J", line = 81)
    public static final synchronized long method103(int arg0) {
        long var1 = System.currentTimeMillis();
        if (arg0 != 18440) {
            field130 = -95;
        }
        if (var1 < class37.field491) {
            class18.field197 += class37.field491 - var1;
        }
        class37.field491 = var1;
        return var1 + class18.field197;
    }

    @OriginalMember(owner = "mapview!f", name = "d", descriptor = "(I)I", line = 127)
    public static final int method104(int arg0) {
        if (arg0 != 0) {
            return 107;
        } else if (class21.field231 == null) {
            return 0;
        } else if (class21.field231.field164 == null) {
            return class12.field135[class21.field231.field166 & 0xFF];
        } else {
            return class12.field135[class21.field231.field164[class2.field10] & 0xFF];
        }
    }
}
