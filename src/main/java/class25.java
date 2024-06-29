import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class25 extends class163 {

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    public int field321;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
    public int field320;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "Lke;")
    public static class256 field328 = class316.method2202("headicons_prayer", 27626);

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "Lke;")
    public static class256 field327 = class316.method2202("Starte 3D)2Softwarebibliothek)3", 27626);

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "Lke;")
    private static class256 field330 = class316.method2202("Loaded textures", 27626);

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "Lke;")
    public static class256 field324 = field330;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "Lvm;")
    public static class297 field325 = new class297(64);

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "[[Z")
    public static boolean[][] field326;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V", line = 30)
    public static final void method156(byte arg0) {
        field323++;
        class254.field4355 = new class254(32);
        if (arg0 != -114) {
            field326 = (boolean[][]) ((boolean[][]) null);
        }
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)V", line = 41)
    public static void method157(int arg0) {
        field326 = (boolean[][]) null;
        field325 = null;
        if (arg0 != 6133) {
            field328 = (class256) null;
        }
        field328 = null;
        field327 = null;
        field330 = null;
        field324 = null;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(II)V", line = 54)
    public class25(int arg0, int arg1) {
        this.field321 = arg1;
        this.field320 = arg0;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(III)I", line = 64)
    public static final int method158(int arg0, int arg1, int arg2) {
        field329++;
        if (arg2 != 26599) {
            return -20;
        }
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg0 >>= 0x1;
        }
        if (arg0 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }
}
