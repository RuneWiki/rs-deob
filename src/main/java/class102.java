import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class102 {

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "J")
    public long field1364 = 0L;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public int field1356;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public int field1358;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public int field1359;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public int field1363;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public int field1366;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "Lgh;")
    public class248 field1362;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "Lgh;")
    public class248 field1365;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "Lgn;")
    public static class321 field1355;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIBI)V", line = 18)
    public static final void method707(int arg0, int arg1, byte arg2, int arg3) {
        if (arg3 == 0) {
            class183.field2965.method1947((byte) 53, 195);
            class183.field2965.method81((byte) -122, 5);
            class95.field1265++;
        }
        if (arg3 == 1) {
            class11.field203++;
            class183.field2965.method1947((byte) 94, 248);
            class183.field2965.method81((byte) -114, 19);
        }
        class183.field2965.method81((byte) -105, class260.field4093[82] ? 1 : 0);
        field1357++;
        class183.field2965.method45(true, arg1 + class326.field5108);
        if (arg2 == -26) {
            class183.field2965.method30(class198.field3168 + arg0, (byte) 125);
            class121.field1751 = arg1;
            class18.field292 = arg0;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIB)I", line = 49)
    public static final int method708(int arg0, int arg1, int arg2, byte arg3) {
        field1368++;
        if (arg3 != -27) {
            field1355 = (class321) null;
        }
        if ((class134.field1969[arg2][arg1][arg0] & 0x8) == 0) {
            return arg2 <= 0 || (class134.field1969[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILug;)V", line = 68)
    public static final void method709(int arg0, class253 arg1) {
        field1361++;
        int var2 = -92 / ((-arg0 - 11) / 50);
        class32.field473 = arg1;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V", line = 85)
    public static void method710(int arg0) {
        field1355 = null;
        if (arg0 != 1) {
            field1355 = (class321) null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)I", line = 98)
    public static final int method711(int arg0) {
        if (arg0 != -15687) {
            field1355 = (class321) null;
        }
        field1367++;
        return class281.field4345;
    }
}
