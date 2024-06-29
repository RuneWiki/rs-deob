import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class625 extends class417 {

    @OriginalMember(owner = "client!ww", name = "n", descriptor = "I")
    public int field9207;

    @OriginalMember(owner = "client!ww", name = "l", descriptor = "I")
    public int field9205;

    @OriginalMember(owner = "client!ww", name = "q", descriptor = "I")
    public static int field9210 = -1;

    @OriginalMember(owner = "client!ww", name = "r", descriptor = "I")
    public static int field9211 = -1;

    @OriginalMember(owner = "client!ww", name = "k", descriptor = "[Z")
    public static boolean[] field9204 = new boolean[100];

    @OriginalMember(owner = "client!ww", name = "p", descriptor = "I")
    public static int field9209 = 0;

    @OriginalMember(owner = "client!ww", name = "m", descriptor = "F")
    public static float field9206;

    @OriginalMember(owner = "client!ww", name = "i", descriptor = "I")
    public static int field9202;

    @OriginalMember(owner = "client!ww", name = "j", descriptor = "I")
    public static int field9203;

    @OriginalMember(owner = "client!ww", name = "o", descriptor = "I")
    public static int field9208;

    @OriginalMember(owner = "client!ww", name = "s", descriptor = "I")
    public static int field9212;

    @OriginalMember(owner = "client!ww", name = "t", descriptor = "I")
    public static int field9213;

    @OriginalMember(owner = "client!ww", name = "u", descriptor = "I")
    public static int field9214;

    @OriginalMember(owner = "client!ww", name = "v", descriptor = "I")
    public static int field9215;

    @OriginalMember(owner = "client!ww", name = "w", descriptor = "I")
    public static int field9216;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)V", line = 5)
    public static void method3652(int arg0) {
        field9204 = null;
        if (arg0 != 100) {
            method3652(-21);
        }
    }

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "(I)Z", line = 22)
    public final boolean method3653(int arg0) {
        field9208++;
        if (arg0 != -1215402346) {
            this.method3655(0);
        }
        return (this.field9207 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IZ)Z", line = 33)
    public final boolean method3654(int arg0, boolean arg1) {
        if (arg1) {
            field9216++;
            return (this.field9207 >> arg0 + 1 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "(I)I", line = 46)
    public final int method3655(int arg0) {
        field9212++;
        if (arg0 != 7) {
            field9206 = -0.21944624F;
        }
        return this.field9207 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(II)V", line = 61)
    public class625(int arg0, int arg1) {
        this.field9207 = arg0;
        this.field9205 = arg1;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(B)Z", line = 73)
    public final boolean method3656(byte arg0) {
        field9214++;
        if (arg0 > -63) {
            this.method3658(-40);
        }
        return (this.field9207 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ww", name = "g", descriptor = "(I)Z", line = 86)
    public final boolean method3657(int arg0) {
        if (arg0 < 90) {
            return true;
        } else {
            field9213++;
            return ((this.field9207 & 0x78EE2E) >> 22) != 0;
        }
    }

    @OriginalMember(owner = "client!ww", name = "h", descriptor = "(I)I", line = 97)
    public final int method3658(int arg0) {
        field9215++;
        return arg0 > -89 ? -65 : class508.method3021(this.field9207, -11);
    }
}
