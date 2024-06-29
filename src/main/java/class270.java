import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class270 extends class153 {

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "Z")
    public static boolean field4620 = false;

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "Lpj;")
    public static class237 field4616 = class33.method353("Fallen lassen", 124);

    @OriginalMember(owner = "client!ch", name = "S", descriptor = "Lpj;")
    public static class237 field4629 = class33.method353("<br>", 21);

    @OriginalMember(owner = "client!ch", name = "O", descriptor = "I")
    public static int field4625 = -1;

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "I")
    public int field4617;

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "I")
    public int field4619;

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!ch", name = "Q", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
    public int field4628;

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "Lpj;")
    public class237 field4622;

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "Lfa;")
    public static class239 field4618;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "(I)V")
    public final void method1793(int arg0) {
        ++field4627;
        super.field2730 |= Long.MIN_VALUE;
        if (arg0 != 13) {
            this.method1797(-62);
        }
        if (~this.method1797(79) == -1L) {
            class48.field1037.method1819(-26979, this);
        }
    }

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "(I)I")
    public final int method1794(int arg0) {
        ++field4621;
        if (arg0 != -26158) {
            this.method1797(-115);
        }
        return (int) (super.field1530 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "(I)V")
    public final void method1795(int arg0) {
        if (arg0 == -2113) {
            ++field4626;
            super.field2730 = class181.method1244((byte) -19) - -500L | Long.MIN_VALUE & super.field2730;
            class56.field1148.method1819(-26979, this);
        }
    }

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "(I)I")
    public final int method1796(int arg0) {
        ++field4624;
        if (arg0 != 13) {
            this.method1795(-3);
        }
        return (int) super.field1530;
    }

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "(I)J")
    public final long method1797(int arg0) {
        int var2 = -72 / ((arg0 - 17) / 33);
        ++field4623;
        return Long.MAX_VALUE & super.field2730;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(II)V")
    public class270(int arg0, int arg1) {
        super.field1530 = (long) arg1 | (long) arg0 << 32;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)V")
    public static void method1798(byte arg0) {
        field4629 = null;
        int var1 = -54 / ((arg0 - -44) / 63);
        field4616 = null;
        field4618 = null;
    }
}
