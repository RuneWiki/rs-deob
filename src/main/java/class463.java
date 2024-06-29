import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class463 extends class225 {

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "Ljava/lang/Object;")
    private Object field6691;

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "Lmg;")
    public static class530 field6690 = new class530();

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "I")
    public static int field6692;

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "I")
    public static int field6693;

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "I")
    public static int field6694;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "[I")
    public static int[] field6689;

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Ljo;Ljava/lang/Object;I)V", line = 4)
    public class463(class381 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field6691 = arg1;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)Ljava/lang/Object;", line = 12)
    public final Object method1395(byte arg0) {
        if (arg0 >= -9) {
            return null;
        } else {
            field6693++;
            return this.field6691;
        }
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(B)Z", line = 23)
    public final boolean method1396(byte arg0) {
        if (arg0 != 65) {
            this.method1395((byte) -128);
        }
        field6694++;
        return false;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BII)Z", line = 34)
    public static final boolean method2689(byte arg0, int arg1, int arg2) {
        field6692++;
        if (arg0 > -118) {
            method2689((byte) 31, 0, 35);
        }
        return (arg2 & 0x220) == 544 | (arg2 & 0x18) != 0;
    }

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "(I)V", line = 46)
    public static void method2690(int arg0) {
        int var1 = -52 % ((arg0 + 29) / 59);
        field6690 = null;
        field6689 = null;
    }

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "(I)V", line = 56)
    public static final void method2691(int arg0) {
        class269.field3628 = arg0;
        for (int var1 = 0; var1 < class124.field1916; var1++) {
            for (int var2 = 0; var2 < class177.field2664; var2++) {
                if (class103.field1632[arg0][var1][var2] == null) {
                    class103.field1632[arg0][var1][var2] = new class532(arg0, var1, var2);
                }
            }
        }
    }
}
