import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class20 {

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public int field361 = -1;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "Lrd;")
    private static class114 field348 = class84.method656("To", (byte) 120);

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field356 = 0;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field352 = 0;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "Lrd;")
    public static class114 field359 = class84.method656(": ", (byte) 119);

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "Lrd;")
    public static class114 field360 = class84.method656("Diese Welt ist voll)3", (byte) 119);

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public static int field357 = -1;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    public static int field363 = 0;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "Lrd;")
    private static class114 field355 = class84.method656("Unable to find ", (byte) 116);

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "Lrd;")
    public static class114 field368 = class84.method656("mapscene", (byte) 121);

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "Lrd;")
    private static class114 field369 = class84.method656("Enter name of player to add to list", (byte) 115);

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "Z")
    public static boolean field364 = false;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "Lrd;")
    public static class114 field366 = field348;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "I")
    public static int field370 = 0;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "Lrd;")
    public static class114 field349 = field355;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "Lrd;")
    public static class114 field365 = field369;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "Lwb;")
    public class142 field354;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "Lhe;")
    public static class54 field347;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "Ljd;")
    public static class66 field351;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "[I")
    public int[] field367;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "[Lrd;")
    public class114[] field362;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "[Loa;")
    public static class93[] field358;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public static void method133(int arg0) {
        field348 = null;
        field347 = null;
        field355 = null;
        field349 = null;
        field360 = null;
        field368 = null;
        field358 = null;
        if (arg0 != -1) {
            method134(1);
        }
        field351 = null;
        field366 = null;
        field369 = null;
        field359 = null;
        field365 = null;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
    public static final void method134(int arg0) {
        if (arg0 >= 62) {
            field350++;
            class63.method513((byte) -125, 0, null, false);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lf;II)V")
    public static final void method135(class36 arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method133(-10);
        }
        field353++;
        class21.method136(arg0.field756, arg2, arg0.field712, 128);
    }
}
