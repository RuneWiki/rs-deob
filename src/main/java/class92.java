import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class92 extends class337 {

    @OriginalMember(owner = "client!ls", name = "r", descriptor = "Lri;")
    public static class73 field1375 = new class73(72, -1);

    @OriginalMember(owner = "client!ls", name = "t", descriptor = "[Lid;")
    public static class412[] field1377 = new class412[0];

    @OriginalMember(owner = "client!ls", name = "o", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!ls", name = "p", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!ls", name = "q", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!ls", name = "s", descriptor = "I")
    public int field1376;

    @OriginalMember(owner = "client!ls", name = "u", descriptor = "I")
    public int field1378;

    @OriginalMember(owner = "client!ls", name = "v", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method532(String arg0, int arg1) {
        if (arg1 != 10) {
            field1374 = -44;
        }
        field1373++;
        return class375.method2304(arg0, true, 10, 67);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIIB)V")
    public static final void method533(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 > -32) {
            method533(-126, -29, -23, -74, (byte) 80);
        }
        field1372++;
        class338 var5 = class230.method1580(10, -1332166328, arg1);
        var5.method2053(-106);
        var5.field4751 = arg0;
        var5.field4756 = arg2;
        var5.field4748 = arg3;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Z)V")
    public static void method534(boolean arg0) {
        field1375 = null;
        if (arg0) {
            field1377 = null;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIII)V")
    public static final void method535(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1379++;
        if (class426.field6401.field1022 != arg3 && arg0 != 0 && class299.field4256 < 50 && arg1 != -1) {
            class333.field4700[class299.field4256++] = new class297((byte) 2, arg1, arg0, arg2, arg4, 0);
        }
    }
}
