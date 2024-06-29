import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!sa")
public class class35 {

    @OriginalMember(owner = "mapview!sa", name = "b", descriptor = "Lv;")
    private static class40 field464 = class24.method170("Loom", (byte) -104);

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "Lv;")
    private static class40 field463 = class24.method170("Agility Training", (byte) -122);

    @OriginalMember(owner = "mapview!sa", name = "g", descriptor = "Lv;")
    public static class40 field469 = class24.method170("world", (byte) -74);

    @OriginalMember(owner = "mapview!sa", name = "f", descriptor = "Lv;")
    public static class40 field468 = class24.method170("overlay)3dat", (byte) -80);

    @OriginalMember(owner = "mapview!sa", name = "e", descriptor = "Lv;")
    public static class40 field467 = class24.method170("fonts", (byte) -124);

    @OriginalMember(owner = "mapview!sa", name = "i", descriptor = "Lv;")
    private static class40 field471 = class24.method170("Spice Shop", (byte) 76);

    @OriginalMember(owner = "mapview!sa", name = "d", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "mapview!sa", name = "h", descriptor = "Li;")
    public static class15 field470;

    @OriginalMember(owner = "mapview!sa", name = "c", descriptor = "[I")
    public static int[] field465;

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "([Lv;Z)Lv;", line = 37)
    public static final class40 method212(class40[] arg0, boolean arg1) {
        if (!arg1) {
            field465 = null;
        }
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        return class19.method115(arg0.length, 0, arg0, -17476);
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(I)B", line = 57)
    public static final byte method213(int arg0) {
        int var1 = 34 % ((12 - arg0) / 54);
        return class24.field369 == null ? 0 : class24.field369[class20.field213];
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(Z)V", line = 70)
    public static void method214(boolean arg0) {
        field465 = null;
        field469 = null;
        field468 = null;
        if (arg0) {
            return;
        }
        field471 = null;
        field464 = null;
        field463 = null;
        field470 = null;
        field467 = null;
    }

    @OriginalMember(owner = "mapview!sa", name = "b", descriptor = "(I)[Lv;", line = 143)
    public static final class40[] method215(int arg0) {
        if (arg0 != 9994) {
            method213(-5);
        }
        class40[] var10000 = new class40[] { class36.field477, class30.field428, class8.field104, class18.field193, class37.field482, class1.field40, class25.field372, class39.field503, class8.field97, class6.field72, class15.field151, class36.field475, class8.field95, class18.field195, class26.field390, class5.field65, class5.field59, class20.field214, class30.field429, class6.field78, class8.field105, class20.field218, class34.field451, class15.field156, class7.field90, class14.field142, class36.field473, class15.field148, class30.field427, class5.field60, class37.field488, class18.field189, class1.field13, class26.field403, class16.field168, class39.field507, class24.field366, class32.field439, class40.field512, class26.field386, class15.field153, class19.field204, class34.field461, class18.field188, class27.field410, class1.field41, class18.field196, class39.field505, field471, field463, class25.field383, class5.field55, class6.field76, class25.field384, class19.field211, class16.field164, class32.field445, class19.field208, class36.field476, field464, class7.field92, class31.field432, class37.field479, class23.field268, class37.field479, mapview.field339, class37.field479, class12.field128, class37.field487, class37.field479, class23.field262, mapview.field358, class34.field459, class1.field18, class19.field200, class37.field479, class37.field479, class37.field479, class7.field86, class37.field479, class37.field479 };
        if (class18.field199) {
        }
        return var10000;
    }
}
