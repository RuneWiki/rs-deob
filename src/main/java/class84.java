import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class84 extends class127 {

    @OriginalMember(owner = "client!vk", name = "cb", descriptor = "[I")
    public static int[] field1511 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!vk", name = "X", descriptor = "Lbd;")
    public static class162 field1506 = class17.method142(0, "welle2:");

    @OriginalMember(owner = "client!vk", name = "U", descriptor = "Lbd;")
    public static class162 field1503 = class17.method142(0, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!vk", name = "eb", descriptor = "I")
    public static int field1513 = -1;

    @OriginalMember(owner = "client!vk", name = "bb", descriptor = "I")
    public static int field1510 = 0;

    @OriginalMember(owner = "client!vk", name = "V", descriptor = "Lcj;")
    public static class182 field1504 = new class182(64);

    @OriginalMember(owner = "client!vk", name = "W", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!vk", name = "Y", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!vk", name = "ab", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!vk", name = "db", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!vk", name = "fb", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!vk", name = "hb", descriptor = "I")
    public int field1516;

    @OriginalMember(owner = "client!vk", name = "ib", descriptor = "Lda;")
    public static class143 field1517;

    @OriginalMember(owner = "client!vk", name = "Z", descriptor = "Lh;")
    public class315 field1508;

    @OriginalMember(owner = "client!vk", name = "gb", descriptor = "[B")
    public byte[] field1515;

    @OriginalMember(owner = "client!vk", name = "jb", descriptor = "[[S")
    public static short[][] field1518;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILbd;I)V", line = 5)
    public static final void method648(int arg0, class162 arg1, int arg2) {
        class63 var3 = class46.method332(3, arg2, -12770);
        var3.method430(false);
        if (arg0 != 0) {
            field1510 = -54;
        }
        var3.field987 = arg1;
        field1509++;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZLlb;)I", line = 23)
    public static final int method649(boolean arg0, class60 arg1) {
        field1505++;
        class83 var2 = arg1.field926;
        if (var2.field1502 != null) {
            var2 = var2.method643(true);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg0) {
            method651(false);
        }
        int var3 = var2.field1484;
        if (arg1.field5068 == arg1.field5064) {
            var3 = var2.field1460;
        } else if (arg1.field5064 == arg1.field5021) {
            var3 = var2.field1501;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(Z)I", line = 61)
    public final int method650(boolean arg0) {
        field1507++;
        if (this.field2311) {
            return 0;
        } else {
            if (arg0) {
                method648(-46, (class162) null, -80);
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "(Z)V", line = 82)
    public static void method651(boolean arg0) {
        field1503 = null;
        field1517 = null;
        field1511 = null;
        if (arg0) {
            field1518 = (short[][]) null;
            field1506 = null;
            field1504 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "(Z)[B", line = 100)
    public final byte[] method652(boolean arg0) {
        field1514++;
        if (arg0) {
            method651(false);
        }
        if (this.field2311) {
            throw new RuntimeException();
        }
        return this.field1515;
    }
}
