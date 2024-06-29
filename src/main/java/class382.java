import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class382 {

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "I")
    public int field5921;

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "I")
    public static int field5922;

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!uw", name = "d", descriptor = "I")
    public static int field5924;

    @OriginalMember(owner = "client!uw", name = "e", descriptor = "I")
    public int field5925;

    @OriginalMember(owner = "client!uw", name = "f", descriptor = "I")
    public int field5926;

    @OriginalMember(owner = "client!uw", name = "g", descriptor = "I")
    public int field5927;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIIBIII)V")
    public static final void method2500(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field5924++;
        if (arg3 != -24) {
            field5923 = 8;
        }
        for (class87 var7 = (class87) class677.field9525.method2754((byte) 120); var7 != null; var7 = (class87) class677.field9525.method2759(1486415172)) {
            if (class562.field8084 >= var7.field1056) {
                var7.method2648((byte) -25);
            } else {
                class663.method3804(arg3 ^ 0xFFFFFF9F, var7.field1063 * 2, arg6 >> 1, (var7.field1057 << 9) + 256, (var7.field1060 << 9) - -256, var7.field1067, arg1, arg2 >> 1, arg4);
                class246.field3928.method2654(class321.field5031[1] + arg5, 0, var7.field1059 | 0xFF000000, var7.field1069, class321.field5031[0] + arg0, true);
            }
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)V")
    public static final void method2501(int arg0) {
        if (arg0 != 2) {
            return;
        }
        field5922++;
        if (class331.field5129 == null) {
            return;
        }
        if (class331.field5129.field9884 == 1) {
            class331.field5129 = null;
            return;
        }
        if (class331.field5129.field9884 == 2) {
            class680.method3877(class268.field4359, class148.field2467, false, 2);
            class331.field5129 = null;
            return;
        }
    }
}
