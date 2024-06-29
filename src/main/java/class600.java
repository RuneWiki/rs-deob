import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class600 extends class134 {

    @OriginalMember(owner = "client!kca", name = "D", descriptor = "Ljava/lang/Object;")
    private Object field8514;

    @OriginalMember(owner = "client!kca", name = "F", descriptor = "Liu;")
    public static class517 field8516 = new class517(90, 0);

    @OriginalMember(owner = "client!kca", name = "H", descriptor = "[J")
    public static long[] field8518 = new long[100];

    @OriginalMember(owner = "client!kca", name = "I", descriptor = "I")
    public static int field8519 = -1;

    @OriginalMember(owner = "client!kca", name = "G", descriptor = "Lpp;")
    public static class464 field8517 = new class464(3, -1);

    @OriginalMember(owner = "client!kca", name = "J", descriptor = "I")
    public static int field8520 = 0;

    @OriginalMember(owner = "client!kca", name = "K", descriptor = "I")
    public static int field8521 = 0;

    @OriginalMember(owner = "client!kca", name = "B", descriptor = "I")
    public static int field8512;

    @OriginalMember(owner = "client!kca", name = "C", descriptor = "I")
    public static int field8513;

    @OriginalMember(owner = "client!kca", name = "E", descriptor = "I")
    public static int field8515;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 3)
    public final Object method1029(int arg0) {
        if (arg0 != 10) {
            this.method1029(-83);
        }
        field8513++;
        return this.field8514;
    }

    @OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Lvp;Ljava/lang/Object;I)V", line = 19)
    public class600(class110 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field8514 = arg1;
    }

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "(B)V", line = 32)
    public static void method3410(byte arg0) {
        int var1 = -31 / ((57 - arg0) / 57);
        field8516 = null;
        field8517 = null;
        field8518 = null;
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(B)Z", line = 43)
    public final boolean method1031(byte arg0) {
        if (arg0 == -99) {
            field8512++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(II)Z", line = 54)
    public static final boolean method3411(int arg0, int arg1) {
        if (arg1 != 58) {
            method3411(22, -83);
        }
        field8515++;
        return arg0 == 22 || arg0 == 5 || arg0 == 1007 || arg0 == 12 || arg0 == 58;
    }
}
