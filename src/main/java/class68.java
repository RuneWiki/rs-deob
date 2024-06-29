import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class68 {

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "I")
    public int field1039;

    @OriginalMember(owner = "client!qw", name = "k", descriptor = "I")
    public int field1048;

    @OriginalMember(owner = "client!qw", name = "j", descriptor = "B")
    public byte field1047;

    @OriginalMember(owner = "client!qw", name = "l", descriptor = "I")
    public int field1049;

    @OriginalMember(owner = "client!qw", name = "d", descriptor = "I")
    public int field1041;

    @OriginalMember(owner = "client!qw", name = "p", descriptor = "Lub;")
    public class20 field1053;

    @OriginalMember(owner = "client!qw", name = "f", descriptor = "I")
    public int field1043;

    @OriginalMember(owner = "client!qw", name = "g", descriptor = "I")
    public int field1044;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "Lwo;")
    public static class690 field1038 = new class690(5, 2);

    @OriginalMember(owner = "client!qw", name = "m", descriptor = "Lwo;")
    public static class690 field1050 = new class690(109, -1);

    @OriginalMember(owner = "client!qw", name = "n", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!qw", name = "h", descriptor = "Lr;")
    public static class165 field1045;

    @OriginalMember(owner = "client!qw", name = "q", descriptor = "Ltu;")
    public class319 field1054;

    @OriginalMember(owner = "client!qw", name = "i", descriptor = "Lpp;")
    public class360 field1046;

    @OriginalMember(owner = "client!qw", name = "e", descriptor = "Lep;")
    public class387 field1042;

    @OriginalMember(owner = "client!qw", name = "o", descriptor = "Lla;")
    public static class419 field1052;

    @OriginalMember(owner = "client!qw", name = "c", descriptor = "Luca;")
    public class476 field1040;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(I)V")
    public static void method622(int arg0) {
        field1052 = null;
        field1045 = null;
        if (arg0 > -55) {
            method622(88);
        }
        field1050 = null;
        field1038 = null;
    }

    @OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(BIIIIIILub;)V")
    public class68(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class20 arg7) {
        this.field1039 = arg4;
        this.field1048 = arg6;
        this.field1047 = arg0;
        this.field1049 = arg5;
        this.field1041 = arg3;
        this.field1053 = arg7;
        this.field1043 = arg1;
        this.field1044 = arg2;
    }

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(I)Z")
    public final boolean method623(int arg0) {
        if (arg0 != -1) {
            field1052 = null;
        }
        field1051++;
        return this.field1047 == 2 || this.field1047 == 3;
    }
}
