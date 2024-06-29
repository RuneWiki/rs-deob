import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class173 {

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "Lus;")
    public static class328 field2261 = new class328(4, -1);

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "Lus;")
    public static class328 field2263 = new class328(67, 2);

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field2265 = 0;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "Z")
    public static boolean field2266 = false;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Lwo;")
    public static class314 field2264;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "[I")
    public static int[] field2267;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 5)
    public static void method1074(int arg0) {
        field2263 = null;
        field2264 = null;
        field2267 = null;
        field2261 = null;
        if (arg0 >= -125) {
            method1074(-118);
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)I", line = 24)
    public static final int method1075(int arg0) {
        field2262++;
        int var1 = -26 / ((arg0 - 7) / 61);
        return class709.field9973 == 1 ? class314.field4027 : 0;
    }
}
