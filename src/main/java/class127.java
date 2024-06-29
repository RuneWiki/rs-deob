import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public abstract class class127 {

    @OriginalMember(owner = "client!al", name = "a", descriptor = "[[I")
    public static int[][] field2186 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!al", name = "b", descriptor = "Lnk;")
    public static class326 field2187 = new class326(57, 3);

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field2189 = -1;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "Llo;")
    public static class306 field2191;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "Lla;")
    public static class296 field2188;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "Lqs;")
    public static class496 field2190;

    static {
        new class306("From", "Von:", "De", "De");
        field2191 = new class306("purple:", "lila:", "violet:", "roxo:");
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V", line = 10)
    public static void method989(int arg0) {
        field2190 = null;
        field2191 = null;
        field2186 = null;
        field2187 = null;
        field2188 = null;
        if (arg0 != 57) {
            method989(-16);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IFIIIBF[FFFI)V")
    public abstract void method988(int arg0, float arg1, int arg2, int arg3, int arg4, byte arg5, float arg6, float[] arg7, float arg8, float arg9, int arg10);
}
