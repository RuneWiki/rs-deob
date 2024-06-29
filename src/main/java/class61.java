import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public abstract class class61 {

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "Lqe;")
    public static class179 field1297 = class206.method1380("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", (byte) -126);

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field1299 = 0;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "Lie;")
    public static class92 field1294 = new class92();

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "Lqe;")
    public static class179 field1302 = class206.method1380("::clientdrop", (byte) 79);

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "Lkg;")
    public static class115 field1298;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lqe;I)Lcc;")
    public static final class25 method411(class179 arg0, int arg1) {
        field1292++;
        if (arg0.method1168(true) == 0) {
            return null;
        }
        class25 var2 = (class25) class136.field2519.method242(16711680);
        if (arg1 < 95) {
            method414(73);
        }
        while (var2 != null) {
            if (var2.field589.method1166(arg0, 40)) {
                return var2;
            }
            var2 = (class25) class136.field2519.method237(10);
        }
        return null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIII)I")
    public static final int method412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1301++;
        if (arg1 != -1271474964) {
            method412(-26, 67, 119, 57, 127, -82, 90);
        }
        int var7 = arg5 & 0x3;
        if ((arg3 & 0x1) == 1) {
            int var8 = arg4;
            arg4 = arg2;
            arg2 = var8;
        }
        if (var7 == 0) {
            return arg0;
        } else if (var7 == 1) {
            return arg6;
        } else if (var7 == 2) {
            return 7 + 1 - arg0 - arg4;
        } else {
            return 1 + 7 - arg2 - arg6;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)I")
    public static final int method413(int arg0, int arg1) {
        field1296++;
        return arg1 == 1023 ? arg0 & 0x3FF : -125;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public static void method414(int arg0) {
        field1297 = null;
        field1294 = null;
        field1302 = null;
        if (arg0 == -256) {
            field1298 = null;
        }
    }
}
