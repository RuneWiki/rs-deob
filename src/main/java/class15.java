import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ha")
public class class15 {

    @OriginalMember(owner = "mapview!ha", name = "e", descriptor = "Lta;")
    public static class37 field161 = class20.method87(-120, "Combat Training");

    @OriginalMember(owner = "mapview!ha", name = "f", descriptor = "Lta;")
    public static class37 field162 = class20.method87(-127, "Enter place name to find");

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "Lta;")
    public static class37 field158 = class20.method87(-100, "floorcol)3dat");

    @OriginalMember(owner = "mapview!ha", name = "h", descriptor = "Lta;")
    public static class37 field164 = class20.method87(-115, "Pet Shop");

    @OriginalMember(owner = "mapview!ha", name = "j", descriptor = "[[B")
    public static byte[][] field166 = new byte[50][];

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "Lta;")
    public static class37 field157 = class20.method87(-99, "Apothecary");

    @OriginalMember(owner = "mapview!ha", name = "m", descriptor = "Lta;")
    public static class37 field169 = class20.method87(-89, "Requesting");

    @OriginalMember(owner = "mapview!ha", name = "l", descriptor = "Lta;")
    public static class37 field168 = class20.method87(-93, "sprites");

    @OriginalMember(owner = "mapview!ha", name = "i", descriptor = "Lta;")
    public static class37 field165 = class20.method87(-100, "Estate Agent");

    @OriginalMember(owner = "mapview!ha", name = "g", descriptor = "Lna;")
    public static class27 field163;

    @OriginalMember(owner = "mapview!ha", name = "c", descriptor = "Lba;")
    public static class3 field159;

    @OriginalMember(owner = "mapview!ha", name = "k", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field167;

    @OriginalMember(owner = "mapview!ha", name = "d", descriptor = "[[Lna;")
    public static class27[][] field160;

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method62(boolean arg0) {
        if (arg0) {
            return;
        }
        if (++class30.field445 >= 64) {
            class30.field445 = 0;
            class20.field228++;
            if (class37.field500 >> 6 > class20.field228) {
                class38.method249((byte) -83);
            }
        }
        class11.field127 = (class30.field445 << 6) + class12.field144;
    }

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "(Z)I", line = 45)
    public static final int method63(boolean arg0) {
        if (!arg0) {
            method65(true);
        }
        return class9.field98 == null ? 0 : class9.field98[class11.field127];
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(II)I", line = 78)
    public static final int method64(int arg0, int arg1) {
        if (arg1 >= arg0 && arg1 <= 90) {
            arg1 += 32;
        }
        return arg1;
    }

    @OriginalMember(owner = "mapview!ha", name = "c", descriptor = "(Z)V", line = 94)
    public static void method65(boolean arg0) {
        field162 = null;
        field165 = null;
        field164 = null;
        field157 = null;
        field160 = null;
        field163 = null;
        field168 = null;
        field158 = null;
        field169 = null;
        field167 = null;
        if (!arg0) {
            field159 = null;
            field166 = null;
            field161 = null;
        }
    }
}
