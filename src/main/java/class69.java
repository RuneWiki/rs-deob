import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class69 {

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field1057 = -1;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "[Lun;")
    public static class389[] field1062 = new class389[2048];

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "Lwo;")
    public static class690 field1058 = new class690(115, 3);

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public int field1055;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public int field1056;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public int field1060;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field1061;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kl", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field1063;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BLwv;)V")
    public static final void method624(byte arg0, class32 arg1) {
        field1059++;
        if (arg0 < 23) {
            field1058 = null;
        }
        if (class281.field3808 == null) {
            return;
        }
        class691 var2 = null;
        if (arg1.field662 == 0) {
            var2 = (class691) class511.method3030(arg1.field648, arg1.field647, arg1.field661);
        }
        if (arg1.field662 == 1) {
            var2 = (class691) class168.method1059(arg1.field648, arg1.field647, arg1.field661);
        }
        if (arg1.field662 == 2) {
            var2 = (class691) class564.method3296(arg1.field648, arg1.field647, arg1.field661, field1063 == null ? (field1063 = method626("pn")) : field1063);
        }
        if (arg1.field662 == 3) {
            var2 = (class691) class403.method2429(arg1.field648, arg1.field647, arg1.field661);
        }
        if (var2 == null) {
            arg1.field650 = -1;
            arg1.field652 = 0;
            arg1.field658 = 0;
        } else {
            arg1.field650 = var2.method1072(4378);
            arg1.field658 = var2.method1070(-24359);
            arg1.field652 = var2.method1067((byte) 93);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V")
    public static void method625(byte arg0) {
        if (arg0 != 97) {
            method624((byte) -32, null);
        }
        field1062 = null;
        field1058 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method626(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
