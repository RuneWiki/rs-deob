import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class207 {

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "Ljava/lang/String;")
    public String field2513;

    @OriginalMember(owner = "client!jda", name = "g", descriptor = "I")
    public int field2518;

    @OriginalMember(owner = "client!jda", name = "c", descriptor = "[I")
    public static int[] field2514 = new int[13];

    @OriginalMember(owner = "client!jda", name = "e", descriptor = "Lpca;")
    public static class653 field2516 = new class653(8);

    @OriginalMember(owner = "client!jda", name = "i", descriptor = "Lkfa;")
    public static class549 field2520 = new class549(5, -1);

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!jda", name = "d", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!jda", name = "f", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!jda", name = "h", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(III)Z")
    public static final boolean method1253(int arg0, int arg1, int arg2) {
        field2519++;
        if (arg1 == 2048) {
            return (arg0 & 0x800) != 0 && (arg2 & 0x37) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(B)V")
    public static final void method1254(byte arg0) {
        field2515++;
        if (!class601.field8530.method1835(class150.field1711, (byte) 102) && class676.field9588 != class353.field4625) {
            class162.method975(class65.field687, false, class311.field4022, 11, (byte) 88);
            return;
        }
        class58.method393(class453.field6284, (byte) 32);
        if (class552.field7873 != class353.field4625) {
            class325.method1846(-1);
        }
        if (arg0 >= -34) {
            method1256(-6);
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)V")
    public static final void method1255(int arg0) {
        field2517++;
        class460.field6400 = new class208(class221.field2676.method1296(class226.field2899, (byte) 100), "", class378.field4915, 1008, -1, 0L, 0, arg0, true, false);
    }

    @OriginalMember(owner = "client!jda", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2512++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(I)V")
    public static void method1256(int arg0) {
        field2520 = null;
        int var1 = 83 / ((arg0 - 27) / 60);
        field2514 = null;
        field2516 = null;
    }

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class207(String arg0, int arg1) {
        this.field2513 = arg0;
        this.field2518 = arg1;
    }
}
