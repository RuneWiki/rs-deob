import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class536 {

    @OriginalMember(owner = "client!as", name = "c", descriptor = "Z")
    public static boolean field7874 = true;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "[Lhea;")
    public static class374[] field7876 = new class374[14];

    @OriginalMember(owner = "client!as", name = "a", descriptor = "I")
    public static int field7872;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "I")
    public static int field7873;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "I")
    public static int field7875;

    @OriginalMember(owner = "client!as", name = "f", descriptor = "I")
    public static int field7877;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIZII)Lsh;", line = 6)
    public static final class259 method3142(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field7875++;
        class259 var5 = new class259();
        var5.field3711 = arg0;
        var5.field3716 = arg3;
        class199.field3098.method2816(var5, (long) arg1, false);
        class130.method1018(arg3, -16686);
        class101 var6 = class271.method1711(arg1, 23727);
        if (var6 != null) {
            class326.method1948(1, var6);
        }
        if (class223.field3353 != null) {
            class326.method1948(1, class223.field3353);
            class223.field3353 = null;
        }
        class199.method1395((byte) -38);
        if (var6 != null) {
            class486.method2843(52, !arg2, var6);
        }
        if (!arg2) {
            class362.method2167(arg3);
        }
        if (!arg2 && class557.field8146 != -1) {
            class611.method3461(1, class557.field8146, true);
        }
        if (arg4 > -1) {
            field7873 = -10;
        }
        return var5;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 50)
    public static final boolean method3143(byte arg0, String arg1) {
        field7872++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class90.field1333; var2++) {
            if (arg1.equalsIgnoreCase(class57.field854[var2])) {
                return true;
            }
            if (arg1.equalsIgnoreCase(class617.field8817[var2])) {
                return true;
            }
        }
        if (arg0 <= 16) {
            method3145(null, (byte) -90);
        }
        return false;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(B)V", line = 86)
    public static void method3144(byte arg0) {
        field7876 = null;
        if (arg0 != 125) {
            method3144((byte) 101);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Luea;B)Z", line = 100)
    public static final boolean method3145(class256 arg0, byte arg1) {
        if (arg1 != 98) {
            method3144((byte) 100);
        }
        field7877++;
        return class263.field3783 == arg0 || class275.field3914 == arg0 || class443.field6422 == arg0 || class451.field6498 == arg0;
    }
}
