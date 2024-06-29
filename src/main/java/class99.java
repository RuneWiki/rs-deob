import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class99 {

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "I")
    public int field1451 = 128;

    @OriginalMember(owner = "client!ct", name = "o", descriptor = "I")
    public int field1458 = 128;

    @OriginalMember(owner = "client!ct", name = "m", descriptor = "I")
    public int field1456;

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "I")
    public int field1450;

    @OriginalMember(owner = "client!ct", name = "p", descriptor = "I")
    public int field1459;

    @OriginalMember(owner = "client!ct", name = "k", descriptor = "I")
    public int field1454;

    @OriginalMember(owner = "client!ct", name = "l", descriptor = "S")
    public static short field1455 = 1;

    @OriginalMember(owner = "client!ct", name = "i", descriptor = "Lni;")
    public static class367 field1452 = new class367(20, 2);

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "I")
    public int field1448;

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "I")
    public int field1449;

    @OriginalMember(owner = "client!ct", name = "j", descriptor = "I")
    public int field1453;

    @OriginalMember(owner = "client!ct", name = "n", descriptor = "I")
    public int field1457;

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "Ltt;")
    public static class61 field1447;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)V", line = 7)
    public static void method653(byte arg0) {
        field1452 = null;
        if (arg0 != 98) {
            method653((byte) 19);
        }
        field1447 = null;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)Lct;", line = 19)
    public final class99 method654(int arg0) {
        field1444++;
        if (arg0 != 20) {
            field1452 = null;
        }
        return new class99(this.field1456, this.field1451, this.field1458, this.field1454, this.field1450, this.field1459);
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(I)V", line = 68)
    public class99(int arg0) {
        this.field1456 = arg0;
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(IIIIII)V", line = 75)
    private class99(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1450 = arg4;
        this.field1456 = arg0;
        this.field1459 = arg5;
        this.field1451 = arg1;
        this.field1454 = arg3;
        this.field1458 = arg2;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lct;B)V", line = 46)
    public final void method655(class99 arg0, byte arg1) {
        this.field1451 = arg0.field1451;
        this.field1459 = arg0.field1459;
        this.field1458 = arg0.field1458;
        field1445++;
        this.field1450 = arg0.field1450;
        this.field1454 = arg0.field1454;
        this.field1456 = arg0.field1456;
        if (arg1 != 78) {
            this.method654(-52);
        }
    }
}
