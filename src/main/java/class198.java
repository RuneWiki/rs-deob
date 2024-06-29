import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class198 {

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field3448 = -1;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "Loa;")
    public static class99 field3444 = class221.method1463(2844, "mapscene");

    @OriginalMember(owner = "client!t", name = "e", descriptor = "Loa;")
    public static class99 field3447 = class221.method1463(2844, ")2");

    @OriginalMember(owner = "client!t", name = "g", descriptor = "Loa;")
    private static class99 field3449 = class221.method1463(2844, "Loading config )2 ");

    @OriginalMember(owner = "client!t", name = "c", descriptor = "Loa;")
    public static class99 field3445 = field3449;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "[Lte;")
    public static class77[] field3451;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BI)V")
    public static final void method1330(byte arg0, int arg1) {
        field3452++;
        if (arg0 < 92) {
            field3451 = null;
        }
        class65 var2 = class152.method1010(arg1, 10, (byte) -61);
        var2.method426((byte) 115);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
    public static final void method1331(byte arg0) {
        field3450++;
        class64.field1078 = 0;
        client.field2779 = 0;
        class234.method1526(true);
        class73.method504(arg0 ^ 0x1E);
        class287.method1932(true);
        for (int var1 = 0; var1 < client.field2779; var1++) {
            int var3 = class100.field1715[var1];
            if (class56.field926 != class248.field4287[var3].field1274) {
                if (class248.field4287[var3].field2793.method1670((byte) -87)) {
                    class41.method315(class248.field4287[var3], (byte) 90);
                }
                class248.field4287[var3].method1073(0, (class257) null);
                class248.field4287[var3] = null;
            }
        }
        if (class180.field3146 != class129.field2252.field4587) {
            throw new RuntimeException("gnp1 pos:" + class129.field2252.field4587 + " psize:" + class180.field3146);
        }
        int var2 = 0;
        if (arg0 != 13) {
            method1332(41, (class99[]) null);
        }
        while (class102.field1735 > var2) {
            if (class248.field4287[class239.field4120[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class102.field1735);
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I[Loa;)Loa;")
    public static final class99 method1332(int arg0, class99[] arg1) {
        field3453++;
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        } else if (arg0 <= 50) {
            return null;
        } else {
            return class141.method954(0, 0, arg1.length, arg1);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)Loa;")
    public static final class99 method1333(int arg0, int arg1) {
        if (arg0 > -83) {
            return null;
        } else {
            field3446++;
            return class259.method1685(false, 10, arg1, 8798);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILtg;)V")
    public static final void method1334(int arg0, class182 arg1) {
        field3443++;
        class260.field4536 = arg1;
        int var2 = 54 % ((arg0 - 68) / 36);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public static void method1335(int arg0) {
        field3451 = null;
        field3447 = null;
        field3445 = null;
        field3444 = null;
        if (arg0 != 0) {
            method1333(-58, -99);
        }
        field3449 = null;
    }
}
