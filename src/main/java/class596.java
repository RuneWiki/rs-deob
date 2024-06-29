import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class596 {

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    private int field8091;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public int field8088;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field8090 = 104;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field8087;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field8089;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field8092;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field8093;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    public static int field8094;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)I", line = 5)
    public final int method3409(int arg0) {
        field8094++;
        int var2 = -28 / ((83 - arg0) / 34);
        return this.field8091;
    }

    @OriginalMember(owner = "client!hj", name = "toString", descriptor = "()Ljava/lang/String;", line = 16)
    public final String toString() {
        field8089++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IB)I", line = 31)
    public static final int method3410(int arg0, byte arg1) {
        if (arg1 >= -53) {
            return 6;
        } else {
            field8093++;
            return arg0 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIII)V", line = 43)
    public static final void method3411(int arg0, int arg1, int arg2, int arg3) {
        field8087++;
        int var4 = arg2 << 3;
        int var5 = arg1 << 3;
        int var6 = arg0 << 3;
        if (arg3 != -15208) {
            field8090 = -17;
        }
        class229.field2718 = var5;
        if (class7.field100 == 2) {
            class641.field8758 = var6;
            class111.field1405 = var4;
            class793.field10893 = var5;
        }
        class47.field626 = var4;
        class434.method2569(-63);
        class197.field2345 = true;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(II)V", line = 69)
    public class596(int arg0, int arg1) {
        this.field8091 = arg0;
        this.field8088 = arg1;
    }
}
