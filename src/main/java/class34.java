import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ra")
public abstract class class34 {

    @OriginalMember(owner = "mapview!ra", name = "b", descriptor = "Lu;")
    public static class38 field438 = class9.method45(-41, "Magic Shop");

    @OriginalMember(owner = "mapview!ra", name = "d", descriptor = "Lu;")
    public static class38 field440 = class9.method45(-41, "Woodcutting stump");

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "Lu;")
    public static class38 field437 = class9.method45(-41, "Loading");

    @OriginalMember(owner = "mapview!ra", name = "e", descriptor = "Lu;")
    public static class38 field441 = class9.method45(-41, "Vegetable Store");

    @OriginalMember(owner = "mapview!ra", name = "c", descriptor = "Lu;")
    public static class38 field439 = class9.method45(-41, "Loading");

    @OriginalMember(owner = "mapview!ra", name = "f", descriptor = "I")
    public static int field442 = 0;

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(I)V", line = 18)
    public static void method196(int arg0) {
        field440 = null;
        field441 = null;
        field437 = null;
        if (arg0 != 0) {
            method198((byte) -98);
        }
        field439 = null;
        field438 = null;
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(IJ)V", line = 37)
    public static final void method197(int arg0, long arg1) {
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class23.method108(arg1 - 1L, (byte) -98);
            class23.method108(1L, (byte) -108);
        } else {
            class23.method108(arg1, (byte) -116);
        }
        if (arg0 != 21282) {
            field440 = null;
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(B)Z", line = 69)
    public static final boolean method198(byte arg0) {
        class16 var1 = class13.field126;
        synchronized (class13.field126) {
            if (field442 == class25.field221) {
                return false;
            }
            class20.field197 = class9.field72[class25.field221];
            if (arg0 >= -13) {
                method197(50, -120L);
            }
            class18.field163 = class33.field435[class25.field221];
            class25.field221 = class25.field221 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(IIB)I")
    public abstract int method148(int arg0, int arg1, byte arg2);
}
