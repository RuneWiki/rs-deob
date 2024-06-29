import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!l")
public class class21 extends class18 {

    @OriginalMember(owner = "mapview!l", name = "m", descriptor = "Lna;")
    public static class26 field222 = class33.method219("mapfunction", 124);

    @OriginalMember(owner = "mapview!l", name = "l", descriptor = "I")
    public static int field221 = 0;

    @OriginalMember(owner = "mapview!l", name = "s", descriptor = "I")
    public static int field228 = 0;

    @OriginalMember(owner = "mapview!l", name = "p", descriptor = "Lna;")
    private static class26 field225 = class33.method219("Spinning Wheel", 123);

    @OriginalMember(owner = "mapview!l", name = "r", descriptor = "I")
    public static volatile int field227 = 0;

    @OriginalMember(owner = "mapview!l", name = "o", descriptor = "[[B")
    public static byte[][] field224 = new byte[50][];

    @OriginalMember(owner = "mapview!l", name = "t", descriptor = "I")
    public static int field229 = 0;

    @OriginalMember(owner = "mapview!l", name = "q", descriptor = "Lna;")
    public static class26 field226 = class33.method219("Key", 106);

    @OriginalMember(owner = "mapview!l", name = "v", descriptor = "Lna;")
    private static class26 field231 = class33.method219("Guide", 96);

    @OriginalMember(owner = "mapview!l", name = "u", descriptor = "Lna;")
    private static class26 field230 = class33.method219("Fishing Spot", 94);

    @OriginalMember(owner = "mapview!l", name = "n", descriptor = "Lc;")
    public static class4 field223;

    @OriginalMember(owner = "mapview!l", name = "c", descriptor = "(I)[Lna;", line = 4)
    public static final class26[] method116(int arg0) {
        if (arg0 != -18295) {
            method116(119);
        }
        class26[] var10000 = new class26[] { class29.field440, class28.field417, class28.field418, class28.field419, class34.field489, class29.field430, class32.field475, class1.field5, class32.field474, class30.field455, class28.field425, class32.field473, class2.field16, class28.field421, class12.field112, class39.field513, class26.field395, class26.field403, class18.field171, class10.field98, class1.field2, class33.field477, class3.field29, class18.field168, class18.field164, class4.field40, field230, class5.field54, class5.field61, class26.field406, class12.field123, class10.field96, class4.field39, class29.field429, class3.field32, field225, class23.field250, class11.field106, class23.field237, class12.field114, class34.field490, class1.field7, class1.field3, class23.field236, class4.field42, class8.field80, class1.field6, class11.field105, mapview.field260, class40.field529, class18.field172, mapview.field269, class39.field514, class38.field510, class5.field56, field231, class15.field153, class2.field15, class15.field158, class2.field19, class39.field517, class40.field532, class10.field94, mapview.field263, class10.field94, class26.field394, class10.field94, class27.field409, class34.field494, class10.field94, class28.field416, class3.field35, class10.field94, class22.field233, class27.field412, class10.field94, class10.field94, class10.field94, class23.field248, class10.field94, class10.field94 };
        if (class24.field259) {
        }
        return var10000;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(BJ)V", line = 15)
    public static final void method117(byte arg0, long arg1) {
        try {
            Thread.sleep(arg1);
            if (arg0 >= -36) {
                method116(-58);
            }
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "mapview!l", name = "d", descriptor = "(I)V", line = 46)
    public static void method118(int arg0) {
        field223 = null;
        if (arg0 != 0) {
            field227 = 56;
        }
        field226 = null;
        field230 = null;
        field222 = null;
        field224 = null;
        field225 = null;
        field231 = null;
    }
}
