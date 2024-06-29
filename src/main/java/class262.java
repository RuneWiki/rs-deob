import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class262 extends class45 {

    @OriginalMember(owner = "client!qq", name = "n", descriptor = "[C")
    public static char[] field3799 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!qq", name = "l", descriptor = "I")
    public static int field3797 = 0;

    @OriginalMember(owner = "client!qq", name = "k", descriptor = "I")
    public int field3796;

    @OriginalMember(owner = "client!qq", name = "r", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!qq", name = "s", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!qq", name = "t", descriptor = "I")
    public int field3805;

    @OriginalMember(owner = "client!qq", name = "u", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!qq", name = "m", descriptor = "[I")
    public int[] field3798;

    @OriginalMember(owner = "client!qq", name = "o", descriptor = "[I")
    public int[] field3800;

    @OriginalMember(owner = "client!qq", name = "w", descriptor = "[I")
    public int[] field3808;

    @OriginalMember(owner = "client!qq", name = "p", descriptor = "[Ltj;")
    public class429[] field3801;

    @OriginalMember(owner = "client!qq", name = "v", descriptor = "[Ltj;")
    public class429[] field3807;

    @OriginalMember(owner = "client!qq", name = "q", descriptor = "[[[B")
    public byte[][][] field3802;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IB)I", line = 9)
    public static final int method1802(int arg0, byte arg1) {
        if (arg1 > -21) {
            method1804(-128, (String) null);
        }
        field3803++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Z)V", line = 22)
    public static void method1803(boolean arg0) {
        field3799 = null;
        if (arg0) {
            method1804(37, (String) null);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 47)
    public static final boolean method1804(int arg0, String arg1) {
        field3804++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class167.field2254; var2++) {
            if (arg1.equalsIgnoreCase(class272.field3943[var2])) {
                return true;
            }
        }
        if (arg1.equalsIgnoreCase(class227.field2988.field340)) {
            return true;
        } else {
            if (arg0 != 98) {
                method1803(true);
            }
            return false;
        }
    }
}
