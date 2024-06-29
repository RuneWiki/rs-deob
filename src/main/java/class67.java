import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class67 {

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "Lud;")
    public static class279 field1324 = null;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "Lud;")
    public static class279 field1325 = class130.method1024(" weitere Optionen", 255);

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "Lud;")
    public static class279 field1330 = class130.method1024(")3)3)3", 255);

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "Lud;")
    private static class279 field1329 = class130.method1024("yellow:", 255);

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "Lud;")
    public static class279 field1328 = field1329;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "Lud;")
    public static class279 field1327 = field1329;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V", line = 11)
    public static void method592(byte arg0) {
        int var1 = -39 % ((arg0 + 83) / 38);
        field1324 = null;
        field1325 = null;
        field1329 = null;
        field1330 = null;
        field1328 = null;
        field1327 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lvh;I)Llk;", line = 48)
    public static final class276 method593(class53 arg0, int arg1) {
        field1326++;
        return arg1 == -1051915848 ? new class276(arg0.method495((byte) 94), arg0.method495((byte) 119), arg0.method495((byte) 84), arg0.method495((byte) 86), arg0.method461((byte) 123), arg0.method461((byte) 127), arg0.method483(-126)) : (class276) null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIIII)V", line = 77)
    public static final void method594(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 != 0) {
            field1329 = (class279) null;
        }
        field1333++;
        if (arg6 < 1 || arg2 < 1 || arg6 > 102 || arg2 > 102) {
            return;
        }
        if (!class221.method1617((byte) 29) && (class257.field4573[0][arg6][arg2] & 0x2) == 0) {
            int var8 = arg1;
            if ((class257.field4573[arg1][arg6][arg2] & 0x8) != 0) {
                var8 = 0;
            }
            if (class179.field3245 != var8) {
                return;
            }
        }
        int var9 = arg1;
        if (arg1 < 3 && (class257.field4573[1][arg6][arg2] & 0x2) == 2) {
            var9 = arg1 + 1;
        }
        class51.method430(101, arg1, var9, arg2, arg7, class90.field1702[arg1], arg6);
        if (arg3 >= 0) {
            boolean var10 = class202.field3608;
            class202.field3608 = true;
            class20.method191(class90.field1702[arg1], arg6, var9, arg5, arg0, false, (byte) -104, false, arg1, arg3, arg2);
            class202.field3608 = var10;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIILok;)Lbn;", line = 131)
    public static final class66 method595(int arg0, int arg1, int arg2, class149 arg3) {
        field1332++;
        if (class137.method1066(arg0, 25486, arg3, arg1)) {
            if (arg2 != -8443) {
                field1325 = (class279) null;
            }
            return class84.method731(72);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)V", line = 172)
    public static final void method596(byte arg0) {
        if (arg0 <= 104) {
            field1330 = (class279) null;
        }
        class54.field1186 = new class317();
        field1331++;
    }
}
