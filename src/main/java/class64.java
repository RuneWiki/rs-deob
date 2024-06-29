import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class64 {

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "Ldj;")
    public static class44 field1183 = class89.method650(255, "Mem:");

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "Ldj;")
    public static class44 field1184 = class89.method650(255, "Bitte geben Sie Ihren Benutzernamen ein)3");

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public static int field1188 = 0;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "Z")
    public static boolean field1189 = false;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "Ldj;")
    public static class44 field1187 = class89.method650(255, "(U0a )2 in: ");

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "Lwc;")
    public static class233 field1185;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BLfj;)Lo;")
    public static final class151 method474(byte arg0, class66 arg1) {
        int var2 = 4 % ((arg0 - 45) / 58);
        field1191++;
        class151 var3 = new class151();
        var3.field2628 = arg1.method500(88);
        var3.field2635 = class63.method473((byte) -97, var3.field2628);
        return var3;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
    public static final void method475(byte arg0) {
        class78.field1514 = null;
        class216.field3928 = null;
        class221.field4005 = null;
        class201.field3564 = null;
        class130.field2331 = null;
        class94.field1740 = null;
        field1192++;
        class214.field3893 = null;
        class116.field2070 = null;
        class30.field526 = null;
        class165.field2845 = null;
        class156.field2706 = null;
        if (arg0 <= 70) {
            field1190 = 2;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILve;)V")
    public static final void method476(int arg0, class225 arg1) {
        class40.field751 = arg1;
        field1186++;
        if (arg0 != 0) {
            method477((byte) 87);
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)V")
    public static void method477(byte arg0) {
        if (arg0 != -44) {
            field1184 = null;
        }
        field1184 = null;
        field1187 = null;
        field1183 = null;
        field1185 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)Lj;")
    public static final class98 method478(int arg0, int arg1, int arg2) {
        class68 var3 = class32.field567[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1318;
    }
}
