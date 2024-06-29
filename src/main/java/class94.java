import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class94 extends class130 {

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    public int field1503;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    public int field1498;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "Z")
    public static boolean field1504 = false;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "Lmo;")
    public static class271 field1499 = new class271(9, 3);

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)Z")
    public final boolean method793(int arg0, int arg1) {
        field1497++;
        if (arg0 == 1) {
            return (this.field1503 >> arg1 + 1 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)Z")
    public final boolean method794(int arg0) {
        field1500++;
        if (arg0 != 7) {
            field1505 = -82;
        }
        return (this.field1503 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)Z")
    public final boolean method795(int arg0) {
        if (arg0 != 7) {
            field1505 = 29;
        }
        field1501++;
        return (this.field1503 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(II)V")
    public class94(int arg0, int arg1) {
        this.field1503 = arg0;
        this.field1498 = arg1;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)I")
    public final int method796(boolean arg0) {
        field1506++;
        if (!arg0) {
            field1505 = -27;
        }
        return this.field1503 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)I")
    public final int method797(int arg0) {
        field1496++;
        return arg0 >= -59 ? -67 : class438.method2717(261784, this.field1503);
    }

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)V")
    public static void method798(int arg0) {
        field1499 = null;
        if (arg0 != -1066070635) {
            method798(36);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)Z")
    public final boolean method799(byte arg0) {
        if (arg0 > -13) {
            return false;
        } else {
            field1507++;
            return (this.field1503 >> 22 & 0x1) != 0;
        }
    }
}
