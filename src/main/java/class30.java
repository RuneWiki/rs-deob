import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class30 extends class16 {

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "Lje;")
    public static class67 field525 = class85.method592(255, "sl_button");

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "I")
    public static int field528 = 0;

    @OriginalMember(owner = "client!ea", name = "H", descriptor = "I")
    public static int field532 = 0;

    @OriginalMember(owner = "client!ea", name = "L", descriptor = "Lob;")
    public static class99 field536 = new class99(64);

    @OriginalMember(owner = "client!ea", name = "O", descriptor = "Lje;")
    public static class67 field539 = class85.method592(255, "Anmelde)2Zeitlimit -Uberschritten)3");

    @OriginalMember(owner = "client!ea", name = "N", descriptor = "Lje;")
    public static class67 field538 = class85.method592(255, "Keine Antwort vom Server)3");

    @OriginalMember(owner = "client!ea", name = "P", descriptor = "[I")
    public static int[] field540 = new int[100];

    @OriginalMember(owner = "client!ea", name = "Q", descriptor = "Lob;")
    public static class99 field541 = new class99(64);

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!ea", name = "E", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!ea", name = "F", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!ea", name = "K", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!ea", name = "M", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "Lea;")
    public class30 field527;

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "Lea;")
    public class30 field533;

    @OriginalMember(owner = "client!ea", name = "J", descriptor = "[Lkd;")
    public static class73[] field534;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)V")
    public final void method192(byte arg0) {
        field530++;
        if (arg0 != -66) {
            this.field527 = null;
        }
        if (this.field533 != null) {
            this.field533.field527 = this.field527;
            this.field527.field533 = this.field533;
            this.field527 = null;
            this.field533 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)V")
    public static final void method193(byte arg0, int arg1) {
        if (arg0 != -100) {
            return;
        }
        class86.field1916 = arg1;
        class68.field1369 = -1;
        field531++;
        class127.field2797 = false;
        class147.field3360 = null;
        class144.field3309 = -1;
        class32.field578 = 0;
        class95.field2126 = 1;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
    public static void method194(int arg0) {
        if (arg0 != -1) {
            method194(-101);
        }
        field538 = null;
        field541 = null;
        field536 = null;
        field525 = null;
        field540 = null;
        field539 = null;
        field534 = null;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(B)V")
    public static final void method195(byte arg0) {
        class81.field1785.method767(1);
        field537++;
        if (arg0 != -13) {
            field532 = -119;
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(III)V")
    public static final void method196(int arg0, int arg1, int arg2) {
        field529++;
        if (class99.field2203 != 0 && arg0 != -1) {
            class64.method435(false, arg0, 0, class128.field2818, (byte) 118, class99.field2203);
            class105.field2404 = true;
        }
        int var3 = -23 / ((-arg1 - 8) / 47);
    }
}
