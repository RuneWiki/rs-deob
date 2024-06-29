import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class63 {

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public int field796;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public int field797;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Lsd;")
    public class63 field794;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "Lc;")
    public class125 field800;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "[I")
    public static int[] field792 = new int[2];

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field786 = 0;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public int field785;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public int field787;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    public int field798;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "Loi;")
    public static class53 field801;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)Lki;", line = 3)
    public final class509 method504(byte arg0) {
        field793++;
        if (arg0 < 39) {
            method507(106, 8);
        }
        return class169.method1060((byte) -65, this.field796);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)Lsd;", line = 17)
    public final class63 method505(int arg0, int arg1) {
        field799++;
        return arg0 == 6530 ? new class63(this.field796, arg1) : null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZILhm;)Ljava/lang/String;", line = 30)
    public static final String method506(boolean arg0, int arg1, class150 arg2) {
        field795++;
        if (!client.method1291(arg2).method2887(arg1, (byte) 117) && arg2.field2039 == null) {
            return null;
        }
        if (!arg0) {
            field789 = -110;
        }
        if (arg2.field2070 == null || arg1 >= arg2.field2070.length || arg2.field2070[arg1] == null || arg2.field2070[arg1].trim().length() == 0) {
            return class126.field1700 ? "Hidden-" + arg1 : null;
        } else {
            return arg2.field2070[arg1];
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)Z", line = 62)
    public static final boolean method507(int arg0, int arg1) {
        if (arg0 > -118) {
            method506(false, -86, null);
        }
        field790++;
        return arg1 >= 4 && arg1 <= 8;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)I", line = 79)
    public static final int method508(int arg0, int arg1, int arg2) {
        field788++;
        if (arg1 <= 40) {
            field786 = 83;
        }
        return arg0 == 4 || arg0 == 5 ? class227.field3262[arg2 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V", line = 94)
    public static void method509(int arg0) {
        field801 = null;
        if (arg0 == 5) {
            field792 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(II)V", line = 106)
    public class63(int arg0, int arg1) {
        this.field796 = arg0;
        this.field797 = arg1;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lsd;I)V", line = 118)
    public class63(class63 arg0, int arg1) {
        this.field794 = arg0;
        this.field800 = this.field794.field800;
        this.field796 = this.field794.field796;
        this.field797 = this.field794.field797 + arg1;
    }
}
