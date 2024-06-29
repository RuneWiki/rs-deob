import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class81 {

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "Lpj;")
    public static class237 field1522 = class33.method353(" (X", 68);

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field1524 = 0;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "Lpj;")
    public static class237 field1525 = class33.method353("", 126);

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "Lpj;")
    public static class237 field1523 = class33.method353(")4a=", 16);

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "Lpj;")
    public static class237 field1526 = class33.method353("::qa_op_test", 46);

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
    public static int field1532 = 0;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "J")
    public long field1530;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "Llk;")
    public class81 field1520;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "Llk;")
    public class81 field1527;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "[Lhk;")
    public static class122[] field1521;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)Z")
    public final boolean method628(int arg0) {
        field1529++;
        if (this.field1520 == null) {
            return false;
        } else {
            if (arg0 != -14793) {
                field1526 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V")
    public final void method629(int arg0) {
        field1531++;
        if (this.field1520 == null) {
            return;
        }
        this.field1520.field1527 = this.field1527;
        this.field1527.field1520 = this.field1520;
        this.field1527 = null;
        this.field1520 = null;
        if (arg0 != 0) {
            this.method628(-102);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V")
    public static final void method630(boolean arg0) {
        class64.method536(false);
        field1519++;
        class77.method596(32631);
        class186.method1271(-10094);
        class127.method897(0);
        class48.method443(7);
        class105.method786(false);
        class128.method902(-32769);
        class244.method1685((byte) 65);
        class117.method851(-1);
        class104.method777(0);
        class111.method821(100);
        if (arg0) {
            method630(false);
        }
        class177.method1225(!arg0);
        class223.method1481(77);
        class104.method781((byte) -27);
        ((class7) class150.field2674).method77(0);
        class141.field2468.method1550((byte) -33);
        class105.field1854.method1646(16707);
        class143.field2587.method1646(16707);
        class255.field4371.method1646(16707);
        class108.field1928.method1646(16707);
        class241.field4241.method1646(16707);
        class151.field2685.method1646(16707);
        class8.field118.method1646(16707);
        class76.field1440.method1646(16707);
        class223.field3825.method1646(16707);
        class44.field969.method1646(16707);
        class76.field1441.method1646(16707);
        class180.field3165.method942(0);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lfa;Lfa;ILfa;)V")
    public static final void method631(class239 arg0, class239 arg1, int arg2, class239 arg3) {
        field1518++;
        class33.field714 = arg0;
        class112.field1968 = arg3;
        if (arg2 <= -126) {
            class61.field1224 = arg1;
        }
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)V")
    public static void method632(int arg0) {
        field1521 = null;
        if (arg0 != 0) {
            field1523 = null;
        }
        field1522 = null;
        field1526 = null;
        field1523 = null;
        field1525 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IB)V")
    public static final void method633(int arg0, byte arg1) {
        class59.field1208.method939(arg0, 1);
        field1528++;
        if (arg1 >= -114) {
            method632(49);
        }
    }
}
