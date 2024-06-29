import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class437 {

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "[[I")
    public static int[][] field6084 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!eu", name = "g", descriptor = "I")
    public static int field6087 = -1;

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "I")
    public static int field6085 = 0;

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "I")
    public static int field6086 = 0;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "I")
    public static int field6081;

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "I")
    public static int field6082;

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "I")
    public static int field6083;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)V", line = 7)
    public static void method2412(byte arg0) {
        field6084 = null;
        if (arg0 < 36) {
            method2413(-70);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V", line = 18)
    public static final void method2413(int arg0) {
        field6082++;
        if (class392.field5227) {
            return;
        }
        if (class601.field8530.field2880) {
            class89.field958 = ((int) class89.field958 - 17 & 0xFFFFFFF0);
        } else {
            class526.field7522 += (-12.0F - class526.field7522) / 2.0F;
        }
        class392.field5227 = true;
        class356.field4671 = true;
        if (arg0 <= 63) {
            field6084 = null;
        }
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(B)V", line = 51)
    public static final void method2414(byte arg0) {
        class319.field4130 = -1;
        class550.field7847 = 0;
        if (arg0 == -25) {
            field6081++;
            class377.field4897 = -1;
        }
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)[Lce;", line = 68)
    public static final class278[] method2415(int arg0) {
        if (arg0 > -47) {
            method2412((byte) -46);
        }
        field6083++;
        return new class278[] { class152.field1727, class261.field3322, class352.field4614 };
    }
}
