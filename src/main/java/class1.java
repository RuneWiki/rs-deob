import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class1 extends class373 {

    @OriginalMember(owner = "client!is", name = "y", descriptor = "J")
    public static long field3 = 0L;

    @OriginalMember(owner = "client!is", name = "E", descriptor = "[I")
    public static int[] field9 = new int[8];

    @OriginalMember(owner = "client!is", name = "w", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!is", name = "F", descriptor = "I")
    public int field10;

    @OriginalMember(owner = "client!is", name = "H", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!is", name = "x", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!is", name = "z", descriptor = "I")
    public int field4;

    @OriginalMember(owner = "client!is", name = "A", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!is", name = "B", descriptor = "I")
    public int field6;

    @OriginalMember(owner = "client!is", name = "C", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!is", name = "D", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!is", name = "G", descriptor = "J")
    public long field11;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ILbg;)Ljava/lang/String;")
    public static final String method1(int arg0, class242 arg1) {
        if (arg0 != 0) {
            field9 = null;
        }
        field8++;
        return class364.method2283(32767, arg1, (byte) 89);
    }

    @OriginalMember(owner = "client!is", name = "c", descriptor = "(Z)I")
    public final int method2(boolean arg0) {
        if (arg0) {
            return -85;
        } else {
            field12++;
            return this.field10;
        }
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(B)J")
    public final long method3(byte arg0) {
        if (arg0 >= -102) {
            return -60L;
        } else {
            field1++;
            return this.field11;
        }
    }

    @OriginalMember(owner = "client!is", name = "d", descriptor = "(I)V")
    public static void method4(int arg0) {
        if (arg0 != 0) {
            field3 = 19L;
        }
        field9 = null;
    }

    @OriginalMember(owner = "client!is", name = "c", descriptor = "(I)I")
    public final int method5(int arg0) {
        if (arg0 != 27878) {
            this.field4 = 86;
        }
        field7++;
        return this.field6;
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(Z)I")
    public final int method6(boolean arg0) {
        field2++;
        if (arg0) {
            this.field10 = 11;
        }
        return this.field4;
    }
}
