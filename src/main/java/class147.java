import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class147 extends class745 {

    @OriginalMember(owner = "client!qm", name = "D", descriptor = "Ljava/lang/Object;")
    private Object field2051;

    @OriginalMember(owner = "client!qm", name = "C", descriptor = "I")
    public static int field2050 = 0;

    @OriginalMember(owner = "client!qm", name = "y", descriptor = "[I")
    public static int[] field2047 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!qm", name = "z", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!qm", name = "B", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!qm", name = "E", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!qm", name = "F", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 3)
    public static final int method1049(String arg0, byte arg1) {
        field2049++;
        if (arg1 >= -53) {
            return -121;
        } else if (arg0 == null) {
            return -1;
        } else {
            for (int var2 = 0; var2 < class600.field8359; var2++) {
                if (arg0.equalsIgnoreCase(class207.field2748[var2])) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "(B)Ljava/lang/Object;", line = 29)
    public final Object method221(byte arg0) {
        if (arg0 != -118) {
            this.method221((byte) -3);
        }
        field2048++;
        return this.field2051;
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)V", line = 43)
    public static void method1050(int arg0) {
        field2047 = null;
        if (arg0 != 128) {
            method1050(78);
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(B)Z", line = 55)
    public final boolean method222(byte arg0) {
        field2053++;
        if (arg0 != 64) {
            method1049(null, (byte) 104);
        }
        return false;
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 67)
    public class147(Object arg0, int arg1) {
        super(arg1);
        this.field2051 = arg0;
    }
}
