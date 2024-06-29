import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class144 {

    @OriginalMember(owner = "client!ada", name = "c", descriptor = "I")
    public int field2012;

    @OriginalMember(owner = "client!ada", name = "e", descriptor = "I")
    private int field2014;

    @OriginalMember(owner = "client!ada", name = "d", descriptor = "[I")
    public static int[] field2013 = new int[2];

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "Lada;")
    public static class144 field2010 = new class144(63, 12);

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!ada", name = "f", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!ada", name = "g", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!ada", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field2015++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)V", line = 21)
    public static void method978(int arg0) {
        if (arg0 != 12) {
            field2010 = null;
        }
        field2013 = null;
        field2010 = null;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(B)I", line = 32)
    public final int method979(byte arg0) {
        int var2 = 98 % ((arg0 - 60) / 43);
        field2016++;
        return this.field2014;
    }

    @OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(II)V", line = 46)
    public class144(int arg0, int arg1) {
        this.field2012 = arg1;
        this.field2014 = arg0;
    }
}
