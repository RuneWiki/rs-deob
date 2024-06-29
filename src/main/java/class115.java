import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class115 {

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "Llh;")
    public static class487 field1584 = new class487(46, -1);

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V", line = 10)
    public static final void method822(int arg0) {
        if (arg0 > -26) {
            method824(2, 126, -31, -100, -77, 13, 76, -112, 121, -84);
        }
        field1581++;
        if (class285.field3921 == 3) {
            class178.method1232(4, (byte) 33);
        } else if (class285.field3921 == 7) {
            class178.method1232(8, (byte) -105);
        } else if (class285.field3921 == 10) {
            class178.method1232(11, (byte) 92);
        }
    }

    @OriginalMember(owner = "client!hw", name = "toString", descriptor = "()Ljava/lang/String;", line = 33)
    public final String toString() {
        field1583++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)V", line = 44)
    public static void method823(byte arg0) {
        field1584 = null;
        if (arg0 != -74) {
            field1584 = null;
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIIIIIIII)V", line = 60)
    public static final void method824(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1582++;
        class81 var10 = null;
        for (class81 var11 = (class81) class645.field8903.method1436(arg3 + 28961); var11 != null; var11 = (class81) class645.field8903.method1443((byte) 6)) {
            if (var11.field1227 == arg9 && var11.field1219 == arg0 && var11.field1220 == arg5 && var11.field1225 == arg1) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class81();
            var10.field1225 = arg1;
            var10.field1227 = arg9;
            var10.field1220 = arg5;
            var10.field1219 = arg0;
            if (arg0 >= 0 && arg5 >= 0 && class401.field5620 > arg0 && arg5 < class257.field3508) {
                class80.method627(arg3 ^ 0xFFFFFFF8, var10);
            }
            class645.field8903.method1441(var10, arg3 ^ 0x3);
        }
        var10.field1221 = arg6;
        if (arg3 != 3) {
            method824(-41, -74, -110, -18, -5, 118, 4, -86, 114, -105);
        }
        var10.field1216 = arg2;
        var10.field1213 = arg4;
        var10.field1214 = arg8;
        var10.field1222 = arg7;
    }
}
