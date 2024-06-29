import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class104 {

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public int field1424;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public int field1425;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public int field1428;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public int field1430;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "Lcha;")
    public static class220 field1426 = new class220(4, -1);

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "[I")
    public static int[] field1432 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
    public static void method821(byte arg0) {
        if (arg0 == 123) {
            field1432 = null;
            field1426 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)V")
    public static final void method822(byte arg0) {
        for (class357 var1 = (class357) class482.field6546.method3672(-1); var1 != null; var1 = (class357) class482.field6546.method3662(-1)) {
            if (var1.field4599) {
                var1.method2072(0);
            }
        }
        field1423++;
        if (arg0 > -33) {
            return;
        }
        for (class357 var2 = (class357) class757.field10561.method3672(-1); var2 != null; var2 = (class357) class757.field10561.method3662(-1)) {
            if (var2.field4599) {
                var2.method2072(0);
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)Lhk;")
    public final class104 method823(int arg0, int arg1) {
        if (arg1 != 9) {
            method824(-109, 65, (byte) -103, -94, 99, 101, -98);
        }
        field1429++;
        return new class104(this.field1430, arg0, this.field1425, this.field1424);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIBIIII)V")
    public static final void method824(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field1431++;
        if (arg2 != 1) {
            method824(-103, -81, (byte) 124, -97, -61, -106, 38);
        }
        if (class748.field10451.field10434.method4186((byte) 87) != 0 && arg4 != 0 && class3.field26 < 50 && arg0 != -1) {
            class742.field10360[class3.field26++] = new class268((byte) 1, arg0, arg4, arg6, arg3, arg5, arg1, null);
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(IIII)V")
    public class104(int arg0, int arg1, int arg2, int arg3) {
        this.field1424 = arg3;
        this.field1425 = arg2;
        this.field1428 = arg1;
        this.field1430 = arg0;
    }
}
