import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class448 {

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
    public int field5939;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
    public static int field5940;

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "I")
    public int field5941;

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "I")
    public static int field5942;

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "I")
    public int field5943;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lha;ILpia;)I")
    public static final int method2527(class60 arg0, int arg1, class97 arg2) {
        field5940++;
        if (arg1 != -32440) {
            method2527(null, -87, null);
        }
        if (arg2.field1346 != -1) {
            return arg2.field1346;
        }
        if (arg2.field1360 != -1) {
            class537 var3 = arg0.field830.method1072(arg2.field1360, true);
            if (!var3.field7456) {
                return var3.field7451;
            }
        }
        return arg2.field1342;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIB)Ljava/lang/String;")
    public static final String method2528(int arg0, int arg1, byte arg2) {
        field5942++;
        int var3 = arg0 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else {
            if (arg2 <= 126) {
                field5938 = 21;
            }
            if (var3 > 9) {
                return "<col=00ff00>";
            } else if (var3 > 6) {
                return "<col=40ff00>";
            } else if (var3 > 3) {
                return "<col=80ff00>";
            } else if (var3 > 0) {
                return "<col=c0ff00>";
            } else {
                return "<col=ffff00>";
            }
        }
    }
}
