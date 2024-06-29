import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!s")
public class class36 {

    @OriginalMember(owner = "mapview!s", name = "d", descriptor = "J")
    public static long field507 = 0L;

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "Lf;")
    public static class10 field504 = class23.method139("Prev page", (byte) -84);

    @OriginalMember(owner = "mapview!s", name = "f", descriptor = "Lf;")
    public static class10 field509 = class23.method139("Potters Wheel", (byte) -67);

    @OriginalMember(owner = "mapview!s", name = "c", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "mapview!s", name = "e", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "mapview!s", name = "b", descriptor = "Lp;")
    public static class30 field505;

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(B)V", line = 5)
    public static void method236(byte arg0) {
        field509 = null;
        field505 = null;
        int var1 = 71 / ((arg0 - 13) / 42);
        field504 = null;
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(I)V", line = 28)
    public static final void method237(int arg0) {
        if (class38.field527[0][class25.field276][class1.field8] == null) {
            class24.field258 = null;
        } else {
            class24.field258 = class38.field527[0][class25.field276][class1.field8];
        }
        if (class38.field527[1][class25.field276][class1.field8] == null) {
            class37.field516 = null;
        } else {
            class37.field516 = class38.field527[1][class25.field276][class1.field8];
        }
        if (class38.field527[2][class25.field276][class1.field8] == null) {
            class20.field185 = null;
        } else {
            class20.field185 = class38.field527[2][class25.field276][class1.field8];
        }
        if (class38.field527[3][class25.field276][class1.field8] == null) {
            class11.field118 = null;
        } else {
            class11.field118 = class38.field527[3][class25.field276][class1.field8];
        }
        if (class38.field527[arg0][class25.field276][class1.field8] == null) {
            class15.field140 = null;
        } else {
            class15.field140 = class38.field527[4][class25.field276][class1.field8];
        }
        if (class23.field248[class25.field276][class1.field8] == null) {
            class10.field103 = null;
        } else {
            class10.field103 = class23.field248[class25.field276][class1.field8];
        }
        if (class33.field477[class25.field276][class1.field8] == null) {
            class5.field36 = null;
        } else {
            class5.field36 = class33.field477[class25.field276][class1.field8];
        }
        if (class7.field69[class25.field276][class1.field8] == null) {
            class24.field257 = null;
        } else {
            class24.field257 = class7.field69[class25.field276][class1.field8];
        }
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(Lf;ILc;Lf;)[Ln;", line = 89)
    public static final class26[] method238(class10 arg0, int arg1, class5 arg2, class10 arg3) {
        if (arg1 >= -10) {
            field508 = 22;
        }
        int var4 = arg2.method31(arg0, -110);
        int var5 = arg2.method28(-110, arg3, var4);
        return class35.method232(0, arg2, var5, var4);
    }
}
