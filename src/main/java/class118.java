import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public abstract class class118 {

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1531 = "M";

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static volatile int field1530 = 0;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field1534 = 0;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "[Lu;")
    public static class4[] field1539 = new class4[16];

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "Lir;")
    public static class185 field1532;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "[I")
    public static int[] field1537;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)J", line = 6)
    public static final long method858(int arg0) {
        int var1 = -120 / ((arg0 + 41) / 53);
        field1535++;
        return class92.field1263.method339(false);
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V", line = 19)
    public static final void method859(int arg0) {
        for (class144 var1 = (class144) class436.field6330.method1575(arg0 ^ arg0); var1 != null; var1 = (class144) class436.field6330.method1573((byte) -128)) {
            if (var1.field1821) {
                var1.method994(4860);
            }
        }
        field1533++;
        for (class144 var2 = (class144) class107.field1413.method1575(0); var2 != null; var2 = (class144) class107.field1413.method1573((byte) -128)) {
            if (var2.field1821) {
                var2.method994(4860);
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V", line = 77)
    public static final void method860(byte arg0) {
        class199.field2752.method372(117);
        if (arg0 >= 94) {
            field1538++;
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)V", line = 91)
    public static void method861(byte arg0) {
        if (arg0 > 122) {
            field1539 = null;
            field1532 = null;
            field1531 = null;
            field1537 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)V")
    public abstract void method274(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIII)V")
    public abstract void method276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
    public abstract void method270(int arg0);

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V")
    public abstract void method273(int arg0);

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(III[I)V")
    public abstract void method278(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)V")
    public abstract void method277(int arg0);

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(III)V")
    public abstract void method271(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "([I)V")
    public abstract void method267(int[] arg0);

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "(I)V")
    public abstract void method268(int arg0);

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "()V")
    public abstract void method264();

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lug;)V")
    public abstract void method269(class118 arg0);

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "(I)V")
    public abstract void method272(int arg0);
}
