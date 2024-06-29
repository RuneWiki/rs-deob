import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class445 extends class61 {

    @OriginalMember(owner = "client!qq", name = "m", descriptor = "Ldb;")
    public static class298 field6087 = new class298(42, 3);

    @OriginalMember(owner = "client!qq", name = "r", descriptor = "[I")
    public static int[] field6092 = new int[4096];

    @OriginalMember(owner = "client!qq", name = "q", descriptor = "Lnea;")
    public static class670 field6091 = new class670();

    @OriginalMember(owner = "client!qq", name = "s", descriptor = "Ltga;")
    public static class54 field6093 = new class54("WTI", 5);

    @OriginalMember(owner = "client!qq", name = "k", descriptor = "I")
    public static int field6085;

    @OriginalMember(owner = "client!qq", name = "l", descriptor = "I")
    public static int field6086;

    @OriginalMember(owner = "client!qq", name = "n", descriptor = "I")
    public static int field6088;

    @OriginalMember(owner = "client!qq", name = "o", descriptor = "I")
    public static int field6089;

    @OriginalMember(owner = "client!qq", name = "p", descriptor = "I")
    public static int field6090;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(III)Z")
    public static final boolean method2507(int arg0, int arg1, int arg2) {
        field6090++;
        if (arg2 != -6) {
            method2507(-44, 21, 43);
        }
        return (arg0 & 0x580) != 0;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZI)I")
    public static final int method2508(boolean arg0, int arg1) {
        field6086++;
        if (arg0) {
            method2509(12, -109);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)Z")
    public static final boolean method2509(int arg0, int arg1) {
        if (arg0 != -7) {
            method2507(-69, -100, 26);
        }
        field6088++;
        return arg1 == 3 || arg1 == 4 || arg1 == 5 || arg1 == 6;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(BII)Z")
    public static final boolean method2510(byte arg0, int arg1, int arg2) {
        field6085++;
        if (arg0 > -27) {
            return false;
        } else {
            return (arg2 & 0x21) != 0;
        }
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(B)V")
    public static void method2511(byte arg0) {
        field6087 = null;
        if (arg0 >= -109) {
            field6091 = null;
        }
        field6092 = null;
        field6093 = null;
        field6091 = null;
    }
}
