import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class86 {

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "Lid;")
    public static class149 field1566 = class60.method382(" ", (byte) 18);

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field1567 = 0;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "Luk;")
    public static class98 field1570 = new class98();

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "Z")
    public static boolean field1573 = true;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "Lid;")
    public static class149 field1576 = class60.method382(")4a=", (byte) 94);

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "Lid;")
    public static class149 field1575 = class60.method382("Benutzen", (byte) 96);

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "Lvc;")
    public static class190 field1574;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "Laj;")
    public static class47 field1572;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "[[[I")
    public static int[][][] field1564;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)V")
    public static final void method640(int arg0, int arg1) {
        field1571++;
        if (arg1 != 0) {
            field1570 = null;
        }
        class259.field4552.method1289(arg0, arg1 + 119);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIILnd;II)Lnd;")
    public static final class262 method641(int arg0, int arg1, int arg2, int arg3, class262 arg4, int arg5, int arg6) {
        long var7 = (long) arg3;
        field1565++;
        class262 var9 = (class262) class77.field1443.method1293(var7, false);
        if (var9 == null) {
            class241 var10 = class241.method1661(class269.field4851, arg3, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1668(64, 768, -50, -10, -50);
            class77.field1443.method1295(var7, var9, (byte) -71);
        }
        int var11 = arg4.method853();
        int var12 = arg4.method852();
        int var13 = arg4.method828();
        int var14 = arg4.method850();
        class262 var15 = var9.method848(true, true, true);
        if (arg0 != 0) {
            var15.method835(arg0);
        }
        int var16 = 34 % ((arg2 + 50) / 37);
        class121 var17 = (class121) var15;
        if (arg5 != class287.method1968(class277.field4948, arg6 + var11, arg1 + var13, (byte) 99) || arg5 != class287.method1968(class277.field4948, arg6 + var12, arg1 + var14, (byte) -76)) {
            for (int var18 = 0; var18 < var17.field2079; var18++) {
                var17.field2066[var18] += class287.method1968(class277.field4948, var17.field2096[var18] + arg6, var17.field2071[var18] - -arg1, (byte) 94) - arg5;
            }
            var17.field2086 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
    public static final void method642(byte arg0) {
        field1568++;
        class102.field1795.method1291(0);
        int var1 = -27 / ((-arg0 - 19) / 61);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public static void method643(int arg0) {
        field1576 = null;
        field1572 = null;
        field1566 = null;
        if (arg0 != -11725) {
            method641(-97, -31, -105, -60, (class262) null, 45, 39);
        }
        field1574 = null;
        field1575 = null;
        field1564 = null;
        field1570 = null;
    }
}
