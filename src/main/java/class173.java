import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class173 extends class224 {

    @OriginalMember(owner = "client!ci", name = "P", descriptor = "I")
    public static int field2740 = 0;

    @OriginalMember(owner = "client!ci", name = "R", descriptor = "Ljava/lang/String;")
    public static String field2742 = "Loading config - ";

    @OriginalMember(owner = "client!ci", name = "V", descriptor = "[S")
    public static short[] field2746 = new short[] { 39, 38, 58, 60, 50, 12, 15, 35 };

    @OriginalMember(owner = "client!ci", name = "Q", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!ci", name = "T", descriptor = "I")
    public int field2744;

    @OriginalMember(owner = "client!ci", name = "Y", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!ci", name = "S", descriptor = "Lwd;")
    public static class104 field2743;

    @OriginalMember(owner = "client!ci", name = "X", descriptor = "Ls;")
    public class107 field2748;

    @OriginalMember(owner = "client!ci", name = "W", descriptor = "Lnf;")
    public static class227 field2747;

    @OriginalMember(owner = "client!ci", name = "U", descriptor = "[B")
    public byte[] field2745;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "(I)[B")
    public final byte[] method917(int arg0) {
        ++field2749;
        if (arg0 != 100) {
            this.field2748 = null;
        }
        if (super.field3610) {
            throw new RuntimeException();
        } else {
            return this.field2745;
        }
    }

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "(I)V")
    public static void method1185(int arg0) {
        field2746 = null;
        field2743 = null;
        field2742 = null;
        int var1 = -23 % ((-22 - arg0) / 60);
        field2747 = null;
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(B)I")
    public final int method916(byte arg0) {
        ++field2741;
        if (arg0 >= -126) {
            this.field2748 = null;
        }
        return super.field3610 ? 0 : 100;
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(II)I")
    public static int method1186(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
