import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rha")
public class class223 extends class134 {

    @OriginalMember(owner = "client!rha", name = "f", descriptor = "I")
    public static int field2875 = 0;

    @OriginalMember(owner = "client!rha", name = "h", descriptor = "[I")
    public static int[] field2877 = new int[25];

    @OriginalMember(owner = "client!rha", name = "o", descriptor = "I")
    public static int field2884 = 1407;

    @OriginalMember(owner = "client!rha", name = "k", descriptor = "I")
    public static int field2880 = 0;

    @OriginalMember(owner = "client!rha", name = "l", descriptor = "Lkba;")
    public static class108 field2881 = new class108();

    @OriginalMember(owner = "client!rha", name = "g", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!rha", name = "i", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!rha", name = "j", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!rha", name = "m", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!rha", name = "n", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!rha", name = "c", descriptor = "(I)V")
    public static void method1270(int arg0) {
        field2877 = null;
        field2881 = null;
        if (arg0 != 4) {
            method1270(3);
        }
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(II)V")
    public final void method55(int arg0, int arg1) {
        super.field1708 = arg1;
        int var3 = -51 / ((arg0 - -26) / 41);
        ++field2882;
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(B)V")
    public final void method60(byte arg0) {
        if (super.field1708 < 0 && super.field1708 > 4) {
            super.field1708 = this.method58(0);
        }
        if (arg0 >= 118) {
            ++field2879;
        }
    }

    @OriginalMember(owner = "client!rha", name = "b", descriptor = "(B)I")
    public final int method1271(byte arg0) {
        if (arg0 < 119) {
            this.method1271((byte) 43);
        }
        ++field2876;
        return super.field1708;
    }

    @OriginalMember(owner = "client!rha", name = "<init>", descriptor = "(ILkda;)V")
    public class223(int arg0, class391 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!rha", name = "<init>", descriptor = "(Lkda;)V")
    public class223(class391 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(I)I")
    public final int method58(int arg0) {
        ++field2883;
        if (arg0 != 0) {
            field2875 = 51;
        }
        return super.field1712.method2280(-108).method3190(32755) > 1 ? 4 : 2;
    }

    @OriginalMember(owner = "client!rha", name = "c", descriptor = "(II)I")
    public final int method57(int arg0, int arg1) {
        ++field2878;
        if (arg1 != 29053) {
            field2884 = -17;
        }
        return 1;
    }
}
