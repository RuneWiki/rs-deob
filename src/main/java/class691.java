import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public abstract class class691 extends class617 {

    @OriginalMember(owner = "client!mga", name = "A", descriptor = "I")
    public int field9713;

    @OriginalMember(owner = "client!mga", name = "y", descriptor = "J")
    public static long field9711 = 0L;

    @OriginalMember(owner = "client!mga", name = "x", descriptor = "I")
    public static int field9710 = 0;

    @OriginalMember(owner = "client!mga", name = "z", descriptor = "I")
    public static int field9712;

    @OriginalMember(owner = "client!mga", name = "B", descriptor = "I")
    public static int field9714;

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lgb;I)I", line = 3)
    public static final int method3812(class163 arg0, int arg1) {
        field9714++;
        if (arg1 != -1483) {
            field9711 = 82L;
        }
        if (class304.field3769 == arg0) {
            return 5890;
        } else if (class590.field8337 == arg0) {
            return 34167;
        } else if (class692.field9717 == arg0) {
            return 34168;
        } else if (class107.field1154 == arg0) {
            return 34166;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(III)Z", line = 32)
    public static final boolean method3813(int arg0, int arg1, int arg2) {
        field9712++;
        int var3 = 87 % ((-arg1 - 3) / 47);
        return (arg0 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(I)V", line = 52)
    public class691(int arg0) {
        this.field9713 = arg0;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method77(int arg0);

    @OriginalMember(owner = "client!mga", name = "f", descriptor = "(I)Z")
    public abstract boolean method76(int arg0);
}
