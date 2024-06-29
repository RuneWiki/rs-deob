import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class91 {

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "Z")
    public static boolean field1657 = false;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field1656 = 2;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)Z")
    public static final boolean method688(int arg0, int arg1) {
        field1655++;
        if (arg1 == -19388) {
            return (arg0 >> 31 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIB)I")
    public static final int method689(int arg0, int arg1, int arg2, byte arg3) {
        field1653++;
        int var4 = -78 % ((arg3 + 30) / 57);
        if (arg1 > arg0) {
            return arg1;
        } else if (arg0 <= arg2) {
            return arg0;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static final void method690(int arg0) {
        class124.field2179 = 0;
        field1658++;
        class155.field2752 = 0;
        class220.method1464(121);
        if (arg0 != -17638) {
            return;
        }
        class121.method870(-81);
        class213.method1429((byte) -125);
        class160.method1127((byte) -41);
        for (int var1 = 0; var1 < class124.field2179; var1++) {
            int var3 = class15.field252[var1];
            if (class241.field4246 != class232.field4025[var3].field3692) {
                if (class232.field4025[var3].field4632 > 0) {
                    class15.method134(true, class232.field4025[var3]);
                }
                class232.field4025[var3] = null;
            }
        }
        if (class120.field2130 != class65.field1288.field647) {
            throw new RuntimeException("gpp1 pos:" + class65.field1288.field647 + " psize:" + class120.field2130);
        }
        for (int var2 = 0; var2 < class258.field4439; var2++) {
            if (class232.field4025[class126.field2202[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class258.field4439);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lfa;Lfa;IZ)V")
    public static final void method691(class239 arg0, class239 arg1, int arg2, boolean arg3) {
        if (arg2 > -53) {
            field1654 = -10;
        }
        class215.field3733 = arg1;
        class181.field3173 = arg3;
        class73.field1409 = arg0;
        field1659++;
    }
}
